package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Restoring in POH", priority = 1100, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.J  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/J.class */
public class J extends Task {
    private static /* synthetic */ int[] llllIllIllll;
    private static /* synthetic */ String[] llllIllIllIl;
    private final /* synthetic */ SquireNightmareConfig dh;
    private final /* synthetic */ SquireNightmarePlugin dg;
    private static final /* synthetic */ Logger df;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    public boolean run() {
        if (!lIIlIIIlllIIIIl(this.dg.ae() ? 1 : 0) && !lIIlIIIlllIIIlI(this.dh.restoreInPOH() ? 1 : 0) && !lIIlIIIlllIIIll(Game.getState(), GameState.LOGGED_IN) && !lIIlIIIlllIIlII(SquireNightmarePlugin.d())) {
            if (lIIlIIIlllIIIlI(House.isPoolDrinkUseful() ? 1 : 0)) {
                if (lIIlIIIlllIIIIl(this.dg.l() ? 1 : 0)) {
                    df.info(llllIllIllIl[llllIllIllll[0]]);
                    this.dg.m();
                    "".length();
                    return llllIllIllll[1];
                }
                return llllIllIllll[0];
            } else if (lIIlIIIlllIIIlI(Movement.shouldWalk() ? 1 : 0)) {
                return llllIllIllll[0];
            } else {
                if (lIIlIIIlllIIIIl(Prayers.anyActive() ? 1 : 0)) {
                    Prayers.disableAll();
                    return llllIllIllll[1];
                }
                return House.drinkFromPool();
            }
        }
        return llllIllIllll[0];
    }

    private static boolean lIIlIIIlllIIlII(Object obj) {
        return obj != null;
    }

    private static String lIIlIIIllIlllIl(String lllllllllllllllIIlIlIllIlIllIllI, String lllllllllllllllIIlIlIllIlIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIlIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIlIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIllIlIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIllIlIlllIII.init(llllIllIllll[2], lllllllllllllllIIlIlIllIlIlllIIl);
            return new String(lllllllllllllllIIlIlIllIlIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIllIlIllIlll) {
            lllllllllllllllIIlIlIllIlIllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIlllIIIII() {
        llllIllIllll = new int[3];
        llllIllIllll[0] = ((203 ^ 168) ^ (56 ^ 86)) & (((((108 + 11) - 79) + 106) ^ (((80 + 39) - 60) + 100)) ^ (-" ".length()));
        llllIllIllll[1] = " ".length();
        llllIllIllll[2] = "  ".length();
    }

    private static boolean lIIlIIIlllIIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIIIlllIIIlI(int i) {
        return i == 0;
    }

    static {
        lIIlIIIlllIIIII();
        lIIlIIIllIllllI();
        df = LoggerFactory.getLogger(J.class);
    }

    private static boolean lIIlIIIlllIIIIl(int i) {
        return i != 0;
    }

    @Inject
    public J(SquireNightmarePlugin squireNightmarePlugin, SquireNightmareConfig squireNightmareConfig) {
        this.dg = squireNightmarePlugin;
        this.dh = squireNightmareConfig;
    }

    private static void lIIlIIIllIllllI() {
        llllIllIllIl = new String[llllIllIllll[1]];
        llllIllIllIl[llllIllIllll[0]] = lIIlIIIllIlllIl("UDelWVaj4yiNKMGU7lHODHRje1hWiRiH6sue4rlnUKnn7g+UuYemGQj6By6y2so6", "ZkLIq");
    }
}
