/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class at
extends Enum<at>
implements aw {
    public static final /* synthetic */ /* enum */ at IRIT;
    public static final /* synthetic */ /* enum */ at TARROMIN;
    public static final /* synthetic */ /* enum */ at DEFAULT;
    private static final /* synthetic */ at[] $VALUES;
    private static /* synthetic */ int[] llIIIIlIllll;
    public static final /* synthetic */ /* enum */ at DWARF_WEED;
    private static /* synthetic */ String[] llIIIIlIlllI;
    public static final /* synthetic */ /* enum */ at TORSTOL;
    public static final /* synthetic */ /* enum */ at AVANTOE;
    public static final /* synthetic */ /* enum */ at LANTADYME;
    private final /* synthetic */ av produceSeed;
    public static final /* synthetic */ /* enum */ at CADANTINE;
    public static final /* synthetic */ /* enum */ at KWUARM;
    public static final /* synthetic */ /* enum */ at GUAM;
    public static final /* synthetic */ /* enum */ at TOADFLAX;
    public static final /* synthetic */ /* enum */ at RANARR;
    public static final /* synthetic */ /* enum */ at SNAPDRAGON;
    public static final /* synthetic */ /* enum */ at NOTHING;
    public static final /* synthetic */ /* enum */ at HARRALANDER;

    public static at[] values() {
        return (at[])$VALUES.clone();
    }

    static {
        at.llllIIlIllIlIl();
        at.llllIIlIllIlII();
        NOTHING = new at(null);
        DEFAULT = new at(av.DEFAULT);
        GUAM = new at(av.GUAM);
        TARROMIN = new at(av.TARROMIN);
        HARRALANDER = new at(av.HARRALANDER);
        RANARR = new at(av.RANNAR_WEED);
        SNAPDRAGON = new at(av.SNAPDRAGON);
        TOADFLAX = new at(av.TOADFLAX);
        IRIT = new at(av.IRIT);
        CADANTINE = new at(av.CADANTINE);
        LANTADYME = new at(av.LANTADYME);
        DWARF_WEED = new at(av.DWARF_WEED);
        TORSTOL = new at(av.TORSTOL);
        AVANTOE = new at(av.AVANTOE);
        KWUARM = new at(av.KWUARM);
        at[] atArray = new at[llIIIIlIllll[15]];
        atArray[at.llIIIIlIllll[0]] = NOTHING;
        atArray[at.llIIIIlIllll[1]] = DEFAULT;
        atArray[at.llIIIIlIllll[2]] = GUAM;
        atArray[at.llIIIIlIllll[3]] = TARROMIN;
        atArray[at.llIIIIlIllll[4]] = HARRALANDER;
        atArray[at.llIIIIlIllll[5]] = RANARR;
        atArray[at.llIIIIlIllll[6]] = SNAPDRAGON;
        atArray[at.llIIIIlIllll[7]] = TOADFLAX;
        atArray[at.llIIIIlIllll[8]] = IRIT;
        atArray[at.llIIIIlIllll[9]] = CADANTINE;
        atArray[at.llIIIIlIllll[10]] = LANTADYME;
        atArray[at.llIIIIlIllll[11]] = DWARF_WEED;
        atArray[at.llIIIIlIllll[12]] = TORSTOL;
        atArray[at.llIIIIlIllll[13]] = AVANTOE;
        atArray[at.llIIIIlIllll[14]] = KWUARM;
        $VALUES = atArray;
    }

    public static at valueOf(String string) {
        return Enum.valueOf(at.class, string);
    }

    private static String llllIIlIllIIlI(String var4, String var10) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llIIIIlIllll[8]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llIIIIlIllll[2], var15);
            return new String(var1.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String llllIIlIlIlllI(String var18, String var19) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llIIIIlIllll[2], var16);
            return new String(var6.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static String llllIIlIlIllII(String var17, String var13) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var2 = var13.toCharArray();
        int var5 = llIIIIlIllll[0];
        char[] var14 = var17.toCharArray();
        int var9 = var14.length;
        int var12 = llIIIIlIllll[0];
        while (at.llllIIlIllIllI(var12, var9)) {
            char var11 = var14[var12];
            var3.append((char)(var11 ^ var2[var5 % var2.length]));
            0;
            ++var5;
            ++var12;
            0;
            if (2 != (0x97 ^ 0xAB ^ (0x72 ^ 0x4A))) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private at(av av2) {
        this.produceSeed = av2;
    }

    private static void llllIIlIllIlII() {
        llIIIIlIlllI = new String[llIIIIlIllll[15]];
        at.llIIIIlIlllI[at.llIIIIlIllll[0]] = at."NOTHING";
        at.llIIIIlIlllI[at.llIIIIlIllll[1]] = at."DEFAULT";
        at.llIIIIlIlllI[at.llIIIIlIllll[2]] = at."GUAM";
        at.llIIIIlIlllI[at.llIIIIlIllll[3]] = at."TARROMIN";
        at.llIIIIlIlllI[at.llIIIIlIllll[4]] = at."HARRALANDER";
        at.llIIIIlIlllI[at.llIIIIlIllll[5]] = at."RANARR";
        at.llIIIIlIlllI[at.llIIIIlIllll[6]] = at."SNAPDRAGON";
        at.llIIIIlIlllI[at.llIIIIlIllll[7]] = at."TOADFLAX";
        at.llIIIIlIlllI[at.llIIIIlIllll[8]] = at."IRIT";
        at.llIIIIlIlllI[at.llIIIIlIllll[9]] = at."CADANTINE";
        at.llIIIIlIlllI[at.llIIIIlIllll[10]] = at."LANTADYME";
        at.llIIIIlIlllI[at.llIIIIlIllll[11]] = at."DWARF_WEED";
        at.llIIIIlIlllI[at.llIIIIlIllll[12]] = at."TORSTOL";
        at.llIIIIlIlllI[at.llIIIIlIllll[13]] = at."AVANTOE";
        at.llIIIIlIlllI[at.llIIIIlIllll[14]] = at."KWUARM";
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

    private static void llllIIlIllIlIl() {
        llIIIIlIllll = new int[16];
        at.llIIIIlIllll[0] = (135 + 128 - 216 + 119 ^ 16 + 77 - -33 + 32) & (0x36 ^ 0x1B ^ (0x9D ^ 0x88) ^ -1);
        at.llIIIIlIllll[1] = 1;
        at.llIIIIlIllll[2] = 2;
        at.llIIIIlIllll[3] = 3;
        at.llIIIIlIllll[4] = 1 ^ 5;
        at.llIIIIlIllll[5] = 0xC4 ^ 0xC1;
        at.llIIIIlIllll[6] = 0x33 ^ 0x35;
        at.llIIIIlIllll[7] = 0x5B ^ 0x5C;
        at.llIIIIlIllll[8] = 0x88 ^ 0x80;
        at.llIIIIlIllll[9] = 0xA9 ^ 0xA0;
        at.llIIIIlIllll[10] = 0x95 ^ 0x9F;
        at.llIIIIlIllll[11] = 7 ^ 0x73 ^ 98 + 63 - 107 + 73;
        at.llIIIIlIllll[12] = 0x11 ^ 0x1D;
        at.llIIIIlIllll[13] = 0x1D ^ 0x5D ^ (0x56 ^ 0x1B);
        at.llIIIIlIllll[14] = 0x8B ^ 0x85;
        at.llIIIIlIllll[15] = 119 + 128 - 205 + 115 ^ 71 + 3 - 44 + 116;
    }

    private static boolean llllIIlIllIllI(int n2, int n3) {
        return n2 < n3;
    }
}

