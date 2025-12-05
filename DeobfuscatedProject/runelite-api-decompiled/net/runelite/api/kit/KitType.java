/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.kit;

public enum KitType {
    HEAD("Head"),
    CAPE("Cape"),
    AMULET("Amulet"),
    WEAPON("Weapon"),
    TORSO("Torso"),
    SHIELD("Shield"),
    ARMS("Arms"),
    LEGS("Legs"),
    HAIR("Hair"),
    HANDS("Hands"),
    BOOTS("Boots"),
    JAW("Jaw");

    private final String name;

    public int getIndex() {
        return this.ordinal();
    }

    public String getName() {
        return this.name;
    }

    private KitType(String name) {
        this.name = name;
    }
}

