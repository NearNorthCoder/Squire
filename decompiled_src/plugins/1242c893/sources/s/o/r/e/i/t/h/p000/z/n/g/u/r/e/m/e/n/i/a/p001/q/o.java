package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
@TaskDesc(name = "Start Dream", priority = 100, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.o  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/o.class */
public class o extends Task {
    private static /* synthetic */ int[] lIIIlIIIllllI;
    private final /* synthetic */ SquireNightmareZone ao;
    private static /* synthetic */ String[] lIIIlIIIlllIl;
    private final /* synthetic */ SquireNightmareZoneConfig ap;
    private final /* synthetic */ Client aq;

    private static void lIIllllIlIllIlI() {
        lIIIlIIIllllI = new int[9];
        lIIIlIIIllllI[0] = ((202 ^ 145) ^ (89 ^ 17)) & (((147 ^ 129) ^ " ".length()) ^ (-" ".length()));
        lIIIlIIIllllI[1] = " ".length();
        lIIIlIIIllllI[2] = "  ".length();
        lIIIlIIIllllI[3] = "   ".length();
        lIIIlIIIllllI[4] = (39 ^ 85) ^ (105 ^ 31);
        lIIIlIIIllllI[5] = 32 ^ 37;
        lIIIlIIIllllI[6] = (82 ^ 3) ^ (192 ^ 151);
        lIIIlIIIllllI[7] = (197 ^ 129) ^ (244 ^ 183);
        lIIIlIIIllllI[8] = 69 ^ 77;
    }

    @Inject
    public o(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ao = squireNightmareZone;
        this.ap = squireNightmareZoneConfig;
        this.aq = client;
    }

    private static String lIIllllIlIlIlll(String lllllllllllllllIIIlIIIIIlIIIlllI, String lllllllllllllllIIIlIIIIIlIIIllIl) {
        String lllllllllllllllIIIlIIIIIlIIIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIlIIIIIlIIIlIll = lllllllllllllllIIIlIIIIIlIIIllIl.toCharArray();
        int lllllllllllllllIIIlIIIIIlIIIlIlI = lIIIlIIIllllI[0];
        char[] charArray = lllllllllllllllIIIlIIIIIlIIIlllI2.toCharArray();
        int lllllllllllllllIIIlIIIIIlIIIIIll = charArray.length;
        int i = lIIIlIIIllllI[0];
        while (lIIllllIlIlllIl(i, lllllllllllllllIIIlIIIIIlIIIIIll)) {
            char lllllllllllllllIIIlIIIIIlIIIllll = charArray[i];
            sb.append((char) (lllllllllllllllIIIlIIIIIlIIIllll ^ lllllllllllllllIIIlIIIIIlIIIlIll[lllllllllllllllIIIlIIIIIlIIIlIlI % lllllllllllllllIIIlIIIIIlIIIlIll.length]));
            "".length();
            lllllllllllllllIIIlIIIIIlIIIlIlI++;
            i++;
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIllllIlIllIll(int i) {
        return i != 0;
    }

    private static String lIIllllIlIllIII(String lllllllllllllllIIIlIIIIIIllIllII, String lllllllllllllllIIIlIIIIIIllIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIIIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIIllllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIIIllIllIl) {
            lllllllllllllllIIIlIIIIIIllIllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIllllIlIllIlI();
        lIIllllIlIllIIl();
    }

    private static boolean lIIllllIlIlllII(Object obj) {
        return obj == null;
    }

    private static void lIIllllIlIllIIl() {
        lIIIlIIIlllIl = new String[lIIIlIIIllllI[7]];
        lIIIlIIIlllIl[lIIIlIIIllllI[0]] = lIIllllIlIlIllI("v0Jdfpx3/G8=", "pfUoS");
        lIIIlIIIlllIl[lIIIlIIIllllI[1]] = lIIllllIlIlIlll("NQ05", "lhJJF");
        lIIIlIIIlllIl[lIIIlIIIllllI[2]] = lIIllllIlIllIII("jkZLvIY/xhvuLJ1C/28qmaQSIQupLtkK", "YcqKl");
        lIIIlIIIlllIl[lIIIlIIIllllI[3]] = lIIllllIlIlIlll("JxsdASYYHAs=", "wixwO");
        lIIIlIIIlllIl[lIIIlIIIllllI[4]] = lIIllllIlIlIlll("LCQJOwQBKEQdBAEkCg==", "hKdRj");
        lIIIlIIIlllIl[lIIIlIIIllllI[5]] = lIIllllIlIlIllI("HyBgAT4cd6Q=", "tnGVk");
        lIIIlIIIlllIl[lIIIlIIIllllI[6]] = lIIllllIlIlIlll("JAgjPi8bDzU=", "tzFHF");
    }

    private static String lIIllllIlIlIllI(String lllllllllllllllIIIlIIIIIIllllIIl, String lllllllllllllllIIIlIIIIIIllllIII) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIIIllllIII.getBytes(StandardCharsets.UTF_8)), lIIIlIIIllllI[8]), "DES");
            Cipher lllllllllllllllIIIlIIIIIIllllIll = Cipher.getInstance("DES");
            lllllllllllllllIIIlIIIIIIllllIll.init(lIIIlIIIllllI[2], lllllllllllllllIIIlIIIIIIlllllII);
            return new String(lllllllllllllllIIIlIIIIIIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIIIllllIlI) {
            lllllllllllllllIIIlIIIIIIllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIlIlllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    public boolean run() {
        if (!lIIllllIlIllIll(this.aq.isInInstancedRegion() ? 1 : 0) && !lIIllllIlIllIll(Static.getClient().getVarbitValue(b.u))) {
            if (lIIllllIlIllIll(Dialog.canContinue() ? 1 : 0)) {
                return lIIIlIIIllllI[1];
            }
            if (lIIllllIlIllIll(Dialog.isViewingOptions() ? 1 : 0) && lIIllllIlIllIll(Dialog.hasOption(lIIIlIIIlllIl[lIIIlIIIllllI[0]]) ? 1 : 0)) {
                System.out.println("Option text:" + Dialog.getText());
                String[] strArr = new String[lIIIlIIIllllI[1]];
                strArr[lIIIlIIIllllI[0]] = lIIIlIIIlllIl[lIIIlIIIllllI[1]];
                Dialog.chooseOption(strArr);
                "".length();
                return lIIIlIIIllllI[1];
            } else if (lIIllllIlIllIll(Dialog.isOpen() ? 1 : 0) && lIIllllIlIllIll(Dialog.hasOption(str -> {
                return str.startsWith(lIIIlIIIlllIl[lIIIlIIIllllI[6]]);
            }) ? 1 : 0)) {
                System.out.println(lIIIlIIIlllIl[lIIIlIIIllllI[2]]);
                String[] strArr2 = new String[lIIIlIIIllllI[1]];
                strArr2[lIIIlIIIllllI[0]] = lIIIlIIIlllIl[lIIIlIIIllllI[3]];
                Dialog.chooseOption(strArr2);
                "".length();
                return lIIIlIIIllllI[1];
            } else {
                String[] strArr3 = new String[lIIIlIIIllllI[1]];
                strArr3[lIIIlIIIllllI[0]] = lIIIlIIIlllIl[lIIIlIIIllllI[4]];
                NPC nearest = NPCs.getNearest(strArr3);
                if (lIIllllIlIlllII(nearest)) {
                    return lIIIlIIIllllI[0];
                }
                nearest.interact(lIIIlIIIlllIl[lIIIlIIIllllI[5]]);
                return lIIIlIIIllllI[1];
            }
        }
        return lIIIlIIIllllI[0];
    }
}
