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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
    private final  LureConfig cb;
    
    private final  M ca;

    static {
        P.lIIIlllII();
        P.lIIIllIll();
    }

    @Inject
    public AttackingLurableTask(M m2, LureConfig lureConfig) {
        this.ca = m2;
        this.cb = lureConfig;
    }

    private static boolean lIIIlllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        P llllIIIlIlIIIIl;
        if (P.lIIIlllIl(this.ca.aI() ? 1 : 0)) {
            return lIIIlll[0];
        }
        Player llllIIIlIlIIIII = Players.getLocal();
        if (P.lIIIllllI(llllIIIlIlIIIII)) {
            return lIIIlll[0];
        }
        NPC llllIIIlIIlllll = llllIIIlIlIIIIl.ca.a(lIIIlll[1], (NPC)llllIIIlIlIIIII.getInteracting());
        if (P.lIIIllllI(llllIIIlIIlllll)) {
            return lIIIlll[0];
        }
        int[] nArray = new int[lIIIlll[1]];
        nArray[P.lIIIlll[0]] = llllIIIlIlIIIIl.cb.tagging();
        if (P.lIIIlllIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlll[1]];
            nArray2[P.lIIIlll[0]] = llllIIIlIlIIIIl.cb.tagging();
            Item llllIIIlIIllllI = Inventory.getFirst((int[])nArray2);
            llllIIIlIIllllI.interact(lIIIllI[lIIIlll[0]]);
            return lIIIlll[0];
        }
        var2_2.interact(lIIIllI[lIIIlll[1]]);
        return lIIIlll[1];
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

