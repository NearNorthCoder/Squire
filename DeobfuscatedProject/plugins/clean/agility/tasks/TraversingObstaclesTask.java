/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.agility.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import gg.squire.agility.tasks.GameEnum;
import gg.squire.agility.tasks.CHelper;

@TaskDesc(name="Traversing obstacles")
public class TraversingObstaclesTask
extends Task {
    private static final  WorldPoint z;
    private final  AgilityConfig B;
    
    private final  SquireAgilityPlugin A;

    static {
        j.lIIlIlIlIlIlIl();
        j.lIIlIlIlIlIIll();
        z = new WorldPoint(lIllIIIlIll[12], lIllIIIlIll[13], lIllIIIlIll[8]);
    }

    private static boolean lIIlIlIlIllllI(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlIlIlIlIlll(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var6_6;
        b var1;
        b b2;
        j var2;
        void var3;
        Player player = Players.getLocal();
        if (j.lIIlIlIlIlIllI(player)) {
            return lIllIIIlIll[0];
        }
        if (j.lIIlIlIlIlIlll(Movement.isRunEnabled() ? 1 : 0) && j.lIIlIlIlIllIII(Movement.getRunEnergy(), lIllIIIlIll[1])) {
            Movement.toggleRun();
        }
        if (j.lIIlIlIlIllIIl(var3.getAnimation(), lIllIIIlIll[2]) && j.lIIlIlIlIllIIl(var3.getAnimation(), lIllIIIlIll[3])) {
            return lIllIIIlIll[0];
        }
        WorldPoint var4 = var3.getWorldLocation();
        b var5 = var2.A.a();
        if (j.lIIlIlIlIlIllI((Object)var5)) {
            if (j.lIIlIlIlIlIlll(var4.getPlane())) {
                b b3;
                SquireAgilityPlugin squireAgilityPlugin = var2.A;
                if (j.lIIlIlIlIllIlI(var2.B.progressive() ? 1 : 0)) {
                    b3 = b.TraversingObstaclesTask();

                    if (1 > (40 + 1 - -108 + 3 ^ 16 + 83 - 61 + 118)) {
                        return ((0x55 ^ 0x65 ^ (0xB2 ^ 0xA0)) & (134 + 140 - 231 + 118 ^ 3 + 77 - 63 + 114 ^ -1)) != 0;
                    }
                } else {
                    b3 = var2.B.course();
                }
                squireAgilityPlugin.a(b3);

                if (((0x94 ^ 0x88) & ~(0x69 ^ 0x75)) >= 1) {
                    return false;
                }
            } else {
                var2.A.a(b.b(var4.getRegionID()));
            }
        }
        if (j.lIIlIlIlIllIlI(var2.B.progressive() ? 1 : 0)) {
            b2 = b.TraversingObstaclesTask();

            if (-1 >= 3) {
                return false;
            }
        } else {
            b2 = var2.B.course();
        }
        if (j.lIIlIlIlIllIll((Object)(var1 = b2), (Object)var5) && j.lIIlIlIlIlIlll(var3.getPlane())) {
            Object[] objectArray = new Object[lIllIIIlIll[4]];
            objectArray[j.lIllIIIlIll[0]] = var5;
            objectArray[j.lIllIIIlIll[5]] = var1;
            Log.info((String)lIllIIIlIIl[lIllIIIlIll[0]], (Object[])objectArray);
            var2.A.a(var1);
            return lIllIIIlIll[5];
        }
        if (j.lIIlIlIlIlIllI((Object)var5)) {
            Object[] objectArray = new Object[lIllIIIlIll[5]];
            objectArray[j.lIllIIIlIll[0]] = var4.getRegionID();
            Log.info((String)lIllIIIlIIl[lIllIIIlIll[5]], (Object[])objectArray);
            return lIllIIIlIll[0];
        }
        c var6 = var5.k();
        if (j.lIIlIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)z) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIlIll[6], lIllIIIlIll[7], lIllIIIlIll[8]));

            var2.sleep(lIllIIIlIll[8]);
            return lIllIIIlIll[0];
        }
        if (j.lIIlIlIlIllIlI(Reachable.isWalkable((WorldPoint)new WorldPoint(lIllIIIlIll[9], lIllIIIlIll[10], lIllIIIlIll[0])) ? 1 : 0) && j.lIIlIlIlIlIlll(Static.getClient().getTopLevelWorldView().getPlane())) {
            String[] stringArray = new String[lIllIIIlIll[5]];
            stringArray[j.lIllIIIlIll[0]] = lIllIIIlIIl[lIllIIIlIll[4]];
            TileObjects.getNearest((String[])stringArray).interact(string -> lIllIIIlIll[5]);
            return lIllIIIlIll[5];
        }
        if (j.lIIlIlIlIlIllI(var6)) {
            if (j.lIIlIlIlIlllII(var4.getPlane(), lIllIIIlIll[8])) {
                return lIllIIIlIll[0];
            }
            Object[] objectArray = new Object[lIllIIIlIll[5]];
            objectArray[j.lIllIIIlIll[0]] = var5;
            Log.info((String)lIllIIIlIIl[lIllIIIlIll[8]], (Object[])objectArray);
            return lIllIIIlIll[5];
        }
        TileObject var7 = var6.r();
        if (!j.lIIlIlIlIlllIl(var7) || j.lIIlIlIlIllllI(var7.distanceTo((Locatable)Players.getLocal()), lIllIIIlIll[11])) {
            boolean bl;
            if (j.lIIlIlIlIlllII(var4.getPlane(), lIllIIIlIll[8])) {
                Movement.setDestination((WorldPoint)var6.getWorldLocation());
                return lIllIIIlIll[5];
            }
            if (j.lIIlIlIlIlIllI(var7)) {
                bl = lIllIIIlIll[5];

                if (1 >= 2) {
                    return false;
                }
            } else {
                bl = lIllIIIlIll[0];
            }
            boolean var8 = bl;
            Movement.walkTo((WorldPoint)var6.getWorldLocation(), (boolean)var8);

            return lIllIIIlIll[5];
        }
        var6_6.interact(var5_5.n());
        return lIllIIIlIll[5];
    }

    private static void lIIlIlIlIlIIll() {
        lIllIIIlIIl = new String[lIllIIIlIll[14]];
        j.lIllIIIlIIl[j.lIllIIIlIll[0]] = "Switching course from {} to {}";
        j.lIllIIIlIIl[j.lIllIIIlIll[5]] = "No course found for region: {}, and we can't set any other course.";
        j.lIllIIIlIIl[j.lIllIIIlIll[4]] = "Ladder";
        j.lIllIIIlIIl[j.lIllIIIlIll[8]] = "No obstacle found on course: {}";
    }

    private static boolean lIIlIlIlIlIllI(Object object) {
        return object == null;
    }

    @Inject
    public TraversingObstaclesTask(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.A = squireAgilityPlugin;
        this.B = agilityConfig;
    }

        return String.valueOf(var9);
    }

    private static boolean lIIlIlIlIllIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIlIllIlI(int n) {
        return n != 0;
    }

    private static boolean lIIlIlIlIlllIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIlIlllll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIlIlIllIIl(int n, int n2) {
        return n != n2;
    }

    private static boolean lIIlIlIlIlllII(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIlIlIllIII(int n, int n2) {
        return n > n2;
    }
}

