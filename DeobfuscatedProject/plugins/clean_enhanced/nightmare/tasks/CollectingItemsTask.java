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
import java.util.stream.Collectors;
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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[0];
        while (W.var9(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void var21() {
        var2 = new int[30];
        W.var2[0] = (6 ^ 0x52) & ~(0xF2 ^ 0xA6);
        W.var2[1] = 1;
        W.var2[2] = 0xFFFFDB0F & 0x25A24FA;
        W.var2[3] = 0xFFFF927F & 0x25A6D86;
        W.var2[4] = 2;
        W.var2[5] = 3;
        W.var2[6] = 0x64 ^ 0x60;
        W.var2[7] = 0xAD ^ 0xA8;
        W.var2[8] = 0xA9 ^ 0xAF;
        W.var2[9] = 0x53 ^ 0x14 ^ (0x76 ^ 0x36);
        W.var2[10] = 0x60 ^ 0x68;
        W.var2[11] = 41 + 58 - 27 + 56 ^ 73 + 55 - 118 + 127;
        W.var2[12] = 0x4B ^ 0x41;
        W.var2[13] = 0xAE ^ 0x89 ^ (0x2A ^ 6);
        W.var2[14] = 0xB2 ^ 0xBE;
        W.var2[15] = 39 + 106 - 69 + 60 ^ 50 + 117 - 83 + 49;
        W.var2[16] = 0x2F ^ 0x6E ^ (0x27 ^ 0x68);
        W.var2[17] = 0xFFFFD0BF & 0x3FDB;
        W.var2[18] = 0xFFFFF7DC & 0x5FA3;
        W.var2[19] = 0x8D ^ 0x82;
        W.var2[20] = 0xE1 ^ 0xAE ^ (0xC5 ^ 0x9A);
        W.var2[21] = 7 ^ 0x16;
        W.var2[22] = 0x91 ^ 0x83;
        W.var2[23] = 2 + 57 - -84 + 34 ^ 82 + 48 - 37 + 69;
        W.var2[24] = 100 + 30 - 81 + 82 ^ 137 + 58 - 176 + 132;
        W.var2[25] = 0x65 ^ 0x46 ^ (0x5D ^ 0x6B);
        W.var2[26] = 0xD3 ^ 0xC5;
        W.var2[27] = -(0xFFFFDD91 & 0x737F) & (0xFFFFDFFB & 0x7FF7);
        W.var2[28] = 0xFFFFFEB3 & 0x277D;
        W.var2[29] = 0x5C ^ 0x4B;
    }

    private static boolean var22(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        W var23;
        void var24;
        if (W.var22(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var25 = var24.getMessage();
        if (W.var26(var25.contains(var1[var2[21]]) ? 1 : 0)) {
            var23.cW.k(var2[1]);
            return;
        }
        if (W.var26(var25.contains(var1[var2[22]]) ? 1 : 0) && W.var26(Inventory.isFull() ? 1 : 0)) {
            var23.dA.bi();
            0;
            if (W.var27(Inventory.isFull() ? 1 : 0)) {
                return;
            }
            EquipmentSetup var28 = ((BankLoadout)var23.cV.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
            if (W.var27(var28.isFullyEquipped() ? 1 : 0)) {
                Log.info((String)var1[var2[23]]);
                var28.swap();
            }
        }
    }

    private static void var29() {
        var1 = new String[var2[29]];
        W.var1[W.var2[0]] = "Sister Senga has some of your items";
        W.var1[W.var2[1]] = "Collect";
        W.var1[W.var2[4]] = "[DEATH COLLECTION] no melee gear selected, cannot collect items!";
        W.var1[W.var2[5]] = "[DEATH COLLECTION] Equipping melee gear";
        W.var1[W.var2[6]] = "<br>";
        W.var1[W.var2[7]] = "[death collection]loot collection widget text = {}";
        W.var1[W.var2[8]] = "[death collection]loot collection widget lines = {}";
        W.var1[W.var2[9]] = ">0<";
        W.var1[W.var2[10]] = "[DEATH COLLECTION] finished collection items...triggered by >0<";
        W.var1[W.var2[11]] = "Inventory is still full after equipping gear. Found: {}";
        W.var1[W.var2[12]] = "Drop";
        W.var1[W.var2[13]] = "Unlock";
        W.var1[W.var2[14]] = "Take-All";
        W.var1[W.var2[15]] = "don't have anything for you";
        W.var1[W.var2[16]] = "[DEATH COLLECTION] (onWidgetHiddenChanged) finished collection items...";
        W.var1[W.var2[19]] = "Ver Sinhaza";
        W.var1[W.var2[20]] = "Empty";
        W.var1[W.var2[21]] = "has retrieved some of your items";
        W.var1[W.var2[22]] = "inventory is too full";
        W.var1[W.var2[23]] = "[DEATH COLLECTION] Equipping melee gear";
        W.var1[W.var2[24]] = "Eat";
        W.var1[W.var2[25]] = "Senga";
        W.var1[W.var2[26]] = "Collect";
    }

    private static boolean var30(Object object) {
        return object != null;
    }

    static {
        W.var21();
        W.var29();
        dw = var2[3];
        dx = var2[2];
        dv = LoggerFactory.getLogger(CollectingItemsTask.class);
        dy = new WorldPoint(var2[27], var2[28], var2[1]);
    }

    private static boolean var26(int n2) {
        return n2 != 0;
    }

    @Inject
    protected CollectingItemsTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2, l l2, Client client) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dz = client;
        this.dA = l2;
    }

    public boolean m() {
        W var31;
        if (W.var26(this.cV.useFireSpells() ? 1 : 0)) {
            this.cW.t(var2[1]);
        }
        var31.cW.k(var2[0]);
        int[] nArray = new int[var2[1]];
        nArray[W.var2[0]] = var2[17];
        Item var32 = Inventory.getFirst((int[])nArray);
        if (W.var10(var32)) {
            int[] nArray2 = new int[var2[1]];
            nArray2[W.var2[0]] = var2[18];
            var32 = Inventory.getFirst((int[])nArray2);
        }
        var31.cW.b(var2[1]);
        if (W.var30(var32)) {
            String[] stringArray = new String[var2[4]];
            stringArray[W.var2[0]] = var1[var2[19]];
            stringArray[W.var2[1]] = var1[var2[20]];
            var32.interact(stringArray);
        }
        return var2[1];
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(WidgetHiddenChanged widgetHiddenChanged) {
        if (W.var30(widgetHiddenChanged.getWidget().getText()) && W.var26(Text.sanitizeMultilineText((String)widgetHiddenChanged.getWidget().getText().toLowerCase()).contains(var1[var2[15]]) ? 1 : 0)) {
            dv.info(var1[var2[16]]);
            this.m();
            0;
        }
    }

    private static boolean var27(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bY() {
        String var39;
        EquipmentSetup var40;
        W var41;
        if (W.var26(Dialog.isOpen() ? 1 : 0) && W.var26(Dialog.getName().contains(var1[var2[0]]) ? 1 : 0)) {
            this.cW.k(var2[1]);
        }
        if (W.var27(var41.cW.ad() ? 1 : 0)) {
            return var2[0];
        }
        if (W.var26(Bank.isPinWindowOpen() ? 1 : 0)) {
            return Bank.enterBankPin();
        }
        if (W.var27(Movement.shouldWalk() ? 1 : 0)) {
            return var2[0];
        }
        Widget var42 = var41.dz.getWidget(var2[2]);
        Widget var43 = var41.dz.getWidget(var2[3]);
        Widget var44 = Static.getClient().getWidget(WidgetInfo.DIALOG_NPC_TEXT);
        NPC var45 = NPCs.getNearest(nPC -> {
            int n2;
            if (W.var26(nPC.getName().contains(var1[var2[25]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[W.var2[0]] = var1[var2[26]];
                if (W.var26(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if (3 != -1) return n2 != 0;
                    return ((0xD3 ^ 0xA8 ^ (0x4D ^ 0x19)) & (35 + 59 - -56 + 28 ^ 99 + 18 - -8 + 32 ^ -1)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        });
        if (!W.var30(var45) || W.var27(Reachable.isInteractable((Locatable)var45) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)dy);
            0;
            return var2[1];
        }
        if (W.var27(Widgets.isVisible((Widget)var43) ? 1 : 0) && W.var27(Widgets.isVisible((Widget)var42) ? 1 : 0) && W.var27(Widgets.isVisible((Widget)var44) ? 1 : 0) && W.var27(Dialog.isOpen() ? 1 : 0)) {
            var45.interact(var1[var2[1]]);
        }
        if (W.var10(var40 = ((BankLoadout)var41.cV.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup())) {
            dv.info(var1[var2[4]]);
            return var2[0];
        }
        if (W.var27(var40.isFullyEquipped() ? 1 : 0)) {
            Log.info((String)var1[var2[5]]);
            var40.swap();
            var41.sleep(var2[4]);
        }
        if (W.var26(var41.dA.bi() ? 1 : 0)) {
            var41.sleep(var2[1]);
            return var2[1];
        }
        if (W.var26(Widgets.isVisible((Widget)var42) ? 1 : 0)) {
            var39 = var42.getText();
            String[] var46 = var39.split(var1[var2[6]]);
            dv.debug(var1[var2[7]], (Object)var39);
            dv.debug(var1[var2[8]], Arrays.stream(var46).collect(Collectors.toList()));
            if (W.var26(var46[var2[0]].contains(var1[var2[9]]) ? 1 : 0)) {
                dv.debug(var1[var2[10]]);
                var41.m();
                0;
                return var2[1];
            }
        }
        if (W.var26(Inventory.isFull() ? 1 : 0)) {
            var39 = Inventory.getFirst(item -> {
                String[] stringArray = new String[var2[1]];
                stringArray[W.var2[0]] = var1[var2[24]];
                return item.hasAction(stringArray);
            });
            Object[] objectArray = new Object[var2[1]];
            objectArray[W.var2[0]] = var39;
            Log.info((String)var1[var2[11]], (Object[])objectArray);
            if (W.var30(var39)) {
                var39.interact(var1[var2[12]]);
            }
        }
        if (W.var26(Widgets.isVisible((Widget)var43) ? 1 : 0)) {
            String[] stringArray = new String[var2[4]];
            stringArray[W.var2[0]] = var1[var2[13]];
            stringArray[W.var2[1]] = var1[var2[14]];
            var43.interact(stringArray);
            if (W.var26(Bank.isPinWindowOpen() ? 1 : 0)) {
                return Bank.enterBankPin();
            }
            return var2[1];
        }
        return var2[1];
    }
}

