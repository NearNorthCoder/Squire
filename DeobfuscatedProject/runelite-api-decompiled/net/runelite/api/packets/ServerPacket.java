/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.packets;

import java.util.Map;

public interface ServerPacket {
    public int getId();

    public int getLength();

    public ServerPacket GRAPHICSOBJECT_SPAWN();

    public ServerPacket LOGOUT();

    public ServerPacket MESSAGE_FRIENDS_CHAT();

    public ServerPacket CAM_RESET();

    public ServerPacket PLAYER_INFO();

    public ServerPacket HINT_ARROW();

    public ServerPacket IF_SETHIDE();

    public ServerPacket IF_SETPLAYERHEAD();

    public ServerPacket IF_SETSCROLLPOS();

    public ServerPacket NPC_INFO_LARGE_VIEWPORT_1();

    public ServerPacket UPDATE_REBOOT_TIMER();

    public ServerPacket UPDATE_STOCKMARKET_SLOT();

    public ServerPacket NPC_INFO_SMALL_VIEWPORT_2();

    public ServerPacket UPDATE_FRIENDLIST();

    public ServerPacket MINIMAP_TOGGLE();

    public ServerPacket NPC_INFO_SMALL_VIEWPORT_1();

    public ServerPacket RESET_CLIENT_VARCACHE();

    public ServerPacket IF_SETOBJECT();

    public ServerPacket UPDATE_INV_FULL();

    public ServerPacket UPDATE_IGNORELIST();

    public ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED();

    public ServerPacket REBUILD_NORMAL();

    public ServerPacket IF_MOVESUB();

    public ServerPacket REFLECTION_CHECKER();

    public ServerPacket PROJECTILE_SPAWN();

    public ServerPacket CAM_LOOKAT();

    public ServerPacket MINIMAP_FLAG_SET();

    public ServerPacket NPC_SET_SEQUENCE();

    public ServerPacket MESSAGE_PRIVATE_ECHO();

    public ServerPacket UPDATE_ZONE_FULL_FOLLOWS();

    public ServerPacket UPDATE_INV_CLEAR();

    public ServerPacket LOGOUT_FULL();

    public ServerPacket MIDI_SONG();

    public ServerPacket TRIGGER_ONDIALOG_ABORT();

    public ServerPacket SET_PLAYER_OP();

    public ServerPacket IF_SETCOLOUR();

    public ServerPacket MESSAGE_PRIVATE();

    public ServerPacket REBUILD_REGION();

    public ServerPacket UPDATE_STAT();

    public ServerPacket IF_CLOSESUB();

    public ServerPacket PING_STATISTICS_REQUEST();

    public ServerPacket URL_OPEN();

    public ServerPacket RUNCLIENTSCRIPT();

    public ServerPacket MESSAGE_GAME();

    public ServerPacket CAM_SETANGLE();

    public ServerPacket CHAT_FILTER_SETTINGS();

    public ServerPacket NPC_INFO_LARGE_VIEWPORT_2();

    public ServerPacket IF_SETPOSITION();

    public ServerPacket UPDATE_UID192();

    public ServerPacket DYNAMICOBJECT_SPAWN();

    default public Map<ServerPacket, String> getServerPackets() {
        return Map.ofEntries(Map.entry(this.GRAPHICSOBJECT_SPAWN(), "GRAPHICSOBJECT_SPAWN"), Map.entry(this.LOGOUT(), "LOGOUT"), Map.entry(this.MESSAGE_FRIENDS_CHAT(), "MESSAGE_FRIENDS_CHAT"), Map.entry(this.CAM_RESET(), "CAM_RESET"), Map.entry(this.PLAYER_INFO(), "PLAYER_INFO"), Map.entry(this.HINT_ARROW(), "HINT_ARROW"), Map.entry(this.IF_SETHIDE(), "IF_SETHIDE"), Map.entry(this.IF_SETPLAYERHEAD(), "IF_SETPLAYERHEAD"), Map.entry(this.IF_SETSCROLLPOS(), "IF_SETSCROLLPOS"), Map.entry(this.NPC_INFO_LARGE_VIEWPORT_1(), "NPC_INFO_LARGE_VIEWPORT_1"), Map.entry(this.UPDATE_REBOOT_TIMER(), "UPDATE_REBOOT_TIMER"), Map.entry(this.UPDATE_STOCKMARKET_SLOT(), "UPDATE_STOCKMARKET_SLOT"), Map.entry(this.NPC_INFO_SMALL_VIEWPORT_2(), "NPC_INFO_SMALL_VIEWPORT_2"), Map.entry(this.UPDATE_FRIENDLIST(), "UPDATE_FRIENDLIST"), Map.entry(this.MINIMAP_TOGGLE(), "MINIMAP_TOGGLE"), Map.entry(this.NPC_INFO_SMALL_VIEWPORT_1(), "NPC_INFO_SMALL_VIEWPORT_1"), Map.entry(this.RESET_CLIENT_VARCACHE(), "RESET_CLIENT_VARCACHE"), Map.entry(this.IF_SETOBJECT(), "IF_SETOBJECT"), Map.entry(this.UPDATE_INV_FULL(), "UPDATE_INV_FULL"), Map.entry(this.UPDATE_IGNORELIST(), "UPDATE_IGNORELIST"), Map.entry(this.UPDATE_ZONE_PARTIAL_ENCLOSED(), "UPDATE_ZONE_PARTIAL_ENCLOSED"), Map.entry(this.REBUILD_NORMAL(), "REBUILD_NORMAL"), Map.entry(this.IF_MOVESUB(), "IF_MOVESUB"), Map.entry(this.REFLECTION_CHECKER(), "REFLECTION_CHECKER"), Map.entry(this.PROJECTILE_SPAWN(), "PROJECTILE_SPAWN"), Map.entry(this.CAM_LOOKAT(), "CAM_LOOKAT"), Map.entry(this.MINIMAP_FLAG_SET(), "MINIMAP_FLAG_SET"), Map.entry(this.NPC_SET_SEQUENCE(), "NPC_SET_SEQUENCE"), Map.entry(this.MESSAGE_PRIVATE_ECHO(), "MESSAGE_PRIVATE_ECHO"), Map.entry(this.UPDATE_ZONE_FULL_FOLLOWS(), "UPDATE_ZONE_FULL_FOLLOWS"), Map.entry(this.UPDATE_INV_CLEAR(), "UPDATE_INV_CLEAR"), Map.entry(this.LOGOUT_FULL(), "LOGOUT_FULL"), Map.entry(this.MIDI_SONG(), "MIDI_SONG"), Map.entry(this.TRIGGER_ONDIALOG_ABORT(), "TRIGGER_ONDIALOG_ABORT"), Map.entry(this.SET_PLAYER_OP(), "SET_PLAYER_OP"), Map.entry(this.IF_SETCOLOUR(), "IF_SETCOLOUR"), Map.entry(this.MESSAGE_PRIVATE(), "MESSAGE_PRIVATE"), Map.entry(this.REBUILD_REGION(), "REBUILD_REGION"), Map.entry(this.UPDATE_STAT(), "UPDATE_STAT"), Map.entry(this.IF_CLOSESUB(), "IF_CLOSESUB"), Map.entry(this.PING_STATISTICS_REQUEST(), "PING_STATISTICS_REQUEST"), Map.entry(this.URL_OPEN(), "URL_OPEN"), Map.entry(this.RUNCLIENTSCRIPT(), "RUNCLIENTSCRIPT"), Map.entry(this.MESSAGE_GAME(), "MESSAGE_GAME"), Map.entry(this.CAM_SETANGLE(), "CAM_SETANGLE"), Map.entry(this.CHAT_FILTER_SETTINGS(), "CHAT_FILTER_SETTINGS"), Map.entry(this.NPC_INFO_LARGE_VIEWPORT_2(), "NPC_INFO_LARGE_VIEWPORT_2"), Map.entry(this.IF_SETPOSITION(), "IF_SETPOSITION"), Map.entry(this.UPDATE_UID192(), "UPDATE_UID192"), Map.entry(this.DYNAMICOBJECT_SPAWN(), "DYNAMICOBJECT_SPAWN"));
    }
}

