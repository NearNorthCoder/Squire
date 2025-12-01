package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

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
@TaskDesc(name = "Completing Misthalin Mystery", register = true)
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.s  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/s.class */
public class s extends Task {
    private /* synthetic */ LocalPoint aE;
    private static /* synthetic */ int[] lIIIllIlllIII;
    private final /* synthetic */ Client ax;
    private static /* synthetic */ String[] lIIIllIllIlIl;
    private final /* synthetic */ SquireQuesterConfig aw;
    private /* synthetic */ List<TileObject> aF;
    private /* synthetic */ C0003d aA;
    private /* synthetic */ Direction aD;
    private /* synthetic */ C0003d aB;
    private /* synthetic */ C0003d ay;
    private /* synthetic */ C0003d az;
    private /* synthetic */ C0003d aC;

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (lIlIIIllIlIlIII(projectileSpawned.getProjectile().getId(), lIIIllIlllIII[138])) {
            this.aD = null;
        }
    }

    private void aE() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[52];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[59]];
        TileObject nearest = TileObjects.getNearest(strArr);
        String[] strArr2 = new String[lIIIllIlllIII[2]];
        strArr2[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[60]];
        if (lIlIIIllIIlllll(nearest.hasAction(strArr2) ? 1 : 0)) {
            return;
        }
        if (!lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[61]]);
            return;
        }
        Walker.walkTo(nearest.getWorldLocation());
        "".length();
    }

    private void aX() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[109];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[106];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr2) ? 1 : 0) || lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            return tileObject.getName().contains(lIIIllIllIlIl[lIIIllIlllIII[141]]);
        });
        if (lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(nearest.getWorldLocation());
            "".length();
        }
        nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[110]]);
    }

    private void aJ() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIII[74], lIIIllIlllIII[75], lIIIllIlllIII[0]);
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[76]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (!lIlIIIllIlIIIll(at.isEmpty() ? 1 : 0) && lIlIIIllIlIIIll(Reachable.isInteractable((Locatable) at.get(lIIIllIlllIII[0])) ? 1 : 0)) {
            ((TileObject) at.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[77]]);
        }
    }

    private static String lIlIIIllIIIllIl(String lllllllllllllllIIIIIllllIlIIllII, String lllllllllllllllIIIIIllllIlIIlIll) {
        String lllllllllllllllIIIIIllllIlIIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllllIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIllllIlIIlIlI = new StringBuilder();
        char[] lllllllllllllllIIIIIllllIlIIlIIl = lllllllllllllllIIIIIllllIlIIlIll.toCharArray();
        int lllllllllllllllIIIIIllllIlIIlIII = lIIIllIlllIII[0];
        char[] charArray = lllllllllllllllIIIIIllllIlIIllII2.toCharArray();
        int length = charArray.length;
        int i = lIIIllIlllIII[0];
        while (lIlIIIllIlIIlll(i, length)) {
            char lllllllllllllllIIIIIllllIlIIllIl = charArray[i];
            lllllllllllllllIIIIIllllIlIIlIlI.append((char) (lllllllllllllllIIIIIllllIlIIllIl ^ lllllllllllllllIIIIIllllIlIIlIIl[lllllllllllllllIIIIIllllIlIIlIII % lllllllllllllllIIIIIllllIlIIlIIl.length]));
            "".length();
            lllllllllllllllIIIIIllllIlIIlIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIllllIlIIlIlI);
    }

    private void P() {
        if (lIlIIIllIlIIIll(Dialog.isViewingOptions() ? 1 : 0) || lIlIIIllIIlllll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        Dialog.continueSpace();
    }

    private static boolean lIlIIIllIlIIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIllIlIIlII(Object obj) {
        return obj != null;
    }

    private static String lIlIIIllIIIllll(String lllllllllllllllIIIIIllllIlIlllII, String lllllllllllllllIIIIIllllIlIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllllIlIllIll.getBytes(StandardCharsets.UTF_8)), lIIIllIlllIII[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIlllIII[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllllIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllllIlIlllIl) {
            lllllllllllllllIIIIIllllIlIlllIl.printStackTrace();
            return null;
        }
    }

    private void aS() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[96];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[96];
        Inventory.getFirst(iArr2).interact(lIIIllIllIlIl[lIIIllIlllIII[97]]);
    }

    private void ax() {
        if (lIlIIIllIlIIIII(Widgets.get(lIIIllIlllIII[33], lIIIllIlllIII[2]))) {
            return;
        }
        WidgetPackets.widgetAction(Widgets.get(lIIIllIlllIII[33], lIIIllIlllIII[34]), lIIIllIllIlIl[lIIIllIlllIII[35]]);
        WidgetPackets.widgetAction(Widgets.get(lIIIllIlllIII[33], lIIIllIlllIII[10]), lIIIllIllIlIl[lIIIllIlllIII[36]]);
        WidgetPackets.widgetAction(Widgets.get(lIIIllIlllIII[33], lIIIllIlllIII[29]), lIIIllIllIlIl[lIIIllIlllIII[37]]);
        WidgetPackets.widgetAction(Widgets.get(lIIIllIlllIII[33], lIIIllIlllIII[38]), lIIIllIllIlIl[lIIIllIlllIII[39]]);
        WidgetPackets.widgetAction(Widgets.get(lIIIllIlllIII[33], lIIIllIlllIII[17]), lIIIllIllIlIl[lIIIllIlllIII[40]]);
        WidgetPackets.widgetAction(Widgets.get(lIIIllIlllIII[33], lIIIllIlllIII[36]), lIIIllIllIlIl[lIIIllIlllIII[34]]);
    }

    private void aT() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[96];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[98];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[99]]);
            return;
        }
        Walker.walkTo(nearest.getWorldLocation());
        "".length();
    }

    private void aP() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[88];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0) || lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIII[80], lIIIllIlllIII[45], lIIIllIlllIII[0]);
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[89]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (lIlIIIllIlIIIll(Reachable.isInteractable((Locatable) at.get(lIIIllIlllIII[0])) ? 1 : 0)) {
            ((TileObject) at.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[90]]);
        }
    }

    private static boolean lIlIIIllIlIIlIl(int i, int i2) {
        return i != i2;
    }

    private void ao() {
        Walker.walkTo(new WorldPoint(lIIIllIlllIII[3], lIIIllIlllIII[4], lIIIllIlllIII[0]));
        "".length();
    }

    private void aY() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[111];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[111];
        Inventory.getFirst(iArr2).useOn(TileObjects.getNearest(tileObject -> {
            return tileObject.getName().contains(lIIIllIllIlIl[lIIIllIlllIII[140]]);
        }));
    }

    private void aG() {
        if (lIlIIIllIlIIlII(Widgets.get(lIIIllIlllIII[62], lIIIllIlllIII[12]))) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[67]];
        TileObject nearest = TileObjects.getNearest(strArr);
        String[] strArr2 = new String[lIIIllIlllIII[2]];
        strArr2[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[68]];
        if (lIlIIIllIlIIIll(nearest.hasAction(strArr2) ? 1 : 0)) {
            return;
        }
        if (!lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[69]]);
            return;
        }
        Walker.walkTo(nearest.getWorldLocation());
        "".length();
    }

    private void aO() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[83];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[86];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[87]]);
            return;
        }
        Walker.walkTo(nearest.getWorldLocation());
        "".length();
    }

    private void aI() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[70];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[72];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[73]]);
            return;
        }
        Walker.walkTo(nearest.getWorldLocation());
        "".length();
    }

    private void aD() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[52];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        if (lIlIIIllIlIIlII(this.az)) {
            String[] strArr = new String[lIIIllIlllIII[2]];
            strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[54]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIlIIIllIIlllll(this.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIlIIIllIlIIllI(nearest.distanceTo(Players.getLocal()), lIIIllIlllIII[35])) {
                    Movement.walkTo(new WorldPoint(lIIIllIlllIII[55], lIIIllIlllIII[24], lIIIllIlllIII[0]));
                    "".length();
                    return;
                }
                return;
            }
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIII[56], lIIIllIlllIII[27], lIIIllIlllIII[0]);
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[57];
        List at = TileObjects.getAt(worldPoint, iArr2);
        if (lIlIIIllIlIIIII(at)) {
            return;
        }
        if (lIlIIIllIIlllll(Reachable.isInteractable((Locatable) at.get(lIIIllIlllIII[0])) ? 1 : 0)) {
            Walker.walkTo(((TileObject) at.get(lIIIllIlllIII[0])).getWorldLocation());
            "".length();
            return;
        }
        ((TileObject) at.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[58]]);
        sleep(lIIIllIlllIII[2]);
    }

    private void aH() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[70];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[70];
        Inventory.getFirst(iArr2).interact(lIIIllIllIlIl[lIIIllIlllIII[71]]);
    }

    private void aM() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[83];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[84]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIIIllIlIIIll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllIlllIII[2]];
            iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[83];
            Inventory.getFirst(iArr2).useOn(nearest);
            sleep(lIIIllIlllIII[2]);
        }
    }

    public void bc() {
        this.ay = new C0003d(new WorldPoint(lIIIllIlllIII[15], lIIIllIlllIII[16], lIIIllIlllIII[0]), new WorldPoint(lIIIllIlllIII[123], lIIIllIlllIII[124], lIIIllIlllIII[0]));
        this.az = new C0003d(new WorldPoint(lIIIllIlllIII[56], lIIIllIlllIII[125], lIIIllIlllIII[0]), new WorldPoint(lIIIllIlllIII[126], lIIIllIlllIII[127], lIIIllIlllIII[0]));
        this.aA = new C0003d(new WorldPoint(lIIIllIlllIII[128], lIIIllIlllIII[129], lIIIllIlllIII[0]), new WorldPoint(lIIIllIlllIII[56], lIIIllIlllIII[127], lIIIllIlllIII[0]));
        this.aB = new C0003d(new WorldPoint(lIIIllIlllIII[130], lIIIllIlllIII[131], lIIIllIlllIII[0]), new WorldPoint(lIIIllIlllIII[132], lIIIllIlllIII[133], lIIIllIlllIII[0]));
        this.aC = new C0003d(new WorldPoint(lIIIllIlllIII[134], lIIIllIlllIII[125], lIIIllIlllIII[0]), new WorldPoint(lIIIllIlllIII[135], lIIIllIlllIII[136], lIIIllIlllIII[0]));
    }

    private void aK() {
        if (lIlIIIllIlIIlII(this.az) && lIlIIIllIlIIIll(this.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[78]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(nearest.getWorldLocation());
            "".length();
            return;
        }
        nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[79]]);
        sleep(lIIIllIlllIII[2]);
    }

    private void aC() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[52];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[53]];
        if (lIlIIIllIlIIllI(TileObjects.getNearest(strArr).distanceTo(Players.getLocal()), lIIIllIlllIII[36])) {
            return;
        }
        if (lIlIIIllIlIIlII(this.az) && lIlIIIllIlIIIll(this.az.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIlllIII[3], lIIIllIlllIII[4], lIIIllIlllIII[0]));
        "".length();
    }

    private void aw() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[32];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIlllIII[23], lIIIllIlllIII[27], lIIIllIlllIII[0]));
        "".length();
    }

    @Inject
    public s(SquireQuesterConfig squireQuesterConfig, Client client) {
        this.aw = squireQuesterConfig;
        this.ax = client;
    }

    private void av() {
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[17]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlIIIllIlIIIII(nearest)) {
            return;
        }
        System.out.println("DIRECTION: " + nearest.getOrientation());
        WorldPoint fromLocal = WorldPoint.fromLocal(this.ax, nearest.getLocalLocation());
        int x = fromLocal.getX() % lIIIllIlllIII[14];
        int y = fromLocal.getY() % lIIIllIlllIII[14];
        int i = lIIIllIlllIII[15];
        int lllllllllllllllIIIIIllllllIIlIII = lIIIllIlllIII[16];
        WorldPoint worldPoint = new WorldPoint(x + i, y + lllllllllllllllIIIIIllllllIIlIII, lIIIllIlllIII[0]);
        if (lIlIIIllIlIIIll(this.aD.equals(Direction.EAST) ? 1 : 0)) {
            LocalPoint localPoint = new LocalPoint(lIIIllIlllIII[18], lIIIllIlllIII[19]);
            if (lIlIIIllIlIIIll(worldPoint.equals(new WorldPoint(localPoint.getX(), localPoint.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (lIlIIIllIlIIlIl(nearest.getOrientation(), lIIIllIlllIII[20])) {
                    a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[21]]);
                return;
            } else if (lIlIIIllIlIIllI(worldPoint.getY(), localPoint.getY())) {
                a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            } else if (lIlIIIllIlIIlll(worldPoint.getY(), localPoint.getY())) {
                a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                return;
            } else if (lIlIIIllIlIIllI(worldPoint.getX(), localPoint.getX())) {
                a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            } else if (lIlIIIllIlIIlll(worldPoint.getX(), localPoint.getX())) {
                a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            }
        }
        if (lIlIIIllIlIIIll(this.aD.equals(Direction.NORTH) ? 1 : 0)) {
            LocalPoint localPoint2 = new LocalPoint(lIIIllIlllIII[23], lIIIllIlllIII[24]);
            if (lIlIIIllIlIIIll(worldPoint.equals(new WorldPoint(localPoint2.getX(), localPoint2.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (lIlIIIllIlIIlIl(nearest.getOrientation(), lIIIllIlllIII[25])) {
                    a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[26]]);
                return;
            } else if (lIlIIIllIlIIllI(worldPoint.getX(), localPoint2.getX())) {
                a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            } else if (lIlIIIllIlIIlll(worldPoint.getX(), localPoint2.getX())) {
                a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            } else if (lIlIIIllIlIIllI(worldPoint.getY(), localPoint2.getY())) {
                a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            } else if (lIlIIIllIlIIlll(worldPoint.getY(), localPoint2.getY())) {
                a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                return;
            }
        }
        if (lIlIIIllIlIIIll(this.aD.equals(Direction.SOUTH) ? 1 : 0)) {
            LocalPoint localPoint3 = new LocalPoint(lIIIllIlllIII[18], lIIIllIlllIII[27]);
            if (lIlIIIllIlIIIll(worldPoint.equals(new WorldPoint(localPoint3.getX(), localPoint3.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (lIlIIIllIlIIIll(nearest.getOrientation())) {
                    a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[28]]);
                return;
            } else if (lIlIIIllIlIIllI(worldPoint.getX(), localPoint3.getX())) {
                a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                return;
            } else if (lIlIIIllIlIIlll(worldPoint.getX(), localPoint3.getX())) {
                a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
                return;
            } else if (lIlIIIllIlIIllI(worldPoint.getY(), localPoint3.getY())) {
                a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
                return;
            } else if (lIlIIIllIlIIlll(worldPoint.getY(), localPoint3.getY())) {
                a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
                return;
            }
        }
        if (lIlIIIllIlIIIll(this.aD.equals(Direction.WEST) ? 1 : 0)) {
            LocalPoint localPoint4 = new LocalPoint(lIIIllIlllIII[18], lIIIllIlllIII[27]);
            if (lIlIIIllIlIIIll(worldPoint.equals(new WorldPoint(localPoint4.getX(), localPoint4.getY(), lIIIllIlllIII[0])) ? 1 : 0)) {
                if (lIlIIIllIlIIIll(nearest.getOrientation())) {
                    a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
                }
                System.out.println(lIIIllIllIlIl[lIIIllIlllIII[29]]);
            } else if (lIlIIIllIlIIllI(worldPoint.getX(), localPoint4.getX())) {
                a(lIIIllIlllIII[2], lIIIllIlllIII[0]);
            } else if (lIlIIIllIlIIlll(worldPoint.getX(), localPoint4.getX())) {
                a(lIIIllIlllIII[22], lIIIllIlllIII[0]);
            } else if (lIlIIIllIlIIllI(worldPoint.getY(), localPoint4.getY())) {
                a(lIIIllIlllIII[0], lIIIllIlllIII[2]);
            } else if (lIlIIIllIlIIlll(worldPoint.getY(), localPoint4.getY())) {
                a(lIIIllIlllIII[0], lIIIllIlllIII[22]);
            }
        }
    }

    private void aN() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[83];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[85]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIIIllIlIIIll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllIlllIII[2]];
            iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[83];
            Inventory.getFirst(iArr2).useOn(nearest);
            sleep(lIIIllIlllIII[2]);
        }
    }

    private void aA() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[49];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[49];
        Inventory.getFirst(iArr2).interact(lIIIllIllIlIl[lIIIllIlllIII[38]]);
    }

    private void aL() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIII[80], lIIIllIlllIII[45], lIIIllIlllIII[0]);
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[81]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (!lIlIIIllIlIIIII(at) && lIlIIIllIlIIIll(Reachable.isInteractable((Locatable) at.get(lIIIllIlllIII[0])) ? 1 : 0)) {
            ((TileObject) at.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[82]]);
        }
    }

    private void bb() {
        if (lIlIIIllIlIIlIl(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIII[115])) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[14]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIIIllIlIIIII(nearest)) {
            Walker.walkTo(new WorldPoint(lIIIllIlllIII[116], lIIIllIlllIII[117], lIIIllIlllIII[0]));
            "".length();
        }
        nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[118]]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v304, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v317, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v320, types: [boolean] */
    public boolean run() {
        if (lIlIIIllIIlllll(this.aw.quest().equals(h.MISTHALIN_MYSTERY) ? 1 : 0)) {
            return lIIIllIlllIII[0];
        }
        int Q = Q();
        if (lIlIIIllIlIIIII(this.az)) {
            bc();
        }
        if (lIlIIIllIlIIIIl(Q, lIIIllIlllIII[1])) {
            return lIIIllIlllIII[0];
        }
        System.out.println("[MISTHALIN MYSTERY] - Current Progress: " + Q);
        switch (Q) {
            case 0:
                M();
                "".length();
                if (" ".length() < 0) {
                    return ((((48 + 206) - 224) + 219) ^ (((89 + 4) - 82) + 150)) & (((((87 + 60) - 38) + 135) ^ (((107 + 59) - 43) + 49)) ^ (-" ".length()));
                }
                break;
            case 5:
                M();
                "".length();
                if ((-" ".length()) >= (((((0 + 37) - (-104)) + 18) ^ (((123 + 170) - 235) + 133)) & (((((81 + 69) - 25) + 28) ^ (((130 + 9) - (-25)) + 21)) ^ (-" ".length())))) {
                    return ((((192 + 74) - 182) + 119) ^ (((40 + 24) - 33) + 100)) & (((76 ^ 43) ^ (177 ^ 158)) ^ (-" ".length()));
                }
                break;
            case 10:
                bb();
                ba();
                "".length();
                if (0 != 0) {
                    return ((34 ^ 14) ^ (190 ^ 158)) & (((((67 + 57) - (-41)) + 12) ^ (((179 + 182) - 358) + 186)) ^ (-" ".length()));
                }
                break;
            case 15:
                ba();
                aZ();
                P();
                "".length();
                if ("   ".length() == 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 20:
                P();
                aY();
                aX();
                "".length();
                if ((-" ".length()) >= ((83 ^ 120) ^ (121 ^ 86))) {
                    return ((30 ^ 89) ^ (((116 + 95) - 205) + 121)) & (((134 ^ 160) ^ (163 ^ 189)) ^ (-" ".length()));
                }
                break;
            case 25:
                P();
                aX();
                aW();
                "".length();
                if ((-"   ".length()) >= 0) {
                    return ((((90 + 102) - 77) + 62) ^ (((20 + 96) - 2) + 19)) & (((((202 + 153) - 255) + 144) ^ (((17 + 82) - 1) + 94)) ^ (-" ".length()));
                }
                break;
            case 30:
                aU();
                P();
                "".length();
                if ((-" ".length()) > (((((12 + 185) - 147) + 186) ^ (((171 + 190) - 356) + 187)) & (((23 ^ 6) ^ (62 ^ 3)) ^ (-" ".length())) & ((((((60 + 63) - 12) + 23) ^ (((39 + 78) - 25) + 50)) & (((35 ^ 27) ^ (135 ^ 183)) ^ (-" ".length()))) ^ (-" ".length())))) {
                    return ((((90 + 107) - 185) + 117) ^ (((53 + 107) - 144) + 142)) & (((167 ^ 132) ^ (89 ^ 101)) ^ (-" ".length()));
                }
                break;
            case 35:
                P();
                aT();
                aS();
                "".length();
                if (0 != 0) {
                    return ((169 ^ 172) ^ (58 ^ 46)) & (((((211 + 75) - 227) + 153) ^ (((159 + 4) - 118) + 152)) ^ (-" ".length()));
                }
                break;
            case 40:
                aV();
                aR();
                "".length();
                if ((-" ".length()) != (-" ".length())) {
                    return ((((45 + 14) - (-15)) + 59) ^ (((4 + 45) - (-107)) + 18)) & (((((58 + 28) - (-52)) + 29) ^ (((10 + 37) - (-3)) + 90)) ^ (-" ".length()));
                }
                break;
            case 45:
                P();
                aQ();
                aP();
                "".length();
                if ((((187 ^ 133) ^ (57 ^ 18)) & (((((101 + 105) - 25) + 0) ^ (((107 + 63) - 100) + 90)) ^ (-" ".length()))) != (((44 ^ 72) ^ (27 ^ 58)) & (((107 ^ 79) ^ (197 ^ 164)) ^ (-" ".length())))) {
                    return ((74 ^ 59) ^ (129 ^ 165)) & (((((117 + 145) - 139) + 85) ^ (((94 + 122) - 112) + 29)) ^ (-" ".length()));
                }
                break;
            case 50:
                aO();
                aN();
                "".length();
                if (" ".length() < " ".length()) {
                    return ((((47 + 32) - (-103)) + 5) ^ (((12 + 138) - 90) + 119)) & (((190 ^ 196) ^ (218 ^ 168)) ^ (-" ".length()));
                }
                break;
            case 55:
                aM();
                "".length();
                if ((-" ".length()) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 60:
                P();
                aL();
                "".length();
                if (" ".length() == 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 65:
                aK();
                aJ();
                P();
                b(lIIIllIlllIII[2]);
                "".length();
                if ((183 ^ 178) <= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 70:
                P();
                aI();
                aH();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 75:
                aG();
                aF();
                "".length();
                if ("  ".length() == (((((62 + 66) - 63) + 100) ^ (((68 + 172) - 163) + 107)) & (((((102 + 57) - 61) + 42) ^ (((34 + 33) - 60) + 138)) ^ (-" ".length())))) {
                    return ((((150 + 168) - 248) + 156) ^ (((111 + 37) - (-35)) + 3)) & (((42 ^ 52) ^ (71 ^ 1)) ^ (-" ".length()));
                }
                break;
            case 80:
                aE();
                aD();
                aC();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 85:
                P();
                ao();
                "".length();
                if (" ".length() == (-" ".length())) {
                    return ((70 ^ 23) ^ (73 ^ 48)) & (((24 ^ 14) ^ (98 ^ 92)) ^ (-" ".length()));
                }
                break;
            case 90:
                P();
                aB();
                aA();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 95:
                az();
                "".length();
                if ("   ".length() < "   ".length()) {
                    return ((((58 + 28) - 41) + 140) ^ (((87 + 134) - 137) + 68)) & (((194 ^ 180) ^ (239 ^ 184)) ^ (-" ".length()));
                }
                break;
            case 100:
                P();
                ay();
                ax();
                "".length();
                if ((-((((92 + 66) - 108) + 79) ^ (((25 + 105) - 105) + 107))) >= 0) {
                    return ((131 ^ 188) ^ (225 ^ 132)) & (((((34 + 124) - 122) + 169) ^ (((13 + 83) - (-25)) + 30)) ^ (-" ".length()));
                }
                break;
            case 105:
                ay();
                aw();
                "".length();
                if ("   ".length() == (((((141 + 118) - 230) + 122) ^ (((101 + 149) - 130) + 77)) & (((227 ^ 187) ^ (39 ^ 45)) ^ (-" ".length())))) {
                    return ((103 ^ 92) ^ (191 ^ 144)) & (((215 ^ 131) ^ (66 ^ 2)) ^ (-" ".length()));
                }
                break;
            case 110:
                aw();
                P();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 111:
                av();
                "".length();
                if ("  ".length() <= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 115:
                P();
                "".length();
                if ((-"  ".length()) >= 0) {
                    return ("   ".length() ^ (101 ^ 92)) & (((119 ^ 21) ^ (118 ^ 46)) ^ (-" ".length()));
                }
                break;
            case 120:
                at();
                as();
                ar();
                P();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 125:
                aq();
                P();
                "".length();
                if (((11 ^ 94) & ((30 ^ 75) ^ (-1))) > 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 130:
                ap();
                P();
                "".length();
                if ("  ".length() != "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            default:
                return lIIIllIlllIII[0];
        }
        return lIIIllIlllIII[2];
    }

    private static boolean lIlIIIllIlIIllI(int i, int i2) {
        return i > i2;
    }

    private void aq() {
        Movement.walkTo(new WorldPoint(lIIIllIlllIII[5], lIIIllIlllIII[6], lIIIllIlllIII[0]));
        "".length();
    }

    private void aB() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[49];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[50];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[51]]);
            return;
        }
        Walker.walkTo(nearest.getWorldLocation());
        "".length();
    }

    private void b(int i) {
        if (lIlIIIllIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        Dialog.chooseOption(i);
        "".length();
    }

    private void aQ() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIII[91], lIIIllIlllIII[92], lIIIllIlllIII[0]);
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[93]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (lIlIIIllIIlllll(Reachable.isInteractable((Locatable) at.get(lIIIllIlllIII[0])) ? 1 : 0)) {
            Walker.walkTo(((TileObject) at.get(lIIIllIlllIII[0])).getWorldLocation());
            "".length();
            return;
        }
        ((TileObject) at.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[94]]);
        sleep(lIIIllIlllIII[2]);
    }

    private void aV() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[48];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[104];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[105]]);
            return;
        }
        Walker.walkTo(nearest.getWorldLocation());
        "".length();
    }

    private int Q() {
        return Static.getClient().getVarbitValue(EnumC0001b.QUEST_MISTHALIN_MYSTERY.c());
    }

    private void aF() {
        if (lIlIIIllIlIIIII(Widgets.get(lIIIllIlllIII[62], lIIIllIlllIII[12]))) {
            return;
        }
        WidgetPackets.widgetAction(Widgets.get(lIIIllIlllIII[62], lIIIllIlllIII[46]), lIIIllIllIlIl[lIIIllIlllIII[63]]);
        WidgetPackets.widgetAction(Widgets.get(lIIIllIlllIII[62], lIIIllIlllIII[47]), lIIIllIllIlIl[lIIIllIlllIII[64]]);
        WidgetPackets.widgetAction(Widgets.get(lIIIllIlllIII[62], lIIIllIlllIII[53]), lIIIllIllIlIl[lIIIllIlllIII[65]]);
        WidgetPackets.widgetAction(Widgets.get(lIIIllIlllIII[62], lIIIllIlllIII[46]), lIIIllIllIlIl[lIIIllIlllIII[66]]);
    }

    private void M() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[119];
        NPC nearest = NPCs.getNearest(iArr);
        if (lIlIIIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
            DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlllIII[31]];
            dialogOptionArr[lIIIllIlllIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lIIIllIlllIII[9]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[11]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[13]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[17]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[26]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[28]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[29]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIlllIII[30]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
        }
        if (lIlIIIllIlIIlII(nearest)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[120]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIlllIII[121], lIIIllIlllIII[122], lIIIllIlllIII[0]));
        "".length();
    }

    private void aR() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[48];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIII[91], lIIIllIlllIII[92], lIIIllIlllIII[0]);
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[95]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (lIlIIIllIIlllll(Reachable.isInteractable((Locatable) at.get(lIIIllIlllIII[0])) ? 1 : 0)) {
            Walker.walkTo(((TileObject) at.get(lIIIllIlllIII[0])).getWorldLocation());
            "".length();
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[48];
        Inventory.getFirst(iArr2).useOn((TileObject) at.get(lIIIllIlllIII[0]));
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (lIlIIIllIlIlIII(graphicsObjectCreated.getGraphicsObject().getId(), lIIIllIlllIII[137])) {
            WorldPoint fromLocal = WorldPoint.fromLocal(this.ax, graphicsObjectCreated.getGraphicsObject().getLocation());
            int x = fromLocal.getX() % lIIIllIlllIII[14];
            int y = fromLocal.getY() % lIIIllIlllIII[14];
            WorldPoint worldPoint = new WorldPoint(x + lIIIllIlllIII[15], y + lIIIllIlllIII[16], lIIIllIlllIII[0]);
            if (lIlIIIllIlIIIll(worldPoint.equals(new WorldPoint(lIIIllIlllIII[134], lIIIllIlllIII[45], lIIIllIlllIII[0])) ? 1 : 0)) {
                this.aD = Direction.WEST;
            }
            if (lIlIIIllIlIIIll(worldPoint.equals(new WorldPoint(lIIIllIlllIII[23], lIIIllIlllIII[136], lIIIllIlllIII[0])) ? 1 : 0)) {
                this.aD = Direction.NORTH;
            }
            if (lIlIIIllIlIIIll(worldPoint.equals(new WorldPoint(lIIIllIlllIII[18], lIIIllIlllIII[125], lIIIllIlllIII[0])) ? 1 : 0)) {
                this.aD = Direction.SOUTH;
            }
            if (lIlIIIllIlIIIll(worldPoint.equals(new WorldPoint(lIIIllIlllIII[135], lIIIllIlllIII[19], lIIIllIlllIII[0])) ? 1 : 0)) {
                this.aD = Direction.EAST;
            }
            System.out.println("Setting active to " + this.aD.name());
        }
    }

    private void as() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[7];
        if (lIlIIIllIlIIIll(Equipment.contains(iArr) ? 1 : 0)) {
            System.out.println(lIIIllIllIlIl[lIIIllIlllIII[10]]);
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[7];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIlllIII[2]];
            iArr3[lIIIllIlllIII[0]] = lIIIllIlllIII[7];
            Inventory.getFirst(iArr3).interact(lIIIllIllIlIl[lIIIllIlllIII[11]]);
        }
    }

    private void az() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIII[41], lIIIllIlllIII[42], lIIIllIlllIII[0]);
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[47]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (!lIlIIIllIIlllll(Reachable.isInteractable((Locatable) at.get(lIIIllIlllIII[0])) ? 1 : 0)) {
            int[] iArr = new int[lIIIllIlllIII[2]];
            iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[48];
            Inventory.getFirst(iArr).useOn((TileObject) at.get(lIIIllIlllIII[0]));
            sleep(lIIIllIlllIII[2]);
        } else if (lIlIIIllIlIIlll(((TileObject) at.get(lIIIllIlllIII[0])).distanceTo(Players.getLocal().getWorldLocation()), lIIIllIlllIII[28])) {
            Walker.walkTo(((TileObject) at.get(lIIIllIlllIII[0])).getWorldLocation());
            "".length();
        } else {
            Walker.walkTo(new WorldPoint(lIIIllIlllIII[44], lIIIllIlllIII[45], lIIIllIlllIII[0]));
            "".length();
        }
    }

    private static void lIlIIIllIIllllI() {
        lIIIllIlllIII = new int[143];
        lIIIllIlllIII[0] = ((126 ^ 79) ^ (16 ^ 67)) & (((((212 + 80) - 272) + 214) ^ (((82 + 13) - (-30)) + 11)) ^ (-" ".length()));
        lIIIllIlllIII[1] = ((52 + 75) - 52) + 60;
        lIIIllIlllIII[2] = " ".length();
        lIIIllIlllIII[3] = (-((-1791) & 30719)) & (-2084) & 32639;
        lIIIllIlllIII[4] = (-((-9283) & 27987)) & (-3) & 23547;
        lIIIllIlllIII[5] = (-6404) & 16359;
        lIIIllIlllIII[6] = (-5185) & 8141;
        lIIIllIlllIII[7] = (-((-25161) & 26621)) & (-10241) & 32759;
        lIIIllIlllIII[8] = (-(184 ^ 149)) & (-8705) & 16383;
        lIIIllIlllIII[9] = "  ".length();
        lIIIllIlllIII[10] = "   ".length();
        lIIIllIlllIII[11] = 89 ^ 93;
        lIIIllIlllIII[12] = (212 ^ 180) ^ (124 ^ 25);
        lIIIllIlllIII[13] = 129 ^ 135;
        lIIIllIlllIII[14] = (41 ^ 4) ^ (226 ^ 143);
        lIIIllIlllIII[15] = (-27043) & 28642;
        lIIIllIlllIII[16] = (-((-23266) & 24575)) & (-26627) & 32735;
        lIIIllIlllIII[17] = (191 ^ 195) ^ (66 ^ 57);
        lIIIllIlllIII[18] = (-((-1187) & 15786)) & (-1) & 16223;
        lIIIllIlllIII[19] = (-26913) & 31743;
        lIIIllIlllIII[20] = (-6414) & 7949;
        lIIIllIlllIII[21] = 206 ^ 198;
        lIIIllIlllIII[22] = -" ".length();
        lIIIllIlllIII[23] = (-6530) & 8151;
        lIIIllIlllIII[24] = (-8482) & 13311;
        lIIIllIlllIII[25] = (-8519) & 9542;
        lIIIllIlllIII[26] = (230 ^ 147) ^ (216 ^ 164);
        lIIIllIlllIII[27] = (-2081) & 6909;
        lIIIllIlllIII[28] = (5 ^ 21) ^ (60 ^ 38);
        lIIIllIlllIII[29] = (74 ^ 107) ^ (126 ^ 84);
        lIIIllIlllIII[30] = (118 ^ 100) ^ (59 ^ 37);
        lIIIllIlllIII[31] = 77 ^ 64;
        lIIIllIlllIII[32] = (-((-26113) & 28481)) & (-1) & 23423;
        lIIIllIlllIII[33] = (-((-4745) & 32413)) & (-4545) & 32767;
        lIIIllIlllIII[34] = (194 ^ 182) ^ (68 ^ 35);
        lIIIllIlllIII[35] = (40 ^ 2) ^ (122 ^ 94);
        lIIIllIlllIII[36] = (((84 + 119) - 155) + 128) ^ (((171 + 116) - 283) + 187);
        lIIIllIlllIII[37] = (((118 + 20) - (-41)) + 7) ^ (((91 + 4) - (-60)) + 15);
        lIIIllIlllIII[38] = 168 ^ 191;
        lIIIllIlllIII[39] = 104 ^ 121;
        lIIIllIlllIII[40] = 96 ^ 114;
        lIIIllIlllIII[41] = (-((-1651) & 28531)) & (-17) & 28543;
        lIIIllIlllIII[42] = (-((-22657) & 32137)) & (-16385) & 30699;
        lIIIllIlllIII[43] = 10 ^ 30;
        lIIIllIlllIII[44] = (-10641) & 12279;
        lIIIllIlllIII[45] = (-11266) & 16093;
        lIIIllIlllIII[46] = 28 ^ 9;
        lIIIllIlllIII[47] = (58 ^ 61) ^ (168 ^ 185);
        lIIIllIlllIII[48] = (-4105) & 5050;
        lIIIllIlllIII[49] = (-2345) & 23402;
        lIIIllIlllIII[50] = (-((-16435) & 17471)) & (-1) & 30684;
        lIIIllIlllIII[51] = 167 ^ 191;
        lIIIllIlllIII[52] = (-11394) & 32447;
        lIIIllIlllIII[53] = 7 ^ 30;
        lIIIllIlllIII[54] = 188 ^ 166;
        lIIIllIlllIII[55] = (-4225) & 5873;
        lIIIllIlllIII[56] = (-14735) & 16382;
        lIIIllIlllIII[57] = (-525) & 30655;
        lIIIllIlllIII[58] = 18 ^ 9;
        lIIIllIlllIII[59] = 161 ^ 189;
        lIIIllIlllIII[60] = (29 ^ 99) ^ (7 ^ 100);
        lIIIllIlllIII[61] = 83 ^ 77;
        lIIIllIlllIII[62] = (-((-8787) & 32727)) & (-2) & 24495;
        lIIIllIlllIII[63] = 66 ^ 93;
        lIIIllIlllIII[64] = 143 ^ 175;
        lIIIllIlllIII[65] = 126 ^ 95;
        lIIIllIlllIII[66] = 85 ^ 119;
        lIIIllIlllIII[67] = 2 ^ 33;
        lIIIllIlllIII[68] = (((6 + 82) - (-34)) + 12) ^ (((60 + 59) - 103) + 146);
        lIIIllIlllIII[69] = (120 ^ 100) ^ (15 ^ 54);
        lIIIllIlllIII[70] = (-1153) & 22209;
        lIIIllIlllIII[71] = 72 ^ 110;
        lIIIllIlllIII[72] = (-29733) & 31999;
        lIIIllIlllIII[73] = (((112 + 30) - 102) + 93) ^ (((120 + 6) - 62) + 98);
        lIIIllIlllIII[74] = (-2338) & 3967;
        lIIIllIlllIII[75] = (-1291) & 6139;
        lIIIllIlllIII[76] = 237 ^ 197;
        lIIIllIlllIII[77] = 8 ^ 33;
        lIIIllIlllIII[78] = (((178 + 181) - 189) + 17) ^ (((2 + 63) - 33) + 113);
        lIIIllIlllIII[79] = 67 ^ 104;
        lIIIllIlllIII[80] = (-((-68) & 31047)) & (-21) & 32639;
        lIIIllIlllIII[81] = (17 ^ 121) ^ (27 ^ 95);
        lIIIllIlllIII[82] = (((129 + 90) - 84) + 7) ^ (((111 + 21) - 109) + 140);
        lIIIllIlllIII[83] = (-((-4177) & 6514)) & (-16529) & 19455;
        lIIIllIlllIII[84] = (151 ^ 182) ^ (187 ^ 180);
        lIIIllIlllIII[85] = 168 ^ 135;
        lIIIllIlllIII[86] = (-((-2114) & 2687)) & (-1) & 30719;
        lIIIllIlllIII[87] = (191 ^ 179) ^ (160 ^ 156);
        lIIIllIlllIII[88] = (-((-17447) & 27943)) & (-65) & 31613;
        lIIIllIlllIII[89] = 160 ^ 145;
        lIIIllIlllIII[90] = 152 ^ 170;
        lIIIllIlllIII[91] = (-((-7749) & 16071)) & (-4361) & 14314;
        lIIIllIlllIII[92] = (-18449) & 23281;
        lIIIllIlllIII[93] = (27 ^ 107) ^ (25 ^ 90);
        lIIIllIlllIII[94] = 124 ^ 72;
        lIIIllIlllIII[95] = 139 ^ 190;
        lIIIllIlllIII[96] = (-((-1601) & 2046)) & (-11265) & 32765;
        lIIIllIlllIII[97] = 81 ^ 103;
        lIIIllIlllIII[98] = (-((-23063) & 31287)) & (-16385) & 26874;
        lIIIllIlllIII[99] = (54 ^ 100) ^ (58 ^ 95);
        lIIIllIlllIII[100] = (-((-2561) & 27405)) & (-17) & 26495;
        lIIIllIlllIII[101] = (-19466) & 24303;
        lIIIllIlllIII[102] = 191 ^ 135;
        lIIIllIlllIII[103] = (35 ^ 49) ^ (156 ^ 183);
        lIIIllIlllIII[104] = (-2601) & 32745;
        lIIIllIlllIII[105] = 66 ^ 120;
        lIIIllIlllIII[106] = (-((-16913) & 26323)) & (-258) & 30719;
        lIIIllIlllIII[107] = (246 ^ 164) ^ (254 ^ 151);
        lIIIllIlllIII[108] = 11 ^ 55;
        lIIIllIlllIII[109] = (-(106 ^ 127)) & (-16451) & 18399;
        lIIIllIlllIII[110] = 253 ^ 192;
        lIIIllIlllIII[111] = (-((-1537) & 13843)) & (-16417) & 30647;
        lIIIllIlllIII[112] = 251 ^ 197;
        lIIIllIlllIII[113] = (-2561) & 32707;
        lIIIllIlllIII[114] = 130 ^ 189;
        lIIIllIlllIII[115] = (-2381) & 15229;
        lIIIllIlllIII[116] = (-(59 ^ 50)) & (-24913) & 28159;
        lIIIllIlllIII[117] = (-12593) & 15735;
        lIIIllIlllIII[118] = 95 ^ 30;
        lIIIllIlllIII[119] = (-16417) & 24039;
        lIIIllIlllIII[120] = (71 ^ 15) ^ (159 ^ 149);
        lIIIllIlllIII[121] = (-25106) & 28343;
        lIIIllIlllIII[122] = (-((-21591) & 30719)) & (-20485) & 32767;
        lIIIllIlllIII[123] = (-20513) & 22191;
        lIIIllIlllIII[124] = (-26627) & 31471;
        lIIIllIlllIII[125] = (-19747) & 24571;
        lIIIllIlllIII[126] = (-((-22133) & 32630)) & (-20609) & 32759;
        lIIIllIlllIII[127] = (-18697) & 23548;
        lIIIllIlllIII[128] = (-((-4609) & 23197)) & (-2) & 20223;
        lIIIllIlllIII[129] = (-10519) & 15358;
        lIIIllIlllIII[130] = (-31105) & 32735;
        lIIIllIlllIII[131] = (-((-5963) & 16203)) & (-1025) & 16111;
        lIIIllIlllIII[132] = (-28821) & 30453;
        lIIIllIlllIII[133] = (-((-1025) & 3330)) & (-25609) & 32763;
        lIIIllIlllIII[134] = (-((-8011) & 32751)) & (-6409) & 32767;
        lIIIllIlllIII[135] = (-((-5145) & 15805)) & (-16385) & 28671;
        lIIIllIlllIII[136] = (-((-21217) & 32765)) & (-2) & 16383;
        lIIIllIlllIII[137] = (-31753) & 32235;
        lIIIllIlllIII[138] = (((((36 + 51) - 53) + 102) + (36 ^ 66)) - (36 ^ 27)) + (229 ^ 194);
        lIIIllIlllIII[139] = 61 ^ 126;
        lIIIllIlllIII[140] = 76 ^ 8;
        lIIIllIlllIII[141] = (178 ^ 138) ^ (111 ^ 18);
        lIIIllIlllIII[142] = (91 ^ 23) ^ (157 ^ 151);
    }

    private void aU() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIII[100], lIIIllIlllIII[101], lIIIllIlllIII[0]);
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[102]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (lIlIIIllIlIIIll(Reachable.isInteractable((Locatable) at.get(lIIIllIlllIII[0])) ? 1 : 0)) {
            ((TileObject) at.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[103]]);
        }
    }

    private void aZ() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[111];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0) || lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            return tileObject.getName().contains(lIIIllIllIlIl[lIIIllIlllIII[139]]);
        });
        if (lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(nearest.getWorldLocation());
            "".length();
        }
        nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[112]]);
    }

    private static boolean lIlIIIllIlIIIll(int i) {
        return i != 0;
    }

    private void au() {
        WorldPoint fromLocal = WorldPoint.fromLocal(this.ax, Players.getLocal().getLocalLocation());
        int x = fromLocal.getX() % lIIIllIlllIII[14];
        int y = fromLocal.getY() % lIIIllIlllIII[14];
        System.out.println("Local point: " + String.valueOf(new WorldPoint(x + lIIIllIlllIII[15], y + lIIIllIlllIII[16], lIIIllIlllIII[0])));
    }

    private void a(int i, int i2) {
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[30]];
        NPC nearest = NPCs.getNearest(strArr);
        WorldPoint worldLocation = nearest.getWorldLocation();
        if (!lIlIIIllIlIIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(worldLocation.getX() + i, worldLocation.getY() + i2, lIIIllIlllIII[0])))) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[31]]);
            return;
        }
        Walker.walkTo(new WorldPoint(worldLocation.getX() + i, worldLocation.getY() + i2, lIIIllIlllIII[0]));
        "".length();
    }

    private static void lIlIIIllIIllIlI() {
        lIIIllIllIlIl = new String[lIIIllIlllIII[142]];
        lIIIllIllIlIl[lIIIllIlllIII[0]] = lIlIIIllIIIllIl("GDEeIhY=", "UPpFo");
        lIIIllIllIlIl[lIIIllIlllIII[2]] = lIlIIIllIIIlllI("3QdA8l0KIf4=", "pKekv");
        lIIIllIllIlIl[lIIIllIlllIII[9]] = lIlIIIllIIIlllI("nWNfXA0vgZY=", "VRajo");
        lIIIllIllIlIl[lIIIllIlllIII[10]] = lIlIIIllIIIllIl("DiN4JiM8Zi8iMCsvNiBxMigxITQ=", "YFXGQ");
        lIIIllIllIlIl[lIIIllIlllIII[11]] = lIlIIIllIIIlllI("6nkp5IaqdMY=", "dKMIf");
        lIIIllIllIlIl[lIIIllIlllIII[12]] = lIlIIIllIIIllIl("MjE8LzwLfyNjMhcxNiY=", "yXPCY");
        lIIIllIllIlIl[lIIIllIlllIII[13]] = lIlIIIllIIIlllI("VL3SqR1auFI=", "MgPVi");
        lIIIllIllIlIl[lIIIllIlllIII[17]] = lIlIIIllIIIllIl("PDMxJi0D", "qZCTB");
        lIIIllIllIlIl[lIIIllIlllIII[21]] = lIlIIIllIIIllIl("EDcGJFYkORMhBT4+Di0SeQ==", "WXgHv");
        lIIIllIllIlIl[lIIIllIlllIII[26]] = lIlIIIllIIIllIl("KAQiGnkcCjcfKgYNKhM9QQ==", "okCvY");
        lIIIllIllIlIl[lIIIllIlllIII[28]] = lIlIIIllIIIllll("Up/fQxhVwu/MlhBcZXf1SdeU6MCAGToJ", "SpBeC");
        lIIIllIllIlIl[lIIIllIlllIII[29]] = lIlIIIllIIIllIl("Agk7P1U2By46BiwAMzYRaw==", "EfZSu");
        lIIIllIllIlIl[lIIIllIlllIII[30]] = lIlIIIllIIIlllI("1kpKs1OaNiI=", "FuOpU");
        lIIIllIllIlIl[lIIIllIlllIII[31]] = lIlIIIllIIIlllI("EVaSZD1rCy0=", "nznKV");
        lIIIllIllIlIl[lIIIllIlllIII[35]] = lIlIIIllIIIllll("VteTeuA3veV3xoMsaSRKMg==", "tPklx");
        lIIIllIllIlIl[lIIIllIlllIII[36]] = lIlIIIllIIIllIl("BR8aGy4+RRcGLDsHHQs=", "VhsoM");
        lIIIllIllIlIl[lIIIllIlllIII[37]] = lIlIIIllIIIllIl("Fh8aDBYtRQkdGzwcFg==", "Ehsxu");
        lIIIllIllIlIl[lIIIllIlllIII[39]] = lIlIIIllIIIlllI("cIdYh+iLGSSCgyQ87iZy5A==", "mxLJY");
        lIIIllIllIlIl[lIIIllIlllIII[40]] = lIlIIIllIIIlllI("K/gLlh2BVyJEX6OQWl7PTA==", "DrEzP");
        lIIIllIllIlIl[lIIIllIlllIII[34]] = lIlIIIllIIIlllI("lqL3vh9O3+HMWd0igkHSNg==", "LSfxS");
        lIIIllIllIlIl[lIIIllIlllIII[43]] = lIlIIIllIIIllIl("DgQ9ATwkDCwB", "HmOdL");
        lIIIllIllIlIl[lIIIllIlllIII[46]] = lIlIIIllIIIlllI("pNVNrWN00Hc=", "KpCAP");
        lIIIllIllIlIl[lIIIllIlllIII[47]] = lIlIIIllIIIlllI("hEyv+vPcabF2TltN3EUgJQ==", "pQLBI");
        lIIIllIllIlIl[lIIIllIlllIII[38]] = lIlIIIllIIIllll("dOBHfTSMWNI=", "fBnHR");
        lIIIllIllIlIl[lIIIllIlllIII[51]] = lIlIIIllIIIllll("KJpniJXfAKA=", "bxwmD");
        lIIIllIllIlIl[lIIIllIlllIII[53]] = lIlIIIllIIIllll("tOYLS4BnbFOuUclr8Jl1Hw==", "GaDFr");
        lIIIllIllIlIl[lIIIllIlllIII[54]] = lIlIIIllIIIllll("tyN3drI07CMw1T28+0v8zg==", "ZttWI");
        lIIIllIllIlIl[lIIIllIlllIII[58]] = lIlIIIllIIIlllI("2TUyFJNh1mQ=", "pZPGP");
        lIIIllIllIlIl[lIIIllIlllIII[59]] = lIlIIIllIIIllIl("BSwTOyU=", "UErUJ");
        lIIIllIllIlIl[lIIIllIlllIII[60]] = lIlIIIllIIIllIl("PTQwGRIG", "nQQkq");
        lIIIllIllIlIl[lIIIllIlllIII[61]] = lIlIIIllIIIllll("rVPvzSv9e4w=", "YexDl");
        lIIIllIllIlIl[lIIIllIlllIII[63]] = lIlIIIllIIIllll("7jwM2BbwESs=", "ilFZS");
        lIIIllIllIlIl[lIIIllIlllIII[64]] = lIlIIIllIIIlllI("j7q9pcDS2yw=", "FCVod");
        lIIIllIllIlIl[lIIIllIlllIII[65]] = lIlIIIllIIIllIl("HwggNFsu", "OdAMv");
        lIIIllIllIlIl[lIIIllIlllIII[66]] = lIlIIIllIIIllll("GFc7C4pFrf4=", "bjCYP");
        lIIIllIllIlIl[lIIIllIlllIII[67]] = lIlIIIllIIIllIl("FAwqPjc=", "DeKPX");
        lIIIllIllIlIl[lIIIllIlllIII[68]] = lIlIIIllIIIllll("TDyTxgqwjgM=", "CptwZ");
        lIIIllIllIlIl[lIIIllIlllIII[69]] = lIlIIIllIIIllIl("FTwvGg==", "EPNcD");
        lIIIllIllIlIl[lIIIllIlllIII[71]] = lIlIIIllIIIlllI("AcQfTuf3n+4=", "VmpFn");
        lIIIllIllIlIl[lIIIllIlllIII[73]] = lIlIIIllIIIllll("SlKIJY0Zss4=", "QPlbf");
        lIIIllIllIlIl[lIIIllIlllIII[76]] = lIlIIIllIIIllIl("MD0HAnEAKgMD", "tXffQ");
        lIIIllIllIlIl[lIIIllIlllIII[77]] = lIlIIIllIIIllll("JmXpyAH9nGY=", "RALpf");
        lIIIllIllIlIl[lIIIllIlllIII[78]] = lIlIIIllIIIllll("OoHvteypm+/IdK2qzlaJrg==", "XbvXD");
        lIIIllIllIlIl[lIIIllIlllIII[79]] = lIlIIIllIIIllIl("GSQkPic=", "ZHMSE");
        lIIIllIllIlIl[lIIIllIlllIII[81]] = lIlIIIllIIIllll("NXAukjzUe/Q=", "rtIor");
        lIIIllIllIlIl[lIIIllIlllIII[82]] = lIlIIIllIIIllll("feMbZTnglaE=", "fkiKn");
        lIIIllIllIlIl[lIIIllIlllIII[84]] = lIlIIIllIIIllll("gHlZtVxtVYM=", "pPzMh");
        lIIIllIllIlIl[lIIIllIlllIII[85]] = lIlIIIllIIIlllI("+Z3vLnFGT+aCbZyD9qpIgQ==", "jKTEV");
        lIIIllIllIlIl[lIIIllIlllIII[87]] = lIlIIIllIIIllIl("IioAKkICIgUrCgQpBDc=", "vKkOo");
        lIIIllIllIlIl[lIIIllIlllIII[89]] = lIlIIIllIIIlllI("OoEnpkfSVZ4=", "axanp");
        lIIIllIllIlIl[lIIIllIlllIII[90]] = lIlIIIllIIIllll("4epUtoAOyUc=", "kTGPy");
        lIIIllIllIlIl[lIIIllIlllIII[93]] = lIlIIIllIIIlllI("cWSatTZAdFBDnP8mE94qbg==", "VqplW");
        lIIIllIllIlIl[lIIIllIlllIII[94]] = lIlIIIllIIIlllI("MCyjhxzuhNU=", "YXJQU");
        lIIIllIllIlIl[lIIIllIlllIII[95]] = lIlIIIllIIIlllI("06489GofHLjtnHvjxAkVqg==", "wntWW");
        lIIIllIllIlIl[lIIIllIlllIII[97]] = lIlIIIllIIIllll("cBCgAshb/W4=", "ItUyW");
        lIIIllIllIlIl[lIIIllIlllIII[99]] = lIlIIIllIIIlllI("0XRC5HR0C6g=", "NGlkZ");
        lIIIllIllIlIl[lIIIllIlllIII[102]] = lIlIIIllIIIllIl("HiAYIA==", "ZOwRc");
        lIIIllIllIlIl[lIIIllIlllIII[103]] = lIlIIIllIIIllIl("AwQ/FA==", "LtZzY");
        lIIIllIllIlIl[lIIIllIlllIII[105]] = lIlIIIllIIIllll("XkfG0oicYTrkN1Ydv0tU+A==", "DOWHe");
        lIIIllIllIlIl[lIIIllIlllIII[107]] = lIlIIIllIIIllIl("Hi0XMDFyKAo4Jg==", "RLeWT");
        lIIIllIllIlIl[lIIIllIlllIII[108]] = lIlIIIllIIIlllI("28Fif7xaGTo=", "AgPhQ");
        lIIIllIllIlIl[lIIIllIlllIII[110]] = lIlIIIllIIIlllI("BfSEPzxXbkA=", "KLrED");
        lIIIllIllIlIl[lIIIllIlllIII[112]] = lIlIIIllIIIlllI("GwjXIbOiKnw=", "pqheS");
        lIIIllIllIlIl[lIIIllIlllIII[114]] = lIlIIIllIIIlllI("tvz8xKAbMYE=", "FBQGh");
        lIIIllIllIlIl[lIIIllIlllIII[14]] = lIlIIIllIIIllll("xiiI7Ks0wiU=", "jviKh");
        lIIIllIllIlIl[lIIIllIlllIII[118]] = lIlIIIllIIIllIl("LS4GAgE=", "oAgpe");
        lIIIllIllIlIl[lIIIllIlllIII[120]] = lIlIIIllIIIllIl("BQsLAHUlBQ==", "QjgkX");
        lIIIllIllIlIl[lIIIllIlllIII[139]] = lIlIIIllIIIlllI("yUyvu1w9BaSaQeVwhKCwgw==", "pLlJW");
        lIIIllIllIlIl[lIIIllIlllIII[140]] = lIlIIIllIIIllIl("OwFEByc9CRMUMjEV", "TgduF");
        lIIIllIllIlIl[lIIIllIlllIII[141]] = lIlIIIllIIIllIl("ATgGPw4v", "CYtMk");
    }

    private void ay() {
        if (!lIlIIIllIIlllll(Dialog.canContinue() ? 1 : 0) || lIlIIIllIlIIlII(Widgets.get(lIIIllIlllIII[33], lIIIllIlllIII[2]))) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[32];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlllIII[41], lIIIllIlllIII[42], lIIIllIlllIII[0]);
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[43]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (!lIlIIIllIIlllll(Reachable.isInteractable((Locatable) at.get(lIIIllIlllIII[0])) ? 1 : 0)) {
            ((TileObject) at.get(lIIIllIlllIII[0])).interact(lIIIllIllIlIl[lIIIllIlllIII[46]]);
            sleep(lIIIllIlllIII[2]);
        } else if (lIlIIIllIlIIlll(((TileObject) at.get(lIIIllIlllIII[0])).distanceTo(Players.getLocal().getWorldLocation()), lIIIllIlllIII[28])) {
            Walker.walkTo(((TileObject) at.get(lIIIllIlllIII[0])).getWorldLocation());
            "".length();
        } else {
            Walker.walkTo(new WorldPoint(lIIIllIlllIII[44], lIIIllIlllIII[45], lIIIllIlllIII[0]));
            "".length();
        }
    }

    private void ap() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[0]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlIIIllIlIIlII(nearest)) {
            if (!lIlIIIllIlIIIll(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Movement.walkTo(new WorldPoint(lIIIllIlllIII[5], lIIIllIlllIII[6], lIIIllIlllIII[0]));
                "".length();
                return;
            }
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[2]]);
            "".length();
            if (0 != 0) {
            }
        }
    }

    private void aW() {
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[106];
        if (lIlIIIllIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[107]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIIIllIlIIIll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[108]]);
        }
    }

    private static boolean lIlIIIllIlIlIII(int i, int i2) {
        return i == i2;
    }

    private void at() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[7];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lIIIllIlllIII[2]];
        strArr[lIIIllIlllIII[0]] = lIIIllIllIlIl[lIIIllIlllIII[12]];
        TileItem nearest = TileItems.getNearest(strArr);
        if (lIlIIIllIlIIIII(nearest)) {
            return;
        }
        if (!lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[13]]);
            return;
        }
        Walker.walkTo(nearest.getWorldLocation());
        "".length();
    }

    private static boolean lIlIIIllIIlllll(int i) {
        return i == 0;
    }

    static {
        lIlIIIllIIllllI();
        lIlIIIllIIllIlI();
    }

    private static boolean lIlIIIllIlIIIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIllIlIIlll(int i, int i2) {
        return i < i2;
    }

    private void ba() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[111];
        if (lIlIIIllIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[113];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!lIlIIIllIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[114]]);
            return;
        }
        Walker.walkTo(nearest.getWorldLocation());
        "".length();
    }

    private static String lIlIIIllIIIlllI(String lllllllllllllllIIIIIllllIIllIlll, String lllllllllllllllIIIIIllllIIllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllllIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIllllIIlllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIllllIIlllIIl.init(lIIIllIlllIII[9], secretKeySpec);
            return new String(lllllllllllllllIIIIIllllIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllllIIlllIII) {
            lllllllllllllllIIIIIllllIIlllIII.printStackTrace();
            return null;
        }
    }

    private void ar() {
        if (lIlIIIllIlIIIll(Dialog.canContinue() ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIllIlllIII[2]];
        iArr[lIIIllIlllIII[0]] = lIIIllIlllIII[7];
        if (lIlIIIllIIlllll(Equipment.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlllIII[2]];
        iArr2[lIIIllIlllIII[0]] = lIIIllIlllIII[8];
        NPC nearest = NPCs.getNearest(iArr2);
        if (lIlIIIllIlIIlII(nearest) && lIlIIIllIlIIIll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIllIllIlIl[lIIIllIlllIII[9]]);
            sleep(lIIIllIlllIII[9]);
        }
    }
}
