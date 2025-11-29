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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.d;
import gg.squire.quest.tasks.GameEnum26;

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
        if (s.lIlIIIllIlIlIII(projectileSpawned.getProjectile().getId(), lIIIllIlllIII[138])) {
            this.aD = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void aE() {
        void var1_1;
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[52];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[59]];
        TileObject var1 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIIIllIlllIII[2]];
        stringArray2[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[60]];
        if (s.lIlIIIllIIlllll(var1.hasAction(stringArray2) ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var1) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var1.getWorldLocation());

            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[61]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aX() {
        void var1_1;
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[109];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[106];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIIllIllIlIl[lIIIllIlllIII[141]]));
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var2.getWorldLocation());

        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[110]]);
    }

    private void aJ() {
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[76]];
        List var3 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[74], lIIIllIlllIII[75], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIlIIIll(var3.isEmpty() ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)((Locatable)var3.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            ((TileObject)var3.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[77]]);
        }
    }

        return String.valueOf(var4);
    }

    private void P() {
        if (s.lIlIIIllIlIIIll(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIIlllll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        Dialog.continueSpace();
    }

    private static boolean lIlIIIllIlIIIII(Object object) {
        return object == null;
    }

    private static boolean lIlIIIllIlIIlII(Object object) {
        return object != null;
    }

    private void aS() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[96];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[96];
        Inventory.getFirst((int[])nArray2).interact(lIIIllIllIlIl[lIIIllIlllIII[97]]);
    }

    private void ax() {
        if (s.lIlIIIllIlIIIII(Widgets.get((int)lIIIllIlllIII[33], (int)lIIIllIlllIII[2]))) {
            return;
        }
        WidgetPackets.widgetAction((Widget)Widgets.get((int)lIIIllIlllIII[33], (int)lIIIllIlllIII[34]), (String)lIIIllIllIlIl[lIIIllIlllIII[35]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)lIIIllIlllIII[33], (int)lIIIllIlllIII[10]), (String)lIIIllIllIlIl[lIIIllIlllIII[36]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)lIIIllIlllIII[33], (int)lIIIllIlllIII[29]), (String)lIIIllIllIlIl[lIIIllIlllIII[37]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)lIIIllIlllIII[33], (int)lIIIllIlllIII[38]), (String)lIIIllIllIlIl[lIIIllIlllIII[39]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)lIIIllIlllIII[33], (int)lIIIllIlllIII[17]), (String)lIIIllIllIlIl[lIIIllIlllIII[40]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)lIIIllIlllIII[33], (int)lIIIllIlllIII[36]), (String)lIIIllIllIlIl[lIIIllIlllIII[34]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aT() {
        void var1_1;
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[96];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[98];
        TileObject var5 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var5.getWorldLocation());

            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[99]]);
    }

    private void aP() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[88];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[89]];
        List var6 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[80], lIIIllIlllIII[45], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)((Locatable)var6.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            ((TileObject)var6.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[90]]);
        }
    }

    private static boolean lIlIIIllIlIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private void ao() {
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[3], lIIIllIlllIII[4], lIIIllIlllIII[0]));

    }

    private void aY() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[111];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[111];
        Inventory.getFirst((int[])nArray2).useOn(TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIIllIllIlIl[lIIIllIlllIII[140]])));
    }

    /*
     * WARNING - void declaration
     */
    private void aG() {
        void var1_1;
        if (s.lIlIIIllIlIIlII(Widgets.get((int)lIIIllIlllIII[62], (int)lIIIllIlllIII[12]))) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[67]];
        TileObject var7 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIIIllIlllIII[2]];
        stringArray2[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[68]];
        if (s.lIlIIIllIlIIIll(var7.hasAction(stringArray2) ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var7.getWorldLocation());

            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[69]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aO() {
        void var1_1;
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[83];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[86];
        TileObject var8 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var8.getWorldLocation());

            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[87]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aI() {
        void var1_1;
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[70];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[72];
        TileObject var9 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var9.getWorldLocation());

            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[73]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aD() {
        void var1_1;
        Object var10;
        s var11;
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[52];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIlIIlII(var11.az)) {
            String[] stringArray = new String[lIIIllIlllIII[2]];
            stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[54]];
            var10 = TileObjects.getNearest((String[])stringArray);
            if (s.lIlIIIllIIlllll(var11.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (s.lIlIIIllIlIIllI(var10.distanceTo((Locatable)Players.getLocal()), lIIIllIlllIII[35])) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[55], lIIIllIlllIII[24], lIIIllIlllIII[0]));

                    return;
                }
                return;
            }
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[57];
        var10 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[56], lIIIllIlllIII[27], lIIIllIlllIII[0]), (int[])nArray2);
        if (s.lIlIIIllIlIIIII(var10)) {
            return;
        }
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)((Locatable)var10.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)((TileObject)var10.get(lIIIllIlllIII[0])).getWorldLocation());

            return;
        }
        ((TileObject)var1_1.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[58]]);
        this.sleep(lIIIllIlllIII[2]);
    }

    private void aH() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[70];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[70];
        Inventory.getFirst((int[])nArray2).interact(lIIIllIllIlIl[lIIIllIlllIII[71]]);
    }

    private void aM() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[83];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[84]];
        TileObject var12 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
            s var13;
            int[] nArray2 = new int[lIIIllIlllIII[2]];
            nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[83];
            Inventory.getFirst((int[])nArray2).useOn(var12);
            var13.sleep(lIIIllIlllIII[2]);
        }
    }

    public void bc() {
        this.ay = new d(new WorldPoint(lIIIllIlllIII[15], lIIIllIlllIII[16], lIIIllIlllIII[0]), new WorldPoint(lIIIllIlllIII[123], lIIIllIlllIII[124], lIIIllIlllIII[0]));
        this.az = new d(new WorldPoint(lIIIllIlllIII[56], lIIIllIlllIII[125], lIIIllIlllIII[0]), new WorldPoint(lIIIllIlllIII[126], lIIIllIlllIII[127], lIIIllIlllIII[0]));
        this.aA = new d(new WorldPoint(lIIIllIlllIII[128], lIIIllIlllIII[129], lIIIllIlllIII[0]), new WorldPoint(lIIIllIlllIII[56], lIIIllIlllIII[127], lIIIllIlllIII[0]));
        this.aB = new d(new WorldPoint(lIIIllIlllIII[130], lIIIllIlllIII[131], lIIIllIlllIII[0]), new WorldPoint(lIIIllIlllIII[132], lIIIllIlllIII[133], lIIIllIlllIII[0]));
        this.aC = new d(new WorldPoint(lIIIllIlllIII[134], lIIIllIlllIII[125], lIIIllIlllIII[0]), new WorldPoint(lIIIllIlllIII[135], lIIIllIlllIII[136], lIIIllIlllIII[0]));
    }

    /*
     * WARNING - void declaration
     */
    private void aK() {
        void var1_1;
        if (s.lIlIIIllIlIIlII(this.az) && s.lIlIIIllIlIIIll(this.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[78]];
        TileObject var14 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var14) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var14.getWorldLocation());

            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[79]]);
        this.sleep(lIIIllIlllIII[2]);
    }

    private void aC() {
        s var15;
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[52];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[53]];
        TileObject var16 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIllI(var16.distanceTo((Locatable)Players.getLocal()), lIIIllIlllIII[36])) {
            return;
        }
        if (s.lIlIIIllIlIIlII(var15.az) && s.lIlIIIllIlIIIll(var15.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[3], lIIIllIlllIII[4], lIIIllIlllIII[0]));

    }

    private void aw() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[32];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[23], lIIIllIlllIII[27], lIIIllIlllIII[0]));

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
        LocalPoint var17;
        s var18;
        void var19;
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[17]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIII(nPC)) {
            return;
        }
        System.out.println("DIRECTION: " + var19.getOrientation());
        WorldPoint var20 = WorldPoint.fromLocal((Client)var18.ax, (LocalPoint)var19.getLocalLocation());
        int var21 = var20.getX() % lIIIllIlllIII[14];
        int var22 = var20.getY() % lIIIllIlllIII[14];
        int var23 = lIIIllIlllIII[15];
        int var24 = lIIIllIlllIII[16];
        WorldPoint var25 = new WorldPoint(var21 + var23, var22 + var24, lIIIllIlllIII[0]);
        if (s.lIlIIIllIlIIIll(var18.aD.equals((Object)Direction.EAST) ? 1 : 0)) {
            var17 = new LocalPoint(lIIIllIlllIII[18], lIIIllIlllIII[19]);
            if (s.lIlIIIllIlIIIll(var25.equals((Object)new WorldPoint(var17.getX(), var17.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (s.lIlIIIllIlIIlIl(var19.getOrientation(), lIIIllIlllIII[20])) {
                    var18.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[21]]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var25.getY(), var17.getY())) {
                var18.a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var25.getY(), var17.getY())) {
                var18.a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var25.getX(), var17.getX())) {
                var18.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var25.getX(), var17.getX())) {
                var18.a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            }
        }
        if (s.lIlIIIllIlIIIll(var18.aD.equals((Object)Direction.NORTH) ? 1 : 0)) {
            var17 = new LocalPoint(lIIIllIlllIII[23], lIIIllIlllIII[24]);
            if (s.lIlIIIllIlIIIll(var25.equals((Object)new WorldPoint(var17.getX(), var17.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (s.lIlIIIllIlIIlIl(var19.getOrientation(), lIIIllIlllIII[25])) {
                    var18.a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[26]]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var25.getX(), var17.getX())) {
                var18.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var25.getX(), var17.getX())) {
                var18.a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var25.getY(), var17.getY())) {
                var18.a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var25.getY(), var17.getY())) {
                var18.a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                return;
            }
        }
        if (s.lIlIIIllIlIIIll(var18.aD.equals((Object)Direction.SOUTH) ? 1 : 0)) {
            var17 = new LocalPoint(lIIIllIlllIII[18], lIIIllIlllIII[27]);
            if (s.lIlIIIllIlIIIll(var25.equals((Object)new WorldPoint(var17.getX(), var17.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (s.lIlIIIllIlIIIll(var19.getOrientation())) {
                    var18.a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[28]]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var25.getX(), var17.getX())) {
                var18.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var25.getX(), var17.getX())) {
                var18.a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var25.getY(), var17.getY())) {
                var18.a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var25.getY(), var17.getY())) {
                var18.a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                return;
            }
        }
        if (s.lIlIIIllIlIIIll(var18.aD.equals((Object)Direction.WEST) ? 1 : 0)) {
            var17 = new LocalPoint(lIIIllIlllIII[18], lIIIllIlllIII[27]);
            if (s.lIlIIIllIlIIIll(var25.equals((Object)new WorldPoint(var17.getX(), var17.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (s.lIlIIIllIlIIIll(var19.getOrientation())) {
                    var18.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[29]]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var25.getX(), var17.getX())) {
                var18.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var25.getX(), var17.getX())) {
                var18.a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var25.getY(), var17.getY())) {
                var18.a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var25.getY(), var17.getY())) {
                var18.a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                return;
            }
        }
    }

    private void aN() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[83];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[85]];
        TileObject var26 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)var26) ? 1 : 0)) {
            s var27;
            int[] nArray2 = new int[lIIIllIlllIII[2]];
            nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[83];
            Inventory.getFirst((int[])nArray2).useOn(var26);
            var27.sleep(lIIIllIlllIII[2]);
        }
    }

    private void aA() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[49];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[49];
        Inventory.getFirst((int[])nArray2).interact(lIIIllIllIlIl[lIIIllIlllIII[38]]);
    }

    private void aL() {
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[81]];
        List var28 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[80], lIIIllIlllIII[45], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIlIIIII(var28)) {
            return;
        }
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)((Locatable)var28.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            ((TileObject)var28.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[82]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void bb() {
        void var1_1;
        if (s.lIlIIIllIlIIlIl(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIII[115])) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[14]];
        TileObject var29 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIII(var29)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[116], lIIIllIlllIII[117], lIIIllIlllIII[0]));

        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[118]]);
    }

    public boolean run() {
        s var30;
        if (s.lIlIIIllIIlllll(this.aw.quest().equals((Object)h.MISTHALIN_MYSTERY) ? 1 : 0)) {
            return lIIIllIlllIII[0];
        }
        int var31 = var30.Q();
        if (s.lIlIIIllIlIIIII(var30.az)) {
            var30.bc();
        }
        if (s.lIlIIIllIlIIIIl(var31, lIIIllIlllIII[1])) {
            return lIIIllIlllIII[0];
        }
        System.out.println("[MISTHALIN MYSTERY] - Current Progress: " + var31);
        switch (var31) {
            case 0: {
                var30.M();

                if (1 >= 0) break;
                return false;
            }
            case 5: {
                var30.M();

                if (-1 < ((0 + 37 - -104 + 18 ^ 123 + 170 - 235 + 133) & (81 + 69 - 25 + 28 ^ 130 + 9 - -25 + 21 ^ -1))) break;
                return ((192 + 74 - 182 + 119 ^ 40 + 24 - 33 + 100) & (0x4C ^ 0x2B ^ (0xB1 ^ 0x9E) ^ -1)) != 0;
            }
            case 10: {
                var30.bb();
                var30.ba();

                if (null == null) break;
                return ((0x22 ^ 0xE ^ (0xBE ^ 0x9E)) & (67 + 57 - -41 + 12 ^ 179 + 182 - 358 + 186 ^ -1)) != 0;
            }
            case 15: {
                var30.ba();
                var30.aZ();
                var30.P();

                if (3 != 0) break;
                return false;
            }
            case 20: {
                var30.P();
                var30.aY();
                var30.aX();

                if (-1 < (0x53 ^ 0x78 ^ (0x79 ^ 0x56))) break;
                return ((0x1E ^ 0x59 ^ 116 + 95 - 205 + 121) & (0x86 ^ 0xA0 ^ (0xA3 ^ 0xBD) ^ -1)) != 0;
            }
            case 25: {
                var30.P();
                var30.aX();
                var30.aW();

                if (-3 < 0) break;
                return false;
            }
            case 30: {
                var30.aU();
                var30.P();

                if (-1 <= ((12 + 185 - 147 + 186 ^ 171 + 190 - 356 + 187) & (0x17 ^ 6 ^ (0x3E ^ 3) ^ -1) & ((60 + 63 - 12 + 23 ^ 39 + 78 - 25 + 50) & (0x23 ^ 0x1B ^ (0x87 ^ 0xB7) ^ -1) ^ -1))) break;
                return ((90 + 107 - 185 + 117 ^ 53 + 107 - 144 + 142) & (0xA7 ^ 0x84 ^ (0x59 ^ 0x65) ^ -1)) != 0;
            }
            case 35: {
                var30.P();
                var30.aT();
                var30.aS();

                if (null == null) break;
                return ((0xA9 ^ 0xAC ^ (0x3A ^ 0x2E)) & (211 + 75 - 227 + 153 ^ 159 + 4 - 118 + 152 ^ -1)) != 0;
            }
            case 40: {
                var30.aV();
                var30.aR();

                if (-1 == -1) break;
                return false;
            }
            case 45: {
                var30.P();
                var30.aQ();
                var30.aP();

                if (((0xBB ^ 0x85 ^ (0x39 ^ 0x12)) & (101 + 105 - 25 + 0 ^ 107 + 63 - 100 + 90 ^ -1)) == ((0x2C ^ 0x48 ^ (0x1B ^ 0x3A)) & (0x6B ^ 0x4F ^ (0xC5 ^ 0xA4) ^ -1))) break;
                return ((0x4A ^ 0x3B ^ (0x81 ^ 0xA5)) & (117 + 145 - 139 + 85 ^ 94 + 122 - 112 + 29 ^ -1)) != 0;
            }
            case 50: {
                var30.aO();
                var30.aN();

                if (1 >= 1) break;
                return ((47 + 32 - -103 + 5 ^ 12 + 138 - 90 + 119) & (0xBE ^ 0xC4 ^ (0xDA ^ 0xA8) ^ -1)) != 0;
            }
            case 55: {
                var30.aM();

                if (-1 < 0) break;
                return false;
            }
            case 60: {
                var30.P();
                var30.aL();

                if (1 != 0) break;
                return false;
            }
            case 65: {
                var30.aK();
                var30.aJ();
                var30.P();
                var30.b(lIIIllIlllIII[2]);

                if ((0xB7 ^ 0xB2) > 0) break;
                return false;
            }
            case 70: {
                var30.P();
                var30.aI();
                var30.aH();

                if (null == null) break;
                return false;
            }
            case 75: {
                var30.aG();
                var30.aF();

                if (2 != ((62 + 66 - 63 + 100 ^ 68 + 172 - 163 + 107) & (102 + 57 - 61 + 42 ^ 34 + 33 - 60 + 138 ^ -1))) break;
                return ((150 + 168 - 248 + 156 ^ 111 + 37 - -35 + 3) & (0x2A ^ 0x34 ^ (0x47 ^ 1) ^ -1)) != 0;
            }
            case 80: {
                var30.aE();
                var30.aD();
                var30.aC();

                if (null == null) break;
                return false;
            }
            case 85: {
                var30.P();
                var30.ao();

                if (1 != -1) break;
                return ((0x46 ^ 0x17 ^ (0x49 ^ 0x30)) & (0x18 ^ 0xE ^ (0x62 ^ 0x5C) ^ -1)) != 0;
            }
            case 90: {
                var30.P();
                var30.aB();
                var30.aA();

                if (null == null) break;
                return false;
            }
            case 95: {
                var30.az();

                if (3 >= 3) break;
                return ((58 + 28 - 41 + 140 ^ 87 + 134 - 137 + 68) & (0xC2 ^ 0xB4 ^ (0xEF ^ 0xB8) ^ -1)) != 0;
            }
            case 100: {
                var30.P();
                var30.ay();
                var30.ax();

                if (-(92 + 66 - 108 + 79 ^ 25 + 105 - 105 + 107) < 0) break;
                return ((0x83 ^ 0xBC ^ (0xE1 ^ 0x84)) & (34 + 124 - 122 + 169 ^ 13 + 83 - -25 + 30 ^ -1)) != 0;
            }
            case 105: {
                var30.ay();
                var30.aw();

                if (3 != ((141 + 118 - 230 + 122 ^ 101 + 149 - 130 + 77) & (0xE3 ^ 0xBB ^ (0x27 ^ 0x2D) ^ -1))) break;
                return ((0x67 ^ 0x5C ^ (0xBF ^ 0x90)) & (0xD7 ^ 0x83 ^ (0x42 ^ 2) ^ -1)) != 0;
            }
            case 110: {
                var30.aw();
                var30.P();

                if (null == null) break;
                return false;
            }
            case 111: {
                var30.av();

                if (2 > 0) break;
                return false;
            }
            case 115: {
                var30.P();

                if (-2 < 0) break;
                return ((3 ^ (0x65 ^ 0x5C)) & (0x77 ^ 0x15 ^ (0x76 ^ 0x2E) ^ -1)) != 0;
            }
            case 120: {
                var30.at();
                var30.as();
                var30.ar();
                var30.P();

                if (null == null) break;
                return false;
            }
            case 125: {
                var30.aq();
                var30.P();

                if (((0xB ^ 0x5E) & ~(0x1E ^ 0x4B)) <= 0) break;
                return false;
            }
            case 130: {
                var30.ap();
                var30.P();

                if (2 == 2) break;
                return false;
            }
            default: {
                return lIIIllIlllIII[0];
            }
        }
        return lIIIllIlllIII[2];
    }

    private static boolean lIlIIIllIlIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private void aq() {
        Movement.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[5], lIIIllIlllIII[6], lIIIllIlllIII[0]));

    }

    /*
     * WARNING - void declaration
     */
    private void aB() {
        void var1_1;
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[49];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[50];
        TileObject var32 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var32) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var32.getWorldLocation());

            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[51]]);
    }

    private void b(int n2) {
        if (s.lIlIIIllIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        Dialog.chooseOption((int)n2);

    }

    /*
     * WARNING - void declaration
     */
    private void aQ() {
        void var1_1;
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[93]];
        List var33 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[91], lIIIllIlllIII[92], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)((Locatable)var33.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)((TileObject)var33.get(lIIIllIlllIII[0])).getWorldLocation());

            return;
        }
        ((TileObject)var1_1.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[94]]);
        this.sleep(lIIIllIlllIII[2]);
    }

    /*
     * WARNING - void declaration
     */
    private void aV() {
        void var1_1;
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[48];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[104];
        TileObject var34 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var34) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var34.getWorldLocation());

            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[105]]);
    }

    private int Q() {
        return Static.getClient().getVarbitValue(b.QUEST_MISTHALIN_MYSTERY.c());
    }

    private void aF() {
        if (s.lIlIIIllIlIIIII(Widgets.get((int)lIIIllIlllIII[62], (int)lIIIllIlllIII[12]))) {
            return;
        }
        WidgetPackets.widgetAction((Widget)Widgets.get((int)lIIIllIlllIII[62], (int)lIIIllIlllIII[46]), (String)lIIIllIllIlIl[lIIIllIlllIII[63]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)lIIIllIlllIII[62], (int)lIIIllIlllIII[47]), (String)lIIIllIllIlIl[lIIIllIlllIII[64]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)lIIIllIlllIII[62], (int)lIIIllIlllIII[53]), (String)lIIIllIllIlIl[lIIIllIlllIII[65]]);
        WidgetPackets.widgetAction((Widget)Widgets.get((int)lIIIllIlllIII[62], (int)lIIIllIlllIII[46]), (String)lIIIllIllIlIl[lIIIllIlllIII[66]]);
    }

    /*
     * WARNING - void declaration
     */
    private void M() {
        void var35;
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[119];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (s.lIlIIIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIII[31]];
            dialogOptionArray[s.lIIIllIlllIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[s.lIIIllIlllIII[9]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[11]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[13]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[17]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[26]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[28]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[29]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[s.lIIIllIlllIII[30]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        if (s.lIlIIIllIlIIlII(var35)) {
            var35.interact(lIIIllIllIlIl[lIIIllIlllIII[120]]);
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[121], lIIIllIlllIII[122], lIIIllIlllIII[0]));

    }

    /*
     * WARNING - void declaration
     */
    private void aR() {
        void var1_1;
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[48];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[95]];
        List var36 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[91], lIIIllIlllIII[92], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)((Locatable)var36.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)((TileObject)var36.get(lIIIllIlllIII[0])).getWorldLocation());

            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[48];
        Inventory.getFirst((int[])nArray2).useOn((TileObject)var1_1.get(lIIIllIlllIII[0]));
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (s.lIlIIIllIlIlIII(graphicsObjectCreated.getGraphicsObject().getId(), lIIIllIlllIII[137])) {
            s var37;
            void var38;
            int n2;
            int n3;
            int n4;
            WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.ax, (LocalPoint)graphicsObjectCreated.getGraphicsObject().getLocation());
            int n5 = worldPoint.getX() % lIIIllIlllIII[14];
            WorldPoint worldPoint2 = new WorldPoint(n5 + (n4 = lIIIllIlllIII[15]), (n3 = worldPoint.getY() % lIIIllIlllIII[14]) + (n2 = lIIIllIlllIII[16]), lIIIllIlllIII[0]);
            if (s.lIlIIIllIlIIIll(worldPoint2.equals((Object)new WorldPoint(lIIIllIlllIII[134], lIIIllIlllIII[45], lIIIllIlllIII[0])) ? 1 : 0)) {
                this.aD = Direction.WEST;
            }
            if (s.lIlIIIllIlIIIll(var38.equals((Object)new WorldPoint(lIIIllIlllIII[23], lIIIllIlllIII[136], lIIIllIlllIII[0])) ? 1 : 0)) {
                var37.aD = Direction.NORTH;
            }
            if (s.lIlIIIllIlIIIll(var38.equals((Object)new WorldPoint(lIIIllIlllIII[18], lIIIllIlllIII[125], lIIIllIlllIII[0])) ? 1 : 0)) {
                var37.aD = Direction.SOUTH;
            }
            if (s.lIlIIIllIlIIIll(var38.equals((Object)new WorldPoint(lIIIllIlllIII[135], lIIIllIlllIII[19], lIIIllIlllIII[0])) ? 1 : 0)) {
                var37.aD = Direction.EAST;
            }
            System.out.println("Setting active to " + var37.aD.name());
        }
    }

    private void as() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[7];
        if (s.lIlIIIllIlIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lIIIllIllIlIl[lIIIllIlllIII[10]]);
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[7];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIlllIII[2]];
            nArray3[s.lIIIllIlllIII[0]] = lIIIllIlllIII[7];
            Inventory.getFirst((int[])nArray3).interact(lIIIllIllIlIl[lIIIllIlllIII[11]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void az() {
        void var1_1;
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[47]];
        List var39 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[41], lIIIllIlllIII[42], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)((Locatable)var39.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            if (s.lIlIIIllIlIIlll(((TileObject)var39.get(lIIIllIlllIII[0])).distanceTo(Players.getLocal().getWorldLocation()), lIIIllIlllIII[28])) {
                Walker.walkTo((WorldPoint)((TileObject)var39.get(lIIIllIlllIII[0])).getWorldLocation());

                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[44], lIIIllIlllIII[45], lIIIllIlllIII[0]));

            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[48];
        Inventory.getFirst((int[])nArray).useOn((TileObject)var1_1.get(lIIIllIlllIII[0]));
        this.sleep(lIIIllIlllIII[2]);
    }

    private void aU() {
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[102]];
        List var40 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[100], lIIIllIlllIII[101], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)((Locatable)var40.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            ((TileObject)var40.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[103]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void aZ() {
        void var1_1;
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[111];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        TileObject var41 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIIllIllIlIl[lIIIllIlllIII[139]]));
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var41) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var41.getWorldLocation());

        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[112]]);
    }

    private static boolean lIlIIIllIlIIIll(int n2) {
        return n2 != 0;
    }

    private void au() {
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.ax, (LocalPoint)Players.getLocal().getLocalLocation());
        int n2 = worldPoint.getX() % lIIIllIlllIII[14];
        int n3 = worldPoint.getY() % lIIIllIlllIII[14];
        int n4 = lIIIllIlllIII[15];
        int n5 = lIIIllIlllIII[16];
        WorldPoint worldPoint2 = new WorldPoint(n2 + n4, n3 + n5, lIIIllIlllIII[0]);
        System.out.println("Local point: " + String.valueOf(worldPoint2));
    }

    private void a(int n2, int n3) {
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[30]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        WorldPoint worldPoint = nPC.getWorldLocation();
        if (s.lIlIIIllIlIIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(worldPoint.getX() + n2, worldPoint.getY() + n3, lIIIllIlllIII[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(worldPoint.getX() + n2, worldPoint.getY() + n3, lIIIllIlllIII[0]));

            return;
        }
        nPC.interact(lIIIllIllIlIl[lIIIllIlllIII[31]]);
    }

    private static void lIlIIIllIIllIlI() {
        lIIIllIllIlIl = new String[lIIIllIlllIII[142]];
        s.lIIIllIllIlIl[s.lIIIllIlllIII[0]] = "Mandy";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[2]] = "Talk-to";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[9]] = "Fight";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[10]] = "We are wearing knife";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[11]] = "Wield";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[12]] = "Killer's knife";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[13]] = "Take";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[17]] = "Mirror";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[21]] = "Goal satisified.";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[26]] = "Goal satisified.";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[28]] = "Goal satisified.";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[29]] = "Goal satisified.";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[30]] = "Mirror";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[31]] = "Push";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[35]] = "Switch-sapphire";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[36]] = "Switch-diamond";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[37]] = "Switch-zenyte";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[39]] = "Switch-emerald";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[40]] = "Switch-onyx";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[34]] = "Switch-ruby";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[43]] = "Fireplace";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[46]] = "Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[47]] = "Fireplace";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[38]] = "Read";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[51]] = "Take";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[53]] = "Staircase";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[54]] = "Staircase";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[58]] = "Climb";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[59]] = "Piano";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[60]] = "Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[61]] = "Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[63]] = "Play-d";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[64]] = "Play-e";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[65]] = "Play-a";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[66]] = "Play-d";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[67]] = "Piano";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[68]] = "Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[69]] = "Play";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[71]] = "Read";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[73]] = "Take";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[76]] = "Dead tree";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[77]] = "Observe";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[78]] = "Damaged wall";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[79]] = "Climb";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[81]] = "Door";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[82]] = "Open";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[84]] = "Barrel";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[85]] = "Unlit candle";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[87]] = "Take-tinderbox";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[89]] = "Door";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[90]] = "Open";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[93]] = "Painting";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[94]] = "Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[95]] = "Painting";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[97]] = "Read";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[99]] = "Take";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[102]] = "Door";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[103]] = "Open";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[105]] = "Take-knife";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[107]] = "Large door";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[108]] = "Open";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[110]] = "Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[112]] = "Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[114]] = "Take";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[14]] = "Rowboat";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[118]] = "Board";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[120]] = "Talk-to";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[139]] = "of rainwater";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[140]] = "of rainwater";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[141]] = "Barrel";
    }

    /*
     * WARNING - void declaration
     */
    private void ay() {
        void var1_1;
        if (!s.lIlIIIllIIlllll(Dialog.canContinue() ? 1 : 0) || s.lIlIIIllIlIIlII(Widgets.get((int)lIIIllIlllIII[33], (int)lIIIllIlllIII[2]))) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[32];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[43]];
        List var42 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[41], lIIIllIlllIII[42], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)((Locatable)var42.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            if (s.lIlIIIllIlIIlll(((TileObject)var42.get(lIIIllIlllIII[0])).distanceTo(Players.getLocal().getWorldLocation()), lIIIllIlllIII[28])) {
                Walker.walkTo((WorldPoint)((TileObject)var42.get(lIIIllIlllIII[0])).getWorldLocation());

                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[44], lIIIllIlllIII[45], lIIIllIlllIII[0]));

            return;
        }
        ((TileObject)var1_1.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[46]]);
        this.sleep(lIIIllIlllIII[2]);
    }

    private void ap() {
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[0]];
        NPC var43 = NPCs.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIlII(var43)) {
            if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)var43) ? 1 : 0)) {
                var43.interact(lIIIllIllIlIl[lIIIllIlllIII[2]]);

                }
            } else {
                Movement.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[5], lIIIllIlllIII[6], lIIIllIlllIII[0]));

            }
        }
    }

    private void aW() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[106];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[107]];
        TileObject var44 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)var44) ? 1 : 0)) {
            var44.interact(lIIIllIllIlIl[lIIIllIlllIII[108]]);
        }
    }

    private static boolean lIlIIIllIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private void at() {
        void var1_1;
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[7];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[12]];
        TileItem var45 = TileItems.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIII(var45)) {
            return;
        }
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var45) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var45.getWorldLocation());

            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[13]]);
    }

    private static boolean lIlIIIllIIlllll(int n2) {
        return n2 == 0;
    }

    static {
        s.lIlIIIllIIllllI();
        s.lIlIIIllIIllIlI();
    }

    private static boolean lIlIIIllIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIllIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private void ba() {
        void var1_1;
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[111];
        if (s.lIlIIIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[113];
        TileObject var46 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var46) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var46.getWorldLocation());

            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[114]]);
    }

    private void ar() {
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[7];
        if (s.lIlIIIllIIlllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[8];
        NPC var47 = NPCs.getNearest((int[])nArray2);
        if (s.lIlIIIllIlIIlII(var47) && s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)var47) ? 1 : 0)) {
            s var48;
            var47.interact(lIIIllIllIlIl[lIIIllIlllIII[9]]);
            var48.sleep(lIIIllIlllIII[9]);
        }
    }
}

