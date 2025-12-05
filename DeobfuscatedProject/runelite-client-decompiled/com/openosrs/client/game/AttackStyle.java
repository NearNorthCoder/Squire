/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package com.openosrs.client.game;

import java.awt.Color;
import net.runelite.api.Prayer;

public enum AttackStyle {
    MAGE("Mage", Color.CYAN, Prayer.PROTECT_FROM_MAGIC),
    RANGE("Range", Color.GREEN, Prayer.PROTECT_FROM_MISSILES),
    MELEE("Melee", Color.RED, Prayer.PROTECT_FROM_MELEE),
    UNKNOWN("Unknown", Color.WHITE, null);

    private String name;
    private Color color;
    private Prayer prayer;

    private AttackStyle(String name, Color color, Prayer prayer) {
        this.name = name;
        this.color = color;
        this.prayer = prayer;
    }

    public String getName() {
        return this.name;
    }

    public Color getColor() {
        return this.color;
    }

    public Prayer getPrayer() {
        return this.prayer;
    }
}

