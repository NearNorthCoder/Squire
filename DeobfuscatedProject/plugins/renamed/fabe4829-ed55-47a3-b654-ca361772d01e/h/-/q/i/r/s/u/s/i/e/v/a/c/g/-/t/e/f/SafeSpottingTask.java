/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.GameThread
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.AEnum;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.BEnum;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.EEnum;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f_Unknown;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.m_Unknown;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

/* TASK: Safe Spotting Task -> SafespottingtaskTask */
@TaskDesc(name="Safe Spotting Task")
public class SafeSpottingTask
extends Task {
    private final /* synthetic */ n ai;
    private final /* synthetic */ SquireFightCavesConfig ah;
    private static /* synthetic */ int[] llIIIlllllIl;
    private static /* synthetic */ String[] llIIIllllIll;
    private final /* synthetic */ f ag;

    private static boolean llllIllllIlIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIllllIIIII(Object object) {
        return object != null;
    }

    private boolean a(b b2) {
        switch (m.aj[b2.f().ordinal()]) {
            case 1: 
            case 2: {
                return llIIIlllllIl[2];
            }
            case 3: {
                l var7;
                return var7.A();
            }
            case 4: {
                return llIIIlllllIl[2];
            }
            case 5: {
                return llIIIlllllIl[1];
            }
        }
        return llIIIlllllIl[2];
    }

    private static boolean llllIllllIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llllIlllIllIll() {
        llIIIlllllIl = new int[8];
        l.llIIIlllllIl[0] = 0x46 ^ 0x40;
        l.llIIIlllllIl[1] = (26 + 34 - -25 + 102 ^ 39 + 59 - -51 + 22) & (43 + 119 - 57 + 84 ^ 9 + 98 - 23 + 89 ^ -1);
        l.llIIIlllllIl[2] = 1;
        l.llIIIlllllIl[3] = 0xFFFFDBEC & 0x2FD3;
        l.llIIIlllllIl[4] = 3;
        l.llIIIlllllIl[5] = 2;
        l.llIIIlllllIl[6] = 0x1B ^ 0x36 ^ (0xB7 ^ 0x90);
        l.llIIIlllllIl[7] = 0x5F ^ 0x50;
    }

    private boolean c(NPC nPC) {
        boolean bl;
        if (l.llllIllllIlIll((Object)b.a(nPC.getId()).b(), (Object)a.RANGED)) {
            bl = llIIIlllllIl[2];
            0;
            if (2 < -1) {
                return ((0x86 ^ 0xB2 ^ (0xC9 ^ 0xC7)) & (0xE8 ^ 0x8A ^ (0xC5 ^ 0x9D) ^ -1)) != 0;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    private Tile a(Client client, WorldPoint worldPoint) {
        LocalPoint localPoint = LocalPoint.fromWorld((Client)client, (WorldPoint)worldPoint);
        if (l.llllIllllIIIlI(localPoint)) {
            return null;
        }
        return client.getScene().getTiles()[worldPoint.getPlane()][localPoint.getSceneX()][localPoint.getSceneY()];
    }

    private static boolean llllIlllIlllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIlllIlllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean c(Tile tile, Client client) {
        void var60;
        if (!l.llllIllllIIIlI(tile.getWallObject()) || l.llllIllllIIIII(tile.getDecorativeObject())) {
            return llIIIlllllIl[2];
        }
        GameObject[] var4 = var60.getGameObjects();
        int var55 = var4.length;
        int var30 = llIIIlllllIl[1];
        while (l.llllIllllIlIII(var30, var55)) {
            GameObject var31 = var4[var30];
            if (l.llllIllllIIIII(var31)) {
                return llIIIlllllIl[2];
            }
            ++var30;
            0;
            if (-2 <= 0) continue;
            return false;
        }
        return llIIIlllllIl[1];
    }

    private static String llllIlllIIllll(String var34, String var16) {
        var34 = new String(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var42 = new StringBuilder();
        char[] var44 = var16.toCharArray();
        int var20 = llIIIlllllIl[1];
        char[] var9 = var34.toCharArray();
        int var12 = var9.length;
        int var27 = llIIIlllllIl[1];
        while (l.llllIllllIlIII(var27, var12)) {
            char var8 = var9[var27];
            var42.append((char)(var8 ^ var44[var20 % var44.length]));
            0;
            ++var20;
            ++var27;
            0;
            if (((0x63 ^ 0x58) & ~(0x8C ^ 0xB7)) >= ((0x48 ^ 0x66) & ~(0x12 ^ 0x3C))) continue;
            return null;
        }
        return String.valueOf(var42);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Tile tile, Client client) {
        boolean bl;
        void var45;
        void var39;
        void var69;
        void var54;
        int n2 = tile.getSceneLocation().getX();
        int n3 = tile.getSceneLocation().getY();
        int n4 = client.getPlane();
        if (!l.llllIllllIIIII(client.getCollisionMaps()) || !l.llllIllllIlIIl(n4) || l.llllIllllIlIlI(n4, client.getCollisionMaps().length)) {
            return llIIIlllllIl[1];
        }
        int[][] var24 = var54.getCollisionMaps()[var69].getFlags();
        if (!l.llllIllllIlIIl((int)var39) || !l.llllIllllIlIIl((int)var45) || !l.llllIllllIlIII((int)var39, var24.length) || l.llllIllllIlIlI((int)var45, var24[var39].length)) {
            return llIIIlllllIl[1];
        }
        if (l.llllIlllIlllIl(var24[var39][var45])) {
            bl = llIIIlllllIl[2];
            0;
            if (((0x3D ^ 0x5D) & ~(0x63 ^ 3)) > 0) {
                return false;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    private boolean a(Tile tile, NPC nPC, Client client) {
        Tile tile2 = this.a(client, nPC.getWorldLocation());
        return tile.hasLineOfSightTo(tile2);
    }

    private boolean a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        int n2;
        int n3 = Math.abs(worldPoint.getX() - worldPoint2.getX());
        int n4 = Math.abs(worldPoint.getY() - worldPoint2.getY());
        if (l.llllIlllIlllll(n3, llIIIlllllIl[2]) && l.llllIlllIlllll(n4, llIIIlllllIl[2])) {
            n2 = llIIIlllllIl[2];
            0;
            if (-3 >= 0) {
                return false;
            }
        } else {
            n2 = llIIIlllllIl[1];
        }
        return n2 != 0;
    }

    private WorldArea a(NPC nPC) {
        if (l.llllIllllIIIlI(nPC)) {
            return null;
        }
        int n2 = llIIIlllllIl[4];
        return new WorldArea(nPC.getWorldLocation().dx(-n2).dy(-n2), llIIIlllllIl[5] * n2 + nPC.getWorldArea().getWidth(), llIIIlllllIl[5] * n2 + nPC.getWorldArea().getWidth());
    }

    private static String llllIlllIlIIII(String var51, String var35) {
        try {
            SecretKeySpec var47 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var35.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var48 = Cipher.getInstance("Blowfish");
            var48.init(llIIIlllllIl[5], var47);
            return new String(var48.doFinal(Base64.getDecoder().decode(var51.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var41) {
            var41.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllllIlIIl(int n2) {
        return n2 >= 0;
    }

    private static boolean llllIllllIIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> b(List<NPC> list) {
        void var40;
        WorldPoint worldPoint = Static.getClient().getLocalPlayer().getWorldLocation();
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int n2 = llIIIlllllIl[7];
        int var36 = -n2;
        while (l.llllIlllIlllll(var36, (int)var40)) {
            void var58 = -var40;
            while (l.llllIlllIlllll((int)var58, (int)var40)) {
                void var3;
                l var59;
                void var1;
                WorldPoint var46 = var1.dx(var36).dy((int)var58);
                Tile var28 = var59.a(Static.getClient(), var46);
                if (l.llllIllllIIIII(var28) && l.llllIlllIllllI(var59.a(var28) ? 1 : 0) && l.llllIlllIllllI(var59.a(var28, (List<NPC>)var3) ? 1 : 0)) {
                    void var56;
                    var56.add(var46);
                    0;
                }
                ++var58;
                0;
                if ((2 & ~2) == 0) continue;
                return null;
            }
            ++var36;
            0;
            if (-(30 + 53 - 64 + 116 ^ 78 + 97 - 63 + 19) < 0) continue;
            return null;
        }
        return arrayList;
    }

    private boolean b(NPC nPC) {
        boolean bl;
        if (l.llllIllllIlIll((Object)b.a(nPC.getId()).b(), (Object)a.MELEE)) {
            bl = llIIIlllllIl[2];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    private boolean a(Tile tile) {
        if (l.llllIlllIllllI(Arrays.stream(tile.getGameObjects()).anyMatch(gameObject -> {
            int n2;
            if (l.llllIllllIIIII(gameObject) && l.llllIlllIlllIl(this.b((TileObject)gameObject) ? 1 : 0)) {
                n2 = llIIIlllllIl[2];
                0;
                if ((0x88 ^ 0x8C) < 0) {
                    return false;
                }
            } else {
                n2 = llIIIlllllIl[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return llIIIlllllIl[1];
        }
        return this.a(tile, Static.getClient());
    }

    public boolean run() {
        l var19;
        f.b(llIIIlllllIl[0]);
        if (l.llllIlllIlllIl(this.z() ? 1 : 0)) {
            System.out.println(llIIIllllIll[llIIIlllllIl[1]]);
            return llIIIlllllIl[1];
        }
        Client var21 = Static.getClient();
        List<NPC> var26 = var19.a(var21);
        WorldPoint var2 = var21.getLocalPlayer().getWorldLocation();
        ArrayList lllllllllllllllIlIlIIIIllIIllIll = new ArrayList();
        if (l.llllIlllIllllI(var26.isEmpty() ? 1 : 0)) {
            System.out.println(llIIIllllIll[llIIIlllllIl[2]]);
            return llIIIlllllIl[1];
        }
        System.out.println("Varbit: " + Vars.getBit((int)llIIIlllllIl[3]));
        System.out.println("Setting: " + String.valueOf(GameThread.invokeLater(() -> Static.getClient().getVarpValue(llIIIlllllIl[3]))));
        int var22 = var26.get(llIIIlllllIl[1]).getWorldArea().distanceTo(var2);
        if (l.llllIlllIlllll(var22, llIIIlllllIl[4])) {
            List var67 = var19.a(var26.get(llIIIlllllIl[1])).toWorldPointList();
            WorldPoint var66 = var67.stream().filter(worldPoint -> {
                int n2;
                if (l.llllIlllIllllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && l.llllIllllIlIII(((NPC)var26.get(llIIIlllllIl[1])).getWorldArea().distanceTo(worldPoint), llIIIlllllIl[0])) {
                    n2 = llIIIlllllIl[2];
                    0;
                    if ((1 ^ (0x5C ^ 0x58)) == 0) {
                        return (2 & (2 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIlllllIl[1];
                }
                return n2 != 0;
            }).max(Comparator.comparingInt(object -> ((NPC)var26.get(llIIIlllllIl[1])).getWorldArea().distanceTo((WorldPoint)object)).thenComparingDouble(object -> -1.0f * ((WorldPoint)object).distanceToHypotenuse(var2.getWorldLocation()))).orElse(null);
            if (l.llllIllllIIIII(var66)) {
                System.out.println("Player: " + String.valueOf(var2.getWorldLocation()) + String.valueOf(var26.get(llIIIlllllIl[1]).getWorldLocation()));
                Movement.setDestination((WorldPoint)var66);
                return llIIIlllllIl[2];
            }
            System.out.println(llIIIllllIll[llIIIlllllIl[5]]);
        }
        return llIIIlllllIl[2];
    }

    private List<NPC> a(Client client) {
        int n2 = f.p();
        e e2 = e.values()[n2];
        return NPCs.getAll().stream().filter(nPC -> Arrays.stream(e2.h()).anyMatch(b2 -> {
            int n3;
            if (l.llllIlllIllllI(Arrays.stream(b2.c()).anyMatch(n2 -> {
                boolean bl;
                if (l.llllIllllIIlll(n2, nPC.getId())) {
                    bl = llIIIlllllIl[2];
                    0;
                    if (1 > 3) {
                        return false;
                    }
                } else {
                    bl = llIIIlllllIl[1];
                }
                return bl;
            }) ? 1 : 0) && l.llllIlllIlllIl(n.g(nPC) ? 1 : 0)) {
                n3 = llIIIlllllIl[2];
                0;
                if ((0x5E ^ 0x55 ^ (0x53 ^ 0x5C)) < (63 + 121 - 87 + 34 ^ 47 + 96 - 68 + 60)) {
                    return ((0xBF ^ 0xBB ^ (0x97 ^ 0x8B)) & (58 + 143 - 163 + 121 ^ 124 + 80 - 162 + 93 ^ -1)) != 0;
                }
            } else {
                n3 = llIIIlllllIl[1];
            }
            return n3 != 0;
        })).collect(Collectors.toList());
    }

    private boolean b(TileObject tileObject) {
        return llIIIlllllIl[2];
    }

    private static void llllIlllIlIIIl() {
        llIIIllllIll = new String[llIIIlllllIl[4]];
        l.llIIIllllIll[l.llIIIlllllIl[1]] = l."We don't need to get a safe spot.";
        l.llIIIllllIll[l.llIIIlllllIl[2]] = l."No threats";
        l.llIIIllllIll[l.llIIIlllllIl[5]] = l."Safe = null";
    }

    @Inject
    public l(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.ag = f2;
        this.ah = squireFightCavesConfig;
        this.ai = n2;
    }

    /*
     * WARNING - void declaration
     */
    private int a(WorldPoint worldPoint, Client client, List<NPC> list) {
        void var61;
        void var49;
        void var52;
        void var25;
        l var43;
        int n2 = llIIIlllllIl[1];
        Tile tile = this.a(client, worldPoint);
        if (l.llllIlllIlllIl(this.a(tile) ? 1 : 0)) {
            return Integer.MIN_VALUE;
        }
        var5 += 100;
        if (l.llllIlllIlllIl(var43.c((Tile)var25, (Client)var52) ? 1 : 0)) {
            var5 -= 500;
            0;
            if (-(0x34 ^ 0x30) > 0) {
                return (6 ^ 0x44) & ~(0x63 ^ 0x21);
            }
        } else {
            var5 += 200;
        }
        WorldPoint var6 = var49.iterator();
        while (l.llllIlllIllllI(var6.hasNext() ? 1 : 0)) {
            NPC var63 = (NPC)var6.next();
            int var29 = var61.distanceTo(var63.getWorldLocation());
            var5 += Math.max(llIIIlllllIl[1], llIIIlllllIl[6] - var29);
            0;
            if (((0xCD ^ 0xAE) & ~(0x7C ^ 0x1F)) < (0x9F ^ 0x9B)) continue;
            return (2 ^ 5) & ~(0x90 ^ 0x97);
        }
        var6 = var52.getLocalPlayer().getWorldLocation();
        if (!l.llllIllllIIllI(var61.getX(), var6.getX()) || l.llllIllllIIlll(var61.getY(), var6.getY())) {
            var5 += 50;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Tile tile, List<NPC> list) {
        void var23;
        if (l.llllIlllIlllIl(this.b(tile, Static.getClient()) ? 1 : 0)) {
            return llIIIlllllIl[1];
        }
        Iterator var32 = var23.iterator();
        while (l.llllIlllIllllI(var32.hasNext() ? 1 : 0)) {
            void var13;
            l var18;
            NPC var17 = (NPC)var32.next();
            if (l.llllIlllIllllI(var18.b(var17) ? 1 : 0) && l.llllIlllIllllI(var18.a(var13.getWorldLocation(), var17.getWorldLocation()) ? 1 : 0)) {
                return llIIIlllllIl[1];
            }
            if ((!l.llllIlllIlllIl(var18.c(var17) ? 1 : 0) || l.llllIlllIllllI(var18.d(var17) ? 1 : 0)) && l.llllIlllIllllI(var18.a((Tile)var13, var17, Static.getClient()) ? 1 : 0)) {
                return llIIIlllllIl[1];
            }
            0;
            if ((0x84 ^ 0x80) > 0) continue;
            return false;
        }
        return llIIIlllllIl[2];
    }

    private static boolean llllIllllIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIllllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIllllIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean z() {
        void var65;
        0;
        int n3 = f.p();
        e e2 = e.values()[n3];
        List list = NPCs.getAll();
        b[] bArray = e2.h();
        int n4 = bArray.length;
        int var53 = llIIIlllllIl[1];
        while (l.llllIllllIlIII(var53, (int)var65)) {
            void var68;
            void var50;
            void var37 = var50[var53];
            Iterator var15 = var68.iterator();
            while (l.llllIlllIllllI(var15.hasNext() ? 1 : 0)) {
                l var10;
                NPC var33 = (NPC)var15.next();
                n cfr_ignored_0 = var10.ai;
                0;
                int n5 = n.g(var33);
                boolean var38 = var10.a((b)var37);
                System.out.println("NPC ID: " + var33.getId() + " isSafeSpotted: " + (n5 != 0) + " shouldSafeSpot: " + var38);
                if (l.llllIlllIllllI(Arrays.stream(var37.c()).anyMatch(n2 -> {
                    boolean bl;
                    if (l.llllIllllIIlll(n2, var33.getId())) {
                        bl = llIIIlllllIl[2];
                        0;
                        if (1 < 0) {
                            return ((0x62 ^ 0x2F ^ (0x62 ^ 0x65)) & (0xE1 ^ 0x8C ^ (0x4B ^ 0x6C) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIlllllIl[1];
                    }
                    return bl;
                }) ? 1 : 0) && l.llllIlllIlllIl(n5)) {
                    return var38;
                }
                0;
                if (3 == 3) continue;
                return false;
            }
            ++var53;
            0;
            if (-1 <= 1) continue;
            return false;
        }
        return llIIIlllllIl[1];
    }

    private boolean d(NPC nPC) {
        boolean bl;
        if (l.llllIllllIlIll((Object)b.a(nPC.getId()).b(), (Object)a.MAGIC)) {
            bl = llIIIlllllIl[2];
            0;
            if (3 <= ((0x9D ^ 0x81) & ~(0xBD ^ 0xA1))) {
                return false;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    static {
        l.llllIlllIllIll();
        l.llllIlllIlIIIl();
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(Tile tile, Client client) {
        boolean bl;
        void var57;
        void var64;
        void var14;
        void var62;
        int n2 = tile.getSceneLocation().getX();
        int n3 = tile.getSceneLocation().getY();
        int n4 = client.getPlane();
        if (!l.llllIllllIIIII(client.getCollisionMaps()) || !l.llllIllllIlIIl(n4) || l.llllIllllIlIlI(n4, client.getCollisionMaps().length)) {
            return llIIIlllllIl[1];
        }
        int[][] var11 = var62.getCollisionMaps()[var14].getFlags();
        if (!l.llllIllllIlIIl((int)var64) || !l.llllIllllIlIIl((int)var57) || !l.llllIllllIlIII((int)var64, var11.length) || l.llllIllllIlIlI((int)var57, var11[var64].length)) {
            return llIIIlllllIl[1];
        }
        if (l.llllIlllIlllIl(var11[var64][var57])) {
            bl = llIIIlllllIl[2];
            0;
            if (3 == -1) {
                return false;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    private static boolean llllIlllIllllI(int n2) {
        return n2 != 0;
    }

    private Optional<WorldPoint> a(List<WorldPoint> list, Client client, WorldPoint worldPoint, List<NPC> list2) {
        return list.stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(worldPoint)));
    }

    private boolean A() {
        boolean bl;
        int n2;
        Client client = Static.getClient();
        int n3 = client.getRealSkillLevel(Skill.HITPOINTS);
        int n4 = client.getBoostedSkillLevel(Skill.HITPOINTS);
        if (l.llllIlllIlllll(n4, n2 = (int)(0.05 * (double)n3))) {
            bl = llIIIlllllIl[2];
            0;
            if (1 < 0) {
                return false;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    private boolean b(Tile tile) {
        boolean bl;
        if (!l.llllIllllIIIlI(tile.getWallObject()) || l.llllIlllIllllI(Arrays.stream(tile.getGameObjects()).anyMatch(Objects::nonNull) ? 1 : 0)) {
            bl = llIIIlllllIl[2];
            0;
            if (-(0x78 ^ 0x7C) >= 0) {
                return false;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }
}

