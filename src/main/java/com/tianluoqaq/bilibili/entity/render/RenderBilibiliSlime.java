package com.tianluoqaq.bilibili.entity.render;

import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime;
import com.tianluoqaq.bilibili.entity.model.ModelBilibiliSlime;
import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

//BilibiliSlime渲染类
public class RenderBilibiliSlime extends GeoEntityRenderer<EntityBilibiliSlime>
{

	public RenderBilibiliSlime(RenderManager manager)
	{
		super(manager, new ModelBilibiliSlime());
		this.shadowSize = 0.5f;// 阴影面积是实体面积的倍数【0.5f为0.5倍】
	}

}
