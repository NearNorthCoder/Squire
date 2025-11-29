package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Picking up nest", priority = 500, blocking = true)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.f  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/f.class */
public class f extends Task {
    private static /* synthetic */ int[] lIllIIIIIlllI;
    private static /* synthetic */ String[] lIllIIIIIllIl;
    private final /* synthetic */ SquireWoodcutterPlugin C;
    private final /* synthetic */ SquireWoodcutterConfig D;

    private static boolean llIIIlIIIIIlllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIlIIIIIlIll(int i) {
        return i == 0;
    }

    private static void llIIIlIIIIIlIIl() {
        lIllIIIIIllIl = new String[lIllIIIIIlllI[3]];
        lIllIIIIIllIl[lIllIIIIIlllI[0]] = llIIIlIIIIIlIII("NxIRFQ==", "cszpi");
        lIllIIIIIllIl[lIllIIIIIlllI[2]] = llIIIlIIIIIlIII("GxUDOQ==", "uppMw");
    }

    private static String llIIIlIIIIIlIII(String llllllllllllllIllIIllIlIIlIlIlll, String llllllllllllllIllIIllIlIIlIlIIIl) {
        String llllllllllllllIllIIllIlIIlIlIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIlIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIlIIlIlIlIl = new StringBuilder();
        char[] llllllllllllllIllIIllIlIIlIlIlII = llllllllllllllIllIIllIlIIlIlIIIl.toCharArray();
        int llllllllllllllIllIIllIlIIlIlIIll = lIllIIIIIlllI[0];
        char[] charArray = llllllllllllllIllIIllIlIIlIlIlll2.toCharArray();
        int length = charArray.length;
        int i = lIllIIIIIlllI[0];
        while (llIIIlIIIIIllll(i, length)) {
            llllllllllllllIllIIllIlIIlIlIlIl.append((char) (charArray[i] ^ llllllllllllllIllIIllIlIIlIlIlII[llllllllllllllIllIIllIlIIlIlIIll % llllllllllllllIllIIllIlIIlIlIlII.length]));
            "".length();
            llllllllllllllIllIIllIlIIlIlIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIllIlIIlIlIlIl);
    }

    private static void llIIIlIIIIIlIlI() {
        lIllIIIIIlllI = new int[4];
        lIllIIIIIlllI[0] = (61 ^ 122) & ((7 ^ 64) ^ (-1));
        lIllIIIIIlllI[1] = 73 ^ 79;
        lIllIIIIIlllI[2] = " ".length();
        lIllIIIIIlllI[3] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean run() {
        if (!llIIIlIIIIIlIll(this.D.pickUpNest() ? 1 : 0) && !llIIIlIIIIIllII(this.C.b() ? 1 : 0) && !llIIIlIIIIIllII(Inventory.isFull() ? 1 : 0)) {
            TileItem nearest = TileItems.getNearest(tileItem -> {
                return tileItem.getName().toLowerCase().contains(lIllIIIIIllIl[lIllIIIIIlllI[2]]);
            });
            if (!llIIIlIIIIIllIl(nearest) && !llIIIlIIIIIlllI(Players.getLocal().distanceTo(nearest), lIllIIIIIlllI[1])) {
                if (llIIIlIIIIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
                    return lIllIIIIIlllI[2];
                }
                nearest.interact(lIllIIIIIllIl[lIllIIIIIlllI[0]]);
                return lIllIIIIIlllI[2];
            }
            return lIllIIIIIlllI[0];
        }
        return lIllIIIIIlllI[0];
    }

    @Inject
    public f(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.C = squireWoodcutterPlugin;
        this.D = squireWoodcutterConfig;
    }

    static {
        llIIIlIIIIIlIlI();
        llIIIlIIIIIlIIl();
    }

    private static boolean llIIIlIIIIIllII(int i) {
        return i != 0;
    }

    private static boolean llIIIlIIIIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIIlIIIIIllll(int i, int i2) {
        return i < i2;
    }
}
