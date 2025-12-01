package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
@TaskDesc(name = "Retort task")
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.l  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/l.class */
public class l extends Task {
    private static /* synthetic */ int[] llllllllIllI;
    final /* synthetic */ int U = llllllllIllI[0];
    private final /* synthetic */ SquireMixologyConfig V;
    private static /* synthetic */ String[] llllllllIlIl;

    private static boolean lIIlIlIllIllIII(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIllIllIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIlIllIllllI(int i) {
        return i > 0;
    }

    private static String lIIlIlIllIlIlIl(String lllllllllllllllIIlIIIIllIIIlllII, String lllllllllllllllIIlIIIIllIIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIllIIIllIll.getBytes(StandardCharsets.UTF_8)), llllllllIllI[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllllIllI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIllIIIlllIl) {
            lllllllllllllllIIlIIIIllIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIllIlllIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    public boolean run() {
        if (lIIlIlIllIllIII(s.e() ? 1 : 0)) {
            return llllllllIllI[1];
        }
        int[] iArr = new int[llllllllIllI[2]];
        iArr[llllllllIllI[1]] = llllllllIllI[3];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (!lIIlIlIllIllIII(a(nearest) ? 1 : 0) && !lIIlIlIllIllIIl(this.V.pluginMode(), d.MINIGAME)) {
            if (lIIlIlIllIllIIl(this.V.potionStrategy(), f.MULTI_ORDER) && lIIlIlIllIllIlI(SquireMixology.r, llllllllIllI[0])) {
                return llllllllIllI[1];
            }
            if (lIIlIlIllIllIll(this.V.potionStrategy(), f.MULTI_ORDER)) {
                if (lIIlIlIllIllIII(a(nearest) ? 1 : 0)) {
                    return llllllllIllI[1];
                }
                s.j();
                if (lIIlIlIllIllIlI(SquireMixology.x, llllllllIllI[0])) {
                    return llllllllIllI[1];
                }
            }
            SquireMixology.g = llllllllIlIl[llllllllIllI[1]];
            int[] iArr2 = new int[llllllllIllI[2]];
            iArr2[llllllllIllI[1]] = llllllllIllI[3];
            TileObjects.getNearest(iArr2).interact(llllllllIllI[1]);
            return llllllllIllI[1];
        }
        return llllllllIllI[1];
    }

    private static void lIIlIlIllIlIllI() {
        llllllllIlIl = new String[llllllllIllI[2]];
        llllllllIlIl[llllllllIllI[1]] = lIIlIlIllIlIlIl("q1AD51olYLA8JiO9iIedHw==", "esDZV");
    }

    private static boolean lIIlIlIllIllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIlIllIllIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIlIllIlllII(int i, int i2) {
        return i <= i2;
    }

    @Inject
    public l(SquireMixologyConfig squireMixologyConfig) {
        this.V = squireMixologyConfig;
    }

    private static void lIIlIlIllIlIlll() {
        llllllllIllI = new int[7];
        llllllllIllI[0] = (-((-8419) & 26870)) & (-8517) & 32639;
        llllllllIllI[1] = (225 ^ 190) & ((13 ^ 82) ^ (-1));
        llllllllIllI[2] = " ".length();
        llllllllIllI[3] = (-1313) & 56701;
        llllllllIllI[4] = (-4673) & 15999;
        llllllllIllI[5] = 184 ^ 176;
        llllllllIllI[6] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    private boolean a(TileObject tileObject) {
        int i;
        if (lIIlIlIllIlllII(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llllllllIllI[2])) {
            i = llllllllIllI[2];
            "".length();
            if ("  ".length() < (((42 ^ 6) ^ (61 ^ 32)) & (((25 ^ 54) ^ (34 ^ 60)) ^ (-" ".length())))) {
                return ((168 ^ 131) ^ (108 ^ 3)) & (((30 ^ 20) ^ (193 ^ 143)) ^ (-" ".length()));
            }
        } else {
            i = llllllllIllI[1];
        }
        int lllllllllllllllIIlIIIIllIIlIIlIl = i;
        boolean isAnimating = Players.getLocal().isAnimating();
        if ((!lIIlIlIllIlllIl(lllllllllllllllIIlIIIIllIIlIIlIl) || !lIIlIlIllIlllIl(isAnimating ? 1 : 0)) && !lIIlIlIllIllllI(Vars.getBit(llllllllIllI[4])) && lIIlIlIllIllIII(s.g() ? 1 : 0)) {
            return llllllllIllI[1];
        }
        return llllllllIllI[2];
    }

    static {
        lIIlIlIllIlIlll();
        lIIlIlIllIlIllI();
    }
}
