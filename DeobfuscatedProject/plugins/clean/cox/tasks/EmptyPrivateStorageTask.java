/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Empty Private Storage", priority=2147483546, blocking=true)
public class EmptyPrivateStorageTask
extends CoxTaskBase {

    private final  int ds = 0xF0000A;

    static {
        au.llIlllIIIIIlll();
        au.llIlllIIIIIllI();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        if (au.llIlllIIIlIIll(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bn() ? 1 : 0)) {
            return lIlIlIIIlIlI[1];
        }
        if (au.llIlllIIIlIlII(D.bC().bH() ? 1 : 0)) {
            return lIlIlIIIlIlI[1];
        }
        Widget var1 = Widgets.get((int)lIlIlIIIlIlI[2], widget -> {
            String[] stringArray = new String[lIlIlIIIlIlI[3]];
            stringArray[au.lIlIlIIIlIlI[1]] = lIlIlIIIlIIl[lIlIlIIIlIlI[17]];
            return widget.hasAction(stringArray);
        });
        if (au.llIlllIIIlIlIl(var1) && au.llIlllIIIlIlII(var1.isVisible() ? 1 : 0)) {
            var1.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[1]]);
            return lIlIlIIIlIlI[3];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (au.llIlllIIIlIlII(tileObject.getName().contains(lIlIlIIIlIIl[lIlIlIIIlIlI[15]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIlIlI[3]];
                stringArray[au.lIlIlIIIlIlI[1]] = lIlIlIIIlIIl[lIlIlIIIlIlI[16]];
                if (au.llIlllIIIlIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIIlIlI[3];

                    if ((0x34 ^ 0x49 ^ (0x5A ^ 0x23)) >= 2) return n2 != 0;
                    return ((0x52 ^ 0x4A ^ (9 ^ 0x20)) & (47 + 60 - 5 + 79 ^ 83 + 49 - 43 + 43 ^ -1)) != 0;
                }
            }
            n2 = lIlIlIIIlIlI[1];
            return n2 != 0;
        });
        if (au.llIlllIIIlIllI(var2)) {
            au var3;
            Movement.walkTo((WorldPoint)var3.cy);

            return lIlIlIIIlIlI[1];
        }
        var2_2.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[3]]);
        return lIlIlIIIlIlI[3];
    }

    private static void llIlllIIIIIllI() {
        lIlIlIIIlIIl = new String[lIlIlIIIlIlI[18]];
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[1]] = "Bank all";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[3]] = "Enter";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[5]] = "Accept";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[6]] = "Choose again";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[7]] = "Accept";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[10]] = "Herblore";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[11]] = "Confirm";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[14]] = "Commune";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[15]] = "Chambers of Xeric";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[16]] = "Enter";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[17]] = "Bank all";
    }

        return String.valueOf(var4);
    }

    public EmptyPrivateStorageTask() {
        this.ds = lIlIlIIIlIlI[0];
    }

    private static boolean llIlllIIIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllIIIlIlIl(Object object) {
        return object != null;
    }

    private static boolean llIlllIIIlIIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cs() {
        void var3_4;
        int[] nArray = new int[lIlIlIIIlIlI[3]];
        nArray[au.lIlIlIIIlIlI[1]] = lIlIlIIIlIlI[4];
        if (au.llIlllIIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIlIIIlIlI[1];
        }
        if (au.llIlllIIIlIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIlIIIlIlI[3];
        }
        if (au.llIlllIIIlIlII(Dialog.isViewingOptions() ? 1 : 0) && au.llIlllIIIlIlII(Dialog.hasOption((String)lIlIlIIIlIIl[lIlIlIIIlIlI[5]]) ? 1 : 0) && au.llIlllIIIlIlII(Dialog.hasOption((String)lIlIlIIIlIIl[lIlIlIIIlIlI[6]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIIIlIlI[3]];
            stringArray[au.lIlIlIIIlIlI[1]] = lIlIlIIIlIIl[lIlIlIIIlIlI[7]];
            Dialog.chooseOption((String[])stringArray);

            return lIlIlIIIlIlI[3];
        }
        Widget var5 = Widgets.get((int)lIlIlIIIlIlI[8], (int)lIlIlIIIlIlI[9], (int)lIlIlIIIlIlI[1]);
        if (au.llIlllIIIlIlIl(var5) && au.llIlllIIIlIlII(var5.isVisible() ? 1 : 0) && au.llIlllIIIlIlII(var5.getText().contains(lIlIlIIIlIIl[lIlIlIIIlIlI[10]]) ? 1 : 0)) {
            Widget var6 = Widgets.get((int)lIlIlIIIlIlI[8], (int)lIlIlIIIlIlI[9]);
            if (au.llIlllIIIlIllI(var6)) {
                return lIlIlIIIlIlI[1];
            }
            var6.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[11]]);
            return lIlIlIIIlIlI[3];
        }
        Widget var6 = Static.getClient().getWidget(lIlIlIIIlIlI[0]);
        if (au.llIlllIIIlIlIl(var6)) {
            var6.interact(lIlIlIIIlIlI[3], lIlIlIIIlIlI[12], lIlIlIIIlIlI[13], lIlIlIIIlIlI[0]);
            return lIlIlIIIlIlI[3];
        }
        int[] nArray2 = new int[lIlIlIIIlIlI[3]];
        nArray2[au.lIlIlIIIlIlI[1]] = lIlIlIIIlIlI[4];
        Item var7 = Inventory.getFirst((int[])nArray2);
        if (au.llIlllIIIlIllI(var7)) {
            return lIlIlIIIlIlI[1];
        }
        var3_4.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[14]]);
        return lIlIlIIIlIlI[3];
    }

    private static boolean llIlllIIIlIllI(Object object) {
        return object == null;
    }
}

