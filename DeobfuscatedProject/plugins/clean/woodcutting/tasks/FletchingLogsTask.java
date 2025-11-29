/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package gg.squire.woodcutting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

@TaskDesc(name="Fletching Logs", priority=10)
public class FletchingLogsTask
extends Task {
    
    private final  SquireWoodcutterConfig B;

    private static boolean llIIIIlllllIIlI(int n) {
        return n != 0;
    }

    static {
        e.llIIIIlllllIIII();
        e.llIIIIllllIllll();
    }

    private static boolean llIIIIlllllIIIl(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var1_1;
        if (e.llIIIIlllllIIIl(this.B.cutLogs() ? 1 : 0)) {
            return lIllIIIIIlIII[0];
        }
        int[] nArray = new int[lIllIIIIIlIII[1]];
        nArray[e.lIllIIIIIlIII[0]] = lIllIIIIIlIII[2];
        if (e.llIIIIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIllIIIIIlIII[0];
        }
        if (e.llIIIIlllllIIIl(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIIIlIII[0];
        }
        if (e.llIIIIlllllIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIllIIIIIlIII[1];
        }
        if (e.llIIIIlllllIIIl(Tabs.isOpen((Tab)Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
            return lIllIIIIIlIII[1];
        }
        Item var1 = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(lIllIIIIIIlll[lIllIIIIIlIII[0]]));
        if (e.llIIIIlllllIIll(var1)) {
            return lIllIIIIIlIII[0];
        }
        int[] nArray2 = new int[lIllIIIIIlIII[1]];
        nArray2[e.lIllIIIIIlIII[0]] = lIllIIIIIlIII[2];
        Item var2 = Inventory.getFirst((int[])nArray2);
        if (e.llIIIIlllllIIlI(Production.isOpen() ? 1 : 0)) {
            e var3;
            Production.choosePreviousOption();
            var3.sleep(lIllIIIIIlIII[3]);
            return lIllIIIIIlIII[1];
        }
        var1_1.useOn((Item)var2_2);
        this.sleep(lIllIIIIIlIII[4]);
        return lIllIIIIIlIII[1];
    }

    private static void llIIIIllllIllll() {
        lIllIIIIIIlll = new String[lIllIIIIIlIII[1]];
        e.lIllIIIIIIlll[e.lIllIIIIIlIII[0]] = "logs";
    }

    private static boolean llIIIIlllllIIll(Object object) {
        return object == null;
    }

    @Inject
    public FletchingLogsTask(SquireWoodcutterConfig squireWoodcutterConfig) {
        this.B = squireWoodcutterConfig;
    }
}

