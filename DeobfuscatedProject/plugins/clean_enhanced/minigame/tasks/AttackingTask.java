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
import java.util.List;
import java.util.Optional;
import gg.squire.minigame.tasks.AHelper;
import gg.squire.minigame.tasks.GameEnum2;
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

    private static void var3() {
        var2 = new String[var1[5]];
        f.var2[f.var1[2]] = "Attack";
        f.var2[f.var1[1]] = "Attack";
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var5(int n) {
        return n != 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private int a(NPC nPC, NPC nPC2) {
        e e2 = e.valueOf(nPC.getName().toUpperCase());
        e e3 = e.valueOf(nPC2.getName().toUpperCase());
        return Integer.compare(e2.q(), e3.q());
    }

    private static boolean var12(int n) {
        return n == 0;
    }

    public boolean run() {
        f var13;
        if (f.var5(this.s() ? 1 : 0)) {
            return var1[2];
        }
        Optional<NPC> var14 = var13.r();
        if (f.var5(var14.isPresent() ? 1 : 0)) {
            var13.b(var14.get());
            0;
            if (1 >= 2) {
                return ((0x48 ^ 0x31 ^ (0x59 ^ 0x34)) & (4 ^ 0x35 ^ (0x9C ^ 0xB9) ^ -1)) != 0;
            }
        } else {
            var13.p.i();
        }
        return var1[1];
    }

    private static boolean var15(int n, int n2) {
        return n < n2;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var1[2];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var1[2];
        while (f.var15(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if ((0x6F ^ 0x6B) != 3) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    static {
        f.var26();
        f.var3();
    }

    private boolean s() {
        boolean bl;
        if (!f.var5(this.p.e() ? 1 : 0) || !f.var4(Players.getLocal().getInteracting()) || f.var12(Movement.shouldWalk() ? 1 : 0)) {
            bl = var1[1];
            0;
            if (-1 > 0) {
                return ((0x56 ^ 0x37 ^ (0xD ^ 0x56)) & (222 + 144 - 268 + 153 ^ 146 + 172 - 313 + 188 ^ -1)) != 0;
            }
        } else {
            bl = var1[2];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private void b(NPC nPC) {
        void var27;
        if (f.var12(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)nPC.getWorldLocation());
            0;
            0;
            if (-1 == 1) {
                return;
            }
        } else if (f.var12(var27.isDead() ? 1 : 0)) {
            var27.interact(var2[var1[1]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(NPC nPC) {
        int n;
        if (f.var5(Arrays.stream(e.values()).anyMatch(e2 -> e2.p().equals(nPC.getName())) ? 1 : 0) && f.var28(nPC.getWorldLocation().distanceTo((Locatable)Players.getLocal()), var1[0])) {
            String[] stringArray = new String[var1[1]];
            stringArray[f.var1[2]] = var2[var1[2]];
            if (f.var5(nPC.hasAction(stringArray) ? 1 : 0)) {
                n = var1[1];
                0;
                if ((0x39 ^ 0x6F ^ (0xDC ^ 0x8E)) != 0) return n != 0;
                return ((0x66 ^ 0x22 ^ (0x5E ^ 0xD)) & (104 + 110 - 120 + 37 ^ 48 + 6 - -2 + 92 ^ -1)) != 0;
            }
        }
        n = var1[2];
        return n != 0;
    }

    private static boolean var29(Object object) {
        return object != null;
    }

    private static void var26() {
        var1 = new int[6];
        f.var1[0] = 84 + 149 - 126 + 81 ^ 27 + 145 - 95 + 102;
        f.var1[1] = 1;
        f.var1[2] = (0 + 131 - 61 + 89 ^ 97 + 147 - 55 + 5) & (0x76 ^ 0x12 ^ (0xB9 ^ 0x80) ^ -1);
        f.var1[3] = -(0xE1 ^ 0xA0) & (0xFFFFED79 & 0x3BEE);
        f.var1[4] = -1;
        f.var1[5] = 2;
    }

    private static boolean var28(int n, int n2) {
        return n <= n2;
    }

    private int b(int var30, int var31, int var32) {
        int n;
        LocalCollisionMap var33;
        List var34;
        CollisionMap collisionMap;
        if (f.var5(Static.getGlobalCollisionMap() instanceof GlobalCollisionMap)) {
            collisionMap = Static.getGlobalCollisionMap();
            0;
            if ((150 + 11 - 56 + 59 ^ 77 + 2 - -40 + 41) < -1) {
                return (0xED ^ 0x80 ^ (0x87 ^ 0xA1)) & (169 + 16 - 120 + 178 ^ 176 + 136 - 164 + 36 ^ -1);
            }
        } else {
            collisionMap = null;
        }
        if (f.var29(var34 = new Pathfinder((CollisionMap)(var33 = new LocalCollisionMap((GlobalCollisionMap)collisionMap, var1[2])), Walker.buildTransportLinks(), List.of(Players.getLocal().getWorldLocation()), a.a(new RegionPoint(var30, var31, var32, var1[3])), RegionManager.avoidWilderness()).find())) {
            n = var34.size();
            0;
            if (1 >= (0x96 ^ 0x92)) {
                return (0xA ^ 0x3E) & ~(0x40 ^ 0x74);
            }
        } else {
            n = var1[4];
        }
        return n;
    }
}

