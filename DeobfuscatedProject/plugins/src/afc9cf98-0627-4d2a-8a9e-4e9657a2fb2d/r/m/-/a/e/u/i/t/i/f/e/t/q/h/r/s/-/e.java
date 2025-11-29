/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.plugins.tithefarm.TitheFarmPlantType
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.tithefarm.TitheFarmPlantType;

public final class e
extends Enum<e> {
    private static /* synthetic */ String[] lIIlllllIlIll;
    private static /* synthetic */ int[] lIIlllllIllIl;
    public static final /* synthetic */ /* enum */ e WATERED;
    public static final /* synthetic */ /* enum */ e UNWATERED;
    public static final /* synthetic */ /* enum */ e DEAD;
    public static final /* synthetic */ /* enum */ e GROWN;
    private static final /* synthetic */ e[] $VALUES;

    private static boolean lIllIlIlllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIllIlIllllIllI();
        e.lIllIlIllllIIlI();
        UNWATERED = new e();
        WATERED = new e();
        DEAD = new e();
        GROWN = new e();
        e[] eArray = new e[lIIlllllIllIl[4]];
        eArray[e.lIIlllllIllIl[1]] = UNWATERED;
        eArray[e.lIIlllllIllIl[2]] = WATERED;
        eArray[e.lIIlllllIllIl[3]] = DEAD;
        eArray[e.lIIlllllIllIl[0]] = GROWN;
        $VALUES = eArray;
    }

    private static String lIllIlIllllIIIl(String llllllllllllllIlllIIllIIIlIlIIlI, String llllllllllllllIlllIIllIIIlIlIIIl) {
        llllllllllllllIlllIIllIIIlIlIIlI = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIIIlIlIlIl = new StringBuilder();
        char[] llllllllllllllIlllIIllIIIlIlIlII = llllllllllllllIlllIIllIIIlIlIIIl.toCharArray();
        int llllllllllllllIlllIIllIIIlIlIIll = lIIlllllIllIl[1];
        char[] llllllllllllllIlllIIllIIIlIIllIl = llllllllllllllIlllIIllIIIlIlIIlI.toCharArray();
        int llllllllllllllIlllIIllIIIlIIllII = llllllllllllllIlllIIllIIIlIIllIl.length;
        int llllllllllllllIlllIIllIIIlIIlIll = lIIlllllIllIl[1];
        while (e.lIllIlIlllllIIl(llllllllllllllIlllIIllIIIlIIlIll, llllllllllllllIlllIIllIIIlIIllII)) {
            char llllllllllllllIlllIIllIIIlIllIII = llllllllllllllIlllIIllIIIlIIllIl[llllllllllllllIlllIIllIIIlIIlIll];
            llllllllllllllIlllIIllIIIlIlIlIl.append((char)(llllllllllllllIlllIIllIIIlIllIII ^ llllllllllllllIlllIIllIIIlIlIlII[llllllllllllllIlllIIllIIIlIlIIll % llllllllllllllIlllIIllIIIlIlIlII.length]));
            "".length();
            ++llllllllllllllIlllIIllIIIlIlIIll;
            ++llllllllllllllIlllIIllIIIlIIlIll;
            "".length();
            if (" ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIllIIIlIlIlIl);
    }

    private static void lIllIlIllllIllI() {
        lIIlllllIllIl = new int[6];
        e.lIIlllllIllIl[0] = "   ".length();
        e.lIIlllllIllIl[1] = (0x72 ^ 0x11) & ~(0x5C ^ 0x3F);
        e.lIIlllllIllIl[2] = " ".length();
        e.lIIlllllIllIl[3] = "  ".length();
        e.lIIlllllIllIl[4] = 0x75 ^ 0x71;
        e.lIIlllllIllIl[5] = 0x4B ^ 0x43;
    }

    private static String lIllIlIllllIIII(String llllllllllllllIlllIIllIIIllIIlll, String llllllllllllllIlllIIllIIIllIIllI) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIIllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIllIIIllIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIllIIIllIlIIl.init(lIIlllllIllIl[3], llllllllllllllIlllIIllIIIllIlIlI);
            return new String(llllllllllllllIlllIIllIIIllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIIIllIlIII) {
            llllllllllllllIlllIIllIIIllIlIII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static e c(int n2) {
        int llllllllllllllIlllIIllIIIllllllI;
        void llllllllllllllIlllIIllIIIlllllIl;
        TitheFarmPlantType titheFarmPlantType = TitheFarmPlantType.getPlantType((int)n2);
        if (e.lIllIlIllllIlll(titheFarmPlantType)) {
            return null;
        }
        int llllllllllllllIlllIIllIIIlllllII = llllllllllllllIlllIIllIIIlllllIl.getBaseId();
        if (e.lIllIlIlllllIII(llllllllllllllIlllIIllIIIllllllI, llllllllllllllIlllIIllIIIlllllII)) {
            return GROWN;
        }
        switch ((llllllllllllllIlllIIllIIIlllllII - llllllllllllllIlllIIllIIIllllllI) % lIIlllllIllIl[0]) {
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
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static boolean lIllIlIlllllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIlIlllIllll(String llllllllllllllIlllIIllIIIlllIIlI, String llllllllllllllIlllIIllIIIlllIIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIIlllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIlllIIll.getBytes(StandardCharsets.UTF_8)), lIIlllllIllIl[5]), "DES");
            Cipher llllllllllllllIlllIIllIIIlllIllI = Cipher.getInstance("DES");
            llllllllllllllIlllIIllIIIlllIllI.init(lIIlllllIllIl[3], llllllllllllllIlllIIllIIIlllIlll);
            return new String(llllllllllllllIlllIIllIIIlllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIIIlllIlIl) {
            llllllllllllllIlllIIllIIIlllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIllllIIlI() {
        lIIlllllIlIll = new String[lIIlllllIllIl[4]];
        e.lIIlllllIlIll[e.lIIlllllIllIl[1]] = e.lIllIlIlllIllll("55eep01T3fvw8iy9b7Uj6Q==", "yiqXs");
        e.lIIlllllIlIll[e.lIIlllllIllIl[2]] = e.lIllIlIllllIIII("ptMNkNqDJgk=", "JRfyR");
        e.lIIlllllIlIll[e.lIIlllllIllIl[3]] = e.lIllIlIllllIIIl("HgMDBQ==", "ZFBAw");
        e.lIIlllllIlIll[e.lIIlllllIllIl[0]] = e.lIllIlIllllIIIl("CxAOPjQ=", "LBAiz");
    }
}

