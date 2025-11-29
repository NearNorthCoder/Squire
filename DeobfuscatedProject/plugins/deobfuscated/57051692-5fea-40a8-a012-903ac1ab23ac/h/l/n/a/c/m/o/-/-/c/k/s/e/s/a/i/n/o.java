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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
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

public class o
implements K {
    public static /* synthetic */ String[] cy;
    public static /* synthetic */ int cA;
    public static /* synthetic */ WorldPoint ct;
    public static /* synthetic */ long cx;
    public static /* synthetic */ WorldPoint ch;
    public static /* synthetic */ WorldPoint cl;
    private static /* synthetic */ int[] lIllIlllIl;
    public static /* synthetic */ WorldPoint cs;
    public static /* synthetic */ WorldPoint cv;
    public static /* synthetic */ WorldPoint cj;
    public static /* synthetic */ int cB;
    public static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ WorldPoint cq;
    public static /* synthetic */ WorldArea cz;
    public static /* synthetic */ WorldPoint cm;
    public static /* synthetic */ WorldPoint cw;
    public static /* synthetic */ WorldPoint cg;
    public static /* synthetic */ WorldPoint cn;
    public static /* synthetic */ WorldPoint cp;
    static /* synthetic */ int cC;
    private static /* synthetic */ String[] lIllIlllII;
    public static /* synthetic */ WorldPoint cu;
    public static /* synthetic */ WorldPoint co;
    public static /* synthetic */ WorldPoint cr;
    public static /* synthetic */ WorldPoint ci;

    static {
        o.lIIllIlIlIIIl();
        o.lIIllIlIlIIII();
        cg = new WorldPoint(lIllIlllIl[37], lIllIlllIl[38], lIllIlllIl[1]);
        ch = new WorldPoint(lIllIlllIl[39], lIllIlllIl[40], lIllIlllIl[1]);
        ci = new WorldPoint(lIllIlllIl[41], lIllIlllIl[42], lIllIlllIl[1]);
        cj = new WorldPoint(lIllIlllIl[43], lIllIlllIl[44], lIllIlllIl[1]);
        ck = new WorldPoint(lIllIlllIl[45], lIllIlllIl[38], lIllIlllIl[1]);
        cl = new WorldPoint(lIllIlllIl[46], lIllIlllIl[47], lIllIlllIl[1]);
        cm = new WorldPoint(lIllIlllIl[39], lIllIlllIl[40], lIllIlllIl[1]);
        cn = new WorldPoint(lIllIlllIl[48], lIllIlllIl[38], lIllIlllIl[1]);
        co = new WorldPoint(lIllIlllIl[49], lIllIlllIl[50], lIllIlllIl[1]);
        cp = new WorldPoint(lIllIlllIl[51], lIllIlllIl[42], lIllIlllIl[1]);
        cq = new WorldPoint(lIllIlllIl[49], lIllIlllIl[50], lIllIlllIl[1]);
        cr = new WorldPoint(lIllIlllIl[52], lIllIlllIl[53], lIllIlllIl[1]);
        cs = new WorldPoint(lIllIlllIl[54], lIllIlllIl[55], lIllIlllIl[1]);
        ct = new WorldPoint(lIllIlllIl[56], lIllIlllIl[57], lIllIlllIl[1]);
        cu = new WorldPoint(lIllIlllIl[39], lIllIlllIl[40], lIllIlllIl[1]);
        cv = new WorldPoint(lIllIlllIl[58], lIllIlllIl[59], lIllIlllIl[1]);
        cw = new WorldPoint(lIllIlllIl[37], lIllIlllIl[38], lIllIlllIl[1]);
        cx = System.currentTimeMillis();
        String[] stringArray = new String[lIllIlllIl[10]];
        stringArray[o.lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[60]];
        stringArray[o.lIllIlllIl[0]] = lIllIlllII[lIllIlllIl[61]];
        stringArray[o.lIllIlllIl[3]] = lIllIlllII[lIllIlllIl[62]];
        cy = stringArray;
        cz = new WorldArea(lIllIlllIl[63], lIllIlllIl[64], lIllIlllIl[65], lIllIlllIl[66], lIllIlllIl[1]);
        cA = lIllIlllIl[1];
        cC = e.c(lIllIlllIl[31], lIllIlllIl[32]);
    }

    private static boolean lIIllIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private static int lIIllIlIlIlll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static void lIIllIlIlIIIl() {
        lIllIlllIl = new int[68];
        o.lIllIlllIl[0] = 1;
        o.lIllIlllIl[1] = (0x51 ^ 0x79) & ~(0x3E ^ 0x16);
        o.lIllIlllIl[2] = -(0xFFFFB695 & 0x5DEF) & (0xFFFFDFFF & 0x35FF);
        o.lIllIlllIl[3] = 2;
        o.lIllIlllIl[4] = -(0xF4 ^ 0x85) & (0xFFFFB3FD & 0x5FFA);
        o.lIllIlllIl[5] = 0xD5 ^ 0xAB ^ (0xB ^ 0x6D);
        o.lIllIlllIl[6] = -(0xFFFFCF1F & 0x7CEF) & (0xFFFFFDFF & 0x7F5F);
        o.lIllIlllIl[7] = 0xFFFF9FFF & 0x7F49;
        o.lIllIlllIl[8] = 0xA3 ^ 0xA9;
        o.lIllIlllIl[9] = -(0xFFFFFC6D & 0x1BBF) & (0xFFFFBFEC & 0x97FFF);
        o.lIllIlllIl[10] = 3;
        o.lIllIlllIl[11] = 0x65 ^ 0x55 ^ (0x7C ^ 0xA);
        o.lIllIlllIl[12] = 0xBD ^ 0xB9;
        o.lIllIlllIl[13] = 0xB6 ^ 0xB3;
        o.lIllIlllIl[14] = 0xF2 ^ 0x89 ^ (0xE4 ^ 0x99);
        o.lIllIlllIl[15] = 0x41 ^ 0x46;
        o.lIllIlllIl[16] = 0x74 ^ 0x7C;
        o.lIllIlllIl[17] = 0xBD ^ 0xB4;
        o.lIllIlllIl[18] = 79 + 130 - 75 + 5 ^ 76 + 116 - 188 + 124;
        o.lIllIlllIl[19] = 0x1F ^ 0x13;
        o.lIllIlllIl[20] = 44 + 104 - 133 + 153 ^ 83 + 29 - 56 + 109;
        o.lIllIlllIl[21] = 0xA5 ^ 0xAB;
        o.lIllIlllIl[22] = 0xAB ^ 0xA4;
        o.lIllIlllIl[23] = 0x8D ^ 0xA8 ^ (0xA2 ^ 0x97);
        o.lIllIlllIl[24] = -(0xFFFFA66B & 0x7DD6) & (0xFFFFEFFF & 0x3FFD);
        o.lIllIlllIl[25] = 0xFFFFBCE4 & 0x4FBB;
        o.lIllIlllIl[26] = (0x91 ^ 0xAB) & ~(0x74 ^ 0x4E) ^ (0x5F ^ 0x1E);
        o.lIllIlllIl[27] = 0x68 ^ 0x4F;
        o.lIllIlllIl[28] = 0xFFFFDBFD & 0x2FEF;
        o.lIllIlllIl[29] = -(0xFFFFDE35 & 0x31DB) & (0xFFFF9FFF & 0x7CBF);
        o.lIllIlllIl[30] = 136 + 9 - 91 + 124 ^ 115 + 22 - 132 + 158;
        o.lIllIlllIl[31] = -(0xFFFFEC67 & 0x57FF) & (0xFFFFFEFF & 0x7FFE);
        o.lIllIlllIl[32] = -(0xFFFFB6DD & 0x4BEE) & (0xFFFFF7FB & Short.MAX_VALUE);
        o.lIllIlllIl[33] = 187 + 106 - 81 + 33 ^ 65 + 68 - 102 + 114;
        o.lIllIlllIl[34] = 0xB0 ^ 0xA2;
        o.lIllIlllIl[35] = 0xD2 ^ 0xA5 ^ (0x7E ^ 0x6A);
        o.lIllIlllIl[36] = 0x6B ^ 0x7A ^ 2;
        o.lIllIlllIl[37] = 0xFFFFBFF7 & 0x46F8;
        o.lIllIlllIl[38] = 0xFFFFEFEE & 0x1D9D;
        o.lIllIlllIl[39] = -(0xFFFFFCAF & 0x73DB) & (0xFFFFFFAB & 0x77DE);
        o.lIllIlllIl[40] = -(0xFFFFEFDD & 0x722B) & (0xFFFFFFBD & 0x6FFE);
        o.lIllIlllIl[41] = 0xFFFFDFDB & 0x26ED;
        o.lIllIlllIl[42] = -(0xFFFFB4BF & 0x6B73) & (0xFFFFEDBF & 0x3FFF);
        o.lIllIlllIl[43] = 0xFFFFAED4 & 0x57EF;
        o.lIllIlllIl[44] = 0xFFFFBFF4 & 0x4DBB;
        o.lIllIlllIl[45] = -(0xFFFFBF3B & 0x68C6) & (0xFFFFAFFF & 0x7EFF);
        o.lIllIlllIl[46] = 0xFFFFFEFE & 0x7FB;
        o.lIllIlllIl[47] = -(0xFFFFF7C9 & 0x3877) & (0xFFFFFDFF & 0x3FEF);
        o.lIllIlllIl[48] = 0xFFFF86ED & 0x7FF7;
        o.lIllIlllIl[49] = -(0xFFFFF84B & 0x7FBE) & (0xFFFFFEFF & 0x7FEF);
        o.lIllIlllIl[50] = 0xFFFFDDEB & 0x2FD7;
        o.lIllIlllIl[51] = -(0xFFFFE987 & 0x7F7B) & (0xFFFFFFD7 & 0x6FFF);
        o.lIllIlllIl[52] = 0xFFFFAE8B & 0x57FF;
        o.lIllIlllIl[53] = 0xFFFF8D97 & 0x7FFE;
        o.lIllIlllIl[54] = -(0xFFFFCB33 & 0x7DCF) & (0xFFFFFFFF & 0x4FB7);
        o.lIllIlllIl[55] = 0xFFFFCF9F & 0x3DEB;
        o.lIllIlllIl[56] = 0xFFFFCEED & 0x37FF;
        o.lIllIlllIl[57] = -(0xFFFFF2DB & 0x3F7F) & (0xFFFFFFDF & 0x3FFF);
        o.lIllIlllIl[58] = -(0xFFFFF9BF & 0x6651) & (0xFFFFEBFF & 0x7FFE);
        o.lIllIlllIl[59] = -(0xFFFFB3E6 & 0x6D5B) & (0xFFFFFDEF & 0x2FFF);
        o.lIllIlllIl[60] = 0xB9 ^ 0xAD;
        o.lIllIlllIl[61] = 0xA6 ^ 0xB3;
        o.lIllIlllIl[62] = 0xDA ^ 0x82 ^ (0x7E ^ 0x30);
        o.lIllIlllIl[63] = -(0xFFFFB3DE & 0x7C33) & (0xFFFFF6DF & 0x3DBF);
        o.lIllIlllIl[64] = -(0xFFFFB29F & 0x7F65) & (0xFFFFBFBD & 0x7F7E);
        o.lIllIlllIl[65] = 0xFFFFF3D3 & 0xF3F;
        o.lIllIlllIl[66] = -(0xFFFFDC5F & 0x7FE9) & (0xFFFFFEFF & 0x5FFF);
        o.lIllIlllIl[67] = 0x2F ^ 0x38;
    }

    /*
     * WARNING - void declaration
     */
    static NPC aD() {
        WorldPoint worldPoint = cw;
        WorldPoint worldPoint2 = new WorldPoint(cw.getX() - lIllIlllIl[0], cw.getWorldY() + lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(cw.getX(), cw.getWorldY() + lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(cw.getX() + lIllIlllIl[0], cw.getWorldY() + lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(cw.getX() + lIllIlllIl[0], cw.getWorldY(), lIllIlllIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(cw.getX() + lIllIlllIl[0], cw.getWorldY() - lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(cw.getX(), cw.getWorldY() - lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(cw.getX() - lIllIlllIl[0], cw.getWorldY() - lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(cw.getX() - lIllIlllIl[0], cw.getWorldY(), lIllIlllIl[1]);
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(lIllIlllII[lIllIlllIl[36]]));
        if (o.lIIllIlIlIlII(list)) {
            void lllllllllllllllllllIIIIlIIlllIIl;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int lllllllllllllllllllIIIIlIIllIlll = lIllIlllIl[1];
            while (o.lIIllIlIlIIlI(lllllllllllllllllllIIIIlIIllIlll, lllllllllllllllllllIIIIlIIlllIIl.size())) {
                void lllllllllllllllllllIIIIlIIlllIII;
                if (o.lIIllIlIlIlIl(lllllllllllllllllllIIIIlIIlllIII.contains(((NPC)lllllllllllllllllllIIIIlIIlllIIl.get(lllllllllllllllllllIIIIlIIllIlll)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)lllllllllllllllllllIIIIlIIlllIIl.get(lllllllllllllllllllIIIIlIIllIlll);
                }
                ++lllllllllllllllllllIIIIlIIllIlll;
                0;
                if (2 > ((0x26 ^ 0x13) & ~(0x43 ^ 0x76))) continue;
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean ac() {
        return lIllIlllIl[1];
    }

    private static String lIIllIlIIllll(String lllllllllllllllllllIIIIlIIIIlIII, String lllllllllllllllllllIIIIlIIIIIlll) {
        lllllllllllllllllllIIIIlIIIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIIlIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIIIlIIIIIllI = new StringBuilder();
        char[] lllllllllllllllllllIIIIlIIIIIlIl = lllllllllllllllllllIIIIlIIIIIlll.toCharArray();
        int lllllllllllllllllllIIIIlIIIIIlII = lIllIlllIl[1];
        char[] lllllllllllllllllllIIIIIlllllllI = lllllllllllllllllllIIIIlIIIIlIII.toCharArray();
        int lllllllllllllllllllIIIIIllllllIl = lllllllllllllllllllIIIIIlllllllI.length;
        int lllllllllllllllllllIIIIIllllllII = lIllIlllIl[1];
        while (o.lIIllIlIlIIlI(lllllllllllllllllllIIIIIllllllII, lllllllllllllllllllIIIIIllllllIl)) {
            char lllllllllllllllllllIIIIlIIIIlIIl = lllllllllllllllllllIIIIIlllllllI[lllllllllllllllllllIIIIIllllllII];
            lllllllllllllllllllIIIIlIIIIIllI.append((char)(lllllllllllllllllllIIIIlIIIIlIIl ^ lllllllllllllllllllIIIIlIIIIIlIl[lllllllllllllllllllIIIIlIIIIIlII % lllllllllllllllllllIIIIlIIIIIlIl.length]));
            0;
            ++lllllllllllllllllllIIIIlIIIIIlII;
            ++lllllllllllllllllllIIIIIllllllII;
            0;
            if ((0x50 ^ 0x54) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIIIIlIIIIIllI);
    }

    public static void aC() {
        NPC lllllllllllllllllllIIIIlIlIIllll;
        WorldArea lllllllllllllllllllIIIIlIlIlIIII;
        if (o.lIIllIlIllIIl(o.lIIllIlIlIlll(e.a(cx), lIllIlllIl[9] + cC))) {
            if (o.lIIllIlIlIIll(Players.getLocal().getWorldLocation().equals((Object)cw) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIlllII[lIllIlllIl[10]];
                if (o.lIIllIlIlIIlI(Movement.getRunEnergy(), lIllIlllIl[11]) && o.lIIllIlIlIlIl(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aU).interact(lIllIlllII[lIllIlllIl[12]]);
                    Time.sleepTicks((int)lIllIlllIl[0]);
                    0;
                }
                if (o.lIIllIlIlIIll(cz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (o.lIIllIlIllIlI(Players.getLocal().getWorldLocation().distanceTo(cv), lIllIlllIl[10])) {
                        AccBuilderShamans.c = lIllIlllII[lIllIlllIl[13]];
                        Movement.walkTo((WorldPoint)cv);
                        0;
                        Time.sleepTicks((int)lIllIlllIl[0]);
                        0;
                    }
                    if (o.lIIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(cv), lIllIlllIl[10])) {
                        AccBuilderShamans.c = lIllIlllII[lIllIlllIl[14]];
                        if (o.lIIllIlIlIIlI(cA, lIllIlllIl[0])) {
                            e.v();
                            cA += lIllIlllIl[0];
                        }
                        String[] stringArray = new String[lIllIlllIl[0]];
                        stringArray[o.lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[15]];
                        lllllllllllllllllllIIIIlIlIlIIII = NPCs.getNearest((String[])stringArray);
                        if (o.lIIllIlIlIlII(lllllllllllllllllllIIIIlIlIlIIII)) {
                            String[] stringArray2 = new String[lIllIlllIl[0]];
                            stringArray2[o.lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[16]];
                            if (o.lIIllIlIlIlIl(lllllllllllllllllllIIIIlIlIlIIII.hasAction(stringArray2) ? 1 : 0)) {
                                lllllllllllllllllllIIIIlIlIlIIII.interact(lIllIlllII[lIllIlllIl[17]]);
                                Time.sleepTicks((int)lIllIlllIl[10]);
                                0;
                            }
                            String[] stringArray3 = new String[lIllIlllIl[0]];
                            stringArray3[o.lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[8]];
                            if (o.lIIllIlIlIIll(lllllllllllllllllllIIIIlIlIlIIII.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(lIllIlllII[lIllIlllIl[18]], cy);
                                Time.sleepTicks((int)lIllIlllIl[0]);
                                0;
                            }
                        }
                    }
                }
                if (o.lIIllIlIlIlIl(cz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)cw);
                    0;
                    Time.sleepTicks((int)lIllIlllIl[0]);
                    0;
                }
            }
            if (o.lIIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)cw) ? 1 : 0)) {
                if (o.lIIllIlIllIIl(o.lIIllIlIllIII(e.u(), 45.0))) {
                    int[] nArray = new int[lIllIlllIl[0]];
                    nArray[o.lIllIlllIl[1]] = lIllIlllIl[2];
                    if (o.lIIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIllIlllIl[0]];
                        nArray2[o.lIllIlllIl[1]] = lIllIlllIl[2];
                        Inventory.getFirst((int[])nArray2).interact(lIllIlllII[lIllIlllIl[19]]);
                        Time.sleepTicks((int)lIllIlllIl[0]);
                        0;
                    }
                }
                if (o.lIIllIlIlIIll(o.aE() ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIlllII[lIllIlllIl[20]];
                    Time.sleepTicks((int)lIllIlllIl[15]);
                    0;
                }
                if (o.lIIllIlIlIlIl(o.aE() ? 1 : 0)) {
                    lllllllllllllllllllIIIIlIlIlIIII = new WorldArea(cw, lIllIlllIl[3], lIllIlllIl[3]);
                    lllllllllllllllllllIIIIlIlIIllll = o.aD();
                    AccBuilderShamans.c = lIllIlllII[lIllIlllIl[21]];
                    if (o.lIIllIlIlllII(Players.getLocal().getInteracting()) && o.lIIllIlIlIlII(lllllllllllllllllllIIIIlIlIIllll) && o.lIIllIlIlIIll(lllllllllllllllllllIIIIlIlIIllll.isDead() ? 1 : 0)) {
                        System.out.println(lIllIlllII[lIllIlllIl[22]]);
                        lllllllllllllllllllIIIIlIlIIllll.interact(lIllIlllII[lIllIlllIl[23]]);
                        Time.sleepTicks((int)lIllIlllIl[3]);
                        0;
                    }
                    Time.sleepTicks((int)lIllIlllIl[12]);
                    0;
                }
            }
        }
        if (o.lIIllIlIlllIl(o.lIIllIlIlIlll(e.a(cx), lIllIlllIl[9] + cC))) {
            lllllllllllllllllllIIIIlIlIlIIII = new WorldArea(lIllIlllIl[24], lIllIlllIl[25], lIllIlllIl[26], lIllIlllIl[27], lIllIlllIl[1]);
            lllllllllllllllllllIIIIlIlIIllll = new WorldPoint(lIllIlllIl[28], lIllIlllIl[29], lIllIlllIl[1]);
            if (o.lIIllIlIlIlIl(lllllllllllllllllllIIIIlIlIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIIllIlIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIIIlIlIIllll), lIllIlllIl[13])) {
                Movement.walkTo((WorldPoint)lllllllllllllllllllIIIIlIlIIllll);
                0;
            }
            AccBuilderShamans.c = lIllIlllII[lIllIlllIl[30]];
            Movement.walkTo((WorldPoint)cm);
            0;
            Time.sleepTicks((int)lIllIlllIl[0]);
            0;
            if (o.lIIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(cm), lIllIlllIl[3])) {
                cx = System.currentTimeMillis();
                cC = e.c(lIllIlllIl[31], lIllIlllIl[32]);
            }
        }
    }

    private static String lIIllIlIIllIl(String lllllllllllllllllllIIIIlIIIlIllI, String lllllllllllllllllllIIIIlIIIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIlIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIIlIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIIlIIIllIlI.init(lIllIlllIl[3], lllllllllllllllllllIIIIlIIIllIll);
            return new String(lllllllllllllllllllIIIIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIlIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIIIlIIIllIIl) {
            lllllllllllllllllllIIIIlIIIllIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean aE() {
        WorldArea worldArea = new WorldArea(cw, lIllIlllIl[10], lIllIlllIl[10]);
        List list = Players.getAll();
        if (o.lIIllIlIlIIll(list.isEmpty() ? 1 : 0) && o.lIIllIlIllIlI(list.size(), lIllIlllIl[0])) {
            void lllllllllllllllllllIIIIlIIllIIlI;
            int lllllllllllllllllllIIIIlIIllIIIl = lIllIlllIl[1];
            while (o.lIIllIlIlIIlI(lllllllllllllllllllIIIIlIIllIIIl, lllllllllllllllllllIIIIlIIllIIlI.size())) {
                void lllllllllllllllllllIIIIlIIllIIll;
                if (o.lIIllIlIlIlIl(((Player)lllllllllllllllllllIIIIlIIllIIlI.get(lllllllllllllllllllIIIIlIIllIIIl)).equals(Players.getLocal()) ? 1 : 0)) {
                    0;
                    if ((23 + 98 - 109 + 137 ^ 51 + 76 - 67 + 84) == 0) {
                        return ((0xFA ^ 0xB6 ^ (0xA3 ^ 0xC5)) & (26 + 62 - -14 + 69 ^ 119 + 88 - 98 + 20 ^ -1)) != 0;
                    }
                } else if (o.lIIllIlIlIlIl(lllllllllllllllllllIIIIlIIllIIll.contains(((Player)lllllllllllllllllllIIIIlIIllIIlI.get(lllllllllllllllllllIIIIlIIllIIIl)).getWorldLocation()) ? 1 : 0)) {
                    return lIllIlllIl[0];
                }
                ++lllllllllllllllllllIIIIlIIllIIIl;
                0;
                if (3 >= ((164 + 194 - 294 + 161 ^ 134 + 155 - 154 + 32) & (212 + 217 - 297 + 97 ^ 72 + 107 - 76 + 60 ^ -1))) continue;
                return ((11 + 56 - -15 + 76 ^ 96 + 138 - 83 + 10) & (7 ^ 9 ^ (0x78 ^ 0x49) ^ -1)) != 0;
            }
        }
        return lIllIlllIl[1];
    }

    private static boolean lIIllIlIlllII(Object object) {
        return object == null;
    }

    @Override
    public int ad() {
        try {
            o.aB();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 <= 0) {
            return (0x55 ^ 0x50) & ~(0xBE ^ 0xBB);
        }
        return lIllIlllIl[33];
    }

    private static boolean lIIllIlIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ae() {
        return lIllIlllII[lIllIlllIl[34]];
    }

    private static void aB() {
        if (o.lIIllIlIlIIlI(cB, lIllIlllIl[0])) {
            cx = System.currentTimeMillis();
            System.out.println(lIllIlllII[lIllIlllIl[1]]);
            cB += lIllIlllIl[0];
        }
        int[] nArray = new int[lIllIlllIl[0]];
        nArray[o.lIllIlllIl[1]] = lIllIlllIl[2];
        if (o.lIIllIlIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation lllllllllllllllllllIIIIlIlIlIIll = BankLocation.getNearest();
            if (o.lIIllIlIlIlII(lllllllllllllllllllIIIIlIlIlIIll) && o.lIIllIlIlIIll(lllllllllllllllllllIIIIlIlIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIlllII[lIllIlllIl[0]];
                a.a(lllllllllllllllllllIIIIlIlIlIIll);
            }
            if (o.lIIllIlIlIlII(lllllllllllllllllllIIIIlIlIlIIll) && o.lIIllIlIlIlIl(lllllllllllllllllllIIIIlIlIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIlllII[lIllIlllIl[3]];
                if (o.lIIllIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlllIl[4]);
                    0;
                }
                if (o.lIIllIlIlIlIl(Bank.isOpen() ? 1 : 0)) {
                    if (o.lIIllIlIlIllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIllIlllIl[0]);
                        0;
                    }
                    a.a(lIllIlllIl[2], lIllIlllIl[5]);
                    a.a(lIllIlllIl[6], lIllIlllIl[0]);
                    a.a(lIllIlllIl[7], lIllIlllIl[8]);
                }
            }
        }
        int[] nArray2 = new int[lIllIlllIl[0]];
        nArray2[o.lIllIlllIl[1]] = lIllIlllIl[2];
        if (o.lIIllIlIlIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            o.aC();
        }
    }

    private static boolean lIIllIlIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIlIllIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIllIlIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIllIlIIlllI(String lllllllllllllllllllIIIIlIIlIIlIl, String lllllllllllllllllllIIIIlIIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIlIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIllIlllIl[16]), "DES");
            Cipher lllllllllllllllllllIIIIlIIlIIlll = Cipher.getInstance("DES");
            lllllllllllllllllllIIIIlIIlIIlll.init(lIllIlllIl[3], lllllllllllllllllllIIIIlIIlIlIII);
            return new String(lllllllllllllllllllIIIIlIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIIIlIIlIIllI) {
            lllllllllllllllllllIIIIlIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean af() {
        int n2;
        if (o.lIIllIlIlllll(Skills.getLevel((Skill)Skill.RANGED), lIllIlllIl[35]) && o.lIIllIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlllIl[35])) {
            n2 = lIllIlllIl[0];
            0;
            if (3 < -1) {
                return ((0x28 ^ 0x15) & ~(0x9B ^ 0xA6)) != 0;
            }
        } else {
            n2 = lIllIlllIl[1];
        }
        return n2 != 0;
    }

    private static int lIIllIlIllIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIllIlIlllIl(int n2) {
        return n2 >= 0;
    }

    private static void lIIllIlIlIIII() {
        lIllIlllII = new String[lIllIlllIl[67]];
        o.lIllIlllII[o.lIllIlllIl[1]] = o."reset aggro timer";
        o.lIllIlllII[o.lIllIlllIl[0]] = o."Navigating to bank";
        o.lIllIlllII[o.lIllIlllIl[3]] = o."Handling banking";
        o.lIllIlllII[o.lIllIlllIl[10]] = o."Nav to sand crabs";
        o.lIllIlllII[o.lIllIlllIl[12]] = o."Drink";
        o.lIllIlllII[o.lIllIlllIl[13]] = o."Nav to veos";
        o.lIllIlllII[o.lIllIlllIl[14]] = o."Handle veos chat";
        o.lIllIlllII[o.lIllIlllIl[15]] = o."Veos";
        o.lIllIlllII[o.lIllIlllIl[16]] = o."Port Piscarilius";
        o.lIllIlllII[o.lIllIlllIl[17]] = o."Port Piscarilius";
        o.lIllIlllII[o.lIllIlllIl[8]] = o."Port Piscarilius";
        o.lIllIlllII[o.lIllIlllIl[18]] = o."Veos";
        o.lIllIlllII[o.lIllIlllIl[19]] = o."Eat";
        o.lIllIlllII[o.lIllIlllIl[20]] = o."Afking in spot";
        o.lIllIlllII[o.lIllIlllIl[21]] = o."Being crashed";
        o.lIllIlllII[o.lIllIlllIl[22]] = o."Attacking crashed";
        o.lIllIlllII[o.lIllIlllIl[23]] = o."Attack";
        o.lIllIlllII[o.lIllIlllIl[30]] = o."Resetting";
        o.lIllIlllII[o.lIllIlllIl[34]] = o."Sand Crabs";
        o.lIllIlllII[o.lIllIlllIl[36]] = o."sand crab";
        o.lIllIlllII[o.lIllIlllIl[60]] = o."That's great, can you take me there please?";
        o.lIllIlllII[o.lIllIlllIl[61]] = o."Can you take me to Great Kourend?";
        o.lIllIlllII[o.lIllIlllIl[62]] = o."Goodbye.";
    }

    private static boolean lIIllIlIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIlIlIlII(Object object) {
        return object != null;
    }

    private static boolean lIIllIlIlIllI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void aF() {
        void lllllllllllllllllllIIIIlIIlIllll;
        int n2 = e.c(lIllIlllIl[0], lIllIlllIl[13]);
        if (o.lIIllIlIllllI(n2, lIllIlllIl[0])) {
            cw = cg;
            cm = ch;
        }
        if (o.lIIllIlIllllI((int)lllllllllllllllllllIIIIlIIlIllll, lIllIlllIl[3])) {
            cw = cn;
            cm = co;
        }
        if (o.lIIllIlIllllI((int)lllllllllllllllllllIIIIlIIlIllll, lIllIlllIl[10])) {
            cw = cp;
            cm = cq;
        }
        if (o.lIIllIlIllllI((int)lllllllllllllllllllIIIIlIIlIllll, lIllIlllIl[12])) {
            cw = cr;
            cm = cs;
        }
        if (o.lIIllIlIllllI((int)lllllllllllllllllllIIIIlIIlIllll, lIllIlllIl[13])) {
            cw = ct;
            cm = cu;
        }
    }
}

