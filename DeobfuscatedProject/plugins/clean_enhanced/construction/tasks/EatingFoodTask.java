/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.dagannothkings.DagannothKingConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=5)
public class EatingFoodTask
extends Task {
    private static  int[] llIIIlIl;
    private final  DagannothKingConfig cJ;
    private static  String[] llIIIIIl;

    private static void var1() {
        llIIIlIl = new int[8];
        ah.llIIIlIl[0] = 1;
        ah.llIIIlIl[1] = (0xA9 ^ 0x93) & ~(0x60 ^ 0x5A);
        ah.llIIIlIl[2] = -(0x84 ^ 0xC3) & (0xFFFFFFEF & 0x225F);
        ah.llIIIlIl[3] = -(0xFFFFFAD7 & 0x4D3A) & (0xFFFFEF3F & 0x5FF7);
        ah.llIIIlIl[4] = 0xFFFFE7EF & 0x3EB1;
        ah.llIIIlIl[5] = 45 + 107 - 37 + 18 ^ 91 + 82 - 97 + 81;
        ah.llIIIlIl[6] = 3 ^ (0x1A ^ 0xE);
        ah.llIIIlIl[7] = 2;
    }

    private static void var2() {
        llIIIIIl = new String[llIIIlIl[7]];
        ah.llIIIIIl[ah.llIIIlIl[1]] = "Eat";
        ah.llIIIIIl[ah.llIIIlIl[0]] = "Eat";
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = llIIIlIl[1];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = llIIIlIl[1];
        while (ah.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    static {
        ah.var1();
        ah.var2();
    }

    @Inject
    private EatingFoodTask(DagannothKingConfig dagannothKingConfig) {
        this.cJ = dagannothKingConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        ah var22;
        void var23;
        int[] nArray = new int[llIIIlIl[0]];
        nArray[ah.llIIIlIl[1]] = llIIIlIl[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(llIIIlIl[3], llIIIlIl[4], llIIIlIl[5], llIIIlIl[6], llIIIlIl[1]);
        if (ah.var21(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIIlIl[1];
        }
        if (ah.var20(var23)) {
            return llIIIlIl[1];
        }
        if (ah.var18(Combat.getMissingHealth(), var22.cJ.eatMissingHealth())) {
            return llIIIlIl[1];
        }
        Item var24 = Inventory.getFirst(item -> item.hasAction(llIIIIIl[llIIIlIl[0]]::equals));
        if (ah.var20(var24)) {
            return llIIIlIl[1];
        }
        var3_3.interact(llIIIIIl[llIIIlIl[1]]);
        return llIIIlIl[0];
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }
}

