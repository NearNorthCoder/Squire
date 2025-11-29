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
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

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
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.b;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.d;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

/* TASK: Completing Misthalin Mystery -> CompletingmisthalinmysteryTask */
@TaskDesc(name="Completing Misthalin Mystery", register=true)
public class s
extends Task {
    private /* synthetic */ LocalPoint aE;
    private static /* synthetic */ int[] lIIIllIlllIII;
    private final /* synthetic */ Client ax;
    private static /* synthetic */ String[] lIIIllIllIlIl;
    private final /* synthetic */ SquireQuesterConfig aw;
    private /* synthetic */ List<TileObject> aF;
    private /* synthetic */ d aA;
    private /* synthetic */ Direction aD;
    private /* synthetic */ d aB;
    private /* synthetic */ d ay;
    private /* synthetic */ d az;
    private /* synthetic */ d aC;

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
        TileObject var65 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIIIllIlllIII[2]];
        stringArray2[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[60]];
        if (s.lIlIIIllIIlllll(var65.hasAction(stringArray2) ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var65) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var65.getWorldLocation());
            0;
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
        TileObject var17 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIIllIllIlIl[lIIIllIlllIII[141]]));
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var17) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var17.getWorldLocation());
            0;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[110]]);
    }

    private void aJ() {
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[76]];
        List var8 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[74], lIIIllIlllIII[75], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIlIIIll(var8.isEmpty() ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)((Locatable)var8.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            ((TileObject)var8.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[77]]);
        }
    }

    private static String lIlIIIllIIIllIl(String var9, String var35) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var33 = new StringBuilder();
        char[] var61 = var35.toCharArray();
        int var26 = lIIIllIlllIII[0];
        char[] var3 = var9.toCharArray();
        int var10 = var3.length;
        int var59 = lIIIllIlllIII[0];
        while (s.lIlIIIllIlIIlll(var59, var10)) {
            char var58 = var3[var59];
            var33.append((char)(var58 ^ var61[var26 % var61.length]));
            0;
            ++var26;
            ++var59;
            0;
            
            return null;
        }
        return String.valueOf(var33);
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

    private static String lIlIIIllIIIllll(String var51, String var53) {
        try {
            SecretKeySpec var57 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var53.getBytes(StandardCharsets.UTF_8)), lIIIllIlllIII[21]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIIIllIlllIII[9], var57);
            return new String(var1.doFinal(Base64.getDecoder().decode(var51.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
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
        TileObject var13 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var13) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var13.getWorldLocation());
            0;
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
        List var12 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[80], lIIIllIlllIII[45], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)((Locatable)var12.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            ((TileObject)var12.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[90]]);
        }
    }

    private static boolean lIlIIIllIlIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private void ao() {
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[3], lIIIllIlllIII[4], lIIIllIlllIII[0]));
        0;
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
        TileObject var44 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIIIllIlllIII[2]];
        stringArray2[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[68]];
        if (s.lIlIIIllIlIIIll(var44.hasAction(stringArray2) ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var44) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var44.getWorldLocation());
            0;
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
        TileObject var14 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var14) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var14.getWorldLocation());
            0;
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
        TileObject var29 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var29) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var29.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[73]]);
    }

    /*
     * WARNING - void declaration
     */
    private void aD() {
        void var1_1;
        Object var15;
        s var11;
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[52];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (s.lIlIIIllIlIIlII(var11.az)) {
            String[] stringArray = new String[lIIIllIlllIII[2]];
            stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[54]];
            var15 = TileObjects.getNearest((String[])stringArray);
            if (s.lIlIIIllIIlllll(var11.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (s.lIlIIIllIlIIllI(var15.distanceTo((Locatable)Players.getLocal()), lIIIllIlllIII[35])) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[55], lIIIllIlllIII[24], lIIIllIlllIII[0]));
                    0;
                    return;
                }
                return;
            }
        }
        int[] nArray2 = new int[lIIIllIlllIII[2]];
        nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[57];
        var15 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[56], lIIIllIlllIII[27], lIIIllIlllIII[0]), (int[])nArray2);
        if (s.lIlIIIllIlIIIII(var15)) {
            return;
        }
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)((Locatable)var15.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)((TileObject)var15.get(lIIIllIlllIII[0])).getWorldLocation());
            0;
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
        TileObject var32 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)var32) ? 1 : 0)) {
            s var30;
            int[] nArray2 = new int[lIIIllIlllIII[2]];
            nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[83];
            Inventory.getFirst((int[])nArray2).useOn(var32);
            var30.sleep(lIIIllIlllIII[2]);
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
        TileObject var54 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var54) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var54.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[79]]);
        this.sleep(lIIIllIlllIII[2]);
    }

    private void aC() {
        s var37;
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[52];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[53]];
        TileObject var66 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIllI(var66.distanceTo((Locatable)Players.getLocal()), lIIIllIlllIII[36])) {
            return;
        }
        if (s.lIlIIIllIlIIlII(var37.az) && s.lIlIIIllIlIIIll(var37.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[3], lIIIllIlllIII[4], lIIIllIlllIII[0]));
        0;
    }

    private void aw() {
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[32];
        if (s.lIlIIIllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[23], lIIIllIlllIII[27], lIIIllIlllIII[0]));
        0;
    }

    @Inject
    public s(SquireQuesterConfig squireQuesterConfig, Client client) {
        this.aw = squireQuesterConfig;
        this.ax = client;
    }

    /*
     * WARNING - void declaration
     */
    private void av() {
        LocalPoint var5;
        s var62;
        void var45;
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[17]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIII(nPC)) {
            return;
        }
        System.out.println("DIRECTION: " + var45.getOrientation());
        WorldPoint var16 = WorldPoint.fromLocal((Client)var62.ax, (LocalPoint)var45.getLocalLocation());
        int var21 = var16.getX() % lIIIllIlllIII[14];
        int var36 = var16.getY() % lIIIllIlllIII[14];
        int var47 = lIIIllIlllIII[15];
        int var28 = lIIIllIlllIII[16];
        WorldPoint var22 = new WorldPoint(var21 + var47, var36 + var28, lIIIllIlllIII[0]);
        if (s.lIlIIIllIlIIIll(var62.aD.equals((Object)Direction.EAST) ? 1 : 0)) {
            var5 = new LocalPoint(lIIIllIlllIII[18], lIIIllIlllIII[19]);
            if (s.lIlIIIllIlIIIll(var22.equals((Object)new WorldPoint(var5.getX(), var5.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (s.lIlIIIllIlIIlIl(var45.getOrientation(), lIIIllIlllIII[20])) {
                    var62.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[21]]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var22.getY(), var5.getY())) {
                var62.a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var22.getY(), var5.getY())) {
                var62.a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var22.getX(), var5.getX())) {
                var62.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var22.getX(), var5.getX())) {
                var62.a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            }
        }
        if (s.lIlIIIllIlIIIll(var62.aD.equals((Object)Direction.NORTH) ? 1 : 0)) {
            var5 = new LocalPoint(lIIIllIlllIII[23], lIIIllIlllIII[24]);
            if (s.lIlIIIllIlIIIll(var22.equals((Object)new WorldPoint(var5.getX(), var5.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (s.lIlIIIllIlIIlIl(var45.getOrientation(), lIIIllIlllIII[25])) {
                    var62.a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[26]]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var22.getX(), var5.getX())) {
                var62.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var22.getX(), var5.getX())) {
                var62.a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var22.getY(), var5.getY())) {
                var62.a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var22.getY(), var5.getY())) {
                var62.a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                return;
            }
        }
        if (s.lIlIIIllIlIIIll(var62.aD.equals((Object)Direction.SOUTH) ? 1 : 0)) {
            var5 = new LocalPoint(lIIIllIlllIII[18], lIIIllIlllIII[27]);
            if (s.lIlIIIllIlIIIll(var22.equals((Object)new WorldPoint(var5.getX(), var5.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (s.lIlIIIllIlIIIll(var45.getOrientation())) {
                    var62.a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[28]]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var22.getX(), var5.getX())) {
                var62.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var22.getX(), var5.getX())) {
                var62.a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var22.getY(), var5.getY())) {
                var62.a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var22.getY(), var5.getY())) {
                var62.a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                return;
            }
        }
        if (s.lIlIIIllIlIIIll(var62.aD.equals((Object)Direction.WEST) ? 1 : 0)) {
            var5 = new LocalPoint(lIIIllIlllIII[18], lIIIllIlllIII[27]);
            if (s.lIlIIIllIlIIIll(var22.equals((Object)new WorldPoint(var5.getX(), var5.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (s.lIlIIIllIlIIIll(var45.getOrientation())) {
                    var62.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[29]]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var22.getX(), var5.getX())) {
                var62.a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var22.getX(), var5.getX())) {
                var62.a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            }
            if (s.lIlIIIllIlIIllI(var22.getY(), var5.getY())) {
                var62.a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            }
            if (s.lIlIIIllIlIIlll(var22.getY(), var5.getY())) {
                var62.a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
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
        TileObject var20 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)var20) ? 1 : 0)) {
            s var60;
            int[] nArray2 = new int[lIIIllIlllIII[2]];
            nArray2[s.lIIIllIlllIII[0]] = lIIIllIlllIII[83];
            Inventory.getFirst((int[])nArray2).useOn(var20);
            var60.sleep(lIIIllIlllIII[2]);
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
        List var18 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[80], lIIIllIlllIII[45], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIlIIIII(var18)) {
            return;
        }
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)((Locatable)var18.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            ((TileObject)var18.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[82]]);
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
        TileObject var42 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIII(var42)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[116], lIIIllIlllIII[117], lIIIllIlllIII[0]));
            0;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[118]]);
    }

    public boolean run() {
        s var19;
        if (s.lIlIIIllIIlllll(this.aw.quest().equals((Object)h.MISTHALIN_MYSTERY) ? 1 : 0)) {
            return lIIIllIlllIII[0];
        }
        int var64 = var19.Q();
        if (s.lIlIIIllIlIIIII(var19.az)) {
            var19.bc();
        }
        if (s.lIlIIIllIlIIIIl(var64, lIIIllIlllIII[1])) {
            return lIIIllIlllIII[0];
        }
        System.out.println("[MISTHALIN MYSTERY] - Current Progress: " + var64);
        switch (var64) {
            case 0: {
                var19.M();
                0;
                if (1 >= 0) break;
                return false;
            }
            case 5: {
                var19.M();
                0;
                if (-1 < ((0 + 37 - -104 + 18 ^ 123 + 170 - 235 + 133) & (81 + 69 - 25 + 28 ^ 130 + 9 - -25 + 21 ^ -1))) break;
                return ((192 + 74 - 182 + 119 ^ 40 + 24 - 33 + 100) & (0x4C ^ 0x2B ^ (0xB1 ^ 0x9E) ^ -1)) != 0;
            }
            case 10: {
                var19.bb();
                var19.ba();
                0;
                if (null == null) break;
                return ((0x22 ^ 0xE ^ (0xBE ^ 0x9E)) & (67 + 57 - -41 + 12 ^ 179 + 182 - 358 + 186 ^ -1)) != 0;
            }
            case 15: {
                var19.ba();
                var19.aZ();
                var19.P();
                0;
                if (3 != 0) break;
                return false;
            }
            case 20: {
                var19.P();
                var19.aY();
                var19.aX();
                0;
                if (-1 < (0x53 ^ 0x78 ^ (0x79 ^ 0x56))) break;
                return ((0x1E ^ 0x59 ^ 116 + 95 - 205 + 121) & (0x86 ^ 0xA0 ^ (0xA3 ^ 0xBD) ^ -1)) != 0;
            }
            case 25: {
                var19.P();
                var19.aX();
                var19.aW();
                0;
                if (-3 < 0) break;
                return false;
            }
            case 30: {
                var19.aU();
                var19.P();
                0;
                if (-1 <= ((12 + 185 - 147 + 186 ^ 171 + 190 - 356 + 187) & (0x17 ^ 6 ^ (0x3E ^ 3) ^ -1) & ((60 + 63 - 12 + 23 ^ 39 + 78 - 25 + 50) & (0x23 ^ 0x1B ^ (0x87 ^ 0xB7) ^ -1) ^ -1))) break;
                return ((90 + 107 - 185 + 117 ^ 53 + 107 - 144 + 142) & (0xA7 ^ 0x84 ^ (0x59 ^ 0x65) ^ -1)) != 0;
            }
            case 35: {
                var19.P();
                var19.aT();
                var19.aS();
                0;
                if (null == null) break;
                return ((0xA9 ^ 0xAC ^ (0x3A ^ 0x2E)) & (211 + 75 - 227 + 153 ^ 159 + 4 - 118 + 152 ^ -1)) != 0;
            }
            case 40: {
                var19.aV();
                var19.aR();
                0;
                if (-1 == -1) break;
                return false;
            }
            case 45: {
                var19.P();
                var19.aQ();
                var19.aP();
                0;
                if (((0xBB ^ 0x85 ^ (0x39 ^ 0x12)) & (101 + 105 - 25 + 0 ^ 107 + 63 - 100 + 90 ^ -1)) == ((0x2C ^ 0x48 ^ (0x1B ^ 0x3A)) & (0x6B ^ 0x4F ^ (0xC5 ^ 0xA4) ^ -1))) break;
                return ((0x4A ^ 0x3B ^ (0x81 ^ 0xA5)) & (117 + 145 - 139 + 85 ^ 94 + 122 - 112 + 29 ^ -1)) != 0;
            }
            case 50: {
                var19.aO();
                var19.aN();
                0;
                if (1 >= 1) break;
                return ((47 + 32 - -103 + 5 ^ 12 + 138 - 90 + 119) & (0xBE ^ 0xC4 ^ (0xDA ^ 0xA8) ^ -1)) != 0;
            }
            case 55: {
                var19.aM();
                0;
                if (-1 < 0) break;
                return false;
            }
            case 60: {
                var19.P();
                var19.aL();
                0;
                if (1 != 0) break;
                return false;
            }
            case 65: {
                var19.aK();
                var19.aJ();
                var19.P();
                var19.b(lIIIllIlllIII[2]);
                0;
                if ((0xB7 ^ 0xB2) > 0) break;
                return false;
            }
            case 70: {
                var19.P();
                var19.aI();
                var19.aH();
                0;
                if (null == null) break;
                return false;
            }
            case 75: {
                var19.aG();
                var19.aF();
                0;
                if (2 != ((62 + 66 - 63 + 100 ^ 68 + 172 - 163 + 107) & (102 + 57 - 61 + 42 ^ 34 + 33 - 60 + 138 ^ -1))) break;
                return ((150 + 168 - 248 + 156 ^ 111 + 37 - -35 + 3) & (0x2A ^ 0x34 ^ (0x47 ^ 1) ^ -1)) != 0;
            }
            case 80: {
                var19.aE();
                var19.aD();
                var19.aC();
                0;
                if (null == null) break;
                return false;
            }
            case 85: {
                var19.P();
                var19.ao();
                0;
                if (1 != -1) break;
                return ((0x46 ^ 0x17 ^ (0x49 ^ 0x30)) & (0x18 ^ 0xE ^ (0x62 ^ 0x5C) ^ -1)) != 0;
            }
            case 90: {
                var19.P();
                var19.aB();
                var19.aA();
                0;
                if (null == null) break;
                return false;
            }
            case 95: {
                var19.az();
                0;
                if (3 >= 3) break;
                return ((58 + 28 - 41 + 140 ^ 87 + 134 - 137 + 68) & (0xC2 ^ 0xB4 ^ (0xEF ^ 0xB8) ^ -1)) != 0;
            }
            case 100: {
                var19.P();
                var19.ay();
                var19.ax();
                0;
                if (-(92 + 66 - 108 + 79 ^ 25 + 105 - 105 + 107) < 0) break;
                return ((0x83 ^ 0xBC ^ (0xE1 ^ 0x84)) & (34 + 124 - 122 + 169 ^ 13 + 83 - -25 + 30 ^ -1)) != 0;
            }
            case 105: {
                var19.ay();
                var19.aw();
                0;
                if (3 != ((141 + 118 - 230 + 122 ^ 101 + 149 - 130 + 77) & (0xE3 ^ 0xBB ^ (0x27 ^ 0x2D) ^ -1))) break;
                return ((0x67 ^ 0x5C ^ (0xBF ^ 0x90)) & (0xD7 ^ 0x83 ^ (0x42 ^ 2) ^ -1)) != 0;
            }
            case 110: {
                var19.aw();
                var19.P();
                0;
                if (null == null) break;
                return false;
            }
            case 111: {
                var19.av();
                0;
                if (2 > 0) break;
                return false;
            }
            case 115: {
                var19.P();
                0;
                if (-2 < 0) break;
                return ((3 ^ (0x65 ^ 0x5C)) & (0x77 ^ 0x15 ^ (0x76 ^ 0x2E) ^ -1)) != 0;
            }
            case 120: {
                var19.at();
                var19.as();
                var19.ar();
                var19.P();
                0;
                if (null == null) break;
                return false;
            }
            case 125: {
                var19.aq();
                var19.P();
                0;
                if (((0xB ^ 0x5E) & ~(0x1E ^ 0x4B)) <= 0) break;
                return false;
            }
            case 130: {
                var19.ap();
                var19.P();
                0;
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
        0;
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
        TileObject var52 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var52) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var52.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[51]]);
    }

    private void b(int n2) {
        if (s.lIlIIIllIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
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
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[93]];
        List var46 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[91], lIIIllIlllIII[92], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)((Locatable)var46.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)((TileObject)var46.get(lIIIllIlllIII[0])).getWorldLocation());
            0;
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
        TileObject var2 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var2.getWorldLocation());
            0;
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
        void var49;
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
        if (s.lIlIIIllIlIIlII(var49)) {
            var49.interact(lIIIllIllIlIl[lIIIllIlllIII[120]]);
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[121], lIIIllIlllIII[122], lIIIllIlllIII[0]));
        0;
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
        List var34 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[91], lIIIllIlllIII[92], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)((Locatable)var34.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)((TileObject)var34.get(lIIIllIlllIII[0])).getWorldLocation());
            0;
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
            s var55;
            void var23;
            int n2;
            int n3;
            int n4;
            WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.ax, (LocalPoint)graphicsObjectCreated.getGraphicsObject().getLocation());
            int n5 = worldPoint.getX() % lIIIllIlllIII[14];
            WorldPoint worldPoint2 = new WorldPoint(n5 + (n4 = lIIIllIlllIII[15]), (n3 = worldPoint.getY() % lIIIllIlllIII[14]) + (n2 = lIIIllIlllIII[16]), lIIIllIlllIII[0]);
            if (s.lIlIIIllIlIIIll(worldPoint2.equals((Object)new WorldPoint(lIIIllIlllIII[134], lIIIllIlllIII[45], lIIIllIlllIII[0])) ? 1 : 0)) {
                this.aD = Direction.WEST;
            }
            if (s.lIlIIIllIlIIIll(var23.equals((Object)new WorldPoint(lIIIllIlllIII[23], lIIIllIlllIII[136], lIIIllIlllIII[0])) ? 1 : 0)) {
                var55.aD = Direction.NORTH;
            }
            if (s.lIlIIIllIlIIIll(var23.equals((Object)new WorldPoint(lIIIllIlllIII[18], lIIIllIlllIII[125], lIIIllIlllIII[0])) ? 1 : 0)) {
                var55.aD = Direction.SOUTH;
            }
            if (s.lIlIIIllIlIIIll(var23.equals((Object)new WorldPoint(lIIIllIlllIII[135], lIIIllIlllIII[19], lIIIllIlllIII[0])) ? 1 : 0)) {
                var55.aD = Direction.EAST;
            }
            System.out.println("Setting active to " + var55.aD.name());
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
        List var63 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[41], lIIIllIlllIII[42], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)((Locatable)var63.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            if (s.lIlIIIllIlIIlll(((TileObject)var63.get(lIIIllIlllIII[0])).distanceTo(Players.getLocal().getWorldLocation()), lIIIllIlllIII[28])) {
                Walker.walkTo((WorldPoint)((TileObject)var63.get(lIIIllIlllIII[0])).getWorldLocation());
                0;
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[44], lIIIllIlllIII[45], lIIIllIlllIII[0]));
            0;
            return;
        }
        int[] nArray = new int[lIIIllIlllIII[2]];
        nArray[s.lIIIllIlllIII[0]] = lIIIllIlllIII[48];
        Inventory.getFirst((int[])nArray).useOn((TileObject)var1_1.get(lIIIllIlllIII[0]));
        this.sleep(lIIIllIlllIII[2]);
    }

    private static void lIlIIIllIIllllI() {
        lIIIllIlllIII = new int[143];
        s.lIIIllIlllIII[0] = (0x7E ^ 0x4F ^ (0x10 ^ 0x43)) & (212 + 80 - 272 + 214 ^ 82 + 13 - -30 + 11 ^ -1);
        s.lIIIllIlllIII[1] = 52 + 75 - 52 + 60;
        s.lIIIllIlllIII[2] = 1;
        s.lIIIllIlllIII[3] = -(0xFFFFF901 & 0x77FF) & (0xFFFFF7DC & 0x7F7F);
        s.lIIIllIlllIII[4] = -(0xFFFFDBBD & 0x6D53) & (0xFFFFFFFD & 0x5BFB);
        s.lIIIllIlllIII[5] = 0xFFFFE6FC & 0x3FE7;
        s.lIIIllIlllIII[6] = 0xFFFFEBBF & 0x1FCD;
        s.lIIIllIlllIII[7] = -(0xFFFF9DB7 & 0x67FD) & (0xFFFFD7FF & 0x7FF7);
        s.lIIIllIlllIII[8] = -(0xB8 ^ 0x95) & (0xFFFFDDFF & 0x3FFF);
        s.lIIIllIlllIII[9] = 2;
        s.lIIIllIlllIII[10] = 3;
        s.lIIIllIlllIII[11] = 0x59 ^ 0x5D;
        s.lIIIllIlllIII[12] = 0xD4 ^ 0xB4 ^ (0x7C ^ 0x19);
        s.lIIIllIlllIII[13] = 0x81 ^ 0x87;
        s.lIIIllIlllIII[14] = 0x29 ^ 4 ^ (0xE2 ^ 0x8F);
        s.lIIIllIlllIII[15] = 0xFFFF965D & 0x6FE2;
        s.lIIIllIlllIII[16] = -(0xFFFFA51E & 0x5FFF) & (0xFFFF97FD & 0x7FDF);
        s.lIIIllIlllIII[17] = 0xBF ^ 0xC3 ^ (0x42 ^ 0x39);
        s.lIIIllIlllIII[18] = -(0xFFFFFB5D & 0x3DAA) & (0xFFFFFFFF & 0x3F5F);
        s.lIIIllIlllIII[19] = 0xFFFF96DF & 0x7BFF;
        s.lIIIllIlllIII[20] = 0xFFFFE6F2 & 0x1F0D;
        s.lIIIllIlllIII[21] = 0xCE ^ 0xC6;
        s.lIIIllIlllIII[22] = -1;
        s.lIIIllIlllIII[23] = 0xFFFFE67E & 0x1FD7;
        s.lIIIllIlllIII[24] = 0xFFFFDEDE & 0x33FF;
        s.lIIIllIlllIII[25] = 0xFFFFDEB9 & 0x2546;
        s.lIIIllIlllIII[26] = 0xE6 ^ 0x93 ^ (0xD8 ^ 0xA4);
        s.lIIIllIlllIII[27] = 0xFFFFF7DF & 0x1AFD;
        s.lIIIllIlllIII[28] = 5 ^ 0x15 ^ (0x3C ^ 0x26);
        s.lIIIllIlllIII[29] = 0x4A ^ 0x6B ^ (0x7E ^ 0x54);
        s.lIIIllIlllIII[30] = 0x76 ^ 0x64 ^ (0x3B ^ 0x25);
        s.lIIIllIlllIII[31] = 0x4D ^ 0x40;
        s.lIIIllIlllIII[32] = -(0xFFFF99FF & 0x6F41) & (0xFFFFFFFF & 0x5B7F);
        s.lIIIllIlllIII[33] = -(0xFFFFED77 & 0x7E9D) & (0xFFFFEE3F & Short.MAX_VALUE);
        s.lIIIllIlllIII[34] = 0xC2 ^ 0xB6 ^ (0x44 ^ 0x23);
        s.lIIIllIlllIII[35] = 0x28 ^ 2 ^ (0x7A ^ 0x5E);
        s.lIIIllIlllIII[36] = 84 + 119 - 155 + 128 ^ 171 + 116 - 283 + 187;
        s.lIIIllIlllIII[37] = 118 + 20 - -41 + 7 ^ 91 + 4 - -60 + 15;
        s.lIIIllIlllIII[38] = 0xA8 ^ 0xBF;
        s.lIIIllIlllIII[39] = 0x68 ^ 0x79;
        s.lIIIllIlllIII[40] = 0x60 ^ 0x72;
        s.lIIIllIlllIII[41] = -(0xFFFFF98D & 0x6F73) & (0xFFFFFFEF & 0x6F7F);
        s.lIIIllIlllIII[42] = -(0xFFFFA77F & 0x7D89) & (0xFFFFBFFF & 0x77EB);
        s.lIIIllIlllIII[43] = 0xA ^ 0x1E;
        s.lIIIllIlllIII[44] = 0xFFFFD66F & 0x2FF7;
        s.lIIIllIlllIII[45] = 0xFFFFD3FE & 0x3EDD;
        s.lIIIllIlllIII[46] = 0x1C ^ 9;
        s.lIIIllIlllIII[47] = 0x3A ^ 0x3D ^ (0xA8 ^ 0xB9);
        s.lIIIllIlllIII[48] = 0xFFFFEFF7 & 0x13BA;
        s.lIIIllIlllIII[49] = 0xFFFFF6D7 & 0x5B6A;
        s.lIIIllIlllIII[50] = -(0xFFFFBFCD & 0x443F) & (0xFFFFFFFF & 0x77DC);
        s.lIIIllIlllIII[51] = 0xA7 ^ 0xBF;
        s.lIIIllIlllIII[52] = 0xFFFFD37E & 0x7EBF;
        s.lIIIllIlllIII[53] = 7 ^ 0x1E;
        s.lIIIllIlllIII[54] = 0xBC ^ 0xA6;
        s.lIIIllIlllIII[55] = 0xFFFFEF7F & 0x16F1;
        s.lIIIllIlllIII[56] = 0xFFFFC671 & 0x3FFE;
        s.lIIIllIlllIII[57] = 0xFFFFFDF3 & 0x77BF;
        s.lIIIllIlllIII[58] = 0x12 ^ 9;
        s.lIIIllIlllIII[59] = 0xA1 ^ 0xBD;
        s.lIIIllIlllIII[60] = 0x1D ^ 0x63 ^ (7 ^ 0x64);
        s.lIIIllIlllIII[61] = 0x53 ^ 0x4D;
        s.lIIIllIlllIII[62] = -(0xFFFFDDAD & 0x7FD7) & (0xFFFFFFFE & 0x5FAF);
        s.lIIIllIlllIII[63] = 0x42 ^ 0x5D;
        s.lIIIllIlllIII[64] = 0x8F ^ 0xAF;
        s.lIIIllIlllIII[65] = 0x7E ^ 0x5F;
        s.lIIIllIlllIII[66] = 0x55 ^ 0x77;
        s.lIIIllIlllIII[67] = 2 ^ 0x21;
        s.lIIIllIlllIII[68] = 6 + 82 - -34 + 12 ^ 60 + 59 - 103 + 146;
        s.lIIIllIlllIII[69] = 0x78 ^ 0x64 ^ (0xF ^ 0x36);
        s.lIIIllIlllIII[70] = 0xFFFFFB7F & 0x56C1;
        s.lIIIllIlllIII[71] = 0x48 ^ 0x6E;
        s.lIIIllIlllIII[72] = 0xFFFF8BDB & 0x7CFF;
        s.lIIIllIlllIII[73] = 112 + 30 - 102 + 93 ^ 120 + 6 - 62 + 98;
        s.lIIIllIlllIII[74] = 0xFFFFF6DE & 0xF7F;
        s.lIIIllIlllIII[75] = 0xFFFFFAF5 & 0x17FB;
        s.lIIIllIlllIII[76] = 0xED ^ 0xC5;
        s.lIIIllIlllIII[77] = 8 ^ 0x21;
        s.lIIIllIlllIII[78] = 178 + 181 - 189 + 17 ^ 2 + 63 - 33 + 113;
        s.lIIIllIlllIII[79] = 0x43 ^ 0x68;
        s.lIIIllIlllIII[80] = -(0xFFFFFFBC & 0x7947) & (0xFFFFFFEB & 0x7F7F);
        s.lIIIllIlllIII[81] = 0x11 ^ 0x79 ^ (0x1B ^ 0x5F);
        s.lIIIllIlllIII[82] = 129 + 90 - 84 + 7 ^ 111 + 21 - 109 + 140;
        s.lIIIllIlllIII[83] = -(0xFFFFEFAF & 0x1972) & (0xFFFFBF6F & 0x4BFF);
        s.lIIIllIlllIII[84] = 0x97 ^ 0xB6 ^ (0xBB ^ 0xB4);
        s.lIIIllIlllIII[85] = 0xA8 ^ 0x87;
        s.lIIIllIlllIII[86] = -(0xFFFFF7BE & 0xA7F) & (0xFFFFFFFF & 0x77FF);
        s.lIIIllIlllIII[87] = 0xBF ^ 0xB3 ^ (0xA0 ^ 0x9C);
        s.lIIIllIlllIII[88] = -(0xFFFFBBD9 & 0x6D27) & (0xFFFFFFBF & 0x7B7D);
        s.lIIIllIlllIII[89] = 0xA0 ^ 0x91;
        s.lIIIllIlllIII[90] = 0x98 ^ 0xAA;
        s.lIIIllIlllIII[91] = -(0xFFFFE1BB & 0x3EC7) & (0xFFFFEEF7 & 0x37EA);
        s.lIIIllIlllIII[92] = 0xFFFFB7EF & 0x5AF1;
        s.lIIIllIlllIII[93] = 0x1B ^ 0x6B ^ (0x19 ^ 0x5A);
        s.lIIIllIlllIII[94] = 0x7C ^ 0x48;
        s.lIIIllIlllIII[95] = 0x8B ^ 0xBE;
        s.lIIIllIlllIII[96] = -(0xFFFFF9BF & 0x7FE) & (0xFFFFD3FF & 0x7FFD);
        s.lIIIllIlllIII[97] = 0x51 ^ 0x67;
        s.lIIIllIlllIII[98] = -(0xFFFFA5E9 & 0x7A37) & (0xFFFFBFFF & 0x68FA);
        s.lIIIllIlllIII[99] = 0x36 ^ 0x64 ^ (0x3A ^ 0x5F);
        s.lIIIllIlllIII[100] = -(0xFFFFF5FF & 0x6B0D) & (0xFFFFFFEF & 0x677F);
        s.lIIIllIlllIII[101] = 0xFFFFB3F6 & 0x5EEF;
        s.lIIIllIlllIII[102] = 0xBF ^ 0x87;
        s.lIIIllIlllIII[103] = 0x23 ^ 0x31 ^ (0x9C ^ 0xB7);
        s.lIIIllIlllIII[104] = 0xFFFFF5D7 & 0x7FE9;
        s.lIIIllIlllIII[105] = 0x42 ^ 0x78;
        s.lIIIllIlllIII[106] = -(0xFFFFBDEF & 0x66D3) & (0xFFFFFEFE & 0x77FF);
        s.lIIIllIlllIII[107] = 0xF6 ^ 0xA4 ^ (0xFE ^ 0x97);
        s.lIIIllIlllIII[108] = 0xB ^ 0x37;
        s.lIIIllIlllIII[109] = -(0x6A ^ 0x7F) & (0xFFFFBFBD & 0x47DF);
        s.lIIIllIlllIII[110] = 0xFD ^ 0xC0;
        s.lIIIllIlllIII[111] = -(0xFFFFF9FF & 0x3613) & (0xFFFFBFDF & 0x77B7);
        s.lIIIllIlllIII[112] = 0xFB ^ 0xC5;
        s.lIIIllIlllIII[113] = 0xFFFFF5FF & 0x7FC3;
        s.lIIIllIlllIII[114] = 0x82 ^ 0xBD;
        s.lIIIllIlllIII[115] = 0xFFFFF6B3 & 0x3B7D;
        s.lIIIllIlllIII[116] = -(0x3B ^ 0x32) & (0xFFFF9EAF & 0x6DFF);
        s.lIIIllIlllIII[117] = 0xFFFFCECF & 0x3D77;
        s.lIIIllIlllIII[118] = 0x5F ^ 0x1E;
        s.lIIIllIlllIII[119] = 0xFFFFBFDF & 0x5DE7;
        s.lIIIllIlllIII[120] = 0x47 ^ 0xF ^ (0x9F ^ 0x95);
        s.lIIIllIlllIII[121] = 0xFFFF9DEE & 0x6EB7;
        s.lIIIllIlllIII[122] = -(0xFFFFABA9 & 0x77FF) & (0xFFFFAFFB & Short.MAX_VALUE);
        s.lIIIllIlllIII[123] = 0xFFFFAFDF & 0x56AF;
        s.lIIIllIlllIII[124] = 0xFFFF97FD & 0x7AEF;
        s.lIIIllIlllIII[125] = 0xFFFFB2DD & 0x5FFB;
        s.lIIIllIlllIII[126] = -(0xFFFFA98B & 0x7F76) & (0xFFFFAF7F & 0x7FF7);
        s.lIIIllIlllIII[127] = 0xFFFFB6F7 & 0x5BFC;
        s.lIIIllIlllIII[128] = -(0xFFFFEDFF & 0x5A9D) & (0xFFFFFFFE & 0x4EFF);
        s.lIIIllIlllIII[129] = 0xFFFFD6E9 & 0x3BFE;
        s.lIIIllIlllIII[130] = 0xFFFF867F & 0x7FDF;
        s.lIIIllIlllIII[131] = -(0xFFFFE8B5 & 0x3F4B) & (0xFFFFFBFF & 0x3EEF);
        s.lIIIllIlllIII[132] = 0xFFFF8F6B & 0x76F5;
        s.lIIIllIlllIII[133] = -(0xFFFFFBFF & 0xD02) & (0xFFFF9BF7 & 0x7FFB);
        s.lIIIllIlllIII[134] = -(0xFFFFE0B5 & 0x7FEF) & (0xFFFFE6F7 & Short.MAX_VALUE);
        s.lIIIllIlllIII[135] = -(0xFFFFEBE7 & 0x3DBD) & (0xFFFFBFFF & 0x6FFF);
        s.lIIIllIlllIII[136] = -(0xFFFFAD1F & 0x7FFD) & (0xFFFFFFFE & 0x3FFF);
        s.lIIIllIlllIII[137] = 0xFFFF83F7 & 0x7DEB;
        s.lIIIllIlllIII[138] = 36 + 51 - 53 + 102 + (0x24 ^ 0x42) - (0x24 ^ 0x1B) + (0xE5 ^ 0xC2);
        s.lIIIllIlllIII[139] = 0x3D ^ 0x7E;
        s.lIIIllIlllIII[140] = 0x4C ^ 8;
        s.lIIIllIlllIII[141] = 0xB2 ^ 0x8A ^ (0x6F ^ 0x12);
        s.lIIIllIlllIII[142] = 0x5B ^ 0x17 ^ (0x9D ^ 0x97);
    }

    private void aU() {
        if (s.lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIII[2]];
        stringArray[s.lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[102]];
        List var4 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[100], lIIIllIlllIII[101], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)((Locatable)var4.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            ((TileObject)var4.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[103]]);
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
        TileObject var40 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIIllIllIlIl[lIIIllIlllIII[139]]));
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var40) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var40.getWorldLocation());
            0;
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
            0;
            return;
        }
        nPC.interact(lIIIllIllIlIl[lIIIllIlllIII[31]]);
    }

    private static void lIlIIIllIIllIlI() {
        lIIIllIllIlIl = new String[lIIIllIlllIII[142]];
        s.lIIIllIllIlIl[s.lIIIllIlllIII[0]] = s."Mandy";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[2]] = s."Talk-to";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[9]] = s."Fight";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[10]] = s."We are wearing knife";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[11]] = s."Wield";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[12]] = s."Killer's knife";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[13]] = s."Take";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[17]] = s."Mirror";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[21]] = s."Goal satisified.";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[26]] = s."Goal satisified.";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[28]] = s."Goal satisified.";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[29]] = s."Goal satisified.";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[30]] = s."Mirror";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[31]] = s."Push";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[35]] = s."Switch-sapphire";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[36]] = s."Switch-diamond";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[37]] = s."Switch-zenyte";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[39]] = s."Switch-emerald";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[40]] = s."Switch-onyx";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[34]] = s."Switch-ruby";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[43]] = s."Fireplace";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[46]] = s."Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[47]] = s."Fireplace";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[38]] = s."Read";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[51]] = s."Take";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[53]] = s."Staircase";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[54]] = s."Staircase";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[58]] = s."Climb";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[59]] = s."Piano";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[60]] = s."Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[61]] = s."Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[63]] = s."Play-d";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[64]] = s."Play-e";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[65]] = s."Play-a";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[66]] = s."Play-d";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[67]] = s."Piano";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[68]] = s."Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[69]] = s."Play";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[71]] = s."Read";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[73]] = s."Take";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[76]] = s."Dead tree";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[77]] = s."Observe";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[78]] = s."Damaged wall";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[79]] = s."Climb";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[81]] = s."Door";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[82]] = s."Open";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[84]] = s."Barrel";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[85]] = s."Unlit candle";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[87]] = s."Take-tinderbox";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[89]] = s."Door";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[90]] = s."Open";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[93]] = s."Painting";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[94]] = s."Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[95]] = s."Painting";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[97]] = s."Read";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[99]] = s."Take";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[102]] = s."Door";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[103]] = s."Open";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[105]] = s."Take-knife";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[107]] = s."Large door";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[108]] = s."Open";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[110]] = s."Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[112]] = s."Search";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[114]] = s."Take";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[14]] = s."Rowboat";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[118]] = s."Board";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[120]] = s."Talk-to";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[139]] = s."of rainwater";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[140]] = s."of rainwater";
        s.lIIIllIllIlIl[s.lIIIllIlllIII[141]] = s."Barrel";
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
        List var27 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIII[41], lIIIllIlllIII[42], lIIIllIlllIII[0]), (String[])stringArray);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)((Locatable)var27.get(lIIIllIlllIII[0]))) ? 1 : 0)) {
            if (s.lIlIIIllIlIIlll(((TileObject)var27.get(lIIIllIlllIII[0])).distanceTo(Players.getLocal().getWorldLocation()), lIIIllIlllIII[28])) {
                Walker.walkTo((WorldPoint)((TileObject)var27.get(lIIIllIlllIII[0])).getWorldLocation());
                0;
                return;
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[44], lIIIllIlllIII[45], lIIIllIlllIII[0]));
            0;
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
        NPC var38 = NPCs.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIlII(var38)) {
            if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)var38) ? 1 : 0)) {
                var38.interact(lIIIllIllIlIl[lIIIllIlllIII[2]]);
                0;
                
                }
            } else {
                Movement.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIII[5], lIIIllIlllIII[6], lIIIllIlllIII[0]));
                0;
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
        TileObject var6 = TileObjects.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)var6) ? 1 : 0)) {
            var6.interact(lIIIllIllIlIl[lIIIllIlllIII[108]]);
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
        TileItem var50 = TileItems.getNearest((String[])stringArray);
        if (s.lIlIIIllIlIIIII(var50)) {
            return;
        }
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var50) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var50.getWorldLocation());
            0;
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
        TileObject var56 = TileObjects.getNearest((int[])nArray2);
        if (s.lIlIIIllIIlllll(Reachable.isInteractable((Locatable)var56) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)var56.getWorldLocation());
            0;
            return;
        }
        var1_1.interact(lIIIllIllIlIl[lIIIllIlllIII[114]]);
    }

    private static String lIlIIIllIIIlllI(String var31, String var48) {
        try {
            SecretKeySpec var39 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var48.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var43 = Cipher.getInstance("Blowfish");
            var43.init(lIIIllIlllIII[9], var39);
            return new String(var43.doFinal(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
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
        NPC var7 = NPCs.getNearest((int[])nArray2);
        if (s.lIlIIIllIlIIlII(var7) && s.lIlIIIllIlIIIll(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
            s var41;
            var7.interact(lIIIllIllIlIl[lIIIllIlllIII[9]]);
            var41.sleep(lIIIllIlllIII[9]);
        }
    }
}

