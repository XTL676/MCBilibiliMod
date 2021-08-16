package com.tianluoqaq.bilibili.util.handlers;

import com.tianluoqaq.bilibili.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

//战利品表句柄
public class LootTableHandler
{
	//告诉战利品表它的资源位置(loot_tables/xxxx.json),一便可以正常注册它
	//注意:需要在json文件里加上“"name":"随便输入名称",”这一行文字,实体才能正常掉落物品
	public static final ResourceLocation BILIBILI_SLIME = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "bilibili_slime"));
}
