package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.Notifier;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.game.ItemManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@Singleton
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/j.class */
public class C0035j {
    private final /* synthetic */ ItemManager az;
    private static /* synthetic */ int[] llIIIIlIlIlI;
    public static final /* synthetic */ int av;
    private final /* synthetic */ SquireFarmerConfig aC;
    private final /* synthetic */ ConfigManager aA;
    private /* synthetic */ E aF;
    private final /* synthetic */ Notifier aB;
    public static final /* synthetic */ ImmutableSet<Integer> aw;
    private final /* synthetic */ Client ay;
    public static final /* synthetic */ ImmutableSet<Integer> ax;
    private static /* synthetic */ String[] llIIIIlIlIIl;
    private final /* synthetic */ Set<E> aD = new HashSet();
    private final /* synthetic */ ConcurrentMap<E, D> aE = new ConcurrentHashMap();
    private /* synthetic */ B M = B.UNKNOWN;
    private /* synthetic */ long S = -1;

    private static boolean llllIIlIlIIlll(int i, int i2) {
        return i > i2;
    }

    @Inject
    private C0035j(Client client, ItemManager itemManager, ConfigManager configManager, Notifier notifier, SquireFarmerConfig squireFarmerConfig) {
        this.ay = client;
        this.az = itemManager;
        this.aA = configManager;
        this.aB = notifier;
        this.aC = squireFarmerConfig;
    }

    private static void llllIIlIIllIIl() {
        llIIIIlIlIIl = new String[llIIIIlIlIlI[17]];
        llIIIIlIlIIl[llIIIIlIlIlI[0]] = llllIIlIIlIllI("aH8+6a8qE0qBUdECGzYo8A==", "kNfCn");
        llIIIIlIlIIl[llIIIIlIlIlI[1]] = llllIIlIIlIlll("bZmJNPy9PSs=", "XlAoB");
        llIIIIlIlIIl[llIIIIlIlIlI[2]] = llllIIlIIlIlll("I83xGzoVH0OZOOxThFFNSQ==", "sNanH");
        llIIIIlIlIIl[llIIIIlIlIlI[4]] = llllIIlIIlIlll("nnBb0o2aEn/DM1181d1ukFNs91NBp7B2", "KXKNt");
        llIIIIlIlIIl[llIIIIlIlIlI[5]] = llllIIlIIllIII("KwkHJ1oQDwAxWhoJByYfAUYTJx9SFBc0HgtGBjpaEANSMRMBCxM7Dh4DFns=", "rfrUz");
        llIIIIlIlIIl[llIIIIlIlIlI[6]] = llllIIlIIllIII("Eg8uPS0UByAzMAgB", "ffCXY");
        llIIIIlIlIIl[llIIIIlIlIlI[7]] = llllIIlIIlIllI("kY38mu9TxVTt/g5hm6eL6A==", "ltSVX");
        llIIIIlIlIIl[llIIIIlIlIlI[8]] = llllIIlIIlIlll("JgvskoXpA+U=", "YjpSl");
    }

    private static String llllIIlIIllIII(String lllllllllllllllIlIlIlIlllIlIIIII, String lllllllllllllllIlIlIlIlllIIlllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlllIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIlIlllIIlllll.toCharArray();
        int lllllllllllllllIlIlIlIlllIIlllII = llIIIIlIlIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIIIlIlIlI[0];
        while (llllIIlIIllIll(i, length)) {
            char lllllllllllllllIlIlIlIlllIlIIIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIlIlIlIlllIlIIIIl ^ charArray[lllllllllllllllIlIlIlIlllIIlllII % charArray.length]));
            "".length();
            lllllllllllllllIlIlIlIlllIIlllII++;
            i++;
            "".length();
            if (((((1 + 156) - 141) + 148) ^ (((101 + 89) - 150) + 121)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llllIIlIIlIllI(String lllllllllllllllIlIlIlIlllIllIIII, String lllllllllllllllIlIlIlIlllIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlllIlIllll.getBytes(StandardCharsets.UTF_8)), llIIIIlIlIlI[17]), "DES");
            Cipher lllllllllllllllIlIlIlIlllIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlIlllIllIIlI.init(llIIIIlIlIlI[2], secretKeySpec);
            return new String(lllllllllllllllIlIlIlIlllIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIlllIllIIIl) {
            lllllllllllllllIlIlIlIlllIllIIIl.printStackTrace();
            return null;
        }
    }

    public ConcurrentMap<E, D> R() {
        return this.aE;
    }

    private static boolean llllIIlIIllllI(int i) {
        return i != 0;
    }

    private static boolean llllIIlIIlllII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean a(WorldPoint worldPoint) {
        int ax2;
        int i = llIIIIlIlIlI[0];
        if (llllIIlIIllllI(aw.contains(Integer.valueOf(worldPoint.getRegionID())) ? 1 : 0) && llllIIlIlIIIlI(worldPoint.getPlane())) {
            HashMap hashMap = new HashMap();
            long lllllllllllllllIlIlIlIllllIllllI = Instant.now().getEpochSecond();
            int i2 = llIIIIlIlIlI[0];
            E[] values = E.values();
            int length = values.length;
            int i3 = llIIIIlIlIlI[0];
            while (llllIIlIIllIll(i3, length)) {
                E e = values[i3];
                int varpValue = this.ay.getVarpValue(e.ax());
                D d = this.aE.get(e);
                if (llllIIlIlIIIIl(d)) {
                    ax2 = llIIIIlIlIlI[3];
                    "".length();
                    if ((-" ".length()) > 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    ax2 = d.ax();
                }
                int i4 = ax2;
                if (llllIIlIlIIlIl(varpValue, i4)) {
                    hashMap.put(e, new D(e, varpValue, lllllllllllllllIlIlIlIllllIllllI));
                    "".length();
                    i = llIIIIlIlIlI[1];
                }
                if (llllIIlIlIIlII(varpValue) && llllIIlIlIIllI(i4)) {
                    i2++;
                }
                i3++;
                "".length();
                if ((123 ^ 127) <= (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            if (llllIIlIlIIlll(i2, llIIIIlIlIlI[2])) {
                return llIIIIlIlIlI[0];
            }
            if (llllIIlIIllllI(i)) {
                this.aE.putAll(hashMap);
                E();
                a(hashMap);
            }
        }
        return i;
    }

    private static boolean llllIIlIIllIll(int i, int i2) {
        return i < i2;
    }

    public TileObject a(E e) {
        return TileObjects.getFirstAt(e.az(), tileObject -> {
            if (!llllIIlIIlllII(tileObject.getName()) || (llllIIlIlIIIlI(tileObject.getName().toLowerCase().contains(llIIIIlIlIIl[llIIIIlIlIlI[7]]) ? 1 : 0) && !llllIIlIIllllI(tileObject.getName().equals(llIIIIlIlIIl[llIIIIlIlIlI[8]]) ? 1 : 0))) {
                return llIIIIlIlIlI[0];
            }
            ?? r0 = llIIIIlIlIlI[1];
            "".length();
            return (((39 ^ 79) ^ (7 ^ 57)) & (((8 ^ 49) ^ (85 ^ 58)) ^ (-" ".length()))) != 0 ? ((((73 + 89) - 84) + 121) ^ (((110 + 25) - (-17)) + 5)) & (((((210 + 134) - 254) + 127) ^ (((12 + 33) - 6) + 92)) ^ (-" ".length())) : r0;
        });
    }

    private static boolean llllIIlIIlllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llllIIlIIlllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llllIIlIlIIlII(int i) {
        return i <= 0;
    }

    public void M() {
        this.aE.clear();
        E[] values = E.values();
        int length = values.length;
        int i = llIIIIlIlIlI[0];
        while (llllIIlIIllIll(i, length)) {
            E e = values[i];
            String lllllllllllllllIlIlIllIIIIIIllll = this.aA.getRSProfileConfiguration(llIIIIlIlIIl[llIIIIlIlIlI[0]], "birdhouse." + e.ax());
            if (llllIIlIIlllII(lllllllllllllllIlIlIllIIIIIIllll)) {
                String[] split = lllllllllllllllIlIlIllIIIIIIllll.split(llIIIIlIlIIl[llIIIIlIlIlI[1]]);
                if (llllIIlIIlllIl(split.length, llIIIIlIlIlI[2])) {
                    try {
                        this.aE.put(e, new D(e, Integer.parseInt(split[llIIIIlIlIlI[0]]), Long.parseLong(split[llIIIIlIlIlI[1]])));
                        "".length();
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                    } catch (NumberFormatException e2) {
                    }
                }
            }
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return;
            }
        }
        E();
    }

    private static String llllIIlIIlIlll(String lllllllllllllllIlIlIlIlllIIIlIll, String lllllllllllllllIlIlIlIlllIIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlllIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlIlllIIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIlllIIIllIl.init(llIIIIlIlIlI[2], secretKeySpec);
            return new String(lllllllllllllllIlIlIlIlllIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIlllIIIllII) {
            lllllllllllllllIlIlIlIlllIIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIlIlIIllI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean P() {
        if (llllIIlIlIIIII(this.M, B.IN_PROGRESS) && llllIIlIlIlIIl(llllIIlIlIlIII(this.S, Instant.now().getEpochSecond()))) {
            this.M = B.COMPLETED;
            this.S = 0L;
            if (llllIIlIIllllI(Boolean.TRUE.equals(this.aA.getRSProfileConfiguration(llIIIIlIlIIl[llIIIIlIlIlI[2]], llIIIIlIlIIl[llIIIIlIlIlI[4]], Boolean.TYPE)) ? 1 : 0)) {
                this.aB.notify(llIIIIlIlIIl[llIIIIlIlIlI[5]]);
            }
            return llIIIIlIlIlI[1];
        }
        return llIIIIlIlIlI[0];
    }

    private static void llllIIlIIllIlI() {
        llIIIIlIlIlI = new int[18];
        llIIIIlIlIlI[0] = ((((62 + 103) - 17) + 64) ^ (((69 + 81) - 99) + 85)) & (((187 ^ 135) ^ (225 ^ 129)) ^ (-" ".length()));
        llIIIIlIlIlI[1] = " ".length();
        llIIIIlIlIlI[2] = "  ".length();
        llIIIIlIlIlI[3] = -" ".length();
        llIIIIlIlIlI[4] = "   ".length();
        llIIIIlIlIlI[5] = 77 ^ 73;
        llIIIIlIlIlI[6] = 69 ^ 64;
        llIIIIlIlIlI[7] = (23 ^ 72) ^ (125 ^ 36);
        llIIIIlIlIlI[8] = (((38 + 150) - 118) + 92) ^ (((83 + 22) - 62) + 122);
        llIIIIlIlIlI[9] = (-66) & 14715;
        llIIIIlIlIlI[10] = (-17089) & 31739;
        llIIIIlIlIlI[11] = (-((-10505) & 28427)) & (-66) & 32639;
        llIIIIlIlIlI[12] = (-69) & 14974;
        llIIIIlIlIlI[13] = (-325) & 15231;
        llIIIIlIlIlI[14] = (-17410) & 32571;
        llIIIIlIlIlI[15] = (-1089) & 16251;
        llIIIIlIlIlI[16] = (-(((72 + 72) - 142) + 192)) & (-16387) & 31487;
        llIIIIlIlIlI[17] = (75 ^ 21) ^ (144 ^ 198);
    }

    public long s() {
        return this.S;
    }

    private static boolean llllIIlIlIlIIl(int i) {
        return i < 0;
    }

    private static boolean llllIIlIlIIIIl(Object obj) {
        return obj == null;
    }

    private void a(Map<E, D> map) {
        for (D d : map.values()) {
            this.aA.setRSProfileConfiguration(llIIIIlIlIIl[llIIIIlIlIlI[6]], "birdhouse." + d.aw().ax(), d.ax() + ":" + d.ay());
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean c(E e) {
        D d = this.aE.get(e);
        if (llllIIlIlIIIIl(d)) {
            return llIIIIlIlIlI[0];
        }
        if (llllIIlIIllllI(this.aC.birdhouses_ignoreTimers() ? 1 : 0) && llllIIlIlIIIlI(this.aD.contains(e) ? 1 : 0)) {
            return llIIIIlIlIlI[1];
        }
        if (llllIIlIlIIlII(llllIIlIlIIIll(d.ay() + av, Instant.now().getEpochSecond()))) {
            this.aD.remove(e);
            "".length();
            return llIIIIlIlIlI[1];
        }
        return llIIIIlIlIlI[0];
    }

    public Set<E> Q() {
        return this.aD;
    }

    private static boolean llllIIlIlIIIlI(int i) {
        return i == 0;
    }

    public B p() {
        return this.M;
    }

    private static boolean llllIIlIlIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        llllIIlIIllIlI();
        llllIIlIIllIIl();
        av = (int) Duration.ofMinutes(50L).getSeconds();
        Integer valueOf = Integer.valueOf(llIIIIlIlIlI[9]);
        Integer valueOf2 = Integer.valueOf(llIIIIlIlIlI[10]);
        Integer valueOf3 = Integer.valueOf(llIIIIlIlIlI[11]);
        Integer valueOf4 = Integer.valueOf(llIIIIlIlIlI[12]);
        Integer valueOf5 = Integer.valueOf(llIIIIlIlIlI[13]);
        Integer valueOf6 = Integer.valueOf(llIIIIlIlIlI[14]);
        Integer[] numArr = new Integer[llIIIIlIlIlI[1]];
        numArr[llIIIIlIlIlI[0]] = Integer.valueOf(llIIIIlIlIlI[15]);
        aw = ImmutableSet.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, numArr);
        ax = ImmutableSet.of(Integer.valueOf(llIIIIlIlIlI[9]), Integer.valueOf(llIIIIlIlIlI[10]), Integer.valueOf(llIIIIlIlIlI[11]), Integer.valueOf(llIIIIlIlIlI[12]), Integer.valueOf(llIIIIlIlIlI[16]));
    }

    public int N() {
        int i = llIIIIlIlIlI[0];
        E[] values = E.values();
        int length = values.length;
        int i2 = llIIIIlIlIlI[0];
        while (llllIIlIIllIll(i2, length)) {
            E e = values[i2];
            if (llllIIlIIllllI(c(e) ? 1 : 0) && (!llllIIlIIlllll(b(e), F.SEEDED) || llllIIlIlIIIII(b(e), F.EMPTY))) {
                i++;
            }
            i2++;
            "".length();
            if (!(true ^ true)) {
                return (0 ^ 95) & ((253 ^ 162) ^ (-1));
            }
        }
        int i3 = llIIIIlIlIlI[0];
        int[] iArr = new int[llIIIIlIlIlI[2]];
        iArr[llIIIIlIlIlI[0]] = this.aC.birdhouse_type().au();
        iArr[llIIIIlIlIlI[1]] = this.aC.birdhouse_type().av();
        return Math.max(i3, i - Inventory.getCount(iArr));
    }

    private static int llllIIlIlIlIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static int llllIIlIlIIIll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    public F b(E e) {
        D d = this.aE.get(e);
        return llllIIlIlIIIIl(d) ? F.EMPTY : F.d(d.ax());
    }

    private static int llllIIlIlIlIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    public E O() {
        if (llllIIlIlIIIIl(this.aF)) {
            Player local = Players.getLocal();
            Stream.of((Object[]) E.values()).filter(e -> {
                if (!llllIIlIlIIIlI(c(e) ? 1 : 0) || llllIIlIIlllll(b(e), F.SEEDED)) {
                    ?? r0 = llIIIIlIlIlI[1];
                    "".length();
                    return (-((23 ^ 33) ^ (99 ^ 81))) > 0 ? ((59 ^ 89) ^ (190 ^ 155)) & (((((27 + 66) - 45) + 83) ^ (((143 + 18) - (-6)) + 29)) ^ (-" ".length())) : r0;
                }
                return llIIIIlIlIlI[0];
            }).min(Comparator.comparingDouble(e2 -> {
                return e2.az().distanceToHypotenuse(local.getWorldLocation());
            })).ifPresent(e3 -> {
                this.aF = e3;
            });
            "".length();
            if (((103 ^ 72) & ((109 ^ 66) ^ (-1))) <= (-" ".length())) {
                return null;
            }
        } else if (llllIIlIlIIIlI(c(this.aF) ? 1 : 0) && llllIIlIlIIIII(b(this.aF), F.SEEDED)) {
            this.aF = null;
        }
        return this.aF;
    }

    private static boolean llllIIlIlIIlIl(int i, int i2) {
        return i != i2;
    }

    private void E() {
        if (llllIIlIIllllI(this.aE.isEmpty() ? 1 : 0)) {
            this.M = B.UNKNOWN;
            this.S = -1L;
            return;
        }
        int lllllllllllllllIlIlIlIllllIIllII = llIIIIlIlIlI[1];
        long j = 0;
        for (D d : this.aE.values()) {
            F d2 = F.d(d.ax());
            if (llllIIlIIlllll(d2, F.EMPTY)) {
                lllllllllllllllIlIlIlIllllIIllII = llIIIIlIlIlI[0];
            }
            if (llllIIlIlIIIII(d2, F.SEEDED)) {
                j = Math.max(j, d.ay() + av);
            }
            "".length();
            if (0 != 0) {
                return;
            }
        }
        if (llllIIlIIllllI(lllllllllllllllIlIlIlIllllIIllII)) {
            this.M = B.EMPTY;
            this.S = 0L;
            "".length();
            if ("  ".length() < 0) {
            }
        } else if (!llllIIlIlIIlII(llllIIlIlIlIlI(j, Instant.now().getEpochSecond()))) {
            this.M = B.IN_PROGRESS;
            this.S = j;
        } else {
            this.M = B.COMPLETED;
            this.S = 0L;
            "".length();
            if (((39 ^ 117) & ((244 ^ 166) ^ (-1))) < (-" ".length())) {
            }
        }
    }
}
