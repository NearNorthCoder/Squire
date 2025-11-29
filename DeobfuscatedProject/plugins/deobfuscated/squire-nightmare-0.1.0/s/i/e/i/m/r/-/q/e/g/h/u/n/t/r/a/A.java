/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.CollisionMap
 *  net.unethicalite.client.Static
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.client.Static;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.C;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

public abstract class A
extends C {
    protected /* synthetic */ e br;
    protected /* synthetic */ CollisionMap cF;
    private static /* synthetic */ int[] llllIlIIIlll;
    private static /* synthetic */ String[] llllIlIIIlII;

    private static void lIIlIIIIIlllIII() {
        llllIlIIIlll = new int[4];
        A.llllIlIIIlll[0] = (0x7C ^ 0x56 ^ (0x69 ^ 0x20)) & (115 + 65 - -2 + 33 ^ 45 + 34 - -89 + 12 ^ -1);
        A.llllIlIIIlll[1] = 1;
        A.llllIlIIIlll[2] = 2;
        A.llllIlIIIlll[3] = 0x46 ^ 0x4E;
    }

    static {
        A.lIIlIIIIIlllIII();
        A.lIIlIIIIIllIllI();
    }

    private static String lIIlIIIIIllIlIl(String lllllllllllllllIIlIllIllIllIIIll, String lllllllllllllllIIlIllIllIllIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIllIllIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIllIllIIlIl.init(llllIlIIIlll[2], lllllllllllllllIIlIllIllIllIIllI);
            return new String(lllllllllllllllIIlIllIllIllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIllIllIIlII) {
            lllllllllllllllIIlIllIllIllIIlII.printStackTrace();
            return null;
        }
    }

    protected A(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
        this.br = e2;
        this.cF = Static.getGlobalCollisionMap();
    }

    protected boolean j(WorldPoint worldPoint) {
        return this.a(worldPoint, List.of());
    }

    private static boolean lIIlIIIIIlllIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean a(WorldPoint worldPoint, List<WorldPoint> list) {
        void lllllllllllllllIIlIllIllIllIlllI;
        void lllllllllllllllIIlIllIllIllIllII;
        Player player = Players.getLocal();
        if (A.lIIlIIIIIlllIIl(player)) {
            return llllIlIIIlll[0];
        }
        WorldPoint lllllllllllllllIIlIllIllIllIlIll = lllllllllllllllIIlIllIllIllIllII.getWorldLocation();
        if (A.lIIlIIIIIlllIIl(lllllllllllllllIIlIllIllIllIlllI)) {
            void lllllllllllllllIIlIllIllIllIllIl;
            Log.error((String)llllIlIIIlII[llllIlIIIlll[0]]);
            if (A.lIIlIIIIIlllIlI(lllllllllllllllIIlIllIllIllIllIl.contains(lllllllllllllllIIlIllIllIllIlIll) ? 1 : 0)) {
                Log.error((String)llllIlIIIlII[llllIlIIIlll[1]]);
            }
            return llllIlIIIlll[0];
        }
        Movement.setDestination((WorldPoint)worldPoint);
        return llllIlIIIlll[1];
    }

    private static String lIIlIIIIIllIlII(String lllllllllllllllIIlIllIllIlIlIllI, String lllllllllllllllIIlIllIllIlIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllIlIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), llllIlIIIlll[3]), "DES");
            Cipher lllllllllllllllIIlIllIllIlIllIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIllIlIllIII.init(llllIlIIIlll[2], lllllllllllllllIIlIllIllIlIllIIl);
            return new String(lllllllllllllllIIlIllIllIlIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIllIlIlIlll) {
            lllllllllllllllIIlIllIllIlIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIllIllI() {
        llllIlIIIlII = new String[llllIlIIIlll[2]];
        A.llllIlIIIlII[A.llllIlIIIlll[0]] = A."[AvoidTask]: Unable to find a destination to walk to!";
        A.llllIlIIIlII[A.llllIlIIIlll[1]] = A."[AvoidTask]: Uh oh player is on a BAD tile, but no avoidance destination was located!";
    }

    private static boolean lIIlIIIIIlllIIl(Object object) {
        return object == null;
    }
}

