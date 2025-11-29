/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.scene.Tiles
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.scene.Tiles;

public class S {
    private /* synthetic */ Set<WorldPoint> cQ;
    private static /* synthetic */ int[] lIlIlIlIIIIll;

    public Set<WorldPoint> ak() {
        return this.cQ;
    }

    public void b(Predicate<WorldPoint> predicate) {
        this.cQ.removeIf(predicate);
        "".length();
    }

    private static boolean lIlllllIIlllIIl(int n2) {
        return n2 == 0;
    }

    static {
        S.lIlllllIIllIlll();
    }

    /*
     * WARNING - void declaration
     */
    public void a(WorldArea ... worldAreaArray) {
        void llllllllllllllIllIlIllIlIlllllII;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int n2 = worldAreaArray2.length;
        int llllllllllllllIllIlIllIlIllllIll = lIlIlIlIIIIll[0];
        while (S.lIlllllIIlllIII(llllllllllllllIllIlIllIlIllllIll, (int)llllllllllllllIllIlIllIlIlllllII)) {
            S llllllllllllllIllIlIllIlIlllllll;
            void llllllllllllllIllIlIllIlIlllllIl;
            void llllllllllllllIllIlIllIlIllllIlI = llllllllllllllIllIlIllIlIlllllIl[llllllllllllllIllIlIllIlIllllIll];
            List list = llllllllllllllIllIlIllIlIllllIlI.toWorldPointList();
            Set<WorldPoint> set = llllllllllllllIllIlIllIlIlllllll.cQ;
            Objects.requireNonNull(set);
            "".length();
            list.forEach(set::remove);
            ++llllllllllllllIllIlIllIlIllllIll;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return;
        }
    }

    private static void lIlllllIIllIlll() {
        lIlIlIlIIIIll = new int[2];
        S.lIlIlIlIIIIll[0] = (0x84 ^ 0x82) & ~(0x51 ^ 0x57) & ~((0x3F ^ 0x36) & ~(0x9D ^ 0x94));
        S.lIlIlIlIIIIll[1] = " ".length();
    }

    public void j(WorldPoint worldPoint) {
        this.cQ.remove(worldPoint);
        "".length();
    }

    private static boolean lIlllllIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    public S(Client client, WorldArea worldArea) {
        this.cQ = new HashSet<WorldPoint>();
        Stream<WorldPoint> stream = Tiles.getAll(tile -> {
            boolean bl;
            if (S.lIlllllIIlllIIl(tile.getPlane())) {
                bl = lIlIlIlIIIIll[1];
                "".length();
                if (null != null) {
                    return ((30 + 150 - 29 + 4 ^ 116 + 42 - -18 + 15) & (0xC3 ^ 0x95 ^ (0xC6 ^ 0xB4) ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlIlIlIIIIll[0];
            }
            return bl;
        }).stream().filter(tile -> worldArea.contains(WorldPoint.fromLocalInstance((Client)client, (LocalPoint)tile.getLocalLocation()))).map(Locatable::getWorldLocation);
        Set<WorldPoint> set = this.cQ;
        Objects.requireNonNull(set);
        "".length();
        stream.forEach(set::add);
    }

    public boolean ai() {
        return this.cQ.isEmpty();
    }

    public void aj() {
        this.cQ.clear();
    }
}

