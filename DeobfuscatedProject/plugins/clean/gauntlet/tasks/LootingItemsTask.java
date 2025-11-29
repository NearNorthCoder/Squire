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
package gg.squire.gauntlet.tasks;

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
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GameEnum18;
import gg.squire.gauntlet.tasks.GameEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
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
public class LootingItemsTask
extends GauntletTaskBase {
    
    private final  b bY;
    private final  Set<TileItem> bX;

    public Set<TileItem> bD() {
        return this.bX;
    }

    @Inject
    public LootingItemsTask(c c2, b b2) {
        d[] dArray = new d[llIlIIIIIlII[0]];
        dArray[M.llIlIIIIIlII[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[M.llIlIIIIIlII[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[M.llIlIIIIIlII[3]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
        this.bX = new HashSet<TileItem>();
        this.bY = b2;
    }

    private static  int a(Player player, TileItem tileItem) {
        return tileItem.distanceTo(player.getWorldLocation());
    }

    private static boolean lIIIIIIIlIlIllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIIIIIlIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        M var1;
        void var2;
        if (M.lIIIIIIIlIlIlII(this.ba.A() ? 1 : 0)) {
            return;
        }
        TileItem var3 = var2.getItem();
        if (M.lIIIIIIIlIlIlIl(var1.ba.f(var3.getId()) ? 1 : 0)) {
            var1.bX.add(var3);

        }
    }

    private static boolean lIIIIIIIlIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private  boolean b(Player player, TileItem tileItem) {
        boolean bl;
        if (!M.lIIIIIIIlIllIII((Object)this.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) || M.lIIIIIIIlIllIIl(tileItem.distanceTo(player.getWorldLocation()), llIlIIIIIlII[5])) {
            bl = llIlIIIIIlII[2];

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

        return String.valueOf(var4);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var5_5;
        Object var5;
        int n2;
        void var6;
        M var7;
        Player player = Players.getLocal();
        if (M.lIIIIIIIlIlIlIl(this.ba.V().av().e(player.getWorldLocation()) ? 1 : 0) && M.lIIIIIIIlIlIllI((Object)d.EXTRA_FOOD_EXPLORE, (Object)this.ba.W())) {
            return llIlIIIIIlII[1];
        }
        var7.bX.removeIf(arg_0 -> var7.c((Player)var6, arg_0));

        if (M.lIIIIIIIlIlIlIl(var7.bX.isEmpty() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        List var8 = var7.bX.stream().filter(tileItem -> {
            boolean bl;
            if (M.lIIIIIIIlIlIlII(this.ba.V().av().e(tileItem.getWorldLocation()) ? 1 : 0)) {
                bl = llIlIIIIIlII[2];

                if (3 != 3) {
                    return false;
                }
            } else {
                bl = llIlIIIIIlII[1];
            }
            return bl;
        }).collect(Collectors.toList());
        if (M.lIIIIIIIlIlIlIl(var8.isEmpty() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        if (M.lIIIIIIIlIlIlIl(var7.bY.p() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        g var9 = var7.ba.J();
        if (M.lIIIIIIIlIlIlll((Object)var9) && M.lIIIIIIIlIlIlII(var9.an().aC())) {
            n2 = llIlIIIIIlII[2];

            if (((0x34 ^ 6 ^ (0xA5 ^ 0xC6)) & (0x5A ^ 0x55 ^ (0x65 ^ 0x3B) ^ -1)) != 0) {
                return ((0x8B ^ 0x9F ^ (0x48 ^ 0x64)) & (0x4E ^ 0x11 ^ (0x23 ^ 0x44) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIIIIIlII[1];
        }
        int var10 = n2;
        TileItem var11 = null;
        if (M.lIIIIIIIlIllIII((Object)var7.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) && M.lIIIIIIIlIlIlIl(var10)) {
            var5 = var8.iterator();
            while (M.lIIIIIIIlIlIlIl(var5.hasNext() ? 1 : 0)) {
                TileItem var12 = (TileItem)var5.next();
                if (M.lIIIIIIIlIlIlIl(var7.ba.h(var12.getId()) ? 1 : 0)) {
                    var11 = var12;

                    if (3 > 0) break;
                    return false;
                }
                if (M.lIIIIIIIlIlIlIl(i.CRYSTAL_SHARD.aA().contains(var12.getId()) ? 1 : 0) && M.lIIIIIIIlIllIIl(var12.distanceTo((Locatable)var6), llIlIIIIIlII[4])) {
                    var11 = var12;

                    if (null == null) break;
                    return ((0x35 ^ 0x3C ^ (0x3C ^ 0x7C)) & (0x93 ^ 0x89 ^ (0xC5 ^ 0x96) ^ -1)) != 0;
                }

                if (-2 < 0) continue;
                return (3 & (3 ^ -1)) != 0;
            }

            if (1 < 1) {
                return false;
            }
        } else {
            var11 = var8.stream().filter(arg_0 -> var7.b((Player)var6, arg_0)).min(Comparator.comparingInt(arg_0 -> M.a((Player)var6, arg_0))).orElse(null);
        }
        if (M.lIIIIIIIlIllIlI(var11)) {
            return llIlIIIIIlII[1];
        }
        if (M.lIIIIIIIlIlIlII(i.FISH.aA().contains(var11.getId()) ? 1 : 0) && M.lIIIIIIIlIlIlII(i.CRYSTAL_SHARD.aA().contains(var11.getId()) ? 1 : 0)) {
            if (M.lIIIIIIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                var5 = Inventory.getFirst((int[])i.FISH.aB());
                if (M.lIIIIIIIlIllIlI(var5)) {
                    return llIlIIIIIlII[1];
                }
                var5.interact(llIlIIIIIIll[llIlIIIIIlII[1]]);
                return llIlIIIIIlII[2];
            }
        } else if (M.lIIIIIIIlIlIlIl(Inventory.isFull() ? 1 : 0) && M.lIIIIIIIlIlIlII(i.CRYSTAL_SHARD.aA().contains(var11.getId()) ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        if (M.lIIIIIIIlIlIlII(((l)(var5 = var7.ba.V().d(var11.getWorldLocation()))).e(var6.getWorldLocation()) ? 1 : 0)) {
            return var7.ba.a((l)var5, var6.getWorldLocation());
        }
        var5_5.interact(llIlIIIIIIll[llIlIIIIIlII[2]]);
        return llIlIIIIIlII[2];
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        this.bX.remove(itemDespawned.getItem());

    }

    private static boolean lIIIIIIIlIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIIIIlIllIlI(Object object) {
        return object == null;
    }

    private  boolean c(Player player, TileItem tileItem) {
        int n2;
        if (!M.lIIIIIIIlIlIlIl(this.ba.f(tileItem.getId()) ? 1 : 0) || !M.lIIIIIIIlIlIlll(tileItem.getTile()) || M.lIIIIIIIlIllIll(tileItem.getWorldLocation().distanceTo(player.getWorldLocation()), llIlIIIIIlII[6])) {
            n2 = llIlIIIIIlII[2];

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
        M.llIlIIIIIIll[M.llIlIIIIIlII[1]] = "Drop";
        M.llIlIIIIIIll[M.llIlIIIIIlII[2]] = "Take";
    }
}

