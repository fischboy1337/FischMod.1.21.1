package eu.fischboy.client.gui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class CustomTitleScreen extends Screen {

    protected CustomTitleScreen() {
        super(Text.of("FischMod 1.21.1"));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
    }
}
