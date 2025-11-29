/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.stream.IntStream;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Walking to vardorvis [DEATH]", priority=0x7FFFFFFF, blocking=true)
public class WalkingToVardorvisDeathTask
extends VardorvisTaskBase {
    private static  WorldPoint ai;
    private static final  int az;
    
    private final  int aA = 4661;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean l() {
        H var15;
        if (H.var16(this.X() ? 1 : 0)) {
            return var2[1];
        }
        Player var17 = Players.getLocal();
        if (H.var18(av.contains((Locatable)var17) ? 1 : 0)) {
            return var2[1];
        }
        if (H.var18(var15.S() ? 1 : 0)) {
            if (H.var18(Dialog.isOpen() ? 1 : 0) && H.var18(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)var2[2]);
                0;
            }
            String[] stringArray = new String[var2[3]];
            stringArray[H.var2[1]] = var1[var2[1]];
            Item var19 = Inventory.getFirst((String[])stringArray);
            var19.interact(var1[var2[3]]);
            return var2[3];
        }
        Movement.walkTo((WorldPoint)ai);
        0;
        return var2[3];
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    private static boolean var20(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean S() {
        int n3;
        Client client = Static.getClient();
        int[] nArray = client.getMapRegions();
        if (H.var18(IntStream.of(nArray).noneMatch(n2 -> {
            boolean bl;
            if (H.var20(n2, var2[0])) {
                bl = var2[3];
                0;
                if (((0x44 ^ 0x49 ^ (0xD4 ^ 0x84)) & (99 + 162 - 160 + 132 ^ 64 + 165 - 65 + 16 ^ -1)) >= 3) {
                    return ((0x32 ^ 0x4E ^ (0xB0 ^ 0x87)) & (0x64 ^ 0x2E ^ 1 ^ -1)) != 0;
                }
            } else {
                bl = var2[1];
            }
            return bl;
        }) ? 1 : 0) && H.var20(client.getVarbitValue(var2[4]), var2[3])) {
            String[] stringArray = new String[var2[3]];
            stringArray[H.var2[1]] = var1[var2[5]];
            if (H.var18(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n3 = var2[3];
                0;
                if (3 <= (0x4B ^ 0x4F)) return n3 != 0;
                return ((0x84 ^ 0xB4) & ~(0xB1 ^ 0x81)) != 0;
            }
        }
        n3 = var2[1];
        return n3 != 0;
    }

    public WalkingToVardorvisDeathTask() {
        this.aA = var2[0];
    }

    private static void var21() {
        var2 = new int[10];
        H.var2[0] = -(0xFFFFD7DF & 0x6DE9) & (0xFFFFF7FD & 0x5FFF);
        H.var2[1] = (118 + 92 - 143 + 61 ^ 34 + 47 - 55 + 115) & (42 + 71 - -65 + 1 ^ 45 + 178 - 206 + 173 ^ -1);
        H.var2[2] = 1 ^ 4;
        H.var2[3] = 1;
        H.var2[4] = -(0xFFFFCBBE & 0x745B) & (0xFFFFFBBF & 0x7F7D);
        H.var2[5] = 2;
        H.var2[6] = 0xFFFFF6FF & 0xD5D;
        H.var2[7] = -(0xFFFFFBDE & 0x762D) & (0xFFFFFF7F & 0x7FEF);
        H.var2[8] = 3;
        H.var2[9] = 149 + 101 - 149 + 53 ^ 38 + 103 - 21 + 26;
    }

    private static void var22() {
        var1 = new String[var2[8]];
        H.var1[H.var2[1]] = "Ring of shadows";
        H.var1[H.var2[3]] = "Teleport";
        H.var1[H.var2[5]] = "Ring of shadows";
    }

    static {
        H.var21();
        H.var22();
        az = var2[4];
        ai = new WorldPoint(var2[6], var2[7], var2[1]);
    }
}

