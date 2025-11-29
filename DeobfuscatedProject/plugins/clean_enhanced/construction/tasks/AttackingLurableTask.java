/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.basics.combat.Lure.LureConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@Singleton
@TaskDesc(name="Attacking lurable", priority=2, blocking=true)
public class AttackingLurableTask
extends Task {
    private static  String[] lIIIllI;
    private final  LureConfig cb;
    private static  int[] lIIIlll;
    private final  M ca;

    @Inject
    public AttackingLurableTask(M m2, LureConfig lureConfig) {
        this.ca = m2;
        this.cb = lureConfig;
    }

    private static boolean lIIIlllIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIlllII() {
        lIIIlll = new int[4];
        P.lIIIlll[0] = (0x35 ^ 0x5B ^ (0x46 ^ 0x2F)) & (0xA6 ^ 0x8B ^ (0xA4 ^ 0x8E) ^ -1);
        P.lIIIlll[1] = 1;
        P.lIIIlll[2] = 2;
        P.lIIIlll[3] = 0x42 ^ 0x5E ^ (0x18 ^ 0xC);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        P var1;
        if (P.lIIIlllIl(this.ca.aI() ? 1 : 0)) {
            return lIIIlll[0];
        }
        Player var2 = Players.getLocal();
        if (P.lIIIllllI(var2)) {
            return lIIIlll[0];
        }
        NPC var3 = var1.ca.a(lIIIlll[1], (NPC)var2.getInteracting());
        if (P.lIIIllllI(var3)) {
            return lIIIlll[0];
        }
        int[] nArray = new int[lIIIlll[1]];
        nArray[P.lIIIlll[0]] = var1.cb.tagging();
        if (P.lIIIlllIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlll[1]];
            nArray2[P.lIIIlll[0]] = var1.cb.tagging();
            Item var4 = Inventory.getFirst((int[])nArray2);
            var4.interact(lIIIllI[lIIIlll[0]]);
            return lIIIlll[0];
        }
        var2_2.interact(lIIIllI[lIIIlll[1]]);
        return lIIIlll[1];
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllI(Object object) {
        return object == null;
    }

    private static void lIIIllIll() {
        lIIIllI = new String[lIIIlll[2]];
        P.lIIIllI[P.lIIIlll[0]] = "Wield";
        P.lIIIllI[P.lIIIlll[1]] = "Attack";
    }
}

