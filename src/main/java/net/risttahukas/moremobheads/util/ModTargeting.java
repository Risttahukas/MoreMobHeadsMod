package net.risttahukas.moremobheads.util;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

import java.util.function.Predicate;

public class ModTargeting {

    public static Entity getPlayerTargetEntity(Player player, double maxDistance) {
        Vec3 playerEyePosition = player.getEyePosition();
        Vec3 playerViewVector = player.getViewVector(1.0F).scale(maxDistance);
        Vec3 playerViewEndPosition = playerEyePosition.add(playerViewVector);
        AABB aabb = player.getBoundingBox().expandTowards(playerViewVector).inflate(1.0D);
        Predicate<Entity> predicate = (entity) -> !entity.isSpectator() && entity.isPickable();
        EntityHitResult entityhitresult = ProjectileUtil.getEntityHitResult(player, playerEyePosition, playerViewEndPosition, aabb, predicate, maxDistance * maxDistance);
        if (entityhitresult != null) {
            return entityhitresult.getEntity();
        }
        return null;

    }
}
