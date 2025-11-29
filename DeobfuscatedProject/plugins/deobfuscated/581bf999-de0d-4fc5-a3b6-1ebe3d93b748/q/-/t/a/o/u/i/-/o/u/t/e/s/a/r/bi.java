/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class bi
extends Enum<bi> {
    private static final /* synthetic */ bi[] $VALUES;
    private static /* synthetic */ String[] llIIIIIllll;
    public static final /* synthetic */ /* enum */ bi SWARM;
    public static final /* synthetic */ /* enum */ bi ATTACK;
    public static final /* synthetic */ /* enum */ bi MAGE;
    private static /* synthetic */ int[] llIIIIlIlII;

    private static String lIIlllIlIIIIlI(String llllllllllllllllIlIIIllIlIIIIlII, String llllllllllllllllIlIIIllIlIIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIlIIIllIlIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllIlIIIIIll.getBytes(StandardCharsets.UTF_8)), llIIIIlIlII[4]), "DES");
            Cipher llllllllllllllllIlIIIllIlIIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIlIIIllIlIIIIllI.init(llIIIIlIlII[2], llllllllllllllllIlIIIllIlIIIIlll);
            return new String(llllllllllllllllIlIIIllIlIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIllIlIIIIlIl) {
            llllllllllllllllIlIIIllIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlllIlIIIIII(String llllllllllllllllIlIIIllIlIlIlIIl, String llllllllllllllllIlIIIllIlIlIIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIllIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIllIlIlIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIllIlIlIlIll.init(llIIIIlIlII[2], llllllllllllllllIlIIIllIlIlIllII);
            return new String(llllllllllllllllIlIIIllIlIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIllIlIlIlIlI) {
            llllllllllllllllIlIIIllIlIlIlIlI.printStackTrace();
            return null;
        }
    }

    public static bi[] values() {
        return (bi[])$VALUES.clone();
    }

    static {
        bi.lIIlllIlIlIIIl();
        bi.lIIlllIlIIIlIl();
        ATTACK = new bi();
        SWARM = new bi();
        MAGE = new bi();
        bi[] biArray = new bi[llIIIIlIlII[3]];
        biArray[bi.llIIIIlIlII[0]] = ATTACK;
        biArray[bi.llIIIIlIlII[1]] = SWARM;
        biArray[bi.llIIIIlIlII[2]] = MAGE;
        $VALUES = biArray;
    }

    private static String lIIlllIlIIIIIl(String llllllllllllllllIlIIIllIlIIlIlII, String llllllllllllllllIlIIIllIlIIllIII) {
        llllllllllllllllIlIIIllIlIIlIlII = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIllIlIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIllIlIIlIlll = new StringBuilder();
        char[] llllllllllllllllIlIIIllIlIIlIllI = llllllllllllllllIlIIIllIlIIllIII.toCharArray();
        int llllllllllllllllIlIIIllIlIIlIlIl = llIIIIlIlII[0];
        char[] llllllllllllllllIlIIIllIlIIIllll = llllllllllllllllIlIIIllIlIIlIlII.toCharArray();
        int llllllllllllllllIlIIIllIlIIIlllI = llllllllllllllllIlIIIllIlIIIllll.length;
        int llllllllllllllllIlIIIllIlIIIllIl = llIIIIlIlII[0];
        while (bi.lIIlllIlIlIIlI(llllllllllllllllIlIIIllIlIIIllIl, llllllllllllllllIlIIIllIlIIIlllI)) {
            char llllllllllllllllIlIIIllIlIIllIlI = llllllllllllllllIlIIIllIlIIIllll[llllllllllllllllIlIIIllIlIIIllIl];
            llllllllllllllllIlIIIllIlIIlIlll.append((char)(llllllllllllllllIlIIIllIlIIllIlI ^ llllllllllllllllIlIIIllIlIIlIllI[llllllllllllllllIlIIIllIlIIlIlIl % llllllllllllllllIlIIIllIlIIlIllI.length]));
            0;
            ++llllllllllllllllIlIIIllIlIIlIlIl;
            ++llllllllllllllllIlIIIllIlIIIllIl;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIllIlIIlIlll);
    }

    private static void lIIlllIlIIIlIl() {
        llIIIIIllll = new String[llIIIIlIlII[3]];
        bi.llIIIIIllll[bi.llIIIIlIlII[0]] = bi."ATTACK";
        bi.llIIIIIllll[bi.llIIIIlIlII[1]] = bi."SWARM";
        bi.llIIIIIllll[bi.llIIIIlIlII[2]] = bi."MAGE";
    }

    private static void lIIlllIlIlIIIl() {
        llIIIIlIlII = new int[5];
        bi.llIIIIlIlII[0] = (0x1A ^ 0x7A ^ (1 ^ 0x5E)) & (0x39 ^ 0x58 ^ (0xE2 ^ 0xBC) ^ -1);
        bi.llIIIIlIlII[1] = 1;
        bi.llIIIIlIlII[2] = 2;
        bi.llIIIIlIlII[3] = 3;
        bi.llIIIIlIlII[4] = 0x33 ^ 0x4E ^ (0xB5 ^ 0xC0);
    }

    public static bi valueOf(String string) {
        return Enum.valueOf(bi.class, string);
    }
}

