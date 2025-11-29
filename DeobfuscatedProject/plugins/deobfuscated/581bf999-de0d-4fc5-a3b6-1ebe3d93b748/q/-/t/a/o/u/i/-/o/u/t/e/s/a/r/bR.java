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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bX;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging poison splat", priority=160)
public class bR
extends bX {
    private static /* synthetic */ String[] llIlIlllIll;
    private static /* synthetic */ int[] llIlIllllII;

    private static /* synthetic */ boolean e(List list, WorldPoint worldPoint) {
        return list.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        WorldPoint worldPoint2;
        bR llllllllllllllllIIllIIIIllIIIlII;
        void llllllllllllllllIIllIIIIllIIIIll;
        void llllllllllllllllIIllIIIIllIIIIlI;
        Player player = Players.getLocal();
        List<WorldPoint> list = this.cE();
        if (bR.lIlIlIIIIIllIl(list.isEmpty() ? 1 : 0)) {
            return llIlIllllII[0];
        }
        if (bR.lIlIlIIIIIllIl(llllllllllllllllIIllIIIIllIIIIlI.stream().noneMatch(arg_0 -> bR.c((Player)llllllllllllllllIIllIIIIllIIIIll, arg_0)) ? 1 : 0)) {
            return llIlIllllII[0];
        }
        Log.info((String)llIlIlllIll[llIlIllllII[0]]);
        WorldArea llllllllllllllllIIllIIIIllIIIIIl = llllllllllllllllIIllIIIIllIIIIll.getWorldArea().offset(llIlIllllII[1]);
        WorldPoint llllllllllllllllIIllIIIIllIIIIII = llllllllllllllllIIllIIIIllIIIIIl.toWorldPointList().stream().filter(arg_0 -> bR.e((List)llllllllllllllllIIllIIIIllIIIIlI, arg_0)).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl2;
            if (bR.lIlIlIIIIlIIII(worldPoint.distanceTo((Locatable)this.cB()), llIlIllllII[3])) {
                bl2 = llIlIllllII[2];
                0;
                if ((0x80 ^ 0x85) == 0) {
                    return ((0x8C ^ 0x97) & ~(0x8E ^ 0x95)) != 0;
                }
            } else {
                bl2 = llIlIllllII[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(arg_0 -> bR.d((Player)llllllllllllllllIIllIIIIllIIIIll, arg_0))).orElse(null);
        if (bR.lIlIlIIIIIlllI(llllllllllllllllIIllIIIIllIIIIII)) {
            return llIlIllllII[0];
        }
        List<TileObject> list2 = this.cC();
        worldPoint2 = this.b(player.getWorldLocation(), worldPoint2, worldPoint -> {
            int n2;
            if (bR.lIlIlIIIIIllIl(list2.stream().noneMatch(tileObject -> worldPoint.equals((Object)tileObject.getWorldLocation())) ? 1 : 0) && bR.lIlIlIIIIIllll(list.contains(worldPoint) ? 1 : 0)) {
                n2 = llIlIllllII[2];
                0;
                if (((0xAE ^ 0xB3) & ~(0x7C ^ 0x61)) < 0) {
                    return ((0xDE ^ 0x95) & ~(0xC6 ^ 0x8D)) != 0;
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

    private static /* synthetic */ int d(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo2D(player.getWorldLocation());
    }

    @Inject
    protected bR(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static String lIlIlIIIIIlIlI(String llllllllllllllllIIllIIIIlIlIlIll, String llllllllllllllllIIllIIIIlIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIIlIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), llIlIllllII[4]), "DES");
            Cipher llllllllllllllllIIllIIIIlIlIllll = Cipher.getInstance("DES");
            llllllllllllllllIIllIIIIlIlIllll.init(llIlIllllII[5], llllllllllllllllIIllIIIIlIllIIII);
            return new String(llllllllllllllllIIllIIIIlIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIIIlIlIlllI) {
            llllllllllllllllIIllIIIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ boolean c(Player player, WorldPoint worldPoint) {
        return worldPoint.equals((Object)player.getWorldLocation());
    }

    private static void lIlIlIIIIIlIll() {
        llIlIlllIll = new String[llIlIllllII[2]];
        bR.llIlIlllIll[bR.llIlIllllII[0]] = bR."Trying to dodge poison splats";
    }

    static {
        bR.lIlIlIIIIIllII();
        bR.lIlIlIIIIIlIll();
    }

    private static boolean lIlIlIIIIIlllI(Object object) {
        return object == null;
    }

    private static void lIlIlIIIIIllII() {
        llIlIllllII = new int[6];
        bR.llIlIllllII[0] = (0x48 ^ 0x55) & ~(0x78 ^ 0x65);
        bR.llIlIllllII[1] = 0x82 ^ 0x8E;
        bR.llIlIllllII[2] = 1;
        bR.llIlIllllII[3] = 0x67 ^ 0x63;
        bR.llIlIllllII[4] = 0x9F ^ 0x97;
        bR.llIlIllllII[5] = 2;
    }

    private static boolean lIlIlIIIIIllll(int n2) {
        return n2 == 0;
    }
}

