/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class E
extends Enum<E> {
    private final /* synthetic */ WorldPoint location;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ E MEADOW_NORTH;
    private static /* synthetic */ String[] llIIIlIllllI;
    private static final /* synthetic */ E[] $VALUES;
    public static final /* synthetic */ /* enum */ E VALLEY_NORTH;
    private final /* synthetic */ int varp;
    public static final /* synthetic */ /* enum */ E MEADOW_SOUTH;
    private static /* synthetic */ int[] llIIIlIlllll;
    public static final /* synthetic */ /* enum */ E VALLEY_SOUTH;

    public static E valueOf(String string) {
        return Enum.valueOf(E.class, string);
    }

    private static String llllIlIllIIIII(String lllllllllllllllIlIlIIlIIllllIlll, String lllllllllllllllIlIlIIlIIllllIllI) {
        lllllllllllllllIlIlIIlIIllllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIlIIlllllIlI = new StringBuilder();
        char[] lllllllllllllllIlIlIIlIIlllllIIl = lllllllllllllllIlIlIIlIIllllIllI.toCharArray();
        int lllllllllllllllIlIlIIlIIlllllIII = llIIIlIlllll[0];
        char[] lllllllllllllllIlIlIIlIIllllIIlI = lllllllllllllllIlIlIIlIIllllIlll.toCharArray();
        int lllllllllllllllIlIlIIlIIllllIIIl = lllllllllllllllIlIlIIlIIllllIIlI.length;
        int lllllllllllllllIlIlIIlIIllllIIII = llIIIlIlllll[0];
        while (E.llllIlIllIIlIl(lllllllllllllllIlIlIIlIIllllIIII, lllllllllllllllIlIlIIlIIllllIIIl)) {
            char lllllllllllllllIlIlIIlIIllllllIl = lllllllllllllllIlIlIIlIIllllIIlI[lllllllllllllllIlIlIIlIIllllIIII];
            lllllllllllllllIlIlIIlIIlllllIlI.append((char)(lllllllllllllllIlIlIIlIIllllllIl ^ lllllllllllllllIlIlIIlIIlllllIIl[lllllllllllllllIlIlIIlIIlllllIII % lllllllllllllllIlIlIIlIIlllllIIl.length]));
            0;
            ++lllllllllllllllIlIlIIlIIlllllIII;
            ++lllllllllllllllIlIlIIlIIllllIIII;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIlIIlllllIlI);
    }

    private static String llllIlIllIIIlI(String lllllllllllllllIlIlIIlIlIIIllIIl, String lllllllllllllllIlIlIIlIlIIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIlIIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIlIlIIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIlIIIllIll.init(llIIIlIlllll[5], lllllllllllllllIlIlIIlIlIIIlllII);
            return new String(lllllllllllllllIlIlIIlIlIIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIlIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlIlIIIllIlI) {
            lllllllllllllllIlIlIIlIlIIIllIlI.printStackTrace();
            return null;
        }
    }

    public static E[] values() {
        return (E[])$VALUES.clone();
    }

    private E(String string2, int n3, WorldPoint worldPoint) {
        this.name = string2;
        this.varp = n3;
        this.location = worldPoint;
    }

    private static String llllIlIllIIIIl(String lllllllllllllllIlIlIIlIlIIIIllII, String lllllllllllllllIlIlIIlIlIIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIlIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIlIIIIlIll.getBytes(StandardCharsets.UTF_8)), llIIIlIlllll[20]), "DES");
            Cipher lllllllllllllllIlIlIIlIlIIIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlIlIIIIlllI.init(llIIIlIlllll[5], lllllllllllllllIlIlIIlIlIIIIllll);
            return new String(lllllllllllllllIlIlIIlIlIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIlIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlIlIIIIllIl) {
            lllllllllllllllIlIlIIlIlIIIIllIl.printStackTrace();
            return null;
        }
    }

    private static void llllIlIllIIlII() {
        llIIIlIlllll = new int[21];
        E.llIIIlIlllll[0] = (0x1B ^ 0x77 ^ (0x2E ^ 0x6A)) & (0x16 ^ 0x29 ^ (0x60 ^ 0x77) ^ -1);
        E.llIIIlIlllll[1] = 1;
        E.llIIIlIlllll[2] = -(0xFFFFFFEE & 0x193) & (0xFFFFAFFF & 0x57DB);
        E.llIIIlIlllll[3] = 0xFFFFFFFD & 0xE5F;
        E.llIIIlIlllll[4] = -(0xFFFFDA3E & 0x75D7) & (0xFFFFDF7F & 0x7FBF);
        E.llIIIlIlllll[5] = 2;
        E.llIIIlIlllll[6] = 3;
        E.llIIIlIlllll[7] = -(0xFFFFEFFB & 0x78A5) & (0xFFFFFEFF & 0x6FFB);
        E.llIIIlIlllll[8] = 0xFFFF8EDF & 0x7F7F;
        E.llIIIlIlllll[9] = -(0xFFFFF2ED & 0x5D13) & (0xFFFFDFEF & 0x7EF7);
        E.llIIIlIlllll[10] = 10 + 63 - -1 + 106 ^ 156 + 143 - 268 + 145;
        E.llIIIlIlllll[11] = 0x59 ^ 0x2F ^ (5 ^ 0x76);
        E.llIIIlIlllll[12] = 0xFFFF9F7E & 0x66DD;
        E.llIIIlIlllll[13] = 0xFFFFAEB9 & 0x5FFE;
        E.llIIIlIlllll[14] = -(0xFFFFBA7D & 0x758F) & (0xFFFFBFFF & 0x7EBD);
        E.llIIIlIlllll[15] = 0x97 ^ 0x91;
        E.llIIIlIlllll[16] = 0x15 ^ 0x72 ^ (2 ^ 0x62);
        E.llIIIlIlllll[17] = -(0xFFFFFADD & 0x7523) & (0xFFFFF7DF & 0x7E7D);
        E.llIIIlIlllll[18] = -(0xFFFFBFBD & 0x414B) & (0xFFFFFFFB & 0xFBF);
        E.llIIIlIlllll[19] = 0xFFFFBEFF & 0x4FAB;
        E.llIIIlIlllll[20] = 0x39 ^ 0x13 ^ (0xB ^ 0x29);
    }

    public int ax() {
        return this.varp;
    }

    static {
        E.llllIlIllIIlII();
        E.llllIlIllIIIll();
        MEADOW_NORTH = new E(llIIIlIllllI[llIIIlIlllll[1]], llIIIlIlllll[2], new WorldPoint(llIIIlIlllll[3], llIIIlIlllll[4], llIIIlIlllll[0]));
        MEADOW_SOUTH = new E(llIIIlIllllI[llIIIlIlllll[6]], llIIIlIlllll[7], new WorldPoint(llIIIlIlllll[8], llIIIlIlllll[9], llIIIlIlllll[0]));
        VALLEY_NORTH = new E(llIIIlIllllI[llIIIlIlllll[11]], llIIIlIlllll[12], new WorldPoint(llIIIlIlllll[13], llIIIlIlllll[14], llIIIlIlllll[0]));
        VALLEY_SOUTH = new E(llIIIlIllllI[llIIIlIlllll[16]], llIIIlIlllll[17], new WorldPoint(llIIIlIlllll[18], llIIIlIlllll[19], llIIIlIlllll[0]));
        E[] eArray = new E[llIIIlIlllll[10]];
        eArray[E.llIIIlIlllll[0]] = MEADOW_NORTH;
        eArray[E.llIIIlIlllll[1]] = MEADOW_SOUTH;
        eArray[E.llIIIlIlllll[5]] = VALLEY_NORTH;
        eArray[E.llIIIlIlllll[6]] = VALLEY_SOUTH;
        $VALUES = eArray;
    }

    public String ac() {
        return this.name;
    }

    public WorldPoint az() {
        return this.location;
    }

    private static boolean llllIlIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llllIlIllIIIll() {
        llIIIlIllllI = new String[llIIIlIlllll[20]];
        E.llIIIlIllllI[E.llIIIlIlllll[0]] = E."MEADOW_NORTH";
        E.llIIIlIllllI[E.llIIIlIlllll[1]] = E."Mushroom Meadow (North)";
        E.llIIIlIllllI[E.llIIIlIlllll[5]] = E."MEADOW_SOUTH";
        E.llIIIlIllllI[E.llIIIlIlllll[6]] = E."Mushroom Meadow (South)";
        E.llIIIlIllllI[E.llIIIlIlllll[10]] = E."VALLEY_NORTH";
        E.llIIIlIllllI[E.llIIIlIlllll[11]] = E."Verdant Valley (Northeast)";
        E.llIIIlIllllI[E.llIIIlIlllll[15]] = E."VALLEY_SOUTH";
        E.llIIIlIllllI[E.llIIIlIlllll[16]] = E."Verdant Valley (Southwest)";
    }
}

