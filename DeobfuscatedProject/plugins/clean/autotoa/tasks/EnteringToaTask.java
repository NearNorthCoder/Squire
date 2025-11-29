/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
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
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Entering TOA")
public class EnteringToaTask
extends AutotoaTaskBase {
    
    private static final  int hR;
    
    @Inject
    protected  SquireAutoTOA aY;

    @Override
    public boolean bl() {
        ci var1;
        int[] nArray = new int[llIIlllIllI[0]];
        nArray[ci.llIIlllIllI[1]] = llIIlllIllI[2];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (ci.lIlIIIlllIIlII(tileObject)) {
            return llIIlllIllI[1];
        }
        BankLoadout var2 = (BankLoadout)var1.hY.loadout().selected(BankLoadout.class);
        if (ci.lIlIIIlllIIlIl(var2.needsToBank() ? 1 : 0)) {
            return llIIlllIllI[1];
        }
        if (ci.lIlIIIlllIIllI(Tabs.isOpen((Tab)Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
            return llIIlllIllI[0];
        }
        if (ci.lIlIIIlllIIlll(Magic.getCurrentSpellBook(), SpellBook.ANCIENT)) {
            Log.info((String)llIIlllIlIl[llIIlllIllI[1]]);
            var1.aY.forceStop();
            return llIIlllIllI[1];
        }
        if (ci.lIlIIIlllIIlIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIIlllIllI[0];
        }
        if (ci.lIlIIIlllIIlIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[llIIlllIllI[0]];
            stringArray[ci.llIIlllIllI[1]] = llIIlllIlIl[llIIlllIllI[0]];
            Dialog.chooseOption((String[])stringArray);

            return llIIlllIllI[0];
        }
        tileObject.interact(llIIlllIlIl[llIIlllIllI[3]]);
        return llIIlllIllI[0];
    }

    private static boolean lIlIIIlllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlllIIllI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var3);
    }

    private static void lIlIIIlllIIIlI() {
        llIIlllIlIl = new String[llIIlllIllI[4]];
        ci.llIIlllIlIl[ci.llIIlllIllI[1]] = "We need ancient spellbook, stopping";
        ci.llIIlllIlIl[ci.llIIlllIllI[0]] = "Yes";
        ci.llIIlllIlIl[ci.llIIlllIllI[3]] = "Enter";
    }

    private static boolean lIlIIIlllIIlIl(int n2) {
        return n2 != 0;
    }

    @Inject
    protected EnteringToaTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static boolean lIlIIIlllIIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIIIlllIIlII(Object object) {
        return object == null;
    }

    static {
        ci.lIlIIIlllIIIll();
        ci.lIlIIIlllIIIlI();
        hR = llIIlllIllI[2];
    }
}

