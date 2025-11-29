/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening pack", priority=10, blocking=true)
public class bW
extends Task {
    private static /* synthetic */ int[] llIIIIIlI;
    private static /* synthetic */ String[] lIlllIlIl;

    private static void lIlIIIlIlIl() {
        lIlllIlIl = new String[llIIIIIlI[4]];
        bW.lIlllIlIl[bW.llIIIIIlI[0]] = bW.lIlIIIlIIll("WwdBiDzZrTk=", "hxxiV");
        bW.lIlllIlIl[bW.llIIIIIlI[2]] = bW.lIlIIIlIIll("8tcwmYYw+Yk=", "tLXgO");
        bW.lIlllIlIl[bW.llIIIIIlI[3]] = bW.lIlIIIlIlII("LFFGlfwH+Rc=", "BOfTK");
    }

    public boolean run() {
        if (bW.lIlIlIIIllI(Inventory.contains(item -> item.getName().contains(lIlllIlIl[llIIIIIlI[3]])) ? 1 : 0)) {
            return llIIIIIlI[0];
        }
        List lIlllIIIIlIIIIl = Inventory.getAll(item -> item.getName().contains(lIlllIlIl[llIIIIIlI[2]]));
        int lIlllIIIIlIIIII = llIIIIIlI[0];
        while (bW.lIlIlIIIlll(lIlllIIIIlIIIII, Math.min(llIIIIIlI[1], lIlllIIIIlIIIIl.size()))) {
            ((Item)lIlllIIIIlIIIIl.get(lIlllIIIIlIIIII)).interact(lIlllIlIl[llIIIIIlI[0]]);
            ++lIlllIIIIlIIIII;
            "".length();
            if ((0xA ^ 7 ^ (0xC8 ^ 0xC1)) >= 0) continue;
            return ((21 + 53 - -38 + 20 ^ 115 + 97 - 171 + 113) & (117 + 161 - 146 + 30 ^ 157 + 66 - 151 + 116 ^ -" ".length())) != 0;
        }
        return llIIIIIlI[2];
    }

    private static boolean lIlIlIIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIIlIIll(String lIlllIIIIIIlIll, String lIlllIIIIIIlIII) {
        try {
            SecretKeySpec lIlllIIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), llIIIIIlI[1]), "DES");
            Cipher lIlllIIIIIIllIl = Cipher.getInstance("DES");
            lIlllIIIIIIllIl.init(llIIIIIlI[3], lIlllIIIIIIlllI);
            return new String(lIlllIIIIIIllIl.doFinal(Base64.getDecoder().decode(lIlllIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIIIIIllII) {
            lIlllIIIIIIllII.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIlIlII(String lIlllIIIIIllIII, String lIlllIIIIIlIlll) {
        try {
            SecretKeySpec lIlllIIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIIIIIllIlI = Cipher.getInstance("Blowfish");
            lIlllIIIIIllIlI.init(llIIIIIlI[3], lIlllIIIIIllIll);
            return new String(lIlllIIIIIllIlI.doFinal(Base64.getDecoder().decode(lIlllIIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIIIIllIIl) {
            lIlllIIIIIllIIl.printStackTrace();
            return null;
        }
    }

    static {
        bW.lIlIlIIIlIl();
        bW.lIlIIIlIlIl();
    }

    private static void lIlIlIIIlIl() {
        llIIIIIlI = new int[5];
        bW.llIIIIIlI[0] = (4 ^ 0x53) & ~(0xCD ^ 0x9A);
        bW.llIIIIIlI[1] = 0x6F ^ 1 ^ (0xF3 ^ 0x95);
        bW.llIIIIIlI[2] = " ".length();
        bW.llIIIIIlI[3] = "  ".length();
        bW.llIIIIIlI[4] = "   ".length();
    }
}

