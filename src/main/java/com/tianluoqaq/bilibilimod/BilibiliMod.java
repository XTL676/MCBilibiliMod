package com.tianluoqaq.bilibilimod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//模组入口函数
// The value here should match an entry in the META-INF/mods.toml file
@Mod("bilibilimod")
public class BilibiliMod
{
	public static final Logger LOGGER = LogManager.getLogger();

	public BilibiliMod()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
	}
}
