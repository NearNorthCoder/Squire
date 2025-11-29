package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

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
@Singleton
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/d.class */
public class C0003d {
    private static final /* synthetic */ int l;
    private static final /* synthetic */ int n;
    private static final /* synthetic */ int m;
    private static /* synthetic */ int[] lIlIlllIIIIIl;
    private static final /* synthetic */ int k;
    private static /* synthetic */ String[] lIlIlllIIIIII;
    private final /* synthetic */ Queue<Prayer> o = new LinkedList();
    @Inject
    protected /* synthetic */ C0002c p;

    private static void llIIIIIllllIIII() {
        lIlIlllIIIIII = new String[lIlIlllIIIIIl[1]];
        lIlIlllIIIIII[lIlIlllIIIIIl[2]] = llIIIIIlllIllll("BBw9TR04HSsdLyIRKg==", "PtXmJ");
    }

    private static boolean llIIIIIllllIIlI(int i) {
        return i == 0;
    }

    public NPC j() {
        String[] strArr = new String[lIlIlllIIIIIl[1]];
        strArr[lIlIlllIIIIIl[2]] = lIlIlllIIIIII[lIlIlllIIIIIl[2]];
        return NPCs.getNearest(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean f() {
        if (llIIIIIllllIIlI(this.p.c(lIlIlllIIIIIl[0]) ? 1 : 0) && llIIIIIllllIIll(this.p.b(lIlIlllIIIIIl[0]) ? 1 : 0)) {
            ?? r0 = lIlIlllIIIIIl[1];
            "".length();
            return (20 ^ 16) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlllIIIIIl[2];
    }

    private static boolean llIIIIIllllIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        if (llIIIIIllllIllI(hitsplatApplied.getActor(), Players.getLocal()) || llIIIIIllllIlll(hitsplatApplied.getHitsplat().getAmount())) {
            return;
        }
        this.o.remove();
        "".length();
    }

    public List<NPC> l() {
        int[] iArr = new int[lIlIlllIIIIIl[1]];
        iArr[lIlIlllIIIIIl[2]] = lIlIlllIIIIIl[6];
        return NPCs.getAll(iArr);
    }

    private static void llIIIIIllllIIIl() {
        lIlIlllIIIIIl = new int[9];
        lIlIlllIIIIIl[0] = (-((-2421) & 3453)) & (-20993) & 32619;
        lIlIlllIIIIIl[1] = " ".length();
        lIlIlllIIIIIl[2] = (138 ^ 156) & ((71 ^ 81) ^ (-1));
        lIlIlllIIIIIl[3] = -" ".length();
        lIlIlllIIIIIl[4] = (-37) & 6135;
        lIlIlllIIIIIl[5] = (-17489) & 19933;
        lIlIlllIIIIIl[6] = (-20484) & 32691;
        lIlIlllIIIIIl[7] = (-24577) & 27020;
        lIlIlllIIIIIl[8] = (130 ^ 148) ^ (148 ^ 135);
    }

    static {
        llIIIIIllllIIIl();
        llIIIIIllllIIII();
        k = lIlIlllIIIIIl[5];
        l = lIlIlllIIIIIl[7];
        n = lIlIlllIIIIIl[0];
        m = lIlIlllIIIIIl[6];
    }

    public int i() {
        return Vars.getBit(lIlIlllIIIIIl[4]);
    }

    private static boolean llIIIIIlllllIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean g() {
        if (llIIIIIllllIIll(this.p.c(lIlIlllIIIIIl[0]) ? 1 : 0) && llIIIIIllllIlII(j())) {
            ?? r0 = lIlIlllIIIIIl[1];
            "".length();
            return "  ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlllIIIIIl[2];
    }

    public int h() {
        return lIlIlllIIIIIl[3];
    }

    private static boolean llIIIIIlllllIII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIIIIlllllIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIIIllllIlIl(int i, int i2) {
        return i == i2;
    }

    private static String llIIIIIlllIllll(String llllllllllllllIllIlIIIIlIIlllIlI, String llllllllllllllIllIlIIIIlIIlllIIl) {
        String llllllllllllllIllIlIIIIlIIlllIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIIlIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIIIIlIIlllIIl.toCharArray();
        int llllllllllllllIllIlIIIIlIIllIllI = lIlIlllIIIIIl[2];
        char[] charArray2 = llllllllllllllIllIlIIIIlIIlllIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlllIIIIIl[2];
        while (llIIIIIlllllIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIlIIIIlIIllIllI % charArray.length]));
            "".length();
            llllllllllllllIllIlIIIIlIIllIllI++;
            i++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIIIllllIlll(int i) {
        return i > 0;
    }

    private static boolean llIIIIIllllIIll(int i) {
        return i != 0;
    }

    private static boolean llIIIIIllllIlII(Object obj) {
        return obj == null;
    }

    public void e() {
        this.o.clear();
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        int id = projectileSpawned.getProjectile().getId();
        if (!llIIIIIllllIlIl(id, lIlIlllIIIIIl[5])) {
            if (llIIIIIllllIlIl(id, lIlIlllIIIIIl[7])) {
                this.o.add(Prayer.PROTECT_FROM_MISSILES);
                "".length();
                return;
            }
            return;
        }
        this.o.add(Prayer.PROTECT_FROM_MAGIC);
        "".length();
        "".length();
        if ((-" ".length()) > 0) {
        }
    }

    public Prayer k() {
        Projectile nearest = Projectiles.getNearest(projectile -> {
            if (!llIIIIIlllllIII(projectile.getRemainingCycles(), lIlIlllIIIIIl[8]) || (llIIIIIlllllIIl(projectile.getId(), lIlIlllIIIIIl[5]) && !llIIIIIllllIlIl(projectile.getId(), lIlIlllIIIIIl[7]))) {
                return lIlIlllIIIIIl[2];
            }
            ?? r0 = lIlIlllIIIIIl[1];
            "".length();
            return " ".length() <= 0 ? ((20 ^ 6) ^ (200 ^ 148)) & (((40 ^ 37) ^ (255 ^ 188)) ^ (-" ".length())) : r0;
        });
        return llIIIIIllllIlII(nearest) ? Prayer.PROTECT_FROM_MELEE : llIIIIIllllIlIl(nearest.getId(), lIlIlllIIIIIl[5]) ? Prayer.PROTECT_FROM_MAGIC : Prayer.PROTECT_FROM_MISSILES;
    }
}
