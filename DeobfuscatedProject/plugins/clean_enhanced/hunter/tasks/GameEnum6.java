/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.hunter.tasks;

import java.util.ArrayList;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;

public final class GameEnum6
extends Enum<h> {
    private final  int levelRequired;
    
    private static final  h[] $VALUES;
    
    public static final  /* enum */ h DASHING_KEBBIT;
    public static final  /* enum */ h DARK_KEBBIT;
    public static final  /* enum */ h SPOTTED_KEBBIT;
    private final  int kebbitId;

    /*
     * WARNING - void declaration
     */
    public static NPC s() {
        void var3;
        int n2 = Skills.getLevel((SkiSkill.HUNTER);
        ArrayList arrayList = new ArrayList();
        h[] hArray = h.values();
        int n3 = hArray.length;
        int var4 = var1[0];
        while (h.var5(var4, (int)var3)) {
            void var6;
            void var7;
            void var8 = var7[var4];
            if (h.var9(var8.t(), (int)var6)) {
                0;
                if (1 <= 0) {
                    return null;
                }
            } else {
                void var10;
                var10.add(var8);
                0;
            }
            ++var4;
            0;
            if ((0x86 ^ 0x82) >= 0) continue;
            return null;
        }
        return NPCs.getNearest((int[])arrayList.stream().mapToInt(h::u).toArray());
    }

    public int u() {
        return this.kebbitId;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (h.var5(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    private GameEnum6(int n3, int n4) {
        this.levelRequired = n3;
        this.kebbitId = n4;
    }

    static {
        h.var27();
        h.var28();
        DASHING_KEBBIT = new GameEnum6(var1[1], var1[2]);
        DARK_KEBBIT = new GameEnum6(var1[4], var1[5]);
        SPOTTED_KEBBIT = new GameEnum6(var1[7], var1[8]);
        h[] hArray = new h[var1[9]];
        hArray[h.var1[0]] = DASHING_KEBBIT;
        hArray[h.var1[3]] = DARK_KEBBIT;
        hArray[h.var1[6]] = SPOTTED_KEBBIT;
        $VALUES = hArray;
    }

    public int t() {
        return this.levelRequired;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static void var28() {
        var2 = new String[var1[9]];
        h.var2[h.var1[0]] = "DASHING_KEBBIT";
        h.var2[h.var1[3]] = "DARK_KEBBIT";
        h.var2[h.var1[6]] = "SPOTTED_KEBBIT";
    }

    private static void var27() {
        var1 = new int[11];
        h.var1[0] = (0x23 ^ 0x4C ^ (0x31 ^ 0xA)) & (0xD0 ^ 0x95 ^ (0x94 ^ 0x85) ^ -1);
        h.var1[1] = 0x71 ^ 0x2A ^ (0xAF ^ 0xB1);
        h.var1[2] = 0xFFFFDDDF & 0x37BD;
        h.var1[3] = 1;
        h.var1[4] = 0xBD ^ 0xC6 ^ (0x6F ^ 0x2D);
        h.var1[5] = -(0xFFFFFB97 & 0x4E6B) & (0xFFFFFFDF & 0x5FBE);
        h.var1[6] = 2;
        h.var1[7] = 34 + 39 - 6 + 89 ^ 162 + 139 - 141 + 23;
        h.var1[8] = 0xFFFFDDDB & 0x37BF;
        h.var1[9] = 3;
        h.var1[10] = 4 ^ 0xC;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }
}

