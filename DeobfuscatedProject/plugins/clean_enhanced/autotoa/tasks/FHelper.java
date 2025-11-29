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

public class FHelper {
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
        f.var2();
        D = var1[0];
        F = var1[1];
        E = List.of(Integer.valueOf(var1[2]), Integer.valueOf(var1[3]));
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

    private static void var2() {
        var1 = new int[4];
        f.var1[0] = -(0xFFFFF7FB & 0x3A77) & (0xFFFFBEFF & 0x7BF7);
        f.var1[1] = 0xFFFFFFF7 & 0x2DDD;
        f.var1[2] = 0xFFFFFC8B & 0xBFF;
        f.var1[3] = -(0xFFFFE75C & 0x3CE7) & (0xFFFFACCF & Short.MAX_VALUE);
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

