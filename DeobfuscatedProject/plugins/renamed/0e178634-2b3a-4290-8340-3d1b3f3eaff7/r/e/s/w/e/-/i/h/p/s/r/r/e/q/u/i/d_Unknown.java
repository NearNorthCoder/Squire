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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.c_Unknown;

@Singleton
public class d_Unknown {
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
        void var2;
        if (d.llIIIIIllllIllI(hitsplatApplied.getActor(), Players.getLocal())) {
            return;
        }
        if (d.llIIIIIllllIlll(var2.getHitsplat().getAmount())) {
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

    private static String llIIIIIlllIllll(String var10, String var4) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var4.toCharArray();
        int var7 = lIlIlllIIIIIl[2];
        char[] var9 = var10.toCharArray();
        int var1 = var9.length;
        int var11 = lIlIlllIIIIIl[2];
        while (d.llIIIIIlllllIlI(var11, var1)) {
            char var5 = var9[var11];
            var12.append((char)(var5 ^ var13[var7 % var13.length]));
            0;
            ++var7;
            ++var11;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(var12);
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
        void var6;
        int n2 = projectileSpawned.getProjectile().getId();
        if (d.llIIIIIllllIlIl(n2, lIlIlllIIIIIl[5])) {
            this.o.add(Prayer.PROTECT_FROM_MAGIC);
            0;
            0;
            if (-1 > 0) {
                return;
            }
        } else if (d.llIIIIIllllIlIl((int)var6, lIlIlllIIIIIl[7])) {
            d var8;
            var8.o.add(Prayer.PROTECT_FROM_MISSILES);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Prayer k() {
        void var3;
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
        if (d.llIIIIIllllIlIl(var3.getId(), lIlIlllIIIIIl[5])) {
            return Prayer.PROTECT_FROM_MAGIC;
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }
}

