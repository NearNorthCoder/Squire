/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Withdrawing items", priority=19000, blocking=true)
public class WithdrawingItemsTask
extends CoxTaskBase {

    private final  int cz = 0xF0000A;

    public WithdrawingItemsTask() {
        this.cz = lIlIIllIIlll[0];
    }

    private static boolean llIllIlIIlIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cs() {
        void var3_4;
        int[] nArray = new int[lIlIIllIIlll[3]];
        nArray[aa.lIlIIllIIlll[1]] = lIlIIllIIlll[4];
        if (aa.llIllIlIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIllIIlll[1];
        }
        if (aa.llIllIlIIlIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIIllIIlll[3];
        }
        if (aa.llIllIlIIlIIII(Dialog.isViewingOptions() ? 1 : 0) && aa.llIllIlIIlIIII(Dialog.hasOption((String)lIlIIllIIllI[lIlIIllIIlll[7]]) ? 1 : 0) && aa.llIllIlIIlIIII(Dialog.hasOption((String)lIlIIllIIllI[lIlIIllIIlll[5]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIllIIlll[3]];
            stringArray[aa.lIlIIllIIlll[1]] = lIlIIllIIllI[lIlIIllIIlll[8]];
            Dialog.chooseOption((String[])stringArray);

            return lIlIIllIIlll[3];
        }
        Widget var1 = Widgets.get((int)lIlIIllIIlll[9], (int)lIlIIllIIlll[10], (int)lIlIIllIIlll[1]);
        if (aa.llIllIlIIIlllI(var1) && aa.llIllIlIIlIIII(var1.isVisible() ? 1 : 0) && aa.llIllIlIIlIIII(var1.getText().contains(lIlIIllIIllI[lIlIIllIIlll[6]]) ? 1 : 0)) {
            Widget var2 = Widgets.get((int)lIlIIllIIlll[9], (int)lIlIIllIIlll[10]);
            if (aa.llIllIlIIlIIIl(var2)) {
                return lIlIIllIIlll[1];
            }
            var2.interact(lIlIIllIIllI[lIlIIllIIlll[2]]);
            return lIlIIllIIlll[3];
        }
        Widget var2 = Static.getClient().getWidget(lIlIIllIIlll[0]);
        if (aa.llIllIlIIIlllI(var2)) {
            var2.interact(lIlIIllIIlll[3], lIlIIllIIlll[11], lIlIIllIIlll[12], lIlIIllIIlll[0]);
            return lIlIIllIIlll[3];
        }
        int[] nArray2 = new int[lIlIIllIIlll[3]];
        nArray2[aa.lIlIIllIIlll[1]] = lIlIIllIIlll[4];
        Item var3 = Inventory.getFirst((int[])nArray2);
        if (aa.llIllIlIIlIIIl(var3)) {
            return lIlIIllIIlll[1];
        }
        var3_4.interact(lIlIIllIIllI[lIlIIllIIlll[13]]);
        return lIlIIllIIlll[3];
    }

    private static boolean llIllIlIIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllIlIIIlllI(Object object) {
        return object != null;
    }

    private static boolean llIllIlIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIlIIlIIII(int n2) {
        return n2 != 0;
    }

    private static void llIllIlIIIlIll() {
        lIlIIllIIllI = new String[lIlIIllIIlll[16]];
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[1]] = "No bank loadout selected";
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[3]] = "Banking failed 5 times in a row, stopping";
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[7]] = "Accept";
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[5]] = "Choose again";
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[8]] = "Accept";
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[6]] = "Herblore";
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[2]] = "Confirm";
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[13]] = "Commune";
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[14]] = "Bank chest";
        aa.lIlIIllIIllI[aa.lIlIIllIIlll[15]] = "Use";
    }

    static {
        aa.llIllIlIIIllII();
        aa.llIllIlIIIlIll();
    }

    @Override
    public boolean cg() {
        aa var4;
        if (aa.llIllIlIIIllIl(this.cr() ? 1 : 0)) {
            return lIlIIllIIlll[1];
        }
        if (aa.llIllIlIIIllIl(cw ? 1 : 0)) {
            return lIlIIllIIlll[1];
        }
        TileObject var5 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aa.llIllIlIIlIIII(tileObject.getName().equals(lIlIIllIIllI[lIlIIllIIlll[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIIlll[3]];
                stringArray[aa.lIlIIllIIlll[1]] = lIlIIllIIllI[lIlIIllIIlll[15]];
                if (aa.llIllIlIIlIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIllIIlll[3];

                    if (-1 <= 0) return n2 != 0;
                    return ((24 + 237 - 182 + 160 ^ 79 + 15 - -12 + 73) & (0x25 ^ 0x6A ^ (0xA ^ 0x19) ^ -1)) != 0;
                }
            }
            n2 = lIlIIllIIlll[1];
            return n2 != 0;
        });
        if (aa.llIllIlIIIlllI(var5) && aa.llIllIlIIIllll(Players.getLocal().distanceTo((Locatable)var5), lIlIIllIIlll[2])) {
            Movement.setDestination((WorldPoint)var5.getWorldLocation());
            return lIlIIllIIlll[3];
        }
        int[] nArray = new int[lIlIIllIIlll[3]];
        nArray[aa.lIlIIllIIlll[1]] = lIlIIllIIlll[4];
        if (aa.llIllIlIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            var4.cs();

            return lIlIIllIIlll[3];
        }
        if (aa.llIllIlIIlIIIl(var4.q())) {
            Log.error((String)lIlIIllIIllI[lIlIIllIIlll[1]]);
            return lIlIIllIIlll[1];
        }
        if (aa.llIllIlIIIllIl(var4.q().needsToBank() ? 1 : 0)) {
            if (aa.llIllIlIIIllIl(Bank.isOpen() ? 1 : 0)) {
                var4.v.b(lIlIIllIIlll[1]);
                return lIlIIllIIlll[1];
            }
            Bank.close();
            var4.sleep(lIlIIllIIlll[5]);
            return lIlIIllIIlll[3];
        }
        if (aa.llIllIlIIIllIl(BankLoadouts.withdrawWithRetries((BankLoadout)var4.q(), (int)lIlIIllIIlll[6]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIlIIllIIllI[lIlIIllIIlll[3]]);
            return lIlIIllIIlll[1];
        }
        this.sleep(lIlIIllIIlll[7]);
        return lIlIIllIIlll[3];
    }

        return String.valueOf(var6);
    }

    private static boolean llIllIlIIIllIl(int n2) {
        return n2 == 0;
    }
}

