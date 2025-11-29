/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class ax
extends Enum<ax>
implements aw {
    private final /* synthetic */ av produceSeed;
    private static final /* synthetic */ ax[] $VALUES;
    public static final /* synthetic */ /* enum */ ax GIANT_SEAWEED;
    public static final /* synthetic */ /* enum */ ax NOTHING;
    private static /* synthetic */ String[] lIllllIlllII;
    private static /* synthetic */ int[] lIllllIlllIl;

    private static String lllIlllIllIlIl(String lllllllllllllllIlIllIIIlllIlllII, String lllllllllllllllIlIllIIIlllIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIllllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIIllllIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIIllllIIIII.init(lIllllIlllIl[2], lllllllllllllllIlIllIIIllllIIIIl);
            return new String(lllllllllllllllIlIllIIIllllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIIlllIlllll) {
            lllllllllllllllIlIllIIIlllIlllll.printStackTrace();
            return null;
        }
    }

    private ax(av av2) {
        this.produceSeed = av2;
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

    static {
        ax.lllIlllIllIlll();
        ax.lllIlllIllIllI();
        NOTHING = new ax(null);
        GIANT_SEAWEED = new ax(av.SEAWEED);
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
        ax.lIllllIlllII[ax.lIllllIlllIl[0]] = ax.lllIlllIllIlIl("7KHFsgWw+cA=", "gNiCr");
        ax.lIllllIlllII[ax.lIllllIlllIl[1]] = ax.lllIlllIllIlIl("De+ssfE4XezHXGTTrUf86w==", "zbVzV");
    }

    public static ax valueOf(String string) {
        return Enum.valueOf(ax.class, string);
    }

    private static void lllIlllIllIlll() {
        lIllllIlllIl = new int[3];
        ax.lIllllIlllIl[0] = (0x68 ^ 0x75) & ~(0x36 ^ 0x2B);
        ax.lIllllIlllIl[1] = " ".length();
        ax.lIllllIlllIl[2] = "  ".length();
    }
}

