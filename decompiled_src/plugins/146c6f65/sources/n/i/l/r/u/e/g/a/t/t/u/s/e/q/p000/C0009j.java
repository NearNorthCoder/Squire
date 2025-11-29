package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.game.Vars;
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/j.class */
public class C0009j {
    private static /* synthetic */ int[] llIlIIIlIlII;
    private final /* synthetic */ NPC aQ;
    private static final /* synthetic */ int aO;
    private /* synthetic */ HeadIcon aR;
    private static final /* synthetic */ int aP;
    private /* synthetic */ int aS;
    private /* synthetic */ int aT;
    private /* synthetic */ Prayer aU = Prayer.PROTECT_FROM_MISSILES;
    private static /* synthetic */ String[] llIlIIIlIIll;

    public void j(int i) {
        this.aS += llIlIIIlIlII[1];
        this.aT = i;
    }

    public HeadIcon aD() {
        if (lIIIIIIlIIllIII(this.aQ)) {
            short[] overheadIcons = this.aQ.getOverheadIcons();
            if (lIIIIIIlIIllIIl(overheadIcons)) {
                return this.aR;
            }
            this.aR = HeadIcon.values()[overheadIcons[llIlIIIlIlII[0]]];
        }
        return this.aR;
    }

    public NPC aI() {
        return this.aQ;
    }

    private static void lIIIIIIlIIlIlll() {
        llIlIIIlIlII = new int[8];
        llIlIIIlIlII[0] = (71 ^ 91) & ((174 ^ 178) ^ (-1));
        llIlIIIlIlII[1] = " ".length();
        llIlIIIlIlII[2] = (-((-5025) & 31661)) & (-1) & 32735;
        llIlIIIlIlII[3] = (-((-17669) & 27959)) & (-4737) & 15359;
        llIlIIIlIlII[4] = (-((-4809) & 32473)) & (-9) & 28671;
        llIlIIIlIlII[5] = "   ".length();
        llIlIIIlIlII[6] = "  ".length();
        llIlIIIlIlII[7] = (3 ^ 125) ^ (97 ^ 23);
    }

    public int aJ() {
        return this.aS;
    }

    public Prayer aG() {
        return this.aU;
    }

    private static void lIIIIIIlIIlIllI() {
        llIlIIIlIIll = new String[llIlIIIlIlII[6]];
        llIlIIIlIIll[llIlIIIlIlII[0]] = lIIIIIIlIIlIlII("eiEJMiC0szs=", "bTTJN");
        llIlIIIlIIll[llIlIIIlIlII[1]] = lIIIIIIlIIlIlIl("2vzmDBQ9u9A=", "rIeDa");
    }

    private static String lIIIIIIlIIlIlII(String lllllllllllllllIlIIIllIIlllIlllI, String lllllllllllllllIlIIIllIIlllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIlllIllIl.getBytes(StandardCharsets.UTF_8)), llIlIIIlIlII[7]), "DES");
            Cipher lllllllllllllllIlIIIllIIllllIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIIIllIIllllIIII.init(llIlIIIlIlII[6], secretKeySpec);
            return new String(lllllllllllllllIlIIIllIIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllIIlllIllll) {
            lllllllllllllllIlIIIllIIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIlIIllIIl(Object obj) {
        return obj == null;
    }

    public int aH() {
        int bit = Vars.getBit(llIlIIIlIlII[2]);
        int i = bit / llIlIIIlIlII[3];
        if (!lIIIIIIlIIllIll(bit) || lIIIIIIlIIlllII(bit, llIlIIIlIlII[4])) {
            int i2 = llIlIIIlIlII[5];
            "".length();
            return !((true ^ true) ^ (true ^ true)) ? ((78 ^ 15) ^ (246 ^ 133)) & (((((150 + 233) - 311) + 169) ^ (((8 + 35) - (-104)) + 48)) ^ (-" ".length())) : i2;
        }
        return i + llIlIIIlIlII[1];
    }

    public void aF() {
        Prayer prayer;
        if (lIIIIIIlIIllIlI(this.aU, Prayer.PROTECT_FROM_MISSILES)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        } else {
            prayer = Prayer.PROTECT_FROM_MISSILES;
        }
        this.aU = prayer;
    }

    public String aE() {
        String headIcon = aD().toString();
        return headIcon.charAt(llIlIIIlIlII[0]) + headIcon.substring(llIlIIIlIlII[1]).replaceAll(llIlIIIlIIll[llIlIIIlIlII[0]], llIlIIIlIIll[llIlIIIlIlII[1]]).trim().toLowerCase();
    }

    private static boolean lIIIIIIlIIllIII(Object obj) {
        return obj != null;
    }

    static {
        lIIIIIIlIIlIlll();
        lIIIIIIlIIlIllI();
        aP = llIlIIIlIlII[3];
        aO = llIlIIIlIlII[2];
    }

    private static boolean lIIIIIIlIIlllII(int i, int i2) {
        return i >= i2;
    }

    private static String lIIIIIIlIIlIlIl(String lllllllllllllllIlIIIllIIlllIIIIl, String lllllllllllllllIlIIIllIIlllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIIlIlII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllIIlllIIIlI) {
            lllllllllllllllIlIIIllIIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIlIIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    public C0009j(NPC npc) {
        this.aQ = npc;
    }

    public void a(Prayer prayer) {
        this.aU = prayer;
    }

    public int aK() {
        return this.aT;
    }

    private static boolean lIIIIIIlIIllIll(int i) {
        return i > 0;
    }
}
