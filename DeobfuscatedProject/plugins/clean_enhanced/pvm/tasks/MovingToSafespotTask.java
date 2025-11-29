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
import gg.squire.pvm.tasks.PvmManager;
import gg.squire.pvm.tasks.PvmManager;
import gg.squire.pvm.tasks.GameEnum;

@TaskDesc(name="Moving to safespot", priority=70, blocking=true)
public class MovingToSafespotTask
extends Task {
    private final  SquireShamanConfig af;
    
     NPC ah;
    private final  c ae;
    
    private final  a ag;
    private static final  Logger ad;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[0];
        while (q.var3(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void var14() {
        var2 = new int[3];
        q.var2[0] = (0x49 ^ 0x3D ^ (0x1C ^ 0x23)) & (0x39 ^ 0x1D ^ (0xC2 ^ 0xAD) ^ -1);
        q.var2[1] = 0xFFFFFBF3 & 0x1FFC;
        q.var2[2] = 1;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        q var15;
        if (q.var16(this.ae.s() ? 1 : 0)) {
            return var2[0];
        }
        if (q.var17(Players.getLocal().isMoving() ? 1 : 0)) {
            return var2[0];
        }
        if (q.var17(var15.ag.m() ? 1 : 0)) {
            return var2[0];
        }
        NPC var18 = var15.ae.o();
        if (q.var19(var18)) {
            var15.ah = var18;
        }
        if (q.var20(var15.ah)) {
            return var2[0];
        }
        if (q.var21(var15.ah.getAnimation(), var2[1])) {
            return var2[0];
        }
        g var22 = var15.af.room();
        Stream stream = var22.z().stream();
        c c2 = var15.ae;
        Objects.requireNonNull(c2);
        0;
        WorldPoint var23 = stream.filter(c2::a).filter(worldPoint -> {
            boolean bl;
            if (q.var16(this.ae.p().contains(worldPoint) ? 1 : 0)) {
                bl = var2[2];
                0;
                if (3 <= -1) {
                    return ((0xC2 ^ 0xC4) & ~(0xBB ^ 0xBD)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }).filter(worldPoint -> {
            String[] stringArray = new String[var2[2]];
            stringArray[q.var2[0]] = var1[var2[0]];
            return NPCs.getAll((String[])stringArray).stream().filter(nPC -> var22.x().contains((Locatable)nPC)).noneMatch(nPC -> nPC.getWorldArea().contains(worldPoint));
        }).max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
        if (!q.var19(var23) || q.var17(Players.getLocal().getWorldLocation().equals((Object)var23) ? 1 : 0)) {
            return var2[0];
        }
        this.ah = null;
        Movement.walk((WorldPoint)var3_3);
        return var2[2];
    }

    private static boolean var21(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    private static void var24() {
        var1 = new String[var2[2]];
        q.var1[q.var2[0]] = "Lizardman shaman";
    }

    static {
        q.var14();
        q.var24();
        ad = LoggerFactory.getLogger(MovingToSafespotTask.class);
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static boolean var19(Object object) {
        return object != null;
    }

    @Inject
    public MovingToSafespotTask(c c2, SquireShamanConfig squireShamanConfig, a a2) {
        this.ae = c2;
        this.af = squireShamanConfig;
        this.ag = a2;
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }
}

