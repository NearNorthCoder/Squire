/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=133337)
public class EatingFoodTask
extends Task {
    
    private final  SquireBarrows O;
    private final  SquireBarrowsConfig P;

    private static boolean lIllIlIlIIllll(int n2) {
        return n2 == 0;
    }

    private static void lIllIlIlIIllIl() {
        llllIlIIIll = new String[llllIlIIlII[3]];
        l.llllIlIIIll[l.llllIlIIlII[0]] = "Eat";
        l.llllIlIIIll[l.llllIlIIlII[1]] = "Eat";
    }

    private static boolean lIllIlIlIlIIII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIlIlIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lIllIlIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        l.lIllIlIlIIlllI();
        l.lIllIlIlIIllIl();
    }

    @Inject
    public EatingFoodTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.O = squireBarrows;
        this.P = squireBarrowsConfig;
    }

    private static boolean lIllIlIlIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        l var2;
        int var3;
        if (l.lIllIlIlIIllll(this.O.h() ? 1 : 0)) {
            return llllIlIIlII[0];
        }
        int[] nArray = new int[llllIlIIlII[1]];
        nArray[l.llllIlIIlII[0]] = llllIlIIlII[2];
        if (l.lIllIlIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llllIlIIlII[1]];
            nArray2[l.llllIlIIlII[0]] = llllIlIIlII[2];
            Inventory.dropAll((int[])nArray2);

        }
        if (l.lIllIlIlIlIIIl(var3 = Combat.getCurrentHealth(), var2.P.eatAtHp())) {
            return llllIlIIlII[0];
        }
        Item var4 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIlIIlII[1]];
            stringArray[l.llllIlIIlII[0]] = llllIlIIIll[llllIlIIlII[1]];
            return item.hasAction(stringArray);
        });
        if (l.lIllIlIlIlIIlI(var4)) {
            return llllIlIIlII[0];
        }
        var2_2.interact(llllIlIIIll[llllIlIIlII[0]]);
        return llllIlIIlII[1];
    }

}

