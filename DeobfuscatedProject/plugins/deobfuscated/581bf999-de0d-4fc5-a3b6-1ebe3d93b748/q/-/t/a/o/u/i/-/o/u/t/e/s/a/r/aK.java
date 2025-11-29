/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ActorDeath
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Red X Cycle", priority=50, register=true)
public class aK
extends aI {
    private /* synthetic */ int eb;
    private static /* synthetic */ int[] llIlIIlIlll;
    private static /* synthetic */ String[] llIlIIlIllI;
    private /* synthetic */ int ed;
    private /* synthetic */ int ec;

    private static boolean lIlIIlIllIIllI(Object object) {
        return object == null;
    }

    private static String lIlIIlIlIlllll(String llllllllllllllllIIllIllIIIllllll, String llllllllllllllllIIllIllIIIlllllI) {
        try {
            SecretKeySpec llllllllllllllllIIllIllIIlIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllIIIlllllI.getBytes(StandardCharsets.UTF_8)), llIlIIlIlll[15]), "DES");
            Cipher llllllllllllllllIIllIllIIlIIIIIl = Cipher.getInstance("DES");
            llllllllllllllllIIllIllIIlIIIIIl.init(llIlIIlIlll[5], llllllllllllllllIIllIllIIlIIIIlI);
            return new String(llllllllllllllllIIllIllIIlIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIllIIlIIIIII) {
            llllllllllllllllIIllIllIIlIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        WorldPoint llllllllllllllllIIllIllIIllIIIII;
        aK llllllllllllllllIIllIllIIllIIIlI;
        void llllllllllllllllIIllIllIIllIIIIl;
        if (aK.lIlIIlIllIllII(this.eb, this.cu.getTickCount())) {
            return;
        }
        if (aK.lIlIIlIllIIlll(llllllllllllllllIIllIllIIllIIIIl.getGraphicsObject().getId(), llIlIIlIlll[13])) {
            llllllllllllllllIIllIllIIllIIIlI.eb = llllllllllllllllIIllIllIIllIIIlI.cu.getTickCount() + llIlIIlIlll[2];
        }
        if (aK.lIlIIlIllIIlll(llllllllllllllllIIllIllIIllIIIIl.getGraphicsObject().getId(), llIlIIlIlll[14]) && aK.lIlIIlIllIIIll((llllllllllllllllIIllIllIIllIIIII = WorldPoint.fromLocal((Client)llllllllllllllllIIllIllIIllIIIlI.cu, (LocalPoint)llllllllllllllllIIllIllIIllIIIIl.getGraphicsObject().getLocation())).equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            llllllllllllllllIIllIllIIllIIIlI.eb = llllllllllllllllIIllIllIIllIIIlI.cu.getTickCount() + llIlIIlIlll[2];
        }
    }

    @Inject
    protected aK(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void lIlIIlIllIIIlI() {
        llIlIIlIlll = new int[16];
        aK.llIlIIlIlll[0] = -1;
        aK.llIlIIlIlll[1] = (122 + 156 - 124 + 53 ^ 5 + 107 - 54 + 72) & (137 + 73 - 163 + 157 ^ 41 + 88 - 125 + 125 ^ -1);
        aK.llIlIIlIlll[2] = 1;
        aK.llIlIIlIlll[3] = -(0xFFFFFB75 & 0x14FB) & (0xFFFFF7FF & 0x3E7F);
        aK.llIlIIlIlll[4] = 3;
        aK.llIlIIlIlll[5] = 2;
        aK.llIlIIlIlll[6] = 0x68 ^ 0x6C;
        aK.llIlIIlIlll[7] = 0x48 ^ 0x5E;
        aK.llIlIIlIlll[8] = 0x7D ^ 0x66 ^ (0x3F ^ 0);
        aK.llIlIIlIlll[9] = 9 ^ 0xC ^ (0xB5 ^ 0xAC);
        aK.llIlIIlIlll[10] = 0xFFFFAFFD & 0x7E06;
        aK.llIlIIlIlll[11] = 0x40 ^ 4 ^ (0x5D ^ 0x1F);
        aK.llIlIIlIlll[12] = 0xFFFFC9EA & 0x3EDF;
        aK.llIlIIlIlll[13] = 0xFFFFD6CF & 0x2D7F;
        aK.llIlIIlIlll[14] = 0xFFFFB7F9 & 0x4DAE;
        aK.llIlIIlIlll[15] = 7 ^ 0xF;
    }

    private static boolean lIlIIlIllIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIllIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIllIIlll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public void r() {
        this.eb = llIlIIlIlll[0];
        this.ec = llIlIIlIlll[0];
    }

    private static int lIlIIlIllIIlII(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (aK.lIlIIlIllIIIll(string.contains(llIlIIlIllI[llIlIIlIlll[1]]) ? 1 : 0)) {
            this.r();
        }
    }

    private static boolean lIlIIlIllIlIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIlIllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIllIIlIl(int n2) {
        return n2 == 0;
    }

    private static String lIlIIlIllIIIII(String llllllllllllllllIIllIllIIlIIllII, String llllllllllllllllIIllIllIIlIIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIllIIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIllIIlIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIllIIlIIlllI.init(llIlIIlIlll[5], llllllllllllllllIIllIllIIlIIllll);
            return new String(llllllllllllllllIIllIllIIlIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIllIIlIIllIl) {
            llllllllllllllllIIllIllIIlIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        aK.lIlIIlIllIIIlI();
        aK.lIlIIlIllIIIIl();
    }

    private static boolean lIlIIlIllIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bm() {
        this.r();
        return super.bm();
    }

    @Override
    public boolean bC() {
        int llllllllllllllllIIllIllIIlllIIIl;
        int n2;
        aK llllllllllllllllIIllIllIIlllIlIl;
        if (aK.lIlIIlIllIIlIl(this.cW.redX() ? 1 : 0)) {
            return llIlIIlIlll[1];
        }
        NPC llllllllllllllllIIllIllIIlllIlII = llllllllllllllllIIllIllIIlllIlIl.bB();
        if (aK.lIlIIlIllIIllI(llllllllllllllllIIllIllIIlllIlII)) {
            return llIlIIlIlll[1];
        }
        Set<WorldPoint> llllllllllllllllIIllIllIIlllIIll = llllllllllllllllIIllIllIIlllIlIl.bF();
        Player llllllllllllllllIIllIllIIlllIIlI = Players.getLocal();
        if (aK.lIlIIlIllIIlll(llllllllllllllllIIllIllIIlllIlIl.cu.getTickCount(), llllllllllllllllIIllIllIIlllIlIl.eb)) {
            n2 = llIlIIlIlll[2];
            0;
            if ((0x43 ^ 0x47) <= 0) {
                return ((0x2F ^ 0x29) & ~(0x60 ^ 0x66)) != 0;
            }
        } else {
            n2 = llIlIIlIlll[1];
        }
        if (aK.lIlIIlIllIIIll(llllllllllllllllIIllIllIIlllIIIl = n2)) {
            WorldPoint llllllllllllllllIIllIllIIlllIIII = llllllllllllllllIIllIllIIlllIlII.getWorldArea().getCenter();
            WorldPoint llllllllllllllllIIllIllIIllIllll = llllllllllllllllIIllIllIIlllIIII.createWorldArea(llIlIIlIlll[2]).toWorldPointList().stream().filter(worldPoint2 -> {
                int n2;
                if (aK.lIlIIlIllIIlll(Math.abs(worldPoint2.getWorldX() - llllllllllllllllIIllIllIIlllIIII.getWorldX()), llIlIIlIlll[2]) && aK.lIlIIlIllIIlll(Math.abs(worldPoint2.getWorldY() - llllllllllllllllIIllIllIIlllIIII.getWorldY()), llIlIIlIlll[2])) {
                    n2 = llIlIIlIlll[2];
                    0;
                    if (2 >= 3) {
                        return ((91 + 203 - 135 + 69 ^ 167 + 62 - 90 + 53) & (0xC7 ^ 0xB4 ^ (0x5C ^ 0xB) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIlIIlIlll[1];
                }
                return n2 != 0;
            }).filter(Reachable::isWalkable).filter(worldPoint -> {
                boolean bl2;
                if (aK.lIlIIlIllIIlIl(llllllllllllllllIIllIllIIlllIIll.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIlIIlIlll[2];
                    0;
                    if (null != null) {
                        return ((0x93 ^ 0xAB ^ (0xD1 ^ 0xA1)) & (105 + 48 - 67 + 114 ^ 106 + 100 - 186 + 108 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIIlIlll[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)llllllllllllllllIIllIllIIlllIIlI))).orElse(null);
            if (aK.lIlIIlIllIIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            Movement.setDestination((WorldPoint)llllllllllllllllIIllIllIIllIllll);
            return llIlIIlIlll[2];
        }
        if (aK.lIlIIlIllIIlll(llllllllllllllllIIllIllIIlllIlII.getAnimation(), llIlIIlIlll[3]) && aK.lIlIIlIllIlIII(llllllllllllllllIIllIllIIlllIlIl.eb, llllllllllllllllIIllIllIIlllIlIl.cu.getTickCount()) && aK.lIlIIlIllIIlIl(llllllllllllllllIIllIllIIlllIlII.getWorldArea().contains((Locatable)llllllllllllllllIIllIllIIlllIIlI) ? 1 : 0)) {
            int n3;
            llllllllllllllllIIllIllIIlllIlIl.ed = llllllllllllllllIIllIllIIlllIlIl.cu.getTickCount();
            if (aK.lIlIIlIllIIlll(llllllllllllllllIIllIllIIlllIlIl.bA(), llIlIIlIlll[4])) {
                n3 = llIlIIlIlll[5];
                0;
                if (((0x60 ^ 0x39) & ~(0xC5 ^ 0x9C)) >= (0x59 ^ 0x5D)) {
                    return ((0x72 ^ 0x66) & ~(0x1D ^ 9)) != 0;
                }
            } else {
                n3 = llIlIIlIlll[6];
            }
            int llllllllllllllllIIllIllIIlllIIII = n3;
            llllllllllllllllIIllIllIIlllIlIl.eb = llllllllllllllllIIllIllIIlllIlIl.cu.getTickCount() + llllllllllllllllIIllIllIIlllIIII;
        }
        if (aK.lIlIIlIllIIlIl(llllllllllllllllIIllIllIIlllIlIl.cu.getTickCount() - llllllllllllllllIIllIllIIlllIlIl.ec) && aK.lIlIIlIllIlIIl(llllllllllllllllIIllIllIIlllIlIl.bA(), llIlIIlIlll[4])) {
            if (aK.lIlIIlIllIIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            WorldPoint llllllllllllllllIIllIllIIlllIIII = llllllllllllllllIIllIllIIlllIlIl.a(new Point(llIlIIlIlll[7], llIlIIlIlll[8]));
            WorldPoint llllllllllllllllIIllIllIIllIllll = llllllllllllllllIIllIllIIlllIlIl.a(new Point(llIlIIlIlll[7], llIlIIlIlll[9]));
            WorldPoint llllllllllllllllIIllIllIIllIlllI = llllllllllllllllIIllIllIIlllIIlI.getWorldLocation();
            if (aK.lIlIIlIllIlIlI(aK.lIlIIlIllIIlII(llllllllllllllllIIllIllIIlllIIII.distanceTo2DHypotenuse(llllllllllllllllIIllIllIIllIlllI), llllllllllllllllIIllIllIIllIllll.distanceTo2DHypotenuse(llllllllllllllllIIllIllIIllIlllI)))) {
                llllllllllllllllIIllIllIIlllIIII = llllllllllllllllIIllIllIIllIllll;
            }
            if (aK.lIlIIlIllIIIll(llllllllllllllllIIllIllIIlllIIll.contains(llllllllllllllllIIllIllIIlllIIII) ? 1 : 0)) {
                return llIlIIlIlll[2];
            }
            Movement.setDestination((WorldPoint)llllllllllllllllIIllIllIIlllIIII);
            return llIlIIlIlll[2];
        }
        if (aK.lIlIIlIllIlIll(llllllllllllllllIIllIllIIlllIIlI.getInteracting(), llllllllllllllllIIllIllIIlllIlII)) {
            return llIlIIlIlll[2];
        }
        llllllllllllllllIIllIllIIlllIlIl.bp();
        if (aK.lIlIIlIllIIIll(llllllllllllllllIIllIllIIlllIlII.getWorldArea().contains((Locatable)llllllllllllllllIIllIllIIlllIIlI) ? 1 : 0) && aK.lIlIIlIllIIIll(Movement.isRunEnabled() ? 1 : 0) && aK.lIlIIlIllIlIIl(llllllllllllllllIIllIllIIlllIlII.getId(), llIlIIlIlll[10])) {
            Movement.toggleRun();
            llllllllllllllllIIllIllIIlllIlIl.ec = llllllllllllllllIIllIllIIlllIlIl.cu.getTickCount() + llIlIIlIlll[4];
            llllllllllllllllIIllIllIIlllIlII.interact(llIlIIlIllI[llIlIIlIlll[2]]);
        }
        if (aK.lIlIIlIllIllII(llllllllllllllllIIllIllIIlllIlIl.cu.getTickCount() - llllllllllllllllIIllIllIIlllIlIl.ec, llIlIIlIlll[11])) {
            llllllllllllllllIIllIllIIlllIlII.interact(llIlIIlIllI[llIlIIlIlll[5]]);
        }
        return llIlIIlIlll[2];
    }

    private static void lIlIIlIllIIIIl() {
        llIlIIlIllI = new String[llIlIIlIlll[4]];
        aK.llIlIIlIllI[aK.llIlIIlIlll[1]] = aK."You have died";
        aK.llIlIIlIllI[aK.llIlIIlIlll[2]] = aK."Attack";
        aK.llIlIIlIllI[aK.llIlIIlIlll[5]] = aK."Attack";
    }

    @Subscribe
    public void a(ActorDeath actorDeath) {
        if (aK.lIlIIlIllIlIll(actorDeath.getActor(), Players.getLocal())) {
            this.r();
        }
    }

    /*
     * WARNING - void declaration
     */
    private Set<WorldPoint> bF() {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        Iterator llllllllllllllllIIllIllIIllIIlll = this.cu.getGraphicsObjects().iterator();
        while (aK.lIlIIlIllIIIll(llllllllllllllllIIllIllIIllIIlll.hasNext() ? 1 : 0)) {
            aK llllllllllllllllIIllIllIIllIlIIl;
            void llllllllllllllllIIllIllIIllIlIII;
            GraphicsObject llllllllllllllllIIllIllIIllIIllI = (GraphicsObject)llllllllllllllllIIllIllIIllIIlll.next();
            if (aK.lIlIIlIllIlIIl(llllllllllllllllIIllIllIIllIIllI.getId(), llIlIIlIlll[12])) {
                0;
                if (((94 + 135 - 154 + 156 ^ 30 + 4 - -123 + 23) & (139 + 209 - 258 + 149 ^ 136 + 18 - 35 + 69 ^ -1)) == 0) continue;
                return null;
            }
            llllllllllllllllIIllIllIIllIlIII.add(WorldPoint.fromLocal((Client)llllllllllllllllIIllIllIIllIlIIl.cu, (LocalPoint)llllllllllllllllIIllIllIIllIIllI.getLocation()));
            0;
            0;
            if (((0x50 ^ 0xB ^ (0x2D ^ 0x73)) & (0xF7 ^ 0x9F ^ (0xA9 ^ 0xC4) ^ -1)) == 0) continue;
            return null;
        }
        return hashSet;
    }
}

