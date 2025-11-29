package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Dodging Brazier", priority = 2147482647, blocking = true)
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.i  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/i.class */
public class i extends Task {
    private static /* synthetic */ String[] lIlIllllllIII;
    @Inject
    protected /* synthetic */ b b;
    private static /* synthetic */ int[] lIlIllllllIIl;
    public static final /* synthetic */ int N;

    private static boolean llIIIIllIllllIl(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIllIlllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIllIllllII(int i, int i2) {
        return i == i2;
    }

    private static void llIIIIllIllIlll() {
        lIlIllllllIIl = new int[5];
        lIlIllllllIIl[0] = ((210 ^ 175) ^ (91 ^ 25)) & (((149 ^ 183) ^ (36 ^ 57)) ^ (-" ".length()));
        lIlIllllllIIl[1] = "   ".length();
        lIlIllllllIIl[2] = -" ".length();
        lIlIllllllIIl[3] = " ".length();
        lIlIllllllIIl[4] = (-4125) & 30814;
    }

    private static void llIIIIllIllIllI() {
        lIlIllllllIII = new String[lIlIllllllIIl[3]];
        lIlIllllllIII[lIlIllllllIIl[0]] = llIIIIllIllIlIl("KAoqGAgvCg==", "JxKba");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public boolean run() {
        if (llIIIIllIlllIII(this.b.i() ? 1 : 0) && llIIIIllIlllIIl(this.b.u() ? 1 : 0) && !llIIIIllIlllIII(this.b.j() ? 1 : 0)) {
            Player local = Players.getLocal();
            WorldPoint b = this.b.q().b();
            if (llIIIIllIlllIlI(TileObjects.getNearest(b, tileObject -> {
                if (llIIIIllIllllIl(tileObject.getName()) && llIIIIllIlllIII(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIlIllllllIII[lIlIllllllIIl[0]]) ? 1 : 0)) {
                    ?? r0 = lIlIllllllIIl[3];
                    "".length();
                    return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIllllllIIl[0];
            }))) {
                return lIlIllllllIIl[0];
            }
            TileObject nearest = TileObjects.getNearest(b, tileObject2 -> {
                if (llIIIIllIllllII(tileObject2.getId(), lIlIllllllIIl[4]) && llIIIIllIllllII(tileObject2.getWorldX(), b.getWorldX())) {
                    ?? r0 = lIlIllllllIIl[3];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIllllllIIl[0];
            });
            if (llIIIIllIlllIlI(nearest)) {
                return lIlIllllllIIl[0];
            }
            if (!llIIIIllIlllIll(nearest.distanceTo(b), lIlIllllllIIl[1]) || llIIIIllIlllIll(nearest.getWorldY(), b.getWorldY())) {
                return lIlIllllllIIl[0];
            }
            WorldPoint dy = b.dy(lIlIllllllIIl[2]);
            if (llIIIIllIlllIII(local.getWorldLocation().equals(dy) ? 1 : 0)) {
                return lIlIllllllIIl[3];
            }
            Movement.setDestination(dy);
            return lIlIllllllIIl[3];
        }
        return lIlIllllllIIl[0];
    }

    private static String llIIIIllIllIlIl(String llllllllllllllIllIIlllIIlIIlIIII, String llllllllllllllIllIIlllIIlIIIllll) {
        String llllllllllllllIllIIlllIIlIIlIIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllIIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlllIIlIIIlllI = new StringBuilder();
        char[] llllllllllllllIllIIlllIIlIIIllIl = llllllllllllllIllIIlllIIlIIIllll.toCharArray();
        int llllllllllllllIllIIlllIIlIIIllII = lIlIllllllIIl[0];
        char[] charArray = llllllllllllllIllIIlllIIlIIlIIII2.toCharArray();
        int length = charArray.length;
        int i = lIlIllllllIIl[0];
        while (llIIIIllIlllllI(i, length)) {
            llllllllllllllIllIIlllIIlIIIlllI.append((char) (charArray[i] ^ llllllllllllllIllIIlllIIlIIIllIl[llllllllllllllIllIIlllIIlIIIllII % llllllllllllllIllIIlllIIlIIIllIl.length]));
            "".length();
            llllllllllllllIllIIlllIIlIIIllII++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlllIIlIIIlllI);
    }

    private static boolean llIIIIllIlllIIl(int i) {
        return i == 0;
    }

    private static boolean llIIIIllIlllIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIIllIlllIII(int i) {
        return i != 0;
    }

    static {
        llIIIIllIllIlll();
        llIIIIllIllIllI();
        N = lIlIllllllIIl[4];
    }

    private static boolean llIIIIllIlllIlI(Object obj) {
        return obj == null;
    }
}
