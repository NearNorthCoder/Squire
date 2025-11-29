/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.client.Static
 */
package gg.squire.woodcutting.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.client.Static;

public final class GameEnum
extends Enum<i> {
    private final  RectangularArea chopArea;
    public static final  /* enum */ i WEST;
    public static final  /* enum */ i EAST;
    private  long chopTimestamp;
    private final  int treeId;
    
    public static final  /* enum */ i MIDDLE;
    private static final  i[] $VALUES;

        return String.valueOf(var1);
    }

    private static boolean llIIIlIIIllIllI(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIlIIIllIlll(int n, int n2) {
        return n < n2;
    }

    public RectangularArea w() {
        return this.chopArea;
    }

    private static void llIIIlIIIllIlII() {
        lIllIIIIlIllI = new String[lIllIIIIlIlll[14]];
        i.lIllIIIIlIllI[i.lIllIIIIlIlll[1]] = "WEST";
        i.lIllIIIIlIllI[i.lIllIIIIlIlll[0]] = "MIDDLE";
        i.lIllIIIIlIllI[i.lIllIIIIlIlll[10]] = "EAST";
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static i b(TileObject tileObject) {
        return Arrays.stream(i.values()).filter(i2 -> {
            boolean bl;
            if (i.llIIIlIIIllIllI(i2.v(), tileObject.getId())) {
                bl = lIllIIIIlIlll[0];

                }
            } else {
                bl = lIllIIIIlIlll[1];
            }
            return bl;
        }).findFirst().orElse(null);
    }

    public int v() {
        return this.treeId;
    }

    static {
        i.llIIIlIIIllIlIl();
        i.llIIIlIIIllIlII();
        WEST = new GameEnum(lIllIIIIlIlll[2], new RectangularArea(lIllIIIIlIlll[3], lIllIIIIlIlll[4], lIllIIIIlIlll[3], lIllIIIIlIlll[5]));
        MIDDLE = new GameEnum(lIllIIIIlIlll[6], new RectangularArea(lIllIIIIlIlll[7], lIllIIIIlIlll[8], lIllIIIIlIlll[9], lIllIIIIlIlll[8]));
        EAST = new GameEnum(lIllIIIIlIlll[11], new RectangularArea(lIllIIIIlIlll[12], lIllIIIIlIlll[13], lIllIIIIlIlll[12], lIllIIIIlIlll[5]));
        i[] iArray = new i[lIllIIIIlIlll[14]];
        iArray[i.lIllIIIIlIlll[1]] = WEST;
        iArray[i.lIllIIIIlIlll[0]] = MIDDLE;
        iArray[i.lIllIIIIlIlll[10]] = EAST;
        $VALUES = iArray;
    }

    private GameEnum(int n2, RectangularArea rectangularArea) {
        this.treeId = n2;
        this.chopArea = rectangularArea;
    }

    public long u() {
        return this.chopTimestamp + 15L - (long)Static.getClient().getTickCount();
    }

    public void a(long l2) {
        this.chopTimestamp = l2;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

