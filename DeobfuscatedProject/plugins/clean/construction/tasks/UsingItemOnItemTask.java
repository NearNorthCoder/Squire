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
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using item on item", priority=10, blocking=true)
public class UsingItemOnItemTask
extends Task {

    private final  SquireQuestHelper fX;

    private static void lIIIIlIIIlI() {
        lIIlIllIl = new String[lIIlIlllI[1]];
        bu.lIIlIllIl[bu.lIIlIlllI[0]] = "DetailedQuestStep";
        bu.lIIlIllIl[bu.lIIlIlllI[2]] = "ItemRequirement";
    }

    static {
        bu.lIIIIlIIIll();
        bu.lIIIIlIIIlI();
    }

    private static boolean lIIIIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIlIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIlIlIII(Object object) {
        return object == null;
    }

    private static boolean lIIIIlIIlll(Object object) {
        return object != null;
    }

    private static boolean lIIIIlIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public UsingItemOnItemTask(SquireQuestHelper squireQuestHelper) {
        this.fX = squireQuestHelper;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        void var5_5;
        bu llIIIlllIIlIIIl;
        String string = this.fX.cz();
        if (bu.lIIIIlIIlII(string.equals(lIIlIllIl[lIIlIlllI[0]]) ? 1 : 0)) {
            return lIIlIlllI[0];
        }
        List<Object> llIIIlllIIIllll = llIIIlllIIlIIIl.fX.cE();
        if (bu.lIIIIlIIlIl(llIIIlllIIIllll.size(), lIIlIlllI[1])) {
            return lIIlIlllI[0];
        }
        if (bu.lIIIIlIIllI(llIIIlllIIIllll.stream().anyMatch(object -> {
            boolean bl2;
            if (bu.lIIIIlIIlII(object.getClass().getSimpleName().equals(lIIlIllIl[lIIlIlllI[2]]) ? 1 : 0)) {
                bl2 = lIIlIlllI[2];

                }
            } else {
                bl2 = lIIlIlllI[0];
            }
            return bl2;
        }) ? 1 : 0)) {
            return lIIlIlllI[0];
        }
        int llIIIlllIIIlllI = llIIIlllIIlIIIl.fX.A(lIIlIlllI[0]);
        int llIIIlllIIIllIl = llIIIlllIIlIIIl.fX.A(lIIlIlllI[2]);
        int[] nArray = new int[lIIlIlllI[2]];
        nArray[bu.lIIlIlllI[0]] = llIIIlllIIIlllI;
        Item llIIIlllIIIllII = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lIIlIlllI[2]];
        nArray2[bu.lIIlIlllI[0]] = llIIIlllIIIllIl;
        Item llIIIlllIIIlIll = Inventory.getFirst((int[])nArray2);
        if (!bu.lIIIIlIIlll(llIIIlllIIIllII) || bu.lIIIIlIlIII(llIIIlllIIIlIll)) {
            return lIIlIlllI[0];
        }
        var5_5.useOn((Item)var6_6);
        return lIIlIlllI[2];
    }

}

