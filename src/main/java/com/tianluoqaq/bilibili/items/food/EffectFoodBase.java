package com.tianluoqaq.bilibili.items.food;

import com.tianluoqaq.bilibili.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//模组内吃了会有药水效果的食物基类
public class EffectFoodBase extends FoodBase implements IHasModel
{

	private PotionEffect[] effect;// 单个/多个药水效果

	/**
	 * @param name			食物名称
	 * @param amount		能补充的饱食度(1 = 1个鸡腿)
	 * @param saturation	能补充的饱和度
	 * @param isWolfFood	是否能喂给狼(驯服类实体)吃
	 * @param tab			创造模式标签
	 * @param effect		单个/多个药水效果
	 */
	public EffectFoodBase(String name, int amount, float saturation, boolean isWolfFood, CreativeTabs tab,
			PotionEffect[] effect)
	{
		super(name, amount, saturation, isWolfFood, tab);

		setAlwaysEdible();// 使用此方法可以让食物在玩家饱食度满的情况下还是可以吃

		this.effect = effect;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if (!worldIn.isRemote && effect.length != 0)// 检查传入的药水效果参数数量是否为0,如果是,则不进行附加药水效果的操作
		{
			for (int i = 0; i < effect.length; i++)
			{
				player.addPotionEffect(new PotionEffect(effect[i].getPotion(), effect[i].getDuration(),
						effect[i].getAmplifier(), effect[i].getIsAmbient(), effect[i].doesShowParticles()));
			}
		}
	}

	// 返回此食物是有药水效果的
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}

}
