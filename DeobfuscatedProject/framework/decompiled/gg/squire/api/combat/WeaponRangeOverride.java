/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.api.combat;

public enum WeaponRangeOverride {
    SHORTBOW("shortbow", 7, 9),
    COMPOSITE_BOW("comp bow", 10, 10),
    LONGBOW("longbow", 9, 10),
    CROSSBOW("crossbow", 7, 9),
    BALLISTA("ballista", 9, 10),
    KNIFE("knife", 4, 6),
    DART("dart", 3, 5),
    CRYSTAL_BOW("crystal", 10, 10),
    DARK_BOW("dark bow", 10, 10),
    CHINCHOMPA("chinchompa", 9, 10),
    THROWING_AXE("throwing axe", 4, 6),
    SEERCULL("seercull", 8, 10),
    DORGESHUUN("dorgeshuun", 6, 8),
    COMP_OGRE("comp ogre", 5, 7),
    BLOWPIPE("blowpipe", 5, 7),
    THIRD_AGE_BOW("3rd age", 9, 10),
    TWISTED_BOW("twisted bow", 10, 10);

    private final String name;
    private final int shortRange;
    private final int longRange;

    private WeaponRangeOverride(String name, int shortRange, int longRange) {
        this.name = name;
        this.shortRange = shortRange;
        this.longRange = longRange;
    }

    public static WeaponRangeOverride forWeaponName(String name) {
        for (WeaponRangeOverride wro : WeaponRangeOverride.values()) {
            if (!name.toLowerCase().contains(wro.name)) continue;
            return wro;
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public int getShortRange() {
        return this.shortRange;
    }

    public int getLongRange() {
        return this.longRange;
    }
}
