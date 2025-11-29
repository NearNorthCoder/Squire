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

@TaskDesc(name="Bank for staminas")
public class h
extends Task {
    private static /* synthetic */ int[] llllllllIIlI;
    private /* synthetic */ int J;
    private /* synthetic */ int I;
    private /* synthetic */ int K;
    private final /* synthetic */ SquireMixologyConfig L;
    private static /* synthetic */ String[] llllllllIIIl;

    private static String lIIlIlIllIIIlII(String lllllllllllllllIIlIIIIlllIIlIllI, String lllllllllllllllIIlIIIIlllIIllIlI) {
        lllllllllllllllIIlIIIIlllIIlIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlllIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIIlllIIllIIl = new StringBuilder();
        char[] lllllllllllllllIIlIIIIlllIIllIII = lllllllllllllllIIlIIIIlllIIllIlI.toCharArray();
        int lllllllllllllllIIlIIIIlllIIlIlll = llllllllIIlI[3];
        char[] lllllllllllllllIIlIIIIlllIIlIIIl = lllllllllllllllIIlIIIIlllIIlIllI.toCharArray();
        int lllllllllllllllIIlIIIIlllIIlIIII = lllllllllllllllIIlIIIIlllIIlIIIl.length;
        int lllllllllllllllIIlIIIIlllIIIllll = llllllllIIlI[3];
        while (h.lIIlIlIllIIllII(lllllllllllllllIIlIIIIlllIIIllll, lllllllllllllllIIlIIIIlllIIlIIII)) {
            char lllllllllllllllIIlIIIIlllIIlllII = lllllllllllllllIIlIIIIlllIIlIIIl[lllllllllllllllIIlIIIIlllIIIllll];
            lllllllllllllllIIlIIIIlllIIllIIl.append((char)(lllllllllllllllIIlIIIIlllIIlllII ^ lllllllllllllllIIlIIIIlllIIllIII[lllllllllllllllIIlIIIIlllIIlIlll % lllllllllllllllIIlIIIIlllIIllIII.length]));
            0;
            ++lllllllllllllllIIlIIIIlllIIlIlll;
            ++lllllllllllllllIIlIIIIlllIIIllll;
            0;
            if (((0x90 ^ 0xA4 ^ (0xB0 ^ 0xC2)) & (0x64 ^ 0x55 ^ (3 ^ 0x74) ^ -1)) == ((0xBF ^ 0x9A ^ 3) & (211 + 176 - 248 + 92 ^ 6 + 18 - -22 + 147 ^ -1))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIIlllIIllIIl);
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
        h lllllllllllllllIIlIIIIlllIlIlIII;
        if (h.lIIlIlIllIIlIIl(s.e() ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIIl(lllllllllllllllIIlIIIIlllIlIlIII.L.useStamina() ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (h.lIIlIlIllIIlIlI(Inventory.contains(item -> item.getName().contains(llllllllIIIl[llllllllIIlI[20]])) ? 1 : 0)) {
            return llllllllIIlI[3];
        }
        if (!h.lIIlIlIllIIlIll(Vars.getBit((int)lllllllllllllllIIlIIIIlllIlIlIII.I), llllllllIIlI[4]) || !h.lIIlIlIllIIlIll(Vars.getBit((int)lllllllllllllllIIlIIIIlllIlIlIII.J), llllllllIIlI[4]) || h.lIIlIlIllIIllII(Vars.getBit((int)lllllllllllllllIIlIIIIlllIlIlIII.K), llllllllIIlI[4])) {
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
            TileObject lllllllllllllllIIlIIIIlllIlIIlll = TileObjects.getNearest((String[])stringArray);
            if (h.lIIlIlIllIIllIl(lllllllllllllllIIlIIIIlllIlIIlll)) {
                SquireMixology.g = llllllllIIIl[llllllllIIlI[5]];
                lllllllllllllllIIlIIIIlllIlIIlll.interact(llllllllIIIl[llllllllIIlI[6]]);
                return llllllllIIlI[3];
            }
            if (h.lIIlIlIllIIlllI(lllllllllllllllIIlIIIIlllIlIIlll)) {
                SquireMixology.g = llllllllIIIl[llllllllIIlI[7]];
                WorldPoint lllllllllllllllIIlIIIIlllIlIIllI = new WorldPoint(llllllllIIlI[8], llllllllIIlI[9], llllllllIIlI[3]);
                Movement.setDestination((WorldPoint)lllllllllllllllIIlIIIIlllIlIIllI);
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

    private static String lIIlIlIllIIIllI(String lllllllllllllllIIlIIIIlllIIIIllI, String lllllllllllllllIIlIIIIlllIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIlllIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIlllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIlllIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIlllIIIlIII.init(llllllllIIlI[6], lllllllllllllllIIlIIIIlllIIIlIIl);
            return new String(lllllllllllllllIIlIIIIlllIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIlllIIIIlll) {
            lllllllllllllllIIlIIIIlllIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIllIIlllI(Object object) {
        return object == null;
    }

    private static String lIIlIlIllIIIlIl(String lllllllllllllllIIlIIIIllIlllIlll, String lllllllllllllllIIlIIIIllIlllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIllIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIllIlllIllI.getBytes(StandardCharsets.UTF_8)), llllllllIIlI[14]), "DES");
            Cipher lllllllllllllllIIlIIIIllIllllIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIllIllllIll.init(llllllllIIlI[6], lllllllllllllllIIlIIIIllIlllllII);
            return new String(lllllllllllllllIIlIIIIllIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIllIllllIlI) {
            lllllllllllllllIIlIIIIllIllllIlI.printStackTrace();
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

