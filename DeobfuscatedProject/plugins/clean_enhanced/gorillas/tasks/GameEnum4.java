/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.gorillas.tasks;

import net.runelite.api.Prayer;

public final class GameEnum4
extends Enum<h> {
    private static final  h[] $VALUES;
    public static final  /* enum */ h RIGOUR;
    
    private final  Prayer mapped;
    public static final  /* enum */ h EAGLE_EYE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    private GameEnum4(Prayer prayer) {
        this.mapped = prayer;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public Prayer C() {
        return this.mapped;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    static {
        h.var15();
        h.var16();
        RIGOUR = new GameEnum4(Prayer.RIGOUR);
        EAGLE_EYE = new GameEnum4(Prayer.EAGLE_EYE);
        h[] hArray = new h[2];
        hArray[0] = RIGOUR;
        hArray[1] = EAGLE_EYE;
        $VALUES = hArray;
    }
}

