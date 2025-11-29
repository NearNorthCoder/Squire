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

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad;
import a.u.i.-.l.r.h.z.s.r.u.q.e.k;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
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
public class Z
extends ad {
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
        Iterator llllllllllllllIllIIIllIIlIIIlIII = TileObjects.getAll().iterator();
        while (Z.llIIlIIIlIIIIlI(llllllllllllllIllIIIllIIlIIIlIII.hasNext() ? 1 : 0)) {
            void llllllllllllllIllIIIllIIlIIIlIIl;
            GameObject llllllllllllllIllIIIllIIlIIIIllI;
            TileObject llllllllllllllIllIIIllIIlIIIIlll = (TileObject)llllllllllllllIllIIIllIIlIIIlIII.next();
            if (Z.llIIlIIIlIIIlIl(llllllllllllllIllIIIllIIlIIIIlll.getId(), lIllIlIllllIl[5]) && Z.llIIlIIIlIIIIlI((llllllllllllllIllIIIllIIlIIIIllI = (GameObject)llllllllllllllIllIIIllIIlIIIIlll).getWorldArea().contains2D((WorldPoint)llllllllllllllIllIIIllIIlIIIlIIl) ? 1 : 0)) {
                return lIllIlIllllIl[4];
            }
            "".length();
            if ("   ".length() != 0) continue;
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
        void llllllllllllllIllIIIllIIlIIlIIlI;
        WorldPoint llllllllllllllIllIIIllIIlIIlIIII;
        WorldPoint worldPoint;
        Z llllllllllllllIllIIIllIIlIIlIIll;
        Player player = Players.getLocal();
        if (Z.llIIlIIIIllllll(player)) {
            return lIllIlIllllIl[0];
        }
        WorldPoint llllllllllllllIllIIIllIIlIIlIIIl = llllllllllllllIllIIIllIIlIIlIIll.ai();
        if (Z.llIIlIIIIllllll(llllllllllllllIllIIIllIIlIIlIIIl)) {
            return lIllIlIllllIl[0];
        }
        if (Z.llIIlIIIlIIIIII((Object)llllllllllllllIllIIIllIIlIIlIIll.az.V().C(), (Object)k.JAD_PHASE_W) && Z.llIIlIIIlIIIIIl(llllllllllllllIllIIIllIIlIIlIIll.az.aa(), lIllIlIllllIl[1])) {
            worldPoint = llllllllllllllIllIIIllIIlIIlIIll.az.V().D().get(lIllIlIllllIl[0]).C().a(llllllllllllllIllIIIllIIlIIlIIll.az.X());
            "".length();
            if ((0x8D ^ 0x89) <= ((0x8F ^ 0xC3) & ~(0x52 ^ 0x1E))) {
                return ((0x10 ^ 0x42) & ~(0xC0 ^ 0x92)) != 0;
            }
        } else {
            worldPoint = llllllllllllllIllIIIllIIlIIlIIII = llllllllllllllIllIIIllIIlIIlIIIl;
        }
        if (Z.llIIlIIIlIIIIlI(llllllllllllllIllIIIllIIlIIlIIlI.getWorldLocation().equals((Object)llllllllllllllIllIIIllIIlIIlIIII) ? 1 : 0)) {
            return lIllIlIllllIl[0];
        }
        if (Z.llIIlIIIlIIIIlI(llllllllllllllIllIIIllIIlIIlIIll.e(llllllllllllllIllIIIllIIlIIlIIII) ? 1 : 0)) {
            return lIllIlIllllIl[0];
        }
        int llllllllllllllIllIIIllIIlIIIllll = llllllllllllllIllIIIllIIlIIlIIII.distanceTo2D(llllllllllllllIllIIIllIIlIIlIIlI.getWorldLocation());
        if (Z.llIIlIIIlIIIIll(llllllllllllllIllIIIllIIlIIIllll, lIllIlIllllIl[2]) && Z.llIIlIIIlIIIIlI(llllllllllllllIllIIIllIIlIIlIIll.az.U() ? 1 : 0)) {
            return lIllIlIllllIl[0];
        }
        ScenePoint llllllllllllllIllIIIllIIlIIIlllI = ScenePoint.fromWorld((WorldPoint)llllllllllllllIllIIIllIIlIIlIIII);
        Movement.setDestination((int)llllllllllllllIllIIIllIIlIIIlllI.getX(), (int)llllllllllllllIllIIIllIIlIIIlllI.getY());
        llllllllllllllIllIIIllIIlIIlIIll.sleep(lIllIlIllllIl[3]);
        if (Z.llIIlIIIlIIIlII(llllllllllllllIllIIIllIIlIIIllll, lIllIlIllllIl[3])) {
            bl = lIllIlIllllIl[4];
            "".length();
            if (((0xB1 ^ 0x97) & ~(0x7E ^ 0x58)) != 0) {
                return ((0xD0 ^ 0xC2) & ~(0x1F ^ 0xD)) != 0;
            }
        } else {
            bl = lIllIlIllllIl[0];
        }
        return bl;
    }

    private static void llIIlIIIIlllllI() {
        lIllIlIllllIl = new int[6];
        Z.lIllIlIllllIl[0] = (84 + 96 - 84 + 38 ^ 17 + 68 - 41 + 142) & (0x39 ^ 0x21 ^ (0x7B ^ 0x5F) ^ -" ".length());
        Z.lIllIlIllllIl[1] = 0x8F ^ 0x9C ^ (0x1E ^ 7);
        Z.lIllIlIllllIl[2] = 0x2B ^ 0x2F;
        Z.lIllIlIllllIl[3] = "  ".length();
        Z.lIllIlIllllIl[4] = " ".length();
        Z.lIllIlIllllIl[5] = 0xFFFFEFBF & 0x3DF4;
    }
}

