/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

public final class GameEnum14
extends Enum<f> {
    private final  int itemID;
    
    public static final  /* enum */ f SHARK;
    public static final  /* enum */ f ANGLER_FISH;
    public static final  /* enum */ f MANTA_RAY;
    private static final  f[] $VALUES;
    public static final  /* enum */ f KARAMBWAN;
    public static final  /* enum */ f MONKFISH;

    private GameEnum14(int n3) {
        this.itemID = n3;
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
            if ((0xBA ^ 0xBE) <= (0x3B ^ 0x3F)) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    static {
        f.var25();
        f.var26();
        MANTA_RAY = new GameEnum14(1);
        SHARK = new GameEnum14(3);
        KARAMBWAN = new GameEnum14(5);
        ANGLER_FISH = new GameEnum14(7);
        MONKFISH = new GameEnum14(9);
        f[] fArray = new f[var1[10]];
        fArray[0] = MANTA_RAY;
        fArray[2] = SHARK;
        fArray[4] = KARAMBWAN;
        fArray[6] = ANGLER_FISH;
        fArray[8] = MONKFISH;
        $VALUES = fArray;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    public int q() {
        return this.itemID;
    }
}

