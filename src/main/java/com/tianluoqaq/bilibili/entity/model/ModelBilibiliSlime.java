package com.tianluoqaq.bilibili.entity.model;

import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime;
import com.tianluoqaq.bilibili.util.Reference;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

//BilibiliSlime模型类(由Geckolib进行处理)
public class ModelBilibiliSlime extends AnimatedGeoModel<EntityBilibiliSlime>
{
	@Override
	public ResourceLocation getModelLocation(EntityBilibiliSlime object)
	{
		//返回模型json文件位置
		return new ResourceLocation(Reference.MOD_ID, "geo/modelbilibilislime.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(EntityBilibiliSlime object)
	{
		//返回模型贴图png文件位置
		return new ResourceLocation(Reference.MOD_ID, "textures/entity/bilibili_slime.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(EntityBilibiliSlime object)
	{
		//返回模型动作json文件位置
		return new ResourceLocation(Reference.MOD_ID, "animations/modelbilibilislime.animation.json");
	}
}