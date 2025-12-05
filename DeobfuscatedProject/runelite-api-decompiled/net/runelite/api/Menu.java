/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.MenuEntry;

public interface Menu {
    public MenuEntry createMenuEntry(int var1);

    public MenuEntry[] getMenuEntries();

    public void setMenuEntries(MenuEntry[] var1);

    public void removeMenuEntry(MenuEntry var1);

    public int getMenuX();

    public int getMenuY();

    public int getMenuWidth();

    public int getMenuHeight();
}

