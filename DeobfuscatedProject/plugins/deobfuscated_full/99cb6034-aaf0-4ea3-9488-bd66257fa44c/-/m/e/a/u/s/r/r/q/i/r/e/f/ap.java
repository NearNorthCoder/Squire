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

public final class ap
extends Enum<ap>
implements aw {
    public static final /* synthetic */ /* enum */ ap STRAWBERRIES;
    public static final /* synthetic */ /* enum */ ap ONIONS;
    private final /* synthetic */ av produceSeed;
    public static final /* synthetic */ /* enum */ ap SWEETCORN;
    public static final /* synthetic */ /* enum */ ap SNAPE_GRASS;
    private static /* synthetic */ int[] llIIIlIIIIII;
    public static final /* synthetic */ /* enum */ ap WATERMELON;
    public static final /* synthetic */ /* enum */ ap NOTHING;
    public static final /* synthetic */ /* enum */ ap DEFAULT;
    private static final /* synthetic */ ap[] $VALUES;
    private static /* synthetic */ String[] llIIIIllllIl;

    @Override
    public av bf() {
        return this.produceSeed;
    }

    public static ap valueOf(String string) {
        return Enum.valueOf(ap.class, string);
    }

    private static String llllIIllIlllll(String var12, String var11) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var15 = var11.toCharArray();
        int var19 = llIIIlIIIIII[0];
        char[] var18 = var12.toCharArray();
        int var16 = var18.length;
        int var7 = llIIIlIIIIII[0];
        while (ap.llllIIlllIlIll(var7, var16)) {
            char var2 = var18[var7];
            var1.append((char)(var2 ^ var15[var19 % var15.length]));
            0;
            ++var19;
            ++var7;
            0;
            if (-(0xA8 ^ 0xAD) < 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static String llllIIlllIIIII(String var13, String var3) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llIIIlIIIIII[8]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llIIIlIIIIII[2], var6);
            return new String(var8.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void llllIIlllIIllI() {
        llIIIIllllIl = new String[llIIIlIIIIII[7]];
        ap.llIIIIllllIl[ap.llIIIlIIIIII[0]] = ap."NOTHING";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[1]] = ap."DEFAULT";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[2]] = ap."WATERMELON";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[3]] = ap."STRAWBERRIES";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[4]] = ap."ONIONS";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[5]] = ap."SWEETCORN";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[6]] = ap."SNAPE_GRASS";
    }

    public static ap[] values() {
        return (ap[])$VALUES.clone();
    }

    private static String llllIIlllIIIIl(String var4, String var14) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(llIIIlIIIIII[2], var10);
            return new String(var5.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void llllIIlllIlIlI() {
        llIIIlIIIIII = new int[9];
        ap.llIIIlIIIIII[0] = (0x46 ^ 0x51) & ~(0x12 ^ 5);
        ap.llIIIlIIIIII[1] = 1;
        ap.llIIIlIIIIII[2] = 2;
        ap.llIIIlIIIIII[3] = 3;
        ap.llIIIlIIIIII[4] = 0xBE ^ 0xBA;
        ap.llIIIlIIIIII[5] = 0x7E ^ 0x7B;
        ap.llIIIlIIIIII[6] = 0xBA ^ 0xBC;
        ap.llIIIlIIIIII[7] = 5 ^ 0x5D ^ (0x4D ^ 0x12);
        ap.llIIIlIIIIII[8] = 0x8D ^ 0xA7 ^ (0xB4 ^ 0x96);
    }

    static {
        ap.llllIIlllIlIlI();
        ap.llllIIlllIIllI();
        NOTHING = new ap(null);
        DEFAULT = new ap(av.DEFAULT);
        WATERMELON = new ap(av.WATERMELON);
        STRAWBERRIES = new ap(av.STRAWEBERRIES);
        ONIONS = new ap(av.ONIONS);
        SWEETCORN = new ap(av.SWEETCORN);
        SNAPE_GRASS = new ap(av.SNAPE_GRASS);
        ap[] apArray = new ap[llIIIlIIIIII[7]];
        apArray[ap.llIIIlIIIIII[0]] = NOTHING;
        apArray[ap.llIIIlIIIIII[1]] = DEFAULT;
        apArray[ap.llIIIlIIIIII[2]] = WATERMELON;
        apArray[ap.llIIIlIIIIII[3]] = STRAWBERRIES;
        apArray[ap.llIIIlIIIIII[4]] = ONIONS;
        apArray[ap.llIIIlIIIIII[5]] = SWEETCORN;
        apArray[ap.llIIIlIIIIII[6]] = SNAPE_GRASS;
        $VALUES = apArray;
    }

    private static boolean llllIIlllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private ap(av av2) {
        this.produceSeed = av2;
    }
}

