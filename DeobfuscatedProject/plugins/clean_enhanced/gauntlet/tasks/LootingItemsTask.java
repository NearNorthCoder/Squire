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
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GameEnum3;
import gg.squire.gauntlet.tasks.GameEnum;
import gg.squire.gauntlet.tasks.LHelper;
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
        d[] dArray = new d[var1[0]];
        dArray[M.var1[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[M.var1[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[M.var1[3]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
        this.bX = new HashSet<TileItem>();
        this.bY = b2;
    }

    private static  int a(Player player, TileItem tileItem) {
        return tileItem.distanceTo(player.getWorldLocation());
    }

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static void var5() {
        var1 = new int[7];
        M.var1[0] = 3;
        M.var1[1] = (0x8E ^ 0xA8) & ~(0x8E ^ 0xA8);
        M.var1[2] = 1;
        M.var1[3] = 2;
        M.var1[4] = 123 + 156 - 186 + 71 ^ 165 + 64 - 135 + 78;
        M.var1[5] = 0x6C ^ 0x6A ^ 1;
        M.var1[6] = 0x59 ^ 0x49;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        M var6;
        void var7;
        if (M.var8(this.ba.A() ? 1 : 0)) {
            return;
        }
        TileItem var9 = var7.getItem();
        if (M.var10(var6.ba.f(var9.getId()) ? 1 : 0)) {
            var6.bX.add(var9);
            0;
        }
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private  boolean b(Player player, TileItem tileItem) {
        boolean bl;
        if (!M.var12((Object)this.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) || M.var4(tileItem.distanceTo(player.getWorldLocation()), var1[5])) {
            bl = var1[2];
            0;
            if (((58 + 51 - -28 + 28 ^ 43 + 26 - 55 + 133) & (0xFB ^ 0x81 ^ (0x7B ^ 0x37) ^ -1)) != 0) {
                return ((5 ^ 0x65 ^ (0x50 ^ 0x13)) & (0xB4 ^ 0xAB ^ (0xA2 ^ 0x9E) ^ -1)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    static {
        M.var5();
        M.var13();
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (M.var8(this.ba.A() ? 1 : 0)) {
            this.bX.clear();
        }
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var1[1];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var1[1];
        while (M.var4(var22, var21)) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var5_5;
        Object var24;
        int n2;
        void var25;
        M var26;
        Player player = Players.getLocal();
        if (M.var10(this.ba.V().av().e(player.getWorldLocation()) ? 1 : 0) && M.var3((Object)d.EXTRA_FOOD_EXPLORE, (Object)this.ba.W())) {
            return var1[1];
        }
        var26.bX.removeIf(arg_0 -> var26.c((Player)var25, arg_0));
        0;
        if (M.var10(var26.bX.isEmpty() ? 1 : 0)) {
            return var1[1];
        }
        List var27 = var26.bX.stream().filter(tileItem -> {
            boolean bl;
            if (M.var8(this.ba.V().av().e(tileItem.getWorldLocation()) ? 1 : 0)) {
                bl = var1[2];
                0;
                if (3 != 3) {
                    return ((49 + 61 - 93 + 139 ^ 28 + 49 - -48 + 9) & (0x5D ^ 0x45 ^ 2 ^ -1)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        }).collect(Collectors.toList());
        if (M.var10(var27.isEmpty() ? 1 : 0)) {
            return var1[1];
        }
        if (M.var10(var26.bY.p() ? 1 : 0)) {
            return var1[1];
        }
        g var28 = var26.ba.J();
        if (M.var11((Object)var28) && M.var8(var28.an().aC())) {
            n2 = var1[2];
            0;
            if (((0x34 ^ 6 ^ (0xA5 ^ 0xC6)) & (0x5A ^ 0x55 ^ (0x65 ^ 0x3B) ^ -1)) != 0) {
                return ((0x8B ^ 0x9F ^ (0x48 ^ 0x64)) & (0x4E ^ 0x11 ^ (0x23 ^ 0x44) ^ -1)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        int var29 = n2;
        TileItem var30 = null;
        if (M.var12((Object)var26.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) && M.var10(var29)) {
            var24 = var27.iterator();
            while (M.var10(var24.hasNext() ? 1 : 0)) {
                TileItem var31 = (TileItem)var24.next();
                if (M.var10(var26.ba.h(var31.getId()) ? 1 : 0)) {
                    var30 = var31;
                    0;
                    if (3 > 0) break;
                    return ((0x59 ^ 0x3A) & ~(0x15 ^ 0x76)) != 0;
                }
                if (M.var10(i.CRYSTAL_SHARD.aA().contains(var31.getId()) ? 1 : 0) && M.var4(var31.distanceTo((Locatable)var25), var1[4])) {
                    var30 = var31;
                    0;
                    if null == null break;
                    return ((0x35 ^ 0x3C ^ (0x3C ^ 0x7C)) & (0x93 ^ 0x89 ^ (0xC5 ^ 0x96) ^ -1)) != 0;
                }
                0;
                if (-2 < 0) continue;
                return (3 & (3 ^ -1)) != 0;
            }
            0;
            if (1 < 1) {
                return ((0x16 ^ 0x3C) & ~(0x67 ^ 0x4D)) != 0;
            }
        } else {
            var30 = var27.stream().filter(arg_0 -> var26.b((Player)var25, arg_0)).min(Comparator.comparingInt(arg_0 -> M.a((Player)var25, arg_0))).orElse(null);
        }
        if (M.var32(var30)) {
            return var1[1];
        }
        if (M.var8(i.FISH.aA().contains(var30.getId()) ? 1 : 0) && M.var8(i.CRYSTAL_SHARD.aA().contains(var30.getId()) ? 1 : 0)) {
            if (M.var10(Inventory.isFull() ? 1 : 0)) {
                var24 = Inventory.getFirst((int[])i.FISH.aB());
                if (M.var32(var24)) {
                    return var1[1];
                }
                var24.interact(var2[var1[1]]);
                return var1[2];
            }
        } else if (M.var10(Inventory.isFull() ? 1 : 0) && M.var8(i.CRYSTAL_SHARD.aA().contains(var30.getId()) ? 1 : 0)) {
            return var1[1];
        }
        if (M.var8(((l)(var24 = var26.ba.V().d(var30.getWorldLocation()))).e(var25.getWorldLocation()) ? 1 : 0)) {
            return var26.ba.a((var24, var25.getWorldLocation());
        }
        var5_5.interact(var2[var1[2]]);
        return var1[2];
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        this.bX.remove(itemDespawned.getItem());
        0;
    }

    private static boolean var39(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var32(Object object) {
        return object == null;
    }

    private  boolean c(Player player, TileItem tileItem) {
        int n2;
        if (!M.var10(this.ba.f(tileItem.getId()) ? 1 : 0) || !M.var11(tileItem.getTile()) || M.var39(tileItem.getWorldLocation().distanceTo(player.getWorldLocation()), var1[6])) {
            n2 = var1[2];
            0;
            if (2 < 0) {
                return ((0x1D ^ 0x16) & ~(0x3B ^ 0x30)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        return n2 != 0;
    }

    private static boolean var12(Object object, Object object2) {
        return object == object2;
    }

    private static void var13() {
        var2 = new String[var1[3]];
        M.var2[M.var1[1]] = "Drop";
        M.var2[M.var1[2]] = "Take";
    }
}

