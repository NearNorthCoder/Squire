/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.client.config.ConfigManager
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  org.jetbrains.annotations.Nullable
 */
package gg.squire.vorkath.tasks;

import com.google.gson.Gson;
import gg.squire.client.util.Log;
import gg.squire.vorkath.tasks.VorkathManager;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigManager;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import org.jetbrains.annotations.Nullable;

@Singleton
public class VorkathManager {
    private static final  Gson S;
    private final  ConfigManager T;
    
    private  boolean U;

    private static boolean var3(Object object) {
        return object == null;
    }

    public Item a(Predicate<Item> predicate) {
        int[] nArray = new int[var1[1]];
        nArray[h.var1[2]] = var1[3];
        if (h.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[1]];
            nArray2[h.var1[2]] = var1[3];
            return Inventory.getFirst((int[])nArray2);
        }
        return Inventory.getAll().stream().filter(predicate).filter(Item::isTradable).min(Comparator.comparingInt(item -> item.getQuantity() * Prices.getItemPrice((int)item.getId()))).orElse(null);
    }

    @Nullable
    public static Item a(List<k> list) {
        Item item = null;
        int n2 = var1[0];
        Iterator var5 = Inventory.getAll().iterator();
        while (h.var4(var5.hasNext() ? 1 : 0)) {
            List<k> var6;
            Item var7 = (Item)var5.next();
            Iterator<k> var8 = var6.iterator();
            while (h.var4(var8.hasNext() ? 1 : 0)) {
                k var9 = var8.next();
                if (h.var4(var9.M().equals(var7.getName()) ? 1 : 0) && h.var4(var9.O() ? 1 : 0)) {
                    int var10;
                    int var11 = Prices.getItemPrice((int)var7.getId()) * var7.getQuantity();
                    if (!h.var12(var11, var10)) break;
                    Item var13 = var7;
                    var10 = var11;
                    0;
                    if (2 != 1) break;
                    return null;
                }
                0;
                if (3 > 0) continue;
                return null;
            }
            0;
            if (((0x1F ^ 0x23 ^ (0xA1 ^ 0xC0)) & (0x90 ^ 0xB0 ^ (0x61 ^ 0x1C) ^ -1)) <= (0x63 ^ 0x7F ^ (0x76 ^ 0x6E))) continue;
            return null;
        }
        return item;
    }

    private static void var14() {
        var2 = new String[var1[5]];
        h.var2[h.var1[2]] = "Trying to find a decent item to drop, but cannot";
        h.var2[h.var1[1]] = "Drop";
        h.var2[h.var1[4]] = "Eat";
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Inject
    public VorkathManager(ConfigManager configManager) {
        this.T = configManager;
    }

    public void K() {
        Item item2 = this.a(item -> {
            String[] stringArray = new String[var1[1]];
            stringArray[h.var1[2]] = var2[var1[4]];
            return item.hasAction(stringArray);
        });
        if (h.var3(item2) && h.var3(item2 = this.a(item -> var1[1]))) {
            Log.info((String)var2[var1[2]]);
            return;
        }
        item2.interact(var2[var1[1]]);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var27() {
        var1 = new int[7];
        h.var1[0] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        h.var1[1] = 1;
        h.var1[2] = (0xDE ^ 0xC5) & ~(0x72 ^ 0x69);
        h.var1[3] = -(0xFFFFFFF9 & 0x7927) & (0xFFFFFFFF & 0x7FF7);
        h.var1[4] = 2;
        h.var1[5] = 3;
        h.var1[6] = 0x70 ^ 0x7B ^ 3;
    }

    private static String var28(String var29, String var30) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var32 = var30.toCharArray();
        int var33 = var1[2];
        char[] var34 = var29.toCharArray();
        int var35 = var34.length;
        int var36 = var1[2];
        while (h.var12(var36, var35)) {
            char var37 = var34[var36];
            var31.append((char)(var37 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var36;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var31);
    }

    static {
        h.var27();
        h.var14();
        S = new Gson();
    }

    public void d(boolean bl) {
        this.U = bl;
    }

    public boolean L() {
        return this.U;
    }
}

