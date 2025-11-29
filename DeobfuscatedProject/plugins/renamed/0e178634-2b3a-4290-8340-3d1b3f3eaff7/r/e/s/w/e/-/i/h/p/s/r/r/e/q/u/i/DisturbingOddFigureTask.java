/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.widgets.Dialog
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Dialog;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.d_Unknown;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.f;

/* TASK: Disturbing Odd Figure -> DisturbingoddfigureTask */
@TaskDesc(name="Disturbing Odd Figure")
public class DisturbingOddFigureTask
extends f {
    private static /* synthetic */ String[] lIlIllIlIIlll;
    private static final /* synthetic */ int V;
    private static /* synthetic */ int[] lIlIllIlIlIII;
    @Inject
    private /* synthetic */ d W;

    private static void llIIIIIlIlIIIII() {
        lIlIllIlIIlll = new String[lIlIllIlIlIII[4]];
        o.lIlIllIlIIlll[o.lIlIllIlIlIII[1]] = o."Odd Figure";
        o.lIlIllIlIIlll[o.lIlIllIlIlIII[0]] = o."No";
        o.lIlIllIlIIlll[o.lIlIllIlIlIII[2]] = o."Disturb";
    }

    private static String llIIIIIlIIllllI(String var5, String var13) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIlIllIlIlIII[2], var1);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        String[] stringArray = new String[lIlIllIlIlIII[0]];
        stringArray[o.lIlIllIlIlIII[1]] = lIlIllIlIIlll[lIlIllIlIlIII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (o.llIIIIIlIlIIIlI(nPC)) {
            return lIlIllIlIlIII[1];
        }
        if (o.llIIIIIlIlIIIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIllIlIlIII[0]];
            stringArray2[o.lIlIllIlIlIII[1]] = lIlIllIlIIlll[lIlIllIlIlIII[0]];
            Dialog.chooseOption((String[])stringArray2);
            0;
            return lIlIllIlIlIII[0];
        }
        this.W.e();
        nPC.interact(lIlIllIlIIlll[lIlIllIlIlIII[2]]);
        return lIlIllIlIlIII[0];
    }

    private static boolean llIIIIIlIlIIIlI(Object object) {
        return object == null;
    }

    private static void llIIIIIlIlIIIIl() {
        lIlIllIlIlIII = new int[5];
        o.lIlIllIlIlIII[0] = 1;
        o.lIlIllIlIlIII[1] = (0x21 ^ 0x30 ^ (0x15 ^ 0x4B)) & (0x37 ^ 0x2C ^ (0x4E ^ 0x1A) ^ -1);
        o.lIlIllIlIlIII[2] = 2;
        o.lIlIllIlIlIII[3] = -1;
        o.lIlIllIlIlIII[4] = 3;
    }

    private static boolean llIIIIIlIlIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIlIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        o.llIIIIIlIlIIIIl();
        o.llIIIIIlIlIIIII();
        V = lIlIllIlIlIII[3];
    }

    private static String llIIIIIlIIlllIl(String var4, String var3) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var3.toCharArray();
        int var10 = lIlIllIlIlIII[1];
        char[] var11 = var4.toCharArray();
        int var6 = var11.length;
        int var14 = lIlIllIlIlIII[1];
        while (o.llIIIIIlIlIIlII(var14, var6)) {
            char var12 = var11[var14];
            var7.append((char)(var12 ^ var8[var10 % var8.length]));
            0;
            ++var10;
            ++var14;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }
}

