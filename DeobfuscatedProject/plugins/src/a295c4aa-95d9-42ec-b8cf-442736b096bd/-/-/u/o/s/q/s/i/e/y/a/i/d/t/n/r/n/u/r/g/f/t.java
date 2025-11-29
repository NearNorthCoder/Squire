/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.widgets.Dialog
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Getting commission", priority=2147483597, blocking=true)
public class t
extends j {
    private static /* synthetic */ int[] llIlIllllIII;
    private static /* synthetic */ String[] llIlIlllIlll;

    private static boolean lIIIIlIIIIIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var1_1;
        t lllllllllllllllIlIIIIIlIIlIlllII;
        if (t.lIIIIlIIIIIlIII(this.T.h() ? 1 : 0)) {
            return llIlIllllIII[0];
        }
        if (t.lIIIIlIIIIIlIII(Dialog.hasOption((String)llIlIlllIlll[llIlIllllIII[0]]) ? 1 : 0)) {
            String[] stringArray = new String[llIlIllllIII[1]];
            stringArray[t.llIlIllllIII[0]] = llIlIlllIlll[llIlIllllIII[1]];
            Dialog.chooseOption((String[])stringArray);
            "".length();
            return llIlIllllIII[1];
        }
        NPC lllllllllllllllIlIIIIIlIIlIllIll = lllllllllllllllIlIIIIIlIIlIlllII.T.p();
        if (t.lIIIIlIIIIIlIIl(lllllllllllllllIlIIIIIlIIlIllIll)) {
            return llIlIllllIII[0];
        }
        var1_1.interact(llIlIlllIlll[llIlIllllIII[2]]);
        return llIlIllllIII[1];
    }

    private static boolean lIIIIlIIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        t.lIIIIlIIIIIIlll();
        t.lIIIIlIIIIIIllI();
    }

    private static String lIIIIlIIIIIIlIl(String lllllllllllllllIlIIIIIlIIlIIlIll, String lllllllllllllllIlIIIIIlIIlIIllll) {
        lllllllllllllllIlIIIIIlIIlIIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIIlIIlIIlllI = new StringBuilder();
        char[] lllllllllllllllIlIIIIIlIIlIIllIl = lllllllllllllllIlIIIIIlIIlIIllll.toCharArray();
        int lllllllllllllllIlIIIIIlIIlIIllII = llIlIllllIII[0];
        char[] lllllllllllllllIlIIIIIlIIlIIIllI = lllllllllllllllIlIIIIIlIIlIIlIll.toCharArray();
        int lllllllllllllllIlIIIIIlIIlIIIlIl = lllllllllllllllIlIIIIIlIIlIIIllI.length;
        int lllllllllllllllIlIIIIIlIIlIIIlII = llIlIllllIII[0];
        while (t.lIIIIlIIIIIlIlI(lllllllllllllllIlIIIIIlIIlIIIlII, lllllllllllllllIlIIIIIlIIlIIIlIl)) {
            char lllllllllllllllIlIIIIIlIIlIlIIIl = lllllllllllllllIlIIIIIlIIlIIIllI[lllllllllllllllIlIIIIIlIIlIIIlII];
            lllllllllllllllIlIIIIIlIIlIIlllI.append((char)(lllllllllllllllIlIIIIIlIIlIlIIIl ^ lllllllllllllllIlIIIIIlIIlIIllIl[lllllllllllllllIlIIIIIlIIlIIllII % lllllllllllllllIlIIIIIlIIlIIllIl.length]));
            "".length();
            ++lllllllllllllllIlIIIIIlIIlIIllII;
            ++lllllllllllllllIlIIIIIlIIlIIIlII;
            "".length();
            if (-" ".length() <= "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIIIlIIlIIlllI);
    }

    private static String lIIIIlIIIIIIlII(String lllllllllllllllIlIIIIIlIIIlllIll, String lllllllllllllllIlIIIIIlIIIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIIIlllIlI.getBytes(StandardCharsets.UTF_8)), llIlIllllIII[4]), "DES");
            Cipher lllllllllllllllIlIIIIIlIIIllllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIIlIIIllllIl.init(llIlIllllIII[2], lllllllllllllllIlIIIIIlIIIlllllI);
            return new String(lllllllllllllllIlIIIIIlIIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIlIIIllllII) {
            lllllllllllllllIlIIIIIlIIIllllII.printStackTrace();
            return null;
        }
    }

    private static void lIIIIlIIIIIIllI() {
        llIlIlllIlll = new String[llIlIllllIII[3]];
        t.llIlIlllIlll[t.llIlIllllIII[0]] = t.lIIIIlIIIIIIIll("hLily2tL+is=", "vJkxo");
        t.llIlIlllIlll[t.llIlIllllIII[1]] = t.lIIIIlIIIIIIlII("cVzK9UQf48o=", "jqbUd");
        t.llIlIlllIlll[t.llIlIllllIII[2]] = t.lIIIIlIIIIIIlIl("CisCNDo6NwY2PQ==", "IDoYS");
    }

    private static String lIIIIlIIIIIIIll(String lllllllllllllllIlIIIIIlIIIlIlllI, String lllllllllllllllIlIIIIIlIIIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIIlIIIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIlIIIllIIII.init(llIlIllllIII[2], lllllllllllllllIlIIIIIlIIIllIIIl);
            return new String(lllllllllllllllIlIIIIIlIIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIlIIIlIllll) {
            lllllllllllllllIlIIIIIlIIIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIIIIIlIIl(Object object) {
        return object == null;
    }

    @Inject
    public t(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static void lIIIIlIIIIIIlll() {
        llIlIllllIII = new int[5];
        t.llIlIllllIII[0] = (1 ^ 0x44) & ~(0x83 ^ 0xC6);
        t.llIlIllllIII[1] = " ".length();
        t.llIlIllllIII[2] = "  ".length();
        t.llIlIllllIII[3] = "   ".length();
        t.llIlIllllIII[4] = 0x4A ^ 0x40 ^ "  ".length();
    }
}

