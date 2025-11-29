/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.hydra.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum11
extends Enum<j> {
    private final  int projectileID;
    public static final  /* enum */ j RANGED;
    private final  Prayer prayer;
    private final  int spriteID;
    
    public static final  /* enum */ j MAGIC;
    private static final  j[] $VALUES;

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    public int W() {
        return this.projectileID;
    }

    static {
        j.lIIIllllIIlIlII();
        j.lIIIllllIIIlllI();
        MAGIC = new GameEnum11(llllIIIllIIl[3], Prayer.PROTECT_FROM_MAGIC, llllIIIllIIl[4]);
        RANGED = new GameEnum11(llllIIIllIIl[6], Prayer.PROTECT_FROM_MISSILES, llllIIIllIIl[7]);
        j[] jArray = new j[llllIIIllIIl[2]];
        jArray[j.llllIIIllIIl[0]] = MAGIC;
        jArray[j.llllIIIllIIl[1]] = RANGED;
        $VALUES = jArray;
    }

    private GameEnum11(int n3, Prayer prayer, int n4) {
        this.projectileID = n3;
        this.prayer = prayer;
        this.spriteID = n4;
    }

    private static void lIIIllllIIIlllI() {
        llllIIIlIllI = new String[llllIIIllIIl[8]];
        j.llllIIIlIllI[j.llllIIIllIIl[0]] = "_";
        j.llllIIIlIllI[j.llllIIIllIIl[1]] = j.lIIIllllIIIlIlI("nI8qYrEsPms=", "ySURb");
        j.llllIIIlIllI[j.llllIIIllIIl[2]] = "MAGIC";
        j.llllIIIlIllI[j.llllIIIllIIl[5]] = "RANGED";
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIllllIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public int Y() {
        return this.spriteID;
    }

    public Prayer X() {
        return this.prayer;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(llllIIIllIIl[0]) + string.substring(llllIIIllIIl[1]).replaceAll(llllIIIlIllI[llllIIIllIIl[0]], llllIIIlIllI[llllIIIllIIl[1]]).toLowerCase();
    }
}

