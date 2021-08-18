package com.tianluoqaq.bilibili.commands;

import java.util.List;

import com.google.common.collect.Lists;
import com.tianluoqaq.bilibili.util.Debug;
import com.tianluoqaq.bilibili.util.Reference;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

//查看当前所在的生物群落的名称
public class CommandShowBiome extends CommandBase
{
	// 可用命令输入的字符串
	private final List<String> aliases = Lists.newArrayList(Reference.MOD_ID, "biomeshow");

	// 命令的全称
	@Override
	public String getName()
	{
		return "biomeshow";
	}

	// 命令的格式
	@Override
	public String getUsage(ICommandSender sender)
	{
		return "biomeshow";
	}

	@Override
	public List<String> getAliases()
	{
		return aliases;
	}

	// 是否检查有无权限运行此命令
	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender)
	{
		return true;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		if (sender instanceof EntityPlayer)
		{

			Debug.sendDebugMessage(((EntityPlayer) sender).world,
					((EntityPlayer) sender).world.getBiome(sender.getPosition()) + " \n List: "
							+ ((EntityPlayer) sender).world.getBiome(sender.getPosition())
									.getSpawnableList(EnumCreatureType.MONSTER));
		}
	}

}
