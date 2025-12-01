package y.l.q.i.p000.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Using seers teleport", priority = 100, blocking = true)
/* renamed from: y.l.q.i.-.g.u.s.r.e.t.a.i.i.i  reason: invalid package */
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:y/l/q/i/-/g/u/s/r/e/t/a/i/i/i.class */
public class i extends Task {
    private static /* synthetic */ String[] lIllIIIllII;

    /* renamed from: y  reason: collision with root package name */
    private final /* synthetic */ AgilityConfig f0y;
    private static /* synthetic */ int[] lIllIIIllIl;

    private static boolean lIIlIlIllIIlll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIllIIIll(this.f0y.course(), b.SEERS_VILLAGE) && !lIIlIlIllIIlII(this.f0y.seersTeleport() ? 1 : 0)) {
            Player local = Players.getLocal();
            if (!lIIlIlIllIIlIl(local) || lIIlIlIllIIllI(local.isAnimating() ? 1 : 0)) {
                return lIllIIIllIl[0];
            }
            if (!lIIlIlIllIIllI(local.getPlane()) && !lIIlIlIllIIlll(local.getWorldLocation().distanceTo2D(new WorldPoint(lIllIIIllIl[1], lIllIIIllIl[2], lIllIIIllIl[0])), lIllIIIllIl[3])) {
                Widget widget = Widgets.get(SpellBook.Standard.CAMELOT_TELEPORT.getWidget());
                if (lIIlIlIllIlIII(widget)) {
                    return lIllIIIllIl[0];
                }
                widget.interact(lIllIIIllII[lIllIIIllIl[0]]);
                return lIllIIIllIl[4];
            }
            return lIllIIIllIl[0];
        }
        return lIllIIIllIl[0];
    }

    private static boolean lIIlIlIllIIlII(int i) {
        return i == 0;
    }

    private static void lIIlIlIllIIIlI() {
        lIllIIIllIl = new int[6];
        lIllIIIllIl[0] = ((((45 + 138) - 149) + 113) ^ (((118 + 54) - 84) + 69)) & (((21 ^ 7) ^ (50 ^ 46)) ^ (-" ".length()));
        lIllIIIllIl[1] = (-((-513) & 5643)) & (-24613) & 32447;
        lIllIIIllIl[2] = (-((-2277) & 30957)) & (-2) & 32143;
        lIllIIIllIl[3] = 196 ^ 193;
        lIllIIIllIl[4] = " ".length();
        lIllIIIllIl[5] = "  ".length();
    }

    private static void lIIlIlIllIIIIl() {
        lIllIIIllII = new String[lIllIIIllIl[4]];
        lIllIIIllII[lIllIIIllIl[0]] = lIIlIlIllIIIII("8HoQUOi8xr4=", "bgyCV");
    }

    @Inject
    public i(AgilityConfig agilityConfig) {
        this.f0y = agilityConfig;
    }

    private static boolean lIIlIlIllIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlIllIIllI(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIllIlIII(Object obj) {
        return obj == null;
    }

    private static String lIIlIlIllIIIII(String llllllllllllllllIlIlIlIIIllIlIll, String llllllllllllllllIlIlIlIIIllIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIIIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIlIIIllIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIlIIIllIllIl.init(lIllIIIllIl[5], llllllllllllllllIlIlIlIIIllIlllI);
            return new String(llllllllllllllllIlIlIlIIIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlIIIllIllII) {
            llllllllllllllllIlIlIlIIIllIllII.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIlIllIIIlI();
        lIIlIlIllIIIIl();
    }

    private static boolean lIIlIlIllIIIll(Object obj, Object obj2) {
        return obj != obj2;
    }
}
