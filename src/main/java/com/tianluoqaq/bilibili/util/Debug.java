package com.tianluoqaq.bilibili.util;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

//调试工具类
public class Debug
{
	/**
	 * 输出调试信息类
	 * 
	 * @param world	调用这个方法的Object所在的世界
	 * @param message	要输出的信息
	 */
	public static final void sendDebugMessage(World world, String message)
	{
		EntityPlayer p = world.getPlayerEntityByName(Minecraft.getMinecraft().player.getName());
		if (p != null) {
			p.sendMessage(new TextComponentString(message));
		}
	}
}
