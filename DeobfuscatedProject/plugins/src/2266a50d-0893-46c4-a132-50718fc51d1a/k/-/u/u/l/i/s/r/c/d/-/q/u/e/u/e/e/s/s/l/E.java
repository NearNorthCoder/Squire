/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Collect Musca Mushrooms", priority=100, blocking=true)
public class E
extends Task {
    private static /* synthetic */ String[] lIllIIlIlIll;
    final /* synthetic */ SquireDukeSucellus bh;
    final /* synthetic */ a bi;
    private static /* synthetic */ int[] lIllIIlIllII;

    private static boolean lllIIlIllIIIII(Object object) {
        return object == null;
    }

    private static String lllIIlIlIlllII(String lllllllllllllllIllIIIIlIIIIlIlll, String lllllllllllllllIllIIIIlIIIIlIllI) {
        lllllllllllllllIllIIIIlIIIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIlIIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIIlIIIIlIlIl = new StringBuilder();
        char[] lllllllllllllllIllIIIIlIIIIlIlII = lllllllllllllllIllIIIIlIIIIlIllI.toCharArray();
        int lllllllllllllllIllIIIIlIIIIlIIll = lIllIIlIllII[1];
        char[] lllllllllllllllIllIIIIlIIIIIllIl = lllllllllllllllIllIIIIlIIIIlIlll.toCharArray();
        int lllllllllllllllIllIIIIlIIIIIllII = lllllllllllllllIllIIIIlIIIIIllIl.length;
        int lllllllllllllllIllIIIIlIIIIIlIll = lIllIIlIllII[1];
        while (E.lllIIlIllIIIIl(lllllllllllllllIllIIIIlIIIIIlIll, lllllllllllllllIllIIIIlIIIIIllII)) {
            char lllllllllllllllIllIIIIlIIIIllIII = lllllllllllllllIllIIIIlIIIIIllIl[lllllllllllllllIllIIIIlIIIIIlIll];
            lllllllllllllllIllIIIIlIIIIlIlIl.append((char)(lllllllllllllllIllIIIIlIIIIllIII ^ lllllllllllllllIllIIIIlIIIIlIlII[lllllllllllllllIllIIIIlIIIIlIIll % lllllllllllllllIllIIIIlIIIIlIlII.length]));
            "".length();
            ++lllllllllllllllIllIIIIlIIIIlIIll;
            ++lllllllllllllllIllIIIIlIIIIIlIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIIlIIIIlIlIl);
    }

    private static void lllIIlIlIllllI() {
        lIllIIlIlIll = new String[lIllIIlIllII[0]];
        E.lIllIIlIlIll[E.lIllIIlIllII[1]] = E.lllIIlIlIlllII("JAw/DQBJFDkdCRsWIwM=", "iyLna");
        E.lIllIIlIlIll[E.lIllIIlIllII[2]] = E.lllIIlIlIlllIl("h+MrabI2PtDr7BFC1IIDCA==", "mpdVn");
    }

    @Inject
    public E(SquireDukeSucellus squireDukeSucellus) {
        this.bh = squireDukeSucellus;
        this.bi = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        String[] stringArray = new String[lIllIIlIllII[0]];
        stringArray[E.lIllIIlIllII[1]] = lIllIIlIlIll[lIllIIlIllII[1]];
        stringArray[E.lIllIIlIllII[2]] = lIllIIlIlIll[lIllIIlIllII[2]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (E.lllIIlIllIIIII(item)) {
            return lIllIIlIllII[1];
        }
        int[] nArray = new int[lIllIIlIllII[2]];
        nArray[E.lIllIIlIllII[1]] = lIllIIlIllII[3];
        Item lllllllllllllllIllIIIIlIIIlIIIlI = Inventory.getFirst((int[])nArray);
        if (E.lllIIlIllIIIII(lllllllllllllllIllIIIIlIIIlIIIlI)) {
            return lIllIIlIllII[1];
        }
        var2_2.useOn(item);
        return lIllIIlIllII[2];
    }

    private static String lllIIlIlIlllIl(String lllllllllllllllIllIIIIlIIIIIIIlI, String lllllllllllllllIllIIIIIlllllllll) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIlIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIIlIIIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIIlIIIIIIlII.init(lIllIIlIllII[0], lllllllllllllllIllIIIIlIIIIIIlIl);
            return new String(lllllllllllllllIllIIIIlIIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIlIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIIlIIIIIIIll) {
            lllllllllllllllIllIIIIlIIIIIIIll.printStackTrace();
            return null;
        }
    }

    static {
        E.lllIIlIlIlllll();
        E.lllIIlIlIllllI();
    }

    private static void lllIIlIlIlllll() {
        lIllIIlIllII = new int[4];
        E.lIllIIlIllII[0] = "  ".length();
        E.lIllIIlIllII[1] = (0xD ^ 7) & ~(0x58 ^ 0x52);
        E.lIllIIlIllII[2] = " ".length();
        E.lIllIIlIllII[3] = 213 + 220 - 414 + 214;
    }

    private static boolean lllIIlIllIIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

