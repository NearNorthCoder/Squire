/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating", blocking=true)
public class h
extends Task {
    private static /* synthetic */ int[] lIlIIlIIlllII;
    private static /* synthetic */ String[] lIlIIlIIllIll;
    private final /* synthetic */ SquireSkipperConfig C;

    private static boolean lIlllIlIllIIIII(int n2) {
        return n2 == 0;
    }

    private static String lIlllIlIlIlllIl(String llllllllllllllIllIlllIlIIlIlIllI, String llllllllllllllIllIlllIlIIlIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlllIlIIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlllII[2]), "DES");
            Cipher llllllllllllllIllIlllIlIIlIllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlllIlIIlIllIlI.init(lIlIIlIIlllII[3], llllllllllllllIllIlllIlIIlIllIll);
            return new String(llllllllllllllIllIlllIlIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIlIIlIllIIl) {
            llllllllllllllIllIlllIlIIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        h.lIlllIlIlIlllll();
        h.lIlllIlIlIllllI();
    }

    private static void lIlllIlIlIlllll() {
        lIlIIlIIlllII = new int[4];
        h.lIlIIlIIlllII[0] = " ".length();
        h.lIlIIlIIlllII[1] = (0x58 ^ 0x65) & ~(0xB8 ^ 0x85);
        h.lIlIIlIIlllII[2] = 0x8A ^ 0x82;
        h.lIlIIlIIlllII[3] = "  ".length();
    }

    @Inject
    public h(SquireSkipperConfig squireSkipperConfig) {
        this.C = squireSkipperConfig;
    }

    private static void lIlllIlIlIllllI() {
        lIlIIlIIllIll = new String[lIlIIlIIlllII[0]];
        h.lIlIIlIIllIll[h.lIlIIlIIlllII[1]] = h.lIlllIlIlIlllIl("r3vM6i1+pws=", "rCRBw");
    }

    public boolean run() {
        h llllllllllllllIllIlllIlIIllIIIII;
        int[] nArray = new int[lIlIIlIIlllII[0]];
        nArray[h.lIlIIlIIlllII[1]] = this.C.foodID();
        if (h.lIlllIlIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIlIIlllII[1];
        }
        if (h.lIlllIlIllIIIIl(Combat.getCurrentHealth(), llllllllllllllIllIlllIlIIllIIIII.C.eatHP())) {
            return lIlIIlIIlllII[1];
        }
        int[] nArray2 = new int[lIlIIlIIlllII[0]];
        nArray2[h.lIlIIlIIlllII[1]] = this.C.foodID();
        Inventory.getFirst((int[])nArray2).interact(lIlIIlIIllIll[lIlIIlIIlllII[1]]);
        return lIlIIlIIlllII[0];
    }
}

