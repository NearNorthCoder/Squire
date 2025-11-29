package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
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
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Using special attack", priority = 50)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.m  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/m.class */
public class m extends Task {
    private /* synthetic */ a i;
    private static /* synthetic */ String[] lIIIlIIlIIlll;
    private final /* synthetic */ Client ak;
    private /* synthetic */ boolean f = lIIIlIIlIlIIl[0];
    private final /* synthetic */ SquireNightmareZone ai;
    private final /* synthetic */ SquireNightmareZoneConfig aj;
    private static /* synthetic */ int[] lIIIlIIlIlIIl;

    static {
        lIIlllllIIIIIIl();
        lIIllllIlllllII();
    }

    private static void lIIllllIlllllII() {
        lIIIlIIlIIlll = new String[lIIIlIIlIlIIl[4]];
        lIIIlIIlIIlll[lIIIlIIlIlIIl[0]] = lIIllllIllllIIl("IT8hMA==", "oPOUH");
        lIIIlIIlIIlll[lIIIlIIlIlIIl[1]] = lIIllllIllllIlI("56WKFNaLQUVjky0jFMFwPmJbkH36hNTR", "CnHPV");
        lIIIlIIlIIlll[lIIIlIIlIlIIl[3]] = lIIllllIllllIll("Ac1jbjC+zFIeLCxb2lMdkw==", "ZhJte");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    public boolean run() {
        if (lIIlllllIIIIIlI(this.aj.powerSurge() ? 1 : 0)) {
            return lIIIlIIlIlIIl[0];
        }
        if (lIIlllllIIIIIll(this.aj.specGear().getSelected().equals(lIIIlIIlIIlll[lIIIlIIlIlIIl[0]]) ? 1 : 0)) {
            Log.error(lIIIlIIlIIlll[lIIIlIIlIlIIl[1]]);
            return lIIIlIIlIlIIl[0];
        }
        if (!lIIlllllIIIIIlI(this.ak.isInInstancedRegion() ? 1 : 0) && !lIIlllllIIIIIlI(this.ai.g() ? 1 : 0) && !lIIlllllIIIIIll(Combat.isSpecEnabled() ? 1 : 0) && !lIIlllllIIIIlII(Combat.getSpecEnergy(), lIIIlIIlIlIIl[2])) {
            Combat.toggleSpec();
            System.out.println(lIIIlIIlIIlll[lIIIlIIlIlIIl[3]]);
            return lIIIlIIlIlIIl[1];
        }
        return lIIIlIIlIlIIl[0];
    }

    private static String lIIllllIllllIlI(String lllllllllllllllIIIIlllllllIlIIlI, String lllllllllllllllIIIIlllllllIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllllllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllllllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIlIlIIl[5]), "DES");
            Cipher lllllllllllllllIIIIlllllllIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllllllIlIlII.init(lIIIlIIlIlIIl[3], lllllllllllllllIIIIlllllllIlIlIl);
            return new String(lllllllllllllllIIIIlllllllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllllllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllllllIlIIll) {
            lllllllllllllllIIIIlllllllIlIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Inject
    public m(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ai = squireNightmareZone;
        this.aj = squireNightmareZoneConfig;
        this.ak = client;
    }

    private static boolean lIIlllllIIIIIlI(int i) {
        return i == 0;
    }

    private static boolean lIIlllllIIIIIll(int i) {
        return i != 0;
    }

    private static void lIIlllllIIIIIIl() {
        lIIIlIIlIlIIl = new int[6];
        lIIIlIIlIlIIl[0] = (99 ^ 38) & ((39 ^ 98) ^ (-1));
        lIIIlIIlIlIIl[1] = " ".length();
        lIIIlIIlIlIIl[2] = (((83 + 127) - 168) + 107) ^ (((147 + 114) - 203) + 111);
        lIIIlIIlIlIIl[3] = "  ".length();
        lIIIlIIlIlIIl[4] = "   ".length();
        lIIIlIIlIlIIl[5] = (((34 + 161) - 182) + 163) ^ (((102 + 25) - 0) + 57);
    }

    private static String lIIllllIllllIll(String lllllllllllllllIIIIllllllIlIlIll, String lllllllllllllllIIIIllllllIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIIIIllllllIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllllIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIlIlIIl[3], lllllllllllllllIIIIllllllIllIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIllllllIlIlllI) {
            lllllllllllllllIIIIllllllIlIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIIllllIllllIIl(String lllllllllllllllIIIIlllllllIIIIlI, String lllllllllllllllIIIIllllllIllllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllllllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIllllllIllllll = lllllllllllllllIIIIllllllIllllII.toCharArray();
        int lllllllllllllllIIIIllllllIlllllI = lIIIlIIlIlIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIlIIlIlIIl[0];
        while (lIIlllllIIIIlII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIIIllllllIllllll[lllllllllllllllIIIIllllllIlllllI % lllllllllllllllIIIIllllllIllllll.length]));
            "".length();
            lllllllllllllllIIIIllllllIlllllI++;
            i++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlllllIIIIlII(int i, int i2) {
        return i < i2;
    }
}
