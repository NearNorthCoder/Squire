/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.pvm.tasks;

import java.util.function.Predicate;
import net.runelite.api.Item;

public final class GameEnum3
extends Enum<d> {
    private final  int itemID;
    private final  Predicate<Item> test;
    public static final  /* enum */ d ANTIPOISON;
    public static final  /* enum */ d SUPERANTIPOISON;
    public static final  /* enum */ d ANTIDOTE;

    private static final  d[] $VALUES;

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new String[var2[9]];
        d.var1[d.var2[0]] = "Antidote+";
        d.var1[d.var2[1]] = "Superantipoison";
        d.var1[d.var2[2]] = "Antipoison";
        d.var1[d.var2[3]] = "ANTIPOISON";
        d.var1[d.var2[5]] = "SUPERANTIPOISON";
        d.var1[d.var2[7]] = "ANTIDOTE";
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var2[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var2[0];
        while (d.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    static {
        d.var21();
        d.var9();
        ANTIPOISON = new GameEnum3(item -> item.getName().startsWith(var1[var2[2]]), var2[4]);
        SUPERANTIPOISON = new GameEnum3(item -> item.getName().startsWith(var1[var2[1]]), var2[6]);
        ANTIDOTE = new GameEnum3(item -> item.getName().startsWith(var1[var2[0]]), var2[8]);
        d[] dArray = new d[var2[3]];
        dArray[d.var2[0]] = ANTIPOISON;
        dArray[d.var2[1]] = SUPERANTIPOISON;
        dArray[d.var2[2]] = ANTIDOTE;
        $VALUES = dArray;
    }

    private GameEnum3(Predicate<Item> predicate, int n3) {
        this.test = predicate;
        this.itemID = n3;
    }

    private static void var21() {
        var2 = new int[11];
        d.var2[0] = (0xCF ^ 0x83 ^ (0x20 ^ 0x64)) & (125 + 57 - 119 + 79 ^ 37 + 50 - -22 + 25 ^ -1);
        d.var2[1] = 1;
        d.var2[2] = 2;
        d.var2[3] = 3;
        d.var2[4] = -(0xFFFF950A & 0x7EF7) & (0xFFFFBFAF & 0x5DDF);
        d.var2[5] = 0x53 ^ 0x54 ^ 3;
        d.var2[6] = -(0xFFFFDD07 & 0x76FD) & (0xFFFFDFBE & 0x7DD5);
        d.var2[7] = 0xAD ^ 0xA8;
        d.var2[8] = 0xFFFFDF77 & 0x37BF;
        d.var2[9] = 0x57 ^ 0x21 ^ (0x46 ^ 0x36);
        d.var2[10] = 8 ^ 0;
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public Predicate<Item> u() {
        return this.test;
    }

    public int v() {
        return this.itemID;
    }
}

