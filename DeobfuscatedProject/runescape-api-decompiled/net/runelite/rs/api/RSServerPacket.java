/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.packets.ServerPacket
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.packets.ServerPacket;
import net.runelite.mapping.Import;

public interface RSServerPacket
extends ServerPacket {
    @Import(value="id")
    public int getId();

    @Import(value="length")
    public int getLength();

    @Import(value="GRAPHICSOBJECT_SPAWN")
    public RSServerPacket GRAPHICSOBJECT_SPAWN();

    @Import(value="LOGOUT")
    public RSServerPacket LOGOUT();

    @Import(value="MESSAGE_FRIENDS_CHAT")
    public RSServerPacket MESSAGE_FRIENDS_CHAT();

    @Import(value="CAM_RESET")
    public RSServerPacket CAM_RESET();

    @Import(value="IF_SETHIDE")
    public RSServerPacket IF_SETHIDE();

    @Import(value="IF_SETPLAYERHEAD")
    public RSServerPacket IF_SETPLAYERHEAD();

    @Import(value="IF_SETSCROLLPOS")
    public RSServerPacket IF_SETSCROLLPOS();

    @Import(value="UPDATE_REBOOT_TIMER")
    public RSServerPacket UPDATE_REBOOT_TIMER();

    @Import(value="UPDATE_STOCKMARKET_SLOT")
    public RSServerPacket UPDATE_STOCKMARKET_SLOT();

    @Import(value="UPDATE_FRIENDLIST")
    public RSServerPacket UPDATE_FRIENDLIST();

    @Import(value="MINIMAP_TOGGLE")
    public RSServerPacket MINIMAP_TOGGLE();

    @Import(value="RESET_CLIENT_VARCACHE")
    public RSServerPacket RESET_CLIENT_VARCACHE();

    @Import(value="IF_SETOBJECT")
    public RSServerPacket IF_SETOBJECT();

    @Import(value="UPDATE_INV_FULL")
    public RSServerPacket UPDATE_INV_FULL();

    @Import(value="UPDATE_IGNORELIST")
    public RSServerPacket UPDATE_IGNORELIST();

    @Import(value="IF_MOVESUB")
    public RSServerPacket IF_MOVESUB();

    @Import(value="REFLECTION_CHECKER")
    public RSServerPacket REFLECTION_CHECKER();

    @Import(value="PROJECTILE_SPAWN")
    public RSServerPacket PROJECTILE_SPAWN();

    @Import(value="CAM_LOOKAT")
    public RSServerPacket CAM_LOOKAT();

    @Import(value="MINIMAP_FLAG_SET")
    public RSServerPacket MINIMAP_FLAG_SET();

    @Import(value="NPC_SET_SEQUENCE")
    public RSServerPacket NPC_SET_SEQUENCE();

    @Import(value="MESSAGE_PRIVATE_ECHO")
    public RSServerPacket MESSAGE_PRIVATE_ECHO();

    @Import(value="VARP_LARGE")
    public RSServerPacket VARP_LARGE();

    @Import(value="IF_SETANGLE")
    public RSServerPacket IF_SETANGLE();

    @Import(value="SET_PLAYER_OP")
    public RSServerPacket SET_PLAYER_OP();

    @Import(value="UPDATE_INV_PARTIAL")
    public RSServerPacket UPDATE_INV_PARTIAL();

    @Import(value="IF_SETNPCHEAD")
    public RSServerPacket IF_SETNPCHEAD();

    @Import(value="IF_SETMODEL")
    public RSServerPacket IF_SETMODEL();

    @Import(value="IF_SETCOLOUR")
    public RSServerPacket IF_SETCOLOUR();

    @Import(value="MESSAGE_PRIVATE")
    public RSServerPacket MESSAGE_PRIVATE();

    @Import(value="UPDATE_STAT")
    public RSServerPacket UPDATE_STAT();

    @Import(value="IF_CLOSESUB")
    public RSServerPacket IF_CLOSESUB();

    @Import(value="PING_STATISTICS_REQUEST")
    public RSServerPacket PING_STATISTICS_REQUEST();

    @Import(value="UPDATE_INV_STOP_TRANSIT")
    public RSServerPacket UPDATE_INV_STOP_TRANSIT();

    @Import(value="URL_OPEN")
    public RSServerPacket URL_OPEN();

    @Import(value="RUNCLIENTSCRIPT")
    public RSServerPacket RUNCLIENTSCRIPT();

    @Import(value="MESSAGE_GAME")
    public RSServerPacket MESSAGE_GAME();

    @Import(value="CAM_SETANGLE")
    public RSServerPacket CAM_SETANGLE();

    @Import(value="CHAT_FILTER_SETTINGS")
    public RSServerPacket CHAT_FILTER_SETTINGS();

    @Import(value="SYNC_CLIENT_VARCACHE")
    public RSServerPacket SYNC_CLIENT_VARCACHE();

    @Import(value="IF_SETPOSITION")
    public RSServerPacket IF_SETPOSITION();
}

