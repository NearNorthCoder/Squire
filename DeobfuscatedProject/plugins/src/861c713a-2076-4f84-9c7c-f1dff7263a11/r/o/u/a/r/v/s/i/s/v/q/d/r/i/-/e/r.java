/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.q;

@TaskDesc(name="Walking to the bank", priority=2147483597, blocking=true)
public class r
extends q {
    private static /* synthetic */ int[] lIlIlIIlIIlII;
    private static /* synthetic */ String[] lIlIlIIlIIIll;

    private static boolean lIllllIlllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllllIlllIIlIl() {
        lIlIlIIlIIlII = new int[7];
        r.lIlIlIIlIIlII[0] = (6 + 2 - -107 + 74 ^ 11 + 52 - -16 + 73) & (0x8F ^ 0x9C ^ (0x2C ^ 0x1A) ^ -" ".length());
        r.lIlIlIIlIIlII[1] = " ".length();
        r.lIlIlIIlIIlII[2] = "  ".length();
        r.lIlIlIIlIIlII[3] = "   ".length();
        r.lIlIlIIlIIlII[4] = 0x46 ^ 0x42;
        r.lIlIlIIlIIlII[5] = 0xB2 ^ 0xB7;
        r.lIlIlIIlIIlII[6] = 0x88 ^ 0x80;
    }

    private static String lIllllIlllIIIll(String llllllllllllllIllIlIlllllIlllIll, String llllllllllllllIllIlIlllllIllIlIl) {
        llllllllllllllIllIlIlllllIlllIll = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlllllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlllllIlllIIl = new StringBuilder();
        char[] llllllllllllllIllIlIlllllIlllIII = llllllllllllllIllIlIlllllIllIlIl.toCharArray();
        int llllllllllllllIllIlIlllllIllIlll = lIlIlIIlIIlII[0];
        char[] llllllllllllllIllIlIlllllIllIIIl = llllllllllllllIllIlIlllllIlllIll.toCharArray();
        int llllllllllllllIllIlIlllllIllIIII = llllllllllllllIllIlIlllllIllIIIl.length;
        int llllllllllllllIllIlIlllllIlIllll = lIlIlIIlIIlII[0];
        while (r.lIllllIlllIlIlI(llllllllllllllIllIlIlllllIlIllll, llllllllllllllIllIlIlllllIllIIII)) {
            char llllllllllllllIllIlIlllllIllllII = llllllllllllllIllIlIlllllIllIIIl[llllllllllllllIllIlIlllllIlIllll];
            llllllllllllllIllIlIlllllIlllIIl.append((char)(llllllllllllllIllIlIlllllIllllII ^ llllllllllllllIllIlIlllllIlllIII[llllllllllllllIllIlIlllllIllIlll % llllllllllllllIllIlIlllllIlllIII.length]));
            "".length();
            ++llllllllllllllIllIlIlllllIllIlll;
            ++llllllllllllllIllIlIlllllIlIllll;
            "".length();
            if ("   ".length() <= (6 ^ 3 ^ " ".length())) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlllllIlllIIl);
    }

    private static boolean lIllllIlllIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIllllIlllIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIllllIlllIIIIl(String llllllllllllllIllIlIlllllIIlIlll, String llllllllllllllIllIlIlllllIIllIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlllllIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlllllIIllIll.init(lIlIlIIlIIlII[2], llllllllllllllIllIlIlllllIIlllII);
            return new String(llllllllllllllIllIlIlllllIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlllllIIllIlI) {
            llllllllllllllIllIlIlllllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIllllIlllIIlII() {
        lIlIlIIlIIIll = new String[lIlIlIIlIIlII[5]];
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[0]] = r.lIllllIlllIIIIl("VGbZMTlGNO5b0MdPK/VxBQ==", "blAah");
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[1]] = r.lIllllIlllIIIIl("5YS5ctaW7AE=", "dngOA");
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[2]] = r.lIllllIlllIIIlI("cnqfi3x9zII=", "lBEkI");
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[3]] = r.lIllllIlllIIIll("NyM+NxMKKg==", "cFPSa");
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[4]] = r.lIllllIlllIIIll("OBIsGxNEAjYbGRkC", "igExx");
    }

    @Override
    protected boolean l() {
        r llllllllllllllIllIlIllllllIIllIl;
        TileObject tileObject2;
        if (r.lIllllIlllIIllI(this.w.isInInstancedRegion() ? 1 : 0) && r.lIllllIlllIIlll(tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIllllIlllIIllI(tileObject.getName().equals(lIlIlIIlIIIll[lIlIlIIlIIlII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlIIlII[1]];
                stringArray[r.lIlIlIIlIIlII[0]] = lIlIlIIlIIIll[lIlIlIIlIIlII[4]];
                if (r.lIllllIlllIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIlIIlII[1];
                    "".length();
                    if (((6 + 31 - -19 + 75 ^ 131 + 15 - -13 + 1) & (9 + 182 - 137 + 137 ^ 109 + 50 - 70 + 67 ^ -" ".length())) <= "   ".length()) return n2 != 0;
                    return ((0x7C ^ 0x26 ^ (0x60 ^ 0)) & (0x58 ^ 0x15 ^ (0x72 ^ 5) ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIlIIlIIlII[0];
            return n2 != 0;
        }))) {
            tileObject2.interact(lIlIlIIlIIIll[lIlIlIIlIIlII[0]]);
            return lIlIlIIlIIlII[1];
        }
        if (r.lIllllIlllIIllI(llllllllllllllIllIlIllllllIIllIl.t.earlyBank() ? 1 : 0) && r.lIllllIlllIIllI(llllllllllllllIllIlIllllllIIllIl.R() ? 1 : 0)) {
            return lIlIlIIlIIlII[1];
        }
        if (r.lIllllIlllIIllI(llllllllllllllIllIlIllllllIIllIl.P() ? 1 : 0)) {
            return lIlIlIIlIIlII[0];
        }
        Movement.walkTo((WorldPoint)this.t.bank().F());
        "".length();
        return lIlIlIIlIIlII[1];
    }

    private static boolean lIllllIlllIIllI(int n2) {
        return n2 != 0;
    }

    private static String lIllllIlllIIIlI(String llllllllllllllIllIlIlllllIlIIlII, String llllllllllllllIllIlIlllllIlIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllllIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIIlII[6]), "DES");
            Cipher llllllllllllllIllIlIlllllIlIlIII = Cipher.getInstance("DES");
            llllllllllllllIllIlIlllllIlIlIII.init(lIlIlIIlIIlII[2], llllllllllllllIllIlIlllllIlIlIIl);
            return new String(llllllllllllllIllIlIlllllIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlllllIlIIlll) {
            llllllllllllllIllIlIlllllIlIIlll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean R() {
        void var1_1;
        if (r.lIllllIlllIlIII(Combat.getCurrentHealth(), this.t.eatAt())) {
            return lIlIlIIlIIlII[0];
        }
        Item llllllllllllllIllIlIllllllIIlIII = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlIIlIIlII[1]];
            stringArray[r.lIlIlIIlIIlII[0]] = lIlIlIIlIIIll[lIlIlIIlIIlII[2]];
            return item.hasAction(stringArray);
        });
        if (r.lIllllIlllIlIIl(llllllllllllllIllIlIllllllIIlIII)) {
            return lIlIlIIlIIlII[0];
        }
        var1_1.interact(lIlIlIIlIIIll[lIlIlIIlIIlII[1]]);
        return lIlIlIIlIIlII[1];
    }

    private static boolean lIllllIlllIIlll(Object object) {
        return object != null;
    }

    static {
        r.lIllllIlllIIlIl();
        r.lIllllIlllIIlII();
    }
}

