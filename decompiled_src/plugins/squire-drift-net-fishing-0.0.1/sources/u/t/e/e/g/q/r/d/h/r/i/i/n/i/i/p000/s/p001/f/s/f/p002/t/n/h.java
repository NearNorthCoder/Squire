package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.driftnet.SquireDriftNetConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Placing net", priority = 15, blocking = true)
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.h  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/h.class */
public class h extends Task {
    private final /* synthetic */ Client F;
    private static /* synthetic */ String[] lIlIIIIIllII;
    private static /* synthetic */ int[] lIlIIIIIllIl;
    private static final /* synthetic */ int E;
    private final /* synthetic */ SquireDriftNetConfig G;
    private static final /* synthetic */ int D;

    private static String llIlIIllIllIII(String lllllllllllllllIlllIlIIIIIlIlIII, String lllllllllllllllIlllIlIIIIIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIIIlIIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllIl[9]), "DES");
            Cipher lllllllllllllllIlllIlIIIIIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIIIIlIlIlI.init(lIlIIIIIllIl[2], lllllllllllllllIlllIlIIIIIlIlIll);
            return new String(lllllllllllllllIlllIlIIIIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIIIlIlIIl) {
            lllllllllllllllIlllIlIIIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static String llIlIIllIllIIl(String lllllllllllllllIlllIlIIIIIIllIll, String lllllllllllllllIlllIlIIIIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIIIIlllIl.init(lIlIIIIIllIl[2], lllllllllllllllIlllIlIIIIIIllllI);
            return new String(lllllllllllllllIlllIlIIIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIIIIlllII) {
            lllllllllllllllIlllIlIIIIIIlllII.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIllIlllIl();
        llIlIIllIllIll();
        D = lIlIIIIIllIl[4];
        E = lIlIIIIIllIl[5];
    }

    private static boolean llIlIIllIlllll(int i) {
        return i != 0;
    }

    private static boolean llIlIIlllIIIII(Object obj) {
        return obj != null;
    }

    private static void llIlIIllIllIll() {
        lIlIIIIIllII = new String[lIlIIIIIllIl[8]];
        lIlIIIIIllII[lIlIIIIIllIl[0]] = llIlIIllIlIlll("NCwWcBwX", "gIbPi");
        lIlIIIIIllII[lIlIIIIIllIl[6]] = llIlIIllIlIlll("IikZDx0ZLxoNSQYjHRgNUS8HSg4eLxoNSR4oVQ==", "qFtji");
        lIlIIIIIllII[lIlIIIIIllIl[2]] = llIlIIllIllIII("+OR0cxGQZKKAIgsrkE63BwvHkyvFgVfA", "WUOeS");
        lIlIIIIIllII[lIlIIIIIllIl[7]] = llIlIIllIllIIl("B4RecTgplPM=", "qisNg");
    }

    private static void llIlIIllIlllIl() {
        lIlIIIIIllIl = new int[10];
        lIlIIIIIllIl[0] = (60 ^ 7) & ((46 ^ 21) ^ (-1));
        lIlIIIIIllIl[1] = (-129) & 735;
        lIlIIIIIllIl[2] = "  ".length();
        lIlIIIIIllIl[3] = (((57 + 133) - 133) + 108) ^ (((125 + 67) - 51) + 27);
        lIlIIIIIllIl[4] = (-8260) & 14071;
        lIlIIIIIllIl[5] = (-((-2278) & 18671)) & (-2113) & 24319;
        lIlIIIIIllIl[6] = " ".length();
        lIlIIIIIllIl[7] = "   ".length();
        lIlIIIIIllIl[8] = (47 ^ 111) ^ (116 ^ 48);
        lIlIIIIIllIl[9] = 21 ^ 29;
    }

    @Inject
    public h(Client client, SquireDriftNetConfig squireDriftNetConfig) {
        this.F = client;
        this.G = squireDriftNetConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    public boolean run() {
        if (llIlIIllIllllI(this.F.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIllIl[0];
        }
        if (llIlIIllIlllll(this.G.depositFish() ? 1 : 0) && llIlIIlllIIIII(Widgets.get(lIlIIIIIllIl[1], lIlIIIIIllIl[2], lIlIIIIIllIl[3]))) {
            return lIlIIIIIllIl[0];
        }
        int varbitValue = Static.getClient().getVarbitValue(lIlIIIIIllIl[4]);
        int varbitValue2 = Static.getClient().getVarbitValue(lIlIIIIIllIl[5]);
        if (llIlIIllIlllll(varbitValue) && llIlIIllIlllll(varbitValue2)) {
            return lIlIIIIIllIl[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIlIIllIlllll(tileObject.getName().equals(lIlIIIIIllII[lIlIIIIIllIl[2]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIIIllIl[6]];
                strArr[lIlIIIIIllIl[0]] = lIlIIIIIllII[lIlIIIIIllIl[7]];
                if (llIlIIllIlllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIllIl[6];
                    "".length();
                    return 0 != 0 ? ((108 ^ 81) ^ (239 ^ 142)) & (((((213 + 81) - 244) + 178) ^ (((128 + 87) - 207) + 176)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIIIIllIl[0];
        });
        if (llIlIIlllIIIII(nearest)) {
            nearest.interact(lIlIIIIIllII[lIlIIIIIllIl[0]]);
            return lIlIIIIIllIl[6];
        }
        Log.error(lIlIIIIIllII[lIlIIIIIllIl[6]]);
        return lIlIIIIIllIl[0];
    }

    private static boolean llIlIIlllIIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIIllIllllI(int i) {
        return i == 0;
    }

    private static String llIlIIllIlIlll(String lllllllllllllllIlllIlIIIIIllllIl, String lllllllllllllllIlllIlIIIIIllllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlllIlIIIIIlllIlI = lllllllllllllllIlllIlIIIIIllllII.toCharArray();
        int lllllllllllllllIlllIlIIIIIlllIIl = lIlIIIIIllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIllIl[0];
        while (llIlIIlllIIIIl(i, length)) {
            char lllllllllllllllIlllIlIIIIIlllllI = charArray[i];
            sb.append((char) (lllllllllllllllIlllIlIIIIIlllllI ^ lllllllllllllllIlllIlIIIIIlllIlI[lllllllllllllllIlllIlIIIIIlllIIl % lllllllllllllllIlllIlIIIIIlllIlI.length]));
            "".length();
            lllllllllllllllIlllIlIIIIIlllIIl++;
            i++;
            "".length();
            if ((((((64 + 71) - 97) + 121) ^ (((78 + 72) - (-1)) + 10)) & (((((224 + 171) - 334) + 188) ^ (((172 + 85) - 249) + 191)) ^ (-" ".length()))) >= ((((68 + 58) - 109) + 124) ^ (((92 + 97) - 56) + 4))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
