/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 */
package gg.squire.aerialfisher.tasks;

import com.google.inject.Singleton;
import java.util.List;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.InventoryChanged;

@Singleton
public class AerialfisherManager {
    
    private  int e;
    private  int f;
    private  int g;

    private static boolean var2(int n, int n2) {
        return n == n2;
    }

    public int b() {
        return this.e;
    }

    public int d() {
        return this.g;
    }

    public void AerialfisherManager() {
        this.e = var1[7];
        this.f = var1[7];
        this.g = var1[7];
    }

    private static void var3() {
        var1 = new int[8];
        a.var1[0] = 0xFFFFF9BF & 0x5F6A;
        a.var1[1] = -(0xFFFFAF93 & 0x567D) & (0xFFFFDFFF & 0x7F3D);
        a.var1[2] = -(0xFFFFA2E7 & 0x7DDF) & (0xFFFFFBF6 & 0x7DFF);
        a.var1[3] = -(0xFFFFFE49 & 0x7F7) & (0xFFFFFFF3 & 0x5F7F);
        a.var1[4] = 1;
        a.var1[5] = 0xFFFFF976 & 0x5FAD;
        a.var1[6] = -(0xFFFFA573 & 0x5ECF) & (0xFFFFDD7E & 0x7FFB);
        a.var1[7] = (133 + 13 - 107 + 100 ^ 2 + 111 - 1 + 19) & (0xDC ^ 0x8D ^ (0xDD ^ 0x84) ^ -1);
    }

    public int c() {
        return this.f;
    }

    static {
        a.var3();
    }

    private static boolean var4(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var5(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void AerialfisherManager(InventoryChanged inventoryChanged) {
        if (a.var4(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            void var6;
            if (a.var5(List.of(Integer.valueOf(var1[0]), Integer.valueOf(var1[1]), Integer.valueOf(var1[2]), Integer.valueOf(var1[3])).contains(inventoryChanged.getItemId()) ? 1 : 0)) {
                this.e += var1[4];
            }
            if (a.var2(var6.getItemId(), var1[5])) {
                var7.f += var1[4];
            }
            if (a.var2(var6.getItemId(), var1[6])) {
                var7.g += var1[4];
            }
        }
    }
}

