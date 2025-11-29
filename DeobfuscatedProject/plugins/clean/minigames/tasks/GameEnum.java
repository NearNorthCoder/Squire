/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.GameEnum10;
import gg.squire.minigames.tasks.CHelper;
import gg.squire.minigames.tasks.GameEnum15;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<b> {
    private static final  b[] $VALUES;
    private final  d prayerPriority;
    public static final  /* enum */ b RANGER;
    public static final  /* enum */ b JAD;
    public static final  /* enum */ b MELEER;
    private final  int[] npcID;
    private final  int attackSpeedInTicks;
    
    public static final  /* enum */ b BLOB;
    public static final  /* enum */ b HEALER;
    public static final  /* enum */ b BAT;
    private final  a attackStyle;
    
    public static final  /* enum */ b MAGER;
    public static final  /* enum */ b SMALL_BLOB;
    private final  String name;

    public int e() {
        return this.attackSpeedInTicks;
    }

    public a GameEnum() {
        return this.attackStyle;
    }

    private static boolean llllIllIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIllIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(int n2) {
        void var1;
        b[] bArray = b.values();
        int n4 = bArray.length;
        int var2 = llIIIllIlllI[0];
        while (b.llllIllIlIIllI(var2, (int)var1)) {
            int var3;
            void var4;
            void var5 = var4[var2];
            if (b.llllIllIlIIlll(Arrays.stream(var5.c()).anyMatch(n3 -> {
                boolean bl;
                if (b.llllIllIlIlIII(n3, var3)) {
                    bl = llIIIllIlllI[1];

                    if (2 != 2) {
                        return ((0xC3 ^ 0xBF ^ (0x1B ^ 0x23)) & (0x8A ^ 0xB9 ^ (0x67 ^ 0x10) ^ -1)) != 0;
                    }
                } else {
                    bl = llIIIllIlllI[0];
                }
                return bl;
            }) ? 1 : 0)) {
                return var5;
            }
            ++var2;

            if ((0x63 ^ 0x67) > 0) continue;
            return null;
        }
        return null;
    }

    public String d() {
        return this.name;
    }

        return String.valueOf(var6);
    }

    public d f() {
        return this.prayerPriority;
    }

    private static boolean llllIllIlIIlll(int n2) {
        return n2 != 0;
    }

    private GameEnum(int[] nArray, String string2, int n3, d d2, a a2) {
        this.npcID = nArray;
        this.name = string2;
        this.attackSpeedInTicks = n3;
        this.prayerPriority = d2;
        this.attackStyle = a2;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static void llllIllIlIIlII() {
        llIIIllIllIl = new String[llIIIllIlllI[16]];
        b.llIIIllIllIl[b.llIIIllIlllI[0]] = "BAT";
        b.llIIIllIllIl[b.llIIIllIlllI[1]] = "Tz-Kih";
        b.llIIIllIllIl[b.llIIIllIlllI[3]] = "BLOB";
        b.llIIIllIllIl[b.llIIIllIlllI[4]] = "Tz-Kek";
        b.llIIIllIllIl[b.llIIIllIlllI[2]] = "SMALL_BLOB";
        b.llIIIllIllIl[b.llIIIllIlllI[5]] = "Tz-Kek";
        b.llIIIllIllIl[b.llIIIllIlllI[6]] = "RANGER";
        b.llIIIllIllIl[b.llIIIllIlllI[7]] = "Tok-Xil";
        b.llIIIllIllIl[b.llIIIllIlllI[8]] = "MELEER";
        b.llIIIllIllIl[b.llIIIllIlllI[9]] = "Yt-MejKot";
        b.llIIIllIllIl[b.llIIIllIlllI[10]] = "MAGER";
        b.llIIIllIllIl[b.llIIIllIlllI[11]] = "Ket-Zek";
        b.llIIIllIllIl[b.llIIIllIlllI[12]] = "JAD";
        b.llIIIllIllIl[b.llIIIllIlllI[13]] = "TzTok-Jad";
        b.llIIIllIllIl[b.llIIIllIlllI[14]] = "HEALER";
        b.llIIIllIllIl[b.llIIIllIlllI[15]] = "Yt-HurKot";
    }

    public int[] c() {
        return this.npcID;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    static {
        b.llllIllIlIIlIl();
        b.llllIllIlIIlII();
        BAT = new GameEnum(c.p, llIIIllIllIl[llIIIllIlllI[1]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        BLOB = new GameEnum(c.q, llIIIllIllIl[llIIIllIlllI[4]], llIIIllIlllI[2], d.LOW, a.MELEE);
        SMALL_BLOB = new GameEnum(c.r, llIIIllIllIl[llIIIllIlllI[5]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        RANGER = new GameEnum(c.s, llIIIllIllIl[llIIIllIlllI[7]], llIIIllIlllI[2], d.HIGH, a.RANGED);
        MELEER = new GameEnum(c.t, llIIIllIllIl[llIIIllIlllI[9]], llIIIllIlllI[2], d.MEDIUM, a.MELEE);
        MAGER = new GameEnum(c.u, llIIIllIllIl[llIIIllIlllI[11]], llIIIllIlllI[2], d.VERY_HIGH, a.MAGIC);
        JAD = new GameEnum(c.v, llIIIllIllIl[llIIIllIlllI[13]], llIIIllIlllI[8], d.VERY_HIGH, a.MIXED);
        HEALER = new GameEnum(c.w, llIIIllIllIl[llIIIllIlllI[15]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        b[] bArray = new b[llIIIllIlllI[8]];
        bArray[b.llIIIllIlllI[0]] = BAT;
        bArray[b.llIIIllIlllI[1]] = BLOB;
        bArray[b.llIIIllIlllI[3]] = SMALL_BLOB;
        bArray[b.llIIIllIlllI[4]] = RANGER;
        bArray[b.llIIIllIlllI[2]] = MELEER;
        bArray[b.llIIIllIlllI[5]] = MAGER;
        bArray[b.llIIIllIlllI[6]] = JAD;
        bArray[b.llIIIllIlllI[7]] = HEALER;
        $VALUES = bArray;
    }
}

