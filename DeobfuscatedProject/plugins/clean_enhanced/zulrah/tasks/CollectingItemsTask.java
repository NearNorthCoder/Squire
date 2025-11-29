/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum9;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Collecting items", priority=0x7FFFFFFE, blocking=true, register=true)
public class CollectingItemsTask
extends ZulrahTaskBase {
    
    private static final  int ag;
    private static final  int af;

    static {
        L.var3();
        L.var4();
        af = 6;
        ag = 4;
    }

    @Inject
    public CollectingItemsTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.COLLECTING_ZULRAH);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ac() {
        String var17;
        String[] var18;
        L var19;
        Item var20;
        int[] nArray = new int[0];
        nArray[1] = 2;
        NPC nPC = NPCs.getNearest((int[])nArray);
        if nPC == null {
            return 1;
        }
        int[] nArray2 = new int[0];
        nArray2[1] = 3;
        if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0) && (var20 = Inventory.getFirst(item -> item.getName( != null).endsWith(var2[var1[10]])))) {
            int[] nArray3 = new int[0];
            nArray3[1] = 3;
            var20.useOn(Inventory.getFirst((int[])nArray3));
            return 0;
        }
        if ((Dialog.isOpen( != 0) ? 1 : 0) && (Dialog.getText( != 0).contains(var2[1]) ? 1 : 0)) {
            var19.al.a(c.DONE);
        }
        if ((Widgets.isVisible(Widget(var20 = var19.aj.getWidget(4))) ? 1 : 0) && ((var18 = (var17 = var20.getText( != 0)).split(var2[0]))[1].contains(var2[5]) ? 1 : 0)) {
            var19.al.a(c.DONE);
            return 1;
        }
        var17 = var19.aj.getWidget(6);
        if ((Widgets.isVisible(WidgetllllllllllllllIllIIIlIlllIIIlIII) ? 1 : 0)) {
            String[] stringArray = new String[5];
            stringArray[1] = var2[7];
            stringArray[0] = var2[8];
            var17.interact(stringArray);
            return 0;
        }
        nPC.interact(var2[9]);
        return 0;
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = 1;
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = 1;
        while (var29 < var28) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if ((0x69 ^ 0x6D) >= 3) continue;
            return null;
        }
        return String.valueOf(var24);
    }

}

