/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.q_Unknown;

/* TASK: Walking to the bank -> WalkingtothebankTask */
@TaskDesc(name="Walking to the bank", priority=2147483597, blocking=true)
public class WalkingToTheBankTask
extends q_Unknown {
    private static /* synthetic */ int[] lIlIlIIlIIlII;
    private static /* synthetic */ String[] lIlIlIIlIIIll;

    private static boolean lIllllIlllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllllIlllIIlIl() {
        lIlIlIIlIIlII = new int[7];
        r.lIlIlIIlIIlII[0] = (6 + 2 - -107 + 74 ^ 11 + 52 - -16 + 73) & (0x8F ^ 0x9C ^ (0x2C ^ 0x1A) ^ -1);
        r.lIlIlIIlIIlII[1] = 1;
        r.lIlIlIIlIIlII[2] = 2;
        r.lIlIlIIlIIlII[3] = 3;
        r.lIlIlIIlIIlII[4] = 0x46 ^ 0x42;
        r.lIlIlIIlIIlII[5] = 0xB2 ^ 0xB7;
        r.lIlIlIIlIIlII[6] = 0x88 ^ 0x80;
    }

    private static String lIllllIlllIIIll(String var6, String var4) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var20 = var4.toCharArray();
        int var7 = lIlIlIIlIIlII[0];
        char[] var14 = var6.toCharArray();
        int var17 = var14.length;
        int var12 = lIlIlIIlIIlII[0];
        while (r.lIllllIlllIlIlI(var12, var17)) {
            char var16 = var14[var12];
            var11.append((char)(var16 ^ var20[var7 % var20.length]));
            0;
            ++var7;
            ++var12;
            0;
            if (3 <= (6 ^ 3 ^ 1)) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean lIllllIlllIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIllllIlllIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIllllIlllIIIIl(String var5, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIlIlIIlIIlII[2], var9);
            return new String(var19.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void lIllllIlllIIlII() {
        lIlIlIIlIIIll = new String[lIlIlIIlIIlII[5]];
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[0]] = r."Quick-escape";
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[1]] = r."Eat";
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[2]] = r."Eat";
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[3]] = r."Tendril";
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[4]] = r."Quick-escape";
    }

    @Override
    protected boolean l() {
        r var15;
        TileObject tileObject2;
        if (r.lIllllIlllIIllI(this.w.isInInstancedRegion() ? 1 : 0) && r.lIllllIlllIIlll(tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIllllIlllIIllI(tileObject.getName().equals(lIlIlIIlIIIll[lIlIlIIlIIlII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlIIlII[1]];
                stringArray[r.lIlIlIIlIIlII[0]] = lIlIlIIlIIIll[lIlIlIIlIIlII[4]];
                if (r.lIllllIlllIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIlIIlII[1];
                    0;
                    if (((6 + 31 - -19 + 75 ^ 131 + 15 - -13 + 1) & (9 + 182 - 137 + 137 ^ 109 + 50 - 70 + 67 ^ -1)) <= 3) return n2 != 0;
                    return ((0x7C ^ 0x26 ^ (0x60 ^ 0)) & (0x58 ^ 0x15 ^ (0x72 ^ 5) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIIlIIlII[0];
            return n2 != 0;
        }))) {
            tileObject2.interact(lIlIlIIlIIIll[lIlIlIIlIIlII[0]]);
            return lIlIlIIlIIlII[1];
        }
        if (r.lIllllIlllIIllI(var15.t.earlyBank() ? 1 : 0) && r.lIllllIlllIIllI(var15.R() ? 1 : 0)) {
            return lIlIlIIlIIlII[1];
        }
        if (r.lIllllIlllIIllI(var15.P() ? 1 : 0)) {
            return lIlIlIIlIIlII[0];
        }
        Movement.walkTo((WorldPoint)this.t.bank().F());
        0;
        return lIlIlIIlIIlII[1];
    }

    private static boolean lIllllIlllIIllI(int n2) {
        return n2 != 0;
    }

    private static String lIllllIlllIIIlI(String var8, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIIlII[6]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlIlIIlIIlII[2], var2);
            return new String(var10.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean R() {
        void var1_1;
        if (r.lIllllIlllIlIII(Combat.getCurrentHealth(), this.t.eatAt())) {
            return lIlIlIIlIIlII[0];
        }
        Item var13 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlIIlIIlII[1]];
            stringArray[r.lIlIlIIlIIlII[0]] = lIlIlIIlIIIll[lIlIlIIlIIlII[2]];
            return item.hasAction(stringArray);
        });
        if (r.lIllllIlllIlIIl(var13)) {
            return lIlIlIIlIIlII[0];
        }
        var1_1.interact(lIlIlIIlIIIll[lIlIlIIlIIlII[1]]);
        return lIlIlIIlIIlII[1];
    }

    private static boolean lIllllIlllIIlll(Object object) {
        return object != null;
    }

    static {
        r.lIllllIlllIIlIl();
        r.lIllllIlllIIlII();
    }
}

