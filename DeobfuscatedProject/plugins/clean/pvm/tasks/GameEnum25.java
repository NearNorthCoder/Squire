/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.input.Keyboard
 */
package gg.squire.pvm.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.input.Keyboard;

public final class GameEnum25
extends Enum<h> {

    private final  Predicate<Item> test;
    private final  Consumer<Item> execution;
    public static final  /* enum */ h CONSTRUCTION_CAPE;
    public static final  /* enum */ h SKILLS_NECKLACE;
    private final  boolean stopping;
    public static final  /* enum */ h ECTOPHIAL;
    private final  boolean leaveRoom;
    public static final  /* enum */ h FARMING_CAPE;
    public static final  /* enum */ h ARDY_CLOAK;
    public static final  /* enum */ h HOUSE_TELEPORT;
    private static final  h[] $VALUES;
    private final  boolean fairy;

    private static boolean lIlIlllIIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIlllIIllIlll() {
        lIIllIIIIIIlI = new String[lIIllIIIIIIll[23]];
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[0]] = "Tele to POH";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[3]] = "Teleport";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[6]] = "Empty";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[8]] = "Break";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[10]] = "Rub";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[11]] = "6";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[12]] = "Skills necklace";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[14]] = "Monastery Teleport";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[17]] = "ARDY_CLOAK";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[18]] = "SKILLS_NECKLACE";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[19]] = "HOUSE_TELEPORT";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[20]] = "ECTOPHIAL";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[21]] = "FARMING_CAPE";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[22]] = "CONSTRUCTION_CAPE";
    }

    private static boolean lIlIlllIIlllIll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    public Consumer<Item> B() {
        return this.execution;
    }

    public Predicate<Item> u() {
        return this.test;
    }

    static {
        h.lIlIlllIIlllIII();
        h.lIlIlllIIllIlll();
        ARDY_CLOAK = new GameEnum25(item -> {
            int n2;
            if (h.lIlIlllIIllllII(item.getId(), lIIllIIIIIIll[15]) && h.lIlIlllIIllllIl(item.getId(), lIIllIIIIIIll[16])) {
                n2 = lIIllIIIIIIll[3];

                if ((0x7A ^ 0x7E) <= ((0x5E ^ 0x6B) & ~(0xE ^ 0x3B))) {
                    return false;
                }
            } else {
                n2 = lIIllIIIIIIll[0];
            }
            return n2 != 0;
        }, item -> item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[14]]), lIIllIIIIIIll[0], lIIllIIIIIIll[3], lIIllIIIIIIll[0]);
        SKILLS_NECKLACE = new GameEnum25(item -> {
            int n2;
            if (h.lIlIlllIIlllIll(item.getName().startsWith(lIIllIIIIIIlI[lIIllIIIIIIll[12]]) ? 1 : 0) && h.lIlIlllIIlllIIl(item.getId(), lIIllIIIIIIll[13])) {
                n2 = lIIllIIIIIIll[3];

                if (-1 == 1) {
                    return false;
                }
            } else {
                n2 = lIIllIIIIIIll[0];
            }
            return n2 != 0;
        }, item -> {
            item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[10]]);
            Keyboard.type((String)lIIllIIIIIIlI[lIIllIIIIIIll[11]]);
        }, lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[3]);
        HOUSE_TELEPORT = new GameEnum25(item -> {
            boolean bl;
            if (h.lIlIlllIIlllIlI(item.getId(), lIIllIIIIIIll[9])) {
                bl = lIIllIIIIIIll[3];

                if (((0xF7 ^ 0x94) & ~(0x1B ^ 0x78)) < 0) {
                    return false;
                }
            } else {
                bl = lIIllIIIIIIll[0];
            }
            return bl;
        }, item -> item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[8]]), lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[0]);
        ECTOPHIAL = new GameEnum25(item -> {
            boolean bl;
            if (h.lIlIlllIIlllIlI(item.getId(), lIIllIIIIIIll[7])) {
                bl = lIIllIIIIIIll[3];

                if (2 == 1) {
                    return false;
                }
            } else {
                bl = lIIllIIIIIIll[0];
            }
            return bl;
        }, item -> item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[6]]), lIIllIIIIIIll[3], lIIllIIIIIIll[3], lIIllIIIIIIll[0]);
        FARMING_CAPE = new GameEnum25(item -> {
            boolean bl;
            if (!h.lIlIlllIIlllIIl(item.getId(), lIIllIIIIIIll[4]) || h.lIlIlllIIlllIlI(item.getId(), lIIllIIIIIIll[5])) {
                bl = lIIllIIIIIIll[3];

                if ((78 + 128 - 103 + 43 ^ 70 + 124 - 57 + 13) <= ((0x3F ^ 0x25 ^ (0x1B ^ 0x61)) & (0xE6 ^ 0x96 ^ (0x1C ^ 0xC) ^ -1))) {
                    return false;
                }
            } else {
                bl = lIIllIIIIIIll[0];
            }
            return bl;
        }, item -> item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[3]]), lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[0]);
        CONSTRUCTION_CAPE = new GameEnum25(item -> {
            int n2;
            if (!h.lIlIlllIIlllIIl(item.getId(), lIIllIIIIIIll[1]) || h.lIlIlllIIlllIlI(item.getId(), lIIllIIIIIIll[2])) {
                n2 = lIIllIIIIIIll[3];

                }
            } else {
                n2 = lIIllIIIIIIll[0];
            }
            return n2 != 0;
        }, item -> item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[0]]), lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[0]);
        h[] hArray = new h[lIIllIIIIIIll[12]];
        hArray[h.lIIllIIIIIIll[0]] = ARDY_CLOAK;
        hArray[h.lIIllIIIIIIll[3]] = SKILLS_NECKLACE;
        hArray[h.lIIllIIIIIIll[6]] = HOUSE_TELEPORT;
        hArray[h.lIIllIIIIIIll[8]] = ECTOPHIAL;
        hArray[h.lIIllIIIIIIll[10]] = FARMING_CAPE;
        hArray[h.lIIllIIIIIIll[11]] = CONSTRUCTION_CAPE;
        $VALUES = hArray;
    }

    private static boolean lIlIlllIIlllIlI(int n2, int n3) {
        return n2 == n3;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum25.class, string);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIlIlllIIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private GameEnum25(Predicate<Item> predicate, Consumer<Item> consumer, boolean bl, boolean bl2, boolean bl3) {
        this.test = predicate;
        this.execution = consumer;
        this.stopping = bl;
        this.fairy = bl2;
        this.leaveRoom = bl3;
    }

    public boolean D() {
        return this.fairy;
    }

    private static boolean lIlIlllIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean E() {
        return this.leaveRoom;
    }

    private static boolean lIlIlllIIlllIIl(int n2, int n3) {
        return n2 != n3;
    }

    public boolean C() {
        return this.stopping;
    }
}

