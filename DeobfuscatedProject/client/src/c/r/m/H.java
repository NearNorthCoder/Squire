/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.F;
import c.r.m.I;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.launcher.Launcher;
import net.runelite.launcher.beans.Bootstrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class H {
    private static /* synthetic */ int[] lIIIlI;
    private static final /* synthetic */ Logger br;
    private static /* synthetic */ String[] lIIIII;

    private static boolean lIIIlII(int n) {
        return n != 0;
    }

    private static String[] e(Bootstrap bootstrap) {
        switch (I.bs[F.R().ordinal()]) {
            case 1: {
                String[] stringArray;
                Bootstrap lllllIlllIIIIII;
                String[] lllllIllIllllll = lllllIlllIIIIII.getLauncherJvm11WindowsArguments();
                if (H.lIIIllI(lllllIllIllllll)) {
                    stringArray = lllllIllIllllll;
                    "".length();
                    if (-"   ".length() >= 0) {
                        return null;
                    }
                } else {
                    stringArray = lllllIlllIIIIII.getLauncherJvm11Arguments();
                }
                return stringArray;
            }
            case 2: {
                String[] stringArray;
                Bootstrap lllllIlllIIIIII;
                String[] lllllIllIllllll = lllllIlllIIIIII.getLauncherJvm11MacArguments();
                if (H.lIIIllI(lllllIllIllllll)) {
                    stringArray = lllllIllIllllll;
                    "".length();
                    if (-"   ".length() > 0) {
                        return null;
                    }
                } else {
                    stringArray = lllllIlllIIIIII.getLauncherJvm11Arguments();
                }
                return stringArray;
            }
        }
        return bootstrap.getLauncherJvm11Arguments();
    }

    private static String lllllI(String lllllIllIIIlllI, String lllllIllIIIllIl) {
        try {
            SecretKeySpec lllllIllIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIllIIIllIl.getBytes(StandardCharsets.UTF_8)), lIIIlI[8]), "DES");
            Cipher lllllIllIIlIIlI = Cipher.getInstance("DES");
            lllllIllIIlIIlI.init(lIIIlI[2], lllllIllIIlIIll);
            return new String(lllllIllIIlIIlI.doFinal(Base64.getDecoder().decode(lllllIllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIllIIlIIIl) {
            lllllIllIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlll(int n, int n2) {
        return n < n2;
    }

    private static String[] c(Bootstrap bootstrap) {
        String[] stringArray;
        if (H.lIIIlII(Launcher.B() ? 1 : 0)) {
            stringArray = H.d(bootstrap);
            "".length();
            if ((0xB5 ^ 0xB1) > (0xE ^ 0xA)) {
                return null;
            }
        } else {
            Bootstrap lllllIlllIIIlll;
            stringArray = H.e(lllllIlllIIIlll);
        }
        return stringArray;
    }

    private static String llllII(String lllllIllIlIIlIl, String lllllIllIlIIlII) {
        lllllIllIlIIlIl = new String(Base64.getDecoder().decode(lllllIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIllIlIIIll = new StringBuilder();
        char[] lllllIllIlIIIlI = lllllIllIlIIlII.toCharArray();
        int lllllIllIlIIIIl = lIIIlI[0];
        char[] lllllIllIIllIll = lllllIllIlIIlIl.toCharArray();
        int lllllIllIIllIlI = lllllIllIIllIll.length;
        int lllllIllIIllIIl = lIIIlI[0];
        while (H.lIIIlll(lllllIllIIllIIl, lllllIllIIllIlI)) {
            char lllllIllIlIIllI = lllllIllIIllIll[lllllIllIIllIIl];
            lllllIllIlIIIll.append((char)(lllllIllIlIIllI ^ lllllIllIlIIIlI[lllllIllIlIIIIl % lllllIllIlIIIlI.length]));
            "".length();
            ++lllllIllIlIIIIl;
            ++lllllIllIIllIIl;
            "".length();
            if (((0xDF ^ 0x8F ^ (0x46 ^ 0x5B)) & (0x87 ^ 0xB6 ^ (0x5B ^ 0x27) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllllIllIlIIIll);
    }

    private static void lIIIIll() {
        lIIIlI = new int[9];
        H.lIIIlI[0] = (0x36 ^ 0x6F) & ~(0x73 ^ 0x2A);
        H.lIIIlI[1] = " ".length();
        H.lIIIlI[2] = "  ".length();
        H.lIIIlI[3] = "   ".length();
        H.lIIIlI[4] = 6 + 36 - -139 + 1 ^ 168 + 29 - 89 + 70;
        H.lIIIlI[5] = 0x5E ^ 0x5B;
        H.lIIIlI[6] = 0x45 ^ 0x2E ^ (0x55 ^ 0x38);
        H.lIIIlI[7] = 0x9B ^ 0x9C;
        H.lIIIlI[8] = 0xE4 ^ 0x91 ^ (0xF5 ^ 0x88);
    }

    static {
        H.lIIIIll();
        H.lIIIIII();
        br = LoggerFactory.getLogger(H.class);
    }

    public static void a(Bootstrap lllllIlllIlIlIl, Collection<String> lllllIlllIlIlII) {
        Map lllllIlllIlIIIl;
        String[] lllllIlllIlIIII2;
        File lllllIlllIlIIll = new File(lIIIII[lIIIlI[0]]).getAbsoluteFile();
        if (!H.lIIIlII(lllllIlllIlIIll.exists() ? 1 : 0) || H.lIIIlIl(lllllIlllIlIIll.canWrite() ? 1 : 0)) {
            return;
        }
        Gson lllllIlllIlIIlI = new GsonBuilder().setPrettyPrinting().create();
        try {
            lllllIlllIlIIII2 = new FileInputStream(lllllIlllIlIIll);
            try {
                lllllIlllIlIIIl = lllllIlllIlIIlI.fromJson((Reader)new InputStreamReader((InputStream)lllllIlllIlIIII2), Map.class);
            }
            catch (Throwable lllllIlllIIllll) {
                try {
                    lllllIlllIlIIII2.close();
                    "".length();
                }
                catch (Throwable lllllIlllIIlllI) {
                    lllllIlllIIllll.addSuppressed(lllllIlllIIlllI);
                }
                if (((0x84 ^ 0xB2) & ~(0xB7 ^ 0x81)) > 0) {
                    return;
                }
                throw lllllIlllIIllll;
            }
            lllllIlllIlIIII2.close();
            "".length();
            if ((27 + 64 - 11 + 65 ^ 12 + 77 - -28 + 32) == 0) {
                return;
            }
            "".length();
        }
        catch (IOException lllllIlllIlIIII2) {
            br.warn(lIIIII[lIIIlI[1]], lllllIlllIlIIII2);
            return;
        }
        if (" ".length() <= -" ".length()) {
            return;
        }
        lllllIlllIlIIII2 = H.c(lllllIlllIlIlIl);
        if (!H.lIIIllI(lllllIlllIlIIII2) || H.lIIIlIl(lllllIlllIlIIII2.length)) {
            br.warn(lIIIII[lIIIlI[2]]);
            return;
        }
        ArrayList<String> lllllIlllIIllll = new ArrayList<String>();
        lllllIlllIIllll.addAll(Arrays.asList(lllllIlllIlIIII2));
        "".length();
        lllllIlllIIllll.addAll(lllllIlllIlIlII);
        "".length();
        lllllIlllIlIIIl.put(lIIIII[lIIIlI[3]], lllllIlllIIllll);
        "".length();
        lllllIlllIlIIIl.put(lIIIII[lIIIlI[4]], H.f(lllllIlllIlIlIl));
        "".length();
        try {
            File lllllIlllIIlllI = File.createTempFile(lIIIII[lIIIlI[5]], null);
            FileOutputStream lllllIlllIIllIl22 = new FileOutputStream(lllllIlllIIlllI);
            try {
                FileChannel lllllIlllIIllII = lllllIlllIIllIl22.getChannel();
                try {
                    PrintWriter lllllIlllIIlIll = new PrintWriter(lllllIlllIIllIl22);
                    try {
                        lllllIlllIIllII.lock();
                        "".length();
                        lllllIlllIIlIll.write(lllllIlllIlIIlI.toJson(lllllIlllIlIIIl));
                        lllllIlllIIllII.force(lIIIlI[1]);
                        lllllIlllIIlIll.close();
                        "".length();
                    }
                    catch (Throwable lllllIlllIIlIlI) {
                        try {
                            lllllIlllIIlIll.close();
                            "".length();
                        }
                        catch (Throwable lllllIlllIIlIIl) {
                            lllllIlllIIlIlI.addSuppressed(lllllIlllIIlIIl);
                        }
                        if (((0xCF ^ 0xAC) & ~(0xD8 ^ 0xBB)) > 0) {
                            return;
                        }
                        throw lllllIlllIIlIlI;
                    }
                    if (null != null) {
                        return;
                    }
                }
                catch (Throwable lllllIlllIIlIll) {
                    if (H.lIIIllI(lllllIlllIIllII)) {
                        try {
                            lllllIlllIIllII.close();
                            "".length();
                        }
                        catch (Throwable lllllIlllIIlIlI) {
                            lllllIlllIIlIll.addSuppressed(lllllIlllIIlIlI);
                        }
                        if ("   ".length() < ((11 + 93 - -102 + 30 ^ 61 + 56 - 50 + 100) & (0x91 ^ 0x9C ^ (0x45 ^ 3) ^ -" ".length()))) {
                            return;
                        }
                    }
                    throw lllllIlllIIlIll;
                }
                if (H.lIIIllI(lllllIlllIIllII)) {
                    lllllIlllIIllII.close();
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
            }
            catch (Throwable lllllIlllIIllII) {
                try {
                    lllllIlllIIllIl22.close();
                    "".length();
                }
                catch (Throwable lllllIlllIIlIll) {
                    lllllIlllIIllII.addSuppressed(lllllIlllIIlIll);
                }
                if (" ".length() < 0) {
                    return;
                }
                throw lllllIlllIIllII;
            }
            lllllIlllIIllIl22.close();
            "".length();
            if (null != null) {
                return;
            }
            try {
                CopyOption[] copyOptionArray = new CopyOption[lIIIlI[2]];
                copyOptionArray[H.lIIIlI[0]] = StandardCopyOption.REPLACE_EXISTING;
                copyOptionArray[H.lIIIlI[1]] = StandardCopyOption.ATOMIC_MOVE;
                Files.move(lllllIlllIIlllI.toPath(), lllllIlllIlIIll.toPath(), copyOptionArray);
                "".length();
                "".length();
            }
            catch (AtomicMoveNotSupportedException lllllIlllIIllIl22) {
                br.debug(lIIIII[lIIIlI[6]], lllllIlllIIllIl22);
                CopyOption[] copyOptionArray = new CopyOption[lIIIlI[1]];
                copyOptionArray[H.lIIIlI[0]] = StandardCopyOption.REPLACE_EXISTING;
                Files.move(lllllIlllIIlllI.toPath(), lllllIlllIlIIll.toPath(), copyOptionArray);
                "".length();
            }
            if (" ".length() <= 0) {
                return;
            }
            "".length();
        }
        catch (IOException lllllIlllIIlllI) {
            br.warn(lIIIII[lIIIlI[7]], lllllIlllIIlllI);
        }
        if (-" ".length() >= "  ".length()) {
            return;
        }
    }

    private static Map<String, String> f(Bootstrap bootstrap) {
        switch (I.bs[F.R().ordinal()]) {
            case 1: {
                Bootstrap lllllIllIllllIl;
                return lllllIllIllllIl.getLauncherWindowsEnv();
            }
            case 2: {
                Bootstrap lllllIllIllllIl;
                return lllllIllIllllIl.getLauncherMacEnv();
            }
            case 3: {
                Bootstrap lllllIllIllllIl;
                return lllllIllIllllIl.getLauncherLinuxEnv();
            }
        }
        return null;
    }

    H() {
    }

    private static boolean lIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllI(Object object) {
        return object != null;
    }

    private static void lIIIIII() {
        lIIIII = new String[lIIIlI[8]];
        H.lIIIII[H.lIIIlI[0]] = H.llllII("LxU0CScrVDAcISI=", "LzZoN");
        H.lIIIII[H.lIIIlI[1]] = H.llllIl("QWdPAyA7VBy2esBCqZZBqIP4oMaG7CfC2KqTKjdRHJ4=", "oDEzS");
        H.lIIIII[H.lIIIlI[2]] = H.lllllI("U4s+5G4ZFcscq6HjE6GFqFHNHrBYa8OA", "Tstbh");
        H.lIIIII[H.lIIIlI[3]] = H.llllII("BhcUIhID", "pzUPu");
        H.lIIIII[H.lIIIlI[4]] = H.llllIl("lImw3AxXmOo=", "pWkVZ");
        H.lIIIII[H.lIIIlI[5]] = H.llllII("NxASOxsh", "DagRi");
        H.lIIIII[H.lIIIlI[6]] = H.llllIl("eMqxWfX8ADP+oazr40lBeYb6/nBBl7faOYm/SRsNRlY=", "BTQNv");
        H.lIIIII[H.lIIIlI[7]] = H.lllllI("f/E9gJLpkQmKqS3WFM5rzX+CMNVcJMYi53d48/WAbt0=", "NpCad");
    }

    private static String[] d(Bootstrap bootstrap) {
        switch (I.bs[F.R().ordinal()]) {
            case 1: {
                String[] stringArray;
                Bootstrap lllllIlllIIIlII;
                String[] lllllIlllIIIIll = lllllIlllIIIlII.getLauncherJvm17WindowsArguments();
                if (H.lIIIllI(lllllIlllIIIIll)) {
                    stringArray = lllllIlllIIIIll;
                    "".length();
                    if ("  ".length() == -" ".length()) {
                        return null;
                    }
                } else {
                    stringArray = lllllIlllIIIlII.getLauncherJvm17Arguments();
                }
                return stringArray;
            }
            case 2: {
                String[] stringArray;
                Bootstrap lllllIlllIIIlII;
                String[] lllllIlllIIIIll = lllllIlllIIIlII.getLauncherJvm17MacArguments();
                if (H.lIIIllI(lllllIlllIIIIll)) {
                    stringArray = lllllIlllIIIIll;
                    "".length();
                    if (-"  ".length() >= 0) {
                        return null;
                    }
                } else {
                    stringArray = lllllIlllIIIlII.getLauncherJvm17Arguments();
                }
                return stringArray;
            }
        }
        return bootstrap.getLauncherJvm17Arguments();
    }

    private static String llllIl(String lllllIllIllIIll, String lllllIllIllIlII) {
        try {
            SecretKeySpec lllllIllIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIllIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIllIllIlll = Cipher.getInstance("Blowfish");
            lllllIllIllIlll.init(lIIIlI[2], lllllIllIlllIII);
            return new String(lllllIllIllIlll.doFinal(Base64.getDecoder().decode(lllllIllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIllIllIllI) {
            lllllIllIllIllI.printStackTrace();
            return null;
        }
    }
}
