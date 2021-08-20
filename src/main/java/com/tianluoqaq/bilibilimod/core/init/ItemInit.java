package com.tianluoqaq.bilibilimod.core.init;

import com.tianluoqaq.bilibilimod.core.itemgroup.BItemGroup;
import com.tianluoqaq.bilibilimod.core.util.Reference;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//模组内物品实例化以及初始化的类【定义物品的类】
public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

	/******************************************Items(物品)******************************************************************/

	/**
	 * 定义物品
	 * 
	 * ITEMS.register("物品标识符",
			() -> new Item(new Item.Properties().tab(ItemGroup.创建模式的物品栏内该物品所在的标签页)));
	 */
	public static final RegistryObject<Item> BIBOX = ITEMS.register("bibox", // 哔哩哔哩碎片
			() -> new Item(new Item.Properties().tab(BItemGroup.BItemTab)));

	public static final RegistryObject<Item> B_DIAMOND = ITEMS.register("b_diamond", // 哔哩哔哩钻
			() -> new Item(new Item.Properties().tab(BItemGroup.BItemTab)));
}
