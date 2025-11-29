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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g_Unknown;
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

public class a_Unknown {
    private static /* synthetic */ String[] lIIIlIIll;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea z;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ WorldArea B;
    static /* synthetic */ WorldPoint I;
    public static final /* synthetic */ WorldPoint y;
    public static final /* synthetic */ WorldArea F;
    public static /* synthetic */ WorldPoint H;
    private static /* synthetic */ int[] lIIIlIlII;
    public static final /* synthetic */ WorldArea x;
    public static final /* synthetic */ WorldArea D;
    public static final /* synthetic */ WorldArea A;
    public static final /* synthetic */ WorldArea E;

    private static boolean lllIIlIllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIIlIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    public static void a(BankLocation bankLocation) {
        if (a.lllIIlIIlll(Vars.getBit((int)lIIIlIlII[0]), lIIIlIlII[1]) && a.lllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIIIlIlII[1]];
            stringArray[a.lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[2]];
            g.a(stringArray);
        }
        WorldPoint lIIlIIIIIIIIlII = new WorldPoint(lIIIlIlII[3], lIIIlIlII[4], lIIIlIlII[2]);
        WorldPoint lIIlIIIIIIIIIll = new WorldPoint(lIIIlIlII[5], lIIIlIlII[6], lIIIlIlII[2]);
        WorldArea lIIlIIIIIIIIIlI = new WorldArea(lIIIlIlII[7], lIIIlIlII[8], lIIIlIlII[9], lIIIlIlII[10], lIIIlIlII[2]);
        if ((!a.lllIIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)lIIlIIIIIIIIlII) ? 1 : 0) || !a.lllIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(lIIlIIIIIIIIIll), lIIIlIlII[11]) || a.lllIIlIlIII(lIIlIIIIIIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lllIIlIlIII(Inventory.contains(item -> item.getName().contains(lIIIlIIll[lIIIlIlII[39]])) ? 1 : 0) && a.lllIIlIIlll(Players.getLocal().getAnimation(), lIIIlIlII[12])) {
            Inventory.getFirst(item -> item.getName().contains(lIIIlIIll[lIIIlIlII[38]])).interact(lIIIlIIll[lIIIlIlII[1]]);
            Time.sleepTicks((int)lIIIlIlII[13]);
            0;
        }
        if (a.lllIIlIlIII(Inventory.contains((int[])f.bf) ? 1 : 0) && a.lllIIlIlIIl(Equipment.contains((int[])f.bf) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bf).interact(lIIIlIIll[lIIIlIlII[14]]);
            Time.sleepTicks((int)lIIIlIlII[14]);
            0;
        }
        if (a.lllIIlIlIII(Inventory.contains((int[])f.aO) ? 1 : 0) && a.lllIIlIlIIl(Equipment.contains((int[])f.aO) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aO).interact(lIIIlIIll[lIIIlIlII[15]]);
            Time.sleepTicks((int)lIIIlIlII[14]);
            0;
        }
        if (!a.lllIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(y), lIIIlIlII[11]) || a.lllIIlIlIII(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.VARROCK_WEST_BANK);
            0;
            Time.sleepTicks((int)lIIIlIlII[14]);
            0;
            0;
            if (((0x6C ^ 0x53) & ~(0xC ^ 0x33)) > 0) {
                return;
            }
        } else if (!a.lllIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(G), lIIIlIlII[16]) || !a.lllIIlIlIIl(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lllIIlIlIII(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_EAST_BANK);
            0;
            Time.sleepTicks((int)lIIIlIlII[14]);
            0;
            0;
            if (2 < ((0x1D ^ 0x27) & ~(0xAD ^ 0x97))) {
                return;
            }
        } else if (a.lllIIlIlIII(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_WEST_BANK);
            0;
            Time.sleepTicks((int)lIIIlIlII[14]);
            0;
            0;
            if (1 > 3) {
                return;
            }
        } else if (a.lllIIlIlIII(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)b.J);
            0;
            Time.sleepTicks((int)lIIIlIlII[14]);
            0;
            0;
            if (-2 > 0) {
                return;
            }
        } else {
            BankLocation lIIlIIIIIIIIlIl;
            WorldArea lIIIlllllllllll;
            WorldArea lIIlIIIIIIIIIIl = new WorldArea(lIIIlIlII[17], lIIIlIlII[18], lIIIlIlII[13], lIIIlIlII[19], lIIIlIlII[2]);
            WorldArea lIIlIIIIIIIIIII = new WorldArea(lIIIlIlII[20], lIIIlIlII[21], lIIIlIlII[22], lIIIlIlII[23], lIIIlIlII[2]);
            if ((!a.lllIIlIlIIl(lIIlIIIIIIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lllIIlIlIII(lIIlIIIIIIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lllIIlIlIII(Inventory.contains(item -> item.getName().contains(lIIIlIIll[lIIIlIlII[37]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(lIIIlIIll[lIIIlIlII[36]])).interact(lIIIlIIll[lIIIlIlII[24]]);
                Time.sleepTicks((int)lIIIlIlII[24]);
                0;
            }
            if (a.lllIIlIlIII((lIIIlllllllllll = new WorldArea(lIIIlIlII[25], lIIIlIlII[26], lIIIlIlII[27], lIIIlIlII[13], lIIIlIlII[2])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lIIIlIlII[1]];
                stringArray[a.lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[19]];
                TileObject lIIIllllllllllI = TileObjects.getNearest((String[])stringArray);
                if (a.lllIIlIlIll(lIIIllllllllllI)) {
                    lIIIllllllllllI.interact(lIIIlIIll[lIIIlIlII[13]]);
                    Time.sleepTicks((int)lIIIlIlII[24]);
                    0;
                }
            }
            Movement.walkTo((BankLocation)lIIlIIIIIIIIlIl);
            0;
            Time.sleepTicks((int)lIIIlIlII[14]);
            0;
        }
    }

    private static String lllIIlIIlII(String lIIIlllllIlllIl, String lIIIlllllIlllII) {
        lIIIlllllIlllIl = new String(Base64.getDecoder().decode(lIIIlllllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlllllIllIll = new StringBuilder();
        char[] lIIIlllllIllIlI = lIIIlllllIlllII.toCharArray();
        int lIIIlllllIllIIl = lIIIlIlII[2];
        char[] lIIIlllllIlIIll = lIIIlllllIlllIl.toCharArray();
        int lIIIlllllIlIIlI = lIIIlllllIlIIll.length;
        int lIIIlllllIlIIIl = lIIIlIlII[2];
        while (a.lllIIlIllIl(lIIIlllllIlIIIl, lIIIlllllIlIIlI)) {
            char lIIIlllllIllllI = lIIIlllllIlIIll[lIIIlllllIlIIIl];
            lIIIlllllIllIll.append((char)(lIIIlllllIllllI ^ lIIIlllllIllIlI[lIIIlllllIllIIl % lIIIlllllIllIlI.length]));
            0;
            ++lIIIlllllIllIIl;
            ++lIIIlllllIlIIIl;
            0;
            if (-1 <= ((0x71 ^ 0x69 ^ (0x43 ^ 0x1E)) & (0x10 ^ 0xA ^ (0x41 ^ 0x1E) ^ -1))) continue;
            return null;
        }
        return String.valueOf(lIIIlllllIllIll);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int[] nArray, int n2) {
        int[] lIIIlllllllIlII;
        int lIIIlllllllIIlI = lIIIlIlII[2];
        while (a.lllIIlIllIl(lIIIlllllllIIlI, lIIIlllllllIlII.length)) {
            void lIIIlllllllIIll;
            Bank.withdraw((int)lIIIlllllllIlII[lIIIlllllllIIlI], (int)lIIIlllllllIIll, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIIlIlII[1]);
            0;
            ++lIIIlllllllIIlI;
            0;
            if (((0x9A ^ 0xC1 ^ (0x11 ^ 0x50)) & (0x6A ^ 0x27 ^ (0x72 ^ 0x25) ^ -1)) <= 0) continue;
            return;
        }
    }

    private static boolean lllIIlIlIll(Object object) {
        return object != null;
    }

    private static void lllIIlIIlIl() {
        lIIIlIIll = new String[lIIIlIlII[11]];
        a.lIIIlIIll[a.lIIIlIlII[2]] = a."Yes";
        a.lIIIlIIll[a.lIIIlIlII[1]] = a."Break";
        a.lIIIlIIll[a.lIIIlIlII[14]] = a."Wear";
        a.lIIIlIIll[a.lIIIlIlII[15]] = a."Wear";
        a.lIIIlIIll[a.lIIIlIlII[24]] = a."Break";
        a.lIIIlIIll[a.lIIIlIlII[19]] = a."Lever";
        a.lIIIlIIll[a.lIIIlIlII[13]] = a."Pull";
        a.lIIIlIIll[a.lIIIlIlII[27]] = a."Emerald Benedict";
        a.lIIIlIIll[a.lIIIlIlII[29]] = a."Bank";
        a.lIIIlIIll[a.lIIIlIlII[31]] = a."Bank chest";
        a.lIIIlIIll[a.lIIIlIlII[23]] = a."Use";
        a.lIIIlIIll[a.lIIIlIlII[22]] = a."Use";
        a.lIIIlIIll[a.lIIIlIlII[32]] = a."Bank";
        a.lIIIlIIll[a.lIIIlIlII[33]] = a."Bank";
        a.lIIIlIIll[a.lIIIlIlII[34]] = a."Bank booth";
        a.lIIIlIIll[a.lIIIlIlII[35]] = a."Bank";
        a.lIIIlIIll[a.lIIIlIlII[36]] = a."teleport";
        a.lIIIlIIll[a.lIIIlIlII[37]] = a."teleport";
        a.lIIIlIIll[a.lIIIlIlII[38]] = a."teleport";
        a.lIIIlIIll[a.lIIIlIlII[39]] = a."teleport";
    }

    private static boolean lllIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIIlIIllI() {
        lIIIlIlII = new int[74];
        a.lIIIlIlII[0] = 0xFFFFFCB2 & 0xBCD;
        a.lIIIlIlII[1] = 1;
        a.lIIIlIlII[2] = (0x39 ^ 0x7D) & ~(0x79 ^ 0x3D);
        a.lIIIlIlII[3] = 0xFFFF99DE & 0x6FB5;
        a.lIIIlIlII[4] = 0xFFFFBDF9 & 0x537F;
        a.lIIIlIlII[5] = 0xFFFFEFDC & 0x1BAB;
        a.lIIIlIlII[6] = 0xFFFFB79D & 0x5EEF;
        a.lIIIlIlII[7] = -(0xFFFFEFA7 & 0x545B) & (0xFFFFCF7E & Short.MAX_VALUE);
        a.lIIIlIlII[8] = -(0xFFFF8DFB & 0x7A4D) & (0xFFFFFFCD & 0x1EFA);
        a.lIIIlIlII[9] = 14 + 55 - -44 + 52 ^ 41 + 120 - 0 + 29;
        a.lIIIlIlII[10] = 4 ^ 0x4A ^ (0x40 ^ 0x12);
        a.lIIIlIlII[11] = 147 + 100 - 189 + 105 ^ 33 + 89 - 108 + 169;
        a.lIIIlIlII[12] = -1;
        a.lIIIlIlII[13] = 0xA ^ 0xC;
        a.lIIIlIlII[14] = 2;
        a.lIIIlIlII[15] = 3;
        a.lIIIlIlII[16] = 0x13 ^ 0x3B;
        a.lIIIlIlII[17] = -(0xFFFFC35F & 0x7CED) & (0xFFFFCF7D & 0x7AFE);
        a.lIIIlIlII[18] = 0xFFFFBF7B & 0x4DC4;
        a.lIIIlIlII[19] = 0x4B ^ 0x77 ^ (0x20 ^ 0x19);
        a.lIIIlIlII[20] = 0xFFFF9F1C & 0x6AE7;
        a.lIIIlIlII[21] = -(0xFFFFFDB1 & 0x664F) & (0xFFFFEF6E & 0x7FBD);
        a.lIIIlIlII[22] = 0x50 ^ 4 ^ (0x6E ^ 0x31);
        a.lIIIlIlII[23] = 0x22 ^ 0x55 ^ (0x2E ^ 0x53);
        a.lIIIlIlII[24] = 0x4A ^ 0x4E;
        a.lIIIlIlII[25] = -(0xFFFFE391 & 0x7FEF) & (0xFFFFFFCF & 0x6FFF);
        a.lIIIlIlII[26] = 0xFFFFBFFB & 0x4F55;
        a.lIIIlIlII[27] = 0xFA ^ 0xB7 ^ (0x55 ^ 0x1F);
        a.lIIIlIlII[28] = 0x16 ^ 0x59 ^ (0xC9 ^ 0x98);
        a.lIIIlIlII[29] = 0x39 ^ 0x31;
        a.lIIIlIlII[30] = -(0xFFFFF94D & 0x16FF) & (0xFFFFDFFF & 0x3FEC);
        a.lIIIlIlII[31] = 0x95 ^ 0x9C;
        a.lIIIlIlII[32] = 0xBD ^ 0xB1;
        a.lIIIlIlII[33] = 0x5A ^ 0x12 ^ (0x32 ^ 0x77);
        a.lIIIlIlII[34] = 0x19 ^ 0x17;
        a.lIIIlIlII[35] = 0x73 ^ 0x7C;
        a.lIIIlIlII[36] = 0x22 ^ 0x32;
        a.lIIIlIlII[37] = 0x7F ^ 0x6E;
        a.lIIIlIlII[38] = 0x41 ^ 0x74 ^ (0xB1 ^ 0x96);
        a.lIIIlIlII[39] = 0x4F ^ 0x5C;
        a.lIIIlIlII[40] = 0xFFFFFD47 & 0xEFF;
        a.lIIIlIlII[41] = -(0xFFFFB6B9 & 0x7B6F) & (0xFFFFFFFD & 0x3FBB);
        a.lIIIlIlII[42] = 0x7A ^ 0x53;
        a.lIIIlIlII[43] = 5 ^ 0x22;
        a.lIIIlIlII[44] = -(0xFFFFD29A & 0x6D77) & (0xFFFFDED7 & 0x6DBD);
        a.lIIIlIlII[45] = 0xFFFFAD77 & 0x5FAD;
        a.lIIIlIlII[46] = -(0xFFFFE1FB & 0x7E85) & (0xFFFFEFFB & 0x7BDF);
        a.lIIIlIlII[47] = -(0xFFFFFBE7 & 0x377E) & (0xFFFFBFEF & Short.MAX_VALUE);
        a.lIIIlIlII[48] = 0x4A ^ 0x23;
        a.lIIIlIlII[49] = 0xFFFF9FFC & 0x6C7F;
        a.lIIIlIlII[50] = -(0x30 ^ 0x7A) & (0xFFFF8FFF & 0x7D6F);
        a.lIIIlIlII[51] = 0x38 ^ 0x1B;
        a.lIIIlIlII[52] = 18 + 103 - 47 + 68 ^ 146 + 27 - 6 + 13;
        a.lIIIlIlII[53] = -(0xFFFFFCCF & 0x7371) & (0xFFFFFF7D & 0x7CF7);
        a.lIIIlIlII[54] = -(0xFFFFDB3D & 0x35D7) & (0xFFFFFF3F & 0x1FF7);
        a.lIIIlIlII[55] = -(0xFFFFF5F6 & 0x5BAB) & (0xFFFFDFFF & 0x7FBF);
        a.lIIIlIlII[56] = 0xFFFFBDFE & 0x4F5B;
        a.lIIIlIlII[57] = 0x20 ^ 0x7C;
        a.lIIIlIlII[58] = 0x90 ^ 0xB5;
        a.lIIIlIlII[59] = -(0xFFFFFD57 & 0x53ED) & (0xFFFFDF7F & 0x7DFE);
        a.lIIIlIlII[60] = 0xFFFF9F7F & 0x6DF1;
        a.lIIIlIlII[61] = 0xE3 ^ 0xB0 ^ (0x24 ^ 0x46);
        a.lIIIlIlII[62] = 0x3D ^ 0x79;
        a.lIIIlIlII[63] = -(0xFFFFDFF2 & 0x792F) & (0xFFFFFF7F & 0x5FFF);
        a.lIIIlIlII[64] = -(0xFFFFE78C & 0x587B) & (0xFFFFFFE7 & 0x4F7F);
        a.lIIIlIlII[65] = 0xFFFFECFD & 0x1FEF;
        a.lIIIlIlII[66] = 96 + 87 - 33 + 13 ^ 139 + 110 - 172 + 65;
        a.lIIIlIlII[67] = 1 ^ (0x73 ^ 0x56);
        a.lIIIlIlII[68] = 0xFFFFDFFF & 0x2B9F;
        a.lIIIlIlII[69] = 0xFFFF8EEE & 0x7DBB;
        a.lIIIlIlII[70] = -(0xFFFFF1AD & 0x3F57) & (0xFFFFBFFF & 0x77BE);
        a.lIIIlIlII[71] = 0xFFFFDFA9 & 0x2DDF;
        a.lIIIlIlII[72] = -(0xFFFFA877 & 0x778C) & (0xFFFFAFF7 & 0x7BEF);
        a.lIIIlIlII[73] = 0xFFFFB7FF & 0x5B6D;
    }

    private static String lllIIlIIIlI(String lIIIlllllIIIllI, String lIIIlllllIIIlIl) {
        try {
            SecretKeySpec lIIIlllllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlllllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlllllIIlIlI = Cipher.getInstance("Blowfish");
            lIIIlllllIIlIlI.init(lIIIlIlII[14], lIIIlllllIIlIll);
            return new String(lIIIlllllIIlIlI.doFinal(Base64.getDecoder().decode(lIIIlllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlllllIIlIIl) {
            lIIIlllllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIlIIIll(String lIIIllllIlllIll, String lIIIllllIlllIII) {
        try {
            SecretKeySpec lIIIllllIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllllIlllIII.getBytes(StandardCharsets.UTF_8)), lIIIlIlII[29]), "DES");
            Cipher lIIIllllIllllIl = Cipher.getInstance("DES");
            lIIIllllIllllIl.init(lIIIlIlII[14], lIIIllllIlllllI);
            return new String(lIIIllllIllllIl.doFinal(Base64.getDecoder().decode(lIIIllllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllllIllllII) {
            lIIIllllIllllII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int[] nArray, int n2) {
        int[] lIIIllllllIlllI;
        int lIIIllllllIllII = lIIIlIlII[2];
        while (a.lllIIlIllIl(lIIIllllllIllII, lIIIllllllIlllI.length)) {
            void lIIIllllllIllIl;
            Bank.withdraw((int)lIIIllllllIlllI[lIIIllllllIllII], (int)lIIIllllllIllIl, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIIlIlII[1]);
            0;
            int[] nArray2 = new int[lIIIlIlII[1]];
            nArray2[a.lIIIlIlII[2]] = lIIIllllllIlllI[lIIIllllllIllII];
            if (a.lllIIlIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                0;
                if (null == null) break;
                return;
            }
            ++lIIIllllllIllII;
            0;
            if ((0x83 ^ 0x87) >= 0) continue;
            return;
        }
    }

    static {
        a.lllIIlIIllI();
        a.lllIIlIIlIl();
        x = new WorldArea(lIIIlIlII[40], lIIIlIlII[41], lIIIlIlII[42], lIIIlIlII[43], lIIIlIlII[2]);
        y = new WorldPoint(lIIIlIlII[44], lIIIlIlII[45], lIIIlIlII[2]);
        z = new WorldArea(lIIIlIlII[46], lIIIlIlII[47], lIIIlIlII[48], lIIIlIlII[48], lIIIlIlII[2]);
        A = new WorldArea(lIIIlIlII[49], lIIIlIlII[50], lIIIlIlII[51], lIIIlIlII[52], lIIIlIlII[2]);
        B = new WorldArea(lIIIlIlII[53], lIIIlIlII[54], lIIIlIlII[38], lIIIlIlII[11], lIIIlIlII[2]);
        C = new WorldArea(lIIIlIlII[55], lIIIlIlII[56], lIIIlIlII[57], lIIIlIlII[58], lIIIlIlII[2]);
        D = new WorldArea(lIIIlIlII[59], lIIIlIlII[60], lIIIlIlII[61], lIIIlIlII[62], lIIIlIlII[2]);
        E = new WorldArea(lIIIlIlII[63], lIIIlIlII[64], lIIIlIlII[35], lIIIlIlII[36], lIIIlIlII[2]);
        F = new WorldArea(lIIIlIlII[7], lIIIlIlII[65], lIIIlIlII[66], lIIIlIlII[67], lIIIlIlII[2]);
        G = new WorldPoint(lIIIlIlII[68], lIIIlIlII[69], lIIIlIlII[2]);
        H = new WorldPoint(lIIIlIlII[70], lIIIlIlII[71], lIIIlIlII[2]);
        I = new WorldPoint(lIIIlIlII[72], lIIIlIlII[73], lIIIlIlII[1]);
    }

    public static void a(int[] nArray) {
        int[] lIIIllllllllIIl;
        int lIIIllllllllIII = lIIIlIlII[2];
        while (a.lllIIlIllIl(lIIIllllllllIII, lIIIllllllllIIl.length)) {
            Bank.withdraw((int)lIIIllllllllIIl[lIIIllllllllIII], (int)lIIIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIIlIlII[1]);
            0;
            ++lIIIllllllllIII;
            0;
            if (-1 < ((0xEF ^ 0xB2) & ~(0x7C ^ 0x21))) continue;
            return;
        }
    }

    public static void b(int n2, int n3) {
        Bank.withdraw((int)n2, (int)n3, (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        Time.sleepTicks((int)lIIIlIlII[1]);
        0;
    }

    public static void a() {
        if (a.lllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIlII[28])) {
            String[] stringArray = new String[lIIIlIlII[1]];
            stringArray[a.lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[27]];
            NPCs.getNearest((String[])stringArray).interact(lIIIlIIll[lIIIlIlII[29]]);
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIlII[30]);
            0;
        }
        if (!a.lllIIlIlIIl(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lllIIlIlIII(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks((int)lIIIlIlII[15]);
            0;
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIlII[30]);
            0;
            0;
            
            }
        } else if (!(a.lllIIlIlIIl(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lllIIlIlIIl(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lllIIlIlIIl(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lllIIlIlIIl(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lllIIlIlIIl(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !a.lllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(H), lIIIlIlII[11]))) {
            String[] stringArray = new String[lIIIlIlII[1]];
            stringArray[a.lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[31]];
            TileObject lIIIlllllllllII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lllIIlIlIll(lIIIlllllllllII)) {
                String[] stringArray2 = new String[lIIIlIlII[1]];
                stringArray2[a.lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[23]];
                if (a.lllIIlIlIII(lIIIlllllllllII.hasAction(stringArray2) ? 1 : 0)) {
                    lIIIlllllllllII.interact(lIIIlIIll[lIIIlIlII[22]]);
                    Time.sleepTicks((int)lIIIlIlII[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIlII[30]);
                    0;
                }
                String[] stringArray3 = new String[lIIIlIlII[1]];
                stringArray3[a.lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[32]];
                if (a.lllIIlIlIII(lIIIlllllllllII.hasAction(stringArray3) ? 1 : 0)) {
                    lIIIlllllllllII.interact(lIIIlIIll[lIIIlIlII[33]]);
                    Time.sleepTicks((int)lIIIlIlII[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIlII[30]);
                    0;
                }
            }
            0;
            if (2 <= -1) {
                return;
            }
        } else if (a.lllIIlIlIIl(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lllIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIlII[28])) {
            String[] stringArray = new String[lIIIlIlII[1]];
            stringArray[a.lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[34]];
            TileObject lIIIlllllllllII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lllIIlIlIll(lIIIlllllllllII)) {
                lIIIlllllllllII.interact(lIIIlIIll[lIIIlIlII[35]]);
                Time.sleepTicks((int)lIIIlIlII[15]);
                0;
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIlII[30]);
                0;
            }
        }
    }

    private static boolean lllIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIlIlIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2, int n3) {
        int lIIIllllllIlIIl;
        int[] nArray = new int[lIIIlIlII[1]];
        nArray[a.lIIIlIlII[2]] = n2;
        if (a.lllIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + n2 + " item id");
        }
        int[] nArray2 = new int[lIIIlIlII[1]];
        nArray2[a.lIIIlIlII[2]] = lIIIllllllIlIIl;
        if (a.lllIIlIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            void lIIIllllllIlIII;
            Bank.withdraw((int)lIIIllllllIlIIl, (int)lIIIllllllIlIII, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIIlIlII[1]);
            0;
        }
    }
}

