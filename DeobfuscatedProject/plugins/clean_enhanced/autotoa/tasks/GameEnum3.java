/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package gg.squire.autotoa.tasks;

import java.util.Collection;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class GameEnum3
extends Enum<n> {
    public static final  /* enum */ n FIRE;
    
    private final  int regionX;
    private static final  n[] $VALUES;
    public static final  /* enum */ n DEATH;
    private final  int regionY;
    
    public static final  /* enum */ n LIGHTNING;
    private final  int objectId;
    public static final  /* enum */ n AIR;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private GameEnum3(int n3, int n4, int n5) {
        this.objectId = n3;
        this.regionX = n4;
        this.regionY = n5;
    }

    private static void var9() {
        var1 = new String[var2[14]];
        n.var1[n.var2[0]] = "DEATH";
        n.var1[n.var2[2]] = "FIRE";
        n.var1[n.var2[9]] = "LIGHTNING";
        n.var1[n.var2[12]] = "AIR";
    }

    /*
     * WARNING - void declaration
     */
    public static n e(int n2) {
        void var10;
        n[] nArray = n.values();
        int n3 = nArray.length;
        int var11 = var2[0];
        while (n.var12(var11, (int)var10)) {
            int var13;
            void var14;
            void var15 = var14[var11];
            if (n.var16(var15.L(), var13)) {
                return var15;
            }
            ++var11;
            0;
            if (3 == 3) continue;
            return null;
        }
        return null;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    private static void var24() {
        var2 = new int[16];
        n.var2[0] = (0xE9 ^ 0xB5 ^ (0x83 ^ 0xC6)) & (78 + 59 - 58 + 97 ^ 76 + 44 - 1 + 50 ^ -1);
        n.var2[1] = 0xFFFFFFFF & Integer.MAX_VALUE;
        n.var2[2] = 1;
        n.var2[3] = -(0xFFFFE0FF & 0x5F24) & (0xFFFFFF7F & 0x79F7);
        n.var2[4] = 0xFFFFFBAF & 0xB77F;
        n.var2[5] = 0xA8 ^ 0x93 ^ (0x55 ^ 0x4C);
        n.var2[6] = 0x7B ^ 0x5A;
        n.var2[7] = 0xFFFFBBED & 0xF73E;
        n.var2[8] = 0x70 ^ 0x6F;
        n.var2[9] = 2;
        n.var2[10] = -(0xFFFFE8CF & 0x1FB3) & (0xFFFFFFBF & 0xBBEF);
        n.var2[11] = 4 ^ 0x2A ^ (0x12 ^ 0x22);
        n.var2[12] = 3;
        n.var2[13] = 0xFFFFF36E & 0xBFBF;
        n.var2[14] = 0x7B ^ 0x23 ^ (0x72 ^ 0x2E);
        n.var2[15] = 71 + 51 - 10 + 94 ^ 138 + 142 - 186 + 104;
    }

    static {
        n.var24();
        n.var9();
        DEATH = new GameEnum3(var2[4], var2[5], var2[6]);
        FIRE = new GameEnum3(var2[7], var2[8], var2[6]);
        LIGHTNING = new GameEnum3(var2[10], var2[5], var2[11]);
        AIR = new GameEnum3(var2[13], var2[8], var2[11]);
        n[] nArray = new n[var2[14]];
        nArray[n.var2[0]] = DEATH;
        nArray[n.var2[2]] = FIRE;
        nArray[n.var2[9]] = LIGHTNING;
        nArray[n.var2[12]] = AIR;
        $VALUES = nArray;
    }

    private static boolean var16(int n2, int n3) {
        return n2 == n3;
    }

    public int L() {
        return this.objectId;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static n a(Client client, WorldPoint worldPoint) {
        void var25;
        n n2 = null;
        int n3 = var2[1];
        n[] nArray = n.values();
        int n4 = nArray.length;
        int var26 = var2[0];
        while (n.var12(var26, (int)var25)) {
            Client var27;
            void var28;
            void var29 = var28[var26];
            WorldPoint var30 = var29.a(var27);
            if (n.var23(var30)) {
                0;
                if (1 == ((0xCF ^ 0x9E) & ~(0xC4 ^ 0x95))) {
                    return null;
                }
            } else {
                int var31;
                void var32;
                int var33 = var30.distanceTo((WorldPoint)var32);
                if (n.var12(var33, var31)) {
                    void var34 = var29;
                    var31 = var33;
                }
            }
            ++var26;
            0;
            if null == null continue;
            return null;
        }
        return n2;
    }

    public WorldPoint a(Client client) {
        RegionPoint regionPoint = new RegionPoint(this.regionX, this.regionY, var2[2], var2[3]);
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld());
        return collection.stream().findFirst().orElse(null);
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }
}

