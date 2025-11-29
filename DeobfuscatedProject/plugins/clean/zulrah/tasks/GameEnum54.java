/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum54
extends Enum<d> {
    public static final  /* enum */ d RING_OF_RECOIL;
    public static final  /* enum */ d CHAOS_RUNE;
    private  int amount;
    public static final  /* enum */ d ANTI_VENOM;
    public static final  /* enum */ d FIRE_RUNE;
    public static final  /* enum */ d DEATH_RUNE;
    public static final  /* enum */ d ZUL_ANDRA_TELEPORT;
    public static final  /* enum */ d RANGING_POTION;
    public static final  /* enum */ d RING_OF_WEALTH;
    
    private  int id;
    
    private  int price;
    public static final  /* enum */ d SHARK;
    private  String name;
    public static final  /* enum */ d PRAYER_POTION;
    public static final  /* enum */ d ADAMANT_DART;
    public static final  /* enum */ d COOKED_KARAMBWAN;
    public static final  /* enum */ d ZULRAH_SCALES;
    public static final  /* enum */ d LUMBRIDGE_TELEPORT;
    public static final  /* enum */ d RING_OF_DUELING;
    private static final  d[] $VALUES;
    public static final  /* enum */ d MAGIC_POTION;

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public int o() {
        return this.price;
    }

    public void a(String string) {
        this.name = string;
    }

    static {
        d.llIIlIIIlIIlIll();
        d.llIIlIIIlIIIllI();
        RING_OF_DUELING = new GameEnum54(lIllIllIIIIIl[1], lIllIllIIIIIl[2], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[3]]);
        RING_OF_RECOIL = new GameEnum54(lIllIllIIIIIl[5], lIllIllIIIIIl[6], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[7]]);
        RING_OF_WEALTH = new GameEnum54(lIllIllIIIIIl[9], lIllIllIIIIIl[10], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[10]]);
        LUMBRIDGE_TELEPORT = new GameEnum54(lIllIllIIIIIl[12], lIllIllIIIIIl[13], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[14]]);
        ZUL_ANDRA_TELEPORT = new GameEnum54(lIllIllIIIIIl[16], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[18]]);
        FIRE_RUNE = new GameEnum54(lIllIllIIIIIl[19], lIllIllIIIIIl[20], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[21]]);
        CHAOS_RUNE = new GameEnum54(lIllIllIIIIIl[23], lIllIllIIIIIl[24], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[25]]);
        DEATH_RUNE = new GameEnum54(lIllIllIIIIIl[27], lIllIllIIIIIl[24], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[2]]);
        SHARK = new GameEnum54(lIllIllIIIIIl[29], lIllIllIIIIIl[30], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[31]]);
        ANTI_VENOM = new GameEnum54(lIllIllIIIIIl[33], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[34]]);
        RANGING_POTION = new GameEnum54(lIllIllIIIIIl[36], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[37]]);
        MAGIC_POTION = new GameEnum54(lIllIllIIIIIl[39], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[40]]);
        PRAYER_POTION = new GameEnum54(lIllIllIIIIIl[42], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[43]]);
        ADAMANT_DART = new GameEnum54(lIllIllIIIIIl[45], lIllIllIIIIIl[46], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[47]]);
        COOKED_KARAMBWAN = new GameEnum54(lIllIllIIIIIl[49], lIllIllIIIIIl[50], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[51]]);
        ZULRAH_SCALES = new GameEnum54(lIllIllIIIIIl[52], lIllIllIIIIIl[46], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[53]]);
        d[] dArray = new d[lIllIllIIIIIl[28]];
        dArray[d.lIllIllIIIIIl[0]] = RING_OF_DUELING;
        dArray[d.lIllIllIIIIIl[3]] = RING_OF_RECOIL;
        dArray[d.lIllIllIIIIIl[4]] = RING_OF_WEALTH;
        dArray[d.lIllIllIIIIIl[7]] = LUMBRIDGE_TELEPORT;
        dArray[d.lIllIllIIIIIl[8]] = ZUL_ANDRA_TELEPORT;
        dArray[d.lIllIllIIIIIl[10]] = FIRE_RUNE;
        dArray[d.lIllIllIIIIIl[11]] = CHAOS_RUNE;
        dArray[d.lIllIllIIIIIl[14]] = DEATH_RUNE;
        dArray[d.lIllIllIIIIIl[15]] = SHARK;
        dArray[d.lIllIllIIIIIl[18]] = ANTI_VENOM;
        dArray[d.lIllIllIIIIIl[13]] = RANGING_POTION;
        dArray[d.lIllIllIIIIIl[21]] = MAGIC_POTION;
        dArray[d.lIllIllIIIIIl[22]] = PRAYER_POTION;
        dArray[d.lIllIllIIIIIl[25]] = ADAMANT_DART;
        dArray[d.lIllIllIIIIIl[26]] = COOKED_KARAMBWAN;
        dArray[d.lIllIllIIIIIl[2]] = ZULRAH_SCALES;
        $VALUES = dArray;
    }

    private static void llIIlIIIlIIIllI() {
        lIllIlIlllIIl = new String[lIllIllIIIIIl[54]];
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[0]] = "RING_OF_DUELING";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[3]] = "Ring of dueling(8)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[4]] = "RING_OF_RECOIL";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[7]] = "Ring of recoil";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[8]] = "RING_OF_WEALTH";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[10]] = "Ring of wealth (5)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[11]] = "LUMBRIDGE_TELEPORT";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[14]] = "Lumbridge teleport";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[15]] = "ZUL_ANDRA_TELEPORT";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[18]] = "Zul-andra teleport";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[13]] = "FIRE_RUNE";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[21]] = "Fire rune";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[22]] = "CHAOS_RUNE";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[25]] = "Chaos rune";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[26]] = "DEATH_RUNE";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[2]] = "Death rune";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[28]] = "SHARK";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[31]] = "Shark";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[32]] = "ANTI_VENOM";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[34]] = "Anti-venom+(4)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[35]] = "RANGING_POTION";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[37]] = "Ranging potion(4)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[38]] = "MAGIC_POTION";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[40]] = "Magic potion(4)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[41]] = "PRAYER_POTION";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[43]] = "Prayer potion(4)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[44]] = "ADAMANT_DART";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[47]] = "Adamant dart";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[48]] = "COOKED_KARAMBWAN";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[51]] = "Cooked karambwan";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[17]] = "ZULRAH_SCALES";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[53]] = "Zulrah's scales";
    }

    public int n() {
        return this.amount;
    }

    private static boolean llIIlIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIIlIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public static d b(int n2) {
        void var1;
        d[] dArray = d.values();
        int n3 = dArray.length;
        int var2 = lIllIllIIIIIl[0];
        while (d.llIIlIIIlIIllII(var2, (int)var1)) {
            int var3;
            void var4;
            void var5 = var4[var2];
            if (d.llIIlIIIlIIllIl(var5.m(), var3)) {
                return var5;
            }
            ++var2;

            if ((0x64 ^ 0x7D ^ (0xDE ^ 0xC3)) >= 2) continue;
            return null;
        }
        return null;
    }

    public void c(int n2) {
        this.id = n2;
    }

        return String.valueOf(var6);
    }

    public String k() {
        return this.name;
    }

    public void GameEnum54(int n2) {
        this.amount = n2;
    }

    public int m() {
        return this.id;
    }

    public void e(int n2) {
        this.price = n2;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum54.class, string);
    }

    private GameEnum54(int n3, int n4, int n5, String string2) {
        this.id = n3;
        this.amount = n4;
        this.price = n5;
        this.name = string2;
    }
}

