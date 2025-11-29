package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@Singleton
@TaskDesc(name = "Looting items", priority = 6, register = true, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.M  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/M.class */
public class M extends AbstractC0013n {
    private static /* synthetic */ int[] llIlIIIIIlII;
    private final /* synthetic */ C0001b bY;
    private final /* synthetic */ Set<TileItem> bX;
    private static /* synthetic */ String[] llIlIIIIIIll;

    public Set<TileItem> bD() {
        return this.bX;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public M(C0002c c0002c, C0001b c0001b) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIIIIlII[0]];
        enumC0003dArr[llIlIIIIIlII[1]] = EnumC0003d.FIRST_ROTATION_EXPLORE;
        enumC0003dArr[llIlIIIIIlII[2]] = EnumC0003d.DEMI_BOSS_EXPLORE;
        enumC0003dArr[llIlIIIIIlII[3]] = EnumC0003d.EXTRA_FOOD_EXPLORE;
        this.bX = new HashSet();
        this.bY = c0001b;
    }

    private static boolean lIIIIIIIlIlIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIIIIIIlIllIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIIIIIIlIlIIll() {
        llIlIIIIIlII = new int[7];
        llIlIIIIIlII[0] = "   ".length();
        llIlIIIIIlII[1] = (142 ^ 168) & ((142 ^ 168) ^ (-1));
        llIlIIIIIlII[2] = " ".length();
        llIlIIIIIlII[3] = "  ".length();
        llIlIIIIIlII[4] = (((123 + 156) - 186) + 71) ^ (((165 + 64) - 135) + 78);
        llIlIIIIIlII[5] = (108 ^ 106) ^ " ".length();
        llIlIIIIIlII[6] = 89 ^ 73;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        if (lIIIIIIIlIlIlII(this.ba.A() ? 1 : 0)) {
            return;
        }
        TileItem item = itemSpawned.getItem();
        if (lIIIIIIIlIlIlIl(this.ba.f(item.getId()) ? 1 : 0)) {
            this.bX.add(item);
            "".length();
        }
    }

    private static boolean lIIIIIIIlIlIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIIlIlIlIl(int i) {
        return i != 0;
    }

    static {
        lIIIIIIIlIlIIll();
        lIIIIIIIlIlIIlI();
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (lIIIIIIIlIlIlII(this.ba.A() ? 1 : 0)) {
            this.bX.clear();
        }
    }

    private static boolean lIIIIIIIlIlIlII(int i) {
        return i == 0;
    }

    private static String lIIIIIIIlIlIIIl(String lllllllllllllllIlIIIlllIIllIIlIl, String lllllllllllllllIlIIIlllIIllIIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIIlllIIllIIIlI = lllllllllllllllIlIIIlllIIllIIlII.toCharArray();
        int lllllllllllllllIlIIIlllIIllIIIIl = llIlIIIIIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlIIIlllIIlIllIIl = llIlIIIIIlII[1];
        while (lIIIIIIIlIllIIl(lllllllllllllllIlIIIlllIIlIllIIl, length)) {
            sb.append((char) (charArray[lllllllllllllllIlIIIlllIIlIllIIl] ^ lllllllllllllllIlIIIlllIIllIIIlI[lllllllllllllllIlIIIlllIIllIIIIl % lllllllllllllllIlIIIlllIIllIIIlI.length]));
            "".length();
            lllllllllllllllIlIIIlllIIllIIIIl++;
            lllllllllllllllIlIIIlllIIlIllIIl++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v154, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v158, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        int i;
        Player local = Players.getLocal();
        if (lIIIIIIIlIlIlIl(this.ba.V().av().e(local.getWorldLocation()) ? 1 : 0) && lIIIIIIIlIlIllI(EnumC0003d.EXTRA_FOOD_EXPLORE, this.ba.W())) {
            return llIlIIIIIlII[1];
        }
        this.bX.removeIf(tileItem -> {
            if (lIIIIIIIlIlIlIl(this.ba.f(tileItem.getId()) ? 1 : 0) && lIIIIIIIlIlIlll(tileItem.getTile()) && !lIIIIIIIlIllIll(tileItem.getWorldLocation().distanceTo(local.getWorldLocation()), llIlIIIIIlII[6])) {
                return llIlIIIIIlII[1];
            }
            ?? r0 = llIlIIIIIlII[2];
            "".length();
            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
        "".length();
        if (lIIIIIIIlIlIlIl(this.bX.isEmpty() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        List list = (List) this.bX.stream().filter(tileItem2 -> {
            if (lIIIIIIIlIlIlII(this.ba.V().av().e(tileItem2.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = llIlIIIIIlII[2];
                "".length();
                return "   ".length() != "   ".length() ? ((((49 + 61) - 93) + 139) ^ (((28 + 49) - (-48)) + 9)) & (((93 ^ 69) ^ "  ".length()) ^ (-" ".length())) : r0;
            }
            return llIlIIIIIlII[1];
        }).collect(Collectors.toList());
        if (!lIIIIIIIlIlIlIl(list.isEmpty() ? 1 : 0) && !lIIIIIIIlIlIlIl(this.bY.p() ? 1 : 0)) {
            EnumC0006g J = this.ba.J();
            if (lIIIIIIIlIlIlll(J) && lIIIIIIIlIlIlII(J.an().aC())) {
                i = llIlIIIIIlII[2];
                "".length();
                if ((((52 ^ 6) ^ (165 ^ 198)) & (((90 ^ 85) ^ (101 ^ 59)) ^ (-" ".length()))) != 0) {
                    return ((139 ^ 159) ^ (72 ^ 100)) & (((78 ^ 17) ^ (35 ^ 68)) ^ (-" ".length()));
                }
            } else {
                i = llIlIIIIIlII[1];
            }
            int i2 = i;
            TileItem tileItem3 = null;
            if (lIIIIIIIlIllIII(this.ba.W(), EnumC0003d.DEMI_BOSS_EXPLORE) && lIIIIIIIlIlIlIl(i2)) {
                Iterator it = list.iterator();
                do {
                    if (lIIIIIIIlIlIlIl(it.hasNext() ? 1 : 0)) {
                        TileItem tileItem4 = (TileItem) it.next();
                        if (lIIIIIIIlIlIlIl(this.ba.h(tileItem4.getId()) ? 1 : 0)) {
                            tileItem3 = tileItem4;
                            "".length();
                            if ("   ".length() <= 0) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else if (lIIIIIIIlIlIlIl(EnumC0008i.CRYSTAL_SHARD.aA().contains(Integer.valueOf(tileItem4.getId())) ? 1 : 0) && lIIIIIIIlIllIIl(tileItem4.distanceTo(local), llIlIIIIIlII[4])) {
                            tileItem3 = tileItem4;
                            "".length();
                            if (0 != 0) {
                                return ((53 ^ 60) ^ (60 ^ 124)) & (((147 ^ 137) ^ (197 ^ 150)) ^ (-" ".length()));
                            }
                        } else {
                            "".length();
                        }
                    }
                    "".length();
                    if (" ".length() < " ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } while ((-"  ".length()) < 0);
                return "   ".length() & ("   ".length() ^ (-" ".length()));
            }
            tileItem3 = (TileItem) list.stream().filter(tileItem5 -> {
                if (!lIIIIIIIlIllIII(this.ba.W(), EnumC0003d.DEMI_BOSS_EXPLORE) || lIIIIIIIlIllIIl(tileItem5.distanceTo(local.getWorldLocation()), llIlIIIIIlII[5])) {
                    ?? r0 = llIlIIIIIlII[2];
                    "".length();
                    return (((((58 + 51) - (-28)) + 28) ^ (((43 + 26) - 55) + 133)) & (((251 ^ 129) ^ (123 ^ 55)) ^ (-" ".length()))) != 0 ? ((5 ^ 101) ^ (80 ^ 19)) & (((180 ^ 171) ^ (162 ^ 158)) ^ (-" ".length())) : r0;
                }
                return llIlIIIIIlII[1];
            }).min(Comparator.comparingInt(tileItem6 -> {
                return tileItem6.distanceTo(local.getWorldLocation());
            })).orElse(null);
            if (lIIIIIIIlIllIlI(tileItem3)) {
                return llIlIIIIIlII[1];
            }
            if (lIIIIIIIlIlIlII(EnumC0008i.FISH.aA().contains(Integer.valueOf(tileItem3.getId())) ? 1 : 0) && lIIIIIIIlIlIlII(EnumC0008i.CRYSTAL_SHARD.aA().contains(Integer.valueOf(tileItem3.getId())) ? 1 : 0)) {
                if (lIIIIIIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                    Item first = Inventory.getFirst(EnumC0008i.FISH.aB());
                    if (lIIIIIIIlIllIlI(first)) {
                        return llIlIIIIIlII[1];
                    }
                    first.interact(llIlIIIIIIll[llIlIIIIIlII[1]]);
                    return llIlIIIIIlII[2];
                }
            } else if (lIIIIIIIlIlIlIl(Inventory.isFull() ? 1 : 0) && lIIIIIIIlIlIlII(EnumC0008i.CRYSTAL_SHARD.aA().contains(Integer.valueOf(tileItem3.getId())) ? 1 : 0)) {
                return llIlIIIIIlII[1];
            }
            C0011l d = this.ba.V().d(tileItem3.getWorldLocation());
            if (lIIIIIIIlIlIlII(d.e(local.getWorldLocation()) ? 1 : 0)) {
                return this.ba.a(d, local.getWorldLocation());
            }
            tileItem3.interact(llIlIIIIIIll[llIlIIIIIlII[2]]);
            return llIlIIIIIlII[2];
        }
        return llIlIIIIIlII[1];
    }

    private static String lIIIIIIIlIlIIII(String lllllllllllllllIlIIIlllIIlllIlIl, String lllllllllllllllIlIIIlllIIlllIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIIIIlII[3], lllllllllllllllIlIIIlllIIllllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIlllIIlllIllI) {
            lllllllllllllllIlIIIlllIIlllIllI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        this.bX.remove(itemDespawned.getItem());
        "".length();
    }

    private static boolean lIIIIIIIlIllIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIIIIIlIllIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIIIlIllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIIIIIIIlIlIIlI() {
        llIlIIIIIIll = new String[llIlIIIIIlII[3]];
        llIlIIIIIIll[llIlIIIIIlII[1]] = lIIIIIIIlIlIIII("tKtGtlW7iWo=", "blWKm");
        llIlIIIIIIll[llIlIIIIIlII[2]] = lIIIIIIIlIlIIIl("BSMyBg==", "QBYcm");
    }
}
