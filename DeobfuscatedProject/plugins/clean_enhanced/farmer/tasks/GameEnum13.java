/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum12;
import gg.squire.farmer.tasks.GameEnum2;

public final class GameEnum13
extends Enum<J> {
    private final  av produceSeed;
    public static final  /* enum */ J STRAWBERRIES;
    public static final  /* enum */ J ONIONS;
    private static final  J[] $VALUES;
    public static final  /* enum */ J WATERMELON;
    
    private final  H type;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static J[] values() {
        return (J[])$VALUES.clone();
    }

    private GameEnum13(H h2, av av2) {
        this.type = h2;
        this.produceSeed = av2;
    }

    public H aE() {
        return this.type;
    }

    public av aD() {
        return this.produceSeed;
    }

    public static J valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

    static {
        J.var9();
        J.var10();
        WATERMELON = new GameEnum13(H.SUPERCOMPOST, av.WATERMELON);
        ONIONS = new GameEnum13(H.COMPOST, av.ONIONS);
        STRAWBERRIES = new GameEnum13(H.COMPOST, av.STRAWEBERRIES);
        J[] jArray = new J[3];
        jArray[0] = WATERMELON;
        jArray[1] = ONIONS;
        jArray[2] = STRAWBERRIES;
        $VALUES = jArray;
    }
}

