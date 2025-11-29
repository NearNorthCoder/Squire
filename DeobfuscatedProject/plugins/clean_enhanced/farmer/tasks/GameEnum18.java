/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum2;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;

public final class GameEnum18
extends Enum<ax>
implements aw {
    private final  av produceSeed;
    private static final  ax[] $VALUES;
    public static final  /* enum */ ax GIANT_SEAWEED;
    public static final  /* enum */ ax NOTHING;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private GameEnum18(av av2) {
        this.produceSeed = av2;
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

    static {
        ax.var9();
        ax.var10();
        NOTHING = new GameEnum18(null);
        GIANT_SEAWEED = new GameEnum18(av.SEAWEED);
        ax[] axArray = new ax[2];
        axArray[0] = NOTHING;
        axArray[1] = GIANT_SEAWEED;
        $VALUES = axArray;
    }

    public static ax[] values() {
        return (ax[])$VALUES.clone();
    }

    public static ax valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }
}

