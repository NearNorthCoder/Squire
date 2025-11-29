/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

@TaskDesc(name="Pathing to Boss", priority=2147483547, blocking=true)
public class PathingToBossTask
extends DukeTaskBase {
    private  WorldArea av;
    private final  a ar;
    private  WorldArea at;
    private  WorldArea aw;
    private  WorldArea au;
    private  WorldArea ay;
    private final  SquireDukeSucellus aq;
    private  WorldPoint aA;
    private  WorldArea ax;
    private final  SquireDukeSucellusConfig as;
    private  WorldPoint az;
    
    private  WorldPoint aB;
    private static final  int ap;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 2;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 2;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            
            return null;
        }
        return String.valueOf(var12);
    }

    @Override
    public boolean R() {
        p var19;
        if ((Static.getClient( != 0).isInInstancedRegion() ? 1 : 0) && (House.isInside( == 0) ? 1 : 0)) {
            return 2;
        }
        if ((var19.aq.m( != 0) ? 1 : 0)) {
            var19.aq.forceStop();
            return var1[29];
        }
        var19.ar.t();
        Player var20 = Players.getLocal();
        if var20 == null {
            return 2;
        }
        if ((var19.av.contains(LocatablelllllllllllllllIllIIIIIllIIllIII) ? 1 : 0)) {
            var19.a(var2[2], var2[var1[29]], var1[30], var20);
            return var1[29];
        }
        if ((var19.au.contains(LocatablelllllllllllllllIllIIIIIllIIllIII) ? 1 : 0)) {
            var19.a(var2[var1[31]], var2[var1[32]], var1[33], var20);
            return var1[29];
        }
        int[] nArray = new int[var1[29]];
        nArray[2] = var1[34];
        TileObject var21 = TileObjects.getFirstAt((WorldPoint)var19.aA, (int[])nArray);
        if var21 != null {
            var21.interact(var2[var1[35]]);
            return var1[29];
        }
        if ((var19.ay.contains(LocatablelllllllllllllllIllIIIIIllIIllIII) ? 1 : 0)) {
            if ((Dialog.getName( != 0).contains(var2[var1[36]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[29]];
                stringArray[2] = var2[var1[37]];
                Dialog.chooseOption((String[])stringArray);
                0;
                return var1[29];
            }
            var19.a(var2[var1[38]], var2[var1[39]], var1[40], var20);
            return var1[29];
        }
        if ((var19.ax.contains((Locatable == 0)var20) ? 1 : 0) && (var19.ay.contains((Locatable == 0)var20) ? 1 : 0)) {
            String[] stringArray = new String[var1[29]];
            stringArray[2] = var2[var1[41]];
            if ((Inventory.contains((String[] != 0)stringArray) ? 1 : 0) && (Vars.getBit((int)var1[42]) == var1[29])) {
                if ((Dialog.isOpen( != 0) ? 1 : 0) && (Dialog.isViewingOptions( != 0) ? 1 : 0)) {
                    Dialog.chooseOption((int)var1[31]);
                    0;
                }
                String[] stringArray2 = new String[var1[29]];
                stringArray2[2] = var2[var1[43]];
                Item var22 = Inventory.getFirst((String[])stringArray2);
                var22.interact(var2[var1[44]]);
                return var1[29];
            }
        }
        Movement.walkTo((WorldPoint)this.aB);
        0;
        return var1[29];
    }

    @Override
    public boolean run() {
        if ((this.aq.PathingToBossTask( != 0) ? 1 : 0)) {
            return 2;
        }
        return this.R();
    }

    static {
        p.var23();
        p.var24();
        ap = var1[42];
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    @Inject
    public PathingToBossTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.at = new WorldArea(new WorldPoint(0, 1, 2), new WorldPoint(3, 4, 2));
        this.au = new WorldArea(new WorldPoint(5, 6, 2), new WorldPoint(7, 8, 2));
        this.av = new WorldArea(new WorldPoint(7, 9, 2), new WorldPoint(var1[10], var1[11], 2));
        this.aw = new WorldArea(new WorldPoint(var1[12], var1[13], 2), new WorldPoint(var1[14], var1[15], 2));
        this.ax = new WorldArea(new WorldPoint(var1[16], var1[17], 2), new WorldPoint(var1[18], var1[19], 2));
        this.ay = new WorldArea(new WorldPoint(var1[20], var1[21], 2), new WorldPoint(var1[22], var1[23], 2));
        this.az = new WorldPoint(var1[24], var1[25], 2);
        this.aA = new WorldPoint(var1[24], var1[26], 2);
        this.aB = new WorldPoint(var1[27], var1[28], 2);
        this.aq = squireDukeSucellus;
        this.ar = squireDukeSucellus.s();
        this.as = squireDukeSucellusConfig;
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, String string2, int n2, Player player) {
        void var31;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if ((tileObject.getId() == n2) && (tileObject.getName( != 0).equals(string) ? 1 : 0)) {
                String[] stringArray = new String[var1[29]];
                stringArray[2] = string2;
                if ((tileObject.hasActionstringArray)) {
                    n3 = var1[29];
                    0;
                    if null == null return n3 != 0;
                    return ((0x5A ^ 0x54) & ~(0x9B ^ 0x95) & ~((0x74 ^ 0x54) & ~(0x41 ^ 0x61))) != 0;
                }
            }
            n3 = 2;
            return n3 != 0;
        });
        if tileObject2 == null {
            return;
        }
        if ((var31.isMoving( != 0) ? 1 : 0)) {
            return;
        }
        tileObject2.interact(string2);
    }
}

