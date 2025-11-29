/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving off poison", priority=30)
public class MovingOffPoisonTask
extends AutotoaTaskBase {

    private static  boolean c(Player player, WorldPoint worldPoint) {
        return worldPoint.equals((Object)player.getWorldLocation());
    }

    private static  boolean j(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    static {
        bU.lIIllIlIlllllI();
        bU.lIIllIlIllllII();
    }

    private static boolean lIIllIllIIIIII(Object object) {
        return object == null;
    }

    private static boolean lIIllIllIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIlIllllll(int n2) {
        return n2 != 0;
    }

    private static void lIIllIlIllllII() {
        lIlllllIIII = new String[lIlllllIIIl[2]];
        bU.lIlllllIIII[bU.lIlllllIIIl[0]] = "Trying to dodge poison splats";
    }

    @Inject
    protected MovingOffPoisonTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        WorldPoint worldPoint2;
        void var1;
        void var2;
        Player player = Players.getLocal();
        Set set = this.cC().stream().map(Locatable::getWorldLocation).collect(Collectors.toSet());
        if (bU.lIIllIlIllllll(set.isEmpty() ? 1 : 0)) {
            return lIlllllIIIl[0];
        }
        if (bU.lIIllIlIllllll(var2.stream().noneMatch(arg_0 -> bU.c((Player)var1, arg_0)) ? 1 : 0)) {
            return lIlllllIIIl[0];
        }
        Log.info((String)lIlllllIIII[lIlllllIIIl[0]]);
        WorldArea var3 = var1.getWorldArea().offset(lIlllllIIIl[1]);
        WorldPoint var4 = var3.toWorldPointList().stream().filter(arg_0 -> bU.j((Set)var2, arg_0)).min(Comparator.comparingInt(arg_0 -> bU.f((Player)var1, arg_0))).orElse(null);
        if (bU.lIIllIllIIIIII(var4)) {
            return lIlllllIIIl[0];
        }
        worldPoint2 = this.b(player.getWorldLocation(), worldPoint2, worldPoint -> {
            boolean bl2;
            if (bU.lIIllIllIIIIIl(set.contains(worldPoint) ? 1 : 0)) {
                bl2 = lIlllllIIIl[2];

                if ((7 ^ 3) > (0x53 ^ 0x57)) {
                    return false;
                }
            } else {
                bl2 = lIlllllIIIl[0];
            }
            return bl2;
        });
        Movement.setDestination((WorldPoint)worldPoint2);
        return lIlllllIIIl[2];
    }

    private static  int f(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo2D(player.getWorldLocation());
    }
}

