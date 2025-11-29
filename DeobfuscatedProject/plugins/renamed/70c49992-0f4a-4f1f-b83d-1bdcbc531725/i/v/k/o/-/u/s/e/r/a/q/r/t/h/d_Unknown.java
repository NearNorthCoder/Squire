/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.S_Unknown;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.e;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@Singleton
public class d_Unknown {
    private final /* synthetic */ Client D;
    private static final /* synthetic */ WorldArea C;
    private static final /* synthetic */ WorldArea B;
    private static final /* synthetic */ WorldArea z;
    @Inject
    private /* synthetic */ SquireVorkathPlugin x;
    private final /* synthetic */ Set<e> F;
    private static final /* synthetic */ WorldArea A;
    private static /* synthetic */ String[] lIlIllIIllIII;
    private final /* synthetic */ f E;
    private static /* synthetic */ int[] lIlIllIIllIIl;
    @Inject
    private /* synthetic */ SquireVorkathConfig y;

    @Subscribe
    private void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        if (d.llIIIIIIlIlllll(projectile.getId(), lIlIllIIllIIl[11])) {
            this.F.add(new e(projectile, this.D.getTickCount(), this.D.getLocalPlayer().getWorldLocation()));
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint o() {
        void var5_5;
        void var4_4;
        void var6;
        d var22;
        List list;
        S s2 = this.r();
        if (d.llIIIIIIlIllIlI(s2)) {
            return Players.getLocal().getWorldLocation();
        }
        int[] nArray = new int[lIlIllIIllIIl[1]];
        nArray[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[3];
        Projectile var17 = Projectiles.getNearest((int[])nArray);
        if (d.llIIIIIIlIllIlI(var17)) {
            list = null;
            0;
            if (3 < -1) {
                return null;
            }
        } else {
            list = d.a(WorldPoint.fromLocal((Client)var22.D, (LocalPoint)var17.getTarget()).toWorldArea(), lIlIllIIllIIl[1]).toWorldPointList();
        }
        List var1 = list;
        Set<WorldPoint> var15 = var6.ak().stream().filter(worldPoint -> {
            boolean bl;
            if (!d.llIIIIIIlIlllIl(var1) || d.llIIIIIIlIllllI(var1.stream().noneMatch(worldPoint2 -> {
                boolean bl;
                if (d.llIIIIIIlIlllll(worldPoint.getX(), worldPoint2.getX())) {
                    bl = lIlIllIIllIIl[1];
                    0;
                    if (1 == ((93 + 50 - 95 + 137 ^ 49 + 36 - -74 + 31) & (170 + 165 - 293 + 136 ^ 140 + 137 - 205 + 109 ^ -1))) {
                        return ((0x2F ^ 0x20 ^ (0x23 ^ 0x63)) & (0xAC ^ 0xC5 ^ (0x4E ^ 0x68) ^ -1)) != 0;
                    }
                } else {
                    bl = lIlIllIIllIIl[2];
                }
                return bl;
            }) ? 1 : 0)) {
                bl = lIlIllIIllIIl[1];
                0;
                if (-1 >= 0) {
                    return false;
                }
            } else {
                bl = lIlIllIIllIIl[2];
            }
            return bl;
        }).collect(Collectors.toSet());
        var22.a(var15);
        NPC var11 = var22.E.c(lIlIllIIllIIl[1]);
        if (d.llIIIIIIlIllIlI(var11)) {
            return Players.getLocal().getWorldLocation().dx(lIlIllIIllIIl[1]);
        }
        return var4_4.stream().filter(arg_0 -> this.c((NPC)var5_5, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    private static void llIIIIIIlIllIII() {
        lIlIllIIllIII = new String[lIlIllIIllIIl[23]];
        d.lIlIllIIllIII[d.lIlIllIIllIIl[2]] = d."blowpipe";
        d.lIlIllIIllIII[d.lIlIllIIllIIl[1]] = d."blowpipe";
        d.lIlIllIIllIII[d.lIlIllIIllIIl[0]] = d."godsword";
        d.lIlIllIIllIII[d.lIlIllIIllIIl[13]] = d."lance";
        d.lIlIllIIllIII[d.lIlIllIIllIIl[14]] = d."lance";
        d.lIlIllIIllIII[d.lIlIllIIllIIl[15]] = d."fang";
        d.lIlIllIIllIII[d.lIlIllIIllIIl[16]] = d."fang";
    }

    private static String llIIIIIIlIlIlll(String var21, String var20) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIlIllIIllIIl[24]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlIllIIllIIl[0], var18);
            return new String(var10.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    @Inject
    public d(SquireVorkathPlugin squireVorkathPlugin, Client client, f f2) {
        this.F = new HashSet<e>();
        this.x = squireVorkathPlugin;
        this.D = client;
        this.E = f2;
    }

    private /* synthetic */ boolean c(NPC nPC, WorldPoint worldPoint) {
        return this.E.d(worldPoint, nPC.getWorldLocation());
    }

    private static String llIIIIIIlIlIllI(String var2, String var12) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIlIllIIllIIl[0], var14);
            return new String(var23.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        d.llIIIIIIlIllIIl();
        d.llIIIIIIlIllIII();
        z = new WorldArea(lIlIllIIllIIl[17], lIlIllIIllIIl[18], lIlIllIIllIIl[16], lIlIllIIllIIl[0], lIlIllIIllIIl[2]);
        A = new WorldArea(lIlIllIIllIIl[17], lIlIllIIllIIl[18], lIlIllIIllIIl[16], lIlIllIIllIIl[13], lIlIllIIllIIl[2]);
        B = new WorldArea(lIlIllIIllIIl[19], lIlIllIIllIIl[20], lIlIllIIllIIl[21], lIlIllIIllIIl[0], lIlIllIIllIIl[2]);
        C = new WorldArea(lIlIllIIllIIl[19], lIlIllIIllIIl[22], lIlIllIIllIIl[21], lIlIllIIllIIl[0], lIlIllIIllIIl[2]);
    }

    public WorldPoint q() {
        return Players.getLocal().getWorldLocation();
    }

    private static boolean llIIIIIIlIllIll(int n2) {
        return n2 == 0;
    }

    /*
     * Unable to fully structure code
     */
    private S r() {
        var1_1 = this.E.c(d.lIlIllIIllIIl[1]);
        if (d.llIIIIIIlIllIlI(var1_1)) {
            return null;
        }
        llllllllllllllIllIlIIlIllIllllll = new S(var9.D, var9.s());
        if (!d.llIIIIIIlIlllII(llllllllllllllIllIlIIlIlllIIIIII.getAnimation(), d.lIlIllIIllIIl[5])) ** GOTO lbl-1000
        v0 = new int[d.lIlIllIIllIIl[1]];
        v0[d.lIlIllIIllIIl[2]] = d.lIlIllIIllIIl[4];
        if (!d.llIIIIIIlIllIlI(TileObjects.getNearest((int[])v0))) ** GOTO lbl-1000
        v1 = new int[d.lIlIllIIllIIl[1]];
        v1[d.lIlIllIIllIIl[2]] = d.lIlIllIIllIIl[6];
        if (d.llIIIIIIlIlllIl(Projectiles.getNearest((int[])v1))) lbl-1000:
        // 3 sources

        {
            v2 = d.lIlIllIIllIIl[1];
            0;
            if (((147 + 132 - 150 + 21 ^ 91 + 79 - 45 + 73) & (52 ^ 90 ^ (176 ^ 142) ^ -1)) != 0) {
                return null;
            }
        } else {
            v2 = d.lIlIllIIllIIl[2];
        }
        var3_3 = v2;
        this.b((S)var2_2);
        this.a((S)var2_2);
        this.a(var3_3, (S)var2_2);
        return var2_2;
    }

    private void b(S s2) {
        int[] nArray = new int[lIlIllIIllIIl[1]];
        nArray[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[3];
        Stream<WorldArea> stream = Projectiles.getAll((int[])nArray).stream().map(projectile -> d.a(WorldPoint.fromLocal((Client)this.D, (LocalPoint)projectile.getTarget()).toWorldArea(), lIlIllIIllIIl[1]));
        S s3 = s2;
        Objects.requireNonNull(s3);
        0;
        stream.forEach(worldArea -> {
            WorldArea[] worldAreaArray = new WorldArea[lIlIllIIllIIl[1]];
            worldAreaArray[d.lIlIllIIllIIl[2]] = worldArea;
            s3.a(worldAreaArray);
        });
        int[] nArray2 = new int[lIlIllIIllIIl[1]];
        nArray2[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[6];
        Stream<WorldArea> stream2 = Projectiles.getAll((int[])nArray2).stream().map(projectile -> WorldPoint.fromLocal((Client)this.D, (LocalPoint)projectile.getTarget()).toWorldArea());
        S s4 = s2;
        Objects.requireNonNull(s4);
        0;
        stream2.forEach(worldArea -> {
            WorldArea[] worldAreaArray = new WorldArea[lIlIllIIllIIl[1]];
            worldAreaArray[d.lIlIllIIllIIl[2]] = worldArea;
            s4.a(worldAreaArray);
        });
    }

    private WorldArea s() {
        WorldArea worldArea;
        int var8;
        int n2;
        int n3;
        int n4;
        int var19;
        int n5;
        if (!d.llIIIIIIlIllIll(Inventory.contains(item -> item.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[16]])) ? 1 : 0) || d.llIIIIIIlIllllI(Equipment.contains(item -> item.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[15]])) ? 1 : 0)) {
            n5 = lIlIllIIllIIl[1];
            0;
            if (1 != 1) {
                return null;
            }
        } else {
            n5 = lIlIllIIllIIl[2];
        }
        if (!d.llIIIIIIlIllIll(var19 = n5) || !d.llIIIIIIlIllIll(Inventory.contains(item -> item.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[14]])) ? 1 : 0) || d.llIIIIIIlIllllI(Equipment.contains(item -> item.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[13]])) ? 1 : 0)) {
            n4 = lIlIllIIllIIl[1];
            0;
            if (-(0x2E ^ 0x2A) >= 0) {
                return null;
            }
        } else {
            n4 = lIlIllIIllIIl[2];
        }
        if (!d.llIIIIIIlIllIll(var19 = n4) || d.llIIIIIIlIllllI(Equipment.contains(item -> item.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[0]])) ? 1 : 0)) {
            n3 = lIlIllIIllIIl[1];
            0;
            if (((0x8D ^ 0xAC) & ~(0x7B ^ 0x5A)) != ((0x5A ^ 0x4D) & ~(0xB4 ^ 0xA3))) {
                return null;
            }
        } else {
            n3 = var19 = lIlIllIIllIIl[2];
        }
        if (!d.llIIIIIIlIllIll(Inventory.contains(item -> item.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[1]])) ? 1 : 0) || d.llIIIIIIlIllllI(Equipment.contains(item -> item.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[2]])) ? 1 : 0)) {
            n2 = lIlIllIIllIIl[1];
            0;
            if (1 == 3) {
                return null;
            }
        } else {
            n2 = var8 = lIlIllIIllIIl[2];
        }
        if (d.llIIIIIIlIllllI(var19)) {
            return A;
        }
        if (d.llIIIIIIlIllllI(var8)) {
            worldArea = B;
            0;
            if (2 < -1) {
                return null;
            }
        } else {
            worldArea = C;
        }
        return worldArea;
    }

    private static boolean llIIIIIIlIllIlI(Object object) {
        return object == null;
    }

    private void a(Set<WorldPoint> set) {
        Set<WorldPoint> set2 = new S(this.D, this.s()).ak();
        this.x.b().c(set2.stream().filter(worldPoint -> {
            boolean bl;
            if (d.llIIIIIIlIllIll(set.contains(worldPoint) ? 1 : 0)) {
                bl = lIlIllIIllIIl[1];
                0;
                if (1 < 0) {
                    return false;
                }
            } else {
                bl = lIlIllIIllIIl[2];
            }
            return bl;
        }).collect(Collectors.toSet()));
        this.x.b().b(set);
    }

    public WorldPoint n() {
        List list;
        S s2 = this.r();
        if (d.llIIIIIIlIllIlI(s2)) {
            return Players.getLocal().getWorldLocation();
        }
        int[] nArray = new int[lIlIllIIllIIl[1]];
        nArray[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[3];
        Projectile var4 = Projectiles.getNearest((int[])nArray);
        if (d.llIIIIIIlIllIlI(var4)) {
            list = null;
            0;
            if (((93 + 111 - 130 + 70 ^ 26 + 7 - -107 + 40) & (0x15 ^ 0x61 ^ (0x54 ^ 4) ^ -1)) < ((0x4C ^ 0x46 ^ (0x88 ^ 0xC6)) & (0x25 ^ 0x3A ^ (0xC3 ^ 0x98) ^ -1))) {
                return null;
            }
        } else {
            d var3;
            list = d.a(WorldPoint.fromLocal((Client)var3.D, (LocalPoint)var4.getTarget()).toWorldArea(), lIlIllIIllIIl[1]).toWorldPointList();
        }
        List list2 = list;
        Set<WorldPoint> set = s2.ak().stream().filter(worldPoint -> {
            boolean bl;
            if (!d.llIIIIIIlIlllIl(list2) || d.llIIIIIIlIllllI(list2.stream().noneMatch(worldPoint2 -> {
                boolean bl;
                if (d.llIIIIIIlIlllll(worldPoint.getX(), worldPoint2.getX())) {
                    bl = lIlIllIIllIIl[1];
                    0;
                    if (((0x12 ^ 0x71 ^ (0x5A ^ 0x71)) & (0x18 ^ 0x14 ^ (7 ^ 0x43) ^ -1)) > 0) {
                        return ((0x24 ^ 0xB ^ (0x4F ^ 0x74)) & (0x2A ^ 9 ^ (0x4F ^ 0x78) ^ -1)) != 0;
                    }
                } else {
                    bl = lIlIllIIllIIl[2];
                }
                return bl;
            }) ? 1 : 0)) {
                bl = lIlIllIIllIIl[1];
                0;
                if (((0x44 ^ 0x4D ^ 1) & (0x6D ^ 0x26 ^ (0x41 ^ 2) ^ -1)) > ((0xDD ^ 0x97 ^ (0x62 ^ 0x12)) & (0x2D ^ 0x41 ^ (0x75 ^ 0x23) ^ -1))) {
                    return ((66 + 171 - 170 + 163 ^ 131 + 99 - 137 + 72) & (0xDA ^ 0xC7 ^ (0x1D ^ 0x43) ^ -1)) != 0;
                }
            } else {
                bl = lIlIllIIllIIl[2];
            }
            return bl;
        }).collect(Collectors.toSet());
        this.a(set);
        return set.stream().min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(WorldPoint worldPoint) {
        int n2;
        void var25;
        if (d.llIIIIIIlIlllll(worldPoint.getY() % lIlIllIIllIIl[7], lIlIllIIllIIl[8])) {
            return lIlIllIIllIIl[2];
        }
        if (d.llIIIIIIlIlllll(var25.getY() % lIlIllIIllIIl[7], lIlIllIIllIIl[9])) {
            int[] nArray = new int[lIlIllIIllIIl[1]];
            nArray[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
            return TileObjects.within((WorldArea)var25.dy(lIlIllIIllIIl[1]).toWorldArea(), (int[])nArray).isEmpty();
        }
        if (!d.llIIIIIIlIlllll(var25.getY() % lIlIllIIllIIl[7], lIlIllIIllIIl[10])) return lIlIllIIllIIl[2];
        int[] nArray = new int[lIlIllIIllIIl[1]];
        nArray[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
        if (d.llIIIIIIlIllllI(TileObjects.within((WorldArea)var25.dy(lIlIllIIllIIl[1]).toWorldArea(), (int[])nArray).isEmpty() ? 1 : 0)) {
            int[] nArray2 = new int[lIlIllIIllIIl[1]];
            nArray2[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
            if (d.llIIIIIIlIllllI(TileObjects.within((WorldArea)var25.dy(lIlIllIIllIIl[0]).toWorldArea(), (int[])nArray2).isEmpty() ? 1 : 0)) {
                n2 = lIlIllIIllIIl[1];
                0;
                if (null == null) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIllIIllIIl[2];
        return n2 != 0;
    }

    private static void llIIIIIIlIllIIl() {
        lIlIllIIllIIl = new int[25];
        d.lIlIllIIllIIl[0] = 2;
        d.lIlIllIIllIIl[1] = 1;
        d.lIlIllIIllIIl[2] = (0x2A ^ 0xF) & ~(0x36 ^ 0x13);
        d.lIlIllIIllIIl[3] = 0xFFFFE5CB & 0x1FFD;
        d.lIlIllIIllIIl[4] = -(0xFFFF96EF & 0x6B16) & (0xFFFFFF1D & 0x7FE7);
        d.lIlIllIIllIIl[5] = 0xFFFFDF3D & 0x3FD7;
        d.lIlIllIIllIIl[6] = -(0xFFFFDAD5 & 0x7F3F) & (0xFFFFDFDF & Short.MAX_VALUE);
        d.lIlIllIIllIIl[7] = 1 ^ 0x74 ^ (0x13 ^ 0x26);
        d.lIlIllIIllIIl[8] = 0x72 ^ 0x6F;
        d.lIlIllIIllIIl[9] = 0x35 ^ 0x29;
        d.lIlIllIIllIIl[10] = 2 ^ 0x1E ^ (0x25 ^ 0x22);
        d.lIlIllIIllIIl[11] = 0xFFFFFDDE & 0x7EB;
        d.lIlIllIIllIIl[12] = -1;
        d.lIlIllIIllIIl[13] = 3;
        d.lIlIllIIllIIl[14] = 0xA7 ^ 0xA3;
        d.lIlIllIIllIIl[15] = 0x49 ^ 0x43 ^ (0x36 ^ 0x39);
        d.lIlIllIIllIIl[16] = 31 + 112 - 67 + 55 ^ 102 + 49 - 94 + 76;
        d.lIlIllIIllIIl[17] = -(0xFFFFFFA7 & 0x2579) & (0xFFFFBDFD & 0x6FFF);
        d.lIlIllIIllIIl[18] = 0xFFFF9FFF & 0x6FDB;
        d.lIlIllIIllIIl[19] = -(0xFFFFA715 & 0x78EF) & (0xFFFFEDDF & 0x3AFF);
        d.lIlIllIIllIIl[20] = -(0x8E ^ 0xA8) & (0xFFFF8FFD & Short.MAX_VALUE);
        d.lIlIllIIllIIl[21] = 0xA0 ^ 0xBA ^ (0x67 ^ 0x74);
        d.lIlIllIIllIIl[22] = -(0xFFFFC4AB & 0x7B56) & (0xFFFFCFFF & 0x7FD7);
        d.lIlIllIIllIIl[23] = 0x7A ^ 0x7D;
        d.lIlIllIIllIIl[24] = 0x25 ^ 0x77 ^ (0x2A ^ 0x70);
    }

    public static WorldArea a(WorldArea worldArea, int n2) {
        return new WorldArea(worldArea.getX() - n2, worldArea.getY() - n2, worldArea.getWidth() + lIlIllIIllIIl[0] * n2, worldArea.getHeight() + lIlIllIIllIIl[0] * n2, worldArea.getPlane());
    }

    private static boolean llIIIIIIlIlllIl(Object object) {
        return object != null;
    }

    private static boolean llIIIIIIlIlllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint p() {
        void var1_1;
        List list;
        d var13;
        if (d.llIIIIIIlIllIll(this.E.C() ? 1 : 0)) {
            return this.o();
        }
        S var5 = var13.r();
        if (d.llIIIIIIlIllIlI(var5)) {
            return Players.getLocal().getWorldLocation();
        }
        int[] nArray = new int[lIlIllIIllIIl[1]];
        nArray[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[3];
        Projectile var24 = Projectiles.getNearest((int[])nArray);
        if (d.llIIIIIIlIllIlI(var24)) {
            list = null;
            0;
            if ((0x7A ^ 0x73 ^ (0x10 ^ 0x1C)) <= 0) {
                return null;
            }
        } else {
            list = d.a(WorldPoint.fromLocal((Client)var13.D, (LocalPoint)var24.getTarget()).toWorldArea(), lIlIllIIllIIl[1]).toWorldPointList();
        }
        List list2 = list;
        Set<WorldPoint> set = var1_1.ak().stream().filter(worldPoint -> {
            boolean bl;
            if (!d.llIIIIIIlIlllIl(list2) || d.llIIIIIIlIllllI(list2.stream().noneMatch(worldPoint2 -> {
                boolean bl;
                if (d.llIIIIIIlIlllll(worldPoint.getX(), worldPoint2.getX())) {
                    bl = lIlIllIIllIIl[1];
                    0;
                    if (3 <= -1) {
                        return false;
                    }
                } else {
                    bl = lIlIllIIllIIl[2];
                }
                return bl;
            }) ? 1 : 0)) {
                bl = lIlIllIIllIIl[1];
                0;
                if (-1 > ((0xED ^ 0xC1 ^ (0xEA ^ 0x81)) & (219 + 179 - 355 + 179 ^ 37 + 118 - 16 + 14 ^ -1))) {
                    return ((0xD3 ^ 0x8E ^ (0xFC ^ 0x9D)) & (127 + 73 - 90 + 19 ^ 60 + 94 - 60 + 95 ^ -1)) != 0;
                }
            } else {
                bl = lIlIllIIllIIl[2];
            }
            return bl;
        }).collect(Collectors.toSet());
        this.a(set);
        NPC nPC = this.E.c(lIlIllIIllIIl[1]);
        int[] nArray2 = new int[lIlIllIIllIIl[1]];
        nArray2[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
        List list3 = TileObjects.getAll((int[])nArray2);
        return set.stream().filter(worldPoint -> list3.stream().noneMatch(tileObject -> tileObject.getWorldLocation().equals((Object)worldPoint.dy(lIlIllIIllIIl[1])))).filter(worldPoint -> {
            boolean bl;
            if (!d.llIIIIIIlIllllI(this.E.C() ? 1 : 0) || d.llIIIIIIlIllllI(nPC.getWorldArea().isInMeleeDistance(worldPoint.dy(lIlIllIIllIIl[1])) ? 1 : 0)) {
                bl = lIlIllIIllIIl[1];
                0;
                if (-1 == (79 + 111 - 164 + 153 ^ 116 + 84 - 133 + 116)) {
                    return false;
                }
            } else {
                bl = lIlIllIIllIIl[2];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(this.n());
    }

    private static boolean llIIIIIIlIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIIlIlllII(int n2, int n3) {
        return n2 != n3;
    }

    private void a(S s2) {
        int[] nArray = new int[lIlIllIIllIIl[1]];
        nArray[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
        TileObjects.getAll((int[])nArray).forEach(tileObject -> {
            s2.j(tileObject.getWorldLocation());
            s2.j(tileObject.getWorldLocation().dy(lIlIllIIllIIl[12]));
        });
    }

    private static boolean llIIIIIIllIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    public WorldPoint t() {
        S s2 = this.r();
        if (d.llIIIIIIlIllIlI(s2)) {
            return Players.getLocal().getWorldLocation();
        }
        NPC nPC = this.E.c(lIlIllIIllIIl[1]);
        int[] nArray = new int[lIlIllIIllIIl[1]];
        nArray[d.lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
        List list = TileObjects.getAll((int[])nArray);
        return s2.ak().stream().filter(worldPoint -> {
            boolean bl;
            if (!d.llIIIIIIlIllllI(this.E.C() ? 1 : 0) || d.llIIIIIIlIllllI(nPC.getWorldArea().isInMeleeDistance(worldPoint) ? 1 : 0)) {
                bl = lIlIllIIllIIl[1];
                0;
                
                }
            } else {
                bl = lIlIllIIllIIl[2];
            }
            return bl;
        }).filter(worldPoint -> list.stream().noneMatch(tileObject -> {
            int n2;
            if (!d.llIIIIIIlIllIll(tileObject.getWorldLocation().equals(worldPoint) ? 1 : 0) || d.llIIIIIIlIllllI(tileObject.getWorldLocation().dy(lIlIllIIllIIl[12]).equals(worldPoint) ? 1 : 0)) {
                n2 = lIlIllIIllIIl[1];
                0;
                if (-1 >= 0) {
                    return ((156 + 144 - 211 + 102 ^ 95 + 89 - 59 + 40) & (0x9C ^ 0x99 ^ (0x26 ^ 0x39) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIllIIllIIl[2];
            }
            return n2 != 0;
        })).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    private void a(boolean bl, S s2) {
        if (d.llIIIIIIlIllIll(bl ? 1 : 0)) {
            return;
        }
        this.F.removeIf(e2 -> {
            boolean bl;
            if (d.llIIIIIIllIIIII(this.D.getTickCount() - e2.v(), lIlIllIIllIIl[1])) {
                bl = lIlIllIIllIIl[1];
                0;
                if (((0x25 ^ 0x2D) & ~(0x64 ^ 0x6C)) != 0) {
                    return false;
                }
            } else {
                bl = lIlIllIIllIIl[2];
            }
            return bl;
        });
        0;
        s2.b((WorldPoint worldPoint) -> this.q().equals(worldPoint));
        s2.b((WorldPoint worldPoint) -> this.F.stream().anyMatch(e2 -> e2.w().equals(worldPoint)));
    }
}

