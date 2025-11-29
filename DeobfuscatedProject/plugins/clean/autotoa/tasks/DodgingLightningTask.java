/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
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
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AttackingFinalWardenTask;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging lightning", priority=50, blocking=true, register=true)
public class DodgingLightningTask
extends AutotoaTaskBase {
    private  int gC;
    @Inject
    private  bL gB;
    
    private static final  int gy;
    private static final  int gv;
    private final  Map<GraphicsObject, Integer> gA;
    @Inject
    private  i i;
    
    private static final  int gz;
    private static final  Point gw;
    private static final  int gx;

    static {
        bJ.lIlIIIlIlIIIlI();
        bJ.lIlIIIlIlIIIIl();
        gz = llIIllIlIII[3];
        gx = llIIllIlIII[1];
        gv = llIIllIlIII[2];
        gy = llIIllIlIII[4];
        gw = new Point(llIIllIlIII[11], llIIllIlIII[12]);
    }

    private static boolean lIlIIIlIlIlIII(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIIIlIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIIIlIlIIIIl() {
        llIIllIIlll = new String[llIIllIlIII[13]];
        bJ.llIIllIIlll[bJ.llIIllIlIII[0]] = "Not on an unsafe enough tile to have to move";
        bJ.llIIllIIlll[bJ.llIIllIlIII[6]] = "Not on a super unsafe tile and no good tile to move to";
        bJ.llIIllIIlll[bJ.llIIllIlIII[5]] = "No decent worldpoint found and we are super unsafe, finding ok tile";
        bJ.llIIllIIlll[bJ.llIIllIlIII[7]] = "Tanking some damage, unavoidable";
        bJ.llIIllIIlll[bJ.llIIllIlIII[3]] = "Staying where we are as it is the safest spot currently";
    }

    private int b(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        return Optional.ofNullable(map.get(worldPoint)).map(GraphicsObject::getFrame).orElse(llIIllIlIII[10]);
    }

    private static boolean lIlIIIlIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        if (bJ.lIlIIIlIlIIlIl(graphicsObject.getId(), llIIllIlIII[2])) {
            this.gA.put(graphicsObject, this.cu.getTickCount() + llIIllIlIII[7]);

            return;
        }
        this.gA.put(graphicsObject, this.cu.getTickCount() + llIIllIlIII[8]);

    }

    private int a(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        int n2 = worldPoint.equals((Object)Players.getLocal().getWorldLocation());
        int n3 = this.b(map, worldPoint);
        if (bJ.lIlIIIlIlIIIll(n2) && bJ.lIlIIIlIlIlIlI(n3, llIIllIlIII[9])) {
            return llIIllIlIII[10];
        }
        return n3;
    }

    private static boolean lIlIIIlIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected DodgingLightningTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.gA = new HashMap<GraphicsObject, Integer>();
    }

    private static boolean lIlIIIlIlIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlIlIIllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var6_6;
        WorldPoint var2;
        Object var3;
        bJ var4;
        if (bJ.lIlIIIlIlIIIll(this.cq() ? 1 : 0)) {
            return llIIllIlIII[0];
        }
        HashSet<WorldPoint> var5 = new HashSet<WorldPoint>();
        HashSet<WorldPoint> var6 = new HashSet<WorldPoint>();
        HashMap<WorldPoint, GraphicsObject> var7 = new HashMap<WorldPoint, GraphicsObject>();
        Iterator var8 = var4.cu.getGraphicsObjects().iterator();
        while (bJ.lIlIIIlIlIIlII(var8.hasNext() ? 1 : 0)) {
            var3 = (GraphicsObject)var8.next();
            var2 = WorldPoint.fromLocal((Client)var4.cu, (LocalPoint)var3.getLocation());
            if (bJ.lIlIIIlIlIIlIl(var3.getId(), llIIllIlIII[1])) {
                var6.add(var2);

                if (2 != 3) continue;
                return false;
            }
            if (bJ.lIlIIIlIlIIlIl(var3.getId(), llIIllIlIII[2]) && bJ.lIlIIIlIlIIllI(var3.getFrame(), llIIllIlIII[3])) {
                var5.add(var2);

            }
            if (bJ.lIlIIIlIlIIlIl(var3.getId(), llIIllIlIII[2])) {

                if (-1 < 3) continue;
                return ((132 + 185 - 265 + 138 ^ 168 + 174 - 310 + 155) & (0xA8 ^ 0x94 ^ (0x56 ^ 0x6F) ^ -1)) != 0;
            }
            if (bJ.lIlIIIlIlIIlll(var3.getFrame(), llIIllIlIII[4])) {
                var7.put(var2, (GraphicsObject)var3);

            }

            if (1 != ((0xC7 ^ 0x83) & ~(0x22 ^ 0x66))) continue;
            return false;
        }
        var8 = Players.getLocal().getWorldLocation();
        var3 = Comparator.comparingDouble(object -> this.a((Map<WorldPoint, GraphicsObject>)var7, (WorldPoint)object)).thenComparingDouble(object -> ((WorldPoint)object).distanceToHypotenuse(this.co().getWorldArea().getCenter()));
        var2 = var8.createWorldArea(llIIllIlIII[5]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bJ.lIlIIIlIlIIIll(var5.contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIllIlIII[6];

                if (2 < 0) {
                    return ((71 + 90 - 65 + 56 ^ 67 + 2 - 15 + 104) & (0x46 ^ 0x66 ^ (0x7D ^ 0x5B) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIlIII[0];
            }
            return bl2;
        }).filter(worldPoint -> {
            boolean bl2;
            if (bJ.lIlIIIlIlIIlIl(this.a(gw).getWorldY(), worldPoint.getWorldY())) {
                bl2 = llIIllIlIII[6];

                if (1 <= 0) {
                    return ((0x4E ^ 0x71 ^ (0x6A ^ 0x1F)) & (0xF3 ^ 0x96 ^ (0x84 ^ 0xAB) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIlIII[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min((Comparator<WorldPoint>)var3).orElse(null);
        int var9 = var4.a(var7, (WorldPoint)var8);
        if (bJ.lIlIIIlIlIIIll(var5.contains(var8) ? 1 : 0) && bJ.lIlIIIlIlIlIII(var9, llIIllIlIII[3])) {
            Log.info((String)llIIllIIlll[llIIllIlIII[0]]);
            return llIIllIlIII[0];
        }
        if (bJ.lIlIIIlIlIlIIl(var2)) {
            if (bJ.lIlIIIlIlIIIll(var5.contains(var8) ? 1 : 0)) {
                Log.info((String)llIIllIIlll[llIIllIlIII[6]]);
                return llIIllIlIII[0];
            }
            Log.info((String)llIIllIIlll[llIIllIlIII[5]]);
            var2 = var8.createWorldArea(llIIllIlIII[5]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl2;
                if (bJ.lIlIIIlIlIIIll(worldPoint.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    bl2 = llIIllIlIII[6];

                } else {
                    bl2 = llIIllIlIII[0];
                }
                return bl2;
            }).filter(worldPoint -> {
                boolean bl2;
                if (bJ.lIlIIIlIlIIIll(var5.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIIllIlIII[6];

                    if (((0xE ^ 5) & ~(0x3C ^ 0x37)) <= -1) {
                        return false;
                    }
                } else {
                    bl2 = llIIllIlIII[0];
                }
                return bl2;
            }).filter(worldPoint -> {
                boolean bl2;
                if (bJ.lIlIIIlIlIIlIl(this.a(gw).getWorldY(), worldPoint.getWorldY())) {
                    bl2 = llIIllIlIII[6];

                    if (2 < -1) {
                        return ((0xAB ^ 0xC1 ^ (0xC ^ 0x70)) & (0x80 ^ 0xC6 ^ (0x79 ^ 0x29) ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIllIlIII[0];
                }
                return bl2;
            }).filter(Reachable::isWalkable).min((Comparator<WorldPoint>)var3).orElse(null);
            if (bJ.lIlIIIlIlIlIIl(var2)) {
                Log.info((String)llIIllIIlll[llIIllIlIII[7]]);
                return llIIllIlIII[0];
            }
        }
        if (bJ.lIlIIIlIlIIlII(var2.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            boolean bl2;
            Log.info((String)llIIllIIlll[llIIllIlIII[3]]);
            if (bJ.lIlIIIlIlIIllI(var9, llIIllIlIII[8])) {
                bl2 = llIIllIlIII[6];

                if (2 == ((210 + 16 - 202 + 230 ^ 113 + 11 - 23 + 90) & (153 + 212 - 163 + 39 ^ 136 + 6 - 100 + 134 ^ -1))) {
                    return (1 & (1 ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIlIII[0];
            }
            return bl2;
        }
        Movement.setDestination((WorldPoint)var6_6);
        this.gC = this.cu.getTickCount();
        return llIIllIlIII[6];
    }

    private static boolean lIlIIIlIlIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIlIlIIl(Object object) {
        return object == null;
    }

    private boolean c(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        boolean bl2;
        if (bJ.lIlIIIlIlIIlll(this.a(map, worldPoint), llIIllIlIII[3])) {
            bl2 = llIIllIlIII[6];

            if (-(0xC5 ^ 0xC1) >= 0) {
                return false;
            }
        } else {
            bl2 = llIIllIlIII[0];
        }
        return bl2;
    }
}

