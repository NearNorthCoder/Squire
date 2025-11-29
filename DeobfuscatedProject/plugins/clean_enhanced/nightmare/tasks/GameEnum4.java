/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.util.Objects;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

public final class GameEnum4
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

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private GameEnum4(String string2) {
        this.action = string2;
    }

    static {
        q.var4();
        q.var5();
        ACCURATE = new GameEnum4();
        AIM_AND_FIRE = new GameEnum4();
        BASH = new GameEnum4();
        BLAZE = new GameEnum4();
        BLOCK = new GameEnum4();
        CHOP = new GameEnum4();
        DEFLECT = new GameEnum4();
        EXPLOSIVE = new GameEnum4();
        FEND = new GameEnum4();
        FLAMER = new GameEnum4();
        FLARE = new GameEnum4();
        FLICK = new GameEnum4();
        FOCUS = new GameEnum4();
        HACK = new GameEnum4();
        IMPALE = new GameEnum4();
        JAB = new GameEnum4();
        KICK = new GameEnum4();
        LASH = new GameEnum4();
        LONG_FUSE = new GameEnum4();
        LONGRANGE = new GameEnum4();
        LUNGE = new GameEnum4();
        MEDIUM_FUSE = new GameEnum4();
        POUND = new GameEnum4();
        PUMMEL = new GameEnum4();
        PUNCH = new GameEnum4();
        RAPID = new GameEnum4();
        REAP = new GameEnum4();
        SCORCH = new GameEnum4();
        SHORT_FUSE = new GameEnum4();
        SLASH = new GameEnum4();
        SMASH = new GameEnum4();
        SPELL = new GameEnum4();
        SPELL_DEFENSIVE = new GameEnum4();
        SPIKE = new GameEnum4();
        STAB = new GameEnum4();
        SWIPE = new GameEnum4();
        q[] qArray = new q[var2[36]];
        qArray[q.var2[0]] = ACCURATE;
        qArray[q.var2[1]] = AIM_AND_FIRE;
        qArray[q.var2[2]] = BASH;
        qArray[q.var2[3]] = BLAZE;
        qArray[q.var2[4]] = BLOCK;
        qArray[q.var2[5]] = CHOP;
        qArray[q.var2[6]] = DEFLECT;
        qArray[q.var2[7]] = EXPLOSIVE;
        qArray[q.var2[8]] = FEND;
        qArray[q.var2[9]] = FLAMER;
        qArray[q.var2[10]] = FLARE;
        qArray[q.var2[11]] = FLICK;
        qArray[q.var2[12]] = FOCUS;
        qArray[q.var2[13]] = HACK;
        qArray[q.var2[14]] = IMPALE;
        qArray[q.var2[15]] = JAB;
        qArray[q.var2[16]] = KICK;
        qArray[q.var2[17]] = LASH;
        qArray[q.var2[18]] = LONG_FUSE;
        qArray[q.var2[19]] = LONGRANGE;
        qArray[q.var2[20]] = LUNGE;
        qArray[q.var2[21]] = MEDIUM_FUSE;
        qArray[q.var2[22]] = POUND;
        qArray[q.var2[23]] = PUMMEL;
        qArray[q.var2[24]] = PUNCH;
        qArray[q.var2[25]] = RAPID;
        qArray[q.var2[26]] = REAP;
        qArray[q.var2[27]] = SCORCH;
        qArray[q.var2[28]] = SHORT_FUSE;
        qArray[q.var2[29]] = SLASH;
        qArray[q.var2[30]] = SMASH;
        qArray[q.var2[31]] = SPELL;
        qArray[q.var2[32]] = SPELL_DEFENSIVE;
        qArray[q.var2[33]] = SPIKE;
        qArray[q.var2[34]] = STAB;
        qArray[q.var2[35]] = SWIPE;
        $VALUES = qArray;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static void var5() {
        var1 = new String[var2[36]];
        q.var1[q.var2[0]] = "ACCURATE";
        q.var1[q.var2[1]] = "AIM_AND_FIRE";
        q.var1[q.var2[2]] = "BASH";
        q.var1[q.var2[3]] = "BLAZE";
        q.var1[q.var2[4]] = "BLOCK";
        q.var1[q.var2[5]] = "CHOP";
        q.var1[q.var2[6]] = "DEFLECT";
        q.var1[q.var2[7]] = "EXPLOSIVE";
        q.var1[q.var2[8]] = "FEND";
        q.var1[q.var2[9]] = "FLAMER";
        q.var1[q.var2[10]] = "FLARE";
        q.var1[q.var2[11]] = "FLICK";
        q.var1[q.var2[12]] = "FOCUS";
        q.var1[q.var2[13]] = "HACK";
        q.var1[q.var2[14]] = "IMPALE";
        q.var1[q.var2[15]] = "JAB";
        q.var1[q.var2[16]] = "KICK";
        q.var1[q.var2[17]] = "LASH";
        q.var1[q.var2[18]] = "LONG_FUSE";
        q.var1[q.var2[19]] = "LONGRANGE";
        q.var1[q.var2[20]] = "LUNGE";
        q.var1[q.var2[21]] = "MEDIUM_FUSE";
        q.var1[q.var2[22]] = "POUND";
        q.var1[q.var2[23]] = "PUMMEL";
        q.var1[q.var2[24]] = "PUNCH";
        q.var1[q.var2[25]] = "RAPID";
        q.var1[q.var2[26]] = "REAP";
        q.var1[q.var2[27]] = "SCORCH";
        q.var1[q.var2[28]] = "SHORT_FUSE";
        q.var1[q.var2[29]] = "SLASH";
        q.var1[q.var2[30]] = "SMASH";
        q.var1[q.var2[31]] = "SPELL";
        q.var1[q.var2[32]] = "SPELL_DEFENSIVE";
        q.var1[q.var2[33]] = "SPIKE";
        q.var1[q.var2[34]] = "STAB";
        q.var1[q.var2[35]] = "SWIPE";
    }

    public static q valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    public boolean bj() {
        o o2 = p.bq();
        if (q.var7(o2)) {
            return var2[0];
        }
        return Objects.equals((Object)o2.bl(), (Object)this);
    }

    public boolean bk() {
        boolean bl;
        q[] qArray = new q[var2[1]];
        qArray[q.var2[0]] = this;
        if (q.var3(p.a(qArray).isEmpty() ? 1 : 0)) {
            bl = var2[1];
            0;
            if (-1 >= 0) {
                return ((0x44 ^ 0x6A ^ (0xD1 ^ 0xB2)) & (52 + 212 - 44 + 4 ^ 56 + 120 - 16 + 13 ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    public String bC() {
        return this.action;
    }

    private static void var4() {
        var2 = new int[37];
        q.var2[0] = (0x57 ^ 0x47) & ~(0x82 ^ 0x92);
        q.var2[1] = 1;
        q.var2[2] = 2;
        q.var2[3] = 3;
        q.var2[4] = 0xFB ^ 0xA9 ^ (0x29 ^ 0x7F);
        q.var2[5] = 0x7C ^ 0x79;
        q.var2[6] = 0x57 ^ 0x51;
        q.var2[7] = 0x83 ^ 0x84;
        q.var2[8] = 0x60 ^ 0x68;
        q.var2[9] = 0x62 ^ 0x6B;
        q.var2[10] = 47 + 9 - -5 + 80 ^ 3 + 48 - -6 + 78;
        q.var2[11] = 134 + 58 - 88 + 57 ^ 34 + 3 - -48 + 85;
        q.var2[12] = 17 + 11 - -71 + 53 ^ 101 + 20 - 56 + 83;
        q.var2[13] = 0xD2 ^ 0xA8 ^ (0xC1 ^ 0xB6);
        q.var2[14] = 0x3B ^ 0x35;
        q.var2[15] = 0x18 ^ 0x54 ^ (0xEA ^ 0xA9);
        q.var2[16] = 0x4D ^ 0x5D;
        q.var2[17] = 0xA8 ^ 0xB9;
        q.var2[18] = 0x22 ^ 0x30;
        q.var2[19] = 80 + 86 - 110 + 74 ^ 47 + 47 - 24 + 75;
        q.var2[20] = 0xAB ^ 0xBF;
        q.var2[21] = 0xD1 ^ 0x87 ^ (0x23 ^ 0x60);
        q.var2[22] = 64 + 11 - -20 + 95 ^ 140 + 137 - 165 + 56;
        q.var2[23] = 0x39 ^ 0x2E;
        q.var2[24] = 0x76 ^ 0x6E;
        q.var2[25] = 0x1D ^ 0x77 ^ (0xDB ^ 0xA8);
        q.var2[26] = 0x1B ^ 0x51 ^ (0x93 ^ 0xC3);
        q.var2[27] = 0x2E ^ 8 ^ (0xC ^ 0x31);
        q.var2[28] = 118 + 103 - 122 + 45 ^ 125 + 134 - 207 + 88;
        q.var2[29] = 0x61 ^ 0x18 ^ (0xC9 ^ 0xAD);
        q.var2[30] = 71 + 68 - 95 + 91 ^ 121 + 89 - 119 + 62;
        q.var2[31] = 0x1E ^ 1;
        q.var2[32] = 3 ^ (0x80 ^ 0xA3);
        q.var2[33] = 0x24 ^ 0x5D ^ (0xDC ^ 0x84);
        q.var2[34] = 0xDC ^ 0xC5 ^ (0xD ^ 0x36);
        q.var2[35] = 0 ^ 0x23;
        q.var2[36] = 0x5D ^ 0x79;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = var2[0];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = var2[0];
        while (q.var6(var16, var15)) {
            char var17 = var14[var16];
            var11.append((char)(var17 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if ((0xB6 ^ 0x98 ^ (2 ^ 0x29)) != 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    private GameEnum4() {
        this(null);
    }

    private static boolean var7(Object object) {
        return object == null;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }
}

