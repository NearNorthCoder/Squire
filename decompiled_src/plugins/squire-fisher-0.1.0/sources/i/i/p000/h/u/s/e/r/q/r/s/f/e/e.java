package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Entering Fishing Trawler")
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.e  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/e.class */
public class e extends Task {
    private static /* synthetic */ int[] lIlllIlllIll;
    private final /* synthetic */ SquireFisherPlugin A;
    private final /* synthetic */ SquireFisherConfig B;
    private /* synthetic */ int q;
    private static /* synthetic */ String[] lIlllIlllIlI;
    private static final /* synthetic */ Logger z;

    private static boolean lllIllIIIlIIII(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public boolean run() {
        if (!lllIllIIIIllII(this.B.fishingTrawler() ? 1 : 0) && !lllIllIIIIllIl(this.A.e() ? 1 : 0)) {
            if (lllIllIIIIlllI(this.q)) {
                this.q -= lIlllIlllIll[1];
                return lIlllIlllIll[0];
            }
            int[] iArr = new int[lIlllIlllIll[2]];
            iArr[lIlllIlllIll[0]] = lIlllIlllIll[3];
            iArr[lIlllIlllIll[1]] = lIlllIlllIll[4];
            TileObject nearest = TileObjects.getNearest(iArr);
            int[] iArr2 = new int[lIlllIlllIll[1]];
            iArr2[lIlllIlllIll[0]] = lIlllIlllIll[5];
            TileObject nearest2 = TileObjects.getNearest(iArr2);
            if (!lllIllIIIIllll(nearest) && !lllIllIIIIllIl(Reachable.isInteractable(nearest) ? 1 : 0) && !lllIllIIIIllIl(Widgets.isVisible(Widgets.get(WidgetInfo.FISHING_TRAWLER_TIMER)) ? 1 : 0)) {
                if (!lllIllIIIIllII(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                    nearest2.interact(lIlllIlllIlI[lIlllIlllIll[0]]);
                    return lIlllIlllIll[1];
                }
                Movement.walkTo(new WorldPoint(lIlllIlllIll[6], lIlllIlllIll[7], lIlllIlllIll[0]));
                "".length();
                return lIlllIlllIll[1];
            }
            return lIlllIlllIll[0];
        }
        return lIlllIlllIll[0];
    }

    private static void lllIllIIIIlIlI() {
        lIlllIlllIlI = new String[lIlllIlllIll[1]];
        lIlllIlllIlI[lIlllIlllIll[0]] = lllIllIIIIlIIl("MCAJOAA=", "sRfKs");
    }

    private static boolean lllIllIIIIllII(int i2) {
        return i2 == 0;
    }

    private static boolean lllIllIIIIllll(Object obj) {
        return obj == null;
    }

    private static String lllIllIIIIlIIl(String lllllllllllllllIlIlllIIlllIlIIlI, String lllllllllllllllIlIlllIIlllIlIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIlllIlIIII = new StringBuilder();
        char[] lllllllllllllllIlIlllIIlllIIllll = lllllllllllllllIlIlllIIlllIlIIIl.toCharArray();
        int lllllllllllllllIlIlllIIlllIIlllI = lIlllIlllIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlllIlllIll[0];
        while (lllIllIIIlIIII(i2, length)) {
            lllllllllllllllIlIlllIIlllIlIIII.append((char) (charArray[i2] ^ lllllllllllllllIlIlllIIlllIIllll[lllllllllllllllIlIlllIIlllIIlllI % lllllllllllllllIlIlllIIlllIIllll.length]));
            "".length();
            lllllllllllllllIlIlllIIlllIIlllI++;
            i2++;
            "".length();
            if ((((((112 + 115) - 128) + 63) ^ (((85 + 73) - 76) + 85)) & (((76 ^ 94) ^ (52 ^ 35)) ^ (-" ".length()))) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIIlllIlIIII);
    }

    @Inject
    public e(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.A = squireFisherPlugin;
        this.B = squireFisherConfig;
    }

    private static boolean lllIllIIIIllIl(int i2) {
        return i2 != 0;
    }

    private static void lllIllIIIIlIll() {
        lIlllIlllIll = new int[8];
        lIlllIlllIll[0] = (153 ^ 198) & ((78 ^ 17) ^ (-1));
        lIlllIlllIll[1] = " ".length();
        lIlllIlllIll[2] = "  ".length();
        lIlllIlllIll[3] = (-((-9293) & 28621)) & (-9237) & 32703;
        lIlllIlllIll[4] = (-"  ".length()) & (-12321) & 16381;
        lIlllIlllIll[5] = (-25735) & 30711;
        lIlllIlllIll[6] = (-16649) & 19324;
        lIlllIlllIll[7] = (-25114) & 28283;
    }

    private static boolean lllIllIIIIlllI(int i2) {
        return i2 >= 0;
    }

    static {
        lllIllIIIIlIll();
        lllIllIIIIlIlI();
        z = LoggerFactory.getLogger(e.class);
    }
}
