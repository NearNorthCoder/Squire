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
package gg.squire.construction.tasks;

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
    private final  ExecutorService gc;
    private final  String gd;
    private static  int[] lIIIllllI;
    private final  Client gb;

    public abstract boolean c(String var1, String var2);

    public void a(MenuEntryAdded menuEntryAdded) {
        if ((this.c(menuEntryAdded.getOption( == 0), menuEntryAdded.getTarget()) ? 1 : 0)) {
            return;
        }
        this.gb.createMenuEntry(this.gb.getMenuOptionCount()).setOption("<col=ffcf40>" + this.gd).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            this.gc.submit(() -> this.a(menuEntryAdded.getMenuEntry()));
            0;
        });
        0;
    }

    static {
        bz.var1();
    }

    @Inject
    public bz(Client client, ExecutorService executorService, String string) {
        this.gb = client;
        this.gc = executorService;
        this.gd = string;
    }

    /*
     * WARNING - void declaration
     */
    public void a(MenuEntry menuEntry) {
        int n2 = 0;
        Iterator var2 = Inventory.getAll(item -> item.hasAction(string -> {
            int n2;
            if (string != null && (this.c(Stringstring, item.getName()) ? 1 : 0)) {
                n2 = 1;
                0;
                if ((0xAD ^ 0xC7 ^ (0x14 ^ 0x7B)) <= 0) {
                    return ((0xE1 ^ 0x90 ^ (0x8F ^ 0xBB)) & (3 ^ (0x60 ^ 0x26) ^ -1)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        })).iterator();
        while ((var2.hasNext( != 0) ? 1 : 0)) {
            void var3;
            void var4;
            Item var5 = (Item)var2.next();
            var5.interact(var4.getIdentifier(), var4.getType().getId(), var5.getSlot(), var4.getParam1());
            if (((int <= 0)(--var3))) {
                0;
                if (((0x3F ^ 0x68) & ~(0x60 ^ 0x37)) <= 0) break;
                return;
            }
            0;
            if ((0xC1 ^ 0x8F ^ (0x4F ^ 5)) >= 0) continue;
            return;
        }
    }
}

