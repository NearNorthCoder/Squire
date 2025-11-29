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
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
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
public class SwappingPrayersTask
extends GauntletTaskBase {
    
    private  Projectile bG;
    
    private  int bH;

    private static boolean lllllllllIIIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean be() {
        y var1;
        j var2;
        if (y.llllllllIlllII(Prayers.getPoints())) {
            Item item2 = Inventory.getFirst(item -> e.aI.contains(item.getId()));
            if (y.llllllllIlllIl(item2)) {
                return llIIlllIlIIl[1];
            }
            var2.interact(llIIlllIlIII[llIIlllIlIIl[1]]);
        }
        var2 = var1.ba.X();
        Player var3 = Players.getLocal();
        if (!(y.llllllllIllllI(var2) && y.llllllllIllllI(var2.aI()) && y.llllllllIlllII(var2.aI().isDead() ? 1 : 0) && y.llllllllIllllI(var3) && y.llllllllIlllII(var3.isDead() ? 1 : 0) && !y.llllllllIlllll(var2.aI().getAnimation(), llIIlllIlIIl[2]))) {
            Prayers.disableAll();
            return llIIlllIlIIl[0];
        }
        if (y.llllllllIllllI(var1.bG) && y.lllllllllIIIII(var1.bH + llIIlllIlIIl[3], var1.bw()) && y.lllllllllIIIIl(var1.bx() ? 1 : 0)) {
            return llIIlllIlIIl[0];
        }
        ArrayList<Prayer> var4 = new ArrayList<Prayer>();
        Prayer var5 = var2.aG();
        var4.add(var5);

        List<Prayer> var6 = var1.bd();
        if (y.llllllllIllllI(var6) && y.llllllllIlllII(var6.isEmpty() ? 1 : 0)) {
            var4.addAll(var6);

        }
        if (y.lllllllllIIIIl(var1.ba.h().flickBossFight() ? 1 : 0)) {
            Prayers.flick(var4);

            return llIIlllIlIIl[0];
        }
        Iterator var7 = var4.iterator();
        while (y.lllllllllIIIIl(var7.hasNext() ? 1 : 0)) {
            Prayer var8 = (Prayer)var7.next();
            if (y.llllllllIlllII(Prayers.isEnabled((Prayer)var8) ? 1 : 0)) {
                Prayers.toggle((Prayer)var8);
            }

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

    private static boolean llllllllIlllII(int n2) {
        return n2 == 0;
    }

    private boolean bx() {
        int var9;
        int var10;
        int n2;
        y var11;
        if (!y.lllllllllIIIIl(this.ba.h().flickRedemption() ? 1 : 0) || y.lllllllllIIIlI(Prayers.getPoints(), llIIlllIlIIl[5]) && y.lllllllllIIIIl(Inventory.contains(item -> e.aH.contains(item.getId())) ? 1 : 0)) {
            return llIIlllIlIIl[1];
        }
        int var12 = Skills.getLevel((Skill)Skill.HITPOINTS) / llIIlllIlIIl[6];
        if (y.lllllllllIIIIl(var11.ba.h().makeArmour() ? 1 : 0)) {
            n2 = llIIlllIlIIl[7];

            }
        } else {
            n2 = var10 = llIIlllIlIIl[8];
        }
        if (y.lllllllllIIIlI(var9 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS), var12 + var10)) {
            return llIIlllIlIIl[1];
        }
        if (y.lllllllllIIIll(var11.by()) && y.llllllllIlllII(Prayers.isEnabled((Prayer)Prayer.REDEMPTION) ? 1 : 0)) {
            Prayers.toggle((Prayer)Prayer.REDEMPTION);
        }
        return llIIlllIlIIl[0];
    }

    @Inject
    public SwappingPrayersTask(c c2) {
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
        void var13;
        void var14;
        Actor actor = animationChanged.getActor();
        j j2 = this.ba.X();
        if (!y.llllllllIllllI(actor) || y.llllllllIlllIl(j2)) {
            return;
        }
        if (y.llllllllIlllll(var14.getAnimation(), llIIlllIlIIl[9])) {
            y var15;
            var15.bG = null;
            var13.j(var15.bH);
        }
        if (y.llllllllIlllll(var14.getAnimation(), llIIlllIlIIl[10])) {
            var13.a(Prayer.PROTECT_FROM_MAGIC);

        } else if (y.llllllllIlllll(var14.getAnimation(), llIIlllIlIIl[11])) {
            var13.a(Prayer.PROTECT_FROM_MISSILES);
        }
    }

        return String.valueOf(var16);
    }

    private int by() {
        int n2 = llIIlllIlIIl[1];
        Iterator<Integer> var17 = e.aa.iterator();
        while (y.lllllllllIIIIl(var17.hasNext() ? 1 : 0)) {
            int var18 = var17.next();
            int[] nArray = new int[llIIlllIlIIl[0]];
            nArray[y.llIIlllIlIIl[1]] = var18;
            var19 += Inventory.getCount((int[])nArray) * (var18 - e.aa.get(llIIlllIlIIl[1]) + llIIlllIlIIl[0]);

            return (0xF6 ^ 0xBB) & ~(0xFD ^ 0xB0) & ~((0x6F ^ 0x42) & ~(0xA8 ^ 0x85));
        }
        return n2;
    }

    private static boolean lllllllllIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llllllllIllIlI() {
        llIIlllIlIII = new String[llIIlllIlIIl[0]];
        y.llIIlllIlIII[y.llIIlllIlIIl[1]] = "Drink";
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

