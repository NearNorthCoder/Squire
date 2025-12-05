/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSMenuAction {
    @Import(value="action")
    public String getOption();

    @Import(value="action")
    public void setOption(String var1);

    @Import(value="opcode")
    public int getOpcode();

    @Import(value="opcode")
    public void setOpcode(int var1);

    @Import(value="identifier")
    public int getIdentifier();

    @Import(value="identifier")
    public void setIdentifier(int var1);

    @Import(value="param0")
    public int getParam0();

    @Import(value="param0")
    public void setParam0(int var1);

    @Import(value="param1")
    public int getParam1();

    @Import(value="param1")
    public void setParam1(int var1);

    @Import(value="itemId")
    public int getItemId();

    @Import(value="itemId")
    public void setItemId(int var1);

    @Import(value="target")
    public String getTarget();

    @Import(value="target")
    public void setTarget(String var1);
}

