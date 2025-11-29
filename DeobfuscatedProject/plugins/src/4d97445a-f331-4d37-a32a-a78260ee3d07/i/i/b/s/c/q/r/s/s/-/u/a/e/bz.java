/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.MenuEntry
 *  net.runelite.api.events.MenuEntryAdded
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuEntryAdded;
import net.unethicalite.api.items.Inventory;

public abstract class bz
extends Task {
    private final /* synthetic */ ExecutorService gc;
    private final /* synthetic */ String gd;
    private static /* synthetic */ int[] lIIIllllI;
    private final /* synthetic */ Client gb;

    private static boolean llllIlllII(int n2) {
        return n2 == 0;
    }

    public abstract boolean c(String var1, String var2);

    public void a(MenuEntryAdded menuEntryAdded) {
        if (bz.llllIlllII(this.c(menuEntryAdded.getOption(), menuEntryAdded.getTarget()) ? 1 : 0)) {
            return;
        }
        this.gb.createMenuEntry(this.gb.getMenuOptionCount()).setOption("<col=ffcf40>" + this.gd).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            this.gc.submit(() -> this.a(menuEntryAdded.getMenuEntry()));
            "".length();
        });
        "".length();
    }

    private static boolean llllIllllI(int n2) {
        return n2 <= 0;
    }

    static {
        bz.llllIllIll();
    }

    @Inject
    public bz(Client client, ExecutorService executorService, String string) {
        this.gb = client;
        this.gc = executorService;
        this.gd = string;
    }

    private static boolean llllIlllll(Object object) {
        return object != null;
    }

    private static boolean llllIlllIl(int n2) {
        return n2 != 0;
    }

    private static void llllIllIll() {
        lIIIllllI = new int[3];
        bz.lIIIllllI[0] = 0xAD ^ 0xA5;
        bz.lIIIllllI[1] = " ".length();
        bz.lIIIllllI[2] = (0x68 ^ 8) & ~(0xDB ^ 0xBB);
    }

    /*
     * WARNING - void declaration
     */
    public void a(MenuEntry menuEntry) {
        int n2 = lIIIllllI[0];
        Iterator llIIlIlIlllIIII = Inventory.getAll(item -> item.hasAction(string -> {
            int n2;
            if (bz.llllIlllll(string) && bz.llllIlllIl(this.c((String)string, item.getName()) ? 1 : 0)) {
                n2 = lIIIllllI[1];
                "".length();
                if ((0xAD ^ 0xC7 ^ (0x14 ^ 0x7B)) <= 0) {
                    return ((0xE1 ^ 0x90 ^ (0x8F ^ 0xBB)) & ("   ".length() ^ (0x60 ^ 0x26) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIIIllllI[2];
            }
            return n2 != 0;
        })).iterator();
        while (bz.llllIlllIl(llIIlIlIlllIIII.hasNext() ? 1 : 0)) {
            void llIIlIlIlllIIIl;
            void llIIlIlIlllIIlI;
            Item llIIlIlIllIllll = (Item)llIIlIlIlllIIII.next();
            llIIlIlIllIllll.interact(llIIlIlIlllIIlI.getIdentifier(), llIIlIlIlllIIlI.getType().getId(), llIIlIlIllIllll.getSlot(), llIIlIlIlllIIlI.getParam1());
            if (bz.llllIllllI((int)(--llIIlIlIlllIIIl))) {
                "".length();
                if (((0x3F ^ 0x68) & ~(0x60 ^ 0x37)) <= 0) break;
                return;
            }
            "".length();
            if ((0xC1 ^ 0x8F ^ (0x4F ^ 5)) >= 0) continue;
            return;
        }
    }
}

