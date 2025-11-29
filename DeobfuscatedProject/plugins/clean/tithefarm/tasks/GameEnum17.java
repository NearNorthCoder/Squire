/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 */
package gg.squire.tithefarm.tasks;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum17
extends Enum<f> {
    public static final  /* enum */ f GOLOVANOVA;
    public static final  /* enum */ f LOGAVANO;
    
    private static final  f[] $VALUES;
    public static final  /* enum */ f EMPTY;
    public static final  /* enum */ f BOLOGANO;
    private static final  Map<Integer, f> plantTypes;
    private final  String name;
    private final  int baseId;
    private final  int[] objectIds;

        return String.valueOf(var1);
    }

    private static void lIllIllIIllllII() {
        lIlIIIIIIIIlI = new String[lIlIIIIIIIlII[19]];
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[0]] = "EMPTY";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[1]] = "Empty";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[3]] = "GOLOVANOVA";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[4]] = "Golovanova";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[11]] = "BOLOGANO";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[13]] = "Bologano";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[15]] = "LOGAVANO";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[17]] = "Logavano";
    }

    public String j() {
        return this.name;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum17.class, string);
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static boolean lIllIllIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    public int[] l() {
        return this.objectIds;
    }

    private GameEnum17(String string2, int n3, int ... nArray) {
        this.name = string2;
        this.baseId = n3;
        this.objectIds = nArray;
    }

    public static f d(int n2) {
        return plantTypes.get(n2);
    }

    public int k() {
        return this.baseId;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block2: {
            void var2;
            f.lIllIllIIlllllI();
            f.lIllIllIIllllII();
            int[] nArray = new int[lIlIIIIIIIlII[1]];
            nArray[f.lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[2];
            EMPTY = new GameEnum17(lIlIIIIIIIIlI[lIlIIIIIIIlII[1]], lIlIIIIIIIlII[2], nArray);
            int[] nArray2 = new int[lIlIIIIIIIlII[6]];
            nArray2[f.lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[7];
            nArray2[f.lIlIIIIIIIlII[1]] = lIlIIIIIIIlII[8];
            nArray2[f.lIlIIIIIIIlII[3]] = lIlIIIIIIIlII[9];
            nArray2[f.lIlIIIIIIIlII[4]] = lIlIIIIIIIlII[10];
            nArray2[f.lIlIIIIIIIlII[11]] = lIlIIIIIIIlII[12];
            nArray2[f.lIlIIIIIIIlII[13]] = lIlIIIIIIIlII[14];
            nArray2[f.lIlIIIIIIIlII[15]] = lIlIIIIIIIlII[16];
            nArray2[f.lIlIIIIIIIlII[17]] = lIlIIIIIIIlII[18];
            nArray2[f.lIlIIIIIIIlII[19]] = lIlIIIIIIIlII[20];
            nArray2[f.lIlIIIIIIIlII[21]] = lIlIIIIIIIlII[5];
            nArray2[f.lIlIIIIIIIlII[22]] = lIlIIIIIIIlII[23];
            GOLOVANOVA = new GameEnum17(lIlIIIIIIIIlI[lIlIIIIIIIlII[4]], lIlIIIIIIIlII[5], nArray2);
            int[] nArray3 = new int[lIlIIIIIIIlII[6]];
            nArray3[f.lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[25];
            nArray3[f.lIlIIIIIIIlII[1]] = lIlIIIIIIIlII[26];
            nArray3[f.lIlIIIIIIIlII[3]] = lIlIIIIIIIlII[27];
            nArray3[f.lIlIIIIIIIlII[4]] = lIlIIIIIIIlII[28];
            nArray3[f.lIlIIIIIIIlII[11]] = lIlIIIIIIIlII[29];
            nArray3[f.lIlIIIIIIIlII[13]] = lIlIIIIIIIlII[30];
            nArray3[f.lIlIIIIIIIlII[15]] = lIlIIIIIIIlII[31];
            nArray3[f.lIlIIIIIIIlII[17]] = lIlIIIIIIIlII[32];
            nArray3[f.lIlIIIIIIIlII[19]] = lIlIIIIIIIlII[33];
            nArray3[f.lIlIIIIIIIlII[21]] = lIlIIIIIIIlII[24];
            nArray3[f.lIlIIIIIIIlII[22]] = lIlIIIIIIIlII[34];
            BOLOGANO = new GameEnum17(lIlIIIIIIIIlI[lIlIIIIIIIlII[13]], lIlIIIIIIIlII[24], nArray3);
            int[] nArray4 = new int[lIlIIIIIIIlII[6]];
            nArray4[f.lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[36];
            nArray4[f.lIlIIIIIIIlII[1]] = lIlIIIIIIIlII[37];
            nArray4[f.lIlIIIIIIIlII[3]] = lIlIIIIIIIlII[38];
            nArray4[f.lIlIIIIIIIlII[4]] = lIlIIIIIIIlII[39];
            nArray4[f.lIlIIIIIIIlII[11]] = lIlIIIIIIIlII[40];
            nArray4[f.lIlIIIIIIIlII[13]] = lIlIIIIIIIlII[41];
            nArray4[f.lIlIIIIIIIlII[15]] = lIlIIIIIIIlII[42];
            nArray4[f.lIlIIIIIIIlII[17]] = lIlIIIIIIIlII[43];
            nArray4[f.lIlIIIIIIIlII[19]] = lIlIIIIIIIlII[44];
            nArray4[f.lIlIIIIIIIlII[21]] = lIlIIIIIIIlII[35];
            nArray4[f.lIlIIIIIIIlII[22]] = lIlIIIIIIIlII[45];
            LOGAVANO = new GameEnum17(lIlIIIIIIIIlI[lIlIIIIIIIlII[17]], lIlIIIIIIIlII[35], nArray4);
            f[] fArray = new f[lIlIIIIIIIlII[11]];
            fArray[f.lIlIIIIIIIlII[0]] = EMPTY;
            fArray[f.lIlIIIIIIIlII[1]] = GOLOVANOVA;
            fArray[f.lIlIIIIIIIlII[3]] = BOLOGANO;
            fArray[f.lIlIIIIIIIlII[4]] = LOGAVANO;
            $VALUES = fArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            f[] fArray2 = f.values();
            int n2 = fArray2.length;
            int var3 = lIlIIIIIIIlII[0];
            while (f.lIllIllIIllllll(var3, (int)var2)) {
                void var4;
                void var5 = var4[var3];
                int[] var6 = var5.l();
                int var7 = var6.length;
                int var8 = lIlIIIIIIIlII[0];
                while (f.lIllIllIIllllll(var8, var7)) {
                    void var9;
                    int var10 = var6[var8];
                    var9.put((Object)var10, (Object)var5);

                    ++var8;

                    if (3 >= 0) continue;
                    break block2;
                }
                ++var3;

                if (2 >= 2) continue;
                break block2;
            }
            plantTypes = builder.build();
        }
    }
}

