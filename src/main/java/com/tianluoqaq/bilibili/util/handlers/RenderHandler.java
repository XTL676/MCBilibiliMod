package com.tianluoqaq.bilibili.util.handlers;

import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime;
import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime_Big;
import com.tianluoqaq.bilibili.entity.EntityBilibiliSlime_Small;
import com.tianluoqaq.bilibili.entity.render.RenderBilibiliSlime;
import com.tianluoqaq.bilibili.entity.render.RenderBilibiliSlime_Big;
import com.tianluoqaq.bilibili.entity.render.RenderBilibiliSlime_Small;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

//äÖÈ¾¾ä±ú
public class RenderHandler
{
	// ÊµÌåäÖÈ¾·½·¨
	public static void RegisterEntityRenders()
	{
		// ßÙÁ¨ßÙÁ¨Ê·À³Ä·äÖÈ¾×¢²á
		RenderingRegistry.registerEntityRenderingHandler(EntityBilibiliSlime.class,
				new IRenderFactory<EntityBilibiliSlime>()
				{
					@Override
					public Render<? super EntityBilibiliSlime> createRenderFor(RenderManager manager)
					{
						return new RenderBilibiliSlime(manager);
					}
				});

		// ßÙÁ¨ßÙÁ¨Ğ¡Ê·À³Ä·äÖÈ¾×¢²á
		RenderingRegistry.registerEntityRenderingHandler(EntityBilibiliSlime_Small.class,
				new IRenderFactory<EntityBilibiliSlime_Small>()
				{
					@Override
					public Render<? super EntityBilibiliSlime_Small> createRenderFor(RenderManager manager)
					{
						return new RenderBilibiliSlime_Small(manager);
					}
				});

		// ßÙÁ¨ßÙÁ¨´óÊ·À³Ä·äÖÈ¾×¢²á
		RenderingRegistry.registerEntityRenderingHandler(EntityBilibiliSlime_Big.class,
				new IRenderFactory<EntityBilibiliSlime_Big>()
				{
					@Override
					public Render<? super EntityBilibiliSlime_Big> createRenderFor(RenderManager manager)
					{
						return new RenderBilibiliSlime_Big(manager);
					}
				});
	}
}
