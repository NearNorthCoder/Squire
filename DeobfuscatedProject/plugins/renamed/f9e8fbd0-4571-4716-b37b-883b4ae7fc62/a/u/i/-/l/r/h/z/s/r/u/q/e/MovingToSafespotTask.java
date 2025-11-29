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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.KEnum;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v_Unknown;
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

/* TASK: Moving to safespot -> MovingtosafespotTask */
@TaskDesc(name="Moving to safespot", priority=15)
public class MovingToSafespotTask
extends ad_Unknown {
    private static /* synthetic */ int[] lIllIlIllllIl;

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
        Iterator var4 = TileObjects.getAll().iterator();
        while (Z.llIIlIIIlIIIIlI(var4.hasNext() ? 1 : 0)) {
            void var6;
            GameObject var3;
            TileObject var8 = (TileObject)var4.next();
            if (Z.llIIlIIIlIIIlIl(var8.getId(), lIllIlIllllIl[5]) && Z.llIIlIIIlIIIIlI((var3 = (GameObject)var8).getWorldArea().contains2D((WorldPoint)var6) ? 1 : 0)) {
                return lIllIlIllllIl[4];
            }
            0;
            if (3 != 0) continue;
            return ((3 ^ 0x21) & ~(0x93 ^ 0xB1) & ~((0xC ^ 0x3E) & ~(0x85 ^ 0xB7))) != 0;
        }
        return lIllIlIllllIl[0];
    }

    private static boolean llIIlIIIlIIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    protected Z(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
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
        void var1;
        WorldPoint var2;
        WorldPoint worldPoint;
        Z var5;
        Player player = Players.getLocal();
        if (Z.llIIlIIIIllllll(player)) {
            return lIllIlIllllIl[0];
        }
        WorldPoint var10 = var5.ai();
        if (Z.llIIlIIIIllllll(var10)) {
            return lIllIlIllllIl[0];
        }
        if (Z.llIIlIIIlIIIIII((Object)var5.az.V().C(), (Object)k.JAD_PHASE_W) && Z.llIIlIIIlIIIIIl(var5.az.aa(), lIllIlIllllIl[1])) {
            worldPoint = var5.az.V().D().get(lIllIlIllllIl[0]).C().a(var5.az.X());
            0;
            if ((0x8D ^ 0x89) <= ((0x8F ^ 0xC3) & ~(0x52 ^ 0x1E))) {
                return false;
            }
        } else {
            worldPoint = var2 = var10;
        }
        if (Z.llIIlIIIlIIIIlI(var1.getWorldLocation().equals((Object)var2) ? 1 : 0)) {
            return lIllIlIllllIl[0];
        }
        if (Z.llIIlIIIlIIIIlI(var5.e(var2) ? 1 : 0)) {
            return lIllIlIllllIl[0];
        }
        int var9 = var2.distanceTo2D(var1.getWorldLocation());
        if (Z.llIIlIIIlIIIIll(var9, lIllIlIllllIl[2]) && Z.llIIlIIIlIIIIlI(var5.az.U() ? 1 : 0)) {
            return lIllIlIllllIl[0];
        }
        ScenePoint var7 = ScenePoint.fromWorld((WorldPoint)var2);
        Movement.setDestination((int)var7.getX(), (int)var7.getY());
        var5.sleep(lIllIlIllllIl[3]);
        if (Z.llIIlIIIlIIIlII(var9, lIllIlIllllIl[3])) {
            bl = lIllIlIllllIl[4];
            0;
            if (((0xB1 ^ 0x97) & ~(0x7E ^ 0x58)) != 0) {
                return false;
            }
        } else {
            bl = lIllIlIllllIl[0];
        }
        return bl;
    }

    private static void llIIlIIIIlllllI() {
        lIllIlIllllIl = new int[6];
        Z.lIllIlIllllIl[0] = (84 + 96 - 84 + 38 ^ 17 + 68 - 41 + 142) & (0x39 ^ 0x21 ^ (0x7B ^ 0x5F) ^ -1);
        Z.lIllIlIllllIl[1] = 0x8F ^ 0x9C ^ (0x1E ^ 7);
        Z.lIllIlIllllIl[2] = 0x2B ^ 0x2F;
        Z.lIllIlIllllIl[3] = 2;
        Z.lIllIlIllllIl[4] = 1;
        Z.lIllIlIllllIl[5] = 0xFFFFEFBF & 0x3DF4;
    }
}

