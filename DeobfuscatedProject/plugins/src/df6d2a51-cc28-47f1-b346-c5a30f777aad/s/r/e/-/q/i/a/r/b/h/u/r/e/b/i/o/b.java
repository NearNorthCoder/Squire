/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.a;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.c;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.g;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.i;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.k;

public class b {
    public static final /* synthetic */ String k;
    public static final /* synthetic */ List<WorldPoint> m;
    @Inject
    private /* synthetic */ i n;
    private static /* synthetic */ int[] lllIIllllIlI;
    public static final /* synthetic */ List<Integer> l;
    private static /* synthetic */ String[] lllIIllllIIl;

    private static String lIIIlIllIIlIlII(String lllllllllllllllIIllIIlIlllllllll, String lllllllllllllllIIllIIlIlllllllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllIIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIlllllllII.getBytes(StandardCharsets.UTF_8)), lllIIllllIlI[33]), "DES");
            Cipher lllllllllllllllIIllIIllIIIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIllIIIIIIIIl.init(lllIIllllIlI[2], lllllllllllllllIIllIIllIIIIIIIlI);
            return new String(lllllllllllllllIIllIIllIIIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIllIIIIIIIII) {
            lllllllllllllllIIllIIllIIIIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllIIlllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIllIIlllIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIllIIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlIllIIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIllIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlIllIIlIlll(Object object) {
        return object == null;
    }

    private static void lIIIlIllIIlIlIl() {
        lllIIllllIIl = new String[lllIIllllIlI[13]];
        b.lllIIllllIIl[b.lllIIllllIlI[0]] = b.lIIIlIllIIlIIlI("jOU1EoAc8m0/c8IU1mrUog==", "WIOjD");
        b.lllIIllllIIl[b.lllIIllllIlI[1]] = b.lIIIlIllIIlIIll("HiMHBTM0OQ==", "WMtuV");
        b.lllIIllllIIl[b.lllIIllllIlI[2]] = b.lIIIlIllIIlIlII("Yshhd/wkrfw=", "jMBRA");
        b.lllIIllllIIl[b.lllIIllllIlI[7]] = b.lIIIlIllIIlIIlI("tzzl9gedERi18f6oE48nHg==", "KirJM");
    }

    /*
     * WARNING - void declaration
     */
    public a h() {
        void lllllllllllllllIIllIIllIIlIIIIll;
        a[] aArray = a.values();
        int n2 = aArray.length;
        int lllllllllllllllIIllIIllIIlIIIIlI = lllIIllllIlI[0];
        while (b.lIIIlIllIIllIII(lllllllllllllllIIllIIllIIlIIIIlI, (int)lllllllllllllllIIllIIllIIlIIIIll)) {
            void lllllllllllllllIIllIIllIIlIIIlII;
            void lllllllllllllllIIllIIllIIlIIIIIl = lllllllllllllllIIllIIllIIlIIIlII[lllllllllllllllIIllIIllIIlIIIIlI];
            int lllllllllllllllIIllIIllIIlIIIIII = Vars.getBit((int)lllllllllllllllIIllIIllIIlIIIIIl.b());
            if (!b.lIIIlIllIIllIIl(lllllllllllllllIIllIIllIIlIIIIII, lllIIllllIlI[1]) || b.lIIIlIllIIllIlI(lllllllllllllllIIllIIllIIlIIIIII, lllIIllllIlI[2])) {
                lllllllllllllllIIllIIllIIlIIIIIl.a(lllllllllllllllIIllIIllIIlIIIIII);
                return lllllllllllllllIIllIIllIIlIIIIIl;
            }
            lllllllllllllllIIllIIllIIlIIIIIl.a(lllIIllllIlI[3]);
            ++lllllllllllllllIIllIIllIIlIIIIlI;
            "".length();
            if ((0xE8 ^ 0xA0 ^ (0x7E ^ 0x32)) != " ".length()) continue;
            return null;
        }
        return null;
    }

    private static boolean lIIIlIllIIllllI(int n2, int n3) {
        return n2 > n3;
    }

    public c i() {
        b lllllllllllllllIIllIIllIIIllIlll;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().equals(lllIIllllIIl[lllIIllllIlI[0]]));
        if (b.lIIIlIllIIllIll(nPC2) && b.lIIIlIllIIllIIl(nPC2.getAnimation(), lllIIllllIlI[4])) {
            return c.HARVESTING;
        }
        g lllllllllllllllIIllIIllIIIllIlIl = lllllllllllllllIIllIIllIIIllIlll.n.F();
        k lllllllllllllllIIllIIllIIIllIlII = lllllllllllllllIIllIIllIIIllIlll.n.E();
        int lllllllllllllllIIllIIllIIIllIIll = lllllllllllllllIIllIIllIIIllIlll.n.G();
        if (b.lIIIlIllIIlIlll((Object)lllllllllllllllIIllIIllIIIllIlIl) && b.lIIIlIllIIlllII(lllllllllllllllIIllIIllIIIllIIll)) {
            return c.STARTING;
        }
        if (b.lIIIlIllIIlllIl(Vars.getBit((int)lllIIllllIlI[5]))) {
            return c.FINISHING;
        }
        a lllllllllllllllIIllIIllIIIllIIlI = lllllllllllllllIIllIIllIIIllIlll.h();
        if (b.lIIIlIllIIlIlll((Object)lllllllllllllllIIllIIllIIIllIIlI)) {
            return c.STARTING;
        }
        WorldPoint[] lllllllllllllllIIllIIllIIIllIIIl = lllllllllllllllIIllIIllIIIllIIlI.d();
        WorldPoint lllllllllllllllIIllIIllIIIllIIII = lllllllllllllllIIllIIllIIIllIIIl[lllIIllllIlI[0]];
        if (b.lIIIlIllIIlIlll(lllllllllllllllIIllIIllIIIllIIII)) {
            lllllllllllllllIIllIIllIIIllIIII = lllllllllllllllIIllIIllIIIllIIIl[lllIIllllIlI[1]];
        }
        if (b.lIIIlIllIIllllI(lllllllllllllllIIllIIllIIIllIIII.distanceTo((Locatable)Players.getLocal()), lllIIllllIlI[6])) {
            return c.PATHING;
        }
        return c.INSPECTING;
    }

    private static boolean lIIIlIllIIlllll(int n2) {
        return n2 != 0;
    }

    static {
        b.lIIIlIllIIlIllI();
        b.lIIIlIllIIlIlIl();
        k = lllIIllllIIl[lllIIllllIlI[7]];
        Integer[] integerArray = new Integer[lllIIllllIlI[8]];
        integerArray[b.lllIIllllIlI[0]] = lllIIllllIlI[9];
        integerArray[b.lllIIllllIlI[1]] = lllIIllllIlI[10];
        integerArray[b.lllIIllllIlI[2]] = lllIIllllIlI[11];
        integerArray[b.lllIIllllIlI[7]] = lllIIllllIlI[12];
        integerArray[b.lllIIllllIlI[13]] = lllIIllllIlI[14];
        l = Arrays.asList(integerArray);
        WorldPoint[] worldPointArray = new WorldPoint[lllIIllllIlI[15]];
        worldPointArray[b.lllIIllllIlI[0]] = new WorldPoint(lllIIllllIlI[16], lllIIllllIlI[17], lllIIllllIlI[0]);
        worldPointArray[b.lllIIllllIlI[1]] = new WorldPoint(lllIIllllIlI[18], lllIIllllIlI[19], lllIIllllIlI[0]);
        worldPointArray[b.lllIIllllIlI[2]] = new WorldPoint(lllIIllllIlI[20], lllIIllllIlI[21], lllIIllllIlI[0]);
        worldPointArray[b.lllIIllllIlI[7]] = new WorldPoint(lllIIllllIlI[22], lllIIllllIlI[23], lllIIllllIlI[0]);
        worldPointArray[b.lllIIllllIlI[13]] = new WorldPoint(lllIIllllIlI[24], lllIIllllIlI[25], lllIIllllIlI[0]);
        worldPointArray[b.lllIIllllIlI[8]] = new WorldPoint(lllIIllllIlI[26], lllIIllllIlI[27], lllIIllllIlI[0]);
        worldPointArray[b.lllIIllllIlI[28]] = new WorldPoint(lllIIllllIlI[29], lllIIllllIlI[30], lllIIllllIlI[0]);
        worldPointArray[b.lllIIllllIlI[6]] = new WorldPoint(lllIIllllIlI[31], lllIIllllIlI[32], lllIIllllIlI[0]);
        worldPointArray[b.lllIIllllIlI[33]] = new WorldPoint(lllIIllllIlI[34], lllIIllllIlI[35], lllIIllllIlI[0]);
        m = Arrays.asList(worldPointArray);
    }

    private static String lIIIlIllIIlIIlI(String lllllllllllllllIIllIIllIIIIIlIlI, String lllllllllllllllIIllIIllIIIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllIIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIllIIIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIllIIIIIlllI.init(lllIIllllIlI[2], lllllllllllllllIIllIIllIIIIIllll);
            return new String(lllllllllllllllIIllIIllIIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIllIIIIIllIl) {
            lllllllllllllllIIllIIllIIIIIllIl.printStackTrace();
            return null;
        }
    }

    public TileObject a(WorldPoint worldPoint) {
        if (b.lIIIlIllIIlIlll(worldPoint)) {
            return null;
        }
        return TileObjects.getFirstAt((WorldPoint)worldPoint, tileObject -> {
            int n2;
            if (b.lIIIlIllIIlllll(tileObject.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
                String[] stringArray = new String[lllIIllllIlI[2]];
                stringArray[b.lllIIllllIlI[0]] = lllIIllllIIl[lllIIllllIlI[1]];
                stringArray[b.lllIIllllIlI[1]] = lllIIllllIIl[lllIIllllIlI[2]];
                if (b.lIIIlIllIIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIllllIlI[1];
                    "".length();
                    if (-" ".length() <= 0) return n2 != 0;
                    return ((0x8C ^ 0x86) & ~(0x6E ^ 0x64)) != 0;
                }
            }
            n2 = lllIIllllIlI[0];
            return n2 != 0;
        });
    }

    private static boolean lIIIlIllIIllIll(Object object) {
        return object != null;
    }

    private static String lIIIlIllIIlIIll(String lllllllllllllllIIllIIllIIIlIIIIl, String lllllllllllllllIIllIIllIIIlIIIII) {
        lllllllllllllllIIllIIllIIIlIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIllIIIIlllll = new StringBuilder();
        char[] lllllllllllllllIIllIIllIIIIllllI = lllllllllllllllIIllIIllIIIlIIIII.toCharArray();
        int lllllllllllllllIIllIIllIIIIlllIl = lllIIllllIlI[0];
        char[] lllllllllllllllIIllIIllIIIIlIlll = lllllllllllllllIIllIIllIIIlIIIIl.toCharArray();
        int lllllllllllllllIIllIIllIIIIlIllI = lllllllllllllllIIllIIllIIIIlIlll.length;
        int lllllllllllllllIIllIIllIIIIlIlIl = lllIIllllIlI[0];
        while (b.lIIIlIllIIllIII(lllllllllllllllIIllIIllIIIIlIlIl, lllllllllllllllIIllIIllIIIIlIllI)) {
            char lllllllllllllllIIllIIllIIIlIIIlI = lllllllllllllllIIllIIllIIIIlIlll[lllllllllllllllIIllIIllIIIIlIlIl];
            lllllllllllllllIIllIIllIIIIlllll.append((char)(lllllllllllllllIIllIIllIIIlIIIlI ^ lllllllllllllllIIllIIllIIIIllllI[lllllllllllllllIIllIIllIIIIlllIl % lllllllllllllllIIllIIllIIIIllllI.length]));
            "".length();
            ++lllllllllllllllIIllIIllIIIIlllIl;
            ++lllllllllllllllIIllIIllIIIIlIlIl;
            "".length();
            if (-(0xA ^ 0xE) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIllIIIIlllll);
    }

    private static void lIIIlIllIIlIllI() {
        lllIIllllIlI = new int[36];
        b.lllIIllllIlI[0] = (0x82 ^ 0x86) & ~(0x3F ^ 0x3B);
        b.lllIIllllIlI[1] = " ".length();
        b.lllIIllllIlI[2] = "  ".length();
        b.lllIIllllIlI[3] = -" ".length();
        b.lllIIllllIlI[4] = -(65 + 80 - 67 + 147) & (0xFFFF9EEB & 0x7FFE);
        b.lllIIllllIlI[5] = -(0xFFFFBFAE & 0x697B) & (0xFFFFFFBF & 0x3FEF);
        b.lllIIllllIlI[6] = 17 + 177 - 94 + 82 ^ 69 + 175 - 117 + 50;
        b.lllIIllllIlI[7] = "   ".length();
        b.lllIIllllIlI[8] = 0x80 ^ 0x85;
        b.lllIIllllIlI[9] = 0xFFFFFF77 & 0x77BF;
        b.lllIIllllIlI[10] = 0xFFFFFF38 & 0x77FF;
        b.lllIIllllIlI[11] = -(93 + 56 - 36 + 16) & (0xFFFFF7B9 & Short.MAX_VALUE);
        b.lllIIllllIlI[12] = 0xFFFFF77B & 0x7FBE;
        b.lllIIllllIlI[13] = 0x22 ^ 0x26;
        b.lllIIllllIlI[14] = 0xFFFFF7FB & 0x7F3F;
        b.lllIIllllIlI[15] = 0xC8 ^ 0xC1;
        b.lllIIllllIlI[16] = -(0xFFFFF691 & 0x79FF) & (0xFFFFFEFD & Short.MAX_VALUE);
        b.lllIIllllIlI[17] = -(0xFFFFFB2F & 0x75FA) & (0xFFFFFFFF & Short.MAX_VALUE);
        b.lllIIllllIlI[18] = -(0xFFFFFDBF & 0x63CA) & (0xFFFFFFFF & 0x6FFF);
        b.lllIIllllIlI[19] = -(0xFFFFFA57 & 0x75BE) & (0xFFFFFFFF & 0x7EF5);
        b.lllIIllllIlI[20] = 0xFFFF8FF7 & 0x7E7F;
        b.lllIIllllIlI[21] = -(0xFFFFF16F & 0x4F9E) & (0xFFFFDFFF & 0x6FFF);
        b.lllIIllllIlI[22] = -(0xFFFFFFCE & 0x5133) & (0xFFFFDFFF & 0x7F7F);
        b.lllIIllllIlI[23] = 0xFFFF9F6F & 0x6FB9;
        b.lllIIllllIlI[24] = 0xFFFF9E74 & 0x6FFF;
        b.lllIIllllIlI[25] = 0xFFFFBFA5 & 0x4F7F;
        b.lllIIllllIlI[26] = -(0xFFFFF22D & 0x3DF3) & (0xFFFFBEAB & 0x7FF7);
        b.lllIIllllIlI[27] = 0xFFFFAF92 & 0x5F6D;
        b.lllIIllllIlI[28] = 21 + 43 - 48 + 129 ^ 146 + 145 - 156 + 16;
        b.lllIIllllIlI[29] = -(0xFFFFFBDD & 0x7473) & (0xFFFFFEFF & 0x7FF7);
        b.lllIIllllIlI[30] = -(0xFFFFF8F7 & 0x17EB) & (0xFFFFDFFB & 0x3FEF);
        b.lllIIllllIlI[31] = 0xFFFFEFF7 & 0x1E6D;
        b.lllIIllllIlI[32] = -(156 + 107 - 84 + 14) & (0xFFFFFFDD & 0xFFF);
        b.lllIIllllIlI[33] = 0xB9 ^ 0xB1;
        b.lllIIllllIlI[34] = -(0xFFFFF19F & Short.MAX_VALUE) & (0xFFFFFFFF & Short.MAX_VALUE);
        b.lllIIllllIlI[35] = -(0xFFFFEAA9 & 0x555F) & (0xFFFFCF9F & 0x7F7F);
    }
}

