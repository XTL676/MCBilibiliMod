package com.tianluoqaq.bilibili.init;

import java.util.ArrayList;
import java.util.List;

import com.tianluoqaq.bilibili.Main;
import com.tianluoqaq.bilibili.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

//模组内的所有方块定义的地方
public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	// 哔哩哔哩块，材质为“玻璃”
	public static final Block BILIBILI_BLOCK = new BlockBase("bilibili_block", Material.GRASS, Main.BLOCK_TAB);
}
