/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import i.i.b.s.c.q.r.s.s.-.u.a.e.aa;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ab;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ac;
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

public class ad {
    private /* synthetic */ ab cD;
    private /* synthetic */ ac cF;
    private static /* synthetic */ String[] lIIlIII;
    private static /* synthetic */ int[] lIIlIIl;
    private final /* synthetic */ Client cC;
    private /* synthetic */ int L;
    private /* synthetic */ aa cE;

    public boolean be() {
        int n2;
        if (ad.lIIlIIllI(this.cD) && ad.lIIlIIlIl(this.cD.bb() ? 1 : 0)) {
            n2 = lIIlIIl[1];
            "".length();
            if (((92 + 119 - 99 + 53 ^ 158 + 68 - 91 + 27) & (9 ^ 0x5F ^ (0x4E ^ 0x1F) ^ -" ".length())) != ((43 + 40 - -83 + 30 ^ 55 + 9 - 23 + 87) & (0xC5 ^ 0x97 ^ (0x5F ^ 0x49) ^ -" ".length()))) {
                return ((29 + 83 - 88 + 191 ^ 175 + 23 - 185 + 180) & (34 + 98 - 59 + 114 ^ 0 + 88 - -4 + 81 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIIlIIl[0];
        }
        return n2 != 0;
    }

    public ab bh() {
        return this.cD;
    }

    private static boolean lIIlIIlIl(int n2) {
        return n2 != 0;
    }

    public boolean bg() {
        int n2;
        if (ad.lIIlIIllI(this.cF) && ad.lIIlIIlIl(this.cF.bb() ? 1 : 0)) {
            n2 = lIIlIIl[1];
            "".length();
            if (" ".length() != " ".length()) {
                return ((25 + 3 - 26 + 146 ^ 78 + 73 - 147 + 160) & (0xBB ^ 0xA0 ^ (0xBE ^ 0x95) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIIlIIl[0];
        }
        return n2 != 0;
    }

    private static void lIIlIIIlI() {
        lIIlIII = new String[lIIlIIl[8]];
        ad.lIIlIII[ad.lIIlIIl[0]] = ad.lIIIlllll("FTMiLyE/PTEm", "QRENO");
        ad.lIIlIII[ad.lIIlIIl[1]] = ad.lIIlIIIII("liHMnu6dpWnx7uaWcc5ZSg==", "njkIi");
        ad.lIIlIII[ad.lIIlIIl[2]] = ad.lIIlIIIIl("w75i34rXT5SHupWspQeeYw==", "lutNp");
        ad.lIIlIII[ad.lIIlIIl[3]] = ad.lIIlIIIII("9W8bKDMh6MGr740qYhkD7naVx84drAx9", "EupNT");
        ad.lIIlIII[ad.lIIlIIl[4]] = ad.lIIlIIIII("scxtF2+Hs8Z5Bu/y/OoCLw==", "EMIze");
        ad.lIIlIII[ad.lIIlIIl[5]] = ad.lIIIlllll("NgggKSYcBjMgaCAMPw==", "riGHH");
        ad.lIIlIII[ad.lIIlIIl[6]] = ad.lIIlIIIII("FovMFIFLCCP7+RedXuua5g==", "QFVOY");
        ad.lIIlIII[ad.lIIlIIl[7]] = ad.lIIlIIIII("VkEktaoTrZJ5Tg1sLbtRMieAY7tnnizN", "TtkAL");
    }

    public boolean bd() {
        boolean bl2;
        ad llllIIIlIIIIIll;
        if (ad.lIIlIIllI(this.cD) && !ad.lIIlIIlII(this.cD.bb() ? 1 : 0) || ad.lIIlIIllI(llllIIIlIIIIIll.cE) && !ad.lIIlIIlII(llllIIIlIIIIIll.cE.bb() ? 1 : 0) || ad.lIIlIIllI(llllIIIlIIIIIll.cF) && ad.lIIlIIlIl(llllIIIlIIIIIll.cF.bb() ? 1 : 0)) {
            bl2 = lIIlIIl[1];
            "".length();
            if (" ".length() > " ".length()) {
                return ((40 + 120 - 48 + 34 ^ 36 + 18 - -45 + 44) & (101 + 119 - 170 + 141 ^ 10 + 43 - 4 + 113 ^ -" ".length())) != 0;
            }
        } else {
            bl2 = lIIlIIl[0];
        }
        return bl2;
    }

    public boolean bf() {
        int n2;
        if (ad.lIIlIIllI(this.cE) && ad.lIIlIIlIl(this.cE.bb() ? 1 : 0)) {
            n2 = lIIlIIl[1];
            "".length();
            if (-"  ".length() > 0) {
                return ((0x9A ^ 0x81) & ~(0x69 ^ 0x72)) != 0;
            }
        } else {
            n2 = lIIlIIl[0];
        }
        return n2 != 0;
    }

    public ac bj() {
        return this.cF;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        void llllIIIlIIIlIIl;
        if (ad.lIIlIIlII(npcSpawned.getNpc().getName().contains(lIIlIII[lIIlIIl[0]]) ? 1 : 0)) {
            return;
        }
        if (ad.lIIlIIlIl(llllIIIlIIIlIIl.getNpc().getName().equals(lIIlIII[lIIlIIl[1]]) ? 1 : 0)) {
            llllIIIlIIIlIlI.cD = new ab(llllIIIlIIIlIIl.getNpc());
        }
        if (ad.lIIlIIlIl(llllIIIlIIIlIIl.getNpc().getName().equals(lIIlIII[lIIlIIl[2]]) ? 1 : 0)) {
            llllIIIlIIIlIlI.cE = new aa(llllIIIlIIIlIIl.getNpc());
        }
        if (ad.lIIlIIlIl(llllIIIlIIIlIIl.getNpc().getName().equals(lIIlIII[lIIlIIl[3]]) ? 1 : 0)) {
            llllIIIlIIIlIlI.cF = new ac(llllIIIlIIIlIIl.getNpc());
        }
    }

    private static String lIIlIIIII(String llllIIIIlllIIll, String llllIIIIlllIlII) {
        try {
            SecretKeySpec llllIIIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIIIlllIlll = Cipher.getInstance("Blowfish");
            llllIIIIlllIlll.init(lIIlIIl[2], llllIIIIllllIII);
            return new String(llllIIIIlllIlll.doFinal(Base64.getDecoder().decode(llllIIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIIIlllIllI) {
            llllIIIIlllIllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public ad(Client client) {
        this.cC = client;
    }

    private static void lIIlIIIll() {
        lIIlIIl = new int[9];
        ad.lIIlIIl[0] = (160 + 48 - 136 + 92 ^ 167 + 11 - 176 + 184) & (0x44 ^ 0x7C ^ (0x1C ^ 0x3A) ^ -" ".length());
        ad.lIIlIIl[1] = " ".length();
        ad.lIIlIIl[2] = "  ".length();
        ad.lIIlIIl[3] = "   ".length();
        ad.lIIlIIl[4] = 0xA9 ^ 0xC0 ^ (0x28 ^ 0x45);
        ad.lIIlIIl[5] = 0x11 ^ 0x26 ^ (0x43 ^ 0x71);
        ad.lIIlIIl[6] = 89 + 58 - 145 + 163 ^ 151 + 148 - 188 + 52;
        ad.lIIlIIl[7] = 0xB3 ^ 0xB4;
        ad.lIIlIIl[8] = 0xB4 ^ 0xBC;
    }

    private static String lIIIlllll(String llllIIIIlIllIII, String llllIIIIlIlIIlI) {
        llllIIIIlIllIII = new String(Base64.getDecoder().decode(llllIIIIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIIIIlIlIllI = new StringBuilder();
        char[] llllIIIIlIlIlIl = llllIIIIlIlIIlI.toCharArray();
        int llllIIIIlIlIlII = lIIlIIl[0];
        char[] llllIIIIlIIlllI = llllIIIIlIllIII.toCharArray();
        int llllIIIIlIIllIl = llllIIIIlIIlllI.length;
        int llllIIIIlIIllII = lIIlIIl[0];
        while (ad.lIIlIIlll(llllIIIIlIIllII, llllIIIIlIIllIl)) {
            char llllIIIIlIllIIl = llllIIIIlIIlllI[llllIIIIlIIllII];
            llllIIIIlIlIllI.append((char)(llllIIIIlIllIIl ^ llllIIIIlIlIlIl[llllIIIIlIlIlII % llllIIIIlIlIlIl.length]));
            "".length();
            ++llllIIIIlIlIlII;
            ++llllIIIIlIIllII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllIIIIlIlIllI);
    }

    static {
        ad.lIIlIIIll();
        ad.lIIlIIIlI();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        void llllIIIlIIIIlIl;
        if (ad.lIIlIIlII(npcDespawned.getNpc().getName().contains(lIIlIII[lIIlIIl[4]]) ? 1 : 0)) {
            return;
        }
        if (ad.lIIlIIlIl(llllIIIlIIIIlIl.getNpc().getName().equals(lIIlIII[lIIlIIl[5]]) ? 1 : 0)) {
            llllIIIlIIIIllI.cD = null;
            llllIIIlIIIIllI.L += lIIlIIl[1];
        }
        if (ad.lIIlIIlIl(llllIIIlIIIIlIl.getNpc().getName().equals(lIIlIII[lIIlIIl[6]]) ? 1 : 0)) {
            llllIIIlIIIIllI.cE = null;
            llllIIIlIIIIllI.L += lIIlIIl[1];
        }
        if (ad.lIIlIIlIl(llllIIIlIIIIlIl.getNpc().getName().equals(lIIlIII[lIIlIIl[7]]) ? 1 : 0)) {
            llllIIIlIIIIllI.cF = null;
            llllIIIlIIIIllI.L += lIIlIIl[1];
        }
    }

    private static String lIIlIIIIl(String llllIIIIllIIllI, String llllIIIIllIIlll) {
        try {
            SecretKeySpec llllIIIIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIIllIIlll.getBytes(StandardCharsets.UTF_8)), lIIlIIl[8]), "DES");
            Cipher llllIIIIllIlIlI = Cipher.getInstance("DES");
            llllIIIIllIlIlI.init(lIIlIIl[2], llllIIIIllIlIll);
            return new String(llllIIIIllIlIlI.doFinal(Base64.getDecoder().decode(llllIIIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIIIllIlIIl) {
            llllIIIIllIlIIl.printStackTrace();
            return null;
        }
    }

    public int q() {
        return this.L;
    }

    private static boolean lIIlIIllI(Object object) {
        return object != null;
    }

    private static boolean lIIlIIlII(int n2) {
        return n2 == 0;
    }

    public aa bi() {
        return this.cE;
    }

    private static boolean lIIlIIlll(int n2, int n3) {
        return n2 < n3;
    }
}

