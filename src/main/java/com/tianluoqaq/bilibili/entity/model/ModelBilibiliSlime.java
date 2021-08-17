package com.tianluoqaq.bilibili.entity.model;

import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime;
import com.tianluoqaq.bilibili.util.Reference;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

//哔哩哔哩史莱姆模型(由Geckolib处理)
public class ModelBilibiliSlime extends AnimatedGeoModel<EntityBilibiliSlime>
{
	@Override
	public ResourceLocation getModelLocation(EntityBilibiliSlime object)
	{
		return new ResourceLocation(Reference.MOD_ID, "geo/modelbilibilislime.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(EntityBilibiliSlime object)
	{
		return new ResourceLocation(Reference.MOD_ID, "textures/entity/bilibili_slime.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(EntityBilibiliSlime object)
	{
		return new ResourceLocation(Reference.MOD_ID, "animations/modelbilibilislime.animation.json");
	}
}