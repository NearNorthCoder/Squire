package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Walking to nightmare", priority = 10, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.aD  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/aD.class */
public class aD extends D {
    private static /* synthetic */ String[] lllIllIlllll;
    private static final /* synthetic */ Logger eL;
    private static /* synthetic */ int[] lllIlllIIIII;

    @Inject
    protected aD(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    private static boolean lIIIllIllIIlIll(int i) {
        return i == 0;
    }

    private static String lIIIllIllIIIlll(String lllllllllllllllIIllIIlIlIlllIlIl, String lllllllllllllllIIllIIlIlIlllIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIlIlllIIll = new StringBuilder();
        char[] lllllllllllllllIIllIIlIlIlllIIlI = lllllllllllllllIIllIIlIlIlllIlII.toCharArray();
        int lllllllllllllllIIllIIlIlIlllIIIl = lllIlllIIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlllIIIII[0];
        while (lIIIllIllIIllIl(i, length)) {
            lllllllllllllllIIllIIlIlIlllIIll.append((char) (charArray[i] ^ lllllllllllllllIIllIIlIlIlllIIlI[lllllllllllllllIIllIIlIlIlllIIIl % lllllllllllllllIIllIIlIlIlllIIlI.length]));
            "".length();
            lllllllllllllllIIllIIlIlIlllIIIl++;
            i++;
            "".length();
            if ((((((86 + 149) - 173) + 116) ^ (((171 + 135) - 192) + 68)) & (((((99 + 108) - 103) + 52) ^ (((139 + 135) - 190) + 68)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIlIlIlllIIll);
    }

    private static void lIIIllIllIIlIIl() {
        lllIlllIIIII = new int[4];
        lllIlllIIIII[0] = (70 ^ 6) & ((100 ^ 36) ^ (-1));
        lllIlllIIIII[1] = (91 ^ 113) ^ (137 ^ 175);
        lllIlllIIIII[2] = " ".length();
        lllIlllIIIII[3] = "  ".length();
    }

    private static void lIIIllIllIIlIII() {
        lllIllIlllll = new String[lllIlllIIIII[3]];
        lllIllIlllll[lllIlllIIIII[0]] = lIIIllIllIIIllI("hHlRsWukYTxiNR0Y9vchsTUH4B9ZuT3hDyUs2v07KtyD6hvanUceKv2Kd1aqjGME", "QYrlS");
        lllIllIlllll[lllIlllIIIII[2]] = lIIIllIllIIIlll("CQwAB1U2BU8lHD4LGwYUKwYc", "Ycoku");
    }

    static {
        lIIIllIllIIlIIl();
        lIIIllIllIIlIII();
        eL = LoggerFactory.getLogger(aD.class);
    }

    private static String lIIIllIllIIIllI(String lllllllllllllllIIllIIlIlIllIIIII, String lllllllllllllllIIllIIlIlIlIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIlIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIlIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIlIllIIIlI.init(lllIlllIIIII[3], secretKeySpec);
            return new String(lllllllllllllllIIllIIlIlIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIlIllIIIIl) {
            lllllllllllllllIIllIIlIlIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIllIIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllIllIIllII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllIllIIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIIllIllIIlIlI(this.cW.ae() ? 1 : 0) && !lIIIllIllIIlIlI(this.cW.s() ? 1 : 0) && !lIIIllIllIIlIlI(this.cW.ad() ? 1 : 0) && !lIIIllIllIIlIll(Movement.shouldWalk() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                return tileObject.getName().contains(lllIllIlllll[lllIlllIIIII[2]]);
            });
            Player local = Players.getLocal();
            if (lIIIllIllIIllII(nearest) && lIIIllIllIIllIl(local.distanceTo(nearest), lllIlllIIIII[1])) {
                Log.info(lllIllIlllll[lllIlllIIIII[0]]);
                return lllIlllIIIII[0];
            }
            Movement.walkTo(cU);
            "".length();
            return lllIlllIIIII[2];
        }
        return lllIlllIIIII[0];
    }
}
