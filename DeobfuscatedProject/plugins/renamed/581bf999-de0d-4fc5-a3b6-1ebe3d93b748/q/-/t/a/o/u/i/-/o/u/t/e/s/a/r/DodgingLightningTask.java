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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.AttackingFinalWardenTask;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bM_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.i_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Dodging lightning -> DodginglightningTask */
@TaskDesc(name="Dodging lightning", priority=50, blocking=true, register=true)
public class DodgingLightningTask
extends bM_Unknown {
    private /* synthetic */ int gC;
    @Inject
    private /* synthetic */ bL gB;
    private static /* synthetic */ String[] llIIllIIlll;
    private static final /* synthetic */ int gy;
    private static final /* synthetic */ int gv;
    private final /* synthetic */ Map<GraphicsObject, Integer> gA;
    @Inject
    private /* synthetic */ i i;
    private static /* synthetic */ int[] llIIllIlIII;
    private static final /* synthetic */ int gz;
    private static final /* synthetic */ Point gw;
    private static final /* synthetic */ int gx;

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

    private static String lIlIIIlIIllllI(String var14, String var10) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var5 = var10.toCharArray();
        int var3 = llIIllIlIII[0];
        char[] var22 = var14.toCharArray();
        int var13 = var22.length;
        int var8 = llIIllIlIII[0];
        while (bJ.lIlIIIlIlIIlll(var8, var13)) {
            char var6 = var22[var8];
            var25.append((char)(var6 ^ var5[var3 % var5.length]));
            0;
            ++var3;
            ++var8;
            0;
            
            return null;
        }
        return String.valueOf(var25);
    }

    private static boolean lIlIIIlIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIIIlIlIIIIl() {
        llIIllIIlll = new String[llIIllIlIII[13]];
        bJ.llIIllIIlll[bJ.llIIllIlIII[0]] = bJ."Not on an unsafe enough tile to have to move";
        bJ.llIIllIIlll[bJ.llIIllIlIII[6]] = bJ."Not on a super unsafe tile and no good tile to move to";
        bJ.llIIllIIlll[bJ.llIIllIlIII[5]] = bJ."No decent worldpoint found and we are super unsafe, finding ok tile";
        bJ.llIIllIIlll[bJ.llIIllIlIII[7]] = bJ."Tanking some damage, unavoidable";
        bJ.llIIllIIlll[bJ.llIIllIlIII[3]] = bJ."Staying where we are as it is the safest spot currently";
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
            0;
            return;
        }
        this.gA.put(graphicsObject, this.cu.getTickCount() + llIIllIlIII[8]);
        0;
    }

    private int a(Map<WorldPoint, GraphicsObject> map, WorldPoint worldPoint) {
        int n2 = worldPoint.equals((Object)Players.getLocal().getWorldLocation());
        int n3 = this.b(map, worldPoint);
        if (bJ.lIlIIIlIlIIIll(n2) && bJ.lIlIIIlIlIlIlI(n3, llIIllIlIII[9])) {
            return llIIllIlIII[10];
        }
        return n3;
    }

    private static String lIlIIIlIIlllll(String var1, String var15) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llIIllIlIII[14]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llIIllIlIII[5], var16);
            return new String(var4.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected bJ(Client client, z z2, TOAConfig tOAConfig) {
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
        WorldPoint var17;
        Object var23;
        bJ var26;
        if (bJ.lIlIIIlIlIIIll(this.cq() ? 1 : 0)) {
            return llIIllIlIII[0];
        }
        HashSet<WorldPoint> var19 = new HashSet<WorldPoint>();
        HashSet<WorldPoint> var7 = new HashSet<WorldPoint>();
        HashMap<WorldPoint, GraphicsObject> var2 = new HashMap<WorldPoint, GraphicsObject>();
        Iterator var21 = var26.cu.getGraphicsObjects().iterator();
        while (bJ.lIlIIIlIlIIlII(var21.hasNext() ? 1 : 0)) {
            var23 = (GraphicsObject)var21.next();
            var17 = WorldPoint.fromLocal((Client)var26.cu, (LocalPoint)var23.getLocation());
            if (bJ.lIlIIIlIlIIlIl(var23.getId(), llIIllIlIII[1])) {
                var7.add(var17);
                0;
                0;
                if (2 != 3) continue;
                return false;
            }
            if (bJ.lIlIIIlIlIIlIl(var23.getId(), llIIllIlIII[2]) && bJ.lIlIIIlIlIIllI(var23.getFrame(), llIIllIlIII[3])) {
                var19.add(var17);
                0;
            }
            if (bJ.lIlIIIlIlIIlIl(var23.getId(), llIIllIlIII[2])) {
                0;
                if (-1 < 3) continue;
                return ((132 + 185 - 265 + 138 ^ 168 + 174 - 310 + 155) & (0xA8 ^ 0x94 ^ (0x56 ^ 0x6F) ^ -1)) != 0;
            }
            if (bJ.lIlIIIlIlIIlll(var23.getFrame(), llIIllIlIII[4])) {
                var2.put(var17, (GraphicsObject)var23);
                0;
            }
            0;
            if (1 != ((0xC7 ^ 0x83) & ~(0x22 ^ 0x66))) continue;
            return false;
        }
        var21 = Players.getLocal().getWorldLocation();
        var23 = Comparator.comparingDouble(object -> this.a((Map<WorldPoint, GraphicsObject>)var2, (WorldPoint)object)).thenComparingDouble(object -> ((WorldPoint)object).distanceToHypotenuse(this.co().getWorldArea().getCenter()));
        var17 = var21.createWorldArea(llIIllIlIII[5]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bJ.lIlIIIlIlIIIll(var19.contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIllIlIII[6];
                0;
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
                0;
                if (1 <= 0) {
                    return ((0x4E ^ 0x71 ^ (0x6A ^ 0x1F)) & (0xF3 ^ 0x96 ^ (0x84 ^ 0xAB) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIlIII[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min((Comparator<WorldPoint>)var23).orElse(null);
        int var20 = var26.a(var2, (WorldPoint)var21);
        if (bJ.lIlIIIlIlIIIll(var19.contains(var21) ? 1 : 0) && bJ.lIlIIIlIlIlIII(var20, llIIllIlIII[3])) {
            Log.info((String)llIIllIIlll[llIIllIlIII[0]]);
            return llIIllIlIII[0];
        }
        if (bJ.lIlIIIlIlIlIIl(var17)) {
            if (bJ.lIlIIIlIlIIIll(var19.contains(var21) ? 1 : 0)) {
                Log.info((String)llIIllIIlll[llIIllIlIII[6]]);
                return llIIllIlIII[0];
            }
            Log.info((String)llIIllIIlll[llIIllIlIII[5]]);
            var17 = var21.createWorldArea(llIIllIlIII[5]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl2;
                if (bJ.lIlIIIlIlIIIll(worldPoint.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    bl2 = llIIllIlIII[6];
                    0;
                    if (-3 > 0) {
                        return false;
                    }
                } else {
                    bl2 = llIIllIlIII[0];
                }
                return bl2;
            }).filter(worldPoint -> {
                boolean bl2;
                if (bJ.lIlIIIlIlIIIll(var19.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIIllIlIII[6];
                    0;
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
                    0;
                    if (2 < -1) {
                        return ((0xAB ^ 0xC1 ^ (0xC ^ 0x70)) & (0x80 ^ 0xC6 ^ (0x79 ^ 0x29) ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIllIlIII[0];
                }
                return bl2;
            }).filter(Reachable::isWalkable).min((Comparator<WorldPoint>)var23).orElse(null);
            if (bJ.lIlIIIlIlIlIIl(var17)) {
                Log.info((String)llIIllIIlll[llIIllIlIII[7]]);
                return llIIllIlIII[0];
            }
        }
        if (bJ.lIlIIIlIlIIlII(var17.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            boolean bl2;
            Log.info((String)llIIllIIlll[llIIllIlIII[3]]);
            if (bJ.lIlIIIlIlIIllI(var20, llIIllIlIII[8])) {
                bl2 = llIIllIlIII[6];
                0;
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

    private static void lIlIIIlIlIIIlI() {
        llIIllIlIII = new int[15];
        bJ.llIIllIlIII[0] = (0x40 ^ 0x13) & ~(0xD8 ^ 0x8B);
        bJ.llIIllIlIII[1] = 0xFFFFCDB7 & 0x3ADD;
        bJ.llIIllIlIII[2] = -(0xFFFFCB4D & 0x77B3) & (0xFFFFCBFF & 0x7FCB);
        bJ.llIIllIlIII[3] = 0xCD ^ 0x9F ^ (0x3E ^ 0x68);
        bJ.llIIllIlIII[4] = 7 ^ 0xA;
        bJ.llIIllIlIII[5] = 2;
        bJ.llIIllIlIII[6] = 1;
        bJ.llIIllIlIII[7] = 3;
        bJ.llIIllIlIII[8] = 0xB6 ^ 0xB0;
        bJ.llIIllIlIII[9] = 0x80 ^ 0x8A;
        bJ.llIIllIlIII[10] = -1;
        bJ.llIIllIlIII[11] = 0x1C ^ 0x61 ^ (0xCC ^ 0xAE);
        bJ.llIIllIlIII[12] = 0x7C ^ 0x59;
        bJ.llIIllIlIII[13] = 0xA8 ^ 0xAD;
        bJ.llIIllIlIII[14] = 0xB ^ 0x67 ^ (0x11 ^ 0x75);
    }

    private static String lIlIIIlIlIIIII(String var24, String var12) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(llIIllIlIII[5], var9);
            return new String(var11.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
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
            0;
            if (-(0xC5 ^ 0xC1) >= 0) {
                return false;
            }
        } else {
            bl2 = llIIllIlIII[0];
        }
        return bl2;
    }
}

