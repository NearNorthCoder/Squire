/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=100)
public class x
extends Task {
    private final /* synthetic */ SquireGorillaConfig aj;
    private static /* synthetic */ String[] llIIlIlIlIIl;
    private static /* synthetic */ int[] llIIlIlIlIlI;

    private static boolean lllllIlIllIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public x(SquireGorillaConfig squireGorillaConfig) {
        this.aj = squireGorillaConfig;
    }

    private static boolean lllllIlIllIIIl(Object object) {
        return object == null;
    }

    static {
        x.lllllIlIlIllll();
        x.lllllIlIlIlllI();
    }

    private static boolean lllllIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllIlIlIllIl(String lllllllllllllllIlIIllllIlllIIIlI, String lllllllllllllllIlIIllllIllIlllII) {
        lllllllllllllllIlIIllllIlllIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllllIlllIIIII = new StringBuilder();
        char[] lllllllllllllllIlIIllllIllIlllll = lllllllllllllllIlIIllllIllIlllII.toCharArray();
        int lllllllllllllllIlIIllllIllIllllI = llIIlIlIlIlI[0];
        char[] lllllllllllllllIlIIllllIllIllIII = lllllllllllllllIlIIllllIlllIIIlI.toCharArray();
        int lllllllllllllllIlIIllllIllIlIlll = lllllllllllllllIlIIllllIllIllIII.length;
        int lllllllllllllllIlIIllllIllIlIllI = llIIlIlIlIlI[0];
        while (x.lllllIlIllIIlI(lllllllllllllllIlIIllllIllIlIllI, lllllllllllllllIlIIllllIllIlIlll)) {
            char lllllllllllllllIlIIllllIlllIIIll = lllllllllllllllIlIIllllIllIllIII[lllllllllllllllIlIIllllIllIlIllI];
            lllllllllllllllIlIIllllIlllIIIII.append((char)(lllllllllllllllIlIIllllIlllIIIll ^ lllllllllllllllIlIIllllIllIlllll[lllllllllllllllIlIIllllIllIllllI % lllllllllllllllIlIIllllIllIlllll.length]));
            "".length();
            ++lllllllllllllllIlIIllllIllIllllI;
            ++lllllllllllllllIlIIllllIllIlIllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllllIlllIIIII);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (x.lllllIlIllIIII(Combat.getCurrentHealth(), this.aj.eatAt())) {
            return llIIlIlIlIlI[0];
        }
        Item lllllllllllllllIlIIllllIlllllIlI = Inventory.getFirst(item -> item.hasAction(llIIlIlIlIIl[llIIlIlIlIlI[1]]::equals));
        if (x.lllllIlIllIIIl(lllllllllllllllIlIIllllIlllllIlI)) {
            return llIIlIlIlIlI[0];
        }
        var1_1.interact(llIIlIlIlIIl[llIIlIlIlIlI[0]]);
        return llIIlIlIlIlI[1];
    }

    private static String lllllIlIlIllII(String lllllllllllllllIlIIllllIllllIIlI, String lllllllllllllllIlIIllllIlllIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIlllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllllIllllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllllIllllIlII.init(llIIlIlIlIlI[2], lllllllllllllllIlIIllllIllllIlIl);
            return new String(lllllllllllllllIlIIllllIllllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllIllllIIll) {
            lllllllllllllllIlIIllllIllllIIll.printStackTrace();
            return null;
        }
    }

    private static void lllllIlIlIlllI() {
        llIIlIlIlIIl = new String[llIIlIlIlIlI[2]];
        x.llIIlIlIlIIl[x.llIIlIlIlIlI[0]] = x.lllllIlIlIllII("U38PQiUQU4I=", "RmvrQ");
        x.llIIlIlIlIIl[x.llIIlIlIlIlI[1]] = x.lllllIlIlIllIl("EzEN", "VPygc");
    }

    private static void lllllIlIlIllll() {
        llIIlIlIlIlI = new int[3];
        x.llIIlIlIlIlI[0] = (0xD0 ^ 0xC5 ^ (0x7D ^ 0x46)) & (0x67 ^ 0x19 ^ (0xC4 ^ 0x94) ^ -" ".length());
        x.llIIlIlIlIlI[1] = " ".length();
        x.llIIlIlIlIlI[2] = "  ".length();
    }
}

