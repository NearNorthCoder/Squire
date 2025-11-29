/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

public final class GameEnum22
extends Enum<q> {
    public static final  /* enum */ q SCORCH;
    public static final  /* enum */ q SHORT_FUSE;
    public static final  /* enum */ q REAP;
    public static final  /* enum */ q BASH;
    public static final  /* enum */ q JAB;
    private static final  q[] $VALUES;
    public static final  /* enum */ q FLICK;
    public static final  /* enum */ q LONG_FUSE;
    public static final  /* enum */ q LUNGE;
    public static final  /* enum */ q LASH;
    public static final  /* enum */ q FLARE;
    public static final  /* enum */ q SMASH;
    public static final  /* enum */ q PUNCH;
    public static final  /* enum */ q CHOP;
    public static final  /* enum */ q MEDIUM_FUSE;
    public static final  /* enum */ q STAB;
    public static final  /* enum */ q HACK;
    public static final  /* enum */ q POUND;
    private final  String action;
    public static final  /* enum */ q FLAMER;
    public static final  /* enum */ q SPELL_DEFENSIVE;
    public static final  /* enum */ q EXPLOSIVE;
    public static final  /* enum */ q DEFLECT;
    public static final  /* enum */ q LONGRANGE;
    public static final  /* enum */ q FOCUS;
    public static final  /* enum */ q AIM_AND_FIRE;
    public static final  /* enum */ q RAPID;
    public static final  /* enum */ q BLOCK;
    public static final  /* enum */ q PUMMEL;
    public static final  /* enum */ q SLASH;
    
    public static final  /* enum */ q FEND;
    public static final  /* enum */ q SPIKE;
    public static final  /* enum */ q SWIPE;
    public static final  /* enum */ q KICK;
    public static final  /* enum */ q IMPALE;
    public static final  /* enum */ q ACCURATE;
    
    public static final  /* enum */ q BLAZE;
    public static final  /* enum */ q SPELL;

    private static boolean lIIlIIIlIllIlIl(int n2) {
        return n2 == 0;
    }

    private GameEnum22(String string2) {
        this.action = string2;
    }

    static {
        q.lIIlIIIlIllIIll();
        q.lIIlIIIlIllIIlI();
        ACCURATE = new GameEnum22();
        AIM_AND_FIRE = new GameEnum22();
        BASH = new GameEnum22();
        BLAZE = new GameEnum22();
        BLOCK = new GameEnum22();
        CHOP = new GameEnum22();
        DEFLECT = new GameEnum22();
        EXPLOSIVE = new GameEnum22();
        FEND = new GameEnum22();
        FLAMER = new GameEnum22();
        FLARE = new GameEnum22();
        FLICK = new GameEnum22();
        FOCUS = new GameEnum22();
        HACK = new GameEnum22();
        IMPALE = new GameEnum22();
        JAB = new GameEnum22();
        KICK = new GameEnum22();
        LASH = new GameEnum22();
        LONG_FUSE = new GameEnum22();
        LONGRANGE = new GameEnum22();
        LUNGE = new GameEnum22();
        MEDIUM_FUSE = new GameEnum22();
        POUND = new GameEnum22();
        PUMMEL = new GameEnum22();
        PUNCH = new GameEnum22();
        RAPID = new GameEnum22();
        REAP = new GameEnum22();
        SCORCH = new GameEnum22();
        SHORT_FUSE = new GameEnum22();
        SLASH = new GameEnum22();
        SMASH = new GameEnum22();
        SPELL = new GameEnum22();
        SPELL_DEFENSIVE = new GameEnum22();
        SPIKE = new GameEnum22();
        STAB = new GameEnum22();
        SWIPE = new GameEnum22();
        q[] qArray = new q[llllIllIIlII[36]];
        qArray[q.llllIllIIlII[0]] = ACCURATE;
        qArray[q.llllIllIIlII[1]] = AIM_AND_FIRE;
        qArray[q.llllIllIIlII[2]] = BASH;
        qArray[q.llllIllIIlII[3]] = BLAZE;
        qArray[q.llllIllIIlII[4]] = BLOCK;
        qArray[q.llllIllIIlII[5]] = CHOP;
        qArray[q.llllIllIIlII[6]] = DEFLECT;
        qArray[q.llllIllIIlII[7]] = EXPLOSIVE;
        qArray[q.llllIllIIlII[8]] = FEND;
        qArray[q.llllIllIIlII[9]] = FLAMER;
        qArray[q.llllIllIIlII[10]] = FLARE;
        qArray[q.llllIllIIlII[11]] = FLICK;
        qArray[q.llllIllIIlII[12]] = FOCUS;
        qArray[q.llllIllIIlII[13]] = HACK;
        qArray[q.llllIllIIlII[14]] = IMPALE;
        qArray[q.llllIllIIlII[15]] = JAB;
        qArray[q.llllIllIIlII[16]] = KICK;
        qArray[q.llllIllIIlII[17]] = LASH;
        qArray[q.llllIllIIlII[18]] = LONG_FUSE;
        qArray[q.llllIllIIlII[19]] = LONGRANGE;
        qArray[q.llllIllIIlII[20]] = LUNGE;
        qArray[q.llllIllIIlII[21]] = MEDIUM_FUSE;
        qArray[q.llllIllIIlII[22]] = POUND;
        qArray[q.llllIllIIlII[23]] = PUMMEL;
        qArray[q.llllIllIIlII[24]] = PUNCH;
        qArray[q.llllIllIIlII[25]] = RAPID;
        qArray[q.llllIllIIlII[26]] = REAP;
        qArray[q.llllIllIIlII[27]] = SCORCH;
        qArray[q.llllIllIIlII[28]] = SHORT_FUSE;
        qArray[q.llllIllIIlII[29]] = SLASH;
        qArray[q.llllIllIIlII[30]] = SMASH;
        qArray[q.llllIllIIlII[31]] = SPELL;
        qArray[q.llllIllIIlII[32]] = SPELL_DEFENSIVE;
        qArray[q.llllIllIIlII[33]] = SPIKE;
        qArray[q.llllIllIIlII[34]] = STAB;
        qArray[q.llllIllIIlII[35]] = SWIPE;
        $VALUES = qArray;
    }

    private static boolean lIIlIIIlIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIIlIllIIlI() {
        llllIllIIIIl = new String[llllIllIIlII[36]];
        q.llllIllIIIIl[q.llllIllIIlII[0]] = "ACCURATE";
        q.llllIllIIIIl[q.llllIllIIlII[1]] = "AIM_AND_FIRE";
        q.llllIllIIIIl[q.llllIllIIlII[2]] = "BASH";
        q.llllIllIIIIl[q.llllIllIIlII[3]] = "BLAZE";
        q.llllIllIIIIl[q.llllIllIIlII[4]] = "BLOCK";
        q.llllIllIIIIl[q.llllIllIIlII[5]] = "CHOP";
        q.llllIllIIIIl[q.llllIllIIlII[6]] = "DEFLECT";
        q.llllIllIIIIl[q.llllIllIIlII[7]] = "EXPLOSIVE";
        q.llllIllIIIIl[q.llllIllIIlII[8]] = "FEND";
        q.llllIllIIIIl[q.llllIllIIlII[9]] = "FLAMER";
        q.llllIllIIIIl[q.llllIllIIlII[10]] = "FLARE";
        q.llllIllIIIIl[q.llllIllIIlII[11]] = "FLICK";
        q.llllIllIIIIl[q.llllIllIIlII[12]] = "FOCUS";
        q.llllIllIIIIl[q.llllIllIIlII[13]] = "HACK";
        q.llllIllIIIIl[q.llllIllIIlII[14]] = "IMPALE";
        q.llllIllIIIIl[q.llllIllIIlII[15]] = "JAB";
        q.llllIllIIIIl[q.llllIllIIlII[16]] = "KICK";
        q.llllIllIIIIl[q.llllIllIIlII[17]] = "LASH";
        q.llllIllIIIIl[q.llllIllIIlII[18]] = "LONG_FUSE";
        q.llllIllIIIIl[q.llllIllIIlII[19]] = "LONGRANGE";
        q.llllIllIIIIl[q.llllIllIIlII[20]] = "LUNGE";
        q.llllIllIIIIl[q.llllIllIIlII[21]] = "MEDIUM_FUSE";
        q.llllIllIIIIl[q.llllIllIIlII[22]] = "POUND";
        q.llllIllIIIIl[q.llllIllIIlII[23]] = "PUMMEL";
        q.llllIllIIIIl[q.llllIllIIlII[24]] = "PUNCH";
        q.llllIllIIIIl[q.llllIllIIlII[25]] = "RAPID";
        q.llllIllIIIIl[q.llllIllIIlII[26]] = "REAP";
        q.llllIllIIIIl[q.llllIllIIlII[27]] = "SCORCH";
        q.llllIllIIIIl[q.llllIllIIlII[28]] = "SHORT_FUSE";
        q.llllIllIIIIl[q.llllIllIIlII[29]] = "SLASH";
        q.llllIllIIIIl[q.llllIllIIlII[30]] = "SMASH";
        q.llllIllIIIIl[q.llllIllIIlII[31]] = "SPELL";
        q.llllIllIIIIl[q.llllIllIIlII[32]] = "SPELL_DEFENSIVE";
        q.llllIllIIIIl[q.llllIllIIlII[33]] = "SPIKE";
        q.llllIllIIIIl[q.llllIllIIlII[34]] = "STAB";
        q.llllIllIIIIl[q.llllIllIIlII[35]] = "SWIPE";
    }

    public static q valueOf(String string) {
        return Enum.valueOf(GameEnum22.class, string);
    }

    public boolean bj() {
        o o2 = p.bq();
        if (q.lIIlIIIlIllIlII(o2)) {
            return llllIllIIlII[0];
        }
        return Objects.equals((Object)o2.bl(), (Object)this);
    }

    public boolean bk() {
        boolean bl;
        q[] qArray = new q[llllIllIIlII[1]];
        qArray[q.llllIllIIlII[0]] = this;
        if (q.lIIlIIIlIllIlIl(p.a(qArray).isEmpty() ? 1 : 0)) {
            bl = llllIllIIlII[1];

        } else {
            bl = llllIllIIlII[0];
        }
        return bl;
    }

    public String bC() {
        return this.action;
    }

        return String.valueOf(var1);
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    private GameEnum22() {
        this(null);
    }

    private static boolean lIIlIIIlIllIlII(Object object) {
        return object == null;
    }

}

