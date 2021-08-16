package com.tianluoqaq.bilibili.tabs;

import com.tianluoqaq.bilibili.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

//在创造模式下E键物品栏里的方块“Block Tab”(方块栏)标签页
public class BlockTab extends CreativeTabs
{

	// 构造方法
	public BlockTab()
	{

		super("block_tab");
		this.setBackgroundImageName("bgi.png");//标签页背景图片【会自动在文件名前面添加“tab_”,故文件名应该命名为“tab_名称.png”】
	}

	@Override
	// 标签页上面显示的图标
	public ItemStack getTabIconItem()
	{

		return new ItemStack(Item.getItemFromBlock(ModBlocks.BILIBILI_BLOCK));

	}

}
