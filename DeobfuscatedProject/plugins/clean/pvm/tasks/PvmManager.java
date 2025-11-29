/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.pvm.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class PvmManager
extends HashMap<String, Integer> {

    static {
        b.lIlIlllIIIllllI();
        b.lIlIlllIIIlllII();
    }

    private static boolean lIlIlllIIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    PvmManager() {
        this.put(lIIlIllllIlII[lIIlIllllllII[0]], lIIlIllllllII[1]);

        this.put(lIIlIllllIlII[lIIlIllllllII[2]], lIIlIllllllII[1]);

        this.put(lIIlIllllIlII[lIIlIllllllII[3]], lIIlIllllllII[1]);

        this.put(lIIlIllllIlII[lIIlIllllllII[4]], lIIlIllllllII[1]);

        this.put(lIIlIllllIlII[lIIlIllllllII[5]], lIIlIllllllII[6]);

        this.put(lIIlIllllIlII[lIIlIllllllII[7]], lIIlIllllllII[6]);

        this.put(lIIlIllllIlII[lIIlIllllllII[8]], lIIlIllllllII[6]);

        this.put(lIIlIllllIlII[lIIlIllllllII[9]], lIIlIllllllII[2]);

        this.put(lIIlIllllIlII[lIIlIllllllII[10]], lIIlIllllllII[11]);

        this.put(lIIlIllllIlII[lIIlIllllllII[12]], lIIlIllllllII[13]);

        this.put(lIIlIllllIlII[lIIlIllllllII[14]], lIIlIllllllII[15]);

        this.put(lIIlIllllIlII[lIIlIllllllII[16]], lIIlIllllllII[17]);

        this.put(lIIlIllllIlII[lIIlIllllllII[18]], lIIlIllllllII[19]);

        this.put(lIIlIllllIlII[lIIlIllllllII[20]], lIIlIllllllII[21]);

        this.put(lIIlIllllIlII[lIIlIllllllII[22]], lIIlIllllllII[23]);

        this.put(lIIlIllllIlII[lIIlIllllllII[24]], lIIlIllllllII[23]);

        this.put(lIIlIllllIlII[lIIlIllllllII[25]], lIIlIllllllII[23]);

        this.put(lIIlIllllIlII[lIIlIllllllII[26]], lIIlIllllllII[23]);

        this.put(lIIlIllllIlII[lIIlIllllllII[27]], lIIlIllllllII[23]);

        this.put(lIIlIllllIlII[lIIlIllllllII[28]], lIIlIllllllII[29]);

        this.put(lIIlIllllIlII[lIIlIllllllII[30]], lIIlIllllllII[31]);

        this.put(lIIlIllllIlII[lIIlIllllllII[32]], lIIlIllllllII[33]);

        this.put(lIIlIllllIlII[lIIlIllllllII[34]], lIIlIllllllII[35]);

        this.put(lIIlIllllIlII[lIIlIllllllII[36]], lIIlIllllllII[37]);

        this.put(lIIlIllllIlII[lIIlIllllllII[38]], lIIlIllllllII[37]);

        this.put(lIIlIllllIlII[lIIlIllllllII[39]], lIIlIllllllII[40]);

        this.put(lIIlIllllIlII[lIIlIllllllII[41]], lIIlIllllllII[42]);

        this.put(lIIlIllllIlII[lIIlIllllllII[43]], lIIlIllllllII[44]);

        this.put(lIIlIllllIlII[lIIlIllllllII[45]], lIIlIllllllII[46]);

    }

        return String.valueOf(var1);
    }

    private static void lIlIlllIIIlllII() {
        lIIlIllllIlII = new String[lIIlIllllllII[47]];
        b.lIIlIllllIlII[b.lIIlIllllllII[0]] = "Bandos chestplate";
        b.lIIlIllllIlII[b.lIIlIllllllII[2]] = "Bandos tassets";
        b.lIIlIllllIlII[b.lIIlIllllllII[3]] = "Bandos hilt";
        b.lIIlIllllIlII[b.lIIlIllllllII[4]] = "Bandos boots";
        b.lIIlIllllIlII[b.lIIlIllllllII[5]] = "Godsword shard 1";
        b.lIIlIllllIlII[b.lIIlIllllllII[7]] = "Godsword shard 2";
        b.lIIlIllllIlII[b.lIIlIllllllII[8]] = "Godsword shard 3";
        b.lIIlIllllIlII[b.lIIlIllllllII[9]] = "Coins";
        b.lIIlIllllIlII[b.lIIlIllllllII[10]] = "Snapdragon seed";
        b.lIIlIllllIlII[b.lIIlIllllllII[12]] = "Grimy snapdragon";
        b.lIIlIllllIlII[b.lIIlIllllllII[14]] = "Stamina potion(4)";
        b.lIIlIllllIlII[b.lIIlIllllllII[16]] = "Stamina potion(3)";
        b.lIIlIllllIlII[b.lIIlIllllllII[18]] = "Stamina potion(2)";
        b.lIIlIllllIlII[b.lIIlIllllllII[20]] = "Stamina potion(1)";
        b.lIIlIllllIlII[b.lIIlIllllllII[22]] = "Rune platebody";
        b.lIIlIllllIlII[b.lIIlIllllllII[24]] = "Rune 2h sword";
        b.lIIlIllllIlII[b.lIIlIllllllII[25]] = "Rune longsword";
        b.lIIlIllllIlII[b.lIIlIllllllII[26]] = "Rune pickaxe";
        b.lIIlIllllIlII[b.lIIlIllllllII[27]] = "Rune kiteshield";
        b.lIIlIllllIlII[b.lIIlIllllllII[28]] = "Shark";
        b.lIIlIllllIlII[b.lIIlIllllllII[30]] = "Chilli potato";
        b.lIIlIllllIlII[b.lIIlIllllllII[32]] = "Adamantite ore";
        b.lIIlIllllIlII[b.lIIlIllllllII[34]] = "Peach";
        b.lIIlIllllIlII[b.lIIlIllllllII[36]] = "Bones";
        b.lIIlIllllIlII[b.lIIlIllllllII[38]] = "Big bones";
        b.lIIlIllllIlII[b.lIIlIllllllII[39]] = "Nature rune";
        b.lIIlIllllIlII[b.lIIlIllllllII[41]] = "Cosmic rune";
        b.lIIlIllllIlII[b.lIIlIllllllII[43]] = "Coal";
        b.lIIlIllllIlII[b.lIIlIllllllII[45]] = "Limpwurt root";
    }
}

