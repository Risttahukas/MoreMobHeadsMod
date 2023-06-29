package net.risttahukas.moremobheads.entity.renderer;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.minecraft.Util;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiFunction;
import java.util.function.Function;

@OnlyIn(Dist.CLIENT)
public abstract class ModRenderType extends RenderType {
    public ModRenderType(String p_173178_, VertexFormat p_173179_, VertexFormat.Mode p_173180_, int p_173181_, boolean p_173182_, boolean p_173183_, Runnable p_173184_, Runnable p_173185_) {
        super(p_173178_, p_173179_, p_173180_, p_173181_, p_173182_, p_173183_, p_173184_, p_173185_);
    }

    private static final BiFunction<ResourceLocation, Boolean, RenderType> ENTITY_TRANSLUCENT_NO_CULL_Z_OFFSET = Util.memoize((resourceLocation, aBoolean) -> {
        RenderType.CompositeState rendertype$compositestate = RenderType.CompositeState.builder().setShaderState(RENDERTYPE_ENTITY_TRANSLUCENT_SHADER).setTextureState(new RenderStateShard.TextureStateShard(resourceLocation, false, false)).setTransparencyState(TRANSLUCENT_TRANSPARENCY).setCullState(NO_CULL).setLightmapState(LIGHTMAP).setOverlayState(OVERLAY).setLayeringState(VIEW_OFFSET_Z_LAYERING).createCompositeState(aBoolean);
        return create("entity_translucent_no_cull_z_offset", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, true, true, rendertype$compositestate);
    });
    private static final Function<ResourceLocation, RenderType> EYES_Z_OFFSET = Util.memoize((resourceLocation) -> {
        RenderType.CompositeState rendertype$compositestate = RenderType.CompositeState.builder().setShaderState(RENDERTYPE_EYES_SHADER).setTextureState(new RenderStateShard.TextureStateShard(resourceLocation, false, false)).setTransparencyState(ADDITIVE_TRANSPARENCY).setWriteMaskState(COLOR_WRITE).setLayeringState(VIEW_OFFSET_Z_LAYERING).createCompositeState(false);
        return create("eyes_z_offset", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, false, true, rendertype$compositestate);
    });

    public static RenderType entityTranslucentNoCullZOffset(@NotNull ResourceLocation resourceLocation, boolean b) {
        return ENTITY_TRANSLUCENT_NO_CULL_Z_OFFSET.apply(resourceLocation, b);
    }

    public static RenderType entityTranslucentNoCullZOffset(@NotNull ResourceLocation resourceLocation) {
        return entityTranslucentNoCullZOffset(resourceLocation, true);
    }

    public static @NotNull RenderType eyesZOffset(@NotNull ResourceLocation resourceLocation) {
        return EYES_Z_OFFSET.apply(resourceLocation);
    }
}
