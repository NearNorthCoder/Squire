/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ChatPlayer
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.ChatPlayer;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSUser;

public interface RSBuddy
extends ChatPlayer,
RSUser {
    @Import(value="getWorld")
    public int getWorld();

    @Import(value="rank")
    public int getRSRank();
}

