/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.mta.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.util.Log;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mta.tasks.MtaTaskBase;
import gg.squire.mta.tasks.GameEnum8;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.widgets.Widgets;

public abstract class MtaTaskBase<T extends MtaTaskBase>
extends Task {
    protected final  SquireMTA aC;

    protected final  T aB;

    static {
        w.lIIIllIIIIIIIlI();
        w.lIIIllIIIIIIIIl();
    }

    private static boolean lIIIllIIIIIIlII(Object object) {
        return object == null;
    }

    private static boolean lIIIllIIIIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var1);
    }

    protected void P() {
    }

    public boolean run() {
        w var2;
        if (w.lIIIllIIIIIIIll(((MtaTaskBase) his.aB).c() ? 1 : 0)) {
            return this.O();
        }
        c var3 = ((MtaTaskBase) ar2.aB).d();
        Widget var4 = Widgets.get((int)var3.f(), (int)var3.h());
        if (w.lIIIllIIIIIIlII(var4)) {
            return lllIlIlIIllI[0];
        }
        int var5 = Integer.parseInt(var4.getText().replaceAll(lllIlIlIIlIl[lllIlIlIIllI[0]], lllIlIlIIlIl[lllIlIlIIllI[1]]));
        int var6 = var2.aC.d(var3);
        var2.aC.a(var3, var5);
        if (w.lIIIllIIIIIIlIl(var5, var6)) {
            Log.info((String)lllIlIlIIlIl[lllIlIlIIllI[2]]);
            var2.Q();
            return lllIlIlIIllI[1];
        }
        Item var7 = Inventory.getFirst(var2::a);
        Spell var8 = var2.L();
        if (w.lIIIllIIIIIIIll(var8.canCast() ? 1 : 0)) {
            if (w.lIIIllIIIIIIllI(var7)) {
                var7.interact(lllIlIlIIlIl[lllIlIlIIllI[3]]);
                return lllIlIlIIllI[1];
            }
            var2.Q();
            return lllIlIlIIllI[1];
        }
        return this.M();
    }

    private static boolean lIIIllIIIIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIIllIIIIIIIIl() {
        lllIlIlIIlIl = new String[lllIlIlIIllI[5]];
        w.lllIlIlIIlIl[w.lllIlIlIIllI[0]] = ",";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[1]] = w.lIIIlIllllllllI("MWltfNhOGic=", "zYnuK");
        w.lllIlIlIIlIl[w.lllIlIlIIllI[2]] = "Exiting because we should";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[3]] = "Wield";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[4]] = "Exit Teleport";
    }

    private static boolean lIIIllIIIIIIllI(Object object) {
        return object != null;
    }

    protected void Q() {
        this.aC.a(((MtaTaskBase) his.aB).d());
        String[] stringArray = new String[lllIlIlIIllI[1]];
        stringArray[w.lllIlIlIIllI[0]] = lllIlIlIIlIl[lllIlIlIIllI[4]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (w.lIIIllIIIIIIlII(tileObject)) {
            return;
        }
        tileObject.interact(lllIlIlIIllI[0]);
    }

    private static boolean lIIIllIIIIIIIll(int n2) {
        return n2 == 0;
    }

    public abstract boolean a(Item var1);

    public abstract Spell L();

    private static boolean lIIIllIIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean O() {
        void var1_1;
        w var9;
        if (!w.lIIIllIIIIIIlll(this.aC.c(((MtaTaskBase) his.aB).d()), this.aC.d(((MtaTaskBase) his.aB).d())) || w.lIIIllIIIIIlIII(this.aC.b(((MtaTaskBase) his.aB).d()) ? 1 : 0)) {
            return lllIlIlIIllI[0];
        }
        String[] stringArray = new String[lllIlIlIIllI[1]];
        stringArray[w.lllIlIlIIllI[0]] = ((MtaTaskBase) ar9.aB).d().g();
        TileObject var10 = TileObjects.getNearest((String[])stringArray);
        if (w.lIIIllIIIIIIlII(var10)) {
            return lllIlIlIIllI[0];
        }
        var1_1.interact(lllIlIlIIllI[0]);
        return lllIlIlIIllI[1];
    }

    @Inject
    public MtaTaskBase(T t2, SquireMTA squireMTA) {
        this.aB = t2;
        this.aC = squireMTA;
    }

    private static boolean lIIIllIIIIIlIII(int n2) {
        return n2 != 0;
    }

    public abstract boolean M();
}

