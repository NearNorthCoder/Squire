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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
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
    public static final /* synthetic */ WorldArea F;
    public static final /* synthetic */ WorldArea B;
    public static final /* synthetic */ WorldArea A;
    public static final /* synthetic */ WorldArea x;
    static /* synthetic */ WorldPoint I;
    private static /* synthetic */ int[] llIlIIlI;
    public static /* synthetic */ WorldPoint H;
    public static final /* synthetic */ WorldArea z;
    public static final /* synthetic */ WorldArea E;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea D;
    public static final /* synthetic */ WorldPoint y;
    private static /* synthetic */ String[] llIlIIII;

    static {
        a.lIlIllIllII();
        a.lIlIllIlIll();
        x = new WorldArea(llIlIIlI[40], llIlIIlI[41], llIlIIlI[42], llIlIIlI[43], llIlIIlI[2]);
        y = new WorldPoint(llIlIIlI[44], llIlIIlI[45], llIlIIlI[2]);
        z = new WorldArea(llIlIIlI[46], llIlIIlI[47], llIlIIlI[48], llIlIIlI[48], llIlIIlI[2]);
        A = new WorldArea(llIlIIlI[49], llIlIIlI[50], llIlIIlI[51], llIlIIlI[52], llIlIIlI[2]);
        B = new WorldArea(llIlIIlI[53], llIlIIlI[54], llIlIIlI[38], llIlIIlI[11], llIlIIlI[2]);
        C = new WorldArea(llIlIIlI[55], llIlIIlI[56], llIlIIlI[57], llIlIIlI[58], llIlIIlI[2]);
        D = new WorldArea(llIlIIlI[59], llIlIIlI[60], llIlIIlI[61], llIlIIlI[62], llIlIIlI[2]);
        E = new WorldArea(llIlIIlI[63], llIlIIlI[64], llIlIIlI[35], llIlIIlI[36], llIlIIlI[2]);
        F = new WorldArea(llIlIIlI[7], llIlIIlI[65], llIlIIlI[66], llIlIIlI[67], llIlIIlI[2]);
        G = new WorldPoint(llIlIIlI[68], llIlIIlI[69], llIlIIlI[2]);
        H = new WorldPoint(llIlIIlI[70], llIlIIlI[71], llIlIIlI[2]);
        I = new WorldPoint(llIlIIlI[72], llIlIIlI[73], llIlIIlI[1]);
    }

    private static String lIlIllIIIIl(String lIlIIlllIlllIIl, String lIlIIlllIlllIII) {
        try {
            SecretKeySpec lIlIIlllIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlllIlllIII.getBytes(StandardCharsets.UTF_8)), llIlIIlI[29]), "DES");
            Cipher lIlIIlllIllllIl = Cipher.getInstance("DES");
            lIlIIlllIllllIl.init(llIlIIlI[14], lIlIIlllIlllllI);
            return new String(lIlIIlllIllllIl.doFinal(Base64.getDecoder().decode(lIlIIlllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlllIllllII) {
            lIlIIlllIllllII.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllII() {
        llIlIIlI = new int[74];
        a.llIlIIlI[0] = 0xFFFFAEA1 & 0x59DE;
        a.llIlIIlI[1] = 1;
        a.llIlIIlI[2] = (0x6A ^ 0x5D) & ~(0xB2 ^ 0x85);
        a.llIlIIlI[3] = 0xFFFFF9F5 & 0xF9E;
        a.llIlIIlI[4] = -(0xFFFFBE75 & 0x638F) & (0xFFFFB3FD & 0x7F7F);
        a.llIlIIlI[5] = 0xFFFF8FDC & 0x7BAB;
        a.llIlIIlI[6] = -(0xFFFFE3F1 & 0x7D2F) & (0xFFFFF7FF & 0x7FAD);
        a.llIlIIlI[7] = -(0xFFFFFCE1 & 0x739F) & (0xFFFFFBFF & 0x7FFC);
        a.llIlIIlI[8] = 0xFFFFF7FE & 0x1E81;
        a.llIlIIlI[9] = 0x83 ^ 0x98;
        a.llIlIIlI[10] = 0x4D ^ 0x2F ^ (0x73 ^ 0xD);
        a.llIlIIlI[11] = 0x79 ^ 0x6D;
        a.llIlIIlI[12] = -1;
        a.llIlIIlI[13] = 158 + 93 - 176 + 107 ^ 63 + 145 - 169 + 137;
        a.llIlIIlI[14] = 2;
        a.llIlIIlI[15] = 3;
        a.llIlIIlI[16] = 130 + 72 - 171 + 135 ^ 39 + 108 - 21 + 16;
        a.llIlIIlI[17] = 0xFFFFCAFB & 0x3F34;
        a.llIlIIlI[18] = 0xFFFFCDE7 & 0x3F58;
        a.llIlIIlI[19] = 0x53 ^ 0x56;
        a.llIlIIlI[20] = 0xFFFFBF3F & 0x4AC4;
        a.llIlIIlI[21] = 0xFFFFCF7D & 0x3BAE;
        a.llIlIIlI[22] = 0x5B ^ 0x50;
        a.llIlIIlI[23] = 0xF0 ^ 0xAD ^ (0x3C ^ 0x6B);
        a.llIlIIlI[24] = 0x57 ^ 0x53;
        a.llIlIIlI[25] = -(0xFFFFF6D9 & 0x59B7) & (0xFFFFFFDF & 0x5CFF);
        a.llIlIIlI[26] = 0xFFFFDFFD & 0x2F53;
        a.llIlIIlI[27] = 0xB ^ 0x22 ^ (0x32 ^ 0x1C);
        a.llIlIIlI[28] = 0x9A ^ 0x84;
        a.llIlIIlI[29] = 0x1E ^ 0x16;
        a.llIlIIlI[30] = 0xFFFFCFE6 & 0x3FB9;
        a.llIlIIlI[31] = 0xCB ^ 0xC2;
        a.llIlIIlI[32] = 24 + 28 - -49 + 76 ^ 63 + 141 - 141 + 126;
        a.llIlIIlI[33] = 0x49 ^ 0x7D ^ (0x4F ^ 0x76);
        a.llIlIIlI[34] = 0xAB ^ 0x97 ^ (0x10 ^ 0x22);
        a.llIlIIlI[35] = 0x60 ^ 0 ^ (0x1E ^ 0x71);
        a.llIlIIlI[36] = 9 ^ 0 ^ (9 ^ 0x10);
        a.llIlIIlI[37] = 0x91 ^ 0x80;
        a.llIlIIlI[38] = 0xD1 ^ 0xC3;
        a.llIlIIlI[39] = 0x55 ^ 0x4E ^ (0x45 ^ 0x4D);
        a.llIlIIlI[40] = -(0xFFFFE2BD & 0x7DD3) & (0xFFFFEEFF & 0x7DD7);
        a.llIlIIlI[41] = -(0xFFFFFBEF & 0x663F) & (0xFFFFEFFF & 0x7FBF);
        a.llIlIIlI[42] = 0x96 ^ 0xBF;
        a.llIlIIlI[43] = 0x82 ^ 0xA5;
        a.llIlIIlI[44] = 0xFFFFAED4 & 0x5DAF;
        a.llIlIIlI[45] = -(0xFFFFFCF5 & 0x33CB) & (0xFFFFFFEF & 0x3DF5);
        a.llIlIIlI[46] = 0xFFFFDFFF & 0x2B5B;
        a.llIlIIlI[47] = 0xFFFFAEFB & 0x5D8E;
        a.llIlIIlI[48] = 168 + 23 - -48 + 13 ^ 148 + 128 - 205 + 78;
        a.llIlIIlI[49] = -(0xFFFFF5CB & 0x7AB7) & (0xFFFFFFFE & 0x7CFF);
        a.llIlIIlI[50] = -(0xFFFFF7BE & 0x58CB) & (0xFFFFFFEF & 0x5DBF);
        a.llIlIIlI[51] = 0x77 ^ 0x54;
        a.llIlIIlI[52] = 0x6D ^ 0x61 ^ (0x3A ^ 0xC);
        a.llIlIIlI[53] = -(0xFFFFB75B & 0x6AAF) & (0xFFFFBFFF & 0x6E3F);
        a.llIlIIlI[54] = -(0xFFFFE5B9 & 0x7ADF) & (0xFFFFEEBB & Short.MAX_VALUE);
        a.llIlIIlI[55] = 0xFFFFDF7E & 0x2E9F;
        a.llIlIIlI[56] = -(0xFFFFB3CF & 0x5C36) & (0xFFFFFFDF & 0x1D7F);
        a.llIlIIlI[57] = 205 + 94 - 209 + 164 ^ 73 + 24 - 45 + 110;
        a.llIlIIlI[58] = 0x79 ^ 0x2A ^ (0xE6 ^ 0x90);
        a.llIlIIlI[59] = -(0xFFFFAD5F & 0x73E5) & (0xFFFFAFFF & 0x7D7E);
        a.llIlIIlI[60] = 0xFFFFDDFF & 0x2F71;
        a.llIlIIlI[61] = 0x44 ^ 0x19 ^ (0x40 ^ 0x2C);
        a.llIlIIlI[62] = 0x2A ^ 0x4A ^ (0x61 ^ 0x45);
        a.llIlIIlI[63] = -(0xFFFFF5AF & 0x1AD1) & (0xFFFF96DF & 0x7FFE);
        a.llIlIIlI[64] = -(0xFFFFB0ED & 0x7F9F) & (0xFFFFFFEF & 0x3FFC);
        a.llIlIIlI[65] = 0xFFFF8FFD & 0x7CEF;
        a.llIlIIlI[66] = 38 + 88 - -12 + 9 ^ 126 + 127 - 225 + 162;
        a.llIlIIlI[67] = 4 ^ 0x34 ^ (0xBA ^ 0xAE);
        a.llIlIIlI[68] = -(0xFFFFF465 & 0x6FFB) & (0xFFFFEFFF & Short.MAX_VALUE);
        a.llIlIIlI[69] = -(0xFFFFC3FB & 0x7F05) & (0xFFFFCFBE & 0x7FEB);
        a.llIlIIlI[70] = 0xFFFFA6FA & 0x5FBF;
        a.llIlIIlI[71] = 0xFFFFFF8F & 0xDF9;
        a.llIlIIlI[72] = -(0xFFFFB59C & 0x6E77) & (0xFFFFFFFF & 0x2FF7);
        a.llIlIIlI[73] = 0xFFFFF36D & 0x1FFF;
    }

    private static boolean lIlIlllIIIl(Object object) {
        return object != null;
    }

    private static void lIlIllIlIll() {
        llIlIIII = new String[llIlIIlI[11]];
        a.llIlIIII[a.llIlIIlI[2]] = a."Yes";
        a.llIlIIII[a.llIlIIlI[1]] = a."Break";
        a.llIlIIII[a.llIlIIlI[14]] = a."Wear";
        a.llIlIIII[a.llIlIIlI[15]] = a."Wear";
        a.llIlIIII[a.llIlIIlI[24]] = a."Break";
        a.llIlIIII[a.llIlIIlI[19]] = a."Lever";
        a.llIlIIII[a.llIlIIlI[13]] = a."Pull";
        a.llIlIIII[a.llIlIIlI[27]] = a."Emerald Benedict";
        a.llIlIIII[a.llIlIIlI[29]] = a."Bank";
        a.llIlIIII[a.llIlIIlI[31]] = a."Bank chest";
        a.llIlIIII[a.llIlIIlI[23]] = a."Use";
        a.llIlIIII[a.llIlIIlI[22]] = a."Use";
        a.llIlIIII[a.llIlIIlI[32]] = a."Bank";
        a.llIlIIII[a.llIlIIlI[33]] = a."Bank";
        a.llIlIIII[a.llIlIIlI[34]] = a."Bank booth";
        a.llIlIIII[a.llIlIIlI[35]] = a."Bank";
        a.llIlIIII[a.llIlIIlI[36]] = a."teleport";
        a.llIlIIII[a.llIlIIlI[37]] = a."teleport";
        a.llIlIIII[a.llIlIIlI[38]] = a."teleport";
        a.llIlIIII[a.llIlIIlI[39]] = a."teleport";
    }

    public static void a(BankLocation bankLocation) {
        if (a.lIlIllIllIl(Vars.getBit((int)llIlIIlI[0]), llIlIIlI[1]) && a.lIlIllIlllI(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llIlIIlI[1]];
            stringArray[a.llIlIIlI[2]] = llIlIIII[llIlIIlI[2]];
            g.a(stringArray);
        }
        WorldPoint lIlIlIIIIIIIlII = new WorldPoint(llIlIIlI[3], llIlIIlI[4], llIlIIlI[2]);
        WorldPoint lIlIlIIIIIIIIll = new WorldPoint(llIlIIlI[5], llIlIIlI[6], llIlIIlI[2]);
        WorldArea lIlIlIIIIIIIIlI = new WorldArea(llIlIIlI[7], llIlIIlI[8], llIlIIlI[9], llIlIIlI[10], llIlIIlI[2]);
        if ((!a.lIlIllIllll(Players.getLocal().getWorldLocation().equals((Object)lIlIlIIIIIIIlII) ? 1 : 0) || !a.lIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(lIlIlIIIIIIIIll), llIlIIlI[11]) || a.lIlIllIlllI(lIlIlIIIIIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lIlIllIlllI(Inventory.contains(item -> item.getName().contains(llIlIIII[llIlIIlI[39]])) ? 1 : 0) && a.lIlIllIllIl(Players.getLocal().getAnimation(), llIlIIlI[12])) {
            Inventory.getFirst(item -> item.getName().contains(llIlIIII[llIlIIlI[38]])).interact(llIlIIII[llIlIIlI[1]]);
            Time.sleepTicks((int)llIlIIlI[13]);
            0;
        }
        if (a.lIlIllIlllI(Inventory.contains((int[])f.bl) ? 1 : 0) && a.lIlIllIllll(Equipment.contains((int[])f.bl) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bl).interact(llIlIIII[llIlIIlI[14]]);
            Time.sleepTicks((int)llIlIIlI[14]);
            0;
        }
        if (a.lIlIllIlllI(Inventory.contains((int[])f.aU) ? 1 : 0) && a.lIlIllIllll(Equipment.contains((int[])f.aU) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aU).interact(llIlIIII[llIlIIlI[15]]);
            Time.sleepTicks((int)llIlIIlI[14]);
            0;
        }
        if (!a.lIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(y), llIlIIlI[11]) || a.lIlIllIlllI(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.VARROCK_WEST_BANK);
            0;
            Time.sleepTicks((int)llIlIIlI[14]);
            0;
            0;
            if ((0x6B ^ 0x6E) <= 0) {
                return;
            }
        } else if (!a.lIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(G), llIlIIlI[16]) || !a.lIlIllIllll(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIlIllIlllI(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_EAST_BANK);
            0;
            Time.sleepTicks((int)llIlIIlI[14]);
            0;
            0;
            if (3 <= 0) {
                return;
            }
        } else if (a.lIlIllIlllI(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_WEST_BANK);
            0;
            Time.sleepTicks((int)llIlIIlI[14]);
            0;
            0;
            if ((0x84 ^ 0x81) <= 0) {
                return;
            }
        } else if (a.lIlIllIlllI(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)b.J);
            0;
            Time.sleepTicks((int)llIlIIlI[14]);
            0;
            0;
            if ((110 + 42 - 20 + 47 ^ 158 + 69 - 160 + 116) < 3) {
                return;
            }
        } else {
            BankLocation lIlIlIIIIIIIlIl;
            WorldArea lIlIIllllllllll;
            WorldArea lIlIlIIIIIIIIIl = new WorldArea(llIlIIlI[17], llIlIIlI[18], llIlIIlI[13], llIlIIlI[19], llIlIIlI[2]);
            WorldArea lIlIlIIIIIIIIII = new WorldArea(llIlIIlI[20], llIlIIlI[21], llIlIIlI[22], llIlIIlI[23], llIlIIlI[2]);
            if ((!a.lIlIllIllll(lIlIlIIIIIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIlIllIlllI(lIlIlIIIIIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lIlIllIlllI(Inventory.contains(item -> item.getName().contains(llIlIIII[llIlIIlI[37]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(llIlIIII[llIlIIlI[36]])).interact(llIlIIII[llIlIIlI[24]]);
                Time.sleepTicks((int)llIlIIlI[24]);
                0;
            }
            if (a.lIlIllIlllI((lIlIIllllllllll = new WorldArea(llIlIIlI[25], llIlIIlI[26], llIlIIlI[27], llIlIIlI[13], llIlIIlI[2])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[llIlIIlI[1]];
                stringArray[a.llIlIIlI[2]] = llIlIIII[llIlIIlI[19]];
                TileObject lIlIIlllllllllI = TileObjects.getNearest((String[])stringArray);
                if (a.lIlIlllIIIl(lIlIIlllllllllI)) {
                    lIlIIlllllllllI.interact(llIlIIII[llIlIIlI[13]]);
                    Time.sleepTicks((int)llIlIIlI[24]);
                    0;
                }
            }
            Movement.walkTo((BankLocation)lIlIlIIIIIIIlIl);
            0;
            Time.sleepTicks((int)llIlIIlI[14]);
            0;
        }
    }

    private static String lIlIllIIIlI(String lIlIIllllIllllI, String lIlIIllllIlllIl) {
        try {
            SecretKeySpec lIlIIlllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIlllllIIIlI = Cipher.getInstance("Blowfish");
            lIlIIlllllIIIlI.init(llIlIIlI[14], lIlIIlllllIIIll);
            return new String(lIlIIlllllIIIlI.doFinal(Base64.getDecoder().decode(lIlIIllllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlllllIIIIl) {
            lIlIIlllllIIIIl.printStackTrace();
            return null;
        }
    }

    public static void b(int n2, int n3) {
        Bank.withdraw((int)n2, (int)n3, (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        Time.sleepTicks((int)llIlIIlI[1]);
        0;
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int[] nArray, int n2) {
        int[] lIlIIlllllIlllI;
        int lIlIIlllllIllII = llIlIIlI[2];
        while (a.lIlIlllIIll(lIlIIlllllIllII, lIlIIlllllIlllI.length)) {
            void lIlIIlllllIllIl;
            Bank.withdraw((int)lIlIIlllllIlllI[lIlIIlllllIllII], (int)lIlIIlllllIllIl, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIIlI[1]);
            0;
            int[] nArray2 = new int[llIlIIlI[1]];
            nArray2[a.llIlIIlI[2]] = lIlIIlllllIlllI[lIlIIlllllIllII];
            if (a.lIlIllIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                0;
                if (null == null) break;
                return;
            }
            ++lIlIIlllllIllII;
            0;
            if (-3 < 0) continue;
            return;
        }
    }

    private static boolean lIlIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIllIlIlI(String lIlIIllllIIlIll, String lIlIIllllIIlIlI) {
        lIlIIllllIIlIll = new String(Base64.getDecoder().decode(lIlIIllllIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIllllIIlllI = new StringBuilder();
        char[] lIlIIllllIIllIl = lIlIIllllIIlIlI.toCharArray();
        int lIlIIllllIIllII = llIlIIlI[2];
        char[] lIlIIllllIIIllI = lIlIIllllIIlIll.toCharArray();
        int lIlIIllllIIIlIl = lIlIIllllIIIllI.length;
        int lIlIIllllIIIlII = llIlIIlI[2];
        while (a.lIlIlllIIll(lIlIIllllIIIlII, lIlIIllllIIIlIl)) {
            char lIlIIllllIlIIIl = lIlIIllllIIIllI[lIlIIllllIIIlII];
            lIlIIllllIIlllI.append((char)(lIlIIllllIlIIIl ^ lIlIIllllIIllIl[lIlIIllllIIllII % lIlIIllllIIllIl.length]));
            0;
            ++lIlIIllllIIllII;
            ++lIlIIllllIIIlII;
            0;
            if (2 != 3) continue;
            return null;
        }
        return String.valueOf(lIlIIllllIIlllI);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int[] nArray, int n2) {
        int[] lIlIIllllllIlII;
        int lIlIIllllllIIlI = llIlIIlI[2];
        while (a.lIlIlllIIll(lIlIIllllllIIlI, lIlIIllllllIlII.length)) {
            void lIlIIllllllIIll;
            Bank.withdraw((int)lIlIIllllllIlII[lIlIIllllllIIlI], (int)lIlIIllllllIIll, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIIlI[1]);
            0;
            ++lIlIIllllllIIlI;
            0;
            
            return;
        }
    }

    public static void a(int[] nArray) {
        int[] lIlIIlllllllIIl;
        int lIlIIlllllllIII = llIlIIlI[2];
        while (a.lIlIlllIIll(lIlIIlllllllIII, lIlIIlllllllIIl.length)) {
            Bank.withdraw((int)lIlIIlllllllIIl[lIlIIlllllllIII], (int)llIlIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIIlI[1]);
            0;
            ++lIlIIlllllllIII;
            0;
            if (-2 < 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2, int n3) {
        int lIlIIlllllIlIIl;
        int[] nArray = new int[llIlIIlI[1]];
        nArray[a.llIlIIlI[2]] = n2;
        if (a.lIlIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + n2 + " item id");
        }
        int[] nArray2 = new int[llIlIIlI[1]];
        nArray2[a.llIlIIlI[2]] = lIlIIlllllIlIIl;
        if (a.lIlIllIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            void lIlIIlllllIlIII;
            Bank.withdraw((int)lIlIIlllllIlIIl, (int)lIlIIlllllIlIII, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIIlI[1]);
            0;
        }
    }

    private static boolean lIlIllIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIllIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void a() {
        if (a.lIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(I), llIlIIlI[28])) {
            String[] stringArray = new String[llIlIIlI[1]];
            stringArray[a.llIlIIlI[2]] = llIlIIII[llIlIIlI[27]];
            NPCs.getNearest((String[])stringArray).interact(llIlIIII[llIlIIlI[29]]);
            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIlI[30]);
            0;
        }
        if (!a.lIlIllIllll(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIlIllIlllI(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks((int)llIlIIlI[15]);
            0;
            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIlI[30]);
            0;
            0;
            if (2 < 0) {
                return;
            }
        } else if (!(a.lIlIllIllll(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIlIllIllll(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIlIllIllll(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIlIllIllll(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIlIllIllll(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !a.lIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(H), llIlIIlI[11]))) {
            String[] stringArray = new String[llIlIIlI[1]];
            stringArray[a.llIlIIlI[2]] = llIlIIII[llIlIIlI[31]];
            TileObject lIlIIllllllllII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lIlIlllIIIl(lIlIIllllllllII)) {
                String[] stringArray2 = new String[llIlIIlI[1]];
                stringArray2[a.llIlIIlI[2]] = llIlIIII[llIlIIlI[23]];
                if (a.lIlIllIlllI(lIlIIllllllllII.hasAction(stringArray2) ? 1 : 0)) {
                    lIlIIllllllllII.interact(llIlIIII[llIlIIlI[22]]);
                    Time.sleepTicks((int)llIlIIlI[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIlI[30]);
                    0;
                }
                String[] stringArray3 = new String[llIlIIlI[1]];
                stringArray3[a.llIlIIlI[2]] = llIlIIII[llIlIIlI[32]];
                if (a.lIlIllIlllI(lIlIIllllllllII.hasAction(stringArray3) ? 1 : 0)) {
                    lIlIIllllllllII.interact(llIlIIII[llIlIIlI[33]]);
                    Time.sleepTicks((int)llIlIIlI[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIlI[30]);
                    0;
                }
            }
            0;
            if (((0xE5 ^ 0xB6 ^ (0xBD ^ 0xAA) & ~(0x38 ^ 0x2F)) & (0x16 ^ 0x64 ^ (0x66 ^ 0x47) ^ -1)) >= 3) {
                return;
            }
        } else if (a.lIlIllIllll(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(I), llIlIIlI[28])) {
            String[] stringArray = new String[llIlIIlI[1]];
            stringArray[a.llIlIIlI[2]] = llIlIIII[llIlIIlI[34]];
            TileObject lIlIIllllllllII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lIlIlllIIIl(lIlIIllllllllII)) {
                lIlIIllllllllII.interact(llIlIIII[llIlIIlI[35]]);
                Time.sleepTicks((int)llIlIIlI[15]);
                0;
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIlI[30]);
                0;
            }
        }
    }

    private static boolean lIlIllIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIIlI(int n2, int n3) {
        return n2 <= n3;
    }
}

