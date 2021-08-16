package com.tianluoqaq.bilibili.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

//模组内的熔炉炼制配方
public class ModRecipes
{

	// ItemStack(Items.DYE【染料类】, 数量, 数据值【F3+H 鼠标悬停在物品上方，显示的“#xxxx/x”的“/”后面的数字】)
	public static final ItemStack LAPIS_LAZULI = new ItemStack(Items.DYE, 1, 4);// 青金石

	public static void init()
	{

		/**
		 * 放入物品/输出物品 格式:
		 * 
		 * 原版方块(vanilla blocks):	Blocks.方块名
		 * 原版物品(vanilla blocks):	Items.物品名
		 * 模组方块(mod blocks):	ModBlocks.方块名
		 * 模组物品(mod items):	ModItems.物品名
		 * 
		 * addSmelting(放入物品,new ItemStack(炼制出的物品,数量),得到经验的概率【1.0f为100%得到经验，0.857f为85.7%得到经验】)
		*/

		//哔哩哔哩块*1 -> 哔哩哔哩碎片*6
		GameRegistry.addSmelting(ModBlocks.BILIBILI_BLOCK, new ItemStack(ModItems.bibox, 6), 0.857f);
		//青金石*1 -> 哔哩哔哩碎片*2
		GameRegistry.addSmelting(LAPIS_LAZULI, new ItemStack(ModItems.bibox, 2), 0.2233f);
	}

}
