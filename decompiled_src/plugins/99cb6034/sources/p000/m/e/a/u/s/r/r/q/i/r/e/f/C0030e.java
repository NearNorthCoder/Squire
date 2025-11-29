package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Singleton;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.game.ItemManager;
@Singleton
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/e.class */
public class C0030e {
    private static /* synthetic */ String[] llIIIlIlIIll;
    @Inject
    private /* synthetic */ SquireFarmer P;
    private static final /* synthetic */ int I;
    private static final /* synthetic */ String L;
    private /* synthetic */ EnumC0039n N;
    private static final /* synthetic */ String K;
    @Inject
    private /* synthetic */ ItemManager O;
    private static /* synthetic */ int[] llIIIlIlIlII;
    @Inject
    private /* synthetic */ C0031f Q;
    private static final /* synthetic */ Pattern J;
    @Inject
    private /* synthetic */ ConfigManager i;
    @Inject
    private /* synthetic */ SquireFarmerConfig h;
    @Inject
    private /* synthetic */ C0043r z;
    @Inject
    private /* synthetic */ Client j;
    private /* synthetic */ long S;
    private static final /* synthetic */ int H;
    private /* synthetic */ B M = B.UNKNOWN;
    private /* synthetic */ EnumC0021au R = null;

    private static boolean llllIlIIllIIlI(int i, int i2) {
        return i != i2;
    }

    static {
        llllIlIIlIllII();
        llllIlIIlIlIll();
        K = llIIIlIlIIll[llIIIlIlIlII[9]];
        H = llIIIlIlIlII[3];
        L = llIIIlIlIIll[llIIIlIlIlII[10]];
        I = llIIIlIlIlII[2];
        J = Pattern.compile(llIIIlIlIIll[llIIIlIlIlII[11]]);
    }

    public EnumC0021au r() {
        return this.R;
    }

    private void m() {
        Widget widget = this.j.getWidget(WidgetInfo.DIALOG_NPC_HEAD_MODEL);
        if (!llllIlIIlIllIl(widget) || llllIlIIllIIlI(widget.getModelId(), llIIIlIlIlII[3])) {
            return;
        }
        String removeTags = Text.removeTags(this.j.getWidget(WidgetInfo.DIALOG_NPC_TEXT).getText());
        if (llllIlIIlIlllI(removeTags.equals(llIIIlIlIIll[llIIIlIlIlII[1]]) ? 1 : 0)) {
            a((EnumC0021au) null);
        }
        Matcher matcher = J.matcher(removeTags);
        if (llllIlIIllIIll(matcher.find() ? 1 : 0)) {
            return;
        }
        EnumC0021au d = EnumC0021au.d(matcher.group(llIIIlIlIlII[0]));
        if (llllIlIIllIlII(d) || llllIlIIllIIII(d, this.R)) {
            return;
        }
        a(d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean i() {
        if (llllIlIIlIllIl(this.R)) {
            ?? r0 = llIIIlIlIlII[0];
            "".length();
            return " ".length() < (-" ".length()) ? (true ^ true) & ((false ^ true) ^ true) : r0;
        }
        return llIIIlIlIlII[1];
    }

    private void b(@Nullable EnumC0021au enumC0021au) {
        if (!llllIlIIlIllIl(enumC0021au)) {
            this.i.unsetRSProfileConfiguration(llIIIlIlIIll[llIIIlIlIlII[7]], llIIIlIlIIll[llIIIlIlIlII[8]]);
            return;
        }
        this.i.setRSProfileConfiguration(llIIIlIlIIll[llIIIlIlIlII[5]], llIIIlIlIIll[llIIIlIlIlII[6]], String.valueOf(enumC0021au.au()));
        "".length();
        if ("  ".length() > "  ".length()) {
        }
    }

    private static boolean llllIlIIllIllI(int i, int i2) {
        return i < i2;
    }

    private static int llllIlIIllIlIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean llllIlIIllIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean c(N n) {
        C0013am j = this.Q.j(n);
        if (llllIlIIlIllIl(this.R) && llllIlIIlIllll(n.aM().X(), llIIIlIlIlII[2]) && llllIlIIllIIII(this.R.bh(), n.aL()) && llllIlIIlIllIl(j) && ((llllIlIIllIIII(this.M, B.EMPTY) && (!llllIlIIlIllIl(j.aY()) || !llllIlIIllIIIl(j.aY(), EnumC0021au.WEEDS))) || llllIlIIlIlllI(j.aY().equals(this.R) ? 1 : 0))) {
            ?? r0 = llIIIlIlIlII[0];
            "".length();
            return (-"  ".length()) >= 0 ? ((217 ^ 173) ^ (5 ^ 91)) & (((((157 + 58) - 138) + 83) ^ (((68 + 27) - 62) + 105)) ^ (-" ".length())) : r0;
        }
        return llIIIlIlIlII[1];
    }

    private void n() {
        if (llllIlIIllIlII(this.R)) {
            this.M = B.UNKNOWN;
            return;
        }
        P bh = this.R.bh();
        int i = llIIIlIlIlII[1];
        int i2 = llIIIlIlIlII[1];
        int i3 = llIIIlIlIlII[1];
        this.S = Long.MAX_VALUE;
        this.N = null;
        N[] ae = this.z.ag().ae();
        int length = ae.length;
        int i4 = llIIIlIlIlII[1];
        while (llllIlIIllIllI(i4, length)) {
            N n = ae[i4];
            if (llllIlIIllIIIl(n.aL(), bh)) {
                "".length();
                if ((-" ".length()) > "  ".length()) {
                    return;
                }
            } else {
                C0013am j = this.Q.j(n);
                if (llllIlIIllIlII(j)) {
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                } else {
                    EnumC0021au aY = j.aY();
                    EnumC0039n aZ = j.aZ();
                    if (llllIlIIllIIll(llllIlIIllIlIl(this.S, Long.MAX_VALUE))) {
                        if (!llllIlIIlIllIl(aY) || llllIlIIllIIII(aY, EnumC0021au.WEEDS)) {
                            if (llllIlIIllIIll(i2) && llllIlIIllIIll(i3)) {
                                this.M = B.EMPTY;
                            }
                            i = llIIIlIlIlII[0];
                            "".length();
                            if (" ".length() < 0) {
                                return;
                            }
                        } else if (llllIlIIlIlllI(this.R.bh().aX() ? 1 : 0) && llllIlIIllIIII(aZ, EnumC0039n.HARVESTABLE) && llllIlIIllIIll(i) && llllIlIIllIIll(i2) && llllIlIIllIIll(i3)) {
                            this.M = B.OCCUPIED;
                            "".length();
                            if ((((124 ^ 26) ^ (88 ^ 55)) & ((((78 ^ 96) & ((116 ^ 90) ^ (-1))) ^ (66 ^ 75)) ^ (-" ".length()))) > "  ".length()) {
                                return;
                            }
                        }
                    }
                    if (!llllIlIIllIIIl(aY, this.R) || !llllIlIIllIIIl(aY, EnumC0021au.ANYHERB)) {
                        if (llllIlIIllIIII(aZ, EnumC0039n.DEAD)) {
                            if (llllIlIIllIIll(i2)) {
                                if (llllIlIIlIlllI(llllIlIIllIlIl(this.S, Long.MAX_VALUE))) {
                                    "".length();
                                    if ((((102 ^ 14) ^ (111 ^ 27)) & (((129 ^ 184) ^ (58 ^ 31)) ^ (-" ".length()))) < (-" ".length())) {
                                        return;
                                    }
                                }
                            }
                        }
                        if (llllIlIIllIIII(aZ, EnumC0039n.DISEASED) && llllIlIIlIlllI(llllIlIIllIlIl(this.S, Long.MAX_VALUE))) {
                            "".length();
                            if (((((111 + 172) - 188) + 92) ^ (((179 + 75) - 108) + 45)) == 0) {
                                return;
                            }
                        } else {
                            this.N = aZ;
                            if (llllIlIIllIIII(this.N, EnumC0039n.DISEASED)) {
                                i2 = llIIIlIlIlII[0];
                                this.M = B.IN_PROGRESS;
                                "".length();
                                if (" ".length() <= (-" ".length())) {
                                    return;
                                }
                            } else if (llllIlIIllIIII(this.N, EnumC0039n.DEAD)) {
                                i3 = llIIIlIlIlII[0];
                                this.M = B.IN_PROGRESS;
                                "".length();
                                if ((-"   ".length()) > 0) {
                                    return;
                                }
                            } else {
                                long lllllllllllllllIlIlIIllllllIllIl = Math.min(j.ba(), this.S);
                                if (llllIlIIllIlll(llllIlIIllIlIl(lllllllllllllllIlIlIIllllllIllIl, Instant.now().getEpochSecond()))) {
                                    this.M = B.COMPLETED;
                                    this.S = 0L;
                                    "".length();
                                    if ("   ".length() > ((17 ^ 22) ^ "   ".length())) {
                                        return;
                                    }
                                    return;
                                }
                                this.M = B.IN_PROGRESS;
                                this.S = lllllllllllllllIlIlIIllllllIllIl;
                            }
                        }
                    } else if (llllIlIIllIIll(i) && llllIlIIllIIll(i2) && llllIlIIllIIll(i3) && llllIlIIllIIll(llllIlIIllIlIl(this.S, Long.MAX_VALUE))) {
                        this.M = B.OCCUPIED;
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    }
                }
            }
            i4++;
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(WorldPoint worldPoint) {
        B b = this.M;
        n();
        if (llllIlIIlIllll(worldPoint.getRegionID(), llIIIlIlIlII[2])) {
            m();
        }
        if (llllIlIIllIIIl(b, this.M)) {
            ?? r0 = llIIIlIlIlII[0];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIlIlIlII[1];
    }

    private static boolean llllIlIIlIllll(int i, int i2) {
        return i == i2;
    }

    private static boolean llllIlIIllIlII(Object obj) {
        return obj == null;
    }

    private static boolean llllIlIIllIlll(int i) {
        return i <= 0;
    }

    private static String llllIlIIlIlIII(String lllllllllllllllIlIlIIlllllIllIlI, String lllllllllllllllIlIlIIlllllIllIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlllllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIIlllllIlIlll = lllllllllllllllIlIlIIlllllIllIIl.toCharArray();
        int lllllllllllllllIlIlIIlllllIlIllI = llIIIlIlIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIlIlIlII[1];
        while (llllIlIIllIllI(i, length)) {
            char lllllllllllllllIlIlIIlllllIllIll = charArray[i];
            sb.append((char) (lllllllllllllllIlIlIIlllllIllIll ^ lllllllllllllllIlIlIIlllllIlIlll[lllllllllllllllIlIlIIlllllIlIllI % lllllllllllllllIlIlIIlllllIlIlll.length]));
            "".length();
            lllllllllllllllIlIlIIlllllIlIllI++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public EnumC0039n q() {
        return this.N;
    }

    public long s() {
        return this.S;
    }

    public void a(@Nullable EnumC0021au enumC0021au) {
        this.R = enumC0021au;
        b(enumC0021au);
        n();
    }

    private static String llllIlIIlIlIlI(String lllllllllllllllIlIlIIllllIlllIII, String lllllllllllllllIlIlIIllllIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIllllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIllllIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIllllIlllIlI.init(llIIIlIlIlII[4], secretKeySpec);
            return new String(lllllllllllllllIlIlIIllllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIllllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIllllIlllIIl) {
            lllllllllllllllIlIlIIllllIlllIIl.printStackTrace();
            return null;
        }
    }

    private static void llllIlIIlIllII() {
        llIIIlIlIlII = new int[13];
        llIIIlIlIlII[0] = " ".length();
        llIIIlIlIlII[1] = (30 ^ 82) & ((0 ^ 76) ^ (-1));
        llIIIlIlIlII[2] = (-((-3873) & 20449)) & (-11266) & 32763;
        llIIIlIlIlII[3] = (-20484) & 29111;
        llIIIlIlIlII[4] = "  ".length();
        llIIIlIlIlII[5] = "   ".length();
        llIIIlIlIlII[6] = (((136 + 196) - 184) + 51) ^ (((194 + 174) - 184) + 11);
        llIIIlIlIlII[7] = (103 ^ 44) ^ (87 ^ 25);
        llIIIlIlIlII[8] = 68 ^ 66;
        llIIIlIlIlII[9] = (((158 + 47) - 76) + 57) ^ (((172 + 9) - 22) + 30);
        llIIIlIlIlII[10] = (100 ^ 26) ^ (43 ^ 93);
        llIIIlIlIlII[11] = 173 ^ 164;
        llIIIlIlIlII[12] = (163 ^ 176) ^ (11 ^ 18);
    }

    @Nullable
    private EnumC0021au o() {
        try {
            return EnumC0021au.g(Integer.parseInt(this.i.getRSProfileConfiguration(llIIIlIlIIll[llIIIlIlIlII[0]], llIIIlIlIIll[llIIIlIlIlII[4]])));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static String llllIlIIlIlIIl(String lllllllllllllllIlIlIIlllllIIIlIl, String lllllllllllllllIlIlIIlllllIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlllllIIIlII.getBytes(StandardCharsets.UTF_8)), llIIIlIlIlII[10]), "DES");
            Cipher lllllllllllllllIlIlIIlllllIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlllllIIIlll.init(llIIIlIlIlII[4], secretKeySpec);
            return new String(lllllllllllllllIlIlIIlllllIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlllllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIlllllIIIllI) {
            lllllllllllllllIlIlIIlllllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlIIllIIll(int i) {
        return i == 0;
    }

    @Nullable
    public String k() {
        if (llllIlIIlIlllI(i() ? 1 : 0)) {
            String k = this.R.k();
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
            return k;
        }
        return null;
    }

    private static boolean llllIlIIllIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    public void l() {
        this.R = o();
        n();
    }

    private static boolean llllIlIIlIllIl(Object obj) {
        return obj != null;
    }

    private static void llllIlIIlIlIll() {
        llIIIlIlIIll = new String[llIIIlIlIlII[12]];
        llIIIlIlIIll[llIIIlIlIlII[1]] = llllIlIIlIlIII("MQ0zcS0EQiQzYR8DKCIoBgVmN2EaBzE3MwxCMj4kBkxmHiQaB2YvLh1CITlv", "hbFVA");
        llIIIlIlIIll[llIIIlIlIlII[0]] = llllIlIIlIlIII("ADMwPQUWJCQmGhYw", "sBETw");
        llIIIlIlIIll[llIIIlIlIlII[4]] = llllIlIIlIlIIl("TULnFO7GKtpoiET0kIRy2A==", "nGAvg");
        llIIIlIlIIll[llIIIlIlIlII[5]] = llllIlIIlIlIII("FyciLBEBMDY3DgEk", "dVWEc");
        llIIIlIlIIll[llIIIlIlIlII[6]] = llllIlIIlIlIIl("9mziwG8oQDZ4lSygVwn25w==", "wbdcs");
        llIIIlIlIIll[llIIIlIlIlII[7]] = llllIlIIlIlIlI("iVPINu8u3/kh74IdWwJqQA==", "kHEeP");
        llIIIlIlIIll[llIIIlIlIlII[8]] = llllIlIIlIlIII("FCkYAyQWJQI=", "wFvwV");
        llIIIlIlIIll[llIIIlIlIlII[9]] = llllIlIIlIlIlI("L4b8hP96gG34Kt+wpg7/AnyJR69iRCARWQW35DQPwmtCqXwro3/D7BIvmFNCpJFw", "sVLDx");
        llIIIlIlIIll[llIIIlIlIlII[10]] = llllIlIIlIlIlI("JdF32vZz5oPzSfoFzs5sYQ==", "iwcFE");
        llIIIlIlIIll[llIIIlIlIlII[11]] = llllIlIIlIlIII("enNTHx9yIgwtHnI1Bj1aJiNJLwg9OxUYFjctGi1aMSMcJB5yNQY9WjU+Bj9TcmRWcgk9IQw0Gy4tB2FaehcIZQATYTNoJ3llQXdAcioGOlonPzV3Bg5iQA==", "RLiHz");
    }

    @Nullable
    public A j() {
        if (llllIlIIlIlllI(i() ? 1 : 0)) {
            A aU = this.R.bh().aU();
            "".length();
            if ((((14 ^ 72) ^ (70 ^ 84)) & (((143 ^ 185) ^ (230 ^ 132)) ^ (-" ".length()))) != 0) {
                return null;
            }
            return aU;
        }
        return null;
    }

    public B p() {
        return this.M;
    }

    private static boolean llllIlIIlIlllI(int i) {
        return i != 0;
    }
}
