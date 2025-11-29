package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.NPC;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/b.class */
public class C0001b {
    private /* synthetic */ int A;
    private /* synthetic */ int B;
    private /* synthetic */ int y;
    private /* synthetic */ int z;
    private final /* synthetic */ EventBus u;
    private static /* synthetic */ int[] llIIllIllIIl;
    private /* synthetic */ int x;
    private /* synthetic */ int w;
    private /* synthetic */ Map<NPC, Integer> v = new HashMap();

    public void v() {
        this.y = llIIllIllIIl[4];
        this.A = llIIllIllIIl[4];
    }

    private static boolean lllllllIIllIll(int i) {
        return i > 0;
    }

    public void a(NPC npc) {
        this.v.put(npc, Integer.valueOf(llIIllIllIIl[5]));
        "".length();
    }

    public int b(NPC npc) {
        return this.v.getOrDefault(npc, Integer.valueOf(llIIllIllIIl[1])).intValue();
    }

    public void d(int i) {
        this.w = i;
    }

    private static boolean lllllllIIllIlI(int i) {
        return i == 0;
    }

    public void c(int i) {
        this.B = i;
        this.y = llIIllIllIIl[2];
        this.z = llIIllIllIIl[2];
        this.A = llIIllIllIIl[2];
    }

    public int z() {
        return this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean s() {
        if (lllllllIIllIll(this.A)) {
            ?? r0 = llIIllIllIIl[0];
            "".length();
            return "  ".length() == "   ".length() ? (true ^ true) & ((!true) ^ true) : r0;
        }
        return llIIllIllIIl[1];
    }

    @Inject
    public C0001b(EventBus eventBus) {
        this.u = eventBus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean q() {
        if (lllllllIIllIll(this.y)) {
            ?? r0 = llIIllIllIIl[0];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllIllIIl[1];
    }

    public void w() {
        v();
        this.z = llIIllIllIIl[4];
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        this.w += llIIllIllIIl[0];
        for (NPC npc : this.v.keySet()) {
            int intValue = this.v.get(npc).intValue() - llIIllIllIIl[0];
            if (lllllllIIllIlI(intValue)) {
                this.v.remove(npc);
                "".length();
                "".length();
                if ((-"   ".length()) >= 0) {
                    return;
                }
            } else {
                this.v.put(npc, Integer.valueOf(intValue));
                "".length();
            }
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return;
            }
        }
        if (lllllllIIllIIl(p() ? 1 : 0)) {
            this.x -= llIIllIllIIl[0];
        }
        if (lllllllIIllIIl(q() ? 1 : 0)) {
            this.y -= llIIllIllIIl[0];
        }
        if (lllllllIIllIIl(t() ? 1 : 0)) {
            this.B -= llIIllIllIIl[0];
        }
        if (lllllllIIllIIl(r() ? 1 : 0)) {
            this.z -= llIIllIllIIl[0];
        }
        if (lllllllIIllIIl(s() ? 1 : 0)) {
            this.A -= llIIllIllIIl[0];
        }
    }

    private static void lllllllIIllIII() {
        llIIllIllIIl = new int[6];
        llIIllIllIIl[0] = " ".length();
        llIIllIllIIl[1] = (80 ^ 79) & ((52 ^ 43) ^ (-1));
        llIIllIllIIl[2] = "  ".length();
        llIIllIllIIl[3] = 107 ^ 111;
        llIIllIllIIl[4] = "   ".length();
        llIIllIllIIl[5] = (140 ^ 165) ^ (99 ^ 95);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean p() {
        if (lllllllIIllIll(this.x)) {
            ?? r0 = llIIllIllIIl[0];
            "".length();
            return (-" ".length()) > 0 ? ((((67 + 18) - (-5)) + 67) ^ (((118 + 166) - 251) + 150)) & (((253 ^ 181) ^ (102 ^ 4)) ^ (-" ".length())) : r0;
        }
        return llIIllIllIIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean r() {
        if (lllllllIIllIll(this.z)) {
            ?? r0 = llIIllIllIIl[0];
            "".length();
            return "   ".length() == 0 ? ((78 ^ 3) ^ (22 ^ 29)) & (((117 ^ 25) ^ (128 ^ 170)) ^ (-" ".length())) : r0;
        }
        return llIIllIllIIl[1];
    }

    private static boolean lllllllIIllIIl(int i) {
        return i != 0;
    }

    public void x() {
        this.u.register(this);
        d(llIIllIllIIl[1]);
    }

    public void u() {
        this.B = llIIllIllIIl[3];
        this.y = llIIllIllIIl[4];
    }

    public void y() {
        this.u.unregister(this);
        d(llIIllIllIIl[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean t() {
        if (lllllllIIllIll(this.B)) {
            ?? r0 = llIIllIllIIl[0];
            "".length();
            return " ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllIllIIl[1];
    }

    public void e(int i) {
        this.x = i;
    }

    static {
        lllllllIIllIII();
    }
}
