/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.plugins.tithefarm.TitheFarmPlantType
 */
package gg.squire.tithefarm.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.tithefarm.TitheFarmPlantType;

public final class GameEnum12
extends Enum<e> {

    public static final  /* enum */ e WATERED;
    public static final  /* enum */ e UNWATERED;
    public static final  /* enum */ e DEAD;
    public static final  /* enum */ e GROWN;
    private static final  e[] $VALUES;

    private static boolean lIllIlIlllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIllIlIllllIllI();
        e.lIllIlIllllIIlI();
        UNWATERED = new GameEnum12();
        WATERED = new GameEnum12();
        DEAD = new GameEnum12();
        GROWN = new GameEnum12();
        e[] eArray = new e[lIIlllllIllIl[4]];
        eArray[e.lIIlllllIllIl[1]] = UNWATERED;
        eArray[e.lIIlllllIllIl[2]] = WATERED;
        eArray[e.lIIlllllIllIl[3]] = DEAD;
        eArray[e.lIIlllllIllIl[0]] = GROWN;
        $VALUES = eArray;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public static e c(int n2) {
        int var2;
        void var3;
        TitheFarmPlantType titheFarmPlantType = TitheFarmPlantType.getPlantType((int)n2);
        if (e.lIllIlIllllIlll(titheFarmPlantType)) {
            return null;
        }
        int var4 = var3.getBaseId();
        if (e.lIllIlIlllllIII(var2, var4)) {
            return GROWN;
        }
        switch ((var4 - var2) % lIIlllllIllIl[0]) {
            case 0: {
                return UNWATERED;
            }
            case 2: {
                return WATERED;
            }
        }
        return DEAD;
    }

    private static boolean lIllIlIllllIlll(Object object) {
        return object == null;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static boolean lIllIlIlllllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIlIllllIIlI() {
        lIIlllllIlIll = new String[lIIlllllIllIl[4]];
        e.lIIlllllIlIll[e.lIIlllllIllIl[1]] = "UNWATERED";
        e.lIIlllllIlIll[e.lIIlllllIllIl[2]] = "WATERED";
        e.lIIlllllIlIll[e.lIIlllllIllIl[3]] = "DEAD";
        e.lIIlllllIlIll[e.lIIlllllIllIl[0]] = "GROWN";
    }
}

