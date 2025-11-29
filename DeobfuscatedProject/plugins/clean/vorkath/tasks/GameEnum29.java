/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vorkath.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum29
extends Enum<l> {
    public static final  /* enum */ l ANTI_VENOM;
    
    private final  String name;
    public static final  /* enum */ l ANTI_VENOM_PLUS;
    
    public static final  /* enum */ l CURE_SELF;
    private final  List<Integer> items;
    public static final  /* enum */ l IGNORE;
    public static final  /* enum */ l ANTI_DOTE;
    private static final  l[] $VALUES;
    public static final  /* enum */ l ANTI_POISON;

    static {
        l.lIlllllllllIlII();
        l.lIlllllllllIIll();
        int[] nArray = new int[lIlIlIllllIIl[3]];
        nArray[l.lIlIlIllllIIl[0]] = lIlIlIllllIIl[4];
        nArray[l.lIlIlIllllIIl[1]] = lIlIlIllllIIl[5];
        nArray[l.lIlIlIllllIIl[2]] = lIlIlIllllIIl[6];
        nArray[l.lIlIlIllllIIl[7]] = lIlIlIllllIIl[8];
        ANTI_VENOM_PLUS = new GameEnum29(lIlIlIllllIII[lIlIlIllllIIl[2]], nArray);
        int[] nArray2 = new int[lIlIlIllllIIl[3]];
        nArray2[l.lIlIlIllllIIl[0]] = lIlIlIllllIIl[9];
        nArray2[l.lIlIlIllllIIl[1]] = lIlIlIllllIIl[10];
        nArray2[l.lIlIlIllllIIl[2]] = lIlIlIllllIIl[11];
        nArray2[l.lIlIlIllllIIl[7]] = lIlIlIllllIIl[12];
        ANTI_VENOM = new GameEnum29(lIlIlIllllIII[lIlIlIllllIIl[3]], nArray2);
        int[] nArray3 = new int[lIlIlIllllIIl[2]];
        nArray3[l.lIlIlIllllIIl[0]] = lIlIlIllllIIl[15];
        nArray3[l.lIlIlIllllIIl[1]] = lIlIlIllllIIl[16];
        ANTI_DOTE = new GameEnum29(lIlIlIllllIII[lIlIlIllllIIl[14]], nArray3);
        int[] nArray4 = new int[lIlIlIllllIIl[2]];
        nArray4[l.lIlIlIllllIIl[0]] = lIlIlIllllIIl[19];
        nArray4[l.lIlIlIllllIIl[1]] = lIlIlIllllIIl[20];
        ANTI_POISON = new GameEnum29(lIlIlIllllIII[lIlIlIllllIIl[18]], nArray4);
        int[] nArray5 = new int[lIlIlIllllIIl[2]];
        nArray5[l.lIlIlIllllIIl[0]] = lIlIlIllllIIl[22];
        nArray5[l.lIlIlIllllIIl[1]] = lIlIlIllllIIl[23];
        CURE_SELF = new GameEnum29(nArray5);
        IGNORE = new GameEnum29(new int[lIlIlIllllIIl[0]]);
        l[] lArray = new l[lIlIlIllllIIl[14]];
        lArray[l.lIlIlIllllIIl[0]] = ANTI_VENOM_PLUS;
        lArray[l.lIlIlIllllIIl[1]] = ANTI_VENOM;
        lArray[l.lIlIlIllllIIl[2]] = ANTI_DOTE;
        lArray[l.lIlIlIllllIIl[7]] = ANTI_POISON;
        lArray[l.lIlIlIllllIIl[3]] = CURE_SELF;
        lArray[l.lIlIlIllllIIl[13]] = IGNORE;
        $VALUES = lArray;
    }

    public String M() {
        return this.name;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlllllllllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllllllllIIll() {
        lIlIlIllllIII = new String[lIlIlIllllIIl[25]];
        l.lIlIlIllllIII[l.lIlIlIllllIIl[0]] = l.lIlllllllllIIII("", "szBRv");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[1]] = "ANTI_VENOM_PLUS";
        l.lIlIlIllllIII[l.lIlIlIllllIIl[2]] = "Anti-venom";
        l.lIlIlIllllIII[l.lIlIlIllllIIl[7]] = "ANTI_VENOM";
        l.lIlIlIllllIII[l.lIlIlIllllIIl[3]] = "Anti-venom";
        l.lIlIlIllllIII[l.lIlIlIllllIIl[13]] = "ANTI_DOTE";
        l.lIlIlIllllIII[l.lIlIlIllllIIl[14]] = "Antidote";
        l.lIlIlIllllIII[l.lIlIlIllllIIl[17]] = "ANTI_POISON";
        l.lIlIlIllllIII[l.lIlIlIllllIIl[18]] = "Antipoison";
        l.lIlIlIllllIII[l.lIlIlIllllIIl[21]] = "CURE_SELF";
        l.lIlIlIllllIII[l.lIlIlIllllIIl[24]] = "IGNORE";
    }

    public List<Integer> P() {
        return this.items;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private GameEnum29(int ... nArray) {
        this(lIlIlIllllIII[lIlIlIllllIIl[0]], nArray);
    }

    /*
     * WARNING - void declaration
     */
    private GameEnum29(String string2, int ... nArray) {
        void var2;
        this.name = string2;
        this.items = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var3 = lIlIlIllllIIl[0];
        while (l.lIlllllllllIlIl(var3, (int)var2)) {
            l var4;
            void var5;
            void var6 = var5[var3];
            var4.items.add((int)var6);

            ++var3;

            if ((0x36 ^ 0x32) > 0) continue;
            throw null;
        }
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum29.class, string);
    }
}

