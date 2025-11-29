/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package gg.squire.sepulchre.tasks;

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

public final class GameEnum10
extends Enum<I> {

    private  int height;
    private  int nextReq;
    public static final  /* enum */ I THUNDER_VII;
    public static final  /* enum */ I THUNDER_I;
    public static final  /* enum */ I THUNDER_III;
    private static final  I[] $VALUES;
    private  int width;
    public static final  /* enum */ I THUNDER_II;
    public static final  /* enum */ I THUNDER_VI;
    private  Supplier<WorldArea> area;
    private  RegionPoint regionStart;
    public static final  /* enum */ I THUNDER_V;
    public static final  /* enum */ I THUNDER_VIII;
    public static final  /* enum */ I THUNDER_IV;

    static {
        I.lIIIlIIlIlIlIIl();
        I.lIIIlIIlIlIlIII();
        THUNDER_I = new GameEnum10(new RegionPoint(lllIIIllIIlI[3], lllIIIllIIlI[4], lllIIIllIIlI[0], b.N), lllIIIllIIlI[5], lllIIIllIIlI[6]);
        THUNDER_II = new GameEnum10(new RegionPoint(lllIIIllIIlI[3], lllIIIllIIlI[7], lllIIIllIIlI[0], b.N), lllIIIllIIlI[5], lllIIIllIIlI[6]);
        THUNDER_III = new GameEnum10(new RegionPoint(lllIIIllIIlI[8], lllIIIllIIlI[9], lllIIIllIIlI[2], b.N), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_IV = new GameEnum10(new RegionPoint(lllIIIllIIlI[10], lllIIIllIIlI[9], lllIIIllIIlI[2], b.N), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_V = new GameEnum10(new RegionPoint(lllIIIllIIlI[12], lllIIIllIIlI[13], lllIIIllIIlI[0], b.N), lllIIIllIIlI[6], lllIIIllIIlI[5]);
        THUNDER_VI = new GameEnum10(new RegionPoint(lllIIIllIIlI[14], lllIIIllIIlI[13], lllIIIllIIlI[0], b.N), lllIIIllIIlI[6], lllIIIllIIlI[5]);
        THUNDER_VII = new GameEnum10(new RegionPoint(lllIIIllIIlI[8], lllIIIllIIlI[9], lllIIIllIIlI[1], b.L), lllIIIllIIlI[5], lllIIIllIIlI[5]);
        THUNDER_VIII = new GameEnum10(new RegionPoint(lllIIIllIIlI[10], lllIIIllIIlI[9], lllIIIllIIlI[1], b.L), lllIIIllIIlI[5], lllIIIllIIlI[5]);
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
        return Enum.valueOf(GameEnum10.class, string);
    }

    public Supplier<WorldArea> K() {
        return this.area;
    }

    private GameEnum10(RegionPoint regionPoint, int n3, int n4) {
        this.regionStart = regionPoint;
        this.width = n3;
        this.height = n4;
        this.area = () -> new WorldArea(SquireSepulchre.a(regionPoint), n3, n4);
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> aC() {
        void var2;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        System.out.println(I.values().length);
        I[] iArray = I.values();
        int n2 = iArray.length;
        int var3 = lllIIIllIIlI[0];
        while (I.lIIIlIIlIlIlIlI(var3, (int)var2)) {
            void var4;
            void var5;
            void var6 = var5[var3];
            var4.addAll(var6.aD());

            ++var3;

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

                }
            } else {
                bl = lllIIIllIIlI[0];
            }
            return bl;
        });

        return list;
    }

    private static void lIIIlIIlIlIlIII() {
        lllIIIlIlllI = new String[lllIIIllIIlI[17]];
        I.lllIIIlIlllI[I.lllIIIllIIlI[0]] = "THUNDER_I";
        I.lllIIIlIlllI[I.lllIIIllIIlI[2]] = "THUNDER_II";
        I.lllIIIlIlllI[I.lllIIIllIIlI[1]] = "THUNDER_III";
        I.lllIIIlIlllI[I.lllIIIllIIlI[5]] = "THUNDER_IV";
        I.lllIIIlIlllI[I.lllIIIllIIlI[11]] = "THUNDER_V";
        I.lllIIIlIlllI[I.lllIIIllIIlI[6]] = "THUNDER_VI";
        I.lllIIIlIlllI[I.lllIIIllIIlI[15]] = "THUNDER_VII";
        I.lllIIIlIlllI[I.lllIIIllIIlI[16]] = "THUNDER_VIII";
    }

    private static boolean lIIIlIIlIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }
}

