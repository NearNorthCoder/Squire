/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum16
extends Enum<o> {
    private static final  o[] $VALUES;
    public static final  /* enum */ o IGNORE;
    public static final  /* enum */ o ANTI_POISON;
    private final  List<Integer> items;
    public static final  /* enum */ o CURE_SELF;
    public static final  /* enum */ o ANTI_VENOM;

    public static final  /* enum */ o ANTI_DOTE;
    private final  String name;

    public String k() {
        return this.name;
    }

    static {
        o.llIIlIIlIIIIIll();
        o.llIIlIIIlllllIl();
        int[] nArray = new int[lIllIllIlIIII[3]];
        nArray[o.lIllIllIlIIII[0]] = lIllIllIlIIII[4];
        nArray[o.lIllIllIlIIII[1]] = lIllIllIlIIII[5];
        nArray[o.lIllIllIlIIII[2]] = lIllIllIlIIII[6];
        nArray[o.lIllIllIlIIII[7]] = lIllIllIlIIII[8];
        nArray[o.lIllIllIlIIII[9]] = lIllIllIlIIII[10];
        nArray[o.lIllIllIlIIII[11]] = lIllIllIlIIII[12];
        ANTI_VENOM = new GameEnum16(lIllIllIIlllI[lIllIllIlIIII[2]], nArray);
        int[] nArray2 = new int[lIllIllIlIIII[2]];
        nArray2[o.lIllIllIlIIII[0]] = lIllIllIlIIII[13];
        nArray2[o.lIllIllIlIIII[1]] = lIllIllIlIIII[14];
        ANTI_DOTE = new GameEnum16(lIllIllIIlllI[lIllIllIlIIII[9]], nArray2);
        int[] nArray3 = new int[lIllIllIlIIII[3]];
        nArray3[o.lIllIllIlIIII[0]] = lIllIllIlIIII[15];
        nArray3[o.lIllIllIlIIII[1]] = lIllIllIlIIII[16];
        nArray3[o.lIllIllIlIIII[2]] = lIllIllIlIIII[17];
        nArray3[o.lIllIllIlIIII[7]] = lIllIllIlIIII[18];
        nArray3[o.lIllIllIlIIII[9]] = lIllIllIlIIII[19];
        nArray3[o.lIllIllIlIIII[11]] = lIllIllIlIIII[20];
        ANTI_POISON = new GameEnum16(lIllIllIIlllI[lIllIllIlIIII[3]], nArray3);
        int[] nArray4 = new int[lIllIllIlIIII[2]];
        nArray4[o.lIllIllIlIIII[0]] = lIllIllIlIIII[22];
        nArray4[o.lIllIllIlIIII[1]] = lIllIllIlIIII[23];
        CURE_SELF = new GameEnum16(nArray4);
        IGNORE = new GameEnum16(new int[lIllIllIlIIII[0]]);
        o[] oArray = new o[lIllIllIlIIII[11]];
        oArray[o.lIllIllIlIIII[0]] = ANTI_VENOM;
        oArray[o.lIllIllIlIIII[1]] = ANTI_DOTE;
        oArray[o.lIllIllIlIIII[2]] = ANTI_POISON;
        oArray[o.lIllIllIlIIII[7]] = CURE_SELF;
        oArray[o.lIllIllIlIIII[9]] = IGNORE;
        $VALUES = oArray;
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    private GameEnum16(int ... nArray) {
        this(lIllIllIIlllI[lIllIllIlIIII[0]], nArray);
    }

    /*
     * WARNING - void declaration
     */
    private GameEnum16(String string2, int ... nArray) {
        void var1;
        this.name = string2;
        this.items = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var2 = lIllIllIlIIII[0];
        while (o.llIIlIIlIIIIlII(var2, (int)var1)) {
            o var3;
            void var4;
            void var5 = var4[var2];
            var3.items.add((int)var5);

            ++var2;

            throw null;
        }
    }

    private static boolean llIIlIIlIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIIlllllIl() {
        lIllIllIIlllI = new String[lIllIllIlIIII[25]];
        o.lIllIllIIlllI[o.lIllIllIlIIII[0]] = o.llIIlIIIllllIII("ycDyk0yEy9E=", "sdrKz");
        o.lIllIllIIlllI[o.lIllIllIlIIII[1]] = "ANTI_VENOM";
        o.lIllIllIIlllI[o.lIllIllIlIIII[2]] = "Anti-venom";
        o.lIllIllIIlllI[o.lIllIllIlIIII[7]] = "ANTI_DOTE";
        o.lIllIllIIlllI[o.lIllIllIlIIII[9]] = "Antidote";
        o.lIllIllIIlllI[o.lIllIllIlIIII[11]] = "ANTI_POISON";
        o.lIllIllIIlllI[o.lIllIllIlIIII[3]] = "Antipoison";
        o.lIllIllIIlllI[o.lIllIllIlIIII[21]] = "CURE_SELF";
        o.lIllIllIIlllI[o.lIllIllIlIIII[24]] = "IGNORE";
    }

    public List<Integer> I() {
        return this.items;
    }

        return String.valueOf(var6);
    }

}

