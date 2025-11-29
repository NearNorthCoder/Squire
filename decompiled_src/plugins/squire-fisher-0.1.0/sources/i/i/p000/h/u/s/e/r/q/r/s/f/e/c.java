package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Looting")
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.c  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/c.class */
public class c extends Task {
    private final /* synthetic */ SquireFisherConfig v;
    private static /* synthetic */ int[] lIlllIlIlIll;
    private /* synthetic */ int q;
    private final /* synthetic */ SquireFisherPlugin u;
    private static final /* synthetic */ Logger t;
    private static /* synthetic */ String[] lIlllIlIlIlI;

    static {
        lllIlIllIIlIIl();
        lllIlIllIIlIII();
        t = LoggerFactory.getLogger(c.class);
    }

    private static void lllIlIllIIlIII() {
        lIlllIlIlIlI = new String[lIlllIlIlIll[0]];
        lIlllIlIlIlI[lIlllIlIlIll[1]] = lllIlIllIIIlll("PBcnExUWDQ==", "uyTcp");
    }

    @Inject
    public c(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.u = squireFisherPlugin;
        this.v = squireFisherConfig;
    }

    private static boolean lllIlIllIIlllI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lllIlIllIIlIll(int i2) {
        return i2 != 0;
    }

    private static void lllIlIllIIlIIl() {
        lIlllIlIlIll = new int[6];
        lIlllIlIlIll[0] = " ".length();
        lIlllIlIlIll[1] = (92 ^ 119) & ((179 ^ 152) ^ (-1));
        lIlllIlIlIll[2] = (-((-16423) & 28215)) & (-20609) & 32767;
        lIlllIlIlIll[3] = (7 ^ 72) ^ (77 ^ 20);
        lIlllIlIlIll[4] = (-((-27873) & 32493)) & (-9217) & 16319;
        lIlllIlIlIll[5] = 7 ^ 53;
    }

    private static boolean lllIlIllIIlIlI(int i2) {
        return i2 >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    public boolean run() {
        if (lllIlIllIIlIlI(this.q)) {
            this.q -= lIlllIlIlIll[0];
            return lIlllIlIlIll[1];
        }
        if (!lllIlIllIIlIll(Widgets.isVisible(Widgets.get(lIlllIlIlIll[2], lIlllIlIlIll[3])) ? 1 : 0) && !lllIlIllIIllII(this.v.fishingTrawler() ? 1 : 0) && !lllIlIllIIllII(this.u.e() ? 1 : 0)) {
            int[] iArr = new int[lIlllIlIlIll[0]];
            iArr[lIlllIlIlIll[1]] = lIlllIlIlIll[4];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lllIlIllIIllIl(nearest)) {
                return lIlllIlIlIll[1];
            }
            nearest.interact(lIlllIlIlIlI[lIlllIlIlIll[1]]);
            this.q = lIlllIlIlIll[5];
            return lIlllIlIlIll[0];
        }
        return lIlllIlIlIll[1];
    }

    private static boolean lllIlIllIIllII(int i2) {
        return i2 == 0;
    }

    private static boolean lllIlIllIIllIl(Object obj) {
        return obj == null;
    }

    private static String lllIlIllIIIlll(String lllllllllllllllIlIlllIllIlIIllIl, String lllllllllllllllIlIlllIllIlIIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIllIlIIlIll = new StringBuilder();
        char[] lllllllllllllllIlIlllIllIlIIlIlI = lllllllllllllllIlIlllIllIlIIllII.toCharArray();
        int lllllllllllllllIlIlllIllIlIIlIIl = lIlllIlIlIll[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlllIlIlIll[1];
        while (lllIlIllIIlllI(i2, length)) {
            lllllllllllllllIlIlllIllIlIIlIll.append((char) (charArray[i2] ^ lllllllllllllllIlIlllIllIlIIlIlI[lllllllllllllllIlIlllIllIlIIlIIl % lllllllllllllllIlIlllIllIlIIlIlI.length]));
            "".length();
            lllllllllllllllIlIlllIllIlIIlIIl++;
            i2++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIllIlIIlIll);
    }
}
