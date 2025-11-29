/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking mage scarab", priority=25, blocking=true)
public class AttackingMageScarabTask
extends AutotoaTaskBase {

    private static void lIlIIIIlIIIlll() {
        llIIlIlIlIl = new String[llIIlIlIllI[2]];
        ba.llIIlIlIlIl[ba.llIIlIlIllI[0]] = "Attack";
        ba.llIIlIlIlIl[ba.llIIlIlIllI[1]] = "Arcane Scarab";
    }

    private static boolean lIlIIIIlIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIIlIIlIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected AttackingMageScarabTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        ba.lIlIIIIlIIlIII();
        ba.lIlIIIIlIIIlll();
    }

    private static boolean lIlIIIIlIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.kephriMager();
    }

    private static boolean lIlIIIIlIIlIlI(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIlIIllII(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var2;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (ba.lIlIIIIlIIlIll(nPC.getName().equals(llIIlIlIlIl[llIIlIlIllI[1]]) ? 1 : 0) && ba.lIlIIIIlIIllII(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIlIllI[1];

                if (((44 + 162 - 194 + 202 ^ 36 + 6 - -27 + 65) & (123 + 89 - 190 + 186 ^ 98 + 42 - 57 + 45 ^ -1)) > 0) {
                    return ((39 + 3 - -9 + 93 ^ 42 + 61 - 28 + 61) & (0x2F ^ 0x10 ^ (0x61 ^ 0x46) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIlIllI[0];
            }
            return n2 != 0;
        });
        if (ba.lIlIIIIlIIlIIl(nPC2)) {
            return llIIlIlIllI[0];
        }
        Actor var3 = Players.getLocal().getInteracting();
        if (ba.lIlIIIIlIIlIlI(var3) && ba.lIlIIIIlIIlIll(var3.equals(var2) ? 1 : 0)) {
            return llIIlIlIllI[1];
        }
        this.bp();
        nPC2.interact(llIIlIlIlIl[llIIlIlIllI[0]]);
        return llIIlIlIllI[1];
    }
}

