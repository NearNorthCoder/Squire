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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;

public class a {
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea B;
    static /* synthetic */ WorldPoint H;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ WorldArea E;
    private static /* synthetic */ String[] llIlIIIIII;
    public static final /* synthetic */ WorldPoint x;
    public static /* synthetic */ WorldPoint F;
    public static final /* synthetic */ WorldArea w;
    public static final /* synthetic */ WorldArea y;
    private static /* synthetic */ int[] llIlIIIIlI;
    public static final /* synthetic */ WorldArea D;
    public static final /* synthetic */ WorldArea z;
    public static final /* synthetic */ WorldArea A;

    private static boolean lIllIIIIIIIll(int n2) {
        return n2 == 0;
    }

    public static void a(int[] nArray) {
        int[] var16;
        int var9 = llIlIIIIlI[2];
        while (a.lIllIIIIIIlll(var9, var16.length)) {
            Bank.withdraw((int)var16[var9], (int)llIlIIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIIIIlI[1]);
            0;
            ++var9;
            0;
            if (1 > -1) continue;
            return;
        }
    }

    static {
        a.lIllIIIIIIIII();
        a.lIlIlllllllll();
        w = new WorldArea(llIlIIIIlI[40], llIlIIIIlI[41], llIlIIIIlI[42], llIlIIIIlI[43], llIlIIIIlI[2]);
        x = new WorldPoint(llIlIIIIlI[44], llIlIIIIlI[45], llIlIIIIlI[2]);
        y = new WorldArea(llIlIIIIlI[46], llIlIIIIlI[47], llIlIIIIlI[48], llIlIIIIlI[48], llIlIIIIlI[2]);
        z = new WorldArea(llIlIIIIlI[49], llIlIIIIlI[50], llIlIIIIlI[51], llIlIIIIlI[52], llIlIIIIlI[2]);
        A = new WorldArea(llIlIIIIlI[53], llIlIIIIlI[54], llIlIIIIlI[38], llIlIIIIlI[11], llIlIIIIlI[2]);
        B = new WorldArea(llIlIIIIlI[55], llIlIIIIlI[56], llIlIIIIlI[57], llIlIIIIlI[58], llIlIIIIlI[2]);
        C = new WorldArea(llIlIIIIlI[59], llIlIIIIlI[60], llIlIIIIlI[61], llIlIIIIlI[62], llIlIIIIlI[2]);
        D = new WorldArea(llIlIIIIlI[63], llIlIIIIlI[64], llIlIIIIlI[35], llIlIIIIlI[36], llIlIIIIlI[2]);
        E = new WorldArea(llIlIIIIlI[7], llIlIIIIlI[65], llIlIIIIlI[66], llIlIIIIlI[67], llIlIIIIlI[2]);
        F = new WorldPoint(llIlIIIIlI[68], llIlIIIIlI[69], llIlIIIIlI[2]);
        G = new WorldPoint(llIlIIIIlI[70], llIlIIIIlI[71], llIlIIIIlI[2]);
        H = new WorldPoint(llIlIIIIlI[72], llIlIIIIlI[73], llIlIIIIlI[1]);
    }

    private static boolean lIllIIIIIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIllllllIlI(String var32, String var12) {
        var32 = new String(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var15 = var12.toCharArray();
        int var6 = llIlIIIIlI[2];
        char[] var28 = var32.toCharArray();
        int var31 = var28.length;
        int var4 = llIlIIIIlI[2];
        while (a.lIllIIIIIIlll(var4, var31)) {
            char var27 = var28[var4];
            var25.append((char)(var27 ^ var15[var6 % var15.length]));
            0;
            ++var6;
            ++var4;
            0;
            if (((0x80 ^ 0xB5) & ~(0x8B ^ 0xBE)) >= 0) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int[] nArray, int n2) {
        int[] var7;
        int var11 = llIlIIIIlI[2];
        while (a.lIllIIIIIIlll(var11, var7.length)) {
            void var33;
            Bank.withdraw((int)var7[var11], (int)var33, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIIIIlI[1]);
            0;
            int[] nArray2 = new int[llIlIIIIlI[1]];
            nArray2[a.llIlIIIIlI[2]] = var7[var11];
            if (a.lIllIIIIIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                0;
                if (null == null) break;
                return;
            }
            ++var11;
            0;
            if (-1 <= (0x9B ^ 0x9F)) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int[] nArray, int n2) {
        int[] var10;
        int var14 = llIlIIIIlI[2];
        while (a.lIllIIIIIIlll(var14, var10.length)) {
            void var1;
            Bank.withdraw((int)var10[var14], (int)var1, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIIIIlI[1]);
            0;
            ++var14;
            0;
            if (((0xAB ^ 0xA0 ^ (0x45 ^ 0x72) & ~(0x51 ^ 0x66)) & (0xD6 ^ 0x90 ^ (0x5F ^ 0x12) ^ -1)) != 3) continue;
            return;
        }
    }

    public static void b(int n2, int n3) {
        Bank.withdraw((int)n2, (int)n3, (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        Time.sleepTicks((int)llIlIIIIlI[1]);
        0;
    }

    public static void a() {
        if (a.lIllIIIIIIllI(Players.getLocal().getWorldLocation().distanceTo(H), llIlIIIIlI[28])) {
            String[] stringArray = new String[llIlIIIIlI[1]];
            stringArray[a.llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[27]];
            NPCs.getNearest((String[])stringArray).interact(llIlIIIIII[llIlIIIIlI[29]]);
            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIIlI[30]);
            0;
        }
        if (!a.lIllIIIIIIIll(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIllIIIIIIIlI(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks((int)llIlIIIIlI[15]);
            0;
            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIIlI[30]);
            0;
            0;
            
            }
        } else if (!(a.lIllIIIIIIIll(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIllIIIIIIIll(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIllIIIIIIIll(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIllIIIIIIIll(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIllIIIIIIIll(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !a.lIllIIIIIIllI(Players.getLocal().getWorldLocation().distanceTo(G), llIlIIIIlI[11]))) {
            String[] stringArray = new String[llIlIIIIlI[1]];
            stringArray[a.llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[31]];
            TileObject var13 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lIllIIIIIIlIl(var13)) {
                String[] stringArray2 = new String[llIlIIIIlI[1]];
                stringArray2[a.llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[23]];
                if (a.lIllIIIIIIIlI(var13.hasAction(stringArray2) ? 1 : 0)) {
                    var13.interact(llIlIIIIII[llIlIIIIlI[22]]);
                    Time.sleepTicks((int)llIlIIIIlI[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIIlI[30]);
                    0;
                }
                String[] stringArray3 = new String[llIlIIIIlI[1]];
                stringArray3[a.llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[32]];
                if (a.lIllIIIIIIIlI(var13.hasAction(stringArray3) ? 1 : 0)) {
                    var13.interact(llIlIIIIII[llIlIIIIlI[33]]);
                    Time.sleepTicks((int)llIlIIIIlI[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIIlI[30]);
                    0;
                }
            }
            0;
            if (3 > 3) {
                return;
            }
        } else if (a.lIllIIIIIIIll(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIllIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(H), llIlIIIIlI[28])) {
            String[] stringArray = new String[llIlIIIIlI[1]];
            stringArray[a.llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[34]];
            TileObject var13 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lIllIIIIIIlIl(var13)) {
                var13.interact(llIlIIIIII[llIlIIIIlI[35]]);
                Time.sleepTicks((int)llIlIIIIlI[15]);
                0;
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIIlI[30]);
                0;
            }
        }
    }

    private static void lIllIIIIIIIII() {
        llIlIIIIlI = new int[74];
        a.llIlIIIIlI[0] = -(0xFFFFF339 & 0x7EDF) & (0xFFFFFEDB & 0x7BBC);
        a.llIlIIIIlI[1] = 1;
        a.llIlIIIIlI[2] = (0x91 ^ 0xAA) & ~(0 ^ 0x3B);
        a.llIlIIIIlI[3] = -(0xFFFFD76D & 0x389B) & (0xFFFFFFBD & 0x19DE);
        a.llIlIIIIlI[4] = -(0xFFFFAFA7 & 0x72D9) & (0xFFFFF3F9 & 0x3FFF);
        a.llIlIIIIlI[5] = 0xFFFFFF89 & 0xBFE;
        a.llIlIIIIlI[6] = -(0xFFFFDB1B & 0x6DF7) & (0xFFFFFFBF & 0x5FDF);
        a.llIlIIIIlI[7] = -(0xFFFFE7AB & 0x7855) & (0xFFFFEF7E & 0x7BFD);
        a.llIlIIIIlI[8] = 0xFFFFFFB2 & 0x16CD;
        a.llIlIIIIlI[9] = 1 ^ 0x1A;
        a.llIlIIIIlI[10] = 0x5A ^ 0x68 ^ (0xA6 ^ 0x88);
        a.llIlIIIIlI[11] = 6 ^ 0x71 ^ (0x3D ^ 0x5E);
        a.llIlIIIIlI[12] = -1;
        a.llIlIIIIlI[13] = 0xB0 ^ 0x84 ^ (0x3B ^ 9);
        a.llIlIIIIlI[14] = 2;
        a.llIlIIIIlI[15] = 3;
        a.llIlIIIIlI[16] = 0x47 ^ 0x6F;
        a.llIlIIIIlI[17] = -(0xFFFFFBFF & 0x75CF) & (0xFFFFFFFF & 0x7BFE);
        a.llIlIIIIlI[18] = -(0xFFFFFFEF & 0x323F) & (0xFFFFBFEF & 0x7F7E);
        a.llIlIIIIlI[19] = 0xE ^ 0xB;
        a.llIlIIIIlI[20] = 0xFFFFBAAD & 0x4F56;
        a.llIlIIIIlI[21] = -(0xFFFF94B7 & 0x7BCB) & (0xFFFF9BFE & 0x7FAF);
        a.llIlIIIIlI[22] = 0x88 ^ 0xA9 ^ (0x83 ^ 0xA9);
        a.llIlIIIIlI[23] = 1 ^ 0xB;
        a.llIlIIIIlI[24] = 0x47 ^ 0x43;
        a.llIlIIIIlI[25] = 0xFFFFBE4F & 0x4DFF;
        a.llIlIIIIlI[26] = 0xFFFFFF5F & 0xFF1;
        a.llIlIIIIlI[27] = 0x95 ^ 0x92;
        a.llIlIIIIlI[28] = 0x35 ^ 0x2B;
        a.llIlIIIIlI[29] = 0xAF ^ 0xA7;
        a.llIlIIIIlI[30] = 0xFFFFBFE6 & 0x4FB9;
        a.llIlIIIIlI[31] = 10 + 75 - 44 + 101 ^ 36 + 1 - -83 + 15;
        a.llIlIIIIlI[32] = 0x4C ^ 0x5B ^ (0x61 ^ 0x7A);
        a.llIlIIIIlI[33] = 0x20 ^ 0x2D;
        a.llIlIIIIlI[34] = 0xA5 ^ 0xAB;
        a.llIlIIIIlI[35] = 0xA1 ^ 0xAE;
        a.llIlIIIIlI[36] = 148 + 76 - 88 + 50 ^ 89 + 150 - 83 + 14;
        a.llIlIIIIlI[37] = 0xB ^ 0x1A;
        a.llIlIIIIlI[38] = 0xB2 ^ 0x86 ^ (0x28 ^ 0xE);
        a.llIlIIIIlI[39] = 0xE ^ 0x1D;
        a.llIlIIIIlI[40] = -(0xFFFFF1F9 & 0x7FBF) & (0xFFFFFFFF & 0x7DFF);
        a.llIlIIIIlI[41] = -(0xFFFFBA4D & 0x57FF) & (0xFFFF9FFD & 0x7FDF);
        a.llIlIIIIlI[42] = 0x26 ^ 0x35 ^ (0x6F ^ 0x55);
        a.llIlIIIIlI[43] = 3 ^ (0x14 ^ 0x30);
        a.llIlIIIIlI[44] = 0xFFFFEF94 & 0x1CEF;
        a.llIlIIIIlI[45] = 0xFFFFDF6D & 0x2DB7;
        a.llIlIIIIlI[46] = -(0x61 ^ 0x64) & (0xFFFFFBFF & 0xF5F);
        a.llIlIIIIlI[47] = 0xFFFFECFE & 0x1F8B;
        a.llIlIIIIlI[48] = 0xE8 ^ 0x81;
        a.llIlIIIIlI[49] = -(0xFFFFF486 & 0x5BFB) & (0xFFFFDCFD & Short.MAX_VALUE);
        a.llIlIIIIlI[50] = -(0xA3 ^ 0xAA) & (0xFFFF9DBF & 0x6F6E);
        a.llIlIIIIlI[51] = 0x57 ^ 0x47 ^ (0x11 ^ 0x22);
        a.llIlIIIIlI[52] = 0x79 ^ 0x54 ^ (0x54 ^ 0x43);
        a.llIlIIIIlI[53] = 0xFFFF8DF7 & 0x7E3D;
        a.llIlIIIIlI[54] = -(6 + 126 - 55 + 64) & (0xFFFF9EFF & 0x6FAF);
        a.llIlIIIIlI[55] = 0xFFFFCF1F & 0x3EFE;
        a.llIlIIIIlI[56] = 0xFFFFDFFB & 0x2D5E;
        a.llIlIIIIlI[57] = 0x70 ^ 0x2C;
        a.llIlIIIIlI[58] = 0x8D ^ 0xA8;
        a.llIlIIIIlI[59] = 0xFFFF9F7F & 0x6CBA;
        a.llIlIIIIlI[60] = 0xFFFFEF77 & 0x1DF9;
        a.llIlIIIIlI[61] = 0x47 ^ 0x48 ^ (0x9F ^ 0xA1);
        a.llIlIIIIlI[62] = 0x1D ^ 0x22 ^ (0x34 ^ 0x4F);
        a.llIlIIIIlI[63] = -(0xFFFFF37B & 0x7DA5) & (0xFFFFF7FF & 0x7F7E);
        a.llIlIIIIlI[64] = 0xFFFFAF71 & 0x5FEE;
        a.llIlIIIIlI[65] = -(0xFFFFF37B & 0x5F87) & (0xFFFFDFEF & Short.MAX_VALUE);
        a.llIlIIIIlI[66] = 0x8D ^ 0xA0;
        a.llIlIIIIlI[67] = 0x21 ^ 0x70 ^ (0x63 ^ 0x16);
        a.llIlIIIIlI[68] = 0xFFFFCF9F & 0x3BFF;
        a.llIlIIIIlI[69] = -(0xFFFFE7F3 & 0x7B4E) & (0xFFFFFFEF & 0x6FFB);
        a.llIlIIIIlI[70] = 0xFFFFA6FE & 0x5FBB;
        a.llIlIIIIlI[71] = 0xFFFFFDFB & 0xF8D;
        a.llIlIIIIlI[72] = -(0xFFFFF4DF & 0x7B2C) & (0xFFFFFFFF & 0x7BEF);
        a.llIlIIIIlI[73] = -(0xFFFFE7DB & 0x3837) & (0xFFFFF77F & 0x3BFF);
    }

    private static boolean lIllIIIIIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIllllllIll(String var26, String var3) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(llIlIIIIlI[14], var8);
            return new String(var21.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllllllll() {
        llIlIIIIII = new String[llIlIIIIlI[11]];
        a.llIlIIIIII[a.llIlIIIIlI[2]] = a."Yes";
        a.llIlIIIIII[a.llIlIIIIlI[1]] = a."Break";
        a.llIlIIIIII[a.llIlIIIIlI[14]] = a."Wear";
        a.llIlIIIIII[a.llIlIIIIlI[15]] = a."Wear";
        a.llIlIIIIII[a.llIlIIIIlI[24]] = a."Break";
        a.llIlIIIIII[a.llIlIIIIlI[19]] = a."Lever";
        a.llIlIIIIII[a.llIlIIIIlI[13]] = a."Pull";
        a.llIlIIIIII[a.llIlIIIIlI[27]] = a."Emerald Benedict";
        a.llIlIIIIII[a.llIlIIIIlI[29]] = a."Bank";
        a.llIlIIIIII[a.llIlIIIIlI[31]] = a."Bank chest";
        a.llIlIIIIII[a.llIlIIIIlI[23]] = a."Use";
        a.llIlIIIIII[a.llIlIIIIlI[22]] = a."Use";
        a.llIlIIIIII[a.llIlIIIIlI[32]] = a."Bank";
        a.llIlIIIIII[a.llIlIIIIlI[33]] = a."Bank";
        a.llIlIIIIII[a.llIlIIIIlI[34]] = a."Bank booth";
        a.llIlIIIIII[a.llIlIIIIlI[35]] = a."Bank";
        a.llIlIIIIII[a.llIlIIIIlI[36]] = a."teleport";
        a.llIlIIIIII[a.llIlIIIIlI[37]] = a."teleport";
        a.llIlIIIIII[a.llIlIIIIlI[38]] = a."teleport";
        a.llIlIIIIII[a.llIlIIIIlI[39]] = a."teleport";
    }

    private static String lIlIllllllIIl(String var29, String var34) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var34.getBytes(StandardCharsets.UTF_8)), llIlIIIIlI[29]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(llIlIIIIlI[14], var22);
            return new String(var18.doFinal(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIIIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2, int n3) {
        int var17;
        int[] nArray = new int[llIlIIIIlI[1]];
        nArray[a.llIlIIIIlI[2]] = n2;
        if (a.lIllIIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + n2 + " item id");
        }
        int[] nArray2 = new int[llIlIIIIlI[1]];
        nArray2[a.llIlIIIIlI[2]] = var17;
        if (a.lIllIIIIIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            void var19;
            Bank.withdraw((int)var17, (int)var19, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIIIIlI[1]);
            0;
        }
    }

    public static void a(BankLocation bankLocation) {
        if (a.lIllIIIIIIIIl(Vars.getBit((int)llIlIIIIlI[0]), llIlIIIIlI[1]) && a.lIllIIIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llIlIIIIlI[1]];
            stringArray[a.llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[2]];
            g.a(stringArray);
        }
        WorldPoint var38 = new WorldPoint(llIlIIIIlI[3], llIlIIIIlI[4], llIlIIIIlI[2]);
        WorldPoint var36 = new WorldPoint(llIlIIIIlI[5], llIlIIIIlI[6], llIlIIIIlI[2]);
        WorldArea var24 = new WorldArea(llIlIIIIlI[7], llIlIIIIlI[8], llIlIIIIlI[9], llIlIIIIlI[10], llIlIIIIlI[2]);
        if ((!a.lIllIIIIIIIll(Players.getLocal().getWorldLocation().equals((Object)var38) ? 1 : 0) || !a.lIllIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(var36), llIlIIIIlI[11]) || a.lIllIIIIIIIlI(var24.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lIllIIIIIIIlI(Inventory.contains(item -> item.getName().contains(llIlIIIIII[llIlIIIIlI[39]])) ? 1 : 0) && a.lIllIIIIIIIIl(Players.getLocal().getAnimation(), llIlIIIIlI[12])) {
            Inventory.getFirst(item -> item.getName().contains(llIlIIIIII[llIlIIIIlI[38]])).interact(llIlIIIIII[llIlIIIIlI[1]]);
            Time.sleepTicks((int)llIlIIIIlI[13]);
            0;
        }
        if (a.lIllIIIIIIIlI(Inventory.contains((int[])f.bk) ? 1 : 0) && a.lIllIIIIIIIll(Equipment.contains((int[])f.bk) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bk).interact(llIlIIIIII[llIlIIIIlI[14]]);
            Time.sleepTicks((int)llIlIIIIlI[14]);
            0;
        }
        if (a.lIllIIIIIIIlI(Inventory.contains((int[])f.aT) ? 1 : 0) && a.lIllIIIIIIIll(Equipment.contains((int[])f.aT) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aT).interact(llIlIIIIII[llIlIIIIlI[15]]);
            Time.sleepTicks((int)llIlIIIIlI[14]);
            0;
        }
        if (!a.lIllIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(x), llIlIIIIlI[11]) || a.lIllIIIIIIIlI(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.VARROCK_WEST_BANK);
            0;
            Time.sleepTicks((int)llIlIIIIlI[14]);
            0;
            0;
            
            }
        } else if (!a.lIllIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(F), llIlIIIIlI[16]) || !a.lIllIIIIIIIll(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIllIIIIIIIlI(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_EAST_BANK);
            0;
            Time.sleepTicks((int)llIlIIIIlI[14]);
            0;
            0;
            if (2 >= 3) {
                return;
            }
        } else if (a.lIllIIIIIIIlI(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_WEST_BANK);
            0;
            Time.sleepTicks((int)llIlIIIIlI[14]);
            0;
            0;
            if (1 == 0) {
                return;
            }
        } else if (a.lIllIIIIIIIlI(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)b.I);
            0;
            Time.sleepTicks((int)llIlIIIIlI[14]);
            0;
            0;
            if ((0x76 ^ 0x72) > (0xC6 ^ 0xC2)) {
                return;
            }
        } else {
            BankLocation var2;
            WorldArea var5;
            WorldArea var35 = new WorldArea(llIlIIIIlI[17], llIlIIIIlI[18], llIlIIIIlI[13], llIlIIIIlI[19], llIlIIIIlI[2]);
            WorldArea var30 = new WorldArea(llIlIIIIlI[20], llIlIIIIlI[21], llIlIIIIlI[22], llIlIIIIlI[23], llIlIIIIlI[2]);
            if ((!a.lIllIIIIIIIll(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIllIIIIIIIlI(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lIllIIIIIIIlI(Inventory.contains(item -> item.getName().contains(llIlIIIIII[llIlIIIIlI[37]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(llIlIIIIII[llIlIIIIlI[36]])).interact(llIlIIIIII[llIlIIIIlI[24]]);
                Time.sleepTicks((int)llIlIIIIlI[24]);
                0;
            }
            if (a.lIllIIIIIIIlI((var5 = new WorldArea(llIlIIIIlI[25], llIlIIIIlI[26], llIlIIIIlI[27], llIlIIIIlI[13], llIlIIIIlI[2])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[llIlIIIIlI[1]];
                stringArray[a.llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[19]];
                TileObject var37 = TileObjects.getNearest((String[])stringArray);
                if (a.lIllIIIIIIlIl(var37)) {
                    var37.interact(llIlIIIIII[llIlIIIIlI[13]]);
                    Time.sleepTicks((int)llIlIIIIlI[24]);
                    0;
                }
            }
            Movement.walkTo((BankLocation)var2);
            0;
            Time.sleepTicks((int)llIlIIIIlI[14]);
            0;
        }
    }

    private static boolean lIllIIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }
}

