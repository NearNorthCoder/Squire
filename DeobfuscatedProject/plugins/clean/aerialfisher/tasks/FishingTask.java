/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.aerialfisher.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Fishing", priority=5)
public class FishingTask
extends Task {

    private static final  int k;
    private static final  Predicate<NPC> j;

    private static boolean lIIlIIllllIIIl(int n) {
        return n == 0;
    }

    private static void lIIlIIlllIlllI() {
        lIlIlllIIII = new String[lIlIlllIIIl[5]];
        b.lIlIlllIIII[b.lIlIlllIIIl[1]] = "Catch";
        b.lIlIlllIIII[b.lIlIlllIIIl[3]] = "Fishing spot";
    }

    private static boolean lIIlIIllllIIII(Object object) {
        return object != null;
    }

    private static boolean lIIlIIllllIlIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIllllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIIllllIlII(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIIllllIIlI(int n) {
        return n != 0;
    }

    public boolean run() {
        NPC var1;
        NPC nPC2;
        int[] nArray = new int[lIlIlllIIIl[0]];
        nArray[b.lIlIlllIIIl[1]] = lIlIlllIIIl[2];
        nArray[b.lIlIlllIIIl[3]] = lIlIlllIIIl[4];
        nArray[b.lIlIlllIIIl[5]] = lIlIlllIIIl[6];
        nArray[b.lIlIlllIIIl[7]] = lIlIlllIIIl[8];
        Item item = Inventory.getFirst((int[])nArray);
        if (b.lIIlIIllllIIII(item)) {
            int[] nArray2 = new int[lIlIlllIIIl[3]];
            nArray2[b.lIlIlllIIIl[1]] = lIlIlllIIIl[9];
            item.useOn(Inventory.getFirst((int[])nArray2));
        }
        int[] nArray3 = new int[lIlIlllIIIl[3]];
        nArray3[b.lIlIlllIIIl[1]] = lIlIlllIIIl[10];
        Projectile var2 = Projectiles.getNearest((int[])nArray3);
        if (b.lIIlIIllllIIII(var2) && b.lIIlIIllllIIIl(var2.getTarget().equals((Object)Players.getLocal().getLocalLocation()) ? 1 : 0)) {
            return lIlIlllIIIl[3];
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            int n;
            if (b.lIIlIIllllIIlI(j.test((NPC)nPC) ? 1 : 0) && b.lIIlIIllllIIll(Static.getClient().getHintArrowNpc(), nPC)) {
                n = lIlIlllIIIl[3];

                if (3 != 3) {
                    return false;
                }
            } else {
                n = lIlIlllIIIl[1];
            }
            return n != 0;
        });
        NPC var4 = NPCs.getNearest(j);
        if (b.lIIlIIllllIIII(var3)) {
            nPC2 = var3;

            if ((0x4A ^ 0x4E) == 0) {
                return false;
            }
        } else {
            nPC2 = var4;
        }
        if (b.lIIlIIllllIIII(var1 = nPC2)) {
            var1.interact(lIlIlllIIII[lIlIlllIIIl[1]]);
        }
        return lIlIlllIIIl[3];
    }

    static {
        b.lIIlIIlllIllll();
        b.lIIlIIlllIlllI();
        k = lIlIlllIIIl[10];
        j = nPC -> {
            int n;
            if (b.lIIlIIllllIIII(nPC.getName()) && b.lIIlIIllllIIlI(nPC.getName().equals(lIlIlllIIII[lIlIlllIIIl[3]]) ? 1 : 0) && b.lIIlIIllllIlII(nPC.distanceTo((Locatable)Players.getLocal()), lIlIlllIIIl[11]) && b.lIIlIIllllIlIl(Players.getNearest(player -> {
                int n;
                if (b.lIIlIIllllIIII(player.getInteracting()) && b.lIIlIIllllIIlI(player.getInteracting().equals(nPC) ? 1 : 0)) {
                    n = lIlIlllIIIl[3];

                    if ((0x71 ^ 0x75) <= 1) {
                        return false;
                    }
                } else {
                    n = lIlIlllIIIl[1];
                }
                return n != 0;
            })) && b.lIIlIIllllIlIl(Projectiles.getNearest(projectile -> {
                int n;
                if (b.lIIlIIllllIIII(projectile.getTarget()) && b.lIIlIIllllIIlI(projectile.getTarget().equals((Object)nPC.getLocalLocation()) ? 1 : 0)) {
                    n = lIlIlllIIIl[3];

                    if (-1 > ((0x14 ^ 1) & ~(0x28 ^ 0x3D))) {
                        return false;
                    }
                } else {
                    n = lIlIlllIIIl[1];
                }
                return n != 0;
            }))) {
                n = lIlIlllIIIl[3];

            } else {
                n = lIlIlllIIIl[1];
            }
            return n != 0;
        };
    }
}

