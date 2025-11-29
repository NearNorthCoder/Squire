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
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.tasks.GameEnum10;
import gg.squire.minigames.tasks.GameEnum;
import gg.squire.minigames.tasks.GameEnum11;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.MHelper;
import gg.squire.minigames.tasks.NHelper;
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

@TaskDesc(name="Safe Spotting Task")
public class SafeSpottingTask
extends Task {
    private final  n ai;
    private final  SquireFightCavesConfig ah;

    private final  f ag;

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
                l var1;
                return var1.A();
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

    private boolean c(NPC nPC) {
        boolean bl;
        if (l.llllIllllIlIll((Object)b.a(nPC.getId()).b(), (Object)a.RANGED)) {
            bl = llIIIlllllIl[2];

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
        void var2;
        if (!l.llllIllllIIIlI(tile.getWallObject()) || l.llllIllllIIIII(tile.getDecorativeObject())) {
            return llIIIlllllIl[2];
        }
        GameObject[] var3 = var2.getGameObjects();
        int var4 = var3.length;
        int var5 = llIIIlllllIl[1];
        while (l.llllIllllIlIII(var5, var4)) {
            GameObject var6 = var3[var5];
            if (l.llllIllllIIIII(var6)) {
                return llIIIlllllIl[2];
            }
            ++var5;

            if (-2 <= 0) continue;
            return false;
        }
        return llIIIlllllIl[1];
    }

        return String.valueOf(var7);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Tile tile, Client client) {
        boolean bl;
        void var8;
        void var9;
        void var10;
        void var11;
        int n2 = tile.getSceneLocation().getX();
        int n3 = tile.getSceneLocation().getY();
        int n4 = client.getPlane();
        if (!l.llllIllllIIIII(client.getCollisionMaps()) || !l.llllIllllIlIIl(n4) || l.llllIllllIlIlI(n4, client.getCollisionMaps().length)) {
            return llIIIlllllIl[1];
        }
        int[][] var12 = var11.getCollisionMaps()[var10].getFlags();
        if (!l.llllIllllIlIIl((int)var9) || !l.llllIllllIlIIl((int)var8) || !l.llllIllllIlIII((int)var9, var12.length) || l.llllIllllIlIlI((int)var8, var12[var9].length)) {
            return llIIIlllllIl[1];
        }
        if (l.llllIlllIlllIl(var12[var9][var8])) {
            bl = llIIIlllllIl[2];

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
        void var13;
        WorldPoint worldPoint = Static.getClient().getLocalPlayer().getWorldLocation();
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int n2 = llIIIlllllIl[7];
        int var14 = -n2;
        while (l.llllIlllIlllll(var14, (int)var13)) {
            void var15 = -var13;
            while (l.llllIlllIlllll((int)var15, (int)var13)) {
                void var16;
                l var17;
                void var18;
                WorldPoint var19 = var18.dx(var14).dy((int)var15);
                Tile var20 = var17.a(Static.getClient(), var19);
                if (l.llllIllllIIIII(var20) && l.llllIlllIllllI(var17.a(var20) ? 1 : 0) && l.llllIlllIllllI(var17.a(var20, (List<NPC>)var16) ? 1 : 0)) {
                    void var21;
                    var21.add(var19);

                }
                ++var15;

                if ((2 & ~2) == 0) continue;
                return null;
            }
            ++var14;

            if (-(30 + 53 - 64 + 116 ^ 78 + 97 - 63 + 19) < 0) continue;
            return null;
        }
        return arrayList;
    }

    private boolean b(NPC nPC) {
        boolean bl;
        if (l.llllIllllIlIll((Object)b.a(nPC.getId()).b(), (Object)a.MELEE)) {
            bl = llIIIlllllIl[2];

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
        l var22;
        f.b(llIIIlllllIl[0]);
        if (l.llllIlllIlllIl(this.z() ? 1 : 0)) {
            System.out.println(llIIIllllIll[llIIIlllllIl[1]]);
            return llIIIlllllIl[1];
        }
        Client var23 = Static.getClient();
        List<NPC> var24 = var22.a(var23);
        WorldPoint var25 = var23.getLocalPlayer().getWorldLocation();
        ArrayList var26 = new ArrayList();
        if (l.llllIlllIllllI(var24.isEmpty() ? 1 : 0)) {
            System.out.println(llIIIllllIll[llIIIlllllIl[2]]);
            return llIIIlllllIl[1];
        }
        System.out.println("Varbit: " + Vars.getBit((int)llIIIlllllIl[3]));
        System.out.println("Setting: " + String.valueOf(GameThread.invokeLater(() -> Static.getClient().getVarpValue(llIIIlllllIl[3]))));
        int var27 = var24.get(llIIIlllllIl[1]).getWorldArea().distanceTo(var25);
        if (l.llllIlllIlllll(var27, llIIIlllllIl[4])) {
            List var28 = var22.a(var24.get(llIIIlllllIl[1])).toWorldPointList();
            WorldPoint var29 = var28.stream().filter(worldPoint -> {
                int n2;
                if (l.llllIlllIllllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && l.llllIllllIlIII(((NPC)var24.get(llIIIlllllIl[1])).getWorldArea().distanceTo(worldPoint), llIIIlllllIl[0])) {
                    n2 = llIIIlllllIl[2];

                    if ((1 ^ (0x5C ^ 0x58)) == 0) {
                        return (2 & (2 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIlllllIl[1];
                }
                return n2 != 0;
            }).max(Comparator.comparingInt(object -> ((NPC)var24.get(llIIIlllllIl[1])).getWorldArea().distanceTo((WorldPoint)object)).thenComparingDouble(object -> -1.0f * ((WorldPoint)object).distanceToHypotenuse(var25.getWorldLocation()))).orElse(null);
            if (l.llllIllllIIIII(var29)) {
                System.out.println("Player: " + String.valueOf(var25.getWorldLocation()) + String.valueOf(var24.get(llIIIlllllIl[1]).getWorldLocation()));
                Movement.setDestination((WorldPoint)var29);
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

                    if (1 > 3) {
                        return false;
                    }
                } else {
                    bl = llIIIlllllIl[1];
                }
                return bl;
            }) ? 1 : 0) && l.llllIlllIlllIl(n.g(nPC) ? 1 : 0)) {
                n3 = llIIIlllllIl[2];

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
        l.llIIIllllIll[l.llIIIlllllIl[1]] = "We don't need to get a safe spot.";
        l.llIIIllllIll[l.llIIIlllllIl[2]] = "No threats";
        l.llIIIllllIll[l.llIIIlllllIl[5]] = "Safe = null";
    }

    @Inject
    public SafeSpottingTask(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.ag = f2;
        this.ah = squireFightCavesConfig;
        this.ai = n2;
    }

    /*
     * WARNING - void declaration
     */
    private int a(WorldPoint worldPoint, Client client, List<NPC> list) {
        void var30;
        void var31;
        void var32;
        void var33;
        l var34;
        int n2 = llIIIlllllIl[1];
        Tile tile = this.a(client, worldPoint);
        if (l.llllIlllIlllIl(this.a(tile) ? 1 : 0)) {
            return Integer.MIN_VALUE;
        }
        var35 += 100;
        if (l.llllIlllIlllIl(var34.c((Tile)var33, (Client)var32) ? 1 : 0)) {
            var35 -= 500;

            if (-(0x34 ^ 0x30) > 0) {
                return (6 ^ 0x44) & ~(0x63 ^ 0x21);
            }
        } else {
            var35 += 200;
        }
        WorldPoint var36 = var31.iterator();
        while (l.llllIlllIllllI(var36.hasNext() ? 1 : 0)) {
            NPC var37 = (NPC)var36.next();
            int var38 = var30.distanceTo(var37.getWorldLocation());
            var35 += Math.max(llIIIlllllIl[1], llIIIlllllIl[6] - var38);

            if (((0xCD ^ 0xAE) & ~(0x7C ^ 0x1F)) < (0x9F ^ 0x9B)) continue;
            return (2 ^ 5) & ~(0x90 ^ 0x97);
        }
        var36 = var32.getLocalPlayer().getWorldLocation();
        if (!l.llllIllllIIllI(var30.getX(), var36.getX()) || l.llllIllllIIlll(var30.getY(), var36.getY())) {
            var35 += 50;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Tile tile, List<NPC> list) {
        void var39;
        if (l.llllIlllIlllIl(this.b(tile, Static.getClient()) ? 1 : 0)) {
            return llIIIlllllIl[1];
        }
        Iterator var40 = var39.iterator();
        while (l.llllIlllIllllI(var40.hasNext() ? 1 : 0)) {
            void var41;
            l var42;
            NPC var43 = (NPC)var40.next();
            if (l.llllIlllIllllI(var42.b(var43) ? 1 : 0) && l.llllIlllIllllI(var42.a(var41.getWorldLocation(), var43.getWorldLocation()) ? 1 : 0)) {
                return llIIIlllllIl[1];
            }
            if ((!l.llllIlllIlllIl(var42.c(var43) ? 1 : 0) || l.llllIlllIllllI(var42.d(var43) ? 1 : 0)) && l.llllIlllIllllI(var42.a((Tile)var41, var43, Static.getClient()) ? 1 : 0)) {
                return llIIIlllllIl[1];
            }

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
        void var44;

        int n3 = f.p();
        e e2 = e.values()[n3];
        List list = NPCs.getAll();
        b[] bArray = e2.h();
        int n4 = bArray.length;
        int var45 = llIIIlllllIl[1];
        while (l.llllIllllIlIII(var45, (int)var44)) {
            void var46;
            void var47;
            void var48 = var47[var45];
            Iterator var49 = var46.iterator();
            while (l.llllIlllIllllI(var49.hasNext() ? 1 : 0)) {
                l var50;
                NPC var51 = (NPC)var49.next();
                n cfr_ignored_0 = var50.ai;

                int n5 = n.g(var51);
                boolean var52 = var50.a((GameEnum) ar48);
                System.out.println("NPC ID: " + var51.getId() + " isSafeSpotted: " + (n5 != 0) + " shouldSafeSpot: " + var52);
                if (l.llllIlllIllllI(Arrays.stream(var48.c()).anyMatch(n2 -> {
                    boolean bl;
                    if (l.llllIllllIIlll(n2, var51.getId())) {
                        bl = llIIIlllllIl[2];

                        if (1 < 0) {
                            return ((0x62 ^ 0x2F ^ (0x62 ^ 0x65)) & (0xE1 ^ 0x8C ^ (0x4B ^ 0x6C) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIlllllIl[1];
                    }
                    return bl;
                }) ? 1 : 0) && l.llllIlllIlllIl(n5)) {
                    return var52;
                }

                if (3 == 3) continue;
                return false;
            }
            ++var45;

            if (-1 <= 1) continue;
            return false;
        }
        return llIIIlllllIl[1];
    }

    private boolean d(NPC nPC) {
        boolean bl;
        if (l.llllIllllIlIll((Object)b.a(nPC.getId()).b(), (Object)a.MAGIC)) {
            bl = llIIIlllllIl[2];

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
        void var53;
        void var54;
        void var55;
        void var56;
        int n2 = tile.getSceneLocation().getX();
        int n3 = tile.getSceneLocation().getY();
        int n4 = client.getPlane();
        if (!l.llllIllllIIIII(client.getCollisionMaps()) || !l.llllIllllIlIIl(n4) || l.llllIllllIlIlI(n4, client.getCollisionMaps().length)) {
            return llIIIlllllIl[1];
        }
        int[][] var57 = var56.getCollisionMaps()[var55].getFlags();
        if (!l.llllIllllIlIIl((int)var54) || !l.llllIllllIlIIl((int)var53) || !l.llllIllllIlIII((int)var54, var57.length) || l.llllIllllIlIlI((int)var53, var57[var54].length)) {
            return llIIIlllllIl[1];
        }
        if (l.llllIlllIlllIl(var57[var54][var53])) {
            bl = llIIIlllllIl[2];

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

            if (-(0x78 ^ 0x7C) >= 0) {
                return false;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }
}

