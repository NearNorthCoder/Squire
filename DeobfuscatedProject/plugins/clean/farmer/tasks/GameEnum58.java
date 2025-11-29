/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum1;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum58
extends Enum<ax>
implements aw {
    private final  av produceSeed;
    private static final  ax[] $VALUES;
    public static final  /* enum */ ax GIANT_SEAWEED;
    public static final  /* enum */ ax NOTHING;

    private GameEnum58(av av2) {
        this.produceSeed = av2;
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

    static {
        ax.lllIlllIllIlll();
        ax.lllIlllIllIllI();
        NOTHING = new GameEnum58(null);
        GIANT_SEAWEED = new GameEnum58(av.SEAWEED);
        ax[] axArray = new ax[lIllllIlllIl[2]];
        axArray[ax.lIllllIlllIl[0]] = NOTHING;
        axArray[ax.lIllllIlllIl[1]] = GIANT_SEAWEED;
        $VALUES = axArray;
    }

    public static ax[] values() {
        return (ax[])$VALUES.clone();
    }

    private static void lllIlllIllIllI() {
        lIllllIlllII = new String[lIllllIlllIl[2]];
        ax.lIllllIlllII[ax.lIllllIlllIl[0]] = "NOTHING";
        ax.lIllllIlllII[ax.lIllllIlllIl[1]] = "GIANT_SEAWEED";
    }

    public static ax valueOf(String string) {
        return Enum.valueOf(GameEnum58.class, string);
    }

}

