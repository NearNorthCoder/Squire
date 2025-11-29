package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Banking through butler", priority = 100, blocking = true)
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.k  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/k.class */
public class k extends Task {
    private final /* synthetic */ SquireFisherConfig S;
    private static /* synthetic */ int[] lIlllIllIlIl;
    private final /* synthetic */ Client T;
    private static /* synthetic */ String[] lIlllIllIlII;

    private static void lllIlIllllIIIl() {
        lIlllIllIlII = new String[lIlllIllIlIl[4]];
        lIlllIllIlII[lIlllIllIlIl[0]] = lllIlIllllIIII("xVAlnhlQsIuz1SDtT377lg==", "qVGHK");
        lIlllIllIlII[lIlllIllIlIl[1]] = lllIlIllllIIII("1OQnXVgonAteOqoJ9c+ZUg==", "nbuar");
        lIlllIllIlII[lIlllIllIlIl[8]] = lllIlIllllIIII("1MboGYfQ4GTa+qEPb2I4CItLH8Tw29iK", "sbWmA");
    }

    private void p() {
    }

    private static boolean lllIlIllllIIll(int i2) {
        return i2 != 0;
    }

    @Inject
    public k(SquireFisherConfig squireFisherConfig, Client client) {
        this.S = squireFisherConfig;
        this.T = client;
    }

    private static void lllIlIllllIIlI() {
        lIlllIllIlIl = new int[10];
        lIlllIllIlIl[0] = ((114 ^ 60) ^ (222 ^ 182)) & (((35 ^ 46) ^ (157 ^ 182)) ^ (-" ".length()));
        lIlllIllIlIl[1] = " ".length();
        lIlllIllIlIl[2] = 63 ^ 37;
        lIlllIllIlIl[3] = (-((-8449) & 26510)) & (-10241) & 28671;
        lIlllIllIlIl[4] = "   ".length();
        lIlllIllIlIl[5] = (((168 + 88) - 203) + 116) ^ (((161 + 138) - 140) + 32);
        lIlllIllIlIl[6] = 49 ^ 69;
        lIlllIllIlIl[7] = (43 ^ 108) ^ (55 ^ 111);
        lIlllIllIlIl[8] = "  ".length();
        lIlllIllIlIl[9] = (-28721) & 31862;
    }

    private static boolean lllIlIllllIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllIlIlllllIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    public boolean run() {
        if (!lllIlIllllIIll(this.S.butlerBanking() ? 1 : 0) || lllIlIllllIlII(this.S.fish(), f.KARAMBWAN)) {
            return lIlllIllIlIl[0];
        }
        if (lllIlIllllIlIl(Inventory.isFull() ? 1 : 0)) {
            return lIlllIllIlIl[0];
        }
        if (lllIlIllllIlIl(this.T.isInInstancedRegion() ? 1 : 0)) {
            TeleportLoader.enterHouse();
            "".length();
            return lIlllIllIlIl[1];
        } else if (lllIlIllllIIll(Dialog.isOpen() ? 1 : 0)) {
            if (lllIlIllllIIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount(lIlllIllIlIl[2]);
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return true & ((true ^ true) ^ true);
                }
            } else if (lllIlIllllIIll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                "".length();
                if (0 != 0) {
                    return ((((175 + 93) - 154) + 118) ^ (((149 + 126) - 103) + 2)) & (((((5 + 74) - 4) + 179) ^ (((118 + 44) - 112) + 134)) ^ (-" ".length()));
                }
            } else if (lllIlIllllIIll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption(lIlllIllIlIl[1]);
                "".length();
            }
            return lIlllIllIlIl[1];
        } else {
            String[] strArr = new String[lIlllIllIlIl[1]];
            strArr[lIlllIllIlIl[0]] = lIlllIllIlII[lIlllIllIlIl[0]];
            NPC nearest = NPCs.getNearest(strArr);
            if (!lllIlIllllIllI(Widgets.get(lIlllIllIlIl[3], lIlllIllIlIl[0]))) {
                Widgets.get(lIlllIllIlIl[6], lIlllIllIlIl[7]).interact(lIlllIllIlII[lIlllIllIlIl[8]]);
            } else if (!lllIlIllllIllI(nearest) || lllIlIllllIlll(nearest.distanceTo(Players.getLocal()), lIlllIllIlIl[4])) {
                Widgets.get(lIlllIllIlIl[3], lIlllIllIlIl[5]).interact(lIlllIllIlII[lIlllIllIlIl[1]]);
                "".length();
                if ((-"  ".length()) >= 0) {
                    return ((((158 + 219) - 206) + 65) ^ (((139 + 3) - 94) + 129)) & (((78 ^ 94) ^ (115 ^ 62)) ^ (-" ".length()));
                }
            }
            if (!lllIlIllllIllI(nearest) || lllIlIllllIlll(nearest.distanceTo(Players.getLocal()), lIlllIllIlIl[4])) {
                return lIlllIllIlIl[1];
            }
            int[] iArr = new int[lIlllIllIlIl[1]];
            iArr[lIlllIllIlIl[0]] = lIlllIllIlIl[9];
            Item first = Inventory.getFirst(iArr);
            if (lllIlIlllllIII(first)) {
                return lIlllIllIlIl[0];
            }
            first.useOn(nearest);
            return lIlllIllIlIl[1];
        }
    }

    static {
        lllIlIllllIIlI();
        lllIlIllllIIIl();
    }

    private static boolean lllIlIllllIllI(Object obj) {
        return obj != null;
    }

    private static boolean lllIlIllllIlll(int i2, int i3) {
        return i2 > i3;
    }

    private static String lllIlIllllIIII(String lllllllllllllllIlIlllIlIIlIlllll, String lllllllllllllllIlIlllIlIIlIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIlIIllIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIlIIllIIIIl.init(lIlllIllIlIl[8], secretKeySpec);
            return new String(lllllllllllllllIlIlllIlIIllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIIllIIIII) {
            lllllllllllllllIlIlllIlIIllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllllIlIl(int i2) {
        return i2 == 0;
    }
}
