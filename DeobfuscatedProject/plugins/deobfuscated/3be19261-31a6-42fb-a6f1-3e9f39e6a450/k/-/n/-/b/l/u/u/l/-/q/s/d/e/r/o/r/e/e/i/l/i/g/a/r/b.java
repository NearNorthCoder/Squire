/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public final class b
extends Enum<b> {
    private final /* synthetic */ WorldPoint location;
    private static /* synthetic */ String[] lIIlllIllIII;
    public static final /* synthetic */ /* enum */ b HEROS;
    private static /* synthetic */ int[] lIIllllIIIlI;
    private final /* synthetic */ String locationName;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b MYTHS_GUILD;
    private final /* synthetic */ WorldArea dragonArea;
    private final /* synthetic */ WorldPoint safeSpot;
    public static final /* synthetic */ /* enum */ b TAVERLEY_DUNGEON;

    private static String llIlIIIlIIIIll(String lllllllllllllllIlllIlIIlllIlIIll, String lllllllllllllllIlllIlIIlllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlllIlIlll.init(lIIllllIIIlI[9], lllllllllllllllIlllIlIIlllIllIII);
            return new String(lllllllllllllllIlllIlIIlllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlllIlIllI) {
            lllllllllllllllIlllIlIIlllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIllIlIII(int n, int n2) {
        return n < n2;
    }

    private static String llIlIIIlIIIIIl(String lllllllllllllllIlllIlIIllllIIlIl, String lllllllllllllllIlllIlIIllllIIlII) {
        lllllllllllllllIlllIlIIllllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIllllIlIII = new StringBuilder();
        char[] lllllllllllllllIlllIlIIllllIIlll = lllllllllllllllIlllIlIIllllIIlII.toCharArray();
        int lllllllllllllllIlllIlIIllllIIllI = lIIllllIIIlI[0];
        char[] lllllllllllllllIlllIlIIllllIIIII = lllllllllllllllIlllIlIIllllIIlIl.toCharArray();
        int lllllllllllllllIlllIlIIlllIlllll = lllllllllllllllIlllIlIIllllIIIII.length;
        int lllllllllllllllIlllIlIIlllIllllI = lIIllllIIIlI[0];
        while (b.llIlIIIllIlIII(lllllllllllllllIlllIlIIlllIllllI, lllllllllllllllIlllIlIIlllIlllll)) {
            char lllllllllllllllIlllIlIIllllIlIll = lllllllllllllllIlllIlIIllllIIIII[lllllllllllllllIlllIlIIlllIllllI];
            lllllllllllllllIlllIlIIllllIlIII.append((char)(lllllllllllllllIlllIlIIllllIlIll ^ lllllllllllllllIlllIlIIllllIIlll[lllllllllllllllIlllIlIIllllIIllI % lllllllllllllllIlllIlIIllllIIlll.length]));
            0;
            ++lllllllllllllllIlllIlIIllllIIllI;
            ++lllllllllllllllIlllIlIIlllIllllI;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIIllllIlIII);
    }

    public WorldPoint o() {
        return this.location;
    }

    public WorldArea p() {
        return this.dragonArea;
    }

    private static void llIlIIIlIIIlII() {
        lIIlllIllIII = new String[lIIllllIIIlI[29]];
        b.lIIlllIllIII[b.lIIllllIIIlI[0]] = b."HEROS";
        b.lIIlllIllIII[b.lIIllllIIIlI[1]] = b."Heroes' Guild Basement";
        b.lIIlllIllIII[b.lIIllllIIIlI[9]] = b."TAVERLEY_DUNGEON";
        b.lIIlllIllIII[b.lIIllllIIIlI[10]] = b."Taverley Dungeon";
        b.lIIlllIllIII[b.lIIllllIIIlI[19]] = b."MYTHS_GUILD";
        b.lIIlllIllIII[b.lIIllllIIIlI[20]] = b."Myths Guild";
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private b(String string2, WorldPoint worldPoint, WorldArea worldArea, WorldPoint worldPoint2) {
        this.location = worldPoint;
        this.locationName = string2;
        this.dragonArea = worldArea;
        this.safeSpot = worldPoint2;
    }

    static {
        b.llIlIIIllIIlll();
        b.llIlIIIlIIIlII();
        HEROS = new b(lIIlllIllIII[lIIllllIIIlI[1]], new WorldPoint(lIIllllIIIlI[2], lIIllllIIIlI[3], lIIllllIIIlI[0]), new WorldArea(lIIllllIIIlI[4], lIIllllIIIlI[5], lIIllllIIIlI[6], lIIllllIIIlI[7], lIIllllIIIlI[0]), new WorldPoint(lIIllllIIIlI[8], lIIllllIIIlI[3], lIIllllIIIlI[0]));
        TAVERLEY_DUNGEON = new b(lIIlllIllIII[lIIllllIIIlI[10]], new WorldPoint(lIIllllIIIlI[11], lIIllllIIIlI[12], lIIllllIIIlI[0]), new WorldArea(lIIllllIIIlI[13], lIIllllIIIlI[14], lIIllllIIIlI[15], lIIllllIIIlI[16], lIIllllIIIlI[0]), new WorldPoint(lIIllllIIIlI[17], lIIllllIIIlI[18], lIIllllIIIlI[0]));
        MYTHS_GUILD = new b(lIIlllIllIII[lIIllllIIIlI[20]], new WorldPoint(lIIllllIIIlI[21], lIIllllIIIlI[22], lIIllllIIIlI[1]), new WorldArea(lIIllllIIIlI[23], lIIllllIIIlI[24], lIIllllIIIlI[25], lIIllllIIIlI[26], lIIllllIIIlI[1]), new WorldPoint(lIIllllIIIlI[27], lIIllllIIIlI[28], lIIllllIIIlI[1]));
        b[] bArray = new b[lIIllllIIIlI[10]];
        bArray[b.lIIllllIIIlI[0]] = HEROS;
        bArray[b.lIIllllIIIlI[1]] = TAVERLEY_DUNGEON;
        bArray[b.lIIllllIIIlI[9]] = MYTHS_GUILD;
        $VALUES = bArray;
    }

    private static String llIlIIIlIIIIlI(String lllllllllllllllIlllIlIIlllIIIllI, String lllllllllllllllIlllIlIIlllIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlllIIIlll.getBytes(StandardCharsets.UTF_8)), lIIllllIIIlI[7]), "DES");
            Cipher lllllllllllllllIlllIlIIlllIIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIlllIIlIlI.init(lIIllllIIIlI[9], lllllllllllllllIlllIlIIlllIIlIll);
            return new String(lllllllllllllllIlllIlIIlllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlllIIlIIl) {
            lllllllllllllllIlllIlIIlllIIlIIl.printStackTrace();
            return null;
        }
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    public WorldPoint q() {
        return this.safeSpot;
    }

    private static void llIlIIIllIIlll() {
        lIIllllIIIlI = new int[30];
        b.lIIllllIIIlI[0] = (110 + 6 - 40 + 122 ^ 108 + 139 - 157 + 55) & (0x27 ^ 0xC ^ (0xCC ^ 0xB0) ^ -1);
        b.lIIllllIIIlI[1] = 1;
        b.lIIllllIIIlI[2] = 0xFFFF9FFF & 0x6B5E;
        b.lIIllllIIIlI[3] = 0xFFFFAFB7 & 0x76FA;
        b.lIIllllIIIlI[4] = 0xFFFFDBFC & 0x2F5B;
        b.lIIllllIIIlI[5] = 0xFFFFB6FF & 0x6FAE;
        b.lIIllllIIIlI[6] = 0x12 ^ 0x17 ^ (0x18 ^ 0x10);
        b.lIIllllIIIlI[7] = 0x45 ^ 0x4D;
        b.lIIllllIIIlI[8] = -(0xFFFFF431 & 0x7FDF) & (0xFFFFFF7F & 0x7FF4);
        b.lIIllllIIIlI[9] = 2;
        b.lIIllllIIIlI[10] = 3;
        b.lIIllllIIIlI[11] = -1 & (0xFFFF9BFF & 0x6F5F);
        b.lIIllllIIIlI[12] = -(0xFFFFF99B & 0x1FE7) & (0xFFFFFFFF & 0x3FBF);
        b.lIIllllIIIlI[13] = -(0xFFFFD27D & 0x7DA3) & (0xFFFFFFF7 & 0x5B7B);
        b.lIIllllIIIlI[14] = -(0xFFFF9F4B & 0x70F5) & (0xFFFFBF7F & 0x76ED);
        b.lIIllllIIIlI[15] = 0x51 ^ 0x4F;
        b.lIIllllIIIlI[16] = 0x87 ^ 0x94;
        b.lIIllllIIIlI[17] = 0xFFFF8F7F & 0x7BE6;
        b.lIIllllIIIlI[18] = 0xFFFFEF75 & 0x36BF;
        b.lIIllllIIIlI[19] = 0x5B ^ 0x1A ^ (0x4A ^ 0xF);
        b.lIIllllIIIlI[20] = 0xD7 ^ 0x90 ^ (0xC5 ^ 0x87);
        b.lIIllllIIIlI[21] = -(0xFFFFF532 & 0x3AFF) & (0xFFFFBFFB & 0x77BF);
        b.lIIllllIIIlI[22] = 0xFFFFAB4F & 0x77BF;
        b.lIIllllIIIlI[23] = 0xFFFFCFA3 & 0x37DD;
        b.lIIllllIIIlI[24] = 0xFFFFBEFF & 0x63FD;
        b.lIIllllIIIlI[25] = 0x52 ^ 0x43;
        b.lIIllllIIIlI[26] = 0x84 ^ 0xA4;
        b.lIIllllIIIlI[27] = 0xFFFFFFDF & 0x7A6;
        b.lIIllllIIIlI[28] = 0xFFFFF75F & 0x2BB1;
        b.lIIllllIIIlI[29] = 184 + 77 - 135 + 64 ^ 78 + 183 - 164 + 87;
    }
}

