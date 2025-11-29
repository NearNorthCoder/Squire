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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import gg.squire.account.AccBuilderTempleTrek;
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

public class l
implements S {
    public static /* synthetic */ WorldPoint bN;
    public static /* synthetic */ WorldPoint bK;
    public static /* synthetic */ WorldPoint bz;
    public static /* synthetic */ WorldPoint bC;
    public static /* synthetic */ WorldPoint bA;
    public static /* synthetic */ WorldPoint bL;
    public static /* synthetic */ WorldPoint bE;
    public static /* synthetic */ WorldPoint bJ;
    public static /* synthetic */ int bT;
    public static /* synthetic */ int bS;
    public static /* synthetic */ long bP;
    static /* synthetic */ int bU;
    public static /* synthetic */ WorldPoint bD;
    public static /* synthetic */ WorldPoint bH;
    private static /* synthetic */ String[] lIIIIIIIIll;
    public static /* synthetic */ WorldPoint bI;
    public static /* synthetic */ WorldArea bR;
    public static /* synthetic */ WorldPoint bO;
    private static /* synthetic */ int[] lIIIIIIIlII;
    public static /* synthetic */ WorldPoint bB;
    public static /* synthetic */ WorldPoint bG;
    public static /* synthetic */ WorldPoint by;
    public static /* synthetic */ String[] bQ;
    public static /* synthetic */ WorldPoint bF;
    public static /* synthetic */ WorldPoint bM;

    /*
     * WARNING - void declaration
     */
    public static boolean ar() {
        WorldArea worldArea = new WorldArea(bO, lIIIIIIIlII[10], lIIIIIIIlII[10]);
        List list = Players.getAll();
        if (l.llIllIlIIIIll(list.isEmpty() ? 1 : 0) && l.llIllIlIIlIlI(list.size(), lIIIIIIIlII[0])) {
            void lllllllllllllllllIlIIIIIlIIlIlII;
            int lllllllllllllllllIlIIIIIlIIlIIll = lIIIIIIIlII[1];
            while (l.llIllIlIIIIlI(lllllllllllllllllIlIIIIIlIIlIIll, lllllllllllllllllIlIIIIIlIIlIlII.size())) {
                void lllllllllllllllllIlIIIIIlIIlIlIl;
                if (l.llIllIlIIIlIl(((Player)lllllllllllllllllIlIIIIIlIIlIlII.get(lllllllllllllllllIlIIIIIlIIlIIll)).equals(Players.getLocal()) ? 1 : 0)) {
                    0;
                    if (3 >= (0xF6 ^ 0xB3 ^ (0x3D ^ 0x7C))) {
                        return ((0xBF ^ 0x9B ^ (0xD1 ^ 0xA2)) & (0x7B ^ 0x6D ^ (0x74 ^ 0x35) ^ -1)) != 0;
                    }
                } else if (l.llIllIlIIIlIl(lllllllllllllllllIlIIIIIlIIlIlIl.contains(((Player)lllllllllllllllllIlIIIIIlIIlIlII.get(lllllllllllllllllIlIIIIIlIIlIIll)).getWorldLocation()) ? 1 : 0)) {
                    return lIIIIIIIlII[0];
                }
                ++lllllllllllllllllIlIIIIIlIIlIIll;
                0;
                if (((0x7F ^ 0x61) & ~(0x57 ^ 0x49)) > -1) continue;
                return ((0x7F ^ 0x50) & ~(0xA2 ^ 0x8D)) != 0;
            }
        }
        return lIIIIIIIlII[1];
    }

    public static void ap() {
        NPC lllllllllllllllllIlIIIIIlIllIIIl;
        WorldArea lllllllllllllllllIlIIIIIlIllIIlI;
        if (l.llIllIlIIlIIl(l.llIllIlIIIlll(e.a(bP), lIIIIIIIlII[9] + bU))) {
            if (l.llIllIlIIIIll(Players.getLocal().getWorldLocation().equals((Object)bO) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[10]];
                if (l.llIllIlIIIIlI(Movement.getRunEnergy(), lIIIIIIIlII[11]) && l.llIllIlIIIlIl(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aU).interact(lIIIIIIIIll[lIIIIIIIlII[12]]);
                    Time.sleepTicks((int)lIIIIIIIlII[0]);
                    0;
                }
                if (l.llIllIlIIIIll(bR.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (l.llIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(bN), lIIIIIIIlII[10])) {
                        AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[13]];
                        Movement.walkTo((WorldPoint)bN);
                        0;
                        Time.sleepTicks((int)lIIIIIIIlII[0]);
                        0;
                    }
                    if (l.llIllIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(bN), lIIIIIIIlII[10])) {
                        AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[14]];
                        if (l.llIllIlIIIIlI(bS, lIIIIIIIlII[0])) {
                            e.v();
                            bS += lIIIIIIIlII[0];
                        }
                        String[] stringArray = new String[lIIIIIIIlII[0]];
                        stringArray[l.lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[15]];
                        lllllllllllllllllIlIIIIIlIllIIlI = NPCs.getNearest((String[])stringArray);
                        if (l.llIllIlIIIlII(lllllllllllllllllIlIIIIIlIllIIlI)) {
                            String[] stringArray2 = new String[lIIIIIIIlII[0]];
                            stringArray2[l.lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[16]];
                            if (l.llIllIlIIIlIl(lllllllllllllllllIlIIIIIlIllIIlI.hasAction(stringArray2) ? 1 : 0)) {
                                lllllllllllllllllIlIIIIIlIllIIlI.interact(lIIIIIIIIll[lIIIIIIIlII[17]]);
                                Time.sleepTicks((int)lIIIIIIIlII[10]);
                                0;
                            }
                            String[] stringArray3 = new String[lIIIIIIIlII[0]];
                            stringArray3[l.lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[8]];
                            if (l.llIllIlIIIIll(lllllllllllllllllIlIIIIIlIllIIlI.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(lIIIIIIIIll[lIIIIIIIlII[18]], bQ);
                                Time.sleepTicks((int)lIIIIIIIlII[0]);
                                0;
                            }
                        }
                    }
                }
                if (l.llIllIlIIIlIl(bR.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)bO);
                    0;
                    Time.sleepTicks((int)lIIIIIIIlII[0]);
                    0;
                }
            }
            if (l.llIllIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)bO) ? 1 : 0)) {
                if (l.llIllIlIIlIIl(l.llIllIlIIlIII(e.u(), 45.0))) {
                    int[] nArray = new int[lIIIIIIIlII[0]];
                    nArray[l.lIIIIIIIlII[1]] = lIIIIIIIlII[2];
                    if (l.llIllIlIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIIIIIlII[0]];
                        nArray2[l.lIIIIIIIlII[1]] = lIIIIIIIlII[2];
                        Inventory.getFirst((int[])nArray2).interact(lIIIIIIIIll[lIIIIIIIlII[19]]);
                        Time.sleepTicks((int)lIIIIIIIlII[0]);
                        0;
                    }
                }
                if (l.llIllIlIIIIll(l.ar() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[20]];
                    Time.sleepTicks((int)lIIIIIIIlII[15]);
                    0;
                }
                if (l.llIllIlIIIlIl(l.ar() ? 1 : 0)) {
                    lllllllllllllllllIlIIIIIlIllIIlI = new WorldArea(bO, lIIIIIIIlII[3], lIIIIIIIlII[3]);
                    lllllllllllllllllIlIIIIIlIllIIIl = l.aq();
                    AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[21]];
                    if (l.llIllIlIIllII(Players.getLocal().getInteracting()) && l.llIllIlIIIlII(lllllllllllllllllIlIIIIIlIllIIIl) && l.llIllIlIIIIll(lllllllllllllllllIlIIIIIlIllIIIl.isDead() ? 1 : 0)) {
                        System.out.println(lIIIIIIIIll[lIIIIIIIlII[22]]);
                        lllllllllllllllllIlIIIIIlIllIIIl.interact(lIIIIIIIIll[lIIIIIIIlII[23]]);
                        Time.sleepTicks((int)lIIIIIIIlII[3]);
                        0;
                    }
                    Time.sleepTicks((int)lIIIIIIIlII[12]);
                    0;
                }
            }
        }
        if (l.llIllIlIIllIl(l.llIllIlIIIlll(e.a(bP), lIIIIIIIlII[9] + bU))) {
            lllllllllllllllllIlIIIIIlIllIIlI = new WorldArea(lIIIIIIIlII[24], lIIIIIIIlII[25], lIIIIIIIlII[26], lIIIIIIIlII[27], lIIIIIIIlII[1]);
            lllllllllllllllllIlIIIIIlIllIIIl = new WorldPoint(lIIIIIIIlII[28], lIIIIIIIlII[29], lIIIIIIIlII[1]);
            if (l.llIllIlIIIlIl(lllllllllllllllllIlIIIIIlIllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.llIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIIIIIlIllIIIl), lIIIIIIIlII[13])) {
                Movement.walkTo((WorldPoint)lllllllllllllllllIlIIIIIlIllIIIl);
                0;
            }
            AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[30]];
            Movement.walkTo((WorldPoint)bE);
            0;
            Time.sleepTicks((int)lIIIIIIIlII[0]);
            0;
            if (l.llIllIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(bE), lIIIIIIIlII[3])) {
                bP = System.currentTimeMillis();
                bU = e.c(lIIIIIIIlII[31], lIIIIIIIlII[32]);
            }
        }
    }

    private static boolean llIllIlIIllII(Object object) {
        return object == null;
    }

    private static String llIllIIllllIl(String lllllllllllllllllIlIIIIIIllllIlI, String lllllllllllllllllIlIIIIIIlllIlll) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIIlllIlll.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlII[16]), "DES");
            Cipher lllllllllllllllllIlIIIIIIlllllII = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIIIIlllllII.init(lIIIIIIIlII[3], lllllllllllllllllIlIIIIIIlllllIl);
            return new String(lllllllllllllllllIlIIIIIIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIIIIllllIll) {
            lllllllllllllllllIlIIIIIIllllIll.printStackTrace();
            return null;
        }
    }

    private static String llIllIIllllll(String lllllllllllllllllIlIIIIIIllIIlIl, String lllllllllllllllllIlIIIIIIllIIlII) {
        lllllllllllllllllIlIIIIIIllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIIIIllIlIII = new StringBuilder();
        char[] lllllllllllllllllIlIIIIIIllIIlll = lllllllllllllllllIlIIIIIIllIIlII.toCharArray();
        int lllllllllllllllllIlIIIIIIllIIllI = lIIIIIIIlII[1];
        char[] lllllllllllllllllIlIIIIIIllIIIII = lllllllllllllllllIlIIIIIIllIIlIl.toCharArray();
        int lllllllllllllllllIlIIIIIIlIlllll = lllllllllllllllllIlIIIIIIllIIIII.length;
        int lllllllllllllllllIlIIIIIIlIllllI = lIIIIIIIlII[1];
        while (l.llIllIlIIIIlI(lllllllllllllllllIlIIIIIIlIllllI, lllllllllllllllllIlIIIIIIlIlllll)) {
            char lllllllllllllllllIlIIIIIIllIlIll = lllllllllllllllllIlIIIIIIllIIIII[lllllllllllllllllIlIIIIIIlIllllI];
            lllllllllllllllllIlIIIIIIllIlIII.append((char)(lllllllllllllllllIlIIIIIIllIlIll ^ lllllllllllllllllIlIIIIIIllIIlll[lllllllllllllllllIlIIIIIIllIIllI % lllllllllllllllllIlIIIIIIllIIlll.length]));
            0;
            ++lllllllllllllllllIlIIIIIIllIIllI;
            ++lllllllllllllllllIlIIIIIIlIllllI;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIIIIIIllIlIII);
    }

    private static void llIllIlIIIIIl() {
        lIIIIIIIlII = new int[68];
        l.lIIIIIIIlII[0] = 1;
        l.lIIIIIIIlII[1] = (0x35 ^ 0x6F) & ~(0xDD ^ 0x87);
        l.lIIIIIIIlII[2] = -(0xFFFFFF8F & 0x1CF5) & (0xFFFFBDFF & 0x5FFF);
        l.lIIIIIIIlII[3] = 2;
        l.lIIIIIIIlII[4] = 0xFFFFD7FB & 0x3B8C;
        l.lIIIIIIIlII[5] = 5 ^ 0x1D;
        l.lIIIIIIIlII[6] = -(0xFFFF8FFF & 0x748F) & (0xFFFFFFFF & 0x35DF);
        l.lIIIIIIIlII[7] = 0xFFFF9F4D & 0x7FFB;
        l.lIIIIIIIlII[8] = 0x38 ^ 0x32;
        l.lIIIIIIIlII[9] = 0xFFFFAFE9 & 0x977D6;
        l.lIIIIIIIlII[10] = 3;
        l.lIIIIIIIlII[11] = 0x29 ^ 0x20 ^ (0xFB ^ 0xB4);
        l.lIIIIIIIlII[12] = 0x39 ^ 0x3D;
        l.lIIIIIIIlII[13] = 0xDE ^ 0xA0 ^ (0x41 ^ 0x3A);
        l.lIIIIIIIlII[14] = 0xF ^ 9;
        l.lIIIIIIIlII[15] = 0x37 ^ 0x30;
        l.lIIIIIIIlII[16] = 0x14 ^ 0x38 ^ (0x14 ^ 0x30);
        l.lIIIIIIIlII[17] = 0x49 ^ 0x40;
        l.lIIIIIIIlII[18] = 0xCA ^ 0xC1;
        l.lIIIIIIIlII[19] = 0x48 ^ 0x31 ^ (0xE5 ^ 0x90);
        l.lIIIIIIIlII[20] = 0xA3 ^ 0x82 ^ (0x69 ^ 0x45);
        l.lIIIIIIIlII[21] = 0x91 ^ 0x9F;
        l.lIIIIIIIlII[22] = 0x72 ^ 0x7D;
        l.lIIIIIIIlII[23] = 0x6B ^ 0x6E ^ (0x64 ^ 0x71);
        l.lIIIIIIIlII[24] = -(0xFFFFF7D3 & 0x6C6F) & (0xFFFFFFFE & 0x6FFF);
        l.lIIIIIIIlII[25] = -(0xFFFFF5DB & 0x2B6F) & (0xFFFFEDEE & 0x3FFB);
        l.lIIIIIIIlII[26] = 0x71 ^ 0x30;
        l.lIIIIIIIlII[27] = 0x51 ^ 0x76;
        l.lIIIIIIIlII[28] = -(0xFFFFDDB7 & 0x7249) & (0xFFFFDBED & Short.MAX_VALUE);
        l.lIIIIIIIlII[29] = 0xFFFFECFF & 0x1FAF;
        l.lIIIIIIIlII[30] = 96 + 122 - 164 + 120 ^ 127 + 167 - 109 + 6;
        l.lIIIIIIIlII[31] = -(0xFFFFAD4D & 0x57F7) & (0xFFFFBFFC & 0x7FDF);
        l.lIIIIIIIlII[32] = 0xFFFFFD7B & 0x77B4;
        l.lIIIIIIIlII[33] = 0x50 ^ 0x68 ^ (0xC0 ^ 0x9C);
        l.lIIIIIIIlII[34] = 0x48 ^ 0x70 ^ (0x19 ^ 0x33);
        l.lIIIIIIIlII[35] = 165 + 96 - 226 + 172 ^ 147 + 38 - 146 + 133;
        l.lIIIIIIIlII[36] = 0x4B ^ 0x7E ^ (0x27 ^ 1);
        l.lIIIIIIIlII[37] = -(0xFFFFFD4E & 0x4BB7) & (0xFFFFCFFD & 0x7FF7);
        l.lIIIIIIIlII[38] = -(0xFFFFCBB5 & 0x746E) & (0xFFFFDFFF & 0x6DAF);
        l.lIIIIIIIlII[39] = -(0xFFFFFB5F & 0x74FE) & (0xFFFFFFDF & 0x777D);
        l.lIIIIIIIlII[40] = 0xFFFF8FF5 & 0x7DBE;
        l.lIIIIIIIlII[41] = -(0xFFFFF5FD & 0x5B17) & (0xFFFFDFFD & 0x77DF);
        l.lIIIIIIIlII[42] = -(0xFFFFDBEF & 0x7613) & (0xFFFFFFAF & 0x5FDF);
        l.lIIIIIIIlII[43] = -(0xFFFFFDBF & 0x325C) & (0xFFFFF6DF & 0x3FFF);
        l.lIIIIIIIlII[44] = 0xFFFFEDFA & 0x1FB5;
        l.lIIIIIIIlII[45] = -(0xFFFFB7B9 & 0x7947) & (0xFFFFBFFE & 0x77FF);
        l.lIIIIIIIlII[46] = 0xFFFFCFFA & 0x36FF;
        l.lIIIIIIIlII[47] = -(0xFFFFB695 & 0x7B7B) & (0xFFFFBFBF & Short.MAX_VALUE);
        l.lIIIIIIIlII[48] = -(0xFFFFBB07 & 0x7DFB) & (0xFFFFFFF7 & 0x3FEF);
        l.lIIIIIIIlII[49] = 0xFFFFEEF7 & 0x17EE;
        l.lIIIIIIIlII[50] = 0xFFFFADC7 & 0x5FFB;
        l.lIIIIIIIlII[51] = -(0xFFFFF879 & 0x7FAF) & (0xFFFFFFFF & 0x7EFD);
        l.lIIIIIIIlII[52] = -(0xFFFFC979 & 0x7FE7) & (0xFFFFFFFF & 0x4FEB);
        l.lIIIIIIIlII[53] = -(0xFFFFFF0F & 0x62FA) & (0xFFFFEFDF & 0x7FBF);
        l.lIIIIIIIlII[54] = -(0xFFFFD8EF & 0x7F59) & (0xFFFFFFFF & 0x5EFD);
        l.lIIIIIIIlII[55] = 0xFFFFFDEF & 0xF9B;
        l.lIIIIIIIlII[56] = -(0xFFFFF5FF & 0x7B11) & (0xFFFFFFFF & 0x77FD);
        l.lIIIIIIIlII[57] = -(0xFFFFF3F5 & 0x5E7B) & (0xFFFFFFF7 & 0x5FFD);
        l.lIIIIIIIlII[58] = -(0xFFFFF03F & 0x7FD2) & (0xFFFFFBFF & Short.MAX_VALUE);
        l.lIIIIIIIlII[59] = 0xFFFFECAF & 0x1FFE;
        l.lIIIIIIIlII[60] = 0x3D ^ 0x29;
        l.lIIIIIIIlII[61] = 0x2E ^ 0x75 ^ (0xC ^ 0x42);
        l.lIIIIIIIlII[62] = 0xB8 ^ 0xAE;
        l.lIIIIIIIlII[63] = -(0xFFFFDAE7 & 0x677A) & (0xFFFFEFEF & 0x56FF);
        l.lIIIIIIIlII[64] = 0xFFFFCFFD & 0x3D3A;
        l.lIIIIIIIlII[65] = 0xFFFFB73B & 0x4BD7;
        l.lIIIIIIIlII[66] = 0xFFFFABBF & 0x56F7;
        l.lIIIIIIIlII[67] = 0xBB ^ 0xAC;
    }

    private static int llIllIlIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIllIlIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (l.llIllIlIIllll(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIIlII[35]) && l.llIllIlIIllll(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIIlII[35])) {
            n2 = lIIIIIIIlII[0];
            0;
            if (-1 >= 0) {
                return ((0x33 ^ 0x7C ^ (0xF5 ^ 0x9F)) & (0x6C ^ 0x22 ^ (1 ^ 0x6A) ^ -1)) != 0;
            }
        } else {
            n2 = lIIIIIIIlII[1];
        }
        return n2 != 0;
    }

    private static int llIllIlIIIlll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean llIllIlIIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIlIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean S() {
        return lIIIIIIIlII[1];
    }

    private static boolean llIllIlIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    static NPC aq() {
        WorldPoint worldPoint = bO;
        WorldPoint worldPoint2 = new WorldPoint(bO.getX() - lIIIIIIIlII[0], bO.getWorldY() + lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint3 = new WorldPoint(bO.getX(), bO.getWorldY() + lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint4 = new WorldPoint(bO.getX() + lIIIIIIIlII[0], bO.getWorldY() + lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint5 = new WorldPoint(bO.getX() + lIIIIIIIlII[0], bO.getWorldY(), lIIIIIIIlII[1]);
        WorldPoint worldPoint6 = new WorldPoint(bO.getX() + lIIIIIIIlII[0], bO.getWorldY() - lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint7 = new WorldPoint(bO.getX(), bO.getWorldY() - lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint8 = new WorldPoint(bO.getX() - lIIIIIIIlII[0], bO.getWorldY() - lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint9 = new WorldPoint(bO.getX() - lIIIIIIIlII[0], bO.getWorldY(), lIIIIIIIlII[1]);
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(lIIIIIIIIll[lIIIIIIIlII[36]]));
        if (l.llIllIlIIIlII(list)) {
            void lllllllllllllllllIlIIIIIlIIllIll;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int lllllllllllllllllIlIIIIIlIIllIIl = lIIIIIIIlII[1];
            while (l.llIllIlIIIIlI(lllllllllllllllllIlIIIIIlIIllIIl, lllllllllllllllllIlIIIIIlIIllIll.size())) {
                void lllllllllllllllllIlIIIIIlIIllIlI;
                if (l.llIllIlIIIlIl(lllllllllllllllllIlIIIIIlIIllIlI.contains(((NPC)lllllllllllllllllIlIIIIIlIIllIll.get(lllllllllllllllllIlIIIIIlIIllIIl)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)lllllllllllllllllIlIIIIIlIIllIll.get(lllllllllllllllllIlIIIIIlIIllIIl);
                }
                ++lllllllllllllllllIlIIIIIlIIllIIl;
                0;
                if (2 == 2) continue;
                return null;
            }
        }
        return null;
    }

    private static boolean llIllIlIIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static void as() {
        void lllllllllllllllllIlIIIIIlIIlIIIl;
        int n2 = e.c(lIIIIIIIlII[0], lIIIIIIIlII[13]);
        if (l.llIllIlIIlllI(n2, lIIIIIIIlII[0])) {
            bO = by;
            bE = bz;
        }
        if (l.llIllIlIIlllI((int)lllllllllllllllllIlIIIIIlIIlIIIl, lIIIIIIIlII[3])) {
            bO = bF;
            bE = bG;
        }
        if (l.llIllIlIIlllI((int)lllllllllllllllllIlIIIIIlIIlIIIl, lIIIIIIIlII[10])) {
            bO = bH;
            bE = bI;
        }
        if (l.llIllIlIIlllI((int)lllllllllllllllllIlIIIIIlIIlIIIl, lIIIIIIIlII[12])) {
            bO = bJ;
            bE = bK;
        }
        if (l.llIllIlIIlllI((int)lllllllllllllllllIlIIIIIlIIlIIIl, lIIIIIIIlII[13])) {
            bO = bL;
            bE = bM;
        }
    }

    private static void ao() {
        if (l.llIllIlIIIIlI(bT, lIIIIIIIlII[0])) {
            bP = System.currentTimeMillis();
            System.out.println(lIIIIIIIIll[lIIIIIIIlII[1]]);
            bT += lIIIIIIIlII[0];
        }
        int[] nArray = new int[lIIIIIIIlII[0]];
        nArray[l.lIIIIIIIlII[1]] = lIIIIIIIlII[2];
        if (l.llIllIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation lllllllllllllllllIlIIIIIlIllIlIl = BankLocation.getNearest();
            if (l.llIllIlIIIlII(lllllllllllllllllIlIIIIIlIllIlIl) && l.llIllIlIIIIll(lllllllllllllllllIlIIIIIlIllIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[0]];
                a.a(lllllllllllllllllIlIIIIIlIllIlIl);
            }
            if (l.llIllIlIIIlII(lllllllllllllllllIlIIIIIlIllIlIl) && l.llIllIlIIIlIl(lllllllllllllllllIlIIIIIlIllIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[3]];
                if (l.llIllIlIIIIll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIlII[4]);
                    0;
                }
                if (l.llIllIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                    if (l.llIllIlIIIllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIIIIIIIlII[0]);
                        0;
                    }
                    a.a(lIIIIIIIlII[2], lIIIIIIIlII[5]);
                    a.a(lIIIIIIIlII[6], lIIIIIIIlII[0]);
                    a.a(lIIIIIIIlII[7], lIIIIIIIlII[8]);
                }
            }
        }
        int[] nArray2 = new int[lIIIIIIIlII[0]];
        nArray2[l.lIIIIIIIlII[1]] = lIIIIIIIlII[2];
        if (l.llIllIlIIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            l.ap();
        }
    }

    private static boolean llIllIlIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIllIlIIllIl(int n2) {
        return n2 >= 0;
    }

    private static boolean llIllIlIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIlIIIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public int T() {
        try {
            l.ao();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 <= ((0x2F ^ 0x1C) & ~(0x73 ^ 0x40))) {
            return (0x7A ^ 0x44) & ~(0x5F ^ 0x61);
        }
        return lIIIIIIIlII[33];
    }

    private static String llIllIIlllllI(String lllllllllllllllllIlIIIIIlIIIIlIl, String lllllllllllllllllIlIIIIIlIIIIlII) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIlIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIlIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIIIlIIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIIIlIIIlIIl.init(lIIIIIIIlII[3], lllllllllllllllllIlIIIIIlIIIlIlI);
            return new String(lllllllllllllllllIlIIIIIlIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIIIlIIIlIII) {
            lllllllllllllllllIlIIIIIlIIIlIII.printStackTrace();
            return null;
        }
    }

    @Override
    public String U() {
        return lIIIIIIIIll[lIIIIIIIlII[34]];
    }

    private static boolean llIllIlIIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean llIllIlIIlIIl(int n2) {
        return n2 < 0;
    }

    static {
        l.llIllIlIIIIIl();
        l.llIllIlIIIIII();
        by = new WorldPoint(lIIIIIIIlII[37], lIIIIIIIlII[38], lIIIIIIIlII[1]);
        bz = new WorldPoint(lIIIIIIIlII[39], lIIIIIIIlII[40], lIIIIIIIlII[1]);
        bA = new WorldPoint(lIIIIIIIlII[41], lIIIIIIIlII[42], lIIIIIIIlII[1]);
        bB = new WorldPoint(lIIIIIIIlII[43], lIIIIIIIlII[44], lIIIIIIIlII[1]);
        bC = new WorldPoint(lIIIIIIIlII[45], lIIIIIIIlII[38], lIIIIIIIlII[1]);
        bD = new WorldPoint(lIIIIIIIlII[46], lIIIIIIIlII[47], lIIIIIIIlII[1]);
        bE = new WorldPoint(lIIIIIIIlII[39], lIIIIIIIlII[40], lIIIIIIIlII[1]);
        bF = new WorldPoint(lIIIIIIIlII[48], lIIIIIIIlII[38], lIIIIIIIlII[1]);
        bG = new WorldPoint(lIIIIIIIlII[49], lIIIIIIIlII[50], lIIIIIIIlII[1]);
        bH = new WorldPoint(lIIIIIIIlII[51], lIIIIIIIlII[42], lIIIIIIIlII[1]);
        bI = new WorldPoint(lIIIIIIIlII[49], lIIIIIIIlII[50], lIIIIIIIlII[1]);
        bJ = new WorldPoint(lIIIIIIIlII[52], lIIIIIIIlII[53], lIIIIIIIlII[1]);
        bK = new WorldPoint(lIIIIIIIlII[54], lIIIIIIIlII[55], lIIIIIIIlII[1]);
        bL = new WorldPoint(lIIIIIIIlII[56], lIIIIIIIlII[57], lIIIIIIIlII[1]);
        bM = new WorldPoint(lIIIIIIIlII[39], lIIIIIIIlII[40], lIIIIIIIlII[1]);
        bN = new WorldPoint(lIIIIIIIlII[58], lIIIIIIIlII[59], lIIIIIIIlII[1]);
        bO = new WorldPoint(lIIIIIIIlII[37], lIIIIIIIlII[38], lIIIIIIIlII[1]);
        bP = System.currentTimeMillis();
        String[] stringArray = new String[lIIIIIIIlII[10]];
        stringArray[l.lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[60]];
        stringArray[l.lIIIIIIIlII[0]] = lIIIIIIIIll[lIIIIIIIlII[61]];
        stringArray[l.lIIIIIIIlII[3]] = lIIIIIIIIll[lIIIIIIIlII[62]];
        bQ = stringArray;
        bR = new WorldArea(lIIIIIIIlII[63], lIIIIIIIlII[64], lIIIIIIIlII[65], lIIIIIIIlII[66], lIIIIIIIlII[1]);
        bS = lIIIIIIIlII[1];
        bU = e.c(lIIIIIIIlII[31], lIIIIIIIlII[32]);
    }

    private static void llIllIlIIIIII() {
        lIIIIIIIIll = new String[lIIIIIIIlII[67]];
        l.lIIIIIIIIll[l.lIIIIIIIlII[1]] = l."reset aggro timer";
        l.lIIIIIIIIll[l.lIIIIIIIlII[0]] = l."Navigating to bank";
        l.lIIIIIIIIll[l.lIIIIIIIlII[3]] = l."Handling banking";
        l.lIIIIIIIIll[l.lIIIIIIIlII[10]] = l."Nav to sand crabs";
        l.lIIIIIIIIll[l.lIIIIIIIlII[12]] = l."Drink";
        l.lIIIIIIIIll[l.lIIIIIIIlII[13]] = l."Nav to veos";
        l.lIIIIIIIIll[l.lIIIIIIIlII[14]] = l."Handle veos chat";
        l.lIIIIIIIIll[l.lIIIIIIIlII[15]] = l."Veos";
        l.lIIIIIIIIll[l.lIIIIIIIlII[16]] = l."Port Piscarilius";
        l.lIIIIIIIIll[l.lIIIIIIIlII[17]] = l."Port Piscarilius";
        l.lIIIIIIIIll[l.lIIIIIIIlII[8]] = l."Port Piscarilius";
        l.lIIIIIIIIll[l.lIIIIIIIlII[18]] = l."Veos";
        l.lIIIIIIIIll[l.lIIIIIIIlII[19]] = l."Eat";
        l.lIIIIIIIIll[l.lIIIIIIIlII[20]] = l."Afking in spot";
        l.lIIIIIIIIll[l.lIIIIIIIlII[21]] = l."Being crashed";
        l.lIIIIIIIIll[l.lIIIIIIIlII[22]] = l."Attacking crashed";
        l.lIIIIIIIIll[l.lIIIIIIIlII[23]] = l."Attack";
        l.lIIIIIIIIll[l.lIIIIIIIlII[30]] = l."Resetting";
        l.lIIIIIIIIll[l.lIIIIIIIlII[34]] = l."Sand Crabs";
        l.lIIIIIIIIll[l.lIIIIIIIlII[36]] = l."sand crab";
        l.lIIIIIIIIll[l.lIIIIIIIlII[60]] = l."That's great, can you take me there please?";
        l.lIIIIIIIIll[l.lIIIIIIIlII[61]] = l."Can you take me to Great Kourend?";
        l.lIIIIIIIIll[l.lIIIIIIIlII[62]] = l."Goodbye.";
    }
}

