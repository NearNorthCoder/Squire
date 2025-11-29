/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum104
extends Enum<l> {
    public static final  /* enum */ l APMEKEN;
    private static final  l[] $VALUES;
    private final  int doorId;
    private final  String name;
    public static final  /* enum */ l HET;
    
    public static final  /* enum */ l CRONDIS;
    public static final  /* enum */ l SCABARAS;

    public String GameEnum104() {
        return this.name;
    }

    public int F() {
        return this.doorId;
    }

    static {
        l.lIlIlIIIlIIlIl();
        l.lIlIlIIIlIIlII();
        CRONDIS = new GameEnum104(llIllIIIIII[llIllIIIIIl[1]], llIllIIIIIl[2]);
        SCABARAS = new GameEnum104(llIllIIIIII[llIllIIIIIl[4]], llIllIIIIIl[5]);
        HET = new GameEnum104(llIllIIIIII[llIllIIIIIl[7]], llIllIIIIIl[8]);
        APMEKEN = new GameEnum104(llIllIIIIII[llIllIIIIIl[10]], llIllIIIIIl[11]);
        l[] lArray = new l[llIllIIIIIl[6]];
        lArray[l.llIllIIIIIl[0]] = CRONDIS;
        lArray[l.llIllIIIIIl[1]] = SCABARAS;
        lArray[l.llIllIIIIIl[3]] = HET;
        lArray[l.llIllIIIIIl[4]] = APMEKEN;
        $VALUES = lArray;
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum104.class, string);
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIlIIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlIIIlIIlII() {
        llIllIIIIII = new String[llIllIIIIIl[12]];
        l.llIllIIIIII[l.llIllIIIIIl[0]] = "CRONDIS";
        l.llIllIIIIII[l.llIllIIIIIl[1]] = "Path of Crondis";
        l.llIllIIIIII[l.llIllIIIIIl[3]] = "SCABARAS";
        l.llIllIIIIII[l.llIllIIIIIl[4]] = "Path of Scabaras";
        l.llIllIIIIII[l.llIllIIIIIl[6]] = "HET";
        l.llIllIIIIII[l.llIllIIIIIl[7]] = "Path of Het";
        l.llIllIIIIII[l.llIllIIIIIl[9]] = "APMEKEN";
        l.llIllIIIIII[l.llIllIIIIIl[10]] = "Path of Apmeken";
    }

    private GameEnum104(String string2, int n3) {
        this.name = string2;
        this.doorId = n3;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

}

