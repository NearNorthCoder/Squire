/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.text.StyleContext;
import net.runelite.launcher.Launcher;

class FontManager {
    private static /* synthetic */ String[] lIIlIl;
    private static final /* synthetic */ Font regularFont;
    private static /* synthetic */ int[] lIIllI;
    private static final /* synthetic */ Font boldFont;

    static Font j() {
        return regularFont;
    }

    private static void lIIllll() {
        lIIllI = new int[7];
        m.lIIllI[0] = 46 & (0x98 ^ 0x83 ^ (3 ^ 0x36) ^ -1);
        m.lIIllI[1] = 0xA1 ^ 0xB1;
        m.lIIllI[2] = 1;
        m.lIIllI[3] = 2;
        m.lIIllI[4] = 3;
        m.lIIllI[5] = 0x45 ^ 0xD ^ (2 ^ 0x4E);
        m.lIIllI[6] = 173 + 69 - 72 + 4 ^ 119 + 91 - 66 + 22;
    }

    private static boolean lIlIIII(int n, int n2) {
        return n < n2;
    }

    static {
        m.lIIllll();
        m.lIIlllI();
        GraphicsEnvironment lllllIlIlllllIl = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            Font lllllIlIlllllII = Font.createFont(lIIllI[0], Launcher.class.getResourceAsStream(lIIlIl[lIIllI[0]])).deriveFont(lIIllI[0], 16.0f);
            lllllIlIlllllIl.registerFont(lllllIlIlllllII);
            0;
            regularFont = StyleContext.getDefaultStyleContext().getFont(lllllIlIlllllII.getName(), lIIllI[0], lIIllI[1]);
            lllllIlIlllllIl.registerFont(regularFont);
            0;
            Font lllllIlIllllIll = Font.createFont(lIIllI[0], Launcher.class.getResourceAsStream(lIIlIl[lIIllI[2]])).deriveFont(lIIllI[0], 16.0f);
            lllllIlIlllllIl.registerFont(lllllIlIllllIll);
            0;
            boldFont = StyleContext.getDefaultStyleContext().getFont(lllllIlIllllIll.getName(), lIIllI[0], lIIllI[1]);
            lllllIlIlllllIl.registerFont(boldFont);
            0;
            0;
        }
        catch (FontFormatException lllllIlIlllllII) {
            throw new RuntimeException(lIIlIl[lIIllI[3]], lllllIlIlllllII);
        }
        catch (IOException lllllIlIlllllII) {
            throw new RuntimeException(lIIlIl[lIIllI[4]], lllllIlIlllllII);
        }
        if (3 <= 0) {
            // empty if block
        }
    }

    private static String lIIllII(String lllllIlIllIIllI, String lllllIlIllIIIll) {
        try {
            SecretKeySpec lllllIlIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIlIllIIIll.getBytes(StandardCharsets.UTF_8)), lIIllI[6]), "DES");
            Cipher lllllIlIllIlIII = Cipher.getInstance("DES");
            lllllIlIllIlIII.init(lIIllI[3], lllllIlIllIlIIl);
            return new String(lllllIlIllIlIII.doFinal(Base64.getDecoder().decode(lllllIlIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIlIllIIlll) {
            lllllIlIllIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIIllIl(String lllllIlIlllIIIl, String lllllIlIlllIIII) {
        try {
            SecretKeySpec lllllIlIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIlIlllIlIl = Cipher.getInstance("Blowfish");
            lllllIlIlllIlIl.init(lIIllI[3], lllllIlIlllIllI);
            return new String(lllllIlIlllIlIl.doFinal(Base64.getDecoder().decode(lllllIlIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIlIlllIlII) {
            lllllIlIlllIlII.printStackTrace();
            return null;
        }
    }

    static Font o() {
        return boldFont;
    }

    m() {
    }

    private static void lIIlllI() {
        lIIlIl = new String[lIIllI[5]];
        m.lIIlIl[m.lIIllI[0]] = m."runescape.ttf";
        m.lIIlIl[m.lIIllI[2]] = m."runescape_small.ttf";
        m.lIIlIl[m.lIIllI[3]] = m."Font loaded, but format incorrect.";
        m.lIIlIl[m.lIIllI[4]] = m."Font file not found.";
    }

    private static String lIIlIll(String lllllIlIlIlIllI, String lllllIlIlIlIlIl) {
        lllllIlIlIlIllI = new String(Base64.getDecoder().decode(lllllIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIlIlIlIlII = new StringBuilder();
        char[] lllllIlIlIlIIll = lllllIlIlIlIlIl.toCharArray();
        int lllllIlIlIlIIlI = lIIllI[0];
        char[] lllllIlIlIIllII = lllllIlIlIlIllI.toCharArray();
        int lllllIlIlIIlIll = lllllIlIlIIllII.length;
        int lllllIlIlIIlIlI = lIIllI[0];
        while (m.lIlIIII(lllllIlIlIIlIlI, lllllIlIlIIlIll)) {
            char lllllIlIlIlIlll = lllllIlIlIIllII[lllllIlIlIIlIlI];
            lllllIlIlIlIlII.append((char)(lllllIlIlIlIlll ^ lllllIlIlIlIIll[lllllIlIlIlIIlI % lllllIlIlIlIIll.length]));
            0;
            ++lllllIlIlIlIIlI;
            ++lllllIlIlIIlIlI;
            0;
            if (3 > 1) continue;
            return null;
        }
        return String.valueOf(lllllIlIlIlIlII);
    }
}
