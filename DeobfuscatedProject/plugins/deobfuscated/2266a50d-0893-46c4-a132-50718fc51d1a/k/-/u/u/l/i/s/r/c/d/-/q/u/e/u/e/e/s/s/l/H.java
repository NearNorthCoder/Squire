/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Start Fight", priority=201, blocking=true)
public class H
extends Task {
    private static /* synthetic */ int[] lIllIllllIII;
    final /* synthetic */ a bo;
    private static /* synthetic */ String[] lIllIlllIIIl;
    final /* synthetic */ SquireDukeSucellus bn;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        if (H.lllIlIIlllllll(this.bo.y(), lIllIllllIII[0])) {
            return lIllIllllIII[1];
        }
        Player lllllllllllllllIlIlllIlIIIlllllI = Players.getLocal();
        if (H.lllIlIlIIIIIII(lllllllllllllllIlIlllIlIIIlllllI)) {
            return lIllIllllIII[1];
        }
        String[] stringArray = new String[lIllIllllIII[2]];
        stringArray[H.lIllIllllIII[1]] = lIllIlllIIIl[lIllIllllIII[1]];
        int lllllllllllllllIlIlllIlIIIllllIl = Inventory.getCount((String[])stringArray);
        if (H.lllIlIlIIIIIIl(lllllllllllllllIlIlllIlIIIllllIl, lIllIllllIII[0])) {
            return lIllIllllIII[1];
        }
        TileObject lllllllllllllllIlIlllIlIIIllllII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (H.lllIlIlIIIIIlI(tileObject.getName().equals(lIllIlllIIIl[lIllIllllIII[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllllIII[2]];
                stringArray[H.lIllIllllIII[1]] = lIllIlllIIIl[lIllIllllIII[0]];
                if (H.lllIlIlIIIIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllllIII[2];
                    0;
                    if (1 >= 0) return n2 != 0;
                    return ((0xFA ^ 0x89 ^ (0xDF ^ 0xAA)) & (6 ^ 0x1E ^ (0x53 ^ 0x4D) ^ -1)) != 0;
                }
            }
            n2 = lIllIllllIII[1];
            return n2 != 0;
        });
        if (H.lllIlIlIIIIIII(lllllllllllllllIlIlllIlIIIllllII)) {
            return lIllIllllIII[1];
        }
        if (H.lllIlIlIIIIIlI(e.l(lllllllllllllllIlIlllIlIIIllllII).contains((Locatable)lllllllllllllllIlIlllIlIIIlllllI) ? 1 : 0)) {
            return lIllIllllIII[1];
        }
        NPC lllllllllllllllIlIlllIlIIIlllIll = NPCs.getNearest(nPC -> {
            int n2;
            if (H.lllIlIlIIIIlII(nPC.getId(), e.I) && H.lllIlIlIIIIIIl(nPC.getGraphic(), lIllIllllIII[3])) {
                n2 = lIllIllllIII[2];
                0;
                if (((3 ^ 0x7F ^ (0x33 ^ 0x44)) & (38 + 60 - 89 + 140 ^ 37 + 11 - 43 + 153 ^ -1)) < -1) {
                    return ((0xB8 ^ 0xAD ^ (0x6E ^ 0x30)) & (3 ^ (0x56 ^ 0x1E) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIllllIII[1];
            }
            return n2 != 0;
        });
        if (H.lllIlIlIIIIIll(lllllllllllllllIlIlllIlIIIlllIll)) {
            return lIllIllllIII[2];
        }
        Movement.setDestination((WorldPoint)e.g((TileObject)var3_3));
        return lIllIllllIII[2];
    }

    private static void lllIlIIllIlIll() {
        lIllIlllIIIl = new String[lIllIllllIII[4]];
        H.lIllIlllIIIl[H.lIllIllllIII[1]] = H."Arder-musca poison";
        H.lIllIlllIIIl[H.lIllIllllIII[2]] = H."Gate";
        H.lIllIlllIIIl[H.lIllIllllIII[0]] = H."Quick-escape";
    }

    private static boolean lllIlIlIIIIIII(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIlIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lllIlIIllIlIII(String lllllllllllllllIlIlllIlIIIIIlIlI, String lllllllllllllllIlIlllIlIIIIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIlIIIIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIlIIIIIllII.init(lIllIllllIII[0], lllllllllllllllIlIlllIlIIIIIllIl);
            return new String(lllllllllllllllIlIlllIlIIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIlIIIIIlIll) {
            lllllllllllllllIlIlllIlIIIIIlIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public H(SquireDukeSucellus squireDukeSucellus) {
        this.bn = squireDukeSucellus;
        this.bo = squireDukeSucellus.s();
    }

    private static String lllIlIIllIlIlI(String lllllllllllllllIlIlllIlIIIlIllll, String lllllllllllllllIlIlllIlIIIlIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIIlIlllI.getBytes(StandardCharsets.UTF_8)), lIllIllllIII[5]), "DES");
            Cipher lllllllllllllllIlIlllIlIIIllIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIlIIIllIIIl.init(lIllIllllIII[0], lllllllllllllllIlIlllIlIIIllIIlI);
            return new String(lllllllllllllllIlIlllIlIIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIlIIIllIIII) {
            lllllllllllllllIlIlllIlIIIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIIIIIll(Object object) {
        return object != null;
    }

    static {
        H.lllIlIIllllllI();
        H.lllIlIIllIlIll();
    }

    private static void lllIlIIllllllI() {
        lIllIllllIII = new int[6];
        H.lIllIllllIII[0] = 2;
        H.lIllIllllIII[1] = (0xD3 ^ 0xB3) & ~(0x35 ^ 0x55);
        H.lIllIllllIII[2] = 1;
        H.lIllIllllIII[3] = -1;
        H.lIllIllllIII[4] = 3;
        H.lIllIllllIII[5] = 0x7F ^ 0x22 ^ (0x2C ^ 0x79);
    }

    private static boolean lllIlIlIIIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static String lllIlIIllIlIIl(String lllllllllllllllIlIlllIlIIIIllIlI, String lllllllllllllllIlIlllIlIIIIllIIl) {
        lllllllllllllllIlIlllIlIIIIllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlIIIIlllIl = new StringBuilder();
        char[] lllllllllllllllIlIlllIlIIIIlllII = lllllllllllllllIlIlllIlIIIIllIIl.toCharArray();
        int lllllllllllllllIlIlllIlIIIIllIll = lIllIllllIII[1];
        char[] lllllllllllllllIlIlllIlIIIIlIlIl = lllllllllllllllIlIlllIlIIIIllIlI.toCharArray();
        int lllllllllllllllIlIlllIlIIIIlIlII = lllllllllllllllIlIlllIlIIIIlIlIl.length;
        int lllllllllllllllIlIlllIlIIIIlIIll = lIllIllllIII[1];
        while (H.lllIlIIlllllll(lllllllllllllllIlIlllIlIIIIlIIll, lllllllllllllllIlIlllIlIIIIlIlII)) {
            char lllllllllllllllIlIlllIlIIIlIIIII = lllllllllllllllIlIlllIlIIIIlIlIl[lllllllllllllllIlIlllIlIIIIlIIll];
            lllllllllllllllIlIlllIlIIIIlllIl.append((char)(lllllllllllllllIlIlllIlIIIlIIIII ^ lllllllllllllllIlIlllIlIIIIlllII[lllllllllllllllIlIlllIlIIIIllIll % lllllllllllllllIlIlllIlIIIIlllII.length]));
            0;
            ++lllllllllllllllIlIlllIlIIIIllIll;
            ++lllllllllllllllIlIlllIlIIIIlIIll;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIlIIIIlllIl);
    }

    private static boolean lllIlIlIIIIIlI(int n2) {
        return n2 != 0;
    }
}

