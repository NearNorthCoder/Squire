/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import gg.squire.pvm.tasks.AHelper;
import gg.squire.pvm.tasks.CHelper;
import gg.squire.pvm.tasks.GameEnum;

@TaskDesc(name="Moving away from Shaman", priority=55, blocking=true)
public class MovingAwayFromShamanTask
extends Task {
    private final  SquireShamanConfig as;
    private final  a ar;
    
    private final  c aq;

    private static boolean lIlIlllIllIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIlllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllIllIlllI(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIlllIllIllIl(int n2) {
        return n2 == 0;
    }

    static {
        u.lIlIlllIllIlIll();
        u.lIlIlllIllIlIlI();
    }

    private static boolean lIlIlllIllIllII(int n2) {
        return n2 != 0;
    }

    @Inject
    public MovingAwayFromShamanTask(c c2, a a2, SquireShamanConfig squireShamanConfig) {
        this.aq = c2;
        this.ar = a2;
        this.as = squireShamanConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7_7;
        u var2;
        List list = NPCs.getAll(nPC -> nPC.getName().equals(lIIllIIIIlIll[lIIllIIIIlllI[3]]));
        if (!u.lIlIlllIllIllII(this.aq.s() ? 1 : 0) || u.lIlIlllIllIllIl(list.isEmpty() ? 1 : 0)) {
            return lIIllIIIIlllI[0];
        }
        if (u.lIlIlllIllIllII(var2.ar.m() ? 1 : 0)) {
            return lIIllIIIIlllI[0];
        }
        Player var3 = Players.getLocal();
        TileItem var4 = var2.ar.k().orElse(null);
        NPC var5 = Combat.getAttackableNPC(nPC -> {
            int n2;
            if (u.lIlIlllIllIllII(this.as.room().x().contains(nPC.getWorldLocation()) ? 1 : 0) && u.lIlIlllIllIllII(nPC.getName().equals(lIIllIIIIlIll[lIIllIIIIlllI[1]]) ? 1 : 0)) {
                n2 = lIIllIIIIlllI[2];

                if (2 == 0) {
                    return ((0x36 ^ 0x6B ^ (0x51 ^ 5)) & (0x7F ^ 0x61 ^ (0x9E ^ 0x89) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIIIIlllI[0];
            }
            return n2 != 0;
        });
        if (u.lIlIlllIllIlllI(var4)) {
            var5 = Combat.getAttackableNPC(nPC -> {
                int n2;
                if (u.lIlIlllIllIllII(this.as.room().x().contains(nPC.getWorldLocation()) ? 1 : 0) && u.lIlIlllIllIllII(nPC.getName().equals(lIIllIIIIlIll[lIIllIIIIlllI[2]]) ? 1 : 0) && u.lIlIlllIlllIIIl(nPC.getInteracting(), var3)) {
                    n2 = lIIllIIIIlllI[2];

                    if (3 < 0) {
                        return ((0xAF ^ 0x9D) & ~(0x74 ^ 0x46) & ~((0x85 ^ 0xB2) & ~(0xB1 ^ 0x86))) != 0;
                    }
                } else {
                    n2 = lIIllIIIIlllI[0];
                }
                return n2 != 0;
            });
        }
        if (u.lIlIlllIllIllll(var5)) {
            return lIIllIIIIlllI[0];
        }
        NPC var6 = var5;
        if (u.lIlIlllIlllIIII(var6.distanceTo((Locatable)Players.getLocal()), lIIllIIIIlllI[1])) {
            return lIIllIIIIlllI[0];
        }
        g var7 = var2.as.room();
        Stream stream = var7.z().stream();
        c c2 = var2.aq;
        Objects.requireNonNull(c2);

        WorldPoint var8 = stream.filter(c2::a).filter(worldPoint -> {
            boolean bl;
            String[] stringArray = new String[lIIllIIIIlllI[2]];
            stringArray[u.lIIllIIIIlllI[0]] = lIIllIIIIlIll[lIIllIIIIlllI[0]];
            if (u.lIlIlllIlllIIII(worldPoint.distanceTo((Locatable)NPCs.getNearest((WorldPoint)worldPoint, (String[])stringArray)), lIIllIIIIlllI[1])) {
                bl = lIIllIIIIlllI[2];

                if ((0x5C ^ 0x58) < 0) {
                    return false;
                }
            } else {
                bl = lIIllIIIIlllI[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
        if (u.lIlIlllIllIllll(var8)) {
            return lIIllIIIIlllI[0];
        }
        Movement.walkTo((WorldPoint)var7_7, (boolean)lIIllIIIIlllI[0]);

        return lIIllIIIIlllI[2];
    }

    private static boolean lIlIlllIlllIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIlllIllIlIlI() {
        lIIllIIIIlIll = new String[lIIllIIIIlllI[4]];
        u.lIIllIIIIlIll[u.lIIllIIIIlllI[0]] = "Lizardman shaman";
        u.lIIllIIIIlIll[u.lIIllIIIIlllI[2]] = "Lizardman shaman";
        u.lIIllIIIIlIll[u.lIIllIIIIlllI[1]] = "Lizardman shaman";
        u.lIIllIIIIlIll[u.lIIllIIIIlllI[3]] = "Spawn";
    }

    private static boolean lIlIlllIlllIIII(int n2, int n3) {
        return n2 > n3;
    }
}

