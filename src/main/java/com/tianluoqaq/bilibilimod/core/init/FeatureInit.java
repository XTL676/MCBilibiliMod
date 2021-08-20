package com.tianluoqaq.bilibilimod.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit
{
	public static void addOres(final BiomeLoadingEvent event)
	{
		// 哔哩哔哩钻矿石
		addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.B_DIAMOND_ORE.get().defaultBlockState(),
				5, 0, 50, 20);
	}

	/**
	 * 添加矿石方法
	 * 
	 * @param event
	 * @param rule		矿石可以在哪里生成
	 * @param state		矿石能生成什么
	 * @param veinSize	每次能生成多少个
	 * @param minHeight	最小矿石生成高度
	 * @param maxHeight	最大矿石生成高度
	 * @param amount	生成数量
	 */
	public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize,
			int minHeight, int maxHeight, int amount)
	{
		event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.configured(new OreFeatureConfig(rule, state, veinSize))
						.decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
						.squared().count(amount));
	}
}
