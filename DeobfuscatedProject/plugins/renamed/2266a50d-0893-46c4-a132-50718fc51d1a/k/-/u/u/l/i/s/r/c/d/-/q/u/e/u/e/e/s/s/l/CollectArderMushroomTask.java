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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.b_Unknown;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Collect Arder Mushroom -> CollectardermushroomTask */
@TaskDesc(name="Collect Arder Mushroom", priority=88, blocking=true)
public class CollectArderMushroomTask
extends Task {
    private final /* synthetic */ a bq;
    private final /* synthetic */ SquireDukeSucellus bp;
    private static /* synthetic */ int[] lIllIlllllIl;
    private static /* synthetic */ String[] lIllIlllllII;

    private static String lllIlIlIIIIllI(String var3, String var21) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), lIllIlllllIl[7]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIllIlllllIl[3], var7);
            return new String(var17.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIlIlIIIlIII(String var10, String var15) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var20 = var15.toCharArray();
        int var23 = lIllIlllllIl[0];
        char[] var9 = var10.toCharArray();
        int var11 = var9.length;
        int var1 = lIllIlllllIl[0];
        while (I.lllIlIlIIlIIIl(var1, var11)) {
            char var13 = var9[var1];
            var4.append((char)(var13 ^ var20[var23 % var20.length]));
            0;
            ++var23;
            ++var1;
            0;
            if (((0xB4 ^ 0x92 ^ (0x2D ^ 0x12)) & (182 + 45 - 86 + 43 ^ 15 + 36 - -98 + 12 ^ -1)) != 2) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    @Inject
    public I(SquireDukeSucellus squireDukeSucellus) {
        this.bp = squireDukeSucellus;
        this.bq = squireDukeSucellus.s();
    }

    private static boolean lllIlIlIIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIlIlIIIlIlI() {
        lIllIlllllIl = new int[8];
        I.lIllIlllllIl[0] = (0xC5 ^ 0x99) & ~(0xC3 ^ 0x9F);
        I.lIllIlllllIl[1] = 1;
        I.lIllIlllllIl[2] = 0x9B ^ 0x97;
        I.lIllIlllllIl[3] = 2;
        I.lIllIlllllIl[4] = 3;
        I.lIllIlllllIl[5] = 0x50 ^ 0x54;
        I.lIllIlllllIl[6] = 0x88 ^ 0x8D;
        I.lIllIlllllIl[7] = 0x23 ^ 0x4A ^ (0xC8 ^ 0xA9);
    }

    static {
        I.lllIlIlIIIlIlI();
        I.lllIlIlIIIlIIl();
    }

    private static boolean lllIlIlIIIllll(Object object) {
        return object != null;
    }

    private static void lllIlIlIIIlIIl() {
        lIllIlllllII = new String[lIllIlllllIl[6]];
        I.lIllIlllllII[I.lIllIlllllIl[0]] = I."Arder powder";
        I.lIllIlllllII[I.lIllIlllllIl[1]] = I."Arder mushrooms";
        I.lIllIlllllII[I.lIllIlllllIl[3]] = I."Pick";
        I.lIllIlllllII[I.lIllIlllllIl[4]] = I."Gate";
        I.lIllIlllllII[I.lIllIlllllIl[5]] = I."Quick-escape";
    }

    private static boolean lllIlIlIIIlIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        if (I.lllIlIlIIIlIll(this.bq.v())) {
            return lIllIlllllIl[0];
        }
        TileObject var19 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (I.lllIlIlIIIlIll(tileObject.getName().equals(lIllIlllllII[lIllIlllllIl[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllllIl[1]];
                stringArray[I.lIllIlllllIl[0]] = lIllIlllllII[lIllIlllllIl[5]];
                if (I.lllIlIlIIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllllIl[1];
                    0;
                    if (-(132 + 71 - 26 + 22 ^ 127 + 103 - 121 + 86) <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlllllIl[0];
            return n2 != 0;
        });
        if (I.lllIlIlIIIllII(var19)) {
            return lIllIlllllIl[0];
        }
        Player var14 = Players.getLocal();
        if (I.lllIlIlIIIllII(var14)) {
            return lIllIlllllIl[0];
        }
        if (I.lllIlIlIIIlllI(b.b(var19).contains((Locatable)var14) ? 1 : 0)) {
            return lIllIlllllIl[0];
        }
        String[] stringArray = new String[lIllIlllllIl[1]];
        stringArray[I.lIllIlllllIl[0]] = lIllIlllllII[lIllIlllllIl[0]];
        Item var22 = Inventory.getFirst((String[])stringArray);
        if (I.lllIlIlIIIllll(var22) && I.lllIlIlIIlIIII(var22.getQuantity(), lIllIlllllIl[2])) {
            return lIllIlllllIl[0];
        }
        String[] stringArray2 = new String[lIllIlllllIl[1]];
        stringArray2[I.lIllIlllllIl[0]] = lIllIlllllII[lIllIlllllIl[1]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray2);
        if (I.lllIlIlIIIllII(var5)) {
            return lIllIlllllIl[0];
        }
        var4_4.interact(lIllIlllllII[lIllIlllllIl[3]]);
        return lIllIlllllIl[1];
    }

    private static boolean lllIlIlIIIllII(Object object) {
        return object == null;
    }

    private static boolean lllIlIlIIIlllI(int n2) {
        return n2 == 0;
    }

    private static String lllIlIlIIIIlll(String var6, String var8) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIllIlllllIl[3], var18);
            return new String(var12.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }
}

