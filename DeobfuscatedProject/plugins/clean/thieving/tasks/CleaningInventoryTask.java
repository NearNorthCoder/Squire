/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Cleaning inventory", priority=100, blocking=true)
public class CleaningInventoryTask
extends ThievingTaskBase {

    public static final  List<String> af;

    private static boolean lIllIIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public CleaningInventoryTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void lIllIIIIlIIIlll() {
        lIIllIlIlIlII = new String[lIIllIlIlIlIl[24]];
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[1]] = "Yes";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[0]] = "Dismantle";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[5]] = "Drop";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[6]] = "Yes";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[8]] = "Opal bolt tips";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[9]] = "Pearl bolt tips";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[10]] = "Emerald bolt tips";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[11]] = "Jade bolt tips";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[12]] = "Sapphire bolt tips";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[13]] = "Strawberry seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[14]] = "Mushroom spore";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[15]] = "Marrentill seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[16]] = "Jangerberry seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[17]] = "Tarromin seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[18]] = "Wildblood seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[19]] = "Harralander seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[20]] = "Belladonna seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[7]] = "Cactus seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[21]] = "Poison ivy seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[22]] = "Lantadyme seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[23]] = "Xerician fabric";
    }

        return String.valueOf(var1);
    }

    @Override
    public boolean l() {
        if (u.lIllIIIIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
            if (u.lIllIIIIlIIlIIl(Dialog.hasOption(string -> string.contains(lIIllIlIlIlII[lIIllIlIlIlIl[6]])) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIlIlIlIl[0]];
                stringArray[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlII[lIIllIlIlIlIl[1]];
                Dialog.chooseOption((String[])stringArray);

                return lIIllIlIlIlIl[0];
            }
            return lIIllIlIlIlIl[1];
        }
        if (!u.lIllIIIIlIIlIlI(Players.getLocal().getAnimation(), lIIllIlIlIlIl[2]) || u.lIllIIIIlIIlIll(Players.getLocal().getAnimation(), lIIllIlIlIlIl[3])) {
            return lIIllIlIlIlIl[1];
        }
        int[] nArray = new int[lIIllIlIlIlIl[0]];
        nArray[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlIl[4];
        if (u.lIllIIIIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIllIlIlIlIl[0]];
            nArray2[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlIl[4];
            Inventory.getFirst((int[])nArray2).interact(lIIllIlIlIlII[lIIllIlIlIlIl[0]]);
            return lIIllIlIlIlIl[0];
        }
        if (u.lIllIIIIlIIlIIl(Inventory.contains(item -> af.contains(item.getName())) ? 1 : 0)) {
            Inventory.getFirst(item -> af.contains(item.getName())).interact(lIIllIlIlIlII[lIIllIlIlIlIl[5]]);
            return lIIllIlIlIlIl[0];
        }
        return lIIllIlIlIlIl[1];
    }

    private static boolean lIllIIIIlIIlIIl(int n2) {
        return n2 != 0;
    }

    static {
        u.lIllIIIIlIIlIII();
        u.lIllIIIIlIIIlll();
        String[] stringArray = new String[lIIllIlIlIlIl[7]];
        stringArray[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlII[lIIllIlIlIlIl[8]];
        stringArray[u.lIIllIlIlIlIl[0]] = lIIllIlIlIlII[lIIllIlIlIlIl[9]];
        stringArray[u.lIIllIlIlIlIl[5]] = lIIllIlIlIlII[lIIllIlIlIlIl[10]];
        stringArray[u.lIIllIlIlIlIl[6]] = lIIllIlIlIlII[lIIllIlIlIlIl[11]];
        stringArray[u.lIIllIlIlIlIl[8]] = lIIllIlIlIlII[lIIllIlIlIlIl[12]];
        stringArray[u.lIIllIlIlIlIl[9]] = lIIllIlIlIlII[lIIllIlIlIlIl[13]];
        stringArray[u.lIIllIlIlIlIl[10]] = lIIllIlIlIlII[lIIllIlIlIlIl[14]];
        stringArray[u.lIIllIlIlIlIl[11]] = lIIllIlIlIlII[lIIllIlIlIlIl[15]];
        stringArray[u.lIIllIlIlIlIl[12]] = lIIllIlIlIlII[lIIllIlIlIlIl[16]];
        stringArray[u.lIIllIlIlIlIl[13]] = lIIllIlIlIlII[lIIllIlIlIlIl[17]];
        stringArray[u.lIIllIlIlIlIl[14]] = lIIllIlIlIlII[lIIllIlIlIlIl[18]];
        stringArray[u.lIIllIlIlIlIl[15]] = lIIllIlIlIlII[lIIllIlIlIlIl[19]];
        stringArray[u.lIIllIlIlIlIl[16]] = lIIllIlIlIlII[lIIllIlIlIlIl[20]];
        stringArray[u.lIIllIlIlIlIl[17]] = lIIllIlIlIlII[lIIllIlIlIlIl[7]];
        stringArray[u.lIIllIlIlIlIl[18]] = lIIllIlIlIlII[lIIllIlIlIlIl[21]];
        stringArray[u.lIIllIlIlIlIl[19]] = lIIllIlIlIlII[lIIllIlIlIlIl[22]];
        stringArray[u.lIIllIlIlIlIl[20]] = lIIllIlIlIlII[lIIllIlIlIlIl[23]];
        af = List.of(stringArray);
    }

    private static boolean lIllIIIIlIIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIIIlIIlIll(int n2, int n3) {
        return n2 == n3;
    }
}

