package gg.squire.mahoghomes.model;

import net.runelite.api.coords.WorldPoint;
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/model/Agency.class */
public enum Agency {
    ELLIE("Ellie", new WorldPoint(2639, 3293, 0)),
    AMY("Amy", new WorldPoint(2990, 3365, 0)),
    MARLO("Marlo", new WorldPoint(3239, 3471, 0)),
    ANGELO("Angelo", new WorldPoint(1780, 3626, 0));
    
    private final WorldPoint location;
    private final String npc;

    public WorldPoint getLocation() {
        return this.location;
    }

    public String getNpc() {
        return this.npc;
    }

    Agency(String npc, WorldPoint location) {
        this.npc = npc;
        this.location = location;
    }

    public static Agency getNearestTo(WorldPoint nearest) {
        Agency[] values;
        Agency nearestAgency = null;
        float nearestDistance = 2.1474836E9f;
        for (Agency agency : values()) {
            float distance = agency.getLocation().distanceTo2DHypotenuse(nearest);
            if (distance < nearestDistance) {
                nearestDistance = distance;
                nearestAgency = agency;
            }
        }
        if (nearestDistance > 35.0f) {
            return AMY;
        }
        return nearestAgency;
    }
}
