/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class n
implements F {
    public static /* synthetic */ int bZ;
    public static /* synthetic */ WorldPoint bT;
    public static /* synthetic */ WorldPoint bM;
    public static /* synthetic */ WorldPoint bJ;
    public static /* synthetic */ long bW;
    public static /* synthetic */ WorldPoint bF;
    public static /* synthetic */ WorldPoint bR;
    public static /* synthetic */ int ca;
    private static /* synthetic */ int[] llIlIllI;
    public static /* synthetic */ WorldArea bY;
    public static /* synthetic */ WorldPoint bO;
    public static /* synthetic */ WorldPoint bV;
    public static /* synthetic */ WorldPoint bK;
    public static /* synthetic */ WorldPoint bN;
    public static /* synthetic */ String[] bX;
    public static /* synthetic */ WorldPoint bP;
    public static /* synthetic */ WorldPoint bQ;
    private static /* synthetic */ String[] llIlIlIl;
    static /* synthetic */ int cb;
    public static /* synthetic */ WorldPoint bG;
    public static /* synthetic */ WorldPoint bI;
    public static /* synthetic */ WorldPoint bL;
    public static /* synthetic */ WorldPoint bU;
    public static /* synthetic */ WorldPoint bH;
    public static /* synthetic */ WorldPoint bS;

    private static void lIllIIIllII() {
        llIlIllI = new int[68];
        n.llIlIllI[0] = " ".length();
        n.llIlIllI[1] = (0x5B ^ 0x76) & ~(0x98 ^ 0xB5);
        n.llIlIllI[2] = -(0xFFFFF8BB & 0x77C5) & (0xFFFFF3FF & 0x7DFB);
        n.llIlIllI[3] = "  ".length();
        n.llIlIllI[4] = 0xFFFFB7DC & 0x5BAB;
        n.llIlIllI[5] = 4 ^ 0x1C;
        n.llIlIllI[6] = -(0x79 ^ 0x72) & (0xFFFFB95F & 0x77FB);
        n.llIlIllI[7] = 0xFFFFDFEF & 0x3F59;
        n.llIlIllI[8] = 0xAC ^ 0xA6;
        n.llIlIllI[9] = 0xFFFFBFFB & 0x967C4;
        n.llIlIllI[10] = "   ".length();
        n.llIlIllI[11] = 0x14 ^ 0x5C ^ (0x9D ^ 0x93);
        n.llIlIllI[12] = 0x30 ^ 0x34;
        n.llIlIllI[13] = 0x85 ^ 0x80;
        n.llIlIllI[14] = 0x1D ^ 0x1B;
        n.llIlIllI[15] = 6 ^ 0x34 ^ (0x20 ^ 0x15);
        n.llIlIllI[16] = 0x10 ^ 0x18;
        n.llIlIllI[17] = 0x64 ^ 0x6D;
        n.llIlIllI[18] = 0x8C ^ 0xC2 ^ (0xD1 ^ 0x94);
        n.llIlIllI[19] = 75 + 96 - 170 + 177 ^ 168 + 182 - 230 + 70;
        n.llIlIllI[20] = 0x9D ^ 0x90;
        n.llIlIllI[21] = 107 + 11 - 98 + 169 ^ 18 + 11 - -40 + 110;
        n.llIlIllI[22] = 9 + 39 - -39 + 43 ^ 120 + 90 - 158 + 89;
        n.llIlIllI[23] = 0x68 ^ 0x11 ^ (0x1C ^ 0x75);
        n.llIlIllI[24] = 0xFFFFCFFF & 0x3BBC;
        n.llIlIllI[25] = 0xFFFFBFAE & 0x4CF1;
        n.llIlIllI[26] = 112 + 187 - 275 + 195 ^ 113 + 101 - 196 + 136;
        n.llIlIllI[27] = 0x40 ^ 0x67;
        n.llIlIllI[28] = -(0xFFFFFF37 & 0x44CB) & (0xFFFFEFEF & 0x5FFF);
        n.llIlIllI[29] = -(0xFFFFFBDD & 0x4463) & (0xFFFFDEEF & 0x6DFF);
        n.llIlIllI[30] = 0x6F ^ 0x7E;
        n.llIlIllI[31] = -(0xFFFFC73E & 0x3DE5) & (0xFFFFBFBF & 0x7FFB);
        n.llIlIllI[32] = 0xFFFFFFF2 & 0x753D;
        n.llIlIllI[33] = 0xBA ^ 0xBD ^ (0x42 ^ 0x21);
        n.llIlIllI[34] = 0xD5 ^ 0x83 ^ (0xF2 ^ 0xB6);
        n.llIlIllI[35] = 51 + 221 - 168 + 141 ^ 85 + 1 - 72 + 136;
        n.llIlIllI[36] = 0xE6 ^ 0xA7 ^ (0x30 ^ 0x62);
        n.llIlIllI[37] = 0xFFFFCFF1 & 0x36FE;
        n.llIlIllI[38] = -(0xFFFFEF3B & 0x50C7) & (0xFFFFEFDE & 0x5DAF);
        n.llIlIllI[39] = 0xFFFFC7F0 & 0x3F0F;
        n.llIlIllI[40] = -(0xFFFFF7EF & 0x2A52) & (0xFFFFFFFF & 0x2FF5);
        n.llIlIllI[41] = -(0xFFFFCB35 & 0x7DFF) & (0xFFFFCFFD & Short.MAX_VALUE);
        n.llIlIllI[42] = -(0xFFFFFA1B & 0x17E5) & (0xFFFF9FAF & 0x7FDD);
        n.llIlIllI[43] = -(0xFFFFFF8F & 0x5171) & (0xFFFFF7CE & 0x5FF5);
        n.llIlIllI[44] = -(0xFFFFFEEF & 0x735D) & (0xFFFFFFFE & 0x7FFD);
        n.llIlIllI[45] = 0xFFFF9EFE & 0x67FF;
        n.llIlIllI[46] = 0xFFFFBEFF & 0x47FA;
        n.llIlIllI[47] = 0xFFFFADAF & 0x5FFF;
        n.llIlIllI[48] = 0xFFFF8EEF & 0x77F5;
        n.llIlIllI[49] = 0xFFFFBEEF & 0x47F6;
        n.llIlIllI[50] = -(0xFFFFE2FF & 0x5F19) & (0xFFFFFFFB & 0x4FDF);
        n.llIlIllI[51] = -(0xFFFFFF73 & 0x788D) & (0xFFFFFEDF & 0x7FF5);
        n.llIlIllI[52] = 0xFFFF8EBF & 0x77CB;
        n.llIlIllI[53] = 0xFFFFDFF7 & 0x2D9E;
        n.llIlIllI[54] = 0xFFFFB6FD & 0x4FB7;
        n.llIlIllI[55] = 0xFFFFFFFB & 0xD8F;
        n.llIlIllI[56] = 0xFFFF8EED & 0x77FF;
        n.llIlIllI[57] = 0xFFFFEDF7 & 0x1F8D;
        n.llIlIllI[58] = 0xFFFFCFFE & 0x3BEF;
        n.llIlIllI[59] = 0xFFFFBFFE & 0x4CAF;
        n.llIlIllI[60] = 0x42 ^ 0x56;
        n.llIlIllI[61] = 0x1C ^ 9;
        n.llIlIllI[62] = 0x71 ^ 0x6E ^ (0x25 ^ 0x2C);
        n.llIlIllI[63] = 0xFFFF84EE & 0x7F9F;
        n.llIlIllI[64] = 0xFFFF8FFD & 0x7D3A;
        n.llIlIllI[65] = 0xFFFFEBBB & 0x1757;
        n.llIlIllI[66] = -(0xFFFFBF89 & 0x757F) & (0xFFFFB7FF & 0x7FBF);
        n.llIlIllI[67] = 0xA7 ^ 0xB2 ^ "  ".length();
    }

    static {
        n.lIllIIIllII();
        n.lIllIIIlIll();
        bF = new WorldPoint(llIlIllI[37], llIlIllI[38], llIlIllI[1]);
        bG = new WorldPoint(llIlIllI[39], llIlIllI[40], llIlIllI[1]);
        bH = new WorldPoint(llIlIllI[41], llIlIllI[42], llIlIllI[1]);
        bI = new WorldPoint(llIlIllI[43], llIlIllI[44], llIlIllI[1]);
        bJ = new WorldPoint(llIlIllI[45], llIlIllI[38], llIlIllI[1]);
        bK = new WorldPoint(llIlIllI[46], llIlIllI[47], llIlIllI[1]);
        bL = new WorldPoint(llIlIllI[39], llIlIllI[40], llIlIllI[1]);
        bM = new WorldPoint(llIlIllI[48], llIlIllI[38], llIlIllI[1]);
        bN = new WorldPoint(llIlIllI[49], llIlIllI[50], llIlIllI[1]);
        bO = new WorldPoint(llIlIllI[51], llIlIllI[42], llIlIllI[1]);
        bP = new WorldPoint(llIlIllI[49], llIlIllI[50], llIlIllI[1]);
        bQ = new WorldPoint(llIlIllI[52], llIlIllI[53], llIlIllI[1]);
        bR = new WorldPoint(llIlIllI[54], llIlIllI[55], llIlIllI[1]);
        bS = new WorldPoint(llIlIllI[56], llIlIllI[57], llIlIllI[1]);
        bT = new WorldPoint(llIlIllI[39], llIlIllI[40], llIlIllI[1]);
        bU = new WorldPoint(llIlIllI[58], llIlIllI[59], llIlIllI[1]);
        bV = new WorldPoint(llIlIllI[37], llIlIllI[38], llIlIllI[1]);
        bW = System.currentTimeMillis();
        String[] stringArray = new String[llIlIllI[10]];
        stringArray[n.llIlIllI[1]] = llIlIlIl[llIlIllI[60]];
        stringArray[n.llIlIllI[0]] = llIlIlIl[llIlIllI[61]];
        stringArray[n.llIlIllI[3]] = llIlIlIl[llIlIllI[62]];
        bX = stringArray;
        bY = new WorldArea(llIlIllI[63], llIlIllI[64], llIlIllI[65], llIlIllI[66], llIlIllI[1]);
        bZ = llIlIllI[1];
        cb = e.c(llIlIllI[31], llIlIllI[32]);
    }

    private static boolean lIllIIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIllll(Object object) {
        return object != null;
    }

    private static String lIllIIIlIlI(String lIlIIlIlllIIIIl, String lIlIIlIlllIIIII) {
        try {
            SecretKeySpec lIlIIlIlllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), llIlIllI[16]), "DES");
            Cipher lIlIIlIlllIIIll = Cipher.getInstance("DES");
            lIlIIlIlllIIIll.init(llIlIllI[3], lIlIIlIlllIIlII);
            return new String(lIlIIlIlllIIIll.doFinal(Base64.getDecoder().decode(lIlIIlIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlIlllIIIlI) {
            lIlIIlIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static int lIllIIlIIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean aw() {
        WorldArea worldArea = new WorldArea(bV, llIlIllI[10], llIlIllI[10]);
        List list = Players.getAll();
        if (n.lIllIIIlllI(list.isEmpty() ? 1 : 0) && n.lIllIIlIlIl(list.size(), llIlIllI[0])) {
            void lIlIIllIIIlIIll;
            int lIlIIllIIIlIIlI = llIlIllI[1];
            while (n.lIllIIIllIl(lIlIIllIIIlIIlI, lIlIIllIIIlIIll.size())) {
                void lIlIIllIIIlIlII;
                if (n.lIllIIlIIII(((Player)lIlIIllIIIlIIll.get(lIlIIllIIIlIIlI)).equals(Players.getLocal()) ? 1 : 0)) {
                    "".length();
                    if (" ".length() == -" ".length()) {
                        return ((0x1F ^ 0xB) & ~(9 ^ 0x1D)) != 0;
                    }
                } else if (n.lIllIIlIIII(lIlIIllIIIlIlII.contains(((Player)lIlIIllIIIlIIll.get(lIlIIllIIIlIIlI)).getWorldLocation()) ? 1 : 0)) {
                    return llIlIllI[0];
                }
                ++lIlIIllIIIlIIlI;
                "".length();
                if ("   ".length() > -" ".length()) continue;
                return ((44 + 81 - 20 + 42 ^ 96 + 33 - 57 + 127) & (0xDC ^ 0x8B ^ "   ".length() ^ -" ".length())) != 0;
            }
        }
        return llIlIllI[1];
    }

    private static boolean lIllIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIlIIIl(int n2) {
        return n2 > 0;
    }

    private static int lIllIIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    static NPC av() {
        WorldPoint worldPoint = bV;
        WorldPoint worldPoint2 = new WorldPoint(bV.getX() - llIlIllI[0], bV.getWorldY() + llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint3 = new WorldPoint(bV.getX(), bV.getWorldY() + llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint4 = new WorldPoint(bV.getX() + llIlIllI[0], bV.getWorldY() + llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint5 = new WorldPoint(bV.getX() + llIlIllI[0], bV.getWorldY(), llIlIllI[1]);
        WorldPoint worldPoint6 = new WorldPoint(bV.getX() + llIlIllI[0], bV.getWorldY() - llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint7 = new WorldPoint(bV.getX(), bV.getWorldY() - llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint8 = new WorldPoint(bV.getX() - llIlIllI[0], bV.getWorldY() - llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint9 = new WorldPoint(bV.getX() - llIlIllI[0], bV.getWorldY(), llIlIllI[1]);
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(llIlIlIl[llIlIllI[36]]));
        if (n.lIllIIIllll(list)) {
            void lIlIIllIIIllIlI;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int lIlIIllIIIllIII = llIlIllI[1];
            while (n.lIllIIIllIl(lIlIIllIIIllIII, lIlIIllIIIllIlI.size())) {
                void lIlIIllIIIllIIl;
                if (n.lIllIIlIIII(lIlIIllIIIllIIl.contains(((NPC)lIlIIllIIIllIlI.get(lIlIIllIIIllIII)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)lIlIIllIIIllIlI.get(lIlIIllIIIllIII);
                }
                ++lIlIIllIIIllIII;
                "".length();
                if (" ".length() >= -" ".length()) continue;
                return null;
            }
        }
        return null;
    }

    private static boolean lIllIIlIlII(int n2) {
        return n2 < 0;
    }

    private static boolean lIllIIllIII(int n2) {
        return n2 >= 0;
    }

    private static void at() {
        if (n.lIllIIIllIl(ca, llIlIllI[0])) {
            bW = System.currentTimeMillis();
            System.out.println(llIlIlIl[llIlIllI[1]]);
            ca += llIlIllI[0];
        }
        int[] nArray = new int[llIlIllI[0]];
        nArray[n.llIlIllI[1]] = llIlIllI[2];
        if (n.lIllIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation lIlIIllIIllIlII = BankLocation.getNearest();
            if (n.lIllIIIllll(lIlIIllIIllIlII) && n.lIllIIIlllI(lIlIIllIIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = llIlIlIl[llIlIllI[0]];
                a.a(lIlIIllIIllIlII);
            }
            if (n.lIllIIIllll(lIlIIllIIllIlII) && n.lIllIIlIIII(lIlIIllIIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = llIlIlIl[llIlIllI[3]];
                if (n.lIllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllI[4]);
                    "".length();
                }
                if (n.lIllIIlIIII(Bank.isOpen() ? 1 : 0)) {
                    if (n.lIllIIlIIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llIlIllI[0]);
                        "".length();
                    }
                    a.a(llIlIllI[2], llIlIllI[5]);
                    a.a(llIlIllI[6], llIlIllI[0]);
                    a.a(llIlIllI[7], llIlIllI[8]);
                }
            }
        }
        int[] nArray2 = new int[llIlIllI[0]];
        nArray2[n.llIlIllI[1]] = llIlIllI[2];
        if (n.lIllIIlIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            n.au();
        }
    }

    public static void au() {
        NPC lIlIIllIIllIIII;
        WorldArea lIlIIllIIllIIIl;
        if (n.lIllIIlIlII(n.lIllIIlIIlI(e.a(bW), llIlIllI[9] + cb))) {
            if (n.lIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)bV) ? 1 : 0)) {
                AccBuilderBarrows.c = llIlIlIl[llIlIllI[10]];
                if (n.lIllIIIllIl(Movement.getRunEnergy(), llIlIllI[11]) && n.lIllIIlIIII(Inventory.contains((int[])f.bb) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.bb).interact(llIlIlIl[llIlIllI[12]]);
                    Time.sleepTicks((int)llIlIllI[0]);
                    "".length();
                }
                if (n.lIllIIIlllI(bY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (n.lIllIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(bU), llIlIllI[10])) {
                        AccBuilderBarrows.c = llIlIlIl[llIlIllI[13]];
                        Movement.walkTo((WorldPoint)bU);
                        "".length();
                        Time.sleepTicks((int)llIlIllI[0]);
                        "".length();
                    }
                    if (n.lIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(bU), llIlIllI[10])) {
                        AccBuilderBarrows.c = llIlIlIl[llIlIllI[14]];
                        if (n.lIllIIIllIl(bZ, llIlIllI[0])) {
                            e.w();
                            bZ += llIlIllI[0];
                        }
                        String[] stringArray = new String[llIlIllI[0]];
                        stringArray[n.llIlIllI[1]] = llIlIlIl[llIlIllI[15]];
                        lIlIIllIIllIIIl = NPCs.getNearest((String[])stringArray);
                        if (n.lIllIIIllll(lIlIIllIIllIIIl)) {
                            String[] stringArray2 = new String[llIlIllI[0]];
                            stringArray2[n.llIlIllI[1]] = llIlIlIl[llIlIllI[16]];
                            if (n.lIllIIlIIII(lIlIIllIIllIIIl.hasAction(stringArray2) ? 1 : 0)) {
                                lIlIIllIIllIIIl.interact(llIlIlIl[llIlIllI[17]]);
                                Time.sleepTicks((int)llIlIllI[10]);
                                "".length();
                            }
                            String[] stringArray3 = new String[llIlIllI[0]];
                            stringArray3[n.llIlIllI[1]] = llIlIlIl[llIlIllI[8]];
                            if (n.lIllIIIlllI(lIlIIllIIllIIIl.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(llIlIlIl[llIlIllI[18]], bX);
                                Time.sleepTicks((int)llIlIllI[0]);
                                "".length();
                            }
                        }
                    }
                }
                if (n.lIllIIlIIII(bY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)bV);
                    "".length();
                    Time.sleepTicks((int)llIlIllI[0]);
                    "".length();
                }
            }
            if (n.lIllIIlIIII(Players.getLocal().getWorldLocation().equals((Object)bV) ? 1 : 0)) {
                if (n.lIllIIlIlII(n.lIllIIlIIll(e.v(), 45.0))) {
                    int[] nArray = new int[llIlIllI[0]];
                    nArray[n.llIlIllI[1]] = llIlIllI[2];
                    if (n.lIllIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIlIllI[0]];
                        nArray2[n.llIlIllI[1]] = llIlIllI[2];
                        Inventory.getFirst((int[])nArray2).interact(llIlIlIl[llIlIllI[19]]);
                        Time.sleepTicks((int)llIlIllI[0]);
                        "".length();
                    }
                }
                if (n.lIllIIIlllI(n.aw() ? 1 : 0)) {
                    AccBuilderBarrows.c = llIlIlIl[llIlIllI[20]];
                    Time.sleepTicks((int)llIlIllI[15]);
                    "".length();
                }
                if (n.lIllIIlIIII(n.aw() ? 1 : 0)) {
                    lIlIIllIIllIIIl = new WorldArea(bV, llIlIllI[3], llIlIllI[3]);
                    lIlIIllIIllIIII = n.av();
                    AccBuilderBarrows.c = llIlIlIl[llIlIllI[21]];
                    if (n.lIllIIlIlll(Players.getLocal().getInteracting()) && n.lIllIIIllll(lIlIIllIIllIIII) && n.lIllIIIlllI(lIlIIllIIllIIII.isDead() ? 1 : 0)) {
                        System.out.println(llIlIlIl[llIlIllI[22]]);
                        lIlIIllIIllIIII.interact(llIlIlIl[llIlIllI[23]]);
                        Time.sleepTicks((int)llIlIllI[3]);
                        "".length();
                    }
                    Time.sleepTicks((int)llIlIllI[12]);
                    "".length();
                }
            }
        }
        if (n.lIllIIllIII(n.lIllIIlIIlI(e.a(bW), llIlIllI[9] + cb))) {
            lIlIIllIIllIIIl = new WorldArea(llIlIllI[24], llIlIllI[25], llIlIllI[26], llIlIllI[27], llIlIllI[1]);
            lIlIIllIIllIIII = new WorldPoint(llIlIllI[28], llIlIllI[29], llIlIllI[1]);
            if (n.lIllIIlIIII(lIlIIllIIllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIllIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIllIIllIIII), llIlIllI[13])) {
                Movement.walkTo((WorldPoint)lIlIIllIIllIIII);
                "".length();
            }
            AccBuilderBarrows.c = llIlIlIl[llIlIllI[30]];
            Movement.walkTo((WorldPoint)bL);
            "".length();
            Time.sleepTicks((int)llIlIllI[0]);
            "".length();
            if (n.lIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(bL), llIlIllI[3])) {
                bW = System.currentTimeMillis();
                cb = e.c(llIlIllI[31], llIlIllI[32]);
            }
        }
    }

    private static boolean lIllIIlIIII(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIlIIl(String lIlIIlIlllllllI, String lIlIIlIllllllIl) {
        lIlIIlIlllllllI = new String(Base64.getDecoder().decode(lIlIIlIlllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIllIIIIIIIl = new StringBuilder();
        char[] lIlIIllIIIIIIII = lIlIIlIllllllIl.toCharArray();
        int lIlIIlIllllllll = llIlIllI[1];
        char[] lIlIIlIlllllIIl = lIlIIlIlllllllI.toCharArray();
        int lIlIIlIlllllIII = lIlIIlIlllllIIl.length;
        int lIlIIlIllllIlll = llIlIllI[1];
        while (n.lIllIIIllIl(lIlIIlIllllIlll, lIlIIlIlllllIII)) {
            char lIlIIllIIIIIlII = lIlIIlIlllllIIl[lIlIIlIllllIlll];
            lIlIIllIIIIIIIl.append((char)(lIlIIllIIIIIlII ^ lIlIIllIIIIIIII[lIlIIlIllllllll % lIlIIllIIIIIIII.length]));
            "".length();
            ++lIlIIlIllllllll;
            ++lIlIIlIllllIlll;
            "".length();
            if (-(0x5B ^ 0x5F) <= 0) continue;
            return null;
        }
        return String.valueOf(lIlIIllIIIIIIIl);
    }

    private static String lIllIIIlIII(String lIlIIlIlllIllII, String lIlIIlIlllIllIl) {
        try {
            SecretKeySpec lIlIIlIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIlIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIlIllllIIII = Cipher.getInstance("Blowfish");
            lIlIIlIllllIIII.init(llIlIllI[3], lIlIIlIllllIIIl);
            return new String(lIlIIlIllllIIII.doFinal(Base64.getDecoder().decode(lIlIIlIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlIlllIllll) {
            lIlIIlIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean T() {
        return llIlIllI[1];
    }

    private static boolean lIllIIlIlll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public static void ax() {
        void lIlIIllIIIlIIII;
        int n2 = e.c(llIlIllI[0], llIlIllI[13]);
        if (n.lIllIIllIIl(n2, llIlIllI[0])) {
            bV = bF;
            bL = bG;
        }
        if (n.lIllIIllIIl((int)lIlIIllIIIlIIII, llIlIllI[3])) {
            bV = bM;
            bL = bN;
        }
        if (n.lIllIIllIIl((int)lIlIIllIIIlIIII, llIlIllI[10])) {
            bV = bO;
            bL = bP;
        }
        if (n.lIllIIllIIl((int)lIlIIllIIIlIIII, llIlIllI[12])) {
            bV = bQ;
            bL = bR;
        }
        if (n.lIllIIllIIl((int)lIlIIllIIIlIIII, llIlIllI[13])) {
            bV = bS;
            bL = bT;
        }
    }

    @Override
    public int U() {
        try {
            n.at();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (" ".length() == 0) {
            return (0xA3 ^ 0x8C ^ (0x53 ^ 0x2F)) & (193 + 129 - 124 + 35 ^ 182 + 168 - 340 + 176 ^ -" ".length());
        }
        return llIlIllI[33];
    }

    private static boolean lIllIIIlllI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean W() {
        int n2;
        if (n.lIllIIllIlI(Skills.getLevel((Skill)Skill.RANGED), llIlIllI[35]) && n.lIllIIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIllI[35])) {
            n2 = llIlIllI[0];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x8F ^ 0x9B ^ (0xF9 ^ 0xB1)) & (35 + 107 - -29 + 78 ^ 100 + 84 - 60 + 41 ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIlIllI[1];
        }
        return n2 != 0;
    }

    @Override
    public String V() {
        return llIlIlIl[llIlIllI[34]];
    }

    private static boolean lIllIIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIllIIIlIll() {
        llIlIlIl = new String[llIlIllI[67]];
        n.llIlIlIl[n.llIlIllI[1]] = n.lIllIIIlIII("czPlHF446kxkPh7e3A4lPb6oAQKVecRq", "fiOfr");
        n.llIlIlIl[n.llIlIllI[0]] = n.lIllIIIlIII("WvRgq/qGvxwh03XTQXPVDKwZn5E1fK2a", "VfYBh");
        n.llIlIlIl[n.llIlIllI[3]] = n.lIllIIIlIIl("JhQMFyMHGwVTLQ8bCRohCQ==", "nubsO");
        n.llIlIlIl[n.llIlIllI[10]] = n.lIllIIIlIII("Gdb8Xo+8s5BwfDxlfKdMOhlO780TfgYa", "LAPCI");
        n.llIlIlIl[n.llIlIllI[12]] = n.lIllIIIlIlI("piHSN3l88x4=", "VUrwl");
        n.llIlIlIl[n.llIlIllI[13]] = n.lIllIIIlIlI("62RUXGtO+ITiwtM4ztuQBA==", "sLHFG");
        n.llIlIlIl[n.llIlIllI[14]] = n.lIllIIIlIIl("JxAWNx4KUQ42HRxRGzsTGw==", "oqxSr");
        n.llIlIlIl[n.llIlIllI[15]] = n.lIllIIIlIII("8D4yaxVPEJg=", "gjQoK");
        n.llIlIlIl[n.llIlIllI[16]] = n.lIllIIIlIlI("psvzIGTlNGp3TfKk3Qyus4iVgRhCRbJ7", "XBMEV");
        n.llIlIlIl[n.llIlIllI[17]] = n.lIllIIIlIII("X3bKVgSCAXhr2ZRxX/TtXVPfN6h/aPYI", "oarQa");
        n.llIlIlIl[n.llIlIllI[8]] = n.lIllIIIlIlI("LBNz018rgdCU/sF770k3SmtLX7RQizn0", "nBEkR");
        n.llIlIlIl[n.llIlIllI[18]] = n.lIllIIIlIIl("PRc7Jw==", "krTTD");
        n.llIlIlIl[n.llIlIllI[19]] = n.lIllIIIlIII("AkvPC+D3H6M=", "PLbGI");
        n.llIlIlIl[n.llIlIllI[20]] = n.lIllIIIlIII("6vVXbqeIz0W0Xy7je242Gw==", "RRJMK");
        n.llIlIlIl[n.llIlIllI[21]] = n.lIllIIIlIII("ohfdkF14wZRqK9vNOVwLKw==", "oBCFT");
        n.llIlIlIl[n.llIlIllI[22]] = n.lIllIIIlIIl("Fj0EMi88IB40bDQ7ESAkMi0=", "WIpSL");
        n.llIlIlIl[n.llIlIllI[23]] = n.lIllIIIlIII("hZF0EcBoNNE=", "FKnrC");
        n.llIlIlIl[n.llIlIllI[30]] = n.lIllIIIlIlI("TDB4weyUvQDOm4OXgd1yfQ==", "MhTwX");
        n.llIlIlIl[n.llIlIllI[34]] = n.lIllIIIlIIl("JCU7Nlk0NjQwCg==", "wDURy");
        n.llIlIlIl[n.llIlIllI[36]] = n.lIllIIIlIIl("IjcFDGgyJAoK", "QVkhH");
        n.llIlIlIl[n.llIlIllI[60]] = n.lIllIIIlIlI("6khtLCoislOfPUtlLt7b7f7gyhwRlMgNN0IkF22G0/dixtJeLNPy02rPwIRKu7/H", "FbIsE");
        n.llIlIlIl[n.llIlIllI[61]] = n.lIllIIIlIII("aYQmVM23w1biSfQmIUojMyrKo4kXdSB2fS1I5Amu+E95j+K8Aut/Ew==", "njshJ");
        n.llIlIlIl[n.llIlIllI[62]] = n.lIllIIIlIlI("r+S088nRYc+0uMQC+phbdQ==", "atePZ");
    }
}

