/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.banktags;

import net.runelite.client.plugins.banktags.tabs.Layout;

public interface BankTag {
    public boolean contains(int var1);

    default public Layout layout() {
        return null;
    }
}

