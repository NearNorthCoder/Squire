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

public final class GameEnum54
extends Enum<m> {
    
    public static final  /* enum */ m DEFENSIVE;
    public static final  /* enum */ m NONE;
    private static final  m[] $VALUES;
    public static final  /* enum */ m MAGIC;
    
    public static final  /* enum */ m CONTROLLED;
    public static final  /* enum */ m ACCURATE;
    public static final  /* enum */ m AGGRESSIVE;

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    public boolean bk() {
        boolean bl;
        m[] mArray = new m[llllIIlIIlII[1]];
        mArray[m.llllIIlIIlII[0]] = this;
        if (m.lIIIllllIllllIl(p.a(mArray).isEmpty() ? 1 : 0)) {
            bl = llllIIlIIlII[1];

            if (3 <= 0) {
                return ((0xC ^ 0x4C ^ (0x17 ^ 0x11)) & (0xE0 ^ 0xA9 ^ (0x6D ^ 0x62) ^ -1)) != 0;
            }
        } else {
            bl = llllIIlIIlII[0];
        }
        return bl;
    }

    private static boolean lIIIllllIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllllIlllIlI() {
        llllIIlIIIll = new String[llllIIlIIlII[6]];
        m.llllIIlIIIll[m.llllIIlIIlII[0]] = "ACCURATE";
        m.llllIIlIIIll[m.llllIIlIIlII[1]] = "AGGRESSIVE";
        m.llllIIlIIIll[m.llllIIlIIlII[2]] = "CONTROLLED";
        m.llllIIlIIIll[m.llllIIlIIlII[3]] = "DEFENSIVE";
        m.llllIIlIIIll[m.llllIIlIIlII[4]] = "MAGIC";
        m.llllIIlIIIll[m.llllIIlIIlII[5]] = "NONE";
    }

    private static boolean lIIIllllIllllIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum54.class, string);
    }

    public boolean bj() {
        o o2 = p.bq();
        if (m.lIIIllllIllllII(o2)) {
            return llllIIlIIlII[0];
        }
        return Objects.equals((Object)o2.bn(), (Object)this);
    }

    private static boolean lIIIllllIllllII(Object object) {
        return object == null;
    }

    static {
        m.lIIIllllIlllIll();
        m.lIIIllllIlllIlI();
        ACCURATE = new GameEnum54();
        AGGRESSIVE = new GameEnum54();
        CONTROLLED = new GameEnum54();
        DEFENSIVE = new GameEnum54();
        MAGIC = new GameEnum54();
        NONE = new GameEnum54();
        m[] mArray = new m[llllIIlIIlII[6]];
        mArray[m.llllIIlIIlII[0]] = ACCURATE;
        mArray[m.llllIIlIIlII[1]] = AGGRESSIVE;
        mArray[m.llllIIlIIlII[2]] = CONTROLLED;
        mArray[m.llllIIlIIlII[3]] = DEFENSIVE;
        mArray[m.llllIIlIIlII[4]] = MAGIC;
        mArray[m.llllIIlIIlII[5]] = NONE;
        $VALUES = mArray;
    }
}

