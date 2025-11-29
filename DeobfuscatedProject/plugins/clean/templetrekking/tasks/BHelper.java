/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 */
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.InventoryChanged;

@Singleton
public class BHelper {
    private final  TempleTrekkingConfig p;
    
    private  int s;
    private  int x;
    private  int t;
    private  int v;
    private final  TempleTrekkingPlugin q;
    private  int w;
    private  int u;
    private  int y;
    private  int r;

    public int s() {
        return this.x;
    }

    public int m() {
        return this.r;
    }

    public int o() {
        return this.t;
    }

    private static boolean lIllIIIIIIlllII(Object object, Object object2) {
        return object == object2;
    }

    public int p() {
        return this.u;
    }

    private static boolean lIllIIIIIIlllIl(int n2) {
        return n2 != 0;
    }

    @Inject
    BHelper(TempleTrekkingConfig templeTrekkingConfig, TempleTrekkingPlugin templeTrekkingPlugin) {
        this.q = templeTrekkingPlugin;
        this.p = templeTrekkingConfig;
    }

    public void l() {
        this.r = lIIllIIllllIl[0];
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (b.lIllIIIIIIlllII(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED) && b.lIllIIIIIIlllIl(this.p.reward().w().contains(inventoryChanged.getItemId()) ? 1 : 0)) {
            this.r += inventoryChanged.getAmount();
        }
    }

    static {
        b.lIllIIIIIIllIll();
    }

    public int r() {
        return this.w;
    }

    public int q() {
        return this.v;
    }

    public int n() {
        return this.s;
    }

    public int t() {
        return this.y;
    }
}

