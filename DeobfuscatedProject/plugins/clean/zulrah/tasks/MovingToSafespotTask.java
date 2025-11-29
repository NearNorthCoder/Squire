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
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum24;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.util.Iterator;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving to safespot", priority=15)
public class MovingToSafespotTask
extends ZulrahTaskBase {

    private static boolean llIIlIIIlIIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIlIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIlIIIlIIIIII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean e(WorldPoint worldPoint) {
        Iterator var1 = TileObjects.getAll().iterator();
        while (Z.llIIlIIIlIIIIlI(var1.hasNext() ? 1 : 0)) {
            void var2;
            GameObject var3;
            TileObject var4 = (TileObject)var1.next();
            if (Z.llIIlIIIlIIIlIl(var4.getId(), lIllIlIllllIl[5]) && Z.llIIlIIIlIIIIlI((var3 = (GameObject)var4).getWorldArea().contains2D((WorldPoint)var2) ? 1 : 0)) {
                return lIllIlIllllIl[4];
            }

            if (3 != 0) continue;
            return ((3 ^ 0x21) & ~(0x93 ^ 0xB1) & ~((0xC ^ 0x3E) & ~(0x85 ^ 0xB7))) != 0;
        }
        return lIllIlIllllIl[0];
    }

    private static boolean llIIlIIIlIIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    protected MovingToSafespotTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    private static boolean llIIlIIIlIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIlIIIlIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIIIIllllll(Object object) {
        return object == null;
    }

    static {
        Z.llIIlIIIIlllllI();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        boolean bl;
        void var5;
        WorldPoint var6;
        WorldPoint worldPoint;
        Z var7;
        Player player = Players.getLocal();
        if (Z.llIIlIIIIllllll(player)) {
            return lIllIlIllllIl[0];
        }
        WorldPoint var8 = var7.ai();
        if (Z.llIIlIIIIllllll(var8)) {
            return lIllIlIllllIl[0];
        }
        if (Z.llIIlIIIlIIIIII((Object)var7.az.V().C(), (Object)k.JAD_PHASE_W) && Z.llIIlIIIlIIIIIl(var7.az.aa(), lIllIlIllllIl[1])) {
            worldPoint = var7.az.V().D().get(lIllIlIllllIl[0]).C().a(var7.az.X());

            if ((0x8D ^ 0x89) <= ((0x8F ^ 0xC3) & ~(0x52 ^ 0x1E))) {
                return false;
            }
        } else {
            worldPoint = var6 = var8;
        }
        if (Z.llIIlIIIlIIIIlI(var5.getWorldLocation().equals((Object)var6) ? 1 : 0)) {
            return lIllIlIllllIl[0];
        }
        if (Z.llIIlIIIlIIIIlI(var7.e(var6) ? 1 : 0)) {
            return lIllIlIllllIl[0];
        }
        int var9 = var6.distanceTo2D(var5.getWorldLocation());
        if (Z.llIIlIIIlIIIIll(var9, lIllIlIllllIl[2]) && Z.llIIlIIIlIIIIlI(var7.az.U() ? 1 : 0)) {
            return lIllIlIllllIl[0];
        }
        ScenePoint var10 = ScenePoint.fromWorld((WorldPoint)var6);
        Movement.setDestination((int)var10.getX(), (int)var10.getY());
        var7.sleep(lIllIlIllllIl[3]);
        if (Z.llIIlIIIlIIIlII(var9, lIllIlIllllIl[3])) {
            bl = lIllIlIllllIl[4];

            if (((0xB1 ^ 0x97) & ~(0x7E ^ 0x58)) != 0) {
                return false;
            }
        } else {
            bl = lIllIlIllllIl[0];
        }
        return bl;
    }

}

