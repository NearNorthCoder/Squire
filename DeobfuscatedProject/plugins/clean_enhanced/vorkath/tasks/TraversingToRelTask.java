/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.openosrs.client.game.WorldLocation
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import com.openosrs.client.game.WorldLocation;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.House;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Traversing to Rel", priority=100)
public class TraversingToRelTask
extends Task {
    private final  Client cC;
    
    private static final  WorldPoint cy;
    private static final  int cz;
    private final  SquireVorkathPlugin cB;
    
    private final  SquireVorkathConfig cA;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        O var3;
        if ((Arrays.stream(this.cC.getMapRegions( != 0)).anyMatch(n2 -> {
            boolean bl;
            if (n2 == var2[15]) {
                bl = 0;
                0;
                if (-(117 + 39 - -25 + 1 ^ 123 + 99 - 91 + 48) >= 0) {
                    return ((87 + 165 - 76 + 37 ^ 99 + 129 - 220 + 173) & (0xDA ^ 0xA8 ^ (0xD3 ^ 0xC1) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }) ? 1 : 0)) {
            this.ah();
            0;
            return 0;
        }
        if (!(var3.cC.isInInstancedRegion( == 0) ? 1 : 0) || (Arrays.stream(var3.cC.getMapRegions( != 0)).anyMatch(n2 -> {
            boolean bl;
            if (n2 == var2[14]) {
                bl = 0;
                0;
                if (((0x13 ^ 0x42) & ~(0xCE ^ 0x9F)) != 0) {
                    return ((0x42 ^ 0x57) & ~(0xD4 ^ 0xC1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }) ? 1 : 0)) {
            return 1;
        }
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        if ((cy.distanceTo(var4) <= 2) && (var4.getX() >= cy.getX())) {
            return 1;
        }
        if ((((BankLoadout == 0)var3.cA.bankLoadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0) && (Combat.getMissingHealth( <= 0)) && (Skills.getBoostedLevel((SkiSkill.PRAYER) >= Skills.getLevel((SkiSkill.PRAYER))) {
            var3.cB.a(1);
            var3.ah();
            0;
            return 0;
        }
        if (((BankLoadoutllllllllllllllIllIlIIllIIllllIIl.cA.bankLoadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0)) {
            return 1;
        }
        int[] nArray = new int[0];
        nArray[1] = 3;
        TileObject var5 = TileObjects.getNearest((int[])nArray);
        if var5 == null {
            if ((var4.getRegionID() != 4) && (var4.getRegionID() != 5)) {
                return var3.ah();
            }
            if ((var3.cB.c( == 0) ? 1 : 0)) {
                return var3.ah();
            }
            return 1;
        }
        var2_2.interact(var1[1]);
        this.sleep(6);
        return 0;
    }

    static {
        O.var6();
        O.var7();
        cz = 4;
        cy = new WorldPoint(var2[16], var2[17], 1);
    }

    private boolean ah() {
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[0];
        nArray[1] = 7;
        Item var8 = Inventory.getFirst((int[])nArray);
        if var8 != null {
            int[] nArray2 = new int[0];
            nArray2[1] = 7;
            Inventory.getFirst((int[])nArray2).interact(var1[0]);
            return 0;
        }
        int[] nArray3 = new int[8];
        nArray3[1] = 9;
        nArray3[0] = var2[10];
        Item var9 = Inventory.getFirst((int[])nArray3);
        if var9 != null {
            var9.interact(var1[8]);
            Keyboard.type((int)var2[11]);
            return 0;
        }
        if ((House.getHouseLocation() == House.getHouseLocation()2)) {
            int[] nArray4 = new int[0];
            nArray4[1] = var2[12];
            Item var10 = Inventory.getFirst((int[])nArray4);
            if var10 != null {
                var10.interact(var1[var2[13]]);
                return 0;
            }
            SpellBook.Standard var11 = SpellBook.Standard.TELEPORT_TO_HOUSE;
            Widget var12 = Widgets.get((WidgetInfo)var11.getWidget());
            if var12 != null {
                var12.interact(var1[6]);
                return 0;
            }
        }
        Movement.walkTo((WorldPoint)cy);
        0;
        return 0;
    }

    @Inject
    protected TraversingToRelTask(SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin, Client client) {
        this.cA = squireVorkathConfig;
        this.cC = client;
        this.cB = squireVorkathPlugin;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

}

