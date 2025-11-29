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

/* TASK: Giving up -> GivingupTask */
@TaskDesc(name="Giving up", priority=100, blocking=true)
public class O
extends n {
    private static /* synthetic */ String[] llIlIIIIllII;
    private static /* synthetic */ int[] llIlIIIIllIl;
    private final /* synthetic */ SquireGauntlet bZ;

    private static String lIIIIIIIlllIIll(String var19, String var2) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(llIlIIIIllIl[3], var14);
            return new String(var13.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
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
        O.llIlIIIIllII[O.llIlIIIIllIl[1]] = O."Quick-exit";
        O.llIlIIIIllII[O.llIlIIIIllIl[0]] = O."Activate";
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
        void var6;
        void var1;
        h h2 = this.ba.V();
        Player player = Players.getLocal();
        if (!O.lIIIIIIIlllIllI(h2) || !O.lIIIIIIIlllIllI(player) || O.lIIIIIIIlllIlll(player.isMoving() ? 1 : 0)) {
            return llIlIIIIllIl[1];
        }
        if (O.lIIIIIIIlllIlll(var1.av().e(var6.getWorldLocation()) ? 1 : 0)) {
            O var10;
            TileObject var9 = TileObjects.getNearest(tileObject -> e.ac.contains(tileObject.getId()));
            if (O.lIIIIIIIllllIII(var9)) {
                return llIlIIIIllIl[1];
            }
            if (O.lIIIIIIIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                return llIlIIIIllIl[0];
            }
            var9.interact(llIlIIIIllII[llIlIIIIllIl[1]]);
            var10.bZ.a(var10.bZ.k() + llIlIIIIllIl[0]);
            Log.info((String)("Unlucky spawns or no T3 Magic weapon. Giving up, count: " + var10.bZ.k()));
            return llIlIIIIllIl[0];
        }
        Item var9 = Inventory.getFirst(item -> e.ab.contains(item.getId()));
        if (O.lIIIIIIIlllIllI(var9)) {
            var9.interact(llIlIIIIllII[llIlIIIIllIl[0]]);
            0;
            if ((3 ^ 7) <= -1) {
                return false;
            }
        } else {
            WorldPoint var7 = var1.av().aW().dx(llIlIIIIllIl[2]).dy(llIlIIIIllIl[2]);
            ScenePoint var3 = ScenePoint.fromWorld((WorldPoint)var7);
            Movement.setDestination((int)var3.getX(), (int)var3.getY());
        }
        return llIlIIIIllIl[0];
    }

    private static void lIIIIIIIlllIlIl() {
        llIlIIIIllIl = new int[4];
        O.llIlIIIIllIl[0] = 1;
        O.llIlIIIIllIl[1] = (0x19 ^ 0x22) & ~(0x32 ^ 9);
        O.llIlIIIIllIl[2] = 0xA0 ^ 0xA6;
        O.llIlIIIIllIl[3] = 2;
    }

    @Inject
    public O(SquireGauntlet squireGauntlet, c c2) {
        d[] dArray = new d[llIlIIIIllIl[0]];
        dArray[O.llIlIIIIllIl[1]] = d.GIVE_UP;
        super(c2, dArray);
        this.bZ = squireGauntlet;
    }

    private static String lIIIIIIIlllIIlI(String var12, String var8) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var18 = var8.toCharArray();
        int var11 = llIlIIIIllIl[1];
        char[] var17 = var12.toCharArray();
        int var4 = var17.length;
        int var20 = llIlIIIIllIl[1];
        while (O.lIIIIIIIllllIIl(var20, var4)) {
            char var5 = var17[var20];
            var16.append((char)(var5 ^ var18[var11 % var18.length]));
            0;
            ++var11;
            ++var20;
            0;
            if (-(0x13 ^ 0x16) < 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    static {
        O.lIIIIIIIlllIlIl();
        O.lIIIIIIIlllIlII();
    }
}

