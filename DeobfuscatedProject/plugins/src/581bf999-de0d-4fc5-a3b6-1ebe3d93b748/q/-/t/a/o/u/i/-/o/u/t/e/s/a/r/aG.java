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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.f;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.v;

@TaskDesc(name="Handling Tumeken P3 Prayers", priority=0x7FFFFFFF, register=true)
public class aG
extends W {
    private /* synthetic */ Prayer dE;
    private static /* synthetic */ int[] llIIIlIIIII;

    @Override
    public boolean aL() {
        int[] nArray = new int[llIIIlIIIII[1]];
        nArray[aG.llIIIlIIIII[2]] = llIIIlIIIII[3];
        nArray[aG.llIIIlIIIII[4]] = llIIIlIIIII[5];
        return this.cm.a(nArray);
    }

    private static boolean lIIlllIlllIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (aG.lIIlllIlllIIlI(nPC.getId(), llIIIlIIIII[7])) {
            Prayer prayer;
            if (aG.lIIlllIlllIIlI(nPC.getGraphic(), llIIIlIIIII[8])) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                "".length();
                if ("  ".length() > "   ".length()) {
                    return;
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            this.dE = prayer;
        }
    }

    @Override
    public List<Prayer> aN() {
        if (aG.lIIlllIlllIIIl(this.dE)) {
            return List.of(this.aQ());
        }
        return List.of(this.aQ(), this.dE);
    }

    private static void lIIlllIlllIIII() {
        llIIIlIIIII = new int[9];
        aG.llIIIlIIIII[0] = -(0xFFFFF2CF & 0xFB4) & (0xFFFFBFD3 & Short.MAX_VALUE);
        aG.llIIIlIIIII[1] = "  ".length();
        aG.llIIIlIIIII[2] = (0xF4 ^ 0xC5) & ~(0x1F ^ 0x2E);
        aG.llIIIlIIIII[3] = -(0xFFFFDE2F & 0x63D5) & (0xFFFFEFFF & 0x7FF6);
        aG.llIIIlIIIII[4] = " ".length();
        aG.llIIIlIIIII[5] = -(0xFFFFD3DB & 0x7C2D) & (0xFFFFFFFF & 0x7DFC);
        aG.llIIIlIIIII[6] = 0xFFFFCE95 & 0x39EF;
        aG.llIIIlIIIII[7] = -(0xFFFFF35F & 0x1CBE) & (0xFFFFBDFD & Short.MAX_VALUE);
        aG.llIIIlIIIII[8] = 0xFFFFFCCA & 0xBBF;
    }

    @Override
    public int aO() {
        return llIIIlIIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void llllllllllllllllIlIIIlIllllIlIll;
        Projectile projectile = projectileSpawned.getProjectile();
        if (aG.lIIlllIlllIIlI(projectile.getId(), llIIIlIIIII[6])) {
            this.dE = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if ((0x11 ^ 0x64 ^ (0x14 ^ 0x65)) <= " ".length()) {
                return;
            }
        } else if (aG.lIIlllIlllIIll(f.E.contains(llllllllllllllllIlIIIlIllllIlIll.getProjectile().getId()) ? 1 : 0)) {
            llllllllllllllllIlIIIlIllllIllII.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Inject
    public aG(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dE = null;
    }

    private static boolean lIIlllIlllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIlllIIIl(Object object) {
        return object == null;
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    static {
        aG.lIIlllIlllIIII();
    }
}

