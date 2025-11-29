/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.autotoa.tasks;

import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

public class f {
    private static  List<NPC> I;
    public static final  int F;
    public static final  int D;
    private static  List<NPC> J;
    private static  WorldPoint H;
    private static  WorldPoint G;
    
    public static final  List<Integer> E;

    public static void a(List<NPC> list) {
        I = list;
    }

    public static WorldPoint s() {
        return G;
    }

    static {
        f.lIIlIllIIIIIll();
        D = lIllIIlIlII[0];
        F = lIllIIlIlII[1];
        E = List.of(Integer.valueOf(lIllIIlIlII[2]), Integer.valueOf(lIllIIlIlII[3]));
    }

    public static void b(List<NPC> list) {
        J = list;
    }

    public static WorldPoint t() {
        return H;
    }

    public static List<NPC> u() {
        return I;
    }

    public static void a(WorldPoint worldPoint) {
        G = worldPoint;
    }

    public static List<NPC> v() {
        return J;
    }

    public static void b(WorldPoint worldPoint) {
        H = worldPoint;
    }

    public static void r() {
        G = null;
        H = null;
        I = null;
        J = null;
    }
}

