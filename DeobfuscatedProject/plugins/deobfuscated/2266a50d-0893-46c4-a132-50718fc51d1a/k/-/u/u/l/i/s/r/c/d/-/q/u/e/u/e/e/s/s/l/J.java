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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.b;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Deposit Arder Mushroom", priority=91, blocking=true)
public class J
extends Task {
    final /* synthetic */ SquireDukeSucellus br;
    private static /* synthetic */ int[] lIllIlIlIlIl;
    final /* synthetic */ a bs;
    private static /* synthetic */ String[] lIllIlIlIlII;

    private static boolean lllIIlllllIlIl(Object object) {
        return object == null;
    }

    private static boolean lllIIllllllIII(Object object) {
        return object != null;
    }

    private static String lllIIlllllIIII(String lllllllllllllllIlIllllIllIlllIII, String lllllllllllllllIlIllllIllIllIlll) {
        lllllllllllllllIlIllllIllIlllIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllIllIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllllIllIlllIll = new StringBuilder();
        char[] lllllllllllllllIlIllllIllIlllIlI = lllllllllllllllIlIllllIllIllIlll.toCharArray();
        int lllllllllllllllIlIllllIllIlllIIl = lIllIlIlIlIl[0];
        char[] lllllllllllllllIlIllllIllIllIIll = lllllllllllllllIlIllllIllIlllIII.toCharArray();
        int lllllllllllllllIlIllllIllIllIIlI = lllllllllllllllIlIllllIllIllIIll.length;
        int lllllllllllllllIlIllllIllIllIIIl = lIllIlIlIlIl[0];
        while (J.lllIIllllllIIl(lllllllllllllllIlIllllIllIllIIIl, lllllllllllllllIlIllllIllIllIIlI)) {
            char lllllllllllllllIlIllllIllIlllllI = lllllllllllllllIlIllllIllIllIIll[lllllllllllllllIlIllllIllIllIIIl];
            lllllllllllllllIlIllllIllIlllIll.append((char)(lllllllllllllllIlIllllIllIlllllI ^ lllllllllllllllIlIllllIllIlllIlI[lllllllllllllllIlIllllIllIlllIIl % lllllllllllllllIlIllllIllIlllIlI.length]));
            0;
            ++lllllllllllllllIlIllllIllIlllIIl;
            ++lllllllllllllllIlIllllIllIllIIIl;
            0;
            if (((0xA1 ^ 0x85) & ~(0xB0 ^ 0x94)) <= ((0x2B ^ 0x4B) & ~(0x51 ^ 0x31))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllllIllIlllIll);
    }

    @Inject
    public J(SquireDukeSucellus squireDukeSucellus) {
        this.br = squireDukeSucellus;
        this.bs = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean a(int n2, TileObject tileObject, TileObject tileObject2) {
        boolean bl;
        void lllllllllllllllIlIllllIlllIllIII;
        void lllllllllllllllIlIllllIlllIlIlll;
        int lllllllllllllllIlIllllIlllIllIIl;
        String[] stringArray = new String[lIllIlIlIlIl[2]];
        stringArray[J.lIllIlIlIlIl[0]] = lIllIlIlIlII[lIllIlIlIlIl[1]];
        if (!J.lllIIllllllIlI(tileObject2.hasAction(stringArray) ? 1 : 0) || J.lllIIlllllIlll(tileObject2.getName().equals(lIllIlIlIlII[lIllIlIlIlIl[4]]) ? 1 : 0)) {
            return lIllIlIlIlIl[0];
        }
        if (J.lllIIllllllIll(lllllllllllllllIlIllllIlllIllIIl, lIllIlIlIlIl[2])) {
            boolean bl2;
            if (J.lllIIlllllllII(lllllllllllllllIlIllllIlllIlIlll.getWorldX(), lllllllllllllllIlIllllIlllIllIII.getWorldX())) {
                bl2 = lIllIlIlIlIl[2];
                0;
                if (-1 > 1) {
                    return ((0xC6 ^ 0xC0 ^ (0x26 ^ 0x3C)) & (0x7A ^ 0xE ^ (0xF2 ^ 0x9A) ^ -1)) != 0;
                }
            } else {
                bl2 = lIllIlIlIlIl[0];
            }
            return bl2;
        }
        if (J.lllIIllllllIIl(lllllllllllllllIlIllllIlllIlIlll.getWorldX(), lllllllllllllllIlIllllIlllIllIII.getWorldX())) {
            bl = lIllIlIlIlIl[2];
            0;
            if (3 == 0) {
                return ((0x1E ^ 0xF) & ~(0x26 ^ 0x37)) != 0;
            }
        } else {
            bl = lIllIlIlIlIl[0];
        }
        return bl;
    }

    private static boolean lllIIllllllIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        J.lllIIlllllIlII();
        J.lllIIlllllIIll();
    }

    private static boolean lllIIlllllIlll(int n2) {
        return n2 == 0;
    }

    private static void lllIIlllllIlII() {
        lIllIlIlIlIl = new int[8];
        J.lIllIlIlIlIl[0] = (52 + 36 - 56 + 98 ^ 90 + 5 - -11 + 53) & (87 + 18 - -27 + 34 ^ 17 + 44 - -35 + 91 ^ -1);
        J.lIllIlIlIlIl[1] = 2;
        J.lIllIlIlIlIl[2] = 1;
        J.lIllIlIlIlIl[3] = 0x72 ^ 0x74;
        J.lIllIlIlIlIl[4] = 3;
        J.lIllIlIlIlIl[5] = 0x4F ^ 0x4B;
        J.lIllIlIlIlIl[6] = 0xB0 ^ 0xB5;
        J.lIllIlIlIlIl[7] = 117 + 128 - 92 + 14 ^ 21 + 108 - -43 + 3;
    }

    private static boolean lllIIlllllllII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllIIlllllIIlI(String lllllllllllllllIlIllllIllIlIIllI, String lllllllllllllllIlIllllIllIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIllIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIllIlIlIlIl[7]), "DES");
            Cipher lllllllllllllllIlIllllIllIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIllllIllIlIlIlI.init(lIllIlIlIlIl[1], lllllllllllllllIlIllllIllIlIlIll);
            return new String(lllllllllllllllIlIllllIllIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllIllIlIlIIl) {
            lllllllllllllllIlIllllIllIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIllllllIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void lllllllllllllllIlIllllIllllIIIIl;
        J lllllllllllllllIlIllllIllllIIIlI;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (J.lllIIllllllIlI(tileObject.getName().equals(lIllIlIlIlII[lIllIlIlIlIl[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIlIlIl[2]];
                stringArray[J.lIllIlIlIlIl[0]] = lIllIlIlIlII[lIllIlIlIlIl[6]];
                if (J.lllIIllllllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIlIlIl[2];
                    0;
                    if (1 >= 0) return n2 != 0;
                    return ((0x78 ^ 0x69) & ~(0x41 ^ 0x50)) != 0;
                }
            }
            n2 = lIllIlIlIlIl[0];
            return n2 != 0;
        });
        if (J.lllIIlllllIlIl(tileObject2)) {
            return lIllIlIlIlIl[0];
        }
        Player lllllllllllllllIlIllllIllllIIIII = Players.getLocal();
        if (J.lllIIlllllIlIl(lllllllllllllllIlIllllIllllIIIII)) {
            return lIllIlIlIlIl[0];
        }
        int lllllllllllllllIlIllllIlllIlllll = lllllllllllllllIlIllllIllllIIIlI.bs.v();
        if (J.lllIIlllllIllI(lllllllllllllllIlIllllIlllIlllll, lIllIlIlIlIl[1])) {
            return lIllIlIlIlIl[0];
        }
        if (J.lllIIlllllIlll(b.i((TileObject)lllllllllllllllIlIllllIllllIIIIl).contains((Locatable)lllllllllllllllIlIllllIllllIIIII) ? 1 : 0)) {
            return lIllIlIlIlIl[0];
        }
        String[] stringArray = new String[lIllIlIlIlIl[2]];
        stringArray[J.lIllIlIlIlIl[0]] = lIllIlIlIlII[lIllIlIlIlIl[0]];
        Item lllllllllllllllIlIllllIlllIllllI = Inventory.getFirst((String[])stringArray);
        if (!J.lllIIllllllIII(lllllllllllllllIlIllllIlllIllllI) || J.lllIIllllllIIl(lllllllllllllllIlIllllIlllIllllI.getQuantity(), lIllIlIlIlIl[3])) {
            return lIllIlIlIlIl[0];
        }
        TileObject lllllllllllllllIlIllllIlllIlllIl = TileObjects.getNearest(arg_0 -> J.a(lllllllllllllllIlIllllIlllIlllll, (TileObject)lllllllllllllllIlIllllIllllIIIIl, arg_0));
        if (J.lllIIlllllIlIl(lllllllllllllllIlIllllIlllIlllIl)) {
            return lIllIlIlIlIl[0];
        }
        var5_5.interact(lIllIlIlIlII[lIllIlIlIlIl[2]]);
        return lIllIlIlIlIl[2];
    }

    private static void lllIIlllllIIll() {
        lIllIlIlIlII = new String[lIllIlIlIlIl[3]];
        J.lIllIlIlIlII[J.lIllIlIlIlIl[0]] = J."Arder powder";
        J.lIllIlIlIlII[J.lIllIlIlIlIl[2]] = J."Fill";
        J.lIllIlIlIlII[J.lIllIlIlIlIl[1]] = J."Fill";
        J.lIllIlIlIlII[J.lIllIlIlIlIl[4]] = J."Fermentation Vat";
        J.lIllIlIlIlII[J.lIllIlIlIlIl[5]] = J."Gate";
        J.lIllIlIlIlII[J.lIllIlIlIlIl[6]] = J."Quick-escape";
    }

    private static String lllIIlllllIIIl(String lllllllllllllllIlIllllIlllIIllIl, String lllllllllllllllIlIllllIlllIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIlllIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllIlllIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllIlllIIllll.init(lIllIlIlIlIl[1], lllllllllllllllIlIllllIlllIlIIII);
            return new String(lllllllllllllllIlIllllIlllIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIlllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllIlllIIlllI) {
            lllllllllllllllIlIllllIlllIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllllIllI(int n2, int n3) {
        return n2 >= n3;
    }
}

