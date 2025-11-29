/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.CollisionMap
 *  net.unethicalite.api.movement.pathfinder.GlobalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.LocalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.Pathfinder
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.RegionManager
 */
package gg.squire.minigame.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.minigame.tasks.AHelper;
import gg.squire.minigame.tasks.GameEnum4;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;

@TaskDesc(name="Attacking")
public class AttackingTask
extends Task {
    
    private final  a p;

    private Optional<NPC> r() {
        return NPCs.getAll().stream().filter(this::a).min(this::a);
    }

    @Inject
    public AttackingTask(a a2) {
        this.p = a2;
    }

    private static void lIIllllllllIIII() {
        lIIIlIlIIlIll = new String[lIIIlIlIIllII[5]];
        f.lIIIlIlIIlIll[f.lIIIlIlIIllII[2]] = "Attack";
        f.lIIIlIlIIlIll[f.lIIIlIlIIllII[1]] = "Attack";
    }

    private static boolean lIIllllllllIlIl(Object object) {
        return object == null;
    }

    private static boolean lIIllllllllIIlI(int n) {
        return n != 0;
    }

    private int a(NPC nPC, NPC nPC2) {
        e e2 = e.valueOf(nPC.getName().toUpperCase());
        e e3 = e.valueOf(nPC2.getName().toUpperCase());
        return Integer.compare(e2.q(), e3.q());
    }

    private static boolean lIIllllllllIllI(int n) {
        return n == 0;
    }

    public boolean run() {
        f var1;
        if (f.lIIllllllllIIlI(this.s() ? 1 : 0)) {
            return lIIIlIlIIllII[2];
        }
        Optional<NPC> var2 = var1.r();
        if (f.lIIllllllllIIlI(var2.isPresent() ? 1 : 0)) {
            var1.b(var2.get());

            if (1 >= 2) {
                return ((0x48 ^ 0x31 ^ (0x59 ^ 0x34)) & (4 ^ 0x35 ^ (0x9C ^ 0xB9) ^ -1)) != 0;
            }
        } else {
            var1.p.i();
        }
        return lIIIlIlIIllII[1];
    }

    private static boolean lIIllllllllIlll(int n, int n2) {
        return n < n2;
    }

        return String.valueOf(var3);
    }

    static {
        f.lIIllllllllIIIl();
        f.lIIllllllllIIII();
    }

    private boolean s() {
        boolean bl;
        if (!f.lIIllllllllIIlI(this.p.e() ? 1 : 0) || !f.lIIllllllllIlIl(Players.getLocal().getInteracting()) || f.lIIllllllllIllI(Movement.shouldWalk() ? 1 : 0)) {
            bl = lIIIlIlIIllII[1];

        } else {
            bl = lIIIlIlIIllII[2];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private void b(NPC nPC) {
        void var4;
        if (f.lIIllllllllIllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)nPC.getWorldLocation());

            if (-1 == 1) {
                return;
            }
        } else if (f.lIIllllllllIllI(var4.isDead() ? 1 : 0)) {
            var4.interact(lIIIlIlIIlIll[lIIIlIlIIllII[1]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(NPC nPC) {
        int n;
        if (f.lIIllllllllIIlI(Arrays.stream(e.values()).anyMatch(e2 -> e2.p().equals(nPC.getName())) ? 1 : 0) && f.lIIllllllllIIll(nPC.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIIIlIlIIllII[0])) {
            String[] stringArray = new String[lIIIlIlIIllII[1]];
            stringArray[f.lIIIlIlIIllII[2]] = lIIIlIlIIlIll[lIIIlIlIIllII[2]];
            if (f.lIIllllllllIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                n = lIIIlIlIIllII[1];

                if ((0x39 ^ 0x6F ^ (0xDC ^ 0x8E)) != 0) return n != 0;
                return ((0x66 ^ 0x22 ^ (0x5E ^ 0xD)) & (104 + 110 - 120 + 37 ^ 48 + 6 - -2 + 92 ^ -1)) != 0;
            }
        }
        n = lIIIlIlIIllII[2];
        return n != 0;
    }

    private static boolean lIIllllllllIlII(Object object) {
        return object != null;
    }

    private static boolean lIIllllllllIIll(int n, int n2) {
        return n <= n2;
    }

    private int b(int var5, int var6, int var7) {
        int n;
        LocalCollisionMap var8;
        List var9;
        CollisionMap collisionMap;
        if (f.lIIllllllllIIlI(Static.getGlobalCollisionMap() instanceof GlobalCollisionMap)) {
            collisionMap = Static.getGlobalCollisionMap();

            if ((150 + 11 - 56 + 59 ^ 77 + 2 - -40 + 41) < -1) {
                return (0xED ^ 0x80 ^ (0x87 ^ 0xA1)) & (169 + 16 - 120 + 178 ^ 176 + 136 - 164 + 36 ^ -1);
            }
        } else {
            collisionMap = null;
        }
        if (f.lIIllllllllIlII(var9 = new Pathfinder((CollisionMap)(var8 = new LocalCollisionMap((GlobalCollisionMap)collisionMap, lIIIlIlIIllII[2])), Walker.buildTransportLinks(), List.of(Players.getLocal().getWorldLocation()), a.a(new RegionPoint(var5, var6, var7, lIIIlIlIIllII[3])), RegionManager.avoidWilderness()).find())) {
            n = var9.size();

            if (1 >= (0x96 ^ 0x92)) {
                return (0xA ^ 0x3E) & ~(0x40 ^ 0x74);
            }
        } else {
            n = lIIIlIlIIllII[4];
        }
        return n;
    }
}

