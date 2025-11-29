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
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Red X Cycle", priority=50, register=true)
public class RedXCycleTask
extends AutotoaManager {
    private  int eb;

    private  int ed;
    private  int ec;

    private static boolean var3(Object object) {
        return object == null;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        WorldPoint var11;
        aK var12;
        void var13;
        if (aK.var14(this.eb, this.cu.getTickCount())) {
            return;
        }
        if (aK.var15(var13.getGraphicsObject().getId(), var1[13])) {
            var12.eb = var12.cu.getTickCount() + var1[2];
        }
        if (aK.var15(var13.getGraphicsObject().getId(), var1[14]) && aK.var16((var11 = WorldPoint.fromLocal((Client)var12.cu, (LocalPoint)var13.getGraphicsObject().getLocation())).equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var12.eb = var12.cu.getTickCount() + var1[2];
        }
    }

    @Inject
    protected RedXCycleTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void var17() {
        var1 = new int[16];
        aK.var1[0] = -1;
        aK.var1[1] = (122 + 156 - 124 + 53 ^ 5 + 107 - 54 + 72) & (137 + 73 - 163 + 157 ^ 41 + 88 - 125 + 125 ^ -1);
        aK.var1[2] = 1;
        aK.var1[3] = -(0xFFFFFB75 & 0x14FB) & (0xFFFFF7FF & 0x3E7F);
        aK.var1[4] = 3;
        aK.var1[5] = 2;
        aK.var1[6] = 0x68 ^ 0x6C;
        aK.var1[7] = 0x48 ^ 0x5E;
        aK.var1[8] = 0x7D ^ 0x66 ^ (0x3F ^ 0);
        aK.var1[9] = 9 ^ 0xC ^ (0xB5 ^ 0xAC);
        aK.var1[10] = 0xFFFFAFFD & 0x7E06;
        aK.var1[11] = 0x40 ^ 4 ^ (0x5D ^ 0x1F);
        aK.var1[12] = 0xFFFFC9EA & 0x3EDF;
        aK.var1[13] = 0xFFFFD6CF & 0x2D7F;
        aK.var1[14] = 0xFFFFB7F9 & 0x4DAE;
        aK.var1[15] = 7 ^ 0xF;
    }

    private static boolean var14(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var18(int n2) {
        return n2 > 0;
    }

    private static boolean var15(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public void r() {
        this.eb = var1[0];
        this.ec = var1[0];
    }

    private static int var19(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (aK.var16(string.contains(var2[var1[1]]) ? 1 : 0)) {
            this.r();
        }
    }

    private static boolean var20(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var22(int n2) {
        return n2 == 0;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    static {
        aK.var17();
        aK.var29();
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bm() {
        this.r();
        return super.bm();
    }

    @Override
    public boolean bC() {
        int var30;
        int n2;
        aK var31;
        if (aK.var22(this.cW.redX() ? 1 : 0)) {
            return var1[1];
        }
        NPC var32 = var31.bB();
        if (aK.var3(var32)) {
            return var1[1];
        }
        Set<WorldPoint> var33 = var31.bF();
        Player var34 = Players.getLocal();
        if (aK.var15(var31.cu.getTickCount(), var31.eb)) {
            n2 = var1[2];
            0;
            if ((0x43 ^ 0x47) <= 0) {
                return ((0x2F ^ 0x29) & ~(0x60 ^ 0x66)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        if (aK.var16(var30 = n2)) {
            WorldPoint var35 = var32.getWorldArea().getCenter();
            WorldPoint var36 = var35.createWorldArea(var1[2]).toWorldPointList().stream().filter(worldPoint2 -> {
                int n2;
                if (aK.var15(Math.abs(worldPoint2.getWorldX() - var35.getWorldX()), var1[2]) && aK.var15(Math.abs(worldPoint2.getWorldY() - var35.getWorldY()), var1[2])) {
                    n2 = var1[2];
                    0;
                    if (2 >= 3) {
                        return ((91 + 203 - 135 + 69 ^ 167 + 62 - 90 + 53) & (0xC7 ^ 0xB4 ^ (0x5C ^ 0xB) ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[1];
                }
                return n2 != 0;
            }).filter(Reachable::isWalkable).filter(worldPoint -> {
                boolean bl2;
                if (aK.var22(var33.contains(worldPoint) ? 1 : 0)) {
                    bl2 = var1[2];
                    0;
                    if null != null {
                        return ((0x93 ^ 0xAB ^ (0xD1 ^ 0xA1)) & (105 + 48 - 67 + 114 ^ 106 + 100 - 186 + 108 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)var34))).orElse(null);
            if (aK.var22(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            Movement.setDestination((WorldPoint)var36);
            return var1[2];
        }
        if (aK.var15(var32.getAnimation(), var1[3]) && aK.var21(var31.eb, var31.cu.getTickCount()) && aK.var22(var32.getWorldArea().contains((Locatable)var34) ? 1 : 0)) {
            int n3;
            var31.ed = var31.cu.getTickCount();
            if (aK.var15(var31.bA(), var1[4])) {
                n3 = var1[5];
                0;
                if (((0x60 ^ 0x39) & ~(0xC5 ^ 0x9C)) >= (0x59 ^ 0x5D)) {
                    return ((0x72 ^ 0x66) & ~(0x1D ^ 9)) != 0;
                }
            } else {
                n3 = var1[6];
            }
            int var35 = n3;
            var31.eb = var31.cu.getTickCount() + var35;
        }
        if (aK.var22(var31.cu.getTickCount() - var31.ec) && aK.var10(var31.bA(), var1[4])) {
            if (aK.var22(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            WorldPoint var35 = var31.a(new Point(var1[7], var1[8]));
            WorldPoint var36 = var31.a(new Point(var1[7], var1[9]));
            WorldPoint var37 = var34.getWorldLocation();
            if (aK.var18(aK.var19(var35.distanceTo2DHypotenuse(var37), var36.distanceTo2DHypotenuse(var37)))) {
                var35 = var36;
            }
            if (aK.var16(var33.contains(var35) ? 1 : 0)) {
                return var1[2];
            }
            Movement.setDestination((WorldPoint)var35);
            return var1[2];
        }
        if (aK.var20(var34.getInteracting(), var32)) {
            return var1[2];
        }
        var31.bp();
        if (aK.var16(var32.getWorldArea().contains((Locatable)var34) ? 1 : 0) && aK.var16(Movement.isRunEnabled() ? 1 : 0) && aK.var10(var32.getId(), var1[10])) {
            Movement.toggleRun();
            var31.ec = var31.cu.getTickCount() + var1[4];
            var32.interact(var2[var1[2]]);
        }
        if (aK.var14(var31.cu.getTickCount() - var31.ec, var1[11])) {
            var32.interact(var2[var1[5]]);
        }
        return var1[2];
    }

    private static void var29() {
        var2 = new String[var1[4]];
        aK.var2[aK.var1[1]] = "You have died";
        aK.var2[aK.var1[2]] = "Attack";
        aK.var2[aK.var1[5]] = "Attack";
    }

    @Subscribe
    public void a(ActorDeath actorDeath) {
        if (aK.var20(actorDeath.getActor(), Players.getLocal())) {
            this.r();
        }
    }

    /*
     * WARNING - void declaration
     */
    private Set<WorldPoint> bF() {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        Iterator var38 = this.cu.getGraphicsObjects().iterator();
        while (aK.var16(var38.hasNext() ? 1 : 0)) {
            aK var39;
            void var40;
            GraphicsObject var41 = (GraphicsObject)var38.next();
            if (aK.var10(var41.getId(), var1[12])) {
                0;
                if (((94 + 135 - 154 + 156 ^ 30 + 4 - -123 + 23) & (139 + 209 - 258 + 149 ^ 136 + 18 - 35 + 69 ^ -1)) == 0) continue;
                return null;
            }
            var40.add(WorldPoint.fromLocal((Client)var39.cu, (LocalPoint)var41.getLocation()));
            0;
            0;
            if (((0x50 ^ 0xB ^ (0x2D ^ 0x73)) & (0xF7 ^ 0x9F ^ (0xA9 ^ 0xC4) ^ -1)) == 0) continue;
            return null;
        }
        return hashSet;
    }
}

