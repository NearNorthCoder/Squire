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
 *  net.runelite.api.MenuEntry
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.repeat.SquireQuickMenuConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.concurrent.ExecutorService;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

@TaskDesc(name="Quick Alching", register=true)
public class QuickAlchingTask
extends Task {
    private static  String[] lIIlIll;
    private final  Client gj;
    private static  int[] lIIllII;
    private  boolean gm;
    private final  ExecutorService gl;
    private final  SquireQuickMenuConfig gk;

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public QuickAlchingTask(Client client, SquireQuickMenuConfig squireQuickMenuConfig, ExecutorService executorService) {
        this.gj = client;
        this.gk = squireQuickMenuConfig;
        this.gl = executorService;
    }

    public boolean run() {
        if (bE.lIIlllIII(this.gm) && bE.lIIlllIII(Tabs.isOpen((Tab)Tab.MAGIC) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
            this.gm = lIIllII[0];
        }
        return lIIllII[0];
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        MenuEntry menuEntry = menuEntryAdded.getMenuEntry();
        if (!bE.lIIlllIII(this.D(menuEntry.getItemId()) ? 1 : 0) || bE.lIIlllIII(menuEntry.getOption().contains(lIIlIll[lIIllII[1]]) ? 1 : 0)) {
            return;
        }
        this.gj.createMenuEntry(this.gj.getMenuOptionCount()).setOption(lIIlIll[lIIllII[2]]).setTarget(menuEntry.getTarget()).setIdentifier(menuEntry.getIdentifier()).setParam1(menuEntry.getParam1()).setParam0(menuEntry.getParam0()).setDeprioritized(lIIllII[0]).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry2 -> {
            this.gl.submit(() -> {
                int[] nArray = new int[lIIllII[1]];
                nArray[bE.lIIllII[0]] = menuEntry.getItemId();
                Magic.cast((SpeSpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)Inventory.getFirst((int[])nArray));
                this.gm = lIIllII[1];
            });
            0;
        });
        0;
    }

    private static String lIIllIIll(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = lIIllII[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = lIIllII[0];
        while (bE.lIIlllIIl(var18, var17)) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (((0x2A ^ 0x3F) & ~(0xA4 ^ 0xB1)) == 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean lIIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean D(int n2) {
        void var20;
        String[] stringArray;
        String[] stringArray2 = stringArray = this.gk.quickAlch().split(lIIlIll[lIIllII[0]]);
        int n3 = stringArray2.length;
        int var21 = lIIllII[0];
        while (bE.lIIlllIIl(var21, (int)var20)) {
            void var22;
            void var23;
            void var24 = var23[var21];
            if (bE.lIIlllIII(var24.trim().equals(String.valueOf((int)var22)) ? 1 : 0)) {
                return lIIllII[1];
            }
            ++var21;
            0;
            if (-2 < 0) continue;
            return ((0x20 ^ 0x4B ^ (0x27 ^ 7)) & (34 + 154 - 148 + 152 ^ 32 + 114 - 31 + 24 ^ -1) & ((0x35 ^ 0x63 ^ (0x38 ^ 0x56)) & (79 + 107 - 170 + 156 ^ 94 + 78 - 117 + 93 ^ -1) ^ -1)) != 0;
        }
        return lIIllII[0];
    }

    private static void lIIllIllI() {
        lIIlIll = new String[lIIllII[3]];
        bE.lIIlIll[bE.lIIllII[0]] = ",";
        bE.lIIlIll[bE.lIIllII[1]] = "Drop";
        bE.lIIlIll[bE.lIIllII[2]] = "<col=ffcf40>Quick Alch";
    }

    private static void lIIllIlll() {
        lIIllII = new int[5];
        bE.lIIllII[0] = (0x13 ^ 0x1C ^ (0x1F ^ 0x73)) & (186 + 114 - 112 + 35 ^ 52 + 77 - 29 + 88 ^ -1);
        bE.lIIllII[1] = 1;
        bE.lIIllII[2] = 2;
        bE.lIIllII[3] = 3;
        bE.lIIllII[4] = 0x66 ^ 0x6E;
    }
}

