/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigame.tasks;

public final class GameEnum
extends Enum<c> {
    public static final  /* enum */ c VETERAN;
    private  int pointsPerGame;
    private  String difficulty;
    public static final  /* enum */ c INTERMEDIATE;
    
    private  int levelRequirement;
    private  int objectID;
    private static final  c[] $VALUES;
    public static final  /* enum */ c NOVICE;

    static {
        c.var3();
        c.var4();
        NOVICE = new GameEnum(var1[var2[1]], var2[2], var2[3], var2[4]);
        INTERMEDIATE = new GameEnum(var1[var2[4]], var2[6], var2[7], var2[8]);
        VETERAN = new GameEnum(var1[var2[9]], var2[10], var2[11], var2[9]);
        c[] cArray = new c[var2[4]];
        cArray[c.var2[0]] = NOVICE;
        cArray[c.var2[1]] = INTERMEDIATE;
        cArray[c.var2[5]] = VETERAN;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void var4() {
        var1 = new String[var2[12]];
        c.var1[c.var2[0]] = "NOVICE";
        c.var1[c.var2[1]] = "Novice";
        c.var1[c.var2[5]] = "INTERMEDIATE";
        c.var1[c.var2[4]] = "Intermediate";
        c.var1[c.var2[8]] = "VETERAN";
        c.var1[c.var2[9]] = "Veteran";
    }

    private static void var3() {
        var2 = new int[14];
        c.var2[0] = (4 ^ 0xF ^ (0x66 ^ 0x73)) & (0x49 ^ 0x18 ^ (0xB ^ 0x44) ^ -1);
        c.var2[1] = 1;
        c.var2[2] = 0x99 ^ 0xB1;
        c.var2[3] = -(0xFFFFCCF3 & 0x7B0D) & (0xFFFFFFFF & 0x7FEB);
        c.var2[4] = 3;
        c.var2[5] = 2;
        c.var2[6] = 0xF7 ^ 0xB1;
        c.var2[7] = 0xFFFFFEDF & 0x653F;
        c.var2[8] = (0x27 ^ 0x6D) & ~(0x11 ^ 0x5B) ^ (0x28 ^ 0x2C);
        c.var2[9] = 125 + 43 - 65 + 50 ^ 105 + 135 - 109 + 25;
        c.var2[10] = 0x6C ^ 0x1D ^ (0x47 ^ 0x52);
        c.var2[11] = 0xFFFFE472 & 0x7FAD;
        c.var2[12] = 0x92 ^ 0x94;
        c.var2[13] = 0xBA ^ 0xB2;
    }

    public String j() {
        return this.difficulty;
    }

    public String toString() {
        return "Boats." + this.name() + "(difficulty=" + this.j() + ", levelRequirement=" + this.k() + ", objectID=" + this.l() + ", pointsPerGame=" + this.m() + ")";
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static boolean var5(int n, int n2) {
        return n < n2;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    public int m() {
        return this.pointsPerGame;
    }

    private GameEnum(String string2, int n2, int n3, int n4) {
        this.difficulty = string2;
        this.levelRequirement = n2;
        this.objectID = n3;
        this.pointsPerGame = n4;
    }

    public int k() {
        return this.levelRequirement;
    }

    public int l() {
        return this.objectID;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[0];
        while (c.var5(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (1 <= 2) continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

