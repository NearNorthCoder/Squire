/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

@TaskDesc(name="Drinking Prayer Potion")
public class n
extends Task {
    private static /* synthetic */ int[] lIIllIIIlIIll;
    private static /* synthetic */ String[] lIIllIIIlIIIl;
    private final /* synthetic */ c Y;

    private static void lIlIlllIllllIll() {
        lIIllIIIlIIIl = new String[lIIllIIIlIIll[3]];
        n.lIIllIIIlIIIl[n.lIIllIIIlIIll[0]] = n.lIlIlllIllllIIl("LtKwaj5aPv0=", "dOJfK");
        n.lIIllIIIlIIIl[n.lIIllIIIlIIll[2]] = n.lIlIlllIllllIlI("AzsAFhUhaREABDomDw==", "SIaop");
    }

    private static void lIlIlllIlllllIl() {
        lIIllIIIlIIll = new int[5];
        n.lIIllIIIlIIll[0] = (0xE6 ^ 0xA0) & ~(0x6A ^ 0x2C);
        n.lIIllIIIlIIll[1] = 0x4C ^ 0x43;
        n.lIIllIIIlIIll[2] = " ".length();
        n.lIIllIIIlIIll[3] = "  ".length();
        n.lIIllIIIlIIll[4] = 79 + 160 - 80 + 4 ^ 154 + 146 - 212 + 83;
    }

    private static boolean lIlIlllIllllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllllIIIIIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (n.lIlIlllIllllllI(this.Y.s() ? 1 : 0)) {
            return lIIllIIIlIIll[0];
        }
        if (n.lIlIlllIlllllll(Prayers.getPoints(), lIIllIIIlIIll[1])) {
            return lIIllIIIlIIll[0];
        }
        Item llllllllllllllIllllIIlIIIlIlIlIl = Inventory.getFirst(item -> item.getName().startsWith(lIIllIIIlIIIl[lIIllIIIlIIll[2]]));
        if (n.lIlIllllIIIIIII(llllllllllllllIllllIIlIIIlIlIlIl)) {
            return lIIllIIIlIIll[0];
        }
        var1_1.interact(lIIllIIIlIIIl[lIIllIIIlIIll[0]]);
        return lIIllIIIlIIll[2];
    }

    private static boolean lIlIlllIlllllll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public n(c c2) {
        this.Y = c2;
    }

    static {
        n.lIlIlllIlllllIl();
        n.lIlIlllIllllIll();
    }

    private static boolean lIlIllllIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlllIllllIIl(String llllllllllllllIllllIIlIIIIllIIll, String llllllllllllllIllllIIlIIIIllIIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIIlIIIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIIllIIIlIIll[4]), "DES");
            Cipher llllllllllllllIllllIIlIIIIllIlll = Cipher.getInstance("DES");
            llllllllllllllIllllIIlIIIIllIlll.init(lIIllIIIlIIll[3], llllllllllllllIllllIIlIIIIlllIII);
            return new String(llllllllllllllIllllIIlIIIIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIlIIIIllIllI) {
            llllllllllllllIllllIIlIIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllIllllIlI(String llllllllllllllIllllIIlIIIlIIlIlI, String llllllllllllllIllllIIlIIIlIIlIIl) {
        llllllllllllllIllllIIlIIIlIIlIlI = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIlIIIlIIlIII = new StringBuilder();
        char[] llllllllllllllIllllIIlIIIlIIIlll = llllllllllllllIllllIIlIIIlIIlIIl.toCharArray();
        int llllllllllllllIllllIIlIIIlIIIllI = lIIllIIIlIIll[0];
        char[] llllllllllllllIllllIIlIIIlIIIIII = llllllllllllllIllllIIlIIIlIIlIlI.toCharArray();
        int llllllllllllllIllllIIlIIIIllllll = llllllllllllllIllllIIlIIIlIIIIII.length;
        int llllllllllllllIllllIIlIIIIlllllI = lIIllIIIlIIll[0];
        while (n.lIlIllllIIIIIIl(llllllllllllllIllllIIlIIIIlllllI, llllllllllllllIllllIIlIIIIllllll)) {
            char llllllllllllllIllllIIlIIIlIIlIll = llllllllllllllIllllIIlIIIlIIIIII[llllllllllllllIllllIIlIIIIlllllI];
            llllllllllllllIllllIIlIIIlIIlIII.append((char)(llllllllllllllIllllIIlIIIlIIlIll ^ llllllllllllllIllllIIlIIIlIIIlll[llllllllllllllIllllIIlIIIlIIIllI % llllllllllllllIllllIIlIIIlIIIlll.length]));
            "".length();
            ++llllllllllllllIllllIIlIIIlIIIllI;
            ++llllllllllllllIllllIIlIIIIlllllI;
            "".length();
            if (((0x70 ^ 0x3A) & ~(0xF4 ^ 0xBE)) == ((0xF ^ 0x24) & ~(0xA4 ^ 0x8F))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIlIIIlIIlIII);
    }
}

