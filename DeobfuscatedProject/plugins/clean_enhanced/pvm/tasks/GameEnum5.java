/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.input.Keyboard
 */
package gg.squire.pvm.tasks;

import java.util.function.Consumer;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.unethicalite.api.input.Keyboard;

public final class GameEnum5
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

    private static boolean var3(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void var10() {
        var2 = new String[var1[23]];
        h.var2[h.var1[0]] = "Tele to POH";
        h.var2[h.var1[3]] = "Teleport";
        h.var2[h.var1[6]] = "Empty";
        h.var2[h.var1[8]] = "Break";
        h.var2[h.var1[10]] = "Rub";
        h.var2[h.var1[11]] = "6";
        h.var2[h.var1[12]] = "Skills necklace";
        h.var2[h.var1[14]] = "Monastery Teleport";
        h.var2[h.var1[17]] = "ARDY_CLOAK";
        h.var2[h.var1[18]] = "SKILLS_NECKLACE";
        h.var2[h.var1[19]] = "HOUSE_TELEPORT";
        h.var2[h.var1[20]] = "ECTOPHIAL";
        h.var2[h.var1[21]] = "FARMING_CAPE";
        h.var2[h.var1[22]] = "CONSTRUCTION_CAPE";
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (h.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            
            return null;
        }
        return String.valueOf(var15);
    }

    public Consumer<Item> B() {
        return this.execution;
    }

    public Predicate<Item> u() {
        return this.test;
    }

    static {
        h.var23();
        h.var10();
        ARDY_CLOAK = new GameEnum5(item -> {
            int n2;
            if (h.var24(item.getId(), var1[15]) && h.var3(item.getId(), var1[16])) {
                n2 = var1[3];
                0;
                if ((0x7A ^ 0x7E) <= ((0x5E ^ 0x6B) & ~(0xE ^ 0x3B))) {
                    return ((0xEA ^ 0xB3) & ~(0x48 ^ 0x11)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        }, item -> item.interact(var2[var1[14]]), var1[0], var1[3], var1[0]);
        SKILLS_NECKLACE = new GameEnum5(item -> {
            int n2;
            if (h.var11(item.getName().startsWith(var2[var1[12]]) ? 1 : 0) && h.var25(item.getId(), var1[13])) {
                n2 = var1[3];
                0;
                if (-1 == 1) {
                    return ((0x40 ^ 0x79) & ~(0x74 ^ 0x4D)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        }, item -> {
            item.interact(var2[var1[10]]);
            Keyboard.type((String)var2[var1[11]]);
        }, var1[0], var1[0], var1[3]);
        HOUSE_TELEPORT = new GameEnum5(item -> {
            boolean bl;
            if (h.var26(item.getId(), var1[9])) {
                bl = var1[3];
                0;
                if (((0xF7 ^ 0x94) & ~(0x1B ^ 0x78)) < 0) {
                    return ((0x89 ^ 0xA2) & ~(0xA5 ^ 0x8E)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        }, item -> item.interact(var2[var1[8]]), var1[0], var1[0], var1[0]);
        ECTOPHIAL = new GameEnum5(item -> {
            boolean bl;
            if (h.var26(item.getId(), var1[7])) {
                bl = var1[3];
                0;
                if (2 == 1) {
                    return ((0x2B ^ 0x2F) & ~(0x2E ^ 0x2A)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        }, item -> item.interact(var2[var1[6]]), var1[3], var1[3], var1[0]);
        FARMING_CAPE = new GameEnum5(item -> {
            boolean bl;
            if (!h.var25(item.getId(), var1[4]) || h.var26(item.getId(), var1[5])) {
                bl = var1[3];
                0;
                if ((78 + 128 - 103 + 43 ^ 70 + 124 - 57 + 13) <= ((0x3F ^ 0x25 ^ (0x1B ^ 0x61)) & (0xE6 ^ 0x96 ^ (0x1C ^ 0xC) ^ -1))) {
                    return ((41 + 83 - 121 + 125 ^ 144 + 172 - 145 + 13) & (0x51 ^ 0x68 ^ 1 ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        }, item -> item.interact(var2[var1[3]]), var1[0], var1[0], var1[0]);
        CONSTRUCTION_CAPE = new GameEnum5(item -> {
            int n2;
            if (!h.var25(item.getId(), var1[1]) || h.var26(item.getId(), var1[2])) {
                n2 = var1[3];
                0;
                if null != null {
                    return ((0x68 ^ 0x3D) & ~(0x6F ^ 0x3A)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        }, item -> item.interact(var2[var1[0]]), var1[0], var1[0], var1[0]);
        h[] hArray = new h[var1[12]];
        hArray[h.var1[0]] = ARDY_CLOAK;
        hArray[h.var1[3]] = SKILLS_NECKLACE;
        hArray[h.var1[6]] = HOUSE_TELEPORT;
        hArray[h.var1[8]] = ECTOPHIAL;
        hArray[h.var1[10]] = FARMING_CAPE;
        hArray[h.var1[11]] = CONSTRUCTION_CAPE;
        $VALUES = hArray;
    }

    private static boolean var26(int n2, int n3) {
        return n2 == n3;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean var24(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private GameEnum5(Predicate<Item> predicate, Consumer<Item> consumer, boolean bl, boolean bl2, boolean bl3) {
        this.test = predicate;
        this.execution = consumer;
        this.stopping = bl;
        this.fairy = bl2;
        this.leaveRoom = bl3;
    }

    public boolean D() {
        return this.fairy;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    public boolean E() {
        return this.leaveRoom;
    }

    private static void var23() {
        var1 = new int[24];
        h.var1[0] = (1 ^ 0x61 ^ (0x11 ^ 0x7F)) & (0x14 ^ 0x2D ^ (0xB0 ^ 0x87) ^ -1);
        h.var1[1] = -(0xFFFFDF7F & 0x79C3) & (0xFFFFFFFF & 0x7F7F);
        h.var1[2] = 0xFFFFE67F & 0x3FBE;
        h.var1[3] = 1;
        h.var1[4] = 0xFFFFE756 & 0x3EFB;
        h.var1[5] = -(0xFFFFDFFF & 0x79AD) & (0xFFFFFFFF & Short.MAX_VALUE);
        h.var1[6] = 2;
        h.var1[7] = 0xFFFFD1BB & 0x3EDF;
        h.var1[8] = 3;
        h.var1[9] = -(0xFFFFE5FF & 0x3A33) & (0xFFFFFF7F & 0x3FFF);
        h.var1[10] = 0xAA ^ 0xAE;
        h.var1[11] = 0x6A ^ 0x60 ^ (0x34 ^ 0x3B);
        h.var1[12] = 0x33 ^ 0x15 ^ (4 ^ 0x24);
        h.var1[13] = -(0xA8 ^ 0xBB) & (0xFFFFFB7F & 0x2FFB);
        h.var1[14] = 0x72 ^ 0x59 ^ (0x44 ^ 0x68);
        h.var1[15] = -(0xFFFFC9E1 & 0x7E9F) & (0xFFFFFBC5 & 0x7FFB);
        h.var1[16] = 0xFFFFF375 & 0x3FCE;
        h.var1[17] = 0x65 ^ 0x6D;
        h.var1[18] = 3 ^ 0xA;
        h.var1[19] = 0x9B ^ 0x91;
        h.var1[20] = 0xB7 ^ 0xBC;
        h.var1[21] = 0x66 ^ 0x6A;
        h.var1[22] = 0xB2 ^ 0xBF;
        h.var1[23] = 0x3F ^ 0x31;
    }

    private static boolean var25(int n2, int n3) {
        return n2 != n3;
    }

    public boolean C() {
        return this.stopping;
    }
}

