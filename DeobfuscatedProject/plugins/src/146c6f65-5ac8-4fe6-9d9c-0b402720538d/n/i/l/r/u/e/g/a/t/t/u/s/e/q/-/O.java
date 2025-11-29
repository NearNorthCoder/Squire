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
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.gauntlet.SquireGauntlet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
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
public class O
extends n {
    private static /* synthetic */ String[] llIlIIIIllII;
    private static /* synthetic */ int[] llIlIIIIllIl;
    private final /* synthetic */ SquireGauntlet bZ;

    private static String lIIIIIIIlllIIll(String lllllllllllllllIlIIIllIllIIlllll, String lllllllllllllllIlIIIllIllIlIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIllIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIllIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllIllIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllIllIlIIIll.init(llIlIIIIllIl[3], lllllllllllllllIlIIIllIllIlIIlII);
            return new String(lllllllllllllllIlIIIllIllIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllIllIlIIIlI) {
            lllllllllllllllIlIIIllIllIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIlllIllI(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIllllIII(Object object) {
        return object == null;
    }

    private static void lIIIIIIIlllIlII() {
        llIlIIIIllII = new String[llIlIIIIllIl[3]];
        O.llIlIIIIllII[O.llIlIIIIllIl[1]] = O.lIIIIIIIlllIIlI("CCcAABt0NxEKBA==", "YRicp");
        O.llIlIIIIllII[O.llIlIIIIllIl[0]] = O.lIIIIIIIlllIIll("/SaT+YK+WV1oQEj4t9klUg==", "eirIM");
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
        void lllllllllllllllIlIIIllIllIlIllII;
        void lllllllllllllllIlIIIllIllIlIllIl;
        h h2 = this.ba.V();
        Player player = Players.getLocal();
        if (!O.lIIIIIIIlllIllI(h2) || !O.lIIIIIIIlllIllI(player) || O.lIIIIIIIlllIlll(player.isMoving() ? 1 : 0)) {
            return llIlIIIIllIl[1];
        }
        if (O.lIIIIIIIlllIlll(lllllllllllllllIlIIIllIllIlIllIl.av().e(lllllllllllllllIlIIIllIllIlIllII.getWorldLocation()) ? 1 : 0)) {
            O lllllllllllllllIlIIIllIllIlIlllI;
            TileObject lllllllllllllllIlIIIllIllIlIlIll = TileObjects.getNearest(tileObject -> e.ac.contains(tileObject.getId()));
            if (O.lIIIIIIIllllIII(lllllllllllllllIlIIIllIllIlIlIll)) {
                return llIlIIIIllIl[1];
            }
            if (O.lIIIIIIIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                return llIlIIIIllIl[0];
            }
            lllllllllllllllIlIIIllIllIlIlIll.interact(llIlIIIIllII[llIlIIIIllIl[1]]);
            lllllllllllllllIlIIIllIllIlIlllI.bZ.a(lllllllllllllllIlIIIllIllIlIlllI.bZ.k() + llIlIIIIllIl[0]);
            Log.info((String)("Unlucky spawns or no T3 Magic weapon. Giving up, count: " + lllllllllllllllIlIIIllIllIlIlllI.bZ.k()));
            return llIlIIIIllIl[0];
        }
        Item lllllllllllllllIlIIIllIllIlIlIll = Inventory.getFirst(item -> e.ab.contains(item.getId()));
        if (O.lIIIIIIIlllIllI(lllllllllllllllIlIIIllIllIlIlIll)) {
            lllllllllllllllIlIIIllIllIlIlIll.interact(llIlIIIIllII[llIlIIIIllIl[0]]);
            "".length();
            if ((3 ^ 7) <= -" ".length()) {
                return ((0x40 ^ 0x51) & ~(0x83 ^ 0x92)) != 0;
            }
        } else {
            WorldPoint lllllllllllllllIlIIIllIllIlIlIlI = lllllllllllllllIlIIIllIllIlIllIl.av().aW().dx(llIlIIIIllIl[2]).dy(llIlIIIIllIl[2]);
            ScenePoint lllllllllllllllIlIIIllIllIlIlIIl = ScenePoint.fromWorld((WorldPoint)lllllllllllllllIlIIIllIllIlIlIlI);
            Movement.setDestination((int)lllllllllllllllIlIIIllIllIlIlIIl.getX(), (int)lllllllllllllllIlIIIllIllIlIlIIl.getY());
        }
        return llIlIIIIllIl[0];
    }

    private static void lIIIIIIIlllIlIl() {
        llIlIIIIllIl = new int[4];
        O.llIlIIIIllIl[0] = " ".length();
        O.llIlIIIIllIl[1] = (0x19 ^ 0x22) & ~(0x32 ^ 9);
        O.llIlIIIIllIl[2] = 0xA0 ^ 0xA6;
        O.llIlIIIIllIl[3] = "  ".length();
    }

    @Inject
    public O(SquireGauntlet squireGauntlet, c c2) {
        d[] dArray = new d[llIlIIIIllIl[0]];
        dArray[O.llIlIIIIllIl[1]] = d.GIVE_UP;
        super(c2, dArray);
        this.bZ = squireGauntlet;
    }

    private static String lIIIIIIIlllIIlI(String lllllllllllllllIlIIIllIllIIIllII, String lllllllllllllllIlIIIllIllIIIlIll) {
        lllllllllllllllIlIIIllIllIIIllII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIllIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllIllIIIllll = new StringBuilder();
        char[] lllllllllllllllIlIIIllIllIIIlllI = lllllllllllllllIlIIIllIllIIIlIll.toCharArray();
        int lllllllllllllllIlIIIllIllIIIllIl = llIlIIIIllIl[1];
        char[] lllllllllllllllIlIIIllIllIIIIlll = lllllllllllllllIlIIIllIllIIIllII.toCharArray();
        int lllllllllllllllIlIIIllIllIIIIllI = lllllllllllllllIlIIIllIllIIIIlll.length;
        int lllllllllllllllIlIIIllIllIIIIlIl = llIlIIIIllIl[1];
        while (O.lIIIIIIIllllIIl(lllllllllllllllIlIIIllIllIIIIlIl, lllllllllllllllIlIIIllIllIIIIllI)) {
            char lllllllllllllllIlIIIllIllIIlIIlI = lllllllllllllllIlIIIllIllIIIIlll[lllllllllllllllIlIIIllIllIIIIlIl];
            lllllllllllllllIlIIIllIllIIIllll.append((char)(lllllllllllllllIlIIIllIllIIlIIlI ^ lllllllllllllllIlIIIllIllIIIlllI[lllllllllllllllIlIIIllIllIIIllIl % lllllllllllllllIlIIIllIllIIIlllI.length]));
            "".length();
            ++lllllllllllllllIlIIIllIllIIIllIl;
            ++lllllllllllllllIlIIIllIllIIIIlIl;
            "".length();
            if (-(0x13 ^ 0x16) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIllIllIIIllll);
    }

    static {
        O.lIIIIIIIlllIlIl();
        O.lIIIIIIIlllIlII();
    }
}

