/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.barrows.tasks;

import net.runelite.api.Actor;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public final class GameEnum2
extends Enum<d> {
    
    public static final  /* enum */ d TORAG;
    private final  int combatLevel;
    private static final  d[] $VALUES;
    private final  WorldPoint location;
    public static final  /* enum */ d VERAC;
    public static final  /* enum */ d DHAROK;
    private final  String name;
    public static final  /* enum */ d KARIL;
    public static final  /* enum */ d GUTHAN;
    public static final  /* enum */ d AHRIM;
    
    private final  int killedVarbit;

    private static void var3() {
        var1 = new String[var2[29]];
        d.var1[d.var2[0]] = "DHAROK";
        d.var1[d.var2[1]] = "Dharok";
        d.var1[d.var2[6]] = "GUTHAN";
        d.var1[d.var2[7]] = "Guthan";
        d.var1[d.var2[11]] = "KARIL";
        d.var1[d.var2[12]] = "Karil";
        d.var1[d.var2[17]] = "AHRIM";
        d.var1[d.var2[18]] = "Ahrim";
        d.var1[d.var2[21]] = "TORAG";
        d.var1[d.var2[22]] = "Torag";
        d.var1[d.var2[25]] = "VERAC";
        d.var1[d.var2[26]] = "Verac";
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.combatLevel;
    }

    private static boolean var16(Object object, Object object2) {
        return object != object2;
    }

    private GameEnum2(String string2, int n3, WorldPoint worldPoint, int n4) {
        this.name = string2;
        this.combatLevel = n3;
        this.location = worldPoint;
        this.killedVarbit = n4;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    public int F() {
        return this.killedVarbit;
    }

    public static boolean a(Actor actor) {
        if (d.var16(actor.getInteracting(), Players.getLocal())) {
            return var2[0];
        }
        d[] var18 = d.values();
        int var19 = var18.length;
        int var20 = var2[0];
        while (d.var21(var20, var19)) {
            Actor var22;
            d var23 = var18[var20];
            if (d.var17(var22.getName().toLowerCase().contains(var23.C().toLowerCase()) ? 1 : 0)) {
                return var2[1];
            }
            ++var20;
            0;
            if null == null continue;
            return ((221 + 185 - 348 + 192 ^ 65 + 126 - 108 + 86) & (0xE9 ^ 0x83 ^ (0x51 ^ 0x68) ^ -1)) != 0;
        }
        return var2[0];
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var2[0];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var2[0];
        while (d.var21(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var27);
    }

    public String C() {
        return this.name;
    }

    private static void var34() {
        var2 = new int[30];
        d.var2[0] = (0xED ^ 0xC0) & ~(0x4B ^ 0x66);
        d.var2[1] = 1;
        d.var2[2] = 0xC4 ^ 0xB7;
        d.var2[3] = -(0xFFFFFE1B & 0x13ED) & (0xFFFF9FFF & Short.MAX_VALUE);
        d.var2[4] = -(0xFFFFE34E & 0x3DBF) & (0xFFFFEDFF & 0x3FEF);
        d.var2[5] = 0xFFFFFFFB & 0x1CE;
        d.var2[6] = 2;
        d.var2[7] = 3;
        d.var2[8] = 0xFFFFBFF9 & 0x4DFF;
        d.var2[9] = 0xFFFF9DF7 & 0x6EDB;
        d.var2[10] = 0xFFFF83FB & 0x7DCF;
        d.var2[11] = 0x3A ^ 0x3E;
        d.var2[12] = 0x7A ^ 0x7F;
        d.var2[13] = 0x2F ^ 0x4D;
        d.var2[14] = 0xFFFFFDFE & 0xFEF;
        d.var2[15] = 0xFFFFECFB & 0x1FCF;
        d.var2[16] = -(0xFFFFFE25 & 0x1FFB) & (0xFFFFDFFC & 0x3FEF);
        d.var2[17] = 0x8C ^ 0x9C ^ (0xB1 ^ 0xA7);
        d.var2[18] = 0xB6 ^ 0xB1;
        d.var2[19] = 0xFFFF8CD9 & Short.MAX_VALUE;
        d.var2[20] = -(0xFFFFF61B & 0x7FE5) & (0xFFFFFFCD & 0x77FB);
        d.var2[21] = 6 ^ 0xE;
        d.var2[22] = 46 + 44 - -17 + 23 ^ 104 + 105 - 96 + 26;
        d.var2[23] = 0xFFFFEFF1 & 0x1DEF;
        d.var2[24] = 0xFFFFC3DF & 0x3DED;
        d.var2[25] = 12 + 100 - -24 + 21 ^ 68 + 96 - 145 + 132;
        d.var2[26] = 0x8C ^ 0x87;
        d.var2[27] = 0xFFFFAFF7 & 0x5DED;
        d.var2[28] = -(0xFFFFA4FB & 0x5F06) & (0xFFFFF5FF & 0xFCF);
        d.var2[29] = 0xAD ^ 0xA4 ^ (0x71 ^ 0x74);
    }

    static {
        d.var34();
        d.var3();
        DHAROK = new GameEnum2(var1[var2[1]], var2[2], new WorldPoint(var2[3], var2[4], var2[0]), var2[5]);
        GUTHAN = new GameEnum2(var1[var2[7]], var2[2], new WorldPoint(var2[8], var2[9], var2[0]), var2[10]);
        KARIL = new GameEnum2(var1[var2[12]], var2[13], new WorldPoint(var2[14], var2[15], var2[0]), var2[16]);
        AHRIM = new GameEnum2(var1[var2[18]], var2[13], new WorldPoint(var2[14], var2[19], var2[0]), var2[20]);
        TORAG = new GameEnum2(var1[var2[22]], var2[2], new WorldPoint(var2[23], var2[9], var2[0]), var2[24]);
        VERAC = new GameEnum2(var1[var2[26]], var2[2], new WorldPoint(var2[27], var2[4], var2[0]), var2[28]);
        d[] dArray = new d[var2[17]];
        dArray[d.var2[0]] = DHAROK;
        dArray[d.var2[1]] = GUTHAN;
        dArray[d.var2[6]] = KARIL;
        dArray[d.var2[7]] = AHRIM;
        dArray[d.var2[11]] = TORAG;
        dArray[d.var2[12]] = VERAC;
        $VALUES = dArray;
    }

    public WorldPoint D() {
        return this.location;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }
}

