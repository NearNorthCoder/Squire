/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
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

@TaskDesc(name="Enabling offensive prayers", priority=100, register=true)
public class EnablingOffensivePrayersTask
extends GauntletTaskBase {
    private  int bH;
    private  int ce;

    private static boolean lIIIIIIlIlllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIlIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean be() {
        this.bH += llIlIIlIIIII[2];
        return this.bI();
    }

    private boolean bH() {
        if (V.lIIIIIIlIlllIlI(Prayers.anyActive() ? 1 : 0)) {
            return llIlIIlIIIII[1];
        }
        Prayers.disableAll();
        return llIlIIlIIIII[2];
    }

    static {
        V.lIIIIIIlIlllIIl();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var1;
        if (V.lIIIIIIlIllllII(Equipment.contains((int[])e.V) ? 1 : 0)) {
            return;
        }
        Actor var2 = var1.getProjectile().getInteracting();
        if (V.lIIIIIIlIllllll(var2)) {
            return;
        }
        Player var3 = Players.getLocal();
        if (!V.lIIIIIIlIlllIll(var3) || V.lIIIIIIllIIIIII(var2, var3.getInteracting())) {
            return;
        }
        this.ce = this.bH + llIlIIlIIIII[4];
    }

    /*
     * WARNING - void declaration
     */
    private boolean bI() {
        int var4;
        int n2;
        V var5;
        List<Prayer> list = this.bd();
        if (!V.lIIIIIIlIlllIll(list) || V.lIIIIIIlIllllII(list.isEmpty() ? 1 : 0)) {
            return var5.bH();
        }
        if (V.lIIIIIIlIlllIll(Players.getLocal().getInteracting())) {
            n2 = llIlIIlIIIII[2];

            if (-(0x93 ^ 0x96) >= 0) {
                return false;
            }
        } else {
            n2 = llIlIIlIIIII[1];
        }
        if (V.lIIIIIIlIlllIlI(var4 = n2) && V.lIIIIIIlIllllII(Prayers.anyActive() ? 1 : 0)) {
            return var5.bH();
        }
        if (V.lIIIIIIlIllllII(var4) && (!V.lIIIIIIlIllllIl(var5.bH, var5.ce) || V.lIIIIIIlIlllllI(var5.bH, var5.ce))) {
            void var6;
            Iterator var7 = var6.iterator();
            while (V.lIIIIIIlIllllII(var7.hasNext() ? 1 : 0)) {
                Prayer var8 = (Prayer)var7.next();
                if (V.lIIIIIIlIlllIlI(Prayers.isEnabled((Prayer)var8) ? 1 : 0)) {
                    Prayers.toggle((Prayer)var8);
                    return llIlIIlIIIII[2];
                }

                return ((189 + 48 - 187 + 150 ^ 90 + 117 - 165 + 112) & (0x4B ^ 0x17 ^ (0x58 ^ 0x56) ^ -1)) != 0;
            }
        }
        return llIlIIlIIIII[1];
    }

    private static boolean lIIIIIIllIIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIIIIlIlllIll(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIlIllllII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void var9;
        if (V.lIIIIIIlIlllIlI(Equipment.contains((int[])e.V) ? 1 : 0)) {
            return;
        }
        Player var10 = Players.getLocal();
        if (V.lIIIIIIlIllllll(var10)) {
            return;
        }
        NPC var11 = (NPC)var10.getInteracting();
        if (!V.lIIIIIIllIIIIIl(var9.getActor(), var11) || V.lIIIIIIlIllllII(var11.isDead() ? 1 : 0)) {
            return;
        }
        this.ce = this.bH + llIlIIlIIIII[4];
    }

    @Inject
    public EnablingOffensivePrayersTask(c c2) {
        d[] dArray = new d[llIlIIlIIIII[0]];
        dArray[V.llIlIIlIIIII[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[V.llIlIIlIIIII[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[V.llIlIIlIIIII[3]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
        this.bH = llIlIIlIIIII[1];
        this.ce = llIlIIlIIIII[1];
    }

    private static boolean lIIIIIIlIllllIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIIIlIllllll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIllIIIIIl(Object object, Object object2) {
        return object == object2;
    }
}

