/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum33
extends Enum<x> {
     String name;
    
    public static final  /* enum */ x NONE;
    private static final  x[] $VALUES;
    
    public static final  /* enum */ x STRANGE_LOCKPICK;
    public static final  /* enum */ x LOCKPICK;

    public static x valueOf(String string) {
        return Enum.valueOf(GameEnum33.class, string);
    }

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

    private static boolean lIIIlIIIllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIllIIlll() {
        lllIIIIlllIl = new String[lllIIIIllllI[6]];
        x.lllIIIIlllIl[x.lllIIIIllllI[0]] = "NONE";
        x.lllIIIIlllIl[x.lllIIIIllllI[1]] = x.lIIIlIIIllIIllI("", "RiCxr");
        x.lllIIIIlllIl[x.lllIIIIllllI[2]] = "LOCKPICK";
        x.lllIIIIlllIl[x.lllIIIIllllI[3]] = x.lIIIlIIIllIIlIl("/i19lAulv3E=", "OcVXu");
        x.lllIIIIlllIl[x.lllIIIIllllI[4]] = "STRANGE_LOCKPICK";
        x.lllIIIIlllIl[x.lllIIIIllllI[5]] = x.lIIIlIIIllIIlIl("sdEJxsCepRI=", "WePUJ");
    }

        return String.valueOf(var1);
    }

    static {
        x.lIIIlIIIllIlIII();
        x.lIIIlIIIllIIlll();
        NONE = new GameEnum33(lllIIIIlllIl[lllIIIIllllI[1]]);
        LOCKPICK = new GameEnum33(lllIIIIlllIl[lllIIIIllllI[3]]);
        STRANGE_LOCKPICK = new GameEnum33(lllIIIIlllIl[lllIIIIllllI[5]]);
        x[] xArray = new x[lllIIIIllllI[3]];
        xArray[x.lllIIIIllllI[0]] = NONE;
        xArray[x.lllIIIIllllI[1]] = LOCKPICK;
        xArray[x.lllIIIIllllI[2]] = STRANGE_LOCKPICK;
        $VALUES = xArray;
    }

    private GameEnum33(String string2) {
        this.name = string2;
    }
}

