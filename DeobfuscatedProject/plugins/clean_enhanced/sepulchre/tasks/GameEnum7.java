/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum7
extends Enum<q> {
    private static final  q[] $VALUES;
    public static final  /* enum */ q SHARK;
    public static final  /* enum */ q SWORDFISH;
    public static final  /* enum */ q PIKE;
    
    public static final  /* enum */ q TROUT;
    public static final  /* enum */ q KARAMBWAN;
    public static final  /* enum */ q JUG_OF_WINE;
    private final  int itemId;
    public static final  /* enum */ q SALMON;
    public static final  /* enum */ q DARK_CRAB;
    public static final  /* enum */ q TUNA;
    public static final  /* enum */ q STEW;
    
    public static final  /* enum */ q MANTA_RAY;
    private final  int healAmount;
    public static final  /* enum */ q SEA_TURTLE;
    public static final  /* enum */ q LOBSTER;
    public static final  /* enum */ q BASS;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var2 = new String[var1[23]];
        q.var2[q.var1[0]] = "TROUT";
        q.var2[q.var1[3]] = "PIKE";
        q.var2[q.var1[6]] = "SALMON";
        q.var2[q.var1[9]] = "TUNA";
        q.var2[q.var1[12]] = "STEW";
        q.var2[q.var1[15]] = "JUG_OF_WINE";
        q.var2[q.var1[17]] = "LOBSTER";
        q.var2[q.var1[2]] = "BASS";
        q.var2[q.var1[5]] = "SWORDFISH";
        q.var2[q.var1[8]] = "KARAMBWAN";
        q.var2[q.var1[11]] = "SHARK";
        q.var2[q.var1[14]] = "SEA_TURTLE";
        q.var2[q.var1[19]] = "MANTA_RAY";
        q.var2[q.var1[21]] = "DARK_CRAB";
    }

    private static void var5() {
        var1 = new int[33];
        q.var1[0] = (0xAF ^ 0x82 ^ (0x6D ^ 2)) & (15 + 196 - 150 + 167 ^ 95 + 164 - 133 + 40 ^ -1);
        q.var1[1] = 0xFFFFCB5F & 0x35ED;
        q.var1[2] = 0xE ^ 9;
        q.var1[3] = 1;
        q.var1[4] = -(0xFFFFDE8F & 0x65F1) & (0xFFFFF5DF & 0x4FFF);
        q.var1[5] = 0x87 ^ 0x8F;
        q.var1[6] = 2;
        q.var1[7] = 0xFFFF8DFF & 0x7349;
        q.var1[8] = 0x77 ^ 0x7E;
        q.var1[9] = 3;
        q.var1[10] = 0xFFFFDB6F & 0x25F9;
        q.var1[11] = 0x4C ^ 0x46;
        q.var1[12] = 0x47 ^ 0x43;
        q.var1[13] = -(0xFFFFEEAB & 0x7175) & (0xFFFFF7FF & 0x6FF3);
        q.var1[14] = 0x9B ^ 0x90;
        q.var1[15] = 0x26 ^ 0x23;
        q.var1[16] = -(0xFFFFE405 & 0x7BFF) & (0xFFFFF7EF & 0x6FDD);
        q.var1[17] = 0x77 ^ 0x71;
        q.var1[18] = 0xFFFF897B & 0x77FF;
        q.var1[19] = 169 + 30 - 187 + 177 ^ 165 + 31 - 128 + 109;
        q.var1[20] = -(0xFFFFDEBB & 0x33D7) & (0xFFFFF7FF & 0x1BFF);
        q.var1[21] = 0x65 ^ 0x68;
        q.var1[22] = 0xFFFFB575 & 0x4BFF;
        q.var1[23] = 0x76 ^ 0x17 ^ (0x5D ^ 0x32);
        q.var1[24] = -(0xFFFFFBB5 & 0x27FE) & (0xFFFFBFFF & 0x6FFB);
        q.var1[25] = 0x8F ^ 0x9D;
        q.var1[26] = 0xFFFFD9E3 & 0x279D;
        q.var1[27] = 0x4E ^ 0x5A;
        q.var1[28] = 0xFFFFB3EF & 0x4D9D;
        q.var1[29] = 0x59 ^ 0x4C;
        q.var1[30] = 0xFFFFB9C7 & 0x47BF;
        q.var1[31] = 0x8C ^ 0x9A;
        q.var1[32] = 0xFFFFFFF1 & 0x2EAE;
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    public int V() {
        return this.itemId;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private GameEnum7(int n3, int n4) {
        this.itemId = n3;
        this.healAmount = n4;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    public int W() {
        return this.healAmount;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    static {
        q.var5();
        q.var4();
        TROUT = new GameEnum7(var1[1], var1[2]);
        PIKE = new GameEnum7(var1[4], var1[5]);
        SALMON = new GameEnum7(var1[7], var1[8]);
        TUNA = new GameEnum7(var1[10], var1[11]);
        STEW = new GameEnum7(var1[13], var1[14]);
        JUG_OF_WINE = new GameEnum7(var1[16], var1[14]);
        LOBSTER = new GameEnum7(var1[18], var1[19]);
        BASS = new GameEnum7(var1[20], var1[21]);
        SWORDFISH = new GameEnum7(var1[22], var1[23]);
        KARAMBWAN = new GameEnum7(var1[24], var1[25]);
        SHARK = new GameEnum7(var1[26], var1[27]);
        SEA_TURTLE = new GameEnum7(var1[28], var1[29]);
        MANTA_RAY = new GameEnum7(var1[30], var1[31]);
        DARK_CRAB = new GameEnum7(var1[32], var1[31]);
        q[] qArray = new q[var1[23]];
        qArray[q.var1[0]] = TROUT;
        qArray[q.var1[3]] = PIKE;
        qArray[q.var1[6]] = SALMON;
        qArray[q.var1[9]] = TUNA;
        qArray[q.var1[12]] = STEW;
        qArray[q.var1[15]] = JUG_OF_WINE;
        qArray[q.var1[17]] = LOBSTER;
        qArray[q.var1[2]] = BASS;
        qArray[q.var1[5]] = SWORDFISH;
        qArray[q.var1[8]] = KARAMBWAN;
        qArray[q.var1[11]] = SHARK;
        qArray[q.var1[14]] = SEA_TURTLE;
        qArray[q.var1[19]] = MANTA_RAY;
        qArray[q.var1[21]] = DARK_CRAB;
        $VALUES = qArray;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (q.var3(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            
            return null;
        }
        return String.valueOf(var21);
    }
}

