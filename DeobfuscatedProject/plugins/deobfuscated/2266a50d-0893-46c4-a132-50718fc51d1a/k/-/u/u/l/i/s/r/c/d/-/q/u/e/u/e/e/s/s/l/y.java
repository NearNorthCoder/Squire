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

@TaskDesc(name="Looting", blocking=true, priority=5000)
public class y
extends Task {
    private final /* synthetic */ SquireDukeSucellus aV;
    private static /* synthetic */ int[] lIllIlIIlIlI;
    private final /* synthetic */ SquireDukeSucellusConfig aW;
    private /* synthetic */ a u;
    private static /* synthetic */ String[] lIllIlIIlIIl;

    private static String lllIIlllIIIIll(String lllllllllllllllIlIllllllIIIIIIII, String lllllllllllllllIlIllllllIIIIIlII) {
        lllllllllllllllIlIllllllIIIIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllllIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllllllIIIIIIll = new StringBuilder();
        char[] lllllllllllllllIlIllllllIIIIIIlI = lllllllllllllllIlIllllllIIIIIlII.toCharArray();
        int lllllllllllllllIlIllllllIIIIIIIl = lIllIlIIlIlI[0];
        char[] lllllllllllllllIlIlllllIlllllIll = lllllllllllllllIlIllllllIIIIIIII.toCharArray();
        int lllllllllllllllIlIlllllIlllllIlI = lllllllllllllllIlIlllllIlllllIll.length;
        int lllllllllllllllIlIlllllIlllllIIl = lIllIlIIlIlI[0];
        while (y.lllIIlllIIlIlI(lllllllllllllllIlIlllllIlllllIIl, lllllllllllllllIlIlllllIlllllIlI)) {
            char lllllllllllllllIlIllllllIIIIIllI = lllllllllllllllIlIlllllIlllllIll[lllllllllllllllIlIlllllIlllllIIl];
            lllllllllllllllIlIllllllIIIIIIll.append((char)(lllllllllllllllIlIllllllIIIIIllI ^ lllllllllllllllIlIllllllIIIIIIlI[lllllllllllllllIlIllllllIIIIIIIl % lllllllllllllllIlIllllllIIIIIIlI.length]));
            0;
            ++lllllllllllllllIlIllllllIIIIIIIl;
            ++lllllllllllllllIlIlllllIlllllIIl;
            0;
            if (((0x64 ^ 0x54 ^ (0x4C ^ 0x36)) & (43 + 64 - -104 + 32 ^ 57 + 124 - 36 + 40 ^ -1)) < (167 + 42 - 84 + 70 ^ 148 + 122 - 181 + 110)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllllllIIIIIIll);
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

    private static String lllIIlllIIIlII(String lllllllllllllllIlIlllllIllllIIII, String lllllllllllllllIlIlllllIlllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllllIllllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllllIllllIIlI.init(lIllIlIIlIlI[2], lllllllllllllllIlIlllllIllllIIll);
            return new String(lllllllllllllllIlIlllllIllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllllIllllIIIl) {
            lllllllllllllllIlIlllllIllllIIIl.printStackTrace();
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
        y lllllllllllllllIlIllllllIIIlIIlI;
        if (y.lllIIlllIIIlll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIllIlIIlIlI[0];
        }
        TileItem lllllllllllllllIlIllllllIIIlIIIl = TileItems.getNearest(tileItem -> e.S.contains(tileItem.getName()));
        if (y.lllIIlllIIlIII(lllllllllllllllIlIllllllIIIlIIIl)) {
            if (y.lllIIlllIIIlll(LocalPlayer.getAccountType().isIronman() ? 1 : 0) && y.lllIIlllIIIlll(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
                lllllllllllllllIlIllllllIIIlIIlI.aV.f(lIllIlIIlIlI[0]);
                return lIllIlIIlIlI[0];
            }
            lllllllllllllllIlIllllllIIIlIIIl = TileItems.getNearest(tileItem -> e.T.contains(tileItem.getName()));
            if (y.lllIIlllIIlIII(lllllllllllllllIlIllllllIIIlIIIl)) {
                lllllllllllllllIlIllllllIIIlIIlI.aV.f(lIllIlIIlIlI[0]);
                return lIllIlIIlIlI[0];
            }
        }
        if (y.lllIIlllIIlIIl(Inventory.isFull() ? 1 : 0)) {
            Item lllllllllllllllIlIllllllIIIlIIII = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIllIlIIlIlI[1]];
                stringArray[y.lIllIlIIlIlI[0]] = lIllIlIIlIIl[lIllIlIIlIlI[2]];
                return item.hasAction(stringArray);
            });
            if (y.lllIIlllIIlIII(lllllllllllllllIlIllllllIIIlIIII)) {
                lllllllllllllllIlIllllllIIIlIIlI.aV.f(lIllIlIIlIlI[0]);
                lllllllllllllllIlIllllllIIIlIIlI.aV.g(lIllIlIIlIlI[1]);
                return lIllIlIIlIlI[0];
            }
            lllllllllllllllIlIllllllIIIlIIII.interact(lIllIlIIlIIl[lIllIlIIlIlI[0]]);
            return lIllIlIIlIlI[1];
        }
        var1_1.interact(lIllIlIIlIIl[lIllIlIIlIlI[1]]);
        return lIllIlIIlIlI[1];
    }

    private static boolean lllIIlllIIlIII(Object object) {
        return object == null;
    }

    private static String lllIIlllIIIIlI(String lllllllllllllllIlIlllllIlllIIIll, String lllllllllllllllIlIlllllIlllIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIlllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIlllIIIII.getBytes(StandardCharsets.UTF_8)), lIllIlIIlIlI[4]), "DES");
            Cipher lllllllllllllllIlIlllllIlllIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlllllIlllIIlIl.init(lIllIlIIlIlI[2], lllllllllllllllIlIlllllIlllIIllI);
            return new String(lllllllllllllllIlIlllllIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllllIlllIIlII) {
            lllllllllllllllIlIlllllIlllIIlII.printStackTrace();
            return null;
        }
    }

    static {
        y.lllIIlllIIIllI();
        y.lllIIlllIIIlIl();
    }
}

