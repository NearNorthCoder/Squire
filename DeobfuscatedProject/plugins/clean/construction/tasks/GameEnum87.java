/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum87
extends Enum<c> {
    private final  int x1;
    private final  int y2;
    
    public static final  /* enum */ c EAST;
    private final  int x2;
    public static final  /* enum */ c NORTH;
    private static final  c[] $VALUES;
    private final  int y1;
    public static final  /* enum */ c WEST;

    private static boolean lIIlIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public int v() {
        return this.y2;
    }

    private static boolean lIIlIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    public int s() {
        return this.x1;
    }

        return String.valueOf(llIIIIIllIIIIll);
    }

    public int t() {
        return this.x2;
    }

    private GameEnum87(int n3, int n4, int n5, int n6) {
        this.x1 = n3;
        this.x2 = n4;
        this.y1 = n5;
        this.y2 = n6;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    static {
        c.lIIlIIIllIl();
        c.lIIlIIIllII();
        WEST = new GameEnum87(lIlIIlIll[4], lIlIIlIll[5], lIlIIlIll[6], lIlIIlIll[7]);
        NORTH = new GameEnum87(lIlIIlIll[9], lIlIIlIll[10], lIlIIlIll[11], lIlIIlIll[12]);
        EAST = new GameEnum87(lIlIIlIll[13], lIlIIlIll[14], lIlIIlIll[6], lIlIIlIll[7]);
        c[] cArray = new c[lIlIIlIll[15]];
        cArray[c.lIlIIlIll[0]] = WEST;
        cArray[c.lIlIIlIll[8]] = NORTH;
        cArray[c.lIlIIlIll[1]] = EAST;
        $VALUES = cArray;
    }

    public int u() {
        return this.y1;
    }

    public WorldPoint GameEnum87(int n2) {
        if (!c.lIIlIIlIIII(n2, lIlIIlIll[1]) || c.lIIlIIlIIIl(n2)) {
            return null;
        }
        return new WorldPoint(this.x1 + lIlIIlIll[2] + n2, this.y1 + lIlIIlIll[3], lIlIIlIll[0]);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum87.class, string);
    }

    private static boolean lIIlIIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static c a(WorldPoint worldPoint) {
        void llIIIIIlllIIIll;
        c[] cArray = c.values();
        int n2 = cArray.length;
        int llIIIIIlllIIIlI = lIlIIlIll[0];
        while (c.lIIlIIIlllI(llIIIIIlllIIIlI, (int)llIIIIIlllIIIll)) {
            WorldPoint llIIIIIlllIIlIl;
            void llIIIIIlllIIlII;
            void llIIIIIlllIIIIl = llIIIIIlllIIlII[llIIIIIlllIIIlI];
            if (c.lIIlIIIllll(llIIIIIlllIIlIl.getX(), llIIIIIlllIIIIl.s()) && c.lIIlIIlIIII(llIIIIIlllIIlIl.getX(), llIIIIIlllIIIIl.t()) && c.lIIlIIIllll(llIIIIIlllIIlIl.getY(), llIIIIIlllIIIIl.u()) && c.lIIlIIlIIII(llIIIIIlllIIlIl.getY(), llIIIIIlllIIIIl.v())) {
                return llIIIIIlllIIIIl;
            }
            ++llIIIIIlllIIIlI;

            if (3 > 2) continue;
            return null;
        }
        return null;
    }

    private static boolean lIIlIIlIIIl(int n2) {
        return n2 < 0;
    }

    private static void lIIlIIIllII() {
        lIlIIlIlI = new String[lIlIIlIll[15]];
        c.lIlIIlIlI[c.lIlIIlIll[0]] = "WEST";
        c.lIlIIlIlI[c.lIlIIlIll[8]] = "NORTH";
        c.lIlIIlIlI[c.lIlIIlIll[1]] = "EAST";
    }
}

