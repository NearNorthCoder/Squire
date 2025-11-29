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

    private static String lllIIllIIllIlI(String lllllllllllllllIllIIIIIIIlIIlllI, String lllllllllllllllIllIIIIIIIlIIllIl) {
        lllllllllllllllIllIIIIIIIlIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIIIIIlIIllII = new StringBuilder();
        char[] lllllllllllllllIllIIIIIIIlIIlIll = lllllllllllllllIllIIIIIIIlIIllIl.toCharArray();
        int lllllllllllllllIllIIIIIIIlIIlIlI = lIllIlIIIIII[0];
        char[] lllllllllllllllIllIIIIIIIlIIIlII = lllllllllllllllIllIIIIIIIlIIlllI.toCharArray();
        int lllllllllllllllIllIIIIIIIlIIIIll = lllllllllllllllIllIIIIIIIlIIIlII.length;
        int lllllllllllllllIllIIIIIIIlIIIIlI = lIllIlIIIIII[0];
        while (L.lllIIllIlIIlII(lllllllllllllllIllIIIIIIIlIIIIlI, lllllllllllllllIllIIIIIIIlIIIIll)) {
            char lllllllllllllllIllIIIIIIIlIIllll = lllllllllllllllIllIIIIIIIlIIIlII[lllllllllllllllIllIIIIIIIlIIIIlI];
            lllllllllllllllIllIIIIIIIlIIllII.append((char)(lllllllllllllllIllIIIIIIIlIIllll ^ lllllllllllllllIllIIIIIIIlIIlIll[lllllllllllllllIllIIIIIIIlIIlIlI % lllllllllllllllIllIIIIIIIlIIlIll.length]));
            "".length();
            ++lllllllllllllllIllIIIIIIIlIIlIlI;
            ++lllllllllllllllIllIIIIIIIlIIIIlI;
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIIIIIlIIllII);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (L.lllIIllIIlllll(this.bw.v())) {
            return lIllIlIIIIII[0];
        }
        TileObject lllllllllllllllIllIIIIIIIllIlIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (L.lllIIllIIlllll(tileObject.getName().equals(lIllIIllllll[lIllIlIIIIII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIIIII[1]];
                stringArray[L.lIllIlIIIIII[0]] = lIllIIllllll[lIllIlIIIIII[3]];
                if (L.lllIIllIIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIIIII[1];
                    "".length();
                    if ("   ".length() >= "   ".length()) return n2 != 0;
                    return ((162 + 107 - 121 + 54 ^ 30 + 19 - -75 + 29) & (0x59 ^ 0x4B ^ (0x11 ^ 0x50) ^ -" ".length())) != 0;
                }
            }
            n2 = lIllIlIIIIII[0];
            return n2 != 0;
        });
        if (L.lllIIllIlIIIII(lllllllllllllllIllIIIIIIIllIlIlI)) {
            return lIllIlIIIIII[0];
        }
        Player lllllllllllllllIllIIIIIIIllIlIIl = Players.getLocal();
        if (L.lllIIllIlIIIII(lllllllllllllllIllIIIIIIIllIlIIl)) {
            return lIllIlIIIIII[0];
        }
        if (L.lllIIllIIlllll(b.b(lllllllllllllllIllIIIIIIIllIlIlI).contains((Locatable)lllllllllllllllIllIIIIIIIllIlIIl) ? 1 : 0)) {
            return lIllIlIIIIII[0];
        }
        String[] stringArray = new String[lIllIlIIIIII[1]];
        stringArray[L.lIllIlIIIIII[0]] = lIllIIllllll[lIllIlIIIIII[0]];
        Item lllllllllllllllIllIIIIIIIllIlIII = Inventory.getFirst((String[])stringArray);
        if (L.lllIIllIlIIIIl(lllllllllllllllIllIIIIIIIllIlIII) && L.lllIIllIlIIIlI(lllllllllllllllIllIIIIIIIllIlIII.getQuantity(), lIllIlIIIIII[2])) {
            return lIllIlIIIIII[0];
        }
        if (!L.lllIIllIlIIIll(b.d(lllllllllllllllIllIIIIIIIllIlIlI).contains((Locatable)lllllllllllllllIllIIIIIIIllIlIIl) ? 1 : 0) || L.lllIIllIIlllll(b.g(lllllllllllllllIllIIIIIIIllIlIlI).equals((Object)lllllllllllllllIllIIIIIIIllIlIIl.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)b.e(lllllllllllllllIllIIIIIIIllIlIlI));
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
        L.lIllIlIIIIII[0] = " ".length() & (" ".length() ^ -" ".length());
        L.lIllIlIIIIII[1] = " ".length();
        L.lIllIlIIIIII[2] = 0x6F ^ 0x63;
        L.lIllIlIIIIII[3] = "  ".length();
        L.lIllIlIIIIII[4] = "   ".length();
        L.lIllIlIIIIII[5] = 135 + 66 - 170 + 146 ^ 2 + 81 - 69 + 171;
    }

    private static void lllIIllIIlllIl() {
        lIllIIllllll = new String[lIllIlIIIIII[4]];
        L.lIllIIllllll[L.lIllIlIIIIII[0]] = L.lllIIllIIllIlI("OSQdFSBYJhYHNh0k", "xVypR");
        L.lIllIIllllll[L.lIllIlIIIIII[1]] = L.lllIIllIIllIll("h9vmx/WsM7Y=", "pUglV");
        L.lIllIIllllll[L.lIllIlIIIIII[3]] = L.lllIIllIIlllII("zpr6kjKKUBUVwFRLd8ErAw==", "FrhCy");
    }

    private static boolean lllIIllIlIIIIl(Object object) {
        return object != null;
    }

    private static String lllIIllIIllIll(String lllllllllllllllIllIIIIIIIIllIlll, String lllllllllllllllIllIIIIIIIIllIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIIIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIIIIllIllI.getBytes(StandardCharsets.UTF_8)), lIllIlIIIIII[5]), "DES");
            Cipher lllllllllllllllIllIIIIIIIIlllIll = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIIIIIlllIll.init(lIllIlIIIIII[3], lllllllllllllllIllIIIIIIIIllllII);
            return new String(lllllllllllllllIllIIIIIIIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIIIIIIlllIlI) {
            lllllllllllllllIllIIIIIIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllIIlllll(int n2) {
        return n2 != 0;
    }

    private static String lllIIllIIlllII(String lllllllllllllllIllIIIIIIIlIlllII, String lllllllllllllllIllIIIIIIIlIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIIIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIIIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIIIIIllIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIIIIIllIIIII.init(lIllIlIIIIII[3], lllllllllllllllIllIIIIIIIllIIIIl);
            return new String(lllllllllllllllIllIIIIIIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIIIIIlIlllll) {
            lllllllllllllllIllIIIIIIIlIlllll.printStackTrace();
            return null;
        }
    }
}

