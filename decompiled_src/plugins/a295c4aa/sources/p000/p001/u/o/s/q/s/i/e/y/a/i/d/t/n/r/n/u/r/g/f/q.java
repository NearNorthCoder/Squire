package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Grinding sword", priority = 100, blocking = true)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.q  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/q.class */
public class q extends i {
    private static /* synthetic */ int[] llIlIlIlIIll;
    private static /* synthetic */ String[] llIlIlIlIIlI;
    private static final /* synthetic */ int ap;

    private static boolean lIIIIIllIIIlllI(Object obj) {
        return obj == null;
    }

    private static void lIIIIIllIIIllII() {
        llIlIlIlIIll = new int[5];
        llIlIlIlIIll[0] = (-21265) & 30718;
        llIlIlIlIIll[1] = (245 ^ 169) ^ (244 ^ 172);
        llIlIlIlIIll[2] = " ".length();
        llIlIlIlIIll[3] = (81 ^ 65) & ((92 ^ 76) ^ (-1));
        llIlIlIlIIll[4] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.i
    protected boolean M() {
        if (lIIIIIllIIIllIl(Players.getLocal().getAnimation(), llIlIlIlIIll[0])) {
            sleep(llIlIlIlIIll[1]);
            return llIlIlIlIIll[2];
        }
        return N();
    }

    private static void lIIIIIllIIIlIll() {
        llIlIlIlIIlI = new String[llIlIlIlIIll[4]];
        llIlIlIlIIlI[llIlIlIlIIll[3]] = lIIIIIllIIIlIlI("IyAhBxwXJicHHUQ7O0kWET4k", "dRHix");
        llIlIlIlIIlI[llIlIlIlIIll[2]] = lIIIIIllIIIlIlI("DDo9", "YIXWm");
    }

    private static boolean lIIIIIllIIIllll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.i
    protected boolean N() {
        TileObject s = this.P.s();
        if (lIIIIIllIIIlllI(s)) {
            Log.info(llIlIlIlIIlI[llIlIlIlIIll[3]]);
            return llIlIlIlIIll[3];
        }
        s.interact(llIlIlIlIIlI[llIlIlIlIIll[2]]);
        sleep(llIlIlIlIIll[1]);
        return llIlIlIlIIll[2];
    }

    private static boolean lIIIIIllIIIllIl(int i, int i2) {
        return i == i2;
    }

    @Inject
    public q(a aVar) {
        super(aVar, g.GRINDSTONE);
    }

    static {
        lIIIIIllIIIllII();
        lIIIIIllIIIlIll();
        ap = llIlIlIlIIll[0];
    }

    private static String lIIIIIllIIIlIlI(String lllllllllllllllIlIIIIlIlIlIllIII, String lllllllllllllllIlIIIIlIlIlIlIlll) {
        String lllllllllllllllIlIIIIlIlIlIllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIlIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIlIlIlIlIllI = new StringBuilder();
        char[] lllllllllllllllIlIIIIlIlIlIlIlIl = lllllllllllllllIlIIIIlIlIlIlIlll.toCharArray();
        int lllllllllllllllIlIIIIlIlIlIlIlII = llIlIlIlIIll[3];
        char[] charArray = lllllllllllllllIlIIIIlIlIlIllIII2.toCharArray();
        int lllllllllllllllIlIIIIlIlIlIIllIl = charArray.length;
        int i = llIlIlIlIIll[3];
        while (lIIIIIllIIIllll(i, lllllllllllllllIlIIIIlIlIlIIllIl)) {
            char lllllllllllllllIlIIIIlIlIlIIlIll = charArray[i];
            lllllllllllllllIlIIIIlIlIlIlIllI.append((char) (lllllllllllllllIlIIIIlIlIlIIlIll ^ lllllllllllllllIlIIIIlIlIlIlIlIl[lllllllllllllllIlIIIIlIlIlIlIlII % lllllllllllllllIlIIIIlIlIlIlIlIl.length]));
            "".length();
            lllllllllllllllIlIIIIlIlIlIlIlII++;
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIIlIlIlIlIllI);
    }
}
