/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Deposit Musca Mushroom -> DepositmuscamushroomTask */
@TaskDesc(name="Deposit Musca Mushroom", priority=101, blocking=true)
public class N
extends Task {
    private static /* synthetic */ String[] lIlllIIIIIll;
    private static /* synthetic */ int[] lIlllIIIIlIl;
    final /* synthetic */ SquireDukeSucellus bz;
    final /* synthetic */ a bA;

    private static boolean lllIlIlIllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIlIllIllI(Object object) {
        return object != null;
    }

    private static String lllIlIlIlIlIll(String var5, String var9) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var17 = var9.toCharArray();
        int var28 = lIlllIIIIlIl[0];
        char[] var18 = var5.toCharArray();
        int var10 = var18.length;
        int var15 = lIlllIIIIlIl[0];
        while (N.lllIlIlIllIlll(var15, var10)) {
            char var7 = var18[var15];
            var13.append((char)(var7 ^ var17[var28 % var17.length]));
            0;
            ++var28;
            ++var15;
            0;
            if (((0xD8 ^ 0xC7) & ~(0x80 ^ 0x9F)) == 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static String lllIlIlIlIllII(String var19, String var8) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIlllIIIIlIl[7]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIlllIIIIlIl[1], var14);
            return new String(var11.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean a(int n2, TileObject tileObject, TileObject tileObject2) {
        boolean bl;
        void var2;
        void var16;
        int var24;
        String[] stringArray = new String[lIlllIIIIlIl[2]];
        stringArray[N.lIlllIIIIlIl[0]] = lIlllIIIIIll[lIlllIIIIlIl[1]];
        if (!N.lllIlIlIlllIII(tileObject2.hasAction(stringArray) ? 1 : 0) || N.lllIlIlIllIlIl(tileObject2.getName().equals(lIlllIIIIIll[lIlllIIIIlIl[4]]) ? 1 : 0)) {
            return lIlllIIIIlIl[0];
        }
        if (N.lllIlIlIllIlIl(var24)) {
            boolean bl2;
            if (N.lllIlIlIlllIIl(var16.getWorldX(), var2.getWorldX())) {
                bl2 = lIlllIIIIlIl[2];
                0;
                
                }
            } else {
                bl2 = lIlllIIIIlIl[0];
            }
            return bl2;
        }
        if (N.lllIlIlIllIlll(var16.getWorldX(), var2.getWorldX())) {
            bl = lIlllIIIIlIl[2];
            0;
            if (-1 >= ((0x8C ^ 0xA9 ^ (0x4E ^ 0x39)) & (91 + 97 - 143 + 186 ^ 70 + 18 - 44 + 137 ^ -1))) {
                return ((118 + 224 - 267 + 152 ^ 41 + 38 - -15 + 37) & (0x5F ^ 0x7F ^ (0x61 ^ 0x21) ^ -1)) != 0;
            }
        } else {
            bl = lIlllIIIIlIl[0];
        }
        return bl;
    }

    private static boolean lllIlIlIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public N(SquireDukeSucellus squireDukeSucellus) {
        this.bz = squireDukeSucellus;
        this.bA = squireDukeSucellus.s();
    }

    static {
        N.lllIlIlIllIIlI();
        N.lllIlIlIlIllIl();
    }

    private static void lllIlIlIllIIlI() {
        lIlllIIIIlIl = new int[8];
        N.lIlllIIIIlIl[0] = 2 & ~2;
        N.lIlllIIIIlIl[1] = 2;
        N.lIlllIIIIlIl[2] = 1;
        N.lIlllIIIIlIl[3] = 0x8C ^ 0x8A;
        N.lIlllIIIIlIl[4] = 3;
        N.lIlllIIIIlIl[5] = 0x39 ^ 0x3D;
        N.lIlllIIIIlIl[6] = 0x52 ^ 0x57;
        N.lIlllIIIIlIl[7] = 0xC9 ^ 0xC1;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var21;
        N var25;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (N.lllIlIlIlllIII(tileObject.getName().equals(lIlllIIIIIll[lIlllIIIIlIl[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlllIIIIlIl[2]];
                stringArray[N.lIlllIIIIlIl[0]] = lIlllIIIIIll[lIlllIIIIlIl[6]];
                if (N.lllIlIlIlllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlllIIIIlIl[2];
                    0;
                    if (-2 < 0) return n2 != 0;
                    return ((122 + 37 - 141 + 123 ^ 86 + 70 - 39 + 39) & (0xA6 ^ 0xC6 ^ (0x4B ^ 0x3A) ^ -1)) != 0;
                }
            }
            n2 = lIlllIIIIlIl[0];
            return n2 != 0;
        });
        if (N.lllIlIlIllIIll(tileObject2)) {
            return lIlllIIIIlIl[0];
        }
        Player var22 = Players.getLocal();
        if (N.lllIlIlIllIIll(var22)) {
            return lIlllIIIIlIl[0];
        }
        int var12 = var25.bA.w();
        if (N.lllIlIlIllIlII(var12, lIlllIIIIlIl[1])) {
            return lIlllIIIIlIl[0];
        }
        if (N.lllIlIlIllIlIl(h.i((TileObject)var21).contains((Locatable)var22) ? 1 : 0)) {
            return lIlllIIIIlIl[0];
        }
        String[] stringArray = new String[lIlllIIIIlIl[2]];
        stringArray[N.lIlllIIIIlIl[0]] = lIlllIIIIIll[lIlllIIIIlIl[0]];
        Item var1 = Inventory.getFirst((String[])stringArray);
        if (!N.lllIlIlIllIllI(var1) || N.lllIlIlIllIlll(var1.getQuantity(), lIlllIIIIlIl[3])) {
            return lIlllIIIIlIl[0];
        }
        TileObject var4 = TileObjects.getNearest(arg_0 -> N.a(var12, (TileObject)var21, arg_0));
        if (N.lllIlIlIllIIll(var4)) {
            return lIlllIIIIlIl[0];
        }
        var5_5.interact(lIlllIIIIIll[lIlllIIIIlIl[2]]);
        return lIlllIIIIlIl[2];
    }

    private static String lllIlIlIlIlIlI(String var27, String var3) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIlllIIIIlIl[1], var26);
            return new String(var20.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIlllIII(int n2) {
        return n2 != 0;
    }

    private static void lllIlIlIlIllIl() {
        lIlllIIIIIll = new String[lIlllIIIIlIl[3]];
        N.lIlllIIIIIll[N.lIlllIIIIlIl[0]] = N."Musca powder";
        N.lIlllIIIIIll[N.lIlllIIIIlIl[2]] = N."Fill";
        N.lIlllIIIIIll[N.lIlllIIIIlIl[1]] = N."Fill";
        N.lIlllIIIIIll[N.lIlllIIIIlIl[4]] = N."Fermentation Vat";
        N.lIlllIIIIIll[N.lIlllIIIIlIl[5]] = N."Gate";
        N.lIlllIIIIIll[N.lIlllIIIIlIl[6]] = N."Quick-escape";
    }

    private static boolean lllIlIlIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIlIllIIll(Object object) {
        return object == null;
    }
}

