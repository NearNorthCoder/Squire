/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
 */
package y.l.q.i.-.g.u.s.r.e.t.a.i.i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;

public class a {
    private final /* synthetic */ WorldPoint h;
    private final /* synthetic */ List<WorldPoint> j;
    private final /* synthetic */ int k;
    private final /* synthetic */ WorldPoint i;
    private static /* synthetic */ int[] lIlIllllIIl;

    public a(int n, int n2, int n3, int n4, int n5) {
        this(new WorldPoint(n, n2, n5), new WorldPoint(n3, n4, n5), n5);
    }

    /*
     * WARNING - void declaration
     */
    public a(WorldPoint worldPoint, WorldPoint worldPoint2, int n) {
        void llllllllllllllllIlIlIllIlIlllIlI;
        void llllllllllllllllIlIlIllIlIllllII;
        this.h = worldPoint;
        this.i = worldPoint2;
        this.k = n;
        this.j = new ArrayList<WorldPoint>();
        int n2 = this.e().getX();
        int n3 = this.e().getY();
        int n4 = this.f().getX();
        int n5 = this.f().getY();
        int llllllllllllllllIlIlIllIlIlllIII = Math.min(n2, n4);
        while (a.lIIlIlIIIIllII(llllllllllllllllIlIlIllIlIlllIII, Math.max((int)llllllllllllllllIlIlIllIlIllllII, (int)llllllllllllllllIlIlIllIlIlllIlI))) {
            void llllllllllllllllIlIlIllIlIlllIIl;
            void llllllllllllllllIlIlIllIlIlllIll;
            int llllllllllllllllIlIlIllIlIllIlll = Math.max((int)llllllllllllllllIlIlIllIlIlllIll, (int)llllllllllllllllIlIlIllIlIlllIIl);
            while (a.lIIlIlIIIIllIl(llllllllllllllllIlIlIllIlIllIlll, Math.min((int)llllllllllllllllIlIlIllIlIlllIll, (int)llllllllllllllllIlIlIllIlIlllIIl))) {
                void llllllllllllllllIlIlIllIlIllllIl;
                a llllllllllllllllIlIlIllIllIIIIII;
                llllllllllllllllIlIlIllIllIIIIII.j.add(new WorldPoint(llllllllllllllllIlIlIllIlIlllIII, llllllllllllllllIlIlIllIlIllIlll, (int)llllllllllllllllIlIlIllIlIllllIl));
                "".length();
                --llllllllllllllllIlIlIllIlIllIlll;
                "".length();
                if (null == null) continue;
                throw null;
            }
            ++llllllllllllllllIlIlIllIlIlllIII;
            "".length();
            if (-"   ".length() < 0) continue;
            throw null;
        }
    }

    public List<WorldPoint> c() {
        return this.j;
    }

    static {
        a.lIIlIlIIIIlIll();
    }

    public int h() {
        return Math.max(this.e().getY(), this.f().getY()) + lIlIllllIIl[1] - Math.min(this.e().getY(), this.f().getY());
    }

    public int g() {
        return Math.max(this.e().getX(), this.f().getX()) + lIlIllllIIl[1] - Math.min(this.e().getX(), this.f().getX());
    }

    public WorldPoint f() {
        return this.i;
    }

    public WorldPoint i() {
        List<WorldPoint> list = this.c();
        int n = lIlIllllIIl[0];
        int n2 = lIlIllllIIl[0];
        Iterator<WorldPoint> llllllllllllllllIlIlIllIlIlIIlII = list.iterator();
        while (a.lIIlIlIIIIlllI(llllllllllllllllIlIlIllIlIlIIlII.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllllIlIlIllIlIlIIIll = llllllllllllllllIlIlIllIlIlIIlII.next();
            llllllllllllllllIlIlIllIlIlIIllI += llllllllllllllllIlIlIllIlIlIIIll.getX();
            llllllllllllllllIlIlIllIlIlIIlIl += llllllllllllllllIlIlIllIlIlIIIll.getY();
            "".length();
            if ((116 + 66 - 128 + 96 ^ 112 + 97 - 133 + 71) != 0) continue;
            return null;
        }
        return new WorldPoint(n /= list.size(), n2 /= list.size(), this.d());
    }

    private static void lIIlIlIIIIlIll() {
        lIlIllllIIl = new int[2];
        a.lIlIllllIIl[0] = (0xA2 ^ 0x8A) & ~(0x25 ^ 0xD);
        a.lIlIllllIIl[1] = " ".length();
    }

    public a(int n, int n2, int n3, int n4) {
        this(n, n2, n3, n4, lIlIllllIIl[0]);
    }

    public int d() {
        return this.k;
    }

    public WorldPoint e() {
        return this.h;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldPoint> llllllllllllllllIlIlIllIlIllIIII = this.c().iterator();
        while (a.lIIlIlIIIIlllI(llllllllllllllllIlIlIllIlIllIIII.hasNext() ? 1 : 0)) {
            void llllllllllllllllIlIlIllIlIllIIIl;
            WorldPoint llllllllllllllllIlIlIllIlIlIllll = llllllllllllllllIlIlIllIlIllIIII.next();
            if (a.lIIlIlIIIIlllI(llllllllllllllllIlIlIllIlIllIIIl.getWorldLocation().equals((Object)llllllllllllllllIlIlIllIlIlIllll) ? 1 : 0)) {
                return lIlIllllIIl[1];
            }
            "".length();
            if (((0xF0 ^ 0x93 ^ (0x78 ^ 0x20)) & (91 + 27 - 72 + 96 ^ 113 + 43 - 49 + 74 ^ -" ".length())) > -" ".length()) continue;
            return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
        }
        return lIlIllllIIl[0];
    }

    private static boolean lIIlIlIIIIlllI(int n) {
        return n != 0;
    }

    public a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this(worldPoint, worldPoint2, lIlIllllIIl[0]);
    }

    private static boolean lIIlIlIIIIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlIlIIIIllII(int n, int n2) {
        return n <= n2;
    }
}

