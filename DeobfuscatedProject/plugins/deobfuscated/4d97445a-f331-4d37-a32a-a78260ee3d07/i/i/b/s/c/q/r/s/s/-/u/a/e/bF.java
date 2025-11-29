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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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
public class bF
extends Task {
    private static /* synthetic */ int[] lIlllIlI;
    private final /* synthetic */ AtomicBoolean gr;
    private final /* synthetic */ RepeatPlugin gv;
    private final /* synthetic */ List<MenuAutomated> gt;
    private final /* synthetic */ InputManager gw;
    private /* synthetic */ String gy;
    private final /* synthetic */ AtomicReference<MenuAutomated> gs;
    private /* synthetic */ boolean gx;
    private final /* synthetic */ Client gu;
    private static /* synthetic */ String[] lIllIllI;

    static {
        bF.lIlIIlIIlI();
        bF.lIlIIIllll();
    }

    private static String lIlIIIllII(String llIlllIIllIlllI, String llIlllIIllIlIll) {
        try {
            SecretKeySpec llIlllIIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlllIIlllIIII = Cipher.getInstance("Blowfish");
            llIlllIIlllIIII.init(lIlllIlI[2], llIlllIIlllIIIl);
            return new String(llIlllIIlllIIII.doFinal(Base64.getDecoder().decode(llIlllIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllIIllIllll) {
            llIlllIIllIllll.printStackTrace();
            return null;
        }
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
            0;
            if (-3 < 0) continue;
            return ((0x5C ^ 0x6B) & ~(0x27 ^ 0x10)) != 0;
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
        bF.lIllIllI[bF.lIlllIlI[0]] = bF."";
        bF.lIllIllI[bF.lIlllIlI[1]] = bF."Trade";
        bF.lIllIllI[bF.lIlllIlI[2]] = bF."Buy";
        bF.lIllIllI[bF.lIlllIlI[3]] = bF."<col=ffcf40>Repeat Purchase";
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
        0;
    }

    private static boolean lIlIIlIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    public bF(Client client, RepeatPlugin repeatPlugin, InputManager inputManager) {
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

    private static void lIlIIlIIlI() {
        lIlllIlI = new int[7];
        bF.lIlllIlI[0] = (128 + 22 - 80 + 80 ^ 161 + 9 - 27 + 34) & (0x19 ^ 0x54 ^ (0x51 ^ 0x3B) ^ -1);
        bF.lIlllIlI[1] = 1;
        bF.lIlllIlI[2] = 2;
        bF.lIlllIlI[3] = 3;
        bF.lIlllIlI[4] = 92 + 5 - 5 + 82 ^ 69 + 123 - 136 + 125;
        bF.lIlllIlI[5] = 0xCE ^ 0xC7 ^ (0x43 ^ 0x4E);
        bF.lIlllIlI[6] = 0xEB ^ 0x90 ^ (0xF4 ^ 0x87);
    }

    private static String lIlIIIlIll(String llIlllIlIIlIIII, String llIlllIlIIIllll) {
        llIlllIlIIlIIII = new String(Base64.getDecoder().decode(llIlllIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIlIIIlllI = new StringBuilder();
        char[] llIlllIlIIIllIl = llIlllIlIIIllll.toCharArray();
        int llIlllIlIIIllII = lIlllIlI[0];
        char[] llIlllIlIIIIllI = llIlllIlIIlIIII.toCharArray();
        int llIlllIlIIIIlIl = llIlllIlIIIIllI.length;
        int llIlllIlIIIIlII = lIlllIlI[0];
        while (bF.lIlIIllIIl(llIlllIlIIIIlII, llIlllIlIIIIlIl)) {
            char llIlllIlIIlIIIl = llIlllIlIIIIllI[llIlllIlIIIIlII];
            llIlllIlIIIlllI.append((char)(llIlllIlIIlIIIl ^ llIlllIlIIIllIl[llIlllIlIIIllII % llIlllIlIIIllIl.length]));
            0;
            ++llIlllIlIIIllII;
            ++llIlllIlIIIIlII;
            0;
            if ((145 + 12 - 142 + 164 ^ 85 + 36 - 52 + 114) >= (9 ^ 0x2F ^ (0x98 ^ 0xBA))) continue;
            return null;
        }
        return String.valueOf(llIlllIlIIIlllI);
    }

    private static String lIlIIIllIl(String llIlllIIllllIll, String llIlllIIllllIII) {
        try {
            SecretKeySpec llIlllIIllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIIllllIII.getBytes(StandardCharsets.UTF_8)), lIlllIlI[6]), "DES");
            Cipher llIlllIIlllllIl = Cipher.getInstance("DES");
            llIlllIIlllllIl.init(lIlllIlI[2], llIlllIIllllllI);
            return new String(llIlllIIlllllIl.doFinal(Base64.getDecoder().decode(llIlllIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllIIlllllII) {
            llIlllIIlllllII.printStackTrace();
            return null;
        }
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
        0;
    }

    private static boolean lIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIlIl(Object object) {
        return object != null;
    }
}

