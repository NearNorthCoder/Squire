/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.F;
import c.r.m.G;
import com.google.common.base.Strings;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class y {
    private static /* synthetic */ String[] I;
    private static /* synthetic */ boolean aU;
    private static final /* synthetic */ Logger aT;
    private static /* synthetic */ int[] lIll;

    private static String lI(String llllllllIllIIll, String llllllllIllIIlI) {
        try {
            SecretKeySpec llllllllIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllIllIIlI.getBytes(StandardCharsets.UTF_8)), lIll[8]), "DES");
            Cipher llllllllIllIlIl = Cipher.getInstance("DES");
            llllllllIllIlIl.init(lIll[2], llllllllIllIllI);
            return new String(llllllllIllIlIl.doFinal(Base64.getDecoder().decode(llllllllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllIllIlII) {
            llllllllIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIll(int n, int n2) {
        return n < n2;
    }

    private static boolean g(String string) {
        if (y.lIII(Desktop.isDesktopSupported() ? 1 : 0)) {
            return lIll[0];
        }
        Desktop lllllllllllIIIl = Desktop.getDesktop();
        if (y.lIII(lllllllllllIIIl.isSupported(Desktop.Action.BROWSE) ? 1 : 0)) {
            return lIll[0];
        }
        try {
            String lllllllllllIIlI;
            lllllllllllIIIl.browse(new URI(lllllllllllIIlI));
            return lIll[1];
        }
        catch (IOException | URISyntaxException exception) {
            aT.warn(I[lIll[6]], (Object)string, (Object)exception);
            return lIll[0];
        }
    }

    private static boolean lIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIII(int n) {
        return n == 0;
    }

    private static boolean d(File file) {
        if (y.lIII(Desktop.isDesktopSupported() ? 1 : 0)) {
            return lIll[0];
        }
        Desktop llllllllllIlIIl = Desktop.getDesktop();
        if (y.lIII(llllllllllIlIIl.isSupported(Desktop.Action.OPEN) ? 1 : 0)) {
            return lIll[0];
        }
        try {
            File llllllllllIlIlI;
            llllllllllIlIIl.open(llllllllllIlIlI);
            return lIll[1];
        }
        catch (IOException iOException) {
            aT.warn(I[lIll[9]], (Object)file, (Object)iOException);
            return lIll[0];
        }
    }

    private static void llI() {
        lIll = new int[12];
        y.lIll[0] = (0x44 ^ 0x70) & ~(0x73 ^ 0x47);
        y.lIll[1] = " ".length();
        y.lIll[2] = "  ".length();
        y.lIll[3] = "   ".length();
        y.lIll[4] = 37 + 80 - 68 + 83 ^ 104 + 42 - 62 + 44;
        y.lIll[5] = 0x7A ^ 0x7F;
        y.lIll[6] = 21 + 134 - 119 + 109 ^ 126 + 117 - 138 + 46;
        y.lIll[7] = 0xEE ^ 0xC1 ^ (0x86 ^ 0xAE);
        y.lIll[8] = "  ".length() ^ (0x1D ^ 0x17);
        y.lIll[9] = 0x30 ^ 0x39;
        y.lIll[10] = 0x8E ^ 0x99 ^ (0xA8 ^ 0xB5);
        y.lIll[11] = 0x60 ^ 0x21 ^ (0xDD ^ 0x97);
    }

    private static String ll(String lllllllllIlIlIl, String lllllllllIIllll) {
        lllllllllIlIlIl = new String(Base64.getDecoder().decode(lllllllllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllIlIIll = new StringBuilder();
        char[] lllllllllIlIIlI = lllllllllIIllll.toCharArray();
        int lllllllllIlIIIl = lIll[0];
        char[] lllllllllIIlIll = lllllllllIlIlIl.toCharArray();
        int lllllllllIIlIlI = lllllllllIIlIll.length;
        int lllllllllIIlIIl = lIll[0];
        while (y.lIll(lllllllllIIlIIl, lllllllllIIlIlI)) {
            char lllllllllIlIllI = lllllllllIIlIll[lllllllllIIlIIl];
            lllllllllIlIIll.append((char)(lllllllllIlIllI ^ lllllllllIlIIlI[lllllllllIlIIIl % lllllllllIlIIlI.length]));
            "".length();
            ++lllllllllIlIIIl;
            ++lllllllllIIlIIl;
            "".length();
            if (" ".length() > -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllIlIIll);
    }

    private static boolean lIIl(Object object) {
        return object != null;
    }

    private static void lII() {
        I = new String[lIll[11]];
        y.I[y.lIll[0]] = y.I("n2wFZMOakb2gkZcvEzyv5NtLm1y8KExAmcAPuT9V/4m8vrZC6TanxG8JalKOnMTH", "EyDWk");
        y.I[y.lIll[1]] = y.I("5VNomG77R5i1c6kDe4K0O4s5+hfJRj18H5BpIr2VWF9jIcu3SZLTFg==", "epMmR");
        y.I[y.lIll[2]] = y.lI("bynxmoWgezQ5XtRV9NcedcG8oPoHcwW4A5Z1XScbAInRrzALw+CXFrZKT7A5iehqzvfKkAVftEH8a5uZP8Jn0Af1OBGuY9QgomTWo3Zlnhk=", "ARaRa");
        y.I[y.lIll[3]] = y.ll("HAEUagMUAB0=", "desGl");
        y.I[y.lIll[4]] = y.ll("PCcwWhY0JjlXAjljJRINMTE5Eh1kND4DEWQmJQUWNmM0GB0hYywK", "DCWwy");
        y.I[y.lIll[5]] = y.I("7U9oLyeoHzZ0NXZu06I3THpklJnD2Mn9GZgvqWKy5woAS5QBtUX+17Fmh8dtRkR/qaGdQTbw4eE=", "sgZZX");
        y.I[y.lIll[6]] = y.ll("KSkIOhILaBU5VwA4BDhXKy0SPQMAOEI0BQA/EjMFTzMc", "oHaVw");
        y.I[y.lIll[7]] = y.I("9A5FEjn0c5QIRbTewur+NiEwW06C14ronU+EM1sjdGshaoChGvx88nK5Lp9aM4Zc", "VYSJB");
        y.I[y.lIll[8]] = y.I("geWA3coKe4kHJaBhQdduZJ961nRlHHfAS370nyYDRun4JX2KFon32W1VjqyzZhV5dE+zsxJSlf/zGF3+XZMaUXwljL9p8pbdfN3NBDjGDD3n26g0AgKWJw==", "XbeEd");
        y.I[y.lIll[9]] = y.I("GocJV1Fd9ckGigwbBkE7IdODXUpuZz9ysru3PHTU/TQ=", "rkSsi");
        y.I[y.lIll[10]] = y.ll("Gw4SMQQxDg==", "VkaBe");
    }

    private static void e(String string, String string2) {
        SwingUtilities.invokeLater(() -> {
            int n = JOptionPane.showConfirmDialog(null, string, I[lIll[10]], lIll[2]);
            if (y.lIII(n)) {
                StringSelection stringSelection = new StringSelection(string2);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            }
        });
    }

    static boolean c(File file) {
        File llllllllllIlllI;
        if (!y.lIIl(file) || y.lIII(file.exists() ? 1 : 0)) {
            return lIll[0];
        }
        if (y.lll(y.d(llllllllllIlllI) ? 1 : 0)) {
            aT.debug(I[lIll[7]], (Object)llllllllllIlllI);
            return lIll[1];
        }
        y.e(I[lIll[8]], file.getAbsolutePath());
        return lIll[0];
    }

    static boolean e(String string) {
        String lllllllllllllII;
        if (y.lll(Strings.isNullOrEmpty(string) ? 1 : 0)) {
            return lIll[0];
        }
        if (y.lll(y.g(lllllllllllllII) ? 1 : 0)) {
            aT.debug(I[lIll[0]], (Object)lllllllllllllII);
            return lIll[1];
        }
        if (y.lll(aU ? 1 : 0) && y.lll(y.f(lllllllllllllII) ? 1 : 0)) {
            aT.debug(I[lIll[1]], (Object)lllllllllllllII);
            return lIll[1];
        }
        y.e(I[lIll[2]], string);
        return lIll[0];
    }

    private static String I(String lllllllllIIIIII, String llllllllIllllll) {
        try {
            SecretKeySpec lllllllllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllIIIIlI.init(lIll[2], lllllllllIIIIll);
            return new String(lllllllllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllIIIIIl) {
            lllllllllIIIIIl.printStackTrace();
            return null;
        }
    }

    y() {
    }

    static {
        block2: {
            int n;
            block1: {
                block0: {
                    y.llI();
                    y.lII();
                    aT = LoggerFactory.getLogger(y.class);
                    if (!y.lIlI((Object)F.R(), (Object)G.Linux)) break block0;
                    n = lIll[1];
                    "".length();
                    if (-"   ".length() < 0) break block1;
                    break block2;
                }
                n = lIll[0];
            }
            aU = n;
        }
    }

    private static boolean f(String llllllllllllIII) {
        try {
            String[] stringArray = new String[lIll[2]];
            stringArray[y.lIll[0]] = I[lIll[3]];
            stringArray[y.lIll[1]] = llllllllllllIII;
            Process lllllllllllIlll = Runtime.getRuntime().exec(stringArray);
            lllllllllllIlll.waitFor();
            "".length();
            int lllllllllllIllI = lllllllllllIlll.exitValue();
            if (y.lIII(lllllllllllIllI)) {
                return lIll[1];
            }
            aT.warn(I[lIll[4]], (Object)llllllllllllIII, (Object)lllllllllllIllI);
            return lIll[0];
        }
        catch (IOException lllllllllllIlll) {
            aU = lIll[0];
            return lIll[0];
        }
        catch (InterruptedException interruptedException) {
            String string;
            aT.warn(I[lIll[5]], (Object)string);
            return lIll[0];
        }
    }

    private static boolean lll(int n) {
        return n != 0;
    }
}
