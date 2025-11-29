/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.wintertodt.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class DHelper {

    private static void llIIIIllllIIlll() {
        lIllIIIIIIIll = new String[lIllIIIIIIlII[7]];
        d.lIllIIIIIIIll[d.lIllIIIIIIlII[1]] = "%,d";
        d.lIllIIIIIIIll[d.lIllIIIIIIlII[2]] = "%,dK";
        d.lIllIIIIIIIll[d.lIllIIIIIIlII[5]] = "%,dM";
    }

    public static String a(double d2) {
        return d.a((int)d2);
    }

    static {
        d.llIIIIllllIlIII();
        d.llIIIIllllIIlll();
    }

    public static String a(int n2) {
        int var1;
        if (d.llIIIIllllIlIIl(n2, lIllIIIIIIlII[0])) {
            Object[] objectArray = new Object[lIllIIIIIIlII[2]];
            objectArray[d.lIllIIIIIIlII[1]] = n2;
            return String.format(lIllIIIIIIIll[lIllIIIIIIlII[1]], objectArray);
        }
        if (d.llIIIIllllIlIIl(var1, lIllIIIIIIlII[3])) {
            Object[] objectArray = new Object[lIllIIIIIIlII[2]];
            objectArray[d.lIllIIIIIIlII[1]] = var1 / lIllIIIIIIlII[4];
            return String.format(lIllIIIIIIIll[lIllIIIIIIlII[2]], objectArray);
        }
        Object[] objectArray = new Object[lIllIIIIIIlII[2]];
        objectArray[d.lIllIIIIIIlII[1]] = n2 / lIllIIIIIIlII[6];
        return String.format(lIllIIIIIIIll[lIllIIIIIIlII[5]], objectArray);
    }

    private static boolean llIIIIllllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }
}

