/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Baboons", priority=10, blocking=true, register=true)
public class AttackingBaboonsTask
extends AutotoaTaskBase {

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (aM.lIlIIIIllIIIll(chatMessage.getMessage().contains(llIIlIllIlI[llIIlIllIll[2]]) ? 1 : 0)) {
            this.sleep(llIIlIllIll[3]);
        }
    }

    static {
        aM.lIlIIIIllIIIlI();
        aM.lIlIIIIllIIIIl();
    }

    private static boolean lIlIIIIllIIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaBaboonAttackStyle();
    }

    private static boolean lIlIIIIllIIlII(Object object) {
        return object == null;
    }

    private static boolean lIlIIIIllIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIllIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIIllIIllI(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var1_1;
        if (aM.lIlIIIIllIIIll(this.cW.redX() ? 1 : 0)) {
            return llIIlIllIll[0];
        }
        NPC var2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aM.lIlIIIIllIIIll(nPC.getName().equals(llIIlIllIlI[llIIlIllIll[5]]) ? 1 : 0) && aM.lIlIIIIllIIlll(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIllIll[2];

                if (((139 + 157 - 69 + 28 ^ 77 + 30 - 10 + 78) & (98 + 80 - -35 + 10 ^ 6 + 139 - 61 + 59 ^ -1)) == 1) {
                    return ((0xEC ^ 0xA9 ^ (0xD4 ^ 0x88)) & (0xE5 ^ 0x9B ^ (0x71 ^ 0x16) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIllIll[0];
            }
            return n2 != 0;
        });
        if (aM.lIlIIIIllIIlII(var2)) {
            return llIIlIllIll[0];
        }
        NPC var3 = NPCs.getNearest(nPC -> nPC.getName().contains(llIIlIllIlI[llIIlIllIll[4]]));
        if (aM.lIlIIIIllIIlIl(var3) && aM.lIlIIIIllIIllI(var2.distanceTo((Locatable)var3), llIIlIllIll[1])) {
            return llIIlIllIll[0];
        }
        this.bp();
        var1_1.interact(llIIlIllIlI[llIIlIllIll[0]]);
        return llIIlIllIll[2];
    }

    @Inject
    protected AttackingBaboonsTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void lIlIIIIllIIIIl() {
        llIIlIllIlI = new String[llIIlIllIll[6]];
        aM.llIIlIllIlI[aM.llIIlIllIll[0]] = "Attack";
        aM.llIIlIllIlI[aM.llIIlIllIll[2]] = "Ba-Ba throws a large boulder at you";
        aM.llIIlIllIlI[aM.llIIlIllIll[4]] = "Rubble";
        aM.llIIlIllIlI[aM.llIIlIllIll[5]] = "Baboon";
    }
}

