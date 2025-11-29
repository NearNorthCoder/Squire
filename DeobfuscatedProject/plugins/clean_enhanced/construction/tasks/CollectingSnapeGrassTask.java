/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.GameEnum2;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Collecting Snape Grass")
public class CollectingSnapeGrassTask
extends Task {
    private static final  WorldPoint gW;
    private static final  WorldPoint gX;
    private static  int[] lIIIIIllI;
    private static  String[] lIIIIIlIl;
    private static final  WorldArea gU;
    private static final  int gS;
    @Inject
    private  SecondariesConfig gK;
    private static final  int gT;
    private static final  WorldArea gV;

    /*
     * WARNING - void declaration
     */
    protected boolean t(int n2) {
        void var1;
        Client client = Static.getClient();
        int[] nArray = client.getMapRegions();
        int n3 = nArray.length;
        int var2 = 0;
        while ((var2 < (int)var1)) {
            void var3;
            void var4;
            void var5 = var4[var2];
            if (((int)var5 == (int)var3)) {
                return 2;
            }
            ++var2;
            0;
            if (((0xFF ^ 0x96 ^ (0xEA ^ 0xA4)) & (0xD1 ^ 0xB6 ^ (0x13 ^ 0x53) ^ -1)) == 0) continue;
            return ((128 + 127 - 117 + 34 ^ 33 + 102 - 94 + 114) & (0xAE ^ 0xA7 ^ (0xB2 ^ 0x8C) ^ -1)) != 0;
        }
        return 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (((Object)this.gK.secondary() != (Object)this.gK.secondary()2)bO.SNAPE_GRASS)) {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((gX.distanceTo((Locatable)Players.getLocal()) > 1)) {
            Movement.walkTo((WorldPoint)gX);
            0;
            return 2;
        }
        TileItem var12 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.getName( != 0).equals(lIIIIIlIl[2]) ? 1 : 0) && (gV.contains(tileItem.getWorldLocation( != 0)) ? 1 : 0)) {
                n2 = 2;
                0;
                if null != null {
                    return ((0xD9 ^ 0x9C) & ~(0xC5 ^ 0x80) & ~((0x7B ^ 0x2F) & ~(0x53 ^ 7))) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var12 == null {
            if ((Players.getLocal( == 0).getWorldLocation().equals((Object)gX) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)gX);
                return 2;
            }
            return 0;
        }
        var1_1.interact(lIIIIIlIl[0]);
        return 2;
    }

    static {
        bS.var13();
        bS.var14();
        gS = 3;
        gT = 4;
        gU = new WorldArea(5, 6, 7, 7, 0);
        gV = new WorldArea(8, 9, 7, 7, 0);
        gW = new WorldPoint(lIIIIIllI[10], lIIIIIllI[11], 0);
        gX = new WorldPoint(lIIIIIllI[12], lIIIIIllI[13], 0);
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (((0x17 ^ 0x36) & ~(0x8D ^ 0xAC)) <= 3) continue;
            return null;
        }
        return String.valueOf(var18);
    }

}

