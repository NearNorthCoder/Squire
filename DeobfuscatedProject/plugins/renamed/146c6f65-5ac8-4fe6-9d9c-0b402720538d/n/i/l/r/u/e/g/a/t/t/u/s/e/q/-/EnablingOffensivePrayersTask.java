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
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
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

/* TASK: Enabling offensive prayers -> EnablingoffensiveprayersTask */
@TaskDesc(name="Enabling offensive prayers", priority=100, register=true)
public class EnablingOffensivePrayersTask
extends n_Unknown {
    private /* synthetic */ int bH;
    private /* synthetic */ int ce;
    private static /* synthetic */ int[] llIlIIlIIIII;

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

    private static void lIIIIIIlIlllIIl() {
        llIlIIlIIIII = new int[5];
        V.llIlIIlIIIII[0] = 3;
        V.llIlIIlIIIII[1] = (55 + 15 - -5 + 59 ^ 154 + 125 - 241 + 157) & (0x5B ^ 0x61 ^ 123 + 82 - 120 + 42 ^ -1);
        V.llIlIIlIIIII[2] = 1;
        V.llIlIIlIIIII[3] = 2;
        V.llIlIIlIIIII[4] = 0xDD ^ 0xB0 ^ (0x63 ^ 0xA);
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
        void var5;
        if (V.lIIIIIIlIllllII(Equipment.contains((int[])e.V) ? 1 : 0)) {
            return;
        }
        Actor var10 = var5.getProjectile().getInteracting();
        if (V.lIIIIIIlIllllll(var10)) {
            return;
        }
        Player var3 = Players.getLocal();
        if (!V.lIIIIIIlIlllIll(var3) || V.lIIIIIIllIIIIII(var10, var3.getInteracting())) {
            return;
        }
        this.ce = this.bH + llIlIIlIIIII[4];
    }

    /*
     * WARNING - void declaration
     */
    private boolean bI() {
        int var2;
        int n2;
        V var6;
        List<Prayer> list = this.bd();
        if (!V.lIIIIIIlIlllIll(list) || V.lIIIIIIlIllllII(list.isEmpty() ? 1 : 0)) {
            return var6.bH();
        }
        if (V.lIIIIIIlIlllIll(Players.getLocal().getInteracting())) {
            n2 = llIlIIlIIIII[2];
            0;
            if (-(0x93 ^ 0x96) >= 0) {
                return false;
            }
        } else {
            n2 = llIlIIlIIIII[1];
        }
        if (V.lIIIIIIlIlllIlI(var2 = n2) && V.lIIIIIIlIllllII(Prayers.anyActive() ? 1 : 0)) {
            return var6.bH();
        }
        if (V.lIIIIIIlIllllII(var2) && (!V.lIIIIIIlIllllIl(var6.bH, var6.ce) || V.lIIIIIIlIlllllI(var6.bH, var6.ce))) {
            void var4;
            Iterator var1 = var4.iterator();
            while (V.lIIIIIIlIllllII(var1.hasNext() ? 1 : 0)) {
                Prayer var7 = (Prayer)var1.next();
                if (V.lIIIIIIlIlllIlI(Prayers.isEnabled((Prayer)var7) ? 1 : 0)) {
                    Prayers.toggle((Prayer)var7);
                    return llIlIIlIIIII[2];
                }
                0;
                
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
        void var11;
        if (V.lIIIIIIlIlllIlI(Equipment.contains((int[])e.V) ? 1 : 0)) {
            return;
        }
        Player var8 = Players.getLocal();
        if (V.lIIIIIIlIllllll(var8)) {
            return;
        }
        NPC var9 = (NPC)var8.getInteracting();
        if (!V.lIIIIIIllIIIIIl(var11.getActor(), var9) || V.lIIIIIIlIllllII(var9.isDead() ? 1 : 0)) {
            return;
        }
        this.ce = this.bH + llIlIIlIIIII[4];
    }

    @Inject
    public V(c c2) {
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

