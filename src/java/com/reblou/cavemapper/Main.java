package com.reblou.cavemapper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	public static final String MODID = "cavemapper";
	public static final String MODNAME = "Cave Mapper";
	public static final String VERSION = "1.0.0";
	
	@Instance
	public static Main instance = new Main();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {}
	
	@EventHandler
	public void Init(FMLInitializationEvent e) {}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {}

}
