/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
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
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Collect Salax Salt", priority=80, blocking=true)
public class Q
extends Task {
    private final /* synthetic */ a bG;
    private final /* synthetic */ SquireDukeSucellus bF;
    private static /* synthetic */ int[] lIllIIlllIlI;
    private static /* synthetic */ String[] lIllIIlllIIl;

    static {
        Q.lllIIllIIIlIIl();
        Q.lllIIllIIIlIII();
    }

    private static String lllIIllIIIIlll(String lllllllllllllllIllIIIIIIllIIIlll, String lllllllllllllllIllIIIIIIllIIlIll) {
        lllllllllllllllIllIIIIIIllIIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIIIIllIIlIlI = new StringBuilder();
        char[] lllllllllllllllIllIIIIIIllIIlIIl = lllllllllllllllIllIIIIIIllIIlIll.toCharArray();
        int lllllllllllllllIllIIIIIIllIIlIII = lIllIIlllIlI[0];
        char[] lllllllllllllllIllIIIIIIllIIIIlI = lllllllllllllllIllIIIIIIllIIIlll.toCharArray();
        int lllllllllllllllIllIIIIIIllIIIIIl = lllllllllllllllIllIIIIIIllIIIIlI.length;
        int lllllllllllllllIllIIIIIIllIIIIII = lIllIIlllIlI[0];
        while (Q.lllIIllIIlIIII(lllllllllllllllIllIIIIIIllIIIIII, lllllllllllllllIllIIIIIIllIIIIIl)) {
            char lllllllllllllllIllIIIIIIllIIllIl = lllllllllllllllIllIIIIIIllIIIIlI[lllllllllllllllIllIIIIIIllIIIIII];
            lllllllllllllllIllIIIIIIllIIlIlI.append((char)(lllllllllllllllIllIIIIIIllIIllIl ^ lllllllllllllllIllIIIIIIllIIlIIl[lllllllllllllllIllIIIIIIllIIlIII % lllllllllllllllIllIIIIIIllIIlIIl.length]));
            "".length();
            ++lllllllllllllllIllIIIIIIllIIlIII;
            ++lllllllllllllllIllIIIIIIllIIIIII;
            "".length();
            if ("  ".length() > ((0xAB ^ 0x87) & ~(0x49 ^ 0x65))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIIIIllIIlIlI);
    }

    private static String lllIIllIIIIllI(String lllllllllllllllIllIIIIIIllIllIlI, String lllllllllllllllIllIIIIIIllIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIIllIllIIl.getBytes(StandardCharsets.UTF_8)), lIllIIlllIlI[8]), "DES");
            Cipher lllllllllllllllIllIIIIIIllIllllI = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIIIllIllllI.init(lIllIIlllIlI[3], lllllllllllllllIllIIIIIIllIlllll);
            return new String(lllllllllllllllIllIIIIIIllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIIIIllIlllIl) {
            lllllllllllllllIllIIIIIIllIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIIllIIIlIII() {
        lIllIIlllIIl = new String[lIllIIlllIlI[7]];
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[0]] = Q.lllIIllIIIIllI("YrfywlJ0avDRCFgwm6E07A==", "IbuMC");
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[1]] = Q.lllIIllIIIIlll("MDU5JEonMSU/GQog", "cTUPj");
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[3]] = Q.lllIIllIIIIllI("lmrofGK4kTA=", "bnvzP");
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[5]] = Q.lllIIllIIIIlll("MiYnPQ==", "uGSXM");
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[6]] = Q.lllIIllIIIIllI("GGPxUBuGEhDxgPjYmoru+Q==", "zBtvR");
    }

    private static boolean lllIIllIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIllIIIlIll(Object object) {
        return object == null;
    }

    @Inject
    public Q(SquireDukeSucellus squireDukeSucellus) {
        this.bF = squireDukeSucellus;
        this.bG = squireDukeSucellus.s();
    }

    private static boolean lllIIllIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIllIIIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        NPC lllllllllllllllIllIIIIIIlllIlIII;
        if (Q.lllIIllIIIlIlI(this.bG.x())) {
            return lIllIIlllIlI[0];
        }
        TileObject lllllllllllllllIllIIIIIIlllIllII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (Q.lllIIllIIIlIlI(tileObject.getName().equals(lIllIIlllIIl[lIllIIlllIlI[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllIlI[1]];
                stringArray[Q.lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[6]];
                if (Q.lllIIllIIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllIlI[1];
                    "".length();
                    if ((0x99 ^ 0x9D) == (0x6D ^ 0x69)) return n2 != 0;
                    return ("   ".length() & ~"   ".length()) != 0;
                }
            }
            n2 = lIllIIlllIlI[0];
            return n2 != 0;
        });
        if (Q.lllIIllIIIlIll(lllllllllllllllIllIIIIIIlllIllII)) {
            return lIllIIlllIlI[0];
        }
        Player lllllllllllllllIllIIIIIIlllIlIll = Players.getLocal();
        if (Q.lllIIllIIIlIll(lllllllllllllllIllIIIIIIlllIlIll)) {
            return lIllIIlllIlI[0];
        }
        String[] stringArray = new String[lIllIIlllIlI[1]];
        stringArray[Q.lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[0]];
        Item lllllllllllllllIllIIIIIIlllIlIlI = Inventory.getFirst((String[])stringArray);
        if (Q.lllIIllIIIllII(lllllllllllllllIllIIIIIIlllIlIlI) && Q.lllIIllIIIllIl(lllllllllllllllIllIIIIIIlllIlIlI.getQuantity(), lIllIIlllIlI[2])) {
            return lIllIIlllIlI[0];
        }
        String[] stringArray2 = new String[lIllIIlllIlI[1]];
        stringArray2[Q.lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[1]];
        TileObject lllllllllllllllIllIIIIIIlllIlIIl = TileObjects.getNearest((String[])stringArray2);
        if (Q.lllIIllIIIlIll(lllllllllllllllIllIIIIIIlllIlIIl)) {
            return lIllIIlllIlI[0];
        }
        if (Q.lllIIllIIIlIlI(e.i(lllllllllllllllIllIIIIIIlllIllII).contains((Locatable)lllllllllllllllIllIIIIIIlllIlIll) ? 1 : 0) && Q.lllIIllIIIllII(lllllllllllllllIllIIIIIIlllIlIII = NPCs.getNearest(nPC -> {
            int n2;
            if (Q.lllIIllIIIlllI(nPC.getId(), e.I) && Q.lllIIllIIIllll(nPC.getGraphic(), lIllIIlllIlI[4])) {
                n2 = lIllIIlllIlI[1];
                "".length();
                if (-(5 ^ 1) >= 0) {
                    return ((0xB9 ^ 0x93) & ~(0x47 ^ 0x6D)) != 0;
                }
            } else {
                n2 = lIllIIlllIlI[0];
            }
            return n2 != 0;
        }))) {
            return lIllIIlllIlI[1];
        }
        var4_4.interact(lIllIIlllIIl[lIllIIlllIlI[3]]);
        return lIllIIlllIlI[1];
    }

    private static boolean lllIIllIIIllII(Object object) {
        return object != null;
    }

    private static boolean lllIIllIIIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lllIIllIIIlIIl() {
        lIllIIlllIlI = new int[9];
        Q.lIllIIlllIlI[0] = (0x2F ^ 0x5B ^ (0x6E ^ 0x47)) & (127 + 173 - 248 + 203 ^ 87 + 121 - 129 + 83 ^ -" ".length());
        Q.lIllIIlllIlI[1] = " ".length();
        Q.lIllIIlllIlI[2] = 0x7E ^ 0x72;
        Q.lIllIIlllIlI[3] = "  ".length();
        Q.lIllIIlllIlI[4] = -" ".length();
        Q.lIllIIlllIlI[5] = "   ".length();
        Q.lIllIIlllIlI[6] = 0xBF ^ 0xBB;
        Q.lIllIIlllIlI[7] = 0x5E ^ 0x5B;
        Q.lIllIIlllIlI[8] = 89 + 110 - 171 + 106 ^ 70 + 67 - 30 + 35;
    }
}

