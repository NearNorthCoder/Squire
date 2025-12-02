/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 */
package net.unethicalite.api.game;

import net.runelite.api.TileObject;

public static enum House.Pool {
    RESTORATION("restoration", true, false, false, false, false),
    REVITALISATION("revitalisation", true, true, false, false, false),
    REJUVENATION("rejuvenation", true, false, false, false, false),
    FANCY_REJUVENATION("fancy pool", true, true, true, true, false),
    ORNATE_REJUVENATION("ornate pool", true, true, true, true, true);

    private final String name;
    private final boolean restoreSpecialAttack;
    private final boolean restoreEnergy;
    private final boolean restorePrayer;
    private final boolean restoreStats;
    private final boolean restoreHealth;

    private House.Pool(String name, boolean restoreSpecialAttack, boolean restoreEnergy, boolean restorePrayer, boolean restoreStats, boolean restoreHealth) {
        this.name = name;
        this.restoreSpecialAttack = restoreSpecialAttack;
        this.restoreEnergy = restoreEnergy;
        this.restorePrayer = restorePrayer;
        this.restoreStats = restoreStats;
        this.restoreHealth = restoreHealth;
    }

    public static House.Pool forObject(TileObject tileObject) {
        if (tileObject == null) {
            return null;
        }
        House.Pool[] values = House.Pool.values();
        for (int i = values.length - 1; i >= 0; --i) {
            House.Pool pool = values[i];
            if (!tileObject.getName().toLowerCase().contains(pool.getName())) continue;
            return pool;
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public boolean isRestoreSpecialAttack() {
        return this.restoreSpecialAttack;
    }

    public boolean isRestoreEnergy() {
        return this.restoreEnergy;
    }

    public boolean isRestorePrayer() {
        return this.restorePrayer;
    }

    public boolean isRestoreStats() {
        return this.restoreStats;
    }

    public boolean isRestoreHealth() {
        return this.restoreHealth;
    }
}
