/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@Singleton
@TaskDesc(name="Attacking melee scarab", priority=16, blocking=true)
public class AttackingMeleeScarabTask
extends AutotoaTaskBase {
    
    private  boolean eC;

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        if (bb.lIIllIIIllIlIl(this.eC ? 1 : 0)) {
            configStorageBox = this.cW.kephriMelee();

            if (3 < 0) {
                return null;
            }
        } else {
            bb var1;
            configStorageBox = var1.cW.kephriRanger();
        }
        return configStorageBox;
    }

    private static boolean lIIllIIIllIllI(Object object) {
        return object == null;
    }

        return String.valueOf(var2);
    }

    private static void lIIllIIIlIlllI() {
        lIlllIIIlII = new String[lIlllIIIlll[5]];
        bb.lIlllIIIlII[bb.lIlllIIIlll[0]] = "Soldier Scarab";
        bb.lIlllIIIlII[bb.lIlllIIIlll[2]] = "Attack";
        bb.lIlllIIIlII[bb.lIlllIIIlll[3]] = "Spitting Scarab";
        bb.lIlllIIIlII[bb.lIlllIIIlll[4]] = "Soldier Scarab";
    }

    static {
        bb.lIIllIIIllIlII();
        bb.lIIllIIIlIlllI();
    }

    private static boolean lIIllIIIllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIIIlllIlI(Object object) {
        return object != null;
    }

    private static boolean lIIllIIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected AttackingMeleeScarabTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, null);
    }

    private static boolean lIIllIIIllIlIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        Actor llllllllllllllllIlIIlllIIlIlllll2;
        Object var3;
        bb var4;
        void var5;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bb.lIIllIIIllIlIl(List.of(lIlllIIIlII[lIlllIIIlll[3]], lIlllIIIlII[lIlllIIIlll[4]]).contains(nPC.getName()) ? 1 : 0) && bb.lIIllIIIllIlll(nPC.isDead() ? 1 : 0)) {
                n2 = lIlllIIIlll[2];

                if (((0xBF ^ 0xA0 ^ (0x57 ^ 0x67)) & (83 + 22 - -126 + 2 ^ 10 + 47 - -110 + 31 ^ -1)) > 0) {
                    return false;
                }
            } else {
                n2 = lIlllIIIlll[0];
            }
            return n2 != 0;
        });
        if (bb.lIIllIIIllIllI(nPC2)) {
            return lIlllIIIlll[0];
        }
        var4.eC = var5.getName().equals(lIlllIIIlII[lIlllIIIlll[0]]);
        if (bb.lIIllIIIllIlll(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
            int llllllllllllllllIlIIlllIIlIlllll2 = lIlllIIIlll[0];
            var3 = var4.cV.a(var4.br());
            int var6 = ((Object)var3).length;
            int var7 = lIlllIIIlll[0];
            while (bb.lIIllIIIlllIII(var7, var6)) {
                Object var8 = var3[var7];
                if (bb.lIIllIIIlllIIl((int)var8, lIlllIIIlll[1])) {
                    llllllllllllllllIlIIlllIIlIlllll2 = lIlllIIIlll[2];
                }
                ++var7;

                if (-2 < 0) continue;
                return ((3 ^ 0x55 ^ (0x42 ^ 0x1A)) & (12 + 52 - 11 + 78 ^ 84 + 8 - -10 + 39 ^ -1)) != 0;
            }
            if (bb.lIIllIIIllIlll(llllllllllllllllIlIIlllIIlIlllll2)) {
                return lIlllIIIlll[0];
            }
        }
        if (bb.lIIllIIIlllIlI(llllllllllllllllIlIIlllIIlIlllll2 = Players.getLocal().getInteracting()) && bb.lIIllIIIllIlIl(llllllllllllllllIlIIlllIIlIlllll2.equals(var5) ? 1 : 0)) {
            return lIlllIIIlll[2];
        }
        var3 = var4.bU();
        WorldPoint var6 = Players.getLocal().getWorldLocation();
        if (bb.lIIllIIIllIlll(var3.isEmpty() ? 1 : 0) && (!bb.lIIllIIIllIlll(var3.contains(var6) ? 1 : 0) || bb.lIIllIIIllIlll(var5.getWorldArea().isInMeleeDistance(var6) ? 1 : 0))) {
            return lIlllIIIlll[2];
        }
        this.bp();
        nPC2.interact(lIlllIIIlII[lIlllIIIlll[2]]);
        return lIlllIIIlll[2];
    }

    private static boolean lIIllIIIlllIIl(int n2, int n3) {
        return n2 == n3;
    }
}

