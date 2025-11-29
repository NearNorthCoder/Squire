/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class a {
    public static final /* synthetic */ WorldArea z;
    public static final /* synthetic */ WorldArea E;
    public static final /* synthetic */ WorldArea C;
    private static /* synthetic */ int[] lIlIlIIIII;
    public static final /* synthetic */ WorldPoint x;
    public static final /* synthetic */ WorldArea B;
    public static final /* synthetic */ WorldArea D;
    public static /* synthetic */ WorldPoint G;
    private static /* synthetic */ String[] lIlIIlllll;
    static /* synthetic */ WorldPoint H;
    public static /* synthetic */ WorldPoint F;
    public static final /* synthetic */ WorldArea A;
    public static final /* synthetic */ WorldArea y;
    public static final /* synthetic */ WorldArea w;

    private static boolean lIIIllllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    public static void a() {
        if (a.lIIIllllIIIll(Players.getLocal().getWorldLocation().distanceTo(H), lIlIlIIIII[28])) {
            String[] stringArray = new String[lIlIlIIIII[1]];
            stringArray[a.lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[27]];
            NPCs.getNearest((String[])stringArray).interact(lIlIIlllll[lIlIlIIIII[29]]);
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIIIII[30]);
            0;
        }
        if (!a.lIIIllllIIIII(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIIIlllIlllll(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks((int)lIlIlIIIII[15]);
            0;
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIIIII[30]);
            0;
            0;
            if (-1 > 2) {
                return;
            }
        } else if (!(a.lIIIllllIIIII(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIIIllllIIIII(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIIIllllIIIII(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIIIllllIIIII(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIIIllllIIIII(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !a.lIIIllllIIIll(Players.getLocal().getWorldLocation().distanceTo(G), lIlIlIIIII[11]))) {
            String[] stringArray = new String[lIlIlIIIII[1]];
            stringArray[a.lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[31]];
            TileObject llllllllllllllllllllIIIIIIIlIIIl = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lIIIllllIIIlI(llllllllllllllllllllIIIIIIIlIIIl)) {
                String[] stringArray2 = new String[lIlIlIIIII[1]];
                stringArray2[a.lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[23]];
                if (a.lIIIlllIlllll(llllllllllllllllllllIIIIIIIlIIIl.hasAction(stringArray2) ? 1 : 0)) {
                    llllllllllllllllllllIIIIIIIlIIIl.interact(lIlIIlllll[lIlIlIIIII[22]]);
                    Time.sleepTicks((int)lIlIlIIIII[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIIIII[30]);
                    0;
                }
                String[] stringArray3 = new String[lIlIlIIIII[1]];
                stringArray3[a.lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[32]];
                if (a.lIIIlllIlllll(llllllllllllllllllllIIIIIIIlIIIl.hasAction(stringArray3) ? 1 : 0)) {
                    llllllllllllllllllllIIIIIIIlIIIl.interact(lIlIIlllll[lIlIlIIIII[33]]);
                    Time.sleepTicks((int)lIlIlIIIII[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIIIII[30]);
                    0;
                }
            }
            0;
            if (3 == 1) {
                return;
            }
        } else if (a.lIIIllllIIIII(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(H), lIlIlIIIII[28])) {
            String[] stringArray = new String[lIlIlIIIII[1]];
            stringArray[a.lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[34]];
            TileObject llllllllllllllllllllIIIIIIIlIIIl = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lIIIllllIIIlI(llllllllllllllllllllIIIIIIIlIIIl)) {
                llllllllllllllllllllIIIIIIIlIIIl.interact(lIlIIlllll[lIlIlIIIII[35]]);
                Time.sleepTicks((int)lIlIlIIIII[15]);
                0;
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIIIII[30]);
                0;
            }
        }
    }

    private static void lIIIlllIlllII() {
        lIlIIlllll = new String[lIlIlIIIII[11]];
        a.lIlIIlllll[a.lIlIlIIIII[2]] = a."Yes";
        a.lIlIIlllll[a.lIlIlIIIII[1]] = a."Break";
        a.lIlIIlllll[a.lIlIlIIIII[14]] = a."Wear";
        a.lIlIIlllll[a.lIlIlIIIII[15]] = a."Wear";
        a.lIlIIlllll[a.lIlIlIIIII[24]] = a."Break";
        a.lIlIIlllll[a.lIlIlIIIII[19]] = a."Lever";
        a.lIlIIlllll[a.lIlIlIIIII[13]] = a."Pull";
        a.lIlIIlllll[a.lIlIlIIIII[27]] = a."Emerald Benedict";
        a.lIlIIlllll[a.lIlIlIIIII[29]] = a."Bank";
        a.lIlIIlllll[a.lIlIlIIIII[31]] = a."Bank chest";
        a.lIlIIlllll[a.lIlIlIIIII[23]] = a."Use";
        a.lIlIIlllll[a.lIlIlIIIII[22]] = a."Use";
        a.lIlIIlllll[a.lIlIlIIIII[32]] = a."Bank";
        a.lIlIIlllll[a.lIlIlIIIII[33]] = a."Bank";
        a.lIlIIlllll[a.lIlIlIIIII[34]] = a."Bank booth";
        a.lIlIIlllll[a.lIlIlIIIII[35]] = a."Bank";
        a.lIlIIlllll[a.lIlIlIIIII[36]] = a."teleport";
        a.lIlIIlllll[a.lIlIlIIIII[37]] = a."teleport";
        a.lIlIIlllll[a.lIlIlIIIII[38]] = a."teleport";
        a.lIlIIlllll[a.lIlIlIIIII[39]] = a."teleport";
    }

    public static void b(int n2, int n3) {
        Bank.withdraw((int)n2, (int)n3, (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        Time.sleepTicks((int)lIlIlIIIII[1]);
        0;
    }

    private static boolean lIIIlllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int[] nArray, int n2) {
        int[] llllllllllllllllllllIIIIIIIIIIll;
        int llllllllllllllllllllIIIIIIIIIIIl = lIlIlIIIII[2];
        while (a.lIIIllllIIlII(llllllllllllllllllllIIIIIIIIIIIl, llllllllllllllllllllIIIIIIIIIIll.length)) {
            void llllllllllllllllllllIIIIIIIIIIlI;
            Bank.withdraw((int)llllllllllllllllllllIIIIIIIIIIll[llllllllllllllllllllIIIIIIIIIIIl], (int)llllllllllllllllllllIIIIIIIIIIlI, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIlIlIIIII[1]);
            0;
            int[] nArray2 = new int[lIlIlIIIII[1]];
            nArray2[a.lIlIlIIIII[2]] = llllllllllllllllllllIIIIIIIIIIll[llllllllllllllllllllIIIIIIIIIIIl];
            if (a.lIIIlllIlllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                0;
                if (-1 <= ((0xF8 ^ 0xC1) & ~(0x1D ^ 0x24))) break;
                return;
            }
            ++llllllllllllllllllllIIIIIIIIIIIl;
            0;
            if (null == null) continue;
            return;
        }
    }

    private static void lIIIlllIlllIl() {
        lIlIlIIIII = new int[74];
        a.lIlIlIIIII[0] = 0xFFFFFDEE & 0xA91;
        a.lIlIlIIIII[1] = 1;
        a.lIlIlIIIII[2] = (1 ^ (0xB1 ^ 0xAE)) & (0xF3 ^ 0xA0 ^ (0xD1 ^ 0x9C) ^ -1);
        a.lIlIlIIIII[3] = 0xFFFFAFDD & 0x59B6;
        a.lIlIlIIIII[4] = 0xFFFF9D7D & 0x73FB;
        a.lIlIlIIIII[5] = -(0xFFFFE5F7 & 0x5A3F) & (0xFFFFCFFE & 0x7BBF);
        a.lIlIlIIIII[6] = 0xFFFFFFDD & 0x16AF;
        a.lIlIlIIIII[7] = -(0xFFFFF7A3 & 0x7C5F) & (0xFFFFFFFE & 0x7F7F);
        a.lIlIlIIIII[8] = -(0xFFFFFF4A & 0x29F7) & (0xFFFFFFD1 & 0x3FEF);
        a.lIlIlIIIII[9] = 0x19 ^ 0x27 ^ (0x7E ^ 0x5B);
        a.lIlIlIIIII[10] = 0x70 ^ 0x6C;
        a.lIlIlIIIII[11] = 113 + 82 - 187 + 121 ^ 7 + 69 - 23 + 96;
        a.lIlIlIIIII[12] = -1;
        a.lIlIlIIIII[13] = 0x2A ^ 0x76 ^ (0x54 ^ 0xE);
        a.lIlIlIIIII[14] = 2;
        a.lIlIlIIIII[15] = 3;
        a.lIlIlIIIII[16] = 0x12 ^ 0x3A;
        a.lIlIlIIIII[17] = 0xFFFFCF3B & 0x3AF4;
        a.lIlIlIIIII[18] = -(0xFFFFF2FB & 0x7FB5) & (0xFFFFFFFD & 0x7FF2);
        a.lIlIlIIIII[19] = 0x4A ^ 0x4F;
        a.lIlIlIIIII[20] = 0xFFFFFAD7 & 0xF2C;
        a.lIlIlIIIII[21] = -(0xFFFFF9FB & 0x7617) & (0xFFFFFBBF & 0x7F7E);
        a.lIlIlIIIII[22] = 0x62 ^ 0x69;
        a.lIlIlIIIII[23] = 0x4D ^ 0x2A ^ (0x37 ^ 0x5A);
        a.lIlIlIIIII[24] = 0xCC ^ 0xA0 ^ (0xC4 ^ 0xAC);
        a.lIlIlIIIII[25] = -(0xFFFFF2E5 & 0x7F9B) & (0xFFFFFFFF & 0x7ECF);
        a.lIlIlIIIII[26] = 0xFFFF8FFF & 0x7F51;
        a.lIlIlIIIII[27] = 68 + 151 - 150 + 89 ^ 80 + 142 - 77 + 8;
        a.lIlIlIIIII[28] = 0x6C ^ 0x72;
        a.lIlIlIIIII[29] = 0x76 ^ 0x7E;
        a.lIlIlIIIII[30] = -(0xFFFFD7FF & 0x781B) & (0xFFFFFFFB & 0x5FBE);
        a.lIlIlIIIII[31] = 33 + 44 - -27 + 50 ^ 71 + 81 - 97 + 92;
        a.lIlIlIIIII[32] = 0x7F ^ 0x73;
        a.lIlIlIIIII[33] = 48 + 42 - -28 + 22 ^ 50 + 60 - 45 + 64;
        a.lIlIlIIIII[34] = 0xD9 ^ 0xC3 ^ (0x1A ^ 0xE);
        a.lIlIlIIIII[35] = 0x21 ^ 0xD ^ (0x65 ^ 0x46);
        a.lIlIlIIIII[36] = 0x51 ^ 9 ^ (0x1E ^ 0x56);
        a.lIlIlIIIII[37] = 0x27 ^ 0x36;
        a.lIlIlIIIII[38] = 0x27 ^ 0x2D ^ (0x3F ^ 0x27);
        a.lIlIlIIIII[39] = 11 + 57 - -53 + 7 ^ 120 + 86 - 60 + 1;
        a.lIlIlIIIII[40] = -(0xFFFFDE3B & 0x73ED) & (0xFFFFFE7F & 0x5FEF);
        a.lIlIlIIIII[41] = -(0xFFFFE76F & 0x3ADB) & (0xFFFFAFDF & 0x7FFB);
        a.lIlIlIIIII[42] = 3 ^ (3 ^ 0x29);
        a.lIlIlIIIII[43] = 0xC ^ 0x67 ^ (0xE9 ^ 0xA5);
        a.lIlIlIIIII[44] = -(0xFFFFF7D9 & 0x5A7F) & (0xFFFFFEFF & 0x5FDC);
        a.lIlIlIIIII[45] = -(0xFFFFFD3B & 0x62C7) & (0xFFFFFF77 & 0x6DAF);
        a.lIlIlIIIII[46] = -(0xFFFFECE5 & 0x373F) & (0xFFFFFF7F & 0x2FFF);
        a.lIlIlIIIII[47] = 0xFFFF9CCA & 0x6FBF;
        a.lIlIlIIIII[48] = 0x7B ^ 0x12;
        a.lIlIlIIIII[49] = 0xFFFFFE7D & 0xDFE;
        a.lIlIlIIIII[50] = 0xFFFFDD37 & 0x2FEE;
        a.lIlIlIIIII[51] = 0x19 ^ 0x3A;
        a.lIlIlIIIII[52] = 0x1F ^ 0x25;
        a.lIlIlIIIII[53] = 0xFFFFCC7F & 0x3FB5;
        a.lIlIlIIIII[54] = -(0xFFFFD1FD & 0x7E0F) & (0xFFFFDE7F & 0x7FAF);
        a.lIlIlIIIII[55] = -(0xFFFFFEFF & 0x61A1) & (0xFFFFEEFE & 0x7FBF);
        a.lIlIlIIIII[56] = -(0xFFFFC37F & 0x3E81) & (0xFFFFBFDF & 0x4F7A);
        a.lIlIlIIIII[57] = 0x1F ^ 0x43;
        a.lIlIlIIIII[58] = 0xF9 ^ 0xC6 ^ (0x61 ^ 0x7B);
        a.lIlIlIIIII[59] = 0xFFFF9EBE & 0x6D7B;
        a.lIlIlIIIII[60] = -(0xFFFFD8CF & 0x77BF) & (0xFFFFFFFF & 0x5DFF);
        a.lIlIlIIIII[61] = 0xB8 ^ 0x89;
        a.lIlIlIIIII[62] = 0x15 ^ 0x51;
        a.lIlIlIIIII[63] = 0xFFFFD65F & 0x2FFE;
        a.lIlIlIIIII[64] = 0xFFFFBF6C & 0x4FF3;
        a.lIlIlIIIII[65] = -(0xFFFFD7E7 & 0x7B1B) & (0xFFFFFFFF & 0x5FEF);
        a.lIlIlIIIII[66] = 0xD4 ^ 0xBB ^ (0x82 ^ 0xC0);
        a.lIlIlIIIII[67] = 0x1B ^ 0x3F;
        a.lIlIlIIIII[68] = 0xFFFFFBFF & 0xF9F;
        a.lIlIlIIIII[69] = -(0xFFFF96D6 & 0x7B2F) & (0xFFFFFFEF & 0x1EBF);
        a.lIlIlIIIII[70] = -(0xFFFFDDE6 & 0x331F) & (0xFFFF9FFF & 0x77BF);
        a.lIlIlIIIII[71] = -(0xFFFFF1F3 & 0x6E5D) & (0xFFFFEDFF & 0x7FD9);
        a.lIlIlIIIII[72] = 0xFFFFEFE4 & 0x1BFF;
        a.lIlIlIIIII[73] = -(0xFFFF8CB5 & 0x7FDB) & (0xFFFFFFFF & 0x1FFD);
    }

    private static boolean lIIIllllIIIII(int n2) {
        return n2 == 0;
    }

    public static void a(int[] nArray) {
        int[] llllllllllllllllllllIIIIIIIIlllI;
        int llllllllllllllllllllIIIIIIIIllIl = lIlIlIIIII[2];
        while (a.lIIIllllIIlII(llllllllllllllllllllIIIIIIIIllIl, llllllllllllllllllllIIIIIIIIlllI.length)) {
            Bank.withdraw((int)llllllllllllllllllllIIIIIIIIlllI[llllllllllllllllllllIIIIIIIIllIl], (int)lIlIlIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIlIlIIIII[1]);
            0;
            ++llllllllllllllllllllIIIIIIIIllIl;
            0;
            if (3 > 0) continue;
            return;
        }
    }

    private static boolean lIIIllllIIIlI(Object object) {
        return object != null;
    }

    private static String lIIIlllIllIlI(String lllllllllllllllllllIllllllllIlIl, String lllllllllllllllllllIllllllllIIlI) {
        try {
            SecretKeySpec lllllllllllllllllllIlllllllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllllllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIllllllllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIllllllllIlll.init(lIlIlIIIII[14], lllllllllllllllllllIlllllllllIII);
            return new String(lllllllllllllllllllIllllllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllllllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIllllllllIllI) {
            lllllllllllllllllllIllllllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    public static void a(BankLocation bankLocation) {
        if (a.lIIIlllIllllI(Vars.getBit((int)lIlIlIIIII[0]), lIlIlIIIII[1]) && a.lIIIlllIlllll(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIIIII[1]];
            stringArray[a.lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[2]];
            g.a(stringArray);
        }
        WorldPoint llllllllllllllllllllIIIIIIIllIIl = new WorldPoint(lIlIlIIIII[3], lIlIlIIIII[4], lIlIlIIIII[2]);
        WorldPoint llllllllllllllllllllIIIIIIIllIII = new WorldPoint(lIlIlIIIII[5], lIlIlIIIII[6], lIlIlIIIII[2]);
        WorldArea llllllllllllllllllllIIIIIIIlIlll = new WorldArea(lIlIlIIIII[7], lIlIlIIIII[8], lIlIlIIIII[9], lIlIlIIIII[10], lIlIlIIIII[2]);
        if ((!a.lIIIllllIIIII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIIIIIIllIIl) ? 1 : 0) || !a.lIIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllllIIIIIIIllIII), lIlIlIIIII[11]) || a.lIIIlllIlllll(llllllllllllllllllllIIIIIIIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lIIIlllIlllll(Inventory.contains(item -> item.getName().contains(lIlIIlllll[lIlIlIIIII[39]])) ? 1 : 0) && a.lIIIlllIllllI(Players.getLocal().getAnimation(), lIlIlIIIII[12])) {
            Inventory.getFirst(item -> item.getName().contains(lIlIIlllll[lIlIlIIIII[38]])).interact(lIlIIlllll[lIlIlIIIII[1]]);
            Time.sleepTicks((int)lIlIlIIIII[13]);
            0;
        }
        if (a.lIIIlllIlllll(Inventory.contains((int[])f.be) ? 1 : 0) && a.lIIIllllIIIII(Equipment.contains((int[])f.be) ? 1 : 0)) {
            Inventory.getFirst((int[])f.be).interact(lIlIIlllll[lIlIlIIIII[14]]);
            Time.sleepTicks((int)lIlIlIIIII[14]);
            0;
        }
        if (a.lIIIlllIlllll(Inventory.contains((int[])f.aN) ? 1 : 0) && a.lIIIllllIIIII(Equipment.contains((int[])f.aN) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aN).interact(lIlIIlllll[lIlIlIIIII[15]]);
            Time.sleepTicks((int)lIlIlIIIII[14]);
            0;
        }
        if (!a.lIIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(x), lIlIlIIIII[11]) || a.lIIIlllIlllll(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.VARROCK_WEST_BANK);
            0;
            Time.sleepTicks((int)lIlIlIIIII[14]);
            0;
            0;
            if (null != null) {
                return;
            }
        } else if (!a.lIIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(F), lIlIlIIIII[16]) || !a.lIIIllllIIIII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIIIlllIlllll(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_EAST_BANK);
            0;
            Time.sleepTicks((int)lIlIlIIIII[14]);
            0;
            0;
            if ((0x69 ^ 0x6C) <= 0) {
                return;
            }
        } else if (a.lIIIlllIlllll(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_WEST_BANK);
            0;
            Time.sleepTicks((int)lIlIlIIIII[14]);
            0;
            0;
            if (((21 + 19 - -153 + 59 ^ 15 + 98 - 24 + 67) & (134 + 102 - 157 + 120 ^ 11 + 43 - -45 + 68 ^ -1)) != 0) {
                return;
            }
        } else if (a.lIIIlllIlllll(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)b.I);
            0;
            Time.sleepTicks((int)lIlIlIIIII[14]);
            0;
            0;
            if (-1 > 0) {
                return;
            }
        } else {
            BankLocation llllllllllllllllllllIIIIIIIllIlI;
            WorldArea llllllllllllllllllllIIIIIIIlIlII;
            WorldArea llllllllllllllllllllIIIIIIIlIllI = new WorldArea(lIlIlIIIII[17], lIlIlIIIII[18], lIlIlIIIII[13], lIlIlIIIII[19], lIlIlIIIII[2]);
            WorldArea llllllllllllllllllllIIIIIIIlIlIl = new WorldArea(lIlIlIIIII[20], lIlIlIIIII[21], lIlIlIIIII[22], lIlIlIIIII[23], lIlIlIIIII[2]);
            if ((!a.lIIIllllIIIII(llllllllllllllllllllIIIIIIIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIIIlllIlllll(llllllllllllllllllllIIIIIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lIIIlllIlllll(Inventory.contains(item -> item.getName().contains(lIlIIlllll[lIlIlIIIII[37]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(lIlIIlllll[lIlIlIIIII[36]])).interact(lIlIIlllll[lIlIlIIIII[24]]);
                Time.sleepTicks((int)lIlIlIIIII[24]);
                0;
            }
            if (a.lIIIlllIlllll((llllllllllllllllllllIIIIIIIlIlII = new WorldArea(lIlIlIIIII[25], lIlIlIIIII[26], lIlIlIIIII[27], lIlIlIIIII[13], lIlIlIIIII[2])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIII[1]];
                stringArray[a.lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[19]];
                TileObject llllllllllllllllllllIIIIIIIlIIll = TileObjects.getNearest((String[])stringArray);
                if (a.lIIIllllIIIlI(llllllllllllllllllllIIIIIIIlIIll)) {
                    llllllllllllllllllllIIIIIIIlIIll.interact(lIlIIlllll[lIlIlIIIII[13]]);
                    Time.sleepTicks((int)lIlIlIIIII[24]);
                    0;
                }
            }
            Movement.walkTo((BankLocation)llllllllllllllllllllIIIIIIIllIlI);
            0;
            Time.sleepTicks((int)lIlIlIIIII[14]);
            0;
        }
    }

    static {
        a.lIIIlllIlllIl();
        a.lIIIlllIlllII();
        w = new WorldArea(lIlIlIIIII[40], lIlIlIIIII[41], lIlIlIIIII[42], lIlIlIIIII[43], lIlIlIIIII[2]);
        x = new WorldPoint(lIlIlIIIII[44], lIlIlIIIII[45], lIlIlIIIII[2]);
        y = new WorldArea(lIlIlIIIII[46], lIlIlIIIII[47], lIlIlIIIII[48], lIlIlIIIII[48], lIlIlIIIII[2]);
        z = new WorldArea(lIlIlIIIII[49], lIlIlIIIII[50], lIlIlIIIII[51], lIlIlIIIII[52], lIlIlIIIII[2]);
        A = new WorldArea(lIlIlIIIII[53], lIlIlIIIII[54], lIlIlIIIII[38], lIlIlIIIII[11], lIlIlIIIII[2]);
        B = new WorldArea(lIlIlIIIII[55], lIlIlIIIII[56], lIlIlIIIII[57], lIlIlIIIII[58], lIlIlIIIII[2]);
        C = new WorldArea(lIlIlIIIII[59], lIlIlIIIII[60], lIlIlIIIII[61], lIlIlIIIII[62], lIlIlIIIII[2]);
        D = new WorldArea(lIlIlIIIII[63], lIlIlIIIII[64], lIlIlIIIII[35], lIlIlIIIII[36], lIlIlIIIII[2]);
        E = new WorldArea(lIlIlIIIII[7], lIlIlIIIII[65], lIlIlIIIII[66], lIlIlIIIII[67], lIlIlIIIII[2]);
        F = new WorldPoint(lIlIlIIIII[68], lIlIlIIIII[69], lIlIlIIIII[2]);
        G = new WorldPoint(lIlIlIIIII[70], lIlIlIIIII[71], lIlIlIIIII[2]);
        H = new WorldPoint(lIlIlIIIII[72], lIlIlIIIII[73], lIlIlIIIII[1]);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int[] nArray, int n2) {
        int[] llllllllllllllllllllIIIIIIIIlIIl;
        int llllllllllllllllllllIIIIIIIIIlll = lIlIlIIIII[2];
        while (a.lIIIllllIIlII(llllllllllllllllllllIIIIIIIIIlll, llllllllllllllllllllIIIIIIIIlIIl.length)) {
            void llllllllllllllllllllIIIIIIIIlIII;
            Bank.withdraw((int)llllllllllllllllllllIIIIIIIIlIIl[llllllllllllllllllllIIIIIIIIIlll], (int)llllllllllllllllllllIIIIIIIIlIII, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIlIlIIIII[1]);
            0;
            ++llllllllllllllllllllIIIIIIIIIlll;
            0;
            if (((0x7D ^ 0x60) & ~(0x29 ^ 0x34)) <= 0) continue;
            return;
        }
    }

    private static boolean lIIIlllIlllll(int n2) {
        return n2 != 0;
    }

    private static String lIIIlllIllIIl(String lllllllllllllllllllIlllllllIIlIl, String lllllllllllllllllllIlllllllIIlII) {
        lllllllllllllllllllIlllllllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllllllIlllllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlllllllIIIll = new StringBuilder();
        char[] lllllllllllllllllllIlllllllIIIlI = lllllllllllllllllllIlllllllIIlII.toCharArray();
        int lllllllllllllllllllIlllllllIIIIl = lIlIlIIIII[2];
        char[] lllllllllllllllllllIllllllIllIll = lllllllllllllllllllIlllllllIIlIl.toCharArray();
        int lllllllllllllllllllIllllllIllIlI = lllllllllllllllllllIllllllIllIll.length;
        int lllllllllllllllllllIllllllIllIIl = lIlIlIIIII[2];
        while (a.lIIIllllIIlII(lllllllllllllllllllIllllllIllIIl, lllllllllllllllllllIllllllIllIlI)) {
            char lllllllllllllllllllIlllllllIIllI = lllllllllllllllllllIllllllIllIll[lllllllllllllllllllIllllllIllIIl];
            lllllllllllllllllllIlllllllIIIll.append((char)(lllllllllllllllllllIlllllllIIllI ^ lllllllllllllllllllIlllllllIIIlI[lllllllllllllllllllIlllllllIIIIl % lllllllllllllllllllIlllllllIIIlI.length]));
            0;
            ++lllllllllllllllllllIlllllllIIIIl;
            ++lllllllllllllllllllIllllllIllIIl;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIlllllllIIIll);
    }

    private static String lIIIlllIllIll(String lllllllllllllllllllIllllllIlIIII, String lllllllllllllllllllIllllllIIllll) {
        try {
            SecretKeySpec lllllllllllllllllllIllllllIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllllllIIllll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIII[29]), "DES");
            Cipher lllllllllllllllllllIllllllIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllllllIllllllIlIIlI.init(lIlIlIIIII[14], lllllllllllllllllllIllllllIlIIll);
            return new String(lllllllllllllllllllIllllllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllllllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIllllllIlIIIl) {
            lllllllllllllllllllIllllllIlIIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2, int n3) {
        int lllllllllllllllllllIlllllllllllI;
        int[] nArray = new int[lIlIlIIIII[1]];
        nArray[a.lIlIlIIIII[2]] = n2;
        if (a.lIIIllllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + n2 + " item id");
        }
        int[] nArray2 = new int[lIlIlIIIII[1]];
        nArray2[a.lIlIlIIIII[2]] = lllllllllllllllllllIlllllllllllI;
        if (a.lIIIlllIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            void lllllllllllllllllllIllllllllllIl;
            Bank.withdraw((int)lllllllllllllllllllIlllllllllllI, (int)lllllllllllllllllllIllllllllllIl, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIlIlIIIII[1]);
            0;
        }
    }
}

