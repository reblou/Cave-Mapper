package com.reblou.cavemapper;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy {
	public static KeyBinding[] keyBindings;

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
        keyBindings = new KeyBinding[1];
        keyBindings[0] = new KeyBinding("key.hud.desc", Keyboard.KEY_N, "key.magicbeans.category");
        for (int i = 0; i < keyBindings.length; i++) {
        	ClientRegistry.registerKeyBinding(keyBindings[i]);
        }
        
        FMLCommonHandler.instance().bus().register(new KeyEventHandler());
	}

	
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
}
