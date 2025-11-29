package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Claiming Rewards (Outside)", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cg  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/cg.class */
public class cg extends ck {
    private static /* synthetic */ int[] llIlIIIIIlI;
    private static final /* synthetic */ int hO;
    private static final /* synthetic */ int hP;
    private static /* synthetic */ String[] llIlIIIIIIl;

    private static boolean lIlIIlIIIlIllI(int i) {
        return i != 0;
    }

    private static String lIlIIlIIIlIIII(String llllllllllllllllIIlllIIIlIlllllI, String llllllllllllllllIIlllIIIlIllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIlIllllIl.getBytes(StandardCharsets.UTF_8)), llIlIIIIIlI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIIIIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIIIlIllllll) {
            llllllllllllllllIIlllIIIlIllllll.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIlIIIlIIll();
        lIlIIlIIIlIIlI();
        hO = llIlIIIIIlI[2];
        hP = llIlIIIIIlI[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ck
    public boolean bl() {
        String[] strArr = new String[llIlIIIIIlI[0]];
        strArr[llIlIIIIIlI[1]] = llIlIIIIIIl[llIlIIIIIlI[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIIlIIIlIlII(nearest)) {
            String[] strArr2 = new String[llIlIIIIIlI[0]];
            strArr2[llIlIIIIIlI[1]] = llIlIIIIIIl[llIlIIIIIlI[0]];
            if (!lIlIIlIIIlIlIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                Widget widget = Widgets.get(llIlIIIIIlI[2], llIlIIIIIlI[3]);
                if (lIlIIlIIIlIllI(Widgets.isVisible(widget) ? 1 : 0)) {
                    Log.info(llIlIIIIIIl[llIlIIIIIlI[4]]);
                    widget.interact(llIlIIIIIIl[llIlIIIIIlI[5]]);
                    return llIlIIIIIlI[0];
                }
                Log.info(llIlIIIIIIl[llIlIIIIIlI[3]]);
                nearest.interact(llIlIIIIIIl[llIlIIIIIlI[6]]);
                return llIlIIIIIlI[0];
            }
        }
        return llIlIIIIIlI[1];
    }

    private static boolean lIlIIlIIIlIlll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIlIIIIllll(String llllllllllllllllIIlllIIIlllIIIII, String llllllllllllllllIIlllIIIllIlllll) {
        String llllllllllllllllIIlllIIIlllIIIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIIIlllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIIIllIllllI = new StringBuilder();
        char[] charArray = llllllllllllllllIIlllIIIllIlllll.toCharArray();
        int llllllllllllllllIIlllIIIllIlllII = llIlIIIIIlI[1];
        char[] charArray2 = llllllllllllllllIIlllIIIlllIIIII2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIIIlI[1];
        while (lIlIIlIIIlIlll(i, length)) {
            char llllllllllllllllIIlllIIIlllIIIIl = charArray2[i];
            llllllllllllllllIIlllIIIllIllllI.append((char) (llllllllllllllllIIlllIIIlllIIIIl ^ charArray[llllllllllllllllIIlllIIIllIlllII % charArray.length]));
            "".length();
            llllllllllllllllIIlllIIIllIlllII++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlllIIIllIllllI);
    }

    private static boolean lIlIIlIIIlIlIl(int i) {
        return i == 0;
    }

    private static void lIlIIlIIIlIIlI() {
        llIlIIIIIIl = new String[llIlIIIIIlI[7]];
        llIlIIIIIIl[llIlIIIIIlI[1]] = lIlIIlIIIIllll("OBIgGRwOBHc2BwkfMg==", "jwWxn");
        llIlIIIIIIl[llIlIIIIIlI[0]] = lIlIIlIIIlIIII("/Pu3ZLq7nLo=", "wDJAQ");
        llIlIIIIIIl[llIlIIIIIlI[4]] = lIlIIlIIIlIIIl("EKYCa5gVUXpclsAIBFBIK7vNcMPY+txwolKDGQNE4l1H3V9N6EY0LH1cu3Z18cvR", "FJyuC");
        llIlIIIIIIl[llIlIIIIIlI[5]] = lIlIIlIIIlIIII("SPd08ysBg7eCFxPYTvUXSw==", "EdrDf");
        llIlIIIIIIl[llIlIIIIIlI[3]] = lIlIIlIIIIllll("HxM9EQIpAjQHCjY0IjkfIT0iLUsHPDAZBi0+NlAZIScwAg9kOSUVBjd+f14=", "DPQpk");
        llIlIIIIIIl[llIlIIIIIlI[6]] = lIlIIlIIIlIIIl("Y/OZBJQZ81M=", "rnqUH");
    }

    @Inject
    protected cg(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void lIlIIlIIIlIIll() {
        llIlIIIIIlI = new int[9];
        llIlIIIIIlI[0] = " ".length();
        llIlIIIIIlI[1] = (43 ^ 7) & ((19 ^ 63) ^ (-1));
        llIlIIIIIlI[2] = (-((-2577) & 16053)) & (-73) & 14319;
        llIlIIIIIlI[3] = 93 ^ 89;
        llIlIIIIIlI[4] = "  ".length();
        llIlIIIIIlI[5] = "   ".length();
        llIlIIIIIlI[6] = 194 ^ 199;
        llIlIIIIIlI[7] = (59 ^ 33) ^ (58 ^ 38);
        llIlIIIIIlI[8] = (71 ^ 114) ^ (84 ^ 105);
    }

    private static String lIlIIlIIIlIIIl(String llllllllllllllllIIlllIIIllIIlIll, String llllllllllllllllIIlllIIIllIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIIIIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIIIllIIllII) {
            llllllllllllllllIIlllIIIllIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIlIlII(Object obj) {
        return obj != null;
    }
}
