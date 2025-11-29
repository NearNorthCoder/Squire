/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting items", priority=6, register=true, blocking=true)
@Singleton
public class M
extends n {
    private static /* synthetic */ int[] llIlIIIIIlII;
    private final /* synthetic */ b bY;
    private final /* synthetic */ Set<TileItem> bX;
    private static /* synthetic */ String[] llIlIIIIIIll;

    public Set<TileItem> bD() {
        return this.bX;
    }

    @Inject
    public M(c c2, b b2) {
        d[] dArray = new d[llIlIIIIIlII[0]];
        dArray[M.llIlIIIIIlII[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[M.llIlIIIIIlII[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[M.llIlIIIIIlII[3]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
        this.bX = new HashSet<TileItem>();
        this.bY = b2;
    }

    private static /* synthetic */ int a(Player player, TileItem tileItem) {
        return tileItem.distanceTo(player.getWorldLocation());
    }

    private static boolean lIIIIIIIlIlIllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIIIIIlIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIIIIlIlIIll() {
        llIlIIIIIlII = new int[7];
        M.llIlIIIIIlII[0] = "   ".length();
        M.llIlIIIIIlII[1] = (0x8E ^ 0xA8) & ~(0x8E ^ 0xA8);
        M.llIlIIIIIlII[2] = " ".length();
        M.llIlIIIIIlII[3] = "  ".length();
        M.llIlIIIIIlII[4] = 123 + 156 - 186 + 71 ^ 165 + 64 - 135 + 78;
        M.llIlIIIIIlII[5] = 0x6C ^ 0x6A ^ " ".length();
        M.llIlIIIIIlII[6] = 0x59 ^ 0x49;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        M lllllllllllllllIlIIIlllIlIIIllll;
        void lllllllllllllllIlIIIlllIlIIIlllI;
        if (M.lIIIIIIIlIlIlII(this.ba.A() ? 1 : 0)) {
            return;
        }
        TileItem lllllllllllllllIlIIIlllIlIIIllIl = lllllllllllllllIlIIIlllIlIIIlllI.getItem();
        if (M.lIIIIIIIlIlIlIl(lllllllllllllllIlIIIlllIlIIIllll.ba.f(lllllllllllllllIlIIIlllIlIIIllIl.getId()) ? 1 : 0)) {
            lllllllllllllllIlIIIlllIlIIIllll.bX.add(lllllllllllllllIlIIIlllIlIIIllIl);
            "".length();
        }
    }

    private static boolean lIIIIIIIlIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private /* synthetic */ boolean b(Player player, TileItem tileItem) {
        boolean bl;
        if (!M.lIIIIIIIlIllIII((Object)this.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) || M.lIIIIIIIlIllIIl(tileItem.distanceTo(player.getWorldLocation()), llIlIIIIIlII[5])) {
            bl = llIlIIIIIlII[2];
            "".length();
            if (((58 + 51 - -28 + 28 ^ 43 + 26 - 55 + 133) & (0xFB ^ 0x81 ^ (0x7B ^ 0x37) ^ -" ".length())) != 0) {
                return ((5 ^ 0x65 ^ (0x50 ^ 0x13)) & (0xB4 ^ 0xAB ^ (0xA2 ^ 0x9E) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIIIIIlII[1];
        }
        return bl;
    }

    static {
        M.lIIIIIIIlIlIIll();
        M.lIIIIIIIlIlIIlI();
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (M.lIIIIIIIlIlIlII(this.ba.A() ? 1 : 0)) {
            this.bX.clear();
        }
    }

    private static boolean lIIIIIIIlIlIlII(int n2) {
        return n2 == 0;
    }

    private static String lIIIIIIIlIlIIIl(String lllllllllllllllIlIIIlllIIllIIlIl, String lllllllllllllllIlIIIlllIIlIlllll) {
        lllllllllllllllIlIIIlllIIllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIlllIIllIIIll = new StringBuilder();
        char[] lllllllllllllllIlIIIlllIIllIIIlI = lllllllllllllllIlIIIlllIIlIlllll.toCharArray();
        int lllllllllllllllIlIIIlllIIllIIIIl = llIlIIIIIlII[1];
        char[] lllllllllllllllIlIIIlllIIlIllIll = lllllllllllllllIlIIIlllIIllIIlIl.toCharArray();
        int lllllllllllllllIlIIIlllIIlIllIlI = lllllllllllllllIlIIIlllIIlIllIll.length;
        int lllllllllllllllIlIIIlllIIlIllIIl = llIlIIIIIlII[1];
        while (M.lIIIIIIIlIllIIl(lllllllllllllllIlIIIlllIIlIllIIl, lllllllllllllllIlIIIlllIIlIllIlI)) {
            char lllllllllllllllIlIIIlllIIllIIllI = lllllllllllllllIlIIIlllIIlIllIll[lllllllllllllllIlIIIlllIIlIllIIl];
            lllllllllllllllIlIIIlllIIllIIIll.append((char)(lllllllllllllllIlIIIlllIIllIIllI ^ lllllllllllllllIlIIIlllIIllIIIlI[lllllllllllllllIlIIIlllIIllIIIIl % lllllllllllllllIlIIIlllIIllIIIlI.length]));
            "".length();
            ++lllllllllllllllIlIIIlllIIllIIIIl;
            ++lllllllllllllllIlIIIlllIIlIllIIl;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIlllIIllIIIll);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var5_5;
        Object lllllllllllllllIlIIIlllIlIIlIlII;
        int n2;
        void lllllllllllllllIlIIIlllIlIIllIIl;
        M lllllllllllllllIlIIIlllIlIIllIlI;
        Player player = Players.getLocal();
        if (M.lIIIIIIIlIlIlIl(this.ba.V().av().e(player.getWorldLocation()) ? 1 : 0) && M.lIIIIIIIlIlIllI((Object)d.EXTRA_FOOD_EXPLORE, (Object)this.ba.W())) {
            return llIlIIIIIlII[1];
        }
        lllllllllllllllIlIIIlllIlIIllIlI.bX.removeIf(arg_0 -> lllllllllllllllIlIIIlllIlIIllIlI.c((Player)lllllllllllllllIlIIIlllIlIIllIIl, arg_0));
        "".length();
        if (M.lIIIIIIIlIlIlIl(lllllllllllllllIlIIIlllIlIIllIlI.bX.isEmpty() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        List lllllllllllllllIlIIIlllIlIIllIII = lllllllllllllllIlIIIlllIlIIllIlI.bX.stream().filter(tileItem -> {
            boolean bl;
            if (M.lIIIIIIIlIlIlII(this.ba.V().av().e(tileItem.getWorldLocation()) ? 1 : 0)) {
                bl = llIlIIIIIlII[2];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return ((49 + 61 - 93 + 139 ^ 28 + 49 - -48 + 9) & (0x5D ^ 0x45 ^ "  ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = llIlIIIIIlII[1];
            }
            return bl;
        }).collect(Collectors.toList());
        if (M.lIIIIIIIlIlIlIl(lllllllllllllllIlIIIlllIlIIllIII.isEmpty() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        if (M.lIIIIIIIlIlIlIl(lllllllllllllllIlIIIlllIlIIllIlI.bY.p() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        g lllllllllllllllIlIIIlllIlIIlIlll = lllllllllllllllIlIIIlllIlIIllIlI.ba.J();
        if (M.lIIIIIIIlIlIlll((Object)lllllllllllllllIlIIIlllIlIIlIlll) && M.lIIIIIIIlIlIlII(lllllllllllllllIlIIIlllIlIIlIlll.an().aC())) {
            n2 = llIlIIIIIlII[2];
            "".length();
            if (((0x34 ^ 6 ^ (0xA5 ^ 0xC6)) & (0x5A ^ 0x55 ^ (0x65 ^ 0x3B) ^ -" ".length())) != 0) {
                return ((0x8B ^ 0x9F ^ (0x48 ^ 0x64)) & (0x4E ^ 0x11 ^ (0x23 ^ 0x44) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIlIIIIIlII[1];
        }
        int lllllllllllllllIlIIIlllIlIIlIllI = n2;
        TileItem lllllllllllllllIlIIIlllIlIIlIlIl = null;
        if (M.lIIIIIIIlIllIII((Object)lllllllllllllllIlIIIlllIlIIllIlI.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) && M.lIIIIIIIlIlIlIl(lllllllllllllllIlIIIlllIlIIlIllI)) {
            lllllllllllllllIlIIIlllIlIIlIlII = lllllllllllllllIlIIIlllIlIIllIII.iterator();
            while (M.lIIIIIIIlIlIlIl(lllllllllllllllIlIIIlllIlIIlIlII.hasNext() ? 1 : 0)) {
                TileItem lllllllllllllllIlIIIlllIlIIlIIll = (TileItem)lllllllllllllllIlIIIlllIlIIlIlII.next();
                if (M.lIIIIIIIlIlIlIl(lllllllllllllllIlIIIlllIlIIllIlI.ba.h(lllllllllllllllIlIIIlllIlIIlIIll.getId()) ? 1 : 0)) {
                    lllllllllllllllIlIIIlllIlIIlIlIl = lllllllllllllllIlIIIlllIlIIlIIll;
                    "".length();
                    if ("   ".length() > 0) break;
                    return ((0x59 ^ 0x3A) & ~(0x15 ^ 0x76)) != 0;
                }
                if (M.lIIIIIIIlIlIlIl(i.CRYSTAL_SHARD.aA().contains(lllllllllllllllIlIIIlllIlIIlIIll.getId()) ? 1 : 0) && M.lIIIIIIIlIllIIl(lllllllllllllllIlIIIlllIlIIlIIll.distanceTo((Locatable)lllllllllllllllIlIIIlllIlIIllIIl), llIlIIIIIlII[4])) {
                    lllllllllllllllIlIIIlllIlIIlIlIl = lllllllllllllllIlIIIlllIlIIlIIll;
                    "".length();
                    if (null == null) break;
                    return ((0x35 ^ 0x3C ^ (0x3C ^ 0x7C)) & (0x93 ^ 0x89 ^ (0xC5 ^ 0x96) ^ -" ".length())) != 0;
                }
                "".length();
                if (-"  ".length() < 0) continue;
                return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
            }
            "".length();
            if (" ".length() < " ".length()) {
                return ((0x16 ^ 0x3C) & ~(0x67 ^ 0x4D)) != 0;
            }
        } else {
            lllllllllllllllIlIIIlllIlIIlIlIl = lllllllllllllllIlIIIlllIlIIllIII.stream().filter(arg_0 -> lllllllllllllllIlIIIlllIlIIllIlI.b((Player)lllllllllllllllIlIIIlllIlIIllIIl, arg_0)).min(Comparator.comparingInt(arg_0 -> M.a((Player)lllllllllllllllIlIIIlllIlIIllIIl, arg_0))).orElse(null);
        }
        if (M.lIIIIIIIlIllIlI(lllllllllllllllIlIIIlllIlIIlIlIl)) {
            return llIlIIIIIlII[1];
        }
        if (M.lIIIIIIIlIlIlII(i.FISH.aA().contains(lllllllllllllllIlIIIlllIlIIlIlIl.getId()) ? 1 : 0) && M.lIIIIIIIlIlIlII(i.CRYSTAL_SHARD.aA().contains(lllllllllllllllIlIIIlllIlIIlIlIl.getId()) ? 1 : 0)) {
            if (M.lIIIIIIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                lllllllllllllllIlIIIlllIlIIlIlII = Inventory.getFirst((int[])i.FISH.aB());
                if (M.lIIIIIIIlIllIlI(lllllllllllllllIlIIIlllIlIIlIlII)) {
                    return llIlIIIIIlII[1];
                }
                lllllllllllllllIlIIIlllIlIIlIlII.interact(llIlIIIIIIll[llIlIIIIIlII[1]]);
                return llIlIIIIIlII[2];
            }
        } else if (M.lIIIIIIIlIlIlIl(Inventory.isFull() ? 1 : 0) && M.lIIIIIIIlIlIlII(i.CRYSTAL_SHARD.aA().contains(lllllllllllllllIlIIIlllIlIIlIlIl.getId()) ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        if (M.lIIIIIIIlIlIlII(((l)(lllllllllllllllIlIIIlllIlIIlIlII = lllllllllllllllIlIIIlllIlIIllIlI.ba.V().d(lllllllllllllllIlIIIlllIlIIlIlIl.getWorldLocation()))).e(lllllllllllllllIlIIIlllIlIIllIIl.getWorldLocation()) ? 1 : 0)) {
            return lllllllllllllllIlIIIlllIlIIllIlI.ba.a((l)lllllllllllllllIlIIIlllIlIIlIlII, lllllllllllllllIlIIIlllIlIIllIIl.getWorldLocation());
        }
        var5_5.interact(llIlIIIIIIll[llIlIIIIIlII[2]]);
        return llIlIIIIIlII[2];
    }

    private static String lIIIIIIIlIlIIII(String lllllllllllllllIlIIIlllIIlllIIll, String lllllllllllllllIlIIIlllIIlllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIlllIIlllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIlllIIlllIlll.init(llIlIIIIIlII[3], lllllllllllllllIlIIIlllIIllllIII);
            return new String(lllllllllllllllIlIIIlllIIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIlllIIlllIllI) {
            lllllllllllllllIlIIIlllIIlllIllI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        this.bX.remove(itemDespawned.getItem());
        "".length();
    }

    private static boolean lIIIIIIIlIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIIIIlIllIlI(Object object) {
        return object == null;
    }

    private /* synthetic */ boolean c(Player player, TileItem tileItem) {
        int n2;
        if (!M.lIIIIIIIlIlIlIl(this.ba.f(tileItem.getId()) ? 1 : 0) || !M.lIIIIIIIlIlIlll(tileItem.getTile()) || M.lIIIIIIIlIllIll(tileItem.getWorldLocation().distanceTo(player.getWorldLocation()), llIlIIIIIlII[6])) {
            n2 = llIlIIIIIlII[2];
            "".length();
            if ("  ".length() < 0) {
                return ((0x1D ^ 0x16) & ~(0x3B ^ 0x30)) != 0;
            }
        } else {
            n2 = llIlIIIIIlII[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIIIIIlIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIIIIIIlIlIIlI() {
        llIlIIIIIIll = new String[llIlIIIIIlII[3]];
        M.llIlIIIIIIll[M.llIlIIIIIlII[1]] = M.lIIIIIIIlIlIIII("tKtGtlW7iWo=", "blWKm");
        M.llIlIIIIIIll[M.llIlIIIIIlII[2]] = M.lIIIIIIIlIlIIIl("BSMyBg==", "QBYcm");
    }
}

