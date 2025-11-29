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
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

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
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.GEnum;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i_Unknown;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

/* TASK: Walking towards the next patch -> WalkingtowardsthenextpatchTask */
@TaskDesc(name="Walking towards the next patch", priority=50, blocking=true)
public class WalkingTowardsTheNextPatchTask
extends r {
    private static /* synthetic */ int[] lIlIIIIIlIlII;
    private final /* synthetic */ Client ad;
    private static /* synthetic */ String[] lIlIIIIIlIIlI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        u var11;
        WorldPoint var8;
        void var10;
        TileObject tileObject2 = this.Z.a((TileObject tileObject) -> lIlIIIIIlIlII[1]);
        if (u.lIllIllIlllIllI(tileObject2)) {
            return lIlIIIIIlIlII[0];
        }
        if (u.lIllIllIlllIlll(var10 instanceof GameObject)) {
            return lIlIIIIIlIlII[0];
        }
        GameObject var17 = (GameObject)var10;
        Player var13 = Players.getLocal();
        if (u.lIllIllIllllIII(var17.getWorldArea().isInMeleeDistance(var13.getWorldArea()) ? 1 : 0)) {
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
        if (u.lIllIllIllllIII(Movement.isWalking() ? 1 : 0) && u.lIllIllIllllIIl(var8 = Movement.getDestination()) && u.lIllIllIllllIII(var17.getWorldArea().isInMeleeDistance(var8) ? 1 : 0) && u.lIllIllIllllIlI(var8.distanceToPath(var11.ad, var13.getWorldLocation()), lIlIIIIIlIlII[1])) {
            return lIlIIIIIlIlII[0];
        }
        var8 = (GameObject)var11.Z.a(tileObject -> lIlIIIIIlIlII[1], lIlIIIIIlIlII[3]);
        GameObject var16 = (GameObject)var11.Z.a(tileObject -> lIlIIIIIlIlII[1], lIlIIIIIlIlII[4]);
        if (!u.lIllIllIllllIIl(var8) || u.lIllIllIlllIllI(var16)) {
            return lIlIIIIIlIlII[0];
        }
        WorldPoint var7 = var17.getWorldArea().toWorldPointList().stream().flatMap(worldPoint -> {
            Stream<WorldPoint> stream;
            if (u.lIllIllIllllIll((Object)this.Z.r(), (Object)g.PATCH_13_SOUTH)) {
                stream = Stream.of(worldPoint.dy(lIlIIIIIlIlII[1]));
                0;
                if (2 <= 0) {
                    return null;
                }
            } else {
                void var4;
                WorldPoint[] worldPointArray = new WorldPoint[lIlIIIIIlIlII[3]];
                worldPointArray[u.lIlIIIIIlIlII[0]] = var4.dx(lIlIIIIIlIlII[5]);
                worldPointArray[u.lIlIIIIIlIlII[1]] = var4.dx(lIlIIIIIlIlII[1]);
                stream = Stream.of(worldPointArray);
            }
            return stream;
        }).filter(arg_0 -> u.a(var17, (GameObject)var8, var16, arg_0)).filter(worldPoint -> var17.getWorldArea().isInMeleeDistance(worldPoint)).min(Comparator.comparingDouble(arg_0 -> var11.b((GameObject)var8, arg_0)).thenComparing(object -> Float.valueOf(((WorldPoint)object).distanceTo2DHypotenuse(var16.getWorldArea().getCenter())))).orElse(null);
        if (u.lIllIllIlllIllI(var7)) {
            return lIlIIIIIlIlII[0];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return lIlIIIIIlIlII[1];
    }

    private static /* synthetic */ boolean a(GameObject gameObject, GameObject gameObject2, GameObject gameObject3, WorldPoint worldPoint) {
        int n2;
        if (u.lIllIllIlllIlll(gameObject.getWorldArea().contains(worldPoint) ? 1 : 0) && u.lIllIllIlllIlll(gameObject2.getWorldArea().contains(worldPoint) ? 1 : 0) && u.lIllIllIlllIlll(gameObject3.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            n2 = lIlIIIIIlIlII[1];
            0;
            if (1 < ((0x29 ^ 8) & ~(0x28 ^ 9))) {
                return false;
            }
        } else {
            n2 = lIlIIIIIlIlII[0];
        }
        return n2 != 0;
    }

    private static String lIllIllIlllIIIl(String var1, String var3) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIlIIIIIlIlII[3], var18);
            return new String(var2.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIlllIlll(int n2) {
        return n2 == 0;
    }

    private static void lIllIllIlllIlIl() {
        lIlIIIIIlIlII = new int[8];
        u.lIlIIIIIlIlII[0] = (0xB3 ^ 0x86) & ~(0xF0 ^ 0xC5);
        u.lIlIIIIIlIlII[1] = 1;
        u.lIlIIIIIlIlII[2] = -(0xFFFF8AA9 & 0x7757) & (0xFFFFBF6E & 0x76FD);
        u.lIlIIIIIlIlII[3] = 2;
        u.lIlIIIIIlIlII[4] = 3;
        u.lIlIIIIIlIlII[5] = -1;
        u.lIlIIIIIlIlII[6] = 0xA2 ^ 0xA6;
        u.lIlIIIIIlIlII[7] = 0x8F ^ 0x87;
    }

    private static boolean lIllIllIllllIIl(Object object) {
        return object != null;
    }

    private static boolean lIllIllIllllIII(int n2) {
        return n2 != 0;
    }

    private /* synthetic */ double b(GameObject gameObject, Object object) {
        return ((WorldPoint)object).distanceToPath(this.ad, gameObject.getWorldArea().getCenter());
    }

    private static boolean lIllIllIllllIll(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIllIlllIIlI(String var14, String var15) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIlII[7]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIlIIIIIlIlII[3], var6);
            return new String(var12.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Inject
    protected u(i i2, Client client) {
        super(i2);
        this.ad = client;
    }

    private static boolean lIllIllIllllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIllIllIlllIIll() {
        lIlIIIIIlIIlI = new String[lIlIIIIIlIlII[6]];
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[0]] = u."Drop";
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[1]] = u."Wear";
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[3]] = u."graceful";
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[4]] = u."graceful";
    }

    static {
        u.lIllIllIlllIlIl();
        u.lIllIllIlllIIll();
    }

    private static boolean lIllIllIlllIllI(Object object) {
        return object == null;
    }
}

