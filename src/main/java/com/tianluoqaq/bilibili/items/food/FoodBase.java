package com.tianluoqaq.bilibili.items.food;

import com.tianluoqaq.bilibili.Main;
import com.tianluoqaq.bilibili.init.ModItems;
import com.tianluoqaq.bilibili.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

//模组内食物基类
public class FoodBase extends ItemFood implements IHasModel
{

	/**
	 * @param name			食物名称
	 * @param amount		能补充的饱食度(1 = 1个鸡腿)
	 * @param saturation	能补充的饱和度
	 * @param isWolfFood	是否能喂给狼(驯服类实体)吃
	 * @param tab			创造模式标签
	 */
	public FoodBase(String name, int amount, float saturation, boolean isWolfFood, CreativeTabs tab)
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
