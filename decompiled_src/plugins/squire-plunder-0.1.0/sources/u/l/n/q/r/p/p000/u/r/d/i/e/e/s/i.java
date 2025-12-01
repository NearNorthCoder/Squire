package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
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
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Plundering Chest", priority = 10)
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.i  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/i.class */
public class i extends k {
    private static /* synthetic */ int[] lllllllIIlll;
    private static /* synthetic */ String[] lllllllIIllI;

    private static boolean lIIlIlIlIIIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlIIllllllI(int i) {
        return i == 0;
    }

    @Inject
    protected i(a aVar, Client client) {
        super(aVar, client);
    }

    private static String lIIlIlIIllllIIl(String lllllllllllllllIIlIIllIIIIllIlII, String lllllllllllllllIIlIIllIIIIllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIIllIIll.getBytes(StandardCharsets.UTF_8)), lllllllIIlll[5]), "DES");
            Cipher lllllllllllllllIIlIIllIIIIllIllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIIIIllIllI.init(lllllllIIlll[3], lllllllllllllllIIlIIllIIIIllIlll);
            return new String(lllllllllllllllIIlIIllIIIIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIIIllIlIl) {
            lllllllllllllllIIlIIllIIIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIlllllII() {
        lllllllIIlll = new int[6];
        lllllllIIlll[0] = ((92 ^ 121) ^ (94 ^ 102)) & (((((60 + 6) - (-31)) + 123) ^ (((86 + 105) - 53) + 55)) ^ (-" ".length()));
        lllllllIIlll[1] = " ".length();
        lllllllIIlll[2] = (-((-16931) & 26355)) & (-9) & 30687;
        lllllllIIlll[3] = "  ".length();
        lllllllIIlll[4] = "   ".length();
        lllllllIIlll[5] = (((12 + 32) - (-25)) + 89) ^ (((34 + 12) - 8) + 112);
    }

    private static void lIIlIlIIllllIll() {
        lllllllIIllI = new String[lllllllIIlll[4]];
        lllllllIIllI[lllllllIIlll[0]] = lIIlIlIIllllIII("FTExGjJyBD8YMnIAOBElJg==", "RCPtV");
        lllllllIIllI[lllllllIIlll[1]] = lIIlIlIIllllIIl("x3/Ch2jVgek=", "RkviV");
        lllllllIIllI[lllllllIIlll[3]] = lIIlIlIIllllIlI("pegj2Els8eM=", "njcVK");
    }

    private static String lIIlIlIIllllIlI(String lllllllllllllllIIlIIllIIIIlIIlll, String lllllllllllllllIIlIIllIIIIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIIIIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIIIIlIlIIl.init(lllllllIIlll[3], secretKeySpec);
            return new String(lllllllllllllllIIlIIllIIIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIIIlIlIII) {
            lllllllllllllllIIlIIllIIIIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlllllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIlIIIIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIIlllllll(int i) {
        return i != 0;
    }

    private static String lIIlIlIIllllIII(String lllllllllllllllIIlIIllIIIIIlIlll, String lllllllllllllllIIlIIllIIIIIlIllI) {
        String lllllllllllllllIIlIIllIIIIIlIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIllIIIIIlIllI.toCharArray();
        int lllllllllllllllIIlIIllIIIIIlIIll = lllllllIIlll[0];
        char[] charArray2 = lllllllllllllllIIlIIllIIIIIlIlll2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIIlIIllIIIIIIlIll = lllllllIIlll[0];
        while (lIIlIlIlIIIIIIl(lllllllllllllllIIlIIllIIIIIIlIll, length)) {
            char lllllllllllllllIIlIIllIIIIIllIII = charArray2[lllllllllllllllIIlIIllIIIIIIlIll];
            sb.append((char) (lllllllllllllllIIlIIllIIIIIllIII ^ charArray[lllllllllllllllIIlIIllIIIIIlIIll % charArray.length]));
            "".length();
            lllllllllllllllIIlIIllIIIIIlIIll++;
            lllllllllllllllIIlIIllIIIIIIlIll++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIlIlIIlllllII();
        lIIlIlIIllllIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    @Override // u.l.n.q.r.p.p000.u.r.d.i.e.e.s.k
    public boolean j() {
        c f = c.f();
        if (!lIIlIlIIlllllIl(f) && !lIIlIlIIllllllI(this.D.a(f) ? 1 : 0)) {
            if (lIIlIlIIlllllll(this.D.b(f) ? 1 : 0) && lIIlIlIlIIIIIII(TileObjects.getNearest(tileObject -> {
                if (lIIlIlIIlllllll(this.D.h.contains(Integer.valueOf(tileObject.getActualId())) ? 1 : 0) && lIIlIlIIlllllll(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                    ?? r0 = lllllllIIlll[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllllllIIlll[0];
            }))) {
                return lllllllIIlll[0];
            }
            if (lIIlIlIIlllllll(this.D.c(f) ? 1 : 0)) {
                int[] iArr = new int[lllllllIIlll[1]];
                iArr[lllllllIIlll[0]] = lllllllIIlll[2];
                if (lIIlIlIlIIIIIII(TileObjects.getNearest(iArr))) {
                    return lllllllIIlll[0];
                }
            }
            String[] strArr = new String[lllllllIIlll[1]];
            strArr[lllllllIIlll[0]] = lllllllIIllI[lllllllIIlll[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIIlIlIlIIIIIII(nearest)) {
                String[] strArr2 = new String[lllllllIIlll[1]];
                strArr2[lllllllIIlll[0]] = lllllllIIllI[lllllllIIlll[1]];
                if (!lIIlIlIIllllllI(nearest.hasAction(strArr2) ? 1 : 0)) {
                    nearest.interact(lllllllIIllI[lllllllIIlll[3]]);
                    return lllllllIIlll[1];
                }
            }
            return lllllllIIlll[0];
        }
        return lllllllIIlll[0];
    }
}
