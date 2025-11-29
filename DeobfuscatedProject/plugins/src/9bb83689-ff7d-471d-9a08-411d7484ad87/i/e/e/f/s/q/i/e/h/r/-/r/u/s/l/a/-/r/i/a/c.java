/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Gathering bait", priority=7, blocking=true)
public class c
extends Task {
    private static /* synthetic */ int[] lIlIlllIIll;
    private static /* synthetic */ String[] lIlIlllIIlI;

    private static boolean lIIlIIlllllIIl(int n) {
        return n == 0;
    }

    private static boolean lIIlIIlllllIlI(int n, int n2) {
        return n >= n2;
    }

    static {
        c.lIIlIIlllllIII();
        c.lIIlIIllllIlll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        block5: {
            block4: {
                int[] nArray = new int[lIlIlllIIll[0]];
                nArray[c.lIlIlllIIll[1]] = lIlIlllIIll[2];
                if (!c.lIIlIIlllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray2 = new int[lIlIlllIIll[0]];
                nArray2[c.lIlIlllIIll[1]] = lIlIlllIIll[3];
                if (!c.lIIlIIlllllIlI(Inventory.getCount((int[])nArray2), lIlIlllIIll[4])) break block5;
            }
            return lIlIlllIIll[1];
        }
        int[] nArray = new int[lIlIlllIIll[0]];
        nArray[c.lIlIlllIIll[1]] = lIlIlllIIll[5];
        TileObject llllllllllllllllIlIlIlllIlIIlIlI = TileObjects.getNearest((int[])nArray);
        if (c.lIIlIIlllllIll(llllllllllllllllIlIlIlllIlIIlIlI)) {
            return lIlIlllIIll[1];
        }
        var1_1.interact(lIlIlllIIlI[lIlIlllIIll[1]]);
        return lIlIlllIIll[0];
    }

    private static void lIIlIIllllIlll() {
        lIlIlllIIlI = new String[lIlIlllIIll[0]];
        c.lIlIlllIIlI[c.lIlIlllIIll[1]] = c.lIIlIIllllIllI("fuJxQKqKSuA=", "FnBEp");
    }

    private static void lIIlIIlllllIII() {
        lIlIlllIIll = new int[7];
        c.lIlIlllIIll[0] = " ".length();
        c.lIlIlllIIll[1] = (0x57 ^ 0x2A ^ (0x24 ^ 0x16)) & (0xD9 ^ 0x97 ^ " ".length() ^ -" ".length());
        c.lIlIlllIIll[2] = -(0xFFFFF7CE & 0x2A77) & (0xFFFFFB7F & 0x7FE7);
        c.lIlIlllIIll[3] = 0xFFFF99FF & 0x6E72;
        c.lIlIlllIIll[4] = "  ".length();
        c.lIlIlllIIll[5] = 0xFFFFCFFC & 0xB75B;
        c.lIlIlllIIll[6] = 7 ^ 0xF;
    }

    private static String lIIlIIllllIllI(String llllllllllllllllIlIlIlllIlIIIIII, String llllllllllllllllIlIlIlllIlIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlllIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIlllIIll[6]), "DES");
            Cipher llllllllllllllllIlIlIlllIlIIIlII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIlllIlIIIlII.init(lIlIlllIIll[4], llllllllllllllllIlIlIlllIlIIIlIl);
            return new String(llllllllllllllllIlIlIlllIlIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlllIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlllIlIIIIll) {
            llllllllllllllllIlIlIlllIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlllllIll(Object object) {
        return object == null;
    }
}

