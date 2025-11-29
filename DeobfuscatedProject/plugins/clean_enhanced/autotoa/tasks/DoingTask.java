/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum9;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Doing task", priority=50, blocking=true, register=true)
public class DoingTask
extends AutotoaManager {
    private  aW eu;
    
    private static final  int et;
    private static final  int er;
    private static final  int es;

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.meleeGearAkkha();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected DoingTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var10(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private void bJ() {
        void var11;
        int[] nArray = new int[var2[1]];
        nArray[aU.var2[0]] = var2[3];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (aU.var12(tileObject)) {
            return;
        }
        WorldPoint var13 = Players.getLocal().getWorldLocation();
        if (aU.var10(var11.distanceTo(var13), var2[4])) {
            aU var14;
            Movement.setDestination((WorldPoint)var14.c(var13, var11.getWorldLocation()));
            return;
        }
        tileObject.interact(var1[var2[4]]);
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!aU.var22(string.contains(var1[var2[0]]) ? 1 : 0) || !aU.var22(string.contains(var1[var2[1]]) ? 1 : 0) || aU.var23(string.contains(var1[var2[2]]) ? 1 : 0)) {
            var24.eu = null;
        }
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    @Subscribe
    public void c(GraphicsObjectCreated graphicsObjectCreated) {
        if (aU.var9(graphicsObjectCreated.getGraphicsObject().getId(), var2[8])) {
            LocalPoint localPoint = graphicsObjectCreated.getGraphicsObject().getLocation();
            WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.cu, (LocalPoint)localPoint);
            int[] nArray = new int[var2[1]];
            nArray[aU.var2[0]] = var2[3];
            TileObject tileObject = TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray);
            int[] nArray2 = new int[var2[1]];
            nArray2[aU.var2[0]] = var2[5];
            TileObject tileObject2 = TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray2);
            if (aU.var15(tileObject.distanceTo(worldPoint), tileObject2.distanceTo(worldPoint))) {
                this.eu = aW.PILLARS;
                0;
                if (((0x57 ^ 0x34) & ~(0xCD ^ 0xAE)) >= (0x78 ^ 0x7C)) {
                    return;
                }
            } else {
                var25.eu = aW.VENTS;
            }
        }
    }

    @Override
    public boolean bC() {
        aU var26;
        if (aU.var12((Object)this.eu)) {
            return var2[0];
        }
        switch (aV.ev[var26.eu.ordinal()]) {
            case 1: {
                var26.bJ();
                0;
                if (((0xFF ^ 0xC7 ^ (0xE3 ^ 0x88)) & (27 + 49 - -18 + 141 ^ 27 + 140 - 30 + 47 ^ -1)) == 0) break;
                return ((30 + 26 - 7 + 99 ^ 75 + 30 - 65 + 104) & (80 + 44 - 0 + 29 ^ 129 + 114 - 181 + 95 ^ -1)) != 0;
            }
            case 2: {
                var26.bK();
            }
        }
        return var2[1];
    }

    private static void var27() {
        var2 = new int[11];
        aU.var2[0] = (0x9F ^ 0xA7) & ~(0xB3 ^ 0x8B);
        aU.var2[1] = 1;
        aU.var2[2] = 2;
        aU.var2[3] = 0xFFFFFBF6 & 0xB5BF;
        aU.var2[4] = 3;
        aU.var2[5] = -(0xFFFFEF7F & 0x12C5) & (0xFFFFFFFF & 0xB3FF);
        aU.var2[6] = -(0xFFFFF453 & 0xFFD) & (0xFFFFFFF7 & 0x6EF9);
        aU.var2[7] = 125 + 123 - 110 + 43 ^ 110 + 4 - -14 + 49;
        aU.var2[8] = 0xFFFFAAFE & 0x5D57;
        aU.var2[9] = 8 ^ 0x74 ^ (0x20 ^ 0x59);
        aU.var2[10] = 0x95 ^ 0x9D;
    }

    /*
     * WARNING - void declaration
     */
    private void bK() {
        void var2_3;
        void var28;
        int[] nArray = new int[var2[1]];
        nArray[aU.var2[0]] = var2[5];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (aU.var12(tileObject)) {
            return;
        }
        if (aU.var22(Players.getLocal().getWorldLocation().equals((Object)var28.getWorldLocation()) ? 1 : 0)) {
            aU var29;
            WorldPoint var30 = Players.getLocal().getWorldLocation();
            Movement.setDestination((WorldPoint)var29.c(var30, var28.getWorldLocation()));
            return;
        }
        int[] nArray2 = new int[var2[1]];
        nArray2[aU.var2[0]] = var2[6];
        Item var30 = Inventory.getFirst((int[])nArray2);
        if (aU.var12(var30)) {
            return;
        }
        var2_3.interact(var1[var2[7]]);
    }

    static {
        aU.var27();
        aU.var31();
        et = var2[5];
        es = var2[3];
        er = var2[8];
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    private static String var32(String var33, String var34) {
        var33 = new String(Base64.getDecoder().decode(var33.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var35 = new StringBuilder();
        char[] var36 = var34.toCharArray();
        int var37 = var2[0];
        char[] var38 = var33.toCharArray();
        int var39 = var38.length;
        int var40 = var2[0];
        while (aU.var15(var40, var39)) {
            char var41 = var38[var40];
            var35.append((char)(var41 ^ var36[var37 % var36.length]));
            0;
            ++var37;
            ++var40;
            0;
            
            return null;
        }
        return String.valueOf(var35);
    }

    private static void var31() {
        var1 = new String[var2[9]];
        aU.var1[aU.var2[0]] = "repair the damaged";
        aU.var1[aU.var2[1]] = "neutralise the fumes";
        aU.var1[aU.var2[2]] = "You have died";
        aU.var1[aU.var2[4]] = "Repair";
        aU.var1[aU.var2[7]] = "Pour";
    }

    @Override
    public void r() {
        this.eu = null;
    }

    private static boolean var22(int n2) {
        return n2 == 0;
    }
}

