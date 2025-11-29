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
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J_Unknown;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;

@Singleton
public class d_Unknown {
    private /* synthetic */ HashMap<TileObject, J> R;
    private final /* synthetic */ SquireSepulchreConfig P;
    private final /* synthetic */ SquireSepulchre Q;
    private static /* synthetic */ int[] lllIIIIlllII;
    private static /* synthetic */ String[] lllIIIIllIll;

    private static boolean lIIIlIIIllIIIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=-2.1474836E9f)
    public void a(GameTick gameTick) {
        void var14;
        List list = TileObjects.getAll(tileObject -> {
            int n2;
            if (!d.lIIIlIIIllIIIll(tileObject.getName().toLowerCase().contains(lllIIIIllIll[lllIIIIlllII[0]]) ? 1 : 0) || d.lIIIlIIIllIIIIl(tileObject.getName().toLowerCase().contains(lllIIIIllIll[lllIIIIlllII[1]]) ? 1 : 0)) {
                n2 = lllIIIIlllII[1];
                0;
                if (3 == 0) {
                    return ((6 ^ 0xA ^ (0xF1 ^ 0xAF)) & (0x93 ^ 0xB3 ^ (0xEB ^ 0x99) ^ -1)) != 0;
                }
            } else {
                n2 = lllIIIIlllII[0];
            }
            return n2 != 0;
        });
        int n2 = lllIIIIlllII[0];
        Iterator var5 = list.iterator();
        while (d.lIIIlIIIllIIIIl(var5.hasNext() ? 1 : 0)) {
            J var3;
            d var1;
            TileObject var11 = (TileObject)var5.next();
            if (d.lIIIlIIIllIIIlI(var11)) {
                0;
                if ((2 ^ 6) >= 0) continue;
                return;
            }
            if (d.lIIIlIIIllIIIll(var1.R.containsKey(var11) ? 1 : 0)) {
                var3 = new J(var11);
                var3.aE();
                ++var14;
                var1.R.put(var11, var3);
                0;
            }
            var3 = var1.R.get(var11);
            var3.aE();
            0;
            if (3 != (0x21 ^ 0x61 ^ (0x5B ^ 0x1F))) continue;
            return;
        }
        if (d.lIIIlIIIllIIIIl((int)var14)) {
            System.out.println("Added " + (int)var14 + " obstacles to the map");
        }
    }

    public void q() {
        this.R.clear();
    }

    private static void lIIIlIIIlIllllI() {
        lllIIIIllIll = new String[lllIIIIlllII[2]];
        d.lllIIIIllIll[d.lllIIIIlllII[0]] = d."wizard statue";
        d.lllIIIIllIll[d.lllIIIIlllII[1]] = d."knight statue";
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (d.lIIIlIIIllIIIII(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            // empty if block
        }
    }

    private static boolean lIIIlIIIllIIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIIlIIIllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIIllIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        d.lIIIlIIIlIlllll();
        d.lIIIlIIIlIllllI();
    }

    public J b(TileObject tileObject) {
        if (d.lIIIlIIIllIIIIl(this.R.containsKey(tileObject) ? 1 : 0)) {
            return this.R.get(tileObject);
        }
        return null;
    }

    private static boolean lIIIlIIIllIIIII(Object object, Object object2) {
        return object == object2;
    }

    public void r() {
        this.R.clear();
    }

    private static void lIIIlIIIlIlllll() {
        lllIIIIlllII = new int[3];
        d.lllIIIIlllII[0] = (111 + 133 - 172 + 77 ^ 68 + 21 - 32 + 113) & (19 + 73 - -40 + 14 ^ 40 + 35 - 42 + 140 ^ -1);
        d.lllIIIIlllII[1] = 1;
        d.lllIIIIlllII[2] = 2;
    }

    private static String lIIIlIIIlIlllIl(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var10 = var13.toCharArray();
        int var6 = lllIIIIlllII[0];
        char[] var9 = var12.toCharArray();
        int var4 = var9.length;
        int var7 = lllIIIIlllII[0];
        while (d.lIIIlIIIllIIlII(var7, var4)) {
            char var8 = var9[var7];
            var2.append((char)(var8 ^ var10[var6 % var10.length]));
            0;
            ++var6;
            ++var7;
            0;
            
            return null;
        }
        return String.valueOf(var2);
    }

    @Inject
    d(SquireSepulchreConfig squireSepulchreConfig, SquireSepulchre squireSepulchre) {
        this.R = new HashMap();
        this.Q = squireSepulchre;
        this.P = squireSepulchreConfig;
    }
}

