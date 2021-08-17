package com.tianluoqaq.bilibili.entity;

import com.tianluoqaq.bilibili.Main;
import com.tianluoqaq.bilibili.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
	// 调用注册实体方法,注册实体
	public static void registerEntities()
	{
		registerEntity("bilibili_slime", EntityBilibiliSlime.class, Reference.ENTITY_BILIBILI_SLIME, 50, 2272740, 0);
		registerEntity("bilibili_slime_small", EntityBilibiliSlime_Small.class, Reference.ENTITY_BILIBILI_SLIME_SMALL,
				80, 2272740, 0);
		registerEntity("bilibili_slime_big", EntityBilibiliSlime_Big.class, Reference.ENTITY_BILIBILI_SLIME_BIG,
				65, 2272740, 0);
	}

	// 注册实体方法
	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int primaryColor,
			int secondaryColor)
	{
		/**
		 * registerModEntity(
		 * new ResourceLocation(Reference.MOD_ID + ":" + name【实体所在资源位置，格式为:模组ID名称:实体名称】),
		 * 实体类【Class<? extends Entity>】, 实体名称, 实体ID, 
		 * 所存在的模组【可填自身,Main.instance】, 实体发现玩家最大的范围, 跟踪更新的频率, 是否发送速度信息包, 
		 * 该实体刷怪蛋的底色【十六进制颜色的纯数字表示，使用网站https://www.mathsisfun.com/hexadecimal-decimal-colors.html，
		 * 将“#xxxxxx”填入“Color Mixer”的“Hexadecimal”中，再将下面的“Decimal”纯数字复制下来】, 该实体刷怪蛋的次要颜色);
		*/
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id,
				Main.instance, range, 1, true, primaryColor, secondaryColor);
	}
}
