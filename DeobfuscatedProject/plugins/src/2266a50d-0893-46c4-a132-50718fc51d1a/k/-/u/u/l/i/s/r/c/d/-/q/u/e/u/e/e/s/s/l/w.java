/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=10000)
public class w
extends Task {
    private final /* synthetic */ a aR;
    private static /* synthetic */ int[] lIllIIlIlllI;
    private static /* synthetic */ String[] lIllIIlIllIl;
    private final /* synthetic */ SquireDukeSucellus aP;
    private final /* synthetic */ SquireDukeSucellusConfig aQ;

    private static boolean lllIIlIllIIlll(Object object) {
        return object == null;
    }

    private static boolean lllIIlIllIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllIIlIllIIlIl() {
        lIllIIlIlllI = new int[5];
        w.lIllIIlIlllI[0] = (134 + 189 - 322 + 193 ^ 81 + 140 - 118 + 49) & (186 + 161 - 146 + 54 ^ 24 + 42 - -49 + 50 ^ -" ".length());
        w.lIllIIlIlllI[1] = " ".length();
        w.lIllIIlIlllI[2] = "   ".length();
        w.lIllIIlIlllI[3] = "  ".length();
        w.lIllIIlIlllI[4] = 0xC3 ^ 0x88 ^ (0xFB ^ 0xB8);
    }

    private static boolean lllIIlIllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIIlIllIIIlI(String lllllllllllllllIllIIIIIllllIlIII, String lllllllllllllllIllIIIIIllllIIlll) {
        lllllllllllllllIllIIIIIllllIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIllllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIIIllllIIllI = new StringBuilder();
        char[] lllllllllllllllIllIIIIIllllIIlIl = lllllllllllllllIllIIIIIllllIIlll.toCharArray();
        int lllllllllllllllIllIIIIIllllIIlII = lIllIIlIlllI[0];
        char[] lllllllllllllllIllIIIIIlllIllllI = lllllllllllllllIllIIIIIllllIlIII.toCharArray();
        int lllllllllllllllIllIIIIIlllIlllIl = lllllllllllllllIllIIIIIlllIllllI.length;
        int lllllllllllllllIllIIIIIlllIlllII = lIllIIlIlllI[0];
        while (w.lllIIlIllIlIII(lllllllllllllllIllIIIIIlllIlllII, lllllllllllllllIllIIIIIlllIlllIl)) {
            char lllllllllllllllIllIIIIIllllIlIIl = lllllllllllllllIllIIIIIlllIllllI[lllllllllllllllIllIIIIIlllIlllII];
            lllllllllllllllIllIIIIIllllIIllI.append((char)(lllllllllllllllIllIIIIIllllIlIIl ^ lllllllllllllllIllIIIIIllllIIlIl[lllllllllllllllIllIIIIIllllIIlII % lllllllllllllllIllIIIIIllllIIlIl.length]));
            "".length();
            ++lllllllllllllllIllIIIIIllllIIlII;
            ++lllllllllllllllIllIIIIIlllIlllII;
            "".length();
            if (-"   ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIIIllllIIllI);
    }

    @Inject
    public w(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aP = squireDukeSucellus;
        this.aQ = squireDukeSucellusConfig;
        this.aR = squireDukeSucellus.s();
    }

    private static void lllIIlIllIIlII() {
        lIllIIlIllIl = new String[lIllIIlIlllI[2]];
        w.lIllIIlIllIl[w.lIllIIlIlllI[0]] = w.lllIIlIllIIIlI("GwRyEz46Dw==", "UkRuQ");
        w.lIllIIlIllIl[w.lIllIIlIlllI[1]] = w.lllIIlIllIIIlI("IjQf", "gUkDI");
        w.lIllIIlIllIl[w.lIllIIlIlllI[3]] = w.lllIIlIllIIIll("AFpv2Ex4nAI=", "STBHw");
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (w.lllIIlIllIIllI(Combat.getCurrentHealth(), this.aQ.eatAt())) {
            return lIllIIlIlllI[0];
        }
        Item lllllllllllllllIllIIIIIlllllIIll = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIllIIlIlllI[1]];
            stringArray[w.lIllIIlIlllI[0]] = lIllIIlIllIl[lIllIIlIlllI[3]];
            return item.hasAction(stringArray);
        });
        if (w.lllIIlIllIIlll(lllllllllllllllIllIIIIIlllllIIll)) {
            w lllllllllllllllIllIIIIIlllllIlII;
            Log.error((String)lIllIIlIllIl[lIllIIlIlllI[0]]);
            lllllllllllllllIllIIIIIlllllIlII.aP.g(lIllIIlIlllI[1]);
            return lIllIIlIlllI[0];
        }
        var1_1.interact(lIllIIlIllIl[lIllIIlIlllI[1]]);
        this.sleep(lIllIIlIlllI[2]);
        return lIllIIlIlllI[1];
    }

    static {
        w.lllIIlIllIIlIl();
        w.lllIIlIllIIlII();
    }

    private static String lllIIlIllIIIll(String lllllllllllllllIllIIIIIlllIlIIll, String lllllllllllllllIllIIIIIlllIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIlllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIlllIlIIII.getBytes(StandardCharsets.UTF_8)), lIllIIlIlllI[4]), "DES");
            Cipher lllllllllllllllIllIIIIIlllIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIIlllIlIlIl.init(lIllIIlIlllI[3], lllllllllllllllIllIIIIIlllIlIllI);
            return new String(lllllllllllllllIllIIIIIlllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIIIlllIlIlII) {
            lllllllllllllllIllIIIIIlllIlIlII.printStackTrace();
            return null;
        }
    }
}

