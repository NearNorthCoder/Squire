/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.thieving.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum32
extends Enum<f> {
    public static final  /* enum */ f VYRE;
    public static final  /* enum */ f ELF;
    public static final  /* enum */ f MAN;
    private static final  f[] $VALUES;

    public static final  /* enum */ f ARDY_KNIGHT;
    private final  String name;
    public static final  /* enum */ f MASTER_FARMER;
    public static final  /* enum */ f TZHAAR;

    static {
        f.lIllIIllIIIlIlI();
        f.lIllIIllIIIlIIl();
        ARDY_KNIGHT = new GameEnum32(lIIlllIIlIlIl[lIIlllIIlIllI[1]]);
        MASTER_FARMER = new GameEnum32(lIIlllIIlIlIl[lIIlllIIlIllI[3]]);
        MAN = new GameEnum32(lIIlllIIlIlIl[lIIlllIIlIllI[5]]);
        VYRE = new GameEnum32(lIIlllIIlIlIl[lIIlllIIlIllI[7]]);
        ELF = new GameEnum32(lIIlllIIlIlIl[lIIlllIIlIllI[9]]);
        TZHAAR = new GameEnum32(lIIlllIIlIlIl[lIIlllIIlIllI[11]]);
        f[] fArray = new f[lIIlllIIlIllI[6]];
        fArray[f.lIIlllIIlIllI[0]] = ARDY_KNIGHT;
        fArray[f.lIIlllIIlIllI[1]] = MASTER_FARMER;
        fArray[f.lIIlllIIlIllI[2]] = MAN;
        fArray[f.lIIlllIIlIllI[3]] = VYRE;
        fArray[f.lIIlllIIlIllI[4]] = ELF;
        fArray[f.lIIlllIIlIllI[5]] = TZHAAR;
        $VALUES = fArray;
    }

    private GameEnum32(String string2) {
        this.name = string2;
    }

    public String v() {
        return this.name;
    }

    private static void lIllIIllIIIlIIl() {
        lIIlllIIlIlIl = new String[lIIlllIIlIllI[12]];
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[0]] = "ARDY_KNIGHT";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[1]] = "Knight of Ardougne";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[2]] = "MASTER_FARMER";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[3]] = "Master Farmer";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[4]] = "MAN";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[5]] = "Man";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[6]] = "VYRE";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[7]] = "Vyre";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[8]] = "ELF";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[9]] = "Elf";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[10]] = "TZHAAR";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[11]] = "TzHaar-Hur";
    }

    private static boolean lIllIIllIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum32.class, string);
    }
}

