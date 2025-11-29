/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Queue;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum3;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Solving memory puzzle", priority=200, blocking=true)
public class SolvingMemoryPuzzleTask
extends AutotoaManager {

    private final  m dm;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        aw var3;
        NPC nPC2 = this.J();
        if (aw.var4(nPC2)) {
            return var2[0];
        }
        Queue<n> var5 = var3.dm.G();
        if (aw.var6(var5.isEmpty() ? 1 : 0)) {
            return var2[0];
        }
        n var7 = var5.peek();
        WorldPoint var8 = var7.a(var3.cu);
        if (aw.var9(var8)) {
            return var2[0];
        }
        WorldPoint var10 = Players.getLocal().getWorldLocation();
        if (aw.var11(var8.distanceTo(var10), var2[1]) && aw.var6(NPCs.getAll(nPC -> {
            int n2;
            if (aw.var4(nPC.getName()) && aw.var6(nPC.getName().toLowerCase().contains(var1[var2[1]]) ? 1 : 0) && aw.var6(nPC.getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (3 <= 2) {
                    return ((0x74 ^ 0x42 ^ (0x75 ^ 0x1D)) & (106 + 183 - 91 + 11 ^ 9 + 54 - -55 + 25 ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }).isEmpty() ? 1 : 0)) {
            return var2[1];
        }
        if (aw.var12(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        try {
            var3.g(var8);
            return var2[1];
        }
        catch (NullPointerException nullPointerException) {
            void var4_4;
            Log.info((String)var1[var2[0]]);
            nullPointerException.printStackTrace();
            Movement.setDestination((WorldPoint)var4_4);
            return var2[1];
        }
    }

    @Inject
    protected SolvingMemoryPuzzleTask(Client client, z z2, TOAConfig tOAConfig, m m2) {
        super(client, z2, tOAConfig);
        this.dm = m2;
    }

    private static boolean var11(int n2, int n3) {
        return n2 <= n3;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[0];
        while (aw.var22(var21, var20)) {
            char var23 = var19[var21];
            var16.append((char)(var23 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    @Override
    public void r() {
        this.dm.G().clear();
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static void var24() {
        var2 = new int[3];
        aw.var2[0] = (0x15 ^ 0x1C) & ~(0x1D ^ 0x14);
        aw.var2[1] = 1;
        aw.var2[2] = 2;
    }

    private static void var25() {
        var1 = new String[var2[2]];
        aw.var1[aw.var2[0]] = "Encountered NPE walking to quadrant order puzzle solution";
        aw.var1[aw.var2[1]] = "orb";
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    static {
        aw.var24();
        aw.var25();
    }

    private static boolean var9(Object object) {
        return object == null;
    }
}

