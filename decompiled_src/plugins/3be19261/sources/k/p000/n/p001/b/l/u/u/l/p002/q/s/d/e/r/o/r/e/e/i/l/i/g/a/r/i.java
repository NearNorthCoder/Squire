package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Flicking Prayer", priority = 15)
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.i  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/i.class */
public class i extends Task {
    private static /* synthetic */ String[] lIIlllIlIlIl;
    private static /* synthetic */ int[] lIIlllIlIllI;
    private final /* synthetic */ SquireBlueDragonKiller D;
    private final /* synthetic */ SquireBlueDragonKillerConfig E;

    private static void llIlIIIIlllIII() {
        lIIlllIlIllI = new int[3];
        lIIlllIlIllI[0] = (101 ^ 74) & ((189 ^ 146) ^ (-1));
        lIIlllIlIllI[1] = " ".length();
        lIIlllIlIllI[2] = "  ".length();
    }

    private static boolean llIlIIIIllllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIlIIIIllIllI(String lllllllllllllllIlllIlIlIlllIlllI, String lllllllllllllllIlllIlIlIlllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIlIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIlllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIlIllllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIlIllllIIII.init(lIIlllIlIllI[2], lllllllllllllllIlllIlIlIllllIIIl);
            return new String(lllllllllllllllIlllIlIlIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIlIlllIllll) {
            lllllllllllllllIlllIlIlIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIIlllIll(int i) {
        return i != 0;
    }

    private static boolean llIlIIIIlllIIl(int i) {
        return i == 0;
    }

    private static boolean llIlIIIIlllIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public boolean run() {
        List magePrayers;
        if (!llIlIIIIlllIIl(this.E.flickPrayer() ? 1 : 0) && !llIlIIIIlllIIl(Prayers.getPoints())) {
            Actor interacting = Players.getLocal().getInteracting();
            if (llIlIIIIlllIlI(interacting)) {
                String[] strArr = new String[lIIlllIlIllI[1]];
                strArr[lIIlllIlIllI[0]] = lIIlllIlIlIl[lIIlllIlIllI[0]];
                if (!llIlIIIIlllIIl(interacting.hasAction(strArr) ? 1 : 0)) {
                    if (llIlIIIIllllII(this.E.attackStyle(), c.MELEE)) {
                        magePrayers = Prayers.getMeleePrayer();
                        "".length();
                        if (" ".length() < 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else if (llIlIIIIllllII(this.E.attackStyle(), c.RANGE)) {
                        magePrayers = Prayers.getRangePrayers();
                        "".length();
                        if ("   ".length() == 0) {
                            return ((141 ^ 189) ^ (25 ^ 113)) & (((((211 + 157) - 292) + 161) ^ (((86 + 157) - 66) + 4)) ^ (-" ".length()));
                        }
                    } else {
                        magePrayers = Prayers.getMagePrayers();
                    }
                    return Prayers.flick(magePrayers);
                }
            }
            if (llIlIIIIlllIll(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIIlllIlIllI[1];
            }
            return lIIlllIlIllI[0];
        }
        return lIIlllIlIllI[0];
    }

    static {
        llIlIIIIlllIII();
        llIlIIIIllIlll();
    }

    @Inject
    public i(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.D = squireBlueDragonKiller;
        this.E = squireBlueDragonKillerConfig;
    }

    private static void llIlIIIIllIlll() {
        lIIlllIlIlIl = new String[lIIlllIlIllI[1]];
        lIIlllIlIlIl[lIIlllIlIllI[0]] = llIlIIIIllIllI("ADMe8PaGZBw=", "gpSSH");
    }
}
