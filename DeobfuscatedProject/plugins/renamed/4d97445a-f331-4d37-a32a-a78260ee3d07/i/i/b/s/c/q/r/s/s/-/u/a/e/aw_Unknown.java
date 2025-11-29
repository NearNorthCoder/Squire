/*
 * Decompiled with CFR 0.152.
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import i.i.b.s.c.q.r.s.s.-.u.a.e.av_Unknown;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class aw_Unknown
extends FocusAdapter {
    private static /* synthetic */ String[] lIIlIIlII;
    private static /* synthetic */ int[] lIIlIIlIl;
    final /* synthetic */ av dA;

    private static boolean llllllIllI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        aw.llllllIlIl();
        aw.llllllIIll();
    }

    private static String llllllIIlI(String llIIlIIllIIIIlI, String llIIlIIlIllllII) {
        llIIlIIllIIIIlI = new String(Base64.getDecoder().decode(llIIlIIllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlIIllIIIIII = new StringBuilder();
        char[] llIIlIIlIllllll = llIIlIIlIllllII.toCharArray();
        int llIIlIIlIlllllI = lIIlIIlIl[1];
        char[] llIIlIIlIlllIII = llIIlIIllIIIIlI.toCharArray();
        int llIIlIIlIllIlll = llIIlIIlIlllIII.length;
        int llIIlIIlIllIllI = lIIlIIlIl[1];
        while (aw.llllllIlll(llIIlIIlIllIllI, llIIlIIlIllIlll)) {
            char llIIlIIllIIIIll = llIIlIIlIlllIII[llIIlIIlIllIllI];
            llIIlIIllIIIIII.append((char)(llIIlIIllIIIIll ^ llIIlIIlIllllll[llIIlIIlIlllllI % llIIlIIlIllllll.length]));
            0;
            ++llIIlIIlIlllllI;
            ++llIIlIIlIllIllI;
            0;
            if (3 > 2) continue;
            return null;
        }
        return String.valueOf(llIIlIIllIIIIII);
    }

    aw(av av2) {
        this.dA = av2;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        if (aw.llllllIllI(this.dA.dy.getHotkey(), lIIlIIlIl[0])) {
            this.dA.dv.setText(lIIlIIlII[lIIlIIlIl[2]]);
        }
    }

    private static void llllllIlIl() {
        lIIlIIlIl = new int[5];
        aw.lIIlIIlIl[0] = -1;
        aw.lIIlIIlIl[1] = (0xDA ^ 0x9A) & ~(0xF7 ^ 0xB7);
        aw.lIIlIIlIl[2] = 1;
        aw.lIIlIIlIl[3] = 2;
        aw.lIIlIIlIl[4] = 21 + 108 - 55 + 55 ^ 28 + 78 - 93 + 124;
    }

    private static String llllllIIII(String llIIlIIlIlIlIll, String llIIlIIlIlIllII) {
        try {
            SecretKeySpec llIIlIIlIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIlIlIllII.getBytes(StandardCharsets.UTF_8)), lIIlIIlIl[4]), "DES");
            Cipher llIIlIIlIlIllll = Cipher.getInstance("DES");
            llIIlIIlIlIllll.init(lIIlIIlIl[3], llIIlIIlIllIIII);
            return new String(llIIlIIlIlIllll.doFinal(Base64.getDecoder().decode(llIIlIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIlIlIlllI) {
            llIIlIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        this.dA.dy.setHotkey(lIIlIIlIl[0]);
        this.dA.dv.setText(lIIlIIlII[lIIlIIlIl[1]]);
        this.dA.dz = lIIlIIlIl[2];
    }

    private static void llllllIIll() {
        lIIlIIlII = new String[lIIlIIlIl[3]];
        aw.lIIlIIlII[aw.lIIlIIlIl[1]] = aw."[Set...]";
        aw.lIIlIIlII[aw.lIIlIIlIl[2]] = aw."[Hotkey]";
    }
}

