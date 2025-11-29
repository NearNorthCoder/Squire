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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
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

public class j
implements M {
    public static /* synthetic */ WorldPoint bR;
    static /* synthetic */ int ca;
    public static /* synthetic */ WorldPoint bM;
    public static /* synthetic */ int bY;
    public static /* synthetic */ WorldPoint bN;
    public static /* synthetic */ WorldPoint bS;
    public static /* synthetic */ WorldPoint bO;
    public static /* synthetic */ WorldPoint bH;
    public static /* synthetic */ WorldPoint bF;
    public static /* synthetic */ long bV;
    public static /* synthetic */ WorldPoint bJ;
    public static /* synthetic */ WorldPoint bG;
    public static /* synthetic */ WorldPoint bU;
    public static /* synthetic */ WorldPoint bP;
    public static /* synthetic */ int bZ;
    public static /* synthetic */ String[] bW;
    private static /* synthetic */ String[] lIIIllllIlIII;
    public static /* synthetic */ WorldPoint bE;
    public static /* synthetic */ WorldPoint bQ;
    public static /* synthetic */ WorldPoint bI;
    public static /* synthetic */ WorldPoint bT;
    public static /* synthetic */ WorldPoint bK;
    public static /* synthetic */ WorldArea bX;
    public static /* synthetic */ WorldPoint bL;
    private static /* synthetic */ int[] lIIIllllIlIIl;

    private static boolean lIlIIlIlllIIIII(int n2) {
        return n2 >= 0;
    }

    private static boolean lIlIIlIllIlllll(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIllIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIllIlllII(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIIlIlllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        j.lIlIIlIllIlIlII();
        j.lIlIIlIllIlIIll();
        bE = new WorldPoint(lIIIllllIlIIl[37], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bF = new WorldPoint(lIIIllllIlIIl[39], lIIIllllIlIIl[40], lIIIllllIlIIl[1]);
        bG = new WorldPoint(lIIIllllIlIIl[41], lIIIllllIlIIl[42], lIIIllllIlIIl[1]);
        bH = new WorldPoint(lIIIllllIlIIl[43], lIIIllllIlIIl[44], lIIIllllIlIIl[1]);
        bI = new WorldPoint(lIIIllllIlIIl[45], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bJ = new WorldPoint(lIIIllllIlIIl[46], lIIIllllIlIIl[47], lIIIllllIlIIl[1]);
        bK = new WorldPoint(lIIIllllIlIIl[39], lIIIllllIlIIl[40], lIIIllllIlIIl[1]);
        bL = new WorldPoint(lIIIllllIlIIl[48], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bM = new WorldPoint(lIIIllllIlIIl[49], lIIIllllIlIIl[50], lIIIllllIlIIl[1]);
        bN = new WorldPoint(lIIIllllIlIIl[51], lIIIllllIlIIl[42], lIIIllllIlIIl[1]);
        bO = new WorldPoint(lIIIllllIlIIl[49], lIIIllllIlIIl[50], lIIIllllIlIIl[1]);
        bP = new WorldPoint(lIIIllllIlIIl[52], lIIIllllIlIIl[53], lIIIllllIlIIl[1]);
        bQ = new WorldPoint(lIIIllllIlIIl[54], lIIIllllIlIIl[55], lIIIllllIlIIl[1]);
        bR = new WorldPoint(lIIIllllIlIIl[56], lIIIllllIlIIl[57], lIIIllllIlIIl[1]);
        bS = new WorldPoint(lIIIllllIlIIl[39], lIIIllllIlIIl[40], lIIIllllIlIIl[1]);
        bT = new WorldPoint(lIIIllllIlIIl[58], lIIIllllIlIIl[59], lIIIllllIlIIl[1]);
        bU = new WorldPoint(lIIIllllIlIIl[37], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bV = System.currentTimeMillis();
        String[] stringArray = new String[lIIIllllIlIIl[10]];
        stringArray[j.lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[60]];
        stringArray[j.lIIIllllIlIIl[0]] = lIIIllllIlIII[lIIIllllIlIIl[61]];
        stringArray[j.lIIIllllIlIIl[3]] = lIIIllllIlIII[lIIIllllIlIIl[62]];
        bW = stringArray;
        bX = new WorldArea(lIIIllllIlIIl[63], lIIIllllIlIIl[64], lIIIllllIlIIl[65], lIIIllllIlIIl[66], lIIIllllIlIIl[1]);
        bY = lIIIllllIlIIl[1];
        ca = e.c(lIIIllllIlIIl[31], lIIIllllIlIIl[32]);
    }

    private static String lIlIIlIllIlIIII(String var27, String var10) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIIIllllIlIIl[16]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIIllllIlIIl[3], var9);
            return new String(var15.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIllIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIllIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    public static void al() {
        NPC var17;
        WorldArea var16;
        if (j.lIlIIlIllIlllII(j.lIlIIlIllIllIlI(e.a(bV), lIIIllllIlIIl[9] + ca))) {
            if (j.lIlIIlIllIlIllI(Players.getLocal().getWorldLocation().equals((Object)bU) ? 1 : 0)) {
                AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[10]];
                if (j.lIlIIlIllIlIlIl(Movement.getRunEnergy(), lIIIllllIlIIl[11]) && j.lIlIIlIllIllIII(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.ba).interact(lIIIllllIlIII[lIIIllllIlIIl[12]]);
                    Time.sleepTicks((int)lIIIllllIlIIl[0]);
                    0;
                }
                if (j.lIlIIlIllIlIllI(bX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (j.lIlIIlIllIlllIl(Players.getLocal().getWorldLocation().distanceTo(bT), lIIIllllIlIIl[10])) {
                        AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[13]];
                        Movement.walkTo((WorldPoint)bT);
                        0;
                        Time.sleepTicks((int)lIIIllllIlIIl[0]);
                        0;
                    }
                    if (j.lIlIIlIllIllllI(Players.getLocal().getWorldLocation().distanceTo(bT), lIIIllllIlIIl[10])) {
                        AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[14]];
                        if (j.lIlIIlIllIlIlIl(bY, lIIIllllIlIIl[0])) {
                            e.w();
                            bY += lIIIllllIlIIl[0];
                        }
                        String[] stringArray = new String[lIIIllllIlIIl[0]];
                        stringArray[j.lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[15]];
                        var16 = NPCs.getNearest((String[])stringArray);
                        if (j.lIlIIlIllIlIlll(var16)) {
                            String[] stringArray2 = new String[lIIIllllIlIIl[0]];
                            stringArray2[j.lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[16]];
                            if (j.lIlIIlIllIllIII(var16.hasAction(stringArray2) ? 1 : 0)) {
                                var16.interact(lIIIllllIlIII[lIIIllllIlIIl[17]]);
                                Time.sleepTicks((int)lIIIllllIlIIl[10]);
                                0;
                            }
                            String[] stringArray3 = new String[lIIIllllIlIIl[0]];
                            stringArray3[j.lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[8]];
                            if (j.lIlIIlIllIlIllI(var16.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(lIIIllllIlIII[lIIIllllIlIIl[18]], bW);
                                Time.sleepTicks((int)lIIIllllIlIIl[0]);
                                0;
                            }
                        }
                    }
                }
                if (j.lIlIIlIllIllIII(bX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)bU);
                    0;
                    Time.sleepTicks((int)lIIIllllIlIIl[0]);
                    0;
                }
            }
            if (j.lIlIIlIllIllIII(Players.getLocal().getWorldLocation().equals((Object)bU) ? 1 : 0)) {
                if (j.lIlIIlIllIlllII(j.lIlIIlIllIllIll(e.v(), 45.0))) {
                    int[] nArray = new int[lIIIllllIlIIl[0]];
                    nArray[j.lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
                    if (j.lIlIIlIllIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIllllIlIIl[0]];
                        nArray2[j.lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
                        Inventory.getFirst((int[])nArray2).interact(lIIIllllIlIII[lIIIllllIlIIl[19]]);
                        Time.sleepTicks((int)lIIIllllIlIIl[0]);
                        0;
                    }
                }
                if (j.lIlIIlIllIlIllI(j.an() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[20]];
                    Time.sleepTicks((int)lIIIllllIlIIl[15]);
                    0;
                }
                if (j.lIlIIlIllIllIII(j.an() ? 1 : 0)) {
                    var16 = new WorldArea(bU, lIIIllllIlIIl[3], lIIIllllIlIIl[3]);
                    var17 = j.am();
                    AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[21]];
                    if (j.lIlIIlIllIlllll(Players.getLocal().getInteracting()) && j.lIlIIlIllIlIlll(var17) && j.lIlIIlIllIlIllI(var17.isDead() ? 1 : 0)) {
                        System.out.println(lIIIllllIlIII[lIIIllllIlIIl[22]]);
                        var17.interact(lIIIllllIlIII[lIIIllllIlIIl[23]]);
                        Time.sleepTicks((int)lIIIllllIlIIl[3]);
                        0;
                    }
                    Time.sleepTicks((int)lIIIllllIlIIl[12]);
                    0;
                }
            }
        }
        if (j.lIlIIlIlllIIIII(j.lIlIIlIllIllIlI(e.a(bV), lIIIllllIlIIl[9] + ca))) {
            var16 = new WorldArea(lIIIllllIlIIl[24], lIIIllllIlIIl[25], lIIIllllIlIIl[26], lIIIllllIlIIl[27], lIIIllllIlIIl[1]);
            var17 = new WorldPoint(lIIIllllIlIIl[28], lIIIllllIlIIl[29], lIIIllllIlIIl[1]);
            if (j.lIlIIlIllIllIII(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.lIlIIlIllIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var17), lIIIllllIlIIl[13])) {
                Movement.walkTo((WorldPoint)var17);
                0;
            }
            AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[30]];
            Movement.walkTo((WorldPoint)bK);
            0;
            Time.sleepTicks((int)lIIIllllIlIIl[0]);
            0;
            if (j.lIlIIlIllIllllI(Players.getLocal().getWorldLocation().distanceTo(bK), lIIIllllIlIIl[3])) {
                bV = System.currentTimeMillis();
                ca = e.c(lIIIllllIlIIl[31], lIIIllllIlIIl[32]);
            }
        }
    }

    private static boolean lIlIIlIllIlIlll(Object object) {
        return object != null;
    }

    private static void ak() {
        if (j.lIlIIlIllIlIlIl(bZ, lIIIllllIlIIl[0])) {
            bV = System.currentTimeMillis();
            System.out.println(lIIIllllIlIII[lIIIllllIlIIl[1]]);
            bZ += lIIIllllIlIIl[0];
        }
        int[] nArray = new int[lIIIllllIlIIl[0]];
        nArray[j.lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
        if (j.lIlIIlIllIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation var7 = BankLocation.getNearest();
            if (j.lIlIIlIllIlIlll(var7) && j.lIlIIlIllIlIllI(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[0]];
                a.a(var7);
            }
            if (j.lIlIIlIllIlIlll(var7) && j.lIlIIlIllIllIII(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[3]];
                if (j.lIlIIlIllIlIllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIlIIl[4]);
                    0;
                }
                if (j.lIlIIlIllIllIII(Bank.isOpen() ? 1 : 0)) {
                    if (j.lIlIIlIllIllIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIIIllllIlIIl[0]);
                        0;
                    }
                    a.a(lIIIllllIlIIl[2], lIIIllllIlIIl[5]);
                    a.a(lIIIllllIlIIl[6], lIIIllllIlIIl[0]);
                    a.a(lIIIllllIlIIl[7], lIIIllllIlIIl[8]);
                }
            }
        }
        int[] nArray2 = new int[lIIIllllIlIIl[0]];
        nArray2[j.lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
        if (j.lIlIIlIllIllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.al();
        }
    }

    private static boolean lIlIIlIlllIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIIlIllIlIIll() {
        lIIIllllIlIII = new String[lIIIllllIlIIl[67]];
        j.lIIIllllIlIII[j.lIIIllllIlIIl[1]] = j."reset aggro timer";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[0]] = j."Navigating to bank";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[3]] = j."Handling banking";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[10]] = j."Nav to sand crabs";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[12]] = j."Drink";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[13]] = j."Nav to veos";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[14]] = j."Handle veos chat";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[15]] = j."Veos";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[16]] = j."Port Piscarilius";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[17]] = j."Port Piscarilius";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[8]] = j."Port Piscarilius";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[18]] = j."Veos";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[19]] = j."Eat";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[20]] = j."Afking in spot";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[21]] = j."Being crashed";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[22]] = j."Attacking crashed";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[23]] = j."Attack";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[30]] = j."Resetting";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[34]] = j."Sand Crabs";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[36]] = j."sand crab";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[60]] = j."That's great, can you take me there please?";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[61]] = j."Can you take me to Great Kourend?";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[62]] = j."Goodbye.";
    }

    private static void lIlIIlIllIlIlII() {
        lIIIllllIlIIl = new int[68];
        j.lIIIllllIlIIl[0] = 1;
        j.lIIIllllIlIIl[1] = (0x30 ^ 0x1D ^ (0xB6 ^ 0xA7)) & (0x57 ^ 0x5D ^ (0x10 ^ 0x26) ^ -1);
        j.lIIIllllIlIIl[2] = 0xFFFFC17F & 0x3FFB;
        j.lIIIllllIlIIl[3] = 2;
        j.lIIIllllIlIIl[4] = -(0xA5 ^ 0xC2) & (0xFFFFD3FE & 0x3FEF);
        j.lIIIllllIlIIl[5] = 0x8A ^ 0x92;
        j.lIIIllllIlIIl[6] = -(0xFFFF8ACD & 0x7DBF) & (0xFFFFBBFD & 0x7DDF);
        j.lIIIllllIlIIl[7] = 0xFFFFBFFD & 0x5F4B;
        j.lIIIllllIlIIl[8] = 0x43 ^ 0x49;
        j.lIIIllllIlIIl[9] = 0xFFFFF7F4 & 0x92FCB;
        j.lIIIllllIlIIl[10] = 3;
        j.lIIIllllIlIIl[11] = 0x24 ^ 0x74 ^ (0x4E ^ 0x58);
        j.lIIIllllIlIIl[12] = 0x33 ^ 0x5F ^ (0x3B ^ 0x53);
        j.lIIIllllIlIIl[13] = 0xC ^ 9;
        j.lIIIllllIlIIl[14] = 0x59 ^ 0x19 ^ (0xF8 ^ 0xBE);
        j.lIIIllllIlIIl[15] = 9 ^ 0xE;
        j.lIIIllllIlIIl[16] = 27 + 55 - -107 + 2 ^ 83 + 46 - 3 + 57;
        j.lIIIllllIlIIl[17] = 0xB6 ^ 0xC4 ^ (0xC1 ^ 0xBA);
        j.lIIIllllIlIIl[18] = 0xEF ^ 0xBD ^ (0x7E ^ 0x27);
        j.lIIIllllIlIIl[19] = 64 + 38 - -47 + 54 ^ 127 + 31 - 126 + 167;
        j.lIIIllllIlIIl[20] = 0x79 ^ 0x74;
        j.lIIIllllIlIIl[21] = 0x2F ^ 0x21;
        j.lIIIllllIlIIl[22] = 0x41 ^ 0x62 ^ (0xA9 ^ 0x85);
        j.lIIIllllIlIIl[23] = 0x4A ^ 0x5A;
        j.lIIIllllIlIIl[24] = -(0xFFFFB73F & 0x5CC3) & (0xFFFFFFBF & 0x1FFE);
        j.lIIIllllIlIIl[25] = 0xFFFFAEED & 0x5DB2;
        j.lIIIllllIlIIl[26] = 0x80 ^ 0xC1;
        j.lIIIllllIlIIl[27] = 0x35 ^ 0x12;
        j.lIIIllllIlIIl[28] = -(0xFFFFE5FB & 0x7E15) & (0xFFFFFFFF & 0x6FFD);
        j.lIIIllllIlIIl[29] = -(0xFFFF9B5F & 0x76F1) & (0xFFFFFEFF & 0x1FFF);
        j.lIIIllllIlIIl[30] = 0x4B ^ 0x5A;
        j.lIIIllllIlIIl[31] = 0xFFFFFEDD & 0x3BBA;
        j.lIIIllllIlIIl[32] = 0xFFFFF5BE & 0x7F71;
        j.lIIIllllIlIIl[33] = 17 + 72 - -12 + 26 ^ (0x26 ^ 0x3D);
        j.lIIIllllIlIIl[34] = 118 + 6 - 122 + 141 ^ 79 + 76 - 148 + 150;
        j.lIIIllllIlIIl[35] = 0x13 ^ 0x76 ^ (0x15 ^ 0x13);
        j.lIIIllllIlIIl[36] = 0x77 ^ 0x7B ^ (0x42 ^ 0x5D);
        j.lIIIllllIlIIl[37] = -(0xFFFFE9C4 & 0x1F3F) & (0xFFFFEFF7 & 0x1FFB);
        j.lIIIllllIlIIl[38] = -(0xFFFFB21F & 0x7FE2) & (0xFFFFFF9F & 0x3FED);
        j.lIIIllllIlIIl[39] = 0xFFFFEF35 & 0x17CA;
        j.lIIIllllIlIIl[40] = 0xFFFFEFB4 & 0x1DFF;
        j.lIIIllllIlIIl[41] = 0xFFFF97CF & 0x6EF9;
        j.lIIIllllIlIIl[42] = 0xFFFFCFFF & 0x3D8D;
        j.lIIIllllIlIIl[43] = -(0xFFFFBD4C & 0x7BBF) & (0xFFFFFFEF & 0x3FDF);
        j.lIIIllllIlIIl[44] = -(0xFFFFD88F & 0x7771) & (0xFFFFDDB9 & 0x7FF6);
        j.lIIIllllIlIIl[45] = 0xFFFFBEFF & 0x47FE;
        j.lIIIllllIlIIl[46] = -(0xFFFFBFBF & 0x5946) & (0xFFFFFFFF & 0x1FFF);
        j.lIIIllllIlIIl[47] = 0xFFFFDFEF & 0x2DBF;
        j.lIIIllllIlIIl[48] = 0xFFFF96FF & 0x6FE5;
        j.lIIIllllIlIIl[49] = 0xFFFFC6E7 & 0x3FFE;
        j.lIIIllllIlIIl[50] = 0xFFFFFFD7 & 0xDEB;
        j.lIIIllllIlIIl[51] = -(0xFFFFB369 & 0x6CBF) & (0xFFFFF6FF & 0x2FFD);
        j.lIIIllllIlIIl[52] = -(0xFFFFFBBD & 0x7547) & (0xFFFFFF8F & 0x77FF);
        j.lIIIllllIlIIl[53] = 0xFFFFFFD6 & 0xDBF;
        j.lIIIllllIlIIl[54] = -(0xFFFFFF0D & 0x59F3) & (0xFFFFDFFF & 0x7FB5);
        j.lIIIllllIlIIl[55] = 0xFFFFCFBF & 0x3DCB;
        j.lIIIllllIlIIl[56] = -(0xFFFFF5E3 & 0x3B1F) & (0xFFFFBFEF & 0x77FF);
        j.lIIIllllIlIIl[57] = 0xFFFFEFDF & 0x1DA5;
        j.lIIIllllIlIIl[58] = -(0xFFFFB7CA & 0x5C37) & (0xFFFFBFEF & 0x5FFF);
        j.lIIIllllIlIIl[59] = -(0xFFFFA4FE & 0x7B53) & (0xFFFFEDFF & 0x3EFF);
        j.lIIIllllIlIIl[60] = 0xA5 ^ 0xB1;
        j.lIIIllllIlIIl[61] = 0x83 ^ 0x96;
        j.lIIIllllIlIIl[62] = 0xBB ^ 0xAD;
        j.lIIIllllIlIIl[63] = 0xFFFFFECF & 0x5BE;
        j.lIIIllllIlIIl[64] = 0xFFFFCFBA & 0x3D7D;
        j.lIIIllllIlIIl[65] = 0xFFFFAFDB & 0x5337;
        j.lIIIllllIlIIl[66] = 0xFFFFEFFF & 0x12B7;
        j.lIIIllllIlIIl[67] = 0x7E ^ 0x77 ^ (0x86 ^ 0x98);
    }

    private static int lIlIIlIllIllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean aa() {
        int n2;
        if (j.lIlIIlIlllIIIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIllllIlIIl[35]) && j.lIlIIlIlllIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIllllIlIIl[35])) {
            n2 = lIIIllllIlIIl[0];
            0;
            if (-1 > ((132 + 181 - 205 + 135 ^ 121 + 40 - 20 + 45) & (0x75 ^ 0x37 ^ (0xBF ^ 0xB4) ^ -1))) {
                return ((85 + 4 - -115 + 1 ^ 49 + 123 - 55 + 13) & (0xED ^ 0x8E ^ (0xF ^ 0x23) ^ -1)) != 0;
            }
        } else {
            n2 = lIIIllllIlIIl[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean an() {
        WorldArea worldArea = new WorldArea(bU, lIIIllllIlIIl[10], lIIIllllIlIIl[10]);
        List list = Players.getAll();
        if (j.lIlIIlIllIlIllI(list.isEmpty() ? 1 : 0) && j.lIlIIlIllIlllIl(list.size(), lIIIllllIlIIl[0])) {
            void var21;
            int var14 = lIIIllllIlIIl[1];
            while (j.lIlIIlIllIlIlIl(var14, var21.size())) {
                void var5;
                if (j.lIlIIlIllIllIII(((Player)var21.get(var14)).equals(Players.getLocal()) ? 1 : 0)) {
                    0;
                    if (3 != 3) {
                        return ((102 + 14 - -66 + 72 ^ 35 + 149 - 66 + 60) & (0x43 ^ 0x1E ^ (0x4F ^ 0x5E) ^ -1)) != 0;
                    }
                } else if (j.lIlIIlIllIllIII(var5.contains(((Player)var21.get(var14)).getWorldLocation()) ? 1 : 0)) {
                    return lIIIllllIlIIl[0];
                }
                ++var14;
                0;
                if (-3 <= 0) continue;
                return false;
            }
        }
        return lIIIllllIlIIl[1];
    }

    private static String lIlIIlIllIlIIlI(String var6, String var4) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var19 = var4.toCharArray();
        int var12 = lIIIllllIlIIl[1];
        char[] var22 = var6.toCharArray();
        int var18 = var22.length;
        int var1 = lIIIllllIlIIl[1];
        while (j.lIlIIlIllIlIlIl(var1, var18)) {
            char var3 = var22[var1];
            var13.append((char)(var3 ^ var19[var12 % var19.length]));
            0;
            ++var12;
            ++var1;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean lIlIIlIllIllIII(int n2) {
        return n2 != 0;
    }

    @Override
    public String Z() {
        return lIIIllllIlIII[lIIIllllIlIIl[34]];
    }

    private static int lIlIIlIllIllIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Override
    public boolean X() {
        return lIIIllllIlIIl[1];
    }

    /*
     * WARNING - void declaration
     */
    static NPC am() {
        WorldPoint worldPoint = bU;
        WorldPoint worldPoint2 = new WorldPoint(bU.getX() - lIIIllllIlIIl[0], bU.getWorldY() + lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(bU.getX(), bU.getWorldY() + lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(bU.getX() + lIIIllllIlIIl[0], bU.getWorldY() + lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(bU.getX() + lIIIllllIlIIl[0], bU.getWorldY(), lIIIllllIlIIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(bU.getX() + lIIIllllIlIIl[0], bU.getWorldY() - lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(bU.getX(), bU.getWorldY() - lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(bU.getX() - lIIIllllIlIIl[0], bU.getWorldY() - lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(bU.getX() - lIIIllllIlIIl[0], bU.getWorldY(), lIIIllllIlIIl[1]);
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(lIIIllllIlIII[lIIIllllIlIIl[36]]));
        if (j.lIlIIlIllIlIlll(list)) {
            void var28;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int var2 = lIIIllllIlIIl[1];
            while (j.lIlIIlIllIlIlIl(var2, var28.size())) {
                void var20;
                if (j.lIlIIlIllIllIII(var20.contains(((NPC)var28.get(var2)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)var28.get(var2);
                }
                ++var2;
                0;
                if (((0x29 ^ 0x6C) & ~(0x7C ^ 0x39)) >= 0) continue;
                return null;
            }
        }
        return null;
    }

    private static boolean lIlIIlIllIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void ao() {
        void var29;
        int n2 = e.c(lIIIllllIlIIl[0], lIIIllllIlIIl[13]);
        if (j.lIlIIlIlllIIIIl(n2, lIIIllllIlIIl[0])) {
            bU = bE;
            bK = bF;
        }
        if (j.lIlIIlIlllIIIIl((int)var29, lIIIllllIlIIl[3])) {
            bU = bL;
            bK = bM;
        }
        if (j.lIlIIlIlllIIIIl((int)var29, lIIIllllIlIIl[10])) {
            bU = bN;
            bK = bO;
        }
        if (j.lIlIIlIlllIIIIl((int)var29, lIIIllllIlIIl[12])) {
            bU = bP;
            bK = bQ;
        }
        if (j.lIlIIlIlllIIIIl((int)var29, lIIIllllIlIIl[13])) {
            bU = bR;
            bK = bS;
        }
    }

    @Override
    public int Y() {
        try {
            j.ak();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x33 ^ 0x37) < 3) {
            return (0x76 ^ 0x16) & ~(0xC2 ^ 0xA2);
        }
        return lIIIllllIlIIl[33];
    }

    private static String lIlIIlIllIlIIIl(String var8, String var24) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var26 = Cipher.getInstance("Blowfish");
            var26.init(lIIIllllIlIIl[3], var25);
            return new String(var26.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }
}

