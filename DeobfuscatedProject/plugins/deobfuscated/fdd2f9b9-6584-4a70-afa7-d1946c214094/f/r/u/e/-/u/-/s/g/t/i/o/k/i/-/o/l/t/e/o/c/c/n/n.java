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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import gg.squire.account.AccBuilderRogues;
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
implements G {
    public static /* synthetic */ WorldPoint bz;
    public static /* synthetic */ WorldArea bS;
    public static /* synthetic */ WorldPoint bB;
    public static /* synthetic */ WorldPoint bJ;
    public static /* synthetic */ WorldPoint bM;
    public static /* synthetic */ WorldPoint bC;
    public static /* synthetic */ String[] bR;
    public static /* synthetic */ long bQ;
    public static /* synthetic */ WorldPoint bH;
    public static /* synthetic */ int bT;
    public static /* synthetic */ WorldPoint bE;
    public static /* synthetic */ WorldPoint bN;
    public static /* synthetic */ WorldPoint bF;
    private static /* synthetic */ String[] lIIlllIIII;
    public static /* synthetic */ WorldPoint bO;
    public static /* synthetic */ WorldPoint bL;
    private static /* synthetic */ int[] lIIlllIIIl;
    public static /* synthetic */ WorldPoint bI;
    public static /* synthetic */ WorldPoint bD;
    static /* synthetic */ int bV;
    public static /* synthetic */ WorldPoint bP;
    public static /* synthetic */ WorldPoint bA;
    public static /* synthetic */ WorldPoint bK;
    public static /* synthetic */ WorldPoint bG;
    public static /* synthetic */ int bU;

    @Override
    public String U() {
        return lIIlllIIII[lIIlllIIIl[34]];
    }

    /*
     * WARNING - void declaration
     */
    public static void aw() {
        void lllllllllllllllllllllIlIlIlIIlIl;
        int n2 = e.c(lIIlllIIIl[0], lIIlllIIIl[13]);
        if (n.lIIIIIllllIlI(n2, lIIlllIIIl[0])) {
            bP = bz;
            bF = bA;
        }
        if (n.lIIIIIllllIlI((int)lllllllllllllllllllllIlIlIlIIlIl, lIIlllIIIl[3])) {
            bP = bG;
            bF = bH;
        }
        if (n.lIIIIIllllIlI((int)lllllllllllllllllllllIlIlIlIIlIl, lIIlllIIIl[10])) {
            bP = bI;
            bF = bJ;
        }
        if (n.lIIIIIllllIlI((int)lllllllllllllllllllllIlIlIlIIlIl, lIIlllIIIl[12])) {
            bP = bK;
            bF = bL;
        }
        if (n.lIIIIIllllIlI((int)lllllllllllllllllllllIlIlIlIIlIl, lIIlllIIIl[13])) {
            bP = bM;
            bF = bN;
        }
    }

    private static boolean lIIIIIllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIlllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIlllIlIl(int n2) {
        return n2 < 0;
    }

    private static void lIIIIIllIllIl() {
        lIIlllIIIl = new int[68];
        n.lIIlllIIIl[0] = 1;
        n.lIIlllIIIl[1] = (0x79 ^ 0x6F ^ (0xFE ^ 0xA7)) & (0 ^ 0x1D ^ (0xEF ^ 0xBD) ^ -1);
        n.lIIlllIIIl[2] = -(0xFFFFF361 & 0x7E9F) & (0xFFFFFB7F & 0x77FB);
        n.lIIlllIIIl[3] = 2;
        n.lIIlllIIIl[4] = -(0xFFFFFC67 & 0x23DF) & (0xFFFFF3CE & 0x3FFF);
        n.lIIlllIIIl[5] = 0x7B ^ 0x63;
        n.lIIlllIIIl[6] = 0xFFFFB3D9 & 0x7D77;
        n.lIIlllIIIl[7] = -(0xFFFFE3FB & 0x7C07) & (0xFFFFFFCF & 0x7F7B);
        n.lIIlllIIIl[8] = 0xE0 ^ 0x94 ^ (0xC2 ^ 0xBC);
        n.lIIlllIIIl[9] = -(0xFFFFF2E7 & 0x5D1F) & (0xFFFFFFD6 & 0x977EF);
        n.lIIlllIIIl[10] = 3;
        n.lIIlllIIIl[11] = 0x87 ^ 0xC1;
        n.lIIlllIIIl[12] = 0x54 ^ 0x50;
        n.lIIlllIIIl[13] = 105 + 6 - -18 + 24 ^ 151 + 97 - 206 + 114;
        n.lIIlllIIIl[14] = 1 ^ 7;
        n.lIIlllIIIl[15] = 0x77 ^ 0x70;
        n.lIIlllIIIl[16] = 0xB2 ^ 0xBA;
        n.lIIlllIIIl[17] = 0x71 ^ 0x78;
        n.lIIlllIIIl[18] = 0x75 ^ 0x7E;
        n.lIIlllIIIl[19] = 0x2B ^ 0x27;
        n.lIIlllIIIl[20] = 0x73 ^ 6 ^ (0xC1 ^ 0xB9);
        n.lIIlllIIIl[21] = 0x88 ^ 0x86;
        n.lIIlllIIIl[22] = 38 + 158 - 155 + 146 ^ 8 + 105 - -20 + 47;
        n.lIIlllIIIl[23] = 0x1C ^ 0xC;
        n.lIIlllIIIl[24] = 0xFFFFABFC & 0x5FBF;
        n.lIIlllIIIl[25] = 0xFFFFAFB8 & 0x5CE7;
        n.lIIlllIIIl[26] = 0x6C ^ 0x2D;
        n.lIIlllIIIl[27] = 0x30 ^ 0x17;
        n.lIIlllIIIl[28] = 0xFFFFDFEF & 0x2BFD;
        n.lIIlllIIIl[29] = 0xFFFFECAF & 0x1FFF;
        n.lIIlllIIIl[30] = 0x84 ^ 0x95;
        n.lIIlllIIIl[31] = -(0xFFFFDF63 & 0x65FF) & (0xFFFFFFFF & 0x7FFA);
        n.lIIlllIIIl[32] = 0xFFFFFD3F & 0x77F0;
        n.lIIlllIIIl[33] = 203 + 234 - 263 + 68 ^ 5 + 130 - 131 + 146;
        n.lIIlllIIIl[34] = 0x93 ^ 0xAF ^ (0x1E ^ 0x30);
        n.lIIlllIIIl[35] = 0xAD ^ 0x93 ^ (0x33 ^ 0x6E);
        n.lIIlllIIIl[36] = 0x6D ^ 0x22 ^ (2 ^ 0x5E);
        n.lIIlllIIIl[37] = 0xFFFFBFF8 & 0x46F7;
        n.lIIlllIIIl[38] = 0xFFFFCD9E & 0x3FED;
        n.lIIlllIIIl[39] = 0xFFFFBF94 & 0x476B;
        n.lIIlllIIIl[40] = 0xFFFFBFB4 & 0x4DFF;
        n.lIIlllIIIl[41] = -(0xFFFFD7A7 & 0x7859) & (0xFFFFDEDF & 0x77E9);
        n.lIIlllIIIl[42] = -(0xFFFFEC9B & 0x7377) & (0xFFFFEDDF & 0x7FBF);
        n.lIIlllIIIl[43] = 0xFFFFA6F6 & 0x5FCD;
        n.lIIlllIIIl[44] = -(0xFFFFFF79 & 0x5087) & (0xFFFFDDF9 & 0x7FB6);
        n.lIIlllIIIl[45] = 0xFFFFD7FE & 0x2EFF;
        n.lIIlllIIIl[46] = -(0xFFFFCB46 & 0x7CBF) & (0xFFFFEEFF & 0x5FFF);
        n.lIIlllIIIl[47] = 0xFFFFDFFF & 0x2DAF;
        n.lIIlllIIIl[48] = -(0xFFFFD81F & 0x7FFB) & (0xFFFFDFFF & 0x7EFF);
        n.lIIlllIIIl[49] = 0xFFFFAEEE & 0x57F7;
        n.lIIlllIIIl[50] = -(0xFFFFF98D & 0x5677) & (0xFFFFDDF7 & 0x7FCF);
        n.lIIlllIIIl[51] = -(0xFFFFC36B & 0x7D97) & (0xFFFFF7FF & 0x4FD7);
        n.lIIlllIIIl[52] = 0xFFFFBEAF & 0x47DB;
        n.lIIlllIIIl[53] = -(0xFFFFC2ED & 0x7D5B) & (0xFFFFFFFF & 0x4DDE);
        n.lIIlllIIIl[54] = 0xFFFF8EBD & 0x77F7;
        n.lIIlllIIIl[55] = -(0xFFFFB74D & 0x5AF3) & (0xFFFFDFFB & 0x3FCF);
        n.lIIlllIIIl[56] = 0xFFFF8FFF & 0x76ED;
        n.lIIlllIIIl[57] = 0xFFFF8DDF & 0x7FA5;
        n.lIIlllIIIl[58] = 0xFFFFFFFE & 0xBEF;
        n.lIIlllIIIl[59] = -(0xFFFF9F33 & 0x61DE) & (0xFFFFBDBF & 0x4FFF);
        n.lIIlllIIIl[60] = 37 + 99 - -23 + 30 ^ 12 + 17 - -137 + 3;
        n.lIIlllIIIl[61] = 3 ^ (0x1D ^ 0xB);
        n.lIIlllIIIl[62] = 0x2B ^ 0x3D;
        n.lIIlllIIIl[63] = -(0xFFFFD9D6 & 0x7F7B) & (0xFFFFDDFF & 0x7FDF);
        n.lIIlllIIIl[64] = 0xFFFFEDBA & 0x1F7D;
        n.lIIlllIIIl[65] = -(0xFFFFFDEF & 0x7E79) & (0xFFFFFF7F & 0x7FFB);
        n.lIIlllIIIl[66] = 0xFFFFFEF7 & 0x3BF;
        n.lIIlllIIIl[67] = 0x1F ^ 8;
    }

    private static boolean lIIIIIllIllll(int n2) {
        return n2 == 0;
    }

    private static String lIIIIIllIlIIl(String lllllllllllllllllllllIlIlIIlIIll, String lllllllllllllllllllllIlIlIIlIIlI) {
        lllllllllllllllllllllIlIlIIlIIll = new String(Base64.getDecoder().decode(lllllllllllllllllllllIlIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllIlIlIIlIllI = new StringBuilder();
        char[] lllllllllllllllllllllIlIlIIlIlIl = lllllllllllllllllllllIlIlIIlIIlI.toCharArray();
        int lllllllllllllllllllllIlIlIIlIlII = lIIlllIIIl[1];
        char[] lllllllllllllllllllllIlIlIIIlllI = lllllllllllllllllllllIlIlIIlIIll.toCharArray();
        int lllllllllllllllllllllIlIlIIIllIl = lllllllllllllllllllllIlIlIIIlllI.length;
        int lllllllllllllllllllllIlIlIIIllII = lIIlllIIIl[1];
        while (n.lIIIIIllIlllI(lllllllllllllllllllllIlIlIIIllII, lllllllllllllllllllllIlIlIIIllIl)) {
            char lllllllllllllllllllllIlIlIIllIIl = lllllllllllllllllllllIlIlIIIlllI[lllllllllllllllllllllIlIlIIIllII];
            lllllllllllllllllllllIlIlIIlIllI.append((char)(lllllllllllllllllllllIlIlIIllIIl ^ lllllllllllllllllllllIlIlIIlIlIl[lllllllllllllllllllllIlIlIIlIlII % lllllllllllllllllllllIlIlIIlIlIl.length]));
            0;
            ++lllllllllllllllllllllIlIlIIlIlII;
            ++lllllllllllllllllllllIlIlIIIllII;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllllIlIlIIlIllI);
    }

    private static int lIIIIIlllIIll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Override
    public int T() {
        try {
            n.as();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x41 ^ 0x45) == 0) {
            return (8 ^ 0x4D) & ~(0xF9 ^ 0xBC);
        }
        return lIIlllIIIl[33];
    }

    private static String lIIIIIllIlIll(String lllllllllllllllllllllIlIlIIIIIll, String lllllllllllllllllllllIlIlIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllllllllIlIlIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIlIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllIIIl[16]), "DES");
            Cipher lllllllllllllllllllllIlIlIIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllllllllIlIlIIIIlIl.init(lIIlllIIIl[3], lllllllllllllllllllllIlIlIIIIllI);
            return new String(lllllllllllllllllllllIlIlIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIlIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllIlIlIIIIlII) {
            lllllllllllllllllllllIlIlIIIIlII.printStackTrace();
            return null;
        }
    }

    private static void as() {
        if (n.lIIIIIllIlllI(bU, lIIlllIIIl[0])) {
            bQ = System.currentTimeMillis();
            System.out.println(lIIlllIIII[lIIlllIIIl[1]]);
            bU += lIIlllIIIl[0];
        }
        int[] nArray = new int[lIIlllIIIl[0]];
        nArray[n.lIIlllIIIl[1]] = lIIlllIIIl[2];
        if (n.lIIIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation lllllllllllllllllllllIlIllIIlIIl = BankLocation.getNearest();
            if (n.lIIIIIlllIIII(lllllllllllllllllllllIlIllIIlIIl) && n.lIIIIIllIllll(lllllllllllllllllllllIlIllIIlIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[0]];
                a.a(lllllllllllllllllllllIlIllIIlIIl);
            }
            if (n.lIIIIIlllIIII(lllllllllllllllllllllIlIllIIlIIl) && n.lIIIIIlllIIIl(lllllllllllllllllllllIlIllIIlIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[3]];
                if (n.lIIIIIllIllll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllIIIl[4]);
                    0;
                }
                if (n.lIIIIIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                    if (n.lIIIIIlllIIlI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIIlllIIIl[0]);
                        0;
                    }
                    a.a(lIIlllIIIl[2], lIIlllIIIl[5]);
                    a.a(lIIlllIIIl[6], lIIlllIIIl[0]);
                    a.a(lIIlllIIIl[7], lIIlllIIIl[8]);
                }
            }
        }
        int[] nArray2 = new int[lIIlllIIIl[0]];
        nArray2[n.lIIlllIIIl[1]] = lIIlllIIIl[2];
        if (n.lIIIIIlllIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            n.at();
        }
    }

    private static boolean lIIIIIllllIII(Object object) {
        return object == null;
    }

    private static boolean lIIIIIlllIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIIIIIllIllII() {
        lIIlllIIII = new String[lIIlllIIIl[67]];
        n.lIIlllIIII[n.lIIlllIIIl[1]] = n."reset aggro timer";
        n.lIIlllIIII[n.lIIlllIIIl[0]] = n."Navigating to bank";
        n.lIIlllIIII[n.lIIlllIIIl[3]] = n."Handling banking";
        n.lIIlllIIII[n.lIIlllIIIl[10]] = n."Nav to sand crabs";
        n.lIIlllIIII[n.lIIlllIIIl[12]] = n."Drink";
        n.lIIlllIIII[n.lIIlllIIIl[13]] = n."Nav to veos";
        n.lIIlllIIII[n.lIIlllIIIl[14]] = n."Handle veos chat";
        n.lIIlllIIII[n.lIIlllIIIl[15]] = n."Veos";
        n.lIIlllIIII[n.lIIlllIIIl[16]] = n."Port Piscarilius";
        n.lIIlllIIII[n.lIIlllIIIl[17]] = n."Port Piscarilius";
        n.lIIlllIIII[n.lIIlllIIIl[8]] = n."Port Piscarilius";
        n.lIIlllIIII[n.lIIlllIIIl[18]] = n."Veos";
        n.lIIlllIIII[n.lIIlllIIIl[19]] = n."Eat";
        n.lIIlllIIII[n.lIIlllIIIl[20]] = n."Afking in spot";
        n.lIIlllIIII[n.lIIlllIIIl[21]] = n."Being crashed";
        n.lIIlllIIII[n.lIIlllIIIl[22]] = n."Attacking crashed";
        n.lIIlllIIII[n.lIIlllIIIl[23]] = n."Attack";
        n.lIIlllIIII[n.lIIlllIIIl[30]] = n."Resetting";
        n.lIIlllIIII[n.lIIlllIIIl[34]] = n."Sand Crabs";
        n.lIIlllIIII[n.lIIlllIIIl[36]] = n."sand crab";
        n.lIIlllIIII[n.lIIlllIIIl[60]] = n."That's great, can you take me there please?";
        n.lIIlllIIII[n.lIIlllIIIl[61]] = n."Can you take me to Great Kourend?";
        n.lIIlllIIII[n.lIIlllIIIl[62]] = n."Goodbye.";
    }

    private static boolean lIIIIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIlllIIlI(int n2) {
        return n2 > 0;
    }

    public static void at() {
        NPC lllllllllllllllllllllIlIllIIIlIl;
        WorldArea lllllllllllllllllllllIlIllIIIllI;
        if (n.lIIIIIlllIlIl(n.lIIIIIlllIIll(e.a(bQ), lIIlllIIIl[9] + bV))) {
            if (n.lIIIIIllIllll(Players.getLocal().getWorldLocation().equals((Object)bP) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[10]];
                if (n.lIIIIIllIlllI(Movement.getRunEnergy(), lIIlllIIIl[11]) && n.lIIIIIlllIIIl(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aV).interact(lIIlllIIII[lIIlllIIIl[12]]);
                    Time.sleepTicks((int)lIIlllIIIl[0]);
                    0;
                }
                if (n.lIIIIIllIllll(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (n.lIIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(bO), lIIlllIIIl[10])) {
                        AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[13]];
                        Movement.walkTo((WorldPoint)bO);
                        0;
                        Time.sleepTicks((int)lIIlllIIIl[0]);
                        0;
                    }
                    if (n.lIIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(bO), lIIlllIIIl[10])) {
                        AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[14]];
                        if (n.lIIIIIllIlllI(bT, lIIlllIIIl[0])) {
                            e.v();
                            bT += lIIlllIIIl[0];
                        }
                        String[] stringArray = new String[lIIlllIIIl[0]];
                        stringArray[n.lIIlllIIIl[1]] = lIIlllIIII[lIIlllIIIl[15]];
                        lllllllllllllllllllllIlIllIIIllI = NPCs.getNearest((String[])stringArray);
                        if (n.lIIIIIlllIIII(lllllllllllllllllllllIlIllIIIllI)) {
                            String[] stringArray2 = new String[lIIlllIIIl[0]];
                            stringArray2[n.lIIlllIIIl[1]] = lIIlllIIII[lIIlllIIIl[16]];
                            if (n.lIIIIIlllIIIl(lllllllllllllllllllllIlIllIIIllI.hasAction(stringArray2) ? 1 : 0)) {
                                lllllllllllllllllllllIlIllIIIllI.interact(lIIlllIIII[lIIlllIIIl[17]]);
                                Time.sleepTicks((int)lIIlllIIIl[10]);
                                0;
                            }
                            String[] stringArray3 = new String[lIIlllIIIl[0]];
                            stringArray3[n.lIIlllIIIl[1]] = lIIlllIIII[lIIlllIIIl[8]];
                            if (n.lIIIIIllIllll(lllllllllllllllllllllIlIllIIIllI.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(lIIlllIIII[lIIlllIIIl[18]], bR);
                                Time.sleepTicks((int)lIIlllIIIl[0]);
                                0;
                            }
                        }
                    }
                }
                if (n.lIIIIIlllIIIl(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)bP);
                    0;
                    Time.sleepTicks((int)lIIlllIIIl[0]);
                    0;
                }
            }
            if (n.lIIIIIlllIIIl(Players.getLocal().getWorldLocation().equals((Object)bP) ? 1 : 0)) {
                if (n.lIIIIIlllIlIl(n.lIIIIIlllIlII(e.u(), 45.0))) {
                    int[] nArray = new int[lIIlllIIIl[0]];
                    nArray[n.lIIlllIIIl[1]] = lIIlllIIIl[2];
                    if (n.lIIIIIlllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIlllIIIl[0]];
                        nArray2[n.lIIlllIIIl[1]] = lIIlllIIIl[2];
                        Inventory.getFirst((int[])nArray2).interact(lIIlllIIII[lIIlllIIIl[19]]);
                        Time.sleepTicks((int)lIIlllIIIl[0]);
                        0;
                    }
                }
                if (n.lIIIIIllIllll(n.av() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[20]];
                    Time.sleepTicks((int)lIIlllIIIl[15]);
                    0;
                }
                if (n.lIIIIIlllIIIl(n.av() ? 1 : 0)) {
                    lllllllllllllllllllllIlIllIIIllI = new WorldArea(bP, lIIlllIIIl[3], lIIlllIIIl[3]);
                    lllllllllllllllllllllIlIllIIIlIl = n.au();
                    AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[21]];
                    if (n.lIIIIIllllIII(Players.getLocal().getInteracting()) && n.lIIIIIlllIIII(lllllllllllllllllllllIlIllIIIlIl) && n.lIIIIIllIllll(lllllllllllllllllllllIlIllIIIlIl.isDead() ? 1 : 0)) {
                        System.out.println(lIIlllIIII[lIIlllIIIl[22]]);
                        lllllllllllllllllllllIlIllIIIlIl.interact(lIIlllIIII[lIIlllIIIl[23]]);
                        Time.sleepTicks((int)lIIlllIIIl[3]);
                        0;
                    }
                    Time.sleepTicks((int)lIIlllIIIl[12]);
                    0;
                }
            }
        }
        if (n.lIIIIIllllIIl(n.lIIIIIlllIIll(e.a(bQ), lIIlllIIIl[9] + bV))) {
            lllllllllllllllllllllIlIllIIIllI = new WorldArea(lIIlllIIIl[24], lIIlllIIIl[25], lIIlllIIIl[26], lIIlllIIIl[27], lIIlllIIIl[1]);
            lllllllllllllllllllllIlIllIIIlIl = new WorldPoint(lIIlllIIIl[28], lIIlllIIIl[29], lIIlllIIIl[1]);
            if (n.lIIIIIlllIIIl(lllllllllllllllllllllIlIllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllllIlIllIIIlIl), lIIlllIIIl[13])) {
                Movement.walkTo((WorldPoint)lllllllllllllllllllllIlIllIIIlIl);
                0;
            }
            AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[30]];
            Movement.walkTo((WorldPoint)bF);
            0;
            Time.sleepTicks((int)lIIlllIIIl[0]);
            0;
            if (n.lIIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(bF), lIIlllIIIl[3])) {
                bQ = System.currentTimeMillis();
                bV = e.c(lIIlllIIIl[31], lIIlllIIIl[32]);
            }
        }
    }

    @Override
    public boolean S() {
        return lIIlllIIIl[1];
    }

    @Override
    public boolean V() {
        int n2;
        if (n.lIIIIIllllIll(Skills.getLevel((Skill)Skill.RANGED), lIIlllIIIl[35]) && n.lIIIIIllllIll(Skills.getLevel((Skill)Skill.DEFENCE), lIIlllIIIl[35])) {
            n2 = lIIlllIIIl[0];
            0;
            if (-2 >= 0) {
                return ((0xDC ^ 0x91) & ~(0xF9 ^ 0xB4)) != 0;
            }
        } else {
            n2 = lIIlllIIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIIIllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean av() {
        WorldArea worldArea = new WorldArea(bP, lIIlllIIIl[10], lIIlllIIIl[10]);
        List list = Players.getAll();
        if (n.lIIIIIllIllll(list.isEmpty() ? 1 : 0) && n.lIIIIIlllIllI(list.size(), lIIlllIIIl[0])) {
            void lllllllllllllllllllllIlIlIlIlIII;
            int lllllllllllllllllllllIlIlIlIIlll = lIIlllIIIl[1];
            while (n.lIIIIIllIlllI(lllllllllllllllllllllIlIlIlIIlll, lllllllllllllllllllllIlIlIlIlIII.size())) {
                void lllllllllllllllllllllIlIlIlIlIIl;
                if (n.lIIIIIlllIIIl(((Player)lllllllllllllllllllllIlIlIlIlIII.get(lllllllllllllllllllllIlIlIlIIlll)).equals(Players.getLocal()) ? 1 : 0)) {
                    0;
                    if ((0xC4 ^ 0xA5 ^ (0x7E ^ 0x1A)) == 0) {
                        return ((0x4C ^ 0x62 ^ (0xFC ^ 0xB1)) & (0xC4 ^ 0xB5 ^ (0x79 ^ 0x6B) ^ -1)) != 0;
                    }
                } else if (n.lIIIIIlllIIIl(lllllllllllllllllllllIlIlIlIlIIl.contains(((Player)lllllllllllllllllllllIlIlIlIlIII.get(lllllllllllllllllllllIlIlIlIIlll)).getWorldLocation()) ? 1 : 0)) {
                    return lIIlllIIIl[0];
                }
                ++lllllllllllllllllllllIlIlIlIIlll;
                0;
                if (((0x21 ^ 0x18) & ~(0x58 ^ 0x61)) < (0x87 ^ 0x83)) continue;
                return ((0x6B ^ 0x2D) & ~(0x1C ^ 0x5A)) != 0;
            }
        }
        return lIIlllIIIl[1];
    }

    private static boolean lIIIIIlllIIII(Object object) {
        return object != null;
    }

    private static boolean lIIIIIllllIIl(int n2) {
        return n2 >= 0;
    }

    private static int lIIIIIlllIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lIIIIIllIlIlI(String lllllllllllllllllllllIlIIlllIlII, String lllllllllllllllllllllIlIIlllIIll) {
        try {
            SecretKeySpec lllllllllllllllllllllIlIIllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIlIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllIlIIllllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllIlIIllllIII.init(lIIlllIIIl[3], lllllllllllllllllllllIlIIllllIIl);
            return new String(lllllllllllllllllllllIlIIllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIlIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllIlIIlllIlll) {
            lllllllllllllllllllllIlIIlllIlll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    static NPC au() {
        WorldPoint worldPoint = bP;
        WorldPoint worldPoint2 = new WorldPoint(bP.getX() - lIIlllIIIl[0], bP.getWorldY() + lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(bP.getX(), bP.getWorldY() + lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(bP.getX() + lIIlllIIIl[0], bP.getWorldY() + lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(bP.getX() + lIIlllIIIl[0], bP.getWorldY(), lIIlllIIIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(bP.getX() + lIIlllIIIl[0], bP.getWorldY() - lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(bP.getX(), bP.getWorldY() - lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(bP.getX() - lIIlllIIIl[0], bP.getWorldY() - lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(bP.getX() - lIIlllIIIl[0], bP.getWorldY(), lIIlllIIIl[1]);
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(lIIlllIIII[lIIlllIIIl[36]]));
        if (n.lIIIIIlllIIII(list)) {
            void lllllllllllllllllllllIlIlIlIllll;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int lllllllllllllllllllllIlIlIlIllIl = lIIlllIIIl[1];
            while (n.lIIIIIllIlllI(lllllllllllllllllllllIlIlIlIllIl, lllllllllllllllllllllIlIlIlIllll.size())) {
                void lllllllllllllllllllllIlIlIlIlllI;
                if (n.lIIIIIlllIIIl(lllllllllllllllllllllIlIlIlIlllI.contains(((NPC)lllllllllllllllllllllIlIlIlIllll.get(lllllllllllllllllllllIlIlIlIllIl)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)lllllllllllllllllllllIlIlIlIllll.get(lllllllllllllllllllllIlIlIlIllIl);
                }
                ++lllllllllllllllllllllIlIlIlIllIl;
                0;
                if (((0x4E ^ 0x5C) & ~(0x69 ^ 0x7B)) <= 2) continue;
                return null;
            }
        }
        return null;
    }

    private static boolean lIIIIIlllIllI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        n.lIIIIIllIllIl();
        n.lIIIIIllIllII();
        bz = new WorldPoint(lIIlllIIIl[37], lIIlllIIIl[38], lIIlllIIIl[1]);
        bA = new WorldPoint(lIIlllIIIl[39], lIIlllIIIl[40], lIIlllIIIl[1]);
        bB = new WorldPoint(lIIlllIIIl[41], lIIlllIIIl[42], lIIlllIIIl[1]);
        bC = new WorldPoint(lIIlllIIIl[43], lIIlllIIIl[44], lIIlllIIIl[1]);
        bD = new WorldPoint(lIIlllIIIl[45], lIIlllIIIl[38], lIIlllIIIl[1]);
        bE = new WorldPoint(lIIlllIIIl[46], lIIlllIIIl[47], lIIlllIIIl[1]);
        bF = new WorldPoint(lIIlllIIIl[39], lIIlllIIIl[40], lIIlllIIIl[1]);
        bG = new WorldPoint(lIIlllIIIl[48], lIIlllIIIl[38], lIIlllIIIl[1]);
        bH = new WorldPoint(lIIlllIIIl[49], lIIlllIIIl[50], lIIlllIIIl[1]);
        bI = new WorldPoint(lIIlllIIIl[51], lIIlllIIIl[42], lIIlllIIIl[1]);
        bJ = new WorldPoint(lIIlllIIIl[49], lIIlllIIIl[50], lIIlllIIIl[1]);
        bK = new WorldPoint(lIIlllIIIl[52], lIIlllIIIl[53], lIIlllIIIl[1]);
        bL = new WorldPoint(lIIlllIIIl[54], lIIlllIIIl[55], lIIlllIIIl[1]);
        bM = new WorldPoint(lIIlllIIIl[56], lIIlllIIIl[57], lIIlllIIIl[1]);
        bN = new WorldPoint(lIIlllIIIl[39], lIIlllIIIl[40], lIIlllIIIl[1]);
        bO = new WorldPoint(lIIlllIIIl[58], lIIlllIIIl[59], lIIlllIIIl[1]);
        bP = new WorldPoint(lIIlllIIIl[37], lIIlllIIIl[38], lIIlllIIIl[1]);
        bQ = System.currentTimeMillis();
        String[] stringArray = new String[lIIlllIIIl[10]];
        stringArray[n.lIIlllIIIl[1]] = lIIlllIIII[lIIlllIIIl[60]];
        stringArray[n.lIIlllIIIl[0]] = lIIlllIIII[lIIlllIIIl[61]];
        stringArray[n.lIIlllIIIl[3]] = lIIlllIIII[lIIlllIIIl[62]];
        bR = stringArray;
        bS = new WorldArea(lIIlllIIIl[63], lIIlllIIIl[64], lIIlllIIIl[65], lIIlllIIIl[66], lIIlllIIIl[1]);
        bT = lIIlllIIIl[1];
        bV = e.c(lIIlllIIIl[31], lIIlllIIIl[32]);
    }
}

