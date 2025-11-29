/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.nightmarezone.tasks.BHelper;

@TaskDesc(name="Buy Herb Boxes", priority=150, blocking=true)
public class BuyHerbBoxesTask
extends Task {
    private final  Client an;
    
    private final  SquireNightmareZoneConfig am;
    
    private final  SquireNightmareZone al;

    private static boolean lIIlllllIlIllIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7_8;
        n var1;
        if (n.lIIlllllIlIIlll(this.am.herbBox() ? 1 : 0)) {
            return lIIIlIIllIllI[0];
        }
        if (n.lIIlllllIlIlIII(var1.an.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIllIllI[0];
        }
        String[] stringArray = new String[lIIIlIIllIllI[1]];
        stringArray[n.lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[0]];
        List var2 = Inventory.getAll((String[])stringArray);
        if (n.lIIlllllIlIlIIl(Inventory.getFreeSlots(), lIIIlIIllIllI[2]) && n.lIIlllllIlIIlll(var2.size())) {
            return lIIIlIIllIllI[0];
        }
        if (n.lIIlllllIlIlIlI(var2.size())) {
            String[] stringArray2 = new String[lIIIlIIllIllI[1]];
            stringArray2[n.lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[1]];
            Inventory.doActions(item -> item.getName().startsWith(lIIIlIIlIlIII[lIIIlIIllIllI[10]]), (String[])stringArray2);
            return lIIIlIIllIllI[1];
        }
        int var3 = Static.getClient().getVarbitValue(lIIIlIIllIllI[3]);
        if (n.lIIlllllIlIlIll(var3, lIIIlIIllIllI[4])) {
            return lIIIlIIllIllI[0];
        }
        int var4 = Vars.getVarp((int)b.y);
        if (n.lIIlllllIlIlIIl(var4, lIIIlIIllIllI[5] * (lIIIlIIllIllI[4] - var3))) {
            return lIIIlIIllIllI[0];
        }
        int var5 = Static.getClient().getVarbitValue(b.s);
        int var6 = Static.getClient().getVarbitValue(b.t);
        if (!n.lIIlllllIlIlIll(var5 + var1.al.a(), var1.am.overload()) || n.lIIlllllIlIlIIl(var6 + var1.al.b(), var1.am.absorption())) {
            return lIIIlIIllIllI[0];
        }
        Widget var7 = Widgets.get((int)lIIIlIIllIllI[6], (int)lIIIlIIllIllI[1], (int)lIIIlIIllIllI[1]);
        if (!n.lIIlllllIlIllII(var7) || n.lIIlllllIlIIlll(var7.isVisible() ? 1 : 0)) {
            System.out.println(lIIIlIIlIlIII[lIIIlIIllIllI[7]]);
            String[] stringArray3 = new String[lIIIlIIllIllI[1]];
            stringArray3[n.lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[8]];
            TileObject var8 = TileObjects.getNearest((String[])stringArray3);
            if (n.lIIlllllIlIllIl(var8)) {
                return lIIIlIIllIllI[0];
            }
            var8.interact(lIIIlIIlIlIII[lIIIlIIllIllI[9]]);
            return lIIIlIIllIllI[1];
        }
        Widget var8 = Widgets.get((int)lIIIlIIllIllI[6], (int)b.o, (int)b.r);
        if (n.lIIlllllIlIllIl(var8)) {
            return lIIIlIIllIllI[0];
        }
        var7_8.interact(lIIIlIIlIlIII[lIIIlIIllIllI[2]]);
        return lIIIlIIllIllI[1];
    }

    private static boolean lIIlllllIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllllIlIllII(Object object) {
        return object != null;
    }

    private static boolean lIIlllllIlIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllllIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        n.lIIlllllIlIIllI();
        n.lIIlllllIIIIIII();
    }

    private static void lIIlllllIIIIIII() {
        lIIIlIIlIlIII = new String[lIIIlIIllIllI[11]];
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[0]] = "Herb box";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[1]] = "Bank-all";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[7]] = "Widget is null";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[8]] = "Rewards chest";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[9]] = "Search";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[2]] = "Buy-5";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[10]] = "Herb box";
    }

    @Inject
    public BuyHerbBoxesTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.al = squireNightmareZone;
        this.am = squireNightmareZoneConfig;
        this.an = client;
    }

    private static boolean lIIlllllIlIIlll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var9);
    }

    private static boolean lIIlllllIlIlIlI(int n2) {
        return n2 > 0;
    }
}

