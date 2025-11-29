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

/* TASK: Exit Arder Area -> ExitarderareaTask */
@TaskDesc(name="Exit Arder Area", priority=87, blocking=true)
public class K
extends Task {
    final /* synthetic */ SquireDukeSucellus bt;
    final /* synthetic */ a bu;
    private static /* synthetic */ String[] lIllIlIllIll;
    private static /* synthetic */ int[] lIllIlIlllII;

    private static boolean lllIlIIIIlllIl(Object object) {
        return object == null;
    }

    private static String lllIlIIIIllIIl(String var12, String var2) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIllIlIlllII[3], var13);
            return new String(var1.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIIIllllI(Object object) {
        return object != null;
    }

    static {
        K.lllIlIIIIllIll();
        K.lllIlIIIIllIlI();
    }

    private static void lllIlIIIIllIlI() {
        lIllIlIllIll = new String[lIllIlIlllII[4]];
        K.lIllIlIllIll[K.lIllIlIlllII[0]] = K."Arder powder";
        K.lIllIlIllIll[K.lIllIlIlllII[1]] = K."Gate";
        K.lIllIlIllIll[K.lIllIlIlllII[3]] = K."Quick-escape";
    }

    @Inject
    public K(SquireDukeSucellus squireDukeSucellus) {
        this.bt = squireDukeSucellus;
        this.bu = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (K.lllIlIIIIlllII(this.bu.v())) {
            return lIllIlIlllII[0];
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (K.lllIlIIIIlllII(tileObject.getName().equals(lIllIlIllIll[lIllIlIlllII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIlllII[1]];
                stringArray[K.lIllIlIlllII[0]] = lIllIlIllIll[lIllIlIlllII[3]];
                if (K.lllIlIIIIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIlllII[1];
                    0;
                    if (1 != (0x42 ^ 0x46)) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlIlllII[0];
            return n2 != 0;
        });
        if (K.lllIlIIIIlllIl(var4)) {
            return lIllIlIlllII[0];
        }
        Player var6 = Players.getLocal();
        if (K.lllIlIIIIlllIl(var6)) {
            return lIllIlIlllII[0];
        }
        if (K.lllIlIIIIlllII(b.i(var4).contains((Locatable)var6) ? 1 : 0)) {
            return lIllIlIlllII[0];
        }
        String[] stringArray = new String[lIllIlIlllII[1]];
        stringArray[K.lIllIlIlllII[0]] = lIllIlIllIll[lIllIlIlllII[0]];
        Item var8 = Inventory.getFirst((String[])stringArray);
        if (!K.lllIlIIIIllllI(var8) || K.lllIlIIIIlllll(var8.getQuantity(), lIllIlIlllII[2])) {
            return lIllIlIlllII[0];
        }
        if (K.lllIlIIIIlllII(b.b(var4).contains((Locatable)var6) ? 1 : 0) && K.lllIlIIIlIIIII(b.f(var4).equals((Object)var6.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)b.f(var4));
            return lIllIlIlllII[1];
        }
        Movement.setDestination((WorldPoint)b.j((TileObject)var1_1));
        return lIllIlIlllII[1];
    }

    private static boolean lllIlIIIIlllII(int n2) {
        return n2 != 0;
    }

    private static String lllIlIIIIllIII(String var5, String var10) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIllIlIlllII[5]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIllIlIlllII[3], var3);
            return new String(var11.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIIlIIIII(int n2) {
        return n2 == 0;
    }

    private static void lllIlIIIIllIll() {
        lIllIlIlllII = new int[6];
        K.lIllIlIlllII[0] = (14 + 128 - 96 + 128 ^ 141 + 106 - 204 + 101) & (8 + 84 - 64 + 107 ^ 72 + 117 - 99 + 95 ^ -1);
        K.lIllIlIlllII[1] = 1;
        K.lIllIlIlllII[2] = 0x13 ^ 0x4F ^ (0x15 ^ 0x45);
        K.lIllIlIlllII[3] = 2;
        K.lIllIlIlllII[4] = 3;
        K.lIllIlIlllII[5] = 0xA3 ^ 0xAB;
    }
}

