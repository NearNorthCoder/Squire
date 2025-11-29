package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Attacking boss", priority = 4, register = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/t.class */
public class C0019t extends AbstractC0013n {
    private final /* synthetic */ C0020u bA;
    private static /* synthetic */ int[] llIIlIllIlll;
    private static /* synthetic */ String[] llIIlIllIllI;
    private final /* synthetic */ C0001b bB;
    private /* synthetic */ boolean bC;

    private static void lllllIlllIllIl() {
        llIIlIllIllI = new String[llIIlIllIlll[5]];
        llIIlIllIllI[llIIlIllIlll[1]] = lllllIlllIlIll("0uEXH5rn44w=", "dsNjx");
        llIIlIllIllI[llIIlIllIlll[0]] = lllllIlllIllII("BA48CBku", "EzHiz");
    }

    public WorldPoint bs() {
        if (lllllIlllIllll(this.ba.V().aq())) {
            return null;
        }
        Player localPlayer = Static.getClient().getLocalPlayer();
        if (lllllIlllIllll(localPlayer)) {
            return null;
        }
        WorldPoint worldLocation = localPlayer.getWorldLocation();
        Stream map = TileObjects.getAll(tileObject -> {
            return Predicates.ids(C0004e.O).test(tileObject);
        }).stream().filter(tileObject2 -> {
            if (lllllIllllIlIl(tileObject2.getWorldLocation().distanceTo(worldLocation), llIIlIllIlll[4])) {
                ?? r0 = llIIlIllIlll[0];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIllIlll[1];
        }).map(tileObject3 -> {
            return this.bA.c(worldLocation, tileObject3.getWorldLocation());
        });
        C0020u c0020u = this.bA;
        Objects.requireNonNull(c0020u);
        "".length();
        Stream flatMap = map.filter(this::d).flatMap((v0) -> {
            return v0.stream();
        });
        C0020u c0020u2 = this.bA;
        Objects.requireNonNull(c0020u2);
        "".length();
        return (WorldPoint) flatMap.filter(this::o).max(Comparator.comparingDouble(worldPoint -> {
            return worldPoint.distanceToHypotenuse(worldLocation);
        })).orElse(null);
    }

    private static void lllllIlllIlllI() {
        llIIlIllIlll = new int[9];
        llIIlIllIlll[0] = " ".length();
        llIIlIllIlll[1] = (153 ^ 168) & ((34 ^ 19) ^ (-1));
        llIIlIllIlll[2] = (-((-22802) & 31519)) & (-1) & 32591;
        llIIlIllIlll[3] = (-((-17017) & 20089)) & (-4113) & 8183;
        llIIlIllIlll[4] = "   ".length();
        llIIlIllIlll[5] = "  ".length();
        llIIlIllIlll[6] = (-22565) & 31741;
        llIIlIllIlll[7] = -" ".length();
        llIIlIllIlll[8] = 81 ^ 89;
    }

    private static boolean lllllIlllllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllllIllllIIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllllIllllIIII(int i) {
        return i != 0;
    }

    private static String lllllIlllIlIll(String lllllllllllllllIlIIllIIIllllIIlI, String lllllllllllllllIlIIllIIIllllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIllllIIIl.getBytes(StandardCharsets.UTF_8)), llIIlIllIlll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIllIlll[5], lllllllllllllllIlIIllIIIllllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIIllllIIll) {
            lllllllllllllllIlIIllIIIllllIIll.printStackTrace();
            return null;
        }
    }

    public WorldPoint f(WorldPoint worldPoint) {
        if (lllllIlllIllll(this.ba.X())) {
            return null;
        }
        Optional<WorldPoint> min = b(br()).stream().min(Comparator.comparingDouble(worldPoint2 -> {
            return worldPoint2.distanceToHypotenuse(worldPoint);
        }));
        if (lllllIllllIIII(min.isEmpty() ? 1 : 0)) {
            return null;
        }
        if (lllllIllllIIII(this.bA.d(this.bA.c(worldPoint, min.get())) ? 1 : 0)) {
            return min.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    private boolean a(Player player, NPC npc) {
        if (lllllIllllIlIl(this.ba.X().aH(), llIIlIllIlll[0])) {
            return llIIlIllIlll[1];
        }
        List<WorldPoint> bu = this.bA.bu();
        if (lllllIllllIIII(bu.stream().anyMatch(worldPoint -> {
            return player.getWorldLocation().equals(worldPoint);
        }) ? 1 : 0)) {
            return llIIlIllIlll[1];
        }
        Stream<WorldPoint> stream = bu.stream();
        C0020u c0020u = this.bA;
        Objects.requireNonNull(c0020u);
        "".length();
        Stream<R> map = stream.filter(this::o).map(worldPoint2 -> {
            return this.bA.c(player.getWorldLocation(), worldPoint2);
        });
        C0020u c0020u2 = this.bA;
        Objects.requireNonNull(c0020u2);
        "".length();
        WorldPoint worldPoint3 = (WorldPoint) map.filter(this::d).map(list -> {
            return (WorldPoint) list.get(list.size() - llIIlIllIlll[0]);
        }).min(Comparator.comparing(worldPoint4 -> {
            return Integer.valueOf(worldPoint4.distanceTo(player.getWorldLocation()));
        })).orElse(null);
        if (!lllllIllllIIlI(worldPoint3) || lllllIllllIIlI(npc)) {
            return llIIlIllIlll[1];
        }
        ScenePoint fromWorld = ScenePoint.fromWorld(worldPoint3);
        Movement.setDestination(fromWorld.getX(), fromWorld.getY());
        return llIIlIllIlll[0];
    }

    private static boolean lllllIlllIllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v126, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v149, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v151, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v153, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v85, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        int i;
        int i2;
        int i3;
        int i4;
        Player local = Players.getLocal();
        if (!lllllIlllIllll(local) && !lllllIlllIllll(this.ba.X().aI())) {
            if (lllllIllllIIII(this.bC ? 1 : 0)) {
                int[] iArr = new int[llIIlIllIlll[0]];
                iArr[llIIlIllIlll[1]] = llIIlIllIlll[2];
                if (lllllIllllIIIl(Inventory.getCount(iArr), this.ba.h().abortFishAmount())) {
                    TileObject nearest = TileObjects.getNearest(C0004e.O);
                    if (lllllIlllIllll(nearest)) {
                        return llIIlIllIlll[1];
                    }
                    nearest.interact(llIIlIllIllI[llIIlIllIlll[1]]);
                    return llIIlIllIlll[0];
                }
                this.bC = llIIlIllIlll[1];
            }
            NPC m = this.bA.m(local.getWorldLocation());
            if (lllllIllllIIlI(m)) {
                i = m.getWorldLocation().distanceTo(local.getWorldLocation());
                "".length();
                if ((-"   ".length()) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i = llIIlIllIlll[3];
            }
            int i5 = i;
            boolean safeBossFight = this.ba.h().safeBossFight();
            int lllllllllllllllIlIIllIIllIIIIllI = safeBossFight ? 1 : 0;
            if (lllllIllllIIII(lllllllllllllllIlIIllIIllIIIIllI)) {
                i2 = llIIlIllIlll[4];
                "".length();
                if (((54 ^ 46) ^ (47 ^ 50)) <= 0) {
                    return ((55 ^ 76) ^ (196 ^ 152)) & (((((45 + 172) - 109) + 70) ^ (((133 + 87) - 170) + 99)) ^ (-" ".length()));
                }
            } else {
                i2 = llIIlIllIlll[5];
            }
            int i6 = i2;
            if (lllllIllllIIlI(m) && lllllIllllIIIl(i5, i6)) {
                i3 = llIIlIllIlll[0];
                "".length();
                if (((34 ^ 67) ^ (73 ^ 44)) != ((((63 + 36) - 95) + 145) ^ (((18 + 7) - (-104)) + 16))) {
                    return ((118 ^ 78) ^ (63 ^ 69)) & (((((185 + 69) - 150) + 120) ^ (((82 + 94) - 97) + 83)) ^ (-" ".length()));
                }
            } else {
                i3 = llIIlIllIlll[1];
            }
            if (lllllIllllIIII(i3)) {
                return llIIlIllIlll[1];
            }
            NPC aI = this.ba.X().aI();
            if (lllllIllllIIll(this.ba.X().aD(), HeadIcon.RANGED) && lllllIlllIllll(Equipment.fromSlot(EquipmentInventorySlot.WEAPON))) {
                i4 = llIIlIllIlll[0];
                "".length();
                if (" ".length() > (18 ^ 22)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i4 = llIIlIllIlll[1];
            }
            int i7 = i4;
            if (lllllIllllIIII(i7) && lllllIllllIIlI(m)) {
                int lllllllllllllllIlIIllIIllIIIIllI2 = safeBossFight ? 1 : 0;
                if (lllllIllllIIII(lllllllllllllllIlIIllIIllIIIIllI2)) {
                    return llIIlIllIlll[1];
                }
            }
            if (!lllllIllllIIII(i7)) {
                return lllllIllllIIII(this.bB.t() ? 1 : 0) ? a(local, m) : i(aI);
            }
            List<WorldPoint> c = this.bA.c(local.getWorldLocation(), aI.getWorldLocation());
            C0020u c0020u = this.bA;
            Stream<WorldPoint> stream = c.stream();
            C0020u c0020u2 = this.bA;
            Objects.requireNonNull(c0020u2);
            "".length();
            if (lllllIllllIIII(c0020u.d((List) stream.filter(this::n).collect(Collectors.toList())) ? 1 : 0)) {
                return i(aI);
            }
            if (lllllIllllIIII(aI.getWorldArea().isInMeleeDistance(local.getWorldLocation()) ? 1 : 0)) {
                i(aI);
                "".length();
                WorldPoint k = this.bA.k(this.bA.i(local.getWorldLocation()));
                if (lllllIllllIIlI(k) && lllllIllllIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                    ScenePoint fromWorld = ScenePoint.fromWorld(k);
                    Movement.setDestination(fromWorld.getX(), fromWorld.getY());
                }
                return llIIlIllIlll[0];
            }
            WorldPoint f = f(local.getWorldLocation());
            if (!lllllIlllIllll(f)) {
                ScenePoint fromWorld2 = ScenePoint.fromWorld(f);
                Movement.setDestination(fromWorld2.getX(), fromWorld2.getY());
                return llIIlIllIlll[0];
            }
            WorldPoint bs = bs();
            if (!lllllIllllIIlI(bs) || lllllIllllIIII(local.isMoving() ? 1 : 0)) {
                return llIIlIllIlll[1];
            }
            ScenePoint fromWorld3 = ScenePoint.fromWorld(bs);
            Movement.setDestination(fromWorld3.getX(), fromWorld3.getY());
            return llIIlIllIlll[0];
        }
        return llIIlIllIlll[1];
    }

    private static boolean lllllIllllIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public List<WorldPoint> g(WorldPoint worldPoint) {
        LinkedList linkedList = new LinkedList();
        int i = llIIlIllIlll[7];
        while (lllllIllllIIIl(i, llIIlIllIlll[0])) {
            int i2 = llIIlIllIlll[7];
            while (lllllIllllIIIl(i2, llIIlIllIlll[0])) {
                linkedList.addAll(a(worldPoint, i, i2));
                "".length();
                i2++;
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return null;
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return linkedList;
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        if (lllllIlllllIII(this.ba.W(), EnumC0003d.BOSS_FIGHT) || lllllIllllIIlI(Equipment.fromSlot(EquipmentInventorySlot.WEAPON))) {
            return;
        }
        Actor actor = hitsplatApplied.getActor();
        if (!lllllIllllIIlI(hitsplatApplied.getActor()) || lllllIllllIlII(C0004e.aw.contains(actor.getName()) ? 1 : 0)) {
            return;
        }
        this.bB.c(llIIlIllIlll[4]);
    }

    public List<WorldPoint> b(List<WorldPoint> list) {
        Stream<WorldPoint> stream = list.stream();
        C0020u c0020u = this.bA;
        Objects.requireNonNull(c0020u);
        "".length();
        return (List) stream.filter(this::o).collect(Collectors.toList());
    }

    private static boolean lllllIllllIlII(int i) {
        return i == 0;
    }

    private static boolean lllllIllllIlll(int i, int i2) {
        return i == i2;
    }

    static {
        lllllIlllIlllI();
        lllllIlllIllIl();
    }

    private List<WorldPoint> a(WorldPoint worldPoint, int i, int i2) {
        if (lllllIllllIlII(i) && lllllIllllIlII(i2)) {
            return List.of();
        }
        WorldPoint dy = worldPoint.dx(i).dy(i2);
        if (lllllIllllIlII(this.bA.n(dy) ? 1 : 0) && lllllIllllIIII(this.bA.l(dy) ? 1 : 0) && !lllllIllllIlII(this.bA.j(dy) ? 1 : 0)) {
            LinkedList linkedList = new LinkedList(a(dy, i, i2));
            if (lllllIllllIlII(i)) {
                linkedList.addAll(a(dy, llIIlIllIlll[0], i2));
                "".length();
                linkedList.addAll(a(dy, llIIlIllIlll[7], i2));
                "".length();
            }
            if (lllllIllllIlII(i2)) {
                linkedList.addAll(a(dy, i, llIIlIllIlll[0]));
                "".length();
                linkedList.addAll(a(dy, i, llIIlIllIlll[7]));
                "".length();
            }
            return linkedList;
        }
        return List.of(worldPoint);
    }

    public List<WorldPoint> br() {
        C0009j X = this.ba.X();
        if (lllllIlllIllll(X)) {
            return null;
        }
        NPC aI = X.aI();
        if (lllllIlllIllll(aI)) {
            return null;
        }
        WorldArea worldArea = aI.getWorldArea();
        int x = worldArea.getX();
        int y = worldArea.getY();
        int lllllllllllllllIlIIllIIlIlIIlIII = worldArea.getWidth();
        LinkedList linkedList = new LinkedList();
        int i = llIIlIllIlll[1];
        while (lllllIlllllIIl(i, lllllllllllllllIlIIllIIlIlIIlIII)) {
            linkedList.add(new WorldPoint(x + i, y - llIIlIllIlll[0], llIIlIllIlll[0]));
            "".length();
            linkedList.add(new WorldPoint(x + i, y + lllllllllllllllIlIIllIIlIlIIlIII, llIIlIllIlll[0]));
            "".length();
            linkedList.add(new WorldPoint(x - llIIlIllIlll[0], y + i, llIIlIllIlll[0]));
            "".length();
            linkedList.add(new WorldPoint(x + lllllllllllllllIlIIllIIlIlIIlIII, y + i, llIIlIllIlll[0]));
            "".length();
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return linkedList;
    }

    private static String lllllIlllIllII(String lllllllllllllllIlIIllIIlIIIIIlll, String lllllllllllllllIlIIllIIlIIIIIllI) {
        String lllllllllllllllIlIIllIIlIIIIIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllIIlIIIIIllI.toCharArray();
        int lllllllllllllllIlIIllIIlIIIIIIll = llIIlIllIlll[1];
        char[] charArray2 = lllllllllllllllIlIIllIIlIIIIIlll2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIllIlll[1];
        while (lllllIlllllIIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIllIIlIIIIIIll % charArray.length]));
            "".length();
            lllllllllllllllIlIIllIIlIIIIIIll++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllllIlllllIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor interacting = projectileSpawned.getProjectile().getInteracting();
        if (lllllIllllIIII(interacting instanceof NPC ? 1 : 0) && lllllIllllIIlI(interacting.getName()) && lllllIllllIIII(C0004e.aw.contains(interacting.getName()) ? 1 : 0) && lllllIllllIIII(C0004e.aD.contains(Integer.valueOf(projectileSpawned.getProjectile().getId())) ? 1 : 0)) {
            this.bB.c(llIIlIllIlll[4]);
        }
    }

    private static boolean lllllIllllIllI(int i, int i2) {
        return i != i2;
    }

    private static boolean lllllIllllIIlI(Object obj) {
        return obj != null;
    }

    public WorldPoint bt() {
        Player local = Players.getLocal();
        NPC aI = this.ba.X().aI();
        if (!lllllIllllIIlI(local) || lllllIlllIllll(aI)) {
            return null;
        }
        List list = (List) br().stream().flatMap(worldPoint -> {
            return g(worldPoint).stream();
        }).distinct().collect(Collectors.toList());
        List<WorldPoint> g = g(local.getWorldLocation());
        Stream<WorldPoint> stream = g.stream();
        Objects.requireNonNull(list);
        "".length();
        return stream.filter((v1) -> {
            return r1.contains(v1);
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(aI.getWorldArea()) + worldPoint2.distanceTo(local.getWorldLocation());
        })).orElse(g.stream().max(Comparator.comparingInt(worldPoint3 -> {
            return worldPoint3.distanceTo(aI.getWorldArea());
        })).orElse(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    private boolean i(NPC npc) {
        npc.interact(llIIlIllIllI[llIIlIllIlll[0]]);
        return llIIlIllIlll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        boolean z;
        if (lllllIllllIllI(varbitChanged.getVarbitId(), llIIlIllIlll[6])) {
            return;
        }
        if (lllllIllllIlll(varbitChanged.getValue(), llIIlIllIlll[0])) {
            int i = llIIlIllIlll[0];
            "".length();
            z = i;
            if ((-" ".length()) > 0) {
                return;
            }
        } else {
            z = llIIlIllIlll[1];
        }
        this.bC = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0019t(C0002c c0002c, C0001b c0001b, C0020u c0020u) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlIllIlll[0]];
        enumC0003dArr[llIIlIllIlll[1]] = EnumC0003d.BOSS_FIGHT;
        this.bC = llIIlIllIlll[1];
        this.bB = c0001b;
        this.bA = c0020u;
    }

    private static boolean lllllIllllIlIl(int i, int i2) {
        return i > i2;
    }
}
