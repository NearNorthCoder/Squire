/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Bulk opening", register=true)
public class BulkOpeningTask
extends Task {
    private final  ExecutorService gf;
    private static  int[] lIIIllIll;
    private  String gg;
    private final  Client ge;
    private static  String[] lIIIllIIl;

    public boolean run() {
        return 0;
    }

    private static String var1(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = 0;
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = 0;
        while (var9 < var8) {
            char var10 = var7[var9];
            var4.append((char)(var10 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if (((6 ^ 0x56) & ~(0xF3 ^ 0xA3)) < 2) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    public boolean cN() {
        bB var11;
        if (this.gg == null) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var11.gg;
        List var12 = Inventory.getAll((String[])stringArray);
        int var13 = 0;
        Iterator var14 = var12.iterator();
        while ((var14.hasNext( != 0) ? 1 : 0)) {
            Item var15 = (Item)var14.next();
            if (var13++ > 2) {
                0;
                if (3 >= 0) break;
                return ((94 + 0 - -58 + 5 ^ 89 + 28 - 20 + 49) & (69 + 25 - 41 + 112 ^ 103 + 44 - 134 + 157 ^ -1)) != 0;
            }
            var15.interact(lIIIllIIl[0]);
            0;
            if (3 != ((42 + 41 - -13 + 50 ^ 61 + 59 - 78 + 115) & (0x15 ^ 0x4C ^ (0x4B ^ 0x1D) ^ -1))) continue;
            return ((0x58 ^ 0x17 ^ (0xD ^ 1)) & (95 + 57 - -44 + 9 ^ 124 + 138 - 190 + 70 ^ -1)) != 0;
        }
        this.sleep(1);
        this.gg = null;
        return 1;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        if (!(lIIIllIIl[1].equals(menuEntryAdded.getOption( != 0)) ? 1 : 0) || (menuEntryAdded.getTarget( == 0).contains(lIIIllIIl[3]) ? 1 : 0)) {
            return;
        }
        this.ge.createMenuEntry(this.ge.getMenuOptionCount()).setOption(lIIIllIIl[4]).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            this.gg = Text.removeTags((String)menuEntryAdded.getTarget());
            this.gf.submit(this::cN);
            0;
        });
        0;
    }

    @Inject
    public BulkOpeningTask(Client client, ExecutorService executorService) {
        this.ge = client;
        this.gf = executorService;
    }
}

