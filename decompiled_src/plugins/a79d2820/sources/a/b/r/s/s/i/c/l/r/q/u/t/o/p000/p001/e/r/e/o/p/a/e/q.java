package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Entering corp lair")
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.q  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/q.class */
public class q extends a {
    private static /* synthetic */ int[] lIlIllllIllI;
    private static /* synthetic */ String[] lIlIllllIlIl;
    @Inject
    private /* synthetic */ SquireCorp p;
    private static final /* synthetic */ int w;
    private static final /* synthetic */ int v;

    private static boolean lllIIIlIIllllI(int i) {
        return i <= 0;
    }

    private static boolean lllIIIlIIlllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIIlIIlllIl(Object obj) {
        return obj == null;
    }

    private static void lllIIIlIIllIII() {
        lIlIllllIlIl = new String[lIlIllllIllI[2]];
        lIlIllllIlIl[lIlIllllIllI[0]] = lllIIIlIIlIlll("fg1gjqcxi8P7+2R1UAIKgQ==", "zdena");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    public boolean run() {
        if (lllIIIlIIllIlI(g() ? 1 : 0)) {
            return lIlIllllIllI[0];
        }
        NPC f = f();
        if (lllIIIlIIllIll(f) && lllIIIlIIlllII(Reachable.isInteractable(f) ? 1 : 0)) {
            if (lllIIIlIIlllII(f.isDead() ? 1 : 0)) {
                this.p.b(lIlIllllIllI[0]);
                sleep(lIlIllllIllI[1]);
            }
            return lIlIllllIllI[0];
        } else if (lllIIIlIIlllII(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption(lIlIllllIllI[2]);
            "".length();
            sleep(lIlIllllIllI[3]);
            return lIlIllllIllI[2];
        } else {
            int[] iArr = new int[lIlIllllIllI[2]];
            iArr[lIlIllllIllI[0]] = lIlIllllIllI[4];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lllIIIlIIllIll(nearest) && lllIIIlIIllIlI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIllllIllI[2]];
                iArr2[lIlIllllIllI[0]] = lIlIllllIllI[5];
                TileObject nearest2 = TileObjects.getNearest(iArr2);
                if (lllIIIlIIlllIl(nearest2)) {
                    return lIlIllllIllI[0];
                }
                nearest2.interact(lIlIllllIlIl[lIlIllllIllI[0]]);
                return lIlIllllIllI[2];
            } else if (lllIIIlIIlllIl(nearest)) {
                return lIlIllllIllI[0];
            } else {
                if (!lllIIIlIIlllII(Players.getLocal().getWorldLocation().equals(nearest.getWorldLocation()) ? 1 : 0)) {
                    Movement.setDestination(nearest.getWorldLocation());
                    return lIlIllllIllI[2];
                }
                if (!lllIIIlIIllllI(Combat.getMissingHealth()) || lllIIIlIIlllll(Combat.getSpecEnergy(), lIlIllllIllI[6])) {
                    TeleportLoader.enterHouse();
                    "".length();
                }
                return lIlIllllIllI[0];
            }
        }
    }

    private static boolean lllIIIlIIllIlI(int i) {
        return i == 0;
    }

    private static void lllIIIlIIllIIl() {
        lIlIllllIllI = new int[8];
        lIlIllllIllI[0] = (9 ^ 0) & ((91 ^ 82) ^ (-1));
        lIlIllllIllI[1] = 171 ^ 161;
        lIlIllllIllI[2] = " ".length();
        lIlIllllIllI[3] = "  ".length();
        lIlIllllIllI[4] = (-((-21) & 24926)) & (-3089) & 28669;
        lIlIllllIllI[5] = (-((-8753) & 14195)) & (-10241) & 16359;
        lIlIllllIllI[6] = (216 ^ 145) ^ (100 ^ 73);
        lIlIllllIllI[7] = (((39 + 30) - 54) + 128) ^ (((101 + 11) - 97) + 120);
    }

    static {
        lllIIIlIIllIIl();
        lllIIIlIIllIII();
        w = lIlIllllIllI[5];
        v = lIlIllllIllI[4];
    }

    private static boolean lllIIIlIIllIll(Object obj) {
        return obj != null;
    }

    private static String lllIIIlIIlIlll(String lllllllllllllllIllIIIlllIIIllIll, String lllllllllllllllIllIIIlllIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIIIlllIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlllIIIllIlI.getBytes(StandardCharsets.UTF_8)), lIlIllllIllI[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllllIllI[3], lllllllllllllllIllIIIlllIIIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlllIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIlllIIIlllII) {
            lllllllllllllllIllIIIlllIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIlllII(int i) {
        return i != 0;
    }
}
