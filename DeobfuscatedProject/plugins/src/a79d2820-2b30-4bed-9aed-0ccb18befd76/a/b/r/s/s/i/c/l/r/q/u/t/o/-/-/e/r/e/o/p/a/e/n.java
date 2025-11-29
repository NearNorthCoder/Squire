/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.widgets.Widgets
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.m;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Teleporting to corp")
public class n
extends m {
    private static /* synthetic */ String[] lIlIllllIIll;
    private static /* synthetic */ int[] lIlIllllIlII;

    static {
        n.lllIIIlIIlIIlI();
        n.lllIIIlIIlIIIl();
    }

    private static boolean lllIIIlIIlIlII(int n2) {
        return n2 != 0;
    }

    private static String lllIIIlIIIllll(String lllllllllllllllIllIIIlllIlIIllll, String lllllllllllllllIllIIIlllIlIIlllI) {
        lllllllllllllllIllIIIlllIlIIllll = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlllIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIlllIlIIllIl = new StringBuilder();
        char[] lllllllllllllllIllIIIlllIlIIllII = lllllllllllllllIllIIIlllIlIIlllI.toCharArray();
        int lllllllllllllllIllIIIlllIlIIlIll = lIlIllllIlII[0];
        char[] lllllllllllllllIllIIIlllIlIIIlIl = lllllllllllllllIllIIIlllIlIIllll.toCharArray();
        int lllllllllllllllIllIIIlllIlIIIlII = lllllllllllllllIllIIIlllIlIIIlIl.length;
        int lllllllllllllllIllIIIlllIlIIIIll = lIlIllllIlII[0];
        while (n.lllIIIlIIlIllI(lllllllllllllllIllIIIlllIlIIIIll, lllllllllllllllIllIIIlllIlIIIlII)) {
            char lllllllllllllllIllIIIlllIlIlIIII = lllllllllllllllIllIIIlllIlIIIlIl[lllllllllllllllIllIIIlllIlIIIIll];
            lllllllllllllllIllIIIlllIlIIllIl.append((char)(lllllllllllllllIllIIIlllIlIlIIII ^ lllllllllllllllIllIIIlllIlIIllII[lllllllllllllllIllIIIlllIlIIlIll % lllllllllllllllIllIIIlllIlIIllII.length]));
            "".length();
            ++lllllllllllllllIllIIIlllIlIIlIll;
            ++lllllllllllllllIllIIIlllIlIIIIll;
            "".length();
            if (-(0xF ^ 0xA) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIlllIlIIllIl);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        n lllllllllllllllIllIIIlllIlIllIll;
        if (n.lllIIIlIIlIIll(this.l() ? 1 : 0)) {
            return lIlIllllIlII[0];
        }
        if (n.lllIIIlIIlIlII(lllllllllllllllIllIIIlllIlIllIll.m() ? 1 : 0)) {
            return lIlIllllIlII[0];
        }
        TileObject lllllllllllllllIllIIIlllIlIllIlI = TileObjects.getNearest(tileObject -> tileObject.getName().toLowerCase().contains(lIlIllllIIll[lIlIllllIlII[5]]));
        if (n.lllIIIlIIlIlIl(lllllllllllllllIllIIIlllIlIllIlI)) {
            return lIlIllllIlII[0];
        }
        if (n.lllIIIlIIlIlII(Widgets.isVisible((Widget)Widgets.get((int)lIlIllllIlII[1], (int)lIlIllllIlII[0])) ? 1 : 0)) {
            Keyboard.type((char)lIlIllllIlII[2]);
            return lIlIllllIlII[3];
        }
        String[] stringArray = new String[lIlIllllIlII[3]];
        stringArray[n.lIlIllllIlII[0]] = lIlIllllIIll[lIlIllllIlII[0]];
        if (n.lllIIIlIIlIIll(lllllllllllllllIllIIIlllIlIllIlI.hasAction(stringArray) ? 1 : 0)) {
            lllllllllllllllIllIIIlllIlIllIlI.interact(lIlIllllIIll[lIlIllllIlII[3]]);
            return lIlIllllIlII[3];
        }
        var1_1.interact(lIlIllllIIll[lIlIllllIlII[4]]);
        return lIlIllllIlII[3];
    }

    private static String lllIIIlIIlIIII(String lllllllllllllllIllIIIlllIIlllIlI, String lllllllllllllllIllIIIlllIIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIIIlllIIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlllIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIlllIIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIlllIIllllII.init(lIlIllllIlII[4], lllllllllllllllIllIIIlllIIllllIl);
            return new String(lllllllllllllllIllIIIlllIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlllIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIlllIIlllIll) {
            lllllllllllllllIllIIIlllIIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlIIlIlIl(Object object) {
        return object == null;
    }

    private static void lllIIIlIIlIIIl() {
        lIlIllllIIll = new String[lIlIllllIlII[6]];
        n.lIlIllllIIll[n.lIlIllllIlII[0]] = n.lllIIIlIIIllll("LzYDGAEePBAETi48EBsa", "lYqhn");
        n.lIlIllllIIll[n.lIlIllllIlII[3]] = n.lllIIIlIIIllll("Hw88FjckGCRTCi4EJQ==", "KjPsG");
        n.lIlIllllIIll[n.lIlIllllIlII[4]] = n.lllIIIlIIIllll("Kjk6IRcbMyk9WCszKSIM", "iVHQx");
        n.lIlIllllIIll[n.lIlIllllIlII[5]] = n.lllIIIlIIlIIII("wPO15vzJ8DO1YK8gIhGkhw==", "bHBIR");
    }

    private static void lllIIIlIIlIIlI() {
        lIlIllllIlII = new int[7];
        n.lIlIllllIlII[0] = (0xE3 ^ 0xAA) & ~(7 ^ 0x4E);
        n.lIlIllllIlII[1] = 0xFFFFCBDF & 0x366E;
        n.lIlIllllIlII[2] = 0xF5 ^ 0xC2;
        n.lIlIllllIlII[3] = " ".length();
        n.lIlIllllIlII[4] = "  ".length();
        n.lIlIllllIlII[5] = "   ".length();
        n.lIlIllllIlII[6] = 0x47 ^ 0x43;
    }
}

