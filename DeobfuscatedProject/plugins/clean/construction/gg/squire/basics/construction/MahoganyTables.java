/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.DialogOption
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.basics.construction;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@SquireUtil
@PluginDescriptor(name="Squire Mahogany Tables", enabledByDefault=false)
public class MahoganyTables
extends SquirePlugin {

    protected Class<?>[] tasks() {
        return new Class[llIlIllI[1]];
    }

    static {
        MahoganyTables.lIllllllII();
        MahoganyTables.lIlllllIll();
    }

        return String.valueOf(llIlIlIllIllIII);
    }

    protected void onStart() {
    }

    private static boolean lIllllllIl(int n2) {
        return n2 == 0;
    }

    private static void lIlllllIll() {
        llIlIlIl = new String[llIlIllI[12]];
        MahoganyTables.llIlIlIl[MahoganyTables.llIlIllI[1]] = "Talk-to";
        MahoganyTables.llIlIlIl[MahoganyTables.llIlIllI[0]] = "Talk-to";
        MahoganyTables.llIlIlIl[MahoganyTables.llIlIllI[5]] = "Build";
        MahoganyTables.llIlIlIl[MahoganyTables.llIlIllI[6]] = "Yes";
        MahoganyTables.llIlIlIl[MahoganyTables.llIlIllI[4]] = "Remove";
    }

    private static boolean llIIIIIIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Widget llIlIllIIIIIIIl;
        void llIlIllIIIIIIlI;
        void llIlIllIIIIIIll;
        int[] nArray = new int[llIlIllI[0]];
        nArray[MahoganyTables.llIlIllI[1]] = llIlIllI[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[llIlIllI[0]];
        nArray2[MahoganyTables.llIlIllI[1]] = llIlIllI[3];
        int n2 = Inventory.getCount((int[])nArray2);
        if (MahoganyTables.lIllllllIl(n2)) {
            if (MahoganyTables.lIlllllllI(nPC)) {
                return;
            }
            if (MahoganyTables.lIllllllll(Dialog.canContinue() ? 1 : 0)) {
                DialogOption[] dialogOptionArray = new DialogOption[llIlIllI[4]];
                dialogOptionArray[MahoganyTables.llIlIllI[1]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[MahoganyTables.llIlIllI[0]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[MahoganyTables.llIlIllI[5]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[MahoganyTables.llIlIllI[6]] = DialogOption.NPC_CONTINUE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return;
            }
            llIlIllIIIIIIll.interact(llIlIlIl[llIlIllI[1]]);
            return;
        }
        if (MahoganyTables.llIIIIIIII((int)llIlIllIIIIIIlI, llIlIllI[7])) {
            if (MahoganyTables.lIllllllll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)llIlIllI[0]);

                return;
            }
            if (MahoganyTables.llIIIIIIIl(llIlIllIIIIIIll)) {
                llIlIllIIIIIIll.interact(llIlIlIl[llIlIllI[0]]);
                return;
            }
        }
        if (MahoganyTables.lIllllllll(Widgets.isVisible((Widget)(llIlIllIIIIIIIl = Widgets.get((int)llIlIllI[8], (int)llIlIllI[5]))) ? 1 : 0)) {
            Keyboard.type((int)llIlIllI[9]);
            return;
        }
        int[] nArray3 = new int[llIlIllI[0]];
        nArray3[MahoganyTables.llIlIllI[1]] = llIlIllI[10];
        TileObject llIlIllIIIIIIII = TileObjects.getNearest((int[])nArray3);
        if (MahoganyTables.llIIIIIIIl(llIlIllIIIIIIII)) {
            llIlIllIIIIIIII.interact(llIlIlIl[llIlIllI[5]]);
            Keyboard.type((int)llIlIllI[9]);
            return;
        }
        int[] nArray4 = new int[llIlIllI[0]];
        nArray4[MahoganyTables.llIlIllI[1]] = llIlIllI[11];
        TileObject llIlIlIllllllll = TileObjects.getNearest((int[])nArray4);
        if (MahoganyTables.llIIIIIIIl(llIlIlIllllllll)) {
            if (MahoganyTables.lIllllllll(Dialog.isViewingOptions() ? 1 : 0)) {
                String[] stringArray = new String[llIlIllI[0]];
                stringArray[MahoganyTables.llIlIllI[1]] = llIlIlIl[llIlIllI[6]];
                Dialog.chooseOption((String[])stringArray);

                return;
            }
            llIlIlIllllllll.interact(llIlIlIl[llIlIllI[4]]);
            return;
        }
    }

    private static boolean lIlllllllI(Object object) {
        return object == null;
    }

    private static boolean lIllllllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    protected void onStop() {
    }

}

