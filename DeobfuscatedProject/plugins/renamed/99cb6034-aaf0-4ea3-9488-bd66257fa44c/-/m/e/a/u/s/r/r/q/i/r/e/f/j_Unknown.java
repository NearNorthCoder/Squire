/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.Notifier
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.game.ItemManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.BEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.D_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.EEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.FEnum;
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
import java.util.Iterator;
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
public class j_Unknown {
    private /* synthetic */ B M;
    private /* synthetic */ long S;
    private final /* synthetic */ ItemManager az;
    private static /* synthetic */ int[] llIIIIlIlIlI;
    public static final /* synthetic */ int av;
    private final /* synthetic */ SquireFarmerConfig aC;
    private final /* synthetic */ ConfigManager aA;
    private /* synthetic */ E aF;
    private final /* synthetic */ ConcurrentMap<E, D> aE;
    private final /* synthetic */ Set<E> aD;
    private final /* synthetic */ Notifier aB;
    public static final /* synthetic */ ImmutableSet<Integer> aw;
    private final /* synthetic */ Client ay;
    public static final /* synthetic */ ImmutableSet<Integer> ax;
    private static /* synthetic */ String[] llIIIIlIlIIl;

    private static boolean llllIIlIlIIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    private j(Client client, ItemManager itemManager, ConfigManager configManager, Notifier notifier, SquireFarmerConfig squireFarmerConfig) {
        this.aD = new HashSet<E>();
        this.aE = new ConcurrentHashMap<E, D>();
        this.M = B.UNKNOWN;
        this.S = -1L;
        this.ay = client;
        this.az = itemManager;
        this.aA = configManager;
        this.aB = notifier;
        this.aC = squireFarmerConfig;
    }

    private static void llllIIlIIllIIl() {
        llIIIIlIlIIl = new String[llIIIIlIlIlI[17]];
        j.llIIIIlIlIIl[j.llIIIIlIlIlI[0]] = j."timetracking";
        j.llIIIIlIlIIl[j.llIIIIlIlIlI[1]] = j.":";
        j.llIIIIlIlIIl[j.llIIIIlIlIlI[2]] = j."timetracking";
        j.llIIIIlIlIIl[j.llIIIIlIlIlI[4]] = j."birdHouseNotification";
        j.llIIIIlIlIIl[j.llIIIIlIlIlI[5]] = j."Your bird houses are ready to be dismantled.";
        j.llIIIIlIlIIl[j.llIIIIlIlIlI[6]] = j."timetracking";
        j.llIIIIlIlIIl[j.llIIIIlIlIlI[7]] = j."birdhouse";
        j.llIIIIlIlIIl[j.llIIIIlIlIlI[8]] = j."Space";
    }

    private static String llllIIlIIllIII(String var38, String var39) {
        var38 = new String(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var55 = var39.toCharArray();
        int var12 = llIIIIlIlIlI[0];
        char[] var52 = var38.toCharArray();
        int var59 = var52.length;
        int var2 = llIIIIlIlIlI[0];
        while (j.llllIIlIIllIll(var2, var59)) {
            char var35 = var52[var2];
            var10.append((char)(var35 ^ var55[var12 % var55.length]));
            0;
            ++var12;
            ++var2;
            0;
            if ((1 + 156 - 141 + 148 ^ 101 + 89 - 150 + 121) > 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static String llllIIlIIlIllI(String var1, String var25) {
        try {
            SecretKeySpec var58 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), llIIIIlIlIlI[17]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(llIIIIlIlIlI[2], var58);
            return new String(var3.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var60) {
            var60.printStackTrace();
            return null;
        }
    }

    public ConcurrentMap<E, D> R() {
        return this.aE;
    }

    private static boolean llllIIlIIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean llllIIlIIlllII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(WorldPoint worldPoint) {
        boolean bl = llIIIIlIlIlI[0];
        if (j.llllIIlIIllllI(aw.contains((Object)worldPoint.getRegionID()) ? 1 : 0) && j.llllIIlIlIIIlI(worldPoint.getPlane())) {
            void var11;
            int var44;
            void var33;
            j var50;
            void var54;
            HashMap hashMap = new HashMap();
            long l2 = Instant.now().getEpochSecond();
            int n2 = llIIIIlIlIlI[0];
            E[] eArray = E.values();
            int n3 = eArray.length;
            int var7 = llIIIIlIlIlI[0];
            while (j.llllIIlIIllIll(var7, (int)var54)) {
                int var4;
                int n4;
                void var41;
                void var8 = var41[var7];
                int var19 = var50.ay.getVarpValue(var8.ax());
                D var53 = (D)var50.aE.get(var8);
                if (j.llllIIlIlIIIIl(var53)) {
                    n4 = llIIIIlIlIlI[3];
                    0;
                    if (-1 > 0) {
                        return false;
                    }
                } else {
                    n4 = var53.ax();
                }
                if (j.llllIIlIlIIlIl(var19, var4 = n4)) {
                    void var6;
                    var33.put(var8, new D((E)var8, var19, (long)var6));
                    0;
                    var44 = llIIIIlIlIlI[1];
                }
                if (j.llllIIlIlIIlII(var19) && j.llllIIlIlIIllI(var4)) {
                    ++var11;
                }
                ++var7;
                0;
                if ((0x7B ^ 0x7F) > -1) continue;
                return false;
            }
            if (j.llllIIlIlIIlll((int)var11, llIIIIlIlIlI[2])) {
                return llIIIIlIlIlI[0];
            }
            if (j.llllIIlIIllllI(var44)) {
                var50.aE.putAll((Map<E, D>)var33);
                var50.E();
                var50.a((Map<E, D>)var33);
            }
        }
        return bl;
    }

    private static boolean llllIIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    public TileObject a(E e2) {
        return TileObjects.getFirstAt((WorldPoint)e2.az(), tileObject -> {
            int n2;
            if (j.llllIIlIIlllII(tileObject.getName()) && (!j.llllIIlIlIIIlI(tileObject.getName().toLowerCase().contains(llIIIIlIlIIl[llIIIIlIlIlI[7]]) ? 1 : 0) || j.llllIIlIIllllI(tileObject.getName().equals(llIIIIlIlIIl[llIIIIlIlIlI[8]]) ? 1 : 0))) {
                n2 = llIIIIlIlIlI[1];
                0;
                if (((0x27 ^ 0x4F ^ (7 ^ 0x39)) & (8 ^ 0x31 ^ (0x55 ^ 0x3A) ^ -1)) != 0) {
                    return false;
                }
            } else {
                n2 = llIIIIlIlIlI[0];
            }
            return n2 != 0;
        });
    }

    private static boolean llllIIlIIlllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllIIlIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIIlIlIIlII(int n2) {
        return n2 <= 0;
    }

    /*
     * WARNING - void declaration
     */
    public void M() {
        void var18;
        this.aE.clear();
        E[] eArray = E.values();
        int n2 = eArray.length;
        int var14 = llIIIIlIlIlI[0];
        while (j.llllIIlIIllIll(var14, (int)var18)) {
            String[] var26;
            j var23;
            void var16;
            void var15 = var16[var14];
            String var30 = "birdhouse." + var15.ax();
            String var46 = var23.aA.getRSProfileConfiguration(llIIIIlIlIIl[llIIIIlIlIlI[0]], var30);
            if (j.llllIIlIIlllII(var46) && j.llllIIlIIlllIl((var26 = var46.split(llIIIIlIlIIl[llIIIIlIlIlI[1]])).length, llIIIIlIlIlI[2])) {
                try {
                    int var17 = Integer.parseInt(var26[llIIIIlIlIlI[0]]);
                    long var32 = Long.parseLong(var26[llIIIIlIlIlI[1]]);
                    var23.aE.put((E)var15, new D((E)var15, var17, var32));
                    0;
                }
                catch (NumberFormatException var17) {
                    // empty catch block
                }
                0;
                if (3 < 0) {
                    return;
                }
            }
            ++var14;
            0;
            if (-1 == -1) continue;
            return;
        }
        this.E();
    }

    private static String llllIIlIIlIlll(String var34, String var29) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var29.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(llIIIIlIlIlI[2], var13);
            return new String(var20.doFinal(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var48) {
            var48.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIlIlIIllI(int n2) {
        return n2 > 0;
    }

    public boolean P() {
        if (j.llllIIlIlIIIII((Object)this.M, (Object)B.IN_PROGRESS) && j.llllIIlIlIlIIl(j.llllIIlIlIlIII(this.S, Instant.now().getEpochSecond()))) {
            this.M = B.COMPLETED;
            this.S = 0L;
            if (j.llllIIlIIllllI(Boolean.TRUE.equals(this.aA.getRSProfileConfiguration(llIIIIlIlIIl[llIIIIlIlIlI[2]], llIIIIlIlIIl[llIIIIlIlIlI[4]], Boolean.TYPE)) ? 1 : 0)) {
                this.aB.notify(llIIIIlIlIIl[llIIIIlIlIlI[5]]);
            }
            return llIIIIlIlIlI[1];
        }
        return llIIIIlIlIlI[0];
    }

    private static void llllIIlIIllIlI() {
        llIIIIlIlIlI = new int[18];
        j.llIIIIlIlIlI[0] = (62 + 103 - 17 + 64 ^ 69 + 81 - 99 + 85) & (0xBB ^ 0x87 ^ (0xE1 ^ 0x81) ^ -1);
        j.llIIIIlIlIlI[1] = 1;
        j.llIIIIlIlIlI[2] = 2;
        j.llIIIIlIlIlI[3] = -1;
        j.llIIIIlIlIlI[4] = 3;
        j.llIIIIlIlIlI[5] = 0x4D ^ 0x49;
        j.llIIIIlIlIlI[6] = 0x45 ^ 0x40;
        j.llIIIIlIlIlI[7] = 0x17 ^ 0x48 ^ (0x7D ^ 0x24);
        j.llIIIIlIlIlI[8] = 38 + 150 - 118 + 92 ^ 83 + 22 - 62 + 122;
        j.llIIIIlIlIlI[9] = 0xFFFFFFBE & 0x397B;
        j.llIIIIlIlIlI[10] = 0xFFFFBD3F & 0x7BFB;
        j.llIIIIlIlIlI[11] = -(0xFFFFD6F7 & 0x6F0B) & (0xFFFFFFBE & 0x7F7F);
        j.llIIIIlIlIlI[12] = 0xFFFFFFBB & 0x3A7E;
        j.llIIIIlIlIlI[13] = 0xFFFFFEBB & 0x3B7F;
        j.llIIIIlIlIlI[14] = 0xFFFFBBFE & 0x7F3B;
        j.llIIIIlIlIlI[15] = 0xFFFFFBBF & 0x3F7B;
        j.llIIIIlIlIlI[16] = -(72 + 72 - 142 + 192) & (0xFFFFBFFD & 0x7AFF);
        j.llIIIIlIlIlI[17] = 0x4B ^ 0x15 ^ (0x90 ^ 0xC6);
    }

    public long s() {
        return this.S;
    }

    private static boolean llllIIlIlIlIIl(int n2) {
        return n2 < 0;
    }

    private static boolean llllIIlIlIIIIl(Object object) {
        return object == null;
    }

    private void a(Map<E, D> map) {
        Iterator<D> var56 = map.values().iterator();
        while (j.llllIIlIIllllI(var56.hasNext() ? 1 : 0)) {
            j var31;
            D var61 = var56.next();
            String var27 = "birdhouse." + var61.aw().ax();
            var31.aA.setRSProfileConfiguration(llIIIIlIlIIl[llIIIIlIlIlI[6]], var27, (Object)(var61.ax() + ":" + var61.ay()));
            0;
            
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(E e2) {
        void var21;
        void var28;
        j var51;
        D d2 = (D)this.aE.get((Object)e2);
        if (j.llllIIlIlIIIIl(d2)) {
            return llIIIIlIlIlI[0];
        }
        if (j.llllIIlIIllllI(var51.aC.birdhouses_ignoreTimers() ? 1 : 0) && j.llllIIlIlIIIlI(var51.aD.contains(var28) ? 1 : 0)) {
            return llIIIIlIlIlI[1];
        }
        if (j.llllIIlIlIIlII(j.llllIIlIlIIIll(var21.ay() + (long)av, Instant.now().getEpochSecond()))) {
            var51.aD.remove(var28);
            0;
            return llIIIIlIlIlI[1];
        }
        return llIIIIlIlIlI[0];
    }

    public Set<E> Q() {
        return this.aD;
    }

    private static boolean llllIIlIlIIIlI(int n2) {
        return n2 == 0;
    }

    public B p() {
        return this.M;
    }

    private static boolean llllIIlIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    static {
        j.llllIIlIIllIlI();
        j.llllIIlIIllIIl();
        av = (int)Duration.ofMinutes(50L).getSeconds();
        Object[] objectArray = new Integer[llIIIIlIlIlI[1]];
        objectArray[j.llIIIIlIlIlI[0]] = llIIIIlIlIlI[15];
        aw = ImmutableSet.of((Object)llIIIIlIlIlI[9], (Object)llIIIIlIlIlI[10], (Object)llIIIIlIlIlI[11], (Object)llIIIIlIlIlI[12], (Object)llIIIIlIlIlI[13], (Object)llIIIIlIlIlI[14], (Object[])objectArray);
        ax = ImmutableSet.of((Object)llIIIIlIlIlI[9], (Object)llIIIIlIlIlI[10], (Object)llIIIIlIlIlI[11], (Object)llIIIIlIlIlI[12], (Object)llIIIIlIlIlI[16]);
    }

    /*
     * WARNING - void declaration
     */
    public int N() {
        void var49;
        int n2 = llIIIIlIlIlI[0];
        E[] eArray = E.values();
        int n3 = eArray.length;
        int var57 = llIIIIlIlIlI[0];
        while (j.llllIIlIIllIll(var57, (int)var49)) {
            j var24;
            void var43;
            void var22 = var43[var57];
            if (j.llllIIlIIllllI(var24.c((E)var22) ? 1 : 0) && (!j.llllIIlIIlllll((Object)var24.b((E)var22), (Object)F.SEEDED) || j.llllIIlIlIIIII((Object)var24.b((E)var22), (Object)F.EMPTY))) {
                void var40;
                ++var40;
            }
            ++var57;
            0;
            if ((0x8B ^ 0x8F) != 0) continue;
            return (0 ^ 0x5F) & ~(0xFD ^ 0xA2);
        }
        int[] nArray = new int[llIIIIlIlIlI[2]];
        nArray[j.llIIIIlIlIlI[0]] = this.aC.birdhouse_type().au();
        nArray[j.llIIIIlIlIlI[1]] = this.aC.birdhouse_type().av();
        return Math.max(llIIIIlIlIlI[0], n2 - Inventory.getCount((int[])nArray));
    }

    private static int llllIIlIlIlIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static int llllIIlIlIIIll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public F b(E e2) {
        D d2 = (D)this.aE.get((Object)e2);
        if (j.llllIIlIlIIIIl(d2)) {
            return F.EMPTY;
        }
        return F.d(d2.ax());
    }

    private static int llllIIlIlIlIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public E O() {
        j var9;
        if (j.llllIIlIlIIIIl((Object)this.aF)) {
            Player player = Players.getLocal();
            Stream.of(E.values()).filter(e2 -> {
                boolean bl;
                if (!j.llllIIlIlIIIlI(this.c((E)((Object)e2)) ? 1 : 0) || j.llllIIlIIlllll((Object)this.b((E)((Object)e2)), (Object)F.SEEDED)) {
                    bl = llIIIIlIlIlI[1];
                    0;
                    if (-(0x17 ^ 0x21 ^ (0x63 ^ 0x51)) > 0) {
                        return ((0x3B ^ 0x59 ^ (0xBE ^ 0x9B)) & (27 + 66 - 45 + 83 ^ 143 + 18 - -6 + 29 ^ -1)) != 0;
                    }
                } else {
                    bl = llIIIIlIlIlI[0];
                }
                return bl;
            }).min(Comparator.comparingDouble(e2 -> e2.az().distanceToHypotenuse(player.getWorldLocation()))).ifPresent(e2 -> {
                this.aF = e2;
            });
            0;
            if (((0x67 ^ 0x48) & ~(0x6D ^ 0x42)) <= -1) {
                return null;
            }
        } else if (j.llllIIlIlIIIlI(var9.c(var9.aF) ? 1 : 0) && j.llllIIlIlIIIII((Object)var9.b(var9.aF), (Object)F.SEEDED)) {
            var9.aF = null;
        }
        return this.aF;
    }

    private static boolean llllIIlIlIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private void E() {
        j var5;
        if (j.llllIIlIIllllI(this.aE.isEmpty() ? 1 : 0)) {
            this.M = B.UNKNOWN;
            this.S = -1L;
            return;
        }
        int var37 = llIIIIlIlIlI[1];
        long var45 = 0L;
        Iterator var42 = var5.aE.values().iterator();
        while (j.llllIIlIIllllI(var42.hasNext() ? 1 : 0)) {
            D var36 = (D)var42.next();
            F var47 = F.d(var36.ax());
            if (j.llllIIlIIlllll((Object)var47, (Object)F.EMPTY)) {
                var37 = llIIIIlIlIlI[0];
            }
            if (j.llllIIlIlIIIII((Object)var47, (Object)F.SEEDED)) {
                var45 = Math.max(var45, var36.ay() + (long)av);
            }
            0;
            
            return;
        }
        if (j.llllIIlIIllllI(var37)) {
            var5.M = B.EMPTY;
            var5.S = 0L;
            0;
            if (2 < 0) {
                return;
            }
        } else if (j.llllIIlIlIIlII(j.llllIIlIlIlIlI(var45, Instant.now().getEpochSecond()))) {
            var5.M = B.COMPLETED;
            var5.S = 0L;
            0;
            if (((0x27 ^ 0x75) & ~(0xF4 ^ 0xA6)) < -1) {
                return;
            }
        } else {
            var5.M = B.IN_PROGRESS;
            var5.S = var45;
        }
    }
}

