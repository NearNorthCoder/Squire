package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.plugins.gauntlet.GauntletConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.HeadIcon;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.Identifiable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/c.class */
public class C0002c {
    private /* synthetic */ List<C0011l> K;
    private static final /* synthetic */ Logger C;
    private final /* synthetic */ EventBus D;
    private static /* synthetic */ String[] llIlIIIllIIl;
    private final /* synthetic */ Client E;
    private /* synthetic */ C0007h G;
    private final /* synthetic */ GauntletConfig F;
    private static /* synthetic */ int[] llIlIIIllIlI;
    private /* synthetic */ GameObject L;
    private /* synthetic */ C0011l M;
    private /* synthetic */ C0009j I;
    private /* synthetic */ C0011l J;
    private /* synthetic */ EnumC0003d H = EnumC0003d.OUTSIDE;
    private /* synthetic */ int N = llIlIIIllIlI[0];

    public GameObject aa() {
        return this.L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    private boolean a(C0011l c0011l, C0011l c0011l2) {
        Comparator comparingInt = Comparator.comparingInt(tileObject -> {
            return (int) tileObject.getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation());
        });
        Optional min = TileObjects.getAll(C0004e.U).stream().filter(tileObject2 -> {
            return c0011l.e(tileObject2.getWorldLocation());
        }).min(Comparator.comparingInt(tileObject3 -> {
            return (int) c0011l2.aQ().distanceToHypotenuse(tileObject3.getWorldLocation());
        }).thenComparing(comparingInt));
        if (lIIIIIIllIIlIIl(min.isEmpty() ? 1 : 0)) {
            b(c0011l.aQ());
            return llIlIIIllIlI[3];
        }
        WorldPoint destination = Movement.getDestination();
        if (lIIIIIIllIIlIIl(Players.getLocal().isMoving() ? 1 : 0) && lIIIIIIllIIIlll(destination) && lIIIIIIllIIlIll(destination.distanceTo(Players.getLocal()), llIlIIIllIlI[9])) {
            return llIlIIIllIlI[0];
        }
        ((TileObject) min.get()).interact(llIlIIIllIIl[llIlIIIllIlI[0]]);
        this.N = this.E.getTickCount();
        return llIlIIIllIlI[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v183, types: [java.util.List] */
    public List<EnumC0005f> P() {
        ArrayList arrayList;
        int potionGoal;
        EnumC0005f enumC0005f;
        int i;
        if (lIIIIIIllIIlIIl(this.F.makeArmour() ? 1 : 0)) {
            ?? of = List.of(EnumC0005f.TIER_1_BODY, EnumC0005f.TIER_1_LEGS, EnumC0005f.TIER_1_HELM);
            "".length();
            arrayList = of;
            if (((51 ^ 126) & ((12 ^ 65) ^ (-1))) >= " ".length()) {
                return null;
            }
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        List<EnumC0005f> K = K();
        if (lIIIIIIllIIIllI(K.isEmpty() ? 1 : 0)) {
            arrayList3.add(K.get(llIlIIIllIlI[0]));
            "".length();
            K.remove(llIlIIIllIlI[0]);
            "".length();
        }
        int min = Math.min(this.F.potionGoal(), llIlIIIllIlI[3]);
        if (!lIIIIIIllIIIlII(this.H, EnumC0003d.PREPARE_BOSS_FIGHT) || lIIIIIIllIIlIlI(this.H, EnumC0003d.DEMI_BOSS_EXPLORE)) {
            potionGoal = this.F.potionGoal() - C();
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        } else {
            potionGoal = min - C();
        }
        int i2 = potionGoal;
        int i3 = llIlIIIllIlI[0];
        while (lIIIIIIllIIllIl(i3, i2)) {
            arrayList3.add(EnumC0005f.VIAL);
            "".length();
            i3++;
            "".length();
            if ((((62 ^ 121) ^ (242 ^ 130)) & (((76 ^ 116) ^ (110 ^ 97)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        arrayList3.addAll(arrayList2);
        "".length();
        arrayList3.addAll(K);
        "".length();
        if ((!lIIIIIIllIIIllI(Equipment.contains(EnumC0005f.TIER_3_STAFF.ad()) ? 1 : 0) || lIIIIIIllIIlIIl(arrayList3.contains(EnumC0005f.TIER_3_STAFF) ? 1 : 0)) && lIIIIIIllIIIllI(Inventory.contains(EnumC0005f.TIER_2_BOW.ad()) ? 1 : 0) && lIIIIIIllIIIllI(Inventory.contains(EnumC0005f.TIER_3_BOW.ad()) ? 1 : 0)) {
            arrayList3.add(EnumC0005f.TIER_1_BOW);
            "".length();
        }
        if (lIIIIIIllIIlIIl(this.F.makeT2Offhand() ? 1 : 0)) {
            EnumC0005f L = L();
            if (lIIIIIIllIIIlll(L)) {
                if (lIIIIIIllIIIllI(Inventory.contains(L.ad()) ? 1 : 0) && lIIIIIIllIIIllI(Inventory.contains(L.af().ad()) ? 1 : 0) && lIIIIIIllIIIllI(arrayList3.contains(L.af()) ? 1 : 0)) {
                    arrayList3.add(L.af());
                    "".length();
                }
                arrayList3.add(L);
                "".length();
            }
            "".length();
            if (((21 ^ 74) & ((39 ^ 120) ^ (-1))) < 0) {
                return null;
            }
        } else if (lIIIIIIllIIlIIl(this.F.makeT3Offhand() ? 1 : 0)) {
            EnumC0005f L2 = L();
            if (lIIIIIIllIIIlll(L2)) {
                if (lIIIIIIllIIlIlI(L2, EnumC0005f.TIER_2_BOW)) {
                    enumC0005f = EnumC0005f.TIER_3_BOW;
                    "".length();
                    if ((-" ".length()) >= (33 ^ 37)) {
                        return null;
                    }
                } else {
                    enumC0005f = EnumC0005f.TIER_3_STAFF;
                }
                EnumC0005f enumC0005f2 = enumC0005f;
                if (lIIIIIIllIIIllI(Inventory.contains(enumC0005f2.ad()) ? 1 : 0)) {
                    if (lIIIIIIllIIIllI(Inventory.contains(L2.ad()) ? 1 : 0)) {
                        EnumC0005f af = L2.af();
                        if (lIIIIIIllIIIllI(Inventory.contains(af.ad()) ? 1 : 0) && lIIIIIIllIIIllI(arrayList3.contains(af) ? 1 : 0)) {
                            arrayList3.add(af);
                            "".length();
                        }
                        if (lIIIIIIllIIIllI(arrayList3.contains(L2) ? 1 : 0)) {
                            arrayList3.add(L2);
                            "".length();
                        }
                    }
                    arrayList3.add(enumC0005f2);
                    "".length();
                }
            }
        }
        if (lIIIIIIllIIllll(F(), this.F.fishGoal())) {
            i = llIlIIIllIlI[3];
            "".length();
            if (((42 ^ 5) ^ (23 ^ 60)) <= 0) {
                return null;
            }
        } else {
            i = llIlIIIllIlI[0];
        }
        int i4 = i;
        if ((!lIIIIIIllIIIlII(W(), EnumC0003d.DEMI_BOSS_EXPLORE) || lIIIIIIllIIlIlI(W(), EnumC0003d.PREPARE_BOSS_FIGHT)) && lIIIIIIllIIIllI(i4)) {
            arrayList3.add(EnumC0005f.TELEPORT_CRYSTAL);
            "".length();
        }
        if (lIIIIIIllIIlIll(EnumC0008i.CRYSTAL_SHARD.aC(), llIlIIIllIlI[10]) && lIIIIIIllIIIllI(this.F.makeT2Offhand() ? 1 : 0) && lIIIIIIllIIIllI(this.F.makeT3Offhand() ? 1 : 0) && lIIIIIIllIIlIIl(i4)) {
            arrayList3.add(L());
            "".length();
        }
        arrayList3.removeIf(enumC0005f3 -> {
            if (lIIIIIIllIIIlII(enumC0005f3, EnumC0005f.VIAL) && lIIIIIIllIIIlII(enumC0005f3, EnumC0005f.TELEPORT_CRYSTAL) && (!lIIIIIIllIIIllI(Inventory.contains(enumC0005f3.ad()) ? 1 : 0) || lIIIIIIllIIlIIl(Equipment.contains(enumC0005f3.ad()) ? 1 : 0))) {
                ?? r0 = llIlIIIllIlI[3];
                "".length();
                return (-(163 ^ 167)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIIIllIlI[0];
        });
        "".length();
        if (lIIIIIIllIIlIlI(W(), EnumC0003d.PREPARE_BOSS_FIGHT) && lIIIIIIllIIlIIl(Inventory.contains(EnumC0005f.TELEPORT_CRYSTAL.ad()) ? 1 : 0)) {
            arrayList3.remove(EnumC0005f.TELEPORT_CRYSTAL);
            "".length();
        }
        return arrayList3;
    }

    private static boolean lIIIIIIllIIIlIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (lIIIIIIllIIlIII(this.G) && lIIIIIIllIIlIIl(Arrays.stream(C0004e.O).anyMatch(i -> {
            if (lIIIIIIllIIIlIl(gameObject.getId(), i)) {
                ?? r0 = llIlIIIllIlI[3];
                "".length();
                return "  ".length() < 0 ? ((((199 + 115) - 265) + 160) ^ (((150 + 149) - 280) + 139)) & (((((93 + 42) - 132) + 213) ^ (((110 + 93) - 135) + 83)) ^ (-" ".length())) : r0;
            }
            return llIlIIIllIlI[0];
        }) ? 1 : 0)) {
            a(gameObject.getWorldLocation());
        }
        if (lIIIIIIllIIIlll(this.G) && lIIIIIIllIIlIIl(Arrays.stream(C0004e.U).anyMatch(i2 -> {
            if (lIIIIIIllIIIlIl(i2, gameObjectSpawned.getGameObject().getId())) {
                ?? r0 = llIlIIIllIlI[3];
                "".length();
                return 0 != 0 ? ((194 ^ 177) ^ (92 ^ 11)) & (((24 ^ 119) ^ (123 ^ 48)) ^ (-" ".length())) : r0;
            }
            return llIlIIIllIlI[0];
        }) ? 1 : 0)) {
            C0011l d = this.G.d(gameObjectSpawned.getTile().getWorldLocation());
            if (lIIIIIIllIIIlll(d)) {
                d.b((boolean) llIlIIIllIlI[3]);
            }
        }
    }

    private static boolean lIIIIIIllIIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIllIIlIll(int i, int i2) {
        return i > i2;
    }

    public int H() {
        return this.F.potionGoal();
    }

    public List<C0011l> Z() {
        return this.K;
    }

    public GauntletConfig h() {
        return this.F;
    }

    public boolean G() {
        return this.F.corruptedMode();
    }

    public C0011l Y() {
        return this.J;
    }

    private static boolean lIIIIIIllIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private int D() {
        return Inventory.getCount(a(C0004e.aa)) + Inventory.getCount(a(C0004e.Z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean h(int i) {
        if (!lIIIIIIllIIIllI(EnumC0008i.CRYSTAL_ORB.aA().contains(Integer.valueOf(i)) ? 1 : 0) || lIIIIIIllIIlIIl(EnumC0008i.CRYSTALLINE_BOWSTRING.aA().contains(Integer.valueOf(i)) ? 1 : 0)) {
            ?? r0 = llIlIIIllIlI[3];
            "".length();
            return "  ".length() <= (-" ".length()) ? ((((125 + 106) - 134) + 49) ^ (((6 + 74) - 58) + 119)) & (((168 ^ 153) ^ (158 ^ 176)) ^ (-" ".length())) : r0;
        }
        return llIlIIIllIlI[0];
    }

    public void x() {
        b();
        this.D.register(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    public boolean f(int i) {
        Map<EnumC0008i, Integer> E = E();
        if (lIIIIIIllIIlIIl(EnumC0005f.TELEPORT_CRYSTAL.ac().contains(Integer.valueOf(i)) ? 1 : 0) && lIIIIIIllIIlIIl(g(i) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (!lIIIIIIllIIIllI(EnumC0008i.CRYSTAL_SHARD.aA().contains(Integer.valueOf(i)) ? 1 : 0) || (lIIIIIIllIIllll(Inventory.getFreeSlots(), llIlIIIllIlI[1]) && lIIIIIIllIIlIIl(EnumC0008i.FISH.aA().contains(Integer.valueOf(i)) ? 1 : 0))) {
            return llIlIIIllIlI[3];
        }
        int i2 = llIlIIIllIlI[0];
        for (Map.Entry<EnumC0008i, Integer> entry : E.entrySet()) {
            if (lIIIIIIllIIIllI(entry.getKey().aA().contains(Integer.valueOf(i)) ? 1 : 0)) {
                "".length();
                if ((((167 ^ 149) ^ (164 ^ 197)) & (((162 ^ 159) ^ (95 ^ 49)) ^ (-" ".length()))) > "  ".length()) {
                    return ((((63 + 38) - 18) + 47) ^ (((35 + 98) - 8) + 9)) & (((((128 + 100) - 159) + 87) ^ (((133 + 92) - 90) + 17)) ^ (-" ".length()));
                }
            } else {
                i2 = llIlIIIllIlI[3];
                if (lIIIIIIllIlIIII(entry.getValue().intValue())) {
                    return llIlIIIllIlI[0];
                }
                "".length();
                if ("   ".length() < "   ".length()) {
                    return ((246 ^ 180) ^ (71 ^ 92)) & (((110 ^ 87) ^ (88 ^ 56)) ^ (-" ".length()));
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    public Map<EnumC0008i, Integer> E() {
        int i;
        int count;
        HashMap hashMap = new HashMap();
        for (EnumC0005f enumC0005f : P()) {
            for (Map.Entry<EnumC0008i, Integer> entry : enumC0005f.ag().entrySet()) {
                hashMap.put(entry.getKey(), Integer.valueOf(((Integer) hashMap.getOrDefault(entry.getKey(), Integer.valueOf(llIlIIIllIlI[0]))).intValue() + entry.getValue().intValue()));
                "".length();
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
            "".length();
            if ((116 ^ 112) < (95 ^ 91)) {
                return null;
            }
        }
        int min = Math.min(this.F.potionGoal(), llIlIIIllIlI[3]);
        if (lIIIIIIllIIlIlI(this.H, EnumC0003d.PREPARE_BOSS_FIGHT)) {
            i = this.F.potionGoal() - C();
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        } else {
            i = min;
        }
        int lllllllllllllllIlIIIlIlllIIlllll = i * EnumC0005f.VIAL.ag().get(EnumC0008i.CRYSTAL_SHARD).intValue();
        hashMap.put(EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(((Integer) hashMap.getOrDefault(EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIlIIIllIlI[0]))).intValue() + lllllllllllllllIlIIIlIlllIIlllll));
        "".length();
        if (lIIIIIIllIIIlII(this.H, EnumC0003d.EXTRA_FOOD_EXPLORE) && lIIIIIIllIIIlII(this.H, EnumC0003d.PREPARE_BOSS_FIGHT)) {
            if (lIIIIIIllIIlIlI(this.H, EnumC0003d.FIRST_ROTATION_EXPLORE)) {
                hashMap.put(EnumC0008i.HERB, Integer.valueOf(min));
                "".length();
                "".length();
                if (((106 ^ 8) & ((50 ^ 80) ^ (-1))) >= "   ".length()) {
                    return null;
                }
            } else {
                hashMap.put(EnumC0008i.HERB, Integer.valueOf(this.F.potionGoal() - Inventory.getCount(a(C0004e.aa))));
                "".length();
            }
            if (lIIIIIIllIIlIll(this.F.fishGoal(), llIlIIIllIlI[4])) {
                hashMap.put(EnumC0008i.FISH, Integer.valueOf((this.F.fishGoal() / llIlIIIllIlI[5]) * llIlIIIllIlI[6]));
                "".length();
                "".length();
                if (((107 ^ 4) ^ (201 ^ 162)) != ((((120 + 24) - 57) + 59) ^ (((11 + 120) - 129) + 148))) {
                    return null;
                }
            } else {
                hashMap.put(EnumC0008i.FISH, Integer.valueOf((this.F.fishGoal() / llIlIIIllIlI[6]) * llIlIIIllIlI[6]));
                "".length();
                "".length();
                if ("   ".length() >= ((((28 + 46) - (-33)) + 32) ^ (((68 + 101) - 34) + 8))) {
                    return null;
                }
            }
        } else if (lIIIIIIllIIllII(Inventory.getFreeSlots())) {
            hashMap.put(EnumC0008i.FISH, Integer.valueOf(this.F.fishGoal()));
            "".length();
        }
        for (EnumC0008i enumC0008i : hashMap.keySet()) {
            int i2 = llIlIIIllIlI[0];
            if (lIIIIIIllIIlIlI(enumC0008i, EnumC0008i.FISH)) {
                count = F();
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            } else {
                count = Inventory.getCount((boolean) llIlIIIllIlI[3], a(enumC0008i.aA()));
            }
            hashMap.put(enumC0008i, Integer.valueOf(((Integer) hashMap.get(enumC0008i)).intValue() - count));
            "".length();
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return hashMap;
    }

    private static boolean lIIIIIIllIIllII(int i) {
        return i > 0;
    }

    public EnumC0003d W() {
        return this.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean a(EnumC0005f enumC0005f) {
        for (Map.Entry<EnumC0008i, Integer> entry : enumC0005f.ag().entrySet()) {
            if ((!lIIIIIIllIIIlll(enumC0005f.af()) || !lIIIIIIllIIIllI(Inventory.contains(a(enumC0005f.af().ac())) ? 1 : 0) || !lIIIIIIllIIIllI(Equipment.contains(a(enumC0005f.af().ac())) ? 1 : 0) || !lIIIIIIllIIIllI(a(enumC0005f.af()) ? 1 : 0)) && !lIIIIIIllIIllIl(entry.getKey().aC(), entry.getValue().intValue())) {
                "".length();
                if ((true ^ true) != (true ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            return llIlIIIllIlI[0];
        }
        return llIlIIIllIlI[3];
    }

    public Item a(EnumC0008i enumC0008i) {
        return Inventory.getFirst(item -> {
            return enumC0008i.aA().contains(Integer.valueOf(item.getId()));
        });
    }

    public List<Item> b(EnumC0008i enumC0008i) {
        return Inventory.getAll(item -> {
            return enumC0008i.aA().contains(Integer.valueOf(item.getId()));
        });
    }

    public List<EnumC0005f> I() {
        List<EnumC0005f> P = P();
        P.removeIf(enumC0005f -> {
            if (lIIIIIIllIIIllI(a(enumC0005f) ? 1 : 0)) {
                ?? r0 = llIlIIIllIlI[3];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
            }
            return llIlIIIllIlI[0];
        });
        "".length();
        return P;
    }

    public int M() {
        Widget widget = Widgets.get(WidgetInfo.GAUNTLET_TIMER_CONTAINER.getGroupId(), llIlIIIllIlI[6]);
        if (lIIIIIIllIIlIII(widget)) {
            return llIlIIIllIlI[0];
        }
        String text = widget.getText();
        if (lIIIIIIllIIlIII(text)) {
            return llIlIIIllIlI[0];
        }
        String[] split = text.split(llIlIIIllIIl[llIlIIIllIlI[3]]);
        return Integer.parseInt(split[llIlIIIllIlI[9]].trim()) + (Integer.parseInt(split[llIlIIIllIlI[3]].trim()) * llIlIIIllIlI[10]);
    }

    public C0011l ab() {
        return this.M;
    }

    private static void lIIIIIIlIlIIIll() {
        llIlIIIllIlI = new int[11];
        llIlIIIllIlI[0] = ((100 ^ 62) ^ (227 ^ 163)) & (((198 ^ 182) ^ (174 ^ 196)) ^ (-" ".length()));
        llIlIIIllIlI[1] = "   ".length();
        llIlIIIllIlI[2] = (-((-18562) & 23715)) & (-18433) & 32763;
        llIlIIIllIlI[3] = " ".length();
        llIlIIIllIlI[4] = 135 ^ 141;
        llIlIIIllIlI[5] = (117 ^ 89) ^ (54 ^ 18);
        llIlIIIllIlI[6] = (110 ^ 75) ^ (17 ^ 48);
        llIlIIIllIlI[7] = 95 ^ 127;
        llIlIIIllIlI[8] = 195 ^ 198;
        llIlIIIllIlI[9] = "  ".length();
        llIlIIIllIlI[10] = (252 ^ 167) ^ (210 ^ 181);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean S() {
        if (lIIIIIIllIIIlII(W(), EnumC0003d.FIRST_ROTATION_EXPLORE) && lIIIIIIllIIIlII(W(), EnumC0003d.DEMI_BOSS_EXPLORE) && lIIIIIIllIIIlII(W(), EnumC0003d.WEAPON_FRAME_EXPLORE) && !lIIIIIIllIIlIlI(W(), EnumC0003d.EXTRA_FOOD_EXPLORE)) {
            return llIlIIIllIlI[0];
        }
        ?? r0 = llIlIIIllIlI[3];
        "".length();
        return 0 != 0 ? ((186 ^ 140) ^ (126 ^ 27)) & (((206 ^ 150) ^ (180 ^ 191)) ^ (-" ".length())) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    private void b(WorldPoint worldPoint) {
        if (lIIIIIIllIIllIl(Players.getLocal().distanceTo(worldPoint), llIlIIIllIlI[8])) {
            Movement.setDestination(worldPoint);
        }
        Movement.walkTo(worldPoint, (boolean) llIlIIIllIlI[0]);
        "".length();
    }

    private static boolean lIIIIIIllIIIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private <T extends Identifiable> Predicate<T> a(List<Integer> list) {
        return identifiable -> {
            return list.contains(Integer.valueOf(identifiable.getId()));
        };
    }

    private static boolean lIIIIIIllIIllll(int i, int i2) {
        return i >= i2;
    }

    public List<EnumC0005f> K() {
        if (lIIIIIIllIIlIII(this.I)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        EnumC0005f enumC0005f = EnumC0005f.TIER_3_STAFF;
        while (lIIIIIIllIIIlll(enumC0005f) && lIIIIIIllIIIllI(Inventory.contains(enumC0005f.ad()) ? 1 : 0) && lIIIIIIllIIIllI(Equipment.contains(enumC0005f.ad()) ? 1 : 0)) {
            arrayList.add(enumC0005f);
            "".length();
            enumC0005f = enumC0005f.af();
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public GameObject U() {
        GameObject a = a(T());
        this.L = a;
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean a(int... iArr) {
        int length = iArr.length;
        int i = llIlIIIllIlI[0];
        while (lIIIIIIllIIllIl(i, length)) {
            if (lIIIIIIllIIlIIl(f(iArr[i]) ? 1 : 0)) {
                return llIlIIIllIlI[3];
            }
            i++;
            "".length();
            if ((-((92 ^ 105) ^ (100 ^ 85))) >= 0) {
                return ((64 ^ 91) ^ " ".length()) & (((215 ^ 198) ^ (79 ^ 68)) ^ (-" ".length()));
            }
        }
        return llIlIIIllIlI[0];
    }

    public EnumC0006g J() {
        EnumC0006g enumC0006g;
        if (!lIIIIIIllIIlIIl(this.F.makeT3Offhand() ? 1 : 0)) {
            if (lIIIIIIllIIIlII(this.I.aD(), HeadIcon.MAGIC)) {
                enumC0006g = EnumC0006g.DRAGON;
                "".length();
                if ("   ".length() >= (156 ^ 152)) {
                    return null;
                }
            } else {
                enumC0006g = EnumC0006g.DARK_BEAST;
            }
            if (lIIIIIIllIIlIIl(a(enumC0006g) ? 1 : 0)) {
                return null;
            }
            return enumC0006g;
        }
        ArrayList<EnumC0006g> arrayList = new ArrayList();
        Map<EnumC0008i, Integer> E = E();
        if (lIIIIIIllIIlIIl(E.containsKey(EnumC0008i.CRYSTAL_ORB) ? 1 : 0) && lIIIIIIllIIIllI(EnumC0008i.CRYSTAL_ORB.aC()) && lIIIIIIllIIIllI(Equipment.contains(EnumC0005f.TIER_3_STAFF.ad()) ? 1 : 0)) {
            arrayList.add(EnumC0006g.DRAGON);
            "".length();
        }
        if (lIIIIIIllIIlIIl(E.containsKey(EnumC0008i.CRYSTALLINE_BOWSTRING) ? 1 : 0) && lIIIIIIllIIIllI(EnumC0008i.CRYSTALLINE_BOWSTRING.aC()) && lIIIIIIllIIIllI(Inventory.contains(EnumC0005f.TIER_3_BOW.ad()) ? 1 : 0)) {
            arrayList.add(EnumC0006g.DARK_BEAST);
            "".length();
        }
        for (EnumC0006g enumC0006g2 : arrayList) {
            if (lIIIIIIllIIIlll(NPCs.getNearest(enumC0006g2.ah()))) {
                return enumC0006g2;
            }
            "".length();
            if (" ".length() == ((((20 + 101) - 35) + 92) ^ (((126 + 178) - 169) + 47))) {
                return null;
            }
        }
        if (lIIIIIIllIIlIIl(arrayList.isEmpty() ? 1 : 0)) {
            "".length();
            return "  ".length() <= 0 ? null : null;
        }
        return (EnumC0006g) arrayList.get(llIlIIIllIlI[0]);
    }

    public void a(EnumC0003d enumC0003d) {
        this.H = enumC0003d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean O() {
        if (lIIIIIIllIIlIIl(a(enumC0008i -> {
            if (lIIIIIIllIIlIlI(enumC0008i, EnumC0008i.FISH)) {
                ?? r0 = llIlIIIllIlI[3];
                "".length();
                return (-" ".length()) > 0 ? ((100 ^ 62) ^ (84 ^ 51)) & (((4 ^ 73) ^ (31 ^ 111)) ^ (-" ".length())) : r0;
            }
            return llIlIIIllIlI[0];
        }) ? 1 : 0) && lIIIIIIllIIlllI(h().fishGoal() - h().fishGoalDeviation(), F())) {
            ?? r0 = llIlIIIllIlI[3];
            "".length();
            return 0 != 0 ? ((((50 + 53) - 83) + 114) ^ (((114 + 161) - 145) + 64)) & (((((107 + 43) - 117) + 172) ^ (((101 + 99) - 76) + 13)) ^ (-" ".length())) : r0;
        }
        return llIlIIIllIlI[0];
    }

    @Inject
    public C0002c(EventBus eventBus, Client client, GauntletConfig gauntletConfig) {
        this.D = eventBus;
        this.E = client;
        this.F = gauntletConfig;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        c(npcSpawned.getNpc());
        EnumC0006g i = EnumC0006g.i(npcSpawned.getNpc().getId());
        if (lIIIIIIllIIlIII(i)) {
            return;
        }
        C0011l d = V().d(npcSpawned.getNpc().getWorldLocation());
        if (lIIIIIIllIIlIII(d)) {
            return;
        }
        d.b(i);
    }

    private static boolean lIIIIIIllIIIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    public boolean a(Predicate<EnumC0008i> predicate) {
        if (lIIIIIIllIIlIII(this.E.getItemContainer(InventoryID.INVENTORY))) {
            return llIlIIIllIlI[0];
        }
        for (Map.Entry<EnumC0008i, Integer> entry : E().entrySet()) {
            if (lIIIIIIllIIlIIl(predicate.test(entry.getKey()) ? 1 : 0)) {
                "".length();
                if ((-"   ".length()) >= 0) {
                    return " ".length() & (" ".length() ^ (-1));
                }
            } else if (lIIIIIIllIIllII(entry.getValue().intValue())) {
                return llIlIIIllIlI[0];
            } else {
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return llIlIIIllIlI[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    public boolean a(C0011l c0011l, WorldPoint worldPoint) {
        C0011l c0011l2;
        this.M = this.G.d(worldPoint);
        if (lIIIIIIllIIlIII(this.M)) {
            return llIlIIIllIlI[0];
        }
        if (lIIIIIIllIIlIIl(this.M.e(c0011l) ? 1 : 0)) {
            if (!lIIIIIIllIIlIIl(c0011l.aY() ? 1 : 0)) {
                this.J = c0011l;
                this.K = Collections.emptyList();
                return a(this.M, c0011l);
            }
            this.J = null;
            this.K = Collections.emptyList();
            b(c0011l.aQ());
            return llIlIIIllIlI[3];
        }
        List<C0011l> a = this.G.a(worldPoint, c0011l);
        if (lIIIIIIllIIlIIl(a.isEmpty() ? 1 : 0)) {
            this.J = null;
            return llIlIIIllIlI[3];
        }
        Collections.reverse(a);
        this.K = a;
        Player local = Players.getLocal();
        this.J = null;
        int i = llIlIIIllIlI[0];
        while (lIIIIIIllIIllIl(i, a.size())) {
            C0011l c0011l3 = a.get(i);
            if (lIIIIIIllIIIlIl(c0011l3.aO(), llIlIIIllIlI[1]) && lIIIIIIllIIIlIl(c0011l3.aP(), llIlIIIllIlI[1])) {
                return llIlIIIllIlI[0];
            }
            if (lIIIIIIllIIlIIl(c0011l3.aY() ? 1 : 0) && lIIIIIIllIIlllI(c0011l3.aQ().distanceTo(local.getWorldLocation()), llIlIIIllIlI[7]) && lIIIIIIllIIIllI(c0011l3.e(local.getWorldLocation()) ? 1 : 0)) {
                b(c0011l3.aQ());
                return llIlIIIllIlI[3];
            } else if (lIIIIIIllIIIllI(c0011l3.aY() ? 1 : 0)) {
                if (lIIIIIIllIIllII(i)) {
                    c0011l2 = a.get(i - llIlIIIllIlI[3]);
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((((97 + 82) - 64) + 14) ^ (((184 + 142) - 142) + 12)) & (((179 ^ 159) ^ (168 ^ 193)) ^ (-" ".length()));
                    }
                } else {
                    c0011l2 = this.M;
                }
                a(c0011l2, c0011l3);
                "".length();
                return llIlIIIllIlI[3];
            } else {
                i++;
                "".length();
                if (!(true ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return llIlIIIllIlI[3];
    }

    public C0007h V() {
        return this.G;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (!lIIIIIIllIIIlII(gameStateChanged.getGameState(), GameState.LOGGED_IN) && lIIIIIIllIIIllI(A() ? 1 : 0)) {
            if (lIIIIIIllIIIlll(this.G)) {
                this.G.ao();
                this.G = null;
            }
            this.H = EnumC0003d.OUTSIDE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public C0011l T() {
        if (lIIIIIIllIIlIlI(W(), EnumC0003d.FIRST_ROTATION_EXPLORE)) {
            C0011l as = V().as();
            this.M = as;
            return as;
        } else if (lIIIIIIllIIlIlI(W(), EnumC0003d.DEMI_BOSS_EXPLORE)) {
            Player localPlayer = this.E.getLocalPlayer();
            if (lIIIIIIllIIlIII(localPlayer)) {
                return null;
            }
            EnumC0006g J = J();
            if (lIIIIIIllIIlIII(J) || lIIIIIIllIIllII(Inventory.getCount((boolean) llIlIIIllIlI[3], a(J.an().aA())))) {
                return null;
            }
            C0011l d = V().d(localPlayer.getWorldLocation());
            this.M = d;
            return d;
        } else {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean b(EnumC0005f enumC0005f) {
        if (!lIIIIIIllIIIllI(Inventory.contains(item -> {
            return enumC0005f.ac().contains(Integer.valueOf(item.getId()));
        }) ? 1 : 0) || lIIIIIIllIIlIIl(Equipment.contains(item2 -> {
            return enumC0005f.ac().contains(Integer.valueOf(item2.getId()));
        }) ? 1 : 0)) {
            ?? r0 = llIlIIIllIlI[3];
            "".length();
            return (6 ^ 2) < 0 ? "  ".length() & ("  ".length() ^ (-1)) : r0;
        }
        return llIlIIIllIlI[0];
    }

    private int C() {
        List<Integer> ac = EnumC0005f.VIAL.ac();
        List list = (List) ac.stream().map(num -> {
            return Integer.valueOf(num.intValue() + llIlIIIllIlI[3]);
        }).collect(Collectors.toList());
        ArrayList arrayList = new ArrayList(ac);
        arrayList.addAll(list);
        "".length();
        return Inventory.getCount(a(arrayList)) + D();
    }

    private static void lIIIIIIlIlIIIlI() {
        llIlIIIllIIl = new String[llIlIIIllIlI[9]];
        llIlIIIllIIl[llIlIIIllIlI[0]] = lIIIIIIlIlIIIII("IRkdMB0=", "mpzXi");
        llIlIIIllIIl[llIlIIIllIlI[3]] = lIIIIIIlIlIIIIl("3TWOzZ5D904=", "HGrmF");
    }

    private static String lIIIIIIlIlIIIII(String lllllllllllllllIlIIIlIlIlIllllll, String lllllllllllllllIlIIIlIlIlIlllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlIlIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIIlIlIlIllllII = lllllllllllllllIlIIIlIlIlIlllllI.toCharArray();
        int lllllllllllllllIlIIIlIlIlIlllIll = llIlIIIllIlI[0];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIlIIIlIlIlIllIlII = charArray.length;
        int i = llIlIIIllIlI[0];
        while (lIIIIIIllIIllIl(i, lllllllllllllllIlIIIlIlIlIllIlII)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIIIlIlIlIllllII[lllllllllllllllIlIIIlIlIlIlllIll % lllllllllllllllIlIIIlIlIlIllllII.length]));
            "".length();
            lllllllllllllllIlIIIlIlIlIlllIll++;
            i++;
            "".length();
            if (((217 ^ 130) & ((14 ^ 85) ^ (-1))) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean A() {
        if (lIIIIIIllIIIlII(Game.getState(), GameState.LOGIN_SCREEN) && lIIIIIIllIIIlIl(Vars.getBit(llIlIIIllIlI[2]), llIlIIIllIlI[3])) {
            ?? r0 = llIlIIIllIlI[3];
            "".length();
            return (-((((62 + 23) - (-2)) + 46) ^ (((67 + 17) - 13) + 57))) >= 0 ? ((99 ^ 82) ^ (121 ^ 5)) & (((52 ^ 76) ^ (34 ^ 23)) ^ (-" ".length())) : r0;
        }
        return llIlIIIllIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean B() {
        if (lIIIIIIllIIIllI(EnumC0008i.WEAPON_FRAME.aC())) {
            ?? r0 = llIlIIIllIlI[3];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIIIllIlI[0];
    }

    public void y() {
        b();
        this.D.unregister(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    private boolean g(int i) {
        if (lIIIIIIllIIlllI(Inventory.getFreeSlots(), llIlIIIllIlI[3])) {
            int[] iArr = new int[llIlIIIllIlI[3]];
            iArr[llIlIIIllIlI[0]] = i;
            if (!lIIIIIIllIIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                return llIlIIIllIlI[0];
            }
        }
        ?? r0 = llIlIIIllIlI[3];
        "".length();
        return (24 ^ 28) < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean a(EnumC0006g enumC0006g) {
        if (lIIIIIIllIIlIlI(enumC0006g, EnumC0006g.DRAGON) && lIIIIIIllIIlIIl(b(EnumC0005f.TIER_3_STAFF) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (lIIIIIIllIIlIlI(enumC0006g, EnumC0006g.DARK_BEAST) && lIIIIIIllIIlIIl(b(EnumC0005f.TIER_3_BOW) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (lIIIIIIllIIllII(enumC0006g.an().aC())) {
            ?? r0 = llIlIIIllIlI[3];
            "".length();
            return "  ".length() == " ".length() ? ((179 ^ 192) ^ (145 ^ 194)) & (((213 ^ 167) ^ (239 ^ 189)) ^ (-" ".length())) : r0;
        }
        return llIlIIIllIlI[0];
    }

    public C0009j X() {
        return this.I;
    }

    public List<Integer> Q() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<EnumC0008i, Integer> entry : E().entrySet()) {
            EnumC0008i key = entry.getKey();
            if (lIIIIIIllIIllII(entry.getValue().intValue())) {
                arrayList.addAll(key.az());
                "".length();
            }
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean R() {
        if (!lIIIIIIllIIIlII(W(), EnumC0003d.FIRST_ROTATION_CREATE) || lIIIIIIllIIlIlI(W(), EnumC0003d.PREPARE_BOSS_FIGHT)) {
            ?? r0 = llIlIIIllIlI[3];
            "".length();
            return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIIIllIlI[0];
    }

    private static String lIIIIIIlIlIIIIl(String lllllllllllllllIlIIIlIlIlIlIlIlI, String lllllllllllllllIlIIIlIlIlIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlIlIlIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIIllIlI[9], lllllllllllllllIlIIIlIlIlIlIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlIlIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIlIlIlIlIlIll) {
            lllllllllllllllIlIIIlIlIlIlIlIll.printStackTrace();
            return null;
        }
    }

    private GameObject a(C0011l c0011l) {
        if (lIIIIIIllIIlIII(this.E.getLocalPlayer())) {
            return null;
        }
        List<Integer> Q = Q();
        return TileObjects.getNearest(tileObject -> {
            if (!lIIIIIIllIIlIIl(Q.contains(Integer.valueOf(tileObject.getId())) ? 1 : 0) || (lIIIIIIllIIIlll(c0011l) && !lIIIIIIllIIlIIl(c0011l.e(tileObject.getWorldLocation()) ? 1 : 0))) {
                return llIlIIIllIlI[0];
            }
            ?? r0 = llIlIIIllIlI[3];
            "".length();
            return 0 != 0 ? ((((85 + 37) - 107) + 183) ^ (((133 + 89) - 100) + 22)) & (((((58 + 183) - 101) + 92) ^ (((46 + 89) - (-3)) + 52)) ^ (-" ".length())) : r0;
        });
    }

    private void b() {
        this.N = llIlIIIllIlI[0];
        this.M = null;
        this.L = null;
        this.K = null;
        this.J = null;
        this.I = null;
        this.H = EnumC0003d.OUTSIDE;
        this.G = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean N() {
        if (lIIIIIIllIIlIII(this.E.getItemContainer(InventoryID.INVENTORY))) {
            return llIlIIIllIlI[0];
        }
        for (Map.Entry<EnumC0008i, Integer> entry : E().entrySet()) {
            if (lIIIIIIllIIllII(entry.getValue().intValue())) {
                return llIlIIIllIlI[0];
            }
            "".length();
            if ((-" ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIlIIIllIlI[3];
    }

    private static boolean lIIIIIIllIIIlll(Object obj) {
        return obj != null;
    }

    public int F() {
        return EnumC0008i.FISH.aC() + Inventory.getCount(item -> {
            return C0004e.aH.contains(Integer.valueOf(item.getId()));
        }) + this.G.av().bb();
    }

    private static boolean lIIIIIIllIIlIII(Object obj) {
        return obj == null;
    }

    public EnumC0005f L() {
        if (lIIIIIIllIIlIII(this.I)) {
            return null;
        }
        return EnumC0005f.TIER_2_BOW;
    }

    static {
        lIIIIIIlIlIIIll();
        lIIIIIIlIlIIIlI();
        C = LoggerFactory.getLogger(C0002c.class);
    }

    private void c(NPC npc) {
        if (lIIIIIIllIIIllI(C0004e.aw.contains(npc.getName()) ? 1 : 0)) {
            return;
        }
        this.I = new C0009j(npc);
    }

    private static boolean lIIIIIIllIlIIII(int i) {
        return i <= 0;
    }

    private void a(WorldPoint worldPoint) {
        this.G = new C0007h(((Player) Objects.requireNonNull(this.E.getLocalPlayer())).getWorldLocation(), C0011l.a(worldPoint, new Point(llIlIIIllIlI[1], llIlIIIllIlI[1])));
        this.H = EnumC0003d.FIRST_ROTATION_EXPLORE;
    }

    private static boolean lIIIIIIllIIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIIIllIIlllI(int i, int i2) {
        return i <= i2;
    }
}
