package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Looting Items", priority = 5, blocking = true)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.D  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/D.class */
public class D extends Task {
    private final /* synthetic */ C0001b aG;
    private static /* synthetic */ int[] lIIlIlIIlIIII;
    private final /* synthetic */ SquireSaraConfig aH;
    private final /* synthetic */ C0003d aF;
    private final /* synthetic */ C0006g aE;
    private static /* synthetic */ String[] lIIlIlIIIlIIl;

    private static boolean lIlIlIllIllIIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIlIllIlIllll(Object obj) {
        return obj == null;
    }

    private static String lIlIlIllIIIllII(String llllllllllllllIlllllIIIIIllIIlIl, String llllllllllllllIlllllIIIIIllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIIIIllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIIIIllIIlll.init(lIIlIlIIlIIII[4], secretKeySpec);
            return new String(llllllllllllllIlllllIIIIIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIIIllIIllI) {
            llllllllllllllIlllllIIIIIllIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIlIlllI(int i) {
        return i == 0;
    }

    static {
        lIlIlIllIlIllIl();
        lIlIlIllIlIllII();
    }

    private static void lIlIlIllIlIllII() {
        lIIlIlIIIlIIl = new String[lIIlIlIIlIIII[9]];
        lIIlIlIIIlIIl[lIIlIlIIlIIII[0]] = lIlIlIllIIIllII("T7dPMt9X7zdqORnilJ2DXw==", "nOLYf");
        lIIlIlIIIlIIl[lIIlIlIIlIIII[2]] = lIlIlIllIIIllII("IwUA+qL8QwA=", "wlhIL");
        lIIlIlIIIlIIl[lIIlIlIIlIIII[4]] = lIlIlIllIIIllII("tqBc+Sym5f0=", "TsXDk");
        lIIlIlIIIlIIl[lIIlIlIIlIIII[5]] = lIlIlIllIIIllII("aYrl+cnbtio=", "eXxbG");
        lIIlIlIIIlIIl[lIIlIlIIlIIII[6]] = lIlIlIllIIIllII("wwG8wh5xq+8=", "VhVsh");
        lIIlIlIIIlIIl[lIIlIlIIlIIII[7]] = lIlIlIllIIIllII("iry1Eb59HVc=", "WiWCA");
        lIIlIlIIIlIIl[lIIlIlIIlIIII[8]] = lIlIlIllIIIllII("+rBNSWpo3k4=", "VFFHE");
    }

    private TileItem W() {
        TileItem orElse = this.aF.i().orElse(null);
        if (lIlIlIllIllIIll(orElse) && lIlIlIllIllIlII(this.aF.a(orElse), lIIlIlIIlIIII[1])) {
            return orElse;
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (lIlIlIllIllIIIl(tileItem.getName().toLowerCase().contains(lIIlIlIIIlIIl[lIIlIlIIlIIII[8]]) ? 1 : 0) && lIlIlIllIllIIIl(Reachable.isInteractable(tileItem) ? 1 : 0)) {
                ?? r0 = lIIlIlIIlIIII[2];
                "".length();
                return "  ".length() == 0 ? ((41 ^ 28) ^ (116 ^ 4)) & (((36 ^ 67) ^ (19 ^ 49)) ^ (-" ".length())) : r0;
            }
            return lIIlIlIIlIIII[0];
        });
        return (lIlIlIllIllIIll(nearest) && lIlIlIllIllIlIl(Combat.getMissingHealth())) ? nearest : orElse;
    }

    private static boolean lIlIlIllIllIlIl(int i) {
        return i > 0;
    }

    @Inject
    public D(C0006g c0006g, C0003d c0003d, C0001b c0001b, SquireSaraConfig squireSaraConfig) {
        this.aE = c0006g;
        this.aF = c0003d;
        this.aG = c0001b;
        this.aH = squireSaraConfig;
    }

    private static boolean lIlIlIllIllIlII(int i, int i2) {
        return i >= i2;
    }

    private static void lIlIlIllIlIllIl() {
        lIIlIlIIlIIII = new int[10];
        lIIlIlIIlIIII[0] = (120 ^ 32) & ((19 ^ 75) ^ (-1));
        lIIlIlIIlIIII[1] = (-2) & Integer.MAX_VALUE;
        lIIlIlIIlIIII[2] = " ".length();
        lIIlIlIIlIIII[3] = 141 ^ 135;
        lIIlIlIIlIIII[4] = "  ".length();
        lIIlIlIIlIIII[5] = "   ".length();
        lIIlIlIIlIIII[6] = 182 ^ 178;
        lIIlIlIIlIIII[7] = 64 ^ 69;
        lIIlIlIIlIIII[8] = (((21 + 50) - (-4)) + 66) ^ (((94 + 78) - 154) + 121);
        lIIlIlIIlIIII[9] = 183 ^ 176;
    }

    private static boolean lIlIlIllIllIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public boolean run() {
        int i;
        if (lIlIlIllIlIlllI(this.aE.m() ? 1 : 0)) {
            return lIIlIlIIlIIII[0];
        }
        TileItem W = W();
        if (lIlIlIllIlIllll(W)) {
            return lIIlIlIIlIIII[0];
        }
        if (lIlIlIllIllIIII(this.aF.a(W), lIIlIlIIlIIII[1])) {
            i = lIIlIlIIlIIII[2];
            "".length();
            if (" ".length() == (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIIlIlIIlIIII[0];
        }
        int llllllllllllllIlllllIIIIIllllIII = i;
        if (lIlIlIllIllIIIl(this.aE.l() ? 1 : 0) && lIlIlIllIllIIIl(llllllllllllllIlllllIIIIIllllIII)) {
            return lIIlIlIIlIIII[0];
        }
        if (!lIlIlIllIllIIIl(llllllllllllllIlllllIIIIIllllIII) || (lIlIlIllIlIlllI(this.aE.o() ? 1 : 0) && !lIlIlIllIllIIIl(Players.getLocal().isMoving() ? 1 : 0))) {
            if (lIlIlIllIllIIIl(llllllllllllllIlllllIIIIIllllIII) && lIlIlIllIllIIlI(this.aE.k(), lIIlIlIIlIIII[3])) {
                return lIIlIlIIlIIII[0];
            }
            if (lIlIlIllIllIIIl(Inventory.isFull() ? 1 : 0)) {
                int[] iArr = new int[lIIlIlIIlIIII[2]];
                iArr[lIIlIlIIlIIII[0]] = W.getId();
                if (!lIlIlIllIllIIIl(Inventory.contains(iArr) ? 1 : 0) || lIlIlIllIlIlllI(W.isStackable() ? 1 : 0)) {
                    String[] strArr = new String[lIIlIlIIlIIII[2]];
                    strArr[lIIlIlIIlIIII[0]] = lIIlIlIIIlIIl[lIIlIlIIlIIII[0]];
                    Item first = Inventory.getFirst(strArr);
                    if (lIlIlIllIllIIll(first)) {
                        first.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[2]]);
                        return lIIlIlIIlIIII[2];
                    }
                    Item g = this.aG.g();
                    if (lIlIlIllIllIIll(g)) {
                        String str = lIIlIlIIIlIIl[lIIlIlIIlIIII[4]];
                        if (lIlIlIllIllIIIl(g.hasAction((v1) -> {
                            return r1.equals(v1);
                        }) ? 1 : 0)) {
                            return lIIlIlIIlIIII[0];
                        }
                        g.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[5]]);
                        return lIIlIlIIlIIII[2];
                    }
                    Item orElse = this.aF.j().orElse(null);
                    if (!lIlIlIllIlIllll(orElse) && !lIlIlIllIlIlllI(this.aF.a(orElse, W) ? 1 : 0)) {
                        orElse.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[6]]);
                    }
                    return lIIlIlIIlIIII[0];
                }
            }
            if (lIlIlIllIllIIIl(Movement.isRunEnabled() ? 1 : 0) && lIlIlIllIllIIIl(this.aH.turnOffRun() ? 1 : 0)) {
                Movement.toggleRun();
            }
            W.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[7]]);
            sleep(lIIlIlIIlIIII[2]);
            return lIIlIlIIlIIII[2];
        }
        return lIIlIlIIlIIII[0];
    }

    private static boolean lIlIlIllIllIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlIllIllIIll(Object obj) {
        return obj != null;
    }
}
