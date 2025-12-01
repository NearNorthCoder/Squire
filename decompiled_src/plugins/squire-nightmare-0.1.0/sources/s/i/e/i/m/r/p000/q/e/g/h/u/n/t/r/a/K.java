package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.game.ItemVariationMapping;
@TaskDesc(name = "Recharging sang", priority = 1200, blocking = true, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.K  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/K.class */
public class K extends N {
    private static /* synthetic */ int[] llllIlIIIIII;
    private static /* synthetic */ String[] llllIIllllll;

    private static void lIIlIIIIIlIIIII() {
        llllIlIIIIII = new int[7];
        llllIlIIIIII[0] = (-10245) & 32567;
        llllIlIIIIII[1] = (-2371) & 2935;
        llllIlIIIIII[2] = "   ".length();
        llllIlIIIIII[3] = (143 ^ 132) & ((94 ^ 85) ^ (-1));
        llllIlIIIIII[4] = "  ".length();
        llllIlIIIIII[5] = " ".length();
        llllIlIIIIII[6] = 85 ^ 93;
    }

    @Inject
    public K(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
        this.dp = ItemVariationMapping.getVariations(llllIlIIIIII[0]);
        this.dq = Map.of(Integer.valueOf(llllIlIIIIII[1]), Integer.valueOf(llllIlIIIIII[2]));
        this.dr = List.of(Integer.valueOf(llllIlIIIIII[1]));
        this.f0do = this.dp.size() + this.dr.size();
    }

    private static boolean lIIlIIIIIlIIIlI(int i) {
        return i == 0;
    }

    private static boolean lIIlIIIIIlIIIIl(int i) {
        return i != 0;
    }

    private static String lIIlIIIIIIlllIl(String lllllllllllllllIIlIllIllllllIIIl, String lllllllllllllllIIlIllIllllllIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllllllIIII.getBytes(StandardCharsets.UTF_8)), llllIlIIIIII[6]), "DES");
            Cipher lllllllllllllllIIlIllIllllllIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIllllllIIll.init(llllIlIIIIII[4], lllllllllllllllIIlIllIllllllIlII);
            return new String(lllllllllllllllIIlIllIllllllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIllllllIIlI) {
            lllllllllllllllIIlIllIllllllIIlI.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIIIIIlIIIII();
        lIIlIIIIIIllllI();
    }

    private static void lIIlIIIIIIllllI() {
        llllIIllllll = new String[llllIlIIIIII[5]];
        llllIIllllll[llllIlIIIIII[3]] = lIIlIIIIIIlllIl("yjYKOT09B8bQNnOWsyqYgF2dyUzDb9qMNLGOELYRBAvBhvbOFDIH8niggrKdziMm", "lFOTF");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIlIIIIIlIIIIl(this.cV.useFireSpells() ? 1 : 0) && !lIIlIIIIIlIIIlI(this.cW.n() ? 1 : 0) && !lIIlIIIIIlIIIIl(this.cW.ae() ? 1 : 0)) {
            if (lIIlIIIIIlIIIIl(this.dp.contains(ca()) ? 1 : 0)) {
                String str = llllIIllllll[llllIlIIIIII[3]];
                Object[] objArr = new Object[llllIlIIIIII[4]];
                objArr[llllIlIIIIII[3]] = ca();
                objArr[llllIlIIIIII[5]] = this.dp;
                Log.info(str, objArr);
                return llllIlIIIIII[3];
            }
            return cf();
        }
        return llllIlIIIIII[3];
    }
}
