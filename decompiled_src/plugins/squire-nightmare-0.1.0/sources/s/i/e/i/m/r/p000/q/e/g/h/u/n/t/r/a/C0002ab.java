package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Disturb Nightmare", priority = 250, blocking = false)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ab  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ab.class */
public class C0002ab extends Task {
    private final /* synthetic */ C0011h dG;
    private static /* synthetic */ String[] llllIIIlllIl;
    private final /* synthetic */ SquireNightmareConfig dF;
    private static /* synthetic */ int[] llllIIIllllI;
    private static final /* synthetic */ Logger dE;

    private static String lIIIllllIlIIlII(String lllllllllllllllIIlIlllllIIlIlIll, String lllllllllllllllIIlIlllllIIlIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllllIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlllllIIlIlIlI.toCharArray();
        int lllllllllllllllIIlIlllllIIlIIlll = llllIIIllllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIIllllI[0];
        while (lIIIllllIlIlIlI(i, length)) {
            char lllllllllllllllIIlIlllllIIlIllII = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIlllllIIlIllII ^ charArray[lllllllllllllllIIlIlllllIIlIIlll % charArray.length]));
            "".length();
            lllllllllllllllIIlIlllllIIlIIlll++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIIllllIlIIllI();
        lIIIllllIlIIlIl();
        dE = LoggerFactory.getLogger(C0002ab.class);
    }

    private static String lIIIllllIlIIIlI(String lllllllllllllllIIlIlllllIIlllIll, String lllllllllllllllIIlIlllllIIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllllIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllllIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIllllI[2], lllllllllllllllIIlIlllllIIlllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllllIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllllIIllllII) {
            lllllllllllllllIIlIlllllIIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIlIlIII(int i) {
        return i == 0;
    }

    @Inject
    public C0002ab(SquireNightmareConfig squireNightmareConfig, C0011h c0011h) {
        this.dF = squireNightmareConfig;
        this.dG = c0011h;
    }

    private static boolean lIIIllllIlIIlll(int i) {
        return i != 0;
    }

    private static boolean lIIIllllIlIlIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIIIllllIlIIlIl() {
        llllIIIlllIl = new String[llllIIIllllI[9]];
        llllIIIlllIl[llllIIIllllI[0]] = lIIIllllIlIIIlI("rgXjoxJHRO0=", "fXpse");
        llllIIIlllIl[llllIIIllllI[1]] = lIIIllllIlIIIll("08n77LuAReLOEmN9jRH53jG8HonLpgYiOSizip+rlsGTKysqG5G4EQ==", "oEadb");
        llllIIIlllIl[llllIIIllllI[2]] = lIIIllllIlIIIlI("AT3y+yXEQr0nmhjdrsVbX79QV1v8bC2cG2+1MgwQqxl/dBQsRAcX/g==", "iKemp");
        llllIIIlllIl[llllIIIllllI[3]] = lIIIllllIlIIlII("NQEhEDobNyotJwktPA4vHCAVWW4gKjxDKwAqPQQmTiYkBi8ANi1DKgE2LRA=", "nEHcN");
        llllIIIlllIl[llllIIIllllI[4]] = lIIIllllIlIIlII("EwIdFBk9NBYpBC8uAAoMOiMpXU1oBRgCDCY1EUcJJzURFFdoPQk=", "HFtgm");
        llllIIIlllIl[llllIIIllllI[5]] = lIIIllllIlIIlII("MAYZJzgeMBIaJQwqBDktGSctbmwlLQR0KQUtBTMkSyQfOyg=", "kBpTL");
        llllIIIlllIl[llllIIIllllI[6]] = lIIIllllIlIIlII("HwcLNTIxMQAILyMrFisnNiY/fGYCLA0ifGQ4Hw==", "DCbFF");
        llllIIIlllIl[llllIIIllllI[7]] = lIIIllllIlIIlII("DB4YPD06FQ==", "HwkHH");
    }

    private static boolean lIIIllllIlIlIIl(Object obj) {
        return obj == null;
    }

    private static void lIIIllllIlIIllI() {
        llllIIIllllI = new int[10];
        llllIIIllllI[0] = (31 ^ 66) & ((45 ^ 112) ^ (-1));
        llllIIIllllI[1] = " ".length();
        llllIIIllllI[2] = "  ".length();
        llllIIIllllI[3] = "   ".length();
        llllIIIllllI[4] = (((50 + 129) - 27) + 11) ^ (((86 + 151) - 226) + 156);
        llllIIIllllI[5] = 155 ^ 158;
        llllIIIllllI[6] = (((107 + 36) - 49) + 35) ^ (((5 + 49) - (-63)) + 18);
        llllIIIllllI[7] = (190 ^ 142) ^ (71 ^ 112);
        llllIIIllllI[8] = 17 ^ 3;
        llllIIIllllI[9] = (((135 + 95) - 82) + 16) ^ (((62 + 26) - (-34)) + 50);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    public boolean run() {
        if (!lIIIllllIlIIlll(this.dF.assistantMode() ? 1 : 0) && !lIIIllllIlIlIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            NPC d = SquireNightmarePlugin.d();
            if (lIIIllllIlIlIIl(d)) {
                return llllIIIllllI[0];
            }
            String[] strArr = new String[llllIIIllllI[1]];
            strArr[llllIIIllllI[0]] = llllIIIlllIl[llllIIIllllI[0]];
            if (lIIIllllIlIlIII(d.hasAction(strArr) ? 1 : 0)) {
                return llllIIIllllI[0];
            }
            int b = SquireNightmarePlugin.b();
            int a = SquireNightmarePlugin.a();
            int c = SquireNightmarePlugin.c();
            if (lIIIllllIlIlIII(c) && lIIIllllIlIlIII(this.dF.continueWithNoPots() ? 1 : 0)) {
                dE.info(llllIIIlllIl[llllIIIllllI[1]]);
                dE.info(llllIIIlllIl[llllIIIllllI[2]], Integer.valueOf(c));
                return this.dG.aP();
            } else if (lIIIllllIlIlIlI(a, this.dF.teleportCleanse())) {
                dE.info(llllIIIlllIl[llllIIIllllI[3]]);
                dE.info(llllIIIlllIl[llllIIIllllI[4]], Integer.valueOf(a));
                return this.dG.aP();
            } else if (lIIIllllIlIlIlI(b, this.dF.minimumFood())) {
                dE.info(llllIIIlllIl[llllIIIllllI[5]]);
                dE.info(llllIIIlllIl[llllIIIllllI[6]], Integer.valueOf(b));
                return this.dG.aP();
            } else {
                d.interact(llllIIIlllIl[llllIIIllllI[7]]);
                sleep(llllIIIllllI[8]);
                return llllIIIllllI[1];
            }
        }
        return llllIIIllllI[0];
    }

    private static String lIIIllllIlIIIll(String lllllllllllllllIIlIlllllIlIIIllI, String lllllllllllllllIIlIlllllIlIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllllIlIIIlll.getBytes(StandardCharsets.UTF_8)), llllIIIllllI[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIllllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllllIlIIlIIl) {
            lllllllllllllllIIlIlllllIlIIlIIl.printStackTrace();
            return null;
        }
    }
}
