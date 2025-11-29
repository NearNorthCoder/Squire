package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.util.Comparator;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Blood barragin rest")
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.w  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/w.class */
public class w extends Task {
    private final /* synthetic */ SquireZammyConfig as;
    private final /* synthetic */ Client at;
    private static /* synthetic */ int[] lIllIIlIIlIII;
    private final /* synthetic */ l ar;

    @Inject
    public w(l lVar, SquireZammyConfig squireZammyConfig, Client client) {
        this.ar = lVar;
        this.as = squireZammyConfig;
        this.at = client;
    }

    static {
        llIIIlIlllIIllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    public boolean run() {
        if (!llIIIlIlllIIlll(this.ar.B() ? 1 : 0) || llIIIlIlllIIlll(this.ar.A() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        if (llIIIlIlllIlIII(this.ar.H() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        int[] iArr = new int[lIllIIlIIlIII[1]];
        iArr[lIllIIlIIlIII[0]] = EnumC0004e.BALFRUG_KREEYATH.n();
        NPC nearest = NPCs.getNearest(iArr);
        if (llIIIlIlllIlIIl(nearest) && llIIIlIlllIlIII(nearest.isDead() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        int[] iArr2 = new int[lIllIIlIIlIII[1]];
        iArr2[lIllIIlIIlIII[0]] = EnumC0004e.TSTANON_KARLAK.n();
        NPC nearest2 = NPCs.getNearest(iArr2);
        int[] iArr3 = new int[lIllIIlIIlIII[1]];
        iArr3[lIllIIlIIlIII[0]] = EnumC0004e.ZAKLN_GRITCH.n();
        NPC nearest3 = NPCs.getNearest(iArr3);
        if (!llIIIlIlllIlIIl(nearest3) || !llIIIlIlllIlIII(nearest3.isDead() ? 1 : 0)) {
            return (!llIIIlIlllIlIIl(nearest2) || llIIIlIlllIIlll(nearest2.isDead() ? 1 : 0)) ? lIllIIlIIlIII[0] : e(nearest2);
        }
        if (llIIIlIlllIlIIl(nearest2)) {
            WorldArea worldArea = nearest3.getWorldArea();
            if (llIIIlIlllIlIII(nearest2.getWorldArea().contains(nearest3.getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint) worldArea.toWorldPointList().stream().flatMap(worldPoint -> {
                    WorldPoint[] worldPointArr = new WorldPoint[lIllIIlIIlIII[2]];
                    worldPointArr[lIllIIlIIlIII[0]] = worldPoint.dx(lIllIIlIIlIII[1]).dy(lIllIIlIIlIII[1]);
                    worldPointArr[lIllIIlIIlIII[1]] = worldPoint.dx(lIllIIlIIlIII[3]).dy(lIllIIlIIlIII[3]);
                    worldPointArr[lIllIIlIIlIII[4]] = worldPoint.dx(lIllIIlIIlIII[1]).dy(lIllIIlIIlIII[3]);
                    worldPointArr[lIllIIlIIlIII[5]] = worldPoint.dx(lIllIIlIIlIII[3]).dy(lIllIIlIIlIII[1]);
                    return Stream.of((Object[]) worldPointArr);
                }).max(Comparator.comparingDouble(worldPoint2 -> {
                    return worldPoint2.distanceTo2DHypotenuse(nearest2.getWorldLocation());
                })).orElse(worldArea.getCenter()));
                "".length();
                sleep(lIllIIlIIlIII[2]);
                return lIllIIlIIlIII[1];
            }
        }
        return e(nearest3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    private boolean e(NPC npc) {
        SpellBook.Ancient ancient;
        if (llIIIlIlllIIlll(this.as.useBloodBarrage() ? 1 : 0)) {
            ancient = SpellBook.Ancient.BLOOD_BARRAGE;
            "".length();
            if ("  ".length() <= (((((33 + 83) - 40) + 140) ^ (((29 + 18) - (-88)) + 14)) & (((((63 + 167) - 59) + 68) ^ (((100 + 78) - 142) + 126)) ^ (-" ".length())))) {
                return ((143 ^ 152) ^ (131 ^ 158)) & (((52 ^ 46) ^ (123 ^ 107)) ^ (-" ".length()));
            }
        } else {
            ancient = SpellBook.Ancient.BLOOD_BURST;
        }
        SpellBook.Ancient ancient2 = ancient;
        if (llIIIlIlllIlIII(ancient2.canCast() ? 1 : 0)) {
            return lIllIIlIIlIII[0];
        }
        Magic.cast(ancient2, npc);
        sleep(lIllIIlIIlIII[2]);
        return lIllIIlIIlIII[1];
    }

    private static boolean llIIIlIlllIIlll(int i) {
        return i != 0;
    }

    private static boolean llIIIlIlllIlIII(int i) {
        return i == 0;
    }

    private static void llIIIlIlllIIllI() {
        lIllIIlIIlIII = new int[6];
        lIllIIlIIlIII[0] = (141 ^ 129) & ((60 ^ 48) ^ (-1));
        lIllIIlIIlIII[1] = " ".length();
        lIllIIlIIlIII[2] = (((131 + 142) - 177) + 48) ^ (((136 + 38) - 78) + 52);
        lIllIIlIIlIII[3] = -" ".length();
        lIllIIlIIlIII[4] = "  ".length();
        lIllIIlIIlIII[5] = "   ".length();
    }

    private static boolean llIIIlIlllIlIIl(Object obj) {
        return obj != null;
    }
}
