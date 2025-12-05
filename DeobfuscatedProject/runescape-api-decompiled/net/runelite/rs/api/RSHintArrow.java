/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSHintArrow {
    @Import(value="index")
    public int getIndex();

    @Import(value="index")
    public void setIndex(int var1);

    @Import(value="type")
    public int getType();

    @Import(value="type")
    public void setType(int var1);

    @Import(value="x")
    public int getX();

    @Import(value="x")
    public void setX(int var1);

    @Import(value="y")
    public int getY();

    @Import(value="y")
    public void setY(int var1);

    @Import(value="subX")
    public int getSubX();

    @Import(value="subX")
    public void setSubX(int var1);

    @Import(value="subY")
    public int getSubY();

    @Import(value="subY")
    public void setSubY(int var1);

    public void hintPlayerChanged(int var1);
}

