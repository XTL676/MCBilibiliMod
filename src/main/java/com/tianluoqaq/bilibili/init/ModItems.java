package com.tianluoqaq.bilibili.init;

import java.util.ArrayList;
import java.util.List;

import com.tianluoqaq.bilibili.Main;
import com.tianluoqaq.bilibili.items.ItemBase;
import com.tianluoqaq.bilibili.items.food.EffectFoodBase;
import com.tianluoqaq.bilibili.items.tools.ToolAxe;
import com.tianluoqaq.bilibili.items.tools.ToolSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

//ģ���ڵ�������Ʒ����ĵط�
public class ModItems
{

	public static final List<Item> ITEMS = new ArrayList<Item>();

	/*****************************************Materials(����)***************************************************************/

	/** 
	 * addToolMaterial(����, �ھ�ȼ���0 = ������ľͷ/�ƽ�1 = ������ʯͷ��2 = ����������3 = �����ں���ʯ��, 
	 * ����;ö�, �ھ�Ч�ʡ���ֵԽ�ߣ��ٶ�Խ�졿, �����˺�, �ɸ�ħ��);
	*/
	public static final ToolMaterial MATERIAL_BILIBILI = EnumHelper.addToolMaterial("material_bilibili", 0, 10, 15.0f,
			5.3f, 10);// Bilibili���ϣ�����������Bilibili��������/������

	/******************************************Items(��Ʒ)******************************************************************/

	// �����������ĸ�ʽ���������ӱ����Ʒ;json�ļ�������ͼ·������ʽΪ��Mod_ID:items/��ͼ���ơ�����д.png��׺��,����Ʒ�����Ʊ���һ�£�json�ļ�Ҳһ������
	public static final Item bibox = new ItemBase("bibox", Main.ITEM_TAB);// ����������Ƭ
	public static final ItemSword BILIBILI_SWORD = new ToolSword("bilibili_sword", Main.TOOL_TAB, MATERIAL_BILIBILI);// ����������
	public static final ItemAxe BILIBILI_AXE = new ToolAxe("bilibili_axe", Main.TOOL_TAB, MATERIAL_BILIBILI);// ����������

	/******************************************foods(����)******************************************************************/

	/*
	 * ����Ϊ bilibili_logo ��ʳ�� 6(����) ���Ͷ� 2.3f(���2.4f) ��ι���ǳ� λ�ڴ���ģʽ��Ʒ����ʳ��һ��
	 * 
	 * PotionEffect(MobEffects.ҩˮЧ������, ����ʱ�䡾�ԡ���Ϸ�̡�Ϊ��λ,1��Ϸ�� = 0.05�롿, ҩˮЧ���ȼ�����0��ʼ,0 =
	 * �ȼ�1��, �Ƿ����ű��й�ϵ, �Ƿ���ʾҩˮ����Ч��)
	 */
	public static final ItemFood BILIBILI_LOGO = new EffectFoodBase("bilibili_logo", 6, 2.3f, true, CreativeTabs.FOOD,
			new PotionEffect(MobEffects.SPEED, 60 * 20, 23, false, false));// ����������־
}