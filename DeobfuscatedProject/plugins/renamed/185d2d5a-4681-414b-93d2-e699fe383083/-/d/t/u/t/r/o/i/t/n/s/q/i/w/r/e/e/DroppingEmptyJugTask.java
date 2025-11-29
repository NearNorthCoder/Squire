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

/* TASK: Dropping empty jug -> DroppingemptyjugTask */
@TaskDesc(name="Dropping empty jug")
public class DroppingEmptyJugTask
extends Task {
    private static /* synthetic */ String[] lIlIllllIllll;
    private static /* synthetic */ int[] lIlIlllllIIIl;

    private static boolean llIIIIllIIllIll(int n2) {
        return n2 == 0;
    }

    private static String llIIIIllIIllIII(String var4, String var3) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIlllllIIIl[3], var2);
            return new String(var1.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void llIIIIllIIllIIl() {
        lIlIllllIllll = new String[lIlIlllllIIIl[0]];
        k.lIlIllllIllll[k.lIlIlllllIIIl[1]] = k."Drop";
    }

    private static void llIIIIllIIllIlI() {
        lIlIlllllIIIl = new int[4];
        k.lIlIlllllIIIl[0] = 1;
        k.lIlIlllllIIIl[1] = (163 + 156 - 207 + 67 ^ 34 + 95 - 26 + 37) & (0x64 ^ 0x2A ^ (0xED ^ 0x9C) ^ -1);
        k.lIlIlllllIIIl[2] = 0xFFFFEF9F & 0x17EF;
        k.lIlIlllllIIIl[3] = 2;
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

