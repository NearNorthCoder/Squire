/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.A;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Stepping into flower area", priority=0x7FFFFFFA, blocking=true)
public class aw
extends A {
    private static /* synthetic */ int[] llllIlllIIII;
    private static final /* synthetic */ Logger es;
    private static /* synthetic */ String[] llllIllIlllI;

    private static boolean lIIlIIIlllIIlll(Object object) {
        return object == null;
    }

    private static void lIIlIIIlllIIllI() {
        llllIlllIIII = new int[4];
        aw.llllIlllIIII[0] = (0xB8 ^ 0x98) & ~(0x82 ^ 0xA2);
        aw.llllIlllIIII[1] = 3;
        aw.llllIlllIIII[2] = 1;
        aw.llllIlllIIII[3] = 2;
    }

    static {
        aw.lIIlIIIlllIIllI();
        aw.lIIlIIIlllIIlIl();
        es = LoggerFactory.getLogger(aw.class);
    }

    @Inject
    protected aw(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    private static boolean lIIlIIIlllIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var6_6;
        aw lllllllllllllllIIlIlIllIlIIlllll;
        void lllllllllllllllIIlIlIllIlIIllllI;
        void lllllllllllllllIIlIlIllIlIIlllIl;
        WorldPoint worldPoint2 = this.cL.getLocalPlayer().getWorldLocation();
        RectangularArea rectangularArea = e.ay();
        if (aw.lIIlIIIlllIIlll(rectangularArea)) {
            return llllIlllIIII[0];
        }
        Player lllllllllllllllIIlIlIllIlIIlllII = Players.getLocal();
        WorldPoint lllllllllllllllIIlIlIllIlIIllIll = Movement.getDestination();
        if (aw.lIIlIIIlllIlIII(lllllllllllllllIIlIlIllIlIIlllIl.contains((WorldPoint)lllllllllllllllIIlIlIllIlIIllllI) ? 1 : 0)) {
            return llllIlllIIII[0];
        }
        if (aw.lIIlIIIlllIlIIl(lllllllllllllllIIlIlIllIlIIllIll) && aw.lIIlIIIlllIlIII(lllllllllllllllIIlIlIllIlIIlllII.isMoving() ? 1 : 0) && aw.lIIlIIIlllIlIII(lllllllllllllllIIlIlIllIlIIlllIl.contains(lllllllllllllllIIlIlIllIlIIllIll) ? 1 : 0)) {
            return llllIlllIIII[0];
        }
        NPC lllllllllllllllIIlIlIllIlIIllIlI = SquireNightmarePlugin.d();
        WorldPoint lllllllllllllllIIlIlIllIlIIllIIl = null;
        if (aw.lIIlIIIlllIlIII(lllllllllllllllIIlIlIllIlIIlllll.bZ() ? 1 : 0)) {
            Stream stream = lllllllllllllllIIlIlIllIlIIllIlI.getWorldArea().getMeleeTiles(Static.getClient()).stream();
            void v1 = lllllllllllllllIIlIlIllIlIIlllIl;
            Objects.requireNonNull(v1);
            0;
            lllllllllllllllIIlIlIllIlIIllIIl = stream.filter(arg_0 -> ((RectangularArea)v1).contains(arg_0)).filter(worldPoint -> {
                boolean bl;
                if (aw.lIIlIIIlllIlIlI(lllllllllllllllIIlIlIllIlIIllIlI.getWorldArea().contains(worldPoint.getWorldLocation()) ? 1 : 0)) {
                    bl = llllIlllIIII[2];
                    0;
                    if (2 <= 1) {
                        return ((29 + 41 - 34 + 197 ^ 187 + 94 - 108 + 21) & (0xB5 ^ 0xAA ^ (0x7F ^ 0x4B) ^ -1)) != 0;
                    }
                } else {
                    bl = llllIlllIIII[0];
                }
                return bl;
            }).filter(worldPoint -> {
                boolean bl;
                if (aw.lIIlIIIlllIlIlI(this.cM.Y().contains(worldPoint.getWorldLocation()) ? 1 : 0)) {
                    bl = llllIlllIIII[2];
                    0;
                    if ((0x5E ^ 0x5A) != (0x2F ^ 0x2B)) {
                        return ((0x69 ^ 0x4C) & ~(0xA1 ^ 0x84)) != 0;
                    }
                } else {
                    bl = llllIlllIIII[0];
                }
                return bl;
            }).min(Comparator.comparingInt(arg_0 -> aw.d((WorldPoint)lllllllllllllllIIlIlIllIlIIllllI, arg_0))).orElse(null);
        }
        if (aw.lIIlIIIlllIIlll(lllllllllllllllIIlIlIllIlIIllIIl)) {
            lllllllllllllllIIlIlIllIlIIllIIl = lllllllllllllllIIlIlIllIlIIlllIl.getNearest();
        }
        if (aw.lIIlIIIlllIIlll(lllllllllllllllIIlIlIllIlIIllIIl)) {
            Object[] objectArray = new Object[llllIlllIIII[1]];
            objectArray[aw.llllIlllIIII[0]] = lllllllllllllllIIlIlIllIlIIlllIl;
            objectArray[aw.llllIlllIIII[2]] = lllllllllllllllIIlIlIllIlIIllIlI.getWorldArea();
            objectArray[aw.llllIlllIIII[3]] = lllllllllllllllIIlIlIllIlIIlllll.cM.Y();
            Log.error((String)llllIllIlllI[llllIlllIIII[0]], (Object[])objectArray);
            return llllIlllIIII[0];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return llllIlllIIII[2];
    }

    private static boolean lIIlIIIlllIlIIl(Object object) {
        return object != null;
    }

    private static /* synthetic */ int d(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.getWorldLocation().distanceTo(worldPoint);
    }

    private static boolean lIIlIIIlllIlIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIlllIIlIl() {
        llllIllIlllI = new String[llllIlllIIII[2]];
        aw.llllIllIlllI[aw.llllIlllIIII[0]] = aw."[AvoidFlowers]: Unable to find a flower to move to. [farea: {}] [pnm: {}] [shadows: {}]";
    }

    private static String lIIlIIIllIlllll(String lllllllllllllllIIlIlIllIlIIIlIIl, String lllllllllllllllIIlIlIllIlIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIlIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIlIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIllIlIIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIllIlIIIlIll.init(llllIlllIIII[3], lllllllllllllllIIlIlIllIlIIIllII);
            return new String(lllllllllllllllIIlIlIllIlIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIllIlIIIlIlI) {
            lllllllllllllllIIlIlIllIlIIIlIlI.printStackTrace();
            return null;
        }
    }
}

