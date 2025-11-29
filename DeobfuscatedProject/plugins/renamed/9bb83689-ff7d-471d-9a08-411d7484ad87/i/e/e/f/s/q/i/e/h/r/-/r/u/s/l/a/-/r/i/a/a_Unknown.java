/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 */
package i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a;

import com.google.inject.Singleton;
import java.util.List;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.InventoryChanged;

@Singleton
public class a_Unknown {
    private static /* synthetic */ int[] lIlIllIlIlI;
    private /* synthetic */ int e;
    private /* synthetic */ int f;
    private /* synthetic */ int g;

    private static boolean lIIlIIlllIlIII(int n, int n2) {
        return n == n2;
    }

    public int b() {
        return this.e;
    }

    public int d() {
        return this.g;
    }

    public void a() {
        this.e = lIlIllIlIlI[7];
        this.f = lIlIllIlIlI[7];
        this.g = lIlIllIlIlI[7];
    }

    private static void lIIlIIlllIIlIl() {
        lIlIllIlIlI = new int[8];
        a.lIlIllIlIlI[0] = 0xFFFFF9BF & 0x5F6A;
        a.lIlIllIlIlI[1] = -(0xFFFFAF93 & 0x567D) & (0xFFFFDFFF & 0x7F3D);
        a.lIlIllIlIlI[2] = -(0xFFFFA2E7 & 0x7DDF) & (0xFFFFFBF6 & 0x7DFF);
        a.lIlIllIlIlI[3] = -(0xFFFFFE49 & 0x7F7) & (0xFFFFFFF3 & 0x5F7F);
        a.lIlIllIlIlI[4] = 1;
        a.lIlIllIlIlI[5] = 0xFFFFF976 & 0x5FAD;
        a.lIlIllIlIlI[6] = -(0xFFFFA573 & 0x5ECF) & (0xFFFFDD7E & 0x7FFB);
        a.lIlIllIlIlI[7] = (133 + 13 - 107 + 100 ^ 2 + 111 - 1 + 19) & (0xDC ^ 0x8D ^ (0xDD ^ 0x84) ^ -1);
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
    public void a(InventoryChanged inventoryChanged) {
        if (a.lIIlIIlllIIllI(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            void var2;
            if (a.lIIlIIlllIIlll(List.of(Integer.valueOf(lIlIllIlIlI[0]), Integer.valueOf(lIlIllIlIlI[1]), Integer.valueOf(lIlIllIlIlI[2]), Integer.valueOf(lIlIllIlIlI[3])).contains(inventoryChanged.getItemId()) ? 1 : 0)) {
                this.e += lIlIllIlIlI[4];
            }
            if (a.lIIlIIlllIlIII(var2.getItemId(), lIlIllIlIlI[5])) {
                var1.f += lIlIllIlIlI[4];
            }
            if (a.lIIlIIlllIlIII(var2.getItemId(), lIlIllIlIlI[6])) {
                var1.g += lIlIllIlIlI[4];
            }
        }
    }
}

