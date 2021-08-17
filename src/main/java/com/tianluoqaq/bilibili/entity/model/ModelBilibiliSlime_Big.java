package com.tianluoqaq.bilibili.entity.model;

import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime_Big;
import com.tianluoqaq.bilibili.util.Reference;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

//哔哩哔哩大史莱姆模型(由Geckolib处理)
public class ModelBilibiliSlime_Big extends AnimatedGeoModel<EntityBilibiliSlime_Big>
{
	@Override
	public ResourceLocation getModelLocation(EntityBilibiliSlime_Big object)
	{
		return new ResourceLocation(Reference.MOD_ID, "geo/modelbilibilislime_big.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(EntityBilibiliSlime_Big object)
	{
		return new ResourceLocation(Reference.MOD_ID, "textures/entity/bilibili_slime_big.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(EntityBilibiliSlime_Big object)
	{
		return new ResourceLocation(Reference.MOD_ID, "animations/modelbilibilislime_big.animation.json");
	}
}