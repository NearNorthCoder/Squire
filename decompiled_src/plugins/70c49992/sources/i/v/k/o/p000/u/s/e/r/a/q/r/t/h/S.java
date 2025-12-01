package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.scene.Tiles;
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.S  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/S.class */
public class S {
    private /* synthetic */ Set<WorldPoint> cQ = new HashSet();
    private static /* synthetic */ int[] lIlIlIlIIIIll;

    public Set<WorldPoint> ak() {
        return this.cQ;
    }

    public void b(Predicate<WorldPoint> predicate) {
        this.cQ.removeIf(predicate);
        "".length();
    }

    private static boolean lIlllllIIlllIIl(int i2) {
        return i2 == 0;
    }

    static {
        lIlllllIIllIlll();
    }

    public void a(WorldArea... worldAreaArr) {
        int length = worldAreaArr.length;
        int llllllllllllllIllIlIllIlIllllIll = lIlIlIlIIIIll[0];
        while (lIlllllIIlllIII(llllllllllllllIllIlIllIlIllllIll, length)) {
            List worldPointList = worldAreaArr[llllllllllllllIllIlIllIlIllllIll].toWorldPointList();
            Set<WorldPoint> set = this.cQ;
            Objects.requireNonNull(set);
            "".length();
            worldPointList.forEach((v1) -> {
                r1.remove(v1);
            });
            llllllllllllllIllIlIllIlIllllIll++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return;
            }
        }
    }

    private static void lIlllllIIllIlll() {
        lIlIlIlIIIIll = new int[2];
        lIlIlIlIIIIll[0] = (132 ^ 130) & ((81 ^ 87) ^ (-1)) & (((63 ^ 54) & ((157 ^ 148) ^ (-1))) ^ (-1));
        lIlIlIlIIIIll[1] = " ".length();
    }

    public void j(WorldPoint worldPoint) {
        this.cQ.remove(worldPoint);
        "".length();
    }

    private static boolean lIlllllIIlllIII(int i2, int i3) {
        return i2 < i3;
    }

    public S(Client client, WorldArea worldArea) {
        Stream map = Tiles.getAll(tile -> {
            if (lIlllllIIlllIIl(tile.getPlane())) {
                ?? r0 = lIlIlIlIIIIll[1];
                "".length();
                return 0 != 0 ? ((((30 + 150) - 29) + 4) ^ (((116 + 42) - (-18)) + 15)) & (((195 ^ 149) ^ (198 ^ 180)) ^ (-" ".length())) : r0;
            }
            return lIlIlIlIIIIll[0];
        }).stream().filter(tile2 -> {
            return worldArea.contains(WorldPoint.fromLocalInstance(client, tile2.getLocalLocation()));
        }).map((v0) -> {
            return v0.getWorldLocation();
        });
        Set<WorldPoint> set = this.cQ;
        Objects.requireNonNull(set);
        "".length();
        map.forEach((v1) -> {
            r1.add(v1);
        });
    }

    public boolean ai() {
        return this.cQ.isEmpty();
    }

    public void aj() {
        this.cQ.clear();
    }
}
