/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
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
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

@TaskDesc(name="Dodging volatile baboon", priority=100, blocking=true)
public class DodgingVolatileBaboonTask
extends AutotoaTaskBase {

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.meleeGearAkkha();
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIlIIIlllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlIIIllIlll() {
        llIllIIIlII = new String[llIllIIIlIl[3]];
        aX.llIllIIIlII[aX.llIllIIIlIl[1]] = "Volatile Baboon";
        aX.llIllIIIlII[aX.llIllIIIlIl[0]] = "No safe spot found, tanking baboon";
        aX.llIllIIIlII[aX.llIllIIIlIl[5]] = "Volatile Baboon";
    }

    private static boolean lIlIlIIIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIIIlllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var3_3;
        aX var2;
        void var3;
        String[] stringArray = new String[llIllIIIlIl[0]];
        stringArray[aX.llIllIIIlIl[1]] = llIllIIIlII[llIllIIIlIl[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aX.lIlIlIIIlllIIl(nPC)) {
            return llIllIIIlIl[1];
        }
        if (aX.lIlIlIIIlllIlI(var3.getAnimation(), llIllIIIlIl[2])) {
            return llIllIIIlIl[1];
        }
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        if (aX.lIlIlIIIlllIll(var4.distanceTo((Locatable)var3), llIllIIIlIl[3])) {
            return llIllIIIlIl[1];
        }
        WorldPoint var5 = var4.toWorldArea().offset(llIllIIIlIl[4]).toWorldPointList().stream().filter(worldPoint -> {
            String[] stringArray = new String[llIllIIIlIl[0]];
            stringArray[aX.llIllIIIlIl[1]] = llIllIIIlII[llIllIIIlIl[5]];
            return NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl2;
                if (aX.lIlIlIIIlllllI(nPC.getAnimation(), llIllIIIlIl[2])) {
                    bl2 = llIllIIIlIl[0];

                    if (1 <= -1) {
                        return false;
                    }
                } else {
                    bl2 = llIllIIIlIl[1];
                }
                return bl2;
            }).noneMatch(nPC -> {
                boolean bl2;
                if (aX.lIlIlIIIllllIl(nPC.getWorldLocation().distanceTo(worldPoint), llIllIIIlIl[5])) {
                    bl2 = llIllIIIlIl[0];

                    if (2 == 0) {
                        return ((0x62 ^ 0xE ^ (0x1A ^ 0x7A)) & (0x5A ^ 0x61 ^ (8 ^ 0x3F) ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIllIIIlIl[1];
                }
                return bl2;
            });
        }).filter(worldPoint -> {
            boolean bl2;
            if (aX.lIlIlIIIllllII(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = llIllIIIlIl[0];

            } else {
                bl2 = llIllIIIlIl[1];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var4))).orElse(null);
        if (aX.lIlIlIIIlllIIl(var5)) {
            Log.info((String)llIllIIIlII[llIllIIIlIl[0]]);
            return llIllIIIlIl[1];
        }
        this.g((WorldPoint)var3_3);
        return llIllIIIlIl[0];
    }

    private static boolean lIlIlIIIlllIll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected DodgingVolatileBaboonTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIlIIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIIIllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIIlllllI(int n2, int n3) {
        return n2 != n3;
    }

    static {
        aX.lIlIlIIIlllIII();
        aX.lIlIlIIIllIlll();
    }
}

