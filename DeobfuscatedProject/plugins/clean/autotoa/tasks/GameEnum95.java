/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum95
extends Enum<e> {
    public static final  /* enum */ e NECTAR;
    
    private final  List<Integer> ids;
    public static final  /* enum */ e SILK_DRESSING;
    
    public static final  /* enum */ e BLESSED_CRYSTAL_SCARAB;
    public static final  /* enum */ e TEARS_OF_ELIDINIS;
    public static final  /* enum */ e SMELLING_SALTS;
    public static final  /* enum */ e LIQUID_ADRENALINE;
    private static final  e[] $VALUES;
    public static final  /* enum */ e AMBROSIA;

    /*
     * WARNING - void declaration
     */
    public static e c(int n2) {
        void var1;
        e[] eArray = e.values();
        int n3 = eArray.length;
        int var2 = llIIlllllII[0];
        while (e.lIlIIlIIIIllIl(var2, (int)var1)) {
            int var3;
            void var4;
            void var5 = var4[var2];
            if (e.lIlIIlIIIIlllI(var5.p().contains(var3) ? 1 : 0)) {
                return var5;
            }
            ++var2;

            return null;
        }
        return null;
    }

    private static boolean lIlIIlIIIIlllI(int n2) {
        return n2 != 0;
    }

    private GameEnum95(List<Integer> list) {
        this.ids = list;
    }

    public boolean d(int n2) {
        return this.ids.contains(n2);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    static {
        e.lIlIIIllllIlII();
        e.lIlIIIllllIIll();
        TEARS_OF_ELIDINIS = new GameEnum95(List.of(Integer.valueOf(llIIlllllII[1]), Integer.valueOf(llIIlllllII[2]), Integer.valueOf(llIIlllllII[3]), Integer.valueOf(llIIlllllII[4])));
        NECTAR = new GameEnum95(List.of(Integer.valueOf(llIIlllllII[6]), Integer.valueOf(llIIlllllII[7]), Integer.valueOf(llIIlllllII[8]), Integer.valueOf(llIIlllllII[9])));
        SMELLING_SALTS = new GameEnum95(List.of(Integer.valueOf(llIIlllllII[11]), Integer.valueOf(llIIlllllII[12])));
        LIQUID_ADRENALINE = new GameEnum95(List.of(Integer.valueOf(llIIlllllII[14]), Integer.valueOf(llIIlllllII[15])));
        AMBROSIA = new GameEnum95(List.of(Integer.valueOf(llIIlllllII[17]), Integer.valueOf(llIIlllllII[18])));
        BLESSED_CRYSTAL_SCARAB = new GameEnum95(List.of(Integer.valueOf(llIIlllllII[20]), Integer.valueOf(llIIlllllII[21])));
        SILK_DRESSING = new GameEnum95(List.of(Integer.valueOf(llIIlllllII[23]), Integer.valueOf(llIIlllllII[24])));
        e[] eArray = new e[llIIlllllII[25]];
        eArray[e.llIIlllllII[0]] = TEARS_OF_ELIDINIS;
        eArray[e.llIIlllllII[5]] = NECTAR;
        eArray[e.llIIlllllII[10]] = SMELLING_SALTS;
        eArray[e.llIIlllllII[13]] = LIQUID_ADRENALINE;
        eArray[e.llIIlllllII[16]] = AMBROSIA;
        eArray[e.llIIlllllII[19]] = BLESSED_CRYSTAL_SCARAB;
        eArray[e.llIIlllllII[22]] = SILK_DRESSING;
        $VALUES = eArray;
    }

    private static boolean lIlIIlIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var6);
    }

    private static void lIlIIIllllIIll() {
        llIIllllIll = new String[llIIlllllII[25]];
        e.llIIllllIll[e.llIIlllllII[0]] = "TEARS_OF_ELIDINIS";
        e.llIIllllIll[e.llIIlllllII[5]] = "NECTAR";
        e.llIIllllIll[e.llIIlllllII[10]] = "SMELLING_SALTS";
        e.llIIllllIll[e.llIIlllllII[13]] = "LIQUID_ADRENALINE";
        e.llIIllllIll[e.llIIlllllII[16]] = "AMBROSIA";
        e.llIIllllIll[e.llIIlllllII[19]] = "BLESSED_CRYSTAL_SCARAB";
        e.llIIllllIll[e.llIIlllllII[22]] = "SILK_DRESSING";
    }

    public List<Integer> p() {
        return this.ids;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum95.class, string);
    }
}

