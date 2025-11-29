/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Entering fight", priority=100, blocking=true)
public class EnteringFightTask
extends VorkathTaskBase {
    private final  Client cG;
    private static final  WorldPoint cF;
    
    public static final  WorldPoint cE;
    public static final  WorldArea cD;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        if (P.var3(this.cG.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        TileObject var4 = TileObjects.getNearest((WorldPoint)cE, tileObject -> {
            String[] stringArray = new String[var2[1]];
            stringArray[P.var2[0]] = var1[var2[1]];
            return tileObject.hasAction(stringArray);
        });
        if (P.var5(var4)) {
            Movement.walkTo((WorldPoint)cF);
            0;
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[1];
    }

    static {
        P.var6();
        P.var7();
        cD = new WorldPoint(var2[2], var2[3], var2[0]).toWorldArea();
        cE = new WorldPoint(var2[4], var2[5], var2[0]);
        cF = new WorldPoint(var2[6], var2[7], var2[0]);
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var2[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var2[0];
        while (P.var8(var17, var16)) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if ((0x61 ^ 0x25 ^ (0xEB ^ 0xAB)) == (0x68 ^ 0x19 ^ (0xFE ^ 0x8B))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static void var6() {
        var2 = new int[9];
        P.var2[0] = (0x36 ^ 0x29) & ~(0x98 ^ 0x87);
        P.var2[1] = 1;
        P.var2[2] = -(0xFFFFF7DF & 0x7A3B) & (0xFFFFFBFF & 0x7EFF);
        P.var2[3] = -(0xFFFFBAE3 & 0x751D) & (0xFFFFFFDA & 0x3FE7);
        P.var2[4] = 0xFFFFA9FD & 0x5EDF;
        P.var2[5] = -(0xFFFFC34F & 0x7CB1) & (0xFFFFDFFB & 0x6FDF);
        P.var2[6] = -(0xFFFFB517 & 0x7FF9) & (0xFFFFFFF6 & 0x3DF9);
        P.var2[7] = -(0xFFFFFF3B & 0x50E5) & (0xFFFFFFF5 & 0x5FFB);
        P.var2[8] = 2;
    }

    @Inject
    protected EnteringFightTask(Client client, SquireVorkathConfig squireVorkathConfig) {
        super(client, squireVorkathConfig);
        this.cG = client;
    }

    private static void var7() {
        var1 = new String[var2[8]];
        P.var1[P.var2[0]] = "Climb-over";
        P.var1[P.var2[1]] = "Climb-over";
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }
}

