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
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.g;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

@TaskDesc(name="Walking towards the next patch", priority=50, blocking=true)
public class u
extends r {
    private static /* synthetic */ int[] lIlIIIIIlIlII;
    private final /* synthetic */ Client ad;
    private static /* synthetic */ String[] lIlIIIIIlIIlI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        u llllllllllllllIlllIIlIIIlIIIlllI;
        WorldPoint llllllllllllllIlllIIlIIIlIIIlIlI;
        void llllllllllllllIlllIIlIIIlIIIllIl;
        TileObject tileObject2 = this.Z.a((TileObject tileObject) -> lIlIIIIIlIlII[1]);
        if (u.lIllIllIlllIllI(tileObject2)) {
            return lIlIIIIIlIlII[0];
        }
        if (u.lIllIllIlllIlll(llllllllllllllIlllIIlIIIlIIIllIl instanceof GameObject)) {
            return lIlIIIIIlIlII[0];
        }
        GameObject llllllllllllllIlllIIlIIIlIIIllII = (GameObject)llllllllllllllIlllIIlIIIlIIIllIl;
        Player llllllllllllllIlllIIlIIIlIIIlIll = Players.getLocal();
        if (u.lIllIllIllllIII(llllllllllllllIlllIIlIIIlIIIllII.getWorldArea().isInMeleeDistance(llllllllllllllIlllIIlIIIlIIIlIll.getWorldArea()) ? 1 : 0)) {
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
        if (u.lIllIllIllllIII(Movement.isWalking() ? 1 : 0) && u.lIllIllIllllIIl(llllllllllllllIlllIIlIIIlIIIlIlI = Movement.getDestination()) && u.lIllIllIllllIII(llllllllllllllIlllIIlIIIlIIIllII.getWorldArea().isInMeleeDistance(llllllllllllllIlllIIlIIIlIIIlIlI) ? 1 : 0) && u.lIllIllIllllIlI(llllllllllllllIlllIIlIIIlIIIlIlI.distanceToPath(llllllllllllllIlllIIlIIIlIIIlllI.ad, llllllllllllllIlllIIlIIIlIIIlIll.getWorldLocation()), lIlIIIIIlIlII[1])) {
            return lIlIIIIIlIlII[0];
        }
        llllllllllllllIlllIIlIIIlIIIlIlI = (GameObject)llllllllllllllIlllIIlIIIlIIIlllI.Z.a(tileObject -> lIlIIIIIlIlII[1], lIlIIIIIlIlII[3]);
        GameObject llllllllllllllIlllIIlIIIlIIIlIIl = (GameObject)llllllllllllllIlllIIlIIIlIIIlllI.Z.a(tileObject -> lIlIIIIIlIlII[1], lIlIIIIIlIlII[4]);
        if (!u.lIllIllIllllIIl(llllllllllllllIlllIIlIIIlIIIlIlI) || u.lIllIllIlllIllI(llllllllllllllIlllIIlIIIlIIIlIIl)) {
            return lIlIIIIIlIlII[0];
        }
        WorldPoint llllllllllllllIlllIIlIIIlIIIlIII = llllllllllllllIlllIIlIIIlIIIllII.getWorldArea().toWorldPointList().stream().flatMap(worldPoint -> {
            Stream<WorldPoint> stream;
            if (u.lIllIllIllllIll((Object)this.Z.r(), (Object)g.PATCH_13_SOUTH)) {
                stream = Stream.of(worldPoint.dy(lIlIIIIIlIlII[1]));
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            } else {
                void llllllllllllllIlllIIlIIIIlllllII;
                WorldPoint[] worldPointArray = new WorldPoint[lIlIIIIIlIlII[3]];
                worldPointArray[u.lIlIIIIIlIlII[0]] = llllllllllllllIlllIIlIIIIlllllII.dx(lIlIIIIIlIlII[5]);
                worldPointArray[u.lIlIIIIIlIlII[1]] = llllllllllllllIlllIIlIIIIlllllII.dx(lIlIIIIIlIlII[1]);
                stream = Stream.of(worldPointArray);
            }
            return stream;
        }).filter(arg_0 -> u.a(llllllllllllllIlllIIlIIIlIIIllII, (GameObject)llllllllllllllIlllIIlIIIlIIIlIlI, llllllllllllllIlllIIlIIIlIIIlIIl, arg_0)).filter(worldPoint -> llllllllllllllIlllIIlIIIlIIIllII.getWorldArea().isInMeleeDistance(worldPoint)).min(Comparator.comparingDouble(arg_0 -> llllllllllllllIlllIIlIIIlIIIlllI.b((GameObject)llllllllllllllIlllIIlIIIlIIIlIlI, arg_0)).thenComparing(object -> Float.valueOf(((WorldPoint)object).distanceTo2DHypotenuse(llllllllllllllIlllIIlIIIlIIIlIIl.getWorldArea().getCenter())))).orElse(null);
        if (u.lIllIllIlllIllI(llllllllllllllIlllIIlIIIlIIIlIII)) {
            return lIlIIIIIlIlII[0];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return lIlIIIIIlIlII[1];
    }

    private static /* synthetic */ boolean a(GameObject gameObject, GameObject gameObject2, GameObject gameObject3, WorldPoint worldPoint) {
        int n2;
        if (u.lIllIllIlllIlll(gameObject.getWorldArea().contains(worldPoint) ? 1 : 0) && u.lIllIllIlllIlll(gameObject2.getWorldArea().contains(worldPoint) ? 1 : 0) && u.lIllIllIlllIlll(gameObject3.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            n2 = lIlIIIIIlIlII[1];
            "".length();
            if (" ".length() < ((0x29 ^ 8) & ~(0x28 ^ 9))) {
                return ((0x2D ^ 0x14) & ~(0x3E ^ 7)) != 0;
            }
        } else {
            n2 = lIlIIIIIlIlII[0];
        }
        return n2 != 0;
    }

    private static String lIllIllIlllIIIl(String llllllllllllllIlllIIlIIIIlllIIlI, String llllllllllllllIlllIIlIIIIlllIIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIIIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIIIIlllIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIIIIlllIllI.init(lIlIIIIIlIlII[3], llllllllllllllIlllIIlIIIIlllIlll);
            return new String(llllllllllllllIlllIIlIIIIlllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIIIIlllIlIl) {
            llllllllllllllIlllIIlIIIIlllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIlllIlll(int n2) {
        return n2 == 0;
    }

    private static void lIllIllIlllIlIl() {
        lIlIIIIIlIlII = new int[8];
        u.lIlIIIIIlIlII[0] = (0xB3 ^ 0x86) & ~(0xF0 ^ 0xC5);
        u.lIlIIIIIlIlII[1] = " ".length();
        u.lIlIIIIIlIlII[2] = -(0xFFFF8AA9 & 0x7757) & (0xFFFFBF6E & 0x76FD);
        u.lIlIIIIIlIlII[3] = "  ".length();
        u.lIlIIIIIlIlII[4] = "   ".length();
        u.lIlIIIIIlIlII[5] = -" ".length();
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

    private static String lIllIllIlllIIlI(String llllllllllllllIlllIIlIIIIllIIlll, String llllllllllllllIlllIIlIIIIllIIllI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIIIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIIllIIllI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIlII[7]), "DES");
            Cipher llllllllllllllIlllIIlIIIIllIlIIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIIIIllIlIIl.init(lIlIIIIIlIlII[3], llllllllllllllIlllIIlIIIIllIlIlI);
            return new String(llllllllllllllIlllIIlIIIIllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIIIIllIlIII) {
            llllllllllllllIlllIIlIIIIllIlIII.printStackTrace();
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
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[0]] = u.lIllIllIlllIIIl("j12r31JxNOI=", "rJbdi");
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[1]] = u.lIllIllIlllIIlI("JC8hwJEkWWg=", "DZWYC");
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[3]] = u.lIllIllIlllIIIl("U4RD6eFHXGmyDr/bvWiNeg==", "YaDUl");
        u.lIlIIIIIlIIlI[u.lIlIIIIIlIlII[4]] = u.lIllIllIlllIIlI("j9y9W36M5eRtn0qAUTjLnw==", "rbkEI");
    }

    static {
        u.lIllIllIlllIlIl();
        u.lIllIllIlllIIll();
    }

    private static boolean lIllIllIlllIllI(Object object) {
        return object == null;
    }
}

