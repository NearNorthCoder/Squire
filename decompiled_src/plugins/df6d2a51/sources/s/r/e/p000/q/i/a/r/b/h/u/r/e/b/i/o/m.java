package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import squire.gg.hunter.SquireHerbiboarConfig;
@TaskDesc(name = "Drinking stamina potion", priority = 1)
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.m  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/m.class */
public class m extends Task {
    @Inject
    private /* synthetic */ SquireHerbiboarConfig p;
    private static /* synthetic */ String[] lllIIllIllII;
    private static /* synthetic */ int[] lllIIllIllIl;

    private static void lIIIlIlIllIIIlI() {
        lllIIllIllIl = new int[4];
        lllIIllIllIl[0] = (246 ^ 197) & ((159 ^ 172) ^ (-1));
        lllIIllIllIl[1] = 174 ^ 156;
        lllIIllIllIl[2] = "  ".length();
        lllIIllIllIl[3] = " ".length();
    }

    private static String lIIIlIlIllIIIII(String lllllllllllllllIIllIIllllIllllII, String lllllllllllllllIIllIIllllIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIllIllIl[2], lllllllllllllllIIllIIllllIllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIllllIllllIl) {
            lllllllllllllllIIllIIllllIllllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    public boolean run() {
        if (lIIIlIlIllIIIll(this.p.useEnergyRestoration(), e.NONE)) {
            return lllIIllIllIl[0];
        }
        Item first = Inventory.getFirst(this.p.useEnergyRestoration().j());
        if (!lIIIlIlIllIIlII(first) && !lIIIlIlIllIIlIl(Movement.isWalking() ? 1 : 0)) {
            if (lIIIlIlIllIIllI(Movement.getRunEnergy(), lllIIllIllIl[1]) && lIIIlIlIllIIlIl(Movement.isStaminaBoosted() ? 1 : 0)) {
                first.interact(lllIIllIllII[lllIIllIllIl[0]]);
                sleep(lllIIllIllIl[2]);
                return lllIIllIllIl[3];
            }
            return lllIIllIllIl[0];
        }
        return lllIIllIllIl[0];
    }

    private static boolean lIIIlIlIllIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIlIllIIlII(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlIlIllIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIlIlIllIIlIl(int i) {
        return i == 0;
    }

    static {
        lIIIlIlIllIIIlI();
        lIIIlIlIllIIIIl();
    }

    private static void lIIIlIlIllIIIIl() {
        lllIIllIllII = new String[lllIIllIllIl[3]];
        lllIIllIllII[lllIIllIllIl[0]] = lIIIlIlIllIIIII("oxE76ttOoTg=", "cFlAV");
    }
}
