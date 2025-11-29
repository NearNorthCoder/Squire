/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.auth.AuthResponse;
import squire.ui.LogoSidePanel;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class GameSession
extends Thread {
    final /* synthetic */ URLClassLoader bu;
    final /* synthetic */ Collection bv;
    private static /* synthetic */ int[] llIIl;
    private static /* synthetic */ String[] lIlIl;

    private static boolean lIlllI(int n, int n2) {
        return n < n2;
    }

    private static void lIllII() {
        lIlIl = new String[llIIl[4]];
        K.lIlIl[K.llIIl[0]] = K."squire-session-index-";
        K.lIlIl[K.llIIl[1]] = K."net.runelite.client.RuneLite";
        K.lIlIl[K.llIIl[2]] = K."main";
        K.lIlIl[K.llIIl[3]] = K."Unable to launch client";
    }

    @Override
    public void run() {
        try {
            K llllllIlIIllIIl;
            File llllllIlIIllIII = File.createTempFile(lIlIl[llIIl[0]], String.valueOf(ProcessHandle.current().pid()), q.an);
            llllllIlIIllIII.deleteOnExit();
            Class<?> llllllIlIIlIlll = llllllIlIIllIIl.bu.loadClass(lIlIl[llIIl[1]]);
            Class[] classArray = new Class[llIIl[1]];
            classArray[K.llIIl[0]] = String[].class;
            Method llllllIlIIlIllI = llllllIlIIlIlll.getMethod(lIlIl[llIIl[2]], classArray);
            Object[] objectArray = new Object[llIIl[1]];
            objectArray[K.llIIl[0]] = llllllIlIIllIIl.bv.toArray(new String[llIIl[0]]);
            llllllIlIIlIllI.invoke(null, objectArray);
            0;
            0;
        }
        catch (Exception llllllIlIIllIII) {
            J.bt.error(lIlIl[llIIl[3]], llllllIlIIllIII);
        }
        if (-(0x2F ^ 0x2B) >= 0) {
            return;
        }
    }

    static {
        K.lIllIl();
        K.lIllII();
    }

    private static String lIIIll(String llllllIIlllllll, String llllllIIllllllI) {
        try {
            SecretKeySpec llllllIlIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIlIIIIIll = Cipher.getInstance("Blowfish");
            llllllIlIIIIIll.init(llIIl[2], llllllIlIIIIlII);
            return new String(llllllIlIIIIIll.doFinal(Base64.getDecoder().decode(llllllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIlIIIIIlI) {
            llllllIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String llllI(String llllllIIllIllII, String llllllIIllIlIll) {
        llllllIIllIllII = new String(Base64.getDecoder().decode(llllllIIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIllIllll = new StringBuilder();
        char[] llllllIIllIlllI = llllllIIllIlIll.toCharArray();
        int llllllIIllIllIl = llIIl[0];
        char[] llllllIIllIIlll = llllllIIllIllII.toCharArray();
        int llllllIIllIIllI = llllllIIllIIlll.length;
        int llllllIIllIIlIl = llIIl[0];
        while (K.lIlllI(llllllIIllIIlIl, llllllIIllIIllI)) {
            char llllllIIlllIIlI = llllllIIllIIlll[llllllIIllIIlIl];
            llllllIIllIllll.append((char)(llllllIIlllIIlI ^ llllllIIllIlllI[llllllIIllIllIl % llllllIIllIlllI.length]));
            0;
            ++llllllIIllIllIl;
            ++llllllIIllIIlIl;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return String.valueOf(llllllIIllIllll);
    }

    K(URLClassLoader uRLClassLoader, Collection collection) {
        this.bu = uRLClassLoader;
        this.bv = collection;
    }

    private static void lIllIl() {
        llIIl = new int[6];
        K.llIIl[0] = (0x7C ^ 0x12 ^ (0x7C ^ 0x22)) & (3 + 54 - -92 + 39 ^ 39 + 23 - -31 + 47 ^ -1);
        K.llIIl[1] = 1;
        K.llIIl[2] = 2;
        K.llIIl[3] = 3;
        K.llIIl[4] = 0x8F ^ 0xB0 ^ (0x4C ^ 0x77);
        K.llIIl[5] = 0xCA ^ 0xC2;
    }

    private static String lIIIII(String llllllIlIIIllII, String llllllIlIIIllIl) {
        try {
            SecretKeySpec llllllIlIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIlIIIllIl.getBytes(StandardCharsets.UTF_8)), llIIl[5]), "DES");
            Cipher llllllIlIIlIIII = Cipher.getInstance("DES");
            llllllIlIIlIIII.init(llIIl[2], llllllIlIIlIIIl);
            return new String(llllllIlIIlIIII.doFinal(Base64.getDecoder().decode(llllllIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIlIIIllll) {
            llllllIlIIIllll.printStackTrace();
            return null;
        }
    }
}
