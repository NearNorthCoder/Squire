/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.tithefarm.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.tithefarm.tasks.IHelper;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Getting new seeds", priority=500, blocking=true)
public class GettingNewSeedsTask
extends TithefarmTaskBase {
    private final  Client V;

    private static final  int S;
    private final  SquireTitheConfig U;
    private static final  int T;

    private static boolean lIllIllIIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var1);
    }

    static {
        o.lIllIllIIIlllII();
        o.lIllIllIIIllIIl();
        S = lIIlllllllIIl[4];
        T = lIIlllllllIIl[2];
    }

    private static boolean lIllIllIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIIlIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIllIIlIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIllIIIlllIl(int n2, int n3) {
        return n2 != n3;
    }

    public boolean run() {
        o var2;
        if (o.lIllIllIIIlllIl(this.Z.u(), this.Z.t()) && o.lIllIllIIIlllll(this.V.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllllllIIl[0];
        }
        if (o.lIllIllIIlIIIII(Vars.getBit((int)lIIlllllllIIl[1]), lIIlllllllIIl[2])) {
            return lIIlllllllIIl[0];
        }
        Item var3 = Inventory.getFirst(item -> item.getName().endsWith(lIIllllllIlll[lIIlllllllIIl[8]]));
        if (o.lIllIllIIlIIIlI(var3) && o.lIllIllIIlIIIll(var3.getQuantity(), var2.Z.u()) && o.lIllIllIIIlllll(var2.V.isInInstancedRegion() ? 1 : 0)) {
            if (o.lIllIllIIlIIlII(var2.U.fruit().a(var3) ? 1 : 0)) {
                return lIIlllllllIIl[0];
            }
            if (o.lIllIllIIIlllll(Inventory.contains(item -> item.getName().endsWith(lIIllllllIlll[lIIlllllllIIl[7]])) ? 1 : 0)) {
                return lIIlllllllIIl[0];
            }
        }
        if (!o.lIllIllIIlIIlII(var2.V.isInInstancedRegion() ? 1 : 0) || o.lIllIllIIlIIIlI(var3)) {
            String[] stringArray = new String[lIIlllllllIIl[3]];
            stringArray[o.lIIlllllllIIl[0]] = lIIllllllIlll[lIIlllllllIIl[0]];
            TileObject var4 = TileObjects.getNearest((String[])stringArray);
            if (o.lIllIllIIlIIlIl(var4)) {
                return lIIlllllllIIl[0];
            }
            var4.interact(lIIllllllIlll[lIIlllllllIIl[3]]);
            return lIIlllllllIIl[3];
        }
        if (o.lIllIllIIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIIlllllllIIl[4]);
            return lIIlllllllIIl[3];
        }
        String[] stringArray = new String[lIIlllllllIIl[3]];
        stringArray[o.lIIlllllllIIl[0]] = lIIllllllIlll[lIIlllllllIIl[5]];
        TileObject var4 = TileObjects.getNearest((String[])stringArray);
        if (o.lIllIllIIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)var2.U.fruit().i().ordinal());

            if ((0xE6 ^ 0x83 ^ (0x2F ^ 0x4F)) <= 0) {
                return ((0x32 ^ 0xB ^ (0x3B ^ 0x3E)) & (2 ^ (0x8A ^ 0xB4) ^ -1)) != 0;
            }
        } else {
            var4.interact(lIIllllllIlll[lIIlllllllIIl[6]]);
        }
        return lIIlllllllIIl[3];
    }

    private static boolean lIllIllIIlIIlIl(Object object) {
        return object == null;
    }

    @Inject
    protected GettingNewSeedsTask(i i2, SquireTitheConfig squireTitheConfig, Client client) {
        super(i2);
        this.U = squireTitheConfig;
        this.V = client;
    }

    private static void lIllIllIIIllIIl() {
        lIIllllllIlll = new String[lIIlllllllIIl[9]];
        o.lIIllllllIlll[o.lIIlllllllIIl[0]] = "Farm door";
        o.lIIllllllIlll[o.lIIlllllllIIl[3]] = "Open";
        o.lIIllllllIlll[o.lIIlllllllIIl[5]] = "Seed table";
        o.lIIllllllIlll[o.lIIlllllllIIl[6]] = "Search";
        o.lIIllllllIlll[o.lIIlllllllIIl[7]] = "fruit";
        o.lIIllllllIlll[o.lIIlllllllIIl[8]] = "seed";
    }
}

