/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;

public final class GameEnum74
extends Enum<am> {
    private static final  am[] $VALUES;
    
    public static final  /* enum */ am ECTOFUNTUS;
    
    public static final  /* enum */ am SLIME_COLLECTION;
    private final  WorldArea area;
    public static final  /* enum */ am ECTO_UPSTAIRS;

    public WorldArea bp() {
        return this.area;
    }

    private static void llIIIIIIIlI() {
        llIllllIl = new String[llIlllllI[11]];
        am.llIllllIl[am.llIlllllI[0]] = "ECTOFUNTUS";
        am.llIllllIl[am.llIlllllI[5]] = "ECTO_UPSTAIRS";
        am.llIllllIl[am.llIlllllI[6]] = "SLIME_COLLECTION";
    }

    public static am[] values() {
        return (am[])$VALUES.clone();
    }

    private GameEnum74(WorldArea worldArea) {
        this.area = worldArea;
    }

    static {
        am.llIIIIIIIll();
        am.llIIIIIIIlI();
        ECTOFUNTUS = new GameEnum74(new WorldArea(llIlllllI[1], llIlllllI[2], llIlllllI[3], llIlllllI[4], llIlllllI[0]));
        ECTO_UPSTAIRS = new GameEnum74(new WorldArea(llIlllllI[1], llIlllllI[2], llIlllllI[3], llIlllllI[4], llIlllllI[5]));
        SLIME_COLLECTION = new GameEnum74(new WorldArea(llIlllllI[7], llIlllllI[8], llIlllllI[9], llIlllllI[10], llIlllllI[0]));
        am[] amArray = new am[llIlllllI[11]];
        amArray[am.llIlllllI[0]] = ECTOFUNTUS;
        amArray[am.llIlllllI[5]] = ECTO_UPSTAIRS;
        amArray[am.llIlllllI[6]] = SLIME_COLLECTION;
        $VALUES = amArray;
    }

    public static am valueOf(String string) {
        return Enum.valueOf(GameEnum74.class, string);
    }

    private static boolean llIIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(lIlIllIllIIlIlI);
    }

    public boolean bo() {
        return this.area.contains(Players.getLocal().getWorldLocation());
    }
}

