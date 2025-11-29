/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class I
extends Enum<I> {
    private static /* synthetic */ int[] lllIIIllIIlI;
    private static /* synthetic */ String[] lllIIIlIlllI;
    private /* synthetic */ int height;
    private /* synthetic */ int nextReq;
    public static final /* synthetic */ /* enum */ I THUNDER_VII;
    public static final /* synthetic */ /* enum */ I THUNDER_I;
    public static final /* synthetic */ /* enum */ I THUNDER_III;
    private static final /* synthetic */ I[] $VALUES;
    private /* synthetic */ int width;
    public static final /* synthetic */ /* enum */ I THUNDER_II;
    public static final /* synthetic */ /* enum */ I THUNDER_VI;
    private /* synthetic */ Supplier<WorldArea> area;
    private /* synthetic */ RegionPoint regionStart;
    public static final /* synthetic */ /* enum */ I THUNDER_V;
    public static final /* synthetic */ /* enum */ I THUNDER_VIII;
    public static final /* synthetic */ /* enum */ I THUNDER_IV;

    static {
        I.lIIIlIIlIlIlIIl();
        I.lIIIlIIlIlIlIII();
        THUNDER_I = new I(new RegionPoint(lllIIIllIIlI[3], lllIIIllIIlI[4], lllIIIllIIlI[0], b.N), lllIIIllIIlI[5], lllIIIllIIlI[6]);
        THUNDER_II = new I(new RegionPoint(lllIIIllIIlI[3], lllIIIllIIlI[7], lllIIIllIIlI[0], b.N), lllIIIllIIlI[5], lllIIIllIIlI[6]);
        THUNDER_III = new I(new RegionPoint(lllIIIllIIlI[8], lllIIIllIIlI[9], lllIIIllIIlI[2], b.N), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_IV = new I(new RegionPoint(lllIIIllIIlI[10], lllIIIllIIlI[9], lllIIIllIIlI[2], b.N), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_V = new I(new RegionPoint(lllIIIllIIlI[12], lllIIIllIIlI[13], lllIIIllIIlI[0], b.N), lllIIIllIIlI[6], lllIIIllIIlI[5]);
        THUNDER_VI = new I(new RegionPoint(lllIIIllIIlI[14], lllIIIllIIlI[13], lllIIIllIIlI[0], b.N), lllIIIllIIlI[6], lllIIIllIIlI[5]);
        THUNDER_VII = new I(new RegionPoint(lllIIIllIIlI[8], lllIIIllIIlI[9], lllIIIllIIlI[1], b.L), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_VIII = new I(new RegionPoint(lllIIIllIIlI[10], lllIIIllIIlI[9], lllIIIllIIlI[1], b.L), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        I[] iArray = new I[lllIIIllIIlI[17]];
        iArray[I.lllIIIllIIlI[0]] = THUNDER_I;
        iArray[I.lllIIIllIIlI[2]] = THUNDER_II;
        iArray[I.lllIIIllIIlI[1]] = THUNDER_III;
        iArray[I.lllIIIllIIlI[5]] = THUNDER_IV;
        iArray[I.lllIIIllIIlI[11]] = THUNDER_V;
        iArray[I.lllIIIllIIlI[6]] = THUNDER_VI;
        iArray[I.lllIIIllIIlI[15]] = THUNDER_VII;
        iArray[I.lllIIIllIIlI[16]] = THUNDER_VIII;
        $VALUES = iArray;
    }

    public static I[] values() {
        return (I[])$VALUES.clone();
    }

    private static boolean lIIIlIIlIlIlIll(int n2) {
        return n2 != 0;
    }

    public static I valueOf(String string) {
        return Enum.valueOf(I.class, string);
    }

    private static void lIIIlIIlIlIlIIl() {
        lllIIIllIIlI = new int[18];
        I.lllIIIllIIlI[0] = (0x30 ^ 0x3D ^ (0x5C ^ 0x63)) & (37 + 142 - 82 + 56 ^ 104 + 81 - 83 + 69 ^ -1);
        I.lllIIIllIIlI[1] = 2;
        I.lllIIIllIIlI[2] = 1;
        I.lllIIIllIIlI[3] = 0xA ^ 0x3D ^ (0xC ^ 3);
        I.lllIIIllIIlI[4] = 106 + 85 - 145 + 103 ^ 134 + 110 - 243 + 152;
        I.lllIIIllIIlI[5] = 3;
        I.lllIIIllIIlI[6] = 0xE ^ 0x3A ^ (0x6E ^ 0x5F);
        I.lllIIIllIIlI[7] = 0x90 ^ 0xA5 ^ (0x94 ^ 0x82);
        I.lllIIIllIIlI[8] = 0x62 ^ 0x7C ^ (2 ^ 0x3A);
        I.lllIIIllIIlI[9] = 0x3A ^ 0x59 ^ (0x2C ^ 0x62);
        I.lllIIIllIIlI[10] = 0x44 ^ 0x3C ^ (0xF7 ^ 0xA1);
        I.lllIIIllIIlI[11] = 0x8F ^ 0x8B;
        I.lllIIIllIIlI[12] = 129 + 3 - 114 + 137 ^ 91 + 76 - 88 + 109;
        I.lllIIIllIIlI[13] = 4 ^ 0x24 ^ (0x3E ^ 0x2D);
        I.lllIIIllIIlI[14] = 14 + 147 - 72 + 87 ^ 116 + 52 - 140 + 137;
        I.lllIIIllIIlI[15] = 103 + 16 - 93 + 152 ^ 14 + 10 - -117 + 39;
        I.lllIIIllIIlI[16] = 0x39 ^ 0x20 ^ (0xAD ^ 0xB3);
        I.lllIIIllIIlI[17] = 128 + 6 - 91 + 126 ^ 112 + 98 - 169 + 120;
    }

    public Supplier<WorldArea> K() {
        return this.area;
    }

    private I(RegionPoint regionPoint, int n3, int n4) {
        this.regionStart = regionPoint;
        this.width = n3;
        this.height = n4;
        this.area = () -> new WorldArea(SquireSepulchre.a(regionPoint), n3, n4);
    }

    private static String lIIIlIIlIIlllII(String var11, String var9) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lllIIIllIIlI[1], var23);
            return new String(var19.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIlIIllIll(String var7, String var1) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var20 = var1.toCharArray();
        int var12 = lllIIIllIIlI[0];
        char[] var10 = var7.toCharArray();
        int var6 = var10.length;
        int var16 = lllIIIllIIlI[0];
        while (I.lIIIlIIlIlIlIlI(var16, var6)) {
            char var13 = var10[var16];
            var14.append((char)(var13 ^ var20[var12 % var20.length]));
            0;
            ++var12;
            ++var16;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> aC() {
        void var21;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        System.out.println(I.values().length);
        I[] iArray = I.values();
        int n2 = iArray.length;
        int var22 = lllIIIllIIlI[0];
        while (I.lIIIlIIlIlIlIlI(var22, (int)var21)) {
            void var8;
            void var4;
            void var17 = var4[var22];
            var8.addAll(var17.aD());
            0;
            ++var22;
            0;
            if ((0x4B ^ 0xA ^ (0xCB ^ 0x8E)) > 1) continue;
            return null;
        }
        return arrayList;
    }

    private List<WorldPoint> aD() {
        WorldArea worldArea = this.area.get();
        List list = worldArea.toWorldPointList();
        list.removeIf(worldPoint -> {
            boolean bl;
            int n2 = Math.abs(worldPoint.getWorldY() - worldArea.getY());
            int n3 = Math.abs(worldPoint.getWorldX() - worldArea.getX());
            if (I.lIIIlIIlIlIlIll((n3 + n2) % lllIIIllIIlI[1])) {
                bl = lllIIIllIIlI[2];
                0;
                
                }
            } else {
                bl = lllIIIllIIlI[0];
            }
            return bl;
        });
        0;
        return list;
    }

    private static String lIIIlIIlIIllllI(String var5, String var24) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), lllIIIllIIlI[17]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllIIIllIIlI[1], var18);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIlIlIlIII() {
        lllIIIlIlllI = new String[lllIIIllIIlI[17]];
        I.lllIIIlIlllI[I.lllIIIllIIlI[0]] = I."THUNDER_I";
        I.lllIIIlIlllI[I.lllIIIllIIlI[2]] = I."THUNDER_II";
        I.lllIIIlIlllI[I.lllIIIllIIlI[1]] = I."THUNDER_III";
        I.lllIIIlIlllI[I.lllIIIllIIlI[5]] = I."THUNDER_IV";
        I.lllIIIlIlllI[I.lllIIIllIIlI[11]] = I."THUNDER_V";
        I.lllIIIlIlllI[I.lllIIIllIIlI[6]] = I."THUNDER_VI";
        I.lllIIIlIlllI[I.lllIIIllIIlI[15]] = I."THUNDER_VII";
        I.lllIIIlIlllI[I.lllIIIllIIlI[16]] = I."THUNDER_VIII";
    }

    private static boolean lIIIlIIlIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }
}

