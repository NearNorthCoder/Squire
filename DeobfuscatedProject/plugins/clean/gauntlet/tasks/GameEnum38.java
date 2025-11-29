/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.gauntlet.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum38
extends Enum<d> {
    public static final  /* enum */ d DONE_EXPLORING_EVERYTHING;
    public static final  /* enum */ d EXTRA_FOOD_EXPLORE;
    public static final  /* enum */ d OUTSIDE;
    public static final  /* enum */ d FIRST_ROTATION_EXPLORE;
    public static final  /* enum */ d GIVE_UP;
    
    public static final  /* enum */ d BOSS_FIGHT;
    public static final  /* enum */ d PREPARE_BOSS_FIGHT;
    public static final  /* enum */ d FIRST_ROTATION_CREATE;
    public static final  /* enum */ d DEMI_BOSS_EXPLORE;
    
    public static final  /* enum */ d AFK;
    public static final  /* enum */ d CREATING_T3_STAFF;
    public static final  /* enum */ d WEAPON_FRAME_EXPLORE;
    private static final  d[] $VALUES;

    public String toString() {
        String string = super.toString();
        return string.charAt(llIlIIIIIlll[0]) + string.substring(llIlIIIIIlll[1]).replaceAll(llIlIIIIIlIl[llIlIIIIIlll[0]], llIlIIIIIlIl[llIlIIIIIlll[1]]).trim().toLowerCase();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum38.class, string);
    }

    private static void lIIIIIIIlIlllll() {
        llIlIIIIIlIl = new String[llIlIIIIIlll[14]];
        d.llIlIIIIIlIl[d.llIlIIIIIlll[0]] = "_";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[1]] = " ";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[2]] = "OUTSIDE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[3]] = "GIVE_UP";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[4]] = "FIRST_ROTATION_EXPLORE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[5]] = "FIRST_ROTATION_CREATE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[6]] = "DEMI_BOSS_EXPLORE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[7]] = "WEAPON_FRAME_EXPLORE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[8]] = "PREPARE_BOSS_FIGHT";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[9]] = "EXTRA_FOOD_EXPLORE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[10]] = "BOSS_FIGHT";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[11]] = "AFK";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[12]] = "DONE_EXPLORING_EVERYTHING";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[13]] = "CREATING_T3_STAFF";
    }

    private static boolean lIIIIIIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.lIIIIIIIllIIlII();
        d.lIIIIIIIlIlllll();
        OUTSIDE = new GameEnum38();
        GIVE_UP = new GameEnum38();
        FIRST_ROTATION_EXPLORE = new GameEnum38();
        FIRST_ROTATION_CREATE = new GameEnum38();
        DEMI_BOSS_EXPLORE = new GameEnum38();
        WEAPON_FRAME_EXPLORE = new GameEnum38();
        PREPARE_BOSS_FIGHT = new GameEnum38();
        EXTRA_FOOD_EXPLORE = new GameEnum38();
        BOSS_FIGHT = new GameEnum38();
        AFK = new GameEnum38();
        DONE_EXPLORING_EVERYTHING = new GameEnum38();
        CREATING_T3_STAFF = new GameEnum38();
        d[] dArray = new d[llIlIIIIIlll[12]];
        dArray[d.llIlIIIIIlll[0]] = OUTSIDE;
        dArray[d.llIlIIIIIlll[1]] = GIVE_UP;
        dArray[d.llIlIIIIIlll[2]] = FIRST_ROTATION_EXPLORE;
        dArray[d.llIlIIIIIlll[3]] = FIRST_ROTATION_CREATE;
        dArray[d.llIlIIIIIlll[4]] = DEMI_BOSS_EXPLORE;
        dArray[d.llIlIIIIIlll[5]] = WEAPON_FRAME_EXPLORE;
        dArray[d.llIlIIIIIlll[6]] = PREPARE_BOSS_FIGHT;
        dArray[d.llIlIIIIIlll[7]] = EXTRA_FOOD_EXPLORE;
        dArray[d.llIlIIIIIlll[8]] = BOSS_FIGHT;
        dArray[d.llIlIIIIIlll[9]] = AFK;
        dArray[d.llIlIIIIIlll[10]] = DONE_EXPLORING_EVERYTHING;
        dArray[d.llIlIIIIIlll[11]] = CREATING_T3_STAFF;
        $VALUES = dArray;
    }

}

