/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

public final class GameEnum19
extends Enum<aG> {
    public static final  /* enum */ aG TORSTOL;
    public static final  /* enum */ aG MARRENTILL;
    private static  String[] lllllII;
    public static final  /* enum */ aG CADANTINE;
    public static final  /* enum */ aG LANTADYME;
    public static final  /* enum */ aG AVANTOE;
    public static final  /* enum */ aG KWUARM;
    public static final  /* enum */ aG RANARR_WEED;
    private final  String itemName;
    public static final  /* enum */ aG IRIT_LEAF;
    public static final  /* enum */ aG HARRALANDER;
    public static final  /* enum */ aG SNAPDRAGON;
    public static final  /* enum */ aG TOADFLAX;
    public static final  /* enum */ aG DWARF_WEED;
    private static  int[] lllllIl;
    private static final  aG[] $VALUES;
    private final  int id;
    public static final  /* enum */ aG GUAM_LEAF;
    public static final  /* enum */ aG TARROMIN;

    private GameEnum19(String string2, int n3) {
        this.itemName = string2;
        this.id = n3;
    }

    /*
     * WARNING - void declaration
     */
    public static aG x(int n2) {
        void var1;
        aG[] aGArray = aG.values();
        int n3 = aGArray.length;
        int var2 = 0;
        while ((var2 < (int)var1)) {
            int var3;
            void var4;
            void var5 = var4[var2];
            if ((var5.P() == var3)) {
                return var5;
            }
            ++var2;
            0;
            if (1 != 3) continue;
            return null;
        }
        return null;
    }

    public int P() {
        return this.id;
    }

    public String N() {
        return this.itemName;
    }

    private static String llllIIIIl(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-(118 + 186 - 245 + 130 ^ 172 + 160 - 213 + 65) < 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public static aG[] values() {
        return (aG[])$VALUES.clone();
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public static aG valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }
}

