/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.construction.tasks;

import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;

public final class GameEnum14
extends Enum<am> {
    private static final  am[] $VALUES;
    private static  String[] llIllllIl;
    public static final  /* enum */ am ECTOFUNTUS;
    private static  int[] llIlllllI;
    public static final  /* enum */ am SLIME_COLLECTION;
    private final  WorldArea area;
    public static final  /* enum */ am ECTO_UPSTAIRS;

    public WorldArea bp() {
        return this.area;
    }

    public static am[] values() {
        return (am[])$VALUES.clone();
    }

    private GameEnum14(WorldArea worldArea) {
        this.area = worldArea;
    }

    static {
        am.var1();
        am.var2();
        ECTOFUNTUS = new GameEnum14(new WorldArea(1, 2, 3, 4, 0));
        ECTO_UPSTAIRS = new GameEnum14(new WorldArea(1, 2, 3, 4, 5));
        SLIME_COLLECTION = new GameEnum14(new WorldArea(7, 8, 9, llIlllllI[10], 0));
        am[] amArray = new am[llIlllllI[11]];
        amArray[0] = ECTOFUNTUS;
        amArray[5] = ECTO_UPSTAIRS;
        amArray[6] = SLIME_COLLECTION;
        $VALUES = amArray;
    }

    public static am valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
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
            if (1 != -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public boolean bo() {
        return this.area.contains(Players.getLocal().getWorldLocation());
    }
}

