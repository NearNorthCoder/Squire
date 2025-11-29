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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h_Unknown;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Walk To Musca Mushroom -> WalktomuscamushroomTask */
@TaskDesc(name="Walk To Musca Mushroom", priority=99, blocking=true)
public class WalkToMuscaMushroomTask
extends Task {
    private static /* synthetic */ String[] lIllIllIllII;
    final /* synthetic */ SquireDukeSucellus bD;
    final /* synthetic */ a bE;
    private static /* synthetic */ int[] lIllIllIllIl;

    private static void lllIlIIlIlllII() {
        lIllIllIllII = new String[lIllIllIllIl[4]];
        P.lIllIllIllII[P.lIllIllIllIl[0]] = P."Musca powder";
        P.lIllIllIllII[P.lIllIllIllIl[1]] = P."Gate";
        P.lIllIllIllII[P.lIllIllIllIl[3]] = P."Quick-escape";
    }

    private static boolean lllIlIIllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlIIllIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIlIlllll(int n2) {
        return n2 != 0;
    }

    private static String lllIlIIlIllIll(String var3, String var7) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIllIllIllIl[5]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIllIllIllIl[3], var8);
            return new String(var9.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    static {
        P.lllIlIIlIllllI();
        P.lllIlIIlIlllII();
    }

    @Inject
    public P(SquireDukeSucellus squireDukeSucellus) {
        this.bD = squireDukeSucellus;
        this.bE = squireDukeSucellus.s();
    }

    private static boolean lllIlIIllIIIIl(Object object) {
        return object != null;
    }

    private static String lllIlIIlIllIlI(String var6, String var5) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIllIllIllIl[3], var1);
            return new String(var12.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (P.lllIlIIlIlllll(this.bE.w())) {
            return lIllIllIllIl[0];
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (P.lllIlIIlIlllll(tileObject.getName().equals(lIllIllIllII[lIllIllIllIl[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIllIl[1]];
                stringArray[P.lIllIllIllIl[0]] = lIllIllIllII[lIllIllIllIl[3]];
                if (P.lllIlIIlIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIllIl[1];
                    0;
                    if (((193 + 128 - 271 + 168 ^ 61 + 126 - 100 + 51) & (94 + 5 - -72 + 22 ^ 81 + 126 - 77 + 15 ^ -1)) >= ((38 + 44 - -87 + 21 ^ 125 + 18 - 94 + 137) & (95 + 58 - 135 + 114 ^ 119 + 7 - 28 + 30 ^ -1))) return n2 != 0;
                    return (((0x7F ^ 0x32) & ~(0x49 ^ 4) & ~((0x32 ^ 0x6F) & ~(0x2C ^ 0x71)) ^ (0x8F ^ 0xA4)) & (0x26 ^ 0x5D ^ (0x42 ^ 0x12) ^ -1)) != 0;
                }
            }
            n2 = lIllIllIllIl[0];
            return n2 != 0;
        });
        if (P.lllIlIIllIIIII(var4)) {
            return lIllIllIllIl[0];
        }
        Player var2 = Players.getLocal();
        if (P.lllIlIIllIIIII(var2)) {
            return lIllIllIllIl[0];
        }
        if (P.lllIlIIlIlllll(h.t(var4).contains((Locatable)var2) ? 1 : 0)) {
            return lIllIllIllIl[0];
        }
        String[] stringArray = new String[lIllIllIllIl[1]];
        stringArray[P.lIllIllIllIl[0]] = lIllIllIllII[lIllIllIllIl[0]];
        Item var11 = Inventory.getFirst((String[])stringArray);
        if (P.lllIlIIllIIIIl(var11) && P.lllIlIIllIIIlI(var11.getQuantity(), lIllIllIllIl[2])) {
            return lIllIllIllIl[0];
        }
        if (!P.lllIlIIllIIIll(h.d(var4).contains((Locatable)var2) ? 1 : 0) || P.lllIlIIlIlllll(h.g(var4).equals((Object)var2.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)h.e(var4));
            return lIllIllIllIl[1];
        }
        Movement.setDestination((WorldPoint)h.g((TileObject)var1_1));
        return lIllIllIllIl[1];
    }

    private static boolean lllIlIIllIIIII(Object object) {
        return object == null;
    }

    private static void lllIlIIlIllllI() {
        lIllIllIllIl = new int[6];
        P.lIllIllIllIl[0] = (0x27 ^ 0x45) & ~(0x5C ^ 0x3E);
        P.lIllIllIllIl[1] = 1;
        P.lIllIllIllIl[2] = 0xA6 ^ 0xA8 ^ 2;
        P.lIllIllIllIl[3] = 2;
        P.lIllIllIllIl[4] = 3;
        P.lIllIllIllIl[5] = 0xC1 ^ 0x8C ^ (0x7F ^ 0x3A);
    }
}

