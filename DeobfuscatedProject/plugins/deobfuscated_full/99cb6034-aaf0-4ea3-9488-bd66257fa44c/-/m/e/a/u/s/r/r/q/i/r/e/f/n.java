/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.ui.ColorScheme
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;

public final class n
extends Enum<n> {
    public static final /* synthetic */ /* enum */ n FILLING;
    public static final /* synthetic */ /* enum */ n EMPTY;
    private static final /* synthetic */ n[] $VALUES;
    private final /* synthetic */ Color color;
    public static final /* synthetic */ /* enum */ n DEAD;
    private static /* synthetic */ String[] lIlllIlIlIll;
    public static final /* synthetic */ /* enum */ n DISEASED;
    private static /* synthetic */ int[] lIlllIlIllII;
    public static final /* synthetic */ /* enum */ n HARVESTABLE;
    public static final /* synthetic */ /* enum */ n GROWING;

    private static void lllIllIIlIlIII() {
        lIlllIlIlIll = new String[lIlllIlIllII[6]];
        n.lIlllIlIlIll[n.lIlllIlIllII[0]] = n."HARVESTABLE";
        n.lIlllIlIlIll[n.lIlllIlIllII[1]] = n."GROWING";
        n.lIlllIlIlIll[n.lIlllIlIllII[2]] = n."DISEASED";
        n.lIlllIlIlIll[n.lIlllIlIllII[3]] = n."DEAD";
        n.lIlllIlIlIll[n.lIlllIlIllII[4]] = n."EMPTY";
        n.lIlllIlIlIll[n.lIlllIlIllII[5]] = n."FILLING";
    }

    private static void lllIllIIlIlIIl() {
        lIlllIlIllII = new int[8];
        n.lIlllIlIllII[0] = (106 + 98 - 184 + 127 ^ 47 + 20 - -20 + 94) & (0xB7 ^ 0x8D ^ (0xA6 ^ 0xBA) ^ -1);
        n.lIlllIlIllII[1] = 1;
        n.lIlllIlIllII[2] = 2;
        n.lIlllIlIllII[3] = 3;
        n.lIlllIlIllII[4] = 0x7B ^ 0x7F;
        n.lIlllIlIllII[5] = 0x73 ^ 0xF ^ (0xDE ^ 0xA7);
        n.lIlllIlIllII[6] = 0x4E ^ 0x48;
        n.lIlllIlIllII[7] = 0x9C ^ 0x90 ^ (0x6D ^ 0x69);
    }

    static {
        n.lllIllIIlIlIIl();
        n.lllIllIIlIlIII();
        HARVESTABLE = new n(ColorScheme.PROGRESS_COMPLETE_COLOR);
        GROWING = new n(ColorScheme.PROGRESS_COMPLETE_COLOR);
        DISEASED = new n(ColorScheme.PROGRESS_INPROGRESS_COLOR);
        DEAD = new n(ColorScheme.PROGRESS_ERROR_COLOR);
        EMPTY = new n(ColorScheme.MEDIUM_GRAY_COLOR);
        FILLING = new n(ColorScheme.PROGRESS_INPROGRESS_COLOR);
        n[] nArray = new n[lIlllIlIllII[6]];
        nArray[n.lIlllIlIllII[0]] = HARVESTABLE;
        nArray[n.lIlllIlIllII[1]] = GROWING;
        nArray[n.lIlllIlIllII[2]] = DISEASED;
        nArray[n.lIlllIlIllII[3]] = DEAD;
        nArray[n.lIlllIlIllII[4]] = EMPTY;
        nArray[n.lIlllIlIllII[5]] = FILLING;
        $VALUES = nArray;
    }

    public Color V() {
        return this.color;
    }

    private n(Color color) {
        this.color = color;
    }

    private static String lllIllIIlIIlIl(String var16, String var19) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIlllIlIllII[2], var12);
            return new String(var3.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    private static String lllIllIIlIIlll(String var9, String var6) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIlllIlIllII[7]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIlllIlIllII[2], var17);
            return new String(var8.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllIIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    private static String lllIllIIlIIllI(String var1, String var10) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var5 = var10.toCharArray();
        int var7 = lIlllIlIllII[0];
        char[] var15 = var1.toCharArray();
        int var18 = var15.length;
        int var13 = lIlllIlIllII[0];
        while (n.lllIllIIlIlIlI(var13, var18)) {
            char var4 = var15[var13];
            var11.append((char)(var4 ^ var5[var7 % var5.length]));
            0;
            ++var7;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var11);
    }
}

