/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.tithefarm.tasks.GameEnum11;

@TaskDesc(name="Buying Rewards", priority=0x7FFFFFFF, blocking=true)
public class BuyingRewardsTask
extends Task {
    private  boolean M;
    private static final  int F;
    private static final  int G;
    private final  Client L;
    private final  SquireTitheConfig K;
    private static final  int E;
    
    private static final  int H;
    private static final  int J;
    private static final  int I;

    private static boolean lIllIllIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIllIIllIIIl(Object object) {
        return object != null;
    }

    public boolean run() {
        k var2;
        if (k.lIllIllIIlIllll(this.L.isInInstancedRegion() ? 1 : 0)) {
            this.M = lIIlllllllllI[0];
            return lIIlllllllllI[0];
        }
        if (k.lIllIllIIlIllll(var2.M ? 1 : 0)) {
            return lIIlllllllllI[0];
        }
        if (k.lIllIllIIllIIII((Object)var2.K.buyItems(), (Object)a.NONE)) {
            return lIIlllllllllI[0];
        }
        String[] stringArray = new String[lIIlllllllllI[1]];
        stringArray[k.lIIlllllllllI[0]] = lIIllllllllIl[lIIlllllllllI[0]];
        stringArray[k.lIIlllllllllI[2]] = lIIllllllllIl[lIIlllllllllI[2]];
        Item var3 = Inventory.getFirst((String[])stringArray);
        if (k.lIllIllIIllIIIl(var3)) {
            var3.interact(lIIllllllllIl[lIIlllllllllI[1]]);
            return lIIlllllllllI[2];
        }
        int var4 = Vars.getBit((int)lIIlllllllllI[3]);
        if (k.lIllIllIIllIIlI(var4, lIIlllllllllI[4])) {
            var2.M = lIIlllllllllI[2];
            return lIIlllllllllI[0];
        }
        Widget var5 = var2.L.getWidget(lIIlllllllllI[5]);
        if (k.lIllIllIIllIIll(Widgets.isVisible((Widget)var5) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlllllllllI[2]];
            stringArray2[k.lIIlllllllllI[0]] = lIIllllllllIl[lIIlllllllllI[6]];
            NPC var6 = NPCs.getNearest((String[])stringArray2);
            if (k.lIllIllIIllIlII(var6)) {
                return lIIlllllllllI[0];
            }
            var6.interact(lIIllllllllIl[lIIlllllllllI[7]]);
            return lIIlllllllllI[2];
        }
        this.x();

        return lIIlllllllllI[2];
    }

    @Inject
    public BuyingRewardsTask(SquireTitheConfig squireTitheConfig, Client client) {
        this.K = squireTitheConfig;
        this.L = client;
    }

    private static boolean lIllIllIIlIllll(int n2) {
        return n2 != 0;
    }

    static {
        k.lIllIllIIlIlllI();
        k.lIllIllIIlIllIl();
        I = lIIlllllllllI[10];
        J = lIIlllllllllI[11];
        G = lIIlllllllllI[8];
        H = lIIlllllllllI[9];
        E = lIIlllllllllI[5];
        F = lIIlllllllllI[4];
    }

    public boolean x() {
        k var7;
        Widget var8;
        int var9;
        int n2;
        if (k.lIllIllIIllIIII((Object)this.K.buyItems(), (Object)a.HERB_BOX)) {
            n2 = lIIlllllllllI[8];

            if ((54 + 20 - 69 + 133 ^ 136 + 82 - 134 + 58) == 0) {
                return ((0x24 ^ 0xE ^ (0x1D ^ 0x22)) & (72 + 81 - 101 + 85 ^ 43 + 18 - -89 + 6 ^ -1)) != 0;
            }
        } else {
            n2 = var9 = lIIlllllllllI[9];
        }
        if (k.lIllIllIIllIlII(var8 = var7.L.getWidget(lIIlllllllllI[10]))) {
            return lIIlllllllllI[0];
        }
        Widget var10 = var8.getDynamicChildren()[var9];
        if (k.lIllIllIIllIlII(var10)) {
            return lIIlllllllllI[0];
        }
        Object[] var11 = var10.getOnOpListener();
        var7.L.runScript(var11);
        Widget var12 = var7.L.getWidget(lIIlllllllllI[11]);
        if (k.lIllIllIIllIIIl(var12)) {
            var12.interact(lIIllllllllIl[lIIlllllllllI[12]]);
            return lIIlllllllllI[2];
        }
        return lIIlllllllllI[0];
    }

    private static boolean lIllIllIIllIlII(Object object) {
        return object == null;
    }

    private static boolean lIllIllIIllIIII(Object object, Object object2) {
        return object == object2;
    }

    private static void lIllIllIIlIllIl() {
        lIIllllllllIl = new String[lIIlllllllllI[13]];
        k.lIIllllllllIl[k.lIIlllllllllI[0]] = "Herb box";
        k.lIIllllllllIl[k.lIIlllllllllI[2]] = "Seed pack";
        k.lIIllllllllIl[k.lIIlllllllllI[1]] = "Bank-all";
        k.lIIllllllllIl[k.lIIlllllllllI[6]] = "Farmer Gricoller";
        k.lIIllllllllIl[k.lIIlllllllllI[7]] = "Rewards";
        k.lIIllllllllIl[k.lIIlllllllllI[12]] = "Buy-50";
    }

    private static boolean lIllIllIIllIIll(int n2) {
        return n2 == 0;
    }
}

