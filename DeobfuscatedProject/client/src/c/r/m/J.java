/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.K;
import c.r.m.L;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.UIManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class J {
    private static /* synthetic */ int[] lIIIIl;
    static final /* synthetic */ Logger bt;
    private static /* synthetic */ String[] lllll;

    private static void lIIIIIl() {
        lIIIIl = new int[5];
        J.lIIIIl[0] = (0x2C ^ 0x31 ^ (0xD2 ^ 0x91)) & (0x6E ^ 0x78 ^ (0x14 ^ 0x5C) ^ -" ".length());
        J.lIIIIl[1] = " ".length();
        J.lIIIIl[2] = "  ".length();
        J.lIIIIl[3] = "   ".length();
        J.lIIIIl[4] = 24 + 129 - 18 + 41 ^ 112 + 114 - 137 + 95;
    }

    J() {
    }

    public static void a(List<File> list, Collection<String> collection) {
        URL[] uRLArray = new URL[list.size()];
        int n = lIIIIl[0];
        Iterator<File> lllllIlllllIlII = list.iterator();
        while (J.lIIIIlI(lllllIlllllIlII.hasNext() ? 1 : 0)) {
            File lllllIlllllIIll = lllllIlllllIlII.next();
            bt.debug(lllll[lIIIIl[0]], (Object)lllllIlllllIIll);
            lllllIlllllIllI[++lllllIlllllIlIl] = lllllIlllllIIll.toURI().toURL();
            "".length();
            if ("   ".length() != 0) continue;
            return;
        }
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        URLClassLoader uRLClassLoader = new URLClassLoader(uRLArray, classLoader);
        UIManager.put(lllll[lIIIIl[1]], uRLClassLoader);
        "".length();
        K k = new K(uRLClassLoader, collection);
        k.setName(lllll[lIIIIl[2]]);
        k.start();
        L.close();
    }

    private static boolean lIIIIlI(int n) {
        return n != 0;
    }

    static {
        J.lIIIIIl();
        J.llllll();
        bt = LoggerFactory.getLogger(J.class);
    }

    private static String lllIll(String lllllIllllIlIlI, String lllllIllllIIlll) {
        try {
            SecretKeySpec lllllIllllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIllllIIlll.getBytes(StandardCharsets.UTF_8)), lIIIIl[4]), "DES");
            Cipher lllllIllllIllII = Cipher.getInstance("DES");
            lllllIllllIllII.init(lIIIIl[2], lllllIllllIllIl);
            return new String(lllllIllllIllII.doFinal(Base64.getDecoder().decode(lllllIllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIllllIlIll) {
            lllllIllllIlIll.printStackTrace();
            return null;
        }
    }

    private static void llllll() {
        lllll = new String[lIIIIl[3]];
        J.lllll[J.lIIIIl[0]] = J.lllIll("Lc/mfPDIrThI/8rfopVklQ==", "AxXFw");
        J.lllll[J.lIIIIl[1]] = J.lllIll("xCCBeELPdRx7eA2dwEg6Qw==", "HTpAX");
        J.lllll[J.lIIIIl[2]] = J.lllIll("WXkBmzjJVRk=", "bGdHq");
    }
}
