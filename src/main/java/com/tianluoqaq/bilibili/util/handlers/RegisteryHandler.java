package com.tianluoqaq.bilibili.util.handlers;

import com.tianluoqaq.bilibili.entity.EntityInit;
import com.tianluoqaq.bilibili.init.ModBlocks;
import com.tianluoqaq.bilibili.init.ModItems;
import com.tianluoqaq.bilibili.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//注册句柄
@EventBusSubscriber
public class RegisteryHandler
{

	@SubscribeEvent
	// 注册物品
	public static void onItemRegistry(RegistryEvent.Register<Item> event)
	{

		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

	}

	@SubscribeEvent
	// 注册方块
	public static void onBlockRegistry(RegistryEvent.Register<Block> event)
	{

		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));

	}

	@SubscribeEvent
	// 注册模型
	public static void onModelRegistry(ModelRegistryEvent event)
	{

		// 注册物品模型
		for (Item item : ModItems.ITEMS)
		{
			if (item instanceof IHasModel)
			{
				((IHasModel) item).registerModels();
			}
		}

		// 注册方块模型
		for (Block block : ModBlocks.BLOCKS)
		{
			if (block instanceof IHasModel)
			{
				((IHasModel) block).registerModels();
			}
		}

	}
	
	public static void preInitRegistries()
	{
		EntityInit.registerEntities();//调用方法，注册实体
		RenderHandler.RegisterEntityRenders();//调用方法，注册渲染“bilibili_slime”实体
	}
	
	public static void postInitRegistries()
	{
		
	}

}
