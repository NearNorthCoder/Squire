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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

/* TASK: Scattering ashes -> ScatteringashesTask */
@TaskDesc(name="Scattering ashes", priority=9990)
public class ScatteringAshesTask
extends Task {
    private static /* synthetic */ String[] llIlIIl;
    private static /* synthetic */ int[] llIlIlI;
    private final /* synthetic */ SquireCerberusConfig aL;

    private static void llIlIlllI() {
        llIlIIl = new String[llIlIlI[1]];
        x.llIlIIl[x.llIlIlI[0]] = x."Scatter";
    }

    private static void llIlIllll() {
        llIlIlI = new int[4];
        x.llIlIlI[0] = (0xE5 ^ 0x89 ^ (0x5F ^ 0x17)) & (0x40 ^ 0x6E ^ (0x44 ^ 0x4E) ^ -1);
        x.llIlIlI[1] = 1;
        x.llIlIlI[2] = 0xFFFFE5BA & 0x7EF7;
        x.llIlIlI[3] = 2;
    }

    private static boolean llIllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIIl(Object object) {
        return object == null;
    }

    private static String llIlIllIl(String lllIlIIIlIlIIII, String lllIlIIIlIIllll) {
        try {
            SecretKeySpec lllIlIIIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIIlIlIlII = Cipher.getInstance("Blowfish");
            lllIlIIIlIlIlII.init(llIlIlI[3], lllIlIIIlIlIlIl);
            return new String(lllIlIIIlIlIlII.doFinal(Base64.getDecoder().decode(lllIlIIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIIlIlIIll) {
            lllIlIIIlIlIIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (x.llIllIIII(this.aL.scatterAshes() ? 1 : 0)) {
            return llIlIlI[0];
        }
        int[] nArray = new int[llIlIlI[1]];
        nArray[x.llIlIlI[0]] = llIlIlI[2];
        Item lllIlIIIlIllIlI = Inventory.getFirst((int[])nArray);
        if (x.llIllIIIl(lllIlIIIlIllIlI)) {
            return llIlIlI[0];
        }
        var1_1.interact(llIlIIl[llIlIlI[0]]);
        return llIlIlI[1];
    }

    static {
        x.llIlIllll();
        x.llIlIlllI();
    }

    @Inject
    public x(SquireCerberusConfig squireCerberusConfig) {
        this.aL = squireCerberusConfig;
    }
}

