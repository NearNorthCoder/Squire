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

    private static String lllIlIIIIllIIl(String lllllllllllllllIlIllllIIlIIIIIlI, String lllllllllllllllIlIllllIIIlllllll) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIlIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllIIlIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllIIlIIIIlII.init(lIllIlIlllII[3], lllllllllllllllIlIllllIIlIIIIlIl);
            return new String(lllllllllllllllIlIllllIIlIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllIIlIIIIIll) {
            lllllllllllllllIlIllllIIlIIIIIll.printStackTrace();
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
        K.lIllIlIllIll[K.lIllIlIlllII[0]] = K.lllIlIIIIllIII("7Yz6hDcmksLCm9YEYpqaKA==", "MMbkQ");
        K.lIllIlIllIll[K.lIllIlIlllII[1]] = K.lllIlIIIIllIII("vLAp81pVrlI=", "lCTdL");
        K.lIllIlIllIll[K.lIllIlIlllII[3]] = K.lllIlIIIIllIIl("Am3uvUMm6ju5vQu3fiaX/A==", "bGcqj");
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
        TileObject lllllllllllllllIlIllllIIlIIllIll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (K.lllIlIIIIlllII(tileObject.getName().equals(lIllIlIllIll[lIllIlIlllII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIlllII[1]];
                stringArray[K.lIllIlIlllII[0]] = lIllIlIllIll[lIllIlIlllII[3]];
                if (K.lllIlIIIIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIlllII[1];
                    "".length();
                    if (" ".length() != (0x42 ^ 0x46)) return n2 != 0;
                    return ((0xA5 ^ 0x94) & ~(0xF6 ^ 0xC7)) != 0;
                }
            }
            n2 = lIllIlIlllII[0];
            return n2 != 0;
        });
        if (K.lllIlIIIIlllIl(lllllllllllllllIlIllllIIlIIllIll)) {
            return lIllIlIlllII[0];
        }
        Player lllllllllllllllIlIllllIIlIIllIlI = Players.getLocal();
        if (K.lllIlIIIIlllIl(lllllllllllllllIlIllllIIlIIllIlI)) {
            return lIllIlIlllII[0];
        }
        if (K.lllIlIIIIlllII(b.i(lllllllllllllllIlIllllIIlIIllIll).contains((Locatable)lllllllllllllllIlIllllIIlIIllIlI) ? 1 : 0)) {
            return lIllIlIlllII[0];
        }
        String[] stringArray = new String[lIllIlIlllII[1]];
        stringArray[K.lIllIlIlllII[0]] = lIllIlIllIll[lIllIlIlllII[0]];
        Item lllllllllllllllIlIllllIIlIIllIIl = Inventory.getFirst((String[])stringArray);
        if (!K.lllIlIIIIllllI(lllllllllllllllIlIllllIIlIIllIIl) || K.lllIlIIIIlllll(lllllllllllllllIlIllllIIlIIllIIl.getQuantity(), lIllIlIlllII[2])) {
            return lIllIlIlllII[0];
        }
        if (K.lllIlIIIIlllII(b.b(lllllllllllllllIlIllllIIlIIllIll).contains((Locatable)lllllllllllllllIlIllllIIlIIllIlI) ? 1 : 0) && K.lllIlIIIlIIIII(b.f(lllllllllllllllIlIllllIIlIIllIll).equals((Object)lllllllllllllllIlIllllIIlIIllIlI.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)b.f(lllllllllllllllIlIllllIIlIIllIll));
            return lIllIlIlllII[1];
        }
        Movement.setDestination((WorldPoint)b.j((TileObject)var1_1));
        return lIllIlIlllII[1];
    }

    private static boolean lllIlIIIIlllII(int n2) {
        return n2 != 0;
    }

    private static String lllIlIIIIllIII(String lllllllllllllllIlIllllIIlIIIllIl, String lllllllllllllllIlIllllIIlIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIlIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), lIllIlIlllII[5]), "DES");
            Cipher lllllllllllllllIlIllllIIlIIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIllllIIlIIlIIIl.init(lIllIlIlllII[3], lllllllllllllllIlIllllIIlIIlIIlI);
            return new String(lllllllllllllllIlIllllIIlIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllIIlIIlIIII) {
            lllllllllllllllIlIllllIIlIIlIIII.printStackTrace();
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
        K.lIllIlIlllII[0] = (14 + 128 - 96 + 128 ^ 141 + 106 - 204 + 101) & (8 + 84 - 64 + 107 ^ 72 + 117 - 99 + 95 ^ -" ".length());
        K.lIllIlIlllII[1] = " ".length();
        K.lIllIlIlllII[2] = 0x13 ^ 0x4F ^ (0x15 ^ 0x45);
        K.lIllIlIlllII[3] = "  ".length();
        K.lIllIlIlllII[4] = "   ".length();
        K.lIllIlIlllII[5] = 0xA3 ^ 0xAB;
    }
}

