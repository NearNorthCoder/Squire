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
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging poison splat", priority=160)
public class DodgingPoisonSplatTask
extends AutotoaTaskBase {

    private static  boolean e(List list, WorldPoint worldPoint) {
        return list.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        WorldPoint worldPoint2;
        bR var1;
        void var2;
        void var3;
        Player player = Players.getLocal();
        List<WorldPoint> list = this.cE();
        if (bR.lIlIlIIIIIllIl(list.isEmpty() ? 1 : 0)) {
            return llIlIllllII[0];
        }
        if (bR.lIlIlIIIIIllIl(var3.stream().noneMatch(arg_0 -> bR.c((Player)var2, arg_0)) ? 1 : 0)) {
            return llIlIllllII[0];
        }
        Log.info((String)llIlIlllIll[llIlIllllII[0]]);
        WorldArea var4 = var2.getWorldArea().offset(llIlIllllII[1]);
        WorldPoint var5 = var4.toWorldPointList().stream().filter(arg_0 -> bR.e((List)var3, arg_0)).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl2;
            if (bR.lIlIlIIIIlIIII(worldPoint.distanceTo((Locatable)this.cB()), llIlIllllII[3])) {
                bl2 = llIlIllllII[2];

                if ((0x80 ^ 0x85) == 0) {
                    return false;
                }
            } else {
                bl2 = llIlIllllII[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(arg_0 -> bR.d((Player)var2, arg_0))).orElse(null);
        if (bR.lIlIlIIIIIlllI(var5)) {
            return llIlIllllII[0];
        }
        List<TileObject> list2 = this.cC();
        worldPoint2 = this.b(player.getWorldLocation(), worldPoint2, worldPoint -> {
            int n2;
            if (bR.lIlIlIIIIIllIl(list2.stream().noneMatch(tileObject -> worldPoint.equals((Object)tileObject.getWorldLocation())) ? 1 : 0) && bR.lIlIlIIIIIllll(list.contains(worldPoint) ? 1 : 0)) {
                n2 = llIlIllllII[2];

                if (((0xAE ^ 0xB3) & ~(0x7C ^ 0x61)) < 0) {
                    return false;
                }
            } else {
                n2 = llIlIllllII[0];
            }
            return n2 != 0;
        });
        Movement.setDestination((WorldPoint)worldPoint2);
        return llIlIllllII[2];
    }

    private static boolean lIlIlIIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIIIIIllIl(int n2) {
        return n2 != 0;
    }

    private static  int d(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo2D(player.getWorldLocation());
    }

    @Inject
    protected DodgingPoisonSplatTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static  boolean c(Player player, WorldPoint worldPoint) {
        return worldPoint.equals((Object)player.getWorldLocation());
    }

    private static void lIlIlIIIIIlIll() {
        llIlIlllIll = new String[llIlIllllII[2]];
        bR.llIlIlllIll[bR.llIlIllllII[0]] = "Trying to dodge poison splats";
    }

    static {
        bR.lIlIlIIIIIllII();
        bR.lIlIlIIIIIlIll();
    }

    private static boolean lIlIlIIIIIlllI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIIIIIllll(int n2) {
        return n2 == 0;
    }
}

