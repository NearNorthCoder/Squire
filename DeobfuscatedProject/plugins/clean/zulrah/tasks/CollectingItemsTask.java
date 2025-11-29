/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum40;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Collecting items", priority=0x7FFFFFFE, blocking=true, register=true)
public class CollectingItemsTask
extends ZulrahTaskBase {
    
    private static final  int ag;
    private static final  int af;

    static {
        L.llIIlIIIlllIIII();
        L.llIIlIIIllIllII();
        af = lIllIllIIllII[6];
        ag = lIllIllIIllII[4];
    }

    @Inject
    public CollectingItemsTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.COLLECTING_ZULRAH);
    }

    private static boolean llIIlIIIlllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIlllIIll(Object object) {
        return object != null;
    }

    private static boolean llIIlIIIlllIIIl(Object object) {
        return object == null;
    }

    @Override
    public boolean ac() {
        String var1;
        String[] var2;
        L var3;
        Item var4;
        int[] nArray = new int[lIllIllIIllII[0]];
        nArray[L.lIllIllIIllII[1]] = lIllIllIIllII[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (L.llIIlIIIlllIIIl(nPC)) {
            return lIllIllIIllII[1];
        }
        int[] nArray2 = new int[lIllIllIIllII[0]];
        nArray2[L.lIllIllIIllII[1]] = lIllIllIIllII[3];
        if (L.llIIlIIIlllIIlI(Inventory.contains((int[])nArray2) ? 1 : 0) && L.llIIlIIIlllIIll(var4 = Inventory.getFirst(item -> item.getName().endsWith(lIllIllIIlIlI[lIllIllIIllII[10]])))) {
            int[] nArray3 = new int[lIllIllIIllII[0]];
            nArray3[L.lIllIllIIllII[1]] = lIllIllIIllII[3];
            var4.useOn(Inventory.getFirst((int[])nArray3));
            return lIllIllIIllII[0];
        }
        if (L.llIIlIIIlllIIlI(Dialog.isOpen() ? 1 : 0) && L.llIIlIIIlllIIlI(Dialog.getText().contains(lIllIllIIlIlI[lIllIllIIllII[1]]) ? 1 : 0)) {
            var3.al.a(c.DONE);
        }
        if (L.llIIlIIIlllIIlI(Widgets.isVisible((Widget)(var4 = var3.aj.getWidget(lIllIllIIllII[4]))) ? 1 : 0) && L.llIIlIIIlllIIlI((var2 = (var1 = var4.getText()).split(lIllIllIIlIlI[lIllIllIIllII[0]]))[lIllIllIIllII[1]].contains(lIllIllIIlIlI[lIllIllIIllII[5]]) ? 1 : 0)) {
            var3.al.a(c.DONE);
            return lIllIllIIllII[1];
        }
        var1 = var3.aj.getWidget(lIllIllIIllII[6]);
        if (L.llIIlIIIlllIIlI(Widgets.isVisible((Widget)var1) ? 1 : 0)) {
            String[] stringArray = new String[lIllIllIIllII[5]];
            stringArray[L.lIllIllIIllII[1]] = lIllIllIIlIlI[lIllIllIIllII[7]];
            stringArray[L.lIllIllIIllII[0]] = lIllIllIIlIlI[lIllIllIIllII[8]];
            var1.interact(stringArray);
            return lIllIllIIllII[0];
        }
        nPC.interact(lIllIllIIlIlI[lIllIllIIllII[9]]);
        return lIllIllIIllII[0];
    }

        return String.valueOf(var5);
    }

    private static boolean llIIlIIIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIIllIllII() {
        lIllIllIIlIlI = new String[lIllIllIIllII[11]];
        L.lIllIllIIlIlI[L.lIllIllIIllII[1]] = "I'm afraid I don't have";
        L.lIllIllIIlIlI[L.lIllIllIIllII[0]] = "<br>";
        L.lIllIllIIlIlI[L.lIllIllIIllII[5]] = ">0<";
        L.lIllIllIIlIlI[L.lIllIllIIllII[7]] = "Unlock";
        L.lIllIllIIlIlI[L.lIllIllIIllII[8]] = "Take-All";
        L.lIllIllIIlIlI[L.lIllIllIIllII[9]] = "Collect";
        L.lIllIllIIlIlI[L.lIllIllIIllII[10]] = "rune";
    }

}

