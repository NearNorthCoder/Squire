/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  javax.annotation.Nullable
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.mahoghomes.model;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import javax.annotation.Nullable;
import net.unethicalite.api.game.Vars;

public enum Hotspot {
    MAHOGANY_HOMES_HOTSPOT_1(10554, (ImmutableSet<Integer>)ImmutableSet.of((Object)39981, (Object)39989, (Object)39997, (Object)40002, (Object)40007, (Object)40011, (Object[])new Integer[]{40083, 40156, 40164, 40171, 40296, 40297})),
    MAHOGANY_HOMES_HOTSPOT_2(10555, (ImmutableSet<Integer>)ImmutableSet.of((Object)39982, (Object)39990, (Object)39998, (Object)40008, (Object)40084, (Object)40089, (Object[])new Integer[]{40095, 40157, 40165, 40172, 40287, 40293})),
    MAHOGANY_HOMES_HOTSPOT_3(10556, (ImmutableSet<Integer>)ImmutableSet.of((Object)39983, (Object)39991, (Object)39999, (Object)40003, (Object)40012, (Object)40085, (Object[])new Integer[]{40090, 40096, 40151, 40158, 40166, 40173, 40290})),
    MAHOGANY_HOMES_HOTSPOT_4(10557, (ImmutableSet<Integer>)ImmutableSet.of((Object)39984, (Object)39992, (Object)40000, (Object)40086, (Object)40091, (Object)40097, (Object[])new Integer[]{40159, 40167, 40174, 40288, 40291, 40294})),
    MAHOGANY_HOMES_HOTSPOT_5(10558, (ImmutableSet<Integer>)ImmutableSet.of((Object)39985, (Object)39993, (Object)40004, (Object)40009, (Object)40013, (Object)40087, (Object[])new Integer[]{40092, 40160, 40168, 40175, 40286, 40298})),
    MAHOGANY_HOMES_HOTSPOT_6(10559, (ImmutableSet<Integer>)ImmutableSet.of((Object)39986, (Object)39994, (Object)40001, (Object)40005, (Object)40010, (Object)40014, (Object[])new Integer[]{40088, 40093, 40098, 40161, 40169, 40176})),
    MAHOGANY_HOMES_HOTSPOT_7(10560, (ImmutableSet<Integer>)ImmutableSet.of((Object)39987, (Object)39995, (Object)40006, (Object)40015, (Object)40094, (Object)40099, (Object[])new Integer[]{40162, 40170, 40177, 40292, 40295})),
    MAHOGANY_HOMES_HOTSPOT_8(10561, (ImmutableSet<Integer>)ImmutableSet.of((Object)39988, (Object)39996, (Object)40163, (Object)40289, (Object)40299));

    private static final ImmutableMap<Integer, Hotspot> HOTSPOT_BY_OBJECT_ID;
    private final int varb;
    private final ImmutableSet<Integer> objectIds;

    @Nullable
    public static Hotspot getByObjectId(int objectId) {
        return (Hotspot)((Object)HOTSPOT_BY_OBJECT_ID.get((Object)objectId));
    }

    public static boolean requiresAttention(int objectId) {
        Hotspot match = Hotspot.getByObjectId(objectId);
        if (match == null) {
            return false;
        }
        int val = Vars.getBit((int)match.getVarb());
        return val == 1 || val == 3 || val == 4;
    }

    public static boolean isHotspotObject(int id) {
        return HOTSPOT_BY_OBJECT_ID.containsKey((Object)id);
    }

    public ImmutableSet<Integer> getObjectIds() {
        return this.objectIds;
    }

    private Hotspot(int varb, ImmutableSet<Integer> objectIds) {
        this.varb = varb;
        this.objectIds = objectIds;
    }

    public int getVarb() {
        return this.varb;
    }

    static {
        ImmutableMap.Builder objects = new ImmutableMap.Builder();
        for (Hotspot hotspot : Hotspot.values()) {
            hotspot.getObjectIds().forEach(id -> objects.put(id, (Object)hotspot));
        }
        HOTSPOT_BY_OBJECT_ID = objects.build();
    }
}

