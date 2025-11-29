/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.Direction
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.quest.tasks.GameEnum;
import gg.squire.quest.tasks.DHelper;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Completing Misthalin Mystery", register=true)
public class CompletingMisthalinMysteryTask
extends Task {
    private  LocalPoint aE;
    
    private final  Client ax;
    
    private final  SquireQuesterConfig aw;
    private  List<TileObject> aF;
    private  d aA;
    private  Direction aD;
    private  d aB;
    private  d ay;
    private  d az;
    private  d aC;

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (s.var3(projectileSpawned.getProjectile().getId(), var1[138])) {
            this.aD = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void aE() {
        void var1_1;
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[52];
        if (s.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[59]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[var1[2]];
        stringArray2[s.var1[0]] = var2[var1[60]];
        if (s.var6(var5.hasAction(stringArray2) ? 1 : 0)) {
            return;
        }
        if (s.var6(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var5.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(var2[var1[61]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aX() {
        void var1_1;
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[109];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[106];
        if (s.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        TileObject var7 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(var2[var1[141]]));
        if (s.var6(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var7.getWorldLocation());
            0;
        }
        var1_1.interact(var2[var1[110]]);
    }

    private void aJ() {
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[76]];
        List var8 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[74], var1[75], var1[0]), (String[])stringArray);
        if (s.var4(var8.isEmpty() ? 1 : 0)) {
            return;
        }
        if (s.var4(Reachable.isInteractable((Locatable)((Locatable)var8.get(var1[0]))) ? 1 : 0)) {
            ((TileObject)var8.get(var1[0])).interact(var2[var1[77]]);
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var1[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var1[0];
        while (s.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private void P() {
        if (s.var4(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        if (s.var6(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        Dialog.continueSpace();
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    private static boolean var21(Object object) {
        return object != null;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private void aS() {
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[96];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[96];
        Inventory.getFirst((int[])nArray2).interact(var2[var1[97]]);
    }

    private void ax() {
        if (s.var20(Widgets.get((int)var1[33], (int)var1[2]))) {
            return;
        }
        WidgetPackets.widgetAction((Widget)Widgets.get((int)var1[33], (int)var1[34]), (String)var2[var1[35]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)var1[33], (int)var1[10]), (String)var2[var1[36]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)var1[33], (int)var1[29]), (String)var2[var1[37]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)var1[33], (int)var1[38]), (String)var2[var1[39]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)var1[33], (int)var1[17]), (String)var2[var1[40]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)var1[33], (int)var1[36]), (String)var2[var1[34]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aT() {
        void var1_1;
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[96];
        if (s.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[98];
        TileObject var28 = TileObjects.getNearest((int[])nArray2);
        if (s.var6(Reachable.isInteractable((Locatable)var28) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var28.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(var2[var1[99]]);
    }

    private void aP() {
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[88];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[89]];
        List var29 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[80], var1[45], var1[0]), (String[])stringArray);
        if (s.var4(Reachable.isInteractable((Locatable)((Locatable)var29.get(var1[0]))) ? 1 : 0)) {
            ((TileObject)var29.get(var1[0])).interact(var2[var1[90]]);
        }
    }

    private static boolean var30(int n2, int n3) {
        return n2 != n3;
    }

    private void ao() {
        Walker.walkTo((WorldPoint)new WorldPoint(var1[3], var1[4], var1[0]));
        0;
    }

    private void aY() {
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[111];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[111];
        Inventory.getFirst((int[])nArray2).useOn(TileObjects.getNearest(tileObject -> tileObject.getName().contains(var2[var1[140]])));
    }

    /*
     * WARNING - void declaration
     */
    private void aG() {
        void var1_1;
        if (s.var21(Widgets.get((int)var1[62], (int)var1[12]))) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[67]];
        TileObject var31 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[var1[2]];
        stringArray2[s.var1[0]] = var2[var1[68]];
        if (s.var4(var31.hasAction(stringArray2) ? 1 : 0)) {
            return;
        }
        if (s.var6(Reachable.isInteractable((Locatable)var31) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var31.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(var2[var1[69]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aO() {
        void var1_1;
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[83];
        if (s.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[86];
        TileObject var32 = TileObjects.getNearest((int[])nArray2);
        if (s.var6(Reachable.isInteractable((Locatable)var32) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var32.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(var2[var1[87]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aI() {
        void var1_1;
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[70];
        if (s.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[72];
        TileObject var33 = TileObjects.getNearest((int[])nArray2);
        if (s.var6(Reachable.isInteractable((Locatable)var33) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var33.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(var2[var1[73]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aD() {
        void var1_1;
        Object var34;
        s var35;
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[52];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (s.var21(var35.az)) {
            String[] stringArray = new String[var1[2]];
            stringArray[s.var1[0]] = var2[var1[54]];
            var34 = TileObjects.getNearest((String[])stringArray);
            if (s.var6(var35.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (s.var36(var34.distanceTo((Locatable)Players.getLocal()), var1[35])) {
                    Movement.walkTo((WorldPoint)new WorldPoint(var1[55], var1[24], var1[0]));
                    0;
                    return;
                }
                return;
            }
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[57];
        var34 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[56], var1[27], var1[0]), (int[])nArray2);
        if (s.var20(var34)) {
            return;
        }
        if (s.var6(Reachable.isInteractable((Locatable)((Locatable)var34.get(var1[0]))) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)((TileObject)var34.get(var1[0])).getWorldLocation());
            0;
            return;
        }
        ((TileObject)var1_1.get(var1[0])).interact(var2[var1[58]]);
        this.sleep(var1[2]);
    }

    private void aH() {
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[70];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[70];
        Inventory.getFirst((int[])nArray2).interact(var2[var1[71]]);
    }

    private void aM() {
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[83];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[84]];
        TileObject var37 = TileObjects.getNearest((String[])stringArray);
        if (s.var4(Reachable.isInteractable((Locatable)var37) ? 1 : 0)) {
            s var38;
            int[] nArray2 = new int[var1[2]];
            nArray2[s.var1[0]] = var1[83];
            Inventory.getFirst((int[])nArray2).useOn(var37);
            var38.sleep(var1[2]);
        }
    }

    public void bc() {
        this.ay = new DHelper(new WorldPoint(var1[15], var1[16], var1[0]), new WorldPoint(var1[123], var1[124], var1[0]));
        this.az = new DHelper(new WorldPoint(var1[56], var1[125], var1[0]), new WorldPoint(var1[126], var1[127], var1[0]));
        this.aA = new DHelper(new WorldPoint(var1[128], var1[129], var1[0]), new WorldPoint(var1[56], var1[127], var1[0]));
        this.aB = new DHelper(new WorldPoint(var1[130], var1[131], var1[0]), new WorldPoint(var1[132], var1[133], var1[0]));
        this.aC = new DHelper(new WorldPoint(var1[134], var1[125], var1[0]), new WorldPoint(var1[135], var1[136], var1[0]));
    }

    /*
     * WARNING - void declaration
     */
    private void aK() {
        void var1_1;
        if (s.var21(this.az) && s.var4(this.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[78]];
        TileObject var39 = TileObjects.getNearest((String[])stringArray);
        if (s.var6(Reachable.isInteractable((Locatable)var39) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var39.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(var2[var1[79]]);
        this.sleep(var1[2]);
    }

    private void aC() {
        s var40;
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[52];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[53]];
        TileObject var41 = TileObjects.getNearest((String[])stringArray);
        if (s.var36(var41.distanceTo((Locatable)Players.getLocal()), var1[36])) {
            return;
        }
        if (s.var21(var40.az) && s.var4(var40.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(var1[3], var1[4], var1[0]));
        0;
    }

    private void aw() {
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[32];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(var1[23], var1[27], var1[0]));
        0;
    }

    @Inject
    public CompletingMisthalinMysteryTask(SquireQuesterConfig squireQuesterConfig, Client client) {
        this.aw = squireQuesterConfig;
        this.ax = client;
    }

    /*
     * WARNING - void declaration
     */
    private void av() {
        LocalPoint var42;
        s var43;
        void var44;
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[17]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (s.var20(nPC)) {
            return;
        }
        System.out.println("DIRECTION: " + var44.getOrientation());
        WorldPoint var45 = WorldPoint.fromLocal((Client)var43.ax, (LocalPoint)var44.getLocalLocation());
        int var46 = var45.getX() % var1[14];
        int var47 = var45.getY() % var1[14];
        int var48 = var1[15];
        int var49 = var1[16];
        WorldPoint var50 = new WorldPoint(var46 + var48, var47 + var49, var1[0]);
        if (s.var4(var43.aD.equals((Object)Direction.EAST) ? 1 : 0)) {
            var42 = new LocalPoint(var1[18], var1[19]);
            if (s.var4(var50.equals((Object)new WorldPoint(var42.getX(), var42.getY(), var1[0])) ? 1 : 0)) {
                if (s.var30(var44.getOrientation(), var1[20])) {
                    var43.a(var1[2], var1[0]);
                }
                System.out.println(var2[var1[21]]);
                return;
            }
            if (s.var36(var50.getY(), var42.getY())) {
                var43.a(var1[0], var1[2]);
                return;
            }
            if (s.var18(var50.getY(), var42.getY())) {
                var43.a(var1[0], var1[22]);
                return;
            }
            if (s.var36(var50.getX(), var42.getX())) {
                var43.a(var1[2], var1[0]);
                return;
            }
            if (s.var18(var50.getX(), var42.getX())) {
                var43.a(var1[22], var1[0]);
                return;
            }
        }
        if (s.var4(var43.aD.equals((Object)Direction.NORTH) ? 1 : 0)) {
            var42 = new LocalPoint(var1[23], var1[24]);
            if (s.var4(var50.equals((Object)new WorldPoint(var42.getX(), var42.getY(), var1[0])) ? 1 : 0)) {
                if (s.var30(var44.getOrientation(), var1[25])) {
                    var43.a(var1[0], var1[22]);
                }
                System.out.println(var2[var1[26]]);
                return;
            }
            if (s.var36(var50.getX(), var42.getX())) {
                var43.a(var1[2], var1[0]);
                return;
            }
            if (s.var18(var50.getX(), var42.getX())) {
                var43.a(var1[22], var1[0]);
                return;
            }
            if (s.var36(var50.getY(), var42.getY())) {
                var43.a(var1[0], var1[2]);
                return;
            }
            if (s.var18(var50.getY(), var42.getY())) {
                var43.a(var1[0], var1[22]);
                return;
            }
        }
        if (s.var4(var43.aD.equals((Object)Direction.SOUTH) ? 1 : 0)) {
            var42 = new LocalPoint(var1[18], var1[27]);
            if (s.var4(var50.equals((Object)new WorldPoint(var42.getX(), var42.getY(), var1[0])) ? 1 : 0)) {
                if (s.var4(var44.getOrientation())) {
                    var43.a(var1[0], var1[2]);
                }
                System.out.println(var2[var1[28]]);
                return;
            }
            if (s.var36(var50.getX(), var42.getX())) {
                var43.a(var1[2], var1[0]);
                return;
            }
            if (s.var18(var50.getX(), var42.getX())) {
                var43.a(var1[22], var1[0]);
                return;
            }
            if (s.var36(var50.getY(), var42.getY())) {
                var43.a(var1[0], var1[2]);
                return;
            }
            if (s.var18(var50.getY(), var42.getY())) {
                var43.a(var1[0], var1[22]);
                return;
            }
        }
        if (s.var4(var43.aD.equals((Object)Direction.WEST) ? 1 : 0)) {
            var42 = new LocalPoint(var1[18], var1[27]);
            if (s.var4(var50.equals((Object)new WorldPoint(var42.getX(), var42.getY(), var1[0])) ? 1 : 0)) {
                if (s.var4(var44.getOrientation())) {
                    var43.a(var1[2], var1[0]);
                }
                System.out.println(var2[var1[29]]);
                return;
            }
            if (s.var36(var50.getX(), var42.getX())) {
                var43.a(var1[2], var1[0]);
                return;
            }
            if (s.var18(var50.getX(), var42.getX())) {
                var43.a(var1[22], var1[0]);
                return;
            }
            if (s.var36(var50.getY(), var42.getY())) {
                var43.a(var1[0], var1[2]);
                return;
            }
            if (s.var18(var50.getY(), var42.getY())) {
                var43.a(var1[0], var1[22]);
                return;
            }
        }
    }

    private void aN() {
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[83];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[85]];
        TileObject var51 = TileObjects.getNearest((String[])stringArray);
        if (s.var4(Reachable.isInteractable((Locatable)var51) ? 1 : 0)) {
            s var52;
            int[] nArray2 = new int[var1[2]];
            nArray2[s.var1[0]] = var1[83];
            Inventory.getFirst((int[])nArray2).useOn(var51);
            var52.sleep(var1[2]);
        }
    }

    private void aA() {
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[49];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[49];
        Inventory.getFirst((int[])nArray2).interact(var2[var1[38]]);
    }

    private void aL() {
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[81]];
        List var53 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[80], var1[45], var1[0]), (String[])stringArray);
        if (s.var20(var53)) {
            return;
        }
        if (s.var4(Reachable.isInteractable((Locatable)((Locatable)var53.get(var1[0]))) ? 1 : 0)) {
            ((TileObject)var53.get(var1[0])).interact(var2[var1[82]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void bb() {
        void var1_1;
        if (s.var30(Players.getLocal().getWorldLocation().getRegionID(), var1[115])) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[14]];
        TileObject var54 = TileObjects.getNearest((String[])stringArray);
        if (s.var20(var54)) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[116], var1[117], var1[0]));
            0;
        }
        var1_1.interact(var2[var1[118]]);
    }

    public boolean run() {
        s var55;
        if (s.var6(this.aw.quest().equals((Object)h.MISTHALIN_MYSTERY) ? 1 : 0)) {
            return var1[0];
        }
        int var56 = var55.Q();
        if (s.var20(var55.az)) {
            var55.bc();
        }
        if (s.var57(var56, var1[1])) {
            return var1[0];
        }
        System.out.println("[MISTHALIN MYSTERY] - Current Progress: " + var56);
        switch (var56) {
            case 0: {
                var55.M();
                0;
                if (1 >= 0) break;
                return ((48 + 206 - 224 + 219 ^ 89 + 4 - 82 + 150) & (87 + 60 - 38 + 135 ^ 107 + 59 - 43 + 49 ^ -1)) != 0;
            }
            case 5: {
                var55.M();
                0;
                if (-1 < ((0 + 37 - -104 + 18 ^ 123 + 170 - 235 + 133) & (81 + 69 - 25 + 28 ^ 130 + 9 - -25 + 21 ^ -1))) break;
                return ((192 + 74 - 182 + 119 ^ 40 + 24 - 33 + 100) & (0x4C ^ 0x2B ^ (0xB1 ^ 0x9E) ^ -1)) != 0;
            }
            case 10: {
                var55.bb();
                var55.ba();
                0;
                if null == null break;
                return ((0x22 ^ 0xE ^ (0xBE ^ 0x9E)) & (67 + 57 - -41 + 12 ^ 179 + 182 - 358 + 186 ^ -1)) != 0;
            }
            case 15: {
                var55.ba();
                var55.aZ();
                var55.P();
                0;
                if (3 != 0) break;
                return ((0x77 ^ 0x51) & ~(0x95 ^ 0xB3)) != 0;
            }
            case 20: {
                var55.P();
                var55.aY();
                var55.aX();
                0;
                if (-1 < (0x53 ^ 0x78 ^ (0x79 ^ 0x56))) break;
                return ((0x1E ^ 0x59 ^ 116 + 95 - 205 + 121) & (0x86 ^ 0xA0 ^ (0xA3 ^ 0xBD) ^ -1)) != 0;
            }
            case 25: {
                var55.P();
                var55.aX();
                var55.aW();
                0;
                if (-3 < 0) break;
                return ((90 + 102 - 77 + 62 ^ 20 + 96 - 2 + 19) & (202 + 153 - 255 + 144 ^ 17 + 82 - 1 + 94 ^ -1)) != 0;
            }
            case 30: {
                var55.aU();
                var55.P();
                0;
                if (-1 <= ((12 + 185 - 147 + 186 ^ 171 + 190 - 356 + 187) & (0x17 ^ 6 ^ (0x3E ^ 3) ^ -1) & ((60 + 63 - 12 + 23 ^ 39 + 78 - 25 + 50) & (0x23 ^ 0x1B ^ (0x87 ^ 0xB7) ^ -1) ^ -1))) break;
                return ((90 + 107 - 185 + 117 ^ 53 + 107 - 144 + 142) & (0xA7 ^ 0x84 ^ (0x59 ^ 0x65) ^ -1)) != 0;
            }
            case 35: {
                var55.P();
                var55.aT();
                var55.aS();
                0;
                if null == null break;
                return ((0xA9 ^ 0xAC ^ (0x3A ^ 0x2E)) & (211 + 75 - 227 + 153 ^ 159 + 4 - 118 + 152 ^ -1)) != 0;
            }
            case 40: {
                var55.aV();
                var55.aR();
                0;
                if (-1 == -1) break;
                return ((45 + 14 - -15 + 59 ^ 4 + 45 - -107 + 18) & (58 + 28 - -52 + 29 ^ 10 + 37 - -3 + 90 ^ -1)) != 0;
            }
            case 45: {
                var55.P();
                var55.aQ();
                var55.aP();
                0;
                if (((0xBB ^ 0x85 ^ (0x39 ^ 0x12)) & (101 + 105 - 25 + 0 ^ 107 + 63 - 100 + 90 ^ -1)) == ((0x2C ^ 0x48 ^ (0x1B ^ 0x3A)) & (0x6B ^ 0x4F ^ (0xC5 ^ 0xA4) ^ -1))) break;
                return ((0x4A ^ 0x3B ^ (0x81 ^ 0xA5)) & (117 + 145 - 139 + 85 ^ 94 + 122 - 112 + 29 ^ -1)) != 0;
            }
            case 50: {
                var55.aO();
                var55.aN();
                0;
                if (1 >= 1) break;
                return ((47 + 32 - -103 + 5 ^ 12 + 138 - 90 + 119) & (0xBE ^ 0xC4 ^ (0xDA ^ 0xA8) ^ -1)) != 0;
            }
            case 55: {
                var55.aM();
                0;
                if (-1 < 0) break;
                return ((0x83 ^ 0x9E) & ~(0x22 ^ 0x3F)) != 0;
            }
            case 60: {
                var55.P();
                var55.aL();
                0;
                if (1 != 0) break;
                return ((0x6E ^ 0x47) & ~(0xB9 ^ 0x90)) != 0;
            }
            case 65: {
                var55.aK();
                var55.aJ();
                var55.P();
                var55.b(var1[2]);
                0;
                if ((0xB7 ^ 0xB2) > 0) break;
                return ((0xA8 ^ 0x8D) & ~(0x3C ^ 0x19)) != 0;
            }
            case 70: {
                var55.P();
                var55.aI();
                var55.aH();
                0;
                if null == null break;
                return ((0x93 ^ 0xAF) & ~(0x3E ^ 2)) != 0;
            }
            case 75: {
                var55.aG();
                var55.aF();
                0;
                if (2 != ((62 + 66 - 63 + 100 ^ 68 + 172 - 163 + 107) & (102 + 57 - 61 + 42 ^ 34 + 33 - 60 + 138 ^ -1))) break;
                return ((150 + 168 - 248 + 156 ^ 111 + 37 - -35 + 3) & (0x2A ^ 0x34 ^ (0x47 ^ 1) ^ -1)) != 0;
            }
            case 80: {
                var55.aE();
                var55.aD();
                var55.aC();
                0;
                if null == null break;
                return ((0x51 ^ 0x30) & ~(0x1F ^ 0x7E)) != 0;
            }
            case 85: {
                var55.P();
                var55.ao();
                0;
                if (1 != -1) break;
                return ((0x46 ^ 0x17 ^ (0x49 ^ 0x30)) & (0x18 ^ 0xE ^ (0x62 ^ 0x5C) ^ -1)) != 0;
            }
            case 90: {
                var55.P();
                var55.aB();
                var55.aA();
                0;
                if null == null break;
                return ((0x8E ^ 0x9B) & ~(0x8A ^ 0x9F)) != 0;
            }
            case 95: {
                var55.az();
                0;
                if (3 >= 3) break;
                return ((58 + 28 - 41 + 140 ^ 87 + 134 - 137 + 68) & (0xC2 ^ 0xB4 ^ (0xEF ^ 0xB8) ^ -1)) != 0;
            }
            case 100: {
                var55.P();
                var55.ay();
                var55.ax();
                0;
                if (-(92 + 66 - 108 + 79 ^ 25 + 105 - 105 + 107) < 0) break;
                return ((0x83 ^ 0xBC ^ (0xE1 ^ 0x84)) & (34 + 124 - 122 + 169 ^ 13 + 83 - -25 + 30 ^ -1)) != 0;
            }
            case 105: {
                var55.ay();
                var55.aw();
                0;
                if (3 != ((141 + 118 - 230 + 122 ^ 101 + 149 - 130 + 77) & (0xE3 ^ 0xBB ^ (0x27 ^ 0x2D) ^ -1))) break;
                return ((0x67 ^ 0x5C ^ (0xBF ^ 0x90)) & (0xD7 ^ 0x83 ^ (0x42 ^ 2) ^ -1)) != 0;
            }
            case 110: {
                var55.aw();
                var55.P();
                0;
                if null == null break;
                return ((0x21 ^ 0x71) & ~(0x62 ^ 0x32)) != 0;
            }
            case 111: {
                var55.av();
                0;
                if (2 > 0) break;
                return ((0x26 ^ 0x7F) & ~(0x46 ^ 0x1F)) != 0;
            }
            case 115: {
                var55.P();
                0;
                if (-2 < 0) break;
                return ((3 ^ (0x65 ^ 0x5C)) & (0x77 ^ 0x15 ^ (0x76 ^ 0x2E) ^ -1)) != 0;
            }
            case 120: {
                var55.at();
                var55.as();
                var55.ar();
                var55.P();
                0;
                if null == null break;
                return ((0xB ^ 0x4C) & ~(0x3C ^ 0x7B)) != 0;
            }
            case 125: {
                var55.aq();
                var55.P();
                0;
                if (((0xB ^ 0x5E) & ~(0x1E ^ 0x4B)) <= 0) break;
                return ((0x7B ^ 0x2C) & ~(0xC1 ^ 0x96)) != 0;
            }
            case 130: {
                var55.ap();
                var55.P();
                0;
                if (2 == 2) break;
                return ((0x3A ^ 0x10) & ~(0x52 ^ 0x78)) != 0;
            }
            default: {
                return var1[0];
            }
        }
        return var1[2];
    }

    private static boolean var36(int n2, int n3) {
        return n2 > n3;
    }

    private void aq() {
        Movement.walkTo((WorldPoint)new WorldPoint(var1[5], var1[6], var1[0]));
        0;
    }

    /*
     * WARNING - void declaration
     */
    private void aB() {
        void var1_1;
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[49];
        if (s.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[50];
        TileObject var58 = TileObjects.getNearest((int[])nArray2);
        if (s.var6(Reachable.isInteractable((Locatable)var58) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var58.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(var2[var1[51]]);
    }

    private void b(int n2) {
        if (s.var6(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        Dialog.chooseOption((int)n2);
        0;
    }

    /*
     * WARNING - void declaration
     */
    private void aQ() {
        void var1_1;
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[93]];
        List var59 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[91], var1[92], var1[0]), (String[])stringArray);
        if (s.var6(Reachable.isInteractable((Locatable)((Locatable)var59.get(var1[0]))) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)((TileObject)var59.get(var1[0])).getWorldLocation());
            0;
            return;
        }
        ((TileObject)var1_1.get(var1[0])).interact(var2[var1[94]]);
        this.sleep(var1[2]);
    }

    /*
     * WARNING - void declaration
     */
    private void aV() {
        void var1_1;
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[48];
        if (s.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[104];
        TileObject var60 = TileObjects.getNearest((int[])nArray2);
        if (s.var6(Reachable.isInteractable((Locatable)var60) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var60.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(var2[var1[105]]);
    }

    private int Q() {
        return Static.getClient().getVarbitValue(b.QUEST_MISTHALIN_MYSTERY.c());
    }

    private void aF() {
        if (s.var20(Widgets.get((int)var1[62], (int)var1[12]))) {
            return;
        }
        WidgetPackets.widgetAction((Widget)Widgets.get((int)var1[62], (int)var1[46]), (String)var2[var1[63]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)var1[62], (int)var1[47]), (String)var2[var1[64]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)var1[62], (int)var1[53]), (String)var2[var1[65]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)var1[62], (int)var1[46]), (String)var2[var1[66]]);
    }

    /*
     * WARNING - void declaration
     */
    private void M() {
        void var61;
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[119];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (s.var4(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[var1[31]];
            dialogOptionArray[s.var1[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.var1[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[s.var1[9]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[s.var1[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.var1[11]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.var1[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.var1[13]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.var1[17]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.var1[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.var1[26]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[s.var1[28]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.var1[29]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.var1[30]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        if (s.var21(var61)) {
            var61.interact(var2[var1[120]]);
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(var1[121], var1[122], var1[0]));
        0;
    }

    /*
     * WARNING - void declaration
     */
    private void aR() {
        void var1_1;
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[48];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[95]];
        List var62 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[91], var1[92], var1[0]), (String[])stringArray);
        if (s.var6(Reachable.isInteractable((Locatable)((Locatable)var62.get(var1[0]))) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)((TileObject)var62.get(var1[0])).getWorldLocation());
            0;
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[48];
        Inventory.getFirst((int[])nArray2).useOn((TileObject)var1_1.get(var1[0]));
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (s.var3(graphicsObjectCreated.getGraphicsObject().getId(), var1[137])) {
            s var63;
            void var64;
            int n2;
            int n3;
            int n4;
            WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.ax, (LocalPoint)graphicsObjectCreated.getGraphicsObject().getLocation());
            int n5 = worldPoint.getX() % var1[14];
            WorldPoint worldPoint2 = new WorldPoint(n5 + (n4 = var1[15]), (n3 = worldPoint.getY() % var1[14]) + (n2 = var1[16]), var1[0]);
            if (s.var4(worldPoint2.equals((Object)new WorldPoint(var1[134], var1[45], var1[0])) ? 1 : 0)) {
                this.aD = Direction.WEST;
            }
            if (s.var4(var64.equals((Object)new WorldPoint(var1[23], var1[136], var1[0])) ? 1 : 0)) {
                var63.aD = Direction.NORTH;
            }
            if (s.var4(var64.equals((Object)new WorldPoint(var1[18], var1[125], var1[0])) ? 1 : 0)) {
                var63.aD = Direction.SOUTH;
            }
            if (s.var4(var64.equals((Object)new WorldPoint(var1[135], var1[19], var1[0])) ? 1 : 0)) {
                var63.aD = Direction.EAST;
            }
            System.out.println("Setting active to " + var63.aD.name());
        }
    }

    private void as() {
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[7];
        if (s.var4(Equipment.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(var2[var1[10]]);
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[7];
        if (s.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[var1[2]];
            nArray3[s.var1[0]] = var1[7];
            Inventory.getFirst((int[])nArray3).interact(var2[var1[11]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void az() {
        void var1_1;
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[47]];
        List var65 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[41], var1[42], var1[0]), (String[])stringArray);
        if (s.var6(Reachable.isInteractable((Locatable)((Locatable)var65.get(var1[0]))) ? 1 : 0)) {
            if (s.var18(((TileObject)var65.get(var1[0])).distanceTo(Players.getLocal().getWorldLocation()), var1[28])) {
                Walker.walkTo((WorldPoint)((TileObject)var65.get(var1[0])).getWorldLocation());
                0;
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(var1[44], var1[45], var1[0]));
            0;
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[48];
        Inventory.getFirst((int[])nArray).useOn((TileObject)var1_1.get(var1[0]));
        this.sleep(var1[2]);
    }

    private static void var66() {
        var1 = new int[143];
        s.var1[0] = (0x7E ^ 0x4F ^ (0x10 ^ 0x43)) & (212 + 80 - 272 + 214 ^ 82 + 13 - -30 + 11 ^ -1);
        s.var1[1] = 52 + 75 - 52 + 60;
        s.var1[2] = 1;
        s.var1[3] = -(0xFFFFF901 & 0x77FF) & (0xFFFFF7DC & 0x7F7F);
        s.var1[4] = -(0xFFFFDBBD & 0x6D53) & (0xFFFFFFFD & 0x5BFB);
        s.var1[5] = 0xFFFFE6FC & 0x3FE7;
        s.var1[6] = 0xFFFFEBBF & 0x1FCD;
        s.var1[7] = -(0xFFFF9DB7 & 0x67FD) & (0xFFFFD7FF & 0x7FF7);
        s.var1[8] = -(0xB8 ^ 0x95) & (0xFFFFDDFF & 0x3FFF);
        s.var1[9] = 2;
        s.var1[10] = 3;
        s.var1[11] = 0x59 ^ 0x5D;
        s.var1[12] = 0xD4 ^ 0xB4 ^ (0x7C ^ 0x19);
        s.var1[13] = 0x81 ^ 0x87;
        s.var1[14] = 0x29 ^ 4 ^ (0xE2 ^ 0x8F);
        s.var1[15] = 0xFFFF965D & 0x6FE2;
        s.var1[16] = -(0xFFFFA51E & 0x5FFF) & (0xFFFF97FD & 0x7FDF);
        s.var1[17] = 0xBF ^ 0xC3 ^ (0x42 ^ 0x39);
        s.var1[18] = -(0xFFFFFB5D & 0x3DAA) & (0xFFFFFFFF & 0x3F5F);
        s.var1[19] = 0xFFFF96DF & 0x7BFF;
        s.var1[20] = 0xFFFFE6F2 & 0x1F0D;
        s.var1[21] = 0xCE ^ 0xC6;
        s.var1[22] = -1;
        s.var1[23] = 0xFFFFE67E & 0x1FD7;
        s.var1[24] = 0xFFFFDEDE & 0x33FF;
        s.var1[25] = 0xFFFFDEB9 & 0x2546;
        s.var1[26] = 0xE6 ^ 0x93 ^ (0xD8 ^ 0xA4);
        s.var1[27] = 0xFFFFF7DF & 0x1AFD;
        s.var1[28] = 5 ^ 0x15 ^ (0x3C ^ 0x26);
        s.var1[29] = 0x4A ^ 0x6B ^ (0x7E ^ 0x54);
        s.var1[30] = 0x76 ^ 0x64 ^ (0x3B ^ 0x25);
        s.var1[31] = 0x4D ^ 0x40;
        s.var1[32] = -(0xFFFF99FF & 0x6F41) & (0xFFFFFFFF & 0x5B7F);
        s.var1[33] = -(0xFFFFED77 & 0x7E9D) & (0xFFFFEE3F & Short.MAX_VALUE);
        s.var1[34] = 0xC2 ^ 0xB6 ^ (0x44 ^ 0x23);
        s.var1[35] = 0x28 ^ 2 ^ (0x7A ^ 0x5E);
        s.var1[36] = 84 + 119 - 155 + 128 ^ 171 + 116 - 283 + 187;
        s.var1[37] = 118 + 20 - -41 + 7 ^ 91 + 4 - -60 + 15;
        s.var1[38] = 0xA8 ^ 0xBF;
        s.var1[39] = 0x68 ^ 0x79;
        s.var1[40] = 0x60 ^ 0x72;
        s.var1[41] = -(0xFFFFF98D & 0x6F73) & (0xFFFFFFEF & 0x6F7F);
        s.var1[42] = -(0xFFFFA77F & 0x7D89) & (0xFFFFBFFF & 0x77EB);
        s.var1[43] = 0xA ^ 0x1E;
        s.var1[44] = 0xFFFFD66F & 0x2FF7;
        s.var1[45] = 0xFFFFD3FE & 0x3EDD;
        s.var1[46] = 0x1C ^ 9;
        s.var1[47] = 0x3A ^ 0x3D ^ (0xA8 ^ 0xB9);
        s.var1[48] = 0xFFFFEFF7 & 0x13BA;
        s.var1[49] = 0xFFFFF6D7 & 0x5B6A;
        s.var1[50] = -(0xFFFFBFCD & 0x443F) & (0xFFFFFFFF & 0x77DC);
        s.var1[51] = 0xA7 ^ 0xBF;
        s.var1[52] = 0xFFFFD37E & 0x7EBF;
        s.var1[53] = 7 ^ 0x1E;
        s.var1[54] = 0xBC ^ 0xA6;
        s.var1[55] = 0xFFFFEF7F & 0x16F1;
        s.var1[56] = 0xFFFFC671 & 0x3FFE;
        s.var1[57] = 0xFFFFFDF3 & 0x77BF;
        s.var1[58] = 0x12 ^ 9;
        s.var1[59] = 0xA1 ^ 0xBD;
        s.var1[60] = 0x1D ^ 0x63 ^ (7 ^ 0x64);
        s.var1[61] = 0x53 ^ 0x4D;
        s.var1[62] = -(0xFFFFDDAD & 0x7FD7) & (0xFFFFFFFE & 0x5FAF);
        s.var1[63] = 0x42 ^ 0x5D;
        s.var1[64] = 0x8F ^ 0xAF;
        s.var1[65] = 0x7E ^ 0x5F;
        s.var1[66] = 0x55 ^ 0x77;
        s.var1[67] = 2 ^ 0x21;
        s.var1[68] = 6 + 82 - -34 + 12 ^ 60 + 59 - 103 + 146;
        s.var1[69] = 0x78 ^ 0x64 ^ (0xF ^ 0x36);
        s.var1[70] = 0xFFFFFB7F & 0x56C1;
        s.var1[71] = 0x48 ^ 0x6E;
        s.var1[72] = 0xFFFF8BDB & 0x7CFF;
        s.var1[73] = 112 + 30 - 102 + 93 ^ 120 + 6 - 62 + 98;
        s.var1[74] = 0xFFFFF6DE & 0xF7F;
        s.var1[75] = 0xFFFFFAF5 & 0x17FB;
        s.var1[76] = 0xED ^ 0xC5;
        s.var1[77] = 8 ^ 0x21;
        s.var1[78] = 178 + 181 - 189 + 17 ^ 2 + 63 - 33 + 113;
        s.var1[79] = 0x43 ^ 0x68;
        s.var1[80] = -(0xFFFFFFBC & 0x7947) & (0xFFFFFFEB & 0x7F7F);
        s.var1[81] = 0x11 ^ 0x79 ^ (0x1B ^ 0x5F);
        s.var1[82] = 129 + 90 - 84 + 7 ^ 111 + 21 - 109 + 140;
        s.var1[83] = -(0xFFFFEFAF & 0x1972) & (0xFFFFBF6F & 0x4BFF);
        s.var1[84] = 0x97 ^ 0xB6 ^ (0xBB ^ 0xB4);
        s.var1[85] = 0xA8 ^ 0x87;
        s.var1[86] = -(0xFFFFF7BE & 0xA7F) & (0xFFFFFFFF & 0x77FF);
        s.var1[87] = 0xBF ^ 0xB3 ^ (0xA0 ^ 0x9C);
        s.var1[88] = -(0xFFFFBBD9 & 0x6D27) & (0xFFFFFFBF & 0x7B7D);
        s.var1[89] = 0xA0 ^ 0x91;
        s.var1[90] = 0x98 ^ 0xAA;
        s.var1[91] = -(0xFFFFE1BB & 0x3EC7) & (0xFFFFEEF7 & 0x37EA);
        s.var1[92] = 0xFFFFB7EF & 0x5AF1;
        s.var1[93] = 0x1B ^ 0x6B ^ (0x19 ^ 0x5A);
        s.var1[94] = 0x7C ^ 0x48;
        s.var1[95] = 0x8B ^ 0xBE;
        s.var1[96] = -(0xFFFFF9BF & 0x7FE) & (0xFFFFD3FF & 0x7FFD);
        s.var1[97] = 0x51 ^ 0x67;
        s.var1[98] = -(0xFFFFA5E9 & 0x7A37) & (0xFFFFBFFF & 0x68FA);
        s.var1[99] = 0x36 ^ 0x64 ^ (0x3A ^ 0x5F);
        s.var1[100] = -(0xFFFFF5FF & 0x6B0D) & (0xFFFFFFEF & 0x677F);
        s.var1[101] = 0xFFFFB3F6 & 0x5EEF;
        s.var1[102] = 0xBF ^ 0x87;
        s.var1[103] = 0x23 ^ 0x31 ^ (0x9C ^ 0xB7);
        s.var1[104] = 0xFFFFF5D7 & 0x7FE9;
        s.var1[105] = 0x42 ^ 0x78;
        s.var1[106] = -(0xFFFFBDEF & 0x66D3) & (0xFFFFFEFE & 0x77FF);
        s.var1[107] = 0xF6 ^ 0xA4 ^ (0xFE ^ 0x97);
        s.var1[108] = 0xB ^ 0x37;
        s.var1[109] = -(0x6A ^ 0x7F) & (0xFFFFBFBD & 0x47DF);
        s.var1[110] = 0xFD ^ 0xC0;
        s.var1[111] = -(0xFFFFF9FF & 0x3613) & (0xFFFFBFDF & 0x77B7);
        s.var1[112] = 0xFB ^ 0xC5;
        s.var1[113] = 0xFFFFF5FF & 0x7FC3;
        s.var1[114] = 0x82 ^ 0xBD;
        s.var1[115] = 0xFFFFF6B3 & 0x3B7D;
        s.var1[116] = -(0x3B ^ 0x32) & (0xFFFF9EAF & 0x6DFF);
        s.var1[117] = 0xFFFFCECF & 0x3D77;
        s.var1[118] = 0x5F ^ 0x1E;
        s.var1[119] = 0xFFFFBFDF & 0x5DE7;
        s.var1[120] = 0x47 ^ 0xF ^ (0x9F ^ 0x95);
        s.var1[121] = 0xFFFF9DEE & 0x6EB7;
        s.var1[122] = -(0xFFFFABA9 & 0x77FF) & (0xFFFFAFFB & Short.MAX_VALUE);
        s.var1[123] = 0xFFFFAFDF & 0x56AF;
        s.var1[124] = 0xFFFF97FD & 0x7AEF;
        s.var1[125] = 0xFFFFB2DD & 0x5FFB;
        s.var1[126] = -(0xFFFFA98B & 0x7F76) & (0xFFFFAF7F & 0x7FF7);
        s.var1[127] = 0xFFFFB6F7 & 0x5BFC;
        s.var1[128] = -(0xFFFFEDFF & 0x5A9D) & (0xFFFFFFFE & 0x4EFF);
        s.var1[129] = 0xFFFFD6E9 & 0x3BFE;
        s.var1[130] = 0xFFFF867F & 0x7FDF;
        s.var1[131] = -(0xFFFFE8B5 & 0x3F4B) & (0xFFFFFBFF & 0x3EEF);
        s.var1[132] = 0xFFFF8F6B & 0x76F5;
        s.var1[133] = -(0xFFFFFBFF & 0xD02) & (0xFFFF9BF7 & 0x7FFB);
        s.var1[134] = -(0xFFFFE0B5 & 0x7FEF) & (0xFFFFE6F7 & Short.MAX_VALUE);
        s.var1[135] = -(0xFFFFEBE7 & 0x3DBD) & (0xFFFFBFFF & 0x6FFF);
        s.var1[136] = -(0xFFFFAD1F & 0x7FFD) & (0xFFFFFFFE & 0x3FFF);
        s.var1[137] = 0xFFFF83F7 & 0x7DEB;
        s.var1[138] = 36 + 51 - 53 + 102 + (0x24 ^ 0x42) - (0x24 ^ 0x1B) + (0xE5 ^ 0xC2);
        s.var1[139] = 0x3D ^ 0x7E;
        s.var1[140] = 0x4C ^ 8;
        s.var1[141] = 0xB2 ^ 0x8A ^ (0x6F ^ 0x12);
        s.var1[142] = 0x5B ^ 0x17 ^ (0x9D ^ 0x97);
    }

    private void aU() {
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[102]];
        List var67 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[100], var1[101], var1[0]), (String[])stringArray);
        if (s.var4(Reachable.isInteractable((Locatable)((Locatable)var67.get(var1[0]))) ? 1 : 0)) {
            ((TileObject)var67.get(var1[0])).interact(var2[var1[103]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void aZ() {
        void var1_1;
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[111];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        TileObject var68 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(var2[var1[139]]));
        if (s.var6(Reachable.isInteractable((Locatable)var68) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var68.getWorldLocation());
            0;
        }
        var1_1.interact(var2[var1[112]]);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private void au() {
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.ax, (LocalPoint)Players.getLocal().getLocalLocation());
        int n2 = worldPoint.getX() % var1[14];
        int n3 = worldPoint.getY() % var1[14];
        int n4 = var1[15];
        int n5 = var1[16];
        WorldPoint worldPoint2 = new WorldPoint(n2 + n4, n3 + n5, var1[0]);
        System.out.println("Local point: " + String.valueOf(worldPoint2));
    }

    private void a(int n2, int n3) {
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[30]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        WorldPoint worldPoint = nPC.getWorldLocation();
        if (s.var4(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(worldPoint.getX() + n2, worldPoint.getY() + n3, var1[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(worldPoint.getX() + n2, worldPoint.getY() + n3, var1[0]));
            0;
            return;
        }
        nPC.interact(var2[var1[31]]);
    }

    private static void var69() {
        var2 = new String[var1[142]];
        s.var2[s.var1[0]] = "Mandy";
        s.var2[s.var1[2]] = "Talk-to";
        s.var2[s.var1[9]] = "Fight";
        s.var2[s.var1[10]] = "We are wearing knife";
        s.var2[s.var1[11]] = "Wield";
        s.var2[s.var1[12]] = "Killer's knife";
        s.var2[s.var1[13]] = "Take";
        s.var2[s.var1[17]] = "Mirror";
        s.var2[s.var1[21]] = "Goal satisified.";
        s.var2[s.var1[26]] = "Goal satisified.";
        s.var2[s.var1[28]] = "Goal satisified.";
        s.var2[s.var1[29]] = "Goal satisified.";
        s.var2[s.var1[30]] = "Mirror";
        s.var2[s.var1[31]] = "Push";
        s.var2[s.var1[35]] = "Switch-sapphire";
        s.var2[s.var1[36]] = "Switch-diamond";
        s.var2[s.var1[37]] = "Switch-zenyte";
        s.var2[s.var1[39]] = "Switch-emerald";
        s.var2[s.var1[40]] = "Switch-onyx";
        s.var2[s.var1[34]] = "Switch-ruby";
        s.var2[s.var1[43]] = "Fireplace";
        s.var2[s.var1[46]] = "Search";
        s.var2[s.var1[47]] = "Fireplace";
        s.var2[s.var1[38]] = "Read";
        s.var2[s.var1[51]] = "Take";
        s.var2[s.var1[53]] = "Staircase";
        s.var2[s.var1[54]] = "Staircase";
        s.var2[s.var1[58]] = "Climb";
        s.var2[s.var1[59]] = "Piano";
        s.var2[s.var1[60]] = "Search";
        s.var2[s.var1[61]] = "Search";
        s.var2[s.var1[63]] = "Play-d";
        s.var2[s.var1[64]] = "Play-e";
        s.var2[s.var1[65]] = "Play-a";
        s.var2[s.var1[66]] = "Play-d";
        s.var2[s.var1[67]] = "Piano";
        s.var2[s.var1[68]] = "Search";
        s.var2[s.var1[69]] = "Play";
        s.var2[s.var1[71]] = "Read";
        s.var2[s.var1[73]] = "Take";
        s.var2[s.var1[76]] = "Dead tree";
        s.var2[s.var1[77]] = "Observe";
        s.var2[s.var1[78]] = "Damaged wall";
        s.var2[s.var1[79]] = "Climb";
        s.var2[s.var1[81]] = "Door";
        s.var2[s.var1[82]] = "Open";
        s.var2[s.var1[84]] = "Barrel";
        s.var2[s.var1[85]] = "Unlit candle";
        s.var2[s.var1[87]] = "Take-tinderbox";
        s.var2[s.var1[89]] = "Door";
        s.var2[s.var1[90]] = "Open";
        s.var2[s.var1[93]] = "Painting";
        s.var2[s.var1[94]] = "Search";
        s.var2[s.var1[95]] = "Painting";
        s.var2[s.var1[97]] = "Read";
        s.var2[s.var1[99]] = "Take";
        s.var2[s.var1[102]] = "Door";
        s.var2[s.var1[103]] = "Open";
        s.var2[s.var1[105]] = "Take-knife";
        s.var2[s.var1[107]] = "Large door";
        s.var2[s.var1[108]] = "Open";
        s.var2[s.var1[110]] = "Search";
        s.var2[s.var1[112]] = "Search";
        s.var2[s.var1[114]] = "Take";
        s.var2[s.var1[14]] = "Rowboat";
        s.var2[s.var1[118]] = "Board";
        s.var2[s.var1[120]] = "Talk-to";
        s.var2[s.var1[139]] = "of rainwater";
        s.var2[s.var1[140]] = "of rainwater";
        s.var2[s.var1[141]] = "Barrel";
    }

    /*
     * WARNING - void declaration
     */
    private void ay() {
        void var1_1;
        if (!s.var6(Dialog.canContinue() ? 1 : 0) || s.var21(Widgets.get((int)var1[33], (int)var1[2]))) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[32];
        if (s.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[43]];
        List var70 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[41], var1[42], var1[0]), (String[])stringArray);
        if (s.var6(Reachable.isInteractable((Locatable)((Locatable)var70.get(var1[0]))) ? 1 : 0)) {
            if (s.var18(((TileObject)var70.get(var1[0])).distanceTo(Players.getLocal().getWorldLocation()), var1[28])) {
                Walker.walkTo((WorldPoint)((TileObject)var70.get(var1[0])).getWorldLocation());
                0;
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(var1[44], var1[45], var1[0]));
            0;
            return;
        }
        ((TileObject)var1_1.get(var1[0])).interact(var2[var1[46]]);
        this.sleep(var1[2]);
    }

    private void ap() {
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[0]];
        NPC var71 = NPCs.getNearest((String[])stringArray);
        if (s.var21(var71)) {
            if (s.var4(Reachable.isInteractable((Locatable)var71) ? 1 : 0)) {
                var71.interact(var2[var1[2]]);
                0;
                if null != null {
                    return;
                }
            } else {
                Movement.walkTo((WorldPoint)new WorldPoint(var1[5], var1[6], var1[0]));
                0;
            }
        }
    }

    private void aW() {
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[106];
        if (s.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[107]];
        TileObject var72 = TileObjects.getNearest((String[])stringArray);
        if (s.var4(Reachable.isInteractable((Locatable)var72) ? 1 : 0)) {
            var72.interact(var2[var1[108]]);
        }
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private void at() {
        void var1_1;
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[7];
        if (s.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[s.var1[0]] = var2[var1[12]];
        TileItem var73 = TileItems.getNearest((String[])stringArray);
        if (s.var20(var73)) {
            return;
        }
        if (s.var6(Reachable.isInteractable((Locatable)var73) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var73.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(var2[var1[13]]);
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    static {
        s.var66();
        s.var69();
    }

    private static boolean var57(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private void ba() {
        void var1_1;
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[111];
        if (s.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[113];
        TileObject var74 = TileObjects.getNearest((int[])nArray2);
        if (s.var6(Reachable.isInteractable((Locatable)var74) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var74.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(var2[var1[114]]);
    }

        catch (Exception var80) {
            var80.printStackTrace();
            return null;
        }
    }

    private void ar() {
        if (s.var4(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[s.var1[0]] = var1[7];
        if (s.var6(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[s.var1[0]] = var1[8];
        NPC var81 = NPCs.getNearest((int[])nArray2);
        if (s.var21(var81) && s.var4(Reachable.isInteractable((Locatable)var81) ? 1 : 0)) {
            s var82;
            var81.interact(var2[var1[9]]);
            var82.sleep(var1[9]);
        }
    }
}

