/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.RunePouch
 *  net.unethicalite.api.magic.RunePouch$RuneSlot
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Claiming death items", priority=125, register=true, blocking=true)
public class ClaimingDeathItemsTask
extends Task {
    private final  SquireVorkathPlugin x;
    
    private static final  int u;
    private final  SquireVorkathConfig y;
    private static final  int w;
    private static final  int t;
    
    private static final  int v;

    private static boolean lIllllllIIlIllI(Object object) {
        return object != null;
    }

    private static boolean lIllllllIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllIIllIII(int n2) {
        return n2 > 0;
    }

    @Inject
    public ClaimingDeathItemsTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig) {
        this.x = squireVorkathPlugin;
        this.y = squireVorkathConfig;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (b.lIllllllIIlIlII(chatMessage.getMessage().contains(lIlIlIlIlIIll[lIlIlIlIlIllI[14]]) ? 1 : 0)) {
            this.x.ClaimingDeathItemsTask(lIlIlIlIlIllI[1]);
        }
    }

        return String.valueOf(var1);
    }

    private static boolean lIllllllIIlIlIl(Object object) {
        return object == null;
    }

    private void h() {
        int n2;
        if (b.lIllllllIIlIIll(RunePouch.hasPouch() ? 1 : 0)) {
            return;
        }
        if (b.lIllllllIIlIIll(Inventory.contains(item -> item.getName().toLowerCase().endsWith(lIlIlIlIlIIll[lIlIlIlIlIllI[17]])) ? 1 : 0)) {
            return;
        }
        Item var2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIlIlIlIIll[lIlIlIlIlIllI[16]]));
        String[] stringArray = new String[lIlIlIlIlIllI[1]];
        stringArray[b.lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[13]];
        if (b.lIllllllIIlIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            n2 = lIlIlIlIlIllI[5];

            if (((47 + 131 - 89 + 54 ^ 155 + 91 - 157 + 78) & (0x68 ^ 0x4E ^ (0x8E ^ 0x80) ^ -1)) != 0) {
                return;
            }
        } else {
            n2 = lIlIlIlIlIllI[4];
        }
        int var3 = n2;
        int var4 = lIlIlIlIlIllI[0];
        while (b.lIllllllIIlIlll(var4, var3)) {
            RunePouch.RuneSlot var5 = RunePouch.RuneSlot.values()[var4];
            if (b.lIllllllIIllIII(var5.getQuantity())) {

                }
            } else {
                Item var6 = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(lIlIlIlIlIIll[lIlIlIlIlIllI[15]]));
                if (b.lIllllllIIlIlIl(var6)) {
                    return;
                }
                var6.useOn(var2);
                return;
            }
            ++var4;

            if (-1 != 2) continue;
            return;
        }
    }

    private static void lIllllllIIIIlll() {
        lIlIlIlIlIIll = new String[lIlIlIlIlIllI[21]];
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[0]] = "in window is open, waiting...";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[1]] = "Equipping gear for space";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[2]] = "Trying to fill rune pouch for space";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[4]] = "Opening death torfih";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[5]] = "Collect";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[6]] = "Setting died to false";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[7]] = "Unlock";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[8]] = "Unlocking death chest";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[9]] = "Unlock";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[10]] = "Take-All";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[11]] = "Taking all items from death chest";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[12]] = "Take-All";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[13]] = "Divine rune pouch";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[14]] = "You have items stored in an item retrieval";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[15]] = "rune";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[16]] = "rune pouch";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[17]] = "rune";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[18]] = "Collect";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[19]] = "Torfinn";
    }

    private static boolean lIllllllIIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllllIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        b.lIllllllIIlIIlI();
        b.lIllllllIIIIlll();
        w = lIlIlIlIlIllI[20];
        v = lIlIlIlIlIllI[7];
        u = lIlIlIlIlIllI[4];
        t = lIlIlIlIlIllI[3];
    }

    public boolean run() {
        b var7;
        if (b.lIllllllIIlIIll(this.x.f() ? 1 : 0)) {
            return lIlIlIlIlIllI[0];
        }
        if (b.lIllllllIIlIlII(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[0]]);
            return lIlIlIlIlIllI[1];
        }
        if (b.lIllllllIIlIlII(Dialog.canContinue() ? 1 : 0)) {
            var7.x.ClaimingDeathItemsTask(lIlIlIlIlIllI[0]);
            return lIlIlIlIlIllI[0];
        }
        if (b.lIllllllIIlIlII(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)lIlIlIlIlIllI[2]);

            return lIlIlIlIlIllI[1];
        }
        if (b.lIllllllIIlIlII(Inventory.isFull() ? 1 : 0)) {
            EquipmentSetup var8 = ((BankLoadout)var7.y.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
            int[] var9 = var8.getIds();
            if (b.lIllllllIIlIlII(Inventory.contains((int[])var9) ? 1 : 0)) {
                Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[1]]);
                Gear.swapTo((int[])var9);

                }
            } else {
                Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[2]]);
                var7.h();
            }
            return lIlIlIlIlIllI[1];
        }
        Widget var8 = Widgets.get((int)lIlIlIlIlIllI[3], (int)lIlIlIlIlIllI[4]);
        if (b.lIllllllIIlIIll(Widgets.isVisible((Widget)var8) ? 1 : 0)) {
            Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[4]]);
            NPC var9 = NPCs.getNearest(nPC -> {
                int n2;
                String[] stringArray = new String[lIlIlIlIlIllI[1]];
                stringArray[b.lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[18]];
                if (b.lIllllllIIlIlII(nPC.hasAction(stringArray) ? 1 : 0) && b.lIllllllIIlIlII(nPC.getName().equals(lIlIlIlIlIIll[lIlIlIlIlIllI[19]]) ? 1 : 0)) {
                    n2 = lIlIlIlIlIllI[1];

                    if ((2 ^ (0x99 ^ 0x9F)) < 0) {
                        return false;
                    }
                } else {
                    n2 = lIlIlIlIlIllI[0];
                }
                return n2 != 0;
            });
            if (b.lIllllllIIlIlIl(var9)) {
                return lIlIlIlIlIllI[0];
            }
            var9.interact(lIlIlIlIlIIll[lIlIlIlIlIllI[5]]);
            return lIlIlIlIlIllI[1];
        }
        Widget[] var9 = var8.getChildren();
        if (!b.lIllllllIIlIllI(var9) || !b.lIllllllIIlIlII(var9.length) || b.lIllllllIIlIlII(var7.a(var9) ? 1 : 0)) {
            Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[6]]);
            var7.x.ClaimingDeathItemsTask(lIlIlIlIlIllI[0]);
            return lIlIlIlIlIllI[1];
        }
        Widget var10 = Widgets.get((int)lIlIlIlIlIllI[3], (int)lIlIlIlIlIllI[7]);
        if (b.lIllllllIIlIlII(Widgets.isVisible((Widget)var10) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIlIlIllI[1]];
            stringArray[b.lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[7]];
            if (b.lIllllllIIlIlII(var10.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[8]]);
                var10.interact(lIlIlIlIlIIll[lIlIlIlIlIllI[9]]);
                return lIlIlIlIlIllI[1];
            }
        }
        if (b.lIllllllIIlIlII(Widgets.isVisible((Widget)var10) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIlIlIllI[1]];
            stringArray[b.lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[10]];
            if (b.lIllllllIIlIlII(var10.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[11]]);
                var10.interact(lIlIlIlIlIIll[lIlIlIlIlIllI[12]]);
                return lIlIlIlIlIllI[1];
            }
        }
        return lIlIlIlIlIllI[0];
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Widget[] widgetArray) {
        void var11;
        Widget[] widgetArray2 = widgetArray;
        int n2 = widgetArray2.length;
        int var12 = lIlIlIlIlIllI[0];
        while (b.lIllllllIIlIlll(var12, (int)var11)) {
            void var13;
            void var14 = var13[var12];
            if (b.lIllllllIIlIlII(Widgets.isVisible((Widget)var14) ? 1 : 0)) {
                return lIlIlIlIlIllI[0];
            }
            ++var12;

            if ((0x13 ^ 0x70 ^ (0x47 ^ 0x20)) >= 0) continue;
            return ((50 + 132 - 166 + 125 ^ 24 + 113 - 16 + 62) & (0x93 ^ 0x95 ^ (0x25 ^ 0x19) ^ -1)) != 0;
        }
        return lIlIlIlIlIllI[1];
    }
}

