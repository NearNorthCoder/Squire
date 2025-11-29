/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.farmer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public final class GameEnum62
extends Enum<p> {
    private final  int radius;
    public static final  /* enum */ p FALADOR;
    private static final  p[] $VALUES;
    
    public static final  /* enum */ p WEISS;
    public static final  /* enum */ p MONASTERY;
    public static final  /* enum */ p FARMING_GUILD;
    public static final  /* enum */ p MORYTANIA;
    public static final  /* enum */ p GRAPE_VINE_KOUREND;
    public static final  /* enum */ p CHAMPIONS_GUILD;
    private final  WorldPoint worldPoint;
    public static final  /* enum */ p ARDOUGNE;
    public static final  /* enum */ p TROLLHEIM;
    public static final  /* enum */ p FOSSIL_ISLAND_UNDERWATER;
    public static final  /* enum */ p HARMONY;
    
    public static final  /* enum */ p HOSIDIUS;
    public static final  /* enum */ p CATHERBY;
    private final  int regionID;

    private GameEnum62(int n3, WorldPoint worldPoint) {
        this(n3, worldPoint, lIllllIIlIlI[0]);
    }

        return String.valueOf(var1);
    }

    public int Z() {
        return this.radius;
    }

    private static boolean lllIlllIIIIllI(Object object) {
        return object == null;
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    static {
        p.lllIlllIIIIIll();
        p.lllIlllIIIIIlI();
        FARMING_GUILD = new GameEnum62(lIllllIIlIlI[2], new WorldPoint(lIllllIIlIlI[3], lIllllIIlIlI[4], lIllllIIlIlI[1]), lIllllIIlIlI[5]);
        HOSIDIUS = new GameEnum62(lIllllIIlIlI[7], new WorldPoint(lIllllIIlIlI[8], lIllllIIlIlI[9], lIllllIIlIlI[1]));
        TROLLHEIM = new GameEnum62(lIllllIIlIlI[11], new WorldPoint(lIllllIIlIlI[12], lIllllIIlIlI[13], lIllllIIlIlI[1]));
        WEISS = new GameEnum62(lIllllIIlIlI[15], new WorldPoint(lIllllIIlIlI[16], lIllllIIlIlI[17], lIllllIIlIlI[1]));
        CATHERBY = new GameEnum62(lIllllIIlIlI[19], new WorldPoint(lIllllIIlIlI[20], lIllllIIlIlI[21], lIllllIIlIlI[1]), lIllllIIlIlI[22]);
        MORYTANIA = new GameEnum62(lIllllIIlIlI[24], new WorldPoint(lIllllIIlIlI[25], lIllllIIlIlI[26], lIllllIIlIlI[1]));
        FALADOR = new GameEnum62(lIllllIIlIlI[28], new WorldPoint(lIllllIIlIlI[29], lIllllIIlIlI[30], lIllllIIlIlI[1]));
        ARDOUGNE = new GameEnum62(lIllllIIlIlI[32], new WorldPoint(lIllllIIlIlI[33], lIllllIIlIlI[34], lIllllIIlIlI[1]));
        HARMONY = new GameEnum62(lIllllIIlIlI[35], new WorldPoint(lIllllIIlIlI[36], lIllllIIlIlI[37], lIllllIIlIlI[1]));
        MONASTERY = new GameEnum62(lIllllIIlIlI[39], new WorldPoint(lIllllIIlIlI[40], lIllllIIlIlI[41], lIllllIIlIlI[1]), lIllllIIlIlI[22]);
        CHAMPIONS_GUILD = new GameEnum62(lIllllIIlIlI[43], new WorldPoint(lIllllIIlIlI[44], lIllllIIlIlI[45], lIllllIIlIlI[1]), lIllllIIlIlI[22]);
        GRAPE_VINE_KOUREND = new GameEnum62(lIllllIIlIlI[47], new WorldPoint(lIllllIIlIlI[48], lIllllIIlIlI[49], lIllllIIlIlI[1]), lIllllIIlIlI[0]);
        FOSSIL_ISLAND_UNDERWATER = new GameEnum62(lIllllIIlIlI[51], new WorldPoint(lIllllIIlIlI[52], lIllllIIlIlI[53], lIllllIIlIlI[6]), lIllllIIlIlI[22]);
        p[] pArray = new p[lIllllIIlIlI[54]];
        pArray[p.lIllllIIlIlI[1]] = FARMING_GUILD;
        pArray[p.lIllllIIlIlI[6]] = HOSIDIUS;
        pArray[p.lIllllIIlIlI[10]] = TROLLHEIM;
        pArray[p.lIllllIIlIlI[14]] = WEISS;
        pArray[p.lIllllIIlIlI[18]] = CATHERBY;
        pArray[p.lIllllIIlIlI[23]] = MORYTANIA;
        pArray[p.lIllllIIlIlI[27]] = FALADOR;
        pArray[p.lIllllIIlIlI[31]] = ARDOUGNE;
        pArray[p.lIllllIIlIlI[22]] = HARMONY;
        pArray[p.lIllllIIlIlI[38]] = MONASTERY;
        pArray[p.lIllllIIlIlI[42]] = CHAMPIONS_GUILD;
        pArray[p.lIllllIIlIlI[46]] = GRAPE_VINE_KOUREND;
        pArray[p.lIllllIIlIlI[50]] = FOSSIL_ISLAND_UNDERWATER;
        $VALUES = pArray;
    }

    public int X() {
        return this.regionID;
    }

    private GameEnum62(int n3, WorldPoint worldPoint, int n4) {
        this.regionID = n3;
        this.worldPoint = worldPoint;
        this.radius = n4;
    }

    /*
     * WARNING - void declaration
     */
    public static p b(int n2) {
        void var2;
        p[] pArray = p.values();
        int n3 = pArray.length;
        int var3 = lIllllIIlIlI[1];
        while (p.lllIlllIIIIlII(var3, (int)var2)) {
            int var4;
            void var5;
            void var6 = var5[var3];
            if (p.lllIlllIIIIlIl(var6.X(), var4)) {
                return var6;
            }
            ++var3;

            if (2 <= 3) continue;
            return null;
        }
        return null;
    }

    public static p[] W() {
        Player player = Players.getLocal();
        if (p.lllIlllIIIIllI(player)) {
            return p.values();
        }
        WorldPoint worldPoint = player.getWorldLocation();
        p[] pArray = p.values();
        Arrays.sort(pArray, Comparator.comparingInt(p2 -> p2.Y().distanceTo(worldPoint)));
        return pArray;
    }

    public static p valueOf(String string) {
        return Enum.valueOf(GameEnum62.class, string);
    }

    private static boolean lllIlllIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlllIIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllIlllIIIIIlI() {
        lIllllIIlIIl = new String[lIllllIIlIlI[54]];
        p.lIllllIIlIIl[p.lIllllIIlIlI[1]] = "FARMING_GUILD";
        p.lIllllIIlIIl[p.lIllllIIlIlI[6]] = "HOSIDIUS";
        p.lIllllIIlIIl[p.lIllllIIlIlI[10]] = "TROLLHEIM";
        p.lIllllIIlIIl[p.lIllllIIlIlI[14]] = "WEISS";
        p.lIllllIIlIIl[p.lIllllIIlIlI[18]] = "CATHERBY";
        p.lIllllIIlIIl[p.lIllllIIlIlI[23]] = "MORYTANIA";
        p.lIllllIIlIIl[p.lIllllIIlIlI[27]] = "FALADOR";
        p.lIllllIIlIIl[p.lIllllIIlIlI[31]] = "ARDOUGNE";
        p.lIllllIIlIIl[p.lIllllIIlIlI[22]] = "HARMONY";
        p.lIllllIIlIIl[p.lIllllIIlIlI[38]] = "MONASTERY";
        p.lIllllIIlIIl[p.lIllllIIlIlI[42]] = "CHAMPIONS_GUILD";
        p.lIllllIIlIIl[p.lIllllIIlIlI[46]] = "GRAPE_VINE_KOUREND";
        p.lIllllIIlIIl[p.lIllllIIlIlI[50]] = "FOSSIL_ISLAND_UNDERWATER";
    }

    public WorldPoint Y() {
        return this.worldPoint;
    }
}

