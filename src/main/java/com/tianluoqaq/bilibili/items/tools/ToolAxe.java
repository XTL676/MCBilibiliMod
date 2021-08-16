package com.tianluoqaq.bilibili.items.tools;

import com.tianluoqaq.bilibili.Main;
import com.tianluoqaq.bilibili.init.ModItems;
import com.tianluoqaq.bilibili.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

//自定义模组内的斧头类
public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, CreativeTabs tab, ToolMaterial material)
	{

		/**
		 * material	做这个斧头的材料
		 * damage	攻击伤害
		 * speed	攻击速度
		*/
		super(material, 7.0f, -2.3f);
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
