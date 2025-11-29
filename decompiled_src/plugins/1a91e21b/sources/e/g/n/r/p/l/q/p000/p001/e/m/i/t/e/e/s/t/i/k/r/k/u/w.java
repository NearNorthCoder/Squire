package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Handling evade")
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.w  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/w.class */
public class w extends x {
    private static /* synthetic */ int[] lIIllIIllIIII;
    private static /* synthetic */ String[] lIIllIIlIllII;

    static {
        lIlIlllllllIIII();
        lIlIllllllIllII();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected w(TempleTrekkingPlugin templeTrekkingPlugin) {
        super(templeTrekkingPlugin, r2);
        int[] iArr = new int[lIIllIIllIIII[0]];
        iArr[lIIllIIllIIII[1]] = lIIllIIllIIII[2];
        iArr[lIIllIIllIIII[2]] = lIIllIIllIIII[3];
        iArr[lIIllIIllIIII[3]] = lIIllIIllIIII[4];
        iArr[lIIllIIllIIII[4]] = lIIllIIllIIII[5];
        iArr[lIIllIIllIIII[5]] = lIIllIIllIIII[6];
        iArr[lIIllIIllIIII[6]] = lIIllIIllIIII[7];
        iArr[lIIllIIllIIII[7]] = lIIllIIllIIII[8];
        iArr[lIIllIIllIIII[9]] = lIIllIIllIIII[10];
    }

    private static void lIlIlllllllIIII() {
        lIIllIIllIIII = new int[11];
        lIIllIIllIIII[0] = (((8 + 153) - 113) + 126) ^ (((141 + 49) - 101) + 77);
        lIIllIIllIIII[1] = (141 ^ 164) & ((238 ^ 199) ^ (-1));
        lIIllIIllIIII[2] = " ".length();
        lIIllIIllIIII[3] = "  ".length();
        lIIllIIllIIII[4] = "   ".length();
        lIIllIIllIIII[5] = 84 ^ 80;
        lIIllIIllIIII[6] = 143 ^ 138;
        lIIllIIllIIII[7] = (249 ^ 163) ^ (6 ^ 90);
        lIIllIIllIIII[8] = 69 ^ 79;
        lIIllIIllIIII[9] = (172 ^ 179) ^ (138 ^ 146);
        lIIllIIllIIII[10] = 52 ^ 56;
    }

    private static void lIlIllllllIllII() {
        lIIllIIlIllII = new String[lIIllIIllIIII[3]];
        lIIllIIlIllII[lIIllIIllIIII[1]] = lIlIllllllIlIlI("o+Ryy2ktRop21Te22hrf6w==", "LUFFM");
        lIIllIIlIllII[lIIllIIllIIII[2]] = lIlIllllllIlIlI("sJugYyqFum+1iVkqJ3SJLg==", "MSiYi");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.x
    public boolean z() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            String[] strArr = new String[lIIllIIllIIII[2]];
            strArr[lIIllIIllIIII[1]] = lIIllIIlIllII[lIIllIIllIIII[2]];
            return tileObject.hasAction(strArr);
        });
        if (lIlIlllllllIIIl(nearest)) {
            return lIIllIIllIIII[1];
        }
        nearest.interact(lIIllIIlIllII[lIIllIIllIIII[1]]);
        return lIIllIIllIIII[2];
    }

    private static String lIlIllllllIlIlI(String llllllllllllllIllllIIIIlIlIIIlII, String llllllllllllllIllllIIIIlIlIIIIll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIlIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIllIIII[3], llllllllllllllIllllIIIIlIlIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIlIlIIIlIl) {
            llllllllllllllIllllIIIIlIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllllllIIIl(Object obj) {
        return obj == null;
    }
}
