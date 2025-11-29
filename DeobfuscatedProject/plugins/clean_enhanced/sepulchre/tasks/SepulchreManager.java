/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 */
package gg.squire.sepulchre.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.sepulchre.tasks.JHelper;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;

@Singleton
public class SepulchreManager {
    private  HashMap<TileObject, J> R;
    private final  SquireSepulchreConfig P;
    private final  SquireSepulchre Q;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=-2.1474836E9f)
    public void a(GameTick gameTick) {
        void var4;
        List list = TileObjects.getAll(tileObject -> {
            int n2;
            if (!d.var3(tileObject.getName().toLowerCase().contains(var2[var1[0]]) ? 1 : 0) || d.var5(tileObject.getName().toLowerCase().contains(var2[var1[1]]) ? 1 : 0)) {
                n2 = var1[1];
                0;
                
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        int n2 = var1[0];
        Iterator var6 = list.iterator();
        while (d.var5(var6.hasNext() ? 1 : 0)) {
            J var7;
            d var8;
            TileObject var9 = (TileObject)var6.next();
            if (d.var10(var9)) {
                0;
                if ((2 ^ 6) >= 0) continue;
                return;
            }
            if (d.var3(var8.R.containsKey(var9) ? 1 : 0)) {
                var7 = new JHelper(var9);
                var7.aE();
                ++var4;
                var8.R.put(var9, var7);
                0;
            }
            var7 = var8.R.get(var9);
            var7.aE();
            0;
            if (3 != (0x21 ^ 0x61 ^ (0x5B ^ 0x1F))) continue;
            return;
        }
        if (d.var5((int)var4)) {
            System.out.println("Added " + (int)var4 + " obstacles to the map");
        }
    }

    public void q() {
        this.R.clear();
    }

    private static void var11() {
        var2 = new String[var1[2]];
        d.var2[d.var1[0]] = "wizard statue";
        d.var2[d.var1[1]] = "knight statue";
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (d.var12(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            // empty if block
        }
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    static {
        d.var14();
        d.var11();
    }

    public J b(TileObject tileObject) {
        if (d.var5(this.R.containsKey(tileObject) ? 1 : 0)) {
            return this.R.get(tileObject);
        }
        return null;
    }

    private static boolean var12(Object object, Object object2) {
        return object == object2;
    }

    public void r() {
        this.R.clear();
    }

    private static void var14() {
        var1 = new int[3];
        d.var1[0] = (111 + 133 - 172 + 77 ^ 68 + 21 - 32 + 113) & (19 + 73 - -40 + 14 ^ 40 + 35 - 42 + 140 ^ -1);
        d.var1[1] = 1;
        d.var1[2] = 2;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var1[0];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var1[0];
        while (d.var13(var23, var22)) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var18);
    }

    @Inject
    SepulchreManager(SquireSepulchreConfig squireSepulchreConfig, SquireSepulchre squireSepulchre) {
        this.R = new HashMap();
        this.Q = squireSepulchre;
        this.P = squireSepulchreConfig;
    }
}

