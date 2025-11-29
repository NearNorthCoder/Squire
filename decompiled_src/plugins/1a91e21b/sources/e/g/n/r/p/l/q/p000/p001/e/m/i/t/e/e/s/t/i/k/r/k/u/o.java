package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "RewardHandlerTask", priority = 10, blocking = true)
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.o  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/o.class */
public class o extends Task {
    private static /* synthetic */ int[] lIIllIlIIIIlI;
    private static /* synthetic */ String[] lIIllIlIIIIII;
    private final /* synthetic */ String[] N;
    private final /* synthetic */ TempleTrekkingConfig M;
    private final /* synthetic */ TempleTrekkingPlugin L;

    private static void lIllIIIIIlIlIIl() {
        lIIllIlIIIIlI = new int[18];
        lIIllIlIIIIlI[0] = 79 ^ 72;
        lIIllIlIIIIlI[1] = (135 ^ 199) & ((112 ^ 48) ^ (-1));
        lIIllIlIIIIlI[2] = " ".length();
        lIIllIlIIIIlI[3] = "  ".length();
        lIIllIlIIIIlI[4] = "   ".length();
        lIIllIlIIIIlI[5] = (45 ^ 74) ^ (127 ^ 28);
        lIIllIlIIIIlI[6] = (187 ^ 138) ^ (164 ^ 144);
        lIIllIlIIIIlI[7] = (0 ^ 110) ^ (85 ^ 61);
        lIIllIlIIIIlI[8] = 70 ^ 78;
        lIIllIlIIIIlI[9] = 77 ^ 68;
        lIIllIlIIIIlI[10] = (-1698) & 1971;
        lIIllIlIIIIlI[11] = 188 ^ 183;
        lIIllIlIIIIlI[12] = (((26 + 85) - 86) + 149) ^ (((154 + 120) - 191) + 81);
        lIIllIlIIIIlI[13] = (((140 + 62) - 20) + 3) ^ (((13 + 135) - 99) + 132);
        lIIllIlIIIIlI[14] = (((155 + 186) - 249) + 108) ^ (((56 + 21) - 29) + 149);
        lIIllIlIIIIlI[15] = (16 ^ 92) ^ (33 ^ 99);
        lIIllIlIIIIlI[16] = (7 ^ 118) ^ (92 ^ 34);
        lIIllIlIIIIlI[17] = 105 ^ 121;
    }

    static {
        lIllIIIIIlIlIIl();
        lIllIIIIIlIIlll();
    }

    @Inject
    public o(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        String[] strArr = new String[lIIllIlIIIIlI[0]];
        strArr[lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[1]];
        strArr[lIIllIlIIIIlI[2]] = lIIllIlIIIIII[lIIllIlIIIIlI[2]];
        strArr[lIIllIlIIIIlI[3]] = lIIllIlIIIIII[lIIllIlIIIIlI[3]];
        strArr[lIIllIlIIIIlI[4]] = lIIllIlIIIIII[lIIllIlIIIIlI[4]];
        strArr[lIIllIlIIIIlI[5]] = lIIllIlIIIIII[lIIllIlIIIIlI[5]];
        strArr[lIIllIlIIIIlI[6]] = lIIllIlIIIIII[lIIllIlIIIIlI[6]];
        strArr[lIIllIlIIIIlI[7]] = lIIllIlIIIIII[lIIllIlIIIIlI[7]];
        this.N = strArr;
        this.L = templeTrekkingPlugin;
        this.M = templeTrekkingConfig;
    }

    private static boolean lIllIIIIIlIlIlI(int i) {
        return i == 0;
    }

    private static boolean lIllIIIIIlIlIll(int i) {
        return i != 0;
    }

    private static String lIllIIIIIlIIIll(String llllllllllllllIlllIllllllllllIlI, String llllllllllllllIlllIllllllllllIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllllllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllllllllllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllllllllllII.init(lIIllIlIIIIlI[3], llllllllllllllIlllIlllllllllllIl);
            return new String(llllllllllllllIlllIlllllllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllllllllIll) {
            llllllllllllllIlllIllllllllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIlIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIIIIIlIIIIl(String llllllllllllllIlllIlllllllIlIlIl, String llllllllllllllIlllIlllllllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllllIlIlII.getBytes(StandardCharsets.UTF_8)), lIIllIlIIIIlI[8]), "DES");
            Cipher llllllllllllllIlllIlllllllIlIlll = Cipher.getInstance("DES");
            llllllllllllllIlllIlllllllIlIlll.init(lIIllIlIIIIlI[3], secretKeySpec);
            return new String(llllllllllllllIlllIlllllllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllllllIlIllI) {
            llllllllllllllIlllIlllllllIlIllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIlIIlll() {
        lIIllIlIIIIII = new String[lIIllIlIIIIlI[17]];
        lIIllIlIIIIII[lIIllIlIIIIlI[1]] = lIllIIIIIlIIIIl("P9Mb9kiSFTTgRx7edIvPoA==", "wefeo");
        lIIllIlIIIIII[lIIllIlIIIIlI[2]] = lIllIIIIIlIIIll("ot3wFWWo3qBbYZwdl2MwbA==", "oJrLc");
        lIIllIlIIIIII[lIIllIlIIIIlI[3]] = lIllIIIIIlIIIll("jpuxL87v/4ejhWyP+Bl7kA==", "dPfcF");
        lIIllIlIIIIII[lIIllIlIIIIlI[4]] = lIllIIIIIlIIllI("JDEBAx4OeBsFHQw=", "iXojp");
        lIIllIlIIIIII[lIIllIlIIIIlI[5]] = lIllIIIIIlIIllI("GyYWCgM6agMcCy0=", "HJwsf");
        lIIllIlIIIIII[lIIllIlIIIIlI[6]] = lIllIIIIIlIIllI("Ejw5CxkvOjdOGyk5NQ==", "FTPno");
        lIIllIlIIIIII[lIIllIlIIIIlI[7]] = lIllIIIIIlIIIll("otvxfnLdQ7UIPi8kpD3R7bYq2aviZb7z", "AnnyD");
        lIIllIlIIIIII[lIIllIlIIIIlI[0]] = lIllIIIIIlIIIIl("sG8HIoB+/XI=", "Kshye");
        lIIllIlIIIIII[lIIllIlIIIIlI[8]] = lIllIIIIIlIIIIl("ybkyE67tbtiG+LCg8PUguw==", "sQwjF");
        lIIllIlIIIIII[lIIllIlIIIIlI[9]] = lIllIIIIIlIIIll("ywMgaw0tHWURwC8rphnjLw==", "bwqiT");
        lIIllIlIIIIII[lIIllIlIIIIlI[12]] = lIllIIIIIlIIllI("JzQjBx0NNiVOAgEvIxwUFw==", "dXBnp");
        lIIllIlIIIIII[lIIllIlIIIIlI[11]] = lIllIIIIIlIIIll("qoy9QvvmIBs=", "PQMWq");
        lIIllIlIIIIII[lIIllIlIIIIlI[13]] = lIllIIIIIlIIIIl("rPrpTRBd3GHZAa3NA0G1Id6GSWWbTP6K", "DZlNX");
        lIIllIlIIIIII[lIIllIlIIIIlI[14]] = lIllIIIIIlIIllI("Ij8BICIKKQ==", "fZuAK");
        lIIllIlIIIIII[lIIllIlIIIIlI[15]] = lIllIIIIIlIIllI("HQARAxg8F1QEHyYVBgsQMRU=", "Rptmq");
        lIIllIlIIIIII[lIIllIlIIIIlI[16]] = lIllIIIIIlIIIll("UnsTye5qEdc=", "erATz");
    }

    private static boolean lIllIIIIIlIllII(Object obj) {
        return obj != null;
    }

    private static String lIllIIIIIlIIllI(String llllllllllllllIlllIllllllllIlIlI, String llllllllllllllIlllIllllllllIlIIl) {
        String llllllllllllllIlllIllllllllIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllllllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllllllllIlIII = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllllllllIlIIl.toCharArray();
        int llllllllllllllIlllIllllllllIIllI = lIIllIlIIIIlI[1];
        char[] charArray2 = llllllllllllllIlllIllllllllIlIlI2.toCharArray();
        int llllllllllllllIlllIlllllllIlllll = charArray2.length;
        int i = lIIllIlIIIIlI[1];
        while (lIllIIIIIlIlllI(i, llllllllllllllIlllIlllllllIlllll)) {
            char llllllllllllllIlllIlllllllIlllIl = charArray2[i];
            llllllllllllllIlllIllllllllIlIII.append((char) (llllllllllllllIlllIlllllllIlllIl ^ charArray[llllllllllllllIlllIllllllllIIllI % charArray.length]));
            "".length();
            llllllllllllllIlllIllllllllIIllI++;
            i++;
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIllllllllIlIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    public boolean run() {
        if (lIllIIIIIlIlIlI(this.M.bankXPTomes() ? 1 : 0) && lIllIIIIIlIlIll(Inventory.contains(this.N) ? 1 : 0)) {
            Item first = Inventory.getFirst(this.N);
            if (lIllIIIIIlIllII(first)) {
                first.interact(lIIllIlIIIIII[lIIllIlIIIIlI[0]]);
                return lIIllIlIIIIlI[2];
            }
        }
        String[] strArr = new String[lIIllIlIIIIlI[2]];
        strArr[lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[8]];
        if (lIllIIIIIlIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
            return lIIllIlIIIIlI[1];
        }
        String[] strArr2 = new String[lIIllIlIIIIlI[2]];
        strArr2[lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[9]];
        Item first2 = Inventory.getFirst(strArr2);
        if (lIllIIIIIlIllII(first2)) {
            Widget widget = Widgets.get(lIIllIlIIIIlI[10], lIIllIlIIIIlI[11]);
            if (lIllIIIIIlIllII(widget) && lIllIIIIIlIlIll(widget.isVisible() ? 1 : 0)) {
                System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[12]]);
                widget.interact(lIIllIlIIIIII[lIIllIlIIIIlI[11]]);
                return lIIllIlIIIIlI[2];
            }
            Widget widget2 = Widgets.get(lIIllIlIIIIlI[10], lIIllIlIIIIlI[7], this.M.reward().x());
            if (lIllIIIIIlIllII(widget2)) {
                System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[13]]);
                widget2.interact(lIIllIlIIIIII[lIIllIlIIIIlI[14]]);
                return lIIllIlIIIIlI[2];
            }
            System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[15]]);
            first2.interact(lIIllIlIIIIII[lIIllIlIIIIlI[16]]);
            return lIIllIlIIIIlI[2];
        }
        return lIIllIlIIIIlI[1];
    }
}
