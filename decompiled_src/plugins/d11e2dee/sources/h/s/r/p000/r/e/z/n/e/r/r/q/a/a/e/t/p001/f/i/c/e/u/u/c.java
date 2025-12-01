package h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Breaking Essence Blocks")
/* renamed from: h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.c  reason: invalid package */
/* loaded from: d11e2dee-7190-435e-95f6-a7b9761c02e8.jar:h/s/r/-/r/e/z/n/e/r/r/q/a/a/e/t/-/f/i/c/e/u/u/c.class */
public class c extends Task {
    private static /* synthetic */ int[] lIllIIlllIIII;
    private final /* synthetic */ a q;
    private static final /* synthetic */ int p;
    private final /* synthetic */ SquireZeahRunecrafter r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIllIlllIIII(this.r.a() ? 1 : 0) || llIIIllIlllIIII(k() ? 1 : 0)) {
            return lIllIIlllIIII[0];
        }
        List<Item> l = l();
        if (llIIIllIlllIIII(l.isEmpty() ? 1 : 0)) {
            return lIllIIlllIIII[0];
        }
        a(l);
        return lIllIIlllIIII[1];
    }

    private static boolean llIIIllIlllIIII(int i) {
        return i != 0;
    }

    private List<Item> l() {
        int[] iArr = new int[lIllIIlllIIII[1]];
        iArr[lIllIIlllIIII[0]] = lIllIIlllIIII[2];
        return Inventory.getAll(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean k() {
        if (llIIIllIlllIIIl(this.q.j(), this.q.h())) {
            ?? r0 = lIllIIlllIIII[1];
            "".length();
            return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIlllIIII[0];
    }

    static {
        llIIIllIllIllll();
        p = lIllIIlllIIII[3];
    }

    private static boolean llIIIllIlllIIIl(int i, int i2) {
        return i >= i2;
    }

    private static void llIIIllIllIllll() {
        lIllIIlllIIII = new int[5];
        lIllIIlllIIII[0] = ((183 ^ 135) ^ (217 ^ 178)) & (((246 ^ 179) ^ (42 ^ 52)) ^ (-" ".length()));
        lIllIIlllIIII[1] = " ".length();
        lIllIIlllIIII[2] = (-19266) & 32711;
        lIllIIlllIIII[3] = 0 ^ 8;
        lIllIIlllIIII[4] = (-((-4811) & 29647)) & (-4097) & 30687;
    }

    private void a(List<Item> list) {
        int min = Math.min(lIllIIlllIIII[3], list.size());
        int i = lIllIIlllIIII[0];
        while (llIIIllIlllIIlI(i, min)) {
            int[] iArr = new int[lIllIIlllIIII[1]];
            iArr[lIllIIlllIIII[0]] = lIllIIlllIIII[4];
            list.get(i).useOn(Inventory.getFirst(iArr));
            i++;
            "".length();
            if ("  ".length() == (-" ".length())) {
                return;
            }
        }
    }

    private static boolean llIIIllIlllIIlI(int i, int i2) {
        return i < i2;
    }

    @Inject
    public c(a aVar, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.q = aVar;
        this.r = squireZeahRunecrafter;
    }
}
