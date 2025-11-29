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
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Drink Absorption", priority = 19, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.e  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/e.class */
public class e extends Task {
    private static /* synthetic */ String[] lIIIlIIIlIIIl;
    private final /* synthetic */ SquireNightmareZoneConfig G;
    private static /* synthetic */ int[] lIIIlIIIlIlII;
    private final /* synthetic */ SquireNightmareZone F;
    private final /* synthetic */ Client H;
    private /* synthetic */ int I = lIIIlIIIlIlII[0];
    private /* synthetic */ int J = lIIIlIIIlIlII[1];
    private /* synthetic */ boolean K = lIIIlIIIlIlII[2];

    private static boolean lIIllllIlIIIIIl(int i) {
        return i != 0;
    }

    static {
        lIIllllIIllllll();
        lIIllllIIlllIIl();
    }

    private static void lIIllllIIllllll() {
        lIIIlIIIlIlII = new int[9];
        lIIIlIIIlIlII[0] = (-23042) & 23541;
        lIIIlIIIlIlII[1] = (118 ^ 51) ^ (40 ^ 9);
        lIIIlIIIlIlII[2] = ((184 ^ 133) ^ (77 ^ 62)) & (((((70 + 53) - 74) + 164) ^ (((62 + 73) - 82) + 102)) ^ (-" ".length()));
        lIIIlIIIlIlII[3] = (-12289) & 16243;
        lIIIlIIIlIlII[4] = (-((-3921) & 16345)) & (-16387) & 32766;
        lIIIlIIIlIlII[5] = " ".length();
        lIIIlIIIlIlII[6] = "  ".length();
        lIIIlIIIlIlII[7] = "   ".length();
        lIIIlIIIlIlII[8] = 132 ^ 140;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Inject
    public e(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.F = squireNightmareZone;
        this.G = squireNightmareZoneConfig;
        this.H = client;
    }

    private static String lIIllllIIlllIII(String lllllllllllllllIIIlIIIIlIIlIIllI, String lllllllllllllllIIIlIIIIlIIlIIlIl) {
        String lllllllllllllllIIIlIIIIlIIlIIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIlIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIlIIIIlIIlIIlIl.toCharArray();
        int lllllllllllllllIIIlIIIIlIIIlllIl = lIIIlIIIlIlII[2];
        char[] charArray2 = lllllllllllllllIIIlIIIIlIIlIIllI2.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIIIlIlII[2];
        while (lIIllllIlIIIIll(i, length)) {
            char lllllllllllllllIIIlIIIIlIIlIIlll = charArray2[i];
            sb.append((char) (lllllllllllllllIIIlIIIIlIIlIIlll ^ charArray[lllllllllllllllIIIlIIIIlIIIlllIl % charArray.length]));
            "".length();
            lllllllllllllllIIIlIIIIlIIIlllIl++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIllllIIlllIIl() {
        lIIIlIIIlIIIl = new String[lIIIlIIIlIlII[7]];
        lIIIlIIIlIIIl[lIIIlIIIlIlII[2]] = lIIllllIIllIlII("tb1uGfN3GuwD7NBjz/C1Dvbbz+878I9AMeCydzdar04=", "adsja");
        lIIIlIIIlIIIl[lIIIlIIIlIlII[5]] = lIIllllIIllIlll("8Ui99kNgg3I=", "bKdAk");
        lIIIlIIIlIIIl[lIIIlIIIlIlII[6]] = lIIllllIIlllIII("JQ8eLAMUGQQsH0RF", "dmmCq");
    }

    private static boolean lIIllllIlIIIIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    public boolean run() {
        if (!lIIllllIlIIIIII(this.G.absorption()) && !lIIllllIlIIIIII(this.H.isInInstancedRegion() ? 1 : 0)) {
            int lllllllllllllllIIIlIIIIlIlIIllIl = Static.getClient().getVarbitValue(lIIIlIIIlIlII[3]);
            if (lIIllllIlIIIIIl(this.G.overload()) && lIIllllIlIIIIII(lllllllllllllllIIIlIIIIlIlIIllIl)) {
                return lIIIlIIIlIlII[2];
            }
            int lllllllllllllllIIIlIIIIlIlIIllII = Static.getClient().getVarbitValue(lIIIlIIIlIlII[4]);
            if (lIIllllIlIIIIlI(this.J, lllllllllllllllIIIlIIIIlIlIIllII)) {
                this.K = lIIIlIIIlIlII[5];
            }
            if (lIIllllIlIIIIll(this.I, lllllllllllllllIIIlIIIIlIlIIllII)) {
                this.K = lIIIlIIIlIlII[2];
            }
            if (lIIllllIlIIIIII(this.K ? 1 : 0)) {
                return lIIIlIIIlIlII[2];
            }
            Item first = Inventory.getFirst(item -> {
                return item.getName().startsWith(lIIIlIIIlIIIl[lIIIlIIIlIlII[6]]);
            });
            if (lIIllllIlIIIlII(first)) {
                System.out.println(lIIIlIIIlIIIl[lIIIlIIIlIlII[2]]);
                return lIIIlIIIlIlII[2];
            }
            first.interact(lIIIlIIIlIIIl[lIIIlIIIlIlII[5]]);
            return lIIIlIIIlIlII[5];
        }
        return lIIIlIIIlIlII[2];
    }

    private static boolean lIIllllIlIIIIlI(int i, int i2) {
        return i > i2;
    }

    private static String lIIllllIIllIlII(String lllllllllllllllIIIlIIIIlIlIIIIll, String lllllllllllllllIIIlIIIIlIlIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIlIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlIIIIlIlIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlIIIIlIlIIIlIl.init(lIIIlIIIlIlII[6], lllllllllllllllIIIlIIIIlIlIIIllI);
            return new String(lllllllllllllllIIIlIIIIlIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIlIlIIIlII) {
            lllllllllllllllIIIlIIIIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIllllIIllIlll(String lllllllllllllllIIIlIIIIlIIllIllI, String lllllllllllllllIIIlIIIIlIIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIIlIlII[8]), "DES");
            Cipher lllllllllllllllIIIlIIIIlIIlllIII = Cipher.getInstance("DES");
            lllllllllllllllIIIlIIIIlIIlllIII.init(lIIIlIIIlIlII[6], secretKeySpec);
            return new String(lllllllllllllllIIIlIIIIlIIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIlIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIlIIllIlll) {
            lllllllllllllllIIIlIIIIlIIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIlIIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllllIlIIIlII(Object obj) {
        return obj == null;
    }
}
