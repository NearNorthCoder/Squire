/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class AEnum
extends Enum<a> {
    public static final /* synthetic */ /* enum */ a WEST;
    private final /* synthetic */ WorldPoint brazierStand;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ int[] lIlIllllIIIll;
    public static final /* synthetic */ /* enum */ a EAST;
    private static /* synthetic */ String[] lIlIllllIIIlI;
    private final /* synthetic */ WorldPoint treeStand;

    private static void llIIIIlIlIlllII() {
        lIlIllllIIIlI = new String[lIlIllllIIIll[6]];
        a.lIlIllllIIIlI[a.lIlIllllIIIll[0]] = a."WEST";
        a.lIlIllllIIIlI[a.lIlIllllIIIll[4]] = a."EAST";
    }

    private a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this.brazierStand = worldPoint2;
        this.treeStand = worldPoint;
    }

    private static void llIIIIlIlIlllIl() {
        lIlIllllIIIll = new int[8];
        a.lIlIllllIIIll[0] = (0xBA ^ 0x9C ^ (0xB5 ^ 0xAB)) & (0x2F ^ 0x1B ^ (2 ^ 0xE) ^ -1);
        a.lIlIllllIIIll[1] = -(0xFFFFFFBE & 0x11EB) & (0xFFFFDFFF & 0x37FF);
        a.lIlIllllIIIll[2] = -(0xFFFFFDEB & 0x4277) & (0xFFFFDFF6 & 0x6FFF);
        a.lIlIllllIIIll[3] = -(0xFFFFE2F7 & 0x5D6C) & (0xFFFFDFFF & 0x6FFF);
        a.lIlIllllIIIll[4] = 1;
        a.lIlIllllIIIll[5] = -(0xFFFFEFDB & 0x79BD) & (0xFFFFFFFF & 0x6FFE);
        a.lIlIllllIIIll[6] = 2;
        a.lIlIllllIIIll[7] = 15 + 4 - -77 + 108 ^ 85 + 94 - 110 + 127;
    }

    private static String llIIIIlIlIllIll(String var5, String var2) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIllllIIIll[7]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIlIllllIIIll[6], var3);
            return new String(var1.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    static {
        a.llIIIIlIlIlllIl();
        a.llIIIIlIlIlllII();
        WEST = new a(new WorldPoint(lIlIllllIIIll[1], lIlIllllIIIll[2], lIlIllllIIIll[0]), new WorldPoint(lIlIllllIIIll[1], lIlIllllIIIll[3], lIlIllllIIIll[0]));
        EAST = new a(new WorldPoint(lIlIllllIIIll[5], lIlIllllIIIll[2], lIlIllllIIIll[0]), new WorldPoint(lIlIllllIIIll[5], lIlIllllIIIll[3], lIlIllllIIIll[0]));
        a[] aArray = new a[lIlIllllIIIll[6]];
        aArray[a.lIlIllllIIIll[0]] = WEST;
        aArray[a.lIlIllllIIIll[4]] = EAST;
        $VALUES = aArray;
    }

    public WorldPoint b() {
        return this.brazierStand;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public WorldPoint c() {
        return this.treeStand;
    }
}

