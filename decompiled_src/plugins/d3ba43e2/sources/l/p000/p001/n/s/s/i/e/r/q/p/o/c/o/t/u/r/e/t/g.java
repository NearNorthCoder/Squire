package l.p000.p001.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Entering Boat")
/* renamed from: l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.g  reason: invalid package */
/* loaded from: d3ba43e2-4966-4faf-8fcb-fba83fc95121.jar:l/-/-/n/s/s/i/e/r/q/p/o/c/o/t/u/r/e/t/g.class */
public class g extends Task {
    private static /* synthetic */ String[] lIIIlIlIIlIIl;
    private final /* synthetic */ a q;
    private /* synthetic */ int r;
    private static /* synthetic */ int[] lIIIlIlIIlIlI;

    private static boolean lIIlllllllIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlllllllIllII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    private boolean a(c cVar) {
        if (lIIlllllllIlIll(cVar)) {
            return lIIIlIlIIlIlI[0];
        }
        int[] iArr = new int[lIIIlIlIIlIlI[1]];
        iArr[lIIIlIlIIlIlI[0]] = cVar.l();
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIIlllllllIlIll(nearest)) {
            return lIIIlIlIIlIlI[0];
        }
        nearest.interact(lIIIlIlIIlIIl[lIIIlIlIIlIlI[0]]);
        this.r = lIIIlIlIIlIlI[1];
        a.f0l = this.q.h();
        return lIIIlIlIIlIlI[1];
    }

    private static void lIIlllllllIIlll() {
        lIIIlIlIIlIIl = new String[lIIIlIlIIlIlI[1]];
        lIIIlIlIIlIIl[lIIIlIlIIlIlI[0]] = lIIlllllllIIllI("ACocBBo=", "CXswi");
    }

    static {
        lIIlllllllIlIII();
        lIIlllllllIIlll();
    }

    private static String lIIlllllllIIllI(String lllllllllllllllIIIIlllIIllIIlIlI, String lllllllllllllllIIIIlllIIllIIlIIl) {
        String lllllllllllllllIIIIlllIIllIIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllIIllIIlIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlllIIllIIlIIl.toCharArray();
        int lllllllllllllllIIIIlllIIllIIIllI = lIIIlIlIIlIlI[0];
        char[] charArray2 = lllllllllllllllIIIIlllIIllIIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIlIIlIlI[0];
        while (lIIlllllllIllIl(i, length)) {
            char lllllllllllllllIIIIlllIIllIIlIll = charArray2[i];
            lllllllllllllllIIIIlllIIllIIlIII.append((char) (lllllllllllllllIIIIlllIIllIIlIll ^ charArray[lllllllllllllllIIIIlllIIllIIIllI % charArray.length]));
            "".length();
            lllllllllllllllIIIIlllIIllIIIllI++;
            i++;
            "".length();
            if (((16 ^ 31) ^ (30 ^ 20)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlllIIllIIlIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean run() {
        return lIIlllllllIlIIl(t() ? 1 : 0) ? lIIIlIlIIlIlI[0] : a(this.q.g());
    }

    private static boolean lIIlllllllIllIl(int i, int i2) {
        return i < i2;
    }

    @Inject
    public g(a aVar) {
        this.q = aVar;
    }

    private static boolean lIIlllllllIlIIl(int i) {
        return i == 0;
    }

    private static void lIIlllllllIlIII() {
        lIIIlIlIIlIlI = new int[2];
        lIIIlIlIIlIlI[0] = (247 ^ 149) & ((228 ^ 134) ^ (-1));
        lIIIlIlIIlIlI[1] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean t() {
        if (lIIlllllllIlIIl(this.q.f() ? 1 : 0) && lIIlllllllIlIlI(Movement.shouldWalk() ? 1 : 0) && lIIlllllllIlIlI(u() ? 1 : 0) && lIIlllllllIlIIl(this.q.e() ? 1 : 0)) {
            ?? r0 = lIIIlIlIIlIlI[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlIlIIlIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean u() {
        if (lIIlllllllIllII(this.r, lIIIlIlIIlIlI[1])) {
            this.r -= lIIIlIlIIlIlI[1];
            return lIIIlIlIIlIlI[0];
        }
        return lIIIlIlIIlIlI[1];
    }

    private static boolean lIIlllllllIlIlI(int i) {
        return i != 0;
    }
}
