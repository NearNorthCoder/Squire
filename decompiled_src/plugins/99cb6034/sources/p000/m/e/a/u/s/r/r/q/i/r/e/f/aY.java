package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Harvesting crops", priority = 5, blocking = true, register = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aY  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aY.class */
public class aY extends aX {
    private /* synthetic */ boolean cG;
    private /* synthetic */ int cI;
    private /* synthetic */ N cH;
    private /* synthetic */ int cL;
    private /* synthetic */ Player cO;
    private /* synthetic */ int cN;
    private /* synthetic */ boolean cK;
    private static /* synthetic */ int[] lIllllIlllll;
    private /* synthetic */ int cJ;
    private static /* synthetic */ String[] lIllllIlIlII;
    private final /* synthetic */ ExecutorService cE;
    private /* synthetic */ boolean cM;
    private /* synthetic */ int cF;
    private /* synthetic */ int cP;
    private final /* synthetic */ Client cD;

    @Inject
    public aY(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client, ExecutorService executorService) {
        super(c0031f, squireFarmerConfig, client, c0014an -> {
            if (lllIllllIIIlIl(c0014an.aZ(), EnumC0039n.HARVESTABLE)) {
                ?? r0 = lIllllIlllll[3];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllllIlllll[1];
        });
        this.cF = lIllllIlllll[0];
        this.cI = lIllllIlllll[1];
        this.cJ = lIllllIlllll[2];
        this.cP = lIllllIlllll[3];
        this.cD = client;
        this.cE = executorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        if (lllIllllIIIIIl(itemContainerChanged.getItemContainer(), this.cD.getItemContainer(InventoryID.INVENTORY))) {
            return;
        }
        int tickCount = this.cD.getTickCount();
        if (lllIllllIIIllI(tickCount - lIllllIlllll[3], this.cN) && lllIllllIIIIlI(tickCount - this.cI, lIllllIlllll[7])) {
            this.cG = lIllllIlllll[3];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        } else if (lllIllllIIIlll(tickCount - this.cN, this.cP)) {
            this.cG = lIllllIlllll[1];
        }
        this.cN = tickCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v31, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aX
    public boolean J(N n) {
        int i;
        TileObject b = n.b(this.cD);
        if (lllIlllIlllllI(Inventory.isFull() ? 1 : 0) && lllIlllIllllll(b) && !lllIlllIlllllI(b.hasAction(N.br) ? 1 : 0)) {
            this.cO = Players.getLocal();
            if (lllIllllIIIIII(this.cO.getAnimation(), lIllllIlllll[0]) && lllIllllIIIIIl(n.aL(), P.HERB)) {
                return lIllllIlllll[1];
            }
            int[] iArr = new int[lIllllIlllll[3]];
            iArr[lIllllIlllll[1]] = lIllllIlllll[4];
            Item first = Inventory.getFirst(iArr);
            if (lllIlllIllllll(first)) {
                first.interact(lIllllIlIlII[lIllllIlllll[1]]);
                return lIllllIlllll[3];
            }
            int[] iArr2 = new int[lIllllIlllll[3]];
            iArr2[lIllllIlllll[1]] = lIllllIlllll[5];
            Item first2 = Inventory.getFirst(iArr2);
            if (lllIlllIllllll(first2)) {
                first2.interact(lIllllIlIlII[lIllllIlllll[3]]);
            }
            if (!lllIllllIIIIlI(b.distanceTo(this.cO), lIllllIlllll[6])) {
                this.cH = n;
                return a(n, tileObject -> {
                    tileObject.interact(N.br);
                });
            }
            P aL = n.aL();
            if (lllIllllIIIIll(this.cG ? 1 : 0) && lllIllllIIIIlI(this.cD.getTickCount() - this.cI, lIllllIlllll[7])) {
                return lIllllIlllll[1];
            }
            TileObject b2 = n.b(this.cD);
            if (lllIllllIIIlII(b2)) {
                return lIllllIlllll[1];
            }
            this.cE.submit(() -> {
                int nextInt;
                if (!lllIllllIIIIIl(aL, P.ALLOTMENT) || lllIllllIIIlIl(aL, P.HERB)) {
                    nextInt = Rand.nextInt(lIllllIlllll[9], lIllllIlllll[10]);
                    "".length();
                    if ((-" ".length()) > 0) {
                        return;
                    }
                } else {
                    nextInt = lIllllIlllll[3];
                }
                int i2 = nextInt;
                do {
                    b2.interact(lIllllIlllll[1]);
                    Time.sleep(Rand.nextInt(lIllllIlllll[11], lIllllIlllll[12]));
                    "".length();
                } while (!lllIlllIlllllI(Players.getLocal().isMoving() ? 1 : 0));
                int lllllllllllllllIlIllIIIllIlIllIl = lIllllIlllll[1];
                while (lllIllllIIlIII(lllllllllllllllIlIllIIIllIlIllIl, i2)) {
                    b2.interact(lIllllIlllll[1]);
                    Time.sleep(Rand.nextInt(lIllllIlllll[11], lIllllIlllll[12]));
                    "".length();
                    lllllllllllllllIlIllIIIllIlIllIl++;
                    "".length();
                    if ((true ^ true) & ((true ^ true) ^ true)) {
                        return;
                    }
                }
            });
            "".length();
            if (lllIllllIIIlIl(aL, P.ALLOTMENT)) {
                i = lIllllIlllll[3];
                "".length();
                if ((-((((12 + 112) - 44) + 62) ^ (((18 + 93) - 63) + 90))) > 0) {
                    return ((170 ^ 134) ^ (143 ^ 194)) & (((((203 + 51) - 156) + 123) ^ (((152 + 49) - 29) + 16)) ^ (-" ".length()));
                }
            } else {
                i = lIllllIlllll[6];
            }
            this.cP = i;
            sleep(lIllllIlllll[8]);
            this.cG = lIllllIlllll[3];
            return lIllllIlllll[3];
        }
        return lIllllIlllll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    private boolean a(Player player, N n) {
        switch (aZ.cQ[n.aL().ordinal()]) {
            case 1:
                return player.isIdle();
            case 2:
                return player.isAnimating();
            default:
                return lIllllIlllll[3];
        }
    }

    private static boolean lllIlllIlllllI(int i) {
        return i == 0;
    }

    private static boolean lllIllllIIIllI(int i, int i2) {
        return i == i2;
    }

    private static String lllIlllIlIIIIl(String lllllllllllllllIlIllIIIllIlIIIll, String lllllllllllllllIlIllIIIllIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIlllll[13], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIllIlIIlII) {
            lllllllllllllllIlIllIIIllIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllllIIIIII(int i, int i2) {
        return i != i2;
    }

    private static boolean lllIllllIIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllIllllIIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIlllIllllll(Object obj) {
        return obj != null;
    }

    private static boolean lllIllllIIIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllIllllIIIIll(int i) {
        return i != 0;
    }

    static {
        lllIlllIllllIl();
        lllIlllIlllIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        this.cG = lIllllIlllll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Subscribe
    public void a(ClientTick clientTick) {
        if (lllIllllIIIlII(this.cO) || lllIllllIIIIIl(O.e(this.cF), O.HERB) || !lllIllllIIIllI(this.cO.getAnimationFrame(), lIllllIlllll[3])) {
            return;
        }
        int tickCount = this.cD.getTickCount();
        if (lllIllllIIIIlI(tickCount - this.cI, lIllllIlllll[6]) && lllIlllIlllllI(this.cG ? 1 : 0)) {
            this.cG = lIllllIlllll[3];
        } else {
            this.cI = tickCount;
        }
    }

    private static void lllIlllIlllIll() {
        lIllllIlIlII = new String[lIllllIlllll[13]];
        lIllllIlIlII[lIllllIlllll[1]] = lllIlllIlIIIIl("Ul9gw/5nx0U=", "igwvm");
        lIllllIlIlII[lIllllIlllll[3]] = lllIlllIlIIIIl("DOVd6aX8qxs=", "CiFcR");
    }

    private static boolean lllIllllIIIlII(Object obj) {
        return obj == null;
    }

    private static boolean lllIllllIIIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIllllIIIIlI(int i, int i2) {
        return i <= i2;
    }

    private static void lllIlllIllllIl() {
        lIllllIlllll = new int[14];
        lIllllIlllll[0] = -" ".length();
        lIllllIlllll[1] = ((((112 + 18) - 86) + 143) ^ (((99 + 104) - 181) + 137)) & (((247 ^ 192) ^ (118 ^ 101)) ^ (-" ".length()));
        lIllllIlllll[2] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        lIllllIlllll[3] = " ".length();
        lIllllIlllll[4] = (-((-19697) & 28413)) & (-16385) & 32509;
        lIllllIlllll[5] = (-((-2899) & 31571)) & (-2169) & 32765;
        lIllllIlllll[6] = "   ".length();
        lIllllIlllll[7] = (249 ^ 199) ^ (122 ^ 64);
        lIllllIlllll[8] = (172 ^ 161) ^ (176 ^ 187);
        lIllllIlllll[9] = 117 ^ 112;
        lIllllIlllll[10] = 196 ^ 195;
        lIllllIlllll[11] = (-15362) & 15661;
        lIllllIlllll[12] = (-17544) & 18143;
        lIllllIlllll[13] = "  ".length();
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (lllIllllIIIIIl(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        int animation = animationChanged.getActor().getAnimation();
        if (lllIllllIIIllI(animation, lIllllIlllll[0]) && lllIlllIllllll(O.e(this.cF))) {
            this.cJ = this.cD.getTickCount();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return;
            }
        } else if (lllIlllIllllll(O.e(animation))) {
            this.cI = this.cD.getTickCount();
        }
        this.cF = animation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aX
    public boolean bv() {
        if (lllIlllIlllllI(Movement.shouldWalk() ? 1 : 0)) {
            ?? r0 = lIllllIlllll[3];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllllIlllll[1];
    }
}
