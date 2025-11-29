/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.ui.LogoPanel;
import squire.ui.ComboBoxEditor;
import squire.config.ConfigManager;
import java.awt.Color;
import java.awt.Component;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImagePanel {
    private static /* synthetic */ int[] llIl;
    private static /* synthetic */ String[] llII;

    static {
        i.llll();
        i.lllI();
    }

    private static String llIl(String llllllllIIIIIll, String llllllllIIIIIlI) {
        llllllllIIIIIll = new String(Base64.getDecoder().decode(llllllllIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllIIIIllI = new StringBuilder();
        char[] llllllllIIIIlIl = llllllllIIIIIlI.toCharArray();
        int llllllllIIIIlII = llIl[1];
        char[] lllllllIllllllI = llllllllIIIIIll.toCharArray();
        int lllllllIlllllIl = lllllllIllllllI.length;
        int lllllllIlllllII = llIl[1];
        while (i.lIIII(lllllllIlllllII, lllllllIlllllIl)) {
            char llllllllIIIlIIl = lllllllIllllllI[lllllllIlllllII];
            llllllllIIIIllI.append((char)(llllllllIIIlIIl ^ llllllllIIIIlIl[llllllllIIIIlII % llllllllIIIIlIl.length]));
            0;
            ++llllllllIIIIlII;
            ++lllllllIlllllII;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(llllllllIIIIllI);
    }

    public static void main(String[] stringArray) {
        Color[] colorArray = new Color[llIl[0]];
        colorArray[i.llIl[1]] = Color.BLACK;
        colorArray[i.llIl[2]] = Color.BLUE;
        colorArray[i.llIl[3]] = Color.GREEN;
        colorArray[i.llIl[4]] = Color.RED;
        colorArray[i.llIl[5]] = Color.WHITE;
        colorArray[i.llIl[6]] = Color.YELLOW;
        Color[] colorArray2 = colorArray;
        JFrame jFrame = new JFrame(llII[llIl[1]]);
        jFrame.setDefaultCloseOperation(llIl[4]);
        JComboBox<Color> jComboBox = new JComboBox<Color>(colorArray2);
        jComboBox.setEditable(llIl[2]);
        jComboBox.setRenderer(new f());
        Color color = (Color)jComboBox.getSelectedItem();
        g g2 = new g(color);
        jComboBox.setEditor(g2);
        jFrame.add(jComboBox, llII[llIl[2]]);
        JLabel jLabel = new JLabel();
        jLabel.setOpaque(llIl[2]);
        jLabel.setBackground((Color)jComboBox.getSelectedItem());
        jFrame.add((Component)jLabel, llII[llIl[3]]);
        j j2 = new j(jComboBox, jLabel);
        jComboBox.addActionListener(j2);
        jFrame.setSize(llIl[7], llIl[8]);
        jFrame.setVisible(llIl[2]);
    }

    private static void lllI() {
        llII = new String[llIl[4]];
        i.llII[i.llIl[1]] = i."Color JComboBox";
        i.llII[i.llIl[2]] = i."North";
        i.llII[i.llIl[3]] = i."Center";
    }

    private static boolean lIIII(int n, int n2) {
        return n < n2;
    }

    private static String llII(String llllllllIIllIII, String llllllllIIlIlll) {
        try {
            SecretKeySpec llllllllIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllIIllIlI = Cipher.getInstance("Blowfish");
            llllllllIIllIlI.init(llIl[3], llllllllIIllIll);
            return new String(llllllllIIllIlI.doFinal(Base64.getDecoder().decode(llllllllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllIIllIIl) {
            llllllllIIllIIl.printStackTrace();
            return null;
        }
    }

    private static void llll() {
        llIl = new int[9];
        i.llIl[0] = 0xB0 ^ 0xB6;
        i.llIl[1] = (0xF6 ^ 0xBC ^ (0x37 ^ 0x3A)) & (0x1E ^ 0x27 ^ (0x4C ^ 0x32) ^ -1);
        i.llIl[2] = 1;
        i.llIl[3] = 2;
        i.llIl[4] = 3;
        i.llIl[5] = 0x92 ^ 0x96;
        i.llIl[6] = 0x57 ^ 0x62 ^ (0xA8 ^ 0x98);
        i.llIl[7] = -(0xFFFFFE59 & 0x2DB7) & (0xFFFFBF7F & 0x6DBC);
        i.llIl[8] = (0x32 ^ 0x57) + (0x20 ^ 0x15) - (77 + 115 - 97 + 49) + (17 + 161 - 116 + 128);
    }
}
