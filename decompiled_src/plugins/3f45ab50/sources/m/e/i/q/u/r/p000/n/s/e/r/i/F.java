package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Walking to veins", priority = 10, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.F  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/F.class */
public class F extends C {
    private static /* synthetic */ String[] llllllIIIIII;
    private static /* synthetic */ int[] llllllIIIIIl;
    private static final /* synthetic */ RectangularArea ac;

    @Inject
    public F(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t) {
        super(squireMinerConfig, squireMiner, t);
    }

    static {
        lIIlIlIIIIlIIIl();
        lIIlIlIIIIlIIII();
        ac = new RectangularArea(llllllIIIIIl[8], llllllIIIIIl[9], llllllIIIIIl[10], llllllIIIIIl[11]);
    }

    private static boolean lIIlIlIIIIlIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIlIIIIlIlII(int i) {
        return i != 0;
    }

    private static void lIIlIlIIIIlIIIl() {
        llllllIIIIIl = new int[13];
        llllllIIIIIl[0] = ((78 ^ 21) ^ (55 ^ 87)) & (((197 ^ 170) ^ (39 ^ 115)) ^ (-" ".length()));
        llllllIIIIIl[1] = (((127 + 0) - 6) + 64) ^ (((112 + 65) - 40) + 45);
        llllllIIIIIl[2] = (((156 + 47) - 36) + 16) ^ (((44 + 19) - (-10)) + 96);
        llllllIIIIIl[3] = (-((-2049) & 31641)) & (-1025) & 32702;
        llllllIIIIIl[4] = " ".length();
        llllllIIIIIl[5] = (-((-10661) & 15791)) & (-8450) & 32623;
        llllllIIIIIl[6] = 194 ^ 198;
        llllllIIIIIl[7] = "  ".length();
        llllllIIIIIl[8] = (-4098) & 7837;
        llllllIIIIIl[9] = (-((-17313) & 25526)) & (-18817) & 32701;
        llllllIIIIIl[10] = (-((-1025) & 17681)) & (-8257) & 28671;
        llllllIIIIIl[11] = (-8194) & 13853;
        llllllIIIIIl[12] = (27 ^ 104) ^ (85 ^ 46);
    }

    private static boolean lIIlIlIIIIlIllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIlIIIIlIIll(int i) {
        return i == 0;
    }

    private static String lIIlIlIIIIIllll(String lllllllllllllllIIlIIIlllllllIIIl, String lllllllllllllllIIlIIIlllllllIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlllllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlllllllIIII.getBytes(StandardCharsets.UTF_8)), llllllIIIIIl[12]), "DES");
            Cipher lllllllllllllllIIlIIIlllllllIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIlllllllIIll.init(llllllIIIIIl[7], lllllllllllllllIIlIIIlllllllIlII);
            return new String(lllllllllllllllIIlIIIlllllllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlllllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlllllllIIlI) {
            lllllllllllllllIIlIIIlllllllIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.C
    public boolean t() {
        Player local = Players.getLocal();
        if (lIIlIlIIIIlIIlI(local) && lIIlIlIIIIlIIll(local.isAnimating() ? 1 : 0) && !lIIlIlIIIIlIlII(this.Z.I() ? 1 : 0)) {
            if (!lIIlIlIIIIlIIll(this.Z.G() ? 1 : 0) || lIIlIlIIIIlIlII(this.Z.F() ? 1 : 0)) {
                return llllllIIIIIl[0];
            }
            TileObject u = u();
            if ((!lIIlIlIIIIlIIlI(u) || !lIIlIlIIIIlIlIl(u.getWorldLocation().distanceTo(local), llllllIIIIIl[1]) || !lIIlIlIIIIlIlII(Reachable.isInteractable(u) ? 1 : 0)) && !lIIlIlIIIIlIIll(Movement.shouldWalk() ? 1 : 0)) {
                if (lIIlIlIIIIlIIll(Movement.isRunEnabled() ? 1 : 0) && lIIlIlIIIIlIllI(Movement.getRunEnergy(), llllllIIIIIl[2])) {
                    Movement.toggleRun();
                }
                if (!lIIlIlIIIIlIlll(this.X.mlmArea(), EnumC0003d.UPPER_FLOOR) || (lIIlIlIIIIlIIll(ac.contains(local) ? 1 : 0) && !lIIlIlIIIIlIIll(Vars.getBit(llllllIIIIIl[3])))) {
                    Movement.walkTo(this.X.mlmArea().g()[llllllIIIIIl[0]]);
                    "".length();
                    sleep(llllllIIIIIl[7]);
                    return llllllIIIIIl[4];
                }
                int[] iArr = new int[llllllIIIIIl[4]];
                iArr[llllllIIIIIl[0]] = llllllIIIIIl[5];
                TileObjects.getNearest(iArr).interact(llllllIIIIII[llllllIIIIIl[0]]);
                sleep(llllllIIIIIl[6]);
                return llllllIIIIIl[4];
            }
            return llllllIIIIIl[0];
        }
        return llllllIIIIIl[0];
    }

    private static boolean lIIlIlIIIIlIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIlIIIIlIIlI(Object obj) {
        return obj != null;
    }

    private static void lIIlIlIIIIlIIII() {
        llllllIIIIII = new String[llllllIIIIIl[4]];
        llllllIIIIII[llllllIIIIIl[0]] = lIIlIlIIIIIllll("2Hd3K2QX63o=", "IrRFv");
    }
}
