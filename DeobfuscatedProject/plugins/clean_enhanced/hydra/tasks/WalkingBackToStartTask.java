/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.movement.Movement;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.GameEnum;

@TaskDesc(name="Walking back to start")
public class WalkingBackToStartTask
extends Task {

    private final  c bd;
    private final  a bc;

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var4(int n2) {
        return n2 > 0;
    }

    static {
        B.var5();
        B.var6();
    }

    private static void var6() {
        var1 = new String[var2[1]];
        B.var1[B.var2[0]] = "Alchemical Hydra";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        B var7;
        if (B.var8(this.bc.g() ? 1 : 0)) {
            return var2[0];
        }
        if (B.var3(var7.bc.k())) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[B.var2[0]] = var1[var2[0]];
        NPC var9 = NPCs.getNearest((String[])stringArray);
        if (B.var3(var9)) {
            return var2[0];
        }
        if (B.var10(var7.bc.e(), var2[2]) && B.var4(TileItems.getAll().size())) {
            return var2[0];
        }
        WorldPoint var11 = k.POISON.Z().toWorld();
        if (B.var12(var11.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return var2[0];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return var2[1];
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static void var5() {
        var2 = new int[3];
        B.var2[0] = (150 + 131 - 262 + 230 ^ 72 + 117 - 86 + 70) & (0x14 ^ 0x19 ^ (0xD4 ^ 0x8D) ^ -1);
        B.var2[1] = 1;
        B.var2[2] = 0x85 ^ 0xAB ^ (0x7D ^ 0x59);
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public WalkingBackToStartTask(a a2, c c2) {
        this.bc = a2;
        this.bd = c2;
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 > n3;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var2[0];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var2[0];
        while (B.var13(var22, var21)) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }
}

