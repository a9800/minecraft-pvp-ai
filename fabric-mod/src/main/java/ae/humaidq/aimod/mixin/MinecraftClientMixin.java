package ae.humaidq.aimod.mixin;

import net.minecraft.client.MinecraftClient;

import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
// Mixins HAVE to be written in java due to constraints in the mixin system.
public class MinecraftClientMixin {
    @Shadow
    @Final
    public GameRenderer gameRenderer;

    @Inject(at = @At("HEAD"), method = "render(Z)V")
    private void render(boolean tick, CallbackInfo ci) {
        if (this.gameRenderer != null && this.gameRenderer.getCamera() != null) {
            System.out.println(this.gameRenderer.getCamera().getPos());
        }
    }
}
