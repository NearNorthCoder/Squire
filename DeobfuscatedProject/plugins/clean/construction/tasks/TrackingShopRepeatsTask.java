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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
    private final  AtomicBoolean gr;
    private final  RepeatPlugin gv;
    private final  List<MenuAutomated> gt;
    private final  InputManager gw;
    private  String gy;
    private final  AtomicReference<MenuAutomated> gs;
    private  boolean gx;
    private final  Client gu;

    static {
        bF.lIlIIlIIlI();
        bF.lIlIIIllll();
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (bF.lIlIIlIIll(Shop.isOpen() ? 1 : 0) && bF.lIlIIlIlII(this.gr.get() ? 1 : 0)) {
            if (bF.lIlIIlIlII(this.gx ? 1 : 0)) {
                this.gt.clear();
                this.gx = lIlllIlI[1];
            }
            return;
        }
        this.gx = lIlllIlI[0];
    }

    private static boolean lIlIIlIlll(Object object) {
        return object == null;
    }

    public boolean run() {
        bF llIlllIlIIllllI;
        if (bF.lIlIIlIlII(this.gr.get() ? 1 : 0)) {
            return lIlllIlI[0];
        }
        MenuAutomated llIlllIlIIlllIl = llIlllIlIIllllI.gs.get();
        if (bF.lIlIIlIlll(llIlllIlIIlllIl)) {
            llIlllIlIIllllI.gr.set(lIlllIlI[0]);
            return lIlllIlI[0];
        }
        if (bF.lIlIIlIlII(Shop.isOpen() ? 1 : 0)) {
            NPCPackets.createNpcThirdActionPacket((int)llIlllIlIIlllIl.getIdentifier(), (boolean)lIlllIlI[0]).send();
            return lIlllIlI[1];
        }
        if (bF.lIlIIlIIll(llIlllIlIIllllI.gt.isEmpty() ? 1 : 0)) {
            llIlllIlIIllllI.gr.set(lIlllIlI[0]);
            llIlllIlIIllllI.gs.set(null);
            return lIlllIlI[0];
        }
        Iterator<MenuAutomated> llIlllIlIIlllII = llIlllIlIIllllI.gt.iterator();
        while (bF.lIlIIlIIll(llIlllIlIIlllII.hasNext() ? 1 : 0)) {
            MenuAutomated llIlllIlIIllIll = llIlllIlIIlllII.next();
            llIlllIlIIllllI.gu.interact(llIlllIlIIllIll);

            if (-3 < 0) continue;
            return false;
        }
        Keyboard.type((char)lIlllIlI[4]);
        this.gr.set(lIlllIlI[0]);
        return lIlllIlI[1];
    }

    private static boolean lIlIIlIIll(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIllll() {
        lIllIllI = new String[lIlllIlI[5]];
        bF.lIllIllI[bF.lIlllIlI[0]] = bF.lIlIIIlIll("", "JzIxf");
        bF.lIllIllI[bF.lIlllIlI[1]] = "Trade";
        bF.lIllIllI[bF.lIlllIlI[2]] = "Buy";
        bF.lIllIllI[bF.lIlllIlI[3]] = "<col=ffcf40>Repeat Purchase";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        bF llIlllIlIlIIlII;
        void llIlllIlIlIIIll;
        if (!bF.lIlIIlIlII(this.gt.isEmpty() ? 1 : 0) || bF.lIlIIlIIll(this.gx ? 1 : 0)) {
            return;
        }
        if (!bF.lIlIIlIIll(llIlllIlIlIIIll.getTarget().contains(llIlllIlIlIIlII.gy) ? 1 : 0) || bF.lIlIIlIllI(llIlllIlIlIIIll.getType(), MenuAction.NPC_FIRST_OPTION.getId())) {
            return;
        }
        this.gu.createMenuEntry(this.gu.getMenuOptionCount()).setOption(lIllIllI[lIlllIlI[3]]).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            Point point = Static.getClient().getMouseCanvasPosition();
            MenuAutomated menuAutomated = MenuAutomated.builder().target(menuEntryAdded.getTarget()).identifier(menuEntryAdded.getIdentifier()).opcode(MenuAction.NPC_THIRD_OPTION).option(menuEntryAdded.getOption()).param0(menuEntryAdded.getActionParam0()).param1(menuEntryAdded.getActionParam1()).clickX(point.getX()).clickY(point.getY()).build();
            this.gs.set(menuAutomated);
            this.gr.set(lIlllIlI[1]);
            this.gv.a(point);
        });

    }

    private static boolean lIlIIlIlII(int n2) {
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

    private static boolean lIlIIlIllI(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(llIlllIlIIIlllI);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(MenuOptionClicked menuOptionClicked) {
        void var2_2;
        void llIlllIlIlIlIIl;
        if (bF.lIlIIlIlII(this.gx ? 1 : 0)) {
            if (bF.lIlIIlIIll(menuOptionClicked.getMenuOption().contains(lIllIllI[lIlllIlI[1]]) ? 1 : 0)) {
                this.gy = Text.removeTags((String)menuOptionClicked.getMenuTarget());
            }
            return;
        }
        String llIlllIlIlIlIII = llIlllIlIlIlIIl.getMenuOption();
        if (!bF.lIlIIlIlIl(llIlllIlIlIlIII) || bF.lIlIIlIlII(llIlllIlIlIlIII.contains(lIllIllI[lIlllIlI[2]]) ? 1 : 0)) {
            return;
        }
        MenuAutomated menuAutomated = MenuAutomated.builder().option((String)var2_2).param0(menuOptionClicked.getParam0()).param1(menuOptionClicked.getParam1()).identifier(menuOptionClicked.getId()).opcode(menuOptionClicked.getMenuAction()).target(menuOptionClicked.getMenuTarget()).build();
        this.gt.add(menuAutomated);

    }

    private static boolean lIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIlIl(Object object) {
        return object != null;
    }
}

