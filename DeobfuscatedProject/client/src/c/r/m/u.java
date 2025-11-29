/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.F;
import c.r.m.L;
import c.r.m.v;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.launcher.Launcher;
import net.runelite.launcher.beans.Bootstrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class u {
    private static /* synthetic */ String[] llIlI;
    private static /* synthetic */ int[] llIll;
    private static final /* synthetic */ Logger aC;
    private static final /* synthetic */ Logger aB;

    private static String llIIII(String llllllIIIllIllI, String llllllIIIllIIll) {
        try {
            SecretKeySpec llllllIIIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIIIllIIll.getBytes(StandardCharsets.UTF_8)), llIll[8]), "DES");
            Cipher llllllIIIlllIII = Cipher.getInstance("DES");
            llllllIIIlllIII.init(llIll[1], llllllIIIlllIIl);
            return new String(llllllIIIlllIII.doFinal(Base64.getDecoder().decode(llllllIIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIIIllIlll) {
            llllllIIIllIlll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static String x() {
        void var1_1;
        void llllllIIlIlllIl;
        Path path = Paths.get(System.getProperty(llIlI[llIll[0]]), new String[llIll[0]]);
        if (u.llIlII(Files.exists(path, new LinkOption[llIll[0]]) ? 1 : 0)) {
            throw new FileNotFoundException("JAVA_HOME is not set correctly! directory \"" + path + "\" does not exist.");
        }
        String[] stringArray = new String[llIll[1]];
        stringArray[u.llIll[0]] = llIlI[llIll[2]];
        stringArray[u.llIll[2]] = llIlI[llIll[1]];
        Path llllllIIlIlllII = Paths.get(llllllIIlIlllIl.toString(), stringArray);
        if (u.llIlII(Files.exists(llllllIIlIlllII, new LinkOption[llIll[0]]) ? 1 : 0)) {
            String[] stringArray2 = new String[llIll[1]];
            stringArray2[u.llIll[0]] = llIlI[llIll[3]];
            stringArray2[u.llIll[2]] = llIlI[llIll[4]];
            llllllIIlIlllII = Paths.get(llllllIIlIlllIl.toString(), stringArray2);
        }
        if (u.llIlII(Files.exists(llllllIIlIlllII, new LinkOption[llIll[0]]) ? 1 : 0)) {
            throw new FileNotFoundException("java executable not found in directory \"" + llllllIIlIlllII.getParent() + "\"");
        }
        return var1_1.toAbsolutePath().toString();
    }

    private static boolean llIlll(Object object) {
        return object != null;
    }

    u() {
    }

    private static String lIllll(String llllllIIIIllIIl, String llllllIIIIlIIll) {
        llllllIIIIllIIl = new String(Base64.getDecoder().decode(llllllIIIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIIIlIlll = new StringBuilder();
        char[] llllllIIIIlIllI = llllllIIIIlIIll.toCharArray();
        int llllllIIIIlIlIl = llIll[0];
        char[] llllllIIIIIllll = llllllIIIIllIIl.toCharArray();
        int llllllIIIIIlllI = llllllIIIIIllll.length;
        int llllllIIIIIllIl = llIll[0];
        while (u.lllIII(llllllIIIIIllIl, llllllIIIIIlllI)) {
            char llllllIIIIllIlI = llllllIIIIIllll[llllllIIIIIllIl];
            llllllIIIIlIlll.append((char)(llllllIIIIllIlI ^ llllllIIIIlIllI[llllllIIIIlIlIl % llllllIIIIlIllI.length]));
            "".length();
            ++llllllIIIIlIlIl;
            ++llllllIIIIIllIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllIIIIlIlll);
    }

    static {
        u.llIIll();
        u.llIIlI();
        aB = LoggerFactory.getLogger(u.class);
        aC = LoggerFactory.getLogger(u.class);
    }

    private static void llIIll() {
        llIll = new int[11];
        u.llIll[0] = (0xFF ^ 0x8A ^ (0xB2 ^ 0xA6)) & (196 + 176 - 146 + 6 ^ 2 + 129 - 104 + 110 ^ -" ".length());
        u.llIll[1] = "  ".length();
        u.llIll[2] = " ".length();
        u.llIll[3] = "   ".length();
        u.llIll[4] = 43 + 54 - 53 + 136 ^ 32 + 3 - -72 + 69;
        u.llIll[5] = 130 + 7 - 118 + 144 ^ 80 + 34 - 94 + 146;
        u.llIll[6] = 0x56 ^ 0x50;
        u.llIll[7] = 0xC ^ 0x16 ^ (0x7C ^ 0x61);
        u.llIll[8] = 0xC8 ^ 0xC0;
        u.llIll[9] = "   ".length() ^ (0x5A ^ 0x50);
        u.llIll[10] = 0x35 ^ 0x3F;
    }

    private static boolean lllIII(int n, int n2) {
        return n < n2;
    }

    private static String llIIIl(String llllllIIIlIlIIl, String llllllIIIlIlIII) {
        try {
            SecretKeySpec llllllIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIIIlIlIll = Cipher.getInstance("Blowfish");
            llllllIIIlIlIll.init(llIll[1], llllllIIIlIllII);
            return new String(llllllIIIlIlIll.doFinal(Base64.getDecoder().decode(llllllIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIIIlIlIlI) {
            llllllIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static void llIIlI() {
        llIlI = new String[llIll[10]];
        u.llIlI[u.llIll[0]] = u.lIllll("HhAzK2scHigv", "tqEJE");
        u.llIlI[u.llIll[2]] = u.llIIII("lYxVPhTK+34=", "kNIwA");
        u.llIlI[u.llIll[1]] = u.lIllll("PxszOV8wAiA=", "UzEXq");
        u.llIlI[u.llIll[3]] = u.llIIIl("3D4NVEqP9/I=", "UGRES");
        u.llIlI[u.llIll[4]] = u.lIllll("LAkuEg==", "FhXsz");
        u.llIlI[u.llIll[5]] = u.llIIIl("bxG1VKeHmhqYXaM5RhHYldB2e3hRFrRKvv7N7KwYYyo=", "ozwen");
        u.llIlI[u.llIll[6]] = u.llIIIl("M2N7kdmxSFr+OrJYcpRbpA==", "eODZH");
        u.llIlI[u.llIll[7]] = u.llIIIl("jic2SoHfsVQ=", "HjuyX");
        u.llIlI[u.llIll[8]] = u.llIIII("AG7SJxSVsNhE7BIudKHdz7N933srplHnoqIUE+267Fs=", "OznHi");
        u.llIlI[u.llIll[9]] = u.llIIII("dVCNAuYT+1uJn38B8Cchwg==", "goVCk");
    }

    private static boolean llIlIl(int n) {
        return n != 0;
    }

    private static boolean llIlII(int n) {
        return n == 0;
    }

    public static void a(Bootstrap llllllIIlIIlllI, List<File> llllllIIlIIllIl, Collection<String> llllllIIlIIllII, List<String> llllllIIlIIlIll, List<String> llllllIIlIIlIlI) {
        Serializable llllllIIlIIIlll2;
        StringBuilder llllllIIlIIlIIl = new StringBuilder();
        Object llllllIIlIIlIII = llllllIIlIIllIl.iterator();
        while (u.llIlIl(llllllIIlIIlIII.hasNext() ? 1 : 0)) {
            llllllIIlIIIlll2 = llllllIIlIIlIII.next();
            if (u.llIllI(llllllIIlIIlIIl.length())) {
                llllllIIlIIlIIl.append(File.pathSeparatorChar);
                "".length();
            }
            llllllIIlIIlIIl.append(((File)llllllIIlIIIlll2).getAbsolutePath());
            "".length();
            "".length();
            if (null == null) continue;
            return;
        }
        try {
            llllllIIlIIlIII = u.x();
            "".length();
        }
        catch (FileNotFoundException llllllIIlIIIlll2) {
            aC.error(llIlI[llIll[5]], llllllIIlIIIlll2);
            return;
        }
        if ("  ".length() == 0) {
            return;
        }
        llllllIIlIIIlll2 = new ArrayList();
        llllllIIlIIIlll2.add(llllllIIlIIlIII);
        "".length();
        llllllIIlIIIlll2.add(llIlI[llIll[6]]);
        "".length();
        llllllIIlIIIlll2.add(llIlI[llIll[7]]);
        "".length();
        llllllIIlIIIlll2.add(String.valueOf(llllllIIlIIlIIl));
        "".length();
        String[] llllllIIlIIIllI = u.a(llllllIIlIIlllI);
        if (u.llIlll(llllllIIlIIIllI)) {
            llllllIIlIIIlll2.addAll(Arrays.asList(llllllIIlIIIllI));
            "".length();
        }
        llllllIIlIIIlll2.addAll(llllllIIlIIlIll);
        "".length();
        llllllIIlIIIlll2.addAll(llllllIIlIIlIlI);
        "".length();
        llllllIIlIIIlll2.add(llIlI[llIll[8]]);
        "".length();
        llllllIIlIIIlll2.addAll(llllllIIlIIllII);
        "".length();
        aC.info(llIlI[llIll[9]], (Object)llllllIIlIIIlll2);
        ProcessBuilder llllllIIlIIIlIl = new ProcessBuilder(llllllIIlIIIlll2.toArray(new String[llIll[0]]));
        llllllIIlIIIlIl.redirectErrorStream(llIll[2]);
        "".length();
        Process llllllIIlIIIlII = llllllIIlIIIlIl.start();
        L.close();
        if (u.llIlIl(aB.isDebugEnabled() ? 1 : 0)) {
            String llllllIIlIIIIlI;
            BufferedReader llllllIIlIIIIll = new BufferedReader(new InputStreamReader(llllllIIlIIIlII.getInputStream()));
            while (u.llIlll(llllllIIlIIIIlI = llllllIIlIIIIll.readLine())) {
                System.out.println(llllllIIlIIIIlI);
                "".length();
                if (((0xC4 ^ 0x83) & ~(0 ^ 0x47) & ~((0xC4 ^ 0x8D) & ~(0xDF ^ 0x96))) == 0) continue;
                return;
            }
        }
    }

    private static String[] a(Bootstrap bootstrap) {
        if (u.llIlIl(Launcher.B() ? 1 : 0)) {
            Bootstrap llllllIIIllllll;
            switch (v.aD[F.R().ordinal()]) {
                case 1: {
                    String[] stringArray;
                    String[] llllllIIIlllllI = llllllIIIllllll.getClientJvm17WindowsArguments();
                    if (u.llIlll(llllllIIIlllllI)) {
                        stringArray = llllllIIIlllllI;
                        "".length();
                        if (-(0x54 ^ 0x51) >= 0) {
                            return null;
                        }
                    } else {
                        stringArray = llllllIIIllllll.getClientJvm17Arguments();
                    }
                    return stringArray;
                }
                case 2: {
                    String[] stringArray;
                    String[] llllllIIIlllllI = llllllIIIllllll.getClientJvm17MacArguments();
                    if (u.llIlll(llllllIIIlllllI)) {
                        stringArray = llllllIIIlllllI;
                        "".length();
                        if ((0xA4 ^ 0xB3 ^ (0x2C ^ 0x3E)) <= 0) {
                            return null;
                        }
                    } else {
                        stringArray = llllllIIIllllll.getClientJvm17Arguments();
                    }
                    return stringArray;
                }
            }
            return llllllIIIllllll.getClientJvm17Arguments();
        }
        return bootstrap.getClientJvm9Arguments();
    }

    private static boolean llIllI(int n2) {
        return n2 > 0;
    }
}
