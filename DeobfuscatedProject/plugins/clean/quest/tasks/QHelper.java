/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.quest.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class QHelper
implements o {

    private static boolean lIlllIIIlIlIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean D() {
        block5: {
            block4: {
                int[] nArray = new int[lIlIIIllllIII[0]];
                nArray[q.lIlIIIllllIII[1]] = lIlIIIllllIII[2];
                if (!q.lIlllIIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                String[] stringArray = new String[lIlIIIllllIII[0]];
                stringArray[q.lIlIIIllllIII[1]] = lIlIIIlllIlll[lIlIIIllllIII[1]];
                if (!q.lIlllIIIlIlIIIl(TileObjects.getNearest((String[])stringArray))) break block5;
            }
            return lIlIIIllllIII[1];
        }
        if (q.lIlllIIIlIlIIlI(Players.getLocal().getAnimation(), lIlIIIllllIII[3])) {
            return lIlIIIllllIII[1];
        }
        String[] stringArray = new String[lIlIIIllllIII[0]];
        stringArray[q.lIlIIIllllIII[1]] = lIlIIIlllIlll[lIlIIIllllIII[0]];
        String[] stringArray2 = new String[lIlIIIllllIII[0]];
        stringArray2[q.lIlIIIllllIII[1]] = lIlIIIlllIlll[lIlIIIllllIII[4]];
        Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray2));
        return lIlIIIllllIII[0];
    }

    private static boolean lIlllIIIlIlIIIl(Object object) {
        return object == null;
    }

    static {
        q.lIlllIIIlIIllll();
        q.lIlllIIIlIIlllI();
    }

    private static boolean lIlllIIIlIlIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlllIIIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static void lIlllIIIlIIlllI() {
        lIlIIIlllIlll = new String[lIlIIIllllIII[5]];
        q.lIlIIIlllIlll[q.lIlIIIllllIII[1]] = "Fire";
        q.lIlIIIlllIlll[q.lIlIIIllllIII[0]] = "Raw shrimps";
        q.lIlIIIlllIlll[q.lIlIIIllllIII[4]] = "Fire";
    }
}

