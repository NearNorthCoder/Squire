/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

public final class GameEnum18
extends Enum<n> {
    private static final  n[] $VALUES;
    public static final  /* enum */ n CRUSH;
    public static final  /* enum */ n EMITS_A_JET_OF_FLAME;
    public static final  /* enum */ n SPELLCASTING;
    
    public static final  /* enum */ n STAB;
    public static final  /* enum */ n NONE;
    public static final  /* enum */ n SLASH;
    public static final  /* enum */ n MAGIC;
    
    public static final  /* enum */ n DEFENSIVE_CASTING;
    public static final  /* enum */ n RANGED;
    public static final  /* enum */ n FIRES_AN_EXPLOSIVE_ROUND;

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }

    public boolean bj() {
        o o2 = p.bq();
        if (n.lIIlIIIllllIlIl(o2)) {
            return llllIlllIlIl[0];
        }
        return Objects.equals((Object)o2.bm(), (Object)this);
    }

    private static boolean lIIlIIIllllIlIl(Object object) {
        return object == null;
    }

    public boolean bk() {
        boolean bl;
        n[] nArray = new n[llllIlllIlIl[1]];
        nArray[n.llllIlllIlIl[0]] = this;
        if (n.lIIlIIIllllIllI(p.a(nArray).isEmpty() ? 1 : 0)) {
            bl = llllIlllIlIl[1];

            if (((0x26 ^ 0x1D) & ~(0x59 ^ 0x62)) == 3) {
                return false;
            }
        } else {
            bl = llllIlllIlIl[0];
        }
        return bl;
    }

    private static void lIIlIIIllllIIll() {
        llllIlllIlII = new String[llllIlllIlIl[10]];
        n.llllIlllIlII[n.llllIlllIlIl[0]] = "CRUSH";
        n.llllIlllIlII[n.llllIlllIlIl[1]] = "DEFENSIVE_CASTING";
        n.llllIlllIlII[n.llllIlllIlIl[2]] = "EMITS_A_JET_OF_FLAME";
        n.llllIlllIlII[n.llllIlllIlIl[3]] = "FIRES_AN_EXPLOSIVE_ROUND";
        n.llllIlllIlII[n.llllIlllIlIl[4]] = "MAGIC";
        n.llllIlllIlII[n.llllIlllIlIl[5]] = "NONE";
        n.llllIlllIlII[n.llllIlllIlIl[6]] = "RANGED";
        n.llllIlllIlII[n.llllIlllIlIl[7]] = "SLASH";
        n.llllIlllIlII[n.llllIlllIlIl[8]] = "SPELLCASTING";
        n.llllIlllIlII[n.llllIlllIlIl[9]] = "STAB";
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIIllllIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    private static boolean lIIlIIIllllIllI(int n2) {
        return n2 == 0;
    }

    static {
        n.lIIlIIIllllIlII();
        n.lIIlIIIllllIIll();
        CRUSH = new GameEnum18();
        DEFENSIVE_CASTING = new GameEnum18();
        EMITS_A_JET_OF_FLAME = new GameEnum18();
        FIRES_AN_EXPLOSIVE_ROUND = new GameEnum18();
        MAGIC = new GameEnum18();
        NONE = new GameEnum18();
        RANGED = new GameEnum18();
        SLASH = new GameEnum18();
        SPELLCASTING = new GameEnum18();
        STAB = new GameEnum18();
        n[] nArray = new n[llllIlllIlIl[10]];
        nArray[n.llllIlllIlIl[0]] = CRUSH;
        nArray[n.llllIlllIlIl[1]] = DEFENSIVE_CASTING;
        nArray[n.llllIlllIlIl[2]] = EMITS_A_JET_OF_FLAME;
        nArray[n.llllIlllIlIl[3]] = FIRES_AN_EXPLOSIVE_ROUND;
        nArray[n.llllIlllIlIl[4]] = MAGIC;
        nArray[n.llllIlllIlIl[5]] = NONE;
        nArray[n.llllIlllIlIl[6]] = RANGED;
        nArray[n.llllIlllIlIl[7]] = SLASH;
        nArray[n.llllIlllIlIl[8]] = SPELLCASTING;
        nArray[n.llllIlllIlIl[9]] = STAB;
        $VALUES = nArray;
    }
}

