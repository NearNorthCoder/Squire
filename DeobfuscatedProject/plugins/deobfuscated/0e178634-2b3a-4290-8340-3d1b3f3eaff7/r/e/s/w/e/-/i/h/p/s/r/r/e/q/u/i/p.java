/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;

@TaskDesc(name="Dodging Tentacles", priority=10, blocking=true, register=true)
@Singleton
public class p
extends u {
    private static /* synthetic */ int[] lIlIlllIIlIlI;
    private /* synthetic */ boolean X;
    private static /* synthetic */ String[] lIlIlllIIlIII;

    private Stream<WorldPoint> b(WorldPoint worldPoint) {
        WorldPoint[] worldPointArray = new WorldPoint[lIlIlllIIlIlI[2]];
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[0]] = worldPoint.dx(lIlIlllIIlIlI[1]).dy(lIlIlllIIlIlI[3]);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[1]] = worldPoint.dx(lIlIlllIIlIlI[1]).dy(lIlIlllIIlIlI[4]);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[3]] = worldPoint.dx(lIlIlllIIlIlI[5]).dy(lIlIlllIIlIlI[3]);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[6]] = worldPoint.dx(lIlIlllIIlIlI[5]).dy(lIlIlllIIlIlI[4]);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[7]] = worldPoint.dx(lIlIlllIIlIlI[3]).dy(lIlIlllIIlIlI[1]);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[8]] = worldPoint.dx(lIlIlllIIlIlI[3]).dy(lIlIlllIIlIlI[5]);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[9]] = worldPoint.dx(lIlIlllIIlIlI[4]).dy(lIlIlllIIlIlI[1]);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[10]] = worldPoint.dx(lIlIlllIIlIlI[4]).dy(lIlIlllIIlIlI[5]);
        return Stream.of(worldPointArray);
    }

    private static boolean llIIIIlIIIlIIlI(Object object) {
        return object == null;
    }

    private static String llIIIIlIIIIlIlI(String llllllllllllllIllIlIIIIIlIllIlll, String llllllllllllllIllIlIIIIIlIllIlII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIIlIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), lIlIlllIIlIlI[2]), "DES");
            Cipher llllllllllllllIllIlIIIIIlIlllIIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIIIlIlllIIl.init(lIlIlllIIlIlI[3], llllllllllllllIllIlIIIIIlIlllIlI);
            return new String(llllllllllllllIllIlIIIIIlIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIIIlIlllIII) {
            llllllllllllllIllIlIIIIIlIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIIIlIIll(Object object) {
        return object != null;
    }

    private static boolean llIIIIlIIIlIlII(int n2, int n3) {
        return n2 <= n3;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        String string = npcSpawned.getNpc().getName();
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.llIIIIlIIIlIIll(string) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.llIIIIlIIIlIIII(string.contains(lIlIlllIIlIII[lIlIlllIIlIlI[0]]) ? 1 : 0)) {
            this.X = lIlIlllIIlIlI[1];
        }
    }

    private static boolean llIIIIlIIIlIIII(int n2) {
        return n2 != 0;
    }

    private static void llIIIIlIIIIlIll() {
        lIlIlllIIlIII = new String[lIlIlllIIlIlI[1]];
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIII[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[0]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p."Tentacle";
    }

    public boolean r() {
        return this.X;
    }

    private static boolean llIIIIlIIIlIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var3_3;
        p llllllllllllllIllIlIIIIIllIIllII;
        List<NPC> list = this.W.l();
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.llIIIIlIIIlIIII(list.isEmpty() ? 1 : 0)) {
            this.X = lIlIlllIIlIlI[0];
            return lIlIlllIIlIlI[0];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.llIIIIlIIIlIIIl(llllllllllllllIllIlIIIIIllIIllII.X ? 1 : 0)) {
            return lIlIlllIIlIlI[0];
        }
        WorldPoint llllllllllllllIllIlIIIIIllIIlIlI = Players.getLocal().getWorldLocation();
        WorldPoint llllllllllllllIllIlIIIIIllIIlIIl = llllllllllllllIllIlIIIIIllIIllII.b(llllllllllllllIllIlIIIIIllIIlIlI).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl;
            if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.llIIIIlIIIlIlII(worldPoint.distanceTo2D(this.W.j().getWorldLocation()), lIlIlllIIlIlI[11])) {
                bl = lIlIlllIIlIlI[1];
                0;
                if (-2 > 0) {
                    return ((0x30 ^ 0x7E) & ~(0x3F ^ 0x71)) != 0;
                }
            } else {
                bl = lIlIlllIIlIlI[0];
            }
            return bl;
        }).max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo2D(this.W.j().getWorldLocation()))).orElse(null);
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.llIIIIlIIIlIIlI(llllllllllllllIllIlIIIIIllIIlIIl)) {
            return lIlIlllIIlIlI[0];
        }
        Movement.setDestination((WorldPoint)var3_3);
        this.X = lIlIlllIIlIlI[0];
        return lIlIlllIIlIlI[1];
    }

    static {
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.llIIIIlIIIIllll();
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.llIIIIlIIIIlIll();
    }

    private static void llIIIIlIIIIllll() {
        lIlIlllIIlIlI = new int[12];
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[0] = (0xFA ^ 0xAC ^ (0x25 ^ 0x3C) & ~(0x4B ^ 0x52)) & (0xF4 ^ 0x93 ^ (0xA5 ^ 0x94) ^ -1);
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[1] = 1;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[2] = 0x83 ^ 0x8B;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[3] = 2;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[4] = -2;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[5] = -1;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[6] = 3;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[7] = 0x9B ^ 0x9F;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[8] = 0x63 ^ 0x28 ^ (0x3C ^ 0x72);
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[9] = 0xBB ^ 0xBD;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[10] = 0x29 ^ 0x2E;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.lIlIlllIIlIlI[11] = 0x53 ^ 0x5A;
    }
}

