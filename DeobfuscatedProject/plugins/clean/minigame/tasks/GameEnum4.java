/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigame.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum4
extends Enum<e> {
    private  String name;

    public static final  /* enum */ e TORCHER;
    public static final  /* enum */ e SPINNER;
    public static final  /* enum */ e SHIFTER;
    private  int priority;
    public static final  /* enum */ e SPLATTER;
    public static final  /* enum */ e DEFILER;
    public static final  /* enum */ e BRAWLER;
    public static final  /* enum */ e RAVAGER;
    public static final  /* enum */ e PORTAL;
    private static final  e[] $VALUES;

    private GameEnum4(String string2, int n2) {
        this.name = string2;
        this.priority = n2;
    }

    private static void lIIllllllIIlIll() {
        lIIIlIIllllIl = new String[lIIIlIIllllll[16]];
        e.lIIIlIIllllIl[e.lIIIlIIllllll[0]] = "BRAWLER";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[1]] = "Brawler";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[2]] = "SPINNER";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[3]] = "Spinner";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[4]] = "PORTAL";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[5]] = "Portal";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[6]] = "DEFILER";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[7]] = "Defiler";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[8]] = "RAVAGER";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[9]] = "Ravager";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[10]] = "SHIFTER";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[11]] = "Shifter";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[12]] = "TORCHER";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[13]] = "Torcher";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[14]] = "SPLATTER";
        e.lIIIlIIllllIl[e.lIIIlIIllllll[15]] = "Splatter";
    }

    static {
        e.lIIlllllllllIII();
        e.lIIllllllIIlIll();
        BRAWLER = new GameEnum4(lIIIlIIllllIl[lIIIlIIllllll[1]], lIIIlIIllllll[1]);
        SPINNER = new GameEnum4(lIIIlIIllllIl[lIIIlIIllllll[3]], lIIIlIIllllll[2]);
        PORTAL = new GameEnum4(lIIIlIIllllIl[lIIIlIIllllll[5]], lIIIlIIllllll[3]);
        DEFILER = new GameEnum4(lIIIlIIllllIl[lIIIlIIllllll[7]], lIIIlIIllllll[4]);
        RAVAGER = new GameEnum4(lIIIlIIllllIl[lIIIlIIllllll[9]], lIIIlIIllllll[4]);
        SHIFTER = new GameEnum4(lIIIlIIllllIl[lIIIlIIllllll[11]], lIIIlIIllllll[5]);
        TORCHER = new GameEnum4(lIIIlIIllllIl[lIIIlIIllllll[13]], lIIIlIIllllll[5]);
        SPLATTER = new GameEnum4(lIIIlIIllllIl[lIIIlIIllllll[15]], lIIIlIIllllll[6]);
        e[] eArray = new e[lIIIlIIllllll[8]];
        eArray[e.lIIIlIIllllll[0]] = BRAWLER;
        eArray[e.lIIIlIIllllll[1]] = SPINNER;
        eArray[e.lIIIlIIllllll[2]] = PORTAL;
        eArray[e.lIIIlIIllllll[3]] = DEFILER;
        eArray[e.lIIIlIIllllll[4]] = RAVAGER;
        eArray[e.lIIIlIIllllll[5]] = SHIFTER;
        eArray[e.lIIIlIIllllll[6]] = TORCHER;
        eArray[e.lIIIlIIllllll[7]] = SPLATTER;
        $VALUES = eArray;
    }

    public int q() {
        return this.priority;
    }

    public static e o() {
        return Arrays.stream(e.values()).max(Comparator.comparingInt(e::q)).orElse(null);
    }

    public String toString() {
        return "Monsters." + this.name() + "(name=" + this.p() + ", priority=" + this.q() + ")";
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlllllllllIIl(int n, int n2) {
        return n < n2;
    }

    public String p() {
        return this.name;
    }
}

