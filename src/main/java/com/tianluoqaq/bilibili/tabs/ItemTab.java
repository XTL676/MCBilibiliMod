package com.tianluoqaq.bilibili.tabs;

import com.tianluoqaq.bilibili.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

//在创造模式下E键物品栏里的物品“Item Tab”(物品栏)标签页
public class ItemTab extends CreativeTabs
{

	// 构造方法
	public ItemTab()
	{

		super("item_tab");
		this.setBackgroundImageName("bgi.png");//标签页背景图片【会自动在文件名前面添加“tab_”,故文件名应该命名为“tab_名称.png”】
	}

	@Override
	// 标签页上面显示的图标
	public ItemStack getTabIconItem()
	{

		return new ItemStack(ModItems.bibox);

	}

}