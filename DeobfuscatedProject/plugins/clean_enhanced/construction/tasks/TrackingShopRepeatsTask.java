/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Point
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.events.MenuAutomated
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.packets.NPCPackets
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.InputManager
 */
package gg.squire.construction.tasks;

import gg.squire.basics.repeat.RepeatPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.packets.NPCPackets;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.InputManager;

@TaskDesc(name="Tracking shop repeats", register=true)
public class TrackingShopRepeatsTask
extends Task {
    private static  int[] lIlllIlI;
    private final  AtomicBoolean gr;
    private final  RepeatPlugin gv;
    private final  List<MenuAutomated> gt;
    private final  InputManager gw;
    private  String gy;
    private final  AtomicReference<MenuAutomated> gs;
    private  boolean gx;
    private final  Client gu;
    private static  String[] lIllIllI;

    static {
        bF.var1();
        bF.var2();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (bF.var9(Shop.isOpen() ? 1 : 0) && bF.var10(this.gr.get() ? 1 : 0)) {
            if (bF.var10(this.gx)) {
                this.gt.clear();
                this.gx = lIlllIlI[1];
            }
            return;
        }
        this.gx = lIlllIlI[0];
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    public boolean run() {
        bF var12;
        if (bF.var10(this.gr.get() ? 1 : 0)) {
            return lIlllIlI[0];
        }
        MenuAutomated var13 = var12.gs.get();
        if (bF.var11(var13)) {
            var12.gr.set(lIlllIlI[0]);
            return lIlllIlI[0];
        }
        if (bF.var10(Shop.isOpen() ? 1 : 0)) {
            NPCPackets.createNpcThirdActionPacket((int)var13.getIdentifier(), (boolean)lIlllIlI[0]).send();
            return lIlllIlI[1];
        }
        if (bF.var9(var12.gt.isEmpty() ? 1 : 0)) {
            var12.gr.set(lIlllIlI[0]);
            var12.gs.set(null);
            return lIlllIlI[0];
        }
        Iterator<MenuAutomated> var14 = var12.gt.iterator();
        while (bF.var9(var14.hasNext() ? 1 : 0)) {
            MenuAutomated var15 = var14.next();
            var12.gu.interact(var15);
            0;
            if (-3 < 0) continue;
            return ((0x5C ^ 0x6B) & ~(0x27 ^ 0x10)) != 0;
        }
        Keyboard.type((char)lIlllIlI[4]);
        this.gr.set(lIlllIlI[0]);
        return lIlllIlI[1];
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static void var2() {
        lIllIllI = new String[lIlllIlI[5]];
        bF.lIllIllI[bF.lIlllIlI[0]] = bF.var16("", "JzIxf");
        bF.lIllIllI[bF.lIlllIlI[1]] = "Trade";
        bF.lIllIllI[bF.lIlllIlI[2]] = "Buy";
        bF.lIllIllI[bF.lIlllIlI[3]] = "<col=ffcf40>Repeat Purchase";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        bF var17;
        void var18;
        if (!bF.var10(this.gt.isEmpty() ? 1 : 0) || bF.var9(this.gx)) {
            return;
        }
        if (!bF.var9(var18.getTarget().contains(var17.gy) ? 1 : 0) || bF.var19(var18.getType(), MenuAction.NPC_FIRST_OPTION.getId())) {
            return;
        }
        this.gu.createMenuEntry(this.gu.getMenuOptionCount()).setOption(lIllIllI[lIlllIlI[3]]).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            Point point = Static.getClient().getMouseCanvasPosition();
            MenuAutomated menuAutomated = MenuAutomated.builder().target(menuEntryAdded.getTarget()).identifier(menuEntryAdded.getIdentifier()).opcode(MenuAction.NPC_THIRD_OPTION).option(menuEntryAdded.getOption()).param0(menuEntryAdded.getActionParam0()).param1(menuEntryAdded.getActionParam1()).clickX(point.getX()).clickY(point.getY()).build();
            this.gs.set(menuAutomated);
            this.gr.set(lIlllIlI[1]);
            this.gv.a(point);
        });
        0;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    @Inject
    public TrackingShopRepeatsTask(Client client, RepeatPlugin repeatPlugin, InputManager inputManager) {
        this.gr = new AtomicBoolean(lIlllIlI[0]);
        this.gs = new AtomicReference<Object>(null);
        this.gt = new ArrayList<MenuAutomated>();
        this.gy = lIllIllI[lIlllIlI[0]];
        this.gu = client;
        this.gv = repeatPlugin;
        this.gw = inputManager;
    }

    private static boolean var19(int n2, int n3) {
        return n2 != n3;
    }

    private static void var1() {
        lIlllIlI = new int[7];
        bF.lIlllIlI[0] = (128 + 22 - 80 + 80 ^ 161 + 9 - 27 + 34) & (0x19 ^ 0x54 ^ (0x51 ^ 0x3B) ^ -1);
        bF.lIlllIlI[1] = 1;
        bF.lIlllIlI[2] = 2;
        bF.lIlllIlI[3] = 3;
        bF.lIlllIlI[4] = 92 + 5 - 5 + 82 ^ 69 + 123 - 136 + 125;
        bF.lIlllIlI[5] = 0xCE ^ 0xC7 ^ (0x43 ^ 0x4E);
        bF.lIlllIlI[6] = 0xEB ^ 0x90 ^ (0xF4 ^ 0x87);
    }

    private static String var16(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = lIlllIlI[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = lIlllIlI[0];
        while (bF.var28(var27, var26)) {
            char var29 = var25[var27];
            var22.append((char)(var29 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if ((145 + 12 - 142 + 164 ^ 85 + 36 - 52 + 114) >= (9 ^ 0x2F ^ (0x98 ^ 0xBA))) continue;
            return null;
        }
        return String.valueOf(var22);
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(MenuOptionClicked menuOptionClicked) {
        void var2_2;
        void var36;
        if (bF.var10(this.gx)) {
            if (bF.var9(menuOptionClicked.getMenuOption().contains(lIllIllI[lIlllIlI[1]]) ? 1 : 0)) {
                this.gy = Text.removeTags((String)menuOptionClicked.getMenuTarget());
            }
            return;
        }
        String var37 = var36.getMenuOption();
        if (!bF.var38(var37) || bF.var10(var37.contains(lIllIllI[lIlllIlI[2]]) ? 1 : 0)) {
            return;
        }
        MenuAutomated menuAutomated = MenuAutomated.builder().option((String)var2_2).param0(menuOptionClicked.getParam0()).param1(menuOptionClicked.getParam1()).identifier(menuOptionClicked.getId()).opcode(menuOptionClicked.getMenuAction()).target(menuOptionClicked.getMenuTarget()).build();
        this.gt.add(menuAutomated);
        0;
    }

    private static boolean var28(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var38(Object object) {
        return object != null;
    }
}

