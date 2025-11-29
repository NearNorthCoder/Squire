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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;

public final class GameEnum38
extends Enum<q> {

    private final  List<Point> boulders;
    private final  Point stand;
    private static final  q[] $VALUES;
    public static final  /* enum */ q FIRST;
    public static final  /* enum */ q THIRD;
    public static final  /* enum */ q FOURTH;
    private final  Point jug;
    public static final  /* enum */ q SECOND;
    public static final  /* enum */ q FIFTH;

    public static q valueOf(String string) {
        return Enum.valueOf(GameEnum38.class, string);
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    private static boolean lIIllIIIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum38(List<Point> list, Point point, Point point2) {
        this.boulders = list;
        this.jug = point;
        this.stand = point2;
    }

        return String.valueOf(var1);
    }

    private static void lIIllIIIIllIll() {
        lIllIllllll = new String[lIlllIIIIII[13]];
        q.lIllIllllll[q.lIlllIIIIII[0]] = "FIRST";
        q.lIllIllllll[q.lIlllIIIIII[6]] = "SECOND";
        q.lIllIllllll[q.lIlllIIIIII[8]] = "THIRD";
        q.lIllIllllll[q.lIlllIIIIII[12]] = "FOURTH";
        q.lIllIllllll[q.lIlllIIIIII[14]] = "FIFTH";
    }

    static {
        q.lIIllIIIIlllII();
        q.lIIllIIIIllIll();
        FIRST = new GameEnum38(List.of(new Point(lIlllIIIIII[1], lIlllIIIIII[2]), new Point(lIlllIIIIII[1], lIlllIIIIII[3]), new Point(lIlllIIIIII[4], lIlllIIIIII[5])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[6], lIlllIIIIII[6]));
        SECOND = new GameEnum38(List.of(new Point(lIlllIIIIII[1], lIlllIIIIII[3]), new Point(lIlllIIIIII[4], lIlllIIIIII[5]), new Point(lIlllIIIIII[1], lIlllIIIIII[7])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[6], lIlllIIIIII[6]));
        THIRD = new GameEnum38(List.of(new Point(lIlllIIIIII[4], lIlllIIIIII[3]), new Point(lIlllIIIIII[1], lIlllIIIIII[5]), new Point(lIlllIIIIII[9], lIlllIIIIII[7])), new Point(lIlllIIIIII[1], lIlllIIIIII[10]), new Point(lIlllIIIIII[1], lIlllIIIIII[11]));
        FOURTH = new GameEnum38(List.of(new Point(lIlllIIIIII[9], lIlllIIIIII[5]), new Point(lIlllIIIIII[9], lIlllIIIIII[7])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[1], lIlllIIIIII[13]));
        FIFTH = new GameEnum38(List.of(new Point(lIlllIIIIII[9], lIlllIIIIII[7]), new Point(lIlllIIIIII[9], lIlllIIIIII[15]), new Point(lIlllIIIIII[9], lIlllIIIIII[16])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[6], lIlllIIIIII[6]));
        q[] qArray = new q[lIlllIIIIII[13]];
        qArray[q.lIlllIIIIII[0]] = FIRST;
        qArray[q.lIlllIIIIII[6]] = SECOND;
        qArray[q.lIlllIIIIII[8]] = THIRD;
        qArray[q.lIlllIIIIII[12]] = FOURTH;
        qArray[q.lIlllIIIIII[14]] = FIFTH;
        $VALUES = qArray;
    }

}

