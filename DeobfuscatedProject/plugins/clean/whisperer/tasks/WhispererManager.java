/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.whisperer.tasks;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Vars;
import gg.squire.whisperer.tasks.WhispererManager;

@Singleton
public class WhispererManager {
    private static final  int l;
    private static final  int n;
    private static final  int m;
    
    private static final  int k;
    
    private final  Queue<Prayer> o;
    @Inject
    protected  c p;

    private static void llIIIIIllllIIII() {
        lIlIlllIIIIII = new String[lIlIlllIIIIIl[1]];
        d.lIlIlllIIIIII[d.lIlIlllIIIIIl[2]] = "The Whisperer";
    }

    private static boolean llIIIIIllllIIlI(int n2) {
        return n2 == 0;
    }

    public NPC j() {
        String[] stringArray = new String[lIlIlllIIIIIl[1]];
        stringArray[d.lIlIlllIIIIIl[2]] = lIlIlllIIIIII[lIlIlllIIIIIl[2]];
        return NPCs.getNearest((String[])stringArray);
    }

    public boolean f() {
        int n2;
        if (d.llIIIIIllllIIlI(this.p.c(lIlIlllIIIIIl[0]) ? 1 : 0) && d.llIIIIIllllIIll(this.p.b(lIlIlllIIIIIl[0]) ? 1 : 0)) {
            n2 = lIlIlllIIIIIl[1];

            if ((0x14 ^ 0x10) < 0) {
                return false;
            }
        } else {
            n2 = lIlIlllIIIIIl[2];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIllllIllI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void var1;
        if (d.llIIIIIllllIllI(hitsplatApplied.getActor(), Players.getLocal())) {
            return;
        }
        if (d.llIIIIIllllIlll(var1.getHitsplat().getAmount())) {
            return;
        }
        this.o.remove();

    }

    public List<NPC> l() {
        int[] nArray = new int[lIlIlllIIIIIl[1]];
        nArray[d.lIlIlllIIIIIl[2]] = lIlIlllIIIIIl[6];
        return NPCs.getAll((int[])nArray);
    }

    public WhispererManager() {
        this.o = new LinkedList<Prayer>();
    }

    static {
        d.llIIIIIllllIIIl();
        d.llIIIIIllllIIII();
        k = lIlIlllIIIIIl[5];
        l = lIlIlllIIIIIl[7];
        n = lIlIlllIIIIIl[0];
        m = lIlIlllIIIIIl[6];
    }

    public int i() {
        return Vars.getBit((int)lIlIlllIIIIIl[4]);
    }

    private static boolean llIIIIIlllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean g() {
        int n2;
        if (d.llIIIIIllllIIll(this.p.c(lIlIlllIIIIIl[0]) ? 1 : 0) && d.llIIIIIllllIlII(this.j())) {
            n2 = lIlIlllIIIIIl[1];

            if (2 > 3) {
                return false;
            }
        } else {
            n2 = lIlIlllIIIIIl[2];
        }
        return n2 != 0;
    }

    public int h() {
        return lIlIlllIIIIIl[3];
    }

    private static boolean llIIIIIlllllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIIIlllllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIIIllllIlIl(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var2);
    }

    private static boolean llIIIIIllllIlll(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIIllllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIllllIlII(Object object) {
        return object == null;
    }

    public void e() {
        this.o.clear();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var3;
        int n2 = projectileSpawned.getProjectile().getId();
        if (d.llIIIIIllllIlIl(n2, lIlIlllIIIIIl[5])) {
            this.o.add(Prayer.PROTECT_FROM_MAGIC);

        } else if (d.llIIIIIllllIlIl((int)var3, lIlIlllIIIIIl[7])) {
            d var4;
            var4.o.add(Prayer.PROTECT_FROM_MISSILES);

        }
    }

    /*
     * WARNING - void declaration
     */
    public Prayer k() {
        void var5;
        Projectile projectile2 = Projectiles.getNearest(projectile -> {
            int n2;
            if (d.llIIIIIlllllIII(projectile.getRemainingCycles(), lIlIlllIIIIIl[8]) && (!d.llIIIIIlllllIIl(projectile.getId(), lIlIlllIIIIIl[5]) || d.llIIIIIllllIlIl(projectile.getId(), lIlIlllIIIIIl[7]))) {
                n2 = lIlIlllIIIIIl[1];

                if (1 <= 0) {
                    return ((0x14 ^ 6 ^ (0xC8 ^ 0x94)) & (0x28 ^ 0x25 ^ (0xFF ^ 0xBC) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlllIIIIIl[2];
            }
            return n2 != 0;
        });
        if (d.llIIIIIllllIlII(projectile2)) {
            return Prayer.PROTECT_FROM_MELEE;
        }
        if (d.llIIIIIllllIlIl(var5.getId(), lIlIlllIIIIIl[5])) {
            return Prayer.PROTECT_FROM_MAGIC;
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }
}

