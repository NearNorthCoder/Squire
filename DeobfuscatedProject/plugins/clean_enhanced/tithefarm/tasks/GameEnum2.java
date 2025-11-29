/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.tithefarm.tasks;

import gg.squire.client.util.Log;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import gg.squire.tithefarm.tasks.DHelper;
import gg.squire.tithefarm.tasks.GameEnum5;

public final class GameEnum2
extends Enum<c> {
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c BOLOGANO;
    public static final  /* enum */ c GOLOVANOVA;
    public static final  /* enum */ c BEST_OPTION;
    
    public static final  /* enum */ c LOGAVANO;

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void var3() {
        var2 = new int[9];
        c.var2[0] = 0x52 ^ 0x18;
        c.var2[1] = 124 + 111 - 141 + 38 ^ 59 + 131 - 123 + 111;
        c.var2[2] = (0x30 ^ 0x1C ^ (0x7B ^ 0x13)) & (0x3D ^ 0x31 ^ (0xC1 ^ 0x89) ^ -1);
        c.var2[3] = 1;
        c.var2[4] = 2;
        c.var2[5] = 3;
        c.var2[6] = 0x9B ^ 0x9F;
        c.var2[7] = 0x1F ^ 0x1A;
        c.var2[8] = 0x5F ^ 0x5A ^ (0x79 ^ 0x74);
    }

    private static void var4() {
        var1 = new String[var2[7]];
        c.var1[c.var2[2]] = "No matching type found for {}";
        c.var1[c.var2[3]] = "GOLOVANOVA";
        c.var1[c.var2[4]] = "BOLOGANO";
        c.var1[c.var2[5]] = "LOGAVANO";
        c.var1[c.var2[6]] = "BEST_OPTION";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    private static boolean var13(int n2, int n3) {
        return n2 >= n3;
    }

    public f i() {
        switch (d.n[this.ordinal()]) {
            case 1: {
                return f.GOLOVANOVA;
            }
            case 2: {
                return f.BOLOGANO;
            }
            case 3: {
                return f.LOGAVANO;
            }
            case 4: {
                int var14 = Skills.getLevel((SkiSkill.FARMING);
                if (c.var13(var14, var2[0])) {
                    return f.LOGAVANO;
                }
                if (c.var13(var14, var2[1])) {
                    return f.BOLOGANO;
                }
                return f.GOLOVANOVA;
            }
        }
        return null;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var2[2];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var2[2];
        while (c.var24(var23, var22)) {
            char var25 = var21[var23];
            var18.append((char)(var25 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var18);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    static {
        c.var3();
        c.var4();
        GOLOVANOVA = new GameEnum2();
        BOLOGANO = new GameEnum2();
        LOGAVANO = new GameEnum2();
        BEST_OPTION = new GameEnum2();
        c[] cArray = new c[var2[6]];
        cArray[c.var2[2]] = GOLOVANOVA;
        cArray[c.var2[3]] = BOLOGANO;
        cArray[c.var2[4]] = LOGAVANO;
        cArray[c.var2[5]] = BEST_OPTION;
        $VALUES = cArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Item item) {
        boolean bl;
        void var32;
        void var33;
        f f2 = this.i();
        if (c.var12((Object)f2)) {
            Object[] objectArray = new Object[var2[3]];
            objectArray[c.var2[2]] = this;
            Log.info((String)var1[var2[2]], (Object[])objectArray);
            return var2[2];
        }
        String var34 = var33.j();
        if (c.var11(var32.getName().contains(var34) ? 1 : 0)) {
            bl = var2[3];
            0;
            if (-1 != -1) {
                return ((0xAB ^ 0xC5 ^ (0x7E ^ 0x3E)) & (88 + 8 - 55 + 124 ^ 108 + 39 - 53 + 45 ^ -1)) != 0;
            }
        } else {
            bl = var2[2];
        }
        return bl;
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }
}

