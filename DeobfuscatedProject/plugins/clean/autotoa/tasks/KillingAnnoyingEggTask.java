/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Killing annoying egg", priority=20, register=true, blocking=true)
public class KillingAnnoyingEggTask
extends AutotoaTaskBase {

    private static final  int eM;
    private static final  Point eL;

    private static void lIlIlIIIIIIIIl() {
        llIlIllIlll = new String[llIlIlllIII[8]];
        bg.llIlIllIlll[bg.llIlIlllIII[1]] = "Wield";
        bg.llIlIllIlll[bg.llIlIlllIII[3]] = "Attack";
        bg.llIlIllIlll[bg.llIlIlllIII[2]] = "keris";
        bg.llIlIllIlll[bg.llIlIlllIII[4]] = "egg";
        bg.llIlIllIlll[bg.llIlIlllIII[0]] = "Attack";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var2_2;
        bg var1;
        if (!bg.lIlIlIIIIIIIll(bg.bV() ? 1 : 0) || bg.lIlIlIIIIIIlII(this.bR() ? 1 : 0)) {
            var1.sleep(llIlIlllIII[0]);
            return llIlIlllIII[1];
        }
        WorldPoint var2 = var1.a(eL);
        NPC var3 = NPCs.getAll(nPC -> {
            int n2;
            if (bg.lIlIlIIIIIIlII(nPC.getName().toLowerCase().contains(llIlIllIlll[llIlIlllIII[4]]) ? 1 : 0)) {
                String[] stringArray = new String[llIlIlllIII[3]];
                stringArray[bg.llIlIlllIII[1]] = llIlIllIlll[llIlIlllIII[0]];
                if (bg.lIlIlIIIIIIlII(nPC.hasAction(stringArray) ? 1 : 0) && bg.lIlIlIIIIIIlII(nPC.getWorldLocation().equals((Object)var2) ? 1 : 0) && bg.lIlIlIIIIIIlll(nPC.getId(), llIlIlllIII[5]) && bg.lIlIlIIIIIIIll(nPC.isDead() ? 1 : 0)) {
                    n2 = llIlIlllIII[3];

                    if (1 > 0) return n2 != 0;
                    return false;
                }
            }
            n2 = llIlIlllIII[1];
            return n2 != 0;
        }).stream().findFirst().orElse(null);
        if (bg.lIlIlIIIIIIlIl(var3)) {
            return llIlIlllIII[1];
        }
        if (bg.lIlIlIIIIIIIll(var3.getWorldArea().offset(llIlIlllIII[2]).contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIlIlllIII[1];
        }
        Set<WorldPoint> var4 = var1.bU();
        WorldArea var5 = var3.getWorldArea().offset(llIlIlllIII[3]);
        if (bg.lIlIlIIIIIIlII(var4.stream().anyMatch(worldPoint -> var3.getWorldArea().offset(llIlIlllIII[3]).contains(worldPoint)) ? 1 : 0)) {
            WorldPoint var6 = var5.toWorldPointList().stream().filter(worldPoint -> worldPoint.toWorldArea().isInMeleeDistance(var3.getWorldLocation())).filter(worldPoint -> {
                boolean bl2;
                if (bg.lIlIlIIIIIIIll(var4.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIlIlllIII[3];

                    if ((0x4B ^ 0x53 ^ (0x6D ^ 0x71)) <= 2) {
                        return ((0x6F ^ 0x27 ^ (0xF7 ^ 0x9A)) & (28 + 65 - 38 + 99 ^ 27 + 126 - 20 + 58 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIlllIII[1];
                }
                return bl2;
            }).findFirst().orElse(null);
            if (bg.lIlIlIIIIIIlIl(var6)) {
                return llIlIlllIII[1];
            }
            Movement.setDestination((WorldPoint)var6);
            return llIlIlllIII[1];
        }
        var1.bp();
        Item var6 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlIllIlll[llIlIlllIII[2]]));
        if (bg.lIlIlIIIIIIllI(var6)) {
            var6.interact(llIlIllIlll[llIlIlllIII[1]]);
        }
        var2_2.interact(llIlIllIlll[llIlIlllIII[3]]);
        return llIlIlllIII[3];
    }

    private static boolean lIlIlIIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var7);
    }

    @Inject
    public KillingAnnoyingEggTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIlIIIIIIllI(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIIIIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIIIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIIIIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIIIIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        bg.lIlIlIIIIIIIlI();
        bg.lIlIlIIIIIIIIl();
        eM = llIlIlllIII[5];
        eL = new Point(llIlIlllIII[6], llIlIlllIII[7]);
    }

}

