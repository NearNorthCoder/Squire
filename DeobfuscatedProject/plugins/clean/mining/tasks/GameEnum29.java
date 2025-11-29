/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mining.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum29
extends Enum<a> {
     String activityName;
    public static final  /* enum */ a GRANITE;
    public static final  /* enum */ a BONE_SHARDS;
    public static final  /* enum */ a GEM_ROCKS;
    public static final  /* enum */ a ESSENCE;
    
    public static final  /* enum */ a VOLCANIC_ASH;
    public static final  /* enum */ a MOTHERLODE_MINE;
    public static final  /* enum */ a SUPERHEAT_MINE;
    public static final  /* enum */ a DAEYALT;
    public static final  /* enum */ a SANDSTONE;
    public static final  /* enum */ a AMETHYST;
    
    private static final  a[] $VALUES;
    public static final  /* enum */ a GUILD_IRON;
    public static final  /* enum */ a ARDY_IRON;

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum29.class, string);
    }

    static {
        a.lIIlIIlIlllIlII();
        a.lIIlIIlIlllIIll();
        MOTHERLODE_MINE = new GameEnum29(lllllIIllIIl[lllllIIllIlI[1]]);
        SANDSTONE = new GameEnum29(lllllIIllIIl[lllllIIllIlI[3]]);
        GEM_ROCKS = new GameEnum29(lllllIIllIIl[lllllIIllIlI[5]]);
        GUILD_IRON = new GameEnum29(lllllIIllIIl[lllllIIllIlI[7]]);
        ARDY_IRON = new GameEnum29(lllllIIllIIl[lllllIIllIlI[9]]);
        GRANITE = new GameEnum29(lllllIIllIIl[lllllIIllIlI[11]]);
        AMETHYST = new GameEnum29(lllllIIllIIl[lllllIIllIlI[13]]);
        VOLCANIC_ASH = new GameEnum29(lllllIIllIIl[lllllIIllIlI[15]]);
        SUPERHEAT_MINE = new GameEnum29(lllllIIllIIl[lllllIIllIlI[17]]);
        ESSENCE = new GameEnum29(lllllIIllIIl[lllllIIllIlI[19]]);
        DAEYALT = new GameEnum29(lllllIIllIIl[lllllIIllIlI[21]]);
        BONE_SHARDS = new GameEnum29(lllllIIllIIl[lllllIIllIlI[23]]);
        a[] aArray = new a[lllllIIllIlI[12]];
        aArray[a.lllllIIllIlI[0]] = MOTHERLODE_MINE;
        aArray[a.lllllIIllIlI[1]] = SANDSTONE;
        aArray[a.lllllIIllIlI[2]] = GEM_ROCKS;
        aArray[a.lllllIIllIlI[3]] = GUILD_IRON;
        aArray[a.lllllIIllIlI[4]] = ARDY_IRON;
        aArray[a.lllllIIllIlI[5]] = GRANITE;
        aArray[a.lllllIIllIlI[6]] = AMETHYST;
        aArray[a.lllllIIllIlI[7]] = VOLCANIC_ASH;
        aArray[a.lllllIIllIlI[8]] = SUPERHEAT_MINE;
        aArray[a.lllllIIllIlI[9]] = ESSENCE;
        aArray[a.lllllIIllIlI[10]] = DAEYALT;
        aArray[a.lllllIIllIlI[11]] = BONE_SHARDS;
        $VALUES = aArray;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public String c() {
        return this.activityName;
    }

    private static void lIIlIIlIlllIIll() {
        lllllIIllIIl = new String[lllllIIllIlI[24]];
        a.lllllIIllIIl[a.lllllIIllIlI[0]] = "MOTHERLODE_MINE";
        a.lllllIIllIIl[a.lllllIIllIlI[1]] = "Motherlode_Mine";
        a.lllllIIllIIl[a.lllllIIllIlI[2]] = "SANDSTONE";
        a.lllllIIllIIl[a.lllllIIllIlI[3]] = "Sandstone";
        a.lllllIIllIIl[a.lllllIIllIlI[4]] = "GEM_ROCKS";
        a.lllllIIllIIl[a.lllllIIllIlI[5]] = "Gem rocks";
        a.lllllIIllIIl[a.lllllIIllIlI[6]] = "GUILD_IRON";
        a.lllllIIllIIl[a.lllllIIllIlI[7]] = "Guild iron";
        a.lllllIIllIIl[a.lllllIIllIlI[8]] = "ARDY_IRON";
        a.lllllIIllIIl[a.lllllIIllIlI[9]] = "Ardy iron (3t)";
        a.lllllIIllIIl[a.lllllIIllIlI[10]] = "GRANITE";
        a.lllllIIllIIl[a.lllllIIllIlI[11]] = "Granite";
        a.lllllIIllIIl[a.lllllIIllIlI[12]] = "AMETHYST";
        a.lllllIIllIIl[a.lllllIIllIlI[13]] = "Amethyst";
        a.lllllIIllIIl[a.lllllIIllIlI[14]] = "VOLCANIC_ASH";
        a.lllllIIllIIl[a.lllllIIllIlI[15]] = "Volcanic ash";
        a.lllllIIllIIl[a.lllllIIllIlI[16]] = "SUPERHEAT_MINE";
        a.lllllIIllIIl[a.lllllIIllIlI[17]] = "Superheat Mine";
        a.lllllIIllIIl[a.lllllIIllIlI[18]] = "ESSENCE";
        a.lllllIIllIIl[a.lllllIIllIlI[19]] = "Essence mine";
        a.lllllIIllIIl[a.lllllIIllIlI[20]] = "DAEYALT";
        a.lllllIIllIIl[a.lllllIIllIlI[21]] = "Daeyalt Essence";
        a.lllllIIllIIl[a.lllllIIllIlI[22]] = "BONE_SHARDS";
        a.lllllIIllIIl[a.lllllIIllIlI[23]] = "Bone shards";
    }

    private GameEnum29(String string2) {
        this.activityName = string2;
    }

    private static boolean lIIlIIlIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }
}

