package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.hunter.SquireHunter;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.Angle;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.scene.Tiles;
@Singleton
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.a  reason: invalid package and case insensitive filesystem */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/a.class */
public class C0000a {
    private static /* synthetic */ String[] llllIIIIlIII;
    private final /* synthetic */ SquireHunter h;
    private final /* synthetic */ SquireHunterConfig i;
    private /* synthetic */ WorldPoint l;
    private static /* synthetic */ int[] llllIIIlIlIl;
    private final /* synthetic */ Map<WorldPoint, f> g = new HashMap();
    private final /* synthetic */ AtomicLong j = new AtomicLong(4);
    private /* synthetic */ Instant k = Instant.ofEpochMilli(0);

    public AtomicLong i() {
        return this.j;
    }

    private static boolean lIIIllllIIIIlII(int i, int i2) {
        return i == i2;
    }

    public void a(f fVar) {
        this.g.remove(fVar.o());
        "".length();
    }

    private static String lIIIlllIlllllII(String lllllllllllllllIIlIllIIIlIlIIlIl, String lllllllllllllllIIlIllIIIlIlIIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIIlIlIIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIIIlIlIIlII.toCharArray();
        int lllllllllllllllIIlIllIIIlIlIIIIl = llllIIIlIlIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIIlIlIl[1];
        while (lIIIllllIIIIIlI(i, length)) {
            char lllllllllllllllIIlIllIIIlIlIIllI = charArray2[i];
            lllllllllllllllIIlIllIIIlIlIIIll.append((char) (lllllllllllllllIIlIllIIIlIlIIllI ^ charArray[lllllllllllllllIIlIllIIIlIlIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIIIlIlIIIIl++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIIIlIlIIIll);
    }

    private static void lIIIlllIllllllI() {
        llllIIIlIlIl = new int[19];
        llllIIIlIlIl[0] = -" ".length();
        llllIIIlIlIl[1] = ((245 ^ 169) ^ (23 ^ 11)) & (((60 ^ 0) ^ (120 ^ 4)) ^ (-" ".length()));
        llllIIIlIlIl[2] = " ".length();
        llllIIIlIlIl[3] = (-((-593) & 24178)) & (-323) & 32639;
        llllIIIlIlIl[4] = (-18497) & 27486;
        llllIIIlIlIl[5] = (-((-12321) & 29857)) & (-84) & 26619;
        llllIIIlIlIl[6] = (-20483) & 29823;
        llllIIIlIlIl[7] = (-((-805) & 11247)) & (-4101) & 65263;
        llllIIIlIlIl[8] = (-((-26117) & 30285)) & (-18561) & 32734;
        llllIIIlIlIl[9] = (-((-11273) & 27886)) & (-2051) & 28671;
        llllIIIlIlIl[10] = (-((-16643) & 23507)) & (-9217) & 16383;
        llllIIIlIlIl[11] = (-((-245) & 31989)) & (-69) & 32766;
        llllIIIlIlIl[12] = (116 ^ 120) ^ ((47 ^ 7) & ((15 ^ 39) ^ (-1)));
        llllIIIlIlIl[13] = 0 ^ 8;
        llllIIIlIlIl[14] = (9 ^ 113) ^ (12 ^ 96);
        llllIIIlIlIl[15] = 9 ^ 12;
        llllIIIlIlIl[16] = "  ".length();
        llllIIIlIlIl[17] = "   ".length();
        llllIIIlIlIl[18] = (56 ^ 102) ^ (205 ^ 151);
    }

    private static void lIIIlllIlllllIl() {
        llllIIIIlIII = new String[llllIIIlIlIl[17]];
        llllIIIIlIII[llllIIIlIlIl[1]] = lIIIlllIlIlIIIl("ld4IBACGW2rwt+Llgrti1A==", "yZPOZ");
        llllIIIIlIII[llllIIIlIlIl[2]] = lIIIlllIllllIll("+phV8jAfnkM=", "UUmoZ");
        llllIIIIlIII[llllIIIlIlIl[16]] = lIIIlllIlllllII("FycjFhs2Jw==", "EBOsz");
    }

    private static boolean lIIIllllIIIIIll(int i, int i2) {
        return i != i2;
    }

    public WorldPoint a(EnumC0002c enumC0002c) {
        return enumC0002c.a(e()).stream().filter(worldPoint -> {
            if (lIIIllllIIIIIII(this.g.containsKey(worldPoint) ? 1 : 0)) {
                ?? r0 = llllIIIlIlIl[2];
                "".length();
                return (true ^ true) == ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIIIlIlIl[1];
        }).min(Comparator.comparing(worldPoint2 -> {
            return Integer.valueOf(worldPoint2.distanceTo(Players.getLocal().getWorldLocation()));
        })).orElse(null);
    }

    private static String lIIIlllIlIlIIIl(String lllllllllllllllIIlIllIIIlIIlIIII, String lllllllllllllllIIlIllIIIlIIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIlIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIlIlIl[16], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIIlIIlIIIl) {
            lllllllllllllllIIlIllIIIlIIlIIIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        WorldPoint worldLocation = gameObject.getWorldLocation();
        f fVar = this.g.get(worldLocation);
        Players.getLocal();
        switch (gameObject.getId()) {
            case 721:
            case 8734:
            case 8986:
            case 8996:
            case 9004:
            case 9348:
            case 9373:
            case 9375:
            case 9377:
            case 9379:
            case 9382:
            case 9383:
            case 9384:
            case 19226:
            case 20648:
            case 20649:
            case 20650:
            case 20651:
            case 50717:
                if (lIIIlllIlllllll(fVar)) {
                    fVar.a(g.FULL);
                    fVar.n();
                    this.k = Instant.now();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                    return;
                }
                return;
            case 2025:
            case 2026:
            case 2028:
            case 2029:
            case 8972:
            case 8974:
            case 8985:
            case 8987:
            case 8993:
            case 8997:
            case 9003:
            case 9005:
            case 9346:
            case 9347:
            case 9349:
            case 9374:
            case 9376:
            case 9378:
            case 9381:
            case 9386:
            case 9387:
            case 9388:
            case 9390:
            case 9391:
            case 9392:
            case 9393:
            case 9394:
            case 9396:
            case 9397:
            case 19218:
            case 19225:
            case 19851:
            case 20128:
            case 20129:
            case 20130:
            case 20131:
            case 50719:
                if (lIIIlllIlllllll(fVar)) {
                    fVar.a(g.TRANSITION);
                    return;
                }
                return;
            case 8731:
            case 8992:
            case 9002:
            case 9343:
            case 50723:
                if (lIIIlllIlllllll(this.l) && lIIIllllIIIIIII(worldLocation.distanceTo(this.l))) {
                    WorldPoint worldPoint = worldLocation;
                    switch (C0001b.m[new Angle(gameObject.getOrientation()).getNearestDirection().ordinal()]) {
                        case 1:
                            worldPoint = worldLocation.dy(llllIIIlIlIl[0]);
                            "".length();
                            if ((-" ".length()) >= 0) {
                                return;
                            }
                            break;
                        case 2:
                            worldPoint = worldLocation.dx(llllIIIlIlIl[0]);
                            break;
                    }
                    this.g.put(worldPoint, new f(gameObject));
                    "".length();
                    this.k = Instant.now();
                    "".length();
                    if ((-(116 ^ 112)) > 0) {
                        return;
                    }
                    return;
                }
                return;
            case 9344:
            case 9385:
            case 19224:
                if (lIIIlllIlllllll(fVar)) {
                    fVar.a(g.EMPTY);
                    fVar.n();
                    this.k = Instant.now();
                    "".length();
                    if ((-(98 ^ 102)) >= 0) {
                        return;
                    }
                    return;
                }
                return;
            case 9345:
            case 9380:
                if (lIIIlllIlllllll(this.l) && lIIIllllIIIIIII(worldLocation.distanceTo(this.l))) {
                    this.g.put(worldLocation, new f(gameObject));
                    "".length();
                    this.k = Instant.now();
                    "".length();
                    if ((((110 ^ 58) ^ (210 ^ 172)) & (((175 ^ 129) ^ (12 ^ 8)) ^ (-" ".length()))) >= " ".length()) {
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private static boolean lIIIllllIIIIlll(int i) {
        return i <= 0;
    }

    public f a(WorldPoint worldPoint, int i) {
        return this.g.values().stream().filter(fVar -> {
            if (lIIIllllIIIlIIl(fVar.o().distanceTo(worldPoint), i)) {
                ?? r0 = llllIIIlIlIl[2];
                "".length();
                return 0 != 0 ? ((101 ^ 1) ^ (116 ^ 77)) & (((((46 + 74) - 108) + 141) ^ (((133 + 101) - 183) + 145)) ^ (-" ".length())) : r0;
            }
            return llllIIIlIlIl[1];
        }).min(Comparator.comparing(fVar2 -> {
            return Integer.valueOf(fVar2.o().distanceTo(worldPoint));
        })).orElse(null);
    }

    private static boolean lIIIllllIIIIIII(int i) {
        return i == 0;
    }

    public TileObject f() {
        int[] iArr = new int[llllIIIlIlIl[15]];
        iArr[llllIIIlIlIl[1]] = llllIIIlIlIl[3];
        iArr[llllIIIlIlIl[2]] = llllIIIlIlIl[4];
        iArr[llllIIIlIlIl[16]] = llllIIIlIlIl[5];
        iArr[llllIIIlIlIl[17]] = llllIIIlIlIl[6];
        iArr[llllIIIlIlIl[18]] = llllIIIlIlIl[7];
        return TileObjects.getNearest(iArr);
    }

    private static boolean lIIIllllIIIIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIIIlllIllllIll(String lllllllllllllllIIlIllIIIlIIIIIll, String lllllllllllllllIIlIllIIIlIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIlIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), llllIIIlIlIl[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIlIlIl[16], lllllllllllllllIIlIllIIIlIIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIIlIIIIlII) {
            lllllllllllllllIIlIllIIIlIIIIlII.printStackTrace();
            return null;
        }
    }

    @Inject
    public C0000a(SquireHunter squireHunter, SquireHunterConfig squireHunterConfig) {
        this.h = squireHunter;
        this.i = squireHunterConfig;
    }

    private static boolean lIIIllllIIIlIII(int i) {
        return i > 0;
    }

    public List<TileObject> g() {
        int[] iArr = new int[llllIIIlIlIl[15]];
        iArr[llllIIIlIlIl[1]] = llllIIIlIlIl[3];
        iArr[llllIIIlIlIl[2]] = llllIIIlIlIl[4];
        iArr[llllIIIlIlIl[16]] = llllIIIlIlIl[5];
        iArr[llllIIIlIlIl[17]] = llllIIIlIlIl[6];
        iArr[llllIIIlIlIl[18]] = llllIIIlIlIl[7];
        return TileObjects.getAll(iArr);
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.j.set(this.j.get() + 1);
        Iterator<Map.Entry<WorldPoint, f>> it = this.g.entrySet().iterator();
        Instant minus = Instant.now().minus((TemporalAmount) f.n.multipliedBy(2L));
        while (lIIIllllIIIIIIl(it.hasNext() ? 1 : 0)) {
            Map.Entry<WorldPoint, f> next = it.next();
            f value = next.getValue();
            WorldPoint key = next.getKey();
            if (lIIIllllIIIIIIl(value.p().isBefore(minus) ? 1 : 0)) {
                it.remove();
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                GameObject[] gameObjects = Tiles.getAt(key).getGameObjects();
                int i = llllIIIlIlIl[1];
                int i2 = llllIIIlIlIl[1];
                int length = gameObjects.length;
                int i3 = llllIIIlIlIl[1];
                while (lIIIllllIIIIIlI(i3, length)) {
                    GameObject gameObject = gameObjects[i3];
                    if (lIIIlllIlllllll(gameObject)) {
                        i = llllIIIlIlIl[2];
                        if (!lIIIllllIIIIIll(gameObject.getId(), llllIIIlIlIl[3]) || !lIIIllllIIIIIll(gameObject.getId(), llllIIIlIlIl[4]) || !lIIIllllIIIIIll(gameObject.getId(), llllIIIlIlIl[5]) || !lIIIllllIIIIIll(gameObject.getId(), llllIIIlIlIl[6]) || lIIIllllIIIIlII(gameObject.getId(), llllIIIlIlIl[7])) {
                            i2 = llllIIIlIlIl[2];
                        }
                    }
                    i3++;
                    "".length();
                    if ("  ".length() > (128 ^ 132)) {
                        return;
                    }
                }
                if (!lIIIllllIIIIIIl(i) || lIIIllllIIIIIIl(i2)) {
                    it.remove();
                }
                "".length();
                if (0 != 0) {
                    return;
                }
            }
        }
        this.l = Players.getLocal().getWorldLocation();
    }

    private static boolean lIIIlllIlllllll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllllIIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllllIIIlIIl(int i, int i2) {
        return i <= i2;
    }

    public Map<WorldPoint, f> h() {
        return this.g;
    }

    public WorldPoint k() {
        return this.l;
    }

    private int e() {
        int level = (Skills.getLevel(Skill.HUNTER) / llllIIIlIlIl[14]) + llllIIIlIlIl[2];
        if (lIIIllllIIIlIII(Game.getWildyLevel()) && lIIIllllIIIIIII(Worlds.getCurrentWorld().isAllPkWorld() ? 1 : 0)) {
            level++;
        }
        return level;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean d() {
        int i = llllIIIlIlIl[13];
        for (Item item : Inventory.getAll(item2 -> {
            String str = llllIIIIlIII[llllIIIlIlIl[16]];
            return item2.hasAction((v1) -> {
                return r1.equals(v1);
            });
        })) {
            item.interact(llllIIIIlIII[llllIIIlIlIl[2]]);
            int i2 = i;
            i--;
            if (lIIIllllIIIIlll(i2)) {
                return llllIIIlIlIl[2];
            }
            "".length();
            if (" ".length() <= (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (lIIIllllIIIIIlI(i, llllIIIlIlIl[13])) {
            ?? r0 = llllIIIlIlIl[2];
            "".length();
            return 0 != 0 ? ((((177 + 105) - 169) + 75) ^ (((112 + 119) - 213) + 113)) & (((86 ^ 98) ^ (17 ^ 26)) ^ (-" ".length())) : r0;
        }
        return llllIIIlIlIl[1];
    }

    public Instant j() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    public boolean c() {
        List<TileObject> g = g();
        if (lIIIllllIIIIIII(b() ? 1 : 0)) {
            return llllIIIlIlIl[1];
        }
        int[] iArr = new int[llllIIIlIlIl[2]];
        iArr[llllIIIlIlIl[1]] = llllIIIlIlIl[11];
        if (lIIIllllIIIIIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llllIIIlIlIl[2]];
            iArr2[llllIIIlIlIl[1]] = llllIIIlIlIl[10];
            if (!lIIIllllIIIIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                for (TileObject tileObject : g) {
                    if (!lIIIllllIIIIllI(tileObject.distanceTo(Players.getLocal()), llllIIIlIlIl[12])) {
                        String[] strArr = new String[llllIIIlIlIl[2]];
                        strArr[llllIIIlIlIl[1]] = llllIIIIlIII[llllIIIlIlIl[1]];
                        return tileObject.hasAction(strArr);
                    }
                    "".length();
                    if ((-((((80 + 28) - (-8)) + 27) ^ (((1 + 106) - 90) + 122))) >= 0) {
                        return ((((198 + 128) - 207) + 102) ^ (((162 + 132) - 181) + 84)) & (((((88 + 40) - 107) + 107) ^ (((82 + 116) - 171) + 125)) ^ (-" ".length()));
                    }
                }
                return llllIIIlIlIl[1];
            }
        }
        return llllIIIlIlIl[1];
    }

    static {
        lIIIlllIllllllI();
        lIIIlllIlllllIl();
    }

    private static boolean lIIIllllIIIIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean b() {
        int i;
        EnumC0004e method = this.i.method();
        int i2 = llllIIIlIlIl[1];
        if (lIIIllllIIIIlIl(method, EnumC0004e.BIRDS)) {
            int[] iArr = new int[llllIIIlIlIl[2]];
            iArr[llllIIIlIlIl[1]] = llllIIIlIlIl[8];
            i2 = Inventory.contains(iArr) ? 1 : 0;
        }
        if (lIIIllllIIIIlIl(method, EnumC0004e.CHINS)) {
            int[] iArr2 = new int[llllIIIlIlIl[2]];
            iArr2[llllIIIlIlIl[1]] = llllIIIlIlIl[9];
            i2 = Inventory.contains(iArr2) ? 1 : 0;
        }
        if (lIIIllllIIIIlIl(method, EnumC0004e.SALLIES)) {
            int[] iArr3 = new int[llllIIIlIlIl[2]];
            iArr3[llllIIIlIlIl[1]] = llllIIIlIlIl[10];
            if (lIIIllllIIIIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llllIIIlIlIl[2]];
                iArr4[llllIIIlIlIl[1]] = llllIIIlIlIl[11];
                if (lIIIllllIIIIIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                    i = llllIIIlIlIl[2];
                    "".length();
                    if ((-" ".length()) >= (46 ^ 42)) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    i2 = i;
                }
            }
            i = llllIIIlIlIl[1];
            i2 = i;
        }
        if (lIIIllllIIIIllI(e(), this.g.size()) && lIIIllllIIIIIIl(i2)) {
            ?? r0 = llllIIIlIlIl[2];
            "".length();
            return ("   ".length() & ("   ".length() ^ (-1))) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIIIlIlIl[1];
    }

    private static boolean lIIIllllIIIIIIl(int i) {
        return i != 0;
    }

    public WorldPoint a(EnumC0003d enumC0003d) {
        return enumC0003d.a(e()).stream().filter(worldPoint -> {
            if (lIIIllllIIIIIII(this.g.containsKey(worldPoint) ? 1 : 0)) {
                ?? r0 = llllIIIlIlIl[2];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIIIlIlIl[1];
        }).min(Comparator.comparing(worldPoint2 -> {
            return Integer.valueOf(worldPoint2.distanceTo(Players.getLocal().getWorldLocation()));
        })).orElse(null);
    }
}
