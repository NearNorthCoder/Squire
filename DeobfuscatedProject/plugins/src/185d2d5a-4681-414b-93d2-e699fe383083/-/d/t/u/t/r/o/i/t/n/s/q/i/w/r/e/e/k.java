/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping empty jug")
public class k
extends Task {
    private static /* synthetic */ String[] lIlIllllIllll;
    private static /* synthetic */ int[] lIlIlllllIIIl;

    private static boolean llIIIIllIIllIll(int n2) {
        return n2 == 0;
    }

    private static String llIIIIllIIllIII(String llllllllllllllIllIIlllIlIlIIllIl, String llllllllllllllIllIIlllIlIlIIllII) {
        try {
            SecretKeySpec llllllllllllllIllIIlllIlIlIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIlIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlllIlIlIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlllIlIlIlIIIl.init(lIlIlllllIIIl[3], llllllllllllllIllIIlllIlIlIlIIlI);
            return new String(llllllllllllllIllIIlllIlIlIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlllIlIlIlIIII) {
            llllllllllllllIllIIlllIlIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static void llIIIIllIIllIIl() {
        lIlIllllIllll = new String[lIlIlllllIIIl[0]];
        k.lIlIllllIllll[k.lIlIlllllIIIl[1]] = k.llIIIIllIIllIII("u3Ppmn69+HI=", "ZfLGa");
    }

    private static void llIIIIllIIllIlI() {
        lIlIlllllIIIl = new int[4];
        k.lIlIlllllIIIl[0] = " ".length();
        k.lIlIlllllIIIl[1] = (163 + 156 - 207 + 67 ^ 34 + 95 - 26 + 37) & (0x64 ^ 0x2A ^ (0xED ^ 0x9C) ^ -" ".length());
        k.lIlIlllllIIIl[2] = 0xFFFFEF9F & 0x17EF;
        k.lIlIlllllIIIl[3] = "  ".length();
    }

    static {
        k.llIIIIllIIllIlI();
        k.llIIIIllIIllIIl();
    }

    public boolean run() {
        int[] nArray = new int[lIlIlllllIIIl[0]];
        nArray[k.lIlIlllllIIIl[1]] = lIlIlllllIIIl[2];
        if (k.llIIIIllIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIlllllIIIl[1];
        }
        int[] nArray2 = new int[lIlIlllllIIIl[0]];
        nArray2[k.lIlIlllllIIIl[1]] = lIlIlllllIIIl[2];
        Inventory.getFirst((int[])nArray2).interact(lIlIllllIllll[lIlIlllllIIIl[1]]);
        return lIlIlllllIIIl[0];
    }
}

