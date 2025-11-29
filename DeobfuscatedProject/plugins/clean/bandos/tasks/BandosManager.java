/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.bandos.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.bandos.tasks.GHelper;

class BandosManager
extends HashMap<String, Integer> {
    final  g w;

    private static boolean lIlIllIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        h.lIlIllIIllIIIl();
        h.lIlIllIIlIllIl();
    }

    private static void lIlIllIIlIllIl() {
        llIllllllll = new String[lllIIIIIIll[16]];
        h.llIllllllll[h.lllIIIIIIll[0]] = "Anglerfish";
        h.llIllllllll[h.lllIIIIIIll[2]] = "Manta ray";
        h.llIllllllll[h.lllIIIIIIll[3]] = "Summer pie";
        h.llIllllllll[h.lllIIIIIIll[4]] = "Shark";
        h.llIllllllll[h.lllIIIIIIll[6]] = "Cooked karambwan";
        h.llIllllllll[h.lllIIIIIIll[8]] = "Monkfish";
        h.llIllllllll[h.lllIIIIIIll[10]] = "Chilli potato";
        h.llIllllllll[h.lllIIIIIIll[12]] = "Half a summer pie";
        h.llIllllllll[h.lllIIIIIIll[14]] = "Peach";
        h.llIllllllll[h.lllIIIIIIll[15]] = "Bones";
    }

        return String.valueOf(var1);
    }

    BandosManager(g g2) {
        this.w = g2;
        this.put(llIllllllll[lllIIIIIIll[0]], lllIIIIIIll[1]);

        this.put(llIllllllll[lllIIIIIIll[2]], lllIIIIIIll[1]);

        this.put(llIllllllll[lllIIIIIIll[3]], lllIIIIIIll[1]);

        this.put(llIllllllll[lllIIIIIIll[4]], lllIIIIIIll[5]);

        this.put(llIllllllll[lllIIIIIIll[6]], lllIIIIIIll[7]);

        this.put(llIllllllll[lllIIIIIIll[8]], lllIIIIIIll[9]);

        this.put(llIllllllll[lllIIIIIIll[10]], lllIIIIIIll[11]);

        this.put(llIllllllll[lllIIIIIIll[12]], lllIIIIIIll[13]);

        this.put(llIllllllll[lllIIIIIIll[14]], lllIIIIIIll[14]);

        this.put(llIllllllll[lllIIIIIIll[15]], lllIIIIIIll[14]);

    }
}

