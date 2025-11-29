/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum19;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum5
extends Enum<O> {
    public static final  /* enum */ O HERB;
    
    public static final  /* enum */ O BUSH;
    private final  int animation;
    
    public static final  /* enum */ O FLOWER;
    private final  P allotment;
    private static final  O[] $VALUES;
    public static final  /* enum */ O ALLOTMENT;

    public int aP() {
        return this.animation;
    }

    private static void lllIllllIlIIlI() {
        lIlllllIIIIl = new String[lIlllllIIlIl[8]];
        O.lIlllllIIIIl[O.lIlllllIIlIl[0]] = "ALLOTMENT";
        O.lIlllllIIIIl[O.lIlllllIIlIl[2]] = "BUSH";
        O.lIlllllIIIIl[O.lIlllllIIlIl[4]] = "HERB";
        O.lIlllllIIIIl[O.lIlllllIIlIl[6]] = "FLOWER";
    }

        return String.valueOf(var1);
    }

    static {
        O.lllIllllIlIlIl();
        O.lllIllllIlIIlI();
        ALLOTMENT = new GameEnum5(lIlllllIIlIl[1], P.ALLOTMENT);
        BUSH = new GameEnum5(lIlllllIIlIl[3], P.BUSH);
        HERB = new GameEnum5(lIlllllIIlIl[5], P.HERB);
        FLOWER = new GameEnum5(lIlllllIIlIl[7], P.FLOWER);
        O[] oArray = new O[lIlllllIIlIl[8]];
        oArray[O.lIlllllIIlIl[0]] = ALLOTMENT;
        oArray[O.lIlllllIIlIl[2]] = BUSH;
        oArray[O.lIlllllIIlIl[4]] = HERB;
        oArray[O.lIlllllIIlIl[6]] = FLOWER;
        $VALUES = oArray;
    }

    private GameEnum5(int n3, P p2) {
        this.animation = n3;
        this.allotment = p2;
    }

    public static O[] values() {
        return (O[])$VALUES.clone();
    }

    private static boolean lllIllllIllIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public static O e(int n2) {
        void var2;
        O[] oArray = O.values();
        int n3 = oArray.length;
        int var3 = lIlllllIIlIl[0];
        while (O.lllIllllIlIllI(var3, (int)var2)) {
            int var4;
            void var5;
            void var6 = var5[var3];
            if (O.lllIllllIllIII(var6.aP(), var4)) {
                return var6;
            }
            ++var3;

            if (1 >= 0) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static O b(P p2) {
        void var7;
        O[] oArray = O.values();
        int n2 = oArray.length;
        int var8 = lIlllllIIlIl[0];
        while (O.lllIllllIlIllI(var8, (int)var7)) {
            P var9;
            void var10;
            void var11 = var10[var8];
            if (O.lllIllllIllIIl((Object)var11.aQ(), (Object)var9)) {
                return var11;
            }
            ++var8;

            return null;
        }
        return null;
    }

    public static O valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    public static O G(N n2) {
        return O.b(n2.aL());
    }

    public P aQ() {
        return this.allotment;
    }

    private static boolean lllIllllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIllllIllIII(int n2, int n3) {
        return n2 == n3;
    }

}

