/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum2;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;

public final class GameEnum11
extends Enum<ap>
implements aw {
    public static final  /* enum */ ap STRAWBERRIES;
    public static final  /* enum */ ap ONIONS;
    private final  av produceSeed;
    public static final  /* enum */ ap SWEETCORN;
    public static final  /* enum */ ap SNAPE_GRASS;
    
    public static final  /* enum */ ap WATERMELON;
    public static final  /* enum */ ap NOTHING;
    public static final  /* enum */ ap DEFAULT;
    private static final  ap[] $VALUES;

    @Override
    public av bf() {
        return this.produceSeed;
    }

    public static ap valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
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
            if (-(0xA8 ^ 0xAD) < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public static ap[] values() {
        return (ap[])$VALUES.clone();
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    static {
        ap.var25();
        ap.var26();
        NOTHING = new GameEnum11(null);
        DEFAULT = new GameEnum11(av.DEFAULT);
        WATERMELON = new GameEnum11(av.WATERMELON);
        STRAWBERRIES = new GameEnum11(av.STRAWEBERRIES);
        ONIONS = new GameEnum11(av.ONIONS);
        SWEETCORN = new GameEnum11(av.SWEETCORN);
        SNAPE_GRASS = new GameEnum11(av.SNAPE_GRASS);
        ap[] apArray = new ap[7];
        apArray[0] = NOTHING;
        apArray[1] = DEFAULT;
        apArray[2] = WATERMELON;
        apArray[3] = STRAWBERRIES;
        apArray[4] = ONIONS;
        apArray[5] = SWEETCORN;
        apArray[6] = SNAPE_GRASS;
        $VALUES = apArray;
    }

    private GameEnum11(av av2) {
        this.produceSeed = av2;
    }
}

