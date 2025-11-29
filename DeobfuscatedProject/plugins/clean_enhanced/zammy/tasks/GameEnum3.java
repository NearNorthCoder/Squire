/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 */
package gg.squire.zammy.tasks;

import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;

public final class GameEnum3
extends Enum<e> {
    public static final  /* enum */ e TSTANON_KARLAK;
    private final  int id;
    public static final  /* enum */ e BALFRUG_KREEYATH;
    
    private final  int projectile;
    private static final  e[] $VALUES;
    
    private final  int animation;
    public static final  /* enum */ e ZAKLN_GRITCH;
    private final  Prayer protection;

    private GameEnum3(int n3, Prayer prayer, int n4, int n5) {
        this.id = n3;
        this.protection = prayer;
        this.projectile = n4;
        this.animation = n5;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public int p() {
        return this.projectile;
    }

    static {
        e.var9();
        e.var10();
        TSTANON_KARLAK = new GameEnum3(1, Prayer.PROTECT_FROM_MELEE, 2, 3);
        BALFRUG_KREEYATH = new GameEnum3(5, Prayer.PROTECT_FROM_MAGIC, 6, 7);
        ZAKLN_GRITCH = new GameEnum3(9, Prayer.PROTECT_FROM_MISSILES, var1[10], var1[11]);
        e[] eArray = new e[var1[12]];
        eArray[0] = TSTANON_KARLAK;
        eArray[4] = BALFRUG_KREEYATH;
        eArray[8] = ZAKLN_GRITCH;
        $VALUES = eArray;
    }

    /*
     * WARNING - void declaration
     */
    public static e a(Projectile projectile) {
        void var11;
        e[] eArray = e.values();
        int n2 = eArray.length;
        int var12 = 0;
        while ((var12 < (int)var11)) {
            Projectile var13;
            void var14;
            void var15 = var14[var12];
            if ((var15.p() == var13.getId())) {
                return var15;
            }
            ++var12;
            0;
            if ((0x4E ^ 0x4A) >= -1) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static e a(NPC nPC) {
        void var16;
        e[] eArray = e.values();
        int n2 = eArray.length;
        int var17 = 0;
        while ((var17 < (int)var16)) {
            NPC var18;
            void var19;
            void var20 = var19[var17];
            if ((var20.n() == var18.getId())) {
                return var20;
            }
            ++var17;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return null;
    }

    public int q() {
        return this.animation;
    }

    public Prayer o() {
        return this.protection;
    }

    public int n() {
        return this.id;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }
}

