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
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
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

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static boolean var3(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean be() {
        this.bH += var1[2];
        return this.bI();
    }

    private static void var4() {
        var1 = new int[5];
        V.var1[0] = 3;
        V.var1[1] = (55 + 15 - -5 + 59 ^ 154 + 125 - 241 + 157) & (0x5B ^ 0x61 ^ 123 + 82 - 120 + 42 ^ -1);
        V.var1[2] = 1;
        V.var1[3] = 2;
        V.var1[4] = 0xDD ^ 0xB0 ^ (0x63 ^ 0xA);
    }

    private boolean bH() {
        if (V.var2(Prayers.anyActive() ? 1 : 0)) {
            return var1[1];
        }
        Prayers.disableAll();
        return var1[2];
    }

    static {
        V.var4();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var5;
        if (V.var6(Equipment.contains((int[])e.V) ? 1 : 0)) {
            return;
        }
        Actor var7 = var5.getProjectile().getInteracting();
        if (V.var8(var7)) {
            return;
        }
        Player var9 = Players.getLocal();
        if (!V.var10(var9) || V.var11(var7, var9.getInteracting())) {
            return;
        }
        this.ce = this.bH + var1[4];
    }

    /*
     * WARNING - void declaration
     */
    private boolean bI() {
        int var12;
        int n2;
        V var13;
        List<Prayer> list = this.bd();
        if (!V.var10(list) || V.var6(list.isEmpty() ? 1 : 0)) {
            return var13.bH();
        }
        if (V.var10(Players.getLocal().getInteracting())) {
            n2 = var1[2];
            0;
            if (-(0x93 ^ 0x96) >= 0) {
                return ((0x84 ^ 0x95) & ~(3 ^ 0x12)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        if (V.var2(var12 = n2) && V.var6(Prayers.anyActive() ? 1 : 0)) {
            return var13.bH();
        }
        if (V.var6(var12) && (!V.var14(var13.bH, var13.ce) || V.var3(var13.bH, var13.ce))) {
            void var15;
            Iterator var16 = var15.iterator();
            while (V.var6(var16.hasNext() ? 1 : 0)) {
                Prayer var17 = (Prayer)var16.next();
                if (V.var2(Prayers.isEnabled((Prayer)var17) ? 1 : 0)) {
                    Prayers.toggle((Prayer)var17);
                    return var1[2];
                }
                0;
                if null == null continue;
                return ((189 + 48 - 187 + 150 ^ 90 + 117 - 165 + 112) & (0x4B ^ 0x17 ^ (0x58 ^ 0x56) ^ -1)) != 0;
            }
        }
        return var1[1];
    }

    private static boolean var11(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void var18;
        if (V.var2(Equipment.contains((int[])e.V) ? 1 : 0)) {
            return;
        }
        Player var19 = Players.getLocal();
        if (V.var8(var19)) {
            return;
        }
        NPC var20 = (NPC)var19.getInteracting();
        if (!V.var21(var18.getActor(), var20) || V.var6(var20.isDead() ? 1 : 0)) {
            return;
        }
        this.ce = this.bH + var1[4];
    }

    @Inject
    public EnablingOffensivePrayersTask(c c2) {
        d[] dArray = new d[var1[0]];
        dArray[V.var1[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[V.var1[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[V.var1[3]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
        this.bH = var1[1];
        this.ce = var1[1];
    }

    private static boolean var14(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var21(Object object, Object object2) {
        return object == object2;
    }
}

