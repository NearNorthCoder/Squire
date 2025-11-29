/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

public final class GameEnum16
extends Enum<bG> {
    private final  boolean twoHanded;
    public static final  /* enum */ bG DRAGON_WARHAMMER;
    public static final  /* enum */ bG SARADOMIN_BLESSED_SWORD;
    private static  int[] llllIlII;
    private static  String[] llllIIll;
    public static final  /* enum */ bG DRAGON_LONGSWORD;
    private static final  bG[] $VALUES;
    public static final  /* enum */ bG BANDOS_GODSWORD;
    public static final  /* enum */ bG ARMADYL_GODSWORD;
    private final  int itemID;
    public static final  /* enum */ bG SARADOMIN_GODSWORD;
    public static final  /* enum */ bG DRAGON_DAGGER_PP;
    public static final  /* enum */ bG DRAGON_DAGGER;
    public static final  /* enum */ bG CRYSTAL_HALBERD;
    public static final  /* enum */ bG DRAGON_HALBERD;
    public static final  /* enum */ bG SARADOMIN_SWORD;
    public static final  /* enum */ bG DRAGON_DAGGER_P;
    public static final  /* enum */ bG DRAGON_BATTLEAXE;
    public static final  /* enum */ bG DRAGON_DAGGER_PPP;
    public static final  /* enum */ bG DRAGON_CLAWS;
    private final  int specAmount;
    public static final  /* enum */ bG DRAGON_MACE;

    public static bG[] values() {
        return (bG[])$VALUES.clone();
    }

    private GameEnum16(int n3, int n4, boolean bl2) {
        this.itemID = n3;
        this.specAmount = n4;
        this.twoHanded = bl2;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean at() {
        return this.twoHanded;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public static bG valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }

    public int as() {
        return this.specAmount;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (((2 + 90 - 50 + 118 ^ 149 + 63 - 172 + 153) & (0x21 ^ 0x71 ^ (0x66 ^ 0x57) ^ -1)) < 2) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    public int ar() {
        return this.itemID;
    }
}

