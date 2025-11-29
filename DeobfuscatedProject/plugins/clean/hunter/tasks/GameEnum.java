/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.coords.RectangularArea
 */
package gg.squire.hunter.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.coords.RectangularArea;

public final class GameEnum
extends Enum<i> {
    
    private final  String name;
    private final  RectangularArea area;
    private static final  i[] $VALUES;
    public static final  /* enum */ i MOONLIGHT_ANTELOPE;
    
    public static final  /* enum */ i SUNLIGHT_ANTELOPE;

    public RectangularArea w() {
        return this.area;
    }

        return String.valueOf(var1);
    }

    private static void lIIIlllIIllIlIl() {
        llllIIIIIIII = new String[llllIIIIIIIl[12]];
        i.llllIIIIIIII[i.llllIIIIIIIl[0]] = "SUNLIGHT_ANTELOPE";
        i.llllIIIIIIII[i.llllIIIIIIIl[1]] = "Sunlight antelope";
        i.llllIIIIIIII[i.llllIIIIIIIl[6]] = "MOONLIGHT_ANTELOPE";
        i.llllIIIIIIII[i.llllIIIIIIIl[7]] = "Moonlight antelope";
    }

    private GameEnum(String string2, RectangularArea rectangularArea) {
        this.name = string2;
        this.area = rectangularArea;
    }

    static {
        i.lIIIlllIIllIllI();
        i.lIIIlllIIllIlIl();
        SUNLIGHT_ANTELOPE = new GameEnum(llllIIIIIIII[llllIIIIIIIl[1]], new RectangularArea(llllIIIIIIIl[2], llllIIIIIIIl[3], llllIIIIIIIl[4], llllIIIIIIIl[5]));
        MOONLIGHT_ANTELOPE = new GameEnum(llllIIIIIIII[llllIIIIIIIl[7]], new RectangularArea(llllIIIIIIIl[8], llllIIIIIIIl[9], llllIIIIIIIl[10], llllIIIIIIIl[11]));
        i[] iArray = new i[llllIIIIIIIl[6]];
        iArray[i.llllIIIIIIIl[0]] = SUNLIGHT_ANTELOPE;
        iArray[i.llllIIIIIIIl[1]] = MOONLIGHT_ANTELOPE;
        $VALUES = iArray;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public String v() {
        return this.name;
    }

    private static boolean lIIIlllIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

