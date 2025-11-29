/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Going to final phase", priority=1000, blocking=true)
public class GoingToFinalPhaseTask
extends AutotoaTaskBase {
    private static final  int gm;

    private static final  int gl;

    private static void lIlIIIllIIIlII() {
        llIIllIlllI = new String[llIIllIllll[4]];
        bE.llIIllIlllI[bE.llIIllIllll[1]] = "Take";
    }

    static {
        bE.lIlIIIllIIIlIl();
        bE.lIlIIIllIIIlII();
        gl = llIIllIllll[0];
        gm = llIIllIllll[2];
    }

    private static boolean lIlIIIllIIIllI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        bE var1;
        NPC nPC = this.co();
        if (bE.lIlIIIllIIIllI(nPC) && bE.lIlIIIllIIIlll(nPC.getAnimation(), llIIllIllll[0])) {
            return llIIllIllll[1];
        }
        if (bE.lIlIIIllIIIlll(var1.aX(), llIIllIllll[2])) {
            return llIIllIllll[1];
        }
        if (bE.lIlIIIllIIlIII(Combat.getCurrentHealth(), llIIllIllll[3]) && bE.lIlIIIllIIlIIl(var1.ba() ? 1 : 0)) {
            return llIIllIllll[4];
        }
        if (bE.lIlIIIllIIlIIl(Inventory.isFull() ? 1 : 0)) {
            return llIIllIllll[1];
        }
        TileItem var2 = TileItems.getAll().stream().filter(Reachable::isInteractable).max(Comparator.comparingInt(tileItem -> {
            int n2;
            if (bE.lIlIIIllIIlIIl(tileItem.isTradable() ? 1 : 0)) {
                n2 = Prices.getItemPrice((int)tileItem.getId());

                if (((0x5B ^ 0x27 ^ (0xC1 ^ 0x92)) & (0x32 ^ 0x49 ^ (0x39 ^ 0x6D) ^ -1)) != 0) {
                    return (0xEF ^ 0xC2 ^ (0x7F ^ 0x56)) & (71 + 20 - 11 + 83 ^ 10 + 165 - 165 + 157 ^ -1);
                }
            } else {
                n2 = llIIllIllll[5];
            }
            return n2;
        })).orElse(null);
        if (bE.lIlIIIllIIlIlI(var2)) {
            return llIIllIllll[1];
        }
        var2_2.interact(llIIllIlllI[llIIllIllll[1]]);
        return llIIllIllll[4];
    }

    private static boolean lIlIIIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIllIIlIlI(Object object) {
        return object == null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean lIlIIIllIIlIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    protected GoingToFinalPhaseTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIIIllIIIlll(int n2, int n3) {
        return n2 != n3;
    }

}

