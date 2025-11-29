/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.UnmodifiableIterator
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.A;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.au;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.av;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

/* TASK: Avoiding Nightmares Charge -> AvoidingnightmareschargeTask */
@TaskDesc(name="Avoiding Nightmares Charge", priority=2147483546, blocking=true)
public class at
extends A {
    private static final /* synthetic */ Logger eq;
    private static /* synthetic */ String[] llllIllIIlIl;
    private static /* synthetic */ int[] llllIllIlIlI;

    private static String lIIlIIIlIlllIIl(String var41, String var46) {
        try {
            SecretKeySpec var38 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var46.getBytes(StandardCharsets.UTF_8)), llllIllIlIlI[23]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(llllIllIlIlI[19], var38);
            return new String(var20.doFinal(Base64.getDecoder().decode(var41.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIllIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIlIIIlIllIlll(String var9, String var6) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(llllIllIlIlI[19], var7);
            return new String(var21.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cF() {
        void var4_4;
        at var28;
        if (at.lIIlIIIllIIllIl(this.cM.aj())) {
            return null;
        }
        WorldArea var30 = var28.aj();
        int var23 = var30.getWidth();
        int var3 = var30.getHeight();
        WorldArea var5 = null;
        eq.debug(llllIllIIlIl[llllIllIlIlI[17]], (Object)var23, (Object)var3);
        av var33 = var28.cE();
        if (at.lIIlIIIllIIllIl((Object)var33)) {
            return null;
        }
        switch (au.er[var33.ordinal()]) {
            case 1: {
                int var42 = -(var30.getHeight() - llllIllIlIlI[17]);
                var5 = var28.cS.getWorldArea().dy(var42);
                0;
                if (3 != 1) break;
                return null;
            }
            case 2: {
                int var49 = var30.getHeight() - llllIllIlIlI[17];
                var5 = var28.cS.getWorldArea().dy(var49);
                0;
                if (1 < 3) break;
                return null;
            }
            case 3: {
                int var12 = -(var30.getWidth() - llllIllIlIlI[17]);
                var5 = var28.cS.getWorldArea().dx(var12);
                0;
                if (-1 <= 0) break;
                return null;
            }
            case 4: {
                int var47 = var30.getWidth() - llllIllIlIlI[17];
                var5 = var28.cS.getWorldArea().dx(var47);
            }
        }
        this.cM.aj = var4_4;
        return var4_4.getMeleeTiles(this.cL).stream().filter(worldPoint -> {
            boolean bl;
            if (at.lIIlIIIllIIllII(this.cM.aj().contains(worldPoint) ? 1 : 0)) {
                bl = llllIllIlIlI[16];
                0;
                
                }
            } else {
                bl = llllIllIlIlI[4];
            }
            return bl;
        }).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var34;
        void var29;
        ImmutableSet immutableSet = ImmutableSet.of((Object)WorldPoint.fromLocalInstance((Client)this.cL, (LocalPoint)new LocalPoint(llllIllIlIlI[1], llllIllIlIlI[9])), (Object)WorldPoint.fromLocalInstance((Client)this.cL, (LocalPoint)new LocalPoint(llllIllIlIlI[2], llllIllIlIlI[9])));
        int n2 = llllIllIlIlI[15];
        NPC nPC = SquireNightmarePlugin.d();
        int n3 = nPC.getAnimation();
        RectangularArea rectangularArea = e.ay();
        if (at.lIIlIIIllIIlIll(rectangularArea)) {
            this.cM.k(llllIllIlIlI[4]);
            this.cM.aj = null;
            this.cM.b((WorldArea)null);
            return llllIllIlIlI[4];
        }
        if (at.lIIlIIIllIIlIIl((int)var29, (int)var34)) {
            void var50;
            void var19;
            WorldArea[] worldAreaArray = new WorldArea[llllIllIlIlI[16]];
            worldAreaArray[at.llllIllIlIlI[4]] = var19.getWorldArea();
            if (at.lIIlIIIllIIllII(SquireNightmarePlugin.e().isInArea(worldAreaArray) ? 1 : 0) && at.lIIlIIIllIIllII(var50.contains((Object)SquireNightmarePlugin.e()) ? 1 : 0) && at.lIIlIIIllIIllII(var50.contains((Object)var19.getWorldArea().getCenter()) ? 1 : 0) && at.lIIlIIIllIIllII(var50.contains((Object)var19.getWorldLocation()) ? 1 : 0)) {
                at var37;
                WorldPoint var26;
                UnmodifiableIterator var48 = var50.iterator();
                while (at.lIIlIIIllIIlIlI(var48.hasNext() ? 1 : 0)) {
                    var26 = (WorldPoint)var48.next();
                    WorldArea[] worldAreaArray2 = new WorldArea[llllIllIlIlI[16]];
                    worldAreaArray2[at.llllIllIlIlI[4]] = var19.getWorldArea();
                    if (at.lIIlIIIllIIlIlI(var26.isInArea(worldAreaArray2) ? 1 : 0)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[4]]);
                        var37.cM.k(llllIllIlIlI[4]);
                        return llllIllIlIlI[4];
                    }
                    0;
                    if (-3 <= 0) continue;
                    return ((0x32 ^ 0x6A ^ (0x2D ^ 0x3D)) & (0x51 ^ 0x69 ^ (0x3C ^ 0x4C) ^ -1)) != 0;
                }
                var48 = var37.aj();
                if (at.lIIlIIIllIIllII(var37.cM.at())) {
                    var37.cM.k(llllIllIlIlI[17]);
                }
                var26 = e.aw();
                var37.cM.b((WorldArea)var48);
                int[] var35 = SquireNightmarePlugin.r.stream().mapToInt(Integer::intValue).toArray();
                NPC var2 = NPCs.getNearest((int[])var35);
                if (at.lIIlIIIllIIlIll(var2)) {
                    WorldArea[] worldAreaArray3 = new WorldArea[llllIllIlIlI[16]];
                    worldAreaArray3[at.llllIllIlIlI[4]] = var48;
                    if (at.lIIlIIIllIIlIlI(Players.getLocal().getWorldLocation().isInArea(worldAreaArray3) ? 1 : 0)) {
                        WorldPoint var27 = var26.toWorldPointList().parallelStream().filter(arg_0 -> at.c((WorldArea)var48, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                        return var37.j(var27);
                    }
                    WorldPoint var27 = var37.cF();
                    if (at.lIIlIIIllIIllIl(var27)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[16]]);
                        return llllIllIlIlI[4];
                    }
                    var37.j(var27);
                    0;
                    0;
                    if (3 <= 1) {
                        return false;
                    }
                } else {
                    WorldPoint var27 = null;
                    Player var25 = Players.getLocal();
                    if (at.lIIlIIIllIIllIl(var25)) {
                        return llllIllIlIlI[4];
                    }
                    if (at.lIIlIIIllIIllII(var48.contains(var25.getWorldLocation()) ? 1 : 0) && at.lIIlIIIllIIllII(var25.isMoving() ? 1 : 0)) {
                        return llllIllIlIlI[4];
                    }
                    var27 = var26.toWorldPointList().stream().filter(arg_0 -> at.b((WorldArea)var48, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                    if (at.lIIlIIIllIIllIl(var27)) {
                        WorldArea var11 = SquireNightmarePlugin.e().toWorldArea(llllIllIlIlI[18], llllIllIlIlI[18]);
                        var27 = var11.toWorldPointList().stream().filter(arg_0 -> at.a((WorldArea)var48, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                        eq.debug(llllIllIIlIl[llllIllIlIlI[19]], (Object)var27);
                    }
                    if (at.lIIlIIIllIIllIl(var27)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[20]]);
                        return llllIllIlIlI[4];
                    }
                    eq.debug(llllIllIIlIl[llllIllIlIlI[21]], (Object)var27, (Object)Players.getLocal().getWorldLocation());
                    return var37.j(var27);
                }
            }
        }
        return llllIllIlIlI[4];
    }

    private static /* synthetic */ boolean c(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.lIIlIIIllIIllII(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = llllIllIlIlI[16];
            0;
            
            }
        } else {
            bl = llllIllIlIlI[4];
        }
        return bl;
    }

    private static boolean lIIlIIIllIIllII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIllIIIlll() {
        llllIllIlIlI = new int[24];
        at.llllIllIlIlI[0] = 0xFFFFA745 & 0x5FBA;
        at.llllIllIlIlI[1] = 0xFFFFFE7B & 0x19C4;
        at.llllIllIlIlI[2] = 0xFFFFFFF9 & 0x1C46;
        at.llllIllIlIlI[3] = 0xFFFFCA3B & 0x3DC4;
        at.llllIllIlIlI[4] = (0xCD ^ 0x8A) & ~(0x3A ^ 0x7D);
        at.llllIllIlIlI[5] = 0xFFFFF5D8 & 0x1EE7;
        at.llllIllIlIlI[6] = 0xFFFFFFC9 & 0x18F6;
        at.llllIllIlIlI[7] = 0xFFFFA769 & 0x5996;
        at.llllIllIlIlI[8] = 0x24 ^ 0x64;
        at.llllIllIlIlI[9] = 0xFFFFBFD3 & 0x5BEC;
        at.llllIllIlIlI[10] = -(0xFFFFA3BF & 0x7C6B) & (0xFFFFFFEA & 0x3FFF);
        at.llllIllIlIlI[11] = 0xFFFFFFF9 & 0x1F46;
        at.llllIllIlIlI[12] = 0xFFFFAF7A & 0x73C5;
        at.llllIllIlIlI[13] = -(0xFFFF9976 & 0x7EBF) & (0xFFFFFFFF & 0x3BF5);
        at.llllIllIlIlI[14] = -(0xFFFFE9A9 & 0x7E5F) & (0xFFFFFFEF & 0x7FD8);
        at.llllIllIlIlI[15] = -(0xFFFFBE57 & 0x47EB) & (0xFFFFAFFF & 0x77E3);
        at.llllIllIlIlI[16] = 1;
        at.llllIllIlIlI[17] = 0xC5 ^ 0xC0;
        at.llllIllIlIlI[18] = 0x28 ^ 0x25;
        at.llllIllIlIlI[19] = 2;
        at.llllIllIlIlI[20] = 3;
        at.llllIllIlIlI[21] = 0x1B ^ 0x4A ^ (0x62 ^ 0x37);
        at.llllIllIlIlI[22] = 0 ^ 0x35 ^ (0x82 ^ 0xB1);
        at.llllIllIlIlI[23] = 0xBA ^ 0xA5 ^ (0x57 ^ 0x40);
    }

    @Inject
    public at(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    static {
        at.lIIlIIIllIIIlll();
        at.lIIlIIIlIlllIll();
        eq = LoggerFactory.getLogger(at.class);
    }

    private static boolean lIIlIIIllIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIllIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIllIIlIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIlIIIlIlllIII(String var31, String var32) {
        var31 = new String(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var39 = var32.toCharArray();
        int var1 = llllIllIlIlI[4];
        char[] var40 = var31.toCharArray();
        int var36 = var40.length;
        int var4 = llllIllIlIlI[4];
        while (at.lIIlIIIllIIlllI(var4, var36)) {
            char var22 = var40[var4];
            var17.append((char)(var22 ^ var39[var1 % var39.length]));
            0;
            ++var1;
            ++var4;
            0;
            if ((0x23 ^ 0x27) == (0x1A ^ 0x1E)) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    /*
     * WARNING - void declaration
     */
    public av cE() {
        void var13;
        void var51;
        NPC nPC = SquireNightmarePlugin.d();
        LocalPoint localPoint = nPC.getLocalLocation();
        int n2 = localPoint.getX();
        int n3 = localPoint.getY();
        int n4 = llllIllIlIlI[0];
        if (!at.lIIlIIIllIIlIII(n2, llllIllIlIlI[1]) || at.lIIlIIIllIIlIIl(n2, llllIllIlIlI[2])) {
            int lllllllllllllllIIlIlIllllIlIIIII = llllIllIlIlI[3];
        }
        if (!at.lIIlIIIllIIlIII((int)var51, llllIllIlIlI[5]) || at.lIIlIIIllIIlIIl((int)var51, llllIllIlIlI[6])) {
            return av.WEST;
        }
        if (!at.lIIlIIIllIIlIII((int)var51, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)var51, llllIllIlIlI[10])) {
            return av.EAST;
        }
        if (!at.lIIlIIIllIIlIII((int)var13, llllIllIlIlI[11]) || !at.lIIlIIIllIIlIII((int)var13, llllIllIlIlI[10]) || !at.lIIlIIIllIIlIII((int)var13, llllIllIlIlI[12]) || at.lIIlIIIllIIlIIl((int)var13, llllIllIlIlI[13])) {
            return av.NORTH;
        }
        if (!at.lIIlIIIllIIlIII((int)var13, llllIllIlIlI[14]) || !at.lIIlIIIllIIlIII((int)var13, llllIllIlIlI[1]) || !at.lIIlIIIllIIlIII((int)var13, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)var13, llllIllIlIlI[2])) {
            return av.SOUTH;
        }
        return null;
    }

    private static boolean lIIlIIIllIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private WorldArea aj() {
        return new WorldArea(at.y(llllIllIlIlI[16]), at.y(llllIllIlIlI[4]));
    }

    private static /* synthetic */ boolean b(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.lIIlIIIllIIllII(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = llllIllIlIlI[16];
            0;
            if ((0x98 ^ 0x9C ^ (0x68 ^ 0x78) & ~(0x2F ^ 0x3F)) < 2) {
                return ((0x74 ^ 0x4A ^ (0xB ^ 0x2F)) & (44 + 175 - 143 + 113 ^ 85 + 99 - 112 + 95 ^ -1)) != 0;
            }
        } else {
            bl = llllIllIlIlI[4];
        }
        return bl;
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.lIIlIIIllIIllII(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = llllIllIlIlI[16];
            0;
            if (1 >= 3) {
                return false;
            }
        } else {
            bl = llllIllIlIlI[4];
        }
        return bl;
    }

    public static WorldPoint a(LocalPoint localPoint) {
        WorldPoint worldPoint2 = WorldPoint.fromLocalInstance((Client)Static.getClient(), (LocalPoint)localPoint);
        WorldPoint worldPoint3 = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)worldPoint2).stream().filter(Objects::nonNull).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo2D(Players.getLocal().getWorldLocation()))).orElse(null);
        return worldPoint3;
    }

    private static void lIIlIIIlIlllIll() {
        llllIllIIlIl = new String[llllIllIlIlI[22]];
        at.llllIllIIlIl[at.llllIllIlIlI[4]] = at."[AvoidCharge] PNM is in MIDDLE/multi area, which means we don't have to dodge?";
        at.llllIllIIlIl[at.llllIllIlIlI[16]] = at."[AvoidCharge] Optimal chargepoint is null";
        at.llllIllIIlIl[at.llllIllIlIlI[19]] = at."[AvoidCharge] safestPoint is null, trying second try: {}";
        at.llllIllIIlIl[at.llllIllIlIlI[20]] = at."[AvoidCharge] safestPoint is still null after 2 attempts.";
        at.llllIllIIlIl[at.llllIllIlIlI[21]] = at."[AvoidCharge] Safest charge point: {}; Player current location: {}";
        at.llllIllIIlIl[at.llllIllIlIlI[17]] = at."[AvoidCharge]: Width = {}; Height = {}";
    }

    /*
     * WARNING - void declaration
     */
    public static WorldPoint y(boolean bl) {
        void var7_7;
        boolean var15;
        void var8;
        void var10;
        int var43;
        NPC nPC = SquireNightmarePlugin.d();
        LocalPoint localPoint = nPC.getLocalLocation();
        int n2 = localPoint.getX();
        int n3 = localPoint.getY();
        int n4 = llllIllIlIlI[0];
        if (!at.lIIlIIIllIIlIII(n2, llllIllIlIlI[1]) || at.lIIlIIIllIIlIIl(n2, llllIllIlIlI[2])) {
            var43 = llllIllIlIlI[3];
        }
        LocalPoint var44 = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint var45 = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint var14 = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint var18 = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        if (!at.lIIlIIIllIIlIII((int)var10, llllIllIlIlI[5]) || at.lIIlIIIllIIlIIl((int)var10, llllIllIlIlI[6])) {
            var45 = new LocalPoint((int)(var10 + var43 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var8 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var44 = new LocalPoint((int)(var10 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var8 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var14 = new LocalPoint((int)(var10 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var8 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            var18 = new LocalPoint((int)(var10 + var43 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var8 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            0;
            if ((0xA2 ^ 0xAA ^ (0x51 ^ 0x5D)) <= 3) {
                return null;
            }
        } else if (!at.lIIlIIIllIIlIII((int)var10, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)var10, llllIllIlIlI[10])) {
            var45 = new LocalPoint((int)(var10 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var8 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var44 = new LocalPoint((int)(var10 - var43 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var8 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var14 = new LocalPoint((int)(var10 - var43 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var8 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            var18 = new LocalPoint((int)(var10 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var8 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            0;
            if (3 < 0) {
                return null;
            }
        } else if (!at.lIIlIIIllIIlIII((int)var8, llllIllIlIlI[11]) || !at.lIIlIIIllIIlIII((int)var8, llllIllIlIlI[10]) || !at.lIIlIIIllIIlIII((int)var8, llllIllIlIlI[12]) || at.lIIlIIIllIIlIIl((int)var8, llllIllIlIlI[13])) {
            var45 = new LocalPoint((int)(var10 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var8 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var44 = new LocalPoint((int)(var10 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var8 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var14 = new LocalPoint((int)(var10 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var8 - var43 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            var18 = new LocalPoint((int)(var10 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var8 - var43 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            0;
            if (((0x29 ^ 0x2C) & ~(0x9D ^ 0x98)) != ((0x37 ^ 4) & ~(1 ^ 0x32))) {
                return null;
            }
        } else if (!at.lIIlIIIllIIlIII((int)var8, llllIllIlIlI[14]) || !at.lIIlIIIllIIlIII((int)var8, llllIllIlIlI[1]) || !at.lIIlIIIllIIlIII((int)var8, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)var8, llllIllIlIlI[2])) {
            var45 = new LocalPoint((int)(var10 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var8 + var43 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var44 = new LocalPoint((int)(var10 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var8 + var43 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var14 = new LocalPoint((int)(var10 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var8 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            var18 = new LocalPoint((int)(var10 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var8 - llllIllIlIlI[7] - llllIllIlIlI[8]));
        }
        if (at.lIIlIIIllIIlIlI(var15 ? 1 : 0)) {
            return at.a(var14);
        }
        return at.a((LocalPoint)var7_7);
    }
}

