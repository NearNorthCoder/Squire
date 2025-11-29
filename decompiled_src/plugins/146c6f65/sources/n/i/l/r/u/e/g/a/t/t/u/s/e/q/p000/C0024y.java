package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Swapping prayers", priority = 250, register = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.y  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/y.class */
public class C0024y extends AbstractC0013n {
    private static /* synthetic */ String[] llIIlllIlIII;
    private /* synthetic */ Projectile bG;
    private static /* synthetic */ int[] llIIlllIlIIl;
    private /* synthetic */ int bH;

    private static boolean lllllllllIIIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        if (llllllllIlllII(Prayers.getPoints())) {
            Item first = Inventory.getFirst(item -> {
                return C0004e.aI.contains(Integer.valueOf(item.getId()));
            });
            if (llllllllIlllIl(first)) {
                return llIIlllIlIIl[1];
            }
            first.interact(llIIlllIlIII[llIIlllIlIIl[1]]);
        }
        C0009j X = this.ba.X();
        Player local = Players.getLocal();
        if (!llllllllIllllI(X) || !llllllllIllllI(X.aI()) || !llllllllIlllII(X.aI().isDead() ? 1 : 0) || !llllllllIllllI(local) || !llllllllIlllII(local.isDead() ? 1 : 0) || llllllllIlllll(X.aI().getAnimation(), llIIlllIlIIl[2])) {
            Prayers.disableAll();
            return llIIlllIlIIl[0];
        } else if (llllllllIllllI(this.bG) && lllllllllIIIII(this.bH + llIIlllIlIIl[3], bw()) && lllllllllIIIIl(bx() ? 1 : 0)) {
            return llIIlllIlIIl[0];
        } else {
            ArrayList<Prayer> arrayList = new ArrayList();
            arrayList.add(X.aG());
            "".length();
            List<Prayer> bd = bd();
            if (llllllllIllllI(bd) && llllllllIlllII(bd.isEmpty() ? 1 : 0)) {
                arrayList.addAll(bd);
                "".length();
            }
            if (lllllllllIIIIl(this.ba.h().flickBossFight() ? 1 : 0)) {
                Prayers.flick(arrayList);
                "".length();
                return llIIlllIlIIl[0];
            }
            for (Prayer prayer : arrayList) {
                if (llllllllIlllII(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    Prayers.toggle(prayer);
                }
                "".length();
                if ("   ".length() <= 0) {
                    return ((((215 + 183) - 145) + 2) ^ (((105 + 81) - 58) + 39)) & (((93 ^ 43) ^ (136 ^ 166)) ^ (-" ".length()));
                }
            }
            return llIIlllIlIIl[1];
        }
    }

    private static boolean lllllllllIIIll(int i) {
        return i > 0;
    }

    private static boolean llllllllIlllll(int i, int i2) {
        return i == i2;
    }

    private int bw() {
        return this.ba.X().aK() + llIIlllIlIIl[4];
    }

    static {
        llllllllIllIll();
        llllllllIllIlI();
    }

    private static boolean lllllllllIIIlI(int i, int i2) {
        return i > i2;
    }

    private static void llllllllIllIll() {
        llIIlllIlIIl = new int[12];
        llIIlllIlIIl[0] = " ".length();
        llIIlllIlIIl[1] = ((199 ^ 143) ^ (43 ^ 110)) & (((57 ^ 62) ^ (87 ^ 93)) ^ (-" ".length()));
        llIIlllIlIIl[2] = (-((-29125) & 31181)) & (-4098) & 14575;
        llIIlllIlIIl[3] = "  ".length();
        llIIlllIlIIl[4] = "   ".length();
        llIIlllIlIIl[5] = 71 ^ 89;
        llIIlllIlIIl[6] = 50 ^ 56;
        llIIlllIlIIl[7] = 178 ^ 191;
        llIIlllIlIIl[8] = 164 ^ 180;
        llIIlllIlIIl[9] = (-5913) & 14330;
        llIIlllIlIIl[10] = (-16590) & 25343;
        llIIlllIlIIl[11] = (-23749) & 32503;
    }

    private static boolean llllllllIlllII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean bx() {
        int i;
        if (!lllllllllIIIIl(this.ba.h().flickRedemption() ? 1 : 0) || (lllllllllIIIlI(Prayers.getPoints(), llIIlllIlIIl[5]) && lllllllllIIIIl(Inventory.contains(item -> {
            return C0004e.aH.contains(Integer.valueOf(item.getId()));
        }) ? 1 : 0))) {
            return llIIlllIlIIl[1];
        }
        int level = Skills.getLevel(Skill.HITPOINTS) / llIIlllIlIIl[6];
        if (lllllllllIIIIl(this.ba.h().makeArmour() ? 1 : 0)) {
            i = llIIlllIlIIl[7];
            "".length();
            if (0 != 0) {
                return ((60 ^ 127) ^ (126 ^ 121)) & (((53 ^ 122) ^ (7 ^ 12)) ^ (-" ".length()));
            }
        } else {
            i = llIIlllIlIIl[8];
        }
        if (lllllllllIIIlI(Skills.getBoostedLevel(Skill.HITPOINTS), level + i)) {
            return llIIlllIlIIl[1];
        }
        if (lllllllllIIIll(by()) && llllllllIlllII(Prayers.isEnabled(Prayer.REDEMPTION) ? 1 : 0)) {
            Prayers.toggle(Prayer.REDEMPTION);
        }
        return llIIlllIlIIl[0];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0024y(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlllIlIIl[0]];
        enumC0003dArr[llIIlllIlIIl[1]] = EnumC0003d.BOSS_FIGHT;
        this.bH = llIIlllIlIIl[1];
    }

    private static boolean lllllllllIIlII(int i, int i2) {
        return i < i2;
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        C0009j X = this.ba.X();
        if (!llllllllIllllI(actor) || llllllllIlllIl(X)) {
            return;
        }
        if (llllllllIlllll(actor.getAnimation(), llIIlllIlIIl[9])) {
            this.bG = null;
            X.j(this.bH);
        }
        if (!llllllllIlllll(actor.getAnimation(), llIIlllIlIIl[10])) {
            if (llllllllIlllll(actor.getAnimation(), llIIlllIlIIl[11])) {
                X.a(Prayer.PROTECT_FROM_MISSILES);
                return;
            }
            return;
        }
        X.a(Prayer.PROTECT_FROM_MAGIC);
        "".length();
        if ((-"  ".length()) >= 0) {
        }
    }

    private static String llllllllIllIIl(String lllllllllllllllIlIIlIIIllIllllIl, String lllllllllllllllIlIIlIIIllIllllII) {
        String lllllllllllllllIlIIlIIIllIllllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIllIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIIIllIllllII.toCharArray();
        int lllllllllllllllIlIIlIIIllIlllIIl = llIIlllIlIIl[1];
        char[] charArray2 = lllllllllllllllIlIIlIIIllIllllIl2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIlIIlIIIllIllIIIl = llIIlllIlIIl[1];
        while (lllllllllIIlII(lllllllllllllllIlIIlIIIllIllIIIl, length)) {
            char lllllllllllllllIlIIlIIIllIlllllI = charArray2[lllllllllllllllIlIIlIIIllIllIIIl];
            sb.append((char) (lllllllllllllllIlIIlIIIllIlllllI ^ charArray[lllllllllllllllIlIIlIIIllIlllIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIIIllIlllIIl++;
            lllllllllllllllIlIIlIIIllIllIIIl++;
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private int by() {
        int i = llIIlllIlIIl[1];
        for (Integer num : C0004e.aa) {
            int lllllllllllllllIlIIlIIIlllIlIllI = num.intValue();
            int[] iArr = new int[llIIlllIlIIl[0]];
            iArr[llIIlllIlIIl[1]] = lllllllllllllllIlIIlIIIlllIlIllI;
            i += Inventory.getCount(iArr) * ((lllllllllllllllIlIIlIIIlllIlIllI - C0004e.aa.get(llIIlllIlIIl[1]).intValue()) + llIIlllIlIIl[0]);
            "".length();
            if (0 != 0) {
                return (246 ^ 187) & ((253 ^ 176) ^ (-1)) & (((111 ^ 66) & ((168 ^ 133) ^ (-1))) ^ (-1));
            }
        }
        return i;
    }

    private static boolean lllllllllIIIII(int i, int i2) {
        return i <= i2;
    }

    private static void llllllllIllIlI() {
        llIIlllIlIII = new String[llIIlllIlIIl[0]];
        llIIlllIlIII[llIIlllIlIIl[1]] = llllllllIllIIl("BTgPKA0=", "AJfFf");
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        this.bH += llIIlllIlIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean bf() {
        return llIIlllIlIIl[0];
    }

    private static boolean llllllllIlllIl(Object obj) {
        return obj == null;
    }

    private static boolean llllllllIllllI(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        C0009j X = this.ba.X();
        if (llllllllIllllI(X) && lllllllllIIIIl(C0004e.aB.contains(Integer.valueOf(projectileSpawned.getProjectile().getId())) ? 1 : 0)) {
            X.j(this.bH);
            this.bG = projectileSpawned.getProjectile();
        }
    }
}
