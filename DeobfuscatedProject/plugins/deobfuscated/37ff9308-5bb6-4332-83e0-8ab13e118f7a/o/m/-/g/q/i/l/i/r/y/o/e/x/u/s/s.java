/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import gg.squire.mixology.SquireMixology;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.t;

public class s {
    private static /* synthetic */ String[] lllllllllIIl;
    private static /* synthetic */ int[] llllllllllIl;
    private static final /* synthetic */ WorldArea af;
    public static final /* synthetic */ ThreadLocalRandom ae;

    /*
     * WARNING - void declaration
     */
    public static boolean h() {
        void lllllllllllllllIIlIIIIlIIlIIIIlI;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int lllllllllllllllIIlIIIIlIIlIIIIIl = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(lllllllllllllllIIlIIIIlIIlIIIIIl, (int)lllllllllllllllIIlIIIIlIIlIIIIlI)) {
            void lllllllllllllllIIlIIIIlIIlIIIIll;
            void lllllllllllllllIIlIIIIlIIlIIIIII = lllllllllllllllIIlIIIIlIIlIIIIll[lllllllllllllllIIlIIIIlIIlIIIIIl];
            int[] nArray = new int[llllllllllIl[2]];
            nArray[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIlIIIIII.o();
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllllllllIl[2];
            }
            ++lllllllllllllllIIlIIIIlIIlIIIIIl;
            0;
            if (-2 <= 0) continue;
            return (((0xBE ^ 0xB4) & ~(0xC ^ 6) ^ (0x6F ^ 0x37)) & (7 + 154 - 16 + 63 ^ 43 + 46 - 8 + 55 ^ -1)) != 0;
        }
        return llllllllllIl[1];
    }

    /*
     * WARNING - void declaration
     */
    public static int b(String string) {
        void lllllllllllllllIIlIIIIlIIllIlIII;
        String lllllllllllllllIIlIIIIlIIllIlIll;
        void lllllllllllllllIIlIIIIlIIllIlIIl;
        String string2 = Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[3]).getText().replaceAll(lllllllllIIl[llllllllllIl[1]], lllllllllIIl[llllllllllIl[2]]).trim();
        String string3 = Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[5]).getText().replaceAll(lllllllllIIl[llllllllllIl[3]], lllllllllIIl[llllllllllIl[0]]).trim();
        String string4 = Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[6]).getText().replaceAll(lllllllllIIl[llllllllllIl[5]], lllllllllIIl[llllllllllIl[7]]).trim();
        if (s.lIIlIlIllllIlIl(string2.equals(string) ? 1 : 0)) {
            return Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[2]).getSpriteId();
        }
        if (s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIllIlIIl.equals(lllllllllllllllIIlIIIIlIIllIlIll) ? 1 : 0)) {
            return Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[0]).getSpriteId();
        }
        if (s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIllIlIII.equals(lllllllllllllllIIlIIIIlIIllIlIll) ? 1 : 0)) {
            return Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[7]).getSpriteId();
        }
        return llllllllllIl[8];
    }

    /*
     * WARNING - void declaration
     */
    public static t d(String string) {
        void lllllllllllllllIIlIIIIlIIIlllIII;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int lllllllllllllllIIlIIIIlIIIllIlll = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(lllllllllllllllIIlIIIIlIIIllIlll, (int)lllllllllllllllIIlIIIIlIIIlllIII)) {
            String lllllllllllllllIIlIIIIlIIIlllIlI;
            void lllllllllllllllIIlIIIIlIIIlllIIl;
            void lllllllllllllllIIlIIIIlIIIllIllI = lllllllllllllllIIlIIIIlIIIlllIIl[lllllllllllllllIIlIIIIlIIIllIlll];
            if (s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIIllIllI.a().equalsIgnoreCase(lllllllllllllllIIlIIIIlIIIlllIlI) ? 1 : 0)) {
                return lllllllllllllllIIlIIIIlIIIllIllI;
            }
            ++lllllllllllllllIIlIIIIlIIIllIlll;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static t a(t ... tArray) {
        void lllllllllllllllIIlIIIIlIIlllIIlI;
        t t2 = null;
        int n2 = llllllllllIl[1];
        t[] tArray2 = tArray;
        int n3 = tArray2.length;
        int lllllllllllllllIIlIIIIlIIlllIIIl = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(lllllllllllllllIIlIIIIlIIlllIIIl, (int)lllllllllllllllIIlIIIIlIIlllIIlI)) {
            int lllllllllllllllIIlIIIIlIIlllIlII;
            void lllllllllllllllIIlIIIIlIIlllIIll;
            void lllllllllllllllIIlIIIIlIIlllIIII = lllllllllllllllIIlIIIIlIIlllIIll[lllllllllllllllIIlIIIIlIIlllIIIl];
            if (s.lIIlIlIllllIIlI(lllllllllllllllIIlIIIIlIIlllIIII) && s.lIIlIlIllllIllI(lllllllllllllllIIlIIIIlIIlllIIII.p(), lllllllllllllllIIlIIIIlIIlllIlII)) {
                lllllllllllllllIIlIIIIlIIlllIlII = lllllllllllllllIIlIIIIlIIlllIIII.p();
                void lllllllllllllllIIlIIIIlIIlllIlIl = lllllllllllllllIIlIIIIlIIlllIIII;
            }
            ++lllllllllllllllIIlIIIIlIIlllIIIl;
            0;
            if (((30 + 19 - 27 + 105 ^ (0x24 ^ 0x76)) & (1 + 124 - 29 + 58 ^ 125 + 37 - 31 + 52 ^ -1)) == 0) continue;
            return null;
        }
        return t2;
    }

    private static String lIIlIlIlllIIIll(String lllllllllllllllIIlIIIIIlllIIllIl, String lllllllllllllllIIlIIIIIlllIIllII) {
        lllllllllllllllIIlIIIIIlllIIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIIIlllIlIIII = new StringBuilder();
        char[] lllllllllllllllIIlIIIIIlllIIllll = lllllllllllllllIIlIIIIIlllIIllII.toCharArray();
        int lllllllllllllllIIlIIIIIlllIIlllI = llllllllllIl[1];
        char[] lllllllllllllllIIlIIIIIlllIIlIII = lllllllllllllllIIlIIIIIlllIIllIl.toCharArray();
        int lllllllllllllllIIlIIIIIlllIIIlll = lllllllllllllllIIlIIIIIlllIIlIII.length;
        int lllllllllllllllIIlIIIIIlllIIIllI = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(lllllllllllllllIIlIIIIIlllIIIllI, lllllllllllllllIIlIIIIIlllIIIlll)) {
            char lllllllllllllllIIlIIIIIlllIlIIll = lllllllllllllllIIlIIIIIlllIIlIII[lllllllllllllllIIlIIIIIlllIIIllI];
            lllllllllllllllIIlIIIIIlllIlIIII.append((char)(lllllllllllllllIIlIIIIIlllIlIIll ^ lllllllllllllllIIlIIIIIlllIIllll[lllllllllllllllIIlIIIIIlllIIlllI % lllllllllllllllIIlIIIIIlllIIllll.length]));
            0;
            ++lllllllllllllllIIlIIIIIlllIIlllI;
            ++lllllllllllllllIIlIIIIIlllIIIllI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIIIlllIlIIII);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean f() {
        void lllllllllllllllIIlIIIIlIIlIlIIlI;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int lllllllllllllllIIlIIIIlIIlIlIIIl = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(lllllllllllllllIIlIIIIlIIlIlIIIl, (int)lllllllllllllllIIlIIIIlIIlIlIIlI)) {
            block4: {
                block3: {
                    void lllllllllllllllIIlIIIIlIIlIlIIll;
                    void lllllllllllllllIIlIIIIlIIlIlIIII = lllllllllllllllIIlIIIIlIIlIlIIll[lllllllllllllllIIlIIIIlIIlIlIIIl];
                    int[] nArray = new int[llllllllllIl[2]];
                    nArray[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIlIlIIII.n();
                    if (!s.lIIlIlIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block3;
                    int[] nArray2 = new int[llllllllllIl[2]];
                    nArray2[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIlIlIIII.o();
                    if (!s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block4;
                }
                return llllllllllIl[2];
            }
            ++lllllllllllllllIIlIIIIlIIlIlIIIl;
            0;
            if ((0x14 ^ 0x11) > 0) continue;
            return ((0x7C ^ 0x41) & ~(0xB1 ^ 0x8C)) != 0;
        }
        return llllllllllIl[1];
    }

    public static boolean i() {
        if (s.lIIlIlIlllllIlI(Vars.getBit((int)llllllllllIl[33]))) {
            return llllllllllIl[2];
        }
        if (s.lIIlIlIlllllIlI(Vars.getBit((int)llllllllllIl[34]))) {
            return llllllllllIl[2];
        }
        if (s.lIIlIlIlllllIlI(Vars.getBit((int)llllllllllIl[35]))) {
            return llllllllllIl[2];
        }
        return llllllllllIl[1];
    }

    private static boolean lIIlIlIllllIlIl(int n2) {
        return n2 != 0;
    }

    private static String lIIlIlIlllIIIlI(String lllllllllllllllIIlIIIIIllllIIIlI, String lllllllllllllllIIlIIIIIlllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIllllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIlllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIIllllIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIIllllIIlII.init(llllllllllIl[3], lllllllllllllllIIlIIIIIllllIIlIl);
            return new String(lllllllllllllllIIlIIIIIllllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIIllllIIIll) {
            lllllllllllllllIIlIIIIIllllIIIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int e(String string) {
        void lllllllllllllllIIlIIIIlIIIIllIlI;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int lllllllllllllllIIlIIIIlIIIIllIIl = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(lllllllllllllllIIlIIIIlIIIIllIIl, (int)lllllllllllllllIIlIIIIlIIIIllIlI)) {
            String lllllllllllllllIIlIIIIlIIIIlllII;
            void lllllllllllllllIIlIIIIlIIIIllIll;
            void lllllllllllllllIIlIIIIlIIIIllIII = lllllllllllllllIIlIIIIlIIIIllIll[lllllllllllllllIIlIIIIlIIIIllIIl];
            if (s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIIIllIII.a().equalsIgnoreCase(lllllllllllllllIIlIIIIlIIIIlllII) ? 1 : 0)) {
                return lllllllllllllllIIlIIIIlIIIIllIII.o();
            }
            ++lllllllllllllllIIlIIIIlIIIIllIIl;
            0;
            if (-3 < 0) continue;
            return (0xBD ^ 0x84) & ~(0x46 ^ 0x7F);
        }
        return llllllllllIl[8];
    }

    static {
        s.lIIlIlIllllIIIl();
        s.lIIlIlIllllIIII();
        ae = ThreadLocalRandom.current();
        af = new WorldArea(llllllllllIl[41], llllllllllIl[42], llllllllllIl[27], llllllllllIl[40], llllllllllIl[1]);
    }

    private static boolean lIIlIlIllllIlll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIlllllIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIlIlIllllIIIl() {
        llllllllllIl = new int[44];
        s.llllllllllIl[0] = 3;
        s.llllllllllIl[1] = (0x97 ^ 0xA0 ^ (0x5A ^ 0x73)) & (0xCD ^ 0x80 ^ (0x7A ^ 0x29) ^ -1);
        s.llllllllllIl[2] = 1;
        s.llllllllllIl[3] = 2;
        s.llllllllllIl[4] = -(0xFFFFE74F & 0x78B5) & (0xFFFFEBF7 & 0x777E);
        s.llllllllllIl[5] = 0x79 ^ 0x3F ^ (0xE6 ^ 0xA4);
        s.llllllllllIl[6] = 7 + 7 - -120 + 1 ^ 19 + 88 - -4 + 18;
        s.llllllllllIl[7] = 0xA ^ 0x58 ^ (0x50 ^ 7);
        s.llllllllllIl[8] = -1;
        s.llllllllllIl[9] = 0xBF ^ 0xB8;
        s.llllllllllIl[10] = 0x5A ^ 0x52;
        s.llllllllllIl[11] = 0x29 ^ 0x30 ^ (0x48 ^ 0x58);
        s.llllllllllIl[12] = -(0xFFFFB9EB & 0x5797) & (0xFFFFBFFE & 0x7DBF);
        s.llllllllllIl[13] = 0xFFFFAC7F & 0x7FBD;
        s.llllllllllIl[14] = 0xFFFFACFF & 0x7F3E;
        s.llllllllllIl[15] = 0x54 ^ 0x5E;
        s.llllllllllIl[16] = 55 + 80 - -32 + 1 ^ 43 + 56 - 82 + 146;
        s.llllllllllIl[17] = 0xAF ^ 0xC5 ^ (0x6F ^ 9);
        s.llllllllllIl[18] = 0x79 ^ 0x74;
        s.llllllllllIl[19] = 0x79 ^ 0x77;
        s.llllllllllIl[20] = 0x70 ^ 0x6B ^ (3 ^ 0x17);
        s.llllllllllIl[21] = 0x26 ^ 0x36;
        s.llllllllllIl[22] = 22 + 72 - 61 + 122 ^ 51 + 106 - 82 + 63;
        s.llllllllllIl[23] = 0xD4 ^ 0xC6;
        s.llllllllllIl[24] = 0x1D ^ 0x42 ^ (0xF ^ 0x43);
        s.llllllllllIl[25] = 0x15 ^ 0x51 ^ (0 ^ 0x50);
        s.llllllllllIl[26] = 0x79 ^ 0x6C;
        s.llllllllllIl[27] = 16 + 92 - 83 + 106 ^ 11 + 46 - -41 + 51;
        s.llllllllllIl[28] = 39 + 35 - 35 + 104 ^ 23 + 34 - -48 + 47;
        s.llllllllllIl[29] = 0xC9 ^ 0x98 ^ (0x6B ^ 0x22);
        s.llllllllllIl[30] = 0x10 ^ 9;
        s.llllllllllIl[31] = 137 + 135 - 139 + 33 ^ 90 + 151 - 189 + 136;
        s.llllllllllIl[32] = 0x6F ^ 0x3E ^ (0xD7 ^ 0x9D);
        s.llllllllllIl[33] = 0xFFFFAFFF & 0x7C3F;
        s.llllllllllIl[34] = 0xFFFFBDFB & 0x6E44;
        s.llllllllllIl[35] = -(61 + 67 - 22 + 43) & (0xFFFFFFDD & 0x2CF7);
        s.llllllllllIl[36] = 119 + 90 - 78 + 28 ^ 111 + 51 - 155 + 124;
        s.llllllllllIl[37] = 0x28 ^ 0x35;
        s.llllllllllIl[38] = 7 + 122 - -19 + 13 ^ 60 + 188 - 208 + 151;
        s.llllllllllIl[39] = 0x2A ^ 0x60 ^ (0x6D ^ 0x38);
        s.llllllllllIl[40] = 5 ^ 0x25;
        s.llllllllllIl[41] = 0xFFFF95FF & 0x6F67;
        s.llllllllllIl[42] = 0xFFFFBFDF & 0x6478;
        s.llllllllllIl[43] = 0xA3 ^ 0x82;
    }

    private static boolean lIIlIlIlllllIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public static t a(String string, String string2, String string3, String string4) {
        String lllllllllllllllIIlIIIIlIlIIIllIl;
        void lllllllllllllllIIlIIIIlIlIIIlIlI;
        void lllllllllllllllIIlIIIIlIlIIIlIIl;
        Object lllllllllllllllIIlIIIIlIlIIIlIII;
        void lllllllllllllllIIlIIIIlIlIIIlIll;
        t t3;
        ArrayList<t> arrayList = new ArrayList<t>();
        if (s.lIIlIlIllllIIlI(string2) && s.lIIlIlIllllIIlI((Object)(t3 = s.d(string2)))) {
            arrayList.add(t3);
            0;
        }
        if (s.lIIlIlIllllIIlI(lllllllllllllllIIlIIIIlIlIIIlIll) && s.lIIlIlIllllIIlI(lllllllllllllllIIlIIIIlIlIIIlIII = s.d((String)lllllllllllllllIIlIIIIlIlIIIlIll))) {
            lllllllllllllllIIlIIIIlIlIIIlIIl.add(lllllllllllllllIIlIIIIlIlIIIlIII);
            0;
        }
        if (s.lIIlIlIllllIIlI(lllllllllllllllIIlIIIIlIlIIIlIlI) && s.lIIlIlIllllIIlI(lllllllllllllllIIlIIIIlIlIIIlIII = s.d((String)lllllllllllllllIIlIIIIlIlIIIlIlI))) {
            lllllllllllllllIIlIIIIlIlIIIlIIl.add(lllllllllllllllIIlIIIIlIlIIIlIII);
            0;
        }
        if (s.lIIlIlIllllIIll((lllllllllllllllIIlIIIIlIlIIIlIII = lllllllllllllllIIlIIIIlIlIIIlIIl.stream().filter(t2 -> t2.q().equalsIgnoreCase(lllllllllllllllIIlIIIIlIlIIIllIl)).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
            return lllllllllllllllIIlIIIIlIlIIIlIII.stream().max(Comparator.comparingInt(t::p)).orElse(null);
        }
        return arrayList.stream().max(Comparator.comparingInt(t::p)).orElse(null);
    }

    public static t a(String string, String string2, String string3) {
        t t2 = s.a(string);
        t t3 = s.a(string2);
        t t4 = s.a(string3);
        t[] tArray = new t[llllllllllIl[0]];
        tArray[s.llllllllllIl[1]] = t2;
        tArray[s.llllllllllIl[2]] = t3;
        tArray[s.llllllllllIl[3]] = t4;
        return s.a(tArray);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean c(String string) {
        void lllllllllllllllIIlIIIIlIIlIllllI;
        t t2 = s.d(string);
        if (s.lIIlIlIllllIlll((Object)t2)) {
            System.out.println(string);
            System.out.println(lllllllllIIl[llllllllllIl[6]]);
            return llllllllllIl[1];
        }
        String[] stringArray = new String[llllllllllIl[2]];
        stringArray[s.llllllllllIl[1]] = lllllllllIIl[llllllllllIl[9]];
        TileObject lllllllllllllllIIlIIIIlIIlIlllIl = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[llllllllllIl[2]];
        stringArray2[s.llllllllllIl[1]] = lllllllllIIl[llllllllllIl[10]];
        TileObject lllllllllllllllIIlIIIIlIIlIlllII = TileObjects.getNearest((String[])stringArray2);
        String[] stringArray3 = new String[llllllllllIl[2]];
        stringArray3[s.llllllllllIl[1]] = lllllllllIIl[llllllllllIl[11]];
        TileObject lllllllllllllllIIlIIIIlIIlIllIll = TileObjects.getNearest((String[])stringArray3);
        int lllllllllllllllIIlIIIIlIIlIllIlI = llllllllllIl[12];
        int lllllllllllllllIIlIIIIlIIlIllIIl = llllllllllIl[13];
        int lllllllllllllllIIlIIIIlIIlIllIII = llllllllllIl[14];
        if (s.lIIlIlIlllllIII(Vars.getBit((int)lllllllllllllllIIlIIIIlIIlIllIlI), lllllllllllllllIIlIIIIlIIlIllllI.m()) && s.lIIlIlIllllIIll(Vars.getBit((int)lllllllllllllllIIlIIIIlIIlIllIlI))) {
            if (s.lIIlIlIlllllIIl(lllllllllllllllIIlIIIIlIIlIllllI.m(), llllllllllIl[0])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[15]];
                lllllllllllllllIIlIIIIlIIlIlllIl.interact(lllllllllIIl[llllllllllIl[16]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(lllllllllllllllIIlIIIIlIIlIllllI.m(), llllllllllIl[2])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[17]];
                lllllllllllllllIIlIIIIlIIlIlllII.interact(lllllllllIIl[llllllllllIl[18]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(lllllllllllllllIIlIIIIlIIlIllllI.m(), llllllllllIl[3])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[19]];
                lllllllllllllllIIlIIIIlIIlIllIll.interact(lllllllllIIl[llllllllllIl[20]]);
                return llllllllllIl[1];
            }
            return llllllllllIl[1];
        }
        if (s.lIIlIlIlllllIII(Vars.getBit((int)lllllllllllllllIIlIIIIlIIlIllIIl), lllllllllllllllIIlIIIIlIIlIllllI.k()) && s.lIIlIlIllllIIll(Vars.getBit((int)lllllllllllllllIIlIIIIlIIlIllIIl))) {
            if (s.lIIlIlIlllllIIl(lllllllllllllllIIlIIIIlIIlIllllI.k(), llllllllllIl[0])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[21]];
                lllllllllllllllIIlIIIIlIIlIlllIl.interact(lllllllllIIl[llllllllllIl[22]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(lllllllllllllllIIlIIIIlIIlIllllI.k(), llllllllllIl[2])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[23]];
                lllllllllllllllIIlIIIIlIIlIlllII.interact(lllllllllIIl[llllllllllIl[24]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(lllllllllllllllIIlIIIIlIIlIllllI.k(), llllllllllIl[3])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[25]];
                lllllllllllllllIIlIIIIlIIlIllIll.interact(lllllllllIIl[llllllllllIl[26]]);
                return llllllllllIl[1];
            }
            return llllllllllIl[1];
        }
        if (s.lIIlIlIlllllIII(Vars.getBit((int)lllllllllllllllIIlIIIIlIIlIllIII), lllllllllllllllIIlIIIIlIIlIllllI.l()) && s.lIIlIlIllllIIll(Vars.getBit((int)lllllllllllllllIIlIIIIlIIlIllIII))) {
            if (s.lIIlIlIlllllIIl(lllllllllllllllIIlIIIIlIIlIllllI.l(), llllllllllIl[0])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[27]];
                lllllllllllllllIIlIIIIlIIlIlllIl.interact(lllllllllIIl[llllllllllIl[28]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(lllllllllllllllIIlIIIIlIIlIllllI.l(), llllllllllIl[2])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[29]];
                lllllllllllllllIIlIIIIlIIlIlllII.interact(lllllllllIIl[llllllllllIl[30]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(lllllllllllllllIIlIIIIlIIlIllllI.l(), llllllllllIl[3])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[31]];
                lllllllllllllllIIlIIIIlIIlIllIll.interact(lllllllllIIl[llllllllllIl[32]]);
                return llllllllllIl[1];
            }
            return llllllllllIl[1];
        }
        return llllllllllIl[2];
    }

    private static boolean lIIlIlIllllIIll(int n2) {
        return n2 == 0;
    }

    private static String lIIlIlIlllIIlII(String lllllllllllllllIIlIIIIIllIllllIl, String lllllllllllllllIIlIIIIIllIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIlllIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), llllllllllIl[10]), "DES");
            Cipher lllllllllllllllIIlIIIIIllIllllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIIllIllllll.init(llllllllllIl[3], lllllllllllllllIIlIIIIIlllIIIIII);
            return new String(lllllllllllllllIIlIIIIIllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIIllIlllllI) {
            lllllllllllllllIIlIIIIIllIlllllI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int f(String string) {
        void lllllllllllllllIIlIIIIIllllllIII;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int lllllllllllllllIIlIIIIIlllllIlll = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(lllllllllllllllIIlIIIIIlllllIlll, (int)lllllllllllllllIIlIIIIIllllllIII)) {
            String lllllllllllllllIIlIIIIIllllllIlI;
            void lllllllllllllllIIlIIIIIllllllIIl;
            void lllllllllllllllIIlIIIIIlllllIllI = lllllllllllllllIIlIIIIIllllllIIl[lllllllllllllllIIlIIIIIlllllIlll];
            if (s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIIlllllIllI.a().equalsIgnoreCase(lllllllllllllllIIlIIIIIllllllIlI) ? 1 : 0)) {
                return lllllllllllllllIIlIIIIIlllllIllI.n();
            }
            ++lllllllllllllllIIlIIIIIlllllIlll;
            0;
            if (((0x59 ^ 9 ^ (0x7F ^ 0x64)) & (126 + 18 - 54 + 51 ^ 131 + 127 - 122 + 62 ^ -1)) == 0) continue;
            return (34 + 198 - 134 + 124 ^ 64 + 18 - 69 + 115) & (0xF3 ^ 0x96 ^ (0x43 ^ 0x78) ^ -1);
        }
        return llllllllllIl[8];
    }

    private static void lIIlIlIllllIIII() {
        lllllllllIIl = new String[llllllllllIl[43]];
        s.lllllllllIIl[s.llllllllllIl[1]] = s."\\s*\\(.*?\\)";
        s.lllllllllIIl[s.llllllllllIl[2]] = s."";
        s.lllllllllIIl[s.llllllllllIl[3]] = s."\\s*\\(.*?\\)";
        s.lllllllllIIl[s.llllllllllIl[0]] = s."";
        s.lllllllllIIl[s.llllllllllIl[5]] = s."\\s*\\(.*?\\)";
        s.lllllllllIIl[s.llllllllllIl[7]] = s."";
        s.lllllllllIIl[s.llllllllllIl[6]] = s."Potion not found!";
        s.lllllllllIIl[s.llllllllllIl[9]] = s."Lye lever";
        s.lllllllllIIl[s.llllllllllIl[10]] = s."Mox lever";
        s.lllllllllIIl[s.llllllllllIl[11]] = s."Aga lever";
        s.lllllllllIIl[s.llllllllllIl[15]] = s."Operate lye lever";
        s.lllllllllIIl[s.llllllllllIl[16]] = s."Operate";
        s.lllllllllIIl[s.llllllllllIl[17]] = s."Operate mox lever";
        s.lllllllllIIl[s.llllllllllIl[18]] = s."Operate";
        s.lllllllllIIl[s.llllllllllIl[19]] = s."Operate aga lever";
        s.lllllllllIIl[s.llllllllllIl[20]] = s."Operate";
        s.lllllllllIIl[s.llllllllllIl[21]] = s."Operate lye lever";
        s.lllllllllIIl[s.llllllllllIl[22]] = s."Operate";
        s.lllllllllIIl[s.llllllllllIl[23]] = s."Operate mox lever";
        s.lllllllllIIl[s.llllllllllIl[24]] = s."Operate";
        s.lllllllllIIl[s.llllllllllIl[25]] = s."Operate aga lever";
        s.lllllllllIIl[s.llllllllllIl[26]] = s."Operate";
        s.lllllllllIIl[s.llllllllllIl[27]] = s."Operate lye lever";
        s.lllllllllIIl[s.llllllllllIl[28]] = s."Operate";
        s.lllllllllIIl[s.llllllllllIl[29]] = s."Operate mox lever";
        s.lllllllllIIl[s.llllllllllIl[30]] = s."Operate";
        s.lllllllllIIl[s.llllllllllIl[31]] = s."Operate aga lever";
        s.lllllllllIIl[s.llllllllllIl[32]] = s."Operate";
        s.lllllllllIIl[s.llllllllllIl[36]] = s."Found pot 1 finished, and pot1 = pot 2";
        s.lllllllllIIl[s.llllllllllIl[37]] = s."Found pot 1 finished, and pot1 = pot 3";
        s.lllllllllIIl[s.llllllllllIl[38]] = s."Found pot 1 finished, and pot1 = pot 3";
        s.lllllllllIIl[s.llllllllllIl[39]] = s."Found pot 2 finished and pot 2 is equal to pot 3";
        s.lllllllllIIl[s.llllllllllIl[40]] = s."NO pot 3 and found pot 3 unf";
    }

    private static boolean lIIlIlIllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIllllIllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static t a(String string) {
        void lllllllllllllllIIlIIIIlIlIIIIIII;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int lllllllllllllllIIlIIIIlIIlllllll = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(lllllllllllllllIIlIIIIlIIlllllll, (int)lllllllllllllllIIlIIIIlIlIIIIIII)) {
            String lllllllllllllllIIlIIIIlIlIIIIIlI;
            void lllllllllllllllIIlIIIIlIlIIIIIIl;
            void lllllllllllllllIIlIIIIlIIllllllI = lllllllllllllllIIlIIIIlIlIIIIIIl[lllllllllllllllIIlIIIIlIIlllllll];
            if (s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIllllllI.a().equalsIgnoreCase(lllllllllllllllIIlIIIIlIlIIIIIlI) ? 1 : 0)) {
                return lllllllllllllllIIlIIIIlIIllllllI;
            }
            ++lllllllllllllllIIlIIIIlIIlllllll;
            0;
            if (2 != 0) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(int n2, int n3, int n4) {
        void lllllllllllllllIIlIIIIIlllllIIIl;
        if (s.lIIlIlIllllIlIl(Players.getLocal().isAnimating() ? 1 : 0) && s.lIIlIlIllllIIll(SquireMixology.A ? 1 : 0)) {
            Static.getClient().getGraphicsObjects().forEach(graphicsObject -> {
                if (s.lIIlIlIlllllIIl(graphicsObject.getId(), n2) && s.lIIlIlIllllIIll(SquireMixology.A ? 1 : 0)) {
                    int[] nArray = new int[llllllllllIl[2]];
                    nArray[s.llllllllllIl[1]] = n4;
                    TileObjects.getNearest((int[])nArray).interact(llllllllllIl[1]);
                    SquireMixology.A = llllllllllIl[2];
                    return;
                }
            });
            return llllllllllIl[1];
        }
        if (s.lIIlIlIlllllIlI(Vars.getBit((int)lllllllllllllllIIlIIIIIlllllIIIl)) && s.lIIlIlIllllIIll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllllllIl[2];
        }
        if (s.lIIlIlIllllIIll(s.g() ? 1 : 0)) {
            return llllllllllIl[1];
        }
        return llllllllllIl[2];
    }

    public static boolean e() {
        return af.contains(Players.getLocal().getWorldLocation());
    }

    /*
     * WARNING - void declaration
     */
    public static void j() {
        void lllllllllllllllIIlIIIIlIIIIIIIll;
        void lllllllllllllllIIlIIIIlIIIIIIlIl;
        void lllllllllllllllIIlIIIIlIIIIIIlII;
        void lllllllllllllllIIlIIIIlIIIIIIIII;
        void lllllllllllllllIIlIIIIlIIIIIIllI;
        void lllllllllllllllIIlIIIIlIIIIIIIlI;
        void lllllllllllllllIIlIIIIlIIIIIIIIl;
        void lllllllllllllllIIlIIIIlIIIIIIlll;
        int n2 = SquireMixology.u;
        int n3 = SquireMixology.v;
        int n4 = SquireMixology.w;
        int n5 = s.f(SquireMixology.m);
        int n6 = s.e(SquireMixology.m);
        int n7 = s.f(SquireMixology.n);
        int n8 = s.e(SquireMixology.n);
        int n9 = s.f(SquireMixology.o);
        int n10 = s.e(SquireMixology.o);
        String string = SquireMixology.m;
        String string2 = SquireMixology.n;
        String string3 = SquireMixology.o;
        int[] nArray = new int[llllllllllIl[2]];
        nArray[s.llllllllllIl[1]] = n6;
        if (s.lIIlIlIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llllllllllIl[2]];
            nArray2[s.llllllllllIl[1]] = n5;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                SquireMixology.x = SquireMixology.r;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
        int[] nArray3 = new int[llllllllllIl[2]];
        nArray3[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlll;
        if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray3) ? 1 : 0) && s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIIIIIIIl.equalsIgnoreCase((String)lllllllllllllllIIlIIIIlIIIIIIIlI) ? 1 : 0)) {
            int[] nArray4 = new int[llllllllllIl[2]];
            nArray4[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIllI;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llllllllllIl[2]];
                nArray5[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlll;
                if (s.lIIlIlIlllllIIl(Inventory.getCount((int[])nArray5), llllllllllIl[2])) {
                    System.out.println(lllllllllIIl[llllllllllIl[36]]);
                    SquireMixology.x = SquireMixology.s;
                    System.out.println("Current: " + SquireMixology.x);
                    return;
                }
            }
        }
        int[] nArray6 = new int[llllllllllIl[2]];
        nArray6[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlll;
        if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray6) ? 1 : 0) && s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIIIIIIlI.equalsIgnoreCase((String)lllllllllllllllIIlIIIIlIIIIIIIII) ? 1 : 0)) {
            int[] nArray7 = new int[llllllllllIl[2]];
            nArray7[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlII;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[llllllllllIl[2]];
                nArray8[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlll;
                if (s.lIIlIlIlllllIIl(Inventory.getCount((int[])nArray8), llllllllllIl[2])) {
                    System.out.println(lllllllllIIl[llllllllllIl[37]]);
                    SquireMixology.x = SquireMixology.t;
                    System.out.println("Current: " + SquireMixology.x);
                    return;
                }
            }
        }
        int[] nArray9 = new int[llllllllllIl[2]];
        nArray9[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlll;
        if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray9) ? 1 : 0) && s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIIIIIIlI.equalsIgnoreCase((String)lllllllllllllllIIlIIIIlIIIIIIIII) ? 1 : 0)) {
            int[] nArray10 = new int[llllllllllIl[2]];
            nArray10[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlII;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[llllllllllIl[2]];
                nArray11[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlll;
                if (s.lIIlIlIlllllIIl(Inventory.getCount((int[])nArray11), llllllllllIl[3])) {
                    System.out.println(lllllllllIIl[llllllllllIl[38]]);
                    SquireMixology.x = SquireMixology.t;
                    System.out.println("Current: " + SquireMixology.x);
                    return;
                }
            }
        }
        int[] nArray12 = new int[llllllllllIl[2]];
        nArray12[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlIl;
        if (s.lIIlIlIllllIIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llllllllllIl[2]];
            nArray13[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIllI;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                SquireMixology.x = SquireMixology.s;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
        int[] nArray14 = new int[llllllllllIl[2]];
        nArray14[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlIl;
        if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray14) ? 1 : 0) && s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIIIIIIIl.equalsIgnoreCase((String)lllllllllllllllIIlIIIIlIIIIIIIII) ? 1 : 0)) {
            int[] nArray15 = new int[llllllllllIl[2]];
            nArray15[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlII;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                System.out.println(lllllllllIIl[llllllllllIl[39]]);
                SquireMixology.x = SquireMixology.t;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
        int[] nArray16 = new int[llllllllllIl[2]];
        nArray16[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIIll;
        if (s.lIIlIlIllllIIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
            int[] nArray17 = new int[llllllllllIl[2]];
            nArray17[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIIIIlII;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                System.out.println(lllllllllIIl[llllllllllIl[40]]);
                SquireMixology.x = SquireMixology.t;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
    }

    private static boolean lIIlIlIllllIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIlllllIlI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean g() {
        void lllllllllllllllIIlIIIIlIIlIIlIlI;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int lllllllllllllllIIlIIIIlIIlIIlIIl = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(lllllllllllllllIIlIIIIlIIlIIlIIl, (int)lllllllllllllllIIlIIIIlIIlIIlIlI)) {
            void lllllllllllllllIIlIIIIlIIlIIlIll;
            void lllllllllllllllIIlIIIIlIIlIIlIII = lllllllllllllllIIlIIIIlIIlIIlIll[lllllllllllllllIIlIIIIlIIlIIlIIl];
            int[] nArray = new int[llllllllllIl[2]];
            nArray[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIlIIlIII.n();
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllllllllIl[2];
            }
            ++lllllllllllllllIIlIIIIlIIlIIlIIl;
            0;
            if ((1 & ~1) != 3) continue;
            return ((0x69 ^ 0x63) & ~(0x85 ^ 0x8F)) != 0;
        }
        return llllllllllIl[1];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean b(String string, String string2, String string3) {
        int lllllllllllllllIIlIIIIlIIIlIIllI;
        int lllllllllllllllIIlIIIIlIIIlIIlll;
        int lllllllllllllllIIlIIIIlIIIlIlIII;
        void lllllllllllllllIIlIIIIlIIIlIIlII;
        int n2 = llllllllllIl[1];
        int n3 = llllllllllIl[1];
        int n4 = llllllllllIl[1];
        t[] tArray = t.values();
        int n5 = tArray.length;
        int lllllllllllllllIIlIIIIlIIIlIIIll = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(lllllllllllllllIIlIIIIlIIIlIIIll, (int)lllllllllllllllIIlIIIIlIIIlIIlII)) {
            void lllllllllllllllIIlIIIIlIIIlIlIIl;
            void lllllllllllllllIIlIIIIlIIIlIlIlI;
            String lllllllllllllllIIlIIIIlIIIlIlIll;
            void lllllllllllllllIIlIIIIlIIIlIIlIl;
            void lllllllllllllllIIlIIIIlIIIlIIIlI = lllllllllllllllIIlIIIIlIIIlIIlIl[lllllllllllllllIIlIIIIlIIIlIIIll];
            if (s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIIlIIIlI.a().equalsIgnoreCase(lllllllllllllllIIlIIIIlIIIlIlIll) ? 1 : 0)) {
                lllllllllllllllIIlIIIIlIIIlIlIII = lllllllllllllllIIlIIIIlIIIlIIIlI.o();
                0;
                if (null != null) {
                    return ((0xD7 ^ 0x99) & ~(0x8B ^ 0xC5)) != 0;
                }
            } else if (s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIIlIIIlI.a().equalsIgnoreCase((String)lllllllllllllllIIlIIIIlIIIlIlIlI) ? 1 : 0)) {
                lllllllllllllllIIlIIIIlIIIlIIlll = lllllllllllllllIIlIIIIlIIIlIIIlI.o();
                0;
                if (((0xC ^ 0x1C ^ (0x22 ^ 0x27)) & (0x65 ^ 0x57 ^ (0x50 ^ 0x77) ^ -1)) != 0) {
                    return ((0xD2 ^ 0xAE ^ (0x93 ^ 0xC0)) & (109 + 41 - 93 + 180 ^ 63 + 153 - 40 + 18 ^ -1)) != 0;
                }
            } else if (s.lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIIlIIIlI.a().equalsIgnoreCase((String)lllllllllllllllIIlIIIIlIIIlIlIIl) ? 1 : 0)) {
                lllllllllllllllIIlIIIIlIIIlIIllI = lllllllllllllllIIlIIIIlIIIlIIIlI.o();
                0;
                if (1 != 1) {
                    return ((63 + 138 - 193 + 162 ^ 99 + 57 - 71 + 50) & (0x57 ^ 0x26 ^ (0xC9 ^ 0x95) ^ -1)) != 0;
                }
            }
            ++lllllllllllllllIIlIIIIlIIIlIIIll;
            0;
            if (1 >= ((0x51 ^ 0x3B ^ (0xA ^ 0x58)) & (0x3E ^ 0x67 ^ (0xA1 ^ 0xC0) ^ -1))) continue;
            return ((0xD0 ^ 0xA2 ^ (0xC6 ^ 0xBC)) & (0xC9 ^ 0xAB ^ (0xFB ^ 0x91) ^ -1)) != 0;
        }
        int[] nArray = new int[llllllllllIl[2]];
        nArray[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIlIlIII;
        if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llllllllllIl[2]];
            nArray2[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIlIIlll;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llllllllllIl[2]];
                nArray3[s.llllllllllIl[1]] = lllllllllllllllIIlIIIIlIIIlIIllI;
                if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    return llllllllllIl[2];
                }
            }
        }
        return llllllllllIl[1];
    }
}

