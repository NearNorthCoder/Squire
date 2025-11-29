/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

/* TASK: Exploring the gauntlet -> ExploringthegauntletTask */
@TaskDesc(name="Exploring the gauntlet", priority=1)
public class Q
extends n {
    private static /* synthetic */ int[] llIIllIlllIl;
    private static /* synthetic */ String[] llIIllIlllII;

    private static /* synthetic */ int a(Player player, TileObject tileObject) {
        return (int)tileObject.getWorldLocation().distanceToHypotenuse(player.getWorldLocation());
    }

    @Inject
    public Q(c c2) {
        d[] dArray = new d[llIIllIlllIl[0]];
        dArray[Q.llIIllIlllIl[1]] = d.FIRST_ROTATION_EXPLORE;
        super(c2, dArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var8;
        Player player = Players.getLocal();
        h h2 = this.ba.V();
        if (!Q.lllllllIlIIIII(player) || !Q.lllllllIlIIIII(h2) || !Q.lllllllIlIIIIl(player.isMoving() ? 1 : 0) || Q.lllllllIlIIIII(player.getInteracting())) {
            return llIIllIlllIl[1];
        }
        Optional<l> var15 = var8.ar();
        if (Q.lllllllIlIIIlI(var15.isEmpty() ? 1 : 0)) {
            Log.info((String)llIIllIlllII[llIIllIlllIl[1]]);
            return llIIllIlllIl[1];
        }
        l var9 = var8.as();
        if (Q.lllllllIlIIIII(var9)) {
            void var11;
            Q var13;
            Optional<l> var10 = var8.c(var9).stream().filter(l2 -> {
                int n2;
                if (Q.lllllllIlIIIIl(l2.aY() ? 1 : 0) && Q.lllllllIlIIIlI(l2.aS() ? 1 : 0)) {
                    n2 = llIIllIlllIl[0];
                    0;
                    if (((0xF0 ^ 0x93) & ~(0xFF ^ 0x9C)) < 0) {
                        return false;
                    }
                } else {
                    n2 = llIIllIlllIl[1];
                }
                return n2 != 0;
            }).findFirst();
            g var4 = var13.ba.J();
            l var1 = var15.get();
            if (Q.lllllllIlIIIlI(var8.b(l2 -> {
                int n2;
                if (Q.lllllllIlIIIlI(l2.aY() ? 1 : 0) && Q.lllllllIlIIIll((Object)l2.aZ(), (Object)var4)) {
                    n2 = llIIllIlllIl[0];
                    0;
                    if ((0x73 ^ 0x77) < 0) {
                        return false;
                    }
                } else {
                    n2 = llIIllIlllIl[1];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && Q.lllllllIlIIIlI(var10.isPresent() ? 1 : 0)) {
                var1 = var10.get();
            }
            WorldArea var16 = var1.aR();
            Comparator<TileObject> var17 = Comparator.comparingInt(arg_0 -> Q.a((Player)var11, arg_0));
            Comparator<TileObject> var6 = Comparator.comparingInt(tileObject -> (int)var16.getCenter().distanceToHypotenuse(tileObject.getWorldLocation()));
            Optional<TileObject> var5 = TileObjects.getAll((int[])e.U).stream().filter(tileObject -> var9.e(tileObject.getWorldLocation())).min(var6.thenComparing(var17));
            var5.ifPresent(tileObject -> tileObject.interact(llIIllIlllII[llIIllIlllIl[0]]));
            return llIIllIlllIl[0];
        }
        return llIIllIlllIl[1];
    }

    private static boolean lllllllIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static void lllllllIIllllI() {
        llIIllIlllII = new String[llIIllIlllIl[2]];
        Q.llIIllIlllII[Q.llIIllIlllIl[1]] = Q."Next unexplored room is empty.";
        Q.llIIllIlllII[Q.llIIllIlllIl[0]] = Q."Light";
    }

    static {
        Q.lllllllIIlllll();
        Q.lllllllIIllllI();
    }

    private static void lllllllIIlllll() {
        llIIllIlllIl = new int[3];
        Q.llIIllIlllIl[0] = 1;
        Q.llIIllIlllIl[1] = (0x96 ^ 0x85) & ~(0x7B ^ 0x68);
        Q.llIIllIlllIl[2] = 2;
    }

    private static String lllllllIIlllIl(String var7, String var14) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llIIllIlllIl[2], var2);
            return new String(var12.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllIlIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllIlIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllllIlIIIII(Object object) {
        return object != null;
    }
}

