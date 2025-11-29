/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.templetrekking.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="RewardHandlerTask", priority=10, blocking=true)
public class RewardhandlertaskTask
extends Task {

    private final  String[] N;
    private final  TempleTrekkingConfig M;
    private final  TempleTrekkingPlugin L;

    static {
        o.lIllIIIIIlIlIIl();
        o.lIllIIIIIlIIlll();
    }

    @Inject
    public RewardhandlertaskTask(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        String[] stringArray = new String[lIIllIlIIIIlI[0]];
        stringArray[o.lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[1]];
        stringArray[o.lIIllIlIIIIlI[2]] = lIIllIlIIIIII[lIIllIlIIIIlI[2]];
        stringArray[o.lIIllIlIIIIlI[3]] = lIIllIlIIIIII[lIIllIlIIIIlI[3]];
        stringArray[o.lIIllIlIIIIlI[4]] = lIIllIlIIIIII[lIIllIlIIIIlI[4]];
        stringArray[o.lIIllIlIIIIlI[5]] = lIIllIlIIIIII[lIIllIlIIIIlI[5]];
        stringArray[o.lIIllIlIIIIlI[6]] = lIIllIlIIIIII[lIIllIlIIIIlI[6]];
        stringArray[o.lIIllIlIIIIlI[7]] = lIIllIlIIIIII[lIIllIlIIIIlI[7]];
        this.N = stringArray;
        this.L = templeTrekkingPlugin;
        this.M = templeTrekkingConfig;
    }

    private static boolean lIllIIIIIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIIIlIIlll() {
        lIIllIlIIIIII = new String[lIIllIlIIIIlI[17]];
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[1]] = "Agility tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[2]] = "Firemaking tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[3]] = "Fishing tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[4]] = "Mining tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[5]] = "Slayer tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[6]] = "Thieving tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[7]] = "Woodcutting tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[0]] = "Read";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[8]] = "Reward token";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[9]] = "Reward token";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[12]] = "Claiming rewards";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[11]] = "Claim";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[13]] = "Selecting rewards";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[14]] = "Details";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[15]] = "Opening interface";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[16]] = "Look-at";
    }

    private static boolean lIllIIIIIlIllII(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    public boolean run() {
        Item item;
        if (o.lIllIIIIIlIlIlI(this.M.bankXPTomes() ? 1 : 0) && o.lIllIIIIIlIlIll(Inventory.contains((String[])this.N) ? 1 : 0) && o.lIllIIIIIlIllII(item = Inventory.getFirst((String[])this.N))) {
            item.interact(lIIllIlIIIIII[lIIllIlIIIIlI[0]]);
            return lIIllIlIIIIlI[2];
        }
        String[] stringArray = new String[lIIllIlIIIIlI[2]];
        stringArray[o.lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[8]];
        if (o.lIllIIIIIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return lIIllIlIIIIlI[1];
        }
        String[] stringArray2 = new String[lIIllIlIIIIlI[2]];
        stringArray2[o.lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[9]];
        Item var2 = Inventory.getFirst((String[])stringArray2);
        if (o.lIllIIIIIlIllII(var2)) {
            o var3;
            Widget var4 = Widgets.get((int)lIIllIlIIIIlI[10], (int)lIIllIlIIIIlI[11]);
            if (o.lIllIIIIIlIllII(var4) && o.lIllIIIIIlIlIll(var4.isVisible() ? 1 : 0)) {
                System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[12]]);
                var4.interact(lIIllIlIIIIII[lIIllIlIIIIlI[11]]);
                return lIIllIlIIIIlI[2];
            }
            int var5 = var3.M.reward().x();
            Widget var6 = Widgets.get((int)lIIllIlIIIIlI[10], (int)lIIllIlIIIIlI[7], (int)var5);
            if (o.lIllIIIIIlIllII(var6)) {
                System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[13]]);
                var6.interact(lIIllIlIIIIII[lIIllIlIIIIlI[14]]);
                return lIIllIlIIIIlI[2];
            }
            System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[15]]);
            var2.interact(lIIllIlIIIIII[lIIllIlIIIIlI[16]]);
            return lIIllIlIIIIlI[2];
        }
        return lIIllIlIIIIlI[1];
    }
}

