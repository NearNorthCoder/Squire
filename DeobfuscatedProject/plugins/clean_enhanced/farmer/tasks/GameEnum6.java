/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum2;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;

public final class GameEnum6
extends Enum<as>
implements aw {
    private final  av produceSeed;
    
    public static final  /* enum */ as NOTHING;
    
    public static final  /* enum */ as DEFAULT;
    public static final  /* enum */ as GRAPES;
    private static final  as[] $VALUES;

    @Override
    public av bf() {
        return this.produceSeed;
    }

    public static as[] values() {
        return (as[])$VALUES.clone();
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
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        as.var13();
        as.var14();
        NOTHING = new GameEnum6(null);
        DEFAULT = new GameEnum6(av.DEFAULT);
        GRAPES = new GameEnum6(av.GRAPES);
        as[] asArray = new as[3];
        asArray[0] = NOTHING;
        asArray[1] = DEFAULT;
        asArray[2] = GRAPES;
        $VALUES = asArray;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public static as valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private GameEnum6(av av2) {
        this.produceSeed = av2;
    }
}

