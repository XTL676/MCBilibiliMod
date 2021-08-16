package com.tianluoqaq.bilibili;

import com.tianluoqaq.bilibili.init.ModRecipes;
import com.tianluoqaq.bilibili.proxy.CommonProxy;
import com.tianluoqaq.bilibili.tabs.BlockTab;
import com.tianluoqaq.bilibili.tabs.ItemTab;
import com.tianluoqaq.bilibili.tabs.ToolTab;
import com.tianluoqaq.bilibili.util.Reference;
import com.tianluoqaq.bilibili.util.handlers.RegisteryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import software.bernie.geckolib3.GeckoLib;

//模组主入口函数
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{

	//示例
	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegisteryHandler.preInitRegistries();
	}

	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		//Geckolib初始化
		GeckoLib.initialize();
		
		//模组内的熔炉炼制配方初始化
		ModRecipes.init();
	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{

	}

	// 新建创建模式下E键物品栏的标签页
	public static final CreativeTabs BLOCK_TAB = new BlockTab();//方块
	public static final CreativeTabs ITEM_TAB = new ItemTab();//物品
	public static final CreativeTabs TOOL_TAB = new ToolTab();//工具

}
