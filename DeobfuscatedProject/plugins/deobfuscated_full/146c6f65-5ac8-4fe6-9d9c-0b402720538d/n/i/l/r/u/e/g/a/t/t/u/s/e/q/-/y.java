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

/* TASK: Swapping prayers -> SwappingprayersTask */
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
        y var2;
        j var1;
        if (y.llllllllIlllII(Prayers.getPoints())) {
            Item item2 = Inventory.getFirst(item -> e.aI.contains(item.getId()));
            if (y.llllllllIlllIl(item2)) {
                return llIIlllIlIIl[1];
            }
            var1.interact(llIIlllIlIII[llIIlllIlIIl[1]]);
        }
        var1 = var2.ba.X();
        Player var8 = Players.getLocal();
        if (!(y.llllllllIllllI(var1) && y.llllllllIllllI(var1.aI()) && y.llllllllIlllII(var1.aI().isDead() ? 1 : 0) && y.llllllllIllllI(var8) && y.llllllllIlllII(var8.isDead() ? 1 : 0) && !y.llllllllIlllll(var1.aI().getAnimation(), llIIlllIlIIl[2]))) {
            Prayers.disableAll();
            return llIIlllIlIIl[0];
        }
        if (y.llllllllIllllI(var2.bG) && y.lllllllllIIIII(var2.bH + llIIlllIlIIl[3], var2.bw()) && y.lllllllllIIIIl(var2.bx() ? 1 : 0)) {
            return llIIlllIlIIl[0];
        }
        ArrayList<Prayer> var17 = new ArrayList<Prayer>();
        Prayer var5 = var1.aG();
        var17.add(var5);
        0;
        List<Prayer> var7 = var2.bd();
        if (y.llllllllIllllI(var7) && y.llllllllIlllII(var7.isEmpty() ? 1 : 0)) {
            var17.addAll(var7);
            0;
        }
        if (y.lllllllllIIIIl(var2.ba.h().flickBossFight() ? 1 : 0)) {
            Prayers.flick(var17);
            0;
            return llIIlllIlIIl[0];
        }
        Iterator var14 = var17.iterator();
        while (y.lllllllllIIIIl(var14.hasNext() ? 1 : 0)) {
            Prayer var19 = (Prayer)var14.next();
            if (y.llllllllIlllII(Prayers.isEnabled((Prayer)var19) ? 1 : 0)) {
                Prayers.toggle((Prayer)var19);
            }
            0;
            if (3 > 0) continue;
            return ((215 + 183 - 145 + 2 ^ 105 + 81 - 58 + 39) & (0x5D ^ 0x2B ^ (0x88 ^ 0xA6) ^ -1)) != 0;
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
        y.llIIlllIlIIl[0] = 1;
        y.llIIlllIlIIl[1] = (0xC7 ^ 0x8F ^ (0x2B ^ 0x6E)) & (0x39 ^ 0x3E ^ (0x57 ^ 0x5D) ^ -1);
        y.llIIlllIlIIl[2] = -(0xFFFF8E3B & 0x79CD) & (0xFFFFEFFE & 0x38EF);
        y.llIIlllIlIIl[3] = 2;
        y.llIIlllIlIIl[4] = 3;
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
        int var13;
        int var9;
        int n2;
        y var6;
        if (!y.lllllllllIIIIl(this.ba.h().flickRedemption() ? 1 : 0) || y.lllllllllIIIlI(Prayers.getPoints(), llIIlllIlIIl[5]) && y.lllllllllIIIIl(Inventory.contains(item -> e.aH.contains(item.getId())) ? 1 : 0)) {
            return llIIlllIlIIl[1];
        }
        int var12 = Skills.getLevel((Skill)Skill.HITPOINTS) / llIIlllIlIIl[6];
        if (y.lllllllllIIIIl(var6.ba.h().makeArmour() ? 1 : 0)) {
            n2 = llIIlllIlIIl[7];
            0;
            
            }
        } else {
            n2 = var9 = llIIlllIlIIl[8];
        }
        if (y.lllllllllIIIlI(var13 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS), var12 + var9)) {
            return llIIlllIlIIl[1];
        }
        if (y.lllllllllIIIll(var6.by()) && y.llllllllIlllII(Prayers.isEnabled((Prayer)Prayer.REDEMPTION) ? 1 : 0)) {
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
        void var10;
        void var23;
        Actor actor = animationChanged.getActor();
        j j2 = this.ba.X();
        if (!y.llllllllIllllI(actor) || y.llllllllIlllIl(j2)) {
            return;
        }
        if (y.llllllllIlllll(var23.getAnimation(), llIIlllIlIIl[9])) {
            y var24;
            var24.bG = null;
            var10.j(var24.bH);
        }
        if (y.llllllllIlllll(var23.getAnimation(), llIIlllIlIIl[10])) {
            var10.a(Prayer.PROTECT_FROM_MAGIC);
            0;
            if (-2 >= 0) {
                return;
            }
        } else if (y.llllllllIlllll(var23.getAnimation(), llIIlllIlIIl[11])) {
            var10.a(Prayer.PROTECT_FROM_MISSILES);
        }
    }

    private static String llllllllIllIIl(String var15, String var26) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var3 = var26.toCharArray();
        int var16 = llIIlllIlIIl[1];
        char[] var25 = var15.toCharArray();
        int var21 = var25.length;
        int var22 = llIIlllIlIIl[1];
        while (y.lllllllllIIlII(var22, var21)) {
            char var4 = var25[var22];
            var18.append((char)(var4 ^ var3[var16 % var3.length]));
            0;
            ++var16;
            ++var22;
            0;
            if (1 != 2) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private int by() {
        int n2 = llIIlllIlIIl[1];
        Iterator<Integer> var20 = e.aa.iterator();
        while (y.lllllllllIIIIl(var20.hasNext() ? 1 : 0)) {
            int var11 = var20.next();
            int[] nArray = new int[llIIlllIlIIl[0]];
            nArray[y.llIIlllIlIIl[1]] = var11;
            lllllllllllllllIlIIlIIIlllIllIII += Inventory.getCount((int[])nArray) * (var11 - e.aa.get(llIIlllIlIIl[1]) + llIIlllIlIIl[0]);
            0;
            
            return (0xF6 ^ 0xBB) & ~(0xFD ^ 0xB0) & ~((0x6F ^ 0x42) & ~(0xA8 ^ 0x85));
        }
        return n2;
    }

    private static boolean lllllllllIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llllllllIllIlI() {
        llIIlllIlIII = new String[llIIlllIlIIl[0]];
        y.llIIlllIlIII[y.llIIlllIlIIl[1]] = y."Drink";
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

