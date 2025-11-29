/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.herblore.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.herblore.tasks.GameEnum;

public final class GameEnum5
extends Enum<e> {
    public static final  /* enum */ e SUPER_ENERGY;
    public static final  /* enum */ e DIVINE_MAGIC_POTION;
    public static final  /* enum */ e ENERGY_POTION;
    public static final  /* enum */ e DIVINE_RANGE_POTION;
    private final  Map<Integer, Integer> components;
    public static final  /* enum */ e DIVINE_SUPER_ATTACK;
    private final  boolean tickable;
    public static final  /* enum */ e DIVINE_SUPER_COMBAT;
    public static final  /* enum */ e PRAYER_POTION;
    public static final  /* enum */ e SUPER_ATTACK;
    public static final  /* enum */ e ATTACK_POTION;
    
    private final  int level;
    public static final  /* enum */ e AGILITY_POTION;
    private static final  e[] $VALUES;
    public static final  /* enum */ e SARADOMIN_BREW;
    public static final  /* enum */ e DIVINE_SUPER_DEFENCE;
    public static final  /* enum */ e STAMINA;
    public static final  /* enum */ e SUPER_ANTI_POISON;
    public static final  /* enum */ e SERUM_207;
    public static final  /* enum */ e SUPER_DEFENCE;
    public static final  /* enum */ e DIVINE_SUPER_STRENGTH;
    public static final  /* enum */ e MAGIC_POTION;
    public static final  /* enum */ e RANGING_POTION;
    public static final  /* enum */ e ANCIENT_BREW;
    public static final  /* enum */ e SUPER_RESTORE;
    public static final  /* enum */ e SUPER_STRENGTH;
    public static final  /* enum */ e STRENGTH_POTION;
    
    public static final  /* enum */ e COMPOST_POTION;
    public static final  /* enum */ e ANTIFIRE_POTION;
    public static final  /* enum */ e SUPER_COMBAT_POTION;
    public static final  /* enum */ e ANTIPOISON;
    public static final  /* enum */ e MENAPHITE_REMEDY;

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public Map<Integer, Integer> n() {
        return this.components;
    }

    private GameEnum5(Map<Integer, Integer> map, int n2) {
        this.components = map;
        this.level = n2;
        this.tickable = lllIlIIlIlII[1];
    }

    /*
     * WARNING - void declaration
     */
    public static e a(b b2) {
        void var1;
        e[] eArray = e.values();
        int n = eArray.length;
        int var2 = lllIlIIlIlII[1];
        while (e.lIIIlIllllIIlll(var2, (int)var1)) {
            b var3;
            void var4;
            void var5 = var4[var2];
            if (e.lIIIlIllllIlIII(var5.n().containsKey(var3.g()) ? 1 : 0)) {
                return var5;
            }
            ++var2;

            if (-3 <= 0) continue;
            return null;
        }
        return null;
    }

    static {
        e.lIIIlIllllIIllI();
        e.lIIIlIllllIIlIl();
        ATTACK_POTION = new GameEnum5(b.GUAM_LEAF, lllIlIIlIlII[2], lllIlIIlIlII[3]);
        ANTIPOISON = new GameEnum5(b.MARRENTILL, lllIlIIlIlII[5], lllIlIIlIlII[6]);
        STRENGTH_POTION = new GameEnum5(b.TARROMIN, lllIlIIlIlII[8], lllIlIIlIlII[9]);
        SERUM_207 = new GameEnum5(b.TARROMIN, lllIlIIlIlII[10], lllIlIIlIlII[11]);
        COMPOST_POTION = new GameEnum5(Map.of(b.HARRALANDER.g(), lllIlIIlIlII[13], lllIlIIlIlII[14], lllIlIIlIlII[15]), lllIlIIlIlII[16]);
        ENERGY_POTION = new GameEnum5(b.HARRALANDER, lllIlIIlIlII[17], lllIlIIlIlII[18]);
        AGILITY_POTION = new GameEnum5(b.TOADFLAX, lllIlIIlIlII[20], lllIlIIlIlII[21]);
        PRAYER_POTION = new GameEnum5(b.RANARR_WEED, lllIlIIlIlII[23], lllIlIIlIlII[24]);
        SUPER_ATTACK = new GameEnum5(b.IRIT_LEAF, lllIlIIlIlII[2], lllIlIIlIlII[26]);
        SUPER_ANTI_POISON = new GameEnum5(b.IRIT_LEAF, lllIlIIlIlII[5], lllIlIIlIlII[28]);
        SUPER_ENERGY = new GameEnum5(b.AVANTOE, lllIlIIlIlII[30], lllIlIIlIlII[31]);
        SUPER_STRENGTH = new GameEnum5(b.KWUARM, lllIlIIlIlII[8], lllIlIIlIlII[33]);
        SUPER_RESTORE = new GameEnum5(b.SNAPDRAGON, lllIlIIlIlII[34], lllIlIIlIlII[35]);
        SUPER_DEFENCE = new GameEnum5(b.CADANTINE, lllIlIIlIlII[37], lllIlIIlIlII[38]);
        DIVINE_SUPER_ATTACK = new GameEnum5(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[40], lllIlIIlIlII[13]), lllIlIIlIlII[41], lllIlIIlIlII[4]);
        DIVINE_SUPER_STRENGTH = new GameEnum5(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[42], lllIlIIlIlII[13]), lllIlIIlIlII[41], lllIlIIlIlII[4]);
        DIVINE_SUPER_DEFENCE = new GameEnum5(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[44], lllIlIIlIlII[13]), lllIlIIlIlII[41], lllIlIIlIlII[4]);
        ANTIFIRE_POTION = new GameEnum5(b.LANTADYME, lllIlIIlIlII[46], lllIlIIlIlII[47]);
        RANGING_POTION = new GameEnum5(b.DWARF_WEED, lllIlIIlIlII[49], lllIlIIlIlII[50]);
        DIVINE_RANGE_POTION = new GameEnum5(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[52], lllIlIIlIlII[13]), lllIlIIlIlII[53], lllIlIIlIlII[4]);
        MAGIC_POTION = new GameEnum5(b.LANTADYME, lllIlIIlIlII[55], lllIlIIlIlII[56]);
        DIVINE_MAGIC_POTION = new GameEnum5(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[58], lllIlIIlIlII[13]), lllIlIIlIlII[59], lllIlIIlIlII[4]);
        STAMINA = new GameEnum5(Map.of(lllIlIIlIlII[60], lllIlIIlIlII[15], lllIlIIlIlII[61], lllIlIIlIlII[13]), lllIlIIlIlII[62]);
        SARADOMIN_BREW = new GameEnum5(b.TOADFLAX, lllIlIIlIlII[64], lllIlIIlIlII[65]);
        ANCIENT_BREW = new GameEnum5(Map.of(lllIlIIlIlII[67], lllIlIIlIlII[15], lllIlIIlIlII[68], lllIlIIlIlII[13]), lllIlIIlIlII[69], lllIlIIlIlII[4]);
        MENAPHITE_REMEDY = new GameEnum5(b.DWARF_WEED, lllIlIIlIlII[71], lllIlIIlIlII[72]);
        SUPER_COMBAT_POTION = new GameEnum5(Map.of(lllIlIIlIlII[73], lllIlIIlIlII[22], lllIlIIlIlII[40], lllIlIIlIlII[22], lllIlIIlIlII[42], lllIlIIlIlII[22], lllIlIIlIlII[44], lllIlIIlIlII[22]), lllIlIIlIlII[74]);
        DIVINE_SUPER_COMBAT = new GameEnum5(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[75], lllIlIIlIlII[13]), lllIlIIlIlII[76], lllIlIIlIlII[4]);
        e[] eArray = new e[lllIlIIlIlII[77]];
        eArray[e.lllIlIIlIlII[1]] = ATTACK_POTION;
        eArray[e.lllIlIIlIlII[4]] = ANTIPOISON;
        eArray[e.lllIlIIlIlII[7]] = STRENGTH_POTION;
        eArray[e.lllIlIIlIlII[3]] = SERUM_207;
        eArray[e.lllIlIIlIlII[12]] = COMPOST_POTION;
        eArray[e.lllIlIIlIlII[6]] = ENERGY_POTION;
        eArray[e.lllIlIIlIlII[19]] = AGILITY_POTION;
        eArray[e.lllIlIIlIlII[22]] = PRAYER_POTION;
        eArray[e.lllIlIIlIlII[25]] = SUPER_ATTACK;
        eArray[e.lllIlIIlIlII[27]] = SUPER_ANTI_POISON;
        eArray[e.lllIlIIlIlII[29]] = SUPER_ENERGY;
        eArray[e.lllIlIIlIlII[32]] = SUPER_STRENGTH;
        eArray[e.lllIlIIlIlII[9]] = SUPER_RESTORE;
        eArray[e.lllIlIIlIlII[36]] = SUPER_DEFENCE;
        eArray[e.lllIlIIlIlII[0]] = DIVINE_SUPER_ATTACK;
        eArray[e.lllIlIIlIlII[11]] = DIVINE_SUPER_STRENGTH;
        eArray[e.lllIlIIlIlII[43]] = DIVINE_SUPER_DEFENCE;
        eArray[e.lllIlIIlIlII[45]] = ANTIFIRE_POTION;
        eArray[e.lllIlIIlIlII[48]] = RANGING_POTION;
        eArray[e.lllIlIIlIlII[51]] = DIVINE_RANGE_POTION;
        eArray[e.lllIlIIlIlII[54]] = MAGIC_POTION;
        eArray[e.lllIlIIlIlII[57]] = DIVINE_MAGIC_POTION;
        eArray[e.lllIlIIlIlII[16]] = STAMINA;
        eArray[e.lllIlIIlIlII[63]] = SARADOMIN_BREW;
        eArray[e.lllIlIIlIlII[66]] = ANCIENT_BREW;
        eArray[e.lllIlIIlIlII[70]] = MENAPHITE_REMEDY;
        eArray[e.lllIlIIlIlII[18]] = SUPER_COMBAT_POTION;
        eArray[e.lllIlIIlIlII[13]] = DIVINE_SUPER_COMBAT;
        $VALUES = eArray;
    }

    public boolean m() {
        return this.tickable;
    }

    private static boolean lIIIlIllllIIlll(int n, int n2) {
        return n < n2;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    private static boolean lIIIlIllllIlIII(int n) {
        return n != 0;
    }

    public int l() {
        return this.level;
    }

    private GameEnum5(Map<Integer, Integer> map, int n2, boolean bl) {
        this.components = map;
        this.level = n2;
        this.tickable = bl;
    }

        return String.valueOf(var6);
    }

    private static void lIIIlIllllIIlIl() {
        lllIlIIlIIlI = new String[lllIlIIlIlII[77]];
        e.lllIlIIlIIlI[e.lllIlIIlIlII[1]] = "ATTACK_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[4]] = "ANTIPOISON";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[7]] = "STRENGTH_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[3]] = "SERUM_207";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[12]] = "COMPOST_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[6]] = "ENERGY_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[19]] = "AGILITY_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[22]] = "PRAYER_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[25]] = "SUPER_ATTACK";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[27]] = "SUPER_ANTI_POISON";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[29]] = "SUPER_ENERGY";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[32]] = "SUPER_STRENGTH";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[9]] = "SUPER_RESTORE";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[36]] = "SUPER_DEFENCE";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[0]] = "DIVINE_SUPER_ATTACK";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[11]] = "DIVINE_SUPER_STRENGTH";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[43]] = "DIVINE_SUPER_DEFENCE";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[45]] = "ANTIFIRE_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[48]] = "RANGING_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[51]] = "DIVINE_RANGE_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[54]] = "MAGIC_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[57]] = "DIVINE_MAGIC_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[16]] = "STAMINA";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[63]] = "SARADOMIN_BREW";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[66]] = "ANCIENT_BREW";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[70]] = "MENAPHITE_REMEDY";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[18]] = "SUPER_COMBAT_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[13]] = "DIVINE_SUPER_COMBAT";
    }

    private GameEnum5(b b2, int n2, int n3) {
        this.level = n3;
        this.components = new HashMap<Integer, Integer>();
        this.components.put(b2.g(), lllIlIIlIlII[0]);

        this.components.put(n2, lllIlIIlIlII[0]);

        this.tickable = lllIlIIlIlII[1];
    }
}

