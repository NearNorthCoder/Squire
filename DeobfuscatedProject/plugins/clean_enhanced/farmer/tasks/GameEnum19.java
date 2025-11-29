/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum2;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;

public final class GameEnum19
extends Enum<aq>
implements aw {
    
    public static final  /* enum */ aq NOTHING;
    private static final  aq[] $VALUES;
    public static final  /* enum */ aq WHITE_BERRY;
    public static final  /* enum */ aq POISON_IVY;
    
    private final  av produce;
    public static final  /* enum */ aq DEFAULT;

    public static aq[] values() {
        return (aq[])$VALUES.clone();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-1 < ((0x29 ^ 0x32) & ~(0x8D ^ 0x96))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private GameEnum19(av av2) {
        this.produce = av2;
    }

    @Override
    public av bf() {
        return this.produce;
    }

    public static aq valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    static {
        aq.var25();
        aq.var26();
        NOTHING = new GameEnum19(null);
        DEFAULT = new GameEnum19(av.DEFAULT);
        WHITE_BERRY = new GameEnum19(av.WHITE_BERRY);
        POISON_IVY = new GameEnum19(av.POISON_IVY);
        aq[] aqArray = new aq[4];
        aqArray[0] = NOTHING;
        aqArray[1] = DEFAULT;
        aqArray[2] = WHITE_BERRY;
        aqArray[3] = POISON_IVY;
        $VALUES = aqArray;
    }
}

