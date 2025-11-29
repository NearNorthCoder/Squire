/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum39
extends Enum<v> {
    public static final  /* enum */ v INQUISITORS_MACE;
    public static final  /* enum */ v SARADOMIN_GODSWORD;
    private static final  v[] $VALUES;
    private final  int itemID;
    public static final  /* enum */ v DRAGON_MACE;
    public static final  /* enum */ v NONE;
    
    public static final  /* enum */ v ARMADYL_GODSWORD;
    public static final  /* enum */ v BANDOS_GODSWORD;
    public static final  /* enum */ v ELDER_MAUL;
    public static final  /* enum */ v TZHAAR_KET_OM;
    
    public static final  /* enum */ v ANCIENT_GODSWORD;
    public static final  /* enum */ v DRAGON_WARHAMMER;

        return String.valueOf(var1);
    }

    private GameEnum39(int n3) {
        this.itemID = n3;
    }

    private static void lIIIlllIlllIlII() {
        llllIIIIlllI = new String[llllIIIlIIIl[20]];
        v.llllIIIIlllI[v.llllIIIlIIIl[0]] = "ELDER_MAUL";
        v.llllIIIIlllI[v.llllIIIlIIIl[2]] = "SARADOMIN_GODSWORD";
        v.llllIIIIlllI[v.llllIIIlIIIl[4]] = "ARMADYL_GODSWORD";
        v.llllIIIIlllI[v.llllIIIlIIIl[6]] = "BANDOS_GODSWORD";
        v.llllIIIIlllI[v.llllIIIlIIIl[8]] = "ANCIENT_GODSWORD";
        v.llllIIIIlllI[v.llllIIIlIIIl[10]] = "TZHAAR_KET_OM";
        v.llllIIIIlllI[v.llllIIIlIIIl[12]] = "INQUISITORS_MACE";
        v.llllIIIIlllI[v.llllIIIlIIIl[14]] = "DRAGON_MACE";
        v.llllIIIIlllI[v.llllIIIlIIIl[16]] = "DRAGON_WARHAMMER";
        v.llllIIIIlllI[v.llllIIIlIIIl[18]] = "NONE";
    }

    private static boolean lIIIlllIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    public int bH() {
        return this.itemID;
    }

    static {
        v.lIIIlllIlllIlll();
        v.lIIIlllIlllIlII();
        ELDER_MAUL = new GameEnum39(llllIIIlIIIl[1]);
        SARADOMIN_GODSWORD = new GameEnum39(llllIIIlIIIl[3]);
        ARMADYL_GODSWORD = new GameEnum39(llllIIIlIIIl[5]);
        BANDOS_GODSWORD = new GameEnum39(llllIIIlIIIl[7]);
        ANCIENT_GODSWORD = new GameEnum39(llllIIIlIIIl[9]);
        TZHAAR_KET_OM = new GameEnum39(llllIIIlIIIl[11]);
        INQUISITORS_MACE = new GameEnum39(llllIIIlIIIl[13]);
        DRAGON_MACE = new GameEnum39(llllIIIlIIIl[15]);
        DRAGON_WARHAMMER = new GameEnum39(llllIIIlIIIl[17]);
        NONE = new GameEnum39(llllIIIlIIIl[19]);
        v[] vArray = new v[llllIIIlIIIl[20]];
        vArray[v.llllIIIlIIIl[0]] = ELDER_MAUL;
        vArray[v.llllIIIlIIIl[2]] = SARADOMIN_GODSWORD;
        vArray[v.llllIIIlIIIl[4]] = ARMADYL_GODSWORD;
        vArray[v.llllIIIlIIIl[6]] = BANDOS_GODSWORD;
        vArray[v.llllIIIlIIIl[8]] = ANCIENT_GODSWORD;
        vArray[v.llllIIIlIIIl[10]] = TZHAAR_KET_OM;
        vArray[v.llllIIIlIIIl[12]] = INQUISITORS_MACE;
        vArray[v.llllIIIlIIIl[14]] = DRAGON_MACE;
        vArray[v.llllIIIlIIIl[16]] = DRAGON_WARHAMMER;
        vArray[v.llllIIIlIIIl[18]] = NONE;
        $VALUES = vArray;
    }

    public static v[] values() {
        return (v[])$VALUES.clone();
    }

    public static v valueOf(String string) {
        return Enum.valueOf(GameEnum39.class, string);
    }

}

