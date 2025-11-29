/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.combat.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum
extends Enum<b> {
    private final  WorldPoint location;
    
    public static final  /* enum */ b HEROS;
    
    private final  String locationName;
    private static final  b[] $VALUES;
    public static final  /* enum */ b MYTHS_GUILD;
    private final  WorldArea dragonArea;
    private final  WorldPoint safeSpot;
    public static final  /* enum */ b TAVERLEY_DUNGEON;

    private static boolean llIlIIIllIlIII(int n, int n2) {
        return n < n2;
    }

        return String.valueOf(var1);
    }

    public WorldPoint o() {
        return this.location;
    }

    public WorldArea p() {
        return this.dragonArea;
    }

    private static void llIlIIIlIIIlII() {
        lIIlllIllIII = new String[lIIllllIIIlI[29]];
        b.lIIlllIllIII[b.lIIllllIIIlI[0]] = "HEROS";
        b.lIIlllIllIII[b.lIIllllIIIlI[1]] = "Heroes' Guild Basement";
        b.lIIlllIllIII[b.lIIllllIIIlI[9]] = "TAVERLEY_DUNGEON";
        b.lIIlllIllIII[b.lIIllllIIIlI[10]] = "Taverley Dungeon";
        b.lIIlllIllIII[b.lIIllllIIIlI[19]] = "MYTHS_GUILD";
        b.lIIlllIllIII[b.lIIllllIIIlI[20]] = "Myths Guild";
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private GameEnum(String string2, WorldPoint worldPoint, WorldArea worldArea, WorldPoint worldPoint2) {
        this.location = worldPoint;
        this.locationName = string2;
        this.dragonArea = worldArea;
        this.safeSpot = worldPoint2;
    }

    static {
        b.llIlIIIllIIlll();
        b.llIlIIIlIIIlII();
        HEROS = new GameEnum(lIIlllIllIII[lIIllllIIIlI[1]], new WorldPoint(lIIllllIIIlI[2], lIIllllIIIlI[3], lIIllllIIIlI[0]), new WorldArea(lIIllllIIIlI[4], lIIllllIIIlI[5], lIIllllIIIlI[6], lIIllllIIIlI[7], lIIllllIIIlI[0]), new WorldPoint(lIIllllIIIlI[8], lIIllllIIIlI[3], lIIllllIIIlI[0]));
        TAVERLEY_DUNGEON = new GameEnum(lIIlllIllIII[lIIllllIIIlI[10]], new WorldPoint(lIIllllIIIlI[11], lIIllllIIIlI[12], lIIllllIIIlI[0]), new WorldArea(lIIllllIIIlI[13], lIIllllIIIlI[14], lIIllllIIIlI[15], lIIllllIIIlI[16], lIIllllIIIlI[0]), new WorldPoint(lIIllllIIIlI[17], lIIllllIIIlI[18], lIIllllIIIlI[0]));
        MYTHS_GUILD = new GameEnum(lIIlllIllIII[lIIllllIIIlI[20]], new WorldPoint(lIIllllIIIlI[21], lIIllllIIIlI[22], lIIllllIIIlI[1]), new WorldArea(lIIllllIIIlI[23], lIIllllIIIlI[24], lIIllllIIIlI[25], lIIllllIIIlI[26], lIIllllIIIlI[1]), new WorldPoint(lIIllllIIIlI[27], lIIllllIIIlI[28], lIIllllIIIlI[1]));
        b[] bArray = new b[lIIllllIIIlI[10]];
        bArray[b.lIIllllIIIlI[0]] = HEROS;
        bArray[b.lIIllllIIIlI[1]] = TAVERLEY_DUNGEON;
        bArray[b.lIIllllIIIlI[9]] = MYTHS_GUILD;
        $VALUES = bArray;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    public WorldPoint q() {
        return this.safeSpot;
    }

}

