/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vorkath.tasks;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i BLOWPIE;
    public static final  /* enum */ i CBOW;
    public static final  /* enum */ i NELEE;
    
    public static final  /* enum */ i MELEE;
    public static final  /* enum */ i OTHER;
    private static final  i[] $VALUES;

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    static {
        i.var19();
        i.var20();
        NELEE = new GameEnum();
        BLOWPIE = new GameEnum();
        CBOW = new GameEnum();
        MELEE = new GameEnum();
        OTHER = new GameEnum();
        i[] iArray = new i[5];
        iArray[0] = NELEE;
        iArray[1] = BLOWPIE;
        iArray[2] = CBOW;
        iArray[3] = MELEE;
        iArray[4] = OTHER;
        $VALUES = iArray;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

}

