/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.quest.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.quest.tasks.MHelper;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class HHelper
implements o {
    
    private static  int aE;

    private static boolean lIlllIIlIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIIlIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        H.lIlllIIIlllllll();
        H.lIlllIIIllllllI();
    }

    private static boolean lIlllIIlIIIIIIl(Object object) {
        return object != null;
    }

    private static void lIlllIIIllllllI() {
        lIlIIlIIIlIIl = new String[lIlIIlIIIlIlI[3]];
        H.lIlIIlIIIlIIl[H.lIlIIlIIIlIlI[0]] = "max must be greater than min";
        H.lIlIIlIIIlIIl[H.lIlIIlIIIlIlI[1]] = "Confirm";
    }

    private static int a(int n2, int n3) {
        if (H.lIlllIIlIIIIIII(n2, n3)) {
            throw new IllegalArgumentException(lIlIIlIIIlIIl[lIlIIlIIIlIlI[0]]);
        }
        Random random = new Random();
        return random.nextInt(n3 - n2 + lIlIIlIIIlIlI[1]) + n2;
    }

    public void E() {
        if (H.lIlllIIlIIIIIIl(Widgets.get((int)lIlIIlIIIlIlI[2], (int)lIlIIlIIIlIlI[3]))) {
            M.b(H.a(lIlIIlIIIlIlI[4], lIlIIlIIIlIlI[5]));
            aE = M.G();
            M.b(H.a(lIlIIlIIIlIlI[6], lIlIIlIIIlIlI[7]));
            aE = M.G();
            M.b(H.a(lIlIIlIIIlIlI[8], lIlIIlIIIlIlI[9]));
            aE = M.G();
            M.b(H.a(lIlIIlIIIlIlI[10], lIlIIlIIIlIlI[11]));
            aE = M.G();
            M.b(H.a(lIlIIlIIIlIlI[12], lIlIIlIIIlIlI[13]));
            aE = M.G();
        }
        aE = M.G();
        Widget var1 = Widgets.get((int)lIlIIlIIIlIlI[2], (int)lIlIIlIIIlIlI[14]);
        if (H.lIlllIIlIIIIIIl(var1)) {
            var1.interact(lIlIIlIIIlIIl[lIlIIlIIIlIlI[1]]);
            aE = M.G();
        }
    }

    @Override
    public boolean D() {
        if (H.lIlllIIlIIIIIII(aE, lIlIIlIIIlIlI[1])) {
            aE -= lIlIIlIIIlIlI[1];
            return lIlIIlIIIlIlI[0];
        }
        this.E();
        return lIlIIlIIIlIlI[0];
    }

        return String.valueOf(var2);
    }

}

