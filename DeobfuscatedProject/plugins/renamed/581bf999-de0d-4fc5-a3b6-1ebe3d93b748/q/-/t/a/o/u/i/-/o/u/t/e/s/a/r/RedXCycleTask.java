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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Red X Cycle -> RedxcycleTask */
@TaskDesc(name="Red X Cycle", priority=50, register=true)
public class RedXCycleTask
extends aI_Unknown {
    private /* synthetic */ int eb;
    private static /* synthetic */ int[] llIlIIlIlll;
    private static /* synthetic */ String[] llIlIIlIllI;
    private /* synthetic */ int ed;
    private /* synthetic */ int ec;

    private static boolean lIlIIlIllIIllI(Object object) {
        return object == null;
    }

    private static String lIlIIlIlIlllll(String var2, String var12) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llIlIIlIlll[15]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(llIlIIlIlll[5], var17);
            return new String(var22.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
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
        WorldPoint var25;
        aK var16;
        void var7;
        if (aK.lIlIIlIllIllII(this.eb, this.cu.getTickCount())) {
            return;
        }
        if (aK.lIlIIlIllIIlll(var7.getGraphicsObject().getId(), llIlIIlIlll[13])) {
            var16.eb = var16.cu.getTickCount() + llIlIIlIlll[2];
        }
        if (aK.lIlIIlIllIIlll(var7.getGraphicsObject().getId(), llIlIIlIlll[14]) && aK.lIlIIlIllIIIll((var25 = WorldPoint.fromLocal((Client)var16.cu, (LocalPoint)var7.getGraphicsObject().getLocation())).equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var16.eb = var16.cu.getTickCount() + llIlIIlIlll[2];
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

    private static String lIlIIlIllIIIII(String var1, String var23) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llIlIIlIlll[5], var11);
            return new String(var14.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
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
        int var4;
        int n2;
        aK var5;
        if (aK.lIlIIlIllIIlIl(this.cW.redX() ? 1 : 0)) {
            return llIlIIlIlll[1];
        }
        NPC var6 = var5.bB();
        if (aK.lIlIIlIllIIllI(var6)) {
            return llIlIIlIlll[1];
        }
        Set<WorldPoint> var24 = var5.bF();
        Player var10 = Players.getLocal();
        if (aK.lIlIIlIllIIlll(var5.cu.getTickCount(), var5.eb)) {
            n2 = llIlIIlIlll[2];
            0;
            if ((0x43 ^ 0x47) <= 0) {
                return false;
            }
        } else {
            n2 = llIlIIlIlll[1];
        }
        if (aK.lIlIIlIllIIIll(var4 = n2)) {
            WorldPoint var21 = var6.getWorldArea().getCenter();
            WorldPoint var9 = var21.createWorldArea(llIlIIlIlll[2]).toWorldPointList().stream().filter(worldPoint2 -> {
                int n2;
                if (aK.lIlIIlIllIIlll(Math.abs(worldPoint2.getWorldX() - var21.getWorldX()), llIlIIlIlll[2]) && aK.lIlIIlIllIIlll(Math.abs(worldPoint2.getWorldY() - var21.getWorldY()), llIlIIlIlll[2])) {
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
                if (aK.lIlIIlIllIIlIl(var24.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIlIIlIlll[2];
                    0;
                    
                    }
                } else {
                    bl2 = llIlIIlIlll[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)var10))).orElse(null);
            if (aK.lIlIIlIllIIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            Movement.setDestination((WorldPoint)var9);
            return llIlIIlIlll[2];
        }
        if (aK.lIlIIlIllIIlll(var6.getAnimation(), llIlIIlIlll[3]) && aK.lIlIIlIllIlIII(var5.eb, var5.cu.getTickCount()) && aK.lIlIIlIllIIlIl(var6.getWorldArea().contains((Locatable)var10) ? 1 : 0)) {
            int n3;
            var5.ed = var5.cu.getTickCount();
            if (aK.lIlIIlIllIIlll(var5.bA(), llIlIIlIlll[4])) {
                n3 = llIlIIlIlll[5];
                0;
                if (((0x60 ^ 0x39) & ~(0xC5 ^ 0x9C)) >= (0x59 ^ 0x5D)) {
                    return false;
                }
            } else {
                n3 = llIlIIlIlll[6];
            }
            int var21 = n3;
            var5.eb = var5.cu.getTickCount() + var21;
        }
        if (aK.lIlIIlIllIIlIl(var5.cu.getTickCount() - var5.ec) && aK.lIlIIlIllIlIIl(var5.bA(), llIlIIlIlll[4])) {
            if (aK.lIlIIlIllIIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            WorldPoint var21 = var5.a(new Point(llIlIIlIlll[7], llIlIIlIlll[8]));
            WorldPoint var9 = var5.a(new Point(llIlIIlIlll[7], llIlIIlIlll[9]));
            WorldPoint var18 = var10.getWorldLocation();
            if (aK.lIlIIlIllIlIlI(aK.lIlIIlIllIIlII(var21.distanceTo2DHypotenuse(var18), var9.distanceTo2DHypotenuse(var18)))) {
                var21 = var9;
            }
            if (aK.lIlIIlIllIIIll(var24.contains(var21) ? 1 : 0)) {
                return llIlIIlIlll[2];
            }
            Movement.setDestination((WorldPoint)var21);
            return llIlIIlIlll[2];
        }
        if (aK.lIlIIlIllIlIll(var10.getInteracting(), var6)) {
            return llIlIIlIlll[2];
        }
        var5.bp();
        if (aK.lIlIIlIllIIIll(var6.getWorldArea().contains((Locatable)var10) ? 1 : 0) && aK.lIlIIlIllIIIll(Movement.isRunEnabled() ? 1 : 0) && aK.lIlIIlIllIlIIl(var6.getId(), llIlIIlIlll[10])) {
            Movement.toggleRun();
            var5.ec = var5.cu.getTickCount() + llIlIIlIlll[4];
            var6.interact(llIlIIlIllI[llIlIIlIlll[2]]);
        }
        if (aK.lIlIIlIllIllII(var5.cu.getTickCount() - var5.ec, llIlIIlIlll[11])) {
            var6.interact(llIlIIlIllI[llIlIIlIlll[5]]);
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
        Iterator var20 = this.cu.getGraphicsObjects().iterator();
        while (aK.lIlIIlIllIIIll(var20.hasNext() ? 1 : 0)) {
            aK var13;
            void var15;
            GraphicsObject var8 = (GraphicsObject)var20.next();
            if (aK.lIlIIlIllIlIIl(var8.getId(), llIlIIlIlll[12])) {
                0;
                if (((94 + 135 - 154 + 156 ^ 30 + 4 - -123 + 23) & (139 + 209 - 258 + 149 ^ 136 + 18 - 35 + 69 ^ -1)) == 0) continue;
                return null;
            }
            var15.add(WorldPoint.fromLocal((Client)var13.cu, (LocalPoint)var8.getLocation()));
            0;
            0;
            if (((0x50 ^ 0xB ^ (0x2D ^ 0x73)) & (0xF7 ^ 0x9F ^ (0xA9 ^ 0xC4) ^ -1)) == 0) continue;
            return null;
        }
        return hashSet;
    }
}

