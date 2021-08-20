package com.tianluoqaq.bilibilimod.core.itemgroup;

import com.tianluoqaq.bilibilimod.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

//创造模式的模组方块标签页
public class BItemGroup extends ItemGroup
{
	public static final BItemGroup BItemTab = new BItemGroup(ItemGroup.getGroupCountSafe(), "b_item_tab");

	public BItemGroup(int p_i1853_1_, String p_i1853_2_)
	{
		super(p_i1853_1_, p_i1853_2_);
	}

	@Override
	public ItemStack makeIcon()
	{
		return new ItemStack(ItemInit.BIBOX.get());
	}

}
