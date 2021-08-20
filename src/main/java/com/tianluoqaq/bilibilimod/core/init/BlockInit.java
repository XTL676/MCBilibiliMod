package com.tianluoqaq.bilibilimod.core.init;

import com.tianluoqaq.bilibilimod.core.util.Reference;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//模组内方块实例化以及初始化的类【定义方块的类】
public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			Reference.MOD_ID);

	/******************************************Blocks(方块)******************************************************************/

	/**
	 * 定义方块
	 * 
	 * ITEMS.register("方块标识符",
	 *	() -> new Block(AbstractBlock.Properties.of(Material.方块的材质)
	 *		.harvestLevel(方块的坚硬等级【0 = 可以用手破坏, 1 = 石头, 2 = 铁, 3 = 钻石】).sound(SoundType.被破坏时发出的声音)
	 *			.strength(方块的坚硬程度【https://minecraft.fandom.com/wiki/Breaking#Blocks_by_hardness】
	 *			, 方块的挖掘阻力【https://minecraft.fandom.com/wiki/Explosion】)));
	 */
	// TODO 半透明方块
	public static final RegistryObject<Block> LIGHT_BLUE_BILIBILI_GLASS = BLOCKS.register("light_blue_bilibili_glass",
			() -> new Block(AbstractBlock.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.3f, 0.3f)));

	// 哔哩哔哩钻矿石
	public static final RegistryObject<Block> B_DIAMOND_ORE = BLOCKS.register("b_diamond_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE).strength(3f, 3f)));
}
