package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.d  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/d.class */
public final class d {
    private static /* synthetic */ String[] llllIlIIlll;
    public static final /* synthetic */ d TORAG;
    private final /* synthetic */ int combatLevel;
    private static final /* synthetic */ d[] $VALUES;
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ d VERAC;
    public static final /* synthetic */ d DHAROK;
    private final /* synthetic */ String name;
    public static final /* synthetic */ d KARIL;
    public static final /* synthetic */ d GUTHAN;
    public static final /* synthetic */ d AHRIM;
    private static /* synthetic */ int[] llllIlIlIII;
    private final /* synthetic */ int killedVarbit;

    private static void lIllIlIllIIIll() {
        llllIlIIlll = new String[llllIlIlIII[29]];
        llllIlIIlll[llllIlIlIII[0]] = lIllIlIllIIIII("Ot75+O/owvE=", "zRJpX");
        llllIlIIlll[llllIlIlIII[1]] = lIllIlIllIIIIl("AwYDEBgs", "Gnbbw");
        llllIlIIlll[llllIlIlIII[6]] = lIllIlIllIIIII("rp8+ApTT7SM=", "BKBUP");
        llllIlIIlll[llllIlIlIII[7]] = lIllIlIllIIIlI("GIKzO6j7mx8=", "xIlIs");
        llllIlIIlll[llllIlIlIII[11]] = lIllIlIllIIIII("S0JKIO6b/Wo=", "IOXey");
        llllIlIIlll[llllIlIlIII[12]] = lIllIlIllIIIlI("hn3mAypTxio=", "pkBdt");
        llllIlIIlll[llllIlIlIII[17]] = lIllIlIllIIIII("KNisEfwwXjI=", "smXey");
        llllIlIIlll[llllIlIlIII[18]] = lIllIlIllIIIII("fWks5ok0Dgs=", "eQCGc");
        llllIlIIlll[llllIlIlIII[21]] = lIllIlIllIIIIl("MywDDgo=", "gcQOM");
        llllIlIIlll[llllIlIlIII[22]] = lIllIlIllIIIIl("PwUxORc=", "kjCXp");
        llllIlIIlll[llllIlIlIII[25]] = lIllIlIllIIIlI("IZ5U008mMFQ=", "AIDHr");
        llllIlIIlll[llllIlIlIII[26]] = lIllIlIllIIIII("SDpyWGQeq/Y=", "toKYk");
    }

    private static String lIllIlIllIIIlI(String llllllllllllllllIIIllIIllIllllII, String llllllllllllllllIIIllIIllIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIllIlllIll.getBytes(StandardCharsets.UTF_8)), llllIlIlIII[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIlIII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIIllIllllIl) {
            llllllllllllllllIIIllIIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIllIIIII(String llllllllllllllllIIIllIIlllIIlIIl, String llllllllllllllllIIIllIIlllIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIlllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIlIII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIlllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIIlllIIlIlI) {
            llllllllllllllllIIIllIIlllIIlIlI.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.combatLevel;
    }

    private static boolean lIllIlIllIIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private d(String str, int i, String str2, int i2, WorldPoint worldPoint, int i3) {
        this.name = str2;
        this.combatLevel = i2;
        this.location = worldPoint;
        this.killedVarbit = i3;
    }

    private static boolean lIllIlIllIIlll(int i) {
        return i != 0;
    }

    public int F() {
        return this.killedVarbit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    public static boolean a(Actor actor) {
        if (lIllIlIllIIlIl(actor.getInteracting(), Players.getLocal())) {
            return llllIlIlIII[0];
        }
        d[] values = values();
        int length = values.length;
        int i = llllIlIlIII[0];
        while (lIllIlIllIIllI(i, length)) {
            if (lIllIlIllIIlll(actor.getName().toLowerCase().contains(values[i].C().toLowerCase()) ? 1 : 0)) {
                return llllIlIlIII[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((((221 + 185) - 348) + 192) ^ (((65 + 126) - 108) + 86)) & (((233 ^ 131) ^ (81 ^ 104)) ^ (-" ".length()));
            }
        }
        return llllIlIlIII[0];
    }

    private static boolean lIllIlIllIIllI(int i, int i2) {
        return i < i2;
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    private static String lIllIlIllIIIIl(String llllllllllllllllIIIllIIllIlIllII, String llllllllllllllllIIIllIIllIlIlIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIIllIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIIllIIllIlIlIll.toCharArray();
        int llllllllllllllllIIIllIIllIlIlIII = llllIlIlIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIlIlIII[0];
        while (lIllIlIllIIllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIIllIIllIlIlIII % charArray.length]));
            "".length();
            llllllllllllllllIIIllIIllIlIlIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public String C() {
        return this.name;
    }

    private static void lIllIlIllIIlII() {
        llllIlIlIII = new int[30];
        llllIlIlIII[0] = (237 ^ 192) & ((75 ^ 102) ^ (-1));
        llllIlIlIII[1] = " ".length();
        llllIlIlIII[2] = 196 ^ 183;
        llllIlIlIII[3] = (-((-485) & 5101)) & (-24577) & 32767;
        llllIlIlIII[4] = (-((-7346) & 15807)) & (-4609) & 16367;
        llllIlIlIII[5] = (-5) & 462;
        llllIlIlIII[6] = "  ".length();
        llllIlIlIII[7] = "   ".length();
        llllIlIlIII[8] = (-16391) & 19967;
        llllIlIlIII[9] = (-25097) & 28379;
        llllIlIlIII[10] = (-31749) & 32207;
        llllIlIlIII[11] = 58 ^ 62;
        llllIlIlIII[12] = 122 ^ 127;
        llllIlIlIII[13] = 47 ^ 77;
        llllIlIlIII[14] = (-514) & 4079;
        llllIlIlIII[15] = (-4869) & 8143;
        llllIlIlIII[16] = (-((-475) & 8187)) & (-8196) & 16367;
        llllIlIlIII[17] = (140 ^ 156) ^ (177 ^ 167);
        llllIlIlIII[18] = 182 ^ 177;
        llllIlIlIII[19] = (-29479) & 32767;
        llllIlIlIII[20] = (-((-2533) & 32741)) & (-51) & 30715;
        llllIlIlIII[21] = 6 ^ 14;
        llllIlIlIII[22] = (((46 + 44) - (-17)) + 23) ^ (((104 + 105) - 96) + 26);
        llllIlIlIII[23] = (-4111) & 7663;
        llllIlIlIII[24] = (-15393) & 15853;
        llllIlIlIII[25] = (((12 + 100) - (-24)) + 21) ^ (((68 + 96) - 145) + 132);
        llllIlIlIII[26] = 140 ^ 135;
        llllIlIlIII[27] = (-20489) & 24045;
        llllIlIlIII[28] = (-((-23301) & 24326)) & (-2561) & 4047;
        llllIlIlIII[29] = (173 ^ 164) ^ (113 ^ 116);
    }

    static {
        lIllIlIllIIlII();
        lIllIlIllIIIll();
        DHAROK = new d(llllIlIIlll[llllIlIlIII[0]], llllIlIlIII[0], llllIlIIlll[llllIlIlIII[1]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[3], llllIlIlIII[4], llllIlIlIII[0]), llllIlIlIII[5]);
        GUTHAN = new d(llllIlIIlll[llllIlIlIII[6]], llllIlIlIII[1], llllIlIIlll[llllIlIlIII[7]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[8], llllIlIlIII[9], llllIlIlIII[0]), llllIlIlIII[10]);
        KARIL = new d(llllIlIIlll[llllIlIlIII[11]], llllIlIlIII[6], llllIlIIlll[llllIlIlIII[12]], llllIlIlIII[13], new WorldPoint(llllIlIlIII[14], llllIlIlIII[15], llllIlIlIII[0]), llllIlIlIII[16]);
        AHRIM = new d(llllIlIIlll[llllIlIlIII[17]], llllIlIlIII[7], llllIlIIlll[llllIlIlIII[18]], llllIlIlIII[13], new WorldPoint(llllIlIlIII[14], llllIlIlIII[19], llllIlIlIII[0]), llllIlIlIII[20]);
        TORAG = new d(llllIlIIlll[llllIlIlIII[21]], llllIlIlIII[11], llllIlIIlll[llllIlIlIII[22]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[23], llllIlIlIII[9], llllIlIlIII[0]), llllIlIlIII[24]);
        VERAC = new d(llllIlIIlll[llllIlIlIII[25]], llllIlIlIII[12], llllIlIIlll[llllIlIlIII[26]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[27], llllIlIlIII[4], llllIlIlIII[0]), llllIlIlIII[28]);
        d[] dVarArr = new d[llllIlIlIII[17]];
        dVarArr[llllIlIlIII[0]] = DHAROK;
        dVarArr[llllIlIlIII[1]] = GUTHAN;
        dVarArr[llllIlIlIII[6]] = KARIL;
        dVarArr[llllIlIlIII[7]] = AHRIM;
        dVarArr[llllIlIlIII[11]] = TORAG;
        dVarArr[llllIlIlIII[12]] = VERAC;
        $VALUES = dVarArr;
    }

    public WorldPoint D() {
        return this.location;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }
}
