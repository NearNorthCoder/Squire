package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.game.ItemVariationMapping;
@TaskDesc(name = "Recharging Shadow (rich)", priority = 1200, blocking = true, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.M  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/M.class */
public class M extends N {
    private static /* synthetic */ int[] llllIlIlIlll;
    private static /* synthetic */ String[] llllIlIlIllI;

    private static boolean lIIlIIIlIIIIlIl(int i) {
        return i != 0;
    }

    static {
        lIIlIIIlIIIIlII();
        lIIlIIIlIIIIIll();
    }

    private static String lIIlIIIlIIIIIII(String lllllllllllllllIIlIllIIlIllIllll, String lllllllllllllllIIlIllIIlIllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIlIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIlIlllIIII) {
            lllllllllllllllIIlIllIIlIlllIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIlIIIlIIIIlIl(this.cV.useFireSpells() ? 1 : 0) && !lIIlIIIlIIIIllI(this.cW.n() ? 1 : 0) && !lIIlIIIlIIIIlIl(this.cW.ae() ? 1 : 0)) {
            if (lIIlIIIlIIIIlIl(this.dp.contains(ca()) ? 1 : 0)) {
                String str = llllIlIlIllI[llllIlIlIlll[5]];
                Object[] objArr = new Object[llllIlIlIlll[2]];
                objArr[llllIlIlIlll[5]] = ca();
                objArr[llllIlIlIlll[6]] = this.dp;
                Log.info(str, objArr);
                return llllIlIlIlll[5];
            }
            return cf();
        }
        return llllIlIlIlll[5];
    }

    @Inject
    public M(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
        this.dp = ItemVariationMapping.getVariations(llllIlIlIlll[0]);
        this.dq = Map.of(Integer.valueOf(llllIlIlIlll[1]), Integer.valueOf(llllIlIlIlll[2]), Integer.valueOf(llllIlIlIlll[3]), Integer.valueOf(llllIlIlIlll[4]));
        this.dr = List.of(Integer.valueOf(llllIlIlIlll[1]), Integer.valueOf(llllIlIlIlll[3]));
        this.f0do = this.dp.size() + this.dr.size();
    }

    private static void lIIlIIIlIIIIIll() {
        llllIlIlIllI = new String[llllIlIlIlll[6]];
        llllIlIlIllI[llllIlIlIlll[5]] = lIIlIIIlIIIIIII("WI1HzYNpPHgUFJFWgxkHoTPpajcwOSs1tR6RkNuoaIxxdHtlSDcvar+ML+m4uB23", "azDHH");
    }

    private static void lIIlIIIlIIIIlII() {
        llllIlIlIlll = new int[7];
        llllIlIlIlll[0] = (-((-559) & 1839)) & (-4161) & 32715;
        llllIlIlIlll[1] = (-4554) & 5119;
        llllIlIlIlll[2] = "  ".length();
        llllIlIlIlll[3] = (-32137) & 32698;
        llllIlIlIlll[4] = 185 ^ 188;
        llllIlIlIlll[5] = ((((46 + 164) - 83) + 57) ^ (((48 + 14) - 50) + 160)) & (((223 ^ 150) ^ (33 ^ 124)) ^ (-" ".length()));
        llllIlIlIlll[6] = " ".length();
    }

    private static boolean lIIlIIIlIIIIllI(int i) {
        return i == 0;
    }
}
