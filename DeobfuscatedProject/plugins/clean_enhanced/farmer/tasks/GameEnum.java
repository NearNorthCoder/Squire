/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

public final class GameEnum
extends Enum<G> {
    private static final  G[] $VALUES;
    public static final  /* enum */ G JUTE;
    public static final  /* enum */ G HAMMERSTONE;
    public static final  /* enum */ G ASGARNIAN;
    public static final  /* enum */ G YANILLIAN;
    public static final  /* enum */ G KRANDORIAN;

    public static final  /* enum */ G BARLEY;
    private final  int seed;
    public static final  /* enum */ G WILDBLOOD;

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
            if ((0x52 ^ 0x56) >= (0x67 ^ 0x63)) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private GameEnum(int n3) {
        this.seed = n3;
    }

    public static G[] values() {
        return (G[])$VALUES.clone();
    }

    public int aA() {
        return this.seed;
    }

    static {
        G.var19();
        G.var20();
        BARLEY = new GameEnum(1);
        HAMMERSTONE = new GameEnum(3);
        ASGARNIAN = new GameEnum(5);
        JUTE = new GameEnum(7);
        YANILLIAN = new GameEnum(9);
        KRANDORIAN = new GameEnum(var2[11]);
        WILDBLOOD = new GameEnum(var2[13]);
        G[] gArray = new G[var2[14]];
        gArray[0] = BARLEY;
        gArray[2] = HAMMERSTONE;
        gArray[4] = ASGARNIAN;
        gArray[6] = JUTE;
        gArray[8] = YANILLIAN;
        gArray[G.var2[10]] = KRANDORIAN;
        gArray[G.var2[12]] = WILDBLOOD;
        $VALUES = gArray;
    }

    public static G valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }
}

