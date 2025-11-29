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

/* TASK: Getting commission -> GettingcommissionTask */
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
        t var9;
        if (t.lIIIIlIIIIIlIII(this.T.h() ? 1 : 0)) {
            return llIlIllllIII[0];
        }
        if (t.lIIIIlIIIIIlIII(Dialog.hasOption((String)llIlIlllIlll[llIlIllllIII[0]]) ? 1 : 0)) {
            String[] stringArray = new String[llIlIllllIII[1]];
            stringArray[t.llIlIllllIII[0]] = llIlIlllIlll[llIlIllllIII[1]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return llIlIllllIII[1];
        }
        NPC var4 = var9.T.p();
        if (t.lIIIIlIIIIIlIIl(var4)) {
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

    private static String lIIIIlIIIIIIlIl(String var12, String var14) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var2 = var14.toCharArray();
        int var11 = llIlIllllIII[0];
        char[] var5 = var12.toCharArray();
        int var18 = var5.length;
        int var1 = llIlIllllIII[0];
        while (t.lIIIIlIIIIIlIlI(var1, var18)) {
            char var3 = var5[var1];
            var7.append((char)(var3 ^ var2[var11 % var2.length]));
            0;
            ++var11;
            ++var1;
            0;
            if (-1 <= 3) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static String lIIIIlIIIIIIlII(String var15, String var19) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llIlIllllIII[4]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llIlIllllIII[2], var20);
            return new String(var10.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void lIIIIlIIIIIIllI() {
        llIlIlllIlll = new String[llIlIllllIII[3]];
        t.llIlIlllIlll[t.llIlIllllIII[0]] = t."Yes";
        t.llIlIlllIlll[t.llIlIllllIII[1]] = t."Yes";
        t.llIlIlllIlll[t.llIlIllllIII[2]] = t."Commission";
    }

    private static String lIIIIlIIIIIIIll(String var6, String var21) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(llIlIllllIII[2], var8);
            return new String(var13.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
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
        t.llIlIllllIII[1] = 1;
        t.llIlIllllIII[2] = 2;
        t.llIlIllllIII[3] = 3;
        t.llIlIllllIII[4] = 0x4A ^ 0x40 ^ 2;
    }
}

