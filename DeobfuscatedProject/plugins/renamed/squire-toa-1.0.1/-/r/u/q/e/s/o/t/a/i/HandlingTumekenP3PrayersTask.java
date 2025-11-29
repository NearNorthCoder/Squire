/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.b;
import -.r.u.q.e.s.o.t.a.i.NEnum;
import -.r.u.q.e.s.o.t.a.i.z_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;

/* TASK: Handling Tumeken P3 Prayers -> Handlingtumekenp3PrayersTask */
@TaskDesc(name="Handling Tumeken P3 Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingTumekenP3PrayersTask
extends z_Unknown {
    private static /* synthetic */ int[] lIIlllllllIlI;
    private /* synthetic */ Prayer ba;

    private static boolean lIllIlIllIIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean I() {
        return this.C();
    }

    @Override
    public n J() {
        return this.aT.prayFlickLastWarden();
    }

    @Override
    public boolean C() {
        int[] nArray = new int[lIIlllllllIlI[1]];
        nArray[J.lIIlllllllIlI[2]] = lIIlllllllIlI[3];
        nArray[J.lIIlllllllIlI[4]] = lIIlllllllIlI[5];
        return this.aS.a(nArray);
    }

    private static void lIllIlIllIIIIII() {
        lIIlllllllIlI = new int[9];
        J.lIIlllllllIlI[0] = 0xFFFFFF59 & 0x3DF6;
        J.lIIlllllllIlI[1] = 2;
        J.lIIlllllllIlI[2] = (224 + 195 - 286 + 99 ^ 104 + 170 - 241 + 159) & (68 + 13 - 39 + 127 ^ 12 + 22 - -35 + 60 ^ -1);
        J.lIIlllllllIlI[3] = -(0xFFFF93FF & 0x7E05) & (0xFFFFFFFF & 0x3FF6);
        J.lIIlllllllIlI[4] = 1;
        J.lIIlllllllIlI[5] = 0xFFFFADFC & 0x7FF7;
        J.lIIlllllllIlI[6] = 0xFFFFD9A5 & 0x2EDF;
        J.lIIlllllllIlI[7] = 0xFFFFBFF4 & 0x6DEB;
        J.lIIlllllllIlI[8] = -(0xFFFFFD66 & 0x27DB) & (0xFFFFBDDF & 0x6FEB);
    }

    private static boolean lIllIlIllIIIIIl(Object object) {
        return object == null;
    }

    @Inject
    public J(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.ba = null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var1;
        Projectile projectile = projectileSpawned.getProjectile();
        if (J.lIllIlIllIIIIlI(projectile.getId(), lIIlllllllIlI[6])) {
            this.ba = Prayer.PROTECT_FROM_MAGIC;
            0;
            
            }
        } else if (J.lIllIlIllIIIIll(b.r.contains(var1.getProjectile().getId()) ? 1 : 0)) {
            llllllllllllllIlllIIlllIllIIlIII.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Override
    public int F() {
        return lIIlllllllIlI[0];
    }

    static {
        J.lIllIlIllIIIIII();
    }

    private static boolean lIllIlIllIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public List<Prayer> E() {
        if (J.lIllIlIllIIIIIl(this.ba)) {
            return List.of(this.H());
        }
        return List.of(this.H(), this.ba);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (J.lIllIlIllIIIIlI(nPC.getId(), lIIlllllllIlI[7])) {
            Prayer prayer;
            if (J.lIllIlIllIIIIlI(nPC.getGraphic(), lIIlllllllIlI[8])) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                0;
                
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            this.ba = prayer;
        }
    }
}

