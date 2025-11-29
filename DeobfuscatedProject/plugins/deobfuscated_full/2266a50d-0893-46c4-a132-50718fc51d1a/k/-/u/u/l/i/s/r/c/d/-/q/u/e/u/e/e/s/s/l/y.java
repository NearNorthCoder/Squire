/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.account.LocalPlayer
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

/* TASK: Looting -> LootingTask */
@TaskDesc(name="Looting", blocking=true, priority=5000)
public class y
extends Task {
    private final /* synthetic */ SquireDukeSucellus aV;
    private static /* synthetic */ int[] lIllIlIIlIlI;
    private final /* synthetic */ SquireDukeSucellusConfig aW;
    private /* synthetic */ a u;
    private static /* synthetic */ String[] lIllIlIIlIIl;

    private static String lllIIlllIIIIll(String var13, String var9) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var17 = var9.toCharArray();
        int var3 = lIllIlIIlIlI[0];
        char[] var19 = var13.toCharArray();
        int var22 = var19.length;
        int var18 = lIllIlIIlIlI[0];
        while (y.lllIIlllIIlIlI(var18, var22)) {
            char var2 = var19[var18];
            var15.append((char)(var2 ^ var17[var3 % var17.length]));
            0;
            ++var3;
            ++var18;
            0;
            if (((0x64 ^ 0x54 ^ (0x4C ^ 0x36)) & (43 + 64 - -104 + 32 ^ 57 + 124 - 36 + 40 ^ -1)) < (167 + 42 - 84 + 70 ^ 148 + 122 - 181 + 110)) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void lllIIlllIIIllI() {
        lIllIlIIlIlI = new int[5];
        y.lIllIlIIlIlI[0] = (0x1C ^ 0x50 ^ (0xA ^ 0x61)) & (0x60 ^ 0x36 ^ (0xD2 ^ 0xA3) ^ -1);
        y.lIllIlIIlIlI[1] = 1;
        y.lIllIlIIlIlI[2] = 2;
        y.lIllIlIIlIlI[3] = 3;
        y.lIllIlIIlIlI[4] = 102 + 151 - 126 + 47 ^ 10 + 144 - 29 + 41;
    }

    private static void lllIIlllIIIlIl() {
        lIllIlIIlIIl = new String[lIllIlIIlIlI[3]];
        y.lIllIlIIlIIl[y.lIllIlIIlIlI[0]] = y."Eat";
        y.lIllIlIIlIIl[y.lIllIlIIlIlI[1]] = y."Take";
        y.lIllIlIIlIIl[y.lIllIlIIlIlI[2]] = y."Eat";
    }

    private static boolean lllIIlllIIlIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public y(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aW = squireDukeSucellusConfig;
        this.aV = squireDukeSucellus;
        this.u = squireDukeSucellus.s();
    }

    private static String lllIIlllIIIlII(String var21, String var8) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIllIlIIlIlI[2], var6);
            return new String(var5.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlllIIIlll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        y var1;
        if (y.lllIIlllIIIlll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIllIlIIlIlI[0];
        }
        TileItem var10 = TileItems.getNearest(tileItem -> e.S.contains(tileItem.getName()));
        if (y.lllIIlllIIlIII(var10)) {
            if (y.lllIIlllIIIlll(LocalPlayer.getAccountType().isIronman() ? 1 : 0) && y.lllIIlllIIIlll(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
                var1.aV.f(lIllIlIIlIlI[0]);
                return lIllIlIIlIlI[0];
            }
            var10 = TileItems.getNearest(tileItem -> e.T.contains(tileItem.getName()));
            if (y.lllIIlllIIlIII(var10)) {
                var1.aV.f(lIllIlIIlIlI[0]);
                return lIllIlIIlIlI[0];
            }
        }
        if (y.lllIIlllIIlIIl(Inventory.isFull() ? 1 : 0)) {
            Item var16 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIllIlIIlIlI[1]];
                stringArray[y.lIllIlIIlIlI[0]] = lIllIlIIlIIl[lIllIlIIlIlI[2]];
                return item.hasAction(stringArray);
            });
            if (y.lllIIlllIIlIII(var16)) {
                var1.aV.f(lIllIlIIlIlI[0]);
                var1.aV.g(lIllIlIIlIlI[1]);
                return lIllIlIIlIlI[0];
            }
            var16.interact(lIllIlIIlIIl[lIllIlIIlIlI[0]]);
            return lIllIlIIlIlI[1];
        }
        var1_1.interact(lIllIlIIlIIl[lIllIlIIlIlI[1]]);
        return lIllIlIIlIlI[1];
    }

    private static boolean lllIIlllIIlIII(Object object) {
        return object == null;
    }

    private static String lllIIlllIIIIlI(String var11, String var4) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIllIlIIlIlI[4]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIllIlIIlIlI[2], var20);
            return new String(var12.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    static {
        y.lllIIlllIIIllI();
        y.lllIIlllIIIlIl();
    }
}

