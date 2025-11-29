/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

public final class GameEnum24
extends Enum<aA> {
    private static  int[] lllIIll;
    private final  String name;
    public static final  /* enum */ aA RED;
    public static final  /* enum */ aA ALL;
    public static final  /* enum */ aA BROWN;
    private static final  aA[] $VALUES;
    private static  String[] lllIIlI;
    public static final  /* enum */ aA YELLOW;
    public static final  /* enum */ aA ORANGE;

    public String ax() {
        return this.name;
    }

    public static aA[] values() {
        return (aA[])$VALUES.clone();
    }

    public static aA valueOf(String string) {
        return Enum.valueOf(GameEnum24.class, string);
    }

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String lllIIIlIl(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 0;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 0;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if ((1 & (1 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private GameEnum24(String string2) {
        this.name = string2;
    }
}

