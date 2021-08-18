package com.tianluoqaq.bilibili.entity;

import com.tianluoqaq.bilibili.Main;
import com.tianluoqaq.bilibili.util.Reference;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
	// 调用注册实体方法,注册实体
	public static void registerEntities()
	{
		// TODO 自然生成实体
		// 哔哩哔哩史莱姆系列,自然生成于:雪山,平原,森林,蘑菇岛海岸
		registerEntity("bilibili_slime", EntityBilibiliSlime.class, Reference.ENTITY_BILIBILI_SLIME, 50, 2272740, 0,
				100, 4, 4, EnumCreatureType.MONSTER, Biomes.ICE_MOUNTAINS, Biomes.PLAINS, Biomes.FOREST,
				Biomes.MUSHROOM_ISLAND_SHORE);

		registerEntity("bilibili_slime_small", EntityBilibiliSlime_Small.class, Reference.ENTITY_BILIBILI_SLIME_SMALL,
				55, 2272740, 0, 100, 4, 4, EnumCreatureType.MONSTER, Biomes.ICE_MOUNTAINS, Biomes.PLAINS, Biomes.FOREST,
				Biomes.MUSHROOM_ISLAND_SHORE);

		registerEntity("bilibili_slime_big", EntityBilibiliSlime_Big.class, Reference.ENTITY_BILIBILI_SLIME_BIG, 53,
				2272740, 0, 100, 4, 4, EnumCreatureType.MONSTER, Biomes.ICE_MOUNTAINS, Biomes.PLAINS, Biomes.FOREST,
				Biomes.MUSHROOM_ISLAND_SHORE);
	}

	/**
	 * 注册实体方法
	 * 
	 * @param name				实体名称
	 * @param entity			实体类型【xxxxx.class】
	 * @param id				实体ID【Reference.xxxxx】
	 * @param range				实体可以发现玩家的最大的范围
	 * 							该实体刷怪蛋的底色【十六进制颜色的纯数字表示，
	 * @param primaryColor		使用网站https://www.mathsisfun.com/hexadecimal-decimal-colors.html,
	 * 							将“#xxxxxx”填入“Color Mixer”的“Hexadecimal”中，再将下面的“Decimal”纯数字复制下来】
	 * @param secondaryColor	该实体刷怪蛋的次要颜色【相当于蛋上面的斑点的颜色】
	 * @param weightedProb		加权概率
	 * @param minSpawnCount		最小生成数量
	 * @param maxSpawnCount		最大生成数量
	 * @param spawnType			生成类型,有
	 * EnumCreatureType.MONSTER 怪物类	EnumCreatureType.CREATURE 动物类
	 * EnumCreatureType.AMBIENT 环境生物类	EnumCreatureType.WATER_CREATURE	水下生物类
	 * 
	 * @param biomes			生物群系【Biomes.xx,Biomes.xx,...,Biomes.xx】,
	 * 							【详见“生物群系ID.txt”】
	 */
	public static void registerEntity(String name, Class<? extends EntityLiving> entity, int id, int range,
			int primaryColor, int secondaryColor, int weightedProb, int minSpawnCount, int maxSpawnCount,
			EnumCreatureType spawnType, Biome... biomes)
	{
		/**
		 * registerModEntity(
		 * new ResourceLocation(Reference.MOD_ID + ":" + name【实体所在资源位置，格式为:模组ID名称:实体名称】),
		 * 实体类【Class<? extends Entity>】, 实体名称, 实体ID, 
		 * 所存在的模组【可填自身,Main.instance】, 实体发现玩家最大的范围, 跟踪更新的频率, 是否发送速度信息包, 
		 * 该实体刷怪蛋的底色, 该实体刷怪蛋的次要颜色);
		*/
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id,
				Main.instance, range, 1, true, primaryColor, secondaryColor);

		EntityRegistry.addSpawn(entity, weightedProb, minSpawnCount, maxSpawnCount, spawnType, biomes);
	}
}
