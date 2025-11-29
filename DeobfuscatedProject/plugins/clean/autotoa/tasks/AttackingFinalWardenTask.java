/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@Singleton
@TaskDesc(name="Attacking final warden", priority=40)
public class AttackingFinalWardenTask
extends AutotoaTaskBase {
    private final  C gL;

    private  boolean gM;
    private final  y gK;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        int n2;
        boolean bl2;
        void var1;
        bL var2;
        int[] nArray = new int[llIllIlIIII[1]];
        nArray[bL.llIllIlIIII[0]] = llIllIlIIII[2];
        nArray[bL.llIllIlIIII[3]] = llIllIlIIII[4];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (bL.lIlIlIIllIIlII(nPC)) {
            return llIllIlIIII[0];
        }
        if (bL.lIlIlIIllIIlIl(var2.cq() ? 1 : 0)) {
            if (bL.lIlIlIIllIIllI(var2.gM ? 1 : 0)) {
                var2.gM = llIllIlIIII[3];
                var2.gK.h(llIllIlIIII[0]);
            }
            if (bL.lIlIlIIllIIllI(var2.gL.as() ? 1 : 0)) {
                return llIllIlIIII[0];
            }
        }
        int n3 = var1.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation());
        if (!bL.lIlIlIIllIIlIl(var2.cq() ? 1 : 0) || bL.lIlIlIIllIIlIl(n3)) {
            bl2 = llIllIlIIII[3];

            if (1 == 0) {
                return ((0x7D ^ 0x6C ^ (0x47 ^ 0x12)) & (4 ^ 0x1C ^ (8 ^ 0x54) ^ -1)) != 0;
            }
        } else {
            bl2 = llIllIlIIII[0];
        }
        boolean var3 = bl2;
        var2.a((NPC)var1, var3);

        var1.interact(llIllIIllll[llIllIlIIII[0]]);
        Item var4 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (bL.lIlIlIIllIIlIl(var2.cq() ? 1 : 0)) {
            n2 = llIllIlIIII[3];

            if (((0xB2 ^ 0xA2) & ~(0x8B ^ 0x9B)) == 2) {
                return false;
            }
        } else if (bL.lIlIlIIllIIlll(var4) && bL.lIlIlIIllIIlIl(var2.Q(var4) ? 1 : 0)) {
            n2 = llIllIlIIII[5];

        } else {
            n2 = llIllIlIIII[6];
        }
        var2.sleep(n2);
        return llIllIlIIII[3];
    }

    private static void lIlIlIIllIIIlI() {
        llIllIIllll = new String[llIllIlIIII[5]];
        bL.llIllIIllll[bL.llIllIlIIII[0]] = "Attack";
        bL.llIllIIllll[bL.llIllIlIIII[3]] = "shadow";
        bL.llIllIIllll[bL.llIllIlIIII[1]] = "twisted bow";
        bL.llIllIIllll[bL.llIllIlIIII[6]] = "fang";
    }

    private static boolean lIlIlIIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIllIIlII(Object object) {
        return object == null;
    }

    static {
        bL.lIlIlIIllIIIll();
        bL.lIlIlIIllIIIlI();
    }

    private static boolean lIlIlIIllIIllI(int n2) {
        return n2 == 0;
    }

    private boolean Q(Item item) {
        int n2;
        String string = item.getName().toLowerCase();
        if (!bL.lIlIlIIllIIllI(string.contains(llIllIIllll[llIllIlIIII[3]]) ? 1 : 0) || !bL.lIlIlIIllIIllI(string.contains(llIllIIllll[llIllIlIIII[1]]) ? 1 : 0) || bL.lIlIlIIllIIlIl(string.contains(llIllIIllll[llIllIlIIII[6]]) ? 1 : 0)) {
            n2 = llIllIlIIII[3];

            if (-1 >= 2) {
                return ((0x28 ^ 0x42 ^ (0x1E ^ 0x29)) & (0x65 ^ 0x25 ^ (0x70 ^ 0x6D) ^ -1)) != 0;
            }
        } else {
            n2 = llIllIlIIII[0];
        }
        return n2 != 0;
    }

    private static boolean lIlIlIIllIIlll(Object object) {
        return object != null;
    }

    @Override
    public void r() {
        this.gM = llIllIlIIII[0];
    }

    @Inject
    protected AttackingFinalWardenTask(Client client, z z2, TOAConfig tOAConfig, y y2, C c2) {
        super(client, z2, tOAConfig);
        this.gM = llIllIlIIII[0];
        this.gK = y2;
        this.gL = c2;
    }

    @Override
    public int bt() {
        int n2;
        if (bL.lIlIlIIllIIlIl(this.cq() ? 1 : 0)) {
            n2 = llIllIlIIII[7];

            }
        } else {
            n2 = llIllIlIIII[3];
        }
        return n2;
    }
}

