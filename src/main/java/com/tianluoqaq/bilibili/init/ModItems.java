package com.tianluoqaq.bilibili.init;

import java.util.ArrayList;
import java.util.List;

import com.tianluoqaq.bilibili.Main;
import com.tianluoqaq.bilibili.items.ItemBase;
import com.tianluoqaq.bilibili.items.food.EffectFoodBase;
import com.tianluoqaq.bilibili.items.tools.ToolAxe;
import com.tianluoqaq.bilibili.items.tools.ToolPickaxe;
import com.tianluoqaq.bilibili.items.tools.ToolSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

//模组内的所有物品定义的地方
public class ModItems
{

	public static final List<Item> ITEMS = new ArrayList<Item>();

	/*****************************************Materials(材料)***************************************************************/

	/** 
	 * addToolMaterial(名字, 挖掘等级【0 = 可以挖木头/黄金，1 = 可以挖石头，2 = 可以挖铁，3 = 可以挖黑曜石】, 
	 * 最大耐久度, 挖掘效率【数值越高，速度越快】, 攻击伤害, 可附魔性);
	*/
	public static final ToolMaterial MATERIAL_BILIBILI = EnumHelper.addToolMaterial("material_bilibili", 0, 10, 15.0f,
			5.3f, 10);// Bilibili材料，可以制作用Bilibili制作工具/武器等

	/******************************************Items(物品)******************************************************************/

	// 按照下面这句的格式，往下添加别的物品;json文件夹里贴图路径，格式为，Mod_ID:items/贴图名称【不用写.png后缀名,跟物品的名称保持一致（json文件也一样）】
	public static final Item bibox = new ItemBase("bibox", Main.ITEM_TAB);// 哔哩哔哩碎片
	public static final ItemSword BILIBILI_SWORD = new ToolSword("bilibili_sword", Main.TOOL_TAB, MATERIAL_BILIBILI);// 哔哩哔哩剑
	public static final ItemAxe BILIBILI_AXE = new ToolAxe("bilibili_axe", Main.TOOL_TAB, MATERIAL_BILIBILI);// 哔哩哔哩斧
	public static final ItemPickaxe BILIBILI_PICKAXE = new ToolPickaxe("bilibili_pickaxe", Main.TOOL_TAB,
			MATERIAL_BILIBILI);// 哔哩哔哩镐

	/******************************************foods(材料)******************************************************************/

	/**
	 * 名称为 bilibili_logo 饱食度 6(鸡腿) 饱和度 2.3f(面包2.4f) 能喂给狼吃 位于创造模式物品栏的食物一栏
	 * 
	 * PotionEffect(MobEffects.药水效果名称, 持续时间【以“游戏刻”为单位,1游戏刻 = 0.05秒】, 药水效果等级【从0开始,0 =
	 * 等级1】, 是否与信标有关系, 是否显示药水粒子效果)
	 * 
	 * 食用以后 速度24 60秒, 抗性3 120秒, 水下呼吸256 1200秒, 幸运1 1200秒, 挖掘疲劳256 1200秒, 跳跃提升2 600秒
	 */
	public static final ItemFood BILIBILI_LOGO = new EffectFoodBase("bilibili_logo", 6, 2.3f, true, CreativeTabs.FOOD,
			new PotionEffect[] { new PotionEffect(MobEffects.SPEED, 60 * 20, 23, false, true),
					new PotionEffect(MobEffects.RESISTANCE, 120 * 20, 3, false, true),
					new PotionEffect(MobEffects.WATER_BREATHING, 1200 * 20, 255, false, true),
					new PotionEffect(MobEffects.LUCK, 1200 * 20, 0, false, true),
					new PotionEffect(MobEffects.MINING_FATIGUE, 1200 * 20, 255, false, true),
					new PotionEffect(MobEffects.JUMP_BOOST, 600 * 20, 1, false, true) });// 哔哩哔哩标志
}
