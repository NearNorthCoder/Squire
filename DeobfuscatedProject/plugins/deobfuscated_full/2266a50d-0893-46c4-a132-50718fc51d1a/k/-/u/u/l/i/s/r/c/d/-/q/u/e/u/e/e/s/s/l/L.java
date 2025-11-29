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
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.b;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Walk To Arder Mushroom -> WalktoardermushroomTask */
@TaskDesc(name="Walk To Arder Mushroom", priority=89, blocking=true)
public class L
extends Task {
    private static /* synthetic */ int[] lIllIlIIIIII;
    private static /* synthetic */ String[] lIllIIllllll;
    final /* synthetic */ a bw;
    final /* synthetic */ SquireDukeSucellus bv;

    private static boolean lllIIllIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        L.lllIIllIIllllI();
        L.lllIIllIIlllIl();
    }

    private static boolean lllIIllIlIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIllIlIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public L(SquireDukeSucellus squireDukeSucellus) {
        this.bv = squireDukeSucellus;
        this.bw = squireDukeSucellus.s();
    }

    private static String lllIIllIIllIlI(String var22, String var17) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var14 = var17.toCharArray();
        int var20 = lIllIlIIIIII[0];
        char[] var21 = var22.toCharArray();
        int var18 = var21.length;
        int var10 = lIllIlIIIIII[0];
        while (L.lllIIllIlIIlII(var10, var18)) {
            char var19 = var21[var10];
            var5.append((char)(var19 ^ var14[var20 % var14.length]));
            0;
            ++var20;
            ++var10;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (L.lllIIllIIlllll(this.bw.v())) {
            return lIllIlIIIIII[0];
        }
        TileObject var7 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (L.lllIIllIIlllll(tileObject.getName().equals(lIllIIllllll[lIllIlIIIIII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIIIII[1]];
                stringArray[L.lIllIlIIIIII[0]] = lIllIIllllll[lIllIlIIIIII[3]];
                if (L.lllIIllIIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIIIII[1];
                    0;
                    if (3 >= 3) return n2 != 0;
                    return ((162 + 107 - 121 + 54 ^ 30 + 19 - -75 + 29) & (0x59 ^ 0x4B ^ (0x11 ^ 0x50) ^ -1)) != 0;
                }
            }
            n2 = lIllIlIIIIII[0];
            return n2 != 0;
        });
        if (L.lllIIllIlIIIII(var7)) {
            return lIllIlIIIIII[0];
        }
        Player var3 = Players.getLocal();
        if (L.lllIIllIlIIIII(var3)) {
            return lIllIlIIIIII[0];
        }
        if (L.lllIIllIIlllll(b.b(var7).contains((Locatable)var3) ? 1 : 0)) {
            return lIllIlIIIIII[0];
        }
        String[] stringArray = new String[lIllIlIIIIII[1]];
        stringArray[L.lIllIlIIIIII[0]] = lIllIIllllll[lIllIlIIIIII[0]];
        Item var6 = Inventory.getFirst((String[])stringArray);
        if (L.lllIIllIlIIIIl(var6) && L.lllIIllIlIIIlI(var6.getQuantity(), lIllIlIIIIII[2])) {
            return lIllIlIIIIII[0];
        }
        if (!L.lllIIllIlIIIll(b.d(var7).contains((Locatable)var3) ? 1 : 0) || L.lllIIllIIlllll(b.g(var7).equals((Object)var3.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)b.e(var7));
            return lIllIlIIIIII[1];
        }
        Movement.setDestination((WorldPoint)b.g((TileObject)var1_1));
        return lIllIlIIIIII[1];
    }

    private static boolean lllIIllIlIIIII(Object object) {
        return object == null;
    }

    private static void lllIIllIIllllI() {
        lIllIlIIIIII = new int[6];
        L.lIllIlIIIIII[0] = 1 & (1 ^ -1);
        L.lIllIlIIIIII[1] = 1;
        L.lIllIlIIIIII[2] = 0x6F ^ 0x63;
        L.lIllIlIIIIII[3] = 2;
        L.lIllIlIIIIII[4] = 3;
        L.lIllIlIIIIII[5] = 135 + 66 - 170 + 146 ^ 2 + 81 - 69 + 171;
    }

    private static void lllIIllIIlllIl() {
        lIllIIllllll = new String[lIllIlIIIIII[4]];
        L.lIllIIllllll[L.lIllIlIIIIII[0]] = L."Arder powder";
        L.lIllIIllllll[L.lIllIlIIIIII[1]] = L."Gate";
        L.lIllIIllllll[L.lIllIlIIIIII[3]] = L."Quick-escape";
    }

    private static boolean lllIIllIlIIIIl(Object object) {
        return object != null;
    }

    private static String lllIIllIIllIll(String var1, String var15) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIllIlIIIIII[5]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIllIlIIIIII[3], var4);
            return new String(var8.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllIIlllll(int n2) {
        return n2 != 0;
    }

    private static String lllIIllIIlllII(String var9, String var13) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIllIlIIIIII[3], var12);
            return new String(var16.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }
}

