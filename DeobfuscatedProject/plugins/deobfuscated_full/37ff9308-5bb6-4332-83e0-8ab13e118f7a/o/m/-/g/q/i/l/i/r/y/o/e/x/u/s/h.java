/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s;

/* TASK: Bank for staminas -> BankforstaminasTask */
@TaskDesc(name="Bank for staminas")
public class h
extends Task {
    private static /* synthetic */ int[] llllllllIIlI;
    private /* synthetic */ int J;
    private /* synthetic */ int I;
    private /* synthetic */ int K;
    private final /* synthetic */ SquireMixologyConfig L;
    private static /* synthetic */ String[] llllllllIIIl;

    private static String lIIlIlIllIIIlII(String var3, String var11) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var10 = llllllllIIlI[3];
        char[] var17 = var3.toCharArray();
        int var18 = var17.length;
        int var21 = llllllllIIlI[3];
        while (h.lIIlIlIllIIllII(var21, var18)) {
            char var4 = var17[var21];
            var2.append((char)(var4 ^ var13[var10 % var13.length]));
            0;
            ++var10;
            ++var21;
            0;
            if (((0x90 ^ 0xA4 ^ (0xB0 ^ 0xC2)) & (0x64 ^ 0x55 ^ (3 ^ 0x74) ^ -1)) == ((0xBF ^ 0x9A ^ 3) & (211 + 176 - 248 + 92 ^ 6 + 18 - -22 + 147 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lIIlIlIllIIllIl(Object object) {
        return object != null;
    }

    private static void lIIlIlIllIIlIII() {
        llllllllIIlI = new int[22];
        h.llllllllIIlI[0] = -(0xFFFFEF81 & 0x127F) & (0xFFFFEFEF & 0x3EB7);
        h.llllllllIIlI[1] = -(0xFFFF9BDF & 0x7771) & (0xFFFFFFF9 & 0x3FFE);
        h.llllllllIIlI[2] = 0xFFFFBDB9 & 0x6EEF;
        h.llllllllIIlI[3] = (0x5A ^ 0x40) & ~(0x9B ^ 0x81);
        h.llllllllIIlI[4] = 0x34 ^ 0x22 ^ (0x7C ^ 0xE);
        h.llllllllIIlI[5] = 1;
        h.llllllllIIlI[6] = 2;
        h.llllllllIIlI[7] = 3;
        h.llllllllIIlI[8] = 0xFFFFBFF6 & 0x457F;
        h.llllllllIIlI[9] = 0xFFFFE5EB & 0x3E75;
        h.llllllllIIlI[10] = 0xD ^ 0x22 ^ (0xE ^ 0x25);
        h.llllllllIIlI[11] = 0x6E ^ 0x6B;
        h.llllllllIIlI[12] = 6 ^ 0;
        h.llllllllIIlI[13] = 0x37 ^ 0x30;
        h.llllllllIIlI[14] = 0x51 ^ 0x4B ^ (4 ^ 0x16);
        h.llllllllIIlI[15] = 0x5B ^ 0x52;
        h.llllllllIIlI[16] = -1;
        h.llllllllIIlI[17] = 0x74 ^ 0x7E;
        h.llllllllIIlI[18] = 88 + 67 - -7 + 15 ^ 167 + 88 - 203 + 134;
        h.llllllllIIlI[19] = 0x66 ^ 0x6A;
        h.llllllllIIlI[20] = 99 + 30 - 89 + 103 ^ 59 + 21 - 23 + 73;
        h.llllllllIIlI[21] = 0x2F ^ 0xF ^ (0x31 ^ 0x1F);
    }

    private static boolean lIIlIlIllIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIllIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIllIIlIlI(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        h var7;
        if (h.lIIlIlIllIIlIIl(s.e() ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIIl(var7.L.useStamina() ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIlI(Inventory.contains(item -> item.getName().contains(llllllllIIIl[llllllllIIlI[20]])) ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (!h.lIIlIlIllIIlIll(Vars.getBit((int)var7.I), llllllllIIlI[4]) || !h.lIIlIlIllIIlIll(Vars.getBit((int)var7.J), llllllllIIlI[4]) || h.lIIlIlIllIIllII(Vars.getBit((int)var7.K), llllllllIIlI[4])) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIlI(SquireMixology.j ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIlI(SquireMixology.k ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIIl(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llllllllIIlI[5]];
            stringArray[h.llllllllIIlI[3]] = llllllllIIIl[llllllllIIlI[3]];
            TileObject var1 = TileObjects.getNearest((String[])stringArray);
            if (h.lIIlIlIllIIllIl(var1)) {
                SquireMixology.g = llllllllIIIl[llllllllIIlI[5]];
                var1.interact(llllllllIIIl[llllllllIIlI[6]]);
                return llllllllIIlI[3];
            }
            if (h.lIIlIlIllIIlllI(var1)) {
                SquireMixology.g = llllllllIIIl[llllllllIIlI[7]];
                WorldPoint var22 = new WorldPoint(llllllllIIlI[8], llllllllIIlI[9], llllllllIIlI[3]);
                Movement.setDestination((WorldPoint)var22);
                return llllllllIIlI[3];
            }
        }
        if (h.lIIlIlIllIIlIlI(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llllllllIIlI[7]];
            stringArray[h.llllllllIIlI[3]] = llllllllIIIl[llllllllIIlI[10]];
            stringArray[h.llllllllIIlI[5]] = llllllllIIIl[llllllllIIlI[11]];
            stringArray[h.llllllllIIlI[6]] = llllllllIIIl[llllllllIIlI[12]];
            Bank.depositAllExcept((String[])stringArray);
            if (h.lIIlIlIllIIlIIl(Bank.contains(item -> item.getName().contains(llllllllIIIl[llllllllIIlI[19]])) ? 1 : 0)) {
                SquireMixology.g = llllllllIIIl[llllllllIIlI[13]];
                return llllllllIIlI[3];
            }
            if (h.lIIlIlIllIIlIlI(Bank.contains(item -> item.getName().contains(llllllllIIIl[llllllllIIlI[18]])) ? 1 : 0)) {
                SquireMixology.g = llllllllIIIl[llllllllIIlI[14]];
                Bank.withdraw(item -> item.getName().contains(llllllllIIIl[llllllllIIlI[17]]), (int)llllllllIIlI[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                SquireMixology.m = llllllllIIIl[llllllllIIlI[15]];
                SquireMixology.r = llllllllIIlI[16];
                SquireMixology.A = llllllllIIlI[3];
                SquireMixology.k = llllllllIIlI[3];
                return llllllllIIlI[3];
            }
        }
        return llllllllIIlI[3];
    }

    private static boolean lIIlIlIllIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIlIlIllIIIllI(String var9, String var5) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(llllllllIIlI[6], var12);
            return new String(var8.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIllIIlllI(Object object) {
        return object == null;
    }

    private static String lIIlIlIllIIIlIl(String var19, String var14) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llllllllIIlI[14]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(llllllllIIlI[6], var6);
            return new String(var16.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIllIIIlll() {
        llllllllIIIl = new String[llllllllIIlI[21]];
        h.llllllllIIIl[h.llllllllIIlI[3]] = h."Bank Chest";
        h.llllllllIIIl[h.llllllllIIlI[5]] = h."Opening bank";
        h.llllllllIIIl[h.llllllllIIlI[6]] = h."Use";
        h.llllllllIIIl[h.llllllllIIlI[7]] = h."Walk closer to bank";
        h.llllllllIIIl[h.llllllllIIlI[10]] = h."Mox paste";
        h.llllllllIIIl[h.llllllllIIlI[11]] = h."Lye paste";
        h.llllllllIIIl[h.llllllllIIlI[12]] = h."Aga paste";
        h.llllllllIIIl[h.llllllllIIlI[13]] = h."Out of staminas";
        h.llllllllIIIl[h.llllllllIIlI[14]] = h."Withdrawing staminas";
        h.llllllllIIIl[h.llllllllIIlI[15]] = h."Empty";
        h.llllllllIIIl[h.llllllllIIlI[17]] = h."Stamina";
        h.llllllllIIIl[h.llllllllIIlI[18]] = h."Stamina";
        h.llllllllIIIl[h.llllllllIIlI[19]] = h."Stamina";
        h.llllllllIIIl[h.llllllllIIlI[20]] = h."Stamina";
    }

    @Inject
    public h(SquireMixologyConfig squireMixologyConfig) {
        this.I = llllllllIIlI[0];
        this.J = llllllllIIlI[1];
        this.K = llllllllIIlI[2];
        this.L = squireMixologyConfig;
    }

    static {
        h.lIIlIlIllIIlIII();
        h.lIIlIlIllIIIlll();
    }
}

