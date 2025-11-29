package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ad  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ad.class */
public class C0004ad {
    private /* synthetic */ C0002ab cD;
    private /* synthetic */ C0003ac cF;
    private static /* synthetic */ String[] lIIlIII;
    private static /* synthetic */ int[] lIIlIIl;
    private final /* synthetic */ Client cC;
    private /* synthetic */ int L;
    private /* synthetic */ C0001aa cE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean be() {
        if (lIIlIIllI(this.cD) && lIIlIIlIl(this.cD.bb() ? 1 : 0)) {
            ?? r0 = lIIlIIl[1];
            "".length();
            return (((((92 + 119) - 99) + 53) ^ (((158 + 68) - 91) + 27)) & (((9 ^ 95) ^ (78 ^ 31)) ^ (-" ".length()))) != (((((43 + 40) - (-83)) + 30) ^ (((55 + 9) - 23) + 87)) & (((197 ^ 151) ^ (95 ^ 73)) ^ (-" ".length()))) ? ((((29 + 83) - 88) + 191) ^ (((175 + 23) - 185) + 180)) & (((((34 + 98) - 59) + 114) ^ (((0 + 88) - (-4)) + 81)) ^ (-" ".length())) : r0;
        }
        return lIIlIIl[0];
    }

    public C0002ab bh() {
        return this.cD;
    }

    private static boolean lIIlIIlIl(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean bg() {
        if (lIIlIIllI(this.cF) && lIIlIIlIl(this.cF.bb() ? 1 : 0)) {
            ?? r0 = lIIlIIl[1];
            "".length();
            return " ".length() != " ".length() ? ((((25 + 3) - 26) + 146) ^ (((78 + 73) - 147) + 160)) & (((187 ^ 160) ^ (190 ^ 149)) ^ (-" ".length())) : r0;
        }
        return lIIlIIl[0];
    }

    private static void lIIlIIIlI() {
        lIIlIII = new String[lIIlIIl[8]];
        lIIlIII[lIIlIIl[0]] = lIIIlllll("FTMiLyE/PTEm", "QRENO");
        lIIlIII[lIIlIIl[1]] = lIIlIIIII("liHMnu6dpWnx7uaWcc5ZSg==", "njkIi");
        lIIlIII[lIIlIIl[2]] = lIIlIIIIl("w75i34rXT5SHupWspQeeYw==", "lutNp");
        lIIlIII[lIIlIIl[3]] = lIIlIIIII("9W8bKDMh6MGr740qYhkD7naVx84drAx9", "EupNT");
        lIIlIII[lIIlIIl[4]] = lIIlIIIII("scxtF2+Hs8Z5Bu/y/OoCLw==", "EMIze");
        lIIlIII[lIIlIIl[5]] = lIIIlllll("NgggKSYcBjMgaCAMPw==", "riGHH");
        lIIlIII[lIIlIIl[6]] = lIIlIIIII("FovMFIFLCCP7+RedXuua5g==", "QFVOY");
        lIIlIII[lIIlIIl[7]] = lIIlIIIII("VkEktaoTrZJ5Tg1sLbtRMieAY7tnnizN", "TtkAL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean bd() {
        if ((!lIIlIIllI(this.cD) || lIIlIIlII(this.cD.bb() ? 1 : 0)) && ((!lIIlIIllI(this.cE) || lIIlIIlII(this.cE.bb() ? 1 : 0)) && !(lIIlIIllI(this.cF) && lIIlIIlIl(this.cF.bb() ? 1 : 0)))) {
            return lIIlIIl[0];
        }
        ?? r0 = lIIlIIl[1];
        "".length();
        return " ".length() > " ".length() ? ((((40 + 120) - 48) + 34) ^ (((36 + 18) - (-45)) + 44)) & (((((101 + 119) - 170) + 141) ^ (((10 + 43) - 4) + 113)) ^ (-" ".length())) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean bf() {
        if (lIIlIIllI(this.cE) && lIIlIIlIl(this.cE.bb() ? 1 : 0)) {
            ?? r0 = lIIlIIl[1];
            "".length();
            return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIl[0];
    }

    public C0003ac bj() {
        return this.cF;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIIlIIlII(npcSpawned.getNpc().getName().contains(lIIlIII[lIIlIIl[0]]) ? 1 : 0)) {
            return;
        }
        if (lIIlIIlIl(npcSpawned.getNpc().getName().equals(lIIlIII[lIIlIIl[1]]) ? 1 : 0)) {
            this.cD = new C0002ab(npcSpawned.getNpc());
        }
        if (lIIlIIlIl(npcSpawned.getNpc().getName().equals(lIIlIII[lIIlIIl[2]]) ? 1 : 0)) {
            this.cE = new C0001aa(npcSpawned.getNpc());
        }
        if (lIIlIIlIl(npcSpawned.getNpc().getName().equals(lIIlIII[lIIlIIl[3]]) ? 1 : 0)) {
            this.cF = new C0003ac(npcSpawned.getNpc());
        }
    }

    private static String lIIlIIIII(String llllIIIIlllIlIl, String llllIIIIlllIlII) {
        try {
            SecretKeySpec llllIIIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIIIlllIlll = Cipher.getInstance("Blowfish");
            llllIIIIlllIlll.init(lIIlIIl[2], llllIIIIllllIII);
            return new String(llllIIIIlllIlll.doFinal(Base64.getDecoder().decode(llllIIIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIIIlllIllI) {
            llllIIIIlllIllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public C0004ad(Client client) {
        this.cC = client;
    }

    private static void lIIlIIIll() {
        lIIlIIl = new int[9];
        lIIlIIl[0] = ((((160 + 48) - 136) + 92) ^ (((167 + 11) - 176) + 184)) & (((68 ^ 124) ^ (28 ^ 58)) ^ (-" ".length()));
        lIIlIIl[1] = " ".length();
        lIIlIIl[2] = "  ".length();
        lIIlIIl[3] = "   ".length();
        lIIlIIl[4] = (169 ^ 192) ^ (40 ^ 69);
        lIIlIIl[5] = (17 ^ 38) ^ (67 ^ 113);
        lIIlIIl[6] = (((89 + 58) - 145) + 163) ^ (((151 + 148) - 188) + 52);
        lIIlIIl[7] = 179 ^ 180;
        lIIlIIl[8] = 180 ^ 188;
    }

    private static String lIIIlllll(String llllIIIIlIlIIll, String llllIIIIlIlIlll) {
        String llllIIIIlIlIIll2 = new String(Base64.getDecoder().decode(llllIIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllIIIIlIlIlll.toCharArray();
        int llllIIIIlIlIlII = lIIlIIl[0];
        char[] charArray2 = llllIIIIlIlIIll2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIlIIl[0];
        while (lIIlIIlll(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[llllIIIIlIlIlII % charArray.length]));
            "".length();
            llllIIIIlIlIlII++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIlIIIll();
        lIIlIIIlI();
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lIIlIIlII(npcDespawned.getNpc().getName().contains(lIIlIII[lIIlIIl[4]]) ? 1 : 0)) {
            return;
        }
        if (lIIlIIlIl(npcDespawned.getNpc().getName().equals(lIIlIII[lIIlIIl[5]]) ? 1 : 0)) {
            this.cD = null;
            this.L += lIIlIIl[1];
        }
        if (lIIlIIlIl(npcDespawned.getNpc().getName().equals(lIIlIII[lIIlIIl[6]]) ? 1 : 0)) {
            this.cE = null;
            this.L += lIIlIIl[1];
        }
        if (lIIlIIlIl(npcDespawned.getNpc().getName().equals(lIIlIII[lIIlIIl[7]]) ? 1 : 0)) {
            this.cF = null;
            this.L += lIIlIIl[1];
        }
    }

    private static String lIIlIIIIl(String llllIIIIllIlIII, String llllIIIIllIIlll) {
        try {
            SecretKeySpec llllIIIIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIIllIIlll.getBytes(StandardCharsets.UTF_8)), lIIlIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIl[2], llllIIIIllIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIIIllIlIIl) {
            llllIIIIllIlIIl.printStackTrace();
            return null;
        }
    }

    public int q() {
        return this.L;
    }

    private static boolean lIIlIIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIlII(int i2) {
        return i2 == 0;
    }

    public C0001aa bi() {
        return this.cE;
    }

    private static boolean lIIlIIlll(int i2, int i3) {
        return i2 < i3;
    }
}
