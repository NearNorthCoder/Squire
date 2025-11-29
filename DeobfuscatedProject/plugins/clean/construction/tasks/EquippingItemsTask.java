/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping Items", priority=20, blocking=true)
public class EquippingItemsTask
extends Task {
    private final  SquireQuestHelper fO;

    private static boolean llIlIIIIlI(int n2) {
        return n2 != 0;
    }

    static {
        bm.llIlIIIIIl();
        bm.llIlIIIIII();
    }

        return String.valueOf(llIlIIlIlllIlIl);
    }

    private static boolean llIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void llIlIIllIIIIIll;
        List<Integer> list = this.fO.cF();
        if (bm.llIlIIIIlI(list.isEmpty() ? 1 : 0)) {
            return llllIIII[0];
        }
        List llIlIIllIIIIIlI = Inventory.getAll(arg_0 -> bm.a((List)llIlIIllIIIIIll, arg_0));
        if (bm.llIlIIIIlI(llIlIIllIIIIIlI.isEmpty() ? 1 : 0)) {
            return llllIIII[0];
        }
        var2_2.forEach(item -> {
            String[] stringArray = new String[llllIIII[2]];
            stringArray[bm.llllIIII[0]] = lllIllll[llllIIII[0]];
            stringArray[bm.llllIIII[1]] = lllIllll[llllIIII[1]];
            stringArray[bm.llllIIII[3]] = lllIllll[llllIIII[3]];
            item.interact(stringArray);
        });
        return llllIIII[1];
    }

    private static void llIlIIIIII() {
        lllIllll = new String[llllIIII[2]];
        bm.lllIllll[bm.llllIIII[0]] = "Wear";
        bm.lllIllll[bm.llllIIII[1]] = "Wield";
        bm.lllIllll[bm.llllIIII[3]] = "Equip";
    }

    private static  boolean a(List list, Item item) {
        return list.contains(item.getId());
    }

    @Inject
    public EquippingItemsTask(SquireQuestHelper squireQuestHelper) {
        this.fO = squireQuestHelper;
    }
}

