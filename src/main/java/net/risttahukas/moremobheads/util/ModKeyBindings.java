package net.risttahukas.moremobheads.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;

public class ModKeyBindings {
    public static final String KEY_CATEGORY_MOREMOBHEADS = "key.category.moremobheads";
    public static final String KEY_ACTIVATE_HEAD_EFFECT = "key.moremobheads.activate_head_effect";
    public static final String KEY_MAKE_HEAD_SOUND = "key.moremobheads.make_head_sound";

    public static KeyMapping HEAD_EFFECT_KEY = new KeyMapping(KEY_ACTIVATE_HEAD_EFFECT, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, InputConstants.KEY_H, KEY_CATEGORY_MOREMOBHEADS);

    public static KeyMapping HEAD_SOUND_KEY = new KeyMapping(KEY_MAKE_HEAD_SOUND, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, InputConstants.KEY_N, KEY_CATEGORY_MOREMOBHEADS);
}
