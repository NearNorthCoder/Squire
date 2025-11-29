package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving off fire", priority = 8, register = true, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.w  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/w.class */
public class C0074w extends Task {
    private final /* synthetic */ SquireCerberusConfig aK;
    private static /* synthetic */ int[] lIIlIIII;
    private final /* synthetic */ Client aJ;
    private final /* synthetic */ C0000a aI;

    private static boolean lIIIlIIllI(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIIIlIIlII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIIIlIIIll(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIIIlIIlIl(int i2) {
        return i2 == 0;
    }

    private static boolean lIIIIllllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    public boolean run() {
        if (!lIIIIllllI(this.aI.k()) || lIIIlIIIII(this.aI.k().y())) {
            return lIIlIIII[0];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        int[] iArr = new int[lIIlIIII[1]];
        iArr[lIIlIIII[0]] = lIIlIIII[2];
        List all = Projectiles.getAll(iArr);
        Deque<GraphicsObject> graphicsObjects = this.aJ.getGraphicsObjects();
        ArrayList arrayList = new ArrayList();
        all.forEach(projectile -> {
            arrayList.add(WorldPoint.fromLocal(this.aJ, projectile.getTarget()));
            "".length();
        });
        for (GraphicsObject graphicsObject : graphicsObjects) {
            if (!lIIIlIIIll(graphicsObject.getId(), lIIlIIII[3]) || lIIIlIIlII(graphicsObject.getId(), lIIlIIII[2])) {
                arrayList.add(WorldPoint.fromLocal(this.aJ, graphicsObject.getLocation()));
                "".length();
            }
            "".length();
            if ((((240 ^ 158) ^ (209 ^ 137)) & (((88 ^ 84) ^ (22 ^ 44)) ^ (-" ".length())) & ((((172 ^ 183) ^ (152 ^ 138)) & (((31 ^ 116) ^ (107 ^ 9)) ^ (-" ".length()))) ^ (-" ".length()))) != (((37 ^ 31) ^ (177 ^ 195)) & (((((12 + 159) - 5) + 36) ^ (((94 + 121) - 203) + 118)) ^ (-" ".length())))) {
                return ((((65 + 127) - 110) + 57) ^ (((23 + 67) - 33) + 110)) & (((((109 + 5) - 14) + 43) ^ (((50 + 25) - (-43)) + 45)) ^ (-" ".length()));
            }
        }
        if (lIIIlIIIlI(arrayList.stream().noneMatch(worldPoint -> {
            if (lIIIlIIllI(worldPoint.distanceTo(worldLocation), lIIlIIII[1])) {
                ?? r0 = lIIlIIII[1];
                "".length();
                return 0 != 0 ? ((61 ^ 41) ^ (114 ^ 77)) & (("  ".length() ^ (49 ^ 24)) ^ (-" ".length())) : r0;
            }
            return lIIlIIII[0];
        }) ? 1 : 0)) {
            return lIIlIIII[0];
        }
        WorldArea worldArea = this.aI.k().y().getWorldArea();
        WorldPoint worldPoint2 = (WorldPoint) worldArea.toWorldPointList().stream().flatMap(worldPoint3 -> {
            WorldPoint[] worldPointArr = new WorldPoint[lIIlIIII[5]];
            worldPointArr[lIIlIIII[0]] = worldPoint3.dy(lIIlIIII[1]);
            worldPointArr[lIIlIIII[1]] = worldPoint3.dy(lIIlIIII[6]);
            worldPointArr[lIIlIIII[7]] = worldPoint3.dx(lIIlIIII[1]);
            worldPointArr[lIIlIIII[4]] = worldPoint3.dx(lIIlIIII[6]);
            return Stream.of((Object[]) worldPointArr);
        }).filter(worldPoint4 -> {
            if (lIIIlIIlIl(worldArea.contains(worldPoint4) ? 1 : 0)) {
                ?? r0 = lIIlIIII[1];
                "".length();
                return (-" ".length()) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIII[0];
        }).filter(worldPoint5 -> {
            return arrayList.stream().noneMatch(worldPoint5 -> {
                if (lIIIlIIllI(worldPoint5.distanceTo(worldPoint5), lIIlIIII[1])) {
                    ?? r0 = lIIlIIII[1];
                    "".length();
                    return (-" ".length()) != (-" ".length()) ? ((126 ^ 91) ^ (30 ^ 48)) & (((15 ^ 41) ^ (56 ^ 21)) ^ (-" ".length())) : r0;
                }
                return lIIlIIII[0];
            });
        }).min(Comparator.comparingDouble(worldPoint6 -> {
            return worldPoint6.distanceTo2DHypotenuse(worldLocation);
        })).orElse(null);
        if (lIIIlIIIII(worldPoint2)) {
            return lIIlIIII[0];
        }
        if (lIIIlIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            Movement.setDestination(worldPoint2);
        }
        sleep(lIIlIIII[4]);
        return lIIlIIII[1];
    }

    static {
        lIIIIlllIl();
    }

    private static boolean lIIIlIIIII(Object obj) {
        return obj == null;
    }

    @Inject
    private C0074w(C0000a c0000a, Client client, SquireCerberusConfig squireCerberusConfig) {
        this.aI = c0000a;
        this.aJ = client;
        this.aK = squireCerberusConfig;
    }

    private static void lIIIIlllIl() {
        lIIlIIII = new int[8];
        lIIlIIII[0] = ((81 ^ 126) ^ (8 ^ 113)) & (((((175 + 97) - 147) + 85) ^ (((58 + 122) - 67) + 19)) ^ (-" ".length())) & ((((((112 + 117) - (-1)) + 3) ^ (((30 + 21) - (-77)) + 39)) & (((((89 + 106) - 75) + 84) ^ (((48 + 50) - 31) + 63)) ^ (-" ".length()))) ^ (-" ".length()));
        lIIlIIII[1] = " ".length();
        lIIlIIII[2] = (-26625) & 27871;
        lIIlIIII[3] = (-19201) & 20446;
        lIIlIIII[4] = "   ".length();
        lIIlIIII[5] = (115 ^ 69) ^ (124 ^ 78);
        lIIlIIII[6] = -" ".length();
        lIIlIIII[7] = "  ".length();
    }

    private static boolean lIIIlIIIlI(int i2) {
        return i2 != 0;
    }
}
