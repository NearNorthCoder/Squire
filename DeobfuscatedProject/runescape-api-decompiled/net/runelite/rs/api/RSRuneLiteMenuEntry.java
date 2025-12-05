/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MenuEntry
 */
package net.runelite.rs.api;

import java.util.function.Consumer;
import net.runelite.api.MenuEntry;

public interface RSRuneLiteMenuEntry
extends MenuEntry {
    public Consumer getConsumer();

    public void setConsumer(Consumer var1);

    public int getIdx();

    public void setIdx(int var1);
}

