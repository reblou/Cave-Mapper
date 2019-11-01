package com.reblou.cavemapper;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

public class KeyEventHandler {
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(KeyInputEvent event) {
		
		KeyBinding[] keys = ClientProxy.keyBindings;
		if (keys[0].isPressed()) {
			System.out.println("Key Binding = " + keys[0].getKeyDescription());
			
			Minecraft.getMinecraft().displayGuiScreen(new MapGui());
		}
		
	}

}
