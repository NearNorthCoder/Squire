/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;

public final class GameEnum33
extends Enum<o> {
    
    public static final  /* enum */ o DEATH;
    public static final  /* enum */ o LIGHTNING;
    
    public static final  /* enum */ o FIRE;
    private static final  o[] $VALUES;
    private final  Set<Point> attack;
    public static final  /* enum */ o AIR;
    private final  List<Point> clockwise;

    private static boolean lIIlllIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    public Set<Point> N() {
        return this.attack;
    }

    private GameEnum33(List<Point> list, Set<Point> set) {
        this.clockwise = list;
        this.attack = set;
    }

        return String.valueOf(var1);
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum33.class, string);
    }

    static {
        o.lIIlllIIlllllI();
        o.lIIlllIIllIllI();
        DEATH = new GameEnum33(List.of(new Point(llIIIIIlllI[1], llIIIIIlllI[2]), new Point(llIIIIIlllI[2], llIIIIIlllI[1]), new Point(llIIIIIlllI[1], llIIIIIlllI[3]), new Point(llIIIIIlllI[4], llIIIIIlllI[5])), Set.of(new Point(llIIIIIlllI[1], llIIIIIlllI[3]), new Point(llIIIIIlllI[1], llIIIIIlllI[2])));
        LIGHTNING = new GameEnum33(List.of(new Point(llIIIIIlllI[2], llIIIIIlllI[7]), new Point(llIIIIIlllI[1], llIIIIIlllI[8]), new Point(llIIIIIlllI[4], llIIIIIlllI[9]), new Point(llIIIIIlllI[1], llIIIIIlllI[10])), Set.of(new Point(llIIIIIlllI[1], llIIIIIlllI[8]), new Point(llIIIIIlllI[1], llIIIIIlllI[10])));
        FIRE = new GameEnum33(List.of(new Point(llIIIIIlllI[12], llIIIIIlllI[1]), new Point(llIIIIIlllI[13], llIIIIIlllI[3]), new Point(llIIIIIlllI[3], llIIIIIlllI[5]), new Point(llIIIIIlllI[13], llIIIIIlllI[2])), Set.of(new Point(llIIIIIlllI[13], llIIIIIlllI[3]), new Point(llIIIIIlllI[13], llIIIIIlllI[2])));
        AIR = new GameEnum33(List.of(new Point(llIIIIIlllI[12], llIIIIIlllI[7]), new Point(llIIIIIlllI[13], llIIIIIlllI[8]), new Point(llIIIIIlllI[3], llIIIIIlllI[9]), new Point(llIIIIIlllI[13], llIIIIIlllI[10])), Set.of(new Point(llIIIIIlllI[13], llIIIIIlllI[8]), new Point(llIIIIIlllI[13], llIIIIIlllI[10])));
        o[] oArray = new o[llIIIIIlllI[15]];
        oArray[o.llIIIIIlllI[0]] = DEATH;
        oArray[o.llIIIIIlllI[6]] = LIGHTNING;
        oArray[o.llIIIIIlllI[11]] = FIRE;
        oArray[o.llIIIIIlllI[14]] = AIR;
        $VALUES = oArray;
    }

    private static void lIIlllIIllIllI() {
        llIIIIIllII = new String[llIIIIIlllI[15]];
        o.llIIIIIllII[o.llIIIIIlllI[0]] = "DEATH";
        o.llIIIIIllII[o.llIIIIIlllI[6]] = "LIGHTNING";
        o.llIIIIIllII[o.llIIIIIlllI[11]] = "FIRE";
        o.llIIIIIllII[o.llIIIIIlllI[14]] = "AIR";
    }

    public List<Point> M() {
        return this.clockwise;
    }
}

