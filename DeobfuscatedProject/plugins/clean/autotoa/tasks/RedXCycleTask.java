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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Red X Cycle", priority=50, register=true)
public class RedXCycleTask
extends AutotoaTaskBase {
    private  int eb;

    private  int ed;
    private  int ec;

    private static boolean lIlIIlIllIIllI(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIllIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        WorldPoint var1;
        aK var2;
        void var3;
        if (aK.lIlIIlIllIllII(this.eb, this.cu.getTickCount())) {
            return;
        }
        if (aK.lIlIIlIllIIlll(var3.getGraphicsObject().getId(), llIlIIlIlll[13])) {
            var2.eb = var2.cu.getTickCount() + llIlIIlIlll[2];
        }
        if (aK.lIlIIlIllIIlll(var3.getGraphicsObject().getId(), llIlIIlIlll[14]) && aK.lIlIIlIllIIIll((var1 = WorldPoint.fromLocal((Client)var2.cu, (LocalPoint)var3.getGraphicsObject().getLocation())).equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var2.eb = var2.cu.getTickCount() + llIlIIlIlll[2];
        }
    }

    @Inject
    protected RedXCycleTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
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
        Set<WorldPoint> var7 = var5.bF();
        Player var8 = Players.getLocal();
        if (aK.lIlIIlIllIIlll(var5.cu.getTickCount(), var5.eb)) {
            n2 = llIlIIlIlll[2];

            if ((0x43 ^ 0x47) <= 0) {
                return false;
            }
        } else {
            n2 = llIlIIlIlll[1];
        }
        if (aK.lIlIIlIllIIIll(var4 = n2)) {
            WorldPoint var9 = var6.getWorldArea().getCenter();
            WorldPoint var10 = var9.createWorldArea(llIlIIlIlll[2]).toWorldPointList().stream().filter(worldPoint2 -> {
                int n2;
                if (aK.lIlIIlIllIIlll(Math.abs(worldPoint2.getWorldX() - var9.getWorldX()), llIlIIlIlll[2]) && aK.lIlIIlIllIIlll(Math.abs(worldPoint2.getWorldY() - var9.getWorldY()), llIlIIlIlll[2])) {
                    n2 = llIlIIlIlll[2];

                    if (2 >= 3) {
                        return ((91 + 203 - 135 + 69 ^ 167 + 62 - 90 + 53) & (0xC7 ^ 0xB4 ^ (0x5C ^ 0xB) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIlIIlIlll[1];
                }
                return n2 != 0;
            }).filter(Reachable::isWalkable).filter(worldPoint -> {
                boolean bl2;
                if (aK.lIlIIlIllIIlIl(var7.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIlIIlIlll[2];

                    }
                } else {
                    bl2 = llIlIIlIlll[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)var8))).orElse(null);
            if (aK.lIlIIlIllIIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            Movement.setDestination((WorldPoint)var10);
            return llIlIIlIlll[2];
        }
        if (aK.lIlIIlIllIIlll(var6.getAnimation(), llIlIIlIlll[3]) && aK.lIlIIlIllIlIII(var5.eb, var5.cu.getTickCount()) && aK.lIlIIlIllIIlIl(var6.getWorldArea().contains((Locatable)var8) ? 1 : 0)) {
            int n3;
            var5.ed = var5.cu.getTickCount();
            if (aK.lIlIIlIllIIlll(var5.bA(), llIlIIlIlll[4])) {
                n3 = llIlIIlIlll[5];

                if (((0x60 ^ 0x39) & ~(0xC5 ^ 0x9C)) >= (0x59 ^ 0x5D)) {
                    return false;
                }
            } else {
                n3 = llIlIIlIlll[6];
            }
            int var9 = n3;
            var5.eb = var5.cu.getTickCount() + var9;
        }
        if (aK.lIlIIlIllIIlIl(var5.cu.getTickCount() - var5.ec) && aK.lIlIIlIllIlIIl(var5.bA(), llIlIIlIlll[4])) {
            if (aK.lIlIIlIllIIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            WorldPoint var9 = var5.a(new Point(llIlIIlIlll[7], llIlIIlIlll[8]));
            WorldPoint var10 = var5.a(new Point(llIlIIlIlll[7], llIlIIlIlll[9]));
            WorldPoint var11 = var8.getWorldLocation();
            if (aK.lIlIIlIllIlIlI(aK.lIlIIlIllIIlII(var9.distanceTo2DHypotenuse(var11), var10.distanceTo2DHypotenuse(var11)))) {
                var9 = var10;
            }
            if (aK.lIlIIlIllIIIll(var7.contains(var9) ? 1 : 0)) {
                return llIlIIlIlll[2];
            }
            Movement.setDestination((WorldPoint)var9);
            return llIlIIlIlll[2];
        }
        if (aK.lIlIIlIllIlIll(var8.getInteracting(), var6)) {
            return llIlIIlIlll[2];
        }
        var5.bp();
        if (aK.lIlIIlIllIIIll(var6.getWorldArea().contains((Locatable)var8) ? 1 : 0) && aK.lIlIIlIllIIIll(Movement.isRunEnabled() ? 1 : 0) && aK.lIlIIlIllIlIIl(var6.getId(), llIlIIlIlll[10])) {
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
        aK.llIlIIlIllI[aK.llIlIIlIlll[1]] = "You have died";
        aK.llIlIIlIllI[aK.llIlIIlIlll[2]] = "Attack";
        aK.llIlIIlIllI[aK.llIlIIlIlll[5]] = "Attack";
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
        Iterator var12 = this.cu.getGraphicsObjects().iterator();
        while (aK.lIlIIlIllIIIll(var12.hasNext() ? 1 : 0)) {
            aK var13;
            void var14;
            GraphicsObject var15 = (GraphicsObject)var12.next();
            if (aK.lIlIIlIllIlIIl(var15.getId(), llIlIIlIlll[12])) {

                if (((94 + 135 - 154 + 156 ^ 30 + 4 - -123 + 23) & (139 + 209 - 258 + 149 ^ 136 + 18 - 35 + 69 ^ -1)) == 0) continue;
                return null;
            }
            var14.add(WorldPoint.fromLocal((Client)var13.cu, (LocalPoint)var15.getLocation()));

            if (((0x50 ^ 0xB ^ (0x2D ^ 0x73)) & (0xF7 ^ 0x9F ^ (0xA9 ^ 0xC4) ^ -1)) == 0) continue;
            return null;
        }
        return hashSet;
    }
}

