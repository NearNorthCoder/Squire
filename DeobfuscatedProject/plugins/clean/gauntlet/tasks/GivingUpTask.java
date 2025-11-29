/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.gauntlet.SquireGauntlet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Giving up", priority=100, blocking=true)
public class GivingUpTask
extends GauntletTaskBase {

    private final  SquireGauntlet bZ;

    private static boolean lIIIIIIIlllIllI(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIllllIII(Object object) {
        return object == null;
    }

    private static void lIIIIIIIlllIlII() {
        llIlIIIIllII = new String[llIlIIIIllIl[3]];
        O.llIlIIIIllII[O.llIlIIIIllIl[1]] = "Quick-exit";
        O.llIlIIIIllII[O.llIlIIIIllIl[0]] = "Activate";
    }

    private static boolean lIIIIIIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var1;
        void var2;
        h h2 = this.ba.V();
        Player player = Players.getLocal();
        if (!O.lIIIIIIIlllIllI(h2) || !O.lIIIIIIIlllIllI(player) || O.lIIIIIIIlllIlll(player.isMoving() ? 1 : 0)) {
            return llIlIIIIllIl[1];
        }
        if (O.lIIIIIIIlllIlll(var2.av().e(var1.getWorldLocation()) ? 1 : 0)) {
            O var3;
            TileObject var4 = TileObjects.getNearest(tileObject -> e.ac.contains(tileObject.getId()));
            if (O.lIIIIIIIllllIII(var4)) {
                return llIlIIIIllIl[1];
            }
            if (O.lIIIIIIIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                return llIlIIIIllIl[0];
            }
            var4.interact(llIlIIIIllII[llIlIIIIllIl[1]]);
            var3.bZ.a(var3.bZ.k() + llIlIIIIllIl[0]);
            Log.info((String)("Unlucky spawns or no T3 Magic weapon. Giving up, count: " + var3.bZ.k()));
            return llIlIIIIllIl[0];
        }
        Item var4 = Inventory.getFirst(item -> e.ab.contains(item.getId()));
        if (O.lIIIIIIIlllIllI(var4)) {
            var4.interact(llIlIIIIllII[llIlIIIIllIl[0]]);

            if ((3 ^ 7) <= -1) {
                return false;
            }
        } else {
            WorldPoint var5 = var2.av().aW().dx(llIlIIIIllIl[2]).dy(llIlIIIIllIl[2]);
            ScenePoint var6 = ScenePoint.fromWorld((WorldPoint)var5);
            Movement.setDestination((int)var6.getX(), (int)var6.getY());
        }
        return llIlIIIIllIl[0];
    }

    @Inject
    public GivingUpTask(SquireGauntlet squireGauntlet, c c2) {
        d[] dArray = new d[llIlIIIIllIl[0]];
        dArray[O.llIlIIIIllIl[1]] = d.GIVE_UP;
        super(c2, dArray);
        this.bZ = squireGauntlet;
    }

        return String.valueOf(var7);
    }

    static {
        O.lIIIIIIIlllIlIl();
        O.lIIIIIIIlllIlII();
    }
}

