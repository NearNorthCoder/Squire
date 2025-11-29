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

/* TASK: Looting items -> LootingTask */
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
        M.llIlIIIIIlII[0] = 3;
        M.llIlIIIIIlII[1] = (0x8E ^ 0xA8) & ~(0x8E ^ 0xA8);
        M.llIlIIIIIlII[2] = 1;
        M.llIlIIIIIlII[3] = 2;
        M.llIlIIIIIlII[4] = 123 + 156 - 186 + 71 ^ 165 + 64 - 135 + 78;
        M.llIlIIIIIlII[5] = 0x6C ^ 0x6A ^ 1;
        M.llIlIIIIIlII[6] = 0x59 ^ 0x49;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        M var13;
        void var7;
        if (M.lIIIIIIIlIlIlII(this.ba.A() ? 1 : 0)) {
            return;
        }
        TileItem var11 = var7.getItem();
        if (M.lIIIIIIIlIlIlIl(var13.ba.f(var11.getId()) ? 1 : 0)) {
            var13.bX.add(var11);
            0;
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
            0;
            if (((58 + 51 - -28 + 28 ^ 43 + 26 - 55 + 133) & (0xFB ^ 0x81 ^ (0x7B ^ 0x37) ^ -1)) != 0) {
                return ((5 ^ 0x65 ^ (0x50 ^ 0x13)) & (0xB4 ^ 0xAB ^ (0xA2 ^ 0x9E) ^ -1)) != 0;
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

    private static String lIIIIIIIlIlIIIl(String var21, String var24) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var4 = var24.toCharArray();
        int var20 = llIlIIIIIlII[1];
        char[] var6 = var21.toCharArray();
        int var14 = var6.length;
        int var10 = llIlIIIIIlII[1];
        while (M.lIIIIIIIlIllIIl(var10, var14)) {
            char var18 = var6[var10];
            var2.append((char)(var18 ^ var4[var20 % var4.length]));
            0;
            ++var20;
            ++var10;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var5_5;
        Object var12;
        int n2;
        void var16;
        M var17;
        Player player = Players.getLocal();
        if (M.lIIIIIIIlIlIlIl(this.ba.V().av().e(player.getWorldLocation()) ? 1 : 0) && M.lIIIIIIIlIlIllI((Object)d.EXTRA_FOOD_EXPLORE, (Object)this.ba.W())) {
            return llIlIIIIIlII[1];
        }
        var17.bX.removeIf(arg_0 -> var17.c((Player)var16, arg_0));
        0;
        if (M.lIIIIIIIlIlIlIl(var17.bX.isEmpty() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        List var19 = var17.bX.stream().filter(tileItem -> {
            boolean bl;
            if (M.lIIIIIIIlIlIlII(this.ba.V().av().e(tileItem.getWorldLocation()) ? 1 : 0)) {
                bl = llIlIIIIIlII[2];
                0;
                if (3 != 3) {
                    return false;
                }
            } else {
                bl = llIlIIIIIlII[1];
            }
            return bl;
        }).collect(Collectors.toList());
        if (M.lIIIIIIIlIlIlIl(var19.isEmpty() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        if (M.lIIIIIIIlIlIlIl(var17.bY.p() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        g var9 = var17.ba.J();
        if (M.lIIIIIIIlIlIlll((Object)var9) && M.lIIIIIIIlIlIlII(var9.an().aC())) {
            n2 = llIlIIIIIlII[2];
            0;
            if (((0x34 ^ 6 ^ (0xA5 ^ 0xC6)) & (0x5A ^ 0x55 ^ (0x65 ^ 0x3B) ^ -1)) != 0) {
                return ((0x8B ^ 0x9F ^ (0x48 ^ 0x64)) & (0x4E ^ 0x11 ^ (0x23 ^ 0x44) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIIIIIlII[1];
        }
        int var22 = n2;
        TileItem var8 = null;
        if (M.lIIIIIIIlIllIII((Object)var17.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) && M.lIIIIIIIlIlIlIl(var22)) {
            var12 = var19.iterator();
            while (M.lIIIIIIIlIlIlIl(var12.hasNext() ? 1 : 0)) {
                TileItem var25 = (TileItem)var12.next();
                if (M.lIIIIIIIlIlIlIl(var17.ba.h(var25.getId()) ? 1 : 0)) {
                    var8 = var25;
                    0;
                    if (3 > 0) break;
                    return false;
                }
                if (M.lIIIIIIIlIlIlIl(i.CRYSTAL_SHARD.aA().contains(var25.getId()) ? 1 : 0) && M.lIIIIIIIlIllIIl(var25.distanceTo((Locatable)var16), llIlIIIIIlII[4])) {
                    var8 = var25;
                    0;
                    if (null == null) break;
                    return ((0x35 ^ 0x3C ^ (0x3C ^ 0x7C)) & (0x93 ^ 0x89 ^ (0xC5 ^ 0x96) ^ -1)) != 0;
                }
                0;
                if (-2 < 0) continue;
                return (3 & (3 ^ -1)) != 0;
            }
            0;
            if (1 < 1) {
                return false;
            }
        } else {
            var8 = var19.stream().filter(arg_0 -> var17.b((Player)var16, arg_0)).min(Comparator.comparingInt(arg_0 -> M.a((Player)var16, arg_0))).orElse(null);
        }
        if (M.lIIIIIIIlIllIlI(var8)) {
            return llIlIIIIIlII[1];
        }
        if (M.lIIIIIIIlIlIlII(i.FISH.aA().contains(var8.getId()) ? 1 : 0) && M.lIIIIIIIlIlIlII(i.CRYSTAL_SHARD.aA().contains(var8.getId()) ? 1 : 0)) {
            if (M.lIIIIIIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                var12 = Inventory.getFirst((int[])i.FISH.aB());
                if (M.lIIIIIIIlIllIlI(var12)) {
                    return llIlIIIIIlII[1];
                }
                var12.interact(llIlIIIIIIll[llIlIIIIIlII[1]]);
                return llIlIIIIIlII[2];
            }
        } else if (M.lIIIIIIIlIlIlIl(Inventory.isFull() ? 1 : 0) && M.lIIIIIIIlIlIlII(i.CRYSTAL_SHARD.aA().contains(var8.getId()) ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        if (M.lIIIIIIIlIlIlII(((l)(var12 = var17.ba.V().d(var8.getWorldLocation()))).e(var16.getWorldLocation()) ? 1 : 0)) {
            return var17.ba.a((l)var12, var16.getWorldLocation());
        }
        var5_5.interact(llIlIIIIIIll[llIlIIIIIlII[2]]);
        return llIlIIIIIlII[2];
    }

    private static String lIIIIIIIlIlIIII(String var3, String var23) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llIlIIIIIlII[3], var15);
            return new String(var1.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        this.bX.remove(itemDespawned.getItem());
        0;
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
            0;
            if (2 < 0) {
                return false;
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
        M.llIlIIIIIIll[M.llIlIIIIIlII[1]] = M."Drop";
        M.llIlIIIIIIll[M.llIlIIIIIlII[2]] = M."Take";
    }
}

