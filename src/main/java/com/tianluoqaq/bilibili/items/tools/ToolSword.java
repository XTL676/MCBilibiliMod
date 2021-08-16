package com.tianluoqaq.bilibili.items.tools;

import com.tianluoqaq.bilibili.Main;
import com.tianluoqaq.bilibili.init.ModItems;
import com.tianluoqaq.bilibili.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

//自定义模组内的剑类
public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, CreativeTabs tab, ToolMaterial material)
	{

		super(material);
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
