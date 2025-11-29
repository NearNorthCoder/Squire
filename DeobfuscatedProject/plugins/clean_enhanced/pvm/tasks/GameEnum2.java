/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.pvm.tasks;

public final class GameEnum2
extends Enum<e> {
    
    public static final  /* enum */ e DARK_CRAB;
    
    public static final  /* enum */ e LOBSTER;
    public static final  /* enum */ e KARAMBWAN;
    public static final  /* enum */ e SHARK;
    public static final  /* enum */ e SWORDFISH;
    public static final  /* enum */ e MONKFISH;
    private final  int id;
    public static final  /* enum */ e MANTA_RAY;
    public static final  /* enum */ e ANGLERFISH;
    private static final  e[] $VALUES;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static void var15() {
        var2 = new int[17];
        e.var2[0] = (0x37 ^ 0x2D) & ~(0x4A ^ 0x50);
        e.var2[1] = -(0xFFFFF6D1 & 0x5BBF) & (0xFFFFDFDC & 0x7EFB);
        e.var2[2] = 1;
        e.var2[3] = 0xFFFFFFDE & 0x1F2B;
        e.var2[4] = 2;
        e.var2[5] = -(0xFFFFDFCF & 0x723F) & (0xFFFFD3CF & 0x7FBF);
        e.var2[6] = 3;
        e.var2[7] = 0xFFFF9FF7 & 0x618F;
        e.var2[8] = 0x5D ^ 0x59;
        e.var2[9] = 0xFFFFB3FF & 0x4D7B;
        e.var2[10] = 55 + 39 - -20 + 72 ^ 80 + 116 - 31 + 26;
        e.var2[11] = -(0xFFFFFDCB & 0x6E3D) & (0xFFFFFFFF & 0x6D7D);
        e.var2[12] = 0x20 ^ 0x26;
        e.var2[13] = -(0xFFFF951F & 0x7AFF) & (0xFFFFBEFE & 0x7FBF);
        e.var2[14] = 0x93 ^ 0x94;
        e.var2[15] = -(0xFFFFEBFF & 0x5D3B) & (0xFFFFFDBF & 0x7FFB);
        e.var2[16] = 0x66 ^ 0x6E;
    }

    private GameEnum2(int n3) {
        this.id = n3;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var2[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var2[0];
        while (e.var25(var24, var23)) {
            char var26 = var22[var24];
            var19.append((char)(var26 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (-1 >= -1) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void var27() {
        var1 = new String[var2[16]];
        e.var1[e.var2[0]] = "KARAMBWAN";
        e.var1[e.var2[2]] = "MONKFISH";
        e.var1[e.var2[4]] = "SHARK";
        e.var1[e.var2[6]] = "MANTA_RAY";
        e.var1[e.var2[8]] = "LOBSTER";
        e.var1[e.var2[10]] = "SWORDFISH";
        e.var1[e.var2[12]] = "DARK_CRAB";
        e.var1[e.var2[14]] = "ANGLERFISH";
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    public int w() {
        return this.id;
    }

    private static boolean var25(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.var15();
        e.var27();
        KARAMBWAN = new GameEnum2(var2[1]);
        MONKFISH = new GameEnum2(var2[3]);
        SHARK = new GameEnum2(var2[5]);
        MANTA_RAY = new GameEnum2(var2[7]);
        LOBSTER = new GameEnum2(var2[9]);
        SWORDFISH = new GameEnum2(var2[11]);
        DARK_CRAB = new GameEnum2(var2[13]);
        ANGLERFISH = new GameEnum2(var2[15]);
        e[] eArray = new e[var2[16]];
        eArray[e.var2[0]] = KARAMBWAN;
        eArray[e.var2[2]] = MONKFISH;
        eArray[e.var2[4]] = SHARK;
        eArray[e.var2[6]] = MANTA_RAY;
        eArray[e.var2[8]] = LOBSTER;
        eArray[e.var2[10]] = SWORDFISH;
        eArray[e.var2[12]] = DARK_CRAB;
        eArray[e.var2[14]] = ANGLERFISH;
        $VALUES = eArray;
    }
}

