/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.CollisionMap
 *  net.unethicalite.api.movement.pathfinder.GlobalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.LocalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.TilePath
 *  net.unethicalite.client.Static
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.TilePath;
import net.unethicalite.client.Static;

@TaskDesc(name="Walking to chest", priority=50, blocking=true)
public class WalkingToChestTask
extends Task {
    
    private static final  List<WorldPoint> ap;
    private final  SquireBarrows ar;
    
    private static final  WorldPoint aq;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (z.var3(var13, var12)) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void var15() {
        var2 = new String[var1[10]];
        z.var2[z.var1[0]] = "Chest";
        z.var2[z.var1[2]] = "Sarcophagus";
        z.var2[z.var1[3]] = "Open";
        z.var2[z.var1[4]] = "Open";
    }

    @Inject
    public WalkingToChestTask(SquireBarrows squireBarrows) {
        this.ar = squireBarrows;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        void var1_1;
        void var3_3;
        CollisionMap var16;
        z var17;
        if (z.var18(this.ar.u() ? 1 : 0)) {
            return var1[0];
        }
        if (z.var19(var17.ar.h() ? 1 : 0)) {
            return var1[0];
        }
        String[] stringArray = new String[var1[2]];
        stringArray[z.var1[0]] = var2[var1[0]];
        TileObject var20 = TileObjects.getFirstSurrounding((WorldPoint)aq, (int)var1[1], (String[])stringArray);
        if (z.var4(var20)) {
            return var1[0];
        }
        String[] stringArray2 = new String[var1[2]];
        stringArray2[z.var1[0]] = var2[var1[2]];
        TileObject var21 = TileObjects.getNearest((String[])stringArray2);
        if (z.var22(var21) && z.var18(Reachable.isInteractable((Locatable)var21) ? 1 : 0)) {
            return var1[0];
        }
        Player var23 = Players.getLocal();
        if (z.var22(var23.getInteracting()) && z.var18(var17.ar.f() ? 1 : 0) && z.var19(var17.ar.g() ? 1 : 0)) {
            return var1[0];
        }
        if (z.var18(Reachable.isInteractable((Locatable)var20) ? 1 : 0)) {
            return var1[0];
        }
        if (z.var18(ap.contains(var23.getWorldLocation()) ? 1 : 0) && z.var22(var16 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[var1[2]];
            stringArray[z.var1[0]] = var2[var1[4]];
            if (z.var18(tileObject.hasAction(stringArray) ? 1 : 0) && z.var18(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = var1[2];
                0;
                if (-3 >= 0) {
                    return ((51 + 137 - -12 + 25 ^ 177 + 83 - 204 + 133) & (53 + 165 - 58 + 32 ^ 38 + 54 - 81 + 145 ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        }))) {
            var16.interact(var2[var1[3]]);
            var17.sleep(var1[1]);
            return var1[2];
        }
        var16 = Static.getGlobalWithLocalCollisions();
        CollisionMap var24 = Static.getGlobalCollisionMap();
        if (z.var18(var24 instanceof GlobalCollisionMap)) {
            var16 = new LocalCollisionMap((GlobalCollisionMap)var24, var1[0]);
        }
        TilePath tilePath = Walker.calculateTilePath(List.of(var3_3.getWorldLocation()), (WorldArea)var1_1.getWorldLocation().toWorldArea(), (CollisionMap)var4_4);
        Walker.walkAlong((List)tilePath, Collections.emptyMap());
        0;
        return var1[2];
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    static {
        z.var25();
        z.var15();
        ap = List.of(new WorldPoint(var1[5], var1[6], var1[0]), new WorldPoint(var1[7], var1[6], var1[0]));
        aq = new WorldPoint(var1[8], var1[9], var1[0]);
    }

    private static boolean var22(Object object) {
        return object != null;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    private static void var25() {
        var1 = new int[11];
        z.var1[0] = (0x3E ^ 0x32 ^ (0x61 ^ 0x2F)) & (96 + 111 - -24 + 13 ^ 159 + 3 - 76 + 96 ^ -1);
        z.var1[1] = 4 ^ 0x25 ^ (0x2B ^ 0);
        z.var1[2] = 1;
        z.var1[3] = 2;
        z.var1[4] = 3;
        z.var1[5] = -(0xFFFFCB1F & 0x35E7) & (0xFFFF9FEF & 0x6F5E);
        z.var1[6] = -(0xFFFFCF17 & 0x3AEB) & (0xFFFFAFFF & 0x7FEF);
        z.var1[7] = -(0xFFFFF157 & 0x7EAB) & (0xFFFFFDEF & Short.MAX_VALUE);
        z.var1[8] = 0xFFFFEDDF & 0x1FFF;
        z.var1[9] = 0xFFFFA5FF & 0x7FDE;
        z.var1[10] = 7 ^ 3;
    }
}

