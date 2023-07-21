package net.risttahukas.moremobheads.mixin;

import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.risttahukas.moremobheads.sound.ModSoundEvents;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unused")
@Mixin(NoteBlockInstrument.class)
public class NoteBlockInstrumentMixin {

    @Shadow
    @Final
    @Mutable
    private static NoteBlockInstrument[] $VALUES;


    private static final NoteBlockInstrument ALLAY = addVariant("ALLAY", "allay",
            ModSoundEvents.NOTE_BLOCK_IMITATE_ALLAY);

    private static final NoteBlockInstrument AXOLOTL = addVariant("AXOLOTL", "axolotl",
            ModSoundEvents.NOTE_BLOCK_IMITATE_AXOLOTL);

    private static final NoteBlockInstrument BAT = addVariant("BAT", "bat",
            ModSoundEvents.NOTE_BLOCK_IMITATE_BAT);

    private static final NoteBlockInstrument BEE = addVariant("BEE", "bee",
            ModSoundEvents.NOTE_BLOCK_IMITATE_BEE);
    private static final NoteBlockInstrument BEE_ANGRY = addVariant("BEE_ANGRY", "bee_angry",
            ModSoundEvents.NOTE_BLOCK_IMITATE_BEE_ANGRY);
    private static final NoteBlockInstrument BEE_POLLEN = addVariant("BEE_POLLEN", "bee_pollen",
            ModSoundEvents.NOTE_BLOCK_IMITATE_BEE_POLLEN);

    private static final NoteBlockInstrument BLAZE = addVariant("BLAZE", "blaze",
            ModSoundEvents.NOTE_BLOCK_IMITATE_BLAZE);

    private static final NoteBlockInstrument CAMEL = addVariant("CAMEL", "camel",
            ModSoundEvents.NOTE_BLOCK_IMITATE_CAMEL);

    private static final NoteBlockInstrument CAT = addVariant("CAT", "cat",
            ModSoundEvents.NOTE_BLOCK_IMITATE_CAT);

    private static final NoteBlockInstrument CAVE_SPIDER = addVariant("CAVE_SPIDER", "cave_spider",
            ModSoundEvents.NOTE_BLOCK_IMITATE_CAVE_SPIDER);

    private static final NoteBlockInstrument CHICKEN = addVariant("CHICKEN", "chicken",
            ModSoundEvents.NOTE_BLOCK_IMITATE_CHICKEN);

    private static final NoteBlockInstrument COD = addVariant("COD", "cod",
            ModSoundEvents.NOTE_BLOCK_IMITATE_COD);

    private static final NoteBlockInstrument COW = addVariant("COW", "cow",
            ModSoundEvents.NOTE_BLOCK_IMITATE_COW);

    private static final NoteBlockInstrument DOLPHIN = addVariant("DOLPHIN", "dolphin",
            ModSoundEvents.NOTE_BLOCK_IMITATE_DOLPHIN);

    private static final NoteBlockInstrument DONKEY = addVariant("DONKEY", "donkey",
            ModSoundEvents.NOTE_BLOCK_IMITATE_DONKEY);

    private static final NoteBlockInstrument DROWNED = addVariant("DROWNED", "drowned",
            ModSoundEvents.NOTE_BLOCK_IMITATE_DROWNED);

    private static final NoteBlockInstrument ELDER_GUARDIAN = addVariant("ELDER_GUARDIAN", "elder_guardian",
            ModSoundEvents.NOTE_BLOCK_IMITATE_ELDER_GUARDIAN);

    private static final NoteBlockInstrument ENDERMAN = addVariant("ENDERMAN", "enderman",
            ModSoundEvents.NOTE_BLOCK_IMITATE_ENDERMAN);

    private static final NoteBlockInstrument ENDERMITE = addVariant("ENDERMITE", "endermite",
            ModSoundEvents.NOTE_BLOCK_IMITATE_ENDERMITE);

    private static final NoteBlockInstrument EVOKER = addVariant("EVOKER", "evoker",
            ModSoundEvents.NOTE_BLOCK_IMITATE_EVOKER);

    private static final NoteBlockInstrument FOX = addVariant("FOX", "fox",
            ModSoundEvents.NOTE_BLOCK_IMITATE_FOX);

    private static final NoteBlockInstrument FROG = addVariant("FROG", "frog",
            ModSoundEvents.NOTE_BLOCK_IMITATE_FROG);

    private static final NoteBlockInstrument GHAST = addVariant("GHAST", "ghast",
            ModSoundEvents.NOTE_BLOCK_IMITATE_GHAST);

    private static final NoteBlockInstrument GLOW_SQUID = addVariant("GLOW_SQUID", "glow_squid",
            ModSoundEvents.NOTE_BLOCK_IMITATE_GLOW_SQUID);

    private static final NoteBlockInstrument GOAT = addVariant("GOAT", "goat",
            ModSoundEvents.NOTE_BLOCK_IMITATE_GOAT);
    private static final NoteBlockInstrument GOAT_SCREAMING = addVariant("GOAT_SCREAMING", "goat_screaming",
            ModSoundEvents.NOTE_BLOCK_IMITATE_GOAT_SCREAMING);

    private static final NoteBlockInstrument GUARDIAN = addVariant("GUARDIAN", "guardian",
            ModSoundEvents.NOTE_BLOCK_IMITATE_GUARDIAN);

    private static final NoteBlockInstrument HOGLIN = addVariant("HOGLIN", "hoglin",
            ModSoundEvents.NOTE_BLOCK_IMITATE_HOGLIN);

    private static final NoteBlockInstrument HORSE = addVariant("HORSE", "horse",
            ModSoundEvents.NOTE_BLOCK_IMITATE_HORSE);
    private static final NoteBlockInstrument HORSE_SKELETON = addVariant("HORSE_SKELETON", "horse_skeleton",
            ModSoundEvents.NOTE_BLOCK_IMITATE_HORSE_SKELETON);
    private static final NoteBlockInstrument HORSE_ZOMBIE = addVariant("HORSE_ZOMBIE", "horse_zombie",
            ModSoundEvents.NOTE_BLOCK_IMITATE_HORSE_ZOMBIE);

    private static final NoteBlockInstrument HUSK = addVariant("HUSK", "husk",
            ModSoundEvents.NOTE_BLOCK_IMITATE_HUSK);

    private static final NoteBlockInstrument ILLUSIONER = addVariant("ILLUSIONER", "illusioner",
            ModSoundEvents.NOTE_BLOCK_IMITATE_ILLUSIONER);

    private static final NoteBlockInstrument IRON_GOLEM = addVariant("IRON_GOLEM", "iron_golem",
            ModSoundEvents.NOTE_BLOCK_IMITATE_IRON_GOLEM);

    private static final NoteBlockInstrument LLAMA = addVariant("LLAMA", "llama",
            ModSoundEvents.NOTE_BLOCK_IMITATE_LLAMA);

    private static final NoteBlockInstrument MAGMA_CUBE = addVariant("MAGMA_CUBE", "magma_cube",
            ModSoundEvents.NOTE_BLOCK_IMITATE_MAGMA_CUBE);

    private static final NoteBlockInstrument MULE = addVariant("MULE", "mule",
            ModSoundEvents.NOTE_BLOCK_IMITATE_MULE);

    private static final NoteBlockInstrument OCELOT = addVariant("OCELOT", "ocelot",
            ModSoundEvents.NOTE_BLOCK_IMITATE_OCELOT);

    private static final NoteBlockInstrument PANDA = addVariant("PANDA", "panda",
            ModSoundEvents.NOTE_BLOCK_IMITATE_PANDA);
    private static final NoteBlockInstrument PANDA_AGGRESSIVE = addVariant("PANDA_AGGRESSIVE", "panda_aggressive",
            ModSoundEvents.NOTE_BLOCK_IMITATE_PANDA_AGGRESSIVE);
    private static final NoteBlockInstrument PANDA_WORRIED = addVariant("PANDA_WORRIED", "panda_worried",
            ModSoundEvents.NOTE_BLOCK_IMITATE_PANDA_WORRIED);

    private static final NoteBlockInstrument PARROT = addVariant("PARROT", "parrot",
            ModSoundEvents.NOTE_BLOCK_IMITATE_PARROT);

    private static final NoteBlockInstrument PHANTOM = addVariant("PHANTOM", "phantom",
            ModSoundEvents.NOTE_BLOCK_IMITATE_PHANTOM);

    private static final NoteBlockInstrument PIG = addVariant("PIG", "pig",
            ModSoundEvents.NOTE_BLOCK_IMITATE_PIG);

    private static final NoteBlockInstrument PIGLIN_BRUTE = addVariant("PIGLIN_BRUTE", "piglin_brute",
            ModSoundEvents.NOTE_BLOCK_IMITATE_PIGLIN_BRUTE);

    private static final NoteBlockInstrument PILLAGER = addVariant("PILLAGER", "pillager",
            ModSoundEvents.NOTE_BLOCK_IMITATE_PILLAGER);

    private static final NoteBlockInstrument POLAR_BEAR = addVariant("POLAR_BEAR", "polar_bear",
            ModSoundEvents.NOTE_BLOCK_IMITATE_POLAR_BEAR);

    private static final NoteBlockInstrument PUFFERFISH = addVariant("PUFFERFISH", "pufferfish",
            ModSoundEvents.NOTE_BLOCK_IMITATE_PUFFERFISH);

    private static final NoteBlockInstrument RABBIT = addVariant("RABBIT", "rabbit",
            ModSoundEvents.NOTE_BLOCK_IMITATE_RABBIT);
    private static final NoteBlockInstrument RABBIT_CAERBANNOG = addVariant("RABBIT_CAERBANNOG", "rabbit_caerbannog",
            ModSoundEvents.NOTE_BLOCK_IMITATE_RABBIT_CAERBANNOG);

    private static final NoteBlockInstrument RAVAGER = addVariant("RAVAGER", "ravager",
            ModSoundEvents.NOTE_BLOCK_IMITATE_RAVAGER);

    private static final NoteBlockInstrument SALMON = addVariant("SALMON", "salmon",
            ModSoundEvents.NOTE_BLOCK_IMITATE_SALMON);

    private static final NoteBlockInstrument SHEEP = addVariant("SHEEP", "sheep",
            ModSoundEvents.NOTE_BLOCK_IMITATE_SHEEP);

    private static final NoteBlockInstrument SHULKER = addVariant("SHULKER", "shulker",
            ModSoundEvents.NOTE_BLOCK_IMITATE_SHULKER);

    private static final NoteBlockInstrument SILVERFISH = addVariant("SILVERFISH", "silverfish",
            ModSoundEvents.NOTE_BLOCK_IMITATE_SILVERFISH);

    private static final NoteBlockInstrument SLIME = addVariant("SLIME", "slime",
            ModSoundEvents.NOTE_BLOCK_IMITATE_SLIME);

    private static final NoteBlockInstrument SNIFFER = addVariant("SNIFFER", "sniffer",
            ModSoundEvents.NOTE_BLOCK_IMITATE_SNIFFER);

    private static final NoteBlockInstrument SNOW_GOLEM = addVariant("SNOW_GOLEM", "snow_golem",
            ModSoundEvents.NOTE_BLOCK_IMITATE_SNOW_GOLEM);

    private static final NoteBlockInstrument SPIDER = addVariant("SPIDER", "spider",
            ModSoundEvents.NOTE_BLOCK_IMITATE_SPIDER);

    private static final NoteBlockInstrument SQUID = addVariant("SQUID", "squid",
            ModSoundEvents.NOTE_BLOCK_IMITATE_SQUID);

    private static final NoteBlockInstrument STRAY = addVariant("STRAY", "stray",
            ModSoundEvents.NOTE_BLOCK_IMITATE_STRAY);

    private static final NoteBlockInstrument STRIDER = addVariant("STRIDER", "strider",
            ModSoundEvents.NOTE_BLOCK_IMITATE_STRIDER);

    private static final NoteBlockInstrument TADPOLE = addVariant("TADPOLE", "tadpole",
            ModSoundEvents.NOTE_BLOCK_IMITATE_TADPOLE);

    private static final NoteBlockInstrument TROPICAL_FISH = addVariant("TROPICAL_FISH", "tropical_fish",
            ModSoundEvents.NOTE_BLOCK_IMITATE_TROPICAL_FISH);

    private static final NoteBlockInstrument TURTLE = addVariant("TURTLE", "turtle",
            ModSoundEvents.NOTE_BLOCK_IMITATE_TURTLE);

    private static final NoteBlockInstrument VEX = addVariant("VEX", "vex",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VEX);

    private static final NoteBlockInstrument VEX_CHARGING = addVariant("VEX_CHARGING", "vex_charging",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VEX_CHARGING);

    private static final NoteBlockInstrument VILLAGER = addVariant("VILLAGER", "villager",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER);
    private static final NoteBlockInstrument VILLAGER_ARMORER = addVariant("VILLAGER_ARMORER", "villager_armorer",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_ARMORER);
    private static final NoteBlockInstrument VILLAGER_BUTCHER = addVariant("VILLAGER_BUTCHER", "villager_butcher",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_BUTCHER);
    private static final NoteBlockInstrument VILLAGER_CARTOGRAPHER = addVariant("VILLAGER_CARTOGRAPHER", "villager_cartographer",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_CARTOGRAPHER);
    private static final NoteBlockInstrument VILLAGER_CLERIC = addVariant("VILLAGER_CLERIC", "villager_cleric",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_CLERIC);
    private static final NoteBlockInstrument VILLAGER_FARMER = addVariant("VILLAGER_FARMER", "villager_farmer",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_FARMER);
    private static final NoteBlockInstrument VILLAGER_FISHERMAN = addVariant("VILLAGER_FISHERMAN", "villager_fisherman",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_FISHERMAN);
    private static final NoteBlockInstrument VILLAGER_FLETCHER = addVariant("VILLAGER_FLETCHER", "villager_fletcher",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_FLETCHER);
    private static final NoteBlockInstrument VILLAGER_LEATHERWORKER = addVariant("VILLAGER_LEATHERWORKER", "villager_leatherworker",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_LEATHERWORKER);
    private static final NoteBlockInstrument VILLAGER_LIBRARIAN = addVariant("VILLAGER_LIBRARIAN", "villager_librarian",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_LIBRARIAN);
    private static final NoteBlockInstrument VILLAGER_MASON = addVariant("VILLAGER_MASON", "villager_mason",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_MASON);
    private static final NoteBlockInstrument VILLAGER_SHEPHERD = addVariant("VILLAGER_SHEPHERD", "villager_shepherd",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_SHEPHERD);
    private static final NoteBlockInstrument VILLAGER_TOOLSMITH = addVariant("VILLAGER_TOOLSMITH", "villager_toolsmith",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_TOOLSMITH);
    private static final NoteBlockInstrument VILLAGER_WEAPONSMITH = addVariant("VILLAGER_WEAPONSMITH", "villager_weaponsmith",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VILLAGER_WEAPONSMITH);

    private static final NoteBlockInstrument VINDICATOR = addVariant("VINDICATOR", "vindicator",
            ModSoundEvents.NOTE_BLOCK_IMITATE_VINDICATOR);

    private static final NoteBlockInstrument WANDERING_TRADER = addVariant("WANDERING_TRADER", "wandering_trader",
            ModSoundEvents.NOTE_BLOCK_IMITATE_WANDERING_TRADER);

    private static final NoteBlockInstrument WARDEN = addVariant("WARDEN", "warden",
            ModSoundEvents.NOTE_BLOCK_IMITATE_WARDEN);

    private static final NoteBlockInstrument WITCH = addVariant("WITCH", "witch",
            ModSoundEvents.NOTE_BLOCK_IMITATE_WITCH);

    private static final NoteBlockInstrument WITHER = addVariant("WITHER", "wither",
            ModSoundEvents.NOTE_BLOCK_IMITATE_WITHER);

    private static final NoteBlockInstrument WOLF = addVariant("WOLF", "wolf",
            ModSoundEvents.NOTE_BLOCK_IMITATE_WOLF);
    private static final NoteBlockInstrument WOLF_TAME = addVariant("WOLF_TAME", "wolf_tame",
            ModSoundEvents.NOTE_BLOCK_IMITATE_WOLF_TAME);
    private static final NoteBlockInstrument WOLF_ANGRY = addVariant("WOLF_ANGRY", "wolf_angry",
            ModSoundEvents.NOTE_BLOCK_IMITATE_WOLF_ANGRY);

    private static final NoteBlockInstrument ZOGLIN = addVariant("ZOGLIN", "zoglin",
            ModSoundEvents.NOTE_BLOCK_IMITATE_ZOGLIN);

    private static final NoteBlockInstrument ZOMBIE_VILLAGER = addVariant("ZOMBIE_VILLAGER", "zombie_villager",
            ModSoundEvents.NOTE_BLOCK_IMITATE_ZOMBIE_VILLAGER);

    private static final NoteBlockInstrument ZOMBIFIED_PIGLIN = addVariant("ZOMBIFIED_PIGLIN", "zombified_piglin",
            ModSoundEvents.NOTE_BLOCK_IMITATE_ZOMBIFIED_PIGLIN);


    NoteBlockInstrumentMixin(String enumName, int ordinal, String name, Holder<SoundEvent> soundEvent, NoteBlockInstrument.Type type) {
        throw new UnsupportedOperationException("Replaced by Mixin");
    }

    private static NoteBlockInstrument addVariant(String enumName, String name, Holder<SoundEvent> soundEvent) {
        assert NoteBlockInstrumentMixin.$VALUES != null;
        ArrayList<NoteBlockInstrument> noteBlockInstruments =
                new ArrayList<>(Arrays.asList(NoteBlockInstrumentMixin.$VALUES));
        NoteBlockInstrument noteBlockInstrument = (NoteBlockInstrument)(Object)new NoteBlockInstrumentMixin(enumName,
                noteBlockInstruments.get(noteBlockInstruments.size() - 1).ordinal() + 1, name, soundEvent, NoteBlockInstrument.Type.MOB_HEAD);
        noteBlockInstruments.add(noteBlockInstrument);
        $VALUES = noteBlockInstruments.toArray(new NoteBlockInstrument[0]);
        return noteBlockInstrument;
    }
}