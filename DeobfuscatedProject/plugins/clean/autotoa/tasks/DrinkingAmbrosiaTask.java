/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;

@TaskDesc(name="Drinking Ambrosia", priority=105)
public class DrinkingAmbrosiaTask
extends AutotoaTaskBase {
    private final  C cE;

    private final  SquireAutoTOA cF;

    static {
        ad.lIlIIIlIllllIl();
        ad.lIlIIIlIllllII();
    }

    private static boolean lIlIIIllIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected DrinkingAmbrosiaTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cE = c2;
        this.cF = squireAutoTOA;
    }

    private static boolean lIlIIIllIIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIlIlllllI(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIllllll(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIlIllllII() {
        llIIllIllII = new String[llIIllIllIl[4]];
        ad.llIIllIllII[ad.llIIllIllIl[0]] = "Drink";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        int var2;
        int n2;
        ad var3;
        if (ad.lIlIIIlIlllllI(this.cF.e() ? 1 : 0)) {
            return llIIllIllIl[0];
        }
        if (ad.lIlIIIlIllllll(var3.aq() ? 1 : 0)) {
            return llIIllIllIl[0];
        }
        if (ad.lIlIIIlIllllll(var3.cE.am() ? 1 : 0)) {
            return llIIllIllIl[0];
        }
        if (ad.lIlIIIlIlllllI(Inventory.contains(item -> e.NECTAR.d(item.getId())) ? 1 : 0)) {
            n2 = llIIllIllIl[1];

            if (-1 != -1) {
                return (3 & ~3) != 0;
            }
        } else {
            n2 = var2 = llIIllIllIl[2];
        }
        if (ad.lIlIIIlIlllllI(var3.bf() ? 1 : 0)) {
            var2 = llIIllIllIl[3];
        }
        if (ad.lIlIIIllIIIIII(Combat.getCurrentHealth(), var2)) {
            return llIIllIllIl[0];
        }
        Item var4 = Inventory.getFirst(item -> e.AMBROSIA.d(item.getId()));
        if (ad.lIlIIIllIIIIIl(var4)) {
            return llIIllIllIl[0];
        }
        var2_2.interact(llIIllIllII[llIIllIllIl[0]]);
        this.cE.ao();
        return llIIllIllIl[4];
    }
}

