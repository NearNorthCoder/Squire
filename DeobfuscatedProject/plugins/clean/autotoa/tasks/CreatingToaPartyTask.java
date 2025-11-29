/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Creating TOA Party", priority=5, blocking=true)
public class CreatingToaPartyTask
extends AutotoaTaskBase {

    private static final  int hQ;

    @Override
    public boolean bl() {
        ch var1;
        if (ch.lIlIlIlIlIllIl(Vars.getBit((int)llIllIlllll[0]), llIllIlllll[1])) {
            return llIllIlllll[2];
        }
        BankLoadout var2 = (BankLoadout)var1.hY.loadout().selected(BankLoadout.class);
        if (ch.lIlIlIlIlIlllI(var2.needsToBank() ? 1 : 0)) {
            return llIllIlllll[2];
        }
        Widget var3 = var1.cu.getWidget(llIllIlllll[3]);
        if (ch.lIlIlIlIlIlllI(Widgets.isVisible((Widget)var3) ? 1 : 0)) {
            Log.info((String)llIllIllllI[llIllIlllll[2]]);
            var3.interact(llIllIllllI[llIllIlllll[1]]);
            return llIllIlllll[1];
        }
        int[] nArray = new int[llIllIlllll[4]];
        nArray[ch.llIllIlllll[2]] = llIllIlllll[5];
        nArray[ch.llIllIlllll[1]] = llIllIlllll[6];
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if (ch.lIlIlIlIlIllll(var4)) {
            Log.info((String)llIllIllllI[llIllIlllll[4]]);
            var4.interact(llIllIllllI[llIllIlllll[7]]);
            return llIllIlllll[1];
        }
        return llIllIlllll[2];
    }

    private static boolean lIlIlIlIlIlllI(int n2) {
        return n2 != 0;
    }

    static {
        ch.lIlIlIlIlIllII();
        ch.lIlIlIlIlIlIll();
        hQ = llIllIlllll[0];
    }

    private static boolean lIlIlIlIlIllIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected CreatingToaPartyTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void lIlIlIlIlIlIll() {
        llIllIllllI = new String[llIllIlllll[8]];
        ch.llIllIllllI[ch.llIllIlllll[2]] = "[CreateParty] Creating a party";
        ch.llIllIllllI[ch.llIllIlllll[1]] = "Make Party";
        ch.llIllIllllI[ch.llIllIlllll[4]] = "[CreateParty] Opening party menu";
        ch.llIllIllllI[ch.llIllIlllll[7]] = "Inspect";
    }

    private static boolean lIlIlIlIlIllll(Object object) {
        return object != null;
    }
}

