/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.World
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 */
package gg.squire.gorillas.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.World;
import net.unethicalite.api.Locations;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import gg.squire.gorillas.tasks.LootingGorillaTask;

@TaskDesc(name="Hopping (too busy)", priority=100, blocking=true)
public class HoppingTooBusyTask
extends Task {
    
    @Inject
    protected  y ah;

    private static void lllllIllIIlIlI() {
        llIIlIllIIIl = new String[llIIlIllIIlI[3]];
        u.llIIlIllIIIl[u.llIIlIllIIlI[1]] = "Attack";
    }

    private static boolean lllllIllIIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIllIIllll(int n2) {
        return n2 != 0;
    }

    static {
        u.lllllIllIIlIll();
        u.lllllIllIIlIlI();
    }

    private static boolean lllllIllIIlllI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var8_8;
        int var1;
        u var2;
        if (u.lllllIllIIllII(Locations.isRegionLoaded((int)llIIlIllIIlI[0]) ? 1 : 0)) {
            return llIIlIllIIlI[1];
        }
        int var3 = Players.getAll().size();
        if (u.lllllIllIIllIl(var3, llIIlIllIIlI[2])) {
            return llIIlIllIIlI[1];
        }
        if (u.lllllIllIIllII(var2.ah.P().isEmpty() ? 1 : 0)) {
            return llIIlIllIIlI[1];
        }
        NPC var4 = (NPC)Players.getLocal().getInteracting();
        if (u.lllllIllIIlllI(var4) && u.lllllIllIIllII(var4.isDead() ? 1 : 0)) {
            return llIIlIllIIlI[1];
        }
        NPC var5 = NPCs.getNearest(nPC -> {
            int n2;
            if (u.lllllIllIlIIlI(nPC.getInteracting(), Players.getLocal()) && u.lllllIllIIllll(nPC.hasAction(llIIlIllIIIl[llIIlIllIIlI[1]]::equals) ? 1 : 0)) {
                n2 = llIIlIllIIlI[3];

                if (1 <= 0) {
                    return ((1 ^ 0x11 ^ (0x1D ^ 6)) & (0x9B ^ 0xAA ^ (0xFC ^ 0xC6) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIllIIlI[1];
            }
            return n2 != 0;
        });
        if (u.lllllIllIIlllI(var5)) {
            return llIIlIllIIlI[1];
        }
        World var6 = Worlds.getCurrentWorld();
        List var7 = Worlds.getAll(world2 -> {
            int n2;
            if (u.lllllIllIlIIIl(world2.getId(), var6.getId()) && u.lllllIllIIllll(world2.isNormal() ? 1 : 0) && u.lllllIllIIllll(world2.isMembers() ? 1 : 0) && u.lllllIllIIllII(world2.isSkillTotal() ? 1 : 0) && u.lllllIllIIllII(world2.isAllPkWorld() ? 1 : 0)) {
                n2 = llIIlIllIIlI[3];

                if ((1 & ~1) != 0) {
                    return false;
                }
            } else {
                n2 = llIIlIllIIlI[1];
            }
            return n2 != 0;
        }).stream().sorted(Comparator.comparingInt(World::getPlayerCount)).limit(100L).collect(Collectors.toList());
        if (u.lllllIllIIllll(var7.isEmpty() ? 1 : 0)) {
            return llIIlIllIIlI[1];
        }
        int var8 = Rand.nextInt((int)llIIlIllIIlI[1], (int)var7.size());
        World var9 = (World)var7.get(Math.min(var8, var1 = Rand.nextInt((int)llIIlIllIIlI[1], (int)var7.size())));
        if (u.lllllIllIlIIII(var9)) {
            return llIIlIllIIlI[1];
        }
        Worlds.hopTo((World)var8_8);
        return llIIlIllIIlI[3];
    }

    private static boolean lllllIllIlIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllIllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIllIlIIII(Object object) {
        return object == null;
    }

    private static boolean lllllIllIlIIIl(int n2, int n3) {
        return n2 != n3;
    }
}

