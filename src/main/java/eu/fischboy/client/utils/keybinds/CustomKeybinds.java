package eu.fischboy.client.utils;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class CustomKeybinds {

    public static KeyBinding keyBinding;

    public static void registerKeybinds() {
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "ClickGUI",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_RIGHT_SHIFT,
                "fischmod"));
    }
}
