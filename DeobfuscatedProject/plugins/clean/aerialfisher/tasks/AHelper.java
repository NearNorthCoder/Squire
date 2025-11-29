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
public class AHelper {
    
    private  int e;
    private  int f;
    private  int g;

    private static boolean lIIlIIlllIlIII(int n, int n2) {
        return n == n2;
    }

    public int b() {
        return this.e;
    }

    public int d() {
        return this.g;
    }

    public void AHelper() {
        this.e = lIlIllIlIlI[7];
        this.f = lIlIllIlIlI[7];
        this.g = lIlIllIlIlI[7];
    }

    public int c() {
        return this.f;
    }

    static {
        a.lIIlIIlllIIlIl();
    }

    private static boolean lIIlIIlllIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIIlllIIlll(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void AHelper(InventoryChanged inventoryChanged) {
        if (a.lIIlIIlllIIllI(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            void var1;
            if (a.lIIlIIlllIIlll(List.of(Integer.valueOf(lIlIllIlIlI[0]), Integer.valueOf(lIlIllIlIlI[1]), Integer.valueOf(lIlIllIlIlI[2]), Integer.valueOf(lIlIllIlIlI[3])).contains(inventoryChanged.getItemId()) ? 1 : 0)) {
                this.e += lIlIllIlIlI[4];
            }
            if (a.lIIlIIlllIlIII(var1.getItemId(), lIlIllIlIlI[5])) {
                var2.f += lIlIllIlIlI[4];
            }
            if (a.lIIlIIlllIlIII(var1.getItemId(), lIlIllIlIlI[6])) {
                var2.g += lIlIllIlIlI[4];
            }
        }
    }
}

