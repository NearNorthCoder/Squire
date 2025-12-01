package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

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
import javax.inject.Inject;
import net.runelite.client.game.ItemVariationMapping;
@TaskDesc(name = "Recharging trident", priority = 1200, blocking = true, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.O  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/O.class */
public class O extends N {
    private static /* synthetic */ int[] llllIIlIIIlI;
    private static /* synthetic */ String[] llllIIlIIIIl;

    private static boolean lIIIllllIllIlll(int i) {
        return i == 0;
    }

    private static String lIIIllllIllIIll(String lllllllllllllllIIlIllllIllIlIlll, String lllllllllllllllIIlIllllIllIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIlIIIlI[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllllIllIllIII) {
            lllllllllllllllIIlIllllIllIllIII.printStackTrace();
            return null;
        }
    }

    static {
        lIIIllllIllIlIl();
        lIIIllllIllIlII();
    }

    private static void lIIIllllIllIlIl() {
        llllIIlIIIlI = new int[9];
        llllIIlIIIlI[0] = (-((-16995) & 19447)) & (-17417) & 32767;
        llllIIlIIIlI[1] = (-((-10881) & 12258)) & (-18441) & 32751;
        llllIIlIIIlI[2] = " ".length();
        llllIIlIIIlI[3] = (-14670) & 15229;
        llllIIlIIIlI[4] = (-4109) & 4670;
        llllIIlIIIlI[5] = (-((-2354) & 31027)) & (-133) & 29359;
        llllIIlIIIlI[6] = (115 ^ 62) ^ (86 ^ 30);
        llllIIlIIIlI[7] = ((152 ^ 176) ^ ((105 ^ 63) & ((104 ^ 62) ^ (-1)))) & (((((77 + 104) - 132) + 105) ^ (((51 + 32) - 57) + 152)) ^ (-" ".length()));
        llllIIlIIIlI[8] = "  ".length();
    }

    private static void lIIIllllIllIlII() {
        llllIIlIIIIl = new String[llllIIlIIIlI[2]];
        llllIIlIIIIl[llllIIlIIIlI[7]] = lIIIllllIllIIll("z84v8uQvTIXxOJ/TXW0IiARs0hjoA+DTY2fNhmmFCYv1RK6nnfteCetpYxPV4cvI", "JFWAw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIIllllIllIllI(this.cV.useFireSpells() ? 1 : 0) && !lIIIllllIllIlll(this.cW.n() ? 1 : 0) && !lIIIllllIllIllI(this.cW.ae() ? 1 : 0)) {
            if (lIIIllllIllIllI(this.dp.contains(ca()) ? 1 : 0)) {
                String str = llllIIlIIIIl[llllIIlIIIlI[7]];
                Object[] objArr = new Object[llllIIlIIIlI[8]];
                objArr[llllIIlIIIlI[7]] = ca();
                objArr[llllIIlIIIlI[2]] = this.dp;
                Log.info(str, objArr);
                return llllIIlIIIlI[7];
            }
            return cf();
        }
        return llllIIlIIIlI[7];
    }

    private static boolean lIIIllllIllIllI(int i) {
        return i != 0;
    }

    @Inject
    public O(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
        this.dp = ItemVariationMapping.getVariations(llllIIlIIIlI[0]);
        this.dq = Map.of(Integer.valueOf(llllIIlIIIlI[1]), Integer.valueOf(llllIIlIIIlI[2]), Integer.valueOf(llllIIlIIIlI[3]), Integer.valueOf(llllIIlIIIlI[2]), Integer.valueOf(llllIIlIIIlI[4]), Integer.valueOf(llllIIlIIIlI[2]), Integer.valueOf(llllIIlIIIlI[5]), Integer.valueOf(llllIIlIIIlI[6]));
        this.dr = List.of(Integer.valueOf(llllIIlIIIlI[1]), Integer.valueOf(llllIIlIIIlI[5]), Integer.valueOf(llllIIlIIIlI[3]), Integer.valueOf(llllIIlIIIlI[4]));
        this.f0do = this.dp.size() + this.dr.size();
    }
}
