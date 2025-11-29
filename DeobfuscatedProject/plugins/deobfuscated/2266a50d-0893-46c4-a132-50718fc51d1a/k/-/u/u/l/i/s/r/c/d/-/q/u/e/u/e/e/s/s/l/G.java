/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Start Fight", priority=201, blocking=true)
public class G
extends Task {
    final /* synthetic */ a bm;
    private static /* synthetic */ String[] lIllIIllIIll;
    private static /* synthetic */ int[] lIllIIllIlII;
    final /* synthetic */ SquireDukeSucellus bl;

    private static void lllIIlIllllllI() {
        lIllIIllIlII = new int[6];
        G.lIllIIllIlII[0] = 2;
        G.lIllIIllIlII[1] = (7 ^ 0x28) & ~(0x96 ^ 0xB9);
        G.lIllIIllIlII[2] = 1;
        G.lIllIIllIlII[3] = 3;
        G.lIllIIllIlII[4] = 55 + 118 - 145 + 116 ^ 68 + 73 - 37 + 44;
        G.lIllIIllIlII[5] = 9 ^ 1;
    }

    private static String lllIIlIlllllII(String lllllllllllllllIllIIIIIlIIIllllI, String lllllllllllllllIllIIIIIlIIIllIII) {
        lllllllllllllllIllIIIIIlIIIllllI = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIIIlIIIlllII = new StringBuilder();
        char[] lllllllllllllllIllIIIIIlIIIllIll = lllllllllllllllIllIIIIIlIIIllIII.toCharArray();
        int lllllllllllllllIllIIIIIlIIIllIlI = lIllIIllIlII[1];
        char[] lllllllllllllllIllIIIIIlIIIlIlII = lllllllllllllllIllIIIIIlIIIllllI.toCharArray();
        int lllllllllllllllIllIIIIIlIIIlIIll = lllllllllllllllIllIIIIIlIIIlIlII.length;
        int lllllllllllllllIllIIIIIlIIIlIIlI = lIllIIllIlII[1];
        while (G.lllIIlIlllllll(lllllllllllllllIllIIIIIlIIIlIIlI, lllllllllllllllIllIIIIIlIIIlIIll)) {
            char lllllllllllllllIllIIIIIlIIIlllll = lllllllllllllllIllIIIIIlIIIlIlII[lllllllllllllllIllIIIIIlIIIlIIlI];
            lllllllllllllllIllIIIIIlIIIlllII.append((char)(lllllllllllllllIllIIIIIlIIIlllll ^ lllllllllllllllIllIIIIIlIIIllIll[lllllllllllllllIllIIIIIlIIIllIlI % lllllllllllllllIllIIIIIlIIIllIll.length]));
            0;
            ++lllllllllllllllIllIIIIIlIIIllIlI;
            ++lllllllllllllllIllIIIIIlIIIlIIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIIIlIIIlllII);
    }

    private static String lllIIlIllllIll(String lllllllllllllllIllIIIIIlIIIIIlll, String lllllllllllllllIllIIIIIlIIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIlIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIllIIllIlII[5]), "DES");
            Cipher lllllllllllllllIllIIIIIlIIIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIIlIIIIlIll.init(lIllIIllIlII[0], lllllllllllllllIllIIIIIlIIIIllII);
            return new String(lllllllllllllllIllIIIIIlIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIIIlIIIIlIlI) {
            lllllllllllllllIllIIIIIlIIIIlIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        void var3_3;
        if (G.lllIIlIlllllll(this.bm.y(), lIllIIllIlII[0])) {
            return lIllIIllIlII[1];
        }
        TileObject lllllllllllllllIllIIIIIlIIlllIll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (G.lllIIllIIIIIlI(tileObject.getName().equals(lIllIIllIIll[lIllIIllIlII[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIllIlII[2]];
                stringArray[G.lIllIIllIlII[1]] = lIllIIllIIll[lIllIIllIlII[3]];
                if (G.lllIIllIIIIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIllIlII[2];
                    0;
                    if (-2 < 0) return n2 != 0;
                    return ((26 + 47 - 65 + 149 ^ 113 + 10 - -1 + 10) & (28 + 127 - 126 + 136 ^ 123 + 68 - 76 + 75 ^ -1)) != 0;
                }
            }
            n2 = lIllIIllIlII[1];
            return n2 != 0;
        });
        if (G.lllIIllIIIIIII(lllllllllllllllIllIIIIIlIIlllIll)) {
            return lIllIIllIlII[1];
        }
        Player lllllllllllllllIllIIIIIlIIlllIlI = Players.getLocal();
        if (G.lllIIllIIIIIII(lllllllllllllllIllIIIIIlIIlllIlI)) {
            return lIllIIllIlII[1];
        }
        if (G.lllIIllIIIIIIl(e.l(lllllllllllllllIllIIIIIlIIlllIll).contains((Locatable)lllllllllllllllIllIIIIIlIIlllIlI) ? 1 : 0)) {
            return lIllIIllIlII[1];
        }
        String[] stringArray = new String[lIllIIllIlII[2]];
        stringArray[G.lIllIIllIlII[1]] = lIllIIllIIll[lIllIIllIlII[1]];
        Item lllllllllllllllIllIIIIIlIIlllIIl = Inventory.getFirst((String[])stringArray);
        if (G.lllIIllIIIIIII(lllllllllllllllIllIIIIIlIIlllIIl)) {
            return lIllIIllIlII[1];
        }
        String[] stringArray2 = new String[lIllIIllIlII[2]];
        stringArray2[G.lIllIIllIlII[1]] = lIllIIllIIll[lIllIIllIlII[2]];
        NPC lllllllllllllllIllIIIIIlIIlllIII = NPCs.getNearest((String[])stringArray2);
        if (G.lllIIllIIIIIII(lllllllllllllllIllIIIIIlIIlllIII)) {
            return lIllIIllIlII[1];
        }
        var3_3.useOn((Actor)var4_4);
        return lIllIIllIlII[2];
    }

    @Inject
    public G(SquireDukeSucellus squireDukeSucellus) {
        this.bl = squireDukeSucellus;
        this.bm = squireDukeSucellus.s();
    }

    private static boolean lllIIllIIIIIII(Object object) {
        return object == null;
    }

    static {
        G.lllIIlIllllllI();
        G.lllIIlIlllllIl();
    }

    private static boolean lllIIlIlllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIllIIIIIlI(int n2) {
        return n2 != 0;
    }

    private static String lllIIlIllllIlI(String lllllllllllllllIllIIIIIlIIlIlllI, String lllllllllllllllIllIIIIIlIIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIlIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIIIlIIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIIIlIIllIIII.init(lIllIIllIlII[0], lllllllllllllllIllIIIIIlIIllIIIl);
            return new String(lllllllllllllllIllIIIIIlIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIIIlIIlIllll) {
            lllllllllllllllIllIIIIIlIIlIllll.printStackTrace();
            return null;
        }
    }

    private static void lllIIlIlllllIl() {
        lIllIIllIIll = new String[lIllIIllIlII[4]];
        G.lIllIIllIIll[G.lIllIIllIlII[1]] = G."Arder-musca poison";
        G.lIllIIllIIll[G.lIllIIllIlII[2]] = G."Duke Sucellus";
        G.lIllIIllIIll[G.lIllIIllIlII[0]] = G."Gate";
        G.lIllIIllIIll[G.lIllIIllIlII[3]] = G."Quick-escape";
    }

    private static boolean lllIIllIIIIIIl(int n2) {
        return n2 == 0;
    }
}

