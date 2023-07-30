package net.risttahukas.moremobheads.entity.projectile;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.LlamaSpit;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class PlayerSpit extends LlamaSpit {
    private final boolean trader;

    public PlayerSpit(Level level, Player player, boolean trader) {
        super(EntityType.LLAMA_SPIT, level);
        this.trader = trader;
        this.setOwner(player);
        this.setPos(player.getX(), player.getEyeY() - (double)0.1F, player.getZ());
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        Entity entity = this.getOwner();
        if (entity instanceof LivingEntity livingentity) {
            Entity target = entityHitResult.getEntity();
            if (this.trader && target instanceof LivingEntity livingTarget &&
                    (livingTarget.getMobType() == MobType.ILLAGER || target instanceof Zombie)) {
                target.hurt(this.damageSources().mobProjectile(this, livingentity), 1.5F);
            }
            target.hurt(this.damageSources().mobProjectile(this, livingentity), 1.0F);
        }
    }
}
