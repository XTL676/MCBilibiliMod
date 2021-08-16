package com.tianluoqaq.bilibili.util.handlers;

import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime;
import com.tianluoqaq.bilibili.entity.render.RenderBilibiliSlime;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

//äÖÈ¾¾ä±ú
public class RenderHandler
{
	public static void RegisterEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBilibiliSlime.class,
				new IRenderFactory<EntityBilibiliSlime>()
				{
					@Override
					public Render<? super EntityBilibiliSlime> createRenderFor(RenderManager manager)
					{
						return new RenderBilibiliSlime(manager);
					}
				});
	}
}
