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
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.c;

@Singleton
public class d {
    private static final /* synthetic */ int l;
    private static final /* synthetic */ int n;
    private static final /* synthetic */ int m;
    private static /* synthetic */ int[] lIlIlllIIIIIl;
    private static final /* synthetic */ int k;
    private static /* synthetic */ String[] lIlIlllIIIIII;
    private final /* synthetic */ Queue<Prayer> o;
    @Inject
    protected /* synthetic */ c p;

    private static void llIIIIIllllIIII() {
        lIlIlllIIIIII = new String[lIlIlllIIIIIl[1]];
        d.lIlIlllIIIIII[d.lIlIlllIIIIIl[2]] = d."The Whisperer";
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
            0;
            if ((0x14 ^ 0x10) < 0) {
                return ((0x65 ^ 7) & ~(0xFA ^ 0x98)) != 0;
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
        void llllllllllllllIllIlIIIIlIlIIIlll;
        if (d.llIIIIIllllIllI(hitsplatApplied.getActor(), Players.getLocal())) {
            return;
        }
        if (d.llIIIIIllllIlll(llllllllllllllIllIlIIIIlIlIIIlll.getHitsplat().getAmount())) {
            return;
        }
        this.o.remove();
        0;
    }

    public List<NPC> l() {
        int[] nArray = new int[lIlIlllIIIIIl[1]];
        nArray[d.lIlIlllIIIIIl[2]] = lIlIlllIIIIIl[6];
        return NPCs.getAll((int[])nArray);
    }

    public d() {
        this.o = new LinkedList<Prayer>();
    }

    private static void llIIIIIllllIIIl() {
        lIlIlllIIIIIl = new int[9];
        d.lIlIlllIIIIIl[0] = -(0xFFFFF68B & 0xD7D) & (0xFFFFADFF & 0x7F6B);
        d.lIlIlllIIIIIl[1] = 1;
        d.lIlIlllIIIIIl[2] = (0x8A ^ 0x9C) & ~(0x47 ^ 0x51);
        d.lIlIlllIIIIIl[3] = -1;
        d.lIlIlllIIIIIl[4] = 0xFFFFFFDB & 0x17F7;
        d.lIlIlllIIIIIl[5] = 0xFFFFBBAF & 0x4DDD;
        d.lIlIlllIIIIIl[6] = 0xFFFFAFFC & 0x7FB3;
        d.lIlIlllIIIIIl[7] = 0xFFFF9FFF & 0x698C;
        d.lIlIlllIIIIIl[8] = 0x82 ^ 0x94 ^ (0x94 ^ 0x87);
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
            0;
            if (2 > 3) {
                return ((0xA5 ^ 0x8E) & ~(0x81 ^ 0xAA)) != 0;
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

    private static String llIIIIIlllIllll(String llllllllllllllIllIlIIIIlIIllIlIl, String llllllllllllllIllIlIIIIlIIlllIIl) {
        llllllllllllllIllIlIIIIlIIllIlIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIIlIIlllIII = new StringBuilder();
        char[] llllllllllllllIllIlIIIIlIIllIlll = llllllllllllllIllIlIIIIlIIlllIIl.toCharArray();
        int llllllllllllllIllIlIIIIlIIllIllI = lIlIlllIIIIIl[2];
        char[] llllllllllllllIllIlIIIIlIIllIIII = llllllllllllllIllIlIIIIlIIllIlIl.toCharArray();
        int llllllllllllllIllIlIIIIlIIlIllll = llllllllllllllIllIlIIIIlIIllIIII.length;
        int llllllllllllllIllIlIIIIlIIlIlllI = lIlIlllIIIIIl[2];
        while (d.llIIIIIlllllIlI(llllllllllllllIllIlIIIIlIIlIlllI, llllllllllllllIllIlIIIIlIIlIllll)) {
            char llllllllllllllIllIlIIIIlIIlllIll = llllllllllllllIllIlIIIIlIIllIIII[llllllllllllllIllIlIIIIlIIlIlllI];
            llllllllllllllIllIlIIIIlIIlllIII.append((char)(llllllllllllllIllIlIIIIlIIlllIll ^ llllllllllllllIllIlIIIIlIIllIlll[llllllllllllllIllIlIIIIlIIllIllI % llllllllllllllIllIlIIIIlIIllIlll.length]));
            0;
            ++llllllllllllllIllIlIIIIlIIllIllI;
            ++llllllllllllllIllIlIIIIlIIlIlllI;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIIIlIIlllIII);
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
        void llllllllllllllIllIlIIIIlIlIIlIll;
        int n2 = projectileSpawned.getProjectile().getId();
        if (d.llIIIIIllllIlIl(n2, lIlIlllIIIIIl[5])) {
            this.o.add(Prayer.PROTECT_FROM_MAGIC);
            0;
            0;
            if (-1 > 0) {
                return;
            }
        } else if (d.llIIIIIllllIlIl((int)llllllllllllllIllIlIIIIlIlIIlIll, lIlIlllIIIIIl[7])) {
            d llllllllllllllIllIlIIIIlIlIIllIl;
            llllllllllllllIllIlIIIIlIlIIllIl.o.add(Prayer.PROTECT_FROM_MISSILES);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Prayer k() {
        void llllllllllllllIllIlIIIIlIlIlIIIl;
        Projectile projectile2 = Projectiles.getNearest(projectile -> {
            int n2;
            if (d.llIIIIIlllllIII(projectile.getRemainingCycles(), lIlIlllIIIIIl[8]) && (!d.llIIIIIlllllIIl(projectile.getId(), lIlIlllIIIIIl[5]) || d.llIIIIIllllIlIl(projectile.getId(), lIlIlllIIIIIl[7]))) {
                n2 = lIlIlllIIIIIl[1];
                0;
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
        if (d.llIIIIIllllIlIl(llllllllllllllIllIlIIIIlIlIlIIIl.getId(), lIlIlllIIIIIl[5])) {
            return Prayer.PROTECT_FROM_MAGIC;
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }
}

