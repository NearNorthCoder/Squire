package h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Creating Dark Essence")
/* renamed from: h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.e  reason: invalid package */
/* loaded from: d11e2dee-7190-435e-95f6-a7b9761c02e8.jar:h/s/r/-/r/e/z/n/e/r/r/q/a/a/e/t/-/f/i/c/e/u/u/e.class */
public class e extends Task {
    private static /* synthetic */ String[] lIllIIllIlllI;
    private static /* synthetic */ int[] lIllIIlllIIIl;
    private static final /* synthetic */ WorldPoint x;
    private static final /* synthetic */ int w;
    private final /* synthetic */ SquireZeahRunecrafter y;

    static {
        llIIIllIlllIIll();
        llIIIllIllIlllI();
        w = lIllIIlllIIIl[3];
        x = new WorldPoint(lIllIIlllIIIl[5], lIllIIlllIIIl[6], lIllIIlllIIIl[0]);
    }

    private static boolean llIIIllIlllIlII(int i) {
        return i != 0;
    }

    private static boolean llIIIllIllllIII(int i, int i2) {
        return i == i2;
    }

    private static void llIIIllIlllIIll() {
        lIllIIlllIIIl = new int[9];
        lIllIIlllIIIl[0] = "   ".length() & ("   ".length() ^ (-1));
        lIllIIlllIIIl[1] = " ".length();
        lIllIIlllIIIl[2] = (-16675) & 30119;
        lIllIIlllIIIl[3] = (224 ^ 175) ^ (71 ^ 13);
        lIllIIlllIIIl[4] = (-4261) & 32239;
        lIllIIlllIIIl[5] = (-16394) & 18111;
        lIllIIlllIIIl[6] = (-((-7209) & 31982)) & (-4097) & 32751;
        lIllIIlllIIIl[7] = (((9 + 80) - 84) + 125) ^ (((77 + 87) - 108) + 82);
        lIllIIlllIIIl[8] = "  ".length();
    }

    private void u() {
        if (llIIIllIlllIlII(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo(x);
            "".length();
        }
    }

    private static boolean llIIIllIlllIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    private boolean r() {
        if (llIIIllIlllIlII(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[lIllIIlllIIIl[1]];
            iArr[lIllIIlllIIIl[0]] = lIllIIlllIIIl[2];
            if (llIIIllIlllIlII(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIllIIlllIIIl[1];
                "".length();
                return (((((67 + 139) - 116) + 56) ^ (((97 + 2) - 45) + 128)) & (((137 ^ 177) ^ (223 ^ 195)) ^ (-" ".length()))) >= ((((171 + 31) - 67) + 64) ^ (((19 + 181) - 42) + 37)) ? ((((195 + 1) - 100) + 135) ^ (((60 + 53) - (-32)) + 28)) & (((((141 + 142) - 95) + 13) ^ (((92 + 122) - 189) + 106)) ^ (-" ".length())) : r0;
            }
        }
        return lIllIIlllIIIl[0];
    }

    private static boolean llIIIllIlllIlll(int i, int i2) {
        return i <= i2;
    }

    private static String llIIIllIllIllIl(String llllllllllllllIllIIlIIIlIlIIIIIl, String llllllllllllllIllIIlIIIlIlIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), lIllIIlllIIIl[7]), "DES");
            Cipher llllllllllllllIllIIlIIIlIlIIIIll = Cipher.getInstance("DES");
            llllllllllllllIllIIlIIIlIlIIIIll.init(lIllIIlllIIIl[8], secretKeySpec);
            return new String(llllllllllllllIllIIlIIIlIlIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIIlIlIIIIlI) {
            llllllllllllllIllIIlIIIlIlIIIIlI.printStackTrace();
            return null;
        }
    }

    private TileObject t() {
        return TileObjects.getNearest(tileObject -> {
            if (llIIIllIlllIlll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIllIIlllIIIl[3]) && llIIIllIllllIII(tileObject.getId(), lIllIIlllIIIl[4])) {
                ?? r0 = lIllIIlllIIIl[1];
                "".length();
                return (((((77 + 42) - 109) + 137) ^ (((107 + 119) - 172) + 96)) & (((((124 + 7) - 24) + 29) ^ (((107 + 8) - (-18)) + 8)) ^ (-" ".length()))) != 0 ? ((180 ^ 189) ^ (234 ^ 199)) & (((216 ^ 158) ^ (12 ^ 110)) ^ (-" ".length())) : r0;
            }
            return lIllIIlllIIIl[0];
        });
    }

    private static void llIIIllIllIlllI() {
        lIllIIllIlllI = new String[lIllIIlllIIIl[1]];
        lIllIIllIlllI[lIllIIlllIIIl[0]] = llIIIllIllIllIl("BGzY4e5BgRrX8mF8/ysB2g==", "rChcZ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIllIlllIlII(this.y.a() ? 1 : 0) || llIIIllIlllIlIl(r() ? 1 : 0)) {
            return lIllIIlllIIIl[0];
        }
        s();
        return lIllIIlllIIIl[1];
    }

    private void s() {
        TileObject t = t();
        if (!llIIIllIlllIllI(t)) {
            u();
            return;
        }
        t.interact(lIllIIllIlllI[lIllIIlllIIIl[0]]);
        "".length();
        if (" ".length() == 0) {
        }
    }

    private static boolean llIIIllIlllIlIl(int i) {
        return i == 0;
    }

    @Inject
    public e(SquireZeahRunecrafter squireZeahRunecrafter) {
        this.y = squireZeahRunecrafter;
    }
}
