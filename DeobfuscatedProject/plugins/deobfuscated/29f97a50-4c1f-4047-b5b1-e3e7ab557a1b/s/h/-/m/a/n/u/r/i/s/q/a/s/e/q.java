/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.a;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.g;

@TaskDesc(name="Moving to safespot", priority=70, blocking=true)
public class q
extends Task {
    private final /* synthetic */ SquireShamanConfig af;
    private static /* synthetic */ String[] lIIlIlllIlIIl;
    /* synthetic */ NPC ah;
    private final /* synthetic */ c ae;
    private static /* synthetic */ int[] lIIlIlllIlIlI;
    private final /* synthetic */ a ag;
    private static final /* synthetic */ Logger ad;

    private static boolean lIlIllIlllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllIllIllIll(String llllllllllllllIllllIlIIIlIIllIIl, String llllllllllllllIllllIlIIIlIIllIII) {
        llllllllllllllIllllIlIIIlIIllIIl = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIIIlIIlllII = new StringBuilder();
        char[] llllllllllllllIllllIlIIIlIIllIll = llllllllllllllIllllIlIIIlIIllIII.toCharArray();
        int llllllllllllllIllllIlIIIlIIllIlI = lIIlIlllIlIlI[0];
        char[] llllllllllllllIllllIlIIIlIIlIlII = llllllllllllllIllllIlIIIlIIllIIl.toCharArray();
        int llllllllllllllIllllIlIIIlIIlIIll = llllllllllllllIllllIlIIIlIIlIlII.length;
        int llllllllllllllIllllIlIIIlIIlIIlI = lIIlIlllIlIlI[0];
        while (q.lIlIllIlllIIIll(llllllllllllllIllllIlIIIlIIlIIlI, llllllllllllllIllllIlIIIlIIlIIll)) {
            char llllllllllllllIllllIlIIIlIIlllll = llllllllllllllIllllIlIIIlIIlIlII[llllllllllllllIllllIlIIIlIIlIIlI];
            llllllllllllllIllllIlIIIlIIlllII.append((char)(llllllllllllllIllllIlIIIlIIlllll ^ llllllllllllllIllllIlIIIlIIllIll[llllllllllllllIllllIlIIIlIIllIlI % llllllllllllllIllllIlIIIlIIllIll.length]));
            0;
            ++llllllllllllllIllllIlIIIlIIllIlI;
            ++llllllllllllllIllllIlIIIlIIlIIlI;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlIIIlIIlllII);
    }

    private static void lIlIllIllIlllIl() {
        lIIlIlllIlIlI = new int[3];
        q.lIIlIlllIlIlI[0] = (0x49 ^ 0x3D ^ (0x1C ^ 0x23)) & (0x39 ^ 0x1D ^ (0xC2 ^ 0xAD) ^ -1);
        q.lIIlIlllIlIlI[1] = 0xFFFFFBF3 & 0x1FFC;
        q.lIIlIlllIlIlI[2] = 1;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        q llllllllllllllIllllIlIIIlIllIIII;
        if (q.lIlIllIllIllllI(this.ae.s() ? 1 : 0)) {
            return lIIlIlllIlIlI[0];
        }
        if (q.lIlIllIllIlllll(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIIlIlllIlIlI[0];
        }
        if (q.lIlIllIllIlllll(llllllllllllllIllllIlIIIlIllIIII.ag.m() ? 1 : 0)) {
            return lIIlIlllIlIlI[0];
        }
        NPC llllllllllllllIllllIlIIIlIlIllll = llllllllllllllIllllIlIIIlIllIIII.ae.o();
        if (q.lIlIllIlllIIIII(llllllllllllllIllllIlIIIlIlIllll)) {
            llllllllllllllIllllIlIIIlIllIIII.ah = llllllllllllllIllllIlIIIlIlIllll;
        }
        if (q.lIlIllIlllIIIIl(llllllllllllllIllllIlIIIlIllIIII.ah)) {
            return lIIlIlllIlIlI[0];
        }
        if (q.lIlIllIlllIIIlI(llllllllllllllIllllIlIIIlIllIIII.ah.getAnimation(), lIIlIlllIlIlI[1])) {
            return lIIlIlllIlIlI[0];
        }
        g llllllllllllllIllllIlIIIlIlIlllI = llllllllllllllIllllIlIIIlIllIIII.af.room();
        Stream stream = llllllllllllllIllllIlIIIlIlIlllI.z().stream();
        c c2 = llllllllllllllIllllIlIIIlIllIIII.ae;
        Objects.requireNonNull(c2);
        0;
        WorldPoint llllllllllllllIllllIlIIIlIlIllIl = stream.filter(c2::a).filter(worldPoint -> {
            boolean bl;
            if (q.lIlIllIllIllllI(this.ae.p().contains(worldPoint) ? 1 : 0)) {
                bl = lIIlIlllIlIlI[2];
                0;
                if (3 <= -1) {
                    return ((0xC2 ^ 0xC4) & ~(0xBB ^ 0xBD)) != 0;
                }
            } else {
                bl = lIIlIlllIlIlI[0];
            }
            return bl;
        }).filter(worldPoint -> {
            String[] stringArray = new String[lIIlIlllIlIlI[2]];
            stringArray[q.lIIlIlllIlIlI[0]] = lIIlIlllIlIIl[lIIlIlllIlIlI[0]];
            return NPCs.getAll((String[])stringArray).stream().filter(nPC -> llllllllllllllIllllIlIIIlIlIlllI.x().contains((Locatable)nPC)).noneMatch(nPC -> nPC.getWorldArea().contains(worldPoint));
        }).max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
        if (!q.lIlIllIlllIIIII(llllllllllllllIllllIlIIIlIlIllIl) || q.lIlIllIllIlllll(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllIlIIIlIlIllIl) ? 1 : 0)) {
            return lIIlIlllIlIlI[0];
        }
        this.ah = null;
        Movement.walk((WorldPoint)var3_3);
        return lIIlIlllIlIlI[2];
    }

    private static boolean lIlIllIlllIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIllIlllIIIIl(Object object) {
        return object == null;
    }

    private static void lIlIllIllIlllII() {
        lIIlIlllIlIIl = new String[lIIlIlllIlIlI[2]];
        q.lIIlIlllIlIIl[q.lIIlIlllIlIlI[0]] = q."Lizardman shaman";
    }

    static {
        q.lIlIllIllIlllIl();
        q.lIlIllIllIlllII();
        ad = LoggerFactory.getLogger(q.class);
    }

    private static boolean lIlIllIllIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlllIIIII(Object object) {
        return object != null;
    }

    @Inject
    public q(c c2, SquireShamanConfig squireShamanConfig, a a2) {
        this.ae = c2;
        this.af = squireShamanConfig;
        this.ag = a2;
    }

    private static boolean lIlIllIllIllllI(int n2) {
        return n2 == 0;
    }
}

