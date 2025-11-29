/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.saradomin.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum25
extends Enum<h> {
    public static final  /* enum */ h GROWLER;
    private final  String enemyName;
    private final  int attackAnimation;
    private static final  h[] $VALUES;
    
    public static final  /* enum */ h THROWER_TROLL;
    public static final  /* enum */ h STARLIGHT;
    private final  Prayer prayer;
    public static final  /* enum */ h BREE;
    private final  int attackSpeed;

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum25.class, string);
    }

    public String y() {
        return this.enemyName;
    }

    public int w() {
        return this.attackSpeed;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIlIlIlIllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum25(String string2, int n3, int n4, Prayer prayer) {
        this.enemyName = string2;
        this.attackAnimation = n3;
        this.attackSpeed = n4;
        this.prayer = prayer;
    }

        return String.valueOf(var1);
    }

    private GameEnum25(String string2, Prayer prayer) {
        this(string2, lIIlIlIIIIIlI[0], lIIlIlIIIIIlI[0], prayer);
    }

    public int v() {
        return this.attackAnimation;
    }

    static {
        h.lIlIlIlIllllIlI();
        h.lIlIlIlIllllIIl();
        BREE = new GameEnum25(lIIlIlIIIIIIl[lIIlIlIIIIIlI[2]], lIIlIlIIIIIlI[3], lIIlIlIIIIIlI[4], Prayer.PROTECT_FROM_MISSILES);
        GROWLER = new GameEnum25(lIIlIlIIIIIIl[lIIlIlIIIIIlI[6]], lIIlIlIIIIIlI[7], lIIlIlIIIIIlI[4], Prayer.PROTECT_FROM_MAGIC);
        STARLIGHT = new GameEnum25(lIIlIlIIIIIIl[lIIlIlIIIIIlI[4]], lIIlIlIIIIIlI[9], lIIlIlIIIIIlI[4], Prayer.PROTECT_FROM_MELEE);
        THROWER_TROLL = new GameEnum25(lIIlIlIIIIIIl[lIIlIlIIIIIlI[11]], Prayer.PROTECT_FROM_MISSILES);
        h[] hArray = new h[lIIlIlIIIIIlI[8]];
        hArray[h.lIIlIlIIIIIlI[1]] = BREE;
        hArray[h.lIIlIlIIIIIlI[2]] = GROWLER;
        hArray[h.lIIlIlIIIIIlI[5]] = STARLIGHT;
        hArray[h.lIIlIlIIIIIlI[6]] = THROWER_TROLL;
        $VALUES = hArray;
    }

    public Prayer x() {
        return this.prayer;
    }

    private static void lIlIlIlIllllIIl() {
        lIIlIlIIIIIIl = new String[lIIlIlIIIIIlI[12]];
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[1]] = "BREE";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[2]] = "Bree";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[5]] = "GROWLER";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[6]] = "Growler";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[8]] = "STARLIGHT";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[4]] = "Starlight";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[10]] = "THROWER_TROLL";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[11]] = "Thrower troll";
    }
}

