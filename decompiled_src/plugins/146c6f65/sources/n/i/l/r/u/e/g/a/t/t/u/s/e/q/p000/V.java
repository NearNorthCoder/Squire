package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Enabling offensive prayers", priority = 100, register = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.V  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/V.class */
public class V extends AbstractC0013n {
    private /* synthetic */ int bH;
    private /* synthetic */ int ce;
    private static /* synthetic */ int[] llIlIIlIIIII;

    private static boolean lIIIIIIlIlllIlI(int i) {
        return i == 0;
    }

    private static boolean lIIIIIIlIlllllI(int i, int i2) {
        return i > i2;
    }

    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        this.bH += llIlIIlIIIII[2];
        return bI();
    }

    private static void lIIIIIIlIlllIIl() {
        llIlIIlIIIII = new int[5];
        llIlIIlIIIII[0] = "   ".length();
        llIlIIlIIIII[1] = ((((55 + 15) - (-5)) + 59) ^ (((154 + 125) - 241) + 157)) & (((91 ^ 97) ^ (((123 + 82) - 120) + 42)) ^ (-" ".length()));
        llIlIIlIIIII[2] = " ".length();
        llIlIIlIIIII[3] = "  ".length();
        llIlIIlIIIII[4] = (221 ^ 176) ^ (99 ^ 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean bH() {
        if (lIIIIIIlIlllIlI(Prayers.anyActive() ? 1 : 0)) {
            return llIlIIlIIIII[1];
        }
        Prayers.disableAll();
        return llIlIIlIIIII[2];
    }

    static {
        lIIIIIIlIlllIIl();
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (lIIIIIIlIllllII(Equipment.contains(C0004e.V) ? 1 : 0)) {
            return;
        }
        Actor interacting = projectileSpawned.getProjectile().getInteracting();
        if (lIIIIIIlIllllll(interacting)) {
            return;
        }
        Player local = Players.getLocal();
        if (!lIIIIIIlIlllIll(local) || lIIIIIIllIIIIII(interacting, local.getInteracting())) {
            return;
        }
        this.ce = this.bH + llIlIIlIIIII[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    private boolean bI() {
        int i;
        List<Prayer> bd = bd();
        if (!lIIIIIIlIlllIll(bd) || lIIIIIIlIllllII(bd.isEmpty() ? 1 : 0)) {
            return bH();
        }
        if (lIIIIIIlIlllIll(Players.getLocal().getInteracting())) {
            i = llIlIIlIIIII[2];
            "".length();
            if ((-(147 ^ 150)) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIlIIlIIIII[1];
        }
        int i2 = i;
        if (lIIIIIIlIlllIlI(i2) && lIIIIIIlIllllII(Prayers.anyActive() ? 1 : 0)) {
            return bH();
        }
        if (lIIIIIIlIllllII(i2) && (!lIIIIIIlIllllIl(this.bH, this.ce) || lIIIIIIlIlllllI(this.bH, this.ce))) {
            for (Prayer prayer : bd) {
                if (lIIIIIIlIlllIlI(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    Prayers.toggle(prayer);
                    return llIlIIlIIIII[2];
                }
                "".length();
                if (0 != 0) {
                    return ((((189 + 48) - 187) + 150) ^ (((90 + 117) - 165) + 112)) & (((75 ^ 23) ^ (88 ^ 86)) ^ (-" ".length()));
                }
            }
        }
        return llIlIIlIIIII[1];
    }

    private static boolean lIIIIIIllIIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIIIIIlIlllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIlIllllII(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        if (lIIIIIIlIlllIlI(Equipment.contains(C0004e.V) ? 1 : 0)) {
            return;
        }
        Player local = Players.getLocal();
        if (lIIIIIIlIllllll(local)) {
            return;
        }
        NPC interacting = local.getInteracting();
        if (!lIIIIIIllIIIIIl(hitsplatApplied.getActor(), interacting) || lIIIIIIlIllllII(interacting.isDead() ? 1 : 0)) {
            return;
        }
        this.ce = this.bH + llIlIIlIIIII[4];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIlIIIII[0]];
        enumC0003dArr[llIlIIlIIIII[1]] = EnumC0003d.FIRST_ROTATION_EXPLORE;
        enumC0003dArr[llIlIIlIIIII[2]] = EnumC0003d.DEMI_BOSS_EXPLORE;
        enumC0003dArr[llIlIIlIIIII[3]] = EnumC0003d.EXTRA_FOOD_EXPLORE;
        this.bH = llIlIIlIIIII[1];
        this.ce = llIlIIlIIIII[1];
    }

    private static boolean lIIIIIIlIllllIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIIIIlIllllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIIllIIIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }
}
