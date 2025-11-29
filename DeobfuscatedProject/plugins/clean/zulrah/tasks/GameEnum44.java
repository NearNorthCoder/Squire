/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Predicates
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;

public final class GameEnum44
extends Enum<e> {
    public static final  /* enum */ e ARDY_CLOAK;
    public static final  /* enum */ e RUNE_POUCH;
    public static final  /* enum */ e QUEST_CAPE;
    private final  Predicate<Item> ids;
    private static final  e[] $VALUES;
    public static final  /* enum */ e CONS_CAPE;
    
    public static final  /* enum */ e GLORY_AMULET;
    
    public static final  /* enum */ e HOUSE_TAB;

        return String.valueOf(var1);
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum44.class, string);
    }

    private static boolean llIIlIIllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.llIIlIIllIlIlIl();
        e.llIIlIIllIIlllI();
        int[] nArray = new int[lIllIlllIlllI[1]];
        nArray[e.lIllIlllIlllI[0]] = lIllIlllIlllI[2];
        nArray[e.lIllIlllIlllI[3]] = lIllIlllIlllI[4];
        QUEST_CAPE = new GameEnum44(nArray);
        int[] nArray2 = new int[lIllIlllIlllI[3]];
        nArray2[e.lIllIlllIlllI[0]] = lIllIlllIlllI[5];
        HOUSE_TAB = new GameEnum44(nArray2);
        int[] nArray3 = new int[lIllIlllIlllI[1]];
        nArray3[e.lIllIlllIlllI[0]] = lIllIlllIlllI[6];
        nArray3[e.lIllIlllIlllI[3]] = lIllIlllIlllI[7];
        RUNE_POUCH = new GameEnum44(nArray3);
        int[] nArray4 = new int[lIllIlllIlllI[9]];
        nArray4[e.lIllIlllIlllI[0]] = lIllIlllIlllI[10];
        nArray4[e.lIllIlllIlllI[3]] = lIllIlllIlllI[11];
        nArray4[e.lIllIlllIlllI[1]] = lIllIlllIlllI[12];
        nArray4[e.lIllIlllIlllI[8]] = lIllIlllIlllI[13];
        ARDY_CLOAK = new GameEnum44(nArray4);
        int[] nArray5 = new int[lIllIlllIlllI[14]];
        nArray5[e.lIllIlllIlllI[0]] = lIllIlllIlllI[15];
        nArray5[e.lIllIlllIlllI[3]] = lIllIlllIlllI[16];
        nArray5[e.lIllIlllIlllI[1]] = lIllIlllIlllI[17];
        nArray5[e.lIllIlllIlllI[8]] = lIllIlllIlllI[18];
        nArray5[e.lIllIlllIlllI[9]] = lIllIlllIlllI[19];
        nArray5[e.lIllIlllIlllI[20]] = lIllIlllIlllI[21];
        GLORY_AMULET = new GameEnum44(nArray5);
        int[] nArray6 = new int[lIllIlllIlllI[1]];
        nArray6[e.lIllIlllIlllI[0]] = lIllIlllIlllI[22];
        nArray6[e.lIllIlllIlllI[3]] = lIllIlllIlllI[23];
        CONS_CAPE = new GameEnum44(nArray6);
        e[] eArray = new e[lIllIlllIlllI[14]];
        eArray[e.lIllIlllIlllI[0]] = QUEST_CAPE;
        eArray[e.lIllIlllIlllI[3]] = HOUSE_TAB;
        eArray[e.lIllIlllIlllI[1]] = RUNE_POUCH;
        eArray[e.lIllIlllIlllI[8]] = ARDY_CLOAK;
        eArray[e.lIllIlllIlllI[9]] = GLORY_AMULET;
        eArray[e.lIllIlllIlllI[20]] = CONS_CAPE;
        $VALUES = eArray;
    }

    private static void llIIlIIllIIlllI() {
        lIllIlllIlIIl = new String[lIllIlllIlllI[14]];
        e.lIllIlllIlIIl[e.lIllIlllIlllI[0]] = "QUEST_CAPE";
        e.lIllIlllIlIIl[e.lIllIlllIlllI[3]] = "HOUSE_TAB";
        e.lIllIlllIlIIl[e.lIllIlllIlllI[1]] = "RUNE_POUCH";
        e.lIllIlllIlIIl[e.lIllIlllIlllI[8]] = "ARDY_CLOAK";
        e.lIllIlllIlIIl[e.lIllIlllIlllI[9]] = "GLORY_AMULET";
        e.lIllIlllIlIIl[e.lIllIlllIlllI[20]] = "CONS_CAPE";
    }

    public Predicate<Item> p() {
        return this.ids;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private GameEnum44(int ... nArray) {
        this.ids = Predicates.ids((int[])nArray);
    }
}

