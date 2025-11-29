/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Prayer;

public final class GameEnum25
extends Enum<g> {
    
    public static final  /* enum */ g MYSTIC_MIGHT;
    public static final  /* enum */ g AUGURY;
    private final  Prayer prayer;
    
    private static final  g[] $VALUES;

    private static boolean llIIIllllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum25.class, string);
    }

    private static void llIIIlllllIlllI() {
        lIllIlIlIIIII = new String[lIllIlIlIIIIl[2]];
        g.lIllIlIlIIIII[g.lIllIlIlIIIIl[0]] = "MYSTIC_MIGHT";
        g.lIllIlIlIIIII[g.lIllIlIlIIIIl[1]] = "AUGURY";
    }

    private GameEnum25(Prayer prayer) {
        this.prayer = prayer;
    }

    static {
        g.llIIIlllllIllll();
        g.llIIIlllllIlllI();
        MYSTIC_MIGHT = new GameEnum25(Prayer.MYSTIC_MIGHT);
        AUGURY = new GameEnum25(Prayer.AUGURY);
        g[] gArray = new g[lIllIlIlIIIIl[2]];
        gArray[g.lIllIlIlIIIIl[0]] = MYSTIC_MIGHT;
        gArray[g.lIllIlIlIIIIl[1]] = AUGURY;
        $VALUES = gArray;
    }

        return String.valueOf(var1);
    }

    public Prayer r() {
        return this.prayer;
    }
}

