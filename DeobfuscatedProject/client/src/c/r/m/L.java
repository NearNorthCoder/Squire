/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.c;
import c.r.m.k;
import c.r.m.p;
import c.r.m.q;
import c.r.m.z;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import net.runelite.launcher.Launcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class L
extends JFrame {
    private static final /* synthetic */ Logger bw;
    static final /* synthetic */ Dimension bx;
    private static /* synthetic */ int[] lIlII;
    private static /* synthetic */ String[] llll;
    private final /* synthetic */ c bA;
    public static /* synthetic */ File A;
    private /* synthetic */ z bz;
    private static /* synthetic */ L by;

    private static boolean lIIllI(int n) {
        return n == 0;
    }

    private void o(String string) {
        boolean bl;
        JProgressBar jProgressBar = this.bz.P();
        jProgressBar.setString(string);
        if (L.lIIlll(string)) {
            bl = lIlII[2];
            "".length();
            if ((71 + 68 - 132 + 133 ^ 55 + 127 - 151 + 105) == ((0xBC ^ 0xC7 ^ (0x90 ^ 0xBB)) & (0x9A ^ 0x85 ^ (0x55 ^ 0x1A) ^ -" ".length()))) {
                return;
            }
        } else {
            bl = lIlII[0];
        }
        jProgressBar.setStringPainted(bl);
        jProgressBar.revalidate();
        jProgressBar.repaint();
    }

    public static L S() {
        return by;
    }

    static {
        L.lIIlIl();
        L.lIlll();
        bw = LoggerFactory.getLogger(L.class);
        bx = new Dimension(lIlII[13], lIlII[14]);
    }

    public static void h(String string, String string2) {
        if (L.lIIlll(by)) {
            by.i(string, string2);
        }
    }

    public static void K() {
        if (L.lIIlll(by)) {
            L.by.bz.K();
        }
    }

    private static String lIlIl(String llllllIllIlIlII, String llllllIllIlIIIl) {
        try {
            SecretKeySpec llllllIllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIlII[8]), "DES");
            Cipher llllllIllIlIllI = Cipher.getInstance("DES");
            llllllIllIlIllI.init(lIlII[1], llllllIllIlIlll);
            return new String(llllllIllIlIllI.doFinal(Base64.getDecoder().decode(llllllIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIllIlIlIl) {
            llllllIllIlIlIl.printStackTrace();
            return null;
        }
    }

    private void i(String string, String string2) {
        this.bz.h(string2);
        this.bz.i(llll[lIlII[8]]);
        this.bz.O().setText(string);
        this.bz.P().setBackground(k.af.darker());
        this.bz.P().setForeground(k.af);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }

    private static void lIIlIl() {
        lIlII = new int[16];
        L.lIlII[0] = (0 ^ 0x4E) & ~(0xE9 ^ 0xA7);
        L.lIlII[1] = "  ".length();
        L.lIlII[2] = " ".length();
        L.lIlII[3] = "   ".length();
        L.lIlII[4] = 0x50 ^ 0x35 ^ (0x2F ^ 0x4E);
        L.lIlII[5] = 82 + 57 - 15 + 62 ^ 8 + 21 - -68 + 94;
        L.lIlII[6] = 0xB0 ^ 0xB6;
        L.lIlII[7] = 0xAC ^ 0xAB;
        L.lIlII[8] = 136 + 53 - 53 + 43 ^ 147 + 76 - 194 + 158;
        L.lIlII[9] = 0xFFFF8FEE & 0x73F9;
        L.lIlII[10] = 0x24 ^ 0x2D;
        L.lIlII[11] = 173 + 1 - 68 + 84 ^ 64 + 98 - -11 + 7;
        L.lIlII[12] = 0xB2 ^ 0xAA ^ (0xBF ^ 0xAC);
        L.lIlII[13] = -(0xFFFFBD95 & 0x576F) & (0xFFFF9F7F & 0x77DC);
        L.lIlII[14] = -(0xFFFFFDE3 & 0x1EBE) & (0xFFFFDDFF & 0x3FFF);
        L.lIlII[15] = 177 + 107 - 143 + 43 ^ 13 + 20 - -88 + 59;
    }

    private static boolean lIlIIl(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(double d, double d2, String string, int n, int n2, boolean bl) {
        String string2;
        if (L.lIlIIl(bl ? 1 : 0)) {
            double d3 = 1000000.0;
            Object[] objectArray = new Object[lIlII[1]];
            objectArray[L.lIlII[0]] = (double)n / 1000000.0;
            objectArray[L.lIlII[2]] = (double)n2 / 1000000.0;
            string2 = String.format(llll[lIlII[6]], objectArray);
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        } else {
            void llllllIllllIlIl;
            void llllllIllllIllI;
            String llllllIllllIIll = (int)llllllIllllIllI + " / " + (int)llllllIllllIlIl;
        }
        L.a(d + (d2 - d) * (double)n / (double)n2, string + " " + string2);
    }

    public static void a(double d, String string) {
        if (L.lIIlll(by)) {
            by.a(string, d);
        }
    }

    private static boolean lIlIll(int n, int n2) {
        return n < n2;
    }

    public static void m(String string) {
        if (L.lIIlll(by)) {
            L.by.bz.h(string);
        }
    }

    public static JButton n(String string) {
        if (L.lIIlll(by)) {
            return L.by.bz.g(string, llll[lIlII[7]]);
        }
        return null;
    }

    private static String lIllI(String llllllIllIIIlll, String llllllIllIIIlII) {
        try {
            SecretKeySpec llllllIllIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIllIIlIIl = Cipher.getInstance("Blowfish");
            llllllIllIIlIIl.init(lIlII[1], llllllIllIIlIlI);
            return new String(llllllIllIIlIIl.doFinal(Base64.getDecoder().decode(llllllIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIllIIlIII) {
            llllllIllIIlIII.printStackTrace();
            return null;
        }
    }

    private static String lIlII(String llllllIlIllIlll, String llllllIlIllIIIl) {
        llllllIlIllIlll = new String(Base64.getDecoder().decode(llllllIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIlIllIlIl = new StringBuilder();
        char[] llllllIlIllIlII = llllllIlIllIIIl.toCharArray();
        int llllllIlIllIIll = lIlII[0];
        char[] llllllIlIlIllIl = llllllIlIllIlll.toCharArray();
        int llllllIlIlIllII = llllllIlIlIllIl.length;
        int llllllIlIlIlIll = lIlII[0];
        while (L.lIlIll(llllllIlIlIlIll, llllllIlIlIllII)) {
            char llllllIlIlllIII = llllllIlIlIllIl[llllllIlIlIlIll];
            llllllIlIllIlIl.append((char)(llllllIlIlllIII ^ llllllIlIllIlII[llllllIlIllIIll % llllllIlIllIlII.length]));
            "".length();
            ++llllllIlIllIIll;
            ++llllllIlIlIlIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllIlIllIlIl);
    }

    private static boolean lIIlll(Object object) {
        return object != null;
    }

    private static boolean lIlIlI(Object object) {
        return object == null;
    }

    public static void l(String string) {
        if (L.lIIlll(by)) {
            by.a(string, 0.0);
        }
    }

    /*
     * WARNING - void declaration
     */
    private L(String string, boolean bl) {
        this.bA = new c();
        this.setTitle(llll[lIlII[0]]);
        this.setDefaultCloseOperation(lIlII[1]);
        this.setSize(bx);
        this.setLayout(new BorderLayout());
        this.setUndecorated(lIlII[2]);
        this.setIconImage(p.a(Launcher.class, llll[lIlII[2]]));
        this.bz = new z(llll[lIlII[1]].equals(string));
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.setPreferredSize(bx);
        if (L.lIIllI(bl ? 1 : 0)) {
            jPanel.add((Component)this.bA, llll[lIlII[3]]);
            "".length();
            if (" ".length() < -" ".length()) {
                throw null;
            }
        } else {
            L lllllllIIIIllIl;
            void lllllllIIIIllII;
            void lllllllIIIIlIlI;
            lllllllIIIIlIlI.add((Component)new q((String)lllllllIIIIllII), llll[lIlII[4]]);
            lllllllIIIIlIlI.add((Component)lllllllIIIIllIl.bz, llll[lIlII[5]]);
        }
        this.setContentPane(jPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(lIlII[2]);
    }

    public static void close() {
        SwingUtilities.invokeLater(() -> {
            if (L.lIlIlI(by)) {
                return;
            }
            by.setDefaultCloseOperation(lIlII[0]);
            by.setVisible(lIlII[0]);
            by.dispose();
            by = null;
        });
    }

    public static void k(String lllllllIIIIIIll) {
        try {
            SwingUtilities.invokeAndWait(() -> {
                if (L.lIIlll(by)) {
                    return;
                }
                try {
                    String llllllIllIllllI;
                    File llllllIllIlllIl = new File(System.getProperty(llll[lIlII[10]]) + "/.squire/");
                    File llllllIllIlllII = new File(llllllIllIlllIl, llll[lIlII[11]]);
                    by = new L(llllllIllIllllI, llllllIllIlllII.exists());
                    "".length();
                }
                catch (Exception llllllIllIlllIl) {
                    bw.warn(llll[lIlII[12]], llllllIllIlllIl);
                }
                if (-" ".length() > "  ".length()) {
                    return;
                }
            });
            "".length();
        }
        catch (InterruptedException | InvocationTargetException lllllllIIIIIIlI) {
            throw new RuntimeException(lllllllIIIIIIlI);
        }
        if (" ".length() != " ".length()) {
            return;
        }
    }

    private static void lIlll() {
        llll = new String[lIlII[15]];
        L.llll[L.lIlII[0]] = L.lIlII("JBYlChMS", "wgPca");
        L.llll[L.lIlII[2]] = L.lIlIl("eUgYfGGFKBCBfUYweBfg5Q==", "NOiRS");
        L.llll[L.lIlII[1]] = L.lIlII("BxcnCSYgGyULZTURKAMwOgY=", "TrKlE");
        L.llll[L.lIlII[3]] = L.lIllI("LVT2ORCx8aU=", "KmakU");
        L.llll[L.lIlII[4]] = L.lIlIl("dXRVM10FIM8=", "RTknS");
        L.llll[L.lIlII[5]] = L.lIlIl("jq/F7xCVu7o=", "SGKHx");
        L.llll[L.lIlII[6]] = L.lIllI("JmXa0UwOeYoerP96f46J3A==", "ySLrm");
        L.llll[L.lIlII[7]] = L.lIlIl("E9VjeZc3bfk=", "nzFeR");
        L.llll[L.lIlII[8]] = L.lIlII("Ax8gJDdn", "FmRKE");
        L.llll[L.lIlII[10]] = L.lIlIl("3/dqc/fXDZHZkvk8TpxWwg==", "QwsIB");
        L.llll[L.lIlII[11]] = L.lIlIl("PYkqraZf6f8=", "JRhJw");
        L.llll[L.lIlII[12]] = L.lIllI("b1rNMyvAEiKjwsDOeA+oa39GGPOhyvVanefT/BT8lX0=", "PkzFb");
    }

    public static void a(double d, double d2, String string, int n, int n2) {
        String string2 = n + " / " + n2;
        L.a(d + (d2 - d) * (double)n / (double)n2, string + " " + string2);
    }

    private void a(String string, double d) {
        this.bz.O().setText(string);
        this.bz.P().setMaximum(lIlII[9]);
        this.bz.P().setValue((int)(d * 1000.0));
        this.o(null);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }
}
