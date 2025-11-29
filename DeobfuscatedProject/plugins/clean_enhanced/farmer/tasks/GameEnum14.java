/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum2;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;

public final class GameEnum14
extends Enum<ar>
implements aw {
    private final  av produceSeed;
    
    public static final  /* enum */ ar NASTURTIUM;
    public static final  /* enum */ ar LIMPWURT;
    
    public static final  /* enum */ ar MARIGOLD;
    public static final  /* enum */ ar NOTHING;
    public static final  /* enum */ ar DEFAULT;
    private static final  ar[] $VALUES;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        ar.var9();
        ar.var10();
        NOTHING = new GameEnum14(null);
        DEFAULT = new GameEnum14(av.DEFAULT);
        MARIGOLD = new GameEnum14(av.MARIGOLD);
        NASTURTIUM = new GameEnum14(av.NASTURTIUM);
        LIMPWURT = new GameEnum14(av.LIMPWURT);
        ar[] arArray = new ar[5];
        arArray[0] = NOTHING;
        arArray[1] = DEFAULT;
        arArray[2] = MARIGOLD;
        arArray[3] = NASTURTIUM;
        arArray[4] = LIMPWURT;
        $VALUES = arArray;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

    private GameEnum14(av av2) {
        this.produceSeed = av2;
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = 0;
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = 0;
        while (var25 < var24) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (((0x7B ^ 0x34 ^ (0x46 ^ 0x17)) & (58 + 73 - 120 + 128 ^ 106 + 44 - 96 + 95 ^ -1)) <= 2) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    public static ar valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    public static ar[] values() {
        return (ar[])$VALUES.clone();
    }
}

