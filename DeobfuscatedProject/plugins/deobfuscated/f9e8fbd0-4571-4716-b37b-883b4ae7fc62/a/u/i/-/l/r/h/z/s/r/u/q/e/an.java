/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using imbued heart", priority=5)
public class an
extends Task {
    private static /* synthetic */ int[] lIllIllIlIlIl;
    @Inject
    private /* synthetic */ SquireZulrah E;
    private static /* synthetic */ String[] lIllIllIlIlII;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (an.llIIlIIlIIIllll(this.E.d() ? 1 : 0)) {
            return lIllIllIlIlIl[0];
        }
        int[] nArray = new int[lIllIllIlIlIl[1]];
        nArray[an.lIllIllIlIlIl[0]] = lIllIllIlIlIl[2];
        nArray[an.lIllIllIlIlIl[3]] = lIllIllIlIlIl[4];
        Item llllllllllllllIllIIIlIlIIlIlllIl = Inventory.getFirst((int[])nArray);
        if (an.llIIlIIlIIlIIII(llllllllllllllIllIIIlIlIIlIlllIl)) {
            return lIllIllIlIlIl[0];
        }
        int llllllllllllllIllIIIlIlIIlIlllII = Vars.getBit((int)lIllIllIlIlIl[5]);
        if (an.llIIlIIlIIlIIIl(llllllllllllllIllIIIlIlIIlIlllII)) {
            return lIllIllIlIlIl[0];
        }
        var1_1.interact(lIllIllIlIlII[lIllIllIlIlIl[0]]);
        return lIllIllIlIlIl[3];
    }

    private static boolean llIIlIIlIIlIIIl(int n2) {
        return n2 > 0;
    }

    static {
        an.llIIlIIlIIIlllI();
        an.llIIlIIlIIIllIl();
    }

    private static boolean llIIlIIlIIIllll(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIlIIIlllI() {
        lIllIllIlIlIl = new int[7];
        an.lIllIllIlIlIl[0] = 3 & ~3;
        an.lIllIllIlIlIl[1] = 2;
        an.lIllIllIlIlIl[2] = 0xFFFFDBFF & 0x74F4;
        an.lIllIllIlIlIl[3] = 1;
        an.lIllIllIlIlIl[4] = 0xFFFFFFFF & 0x6BF9;
        an.lIllIllIlIlIl[5] = 0xFFFFD6FB & 0x3DF5;
        an.lIllIllIlIlIl[6] = 0x1D ^ 0x15;
    }

    private static boolean llIIlIIlIIlIIII(Object object) {
        return object == null;
    }

    private static String llIIlIIlIIIlIlI(String llllllllllllllIllIIIlIlIIlIlIlII, String llllllllllllllIllIIIlIlIIlIlIIll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIlIIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIllIllIlIlIl[6]), "DES");
            Cipher llllllllllllllIllIIIlIlIIlIlIllI = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIlIIlIlIllI.init(lIllIllIlIlIl[1], llllllllllllllIllIIIlIlIIlIlIlll);
            return new String(llllllllllllllIllIIIlIlIIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIlIIlIlIlIl) {
            llllllllllllllIllIIIlIlIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void llIIlIIlIIIllIl() {
        lIllIllIlIlII = new String[lIllIllIlIlIl[3]];
        an.lIllIllIlIlII[an.lIllIllIlIlIl[0]] = an."Invigorate";
    }
}

