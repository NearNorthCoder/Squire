/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.tithefarm.tasks.GameEnum;
import gg.squire.tithefarm.tasks.IHelper;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Walking towards the next patch", priority=50, blocking=true)
public class WalkingTowardsTheNextPatchTask
extends TithefarmTaskBase {
    
    private final  Client ad;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        u var1;
        WorldPoint var2;
        void var3;
        TileObject tileObject2 = this.Z.a((TileObject tileObject) -> lIlIIIIIlIlII[1]);
        if (u.lIllIllIlllIllI(tileObject2)) {
            return lIlIIIIIlIlII[0];
        }
        if (u.lIllIllIlllIlll(var3 instanceof GameObject)) {
            return lIlIIIIIlIlII[0];
        }
        GameObject var4 = (GameObject)var3;
        Player var5 = Players.getLocal();
        if (u.lIllIllIllllIII(var4.getWorldArea().isInMeleeDistance(var5.getWorldArea()) ? 1 : 0)) {
            return lIlIIIIIlIlII[0];
        }
        int[] nArray = new int[lIlIIIIIlIlII[1]];
        nArray[u.lIlIIIIIlIlII[0]] = lIlIIIIIlIlII[2];
        if (u.lIllIllIllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIIIIIlIlII[1]];
            nArray2[u.lIlIIIIIlIlII[0]] = lIlIIIIIlIlII[2];
            Inventory.getFirst((int[])nArray2).interact(lIlIIIIIlIIlI[lIlIIIIIlIlII[0]]);
            return lIlIIIIIlIlII[1];
        }
        if (u.lIllIllIllllIII(Inventory.contains(item -> item.getName().toLowerCase().contains(lIlIIIIIlIIlI[lIlIIIIIlIlII[4]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIIIIIlIIlI[lIlIIIIIlIlII[3]])).interact(lIlIIIIIlIIlI[lIlIIIIIlIlII[1]]);
            return lIlIIIIIlIlII[1];
        }
        if (u.lIllIllIlllIlll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (u.lIllIllIllllIII(Movement.isWalking() ? 1 : 0) && u.lIllIllIllllIIl(var2 = Movement.getDestination()) && u.lIllIllIllllIII(var4.getWorldArea().isInMeleeDistance(var2) ? 1 : 0) && u.lIllIllIllllIlI(var2.distanceToPath(var1.ad, var5.getWorldLocation()), lIlIIIIIlIlII[1])) {
            return lIlIIIIIlIlII[0];
        }
        var2 = (GameObject)var1.Z.a(tileObject -> lIlIIIIIlIlII[1], lIlIIIIIlIlII[3]);
        GameObject var6 = (GameObject)var1.Z.a(tileObject -> lIlIIIIIlIlII[1], lIlIIIIIlIlII[4]);
        if (!u.lIllIllIllllIIl(var2) || u.lIllIllIlllIllI(var6)) {
            return lIlIIIIIlIlII[0];
        }
        WorldPoint var7 = var4.getWorldArea().toWorldPointList().stream().flatMap(worldPoint -> {
            Stream<WorldPoint> stream;
            if (u.lIllIllIllllIll((Object)this.Z.r(), (Object)g.PATCH_13_SOUTH)) {
                stream = Stream.of(worldPoint.dy(lIlIIIIIlIlII[1]));

                if (2 <= 0) {
                    return null;
                }
            } else {
                void var8;
                WorldPoint[] worldPointArray = new WorldPoint[lIlIIIIIlIlII[3]];
                worldPointArray[u.lIlIIIIIlIlII[0]] = var8.dx(lIlIIIIIlIlII[5]);
                worldPointArray[u.lIlIIIIIlIlII[1]] = var8.dx(lIlIIIIIlIlII[1]);
                stream = Stream.of(worldPointArray);
            }
            return stream;
        }).filter(arg_0 -> u.a(var4, (GameObject)var2, var6, arg_0)).filter(worldPoint -> var4.getWorldArea().isInMeleeDistance(worldPoint)).min(Comparator.comparingDouble(arg_0 -> var1.b((GameObject)var2, arg_0)).thenComparing(object -> Float.valueOf(((WorldPoint)object).distanceTo2DHypotenuse(var6.getWorldArea().getCenter())))).orElse(null);
        if (u.lIllIllIlllIllI(var7)) {
            return lIlIIIIIlIlII[0];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return lIlIIIIIlIlII[1];
    }

    private static  boolean a(GameObject gameObject, GameObject gameObject2, GameObject gameObject3, WorldPoint worldPoint) {
        int n2;
        if (u.lIllIllIlllIlll(gameObject.getWorldArea().contains(worldPoint) ? 1 : 0) && u.lIllIllIlllIlll(gameObject2.getWorldArea().contains(worldPoint) ? 1 : 0) && u.lIllIllIlllIlll(gameObject3.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            n2 = lIlIIIIIlIlII[1];

            if (1 < ((0x29 ^ 8) & ~(0x28 ^ 9))) {
                return false;
            }
        } else {
            n2 = lIlIIIIIlIlII[0];
        }
        return n2 != 0;
    }

    private static boolean lIllIllIlllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIllllIIl(Object object) {
        return object != null;
    }

    private static boolean lIllIllIllllIII(int n2) {
        return n2 != 0;
    }

    private  double b(GameObject gameObject, Object object) {
        return ((WorldPoint)object).distanceToPath(this.ad, gameObject.getWorldArea().getCenter());
    }

    private static boolean lIllIllIllllIll(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    protected WalkingTowardsTheNextPatchTask(i i2, Client client) {
        super(i2);
        this.ad = client;
    }

    private static boolean lIllIllIllllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIllIllIlllIIll() {
        lIlIIIIIlIIlI = new String[lIlIIIIIlIlII[6]];
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[0]] = "Drop";
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[1]] = "Wear";
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[3]] = "graceful";
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[4]] = "graceful";
    }

    static {
        u.lIllIllIlllIlIl();
        u.lIllIllIlllIIll();
    }

    private static boolean lIllIllIlllIllI(Object object) {
        return object == null;
    }
}

