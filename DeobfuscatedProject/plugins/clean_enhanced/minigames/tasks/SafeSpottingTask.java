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
import gg.squire.minigames.tasks.GameEnum2;
import gg.squire.minigames.tasks.GameEnum;
import gg.squire.minigames.tasks.GameEnum3;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.MHelper;
import gg.squire.minigames.tasks.MinigamesManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
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

    private boolean a(b b2) {
        switch (m.aj[b2.f().ordinal()]) {
            case 1: 
            case 2: {
                return 2;
            }
            case 3: {
                l var3;
                return var3.A();
            }
            case 4: {
                return 2;
            }
            case 5: {
                return 1;
            }
        }
        return 2;
    }

    private boolean c(NPC nPC) {
        boolean bl;
        if (((Object)b.a(nPC.getId()).b() == (Object)b.a(nPC.getId()).b()2)a.RANGED)) {
            bl = 2;
            0;
            if (2 < -1) {
                return ((0x86 ^ 0xB2 ^ (0xC9 ^ 0xC7)) & (0xE8 ^ 0x8A ^ (0xC5 ^ 0x9D) ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    private Tile a(Client client, WorldPoint worldPoint) {
        LocalPoint localPoint = LocalPoint.fromWorld((Client)client, (WorldPoint)worldPoint);
        if localPoint == null {
            return null;
        }
        return client.getScene().getTiles()[worldPoint.getPlane()][localPoint.getSceneX()][localPoint.getSceneY()];
    }

    /*
     * WARNING - void declaration
     */
    private boolean c(Tile tile, Client client) {
        void var4;
        if (!(tile.getWallObject( == null)) || (tile.getDecorativeObject( != null))) {
            return 2;
        }
        GameObject[] var5 = var4.getGameObjects();
        int var6 = var5.length;
        int var7 = 1;
        while (var7 < var6) {
            GameObject var8 = var5[var7];
            if var8 != null {
                return 2;
            }
            ++var7;
            0;
            if (-2 <= 0) continue;
            return ((0x15 ^ 0x54) & ~(0x3C ^ 0x7D)) != 0;
        }
        return 1;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (((0x63 ^ 0x58) & ~(0x8C ^ 0xB7)) >= ((0x48 ^ 0x66) & ~(0x12 ^ 0x3C))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Tile tile, Client client) {
        boolean bl;
        void var19;
        void var20;
        void var21;
        void var22;
        int n2 = tile.getSceneLocation().getX();
        int n3 = tile.getSceneLocation().getY();
        int n4 = client.getPlane();
        if (!(client.getCollisionMaps( != null)) || !(n4 >= 0) || (n4 >= client.getCollisionMaps().length)) {
            return 1;
        }
        int[][] var23 = var22.getCollisionMaps()[var21].getFlags();
        if (!((int >= 0)var20) || !((int >= 0)var19) || !((int)var20 < var23.length) || ((int)var19 >= var23[var20].length)) {
            return 1;
        }
        if (var23[var20][var19] == 0) {
            bl = 2;
            0;
            if (((0x3D ^ 0x5D) & ~(0x63 ^ 3)) > 0) {
                return ((0x30 ^ 0x67) & ~(0x91 ^ 0xC6)) != 0;
            }
        } else {
            bl = 1;
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
        if ((2 <= 2) && (n4 <= 2)) {
            n2 = 2;
            0;
            if (-3 >= 0) {
                return ((0x5B ^ 0x3B) & ~(0x4A ^ 0x2A)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    private WorldArea a(NPC nPC) {
        if nPC == null {
            return null;
        }
        int n2 = 4;
        return new WorldArea(nPC.getWorldLocation().dx(-n2).dy(-n2), 5 * n2 + nPC.getWorldArea().getWidth(), 5 * n2 + nPC.getWorldArea().getWidth());
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> b(List<NPC> list) {
        void var30;
        WorldPoint worldPoint = Static.getClient().getLocalPlayer().getWorldLocation();
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int n2 = 7;
        int var31 = -n2;
        while ((var31 <= (int)var30)) {
            void var32 = -var30;
            while (((int)var32 <= (int)var30)) {
                void var33;
                l var34;
                void var35;
                WorldPoint var36 = var35.dx(var31).dy((int)var32);
                Tile var37 = var34.a(Static.getClient(), var36);
                if (var37 != null && (var34.alllllllllllllllIlIlIIIIlIlIIllII) && (var34.a(var37, (List<NPC> != 0)var33) ? 1 : 0)) {
                    void var38;
                    var38.add(var36);
                    0;
                }
                ++var32;
                0;
                if ((2 & ~2) == 0) continue;
                return null;
            }
            ++var31;
            0;
            if (-(30 + 53 - 64 + 116 ^ 78 + 97 - 63 + 19) < 0) continue;
            return null;
        }
        return arrayList;
    }

    private boolean b(NPC nPC) {
        boolean bl;
        if (((Object)b.a(nPC.getId()).b() == (Object)b.a(nPC.getId()).b()2)a.MELEE)) {
            bl = 2;
            0;
            if (2 <= 0) {
                return ((0xA4 ^ 0x85) & ~(0x40 ^ 0x61)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    private boolean a(Tile tile) {
        if ((Arrays.stream(tile.getGameObjects( != 0)).anyMatch(gameObject -> {
            int n2;
            if (gameObject != null && (this.b((TileObject == 0)gameObject) ? 1 : 0)) {
                n2 = 2;
                0;
                if ((0x88 ^ 0x8C) < 0) {
                    return ((0x22 ^ 0x34) & ~(0x87 ^ 0x91)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return 1;
        }
        return this.a(tile, Static.getClient());
    }

    public boolean run() {
        l var39;
        f.b(0);
        if ((this.z( == 0) ? 1 : 0)) {
            System.out.println(var2[1]);
            return 1;
        }
        Client var40 = Static.getClient();
        List<NPC> var41 = var39.a(var40);
        WorldPoint var42 = var40.getLocalPlayer().getWorldLocation();
        ArrayList var43 = new ArrayList();
        if ((var41.isEmpty( != 0) ? 1 : 0)) {
            System.out.println(var2[2]);
            return 1;
        }
        System.out.println("Varbit: " + Vars.getBit((int)3));
        System.out.println("Setting: " + String.valueOf(GameThread.invokeLater(() -> Static.getClient().getVarpValue(3))));
        int var44 = var41.get(1).getWorldArea().distanceTo(var42);
        if (var44 <= 4) {
            List var45 = var39.a(var41.get(1)).toWorldPointList();
            WorldPoint var46 = var45.stream().filter(worldPoint -> {
                int n2;
                if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (((NPC)var41.get(1)).getWorldArea().distanceTo(worldPoint) < 0)) {
                    n2 = 2;
                    0;
                    if ((1 ^ (0x5C ^ 0x58)) == 0) {
                        return (2 & (2 ^ -1)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            }).max(Comparator.comparingInt(object -> ((NPC)var41.get(1)).getWorldArea().distanceTo((WorldPoint)object)).thenComparingDouble(object -> -1.0f * ((WorldPoint)object).distanceToHypotenuse(var42.getWorldLocation()))).orElse(null);
            if var46 != null {
                System.out.println("Player: " + String.valueOf(var42.getWorldLocation()) + String.valueOf(var41.get(1).getWorldLocation()));
                Movement.setDestination((WorldPoint)var46);
                return 2;
            }
            System.out.println(var2[5]);
        }
        return 2;
    }

    private List<NPC> a(Client client) {
        int n2 = f.p();
        e e2 = e.values()[n2];
        return NPCs.getAll().stream().filter(nPC -> Arrays.stream(e2.h()).anyMatch(b2 -> {
            int n3;
            if ((Arrays.stream(b2.c( != 0)).anyMatch(n2 -> {
                boolean bl;
                if ((n2 == nPC.getId())) {
                    bl = 2;
                    0;
                    if (1 > 3) {
                        return ((1 ^ 0x26) & ~(0xE5 ^ 0xC2)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            }) ? 1 : 0) && (n.g(nPC == 0) ? 1 : 0)) {
                n3 = 2;
                0;
                if ((0x5E ^ 0x55 ^ (0x53 ^ 0x5C)) < (63 + 121 - 87 + 34 ^ 47 + 96 - 68 + 60)) {
                    return ((0xBF ^ 0xBB ^ (0x97 ^ 0x8B)) & (58 + 143 - 163 + 121 ^ 124 + 80 - 162 + 93 ^ -1)) != 0;
                }
            } else {
                n3 = 1;
            }
            return n3 != 0;
        })).collect(Collectors.toList());
    }

    private boolean b(TileObject tileObject) {
        return 2;
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
        void var47;
        void var48;
        void var49;
        void var50;
        l var51;
        int n2 = 1;
        Tile tile = this.a(client, worldPoint);
        if ((this.a(tile == 0) ? 1 : 0)) {
            return Integer.MIN_VALUE;
        }
        var52 += 100;
        if ((var51.c((Tile == 0)var50, (Client)var49) ? 1 : 0)) {
            var52 -= 500;
            0;
            if (-(0x34 ^ 0x30) > 0) {
                return (6 ^ 0x44) & ~(0x63 ^ 0x21);
            }
        } else {
            var52 += 200;
        }
        WorldPoint var53 = var48.iterator();
        while ((var53.hasNext( != 0) ? 1 : 0)) {
            NPC var54 = (NPC)var53.next();
            int var55 = var47.distanceTo(var54.getWorldLocation());
            var52 += Math.max(1, 6 - var55);
            0;
            if (((0xCD ^ 0xAE) & ~(0x7C ^ 0x1F)) < (0x9F ^ 0x9B)) continue;
            return (2 ^ 5) & ~(0x90 ^ 0x97);
        }
        var53 = var49.getLocalPlayer().getWorldLocation();
        if (!(var47.getX() != var53.getX()) || (var47.getY() == var53.getY())) {
            var52 += 50;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Tile tile, List<NPC> list) {
        void var56;
        if ((this.b(tile, Static.getClient( == 0)) ? 1 : 0)) {
            return 1;
        }
        Iterator var57 = var56.iterator();
        while ((var57.hasNext( != 0) ? 1 : 0)) {
            void var58;
            l var59;
            NPC var60 = (NPC)var57.next();
            if ((var59.blllllllllllllllIlIlIIIIlIIllIIlI) && (var59.a(var58.getWorldLocation( != 0), var60.getWorldLocation()) ? 1 : 0)) {
                return 1;
            }
            if ((!(var59.c(var60 == 0) ? 1 : 0) || (var59.dlllllllllllllllIlIlIIIIlIIllIIlI)) && (var59.a(TilelllllllllllllllIlIlIIIIlIIllIlIl, var60, Static.getClient()) ? 1 : 0)) {
                return 1;
            }
            0;
            if ((0x84 ^ 0x80) > 0) continue;
            return ((0x2B ^ 0x78) & ~(0x28 ^ 0x7B)) != 0;
        }
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean z() {
        void var61;
        0;
        int n3 = f.p();
        e e2 = e.values()[n3];
        List list = NPCs.getAll();
        b[] bArray = e2.h();
        int n4 = bArray.length;
        int var62 = 1;
        while ((var62 < (int)var61)) {
            void var63;
            void var64;
            void var65 = var64[var62];
            Iterator var66 = var63.iterator();
            while ((var66.hasNext( != 0) ? 1 : 0)) {
                l var67;
                NPC var68 = (NPC)var66.next();
                n cfr_ignored_0 = var67.ai;
                0;
                int n5 = n.g(var68);
                boolean var69 = var67.a((b)var65);
                System.out.println("NPC ID: " + var68.getId() + " isSafeSpotted: " + n5 + " shouldSafeSpot: " + var69);
                if ((Arrays.stream(var65.c( != 0)).anyMatch(n2 -> {
                    boolean bl;
                    if ((n2 == var68.getId())) {
                        bl = 2;
                        0;
                        if (1 < 0) {
                            return ((0x62 ^ 0x2F ^ (0x62 ^ 0x65)) & (0xE1 ^ 0x8C ^ (0x4B ^ 0x6C) ^ -1)) != 0;
                        }
                    } else {
                        bl = 1;
                    }
                    return bl;
                }) ? 1 : 0) && (n5 == 0)) {
                    return var69;
                }
                0;
                if (3 == 3) continue;
                return ((0x29 ^ 0x7E) & ~(0 ^ 0x57)) != 0;
            }
            ++var62;
            0;
            if (-1 <= 1) continue;
            return ((0x47 ^ 0x5D) & ~(0x42 ^ 0x58)) != 0;
        }
        return 1;
    }

    private boolean d(NPC nPC) {
        boolean bl;
        if (((Object)b.a(nPC.getId()).b() == (Object)b.a(nPC.getId()).b()2)a.MAGIC)) {
            bl = 2;
            0;
            if (3 <= ((0x9D ^ 0x81) & ~(0xBD ^ 0xA1))) {
                return ((0xB4 ^ 0x98) & ~(0x9D ^ 0xB1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(Tile tile, Client client) {
        boolean bl;
        void var70;
        void var71;
        void var72;
        void var73;
        int n2 = tile.getSceneLocation().getX();
        int n3 = tile.getSceneLocation().getY();
        int n4 = client.getPlane();
        if (!(client.getCollisionMaps( != null)) || !(n4 >= 0) || (n4 >= client.getCollisionMaps().length)) {
            return 1;
        }
        int[][] var74 = var73.getCollisionMaps()[var72].getFlags();
        if (!((int >= 0)var71) || !((int >= 0)var70) || !((int)var71 < var74.length) || ((int)var70 >= var74[var71].length)) {
            return 1;
        }
        if (var74[var71][var70] == 0) {
            bl = 2;
            0;
            if (3 == -1) {
                return ((0x73 ^ 0x13) & ~(3 ^ 0x63)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
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
        if ((n4 <= n2 = (int)(0.05 * (double)n3))) {
            bl = 2;
            0;
            if (1 < 0) {
                return ((109 + 219 - 81 + 6 ^ 87 + 48 - -19 + 39) & (86 + 121 - 136 + 98 ^ 57 + 72 - 39 + 59 ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    private boolean b(Tile tile) {
        boolean bl;
        if (!(tile.getWallObject( == null)) || (Arrays.stream(tile.getGameObjects( != 0)).anyMatch(Objects::nonNull) ? 1 : 0)) {
            bl = 2;
            0;
            if (-(0x78 ^ 0x7C) >= 0) {
                return ((0x7C ^ 0x49) & ~(0x7B ^ 0x4E)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }
}

