/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.RunePouch
 *  net.unethicalite.api.magic.RunePouch$RuneSlot
 *  net.unethicalite.api.widgets.Dialog
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
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Claiming Death Items", priority=100, blocking=true, register=true)
public class ClaimingDeathItemsTask
extends AutotoaTaskBase {
    
    private static final  int hL;
    private final  z hM;
    
    private  boolean hN;

    private static void lIIllIllllllll() {
        lIlllllllIl = new String[lIlllllllll[19]];
        cf.lIlllllllIl[cf.lIlllllllll[0]] = "[ClaimDeathItems] Pin window is open, waiting...";
        cf.lIlllllllIl[cf.lIlllllllll[1]] = "[ClaimDeathItems] Equipping kephri melee gear for space";
        cf.lIlllllllIl[cf.lIlllllllll[2]] = "[ClaimDeathItems] Trying to fill rune pouch for space";
        cf.lIlllllllIl[cf.lIlllllllll[4]] = "[ClaimDeathItems] Opening death chest";
        cf.lIlllllllIl[cf.lIlllllllll[6]] = "Claim";
        cf.lIlllllllIl[cf.lIlllllllll[7]] = "[ClaimDeathItems] Setting died to false";
        cf.lIlllllllIl[cf.lIlllllllll[8]] = "Unlock";
        cf.lIlllllllIl[cf.lIlllllllll[9]] = "[ClaimDeathItems] Unlocking death chest";
        cf.lIlllllllIl[cf.lIlllllllll[10]] = "Unlock";
        cf.lIlllllllIl[cf.lIlllllllll[11]] = "Take-All";
        cf.lIlllllllIl[cf.lIlllllllll[12]] = "[ClaimDeathItems] Taking all items from death chest";
        cf.lIlllllllIl[cf.lIlllllllll[13]] = "Take-All";
        cf.lIlllllllIl[cf.lIlllllllll[14]] = "Divine rune pouch";
        cf.lIlllllllIl[cf.lIlllllllll[15]] = "You failed to survive the Tombs";
        cf.lIlllllllIl[cf.lIlllllllll[16]] = "rune";
        cf.lIlllllllIl[cf.lIlllllllll[17]] = "rune pouch";
        cf.lIlllllllIl[cf.lIlllllllll[18]] = "rune";
    }

    @Override
    public boolean bl() {
        cf var1;
        if (cf.lIIlllIIIIlIIl(this.hN ? 1 : 0)) {
            return lIlllllllll[0];
        }
        if (cf.lIIlllIIIIlIlI(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info((String)lIlllllllIl[lIlllllllll[0]]);
            return lIlllllllll[1];
        }
        if (cf.lIIlllIIIIlIlI(Dialog.canContinue() ? 1 : 0)) {
            var1.hN = lIlllllllll[0];
            return lIlllllllll[0];
        }
        if (cf.lIIlllIIIIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)lIlllllllll[2]);

            return lIlllllllll[1];
        }
        if (cf.lIIlllIIIIlIlI(Inventory.isFull() ? 1 : 0)) {
            ConfigStorageBox<EquipmentSetup> var2 = var1.hY.kephriMelee();
            int[] var3 = var1.hM.a(var2);
            if (cf.lIIlllIIIIlIlI(Inventory.contains((int[])var3) ? 1 : 0)) {
                Log.info((String)lIlllllllIl[lIlllllllll[1]]);
                var1.hM.c(var3);

                if (2 >= (0x17 ^ 0x13)) {
                    return false;
                }
            } else {
                Log.info((String)lIlllllllIl[lIlllllllll[2]]);
                var1.cL();
            }
            return lIlllllllll[1];
        }
        Widget var2 = Widgets.get((int)lIlllllllll[3], (int)lIlllllllll[4]);
        if (cf.lIIlllIIIIlIIl(Widgets.isVisible((Widget)var2) ? 1 : 0)) {
            Log.info((String)lIlllllllIl[lIlllllllll[4]]);
            int[] nArray = new int[lIlllllllll[1]];
            nArray[cf.lIlllllllll[0]] = lIlllllllll[5];
            TileObject var3 = TileObjects.getNearest((int[])nArray);
            if (cf.lIIlllIIIIlIll(var3)) {
                return lIlllllllll[0];
            }
            var3.interact(lIlllllllIl[lIlllllllll[6]]);
            return lIlllllllll[1];
        }
        Widget[] var3 = var2.getChildren();
        if (!cf.lIIlllIIIIllII(var3) || !cf.lIIlllIIIIlIlI(var3.length) || cf.lIIlllIIIIlIlI(var1.a(var3) ? 1 : 0)) {
            Log.info((String)lIlllllllIl[lIlllllllll[7]]);
            var1.hN = lIlllllllll[0];
            return lIlllllllll[1];
        }
        Widget var4 = Widgets.get((int)lIlllllllll[3], (int)lIlllllllll[8]);
        if (cf.lIIlllIIIIlIlI(Widgets.isVisible((Widget)var4) ? 1 : 0)) {
            String[] stringArray = new String[lIlllllllll[1]];
            stringArray[cf.lIlllllllll[0]] = lIlllllllIl[lIlllllllll[8]];
            if (cf.lIIlllIIIIlIlI(var4.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)lIlllllllIl[lIlllllllll[9]]);
                var4.interact(lIlllllllIl[lIlllllllll[10]]);
                return lIlllllllll[1];
            }
        }
        if (cf.lIIlllIIIIlIlI(Widgets.isVisible((Widget)var4) ? 1 : 0)) {
            String[] stringArray = new String[lIlllllllll[1]];
            stringArray[cf.lIlllllllll[0]] = lIlllllllIl[lIlllllllll[11]];
            if (cf.lIIlllIIIIlIlI(var4.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)lIlllllllIl[lIlllllllll[12]]);
                var4.interact(lIlllllllIl[lIlllllllll[13]]);
                return lIlllllllll[1];
            }
        }
        return lIlllllllll[0];
    }

        return String.valueOf(var5);
    }

    private static boolean lIIlllIIIIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlllIIIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected ClaimingDeathItemsTask(Client client, TOAConfig tOAConfig, z z2) {
        super(client, tOAConfig);
        this.hM = z2;
    }

    private void cL() {
        int n2;
        if (cf.lIIlllIIIIlIIl(RunePouch.hasPouch() ? 1 : 0)) {
            return;
        }
        if (cf.lIIlllIIIIlIIl(Inventory.contains(item -> item.getName().toLowerCase().endsWith(lIlllllllIl[lIlllllllll[18]])) ? 1 : 0)) {
            return;
        }
        Item var6 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlllllllIl[lIlllllllll[17]]));
        String[] stringArray = new String[lIlllllllll[1]];
        stringArray[cf.lIlllllllll[0]] = lIlllllllIl[lIlllllllll[14]];
        if (cf.lIIlllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            n2 = lIlllllllll[6];

            if (3 <= 0) {
                return;
            }
        } else {
            n2 = lIlllllllll[4];
        }
        int var7 = n2;
        int var8 = lIlllllllll[0];
        while (cf.lIIlllIIIIllIl(var8, var7)) {
            RunePouch.RuneSlot var9 = RunePouch.RuneSlot.values()[var8];
            if (cf.lIIlllIIIIlllI(var9.getQuantity())) {

            } else {
                Item var10 = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(lIlllllllIl[lIlllllllll[16]]));
                if (cf.lIIlllIIIIlIll(var10)) {
                    return;
                }
                var10.useOn(var6);
                return;
            }
            ++var8;

            if (1 > ((210 + 44 - 176 + 172 ^ 100 + 122 - 158 + 115) & (0x91 ^ 0x8D ^ (0x52 ^ 7) ^ -1))) continue;
            return;
        }
    }

    static {
        cf.lIIlllIIIIIllI();
        cf.lIIllIllllllll();
        hL = lIlllllllll[5];
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (cf.lIIlllIIIIlIlI(chatMessage.getMessage().contains(lIlllllllIl[lIlllllllll[15]]) ? 1 : 0)) {
            this.hN = lIlllllllll[1];
        }
    }

    private static boolean lIIlllIIIIlIll(Object object) {
        return object == null;
    }

    private static boolean lIIlllIIIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIIIllII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Widget[] widgetArray) {
        void var11;
        Widget[] widgetArray2 = widgetArray;
        int n2 = widgetArray2.length;
        int var12 = lIlllllllll[0];
        while (cf.lIIlllIIIIllIl(var12, (int)var11)) {
            void var13;
            void var14 = var13[var12];
            if (cf.lIIlllIIIIlIlI(Widgets.isVisible((Widget)var14) ? 1 : 0)) {
                return lIlllllllll[0];
            }
            ++var12;

            return false;
        }
        return lIlllllllll[1];
    }
}

