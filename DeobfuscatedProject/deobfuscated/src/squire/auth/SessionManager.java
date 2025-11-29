/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.ui.ComboBoxEditor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JColorChooser;

class SessionManager
implements ActionListener {
    private static /* synthetic */ int[] lllIIl;
    final /* synthetic */ g W;
    private static /* synthetic */ String[] lllIII;

    static {
        h.lllIIll();
        h.lllIIlI();
    }

    private static boolean lllIlII(Object object) {
        return object != null;
    }

    private static void lllIIll() {
        lllIIl = new int[4];
        h.lllIIl[0] = (0xCF ^ 0x8A ^ (0x19 ^ 0x67)) & (0xE6 ^ 0x88 ^ (0xC7 ^ 0x92) ^ -1);
        h.lllIIl[1] = 1;
        h.lllIIl[2] = 65 + 142 - 109 + 86 ^ 166 + 175 - 272 + 107;
        h.lllIIl[3] = 2;
    }

    private static void lllIIlI() {
        lllIII = new String[lllIIl[1]];
        h.lllIII[h.lllIIl[0]] = h."Color Chooser";
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Color color = this.W.U.getBackground();
        Color color2 = JColorChooser.showDialog(this.W.U, lllIII[lllIIl[0]], color);
        if (h.lllIlII(color2) && h.lllIlIl(color, color2)) {
            this.W.U.setBackground(color2);
            this.W.a(color2);
        }
    }

    h(g g2) {
        this.W = g2;
    }

    private static String lllIIIl(String llllIllIlIlIIll, String llllIllIlIlIIlI) {
        try {
            SecretKeySpec llllIllIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllIlIlIIlI.getBytes(StandardCharsets.UTF_8)), lllIIl[2]), "DES");
            Cipher llllIllIlIlIlll = Cipher.getInstance("DES");
            llllIllIlIlIlll.init(lllIIl[3], llllIllIlIllIII);
            return new String(llllIllIlIlIlll.doFinal(Base64.getDecoder().decode(llllIllIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIlIlIllI) {
            llllIllIlIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIl(Object object, Object object2) {
        return object != object2;
    }
}
