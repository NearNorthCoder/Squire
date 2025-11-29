/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.Skill
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.j;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
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

@TaskDesc(name="Swapping prayers", priority=250, register=true)
public class y
extends n {
    private static /* synthetic */ String[] llIIlllIlIII;
    private /* synthetic */ Projectile bG;
    private static /* synthetic */ int[] llIIlllIlIIl;
    private /* synthetic */ int bH;

    private static boolean lllllllllIIIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean be() {
        y lllllllllllllllIlIIlIIIllllIlIll;
        j lllllllllllllllIlIIlIIIllllIlIlI;
        if (y.llllllllIlllII(Prayers.getPoints())) {
            Item item2 = Inventory.getFirst(item -> e.aI.contains(item.getId()));
            if (y.llllllllIlllIl(item2)) {
                return llIIlllIlIIl[1];
            }
            lllllllllllllllIlIIlIIIllllIlIlI.interact(llIIlllIlIII[llIIlllIlIIl[1]]);
        }
        lllllllllllllllIlIIlIIIllllIlIlI = lllllllllllllllIlIIlIIIllllIlIll.ba.X();
        Player lllllllllllllllIlIIlIIIllllIlIIl = Players.getLocal();
        if (!(y.llllllllIllllI(lllllllllllllllIlIIlIIIllllIlIlI) && y.llllllllIllllI(lllllllllllllllIlIIlIIIllllIlIlI.aI()) && y.llllllllIlllII(lllllllllllllllIlIIlIIIllllIlIlI.aI().isDead() ? 1 : 0) && y.llllllllIllllI(lllllllllllllllIlIIlIIIllllIlIIl) && y.llllllllIlllII(lllllllllllllllIlIIlIIIllllIlIIl.isDead() ? 1 : 0) && !y.llllllllIlllll(lllllllllllllllIlIIlIIIllllIlIlI.aI().getAnimation(), llIIlllIlIIl[2]))) {
            Prayers.disableAll();
            return llIIlllIlIIl[0];
        }
        if (y.llllllllIllllI(lllllllllllllllIlIIlIIIllllIlIll.bG) && y.lllllllllIIIII(lllllllllllllllIlIIlIIIllllIlIll.bH + llIIlllIlIIl[3], lllllllllllllllIlIIlIIIllllIlIll.bw()) && y.lllllllllIIIIl(lllllllllllllllIlIIlIIIllllIlIll.bx() ? 1 : 0)) {
            return llIIlllIlIIl[0];
        }
        ArrayList<Prayer> lllllllllllllllIlIIlIIIllllIlIII = new ArrayList<Prayer>();
        Prayer lllllllllllllllIlIIlIIIllllIIlll = lllllllllllllllIlIIlIIIllllIlIlI.aG();
        lllllllllllllllIlIIlIIIllllIlIII.add(lllllllllllllllIlIIlIIIllllIIlll);
        "".length();
        List<Prayer> lllllllllllllllIlIIlIIIllllIIllI = lllllllllllllllIlIIlIIIllllIlIll.bd();
        if (y.llllllllIllllI(lllllllllllllllIlIIlIIIllllIIllI) && y.llllllllIlllII(lllllllllllllllIlIIlIIIllllIIllI.isEmpty() ? 1 : 0)) {
            lllllllllllllllIlIIlIIIllllIlIII.addAll(lllllllllllllllIlIIlIIIllllIIllI);
            "".length();
        }
        if (y.lllllllllIIIIl(lllllllllllllllIlIIlIIIllllIlIll.ba.h().flickBossFight() ? 1 : 0)) {
            Prayers.flick(lllllllllllllllIlIIlIIIllllIlIII);
            "".length();
            return llIIlllIlIIl[0];
        }
        Iterator lllllllllllllllIlIIlIIIllllIIlIl = lllllllllllllllIlIIlIIIllllIlIII.iterator();
        while (y.lllllllllIIIIl(lllllllllllllllIlIIlIIIllllIIlIl.hasNext() ? 1 : 0)) {
            Prayer lllllllllllllllIlIIlIIIllllIIlII = (Prayer)lllllllllllllllIlIIlIIIllllIIlIl.next();
            if (y.llllllllIlllII(Prayers.isEnabled((Prayer)lllllllllllllllIlIIlIIIllllIIlII) ? 1 : 0)) {
                Prayers.toggle((Prayer)lllllllllllllllIlIIlIIIllllIIlII);
            }
            "".length();
            if ("   ".length() > 0) continue;
            return ((215 + 183 - 145 + 2 ^ 105 + 81 - 58 + 39) & (0x5D ^ 0x2B ^ (0x88 ^ 0xA6) ^ -" ".length())) != 0;
        }
        return llIIlllIlIIl[1];
    }

    private static boolean lllllllllIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llllllllIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private int bw() {
        return this.ba.X().aK() + llIIlllIlIIl[4];
    }

    static {
        y.llllllllIllIll();
        y.llllllllIllIlI();
    }

    private static boolean lllllllllIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllllllIllIll() {
        llIIlllIlIIl = new int[12];
        y.llIIlllIlIIl[0] = " ".length();
        y.llIIlllIlIIl[1] = (0xC7 ^ 0x8F ^ (0x2B ^ 0x6E)) & (0x39 ^ 0x3E ^ (0x57 ^ 0x5D) ^ -" ".length());
        y.llIIlllIlIIl[2] = -(0xFFFF8E3B & 0x79CD) & (0xFFFFEFFE & 0x38EF);
        y.llIIlllIlIIl[3] = "  ".length();
        y.llIIlllIlIIl[4] = "   ".length();
        y.llIIlllIlIIl[5] = 0x47 ^ 0x59;
        y.llIIlllIlIIl[6] = 0x32 ^ 0x38;
        y.llIIlllIlIIl[7] = 0xB2 ^ 0xBF;
        y.llIIlllIlIIl[8] = 0xA4 ^ 0xB4;
        y.llIIlllIlIIl[9] = 0xFFFFE8E7 & 0x37FA;
        y.llIIlllIlIIl[10] = 0xFFFFBF32 & 0x62FF;
        y.llIIlllIlIIl[11] = 0xFFFFA33B & 0x7EF7;
    }

    private static boolean llllllllIlllII(int n2) {
        return n2 == 0;
    }

    private boolean bx() {
        int lllllllllllllllIlIIlIIIlllIlllII;
        int lllllllllllllllIlIIlIIIlllIlllIl;
        int n2;
        y lllllllllllllllIlIIlIIIlllIlllll;
        if (!y.lllllllllIIIIl(this.ba.h().flickRedemption() ? 1 : 0) || y.lllllllllIIIlI(Prayers.getPoints(), llIIlllIlIIl[5]) && y.lllllllllIIIIl(Inventory.contains(item -> e.aH.contains(item.getId())) ? 1 : 0)) {
            return llIIlllIlIIl[1];
        }
        int lllllllllllllllIlIIlIIIlllIllllI = Skills.getLevel((Skill)Skill.HITPOINTS) / llIIlllIlIIl[6];
        if (y.lllllllllIIIIl(lllllllllllllllIlIIlIIIlllIlllll.ba.h().makeArmour() ? 1 : 0)) {
            n2 = llIIlllIlIIl[7];
            "".length();
            if (null != null) {
                return ((0x3C ^ 0x7F ^ (0x7E ^ 0x79)) & (0x35 ^ 0x7A ^ (7 ^ 0xC) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lllllllllllllllIlIIlIIIlllIlllIl = llIIlllIlIIl[8];
        }
        if (y.lllllllllIIIlI(lllllllllllllllIlIIlIIIlllIlllII = Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllllllllllllllIlIIlIIIlllIllllI + lllllllllllllllIlIIlIIIlllIlllIl)) {
            return llIIlllIlIIl[1];
        }
        if (y.lllllllllIIIll(lllllllllllllllIlIIlIIIlllIlllll.by()) && y.llllllllIlllII(Prayers.isEnabled((Prayer)Prayer.REDEMPTION) ? 1 : 0)) {
            Prayers.toggle((Prayer)Prayer.REDEMPTION);
        }
        return llIIlllIlIIl[0];
    }

    @Inject
    public y(c c2) {
        d[] dArray = new d[llIIlllIlIIl[0]];
        dArray[y.llIIlllIlIIl[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bH = llIIlllIlIIl[1];
    }

    private static boolean lllllllllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void lllllllllllllllIlIIlIIIlllIIlllI;
        void lllllllllllllllIlIIlIIIlllIIllll;
        Actor actor = animationChanged.getActor();
        j j2 = this.ba.X();
        if (!y.llllllllIllllI(actor) || y.llllllllIlllIl(j2)) {
            return;
        }
        if (y.llllllllIlllll(lllllllllllllllIlIIlIIIlllIIllll.getAnimation(), llIIlllIlIIl[9])) {
            y lllllllllllllllIlIIlIIIlllIlIIIl;
            lllllllllllllllIlIIlIIIlllIlIIIl.bG = null;
            lllllllllllllllIlIIlIIIlllIIlllI.j(lllllllllllllllIlIIlIIIlllIlIIIl.bH);
        }
        if (y.llllllllIlllll(lllllllllllllllIlIIlIIIlllIIllll.getAnimation(), llIIlllIlIIl[10])) {
            lllllllllllllllIlIIlIIIlllIIlllI.a(Prayer.PROTECT_FROM_MAGIC);
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        } else if (y.llllllllIlllll(lllllllllllllllIlIIlIIIlllIIllll.getAnimation(), llIIlllIlIIl[11])) {
            lllllllllllllllIlIIlIIIlllIIlllI.a(Prayer.PROTECT_FROM_MISSILES);
        }
    }

    private static String llllllllIllIIl(String lllllllllllllllIlIIlIIIllIlllIII, String lllllllllllllllIlIIlIIIllIllIlll) {
        lllllllllllllllIlIIlIIIllIlllIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIllIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIIIllIlllIll = new StringBuilder();
        char[] lllllllllllllllIlIIlIIIllIlllIlI = lllllllllllllllIlIIlIIIllIllIlll.toCharArray();
        int lllllllllllllllIlIIlIIIllIlllIIl = llIIlllIlIIl[1];
        char[] lllllllllllllllIlIIlIIIllIllIIll = lllllllllllllllIlIIlIIIllIlllIII.toCharArray();
        int lllllllllllllllIlIIlIIIllIllIIlI = lllllllllllllllIlIIlIIIllIllIIll.length;
        int lllllllllllllllIlIIlIIIllIllIIIl = llIIlllIlIIl[1];
        while (y.lllllllllIIlII(lllllllllllllllIlIIlIIIllIllIIIl, lllllllllllllllIlIIlIIIllIllIIlI)) {
            char lllllllllllllllIlIIlIIIllIlllllI = lllllllllllllllIlIIlIIIllIllIIll[lllllllllllllllIlIIlIIIllIllIIIl];
            lllllllllllllllIlIIlIIIllIlllIll.append((char)(lllllllllllllllIlIIlIIIllIlllllI ^ lllllllllllllllIlIIlIIIllIlllIlI[lllllllllllllllIlIIlIIIllIlllIIl % lllllllllllllllIlIIlIIIllIlllIlI.length]));
            "".length();
            ++lllllllllllllllIlIIlIIIllIlllIIl;
            ++lllllllllllllllIlIIlIIIllIllIIIl;
            "".length();
            if (" ".length() != "  ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIIIllIlllIll);
    }

    private int by() {
        int n2 = llIIlllIlIIl[1];
        Iterator<Integer> lllllllllllllllIlIIlIIIlllIlIlll = e.aa.iterator();
        while (y.lllllllllIIIIl(lllllllllllllllIlIIlIIIlllIlIlll.hasNext() ? 1 : 0)) {
            int lllllllllllllllIlIIlIIIlllIlIllI = lllllllllllllllIlIIlIIIlllIlIlll.next();
            int[] nArray = new int[llIIlllIlIIl[0]];
            nArray[y.llIIlllIlIIl[1]] = lllllllllllllllIlIIlIIIlllIlIllI;
            lllllllllllllllIlIIlIIIlllIllIII += Inventory.getCount((int[])nArray) * (lllllllllllllllIlIIlIIIlllIlIllI - e.aa.get(llIIlllIlIIl[1]) + llIIlllIlIIl[0]);
            "".length();
            if (null == null) continue;
            return (0xF6 ^ 0xBB) & ~(0xFD ^ 0xB0) & ~((0x6F ^ 0x42) & ~(0xA8 ^ 0x85));
        }
        return n2;
    }

    private static boolean lllllllllIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llllllllIllIlI() {
        llIIlllIlIII = new String[llIIlllIlIIl[0]];
        y.llIIlllIlIII[y.llIIlllIlIIl[1]] = y.llllllllIllIIl("BTgPKA0=", "AJfFf");
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        this.bH += llIIlllIlIIl[0];
    }

    @Override
    public boolean bf() {
        return llIIlllIlIIl[0];
    }

    private static boolean llllllllIlllIl(Object object) {
        return object == null;
    }

    private static boolean llllllllIllllI(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        j j2 = this.ba.X();
        if (y.llllllllIllllI(j2) && y.lllllllllIIIIl(e.aB.contains(projectileSpawned.getProjectile().getId()) ? 1 : 0)) {
            j2.j(this.bH);
            this.bG = projectileSpawned.getProjectile();
        }
    }
}

