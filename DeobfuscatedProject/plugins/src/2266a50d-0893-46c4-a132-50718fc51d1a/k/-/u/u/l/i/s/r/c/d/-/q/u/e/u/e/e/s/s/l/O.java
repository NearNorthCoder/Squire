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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Exit Musca Area", priority=97, blocking=true)
public class O
extends Task {
    private static /* synthetic */ int[] lIllIlIIllII;
    final /* synthetic */ a bC;
    final /* synthetic */ SquireDukeSucellus bB;
    private static /* synthetic */ String[] lIllIlIIlIll;

    static {
        O.lllIIlllIIllll();
        O.lllIIlllIIlllI();
    }

    private static void lllIIlllIIllll() {
        lIllIlIIllII = new int[6];
        O.lIllIlIIllII[0] = (77 + 102 - 92 + 63 ^ 15 + 144 - 90 + 107) & (0xFD ^ 0xBE ^ (0x5B ^ 0x3E) ^ -" ".length());
        O.lIllIlIIllII[1] = " ".length();
        O.lIllIlIIllII[2] = 0xBF ^ 0xB3;
        O.lIllIlIIllII[3] = "  ".length();
        O.lIllIlIIllII[4] = "   ".length();
        O.lIllIlIIllII[5] = 180 + 1 - 131 + 136 ^ 51 + 148 - 165 + 144;
    }

    private static String lllIIlllIIllIl(String lllllllllllllllIlIlllllIlIlIlIlI, String lllllllllllllllIlIlllllIlIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIlIlIIlll.getBytes(StandardCharsets.UTF_8)), lIllIlIIllII[5]), "DES");
            Cipher lllllllllllllllIlIlllllIlIlIllII = Cipher.getInstance("DES");
            lllllllllllllllIlIlllllIlIlIllII.init(lIllIlIIllII[3], lllllllllllllllIlIlllllIlIlIllIl);
            return new String(lllllllllllllllIlIlllllIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllllIlIlIlIll) {
            lllllllllllllllIlIlllllIlIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllIlIlII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (O.lllIIlllIlIIII(this.bC.w())) {
            return lIllIlIIllII[0];
        }
        TileObject lllllllllllllllIlIlllllIllIIlllI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (O.lllIIlllIlIIII(tileObject.getName().equals(lIllIlIIlIll[lIllIlIIllII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIllII[1]];
                stringArray[O.lIllIlIIllII[0]] = lIllIlIIlIll[lIllIlIIllII[3]];
                if (O.lllIIlllIlIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIllII[1];
                    "".length();
                    if (((34 + 145 - 58 + 31 ^ 126 + 90 - 99 + 21) & (0x95 ^ 0xB4 ^ (0x82 ^ 0xB1) ^ -" ".length())) < (0xD0 ^ 0x92 ^ (0x41 ^ 7))) return n2 != 0;
                    return ((0x2E ^ 0x1E ^ (0x52 ^ 0x39)) & (0x2A ^ 0x62 ^ (0x2B ^ 0x38) ^ -" ".length())) != 0;
                }
            }
            n2 = lIllIlIIllII[0];
            return n2 != 0;
        });
        if (O.lllIIlllIlIIIl(lllllllllllllllIlIlllllIllIIlllI)) {
            return lIllIlIIllII[0];
        }
        Player lllllllllllllllIlIlllllIllIIllIl = Players.getLocal();
        if (O.lllIIlllIlIIIl(lllllllllllllllIlIlllllIllIIllIl)) {
            return lIllIlIIllII[0];
        }
        if (O.lllIIlllIlIIII(h.i(lllllllllllllllIlIlllllIllIIlllI).contains((Locatable)lllllllllllllllIlIlllllIllIIllIl) ? 1 : 0)) {
            return lIllIlIIllII[0];
        }
        String[] stringArray = new String[lIllIlIIllII[1]];
        stringArray[O.lIllIlIIllII[0]] = lIllIlIIlIll[lIllIlIIllII[0]];
        Item lllllllllllllllIlIlllllIllIIllII = Inventory.getFirst((String[])stringArray);
        if (!O.lllIIlllIlIIlI(lllllllllllllllIlIlllllIllIIllII) || O.lllIIlllIlIIll(lllllllllllllllIlIlllllIllIIllII.getQuantity(), lIllIlIIllII[2])) {
            return lIllIlIIllII[0];
        }
        if (O.lllIIlllIlIIII(h.t(lllllllllllllllIlIlllllIllIIlllI).contains((Locatable)lllllllllllllllIlIlllllIllIIllIl) ? 1 : 0) && O.lllIIlllIlIlII(h.f(lllllllllllllllIlIlllllIllIIlllI).equals((Object)lllllllllllllllIlIlllllIllIIllIl.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)h.f(lllllllllllllllIlIlllllIllIIlllI));
            return lIllIlIIllII[1];
        }
        Movement.setDestination((WorldPoint)h.j((TileObject)var1_1));
        return lIllIlIIllII[1];
    }

    private static boolean lllIIlllIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlllIlIIlI(Object object) {
        return object != null;
    }

    private static String lllIIlllIIllII(String lllllllllllllllIlIlllllIlIlllIlI, String lllllllllllllllIlIlllllIlIlllllI) {
        lllllllllllllllIlIlllllIlIlllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllllIlIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllllIlIllllIl = new StringBuilder();
        char[] lllllllllllllllIlIlllllIlIllllII = lllllllllllllllIlIlllllIlIlllllI.toCharArray();
        int lllllllllllllllIlIlllllIlIlllIll = lIllIlIIllII[0];
        char[] lllllllllllllllIlIlllllIlIllIlIl = lllllllllllllllIlIlllllIlIlllIlI.toCharArray();
        int lllllllllllllllIlIlllllIlIllIlII = lllllllllllllllIlIlllllIlIllIlIl.length;
        int lllllllllllllllIlIlllllIlIllIIll = lIllIlIIllII[0];
        while (O.lllIIlllIlIIll(lllllllllllllllIlIlllllIlIllIIll, lllllllllllllllIlIlllllIlIllIlII)) {
            char lllllllllllllllIlIlllllIllIIIIII = lllllllllllllllIlIlllllIlIllIlIl[lllllllllllllllIlIlllllIlIllIIll];
            lllllllllllllllIlIlllllIlIllllIl.append((char)(lllllllllllllllIlIlllllIllIIIIII ^ lllllllllllllllIlIlllllIlIllllII[lllllllllllllllIlIlllllIlIlllIll % lllllllllllllllIlIlllllIlIllllII.length]));
            "".length();
            ++lllllllllllllllIlIlllllIlIlllIll;
            ++lllllllllllllllIlIlllllIlIllIIll;
            "".length();
            if ("  ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllllIlIllllIl);
    }

    private static boolean lllIIlllIlIIIl(Object object) {
        return object == null;
    }

    private static String lllIIlllIIlIll(String lllllllllllllllIlIlllllIlIIllIll, String lllllllllllllllIlIlllllIlIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIlIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIlIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllllIlIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllllIlIIlllll.init(lIllIlIIllII[3], lllllllllllllllIlIlllllIlIlIIIII);
            return new String(lllllllllllllllIlIlllllIlIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllllIlIIllllI) {
            lllllllllllllllIlIlllllIlIIllllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public O(SquireDukeSucellus squireDukeSucellus) {
        this.bB = squireDukeSucellus;
        this.bC = squireDukeSucellus.s();
    }

    private static boolean lllIIlllIlIIII(int n2) {
        return n2 != 0;
    }

    private static void lllIIlllIIlllI() {
        lIllIlIIlIll = new String[lIllIlIIllII[4]];
        O.lIllIlIIlIll[O.lIllIlIIllII[0]] = O.lllIIlllIIlIll("JcZ4PRYfRaGAVmXKoDMKGw==", "NvVai");
        O.lIllIlIIlIll[O.lIllIlIIllII[1]] = O.lllIIlllIIllII("AjsRCw==", "EZenI");
        O.lIllIlIIlIll[O.lIllIlIIllII[3]] = O.lllIIlllIIllIl("d00POq84vZje8VmY/RYJ6g==", "nxfKc");
    }
}

