/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.L;
import c.r.m.k;
import c.r.m.m;
import c.r.m.p;
import c.r.m.r;
import c.r.m.s;
import c.r.m.t;
import c.r.m.y;
import com.google.common.io.ByteStreams;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import net.runelite.launcher.Launcher;
import net.runelite.launcher.LauncherProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class q
extends JPanel {
    public static final /* synthetic */ File an;
    private static /* synthetic */ String[] llIllI;
    private static /* synthetic */ int[] llIlll;
    private static final /* synthetic */ Dimension ar;
    private static final /* synthetic */ String as;
    private static final /* synthetic */ String au;
    private static final /* synthetic */ String at;
    private static final /* synthetic */ Logger am;
    private static final /* synthetic */ BufferedImage aq;
    static final /* synthetic */ Dimension ao;
    private static final /* synthetic */ Color ap;

    private static String llIlIIl(String llllIlllIIlIlII, String llllIlllIIlIIll) {
        llllIlllIIlIlII = new String(Base64.getDecoder().decode(llllIlllIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlllIIlIIlI = new StringBuilder();
        char[] llllIlllIIlIIIl = llllIlllIIlIIll.toCharArray();
        int llllIlllIIlIIII = llIlll[2];
        char[] llllIlllIIIlIlI = llllIlllIIlIlII.toCharArray();
        int llllIlllIIIlIIl = llllIlllIIIlIlI.length;
        int llllIlllIIIlIII = llIlll[2];
        while (q.lllIIII(llllIlllIIIlIII, llllIlllIIIlIIl)) {
            char llllIlllIIlIlIl = llllIlllIIIlIlI[llllIlllIIIlIII];
            llllIlllIIlIIlI.append((char)(llllIlllIIlIlIl ^ llllIlllIIlIIIl[llllIlllIIlIIII % llllIlllIIlIIIl.length]));
            "".length();
            ++llllIlllIIlIIII;
            ++llllIlllIIIlIII;
            "".length();
            if (((0x57 ^ 4) & ~(0xC2 ^ 0x91)) != "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllIlllIIlIIlI);
    }

    /*
     * WARNING - void declaration
     */
    q(String string) {
        void llllIllllIIlIII;
        void llllIllllIIIlll;
        q llllIllllIIlIIl;
        void llllIllllIIIllI;
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(ao);
        this.setBackground(new Color(llIlll[0], llIlll[0], llIlll[0]));
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = llIlll[1];
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridx = llIlll[2];
        gridBagConstraints.gridy = llIlll[2];
        gridBagConstraints.ipady = llIlll[3];
        ImageIcon imageIcon = new ImageIcon();
        if (q.llIllIl(aq)) {
            imageIcon.setImage(aq.getScaledInstance(llIlll[4], llIlll[4], llIlll[5]));
        }
        JLabel llllIllllIIIlIl = new JLabel((Icon)llllIllllIIIllI);
        llllIllllIIIlll.anchor = llIlll[6];
        llllIllllIIIlll.weighty = 1.0;
        llllIllllIIlIIl.add((Component)llllIllllIIIlIl, llllIllllIIIlll);
        llllIllllIIIlll.gridy += llIlll[7];
        llllIllllIIIlll.anchor = llIlll[8];
        llllIllllIIIlll.weighty = 0.0;
        llllIllllIIlIIl.add((Component)q.b("Launcher Version: " + LauncherProperties.getVersion()), llllIllllIIIlll);
        llllIllllIIIlll.gridy += llIlll[7];
        if (q.llIllIl(llllIllllIIlIII)) {
            llllIllllIIlIIl.add((Component)q.b("Mode: " + (String)llllIllllIIlIII), llllIllllIIIlll);
            llllIllllIIIlll.gridy += llIlll[7];
        }
        JLabel llllIllllIIIlII = q.a(llIllI[llIlll[2]], null, () -> {
            y.c(Launcher.aJ);
            "".length();
        });
        llllIllllIIlIIl.add((Component)llllIllllIIIlII, llllIllllIIIlll);
        llllIllllIIIlll.gridy += llIlll[7];
        JLabel llllIllllIIIIll = q.a(llIllI[llIlll[7]], llIllI[llIlll[1]], () -> {
            y.e(llIllI[llIlll[20]]);
            "".length();
        });
        llllIllllIIlIIl.add((Component)llllIllllIIIIll, llllIllllIIIlll);
        llllIllllIIIlll.gridy += llIlll[7];
        JLabel llllIllllIIIIlI = q.a(llIllI[llIlll[9]], llIllI[llIlll[5]], () -> {
            y.e(llIllI[llIlll[19]]);
            "".length();
        });
        llllIllllIIlIIl.add((Component)llllIllllIIIIlI, llllIllllIIIlll);
        llllIllllIIIlll.gridy += llIlll[7];
        JLabel llllIllllIIIIIl = q.a(llIllI[llIlll[3]], llIllI[llIlll[10]], () -> System.exit(llIlll[2]));
        llllIllllIIlIIl.add((Component)llllIllllIIIIIl, llllIllllIIIlll);
        llllIllllIIIlll.gridy += llIlll[7];
        JTextField llllIllllIIIIII = llllIllllIIlIIl.d();
        if (q.llIllIl(llllIllllIIIIII)) {
            JLabel llllIlllIllllll = q.a(llIllI[llIlll[11]], llIllI[llIlll[12]], () -> {});
            llllIllllIIlIIl.add((Component)llllIlllIllllll, llllIllllIIIlll);
            llllIllllIIIlll.gridy += llIlll[7];
            llllIllllIIlIIl.add((Component)llllIllllIIIIII, llllIllllIIIlll);
            llllIllllIIIlll.gridy += llIlll[7];
            "".length();
            if (-" ".length() >= (154 + 122 - 124 + 9 ^ 152 + 30 - 116 + 99)) {
                throw null;
            }
        } else {
            Launcher.aM = q.e();
        }
    }

    private static void llIllII() {
        llIlll = new int[30];
        q.llIlll[0] = 156 + 86 - 228 + 217 ^ 161 + 157 - 195 + 70;
        q.llIlll[1] = "  ".length();
        q.llIlll[2] = (0x80 ^ 0x94) & ~(0x37 ^ 0x23);
        q.llIlll[3] = 0x36 ^ 0x33;
        q.llIlll[4] = (0 ^ 0x72) + (0xFB ^ 0xC6) - (122 + 77 - 68 + 29) + (0xF ^ 0x7E);
        q.llIlll[5] = 0xBF ^ 0xC5 ^ (0x39 ^ 0x47);
        q.llIlll[6] = 0x26 ^ 0x2D;
        q.llIlll[7] = " ".length();
        q.llIlll[8] = 20 + 128 - -29 + 29 ^ 112 + 117 - 70 + 34;
        q.llIlll[9] = "   ".length();
        q.llIlll[10] = 0x1B ^ 0x1D;
        q.llIlll[11] = 0x49 ^ 0x4E;
        q.llIlll[12] = 0x44 ^ 0x51 ^ (0x74 ^ 0x69);
        q.llIlll[13] = 24 + 80 - -54 + 12 ^ 146 + 93 - 189 + 113;
        q.llIlll[14] = 0xB5 ^ 0xBF;
        q.llIlll[15] = 0x6E ^ 0x62;
        q.llIlll[16] = 0x35 ^ 0x38;
        q.llIlll[17] = 0x15 ^ 0xF ^ (0x94 ^ 0x80);
        q.llIlll[18] = 0x81 ^ 0x99;
        q.llIlll[19] = 0x8D ^ 0x9D;
        q.llIlll[20] = 0x3F ^ 0x2E;
        q.llIlll[21] = 6 ^ 0x14;
        q.llIlll[22] = 0x4F ^ 0x50 ^ (0xCB ^ 0xC7);
        q.llIlll[23] = 47 + 131 - 151 + 137 ^ 42 + 28 - -61 + 45;
        q.llIlll[24] = 0x5D ^ 0x64 ^ (0x2D ^ 1);
        q.llIlll[25] = 139 + 153 - 209 + 102 + (0x6D ^ 3) - (0xFFFF9FFF & 0x611E) + (13 + 0 - -105 + 73);
        q.llIlll[26] = 41 + 137 - 119 + 101 + (110 + 61 - 103 + 99) - (0xCB ^ 0xB0) + (0x37 ^ 4);
        q.llIlll[27] = 0x94 ^ 0xB6 ^ (0x9B ^ 0xAF);
        q.llIlll[28] = 0xA1 ^ 0xB8;
        q.llIlll[29] = 0x29 ^ 0x46 ^ (0x11 ^ 0x69);
    }

    private static String llIlIlI(String llllIllIlllllll, String llllIllIlllllII) {
        try {
            SecretKeySpec llllIlllIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllIlllllII.getBytes(StandardCharsets.UTF_8)), llIlll[12]), "DES");
            Cipher llllIlllIIIIIIl = Cipher.getInstance("DES");
            llllIlllIIIIIIl.init(llIlll[1], llllIlllIIIIIlI);
            return new String(llllIlllIIIIIIl.doFinal(Base64.getDecoder().decode(llllIllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlllIIIIIII) {
            llllIlllIIIIIII.printStackTrace();
            return null;
        }
    }

    private static void llIlIll() {
        llIllI = new String[llIlll[29]];
        q.llIllI[q.llIlll[2]] = q.llIlIII("vJsabgLP4PZkWC73gnEurF1ZSgLec5AD", "xTspd");
        q.llIllI[q.llIlll[7]] = q.llIlIII("gxSyocqk2KybgiJPNWRPm4DgANiFzKhA", "plkER");
        q.llIllI[q.llIlll[1]] = q.llIlIIl("HBglJwQ7AnY6CyMfIjZFOR84OEUhGXY5CjwYdicNMFYFIhA8BDNzATwFNTwXMQ==", "UvVSe");
        q.llIllI[q.llIlll[9]] = q.llIlIIl("JyY9GQMfMSEEDhwgOwIGUycmCREA", "sTRla");
        q.llIllI[q.llIlll[5]] = q.llIlIlI("dSrhFnsXS/UHvoBdUfxW3m6U9pNHPGBB+IEjI7fC+M6dvrnd7pdB+n4cKkFe8c8n", "dTsBj");
        q.llIllI[q.llIlll[3]] = q.llIlIIl("AzolLA==", "FBLXd");
        q.llIllI[q.llIlll[10]] = q.llIlIlI("3Nw1E+b68jsvAjuYAE2n4/Sx2nSORyuXGwmlbsNocliiP9L7lCWW0A==", "YrOlu");
        q.llIllI[q.llIlll[11]] = q.llIlIlI("/Onx6WskZAKqnloUpvhnHutuNXezlufT", "dLGpO");
        q.llIllI[q.llIlll[12]] = q.llIlIlI("mFA/bw9eTa4k0Ap3GiUF9+WCBSP0aurCB1y7Q4pZl1A=", "LWXuw");
        q.llIllI[q.llIlll[13]] = q.llIlIlI("plGxw83ZL+VwZP2c+waUfOUaKt5XRvsH68E7Gj194JS8VynG//yqcOqitSbzEYbR6DHWC1IibPk7KTJpYrX74sCqDU+Q6peiEpDGpkD/sh/WPLGgMQusMg==", "vXsAE");
        q.llIllI[q.llIlll[14]] = q.llIlIIl("DRk3NmQZDTcqPQ==", "XjRDI");
        q.llIllI[q.llIlll[6]] = q.llIlIIl("NzIYIjkuOUpscGZ/NjUrcCpDf3gdMxFgLWh5Qg00OmYXeHc=", "AWjQP");
        q.llIllI[q.llIlll[15]] = q.llIlIII("1MST0Jy9c62PoRgTdsjekQ==", "dCaWI");
        q.llIllI[q.llIlll[16]] = q.llIlIIl("Q10=", "nlYLZ");
        q.llIllI[q.llIlll[17]] = q.llIlIlI("RHVg9/vnvJA=", "mQfBh");
        q.llIllI[q.llIlll[8]] = q.llIlIIl("", "ftjuQ");
        q.llIllI[q.llIlll[19]] = q.llIlIIl("LwUbPBB9XkArCjMZGi5NJB4CYxEyHwogCjMUQD4WKRQDJRciXhglCC5eOz4MMhMDKRAvHgA4CikWQjwRKBMDKQ40XBglFy9cGyQGahIDJQYpBQ==", "GqoLc");
        q.llIllI[q.llIlll[20]] = q.llIlIlI("WmsSv7tU2SHtkAd0Vl80hynz2Z3CKgIX6fwT0vllzdI=", "ngwDn");
        q.llIllI[q.llIlll[21]] = q.llIlIIl("GzMdMwBJaEYnGgAkBjEXXSAObAACMgAxFhw0", "sGiCs");
        q.llIllI[q.llIlll[22]] = q.llIlIIl("OQwYPjprV0MqICIbAzwtfx8LYTogDQU8LD4L", "QxlNI");
        q.llIllI[q.llIlll[23]] = q.llIlIlI("edPYKkwrtnKMdLoXuJ/z15pcq5Qpi5GVyWkZw7Hhr02db05g6xavQAm2k3kIKp+xx/ua4DxjKihZd0VpQKJ6DusbtSV8d/jI1ksdAd8FnLm+rsKhlJGSFg==", "ePVEk");
        q.llIllI[q.llIlll[24]] = q.llIlIIl("GiIEIn4HPgw1", "oQaPP");
        q.llIllI[q.llIlll[27]] = q.llIlIIl("FDwlJjQCYyAhIQ==", "gMPOF");
    }

    private static JLabel b(String string) {
        JLabel jLabel = new JLabel(string);
        jLabel.setFont(m.o());
        jLabel.setHorizontalAlignment(llIlll[2]);
        jLabel.setForeground(k.Z);
        jLabel.setBackground(null);
        jLabel.setPreferredSize(ar);
        jLabel.setMinimumSize(ar);
        jLabel.setBorder(new MatteBorder(llIlll[7], llIlll[2], llIlll[2], llIlll[2], ap));
        return jLabel;
    }

    private static boolean llIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIllll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String e() {
        File file = new File(an, llIllI[llIlll[17]]);
        if (q.llIllll(file.exists() ? 1 : 0)) {
            return null;
        }
        try {
            void llllIlllIlIlIII;
            Scanner llllIlllIlIIlll = new Scanner((File)llllIlllIlIlIII);
            try {
                if (q.llIllll(llllIlllIlIIlll.hasNextLine() ? 1 : 0)) {
                    String llllIlllIlIIllI222 = llIllI[llIlll[8]];
                    llllIlllIlIIlll.close();
                    return llllIlllIlIIllI222;
                }
            }
            catch (Throwable llllIlllIlIIllI222) {
                try {
                    llllIlllIlIIlll.close();
                    "".length();
                }
                catch (Throwable llllIlllIlIIlIl) {
                    llllIlllIlIIllI222.addSuppressed(llllIlllIlIIlIl);
                    throw llllIlllIlIIllI222;
                }
                if ("  ".length() > 0) throw llllIlllIlIIllI222;
                return null;
            }
            {
                String llllIlllIlIIllI222 = llllIlllIlIIlll.nextLine();
                llllIlllIlIIlll.close();
                return llllIlllIlIIllI222;
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public JTextField d() {
        String string = q.e();
        if (q.llIllIl(string)) {
            return null;
        }
        JTextField jTextField = new JTextField();
        jTextField.setForeground(k.ac);
        jTextField.setCaretColor(k.ac);
        jTextField.setBackground(k.Z);
        jTextField.setPreferredSize(new Dimension(llIlll[18], llIlll[18]));
        jTextField.setMinimumSize(new Dimension(llIlll[18], llIlll[18]));
        jTextField.setBorder(new CompoundBorder(new MatteBorder(llIlll[7], llIlll[2], llIlll[2], llIlll[2], k.ab), new EmptyBorder(llIlll[2], llIlll[8], llIlll[2], llIlll[8])));
        jTextField.addKeyListener(new t(this, jTextField));
        return jTextField;
    }

    private static String llIlIII(String llllIllIlllIIlI, String llllIllIlllIIIl) {
        try {
            SecretKeySpec llllIllIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIllIlllIlII = Cipher.getInstance("Blowfish");
            llllIllIlllIlII.init(llIlll[1], llllIllIlllIlIl);
            return new String(llllIllIlllIlII.doFinal(Base64.getDecoder().decode(llllIllIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIlllIIll) {
            llllIllIlllIIll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String p() {
        try {
            String llllIlllIlIllIl;
            URL llllIlllIllIlIl = new URL(llIllI[llIlll[13]]);
            URLConnection llllIlllIllIlII = llllIlllIllIlIl.openConnection();
            llllIlllIllIlII.setRequestProperty(llIllI[llIlll[14]], Launcher.aG);
            InputStream llllIlllIllIIll = llllIlllIllIlII.getInputStream();
            try {
                String llllIlllIlIllll;
                byte[] llllIlllIllIIlI = ByteStreams.toByteArray(llllIlllIllIIll);
                Pattern llllIlllIllIIIl = Pattern.compile(llIllI[llIlll[6]]);
                BufferedReader llllIlllIllIIII = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(llllIlllIllIIlI)));
                while (q.llIllIl(llllIlllIlIllll = llllIlllIllIIII.readLine())) {
                    Matcher llllIlllIlIlllI = llllIlllIllIIIl.matcher(llllIlllIlIllll);
                    if (!q.llIlllI(llllIlllIlIlllI.find() ? 1 : 0)) break block9;
                    Object[] objectArray = new Object[llIlll[9]];
                    objectArray[q.llIlll[2]] = llllIlllIlIlllI.group(llIlll[7]);
                    objectArray[q.llIlll[7]] = llllIlllIlIlllI.group(llIlll[1]);
                    objectArray[q.llIlll[1]] = llllIlllIlIlllI.group(llIlll[9]);
                    llllIlllIlIllIl = String.format(llIllI[llIlll[15]], objectArray);
                }
            }
            catch (Throwable llllIlllIllIIlI) {
                if (!q.llIllIl(llllIlllIllIIll)) throw llllIlllIllIIlI;
                try {
                    llllIlllIllIIll.close();
                    "".length();
                }
                catch (Throwable llllIlllIllIIIl) {
                    llllIlllIllIIlI.addSuppressed(llllIlllIllIIIl);
                }
                if ("   ".length() != " ".length()) throw llllIlllIllIIlI;
                return null;
                throw llllIlllIllIIlI;
            }
            {
                block9: {
                    if (!q.llIllIl(llllIlllIllIIll)) return llllIlllIlIllIl;
                    llllIlllIllIIll.close();
                    return llllIlllIlIllIl;
                }
                "".length();
                continue;
            }
            if (q.llIllIl(llllIlllIllIIll)) {
                llllIlllIllIIll.close();
                "".length();
            }
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return llIllI[llIlll[16]];
    }

    static {
        q.llIllII();
        q.llIlIll();
        au = llIllI[llIlll[21]];
        at = llIllI[llIlll[22]];
        as = llIllI[llIlll[23]];
        am = LoggerFactory.getLogger(q.class);
        an = new File(System.getProperty(llIllI[llIlll[24]]) + "/.squire/");
        ao = new Dimension(llIlll[25], L.bx.height);
        ap = new Color(llIlll[14], llIlll[14], llIlll[14], llIlll[26]);
        aq = p.a(Launcher.class, llIllI[llIlll[27]]);
        ar = new Dimension(q.ao.width, llIlll[28]);
    }

    private static JLabel a(String string, String string2, Runnable runnable) {
        JLabel jLabel = new JLabel(string, llIlll[2]);
        jLabel.setToolTipText(string2);
        jLabel.setOpaque(llIlll[7]);
        jLabel.setBackground(null);
        jLabel.setForeground(Color.WHITE);
        jLabel.setFont(m.j());
        jLabel.setBorder(new CompoundBorder(new MatteBorder(llIlll[7], llIlll[2], llIlll[2], llIlll[2], ap), new EmptyBorder(llIlll[9], llIlll[2], llIlll[9], llIlll[2])));
        jLabel.setCursor(Cursor.getPredefinedCursor(llIlll[15]));
        jLabel.addMouseListener(new s(runnable, jLabel));
        return jLabel;
    }

    private static JLabel a(String string, Runnable runnable) {
        JLabel jLabel = new JLabel(string);
        jLabel.setFont(m.o());
        jLabel.setHorizontalAlignment(llIlll[2]);
        jLabel.setForeground(k.af);
        jLabel.setBackground(null);
        jLabel.setPreferredSize(ar);
        jLabel.setMinimumSize(ar);
        jLabel.setBorder(new MatteBorder(llIlll[7], llIlll[2], llIlll[2], llIlll[2], ap));
        jLabel.setCursor(Cursor.getPredefinedCursor(llIlll[15]));
        jLabel.addMouseListener(new r(runnable, jLabel));
        return jLabel;
    }

    private static boolean lllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIl(Object object) {
        return object != null;
    }
}
