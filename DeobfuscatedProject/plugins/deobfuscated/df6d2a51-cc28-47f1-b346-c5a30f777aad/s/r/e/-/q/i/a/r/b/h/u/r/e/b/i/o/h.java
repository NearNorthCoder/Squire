/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class h
extends Enum<h> {
    public static final /* synthetic */ /* enum */ h MIDDLE;
    public static final /* synthetic */ /* enum */ h GHOST_MUSHROOM;
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ /* enum */ h LEPRECHAUN;
    public static final /* synthetic */ /* enum */ h CAMP_ENTRANCE;
    public static final /* synthetic */ /* enum */ h DRIFTWOOD;
    private static /* synthetic */ int[] lllIIllIIIlI;
    private static final /* synthetic */ h[] $VALUES;
    private static /* synthetic */ String[] lllIIllIIIIl;

    private h(WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    public WorldPoint l() {
        return this.location;
    }

    private static void lIIIlIlIIllIIll() {
        lllIIllIIIIl = new String[lllIIllIIIlI[15]];
        h.lllIIllIIIIl[h.lllIIllIIIlI[0]] = h."MIDDLE";
        h.lllIIllIIIIl[h.lllIIllIIIlI[3]] = h."LEPRECHAUN";
        h.lllIIllIIIIl[h.lllIIllIIIlI[6]] = h."CAMP_ENTRANCE";
        h.lllIIllIIIIl[h.lllIIllIIIlI[9]] = h."GHOST_MUSHROOM";
        h.lllIIllIIIIl[h.lllIIllIIIlI[12]] = h."DRIFTWOOD";
    }

    /*
     * WARNING - void declaration
     */
    static h c(WorldPoint worldPoint) {
        void lllllllllllllllIIllIlIIlIIlllIII;
        h[] hArray = h.values();
        int n2 = hArray.length;
        int lllllllllllllllIIllIlIIlIIllIlll = lllIIllIIIlI[0];
        while (h.lIIIlIlIIllIlIl(lllllllllllllllIIllIlIIlIIllIlll, (int)lllllllllllllllIIllIlIIlIIlllIII)) {
            WorldPoint lllllllllllllllIIllIlIIlIIlllIlI;
            void lllllllllllllllIIllIlIIlIIlllIIl;
            void lllllllllllllllIIllIlIIlIIllIllI = lllllllllllllllIIllIlIIlIIlllIIl[lllllllllllllllIIllIlIIlIIllIlll];
            if (h.lIIIlIlIIllIllI(lllllllllllllllIIllIlIIlIIllIllI.l().equals((Object)lllllllllllllllIIllIlIIlIIlllIlI) ? 1 : 0)) {
                return lllllllllllllllIIllIlIIlIIllIllI;
            }
            ++lllllllllllllllIIllIlIIlIIllIlll;
            0;
            if (2 == 2) continue;
            return null;
        }
        return null;
    }

    static {
        h.lIIIlIlIIllIlII();
        h.lIIIlIlIIllIIll();
        MIDDLE = new h(new WorldPoint(lllIIllIIIlI[1], lllIIllIIIlI[2], lllIIllIIIlI[0]));
        LEPRECHAUN = new h(new WorldPoint(lllIIllIIIlI[4], lllIIllIIIlI[5], lllIIllIIIlI[0]));
        CAMP_ENTRANCE = new h(new WorldPoint(lllIIllIIIlI[7], lllIIllIIIlI[8], lllIIllIIIlI[0]));
        GHOST_MUSHROOM = new h(new WorldPoint(lllIIllIIIlI[10], lllIIllIIIlI[11], lllIIllIIIlI[0]));
        DRIFTWOOD = new h(new WorldPoint(lllIIllIIIlI[13], lllIIllIIIlI[14], lllIIllIIIlI[0]));
        h[] hArray = new h[lllIIllIIIlI[15]];
        hArray[h.lllIIllIIIlI[0]] = MIDDLE;
        hArray[h.lllIIllIIIlI[3]] = LEPRECHAUN;
        hArray[h.lllIIllIIIlI[6]] = CAMP_ENTRANCE;
        hArray[h.lllIIllIIIlI[9]] = GHOST_MUSHROOM;
        hArray[h.lllIIllIIIlI[12]] = DRIFTWOOD;
        $VALUES = hArray;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIIIlIlIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIlIIllIIIl(String lllllllllllllllIIllIlIIlIIlIllII, String lllllllllllllllIIllIlIIlIIlIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIlIIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIlIIllIIII.init(lllIIllIIIlI[6], lllllllllllllllIIllIlIIlIIllIIIl);
            return new String(lllllllllllllllIIllIlIIlIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIlIIlIllll) {
            lllllllllllllllIIllIlIIlIIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIllIllI(int n2) {
        return n2 != 0;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static String lIIIlIlIIllIIlI(String lllllllllllllllIIllIlIIlIIlIIIIl, String lllllllllllllllIIllIlIIlIIIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIIIllllI.getBytes(StandardCharsets.UTF_8)), lllIIllIIIlI[16]), "DES");
            Cipher lllllllllllllllIIllIlIIlIIlIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIlIIlIIIll.init(lllIIllIIIlI[6], lllllllllllllllIIllIlIIlIIlIIlII);
            return new String(lllllllllllllllIIllIlIIlIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIlIIlIIIlI) {
            lllllllllllllllIIllIlIIlIIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIlIIllIlII() {
        lllIIllIIIlI = new int[17];
        h.lllIIllIIIlI[0] = (150 + 107 - 144 + 109 ^ 134 + 130 - 263 + 134) & (39 + 62 - 50 + 155 ^ 120 + 142 - 247 + 136 ^ -1);
        h.lllIIllIIIlI[1] = -(0xFFFFFB69 & 0x359F) & (0xFFFFFFEF & 0x3F7E);
        h.lllIIllIIIlI[2] = 0xFFFFCFFE & 0x3F1F;
        h.lllIIllIIIlI[3] = 1;
        h.lllIIllIIIlI[4] = -(0xFFFFF55F & 0x3AA7) & (0xFFFFBF7F & 0x7EFF);
        h.lllIIllIIIlI[5] = 0xFFFFFEFF & 0xFF6;
        h.lllIIllIIIlI[6] = 2;
        h.lllIIllIIIlI[7] = -(0xFFFFE7DF & 0x79A7) & (0xFFFFFFFF & 0x6FFE);
        h.lllIIllIIIlI[8] = 0xFFFF8FFF & 0x7EE2;
        h.lllIIllIIIlI[9] = 3;
        h.lllIIllIIIlI[10] = -(0xFFFFF3DF & 0x1DB1) & (0xFFFFDFFF & 0x3FFF);
        h.lllIIllIIIlI[11] = -(0xFFFFE8BF & 0x7741) & (0xFFFFEEFC & 0x7FDB);
        h.lllIIllIIIlI[12] = 0x73 ^ 0x77;
        h.lllIIllIIIlI[13] = 0xFFFFFEFF & 0xFA7;
        h.lllIIllIIIlI[14] = -(0xFFFF9FFF & 0x70C5) & (0xFFFFFFEE & 0x1FDF);
        h.lllIIllIIIlI[15] = 0x47 ^ 0x42;
        h.lllIIllIIIlI[16] = 0x65 ^ 0x6D;
    }
}

