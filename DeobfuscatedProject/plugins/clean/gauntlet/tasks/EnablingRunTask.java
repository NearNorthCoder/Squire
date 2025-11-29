/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.gauntlet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Enabling Run", priority=5)
public class EnablingRunTask
extends Task {

    private static boolean lIIIIIIIIIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIIIIIIIIll(Object object) {
        return object != null;
    }

    static {
        S.lIIIIIIIIIIIIII();
        S.llllllllllllll();
    }

    private static void llllllllllllll() {
        llIIlllIlllI = new String[llIIlllIllll[2]];
        S.llIIlllIlllI[S.llIIlllIllll[1]] = "Drink";
    }

    private static boolean lIIIIIIIIIIIlII(Object object) {
        return object == null;
    }

    public boolean run() {
        Item item2;
        if (S.lIIIIIIIIIIIIIl(Movement.isStaminaBoosted() ? 1 : 0) && S.lIIIIIIIIIIIIlI(Movement.getRunEnergy(), llIIlllIllll[0]) && S.lIIIIIIIIIIIIll(item2 = Inventory.getFirst(item -> e.aa.contains(item.getId())))) {
            item2.interact(llIIlllIlllI[llIIlllIllll[1]]);
            return llIIlllIllll[2];
        }
        if (S.lIIIIIIIIIIIIlI(Movement.getRunEnergy(), llIIlllIllll[3])) {
            return llIIlllIllll[1];
        }
        if (S.lIIIIIIIIIIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            Widget var1 = Widgets.get((WidgetInfo)WidgetInfo.MINIMAP_TOGGLE_RUN_ORB);
            if (S.lIIIIIIIIIIIlII(var1)) {
                return llIIlllIllll[1];
            }
            Movement.toggleRun();
            return llIIlllIllll[2];
        }
        return llIIlllIllll[1];
    }

    private static boolean lIIIIIIIIIIIIIl(int n2) {
        return n2 == 0;
    }

}

