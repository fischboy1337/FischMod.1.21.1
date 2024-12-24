package eu.fischboy.client.system;

import net.minecraft.client.gui.DrawContext;

public abstract class FischModSystem {

    protected abstract void start();
    protected abstract void stop();
    protected abstract void tick();
    protected abstract void render(DrawContext context);
}
