/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class GameEnum29
extends Enum<n> {
    public static final  /* enum */ n FIRE;
    
    private final  int regionX;
    private static final  n[] $VALUES;
    public static final  /* enum */ n DEATH;
    private final  int regionY;
    
    public static final  /* enum */ n LIGHTNING;
    private final  int objectId;
    public static final  /* enum */ n AIR;

    private GameEnum29(int n3, int n4, int n5) {
        this.objectId = n3;
        this.regionX = n4;
        this.regionY = n5;
    }

    private static void lIIllIIlIIlIII() {
        lIlllIIlllI = new String[lIlllIIllll[14]];
        n.lIlllIIlllI[n.lIlllIIllll[0]] = "DEATH";
        n.lIlllIIlllI[n.lIlllIIllll[2]] = "FIRE";
        n.lIlllIIlllI[n.lIlllIIllll[9]] = "LIGHTNING";
        n.lIlllIIlllI[n.lIlllIIllll[12]] = "AIR";
    }

    /*
     * WARNING - void declaration
     */
    public static n e(int n2) {
        void var1;
        n[] nArray = n.values();
        int n3 = nArray.length;
        int var2 = lIlllIIllll[0];
        while (n.lIIllIIlIIlIlI(var2, (int)var1)) {
            int var3;
            void var4;
            void var5 = var4[var2];
            if (n.lIIllIIlIIlIll(var5.L(), var3)) {
                return var5;
            }
            ++var2;

            if (3 == 3) continue;
            return null;
        }
        return null;
    }

    private static boolean lIIllIIlIIllII(Object object) {
        return object == null;
    }

    static {
        n.lIIllIIlIIlIIl();
        n.lIIllIIlIIlIII();
        DEATH = new GameEnum29(lIlllIIllll[4], lIlllIIllll[5], lIlllIIllll[6]);
        FIRE = new GameEnum29(lIlllIIllll[7], lIlllIIllll[8], lIlllIIllll[6]);
        LIGHTNING = new GameEnum29(lIlllIIllll[10], lIlllIIllll[5], lIlllIIllll[11]);
        AIR = new GameEnum29(lIlllIIllll[13], lIlllIIllll[8], lIlllIIllll[11]);
        n[] nArray = new n[lIlllIIllll[14]];
        nArray[n.lIlllIIllll[0]] = DEATH;
        nArray[n.lIlllIIllll[2]] = FIRE;
        nArray[n.lIlllIIllll[9]] = LIGHTNING;
        nArray[n.lIlllIIllll[12]] = AIR;
        $VALUES = nArray;
    }

    private static boolean lIIllIIlIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    public int L() {
        return this.objectId;
    }

    private static boolean lIIllIIlIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static n a(Client client, WorldPoint worldPoint) {
        void var6;
        n n2 = null;
        int n3 = lIlllIIllll[1];
        n[] nArray = n.values();
        int n4 = nArray.length;
        int var7 = lIlllIIllll[0];
        while (n.lIIllIIlIIlIlI(var7, (int)var6)) {
            Client var8;
            void var9;
            void var10 = var9[var7];
            WorldPoint var11 = var10.a(var8);
            if (n.lIIllIIlIIllII(var11)) {

                if (1 == ((0xCF ^ 0x9E) & ~(0xC4 ^ 0x95))) {
                    return null;
                }
            } else {
                int var12;
                void var13;
                int var14 = var11.distanceTo((WorldPoint)var13);
                if (n.lIIllIIlIIlIlI(var14, var12)) {
                    void var15 = var10;
                    var12 = var14;
                }
            }
            ++var7;

            return null;
        }
        return n2;
    }

    public WorldPoint a(Client client) {
        RegionPoint regionPoint = new RegionPoint(this.regionX, this.regionY, lIlllIIllll[2], lIlllIIllll[3]);
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld());
        return collection.stream().findFirst().orElse(null);
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum29.class, string);
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }
}

