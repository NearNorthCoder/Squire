/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 */
package net.runelite.client.util;

import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;

public class PvPUtil {
    public static int getWildernessLevelFrom(WorldPoint point) {
        return com.openosrs.client.util.PvPUtil.getWildernessLevelFrom(point);
    }

    public static boolean isAttackable(Client client, Player player) {
        return com.openosrs.client.util.PvPUtil.isAttackable(client, player);
    }
}

