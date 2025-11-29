/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.n;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;

/* TASK: Withdrawing items -> WithdrawingitemsTask */
@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class q
extends n {
    private static /* synthetic */ int[] lIllIlIllllI;
    private static /* synthetic */ String[] lIllIlIlllIl;

    @Override
    public boolean R() {
        q var11;
        if (q.lllIlIIIlIIllI(this.P() ? 1 : 0)) {
            return lIllIlIllllI[0];
        }
        BankLoadout var10 = var11.Q();
        if (q.lllIlIIIlIIlll(var10)) {
            Log.error((String)lIllIlIlllIl[lIllIlIllllI[0]]);
            return lIllIlIllllI[0];
        }
        if (q.lllIlIIIlIIllI(var10.needsToBank() ? 1 : 0)) {
            Log.info((String)lIllIlIlllIl[lIllIlIllllI[1]]);
            var11.w.g(lIllIlIllllI[0]);
            return lIllIlIllllI[0];
        }
        if (q.lllIlIIIlIIllI(Bank.isOpen() ? 1 : 0)) {
            TileObject var4 = TileObjects.getNearest((WorldPoint)var11.ae.bank().H(), tileObject -> {
                boolean bl;
                String[] stringArray = new String[lIllIlIllllI[1]];
                stringArray[q.lIllIlIllllI[0]] = lIllIlIlllIl[lIllIlIllllI[6]];
                if (!q.lllIlIIIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0) || q.lllIlIIIlIlIII(tileObject.getName().contains(lIllIlIlllIl[lIllIlIllllI[7]]) ? 1 : 0)) {
                    bl = lIllIlIllllI[1];
                    0;
                    if ((0x43 ^ 0x6B ^ (0x1A ^ 0x36)) == 0) {
                        return ((76 + 142 - 184 + 132 ^ 76 + 24 - 72 + 111) & (0x67 ^ 0x44 ^ (0x9D ^ 0x93) ^ -1)) != 0;
                    }
                } else {
                    bl = lIllIlIllllI[0];
                }
                return bl;
            });
            if (q.lllIlIIIlIIlll(var4)) {
                Movement.walkTo((WorldPoint)var11.ae.bank().H());
                0;
                return lIllIlIllllI[1];
            }
            String[] stringArray = new String[lIllIlIllllI[2]];
            stringArray[q.lIllIlIllllI[0]] = lIllIlIlllIl[lIllIlIllllI[2]];
            stringArray[q.lIllIlIllllI[1]] = lIllIlIlllIl[lIllIlIllllI[3]];
            var4.interact(stringArray);
            return lIllIlIllllI[1];
        }
        if (q.lllIlIIIlIIllI(BankLoadouts.withdrawWithRetries((BankLoadout)var10, (int)lIllIlIllllI[4]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIllIlIlllIl[lIllIlIllllI[5]]);
        }
        return lIllIlIllllI[1];
    }

    private static boolean lllIlIIIlIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIIlIIlll(Object object) {
        return object == null;
    }

    private static String lllIlIIIlIIIll(String var5, String var22) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIllIlIllllI[2], var7);
            return new String(var17.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlIIlIl() {
        lIllIlIllllI = new int[10];
        q.lIllIlIllllI[0] = (0x25 ^ 0x63) & ~(0x67 ^ 0x21);
        q.lIllIlIllllI[1] = 1;
        q.lIllIlIllllI[2] = 2;
        q.lIllIlIllllI[3] = 3;
        q.lIllIlIllllI[4] = 0x7A ^ 0x6B ^ (0xB3 ^ 0xA8);
        q.lIllIlIllllI[5] = 0xA2 ^ 0x8B ^ (0x59 ^ 0x74);
        q.lIllIlIllllI[6] = 0xB8 ^ 0xBD;
        q.lIllIlIllllI[7] = 0xA0 ^ 0xA6;
        q.lIllIlIllllI[8] = 8 ^ 0xF;
        q.lIllIlIllllI[9] = 0x5B ^ 0x17 ^ (0xDE ^ 0x9A);
    }

    static {
        q.lllIlIIIlIIlIl();
        q.lllIlIIIlIIlII();
    }

    private static void lllIlIIIlIIlII() {
        lIllIlIlllIl = new String[lIllIlIllllI[8]];
        q.lIllIlIlllIl[q.lIllIlIllllI[0]] = q."No bank loadout selected";
        q.lIllIlIlllIl[q.lIllIlIllllI[1]] = q."No need to bank";
        q.lIllIlIlllIl[q.lIllIlIllllI[2]] = q."Use";
        q.lIllIlIlllIl[q.lIllIlIllllI[3]] = q."Bank";
        q.lIllIlIlllIl[q.lIllIlIllllI[5]] = q."failed to withdraw bankloadout 10 times";
        q.lIllIlIlllIl[q.lIllIlIllllI[6]] = q."Bank";
        q.lIllIlIlllIl[q.lIllIlIllllI[7]] = q."Bank";
    }

    private static String lllIlIIIlIIIIl(String var16, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIllIlIllllI[9]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIllIlIllllI[2], var9);
            return new String(var12.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static String lllIlIIIlIIIlI(String var14, String var18) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var6 = var18.toCharArray();
        int var8 = lIllIlIllllI[0];
        char[] var2 = var14.toCharArray();
        int var13 = var2.length;
        int var20 = lIllIlIllllI[0];
        while (q.lllIlIIIlIlIIl(var20, var13)) {
            char var15 = var2[var20];
            var21.append((char)(var15 ^ var6[var8 % var6.length]));
            0;
            ++var8;
            ++var20;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

