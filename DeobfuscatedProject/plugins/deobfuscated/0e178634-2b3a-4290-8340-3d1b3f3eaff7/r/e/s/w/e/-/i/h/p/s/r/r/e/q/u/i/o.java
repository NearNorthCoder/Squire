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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.d;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.f;

@TaskDesc(name="Disturbing Odd Figure")
public class o
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

    private static String llIIIIIlIIllllI(String llllllllllllllIllIlIIIllIlllIIlI, String llllllllllllllIllIlIIIllIlllIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIllIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIllIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIllIlllIlII.init(lIlIllIlIlIII[2], llllllllllllllIllIlIIIllIlllIlIl);
            return new String(llllllllllllllIllIlIIIllIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIllIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIllIlllIIll) {
            llllllllllllllIllIlIIIllIlllIIll.printStackTrace();
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

    private static String llIIIIIlIIlllIl(String llllllllllllllIllIlIIIlllIIIIIlI, String llllllllllllllIllIlIIIlllIIIIllI) {
        llllllllllllllIllIlIIIlllIIIIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIlllIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIlllIIIIlIl = new StringBuilder();
        char[] llllllllllllllIllIlIIIlllIIIIlII = llllllllllllllIllIlIIIlllIIIIllI.toCharArray();
        int llllllllllllllIllIlIIIlllIIIIIll = lIlIllIlIlIII[1];
        char[] llllllllllllllIllIlIIIllIlllllIl = llllllllllllllIllIlIIIlllIIIIIlI.toCharArray();
        int llllllllllllllIllIlIIIllIlllllII = llllllllllllllIllIlIIIllIlllllIl.length;
        int llllllllllllllIllIlIIIllIllllIll = lIlIllIlIlIII[1];
        while (o.llIIIIIlIlIIlII(llllllllllllllIllIlIIIllIllllIll, llllllllllllllIllIlIIIllIlllllII)) {
            char llllllllllllllIllIlIIIlllIIIlIII = llllllllllllllIllIlIIIllIlllllIl[llllllllllllllIllIlIIIllIllllIll];
            llllllllllllllIllIlIIIlllIIIIlIl.append((char)(llllllllllllllIllIlIIIlllIIIlIII ^ llllllllllllllIllIlIIIlllIIIIlII[llllllllllllllIllIlIIIlllIIIIIll % llllllllllllllIllIlIIIlllIIIIlII.length]));
            0;
            ++llllllllllllllIllIlIIIlllIIIIIll;
            ++llllllllllllllIllIlIIIllIllllIll;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIIlllIIIIlIl);
    }
}

