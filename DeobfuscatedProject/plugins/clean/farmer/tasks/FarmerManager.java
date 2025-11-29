/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum63;
import -.m.e.a.u.s.r.r.q.i.r.e.f.L;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@Singleton
public class FarmerManager {

    private static final  int ao;

    private static boolean lllIlIllIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    public boolean G() {
        return Widgets.isVisible((Widget)this.H());
    }

    public boolean K() {
        boolean bl;
        if (h.lllIlIllIIllll(this.I())) {
            bl = lIlllIIlIIlI[2];

            if (2 == 0) {
                return false;
            }
        } else {
            bl = lIlllIIlIIlI[1];
        }
        return bl;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public void FarmerManager(K k2, Integer n2) {
        void var4_4;
        void var3_3;
        void var2;
        void var3;
        if (h.lllIlIllIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)n2);
            return;
        }
        Widget var4 = Widgets.get((int)lIlllIIlIIlI[0], (int)var3.aF());
        if (h.lllIlIllIIlllI(var4)) {
            return;
        }
        Object var5 = lIlllIIIlIlI[lIlllIIlIIlI[8]];
        if (!h.lllIlIllIlIIIl(var2.intValue(), lIlllIIlIIlI[2]) || h.lllIlIllIlIIlI(var2.intValue(), lIlllIIlIIlI[4])) {
            var5 = "Remove-" + (Integer)var2;
        }
        if (h.lllIlIllIlIIlI(var2.intValue(), lIlllIIlIIlI[6])) {
            var5 = lIlllIIIlIlI[lIlllIIlIIlI[4]];
        }
        if (h.lllIlIllIlIIll(var3, (Object)K.BOTTOMLESS_BUCKET)) {
            var5 = lIlllIIIlIlI[lIlllIIlIIlI[9]];
        }
        var3_3.interact((String)var4_4);
    }

    public void c(Item item) {
        NPC nPC = this.I();
        if (h.lllIlIllIIlllI(nPC)) {
            return;
        }
        item.useOn((Actor)nPC);
    }

    private static boolean lllIlIllIIllll(Object object) {
        return object != null;
    }

    static {
        h.lllIlIllIIllII();
        h.lllIlIllIIlIII();
        ao = lIlllIIlIIlI[0];
    }

    public boolean J() {
        boolean bl = lIlllIIlIIlI[1];
        Iterator var6 = Inventory.getAll().iterator();
        while (h.lllIlIllIIllIl(var6.hasNext() ? 1 : 0)) {
            Item var7 = (Item)var6.next();
            if (h.lllIlIllIIllIl(L.bq.contains(var7.getId()) ? 1 : 0)) {
                h var8;
                var8.c(var7);
                int var9 = lIlllIIlIIlI[2];
            }

            return false;
        }
        return bl;
    }

    private static boolean lllIlIllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    public void L() {
        NPC nPC = this.I();
        if (h.lllIlIllIIlllI(nPC)) {
            return;
        }
        nPC.interact(lIlllIIIlIlI[lIlllIIlIIlI[10]]);
    }

    public Widget H() {
        return Widgets.get((int)lIlllIIlIIlI[0], (int)lIlllIIlIIlI[1]);
    }

    private static boolean lllIlIllIIlllI(Object object) {
        return object == null;
    }

    private static void lllIlIllIIlIII() {
        lIlllIIIlIlI = new String[lIlllIIlIIlI[11]];
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[1]] = "Tool Leprechaun";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[2]] = "Store-X";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[5]] = "Store";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[7]] = "Store-All";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[8]] = "Remove-X";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[4]] = "Remove-All";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[9]] = "Remove";
        h.lIlllIIIlIlI[h.lIlllIIlIIlI[10]] = "Exchange";
    }

    private static boolean lllIlIllIlIIII(int n2) {
        return n2 == 0;
    }

    public NPC I() {
        String[] stringArray = new String[lIlllIIlIIlI[2]];
        stringArray[h.lIlllIIlIIlI[1]] = lIlllIIIlIlI[lIlllIIlIIlI[1]];
        return NPCs.getNearest((String[])stringArray);
    }

    /*
     * WARNING - void declaration
     */
    public void g(K k2, Integer n2) {
        void var4_4;
        void var3_3;
        void var10;
        void var11;
        if (h.lllIlIllIlIIII(Inventory.contains((int[])k2.aH()) ? 1 : 0)) {
            return;
        }
        if (h.lllIlIllIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)var11.intValue());
            return;
        }
        Widget var12 = Widgets.get((int)lIlllIIlIIlI[3], (int)var10.aG());
        if (h.lllIlIllIIlllI(var12)) {
            return;
        }
        Object var13 = lIlllIIIlIlI[lIlllIIlIIlI[2]];
        if (!h.lllIlIllIlIIIl(var11.intValue(), lIlllIIlIIlI[2]) || h.lllIlIllIlIIlI(var11.intValue(), lIlllIIlIIlI[4])) {
            var13 = "Store-" + (Integer)var11;
        }
        if (h.lllIlIllIlIIll(var10, (Object)K.BOTTOMLESS_BUCKET)) {
            var13 = lIlllIIIlIlI[lIlllIIlIIlI[5]];
        }
        if (h.lllIlIllIlIIlI(var11.intValue(), lIlllIIlIIlI[6])) {
            var13 = lIlllIIIlIlI[lIlllIIlIIlI[7]];
        }
        var3_3.interact((String)var4_4);
    }

    private static boolean lllIlIllIIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIllIlIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIlIllIlIIIl(int n2, int n3) {
        return n2 != n3;
    }
}

