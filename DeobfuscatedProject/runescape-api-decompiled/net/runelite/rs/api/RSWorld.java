/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.World
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.World;
import net.runelite.mapping.Import;

public interface RSWorld
extends World {
    @Import(value="properties")
    public int getMask();

    @Import(value="properties")
    public void setMask(int var1);

    @Import(value="population")
    public int getPlayerCount();

    @Import(value="population")
    public void setPlayerCount(int var1);

    @Import(value="location")
    public int getLocation();

    @Import(value="location")
    public void setLocation(int var1);

    @Import(value="index")
    public int getIndex();

    @Import(value="index")
    public void setIndex(int var1);

    @Import(value="id")
    public int getId();

    @Import(value="id")
    public void setId(int var1);

    @Import(value="activity")
    public String getActivity();

    @Import(value="activity")
    public void setActivity(String var1);

    @Import(value="host")
    public String getAddress();

    @Import(value="host")
    public void setAddress(String var1);
}

