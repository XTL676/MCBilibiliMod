package com.tianluoqaq.bilibili.entity.render;

import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime_Big;
import com.tianluoqaq.bilibili.entity.model.ModelBilibiliSlime_Big;

import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

//BilibiliSlime_Big渲染类
public class RenderBilibiliSlime_Big extends GeoEntityRenderer<EntityBilibiliSlime_Big>
{
	public RenderBilibiliSlime_Big(RenderManager manager)
	{
		super(manager, new ModelBilibiliSlime_Big());
		this.shadowSize = 0.6f;// 阴影面积是实体面积的倍数【0.6f为0.6倍】
	}
}
