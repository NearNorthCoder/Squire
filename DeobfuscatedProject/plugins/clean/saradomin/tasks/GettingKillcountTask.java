/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Getting Killcount", priority=5)
public class GettingKillcountTask
extends Task {
    private final  Client aw;
    private final  g au;
    private final  SquireSaraConfig av;

    private static final  WorldPoint at;

    private static boolean lIlIlIllIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public GettingKillcountTask(g g2, SquireSaraConfig squireSaraConfig) {
        this.au = g2;
        this.av = squireSaraConfig;
        this.aw = Static.getClient();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        List<String> list;
        y var1;
        if (y.lIlIlIllIlIIlII(this.au.s() ? 1 : 0)) {
            return lIIlIlIIIllll[0];
        }
        if (y.lIlIlIllIlIIlIl(var1.au.m() ? 1 : 0)) {
            return lIIlIlIIIllll[0];
        }
        if (y.lIlIlIllIlIIllI(var1.au.q(), var1.au.r())) {
            return lIIlIlIIIllll[0];
        }
        Player var2 = Players.getLocal();
        if (y.lIlIlIllIlIIlll(var2.getInteracting())) {
            return lIIlIlIIIllll[0];
        }
        if (y.lIlIlIllIlIIlIl(var1.av.kcSpirituals() ? 1 : 0)) {
            list = List.of(lIIlIlIIIlllI[lIIlIlIIIllll[0]], lIIlIlIIIlllI[lIIlIlIIIllll[1]]);

            if (2 == 3) {
                return false;
            }
        } else {
            list = List.of(lIIlIlIIIlllI[lIIlIlIIIllll[2]]);
        }
        List<String> var3 = list;
        NPC var4 = NPCs.getNearest(nPC -> {
            int n2;
            if (y.lIlIlIllIlIIlII(nPC.isDead() ? 1 : 0) && y.lIlIlIllIlIIlIl(var3.contains(nPC.getName()) ? 1 : 0)) {
                n2 = lIIlIlIIIllll[1];

                if ((0x28 ^ 0x2C) != (0x36 ^ 0x32)) {
                    return false;
                }
            } else {
                n2 = lIIlIlIIIllll[0];
            }
            return n2 != 0;
        });
        if (y.lIlIlIllIlIlIII(var2.distanceTo(at), lIIlIlIIIllll[3])) {
            Movement.walkTo((WorldPoint)at);

            return lIIlIlIIIllll[1];
        }
        if (y.lIlIlIllIlIlIIl(var4)) {
            if (y.lIlIlIllIlIlIlI(Players.getLocal().distanceTo(at), lIIlIlIIIllll[4])) {
                Worlds.hopTo((World)Worlds.getRandom(world -> {
                    int n2;
                    if (y.lIlIlIllIlIIlIl(world.isMembers() ? 1 : 0) && y.lIlIlIllIlIIlIl(world.isNormal() ? 1 : 0)) {
                        n2 = lIIlIlIIIllll[1];

                        if ((0x65 ^ 0x60) == 0) {
                            return false;
                        }
                    } else {
                        n2 = lIIlIlIIIllll[0];
                    }
                    return n2 != 0;
                }));
                var1.sleep(lIIlIlIIIllll[5]);
                return lIIlIlIIIllll[1];
            }
            return lIIlIlIIIllll[0];
        }
        var3_3.interact(lIIlIlIIIlllI[lIIlIlIIIllll[6]]);
        this.sleep(lIIlIlIIIllll[2]);
        return lIIlIlIIIllll[1];
    }

    private static boolean lIlIlIllIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIllIlIIlll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIllIlIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIlIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIllIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIllIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        y.lIlIlIllIlIIIll();
        y.lIlIlIllIlIIIlI();
        at = new WorldPoint(lIIlIlIIIllll[7], lIIlIlIIIllll[8], lIIlIlIIIllll[2]);
    }

        return String.valueOf(var5);
    }

    private static void lIlIlIllIlIIIlI() {
        lIIlIlIIIlllI = new String[lIIlIlIIIllll[5]];
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[0]] = "Saradomin priest";
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[1]] = "Spiritual mage";
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[2]] = "Saradomin priest";
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[6]] = "Attack";
    }

    private static boolean lIlIlIllIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }
}

