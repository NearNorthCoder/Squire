/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.mahoghomes.model;

import com.google.common.collect.ImmutableSet;
import gg.squire.mahoghomes.model.RequiredMaterials;
import gg.squire.mahoghomes.model.RequiredMaterialsByTier;
import java.util.stream.Stream;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public enum Home {
    JESS(new WorldArea(2611, 3290, 14, 7, 0), "Upstairs of the building south of the church in East Ardougne", 10421, new WorldPoint(2621, 3292, 0), RequiredMaterialsByTier.JESS, 17026, 16685),
    NOELLA(new WorldArea(2652, 3317, 15, 8, 0), "North of East Ardougne market", 10419, new WorldPoint(2659, 3322, 0), RequiredMaterialsByTier.NOELLA, 17026, 16685, 15645, 15648),
    ROSS(new WorldArea(2609, 3313, 11, 9, 0), "North of the church in East Ardougne", 10420, new WorldPoint(2613, 3316, 0), RequiredMaterialsByTier.ROSS, 16683, 16679),
    LARRY(new WorldArea(3033, 3360, 10, 9, 0), "North of the fountain in Falador", 10418, new WorldPoint(3038, 3364, 0), RequiredMaterialsByTier.LARRY, 24075, 24076),
    NORMAN(new WorldArea(3034, 3341, 8, 8, 0), "South of the fountain in Falador", 3266, new WorldPoint(3038, 3344, 0), RequiredMaterialsByTier.NORMAN, 24082, 24085),
    TAU(new WorldArea(3043, 3340, 10, 11, 0), "South east of the fountain in Falador", 10417, new WorldPoint(3047, 3345, 0), RequiredMaterialsByTier.TAU, new Integer[0]),
    BARBARA(new WorldArea(1746, 3531, 10, 11, 0), "South of Hosidius, near the mill", 10424, new WorldPoint(1750, 3534, 0), RequiredMaterialsByTier.BARBARA, new Integer[0]),
    LEELA(new WorldArea(1781, 3590, 9, 5, 0), "East of the town market in Hosidius", 10423, new WorldPoint(1785, 3592, 0), RequiredMaterialsByTier.LEELA, 11794, 11802),
    MARIAH(new WorldArea(1762, 3618, 10, 6, 0), "West of the estate agents in Hosidius", 10422, new WorldPoint(1766, 3621, 0), RequiredMaterialsByTier.MARIAH, 11794, 11802),
    BOB(new WorldArea(3234, 3482, 10, 10, 0), "North-east Varrock, opposite the church", 10414, new WorldPoint(3238, 3486, 0), RequiredMaterialsByTier.BOB, 11797, 11799),
    JEFF(new WorldArea(3236, 3446, 7, 10, 0), "Middle of Varrock, west of the museum", 10415, new WorldPoint(3239, 3450, 0), RequiredMaterialsByTier.JEFF, 11789, 11793),
    SARAH(new WorldArea(3233, 3382, 6, 5, 0), "Along the south wall of Varrock", 10416, new WorldPoint(3235, 3384, 0), RequiredMaterialsByTier.SARAH, new Integer[0]);

    private static final ImmutableSet<Integer> LADDERS;
    private final WorldArea area;
    private final String hint;
    private final int npcId;
    private final WorldPoint location;
    private final RequiredMaterialsByTier requiredMaterialsByTier;
    private final Integer[] ladders;

    private Home(WorldArea area, String hint, int npcId, WorldPoint location, RequiredMaterialsByTier requiredMaterialsByTier, Integer ... ladders) {
        this.area = area;
        this.hint = hint;
        this.npcId = npcId;
        this.location = location;
        this.requiredMaterialsByTier = requiredMaterialsByTier;
        this.ladders = ladders;
    }

    public static boolean isLadder(int objID) {
        return LADDERS.contains((Object)objID);
    }

    public RequiredMaterials getByTier(int tier) {
        return this.requiredMaterialsByTier.getByTier(tier);
    }

    public String getName() {
        return this.name().toLowerCase();
    }

    public int[] getLadderIds() {
        return Stream.of(this.ladders).mapToInt(Integer::intValue).toArray();
    }

    public WorldArea getArea() {
        return this.area;
    }

    public String getHint() {
        return this.hint;
    }

    public int getNpcId() {
        return this.npcId;
    }

    public WorldPoint getLocation() {
        return this.location;
    }

    public RequiredMaterialsByTier getRequiredMaterialsByTier() {
        return this.requiredMaterialsByTier;
    }

    public Integer[] getLadders() {
        return this.ladders;
    }

    static {
        ImmutableSet.Builder b = new ImmutableSet.Builder();
        for (Home h : Home.values()) {
            b.add((Object[])h.getLadders());
        }
        LADDERS = b.build();
    }
}

