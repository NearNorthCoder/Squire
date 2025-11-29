/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Picking up an item")
public class bp
extends Task {
    private static /* synthetic */ int[] lIlIllllI;
    @Inject
    private /* synthetic */ SquireQuestHelper fK;
    private static /* synthetic */ String[] lIlIlllIl;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        int lIlllllIIlIIlIl;
        block8: {
            block7: {
                bp lIlllllIIlIIlll;
                String string = this.fK.cz();
                if (bp.lIIllIlIIIl(string.equals(lIlIlllIl[lIlIllllI[0]]) ? 1 : 0)) {
                    return lIlIllllI[0];
                }
                lIlllllIIlIIlIl = lIlllllIIlIIlll.fK.cJ();
                if (bp.lIIllIlIIlI(lIlllllIIlIIlIl, lIlIllllI[1])) {
                    return lIlIllllI[0];
                }
                int[] nArray = new int[lIlIllllI[2]];
                nArray[bp.lIlIllllI[0]] = lIlllllIIlIIlIl;
                if (!bp.lIIllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray2 = new int[lIlIllllI[2]];
                nArray2[bp.lIlIllllI[0]] = lIlllllIIlIIlIl;
                if (!bp.lIIllIlIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block8;
            }
            return lIlIllllI[0];
        }
        int[] nArray = new int[lIlIllllI[2]];
        nArray[bp.lIlIllllI[0]] = lIlllllIIlIIlIl;
        TileItem lIlllllIIlIIlII = TileItems.getNearest((int[])nArray);
        if (bp.lIIllIlIlII(lIlllllIIlIIlII)) {
            return lIlIllllI[0];
        }
        if (bp.lIIllIlIIIl(Reachable.isInteractable((Locatable)lIlllllIIlIIlII) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)lIlllllIIlIIlII.getWorldLocation());
            "".length();
            return lIlIllllI[2];
        }
        var3_3.interact(lIlIlllIl[lIlIllllI[2]]);
        return lIlIllllI[2];
    }

    private static boolean lIIllIlIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIllIIlllI(String lIlllllIIIllIIl, String lIlllllIIIllIII) {
        lIlllllIIIllIIl = new String(Base64.getDecoder().decode(lIlllllIIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllllIIIlIlll = new StringBuilder();
        char[] lIlllllIIIlIllI = lIlllllIIIllIII.toCharArray();
        int lIlllllIIIlIlIl = lIlIllllI[0];
        char[] lIlllllIIIIllll = lIlllllIIIllIIl.toCharArray();
        int lIlllllIIIIlllI = lIlllllIIIIllll.length;
        int lIlllllIIIIllIl = lIlIllllI[0];
        while (bp.lIIllIlIlIl(lIlllllIIIIllIl, lIlllllIIIIlllI)) {
            char lIlllllIIIllIlI = lIlllllIIIIllll[lIlllllIIIIllIl];
            lIlllllIIIlIlll.append((char)(lIlllllIIIllIlI ^ lIlllllIIIlIllI[lIlllllIIIlIlIl % lIlllllIIIlIllI.length]));
            "".length();
            ++lIlllllIIIlIlIl;
            ++lIlllllIIIIllIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIlllllIIIlIlll);
    }

    private static boolean lIIllIlIlII(Object object) {
        return object == null;
    }

    private static void lIIllIlIIII() {
        lIlIllllI = new int[4];
        bp.lIlIllllI[0] = (0x20 ^ 0x2A) & ~(0x47 ^ 0x4D);
        bp.lIlIllllI[1] = -" ".length();
        bp.lIlIllllI[2] = " ".length();
        bp.lIlIllllI[3] = "  ".length();
    }

    private static void lIIllIIllll() {
        lIlIlllIl = new String[lIlIllllI[3]];
        bp.lIlIlllIl[bp.lIlIllllI[0]] = bp.lIIllIIlllI("FTEcAg09MQwyETQnHDAQNCQ=", "QThcd");
        bp.lIlIlllIl[bp.lIlIllllI[2]] = bp.lIIllIIlllI("EAUvHQ==", "DdDxa");
    }

    private static boolean lIIllIlIIIl(int n2) {
        return n2 == 0;
    }

    static {
        bp.lIIllIlIIII();
        bp.lIIllIIllll();
    }
}

