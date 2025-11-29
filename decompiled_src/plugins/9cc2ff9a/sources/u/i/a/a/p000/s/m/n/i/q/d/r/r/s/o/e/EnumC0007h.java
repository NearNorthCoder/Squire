package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/h.class */
public final class EnumC0007h {
    public static final /* synthetic */ EnumC0007h GROWLER;
    private final /* synthetic */ String enemyName;
    private final /* synthetic */ int attackAnimation;
    private static final /* synthetic */ EnumC0007h[] $VALUES;
    private static /* synthetic */ int[] lIIlIlIIIIIlI;
    public static final /* synthetic */ EnumC0007h THROWER_TROLL;
    public static final /* synthetic */ EnumC0007h STARLIGHT;
    private final /* synthetic */ Prayer prayer;
    public static final /* synthetic */ EnumC0007h BREE;
    private final /* synthetic */ int attackSpeed;
    private static /* synthetic */ String[] lIIlIlIIIIIIl;

    private static void lIlIlIlIllllIlI() {
        lIIlIlIIIIIlI = new int[13];
        lIIlIlIIIIIlI[0] = -(148 ^ 158);
        lIIlIlIIIIIlI[1] = ((((31 + 57) - (-1)) + 79) ^ (((94 + 47) - 64) + 74)) & (((((42 + 20) - (-5)) + 120) ^ (((74 + 52) - 6) + 12)) ^ (-" ".length()));
        lIIlIlIIIIIlI[2] = " ".length();
        lIIlIlIIIIIlI[3] = (-1029) & 8054;
        lIIlIlIIIIIlI[4] = (149 ^ 129) ^ (58 ^ 43);
        lIIlIlIIIIIlI[5] = "  ".length();
        lIIlIlIIIIIlI[6] = "   ".length();
        lIIlIlIIIIIlI[7] = (-((-6177) & 15523)) & (-1) & 16383;
        lIIlIlIIIIIlI[8] = 91 ^ 95;
        lIIlIlIIIIIlI[9] = (-24837) & 31212;
        lIIlIlIIIIIlI[10] = 189 ^ 187;
        lIIlIlIIIIIlI[11] = (146 ^ 129) ^ (25 ^ 13);
        lIIlIlIIIIIlI[12] = 44 ^ 36;
    }

    public static EnumC0007h valueOf(String str) {
        return (EnumC0007h) Enum.valueOf(EnumC0007h.class, str);
    }

    public String y() {
        return this.enemyName;
    }

    public int w() {
        return this.attackSpeed;
    }

    public static EnumC0007h[] values() {
        return (EnumC0007h[]) $VALUES.clone();
    }

    private static boolean lIlIlIlIllllIll(int i, int i2) {
        return i < i2;
    }

    private EnumC0007h(String str, int i, String str2, int i2, int i3, Prayer prayer) {
        this.enemyName = str2;
        this.attackAnimation = i2;
        this.attackSpeed = i3;
        this.prayer = prayer;
    }

    private static String lIlIlIlIlllIllI(String llllllllllllllIlllllIIIllIllIIIl, String llllllllllllllIlllllIIIllIllIlIl) {
        String llllllllllllllIlllllIIIllIllIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIIllIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllllIIIllIllIlIl.toCharArray();
        int llllllllllllllIlllllIIIllIlIllIl = lIIlIlIIIIIlI[1];
        char[] charArray2 = llllllllllllllIlllllIIIllIllIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIIIIIlI[1];
        while (lIlIlIlIllllIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllllIIIllIlIllIl % charArray.length]));
            "".length();
            llllllllllllllIlllllIIIllIlIllIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private EnumC0007h(String str, int i, String str2, Prayer prayer) {
        this(str, i, str2, lIIlIlIIIIIlI[0], lIIlIlIIIIIlI[0], prayer);
    }

    public int v() {
        return this.attackAnimation;
    }

    private static String lIlIlIlIllllIII(String llllllllllllllIlllllIIIlllIIIllI, String llllllllllllllIlllllIIIlllIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIlllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIIlllIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIIlllIIlIII.init(lIIlIlIIIIIlI[5], secretKeySpec);
            return new String(llllllllllllllIlllllIIIlllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIlllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIlllIIIIlI) {
            llllllllllllllIlllllIIIlllIIIIlI.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIlIllllIlI();
        lIlIlIlIllllIIl();
        BREE = new EnumC0007h(lIIlIlIIIIIIl[lIIlIlIIIIIlI[1]], lIIlIlIIIIIlI[1], lIIlIlIIIIIIl[lIIlIlIIIIIlI[2]], lIIlIlIIIIIlI[3], lIIlIlIIIIIlI[4], Prayer.PROTECT_FROM_MISSILES);
        GROWLER = new EnumC0007h(lIIlIlIIIIIIl[lIIlIlIIIIIlI[5]], lIIlIlIIIIIlI[2], lIIlIlIIIIIIl[lIIlIlIIIIIlI[6]], lIIlIlIIIIIlI[7], lIIlIlIIIIIlI[4], Prayer.PROTECT_FROM_MAGIC);
        STARLIGHT = new EnumC0007h(lIIlIlIIIIIIl[lIIlIlIIIIIlI[8]], lIIlIlIIIIIlI[5], lIIlIlIIIIIIl[lIIlIlIIIIIlI[4]], lIIlIlIIIIIlI[9], lIIlIlIIIIIlI[4], Prayer.PROTECT_FROM_MELEE);
        THROWER_TROLL = new EnumC0007h(lIIlIlIIIIIIl[lIIlIlIIIIIlI[10]], lIIlIlIIIIIlI[6], lIIlIlIIIIIIl[lIIlIlIIIIIlI[11]], Prayer.PROTECT_FROM_MISSILES);
        EnumC0007h[] enumC0007hArr = new EnumC0007h[lIIlIlIIIIIlI[8]];
        enumC0007hArr[lIIlIlIIIIIlI[1]] = BREE;
        enumC0007hArr[lIIlIlIIIIIlI[2]] = GROWLER;
        enumC0007hArr[lIIlIlIIIIIlI[5]] = STARLIGHT;
        enumC0007hArr[lIIlIlIIIIIlI[6]] = THROWER_TROLL;
        $VALUES = enumC0007hArr;
    }

    private static String lIlIlIlIlllIlll(String llllllllllllllIlllllIIIlllIlIIll, String llllllllllllllIlllllIIIlllIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIlllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIIIlI[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlIIIIIlI[5], llllllllllllllIlllllIIIlllIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIlllIlIlII) {
            llllllllllllllIlllllIIIlllIlIlII.printStackTrace();
            return null;
        }
    }

    public Prayer x() {
        return this.prayer;
    }

    private static void lIlIlIlIllllIIl() {
        lIIlIlIIIIIIl = new String[lIIlIlIIIIIlI[12]];
        lIIlIlIIIIIIl[lIIlIlIIIIIlI[1]] = lIlIlIlIlllIllI("EhEWNw==", "PCSri");
        lIIlIlIIIIIIl[lIIlIlIIIIIlI[2]] = lIlIlIlIlllIlll("HiqauViKYB4=", "lWeDa");
        lIIlIlIIIIIIl[lIIlIlIIIIIlI[5]] = lIlIlIlIlllIllI("LxMpJD8tEw==", "hAfss");
        lIIlIlIIIIIIl[lIIlIlIIIIIlI[6]] = lIlIlIlIlllIllI("IiMnDyIAIw==", "eQHxN");
        lIIlIlIIIIIIl[lIIlIlIIIIIlI[8]] = lIlIlIlIlllIllI("NyUZOTUtNhA/", "dqXky");
        lIIlIlIIIIIIl[lIIlIlIIIIIlI[4]] = lIlIlIlIllllIII("yCLpIluEVIoSiTphXkx5pA==", "ETmim");
        lIIlIlIIIIIIl[lIIlIlIIIIIlI[10]] = lIlIlIlIllllIII("LtU/CL1mEaNcR20ri+Gxrg==", "XwhGl");
        lIIlIlIIIIIIl[lIIlIlIIIIIlI[11]] = lIlIlIlIllllIII("nCNhqAUILqaOGN1+JPMIBw==", "FwjhS");
    }
}
