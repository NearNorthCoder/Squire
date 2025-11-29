/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Deposit Salax Salt -> DepositsalaxsaltTask */
@TaskDesc(name="Deposit Salax Salt", priority=79, blocking=true)
public class DepositSalaxSaltTask
extends Task {
    private static /* synthetic */ int[] lIllIlIlIlll;
    final /* synthetic */ SquireDukeSucellus bH;
    final /* synthetic */ a bI;
    private static /* synthetic */ String[] lIllIlIlIllI;

    private static boolean lllIlIIIIIIlII(Object object) {
        return object != null;
    }

    @Inject
    public R(SquireDukeSucellus squireDukeSucellus) {
        this.bH = squireDukeSucellus;
        this.bI = squireDukeSucellus.s();
    }

    private static boolean lllIlIIIIIIIlI(Object object) {
        return object == null;
    }

    private static void lllIlIIIIIIIIl() {
        lIllIlIlIlll = new int[8];
        R.lIllIlIlIlll[0] = (0x3D ^ 0x73) & ~(0x75 ^ 0x3B);
        R.lIllIlIlIlll[1] = 2;
        R.lIllIlIlIlll[2] = 1;
        R.lIllIlIlIlll[3] = 6 ^ 0x3B ^ (0xB4 ^ 0x8F);
        R.lIllIlIlIlll[4] = 3;
        R.lIllIlIlIlll[5] = 0x62 ^ 0x66;
        R.lIllIlIlIlll[6] = 2 + 28 - -75 + 63 ^ 124 + 69 - 77 + 57;
        R.lIllIlIlIlll[7] = 0x73 ^ 0x7B;
    }

    private static boolean lllIlIIIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIIIIIIllI(int n2) {
        return n2 != 0;
    }

    static {
        R.lllIlIIIIIIIIl();
        R.lllIlIIIIIIIII();
    }

    private static boolean lllIlIIIIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lllIIllllllllI(String var2, String var11) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIllIlIlIlll[7]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIllIlIlIlll[1], var19);
            return new String(var16.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIIIIIlll(int n2) {
        return n2 == 0;
    }

    private static String lllIIlllllllll(String var1, String var20) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIllIlIlIlll[1], var12);
            return new String(var6.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIIIIIII() {
        lIllIlIlIllI = new String[lIllIlIlIlll[3]];
        R.lIllIlIlIllI[R.lIllIlIlIlll[0]] = R."Salax salt";
        R.lIllIlIlIllI[R.lIllIlIlIlll[2]] = R."Fill";
        R.lIllIlIlIllI[R.lIllIlIlIlll[1]] = R."Fill";
        R.lIllIlIlIllI[R.lIllIlIlIlll[4]] = R."Fermentation Vat";
        R.lIllIlIlIllI[R.lIllIlIlIlll[5]] = R."Gate";
        R.lIllIlIlIllI[R.lIllIlIlIlll[6]] = R."Quick-escape";
    }

    private static boolean lllIlIIIIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIIlllllllIl(String var26, String var5) {
        var26 = new String(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var21 = var5.toCharArray();
        int var24 = lIllIlIlIlll[0];
        char[] var17 = var26.toCharArray();
        int var4 = var17.length;
        int var22 = lIllIlIlIlll[0];
        while (R.lllIlIIIIIIlIl(var22, var4)) {
            char var3 = var17[var22];
            var13.append((char)(var3 ^ var21[var24 % var21.length]));
            0;
            ++var24;
            ++var22;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean a(int n2, TileObject tileObject, TileObject tileObject2) {
        boolean bl;
        void var14;
        void var27;
        int var7;
        String[] stringArray = new String[lIllIlIlIlll[2]];
        stringArray[R.lIllIlIlIlll[0]] = lIllIlIlIllI[lIllIlIlIlll[1]];
        if (!R.lllIlIIIIIIllI(tileObject2.hasAction(stringArray) ? 1 : 0) || R.lllIlIIIIIIlll(tileObject2.getName().equals(lIllIlIlIllI[lIllIlIlIlll[4]]) ? 1 : 0)) {
            return lIllIlIlIlll[0];
        }
        if (R.lllIlIIIIIlIII(var7, lIllIlIlIlll[2])) {
            boolean bl2;
            if (R.lllIlIIIIIlIIl(var27.getWorldX(), var14.getWorldX())) {
                bl2 = lIllIlIlIlll[2];
                0;
                
                }
            } else {
                bl2 = lIllIlIlIlll[0];
            }
            return bl2;
        }
        if (R.lllIlIIIIIIlIl(var27.getWorldX(), var14.getWorldX())) {
            bl = lIllIlIlIlll[2];
            0;
            
            }
        } else {
            bl = lIllIlIlIlll[0];
        }
        return bl;
    }

    private static boolean lllIlIIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var23;
        R var25;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (R.lllIlIIIIIIllI(tileObject.getName().equals(lIllIlIlIllI[lIllIlIlIlll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIlIlll[2]];
                stringArray[R.lIllIlIlIlll[0]] = lIllIlIlIllI[lIllIlIlIlll[6]];
                if (R.lllIlIIIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIlIlll[2];
                    0;
                    if (1 < 2) return n2 != 0;
                    return ((0x75 ^ 0x70 ^ (0xA4 ^ 0x9A)) & (0xCA ^ 0x94 ^ (0xC8 ^ 0xAD) ^ -1)) != 0;
                }
            }
            n2 = lIllIlIlIlll[0];
            return n2 != 0;
        });
        if (R.lllIlIIIIIIIlI(tileObject2)) {
            return lIllIlIlIlll[0];
        }
        Player var10 = Players.getLocal();
        if (R.lllIlIIIIIIIlI(var10)) {
            return lIllIlIlIlll[0];
        }
        int var9 = var25.bI.x();
        if (R.lllIlIIIIIIIll(var9, lIllIlIlIlll[1])) {
            return lIllIlIlIlll[0];
        }
        String[] stringArray = new String[lIllIlIlIlll[2]];
        stringArray[R.lIllIlIlIlll[0]] = lIllIlIlIllI[lIllIlIlIlll[0]];
        Item var28 = Inventory.getFirst((String[])stringArray);
        if (!R.lllIlIIIIIIlII(var28) || R.lllIlIIIIIIlIl(var28.getQuantity(), lIllIlIlIlll[3])) {
            return lIllIlIlIlll[0];
        }
        TileObject var8 = TileObjects.getNearest(arg_0 -> R.a(var9, (TileObject)var23, arg_0));
        if (R.lllIlIIIIIIIlI(var8)) {
            return lIllIlIlIlll[0];
        }
        var5_5.interact(lIllIlIlIllI[lIllIlIlIlll[2]]);
        return lIllIlIlIlll[2];
    }
}

