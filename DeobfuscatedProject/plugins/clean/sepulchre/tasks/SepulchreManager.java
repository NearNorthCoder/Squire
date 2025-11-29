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
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
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
public class SepulchreManager {
    private  HashMap<TileObject, J> R;
    private final  SquireSepulchreConfig P;
    private final  SquireSepulchre Q;

    private static boolean lIIIlIIIllIIIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=-2.1474836E9f)
    public void a(GameTick gameTick) {
        void var1;
        List list = TileObjects.getAll(tileObject -> {
            int n2;
            if (!d.lIIIlIIIllIIIll(tileObject.getName().toLowerCase().contains(lllIIIIllIll[lllIIIIlllII[0]]) ? 1 : 0) || d.lIIIlIIIllIIIIl(tileObject.getName().toLowerCase().contains(lllIIIIllIll[lllIIIIlllII[1]]) ? 1 : 0)) {
                n2 = lllIIIIlllII[1];

                if (3 == 0) {
                    return ((6 ^ 0xA ^ (0xF1 ^ 0xAF)) & (0x93 ^ 0xB3 ^ (0xEB ^ 0x99) ^ -1)) != 0;
                }
            } else {
                n2 = lllIIIIlllII[0];
            }
            return n2 != 0;
        });
        int n2 = lllIIIIlllII[0];
        Iterator var2 = list.iterator();
        while (d.lIIIlIIIllIIIIl(var2.hasNext() ? 1 : 0)) {
            J var3;
            d var4;
            TileObject var5 = (TileObject)var2.next();
            if (d.lIIIlIIIllIIIlI(var5)) {

                if ((2 ^ 6) >= 0) continue;
                return;
            }
            if (d.lIIIlIIIllIIIll(var4.R.containsKey(var5) ? 1 : 0)) {
                var3 = new J(var5);
                var3.aE();
                ++var1;
                var4.R.put(var5, var3);

            }
            var3 = var4.R.get(var5);
            var3.aE();

            if (3 != (0x21 ^ 0x61 ^ (0x5B ^ 0x1F))) continue;
            return;
        }
        if (d.lIIIlIIIllIIIIl((int)var1)) {
            System.out.println("Added " + (int)var1 + " obstacles to the map");
        }
    }

    public void q() {
        this.R.clear();
    }

    private static void lIIIlIIIlIllllI() {
        lllIIIIllIll = new String[lllIIIIlllII[2]];
        d.lllIIIIllIll[d.lllIIIIlllII[0]] = "wizard statue";
        d.lllIIIIllIll[d.lllIIIIlllII[1]] = "knight statue";
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

        return String.valueOf(var6);
    }

    @Inject
    SepulchreManager(SquireSepulchreConfig squireSepulchreConfig, SquireSepulchre squireSepulchre) {
        this.R = new HashMap();
        this.Q = squireSepulchre;
        this.P = squireSepulchreConfig;
    }
}

