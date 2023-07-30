package net.risttahukas.moremobheads.effect;

import net.risttahukas.moremobheads.effect.activeheadeffects.SnowballHeadEffect;
import net.risttahukas.moremobheads.effect.headeffects.*;

public class HeadEffects {
    public static final AbstractPassiveHeadEffect AMPHIBIAN = new AmphibianHeadEffect();
    public static final AbstractPassiveHeadEffect FREEZE_IMMUNE = new FreezeImmuneHeadEffect();
    public static final AbstractPassiveHeadEffect CRYOPHOBIC = new CryophobicHeadEffect();
    public static final AbstractPassiveHeadEffect FIREPROOF = new FireproofHeadEffect();
    public static final AbstractPassiveHeadEffect HELIOPHOBIC = new HeliophobicHeadEffect();
    public static final AbstractPassiveHeadEffect HYDROPHILIC = new HydrophilicHeadEffect();
    public static final AbstractPassiveHeadEffect HYDROPHOBIC = new HydrophobicHeadEffect();
    public static final AbstractPassiveHeadEffect SLOW_FALLING = new SlowFallingHeadEffect();
    public static final AbstractPassiveHeadEffect THERMOPHOBIC = new ThermophobicHeadEffect();
    public static final AbstractPassiveHeadEffect UNDEAD = new UndeadHeadEffect();


    public static final AbstractActiveHeadEffect SNOWBALL = new SnowballHeadEffect();
}
