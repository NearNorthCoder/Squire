/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

public final class GameEnum2
extends Enum<bO> {
    private static final  bO[] $VALUES;
    public static final  /* enum */ bO FUNGUS;
    private static  String[] llIIlllIl;
    private static  int[] llIIllllI;
    public static final  /* enum */ bO SWAMP_TOAD;
    public static final  /* enum */ bO SNAPE_GRASS;
    private final  int id;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void var7() {
        llIIlllIl = new String[llIIllllI[6]];
        bO.llIIlllIl[bO.llIIllllI[0]] = "FUNGUS";
        bO.llIIlllIl[bO.llIIllllI[2]] = "SNAPE_GRASS";
        bO.llIIlllIl[bO.llIIllllI[4]] = "SWAMP_TOAD";
    }

    private static void var8() {
        llIIllllI = new int[7];
        bO.llIIllllI[0] = (70 + 34 - 92 + 123 ^ 37 + 23 - 46 + 138) & (0x29 ^ 0x78 ^ (0x88 ^ 0xC6) ^ -1);
        bO.llIIllllI[1] = -(0xFFFFCFFD & 0x3467) & (0xFFFF8FFE & Short.MAX_VALUE);
        bO.llIIllllI[2] = 1;
        bO.llIIllllI[3] = 129 + 155 - 136 + 83;
        bO.llIIllllI[4] = 2;
        bO.llIIllllI[5] = 0xFFFFF869 & 0xFFE;
        bO.llIIllllI[6] = 3;
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum2(int n3) {
        this.id = n3;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = llIIllllI[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = llIIllllI[0];
        while (bO.var9(var18, var17)) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (2 > ((37 + 180 - 204 + 198 ^ 37 + 77 - 28 + 73) & (132 + 86 - 182 + 106 ^ 101 + 15 - -10 + 68 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    public static bO[] values() {
        return (bO[])$VALUES.clone();
    }

    public int P() {
        return this.id;
    }

    public static bO valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }
}

