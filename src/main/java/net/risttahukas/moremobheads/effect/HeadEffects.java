package net.risttahukas.moremobheads.effect;

import net.risttahukas.moremobheads.effect.headeffects.CryophobicHeadEffect;
import net.risttahukas.moremobheads.effect.headeffects.FireproofHeadEffect;
import net.risttahukas.moremobheads.effect.headeffects.HydrophobicHeadEffect;
import net.risttahukas.moremobheads.effect.headeffects.SlowFallingHeadEffect;

public class HeadEffects {
    public static final AbstractHeadEffect CRYOPHOBIC = new CryophobicHeadEffect();
    public static final AbstractHeadEffect FIREPROOF = new FireproofHeadEffect();
    public static final AbstractHeadEffect HYDROPHOBIC = new HydrophobicHeadEffect();
    public static final AbstractHeadEffect SLOW_FALLING = new SlowFallingHeadEffect();
}
