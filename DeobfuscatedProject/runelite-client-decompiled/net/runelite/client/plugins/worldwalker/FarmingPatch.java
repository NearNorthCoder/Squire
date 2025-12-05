/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.worldwalker;

import net.runelite.client.plugins.timetracking.farming.PatchImplementation;
import net.runelite.client.plugins.worldwalker.FarmingRegion;

class FarmingPatch {
    private FarmingRegion region;
    private final String name;
    private final int varbit;
    private final PatchImplementation implementation;

    String configKey() {
        return this.region.getRegionID() + "." + this.varbit;
    }

    String notifyConfigKey() {
        return "notify." + this.region.getRegionID() + "." + this.varbit;
    }

    FarmingPatch(String name, int varbit, PatchImplementation implementation) {
        this.name = name;
        this.varbit = varbit;
        this.implementation = implementation;
    }

    public FarmingRegion getRegion() {
        return this.region;
    }

    public String getName() {
        return this.name;
    }

    public PatchImplementation getImplementation() {
        return this.implementation;
    }

    void setRegion(FarmingRegion region) {
        this.region = region;
    }

    public int getVarbit() {
        return this.varbit;
    }
}

