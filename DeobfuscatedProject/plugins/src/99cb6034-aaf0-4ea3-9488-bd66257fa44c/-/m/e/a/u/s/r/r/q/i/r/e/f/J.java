/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.H;
import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class J
extends Enum<J> {
    private final /* synthetic */ av produceSeed;
    public static final /* synthetic */ /* enum */ J STRAWBERRIES;
    public static final /* synthetic */ /* enum */ J ONIONS;
    private static final /* synthetic */ J[] $VALUES;
    public static final /* synthetic */ /* enum */ J WATERMELON;
    private static /* synthetic */ int[] llIIIIlIIIlI;
    private final /* synthetic */ H type;
    private static /* synthetic */ String[] llIIIIlIIIIl;

    private static String llllIIlIIIIlll(String lllllllllllllllIlIlIllIIIlllIlIl, String lllllllllllllllIlIlIllIIIlllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllIIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIllIIIlllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIllIIIlllIlll.init(llIIIIlIIIlI[2], lllllllllllllllIlIlIllIIIllllIII);
            return new String(lllllllllllllllIlIlIllIIIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIllIIIlllIllI) {
            lllllllllllllllIlIlIllIIIlllIllI.printStackTrace();
            return null;
        }
    }

    public static J[] values() {
        return (J[])$VALUES.clone();
    }

    private J(H h2, av av2) {
        this.type = h2;
        this.produceSeed = av2;
    }

    public H aE() {
        return this.type;
    }

    private static void llllIIlIIIlIII() {
        llIIIIlIIIIl = new String[llIIIIlIIIlI[3]];
        J.llIIIIlIIIIl[J.llIIIIlIIIlI[0]] = J.llllIIlIIIIlll("tV1+PtRWkomdt6HxqrFSCQ==", "JLELm");
        J.llIIIIlIIIIl[J.llIIIIlIIIlI[1]] = J.llllIIlIIIIlll("mk4QHezWY2M=", "XMPSN");
        J.llIIIIlIIIIl[J.llIIIIlIIIlI[2]] = J.llllIIlIIIIlll("PattkUD8czRwLX4NqICc3w==", "EiNXF");
    }

    private static void llllIIlIIIlIIl() {
        llIIIIlIIIlI = new int[4];
        J.llIIIIlIIIlI[0] = (0xDC ^ 0xA0 ^ (0x31 ^ 0x6E)) & (0x61 ^ 0x77 ^ (0x34 ^ 1) ^ -" ".length());
        J.llIIIIlIIIlI[1] = " ".length();
        J.llIIIIlIIIlI[2] = "  ".length();
        J.llIIIIlIIIlI[3] = "   ".length();
    }

    public av aD() {
        return this.produceSeed;
    }

    public static J valueOf(String string) {
        return Enum.valueOf(J.class, string);
    }

    static {
        J.llllIIlIIIlIIl();
        J.llllIIlIIIlIII();
        WATERMELON = new J(H.SUPERCOMPOST, av.WATERMELON);
        ONIONS = new J(H.COMPOST, av.ONIONS);
        STRAWBERRIES = new J(H.COMPOST, av.STRAWEBERRIES);
        J[] jArray = new J[llIIIIlIIIlI[3]];
        jArray[J.llIIIIlIIIlI[0]] = WATERMELON;
        jArray[J.llIIIIlIIIlI[1]] = ONIONS;
        jArray[J.llIIIIlIIIlI[2]] = STRAWBERRIES;
        $VALUES = jArray;
    }
}

