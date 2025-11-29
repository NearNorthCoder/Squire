/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.L;
import c.r.m.d;
import c.r.m.e;
import c.r.m.k;
import c.r.m.l;
import c.r.m.m;
import c.r.m.q;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import net.runelite.launcher.Launcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request$Builder;
import okhttp3.Response;

public class c
extends JPanel {
    private static final /* synthetic */ Dimension C;
    private final /* synthetic */ JLabel G;
    private static /* synthetic */ int[] lllIll;
    public static final /* synthetic */ File A;
    private final /* synthetic */ JPanel N;
    public static final /* synthetic */ Color F;
    static final /* synthetic */ Dimension B;
    private final /* synthetic */ JProgressBar K;
    private static /* synthetic */ String[] lllIlI;
    private static final /* synthetic */ int D;
    private final /* synthetic */ JScrollPane L;
    private final /* synthetic */ JLabel J;

    static {
        c.llllIlI();
        c.llllIIl();
        D = lllIll[19];
        A = new File(System.getProperty(lllIlI[lllIll[3]]) + "/.squire/");
        B = new Dimension(c.r.m.L.bx.width - q.ao.width, c.r.m.L.bx.height);
        C = new Dimension(c.B.width, lllIll[9]);
        F = new Color(lllIll[10], lllIll[10], lllIll[10], lllIll[26]);
    }

    private static String lllIllI(String llllIllIIlIIIlI, String llllIllIIlIIIIl) {
        try {
            SecretKeySpec llllIllIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIllIIlIIllI = Cipher.getInstance("Blowfish");
            llllIllIIlIIllI.init(lllIll[12], llllIllIIlIIlll);
            return new String(llllIllIIlIIllI.doFinal(Base64.getDecoder().decode(llllIllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIIlIIlIl) {
            llllIllIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private JLabel a(String string) {
        e e2 = new e(this, "<html><div style='text-align:center;'>" + string + "</div></html>");
        e2.setFont(new Font(m.j().getName(), m.o().getStyle(), lllIll[15]));
        e2.setForeground(Color.WHITE);
        e2.setBorder(new EmptyBorder(lllIll[0], lllIll[19], lllIll[0], lllIll[19]));
        e2.setHorizontalAlignment(lllIll[0]);
        return e2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String e() {
        File file = new File(A, lllIlI[lllIll[20]]);
        if (c.lllllII(file.exists() ? 1 : 0)) {
            return null;
        }
        try {
            void llllIllIlIIIIIl;
            Scanner llllIllIlIIIIII = new Scanner((File)llllIllIlIIIIIl);
            try {
                if (c.lllllII(llllIllIlIIIIII.hasNextLine() ? 1 : 0)) {
                    String llllIllIIllllll222 = lllIlI[lllIll[11]];
                    llllIllIlIIIIII.close();
                    return llllIllIIllllll222;
                }
            }
            catch (Throwable llllIllIIllllll222) {
                try {
                    llllIllIlIIIIII.close();
                    "".length();
                    throw llllIllIIllllll222;
                }
                catch (Throwable llllIllIIlllllI) {
                    llllIllIIllllll222.addSuppressed(llllIllIIlllllI);
                    throw llllIllIIllllll222;
                }
            }
            {
                String llllIllIIllllll222 = llllIllIlIIIIII.nextLine();
                llllIllIlIIIIII.close();
                return llllIllIIllllll222;
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    private static void llllIlI() {
        lllIll = new int[27];
        c.lllIll[0] = (0x55 ^ 0x6E) & ~(0x80 ^ 0xBB);
        c.lllIll[1] = 0x99 ^ 0xA6 ^ (0x6D ^ 0x36);
        c.lllIll[2] = " ".length();
        c.lllIll[3] = 0x80 ^ 0x8B;
        c.lllIll[4] = 0xD6 ^ 0xAD ^ (0x53 ^ 0x31);
        c.lllIll[5] = 116 + 131 - 192 + 82 ^ 93 + 55 - 41 + 62;
        c.lllIll[6] = 0x38 ^ 0x2C;
        c.lllIll[7] = 0x3C ^ 0x67 ^ (0xB ^ 0x4F);
        c.lllIll[8] = -(0xFFFFBF8A & 0x66F7) & (0xFFFFFFEF & 0x27BD);
        c.lllIll[9] = 0x6E ^ 0x44 ^ (0x2A ^ 0x1E);
        c.lllIll[10] = 0x83 ^ 0x8A ^ "   ".length();
        c.lllIll[11] = 0xC3 ^ 0xC6;
        c.lllIll[12] = "  ".length();
        c.lllIll[13] = 0xC4 ^ 0xBC;
        c.lllIll[14] = 3 ^ 0x2B;
        c.lllIll[15] = 4 ^ 0x67 ^ (0xC1 ^ 0xB2);
        c.lllIll[16] = 0x99 ^ 0x95;
        c.lllIll[17] = "   ".length();
        c.lllIll[18] = 0x63 ^ 4 ^ 105 + 54 - 36 + 4;
        c.lllIll[19] = 0xA9 ^ 0x9C ^ (0x67 ^ 0x5D);
        c.lllIll[20] = 0 ^ 7 ^ "   ".length();
        c.lllIll[21] = 0xF8 ^ 0xBC ^ (0x6E ^ 0x2C);
        c.lllIll[22] = 0xA6 ^ 0xC5 ^ (0x17 ^ 0x73);
        c.lllIll[23] = 15 + 152 - 119 + 110 + (91 + 65 - 78 + 58) - (155 + 217 - 166 + 21) + (74 + 65 - 32 + 26);
        c.lllIll[24] = 0x21 ^ 0x29;
        c.lllIll[25] = 0x4B ^ 0x42;
        c.lllIll[26] = 63 + 65 - -55 + 72;
    }

    private static boolean llllllI(int n, int n2) {
        return n < n2;
    }

    private static void llllIIl() {
        lllIlI = new String[lllIll[16]];
        c.lllIlI[c.lllIll[0]] = c.lllIllI("U5Fl4qxrD6/XC0fBWPLUkQ==", "cbkdi");
        c.lllIlI[c.lllIll[2]] = c.lllIllI("AYNSzXg0bdy96lV6XPdg2Nrl8JTaGCfLfyUl4VbH66R1gh89rCvJ3ixyhyPPgldgtgG+qGGn1U7UWngtAABqnpjjYW9kvd4T", "bzLOs");
        c.lllIlI[c.lllIll[12]] = c.lllIlll("FSMNDwg6IhAEDCAz", "TVygm");
        c.lllIlI[c.lllIll[17]] = c.lllIlll("Ey84Jgki", "PJVRl");
        c.lllIlI[c.lllIll[20]] = c.lllIlll("Dh8xXT0cCw==", "myVsN");
        c.lllIlI[c.lllIll[11]] = c.lllIllI("w17V89KPYaI=", "QAhgx");
        c.lllIlI[c.lllIll[21]] = c.lllIllI("Kj+FVJ+bUeVuxiLNkGfQyPPjxKz4FszwYOu5zsCCC+tZ6983PUJT6umXBDROB7l6ekc9HkhqW5gPLm2KhOLHscSr3pTLCqOlwAdIqp9ZLLKWE2wIM37z9GnhkCxVup6F", "SnDBz");
        c.lllIlI[c.lllIll[22]] = c.llllIII("HYdh2zpYv+MZs1QK5i9e3A==", "bBGmR");
        c.lllIlI[c.lllIll[24]] = c.llllIII("nlI0JI+GAzokSuRdrE5hNIrtq50dGn+fiBGMJh4P3D5v76Eok1ecfA==", "WOROp");
        c.lllIlI[c.lllIll[25]] = c.lllIlll("GSc8Byg5LWonMSQh", "PIJfD");
        c.lllIlI[c.lllIll[10]] = c.lllIllI("tB0yvoDHz2U=", "gvvRw");
        c.lllIlI[c.lllIll[3]] = c.llllIII("kfLdNHZj6rCTeS/cchkpEw==", "slwyT");
    }

    private void a(JTextField llllIllIIllIIll) {
        Object llllIllIIlIllll2;
        Object llllIllIIllIIII2;
        OkHttpClient llllIllIIllIIlI = new OkHttpClient();
        Object[] objectArray = new Object[lllIll[12]];
        objectArray[c.lllIll[0]] = llllIllIIllIIll.getText().trim();
        objectArray[c.lllIll[2]] = lllIlI[lllIll[22]];
        Request llllIllIIllIIIl = new Request$Builder().url(String.format(lllIlI[lllIll[21]], objectArray)).get().build();
        try {
            block22: {
                llllIllIIllIIII2 = llllIllIIllIIlI.newCall(llllIllIIllIIIl).execute();
                try {
                    c llllIllIIllIlII;
                    llllIllIIlIllll2 = ((Response)llllIllIIllIIII2).body();
                    if (!c.lllllIl(((Response)llllIllIIllIIII2).code(), lllIll[23])) break block22;
                    JOptionPane.showMessageDialog(llllIllIIllIlII, lllIlI[lllIll[24]], lllIlI[lllIll[25]], lllIll[0]);
                }
                catch (Throwable llllIllIIlIllll2) {
                    if (c.llllIll(llllIllIIllIIII2)) {
                        try {
                            ((Response)llllIllIIllIIII2).close();
                            "".length();
                        }
                        catch (Throwable llllIllIIlIlllI) {
                            llllIllIIlIllll2.addSuppressed(llllIllIIlIlllI);
                        }
                        if (null != null) {
                            return;
                        }
                    }
                    throw llllIllIIlIllll2;
                }
                if (c.llllIll(llllIllIIllIIII2)) {
                    ((Response)llllIllIIllIIII2).close();
                }
                return;
            }
            if (c.llllIll(llllIllIIllIIII2)) {
                ((Response)llllIllIIllIIII2).close();
                "".length();
                if (null != null) {
                    return;
                }
            }
            "".length();
        }
        catch (IOException llllIllIIllIIII2) {
            return;
        }
        if ((0xB5 ^ 0x9C ^ (0x58 ^ 0x75)) <= 0) {
            return;
        }
        Launcher.aN = lllIll[2];
        c.r.m.L.close();
        llllIllIIllIIII2 = llllIllIIllIIll.getText();
        llllIllIIlIllll2 = new File(A, lllIlI[lllIll[10]]);
        if (c.lllllII(A.exists() ? 1 : 0)) {
            A.mkdirs();
            "".length();
        }
        try {
            ((File)llllIllIIlIllll2).createNewFile();
            "".length();
            FileWriter llllIllIIlIlllI = new FileWriter((File)llllIllIIlIllll2);
            try {
                llllIllIIlIlllI.write(((String)llllIllIIllIIII2).trim());
            }
            catch (Throwable llllIllIIlIllIl) {
                try {
                    llllIllIIlIlllI.close();
                    "".length();
                }
                catch (Throwable llllIllIIlIllII) {
                    llllIllIIlIllIl.addSuppressed(llllIllIIlIllII);
                }
                if (null != null) {
                    return;
                }
                throw llllIllIIlIllIl;
            }
            llllIllIIlIlllI.close();
            "".length();
            if ((0xD8 ^ 0xBF ^ (0xFC ^ 0x9F)) < 0) {
                return;
            }
            "".length();
        }
        catch (IOException llllIllIIlIlllI) {
            llllIllIIlIlllI.printStackTrace();
        }
        if ((50 + 109 - 124 + 162 ^ 77 + 2 - -91 + 23) < "   ".length()) {
            return;
        }
    }

    public c() {
        this.G = new JLabel(lllIlI[lllIll[0]]);
        this.K = new JProgressBar(lllIll[0], lllIll[1]);
        this.setPreferredSize(B);
        this.setLayout(new GridBagLayout());
        this.setBackground(k.ac);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = lllIll[2];
        gridBagConstraints.anchor = lllIll[3];
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridx = lllIll[0];
        gridBagConstraints.gridy = lllIll[0];
        gridBagConstraints.ipady = lllIll[4];
        this.G.setFont(new Font(m.j().getName(), m.j().getStyle(), lllIll[5]));
        this.G.setHorizontalAlignment(lllIll[0]);
        this.G.setForeground(Color.WHITE);
        this.add((Component)this.G, gridBagConstraints);
        gridBagConstraints.gridy += lllIll[2];
        this.J = this.a(lllIlI[lllIll[2]]);
        this.L = new JScrollPane(this.J, lllIll[6], lllIll[7]);
        this.L.setBorder(new EmptyBorder(lllIll[0], lllIll[0], lllIll[0], lllIll[0]));
        this.L.getVerticalScrollBar().setUI(new l());
        JViewport jViewport = this.L.getViewport();
        jViewport.setForeground(Color.WHITE);
        jViewport.setBackground(k.ac);
        jViewport.setOpaque(lllIll[2]);
        gridBagConstraints.weighty = 1.0;
        this.add((Component)this.L, gridBagConstraints);
        JTextField jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(lllIll[8], lllIll[9]));
        jTextField.setBackground(k.ad);
        jTextField.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(), BorderFactory.createEmptyBorder(lllIll[0], lllIll[10], lllIll[0], lllIll[10])));
        jTextField.setCaretColor(Color.WHITE);
        jTextField.setForeground(k.Z);
        JPanel jPanel = new JPanel();
        jPanel.setBackground(k.ac);
        jPanel.add(jTextField);
        "".length();
        gridBagConstraints.gridy += lllIll[2];
        gridBagConstraints.weightx = 0.25;
        this.add((Component)jPanel, gridBagConstraints);
        gridBagConstraints.gridy += lllIll[2];
        this.N = new JPanel();
        this.N.setBorder(new EmptyBorder(lllIll[11], lllIll[10], lllIll[11], lllIll[10]));
        this.N.setBackground(k.ac);
        this.N.setOpaque(lllIll[2]);
        JButton jButton = new JButton(lllIlI[lllIll[12]]);
        jButton.setPreferredSize(new Dimension(lllIll[13], lllIll[14]));
        jButton.setFont(new Font(m.j().getName(), m.o().getStyle(), lllIll[15]));
        jButton.setForeground(Color.WHITE);
        jButton.setOpaque(lllIll[0]);
        jButton.setContentAreaFilled(lllIll[0]);
        jButton.setFocusPainted(lllIll[0]);
        jButton.setBorder(BorderFactory.createLineBorder(k.ab));
        jButton.setCursor(Cursor.getPredefinedCursor(lllIll[16]));
        jButton.addActionListener(actionEvent -> this.a(jTextField));
        this.N.add((Component)jButton, lllIlI[lllIll[17]]);
        this.add((Component)this.N, gridBagConstraints);
        gridBagConstraints.gridy += lllIll[2];
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.ipady = lllIll[11];
        this.K.setBackground(k.aa.darker());
        this.K.setForeground(k.Z);
        this.K.setMinimumSize(C);
        this.K.setMaximumSize(C);
        this.K.setBorder(new MatteBorder(lllIll[0], lllIll[0], lllIll[0], lllIll[0], Color.LIGHT_GRAY));
        this.K.setUI(new d(this));
        this.K.setFont(m.j());
        this.K.setVisible(lllIll[2]);
        this.add((Component)this.K, gridBagConstraints);
        gridBagConstraints.gridy += lllIll[2];
        this.setVisible(lllIll[2]);
    }

    private static String llllIII(String llllIlIllllllll, String llllIlIlllllllI) {
        try {
            SecretKeySpec llllIllIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIlllllllI.getBytes(StandardCharsets.UTF_8)), lllIll[24]), "DES");
            Cipher llllIllIIIIIIIl = Cipher.getInstance("DES");
            llllIllIIIIIIIl.init(lllIll[12], llllIllIIIIIIlI);
            return new String(llllIllIIIIIIIl.doFinal(Base64.getDecoder().decode(llllIlIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIIIIIIII) {
            llllIllIIIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llllIll(Object object) {
        return object != null;
    }

    private static boolean lllllII(int n2) {
        return n2 == 0;
    }

    private static JTextField d() {
        JTextField jTextField = new JTextField();
        jTextField.setForeground(k.ac);
        jTextField.setCaretColor(k.ac);
        jTextField.setPreferredSize(new Dimension(lllIll[18], lllIll[18]));
        jTextField.setMinimumSize(new Dimension(lllIll[18], lllIll[18]));
        jTextField.setBorder(new CompoundBorder(new MatteBorder(lllIll[2], lllIll[0], lllIll[0], lllIll[0], F), new EmptyBorder(lllIll[0], lllIll[19], lllIll[0], lllIll[19])));
        String string = c.e();
        if (c.llllIll(string)) {
            jTextField.setText(string);
        }
        return jTextField;
    }

    public JPanel g() {
        return this.N;
    }

    private static String lllIlll(String llllIllIIIIllll, String llllIllIIIlIIll) {
        llllIllIIIIllll = new String(Base64.getDecoder().decode(llllIllIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIllIIIlIIlI = new StringBuilder();
        char[] llllIllIIIlIIIl = llllIllIIIlIIll.toCharArray();
        int llllIllIIIlIIII = lllIll[0];
        char[] llllIllIIIIlIlI = llllIllIIIIllll.toCharArray();
        int llllIllIIIIlIIl = llllIllIIIIlIlI.length;
        int llllIllIIIIlIII = lllIll[0];
        while (c.llllllI(llllIllIIIIlIII, llllIllIIIIlIIl)) {
            char llllIllIIIlIlIl = llllIllIIIIlIlI[llllIllIIIIlIII];
            llllIllIIIlIIlI.append((char)(llllIllIIIlIlIl ^ llllIllIIIlIIIl[llllIllIIIlIIII % llllIllIIIlIIIl.length]));
            "".length();
            ++llllIllIIIlIIII;
            ++llllIllIIIIlIII;
            "".length();
            if ("  ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(llllIllIIIlIIlI);
    }
}
