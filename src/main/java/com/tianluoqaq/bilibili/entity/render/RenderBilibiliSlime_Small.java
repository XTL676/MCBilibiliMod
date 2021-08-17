package com.tianluoqaq.bilibili.entity.render;

import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime_Small;
import com.tianluoqaq.bilibili.entity.model.ModelBilibiliSlime_Small;

import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

//哔哩哔哩小史莱姆渲染类
public class RenderBilibiliSlime_Small extends GeoEntityRenderer<EntityBilibiliSlime_Small>
{
	public RenderBilibiliSlime_Small(RenderManager manager)
	{
		super(manager, new ModelBilibiliSlime_Small());
		this.shadowSize = 0.4f;// 阴影面积是实体面积的倍数【0.4f为0.4倍】
	}

}
