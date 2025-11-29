/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum21
extends Enum<A> {
    public static final  /* enum */ A RUNITE_ORE;
    public static final  /* enum */ A IRON_BAR;
    public static final  /* enum */ A ADAMANTITE_BAR;
    
    public static final  /* enum */ A TIN_ORE;
    public static final  /* enum */ A SILVER_ORE;
    private final  double weight;
    public static final  /* enum */ A BRONZE_BAR;
    private final  int itemID;
    public static final  /* enum */ A RUNITE_BAR;
    public static final  /* enum */ A ADAMANTITE_ORE;
    private final  int varbit;
    public static final  /* enum */ A MITHRIL_ORE;
    public static final  /* enum */ A COPPER_ORE;
    private static final  A[] $VALUES;
    public static final  /* enum */ A SILVER_BAR;
    public static final  /* enum */ A GOLD_ORE;
    public static final  /* enum */ A COAL;
    public static final  /* enum */ A GOLD_BAR;
    
    public static final  /* enum */ A IRON_ORE;
    public static final  /* enum */ A MITHRIL_BAR;
    public static final  /* enum */ A STEEL_BAR;

    static {
        A.llIlIIIIlIllII();
        A.llIlIIIIlIlIll();
        COAL = new GameEnum21(lIIlllIlIIIl[1], lIIlllIlIIIl[2], 2.267);
        COPPER_ORE = new GameEnum21(lIIlllIlIIIl[4], lIIlllIlIIIl[5], 2.267);
        TIN_ORE = new GameEnum21(lIIlllIlIIIl[7], lIIlllIlIIIl[8], 2.267);
        IRON_ORE = new GameEnum21(lIIlllIlIIIl[10], lIIlllIlIIIl[11], 2.267);
        MITHRIL_ORE = new GameEnum21(lIIlllIlIIIl[13], lIIlllIlIIIl[14], 1.814);
        ADAMANTITE_ORE = new GameEnum21(lIIlllIlIIIl[16], lIIlllIlIIIl[17], 2.721);
        RUNITE_ORE = new GameEnum21(lIIlllIlIIIl[19], lIIlllIlIIIl[20], 2.267);
        SILVER_ORE = new GameEnum21(lIIlllIlIIIl[22], lIIlllIlIIIl[23], 2.267);
        GOLD_ORE = new GameEnum21(lIIlllIlIIIl[25], lIIlllIlIIIl[26], 2.267);
        BRONZE_BAR = new GameEnum21(lIIlllIlIIIl[28], lIIlllIlIIIl[29], 1.814);
        IRON_BAR = new GameEnum21(lIIlllIlIIIl[31], lIIlllIlIIIl[32], 1.814);
        STEEL_BAR = new GameEnum21(lIIlllIlIIIl[34], lIIlllIlIIIl[35], 1.814);
        MITHRIL_BAR = new GameEnum21(lIIlllIlIIIl[37], lIIlllIlIIIl[38], 1.587);
        ADAMANTITE_BAR = new GameEnum21(lIIlllIlIIIl[40], lIIlllIlIIIl[41], 2.041);
        RUNITE_BAR = new GameEnum21(lIIlllIlIIIl[43], lIIlllIlIIIl[44], 1.814);
        SILVER_BAR = new GameEnum21(lIIlllIlIIIl[46], lIIlllIlIIIl[47], 1.814);
        GOLD_BAR = new GameEnum21(lIIlllIlIIIl[49], lIIlllIlIIIl[50], 1.814);
        A[] aArray = new A[lIIlllIlIIIl[51]];
        aArray[A.lIIlllIlIIIl[0]] = COAL;
        aArray[A.lIIlllIlIIIl[3]] = COPPER_ORE;
        aArray[A.lIIlllIlIIIl[6]] = TIN_ORE;
        aArray[A.lIIlllIlIIIl[9]] = IRON_ORE;
        aArray[A.lIIlllIlIIIl[12]] = MITHRIL_ORE;
        aArray[A.lIIlllIlIIIl[15]] = ADAMANTITE_ORE;
        aArray[A.lIIlllIlIIIl[18]] = RUNITE_ORE;
        aArray[A.lIIlllIlIIIl[21]] = SILVER_ORE;
        aArray[A.lIIlllIlIIIl[24]] = GOLD_ORE;
        aArray[A.lIIlllIlIIIl[27]] = BRONZE_BAR;
        aArray[A.lIIlllIlIIIl[30]] = IRON_BAR;
        aArray[A.lIIlllIlIIIl[33]] = STEEL_BAR;
        aArray[A.lIIlllIlIIIl[36]] = MITHRIL_BAR;
        aArray[A.lIIlllIlIIIl[39]] = ADAMANTITE_BAR;
        aArray[A.lIIlllIlIIIl[42]] = RUNITE_BAR;
        aArray[A.lIIlllIlIIIl[45]] = SILVER_BAR;
        aArray[A.lIIlllIlIIIl[48]] = GOLD_BAR;
        $VALUES = aArray;
    }

    public static int[] N() {
        int[] nArray = new int[A.values().length];
        int var1 = lIIlllIlIIIl[0];
        while (A.llIlIIIIlIllIl(var1, A.values().length)) {
            var2[var1] = A.values()[var1].itemID;
            ++var1;

            if (((0xA5 ^ 0x9C ^ (0x78 ^ 0x7F)) & (0x28 ^ 0x64 ^ (0xC3 ^ 0xB1) ^ -1)) <= 3) continue;
            return null;
        }
        return nArray;
    }

        return String.valueOf(var3);
    }

    private static boolean llIlIIIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }

    public int P() {
        return this.itemID;
    }

    public int O() {
        return this.varbit;
    }

    public double Q() {
        return this.weight;
    }

    private GameEnum21(int n3, int n4, double d2) {
        this.varbit = n3;
        this.itemID = n4;
        this.weight = d2;
    }

    public static A valueOf(String string) {
        return Enum.valueOf(GameEnum21.class, string);
    }

    private static void llIlIIIIlIlIll() {
        lIIlllIIllIl = new String[lIIlllIlIIIl[51]];
        A.lIIlllIIllIl[A.lIIlllIlIIIl[0]] = "COAL";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[3]] = "COPPER_ORE";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[6]] = "TIN_ORE";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[9]] = "IRON_ORE";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[12]] = "MITHRIL_ORE";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[15]] = "ADAMANTITE_ORE";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[18]] = "RUNITE_ORE";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[21]] = "SILVER_ORE";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[24]] = "GOLD_ORE";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[27]] = "BRONZE_BAR";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[30]] = "IRON_BAR";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[33]] = "STEEL_BAR";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[36]] = "MITHRIL_BAR";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[39]] = "ADAMANTITE_BAR";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[42]] = "RUNITE_BAR";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[45]] = "SILVER_BAR";
        A.lIIlllIIllIl[A.lIIlllIlIIIl[48]] = "GOLD_BAR";
    }

}

