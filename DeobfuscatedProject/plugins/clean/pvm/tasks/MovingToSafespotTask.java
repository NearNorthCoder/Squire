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
package gg.squire.pvm.tasks;

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
import gg.squire.pvm.tasks.AHelper;
import gg.squire.pvm.tasks.CHelper;
import gg.squire.pvm.tasks.GameEnum;

@TaskDesc(name="Moving to safespot", priority=70, blocking=true)
public class MovingToSafespotTask
extends Task {
    private final  SquireShamanConfig af;
    
     NPC ah;
    private final  c ae;
    
    private final  a ag;
    private static final  Logger ad;

    private static boolean lIlIllIlllIIIll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        q var2;
        if (q.lIlIllIllIllllI(this.ae.s() ? 1 : 0)) {
            return lIIlIlllIlIlI[0];
        }
        if (q.lIlIllIllIlllll(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIIlIlllIlIlI[0];
        }
        if (q.lIlIllIllIlllll(var2.ag.m() ? 1 : 0)) {
            return lIIlIlllIlIlI[0];
        }
        NPC var3 = var2.ae.o();
        if (q.lIlIllIlllIIIII(var3)) {
            var2.ah = var3;
        }
        if (q.lIlIllIlllIIIIl(var2.ah)) {
            return lIIlIlllIlIlI[0];
        }
        if (q.lIlIllIlllIIIlI(var2.ah.getAnimation(), lIIlIlllIlIlI[1])) {
            return lIIlIlllIlIlI[0];
        }
        g var4 = var2.af.room();
        Stream stream = var4.z().stream();
        c c2 = var2.ae;
        Objects.requireNonNull(c2);

        WorldPoint var5 = stream.filter(c2::a).filter(worldPoint -> {
            boolean bl;
            if (q.lIlIllIllIllllI(this.ae.p().contains(worldPoint) ? 1 : 0)) {
                bl = lIIlIlllIlIlI[2];

                if (3 <= -1) {
                    return false;
                }
            } else {
                bl = lIIlIlllIlIlI[0];
            }
            return bl;
        }).filter(worldPoint -> {
            String[] stringArray = new String[lIIlIlllIlIlI[2]];
            stringArray[q.lIIlIlllIlIlI[0]] = lIIlIlllIlIIl[lIIlIlllIlIlI[0]];
            return NPCs.getAll((String[])stringArray).stream().filter(nPC -> var4.x().contains((Locatable)nPC)).noneMatch(nPC -> nPC.getWorldArea().contains(worldPoint));
        }).max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
        if (!q.lIlIllIlllIIIII(var5) || q.lIlIllIllIlllll(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
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
        q.lIIlIlllIlIIl[q.lIIlIlllIlIlI[0]] = "Lizardman shaman";
    }

    static {
        q.lIlIllIllIlllIl();
        q.lIlIllIllIlllII();
        ad = LoggerFactory.getLogger(MovingToSafespotTask.class);
    }

    private static boolean lIlIllIllIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlllIIIII(Object object) {
        return object != null;
    }

    @Inject
    public MovingToSafespotTask(c c2, SquireShamanConfig squireShamanConfig, a a2) {
        this.ae = c2;
        this.af = squireShamanConfig;
        this.ag = a2;
    }

    private static boolean lIlIllIllIllllI(int n2) {
        return n2 == 0;
    }
}

