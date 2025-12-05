/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Menu
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Menu;
import net.runelite.mapping.Import;

public interface RSMenu
extends Menu {
    @Import(value="actions")
    public String[] getMenuOptions();

    @Import(value="targets")
    public String[] getMenuTargets();

    @Import(value="identifiers")
    public int[] getMenuIdentifiers();

    @Import(value="opcodes")
    public int[] getMenuOpcodes();

    @Import(value="arguments1")
    public int[] getMenuArguments1();

    @Import(value="arguments2")
    public int[] getMenuArguments2();

    @Import(value="itemIds")
    public int[] getMenuItemIds();

    @Import(value="shiftClick")
    public boolean[] getMenuForceLeftClick();

    @Import(value="x")
    public int getMenuX();

    @Import(value="y")
    public int getMenuY();

    @Import(value="width")
    public int getMenuWidth();

    @Import(value="height")
    public int getMenuHeight();

    @Import(value="optionCount")
    public int getMenuOptionCount();

    @Import(value="x")
    public void setMenuX(int var1);

    @Import(value="y")
    public void setMenuY(int var1);

    @Import(value="width")
    public void setMenuWidth(int var1);

    @Import(value="height")
    public void setMenuHeight(int var1);

    @Import(value="optionCount")
    public void setMenuOptionCount(int var1);
}

