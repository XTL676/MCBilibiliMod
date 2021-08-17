package com.tianluoqaq.bilibili.entity.model;

import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime_Small;
import com.tianluoqaq.bilibili.util.Reference;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

//哔哩哔哩小史莱姆模型(由Geckolib处理)
public class ModelBilibiliSlime_Small extends AnimatedGeoModel<EntityBilibiliSlime_Small>
{
	@Override
	public ResourceLocation getModelLocation(EntityBilibiliSlime_Small object)
	{
		return new ResourceLocation(Reference.MOD_ID, "geo/modelbilibilislime_small.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(EntityBilibiliSlime_Small object)
	{
		return new ResourceLocation(Reference.MOD_ID, "textures/entity/bilibili_slime_small.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(EntityBilibiliSlime_Small object)
	{
		return new ResourceLocation(Reference.MOD_ID, "animations/modelbilibilislime_small.animation.json");
	}
}