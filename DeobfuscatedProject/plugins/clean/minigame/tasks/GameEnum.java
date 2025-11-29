/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigame.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<c> {
    public static final  /* enum */ c VETERAN;
    private  int pointsPerGame;
    private  String difficulty;
    public static final  /* enum */ c INTERMEDIATE;
    
    private  int levelRequirement;
    private  int objectID;
    private static final  c[] $VALUES;
    public static final  /* enum */ c NOVICE;

    static {
        c.lIIllllllIlIIII();
        c.lIIllllllIIllll();
        NOVICE = new GameEnum(lIIIlIlIIIIII[lIIIlIlIIIIIl[1]], lIIIlIlIIIIIl[2], lIIIlIlIIIIIl[3], lIIIlIlIIIIIl[4]);
        INTERMEDIATE = new GameEnum(lIIIlIlIIIIII[lIIIlIlIIIIIl[4]], lIIIlIlIIIIIl[6], lIIIlIlIIIIIl[7], lIIIlIlIIIIIl[8]);
        VETERAN = new GameEnum(lIIIlIlIIIIII[lIIIlIlIIIIIl[9]], lIIIlIlIIIIIl[10], lIIIlIlIIIIIl[11], lIIIlIlIIIIIl[9]);
        c[] cArray = new c[lIIIlIlIIIIIl[4]];
        cArray[c.lIIIlIlIIIIIl[0]] = NOVICE;
        cArray[c.lIIIlIlIIIIIl[1]] = INTERMEDIATE;
        cArray[c.lIIIlIlIIIIIl[5]] = VETERAN;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIIllllllIIllll() {
        lIIIlIlIIIIII = new String[lIIIlIlIIIIIl[12]];
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[0]] = "NOVICE";
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[1]] = "Novice";
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[5]] = "INTERMEDIATE";
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[4]] = "Intermediate";
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[8]] = "VETERAN";
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[9]] = "Veteran";
    }

    public String j() {
        return this.difficulty;
    }

    public String toString() {
        return "Boats." + this.name() + "(difficulty=" + this.j() + ", levelRequirement=" + this.k() + ", objectID=" + this.l() + ", pointsPerGame=" + this.m() + ")";
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static boolean lIIllllllIlIIIl(int n, int n2) {
        return n < n2;
    }

    public int m() {
        return this.pointsPerGame;
    }

    private GameEnum(String string2, int n2, int n3, int n4) {
        this.difficulty = string2;
        this.levelRequirement = n2;
        this.objectID = n3;
        this.pointsPerGame = n4;
    }

    public int k() {
        return this.levelRequirement;
    }

    public int l() {
        return this.objectID;
    }

        return String.valueOf(var1);
    }
}

