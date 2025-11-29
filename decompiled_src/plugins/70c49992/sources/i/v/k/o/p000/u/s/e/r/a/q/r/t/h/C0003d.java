package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
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
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
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
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/d.class */
public class C0003d {
    private final /* synthetic */ Client D;
    private static final /* synthetic */ WorldArea C;
    private static final /* synthetic */ WorldArea B;
    private static final /* synthetic */ WorldArea z;
    @Inject
    private /* synthetic */ SquireVorkathPlugin x;
    private final /* synthetic */ Set<C0004e> F = new HashSet();
    private static final /* synthetic */ WorldArea A;
    private static /* synthetic */ String[] lIlIllIIllIII;
    private final /* synthetic */ C0005f E;
    private static /* synthetic */ int[] lIlIllIIllIIl;
    @Inject
    private /* synthetic */ SquireVorkathConfig y;

    @Subscribe
    private void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        if (llIIIIIIlIlllll(projectile.getId(), lIlIllIIllIIl[11])) {
            this.F.add(new C0004e(projectile, this.D.getTickCount(), this.D.getLocalPlayer().getWorldLocation()));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    public WorldPoint o() {
        List worldPointList;
        S r = r();
        if (llIIIIIIlIllIlI(r)) {
            return Players.getLocal().getWorldLocation();
        }
        int[] iArr = new int[lIlIllIIllIIl[1]];
        iArr[lIlIllIIllIIl[2]] = lIlIllIIllIIl[3];
        Projectile nearest = Projectiles.getNearest(iArr);
        if (llIIIIIIlIllIlI(nearest)) {
            worldPointList = null;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return null;
            }
        } else {
            worldPointList = a(WorldPoint.fromLocal(this.D, nearest.getTarget()).toWorldArea(), lIlIllIIllIIl[1]).toWorldPointList();
        }
        List list = worldPointList;
        Set<WorldPoint> set = (Set) r.ak().stream().filter(worldPoint -> {
            if (!llIIIIIIlIlllIl(list) || llIIIIIIlIllllI(list.stream().noneMatch(worldPoint -> {
                if (llIIIIIIlIlllll(worldPoint.getX(), worldPoint.getX())) {
                    ?? r0 = lIlIllIIllIIl[1];
                    "".length();
                    return " ".length() == (((((93 + 50) - 95) + 137) ^ (((49 + 36) - (-74)) + 31)) & (((((170 + 165) - 293) + 136) ^ (((140 + 137) - 205) + 109)) ^ (-" ".length()))) ? ((47 ^ 32) ^ (35 ^ 99)) & (((172 ^ 197) ^ (78 ^ 104)) ^ (-" ".length())) : r0;
                }
                return lIlIllIIllIIl[2];
            }) ? 1 : 0)) {
                ?? r0 = lIlIllIIllIIl[1];
                "".length();
                return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIIllIIl[2];
        }).collect(Collectors.toSet());
        a(set);
        NPC c = this.E.c(lIlIllIIllIIl[1]);
        return llIIIIIIlIllIlI(c) ? Players.getLocal().getWorldLocation().dx(lIlIllIIllIIl[1]) : set.stream().filter(worldPoint2 -> {
            return this.E.d(worldPoint2, c.getWorldLocation());
        }).min(Comparator.comparingDouble(worldPoint3 -> {
            return worldPoint3.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation());
        })).orElse(null);
    }

    private static void llIIIIIIlIllIII() {
        lIlIllIIllIII = new String[lIlIllIIllIIl[23]];
        lIlIllIIllIII[lIlIllIIllIIl[2]] = llIIIIIIlIlIllI("ZC8R8iqtRbgPELbIRQ0noQ==", "AmdOF");
        lIlIllIIllIII[lIlIllIIllIIl[1]] = llIIIIIIlIlIllI("HjwywSf0WWkoufehz7tcQQ==", "zPJtv");
        lIlIllIIllIII[lIlIllIIllIIl[0]] = llIIIIIIlIlIlll("ggCHWvmYRzbCfEi3tWNVDg==", "BAUKb");
        lIlIllIIllIII[lIlIllIIllIIl[13]] = llIIIIIIlIlIlll("p9v/6yIxYFU=", "TbVli");
        lIlIllIIllIII[lIlIllIIllIIl[14]] = llIIIIIIlIlIllI("hcwj733yGJ4=", "cuQBA");
        lIlIllIIllIII[lIlIllIIllIIl[15]] = llIIIIIIlIlIlll("7Yr43LFeAW8=", "wIMWT");
        lIlIllIIllIII[lIlIllIIllIIl[16]] = llIIIIIIlIlIlll("q4MmSX1lPjU=", "udOtE");
    }

    private static String llIIIIIIlIlIlll(String llllllllllllllIllIlIIlIlIlIlllll, String llllllllllllllIllIlIIlIlIlIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIlIlIllllI.getBytes(StandardCharsets.UTF_8)), lIlIllIIllIIl[24]), "DES");
            Cipher llllllllllllllIllIlIIlIlIllIIIIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIlIlIllIIIIl.init(lIlIllIIllIIl[0], secretKeySpec);
            return new String(llllllllllllllIllIlIIlIlIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlIlIllIIIII) {
            llllllllllllllIllIlIIlIlIllIIIII.printStackTrace();
            return null;
        }
    }

    @Inject
    public C0003d(SquireVorkathPlugin squireVorkathPlugin, Client client, C0005f c0005f) {
        this.x = squireVorkathPlugin;
        this.D = client;
        this.E = c0005f;
    }

    private static String llIIIIIIlIlIllI(String llllllllllllllIllIlIIlIlIllIllII, String llllllllllllllIllIlIIlIlIllIlIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIlIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIlIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIIllIIl[0], llllllllllllllIllIlIIlIlIllIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlIlIllIllIl) {
            llllllllllllllIllIlIIlIlIllIllIl.printStackTrace();
            return null;
        }
    }

    static {
        llIIIIIIlIllIIl();
        llIIIIIIlIllIII();
        z = new WorldArea(lIlIllIIllIIl[17], lIlIllIIllIIl[18], lIlIllIIllIIl[16], lIlIllIIllIIl[0], lIlIllIIllIIl[2]);
        A = new WorldArea(lIlIllIIllIIl[17], lIlIllIIllIIl[18], lIlIllIIllIIl[16], lIlIllIIllIIl[13], lIlIllIIllIIl[2]);
        B = new WorldArea(lIlIllIIllIIl[19], lIlIllIIllIIl[20], lIlIllIIllIIl[21], lIlIllIIllIIl[0], lIlIllIIllIIl[2]);
        C = new WorldArea(lIlIllIIllIIl[19], lIlIllIIllIIl[22], lIlIllIIllIIl[21], lIlIllIIllIIl[0], lIlIllIIllIIl[2]);
    }

    public WorldPoint q() {
        return Players.getLocal().getWorldLocation();
    }

    private static boolean llIIIIIIlIllIll(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [i.v.k.o.-.u.s.e.r.a.q.r.t.h.f] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    private S r() {
        boolean z2;
        NPC c = this.E.c(lIlIllIIllIIl[1]);
        if (llIIIIIIlIllIlI(c)) {
            return null;
        }
        S s = new S(this.D, s());
        if (llIIIIIIlIlllII(c.getAnimation(), lIlIllIIllIIl[5])) {
            int[] iArr = new int[lIlIllIIllIIl[1]];
            iArr[lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
            if (llIIIIIIlIllIlI(TileObjects.getNearest(iArr))) {
                int[] iArr2 = new int[lIlIllIIllIIl[1]];
                iArr2[lIlIllIIllIIl[2]] = lIlIllIIllIIl[6];
                if (!llIIIIIIlIlllIl(Projectiles.getNearest(iArr2))) {
                    z2 = lIlIllIIllIIl[2];
                    b(s);
                    a(s);
                    a(z2, s);
                    return s;
                }
            }
        }
        ?? r0 = lIlIllIIllIIl[1];
        "".length();
        z2 = r0;
        if ((((((147 + 132) - 150) + 21) ^ (((91 + 79) - 45) + 73)) & (((52 ^ 90) ^ (176 ^ 142)) ^ (-" ".length()))) != 0) {
            return null;
        }
        b(s);
        a(s);
        a(z2, s);
        return s;
    }

    private void b(S s) {
        int[] iArr = new int[lIlIllIIllIIl[1]];
        iArr[lIlIllIIllIIl[2]] = lIlIllIIllIIl[3];
        Stream map = Projectiles.getAll(iArr).stream().map(projectile -> {
            return a(WorldPoint.fromLocal(this.D, projectile.getTarget()).toWorldArea(), lIlIllIIllIIl[1]);
        });
        Objects.requireNonNull(s);
        "".length();
        map.forEach(worldArea -> {
            WorldArea[] worldAreaArr = new WorldArea[lIlIllIIllIIl[1]];
            worldAreaArr[lIlIllIIllIIl[2]] = worldArea;
            s.a(worldAreaArr);
        });
        int[] iArr2 = new int[lIlIllIIllIIl[1]];
        iArr2[lIlIllIIllIIl[2]] = lIlIllIIllIIl[6];
        Stream map2 = Projectiles.getAll(iArr2).stream().map(projectile2 -> {
            return WorldPoint.fromLocal(this.D, projectile2.getTarget()).toWorldArea();
        });
        Objects.requireNonNull(s);
        "".length();
        map2.forEach(worldArea2 -> {
            WorldArea[] worldAreaArr = new WorldArea[lIlIllIIllIIl[1]];
            worldAreaArr[lIlIllIIllIIl[2]] = worldArea2;
            s.a(worldAreaArr);
        });
    }

    private WorldArea s() {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!llIIIIIIlIllIll(Inventory.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[16]]);
        }) ? 1 : 0) || llIIIIIIlIllllI(Equipment.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[15]]);
        }) ? 1 : 0)) {
            i2 = lIlIllIIllIIl[1];
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        } else {
            i2 = lIlIllIIllIIl[2];
        }
        int llllllllllllllIllIlIIlIllIlllIll = i2;
        if (llIIIIIIlIllIll(llllllllllllllIllIlIIlIllIlllIll) && llIIIIIIlIllIll(Inventory.contains(item3 -> {
            return item3.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[14]]);
        }) ? 1 : 0) && !llIIIIIIlIllllI(Equipment.contains(item4 -> {
            return item4.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[13]]);
        }) ? 1 : 0)) {
            i3 = lIlIllIIllIIl[2];
        } else {
            i3 = lIlIllIIllIIl[1];
            "".length();
            if ((-(46 ^ 42)) >= 0) {
                return null;
            }
        }
        int llllllllllllllIllIlIIlIllIlllIll2 = i3;
        if (!llIIIIIIlIllIll(llllllllllllllIllIlIIlIllIlllIll2) || llIIIIIIlIllllI(Equipment.contains(item5 -> {
            return item5.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[0]]);
        }) ? 1 : 0)) {
            i4 = lIlIllIIllIIl[1];
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return null;
            }
        } else {
            i4 = lIlIllIIllIIl[2];
        }
        int llllllllllllllIllIlIIlIllIlllIll3 = i4;
        if (!llIIIIIIlIllIll(Inventory.contains(item6 -> {
            return item6.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[1]]);
        }) ? 1 : 0) || llIIIIIIlIllllI(Equipment.contains(item7 -> {
            return item7.getName().toLowerCase().contains(lIlIllIIllIII[lIlIllIIllIIl[2]]);
        }) ? 1 : 0)) {
            i5 = lIlIllIIllIIl[1];
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        } else {
            i5 = lIlIllIIllIIl[2];
        }
        int i6 = i5;
        if (llIIIIIIlIllllI(llllllllllllllIllIlIIlIllIlllIll3)) {
            return A;
        }
        if (llIIIIIIlIllllI(i6)) {
            WorldArea worldArea = B;
            "".length();
            if ("  ".length() < (-" ".length())) {
                return null;
            }
            return worldArea;
        }
        return C;
    }

    private static boolean llIIIIIIlIllIlI(Object obj) {
        return obj == null;
    }

    private void a(Set<WorldPoint> set) {
        this.x.b().c((Set) new S(this.D, s()).ak().stream().filter(worldPoint -> {
            if (llIIIIIIlIllIll(set.contains(worldPoint) ? 1 : 0)) {
                ?? r0 = lIlIllIIllIIl[1];
                "".length();
                return " ".length() < 0 ? ((((101 + 66) - 129) + 100) ^ (((136 + 88) - 78) + 18)) & (((((86 + 118) - 151) + 75) ^ (((78 + 9) - 15) + 102)) ^ (-" ".length())) : r0;
            }
            return lIlIllIIllIIl[2];
        }).collect(Collectors.toSet()));
        this.x.b().b(set);
    }

    public WorldPoint n() {
        List worldPointList;
        S r = r();
        if (llIIIIIIlIllIlI(r)) {
            return Players.getLocal().getWorldLocation();
        }
        int[] iArr = new int[lIlIllIIllIIl[1]];
        iArr[lIlIllIIllIIl[2]] = lIlIllIIllIIl[3];
        Projectile nearest = Projectiles.getNearest(iArr);
        if (llIIIIIIlIllIlI(nearest)) {
            worldPointList = null;
            "".length();
            if ((((((93 + 111) - 130) + 70) ^ (((26 + 7) - (-107)) + 40)) & (((21 ^ 97) ^ (84 ^ 4)) ^ (-" ".length()))) < (((76 ^ 70) ^ (136 ^ 198)) & (((37 ^ 58) ^ (195 ^ 152)) ^ (-" ".length())))) {
                return null;
            }
        } else {
            worldPointList = a(WorldPoint.fromLocal(this.D, nearest.getTarget()).toWorldArea(), lIlIllIIllIIl[1]).toWorldPointList();
        }
        List list = worldPointList;
        Set<WorldPoint> set = (Set) r.ak().stream().filter(worldPoint -> {
            if (!llIIIIIIlIlllIl(list) || llIIIIIIlIllllI(list.stream().noneMatch(worldPoint -> {
                if (llIIIIIIlIlllll(worldPoint.getX(), worldPoint.getX())) {
                    ?? r0 = lIlIllIIllIIl[1];
                    "".length();
                    return (((18 ^ 113) ^ (90 ^ 113)) & (((24 ^ 20) ^ (7 ^ 67)) ^ (-" ".length()))) > 0 ? ((36 ^ 11) ^ (79 ^ 116)) & (((42 ^ 9) ^ (79 ^ 120)) ^ (-" ".length())) : r0;
                }
                return lIlIllIIllIIl[2];
            }) ? 1 : 0)) {
                ?? r0 = lIlIllIIllIIl[1];
                "".length();
                return (((68 ^ 77) ^ " ".length()) & (((109 ^ 38) ^ (65 ^ 2)) ^ (-" ".length()))) > (((221 ^ 151) ^ (98 ^ 18)) & (((45 ^ 65) ^ (117 ^ 35)) ^ (-" ".length()))) ? ((((66 + 171) - 170) + 163) ^ (((131 + 99) - 137) + 72)) & (((218 ^ 199) ^ (29 ^ 67)) ^ (-" ".length())) : r0;
            }
            return lIlIllIIllIIl[2];
        }).collect(Collectors.toSet());
        a(set);
        return set.stream().min(Comparator.comparingDouble(worldPoint2 -> {
            return worldPoint2.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation());
        })).orElse(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    private boolean a(WorldPoint worldPoint) {
        if (llIIIIIIlIlllll(worldPoint.getY() % lIlIllIIllIIl[7], lIlIllIIllIIl[8])) {
            return lIlIllIIllIIl[2];
        }
        if (llIIIIIIlIlllll(worldPoint.getY() % lIlIllIIllIIl[7], lIlIllIIllIIl[9])) {
            WorldArea worldArea = worldPoint.dy(lIlIllIIllIIl[1]).toWorldArea();
            int[] iArr = new int[lIlIllIIllIIl[1]];
            iArr[lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
            return TileObjects.within(worldArea, iArr).isEmpty();
        } else if (llIIIIIIlIlllll(worldPoint.getY() % lIlIllIIllIIl[7], lIlIllIIllIIl[10])) {
            WorldArea worldArea2 = worldPoint.dy(lIlIllIIllIIl[1]).toWorldArea();
            int[] iArr2 = new int[lIlIllIIllIIl[1]];
            iArr2[lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
            if (llIIIIIIlIllllI(TileObjects.within(worldArea2, iArr2).isEmpty() ? 1 : 0)) {
                WorldArea worldArea3 = worldPoint.dy(lIlIllIIllIIl[0]).toWorldArea();
                int[] iArr3 = new int[lIlIllIIllIIl[1]];
                iArr3[lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
                if (llIIIIIIlIllllI(TileObjects.within(worldArea3, iArr3).isEmpty() ? 1 : 0)) {
                    ?? r0 = lIlIllIIllIIl[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIllIIllIIl[2];
        } else {
            return lIlIllIIllIIl[2];
        }
    }

    private static void llIIIIIIlIllIIl() {
        lIlIllIIllIIl = new int[25];
        lIlIllIIllIIl[0] = "  ".length();
        lIlIllIIllIIl[1] = " ".length();
        lIlIllIIllIIl[2] = (42 ^ 15) & ((54 ^ 19) ^ (-1));
        lIlIllIIllIIl[3] = (-6709) & 8189;
        lIlIllIIllIIl[4] = (-((-26897) & 27414)) & (-227) & 32743;
        lIlIllIIllIIl[5] = (-8387) & 16343;
        lIlIllIIllIIl[6] = (-((-9515) & 32575)) & (-8225) & 32767;
        lIlIllIIllIIl[7] = (1 ^ 116) ^ (19 ^ 38);
        lIlIllIIllIIl[8] = 114 ^ 111;
        lIlIllIIllIIl[9] = 53 ^ 41;
        lIlIllIIllIIl[10] = (2 ^ 30) ^ (37 ^ 34);
        lIlIllIIllIIl[11] = (-546) & 2027;
        lIlIllIIllIIl[12] = -" ".length();
        lIlIllIIllIIl[13] = "   ".length();
        lIlIllIIllIIl[14] = 167 ^ 163;
        lIlIllIIllIIl[15] = (73 ^ 67) ^ (54 ^ 57);
        lIlIllIIllIIl[16] = (((31 + 112) - 67) + 55) ^ (((102 + 49) - 94) + 76);
        lIlIllIIllIIl[17] = (-((-89) & 9593)) & (-16899) & 28671;
        lIlIllIIllIIl[18] = (-24577) & 28635;
        lIlIllIIllIIl[19] = (-((-22763) & 30959)) & (-4641) & 15103;
        lIlIllIIllIIl[20] = (-(142 ^ 168)) & (-28675) & 32767;
        lIlIllIIllIIl[21] = (160 ^ 186) ^ (103 ^ 116);
        lIlIllIIllIIl[22] = (-((-15189) & 31574)) & (-12289) & 32727;
        lIlIllIIllIIl[23] = 122 ^ 125;
        lIlIllIIllIIl[24] = (37 ^ 119) ^ (42 ^ 112);
    }

    public static WorldArea a(WorldArea worldArea, int i2) {
        return new WorldArea(worldArea.getX() - i2, worldArea.getY() - i2, worldArea.getWidth() + (lIlIllIIllIIl[0] * i2), worldArea.getHeight() + (lIlIllIIllIIl[0] * i2), worldArea.getPlane());
    }

    private static boolean llIIIIIIlIlllIl(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIIIlIlllll(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    public WorldPoint p() {
        List worldPointList;
        if (llIIIIIIlIllIll(this.E.C() ? 1 : 0)) {
            return o();
        }
        S r = r();
        if (llIIIIIIlIllIlI(r)) {
            return Players.getLocal().getWorldLocation();
        }
        int[] iArr = new int[lIlIllIIllIIl[1]];
        iArr[lIlIllIIllIIl[2]] = lIlIllIIllIIl[3];
        Projectile nearest = Projectiles.getNearest(iArr);
        if (llIIIIIIlIllIlI(nearest)) {
            worldPointList = null;
            "".length();
            if (((122 ^ 115) ^ (16 ^ 28)) <= 0) {
                return null;
            }
        } else {
            worldPointList = a(WorldPoint.fromLocal(this.D, nearest.getTarget()).toWorldArea(), lIlIllIIllIIl[1]).toWorldPointList();
        }
        List list = worldPointList;
        Set<WorldPoint> set = (Set) r.ak().stream().filter(worldPoint -> {
            if (!llIIIIIIlIlllIl(list) || llIIIIIIlIllllI(list.stream().noneMatch(worldPoint -> {
                if (llIIIIIIlIlllll(worldPoint.getX(), worldPoint.getX())) {
                    ?? r0 = lIlIllIIllIIl[1];
                    "".length();
                    return "   ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIllIIllIIl[2];
            }) ? 1 : 0)) {
                ?? r0 = lIlIllIIllIIl[1];
                "".length();
                return (-" ".length()) > (((237 ^ 193) ^ (234 ^ 129)) & (((((219 + 179) - 355) + 179) ^ (((37 + 118) - 16) + 14)) ^ (-" ".length()))) ? ((211 ^ 142) ^ (252 ^ 157)) & (((((127 + 73) - 90) + 19) ^ (((60 + 94) - 60) + 95)) ^ (-" ".length())) : r0;
            }
            return lIlIllIIllIIl[2];
        }).collect(Collectors.toSet());
        a(set);
        NPC c = this.E.c(lIlIllIIllIIl[1]);
        int[] iArr2 = new int[lIlIllIIllIIl[1]];
        iArr2[lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
        List all = TileObjects.getAll(iArr2);
        return set.stream().filter(worldPoint2 -> {
            return all.stream().noneMatch(tileObject -> {
                return tileObject.getWorldLocation().equals(worldPoint2.dy(lIlIllIIllIIl[1]));
            });
        }).filter(worldPoint3 -> {
            if (!llIIIIIIlIllllI(this.E.C() ? 1 : 0) || llIIIIIIlIllllI(c.getWorldArea().isInMeleeDistance(worldPoint3.dy(lIlIllIIllIIl[1])) ? 1 : 0)) {
                ?? r0 = lIlIllIIllIIl[1];
                "".length();
                return (-" ".length()) == ((((79 + 111) - 164) + 153) ^ (((116 + 84) - 133) + 116)) ? ((((8 + 17) - (-46)) + 77) ^ (((13 + 2) - (-121)) + 2)) & (((((70 + 163) - 127) + 60) ^ (((157 + 1) - 136) + 162)) ^ (-" ".length())) : r0;
            }
            return lIlIllIIllIIl[2];
        }).min(Comparator.comparingInt(worldPoint4 -> {
            return worldPoint4.distanceTo(Players.getLocal());
        })).orElse(n());
    }

    private static boolean llIIIIIIlIllllI(int i2) {
        return i2 != 0;
    }

    private static boolean llIIIIIIlIlllII(int i2, int i3) {
        return i2 != i3;
    }

    private void a(S s) {
        int[] iArr = new int[lIlIllIIllIIl[1]];
        iArr[lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
        TileObjects.getAll(iArr).forEach(tileObject -> {
            s.j(tileObject.getWorldLocation());
            s.j(tileObject.getWorldLocation().dy(lIlIllIIllIIl[12]));
        });
    }

    private static boolean llIIIIIIllIIIII(int i2, int i3) {
        return i2 >= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public WorldPoint t() {
        S r = r();
        if (llIIIIIIlIllIlI(r)) {
            return Players.getLocal().getWorldLocation();
        }
        NPC c = this.E.c(lIlIllIIllIIl[1]);
        int[] iArr = new int[lIlIllIIllIIl[1]];
        iArr[lIlIllIIllIIl[2]] = lIlIllIIllIIl[4];
        List all = TileObjects.getAll(iArr);
        return r.ak().stream().filter(worldPoint -> {
            if (!llIIIIIIlIllllI(this.E.C() ? 1 : 0) || llIIIIIIlIllllI(c.getWorldArea().isInMeleeDistance(worldPoint) ? 1 : 0)) {
                ?? r0 = lIlIllIIllIIl[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIIllIIl[2];
        }).filter(worldPoint2 -> {
            return all.stream().noneMatch(tileObject -> {
                if (!llIIIIIIlIllIll(tileObject.getWorldLocation().equals(worldPoint2) ? 1 : 0) || llIIIIIIlIllllI(tileObject.getWorldLocation().dy(lIlIllIIllIIl[12]).equals(worldPoint2) ? 1 : 0)) {
                    ?? r0 = lIlIllIIllIIl[1];
                    "".length();
                    return (-" ".length()) >= 0 ? ((((156 + 144) - 211) + 102) ^ (((95 + 89) - 59) + 40)) & (((156 ^ 153) ^ (38 ^ 57)) ^ (-" ".length())) : r0;
                }
                return lIlIllIIllIIl[2];
            });
        }).min(Comparator.comparingDouble(worldPoint3 -> {
            return worldPoint3.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation());
        })).orElse(null);
    }

    private void a(boolean z2, S s) {
        if (llIIIIIIlIllIll(z2 ? 1 : 0)) {
            return;
        }
        this.F.removeIf(c0004e -> {
            if (llIIIIIIllIIIII(this.D.getTickCount() - c0004e.v(), lIlIllIIllIIl[1])) {
                ?? r0 = lIlIllIIllIIl[1];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIIllIIl[2];
        });
        "".length();
        s.b(worldPoint -> {
            return q().equals(worldPoint);
        });
        s.b(worldPoint2 -> {
            return this.F.stream().anyMatch(c0004e2 -> {
                return c0004e2.w().equals(worldPoint2);
            });
        });
    }
}
