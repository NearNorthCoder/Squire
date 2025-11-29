package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/a.class */
public abstract class AbstractC0000a extends Task {
    protected final /* synthetic */ Client w;
    protected /* synthetic */ NPC y;
    private static /* synthetic */ String[] lIlIlIIlIlIII;
    protected static /* synthetic */ WorldPoint p;
    protected final /* synthetic */ SquireVardorvis s;

    /* renamed from: r  reason: collision with root package name */
    protected static /* synthetic */ WorldPoint f0r;
    protected static /* synthetic */ WorldPoint q;
    protected final /* synthetic */ SquireVardorvisConfig t;
    protected final /* synthetic */ C0001b v;
    protected final /* synthetic */ C0004e u;
    private static /* synthetic */ int[] lIlIlIIlIlIIl;
    protected /* synthetic */ Player x;
    protected static /* synthetic */ WorldPoint o;
    protected /* synthetic */ boolean z;

    private static boolean lIllllIlllllIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIllllIllllIlIl() {
        lIlIlIIlIlIIl = new int[6];
        lIlIlIIlIlIIl[0] = ((203 ^ 186) ^ (173 ^ 188)) & (((9 ^ 75) ^ (115 ^ 81)) ^ (-" ".length()));
        lIlIlIIlIlIIl[1] = " ".length();
        lIlIlIIlIlIIl[2] = "  ".length();
        lIlIlIIlIlIIl[3] = 100 ^ 97;
        lIlIlIIlIlIIl[4] = -(80 ^ 85);
        lIlIlIIlIlIIl[5] = -"  ".length();
    }

    private static void lIllllIllllIlII() {
        lIlIlIIlIlIII = new String[lIlIlIIlIlIIl[1]];
        lIlIlIIlIlIII[lIlIlIIlIlIIl[0]] = lIllllIllllIIll("Eio3PSM2PSwq", "DKEYL");
    }

    private static boolean lIllllIlllllIII(Object obj) {
        return obj != null;
    }

    protected WorldPoint o() {
        return p.dx(lIlIlIIlIlIIl[1]).dy(lIlIlIIlIlIIl[2]);
    }

    static {
        lIllllIllllIlIl();
        lIllllIllllIlII();
    }

    private static boolean lIllllIllllIlll(Object obj) {
        return obj == null;
    }

    protected WorldPoint m() {
        int[] iArr = new int[lIlIlIIlIlIIl[1]];
        iArr[lIlIlIIlIlIIl[0]] = C0006g.R;
        TileObject nearest = TileObjects.getNearest(iArr);
        return lIllllIllllIlll(nearest) ? new WorldPoint(lIlIlIIlIlIIl[0], lIlIlIIlIlIIl[0], lIlIlIIlIlIIl[0]) : nearest.getWorldLocation().dx(lIlIlIIlIlIIl[2]).dy(lIlIlIIlIlIIl[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    public boolean run() {
        if (lIllllIllllIllI(this.w.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIIlIlIIl[0];
        }
        o = m();
        p = n();
        q = o();
        f0r = p();
        this.x = Players.getLocal();
        if (lIllllIllllIlll(this.x)) {
            return lIlIlIIlIlIIl[0];
        }
        this.z = lIlIlIIlIlIIl[0];
        String[] strArr = new String[lIlIlIIlIlIIl[1]];
        strArr[lIlIlIIlIlIIl[0]] = lIlIlIIlIlIII[lIlIlIIlIlIIl[0]];
        this.y = NPCs.getNearest(strArr);
        if (lIllllIllllIlll(this.y)) {
            return lIlIlIIlIlIIl[0];
        }
        int[] iArr = new int[lIlIlIIlIlIIl[2]];
        iArr[lIlIlIIlIlIIl[0]] = C0006g.T;
        iArr[lIlIlIIlIlIIl[1]] = C0006g.U;
        if (!lIllllIllllIlll(TileObjects.getNearest(iArr)) || lIllllIlllllIII(this.y.getInteracting())) {
            this.z = lIlIlIIlIlIIl[1];
        }
        return l();
    }

    protected WorldPoint p() {
        return p.dx(lIlIlIIlIlIIl[1]).dy(lIlIlIIlIlIIl[5]);
    }

    public abstract boolean l();

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public AbstractC0000a(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, C0004e c0004e, C0001b c0001b, Client client) {
        this.s = squireVardorvis;
        this.t = squireVardorvisConfig;
        this.u = c0004e;
        this.v = c0001b;
        this.w = client;
    }

    private static String lIllllIllllIIll(String llllllllllllllIllIlIllllIlIIllII, String llllllllllllllIllIlIllllIlIIlIll) {
        String llllllllllllllIllIlIllllIlIIllII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllllIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIllllIlIIlIlI = new StringBuilder();
        char[] llllllllllllllIllIlIllllIlIIlIIl = llllllllllllllIllIlIllllIlIIlIll.toCharArray();
        int llllllllllllllIllIlIllllIlIIlIII = lIlIlIIlIlIIl[0];
        char[] charArray = llllllllllllllIllIlIllllIlIIllII2.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIlIlIIl[0];
        while (lIllllIlllllIIl(i, length)) {
            char llllllllllllllIllIlIllllIIllllll = charArray[i];
            llllllllllllllIllIlIllllIlIIlIlI.append((char) (llllllllllllllIllIlIllllIIllllll ^ llllllllllllllIllIlIllllIlIIlIIl[llllllllllllllIllIlIllllIlIIlIII % llllllllllllllIllIlIllllIlIIlIIl.length]));
            "".length();
            llllllllllllllIllIlIllllIlIIlIII++;
            i++;
            "".length();
            if ((71 ^ 67) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIllllIlIIlIlI);
    }

    protected WorldPoint n() {
        return o.dx(lIlIlIIlIlIIl[4]);
    }

    private static boolean lIllllIllllIllI(int i) {
        return i == 0;
    }
}
