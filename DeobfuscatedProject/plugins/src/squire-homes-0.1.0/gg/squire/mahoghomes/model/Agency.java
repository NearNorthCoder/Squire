/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.mahoghomes.model;

import net.runelite.api.coords.WorldPoint;

public enum Agency {
    ELLIE("Ellie", new WorldPoint(2639, 3293, 0)),
    AMY("Amy", new WorldPoint(2990, 3365, 0)),
    MARLO("Marlo", new WorldPoint(3239, 3471, 0)),
    ANGELO("Angelo", new WorldPoint(1780, 3626, 0));

    private final WorldPoint location;
    private final String npc;

    private Agency(String npc, WorldPoint location) {
        this.npc = npc;
        this.location = location;
    }

    public static Agency getNearestTo(WorldPoint nearest) {
        Agency nearestAgency = null;
        float nearestDistance = 2.1474836E9f;
        for (Agency agency : Agency.values()) {
            float distance = agency.getLocation().distanceTo2DHypotenuse(nearest);
            if (!(distance < nearestDistance)) continue;
            nearestDistance = distance;
            nearestAgency = agency;
        }
        if (nearestDistance > 35.0f) {
            return AMY;
        }
        return nearestAgency;
    }

    public WorldPoint getLocation() {
        return this.location;
    }

    public String getNpc() {
        return this.npc;
    }
}

