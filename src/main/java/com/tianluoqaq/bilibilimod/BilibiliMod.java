package com.tianluoqaq.bilibilimod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tianluoqaq.bilibilimod.core.init.BlockInit;
import com.tianluoqaq.bilibilimod.core.init.FeatureInit;
import com.tianluoqaq.bilibilimod.core.init.ItemInit;
import com.tianluoqaq.bilibilimod.core.itemgroup.BItemGroup;
import com.tianluoqaq.bilibilimod.core.util.Reference;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

//模组入口函数,用以加载模组,控制与其他模组的交互
@Mod("bilibilimod")
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Bus.MOD)
public class BilibiliMod
{
	public static final Logger LOGGER = LogManager.getLogger();

	public BilibiliMod()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemInit.ITEMS.register(bus);// 注册“ItemInit”类内所有定义的物品
		BlockInit.BLOCKS.register(bus);// 注册“BlockInit”类内所有定义的方块

		// 监听添加矿石“addOres”函数
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
		MinecraftForge.EVENT_BUS.register(this);
	}

	// 注册物品
	@SubscribeEvent
	public static void OnRegisterItem(final RegistryEvent.Register<Item> event)
	{
		// 注册方块
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->
		{
			// 注册方块到“哔哩哔哩物品”标签页
			event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(BItemGroup.BItemTab))
					.setRegistryName(block.getRegistryName()));
		});
	}
}
