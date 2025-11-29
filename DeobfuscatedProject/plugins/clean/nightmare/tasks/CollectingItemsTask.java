/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.WidgetHiddenChanged
 *  net.runelite.api.util.Text
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.WidgetHiddenChanged;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Collecting items", priority=0x7FFFFFFE, blocking=true, register=true)
public class CollectingItemsTask
extends NightmareTaskBase {
    private final  Client dz;
    private static final  WorldPoint dy;
    private static final  Logger dv;
    private final  l dA;
    private static final  int dx;

    private static final  int dw;

    private static boolean lIIlIIIlIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIlIlIllll(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIIlIllIIII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        W var2;
        void var3;
        if (W.lIIlIIIlIllIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var4 = var3.getMessage();
        if (W.lIIlIIIlIlIllII(var4.contains(llllIllIIIlI[llllIllIIIll[21]]) ? 1 : 0)) {
            var2.cW.k(llllIllIIIll[1]);
            return;
        }
        if (W.lIIlIIIlIlIllII(var4.contains(llllIllIIIlI[llllIllIIIll[22]]) ? 1 : 0) && W.lIIlIIIlIlIllII(Inventory.isFull() ? 1 : 0)) {
            var2.dA.bi();

            if (W.lIIlIIIlIlIllIl(Inventory.isFull() ? 1 : 0)) {
                return;
            }
            EquipmentSetup var5 = ((BankLoadout)var2.cV.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
            if (W.lIIlIIIlIlIllIl(var5.isFullyEquipped() ? 1 : 0)) {
                Log.info((String)llllIllIIIlI[llllIllIIIll[23]]);
                var5.swap();
            }
        }
    }

    private static void lIIlIIIlIlIlIlI() {
        llllIllIIIlI = new String[llllIllIIIll[29]];
        W.llllIllIIIlI[W.llllIllIIIll[0]] = "Sister Senga has some of your items";
        W.llllIllIIIlI[W.llllIllIIIll[1]] = "Collect";
        W.llllIllIIIlI[W.llllIllIIIll[4]] = "[DEATH COLLECTION] no melee gear selected, cannot collect items!";
        W.llllIllIIIlI[W.llllIllIIIll[5]] = "[DEATH COLLECTION] Equipping melee gear";
        W.llllIllIIIlI[W.llllIllIIIll[6]] = "<br>";
        W.llllIllIIIlI[W.llllIllIIIll[7]] = "[death collection]loot collection widget text = {}";
        W.llllIllIIIlI[W.llllIllIIIll[8]] = "[death collection]loot collection widget lines = {}";
        W.llllIllIIIlI[W.llllIllIIIll[9]] = ">0<";
        W.llllIllIIIlI[W.llllIllIIIll[10]] = "[DEATH COLLECTION] finished collection items...triggered by >0<";
        W.llllIllIIIlI[W.llllIllIIIll[11]] = "Inventory is still full after equipping gear. Found: {}";
        W.llllIllIIIlI[W.llllIllIIIll[12]] = "Drop";
        W.llllIllIIIlI[W.llllIllIIIll[13]] = "Unlock";
        W.llllIllIIIlI[W.llllIllIIIll[14]] = "Take-All";
        W.llllIllIIIlI[W.llllIllIIIll[15]] = "don't have anything for you";
        W.llllIllIIIlI[W.llllIllIIIll[16]] = "[DEATH COLLECTION] (onWidgetHiddenChanged) finished collection items...";
        W.llllIllIIIlI[W.llllIllIIIll[19]] = "Ver Sinhaza";
        W.llllIllIIIlI[W.llllIllIIIll[20]] = "Empty";
        W.llllIllIIIlI[W.llllIllIIIll[21]] = "has retrieved some of your items";
        W.llllIllIIIlI[W.llllIllIIIll[22]] = "inventory is too full";
        W.llllIllIIIlI[W.llllIllIIIll[23]] = "[DEATH COLLECTION] Equipping melee gear";
        W.llllIllIIIlI[W.llllIllIIIll[24]] = "Eat";
        W.llllIllIIIlI[W.llllIllIIIll[25]] = "Senga";
        W.llllIllIIIlI[W.llllIllIIIll[26]] = "Collect";
    }

    private static boolean lIIlIIIlIlIlllI(Object object) {
        return object != null;
    }

    static {
        W.lIIlIIIlIlIlIll();
        W.lIIlIIIlIlIlIlI();
        dw = llllIllIIIll[3];
        dx = llllIllIIIll[2];
        dv = LoggerFactory.getLogger(CollectingItemsTask.class);
        dy = new WorldPoint(llllIllIIIll[27], llllIllIIIll[28], llllIllIIIll[1]);
    }

    private static boolean lIIlIIIlIlIllII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected CollectingItemsTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2, l l2, Client client) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dz = client;
        this.dA = l2;
    }

    public boolean m() {
        W var6;
        if (W.lIIlIIIlIlIllII(this.cV.useFireSpells() ? 1 : 0)) {
            this.cW.t(llllIllIIIll[1]);
        }
        var6.cW.k(llllIllIIIll[0]);
        int[] nArray = new int[llllIllIIIll[1]];
        nArray[W.llllIllIIIll[0]] = llllIllIIIll[17];
        Item var7 = Inventory.getFirst((int[])nArray);
        if (W.lIIlIIIlIlIllll(var7)) {
            int[] nArray2 = new int[llllIllIIIll[1]];
            nArray2[W.llllIllIIIll[0]] = llllIllIIIll[18];
            var7 = Inventory.getFirst((int[])nArray2);
        }
        var6.cW.b(llllIllIIIll[1]);
        if (W.lIIlIIIlIlIlllI(var7)) {
            String[] stringArray = new String[llllIllIIIll[4]];
            stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[19]];
            stringArray[W.llllIllIIIll[1]] = llllIllIIIlI[llllIllIIIll[20]];
            var7.interact(stringArray);
        }
        return llllIllIIIll[1];
    }

    @Subscribe
    private void a(WidgetHiddenChanged widgetHiddenChanged) {
        if (W.lIIlIIIlIlIlllI(widgetHiddenChanged.getWidget().getText()) && W.lIIlIIIlIlIllII(Text.sanitizeMultilineText((String)widgetHiddenChanged.getWidget().getText().toLowerCase()).contains(llllIllIIIlI[llllIllIIIll[15]]) ? 1 : 0)) {
            dv.info(llllIllIIIlI[llllIllIIIll[16]]);
            this.m();

        }
    }

    private static boolean lIIlIIIlIlIllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bY() {
        String var8;
        EquipmentSetup var9;
        W var10;
        if (W.lIIlIIIlIlIllII(Dialog.isOpen() ? 1 : 0) && W.lIIlIIIlIlIllII(Dialog.getName().contains(llllIllIIIlI[llllIllIIIll[0]]) ? 1 : 0)) {
            this.cW.k(llllIllIIIll[1]);
        }
        if (W.lIIlIIIlIlIllIl(var10.cW.ad() ? 1 : 0)) {
            return llllIllIIIll[0];
        }
        if (W.lIIlIIIlIlIllII(Bank.isPinWindowOpen() ? 1 : 0)) {
            return Bank.enterBankPin();
        }
        if (W.lIIlIIIlIlIllIl(Movement.shouldWalk() ? 1 : 0)) {
            return llllIllIIIll[0];
        }
        Widget var11 = var10.dz.getWidget(llllIllIIIll[2]);
        Widget var12 = var10.dz.getWidget(llllIllIIIll[3]);
        Widget var13 = Static.getClient().getWidget(WidgetInfo.DIALOG_NPC_TEXT);
        NPC var14 = NPCs.getNearest(nPC -> {
            int n2;
            if (W.lIIlIIIlIlIllII(nPC.getName().contains(llllIllIIIlI[llllIllIIIll[25]]) ? 1 : 0)) {
                String[] stringArray = new String[llllIllIIIll[1]];
                stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[26]];
                if (W.lIIlIIIlIlIllII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llllIllIIIll[1];

                    if (3 != -1) return n2 != 0;
                    return ((0xD3 ^ 0xA8 ^ (0x4D ^ 0x19)) & (35 + 59 - -56 + 28 ^ 99 + 18 - -8 + 32 ^ -1)) != 0;
                }
            }
            n2 = llllIllIIIll[0];
            return n2 != 0;
        });
        if (!W.lIIlIIIlIlIlllI(var14) || W.lIIlIIIlIlIllIl(Reachable.isInteractable((Locatable)var14) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)dy);

            return llllIllIIIll[1];
        }
        if (W.lIIlIIIlIlIllIl(Widgets.isVisible((Widget)var12) ? 1 : 0) && W.lIIlIIIlIlIllIl(Widgets.isVisible((Widget)var11) ? 1 : 0) && W.lIIlIIIlIlIllIl(Widgets.isVisible((Widget)var13) ? 1 : 0) && W.lIIlIIIlIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            var14.interact(llllIllIIIlI[llllIllIIIll[1]]);
        }
        if (W.lIIlIIIlIlIllll(var9 = ((BankLoadout)var10.cV.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup())) {
            dv.info(llllIllIIIlI[llllIllIIIll[4]]);
            return llllIllIIIll[0];
        }
        if (W.lIIlIIIlIlIllIl(var9.isFullyEquipped() ? 1 : 0)) {
            Log.info((String)llllIllIIIlI[llllIllIIIll[5]]);
            var9.swap();
            var10.sleep(llllIllIIIll[4]);
        }
        if (W.lIIlIIIlIlIllII(var10.dA.bi() ? 1 : 0)) {
            var10.sleep(llllIllIIIll[1]);
            return llllIllIIIll[1];
        }
        if (W.lIIlIIIlIlIllII(Widgets.isVisible((Widget)var11) ? 1 : 0)) {
            var8 = var11.getText();
            String[] var15 = var8.split(llllIllIIIlI[llllIllIIIll[6]]);
            dv.debug(llllIllIIIlI[llllIllIIIll[7]], (Object)var8);
            dv.debug(llllIllIIIlI[llllIllIIIll[8]], Arrays.stream(var15).collect(Collectors.toList()));
            if (W.lIIlIIIlIlIllII(var15[llllIllIIIll[0]].contains(llllIllIIIlI[llllIllIIIll[9]]) ? 1 : 0)) {
                dv.debug(llllIllIIIlI[llllIllIIIll[10]]);
                var10.m();

                return llllIllIIIll[1];
            }
        }
        if (W.lIIlIIIlIlIllII(Inventory.isFull() ? 1 : 0)) {
            var8 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llllIllIIIll[1]];
                stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[24]];
                return item.hasAction(stringArray);
            });
            Object[] objectArray = new Object[llllIllIIIll[1]];
            objectArray[W.llllIllIIIll[0]] = var8;
            Log.info((String)llllIllIIIlI[llllIllIIIll[11]], (Object[])objectArray);
            if (W.lIIlIIIlIlIlllI(var8)) {
                var8.interact(llllIllIIIlI[llllIllIIIll[12]]);
            }
        }
        if (W.lIIlIIIlIlIllII(Widgets.isVisible((Widget)var12) ? 1 : 0)) {
            String[] stringArray = new String[llllIllIIIll[4]];
            stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[13]];
            stringArray[W.llllIllIIIll[1]] = llllIllIIIlI[llllIllIIIll[14]];
            var12.interact(stringArray);
            if (W.lIIlIIIlIlIllII(Bank.isPinWindowOpen() ? 1 : 0)) {
                return Bank.enterBankPin();
            }
            return llllIllIIIll[1];
        }
        return llllIllIIIll[1];
    }
}

