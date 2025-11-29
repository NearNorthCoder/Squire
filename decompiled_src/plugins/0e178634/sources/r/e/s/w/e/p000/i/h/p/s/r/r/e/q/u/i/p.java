package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@Singleton
@TaskDesc(name = "Dodging Tentacles", priority = 10, blocking = true, register = true)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/p.class */
public class p extends u {
    private static /* synthetic */ int[] lIlIlllIIlIlI;
    private /* synthetic */ boolean X;
    private static /* synthetic */ String[] lIlIlllIIlIII;

    private Stream<WorldPoint> b(WorldPoint worldPoint) {
        WorldPoint[] worldPointArr = new WorldPoint[lIlIlllIIlIlI[2]];
        worldPointArr[lIlIlllIIlIlI[0]] = worldPoint.dx(lIlIlllIIlIlI[1]).dy(lIlIlllIIlIlI[3]);
        worldPointArr[lIlIlllIIlIlI[1]] = worldPoint.dx(lIlIlllIIlIlI[1]).dy(lIlIlllIIlIlI[4]);
        worldPointArr[lIlIlllIIlIlI[3]] = worldPoint.dx(lIlIlllIIlIlI[5]).dy(lIlIlllIIlIlI[3]);
        worldPointArr[lIlIlllIIlIlI[6]] = worldPoint.dx(lIlIlllIIlIlI[5]).dy(lIlIlllIIlIlI[4]);
        worldPointArr[lIlIlllIIlIlI[7]] = worldPoint.dx(lIlIlllIIlIlI[3]).dy(lIlIlllIIlIlI[1]);
        worldPointArr[lIlIlllIIlIlI[8]] = worldPoint.dx(lIlIlllIIlIlI[3]).dy(lIlIlllIIlIlI[5]);
        worldPointArr[lIlIlllIIlIlI[9]] = worldPoint.dx(lIlIlllIIlIlI[4]).dy(lIlIlllIIlIlI[1]);
        worldPointArr[lIlIlllIIlIlI[10]] = worldPoint.dx(lIlIlllIIlIlI[4]).dy(lIlIlllIIlIlI[5]);
        return Stream.of((Object[]) worldPointArr);
    }

    private static boolean llIIIIlIIIlIIlI(Object obj) {
        return obj == null;
    }

    private static String llIIIIlIIIIlIlI(String llllllllllllllIllIlIIIIIlIllIlll, String llllllllllllllIllIlIIIIIlIllIllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIIlIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIIlIllIllI.getBytes(StandardCharsets.UTF_8)), lIlIlllIIlIlI[2]), "DES");
            Cipher llllllllllllllIllIlIIIIIlIlllIIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIIIlIlllIIl.init(lIlIlllIIlIlI[3], llllllllllllllIllIlIIIIIlIlllIlI);
            return new String(llllllllllllllIllIlIIIIIlIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIIIlIlllIII) {
            llllllllllllllIllIlIIIIIlIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIIIlIIll(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIlIIIlIlII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        String name = npcSpawned.getNpc().getName();
        if (llIIIIlIIIlIIll(name) && llIIIIlIIIlIIII(name.contains(lIlIlllIIlIII[lIlIlllIIlIlI[0]]) ? 1 : 0)) {
            this.X = lIlIlllIIlIlI[1];
        }
    }

    private static boolean llIIIIlIIIlIIII(int i) {
        return i != 0;
    }

    private static void llIIIIlIIIIlIll() {
        lIlIlllIIlIII = new String[lIlIlllIIlIlI[1]];
        lIlIlllIIlIII[lIlIlllIIlIlI[0]] = llIIIIlIIIIlIlI("+aujwU0rBr89O9k1qg1VsQ==", "PhotH");
    }

    public boolean r() {
        return this.X;
    }

    private static boolean llIIIIlIIIlIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        if (llIIIIlIIIlIIII(this.W.l().isEmpty() ? 1 : 0)) {
            this.X = lIlIlllIIlIlI[0];
            return lIlIlllIIlIlI[0];
        } else if (llIIIIlIIIlIIIl(this.X ? 1 : 0)) {
            return lIlIlllIIlIlI[0];
        } else {
            WorldPoint orElse = b(Players.getLocal().getWorldLocation()).filter(Reachable::isWalkable).filter(worldPoint -> {
                if (llIIIIlIIIlIlII(worldPoint.distanceTo2D(this.W.j().getWorldLocation()), lIlIlllIIlIlI[11])) {
                    ?? r0 = lIlIlllIIlIlI[1];
                    "".length();
                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIlllIIlIlI[0];
            }).max(Comparator.comparingInt(worldPoint2 -> {
                return worldPoint2.distanceTo2D(this.W.j().getWorldLocation());
            })).orElse(null);
            if (llIIIIlIIIlIIlI(orElse)) {
                return lIlIlllIIlIlI[0];
            }
            Movement.setDestination(orElse);
            this.X = lIlIlllIIlIlI[0];
            return lIlIlllIIlIlI[1];
        }
    }

    static {
        llIIIIlIIIIllll();
        llIIIIlIIIIlIll();
    }

    private static void llIIIIlIIIIllll() {
        lIlIlllIIlIlI = new int[12];
        lIlIlllIIlIlI[0] = ((250 ^ 172) ^ ((37 ^ 60) & ((75 ^ 82) ^ (-1)))) & (((244 ^ 147) ^ (165 ^ 148)) ^ (-" ".length()));
        lIlIlllIIlIlI[1] = " ".length();
        lIlIlllIIlIlI[2] = 131 ^ 139;
        lIlIlllIIlIlI[3] = "  ".length();
        lIlIlllIIlIlI[4] = -"  ".length();
        lIlIlllIIlIlI[5] = -" ".length();
        lIlIlllIIlIlI[6] = "   ".length();
        lIlIlllIIlIlI[7] = 155 ^ 159;
        lIlIlllIIlIlI[8] = (99 ^ 40) ^ (60 ^ 114);
        lIlIlllIIlIlI[9] = 187 ^ 189;
        lIlIlllIIlIlI[10] = 41 ^ 46;
        lIlIlllIIlIlI[11] = 83 ^ 90;
    }
}
