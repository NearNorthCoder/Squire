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

    private static String lllIllIIlIIlIl(String lllllllllllllllIlIllIlIllIIIIIlI, String lllllllllllllllIlIllIlIllIIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlIllIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIlIllIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIlIllIIIIlII.init(lIlllIlIllII[2], lllllllllllllllIlIllIlIllIIIIlIl);
            return new String(lllllllllllllllIlIllIlIllIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIlIllIIIIIll) {
            lllllllllllllllIlIllIlIllIIIIIll.printStackTrace();
            return null;
        }
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    private static String lllIllIIlIIlll(String lllllllllllllllIlIllIlIlIlllIIll, String lllllllllllllllIlIllIlIlIlllIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlIlIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIlIlllIlII.getBytes(StandardCharsets.UTF_8)), lIlllIlIllII[7]), "DES");
            Cipher lllllllllllllllIlIllIlIlIlllIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIllIlIlIlllIlll.init(lIlllIlIllII[2], lllllllllllllllIlIllIlIlIllllIII);
            return new String(lllllllllllllllIlIllIlIlIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIlIlIlllIllI) {
            lllllllllllllllIlIllIlIlIlllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllIIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    private static String lllIllIIlIIllI(String lllllllllllllllIlIllIlIlIllIIIII, String lllllllllllllllIlIllIlIlIlIlllll) {
        lllllllllllllllIlIllIlIlIllIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIlIlIllIIIll = new StringBuilder();
        char[] lllllllllllllllIlIllIlIlIllIIIlI = lllllllllllllllIlIllIlIlIlIlllll.toCharArray();
        int lllllllllllllllIlIllIlIlIllIIIIl = lIlllIlIllII[0];
        char[] lllllllllllllllIlIllIlIlIlIllIll = lllllllllllllllIlIllIlIlIllIIIII.toCharArray();
        int lllllllllllllllIlIllIlIlIlIllIlI = lllllllllllllllIlIllIlIlIlIllIll.length;
        int lllllllllllllllIlIllIlIlIlIllIIl = lIlllIlIllII[0];
        while (n.lllIllIIlIlIlI(lllllllllllllllIlIllIlIlIlIllIIl, lllllllllllllllIlIllIlIlIlIllIlI)) {
            char lllllllllllllllIlIllIlIlIllIIllI = lllllllllllllllIlIllIlIlIlIllIll[lllllllllllllllIlIllIlIlIlIllIIl];
            lllllllllllllllIlIllIlIlIllIIIll.append((char)(lllllllllllllllIlIllIlIlIllIIllI ^ lllllllllllllllIlIllIlIlIllIIIlI[lllllllllllllllIlIllIlIlIllIIIIl % lllllllllllllllIlIllIlIlIllIIIlI.length]));
            0;
            ++lllllllllllllllIlIllIlIlIllIIIIl;
            ++lllllllllllllllIlIllIlIlIlIllIIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIlIlIllIIIll);
    }
}

