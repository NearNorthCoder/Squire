/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.BankingTask;
import gg.squire.zulrah.tasks.THelper;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling house", priority=10)
public class HandlingHouseTask
extends BankingTask {

    private static boolean llIIlIIllIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIllIIIIll(Object object, Object object2) {
        return object == object2;
    }

    static {
        H.llIIlIIlIllllll();
        H.llIIlIIlIllllII();
    }

    private static boolean llIIlIIllIIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIlIIllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean run() {
        H var1;
        if (!H.llIIlIIllIIIIII(this.ag() ? 1 : 0) || H.llIIlIIllIIIIII(this.ae().needsToBank() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        int var2 = Inventory.getCount(item -> item.hasAction(lIllIlllIIllI[lIllIlllIlIII[6]]::equals));
        if (H.llIIlIIllIIIIIl(var2, var1.X.multiple()) && H.llIIlIIllIIIIlI(var1.X.multiple())) {
            return lIllIlllIlIII[0];
        }
        if (H.llIIlIIllIIIIlI(var1.ad() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        if (H.llIIlIIllIIIIII(var1.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        if (!H.llIIlIIllIIIIlI(Players.getLocal().isIdle() ? 1 : 0) || H.llIIlIIllIIIIll(Static.getClient().getGameState(), GameState.LOADING)) {
            return lIllIlllIlIII[0];
        }
        if (H.llIIlIIllIIIIlI(Widgets.isVisible((Widget)Widgets.get((int)lIllIlllIlIII[1], (int)lIllIlllIlIII[0])) ? 1 : 0)) {
            Keyboard.type((char)lIllIlllIlIII[2]);
            return lIllIlllIlIII[3];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (H.llIIlIIllIIIlII(tileObject.getName()) && H.llIIlIIllIIIIlI(tileObject.getName().contains(lIllIlllIIllI[lIllIlllIlIII[3]]) ? 1 : 0)) {
                n2 = lIllIlllIlIII[3];

                if (-1 >= (0xE ^ 0xA)) {
                    return false;
                }
            } else {
                n2 = lIllIlllIlIII[0];
            }
            return n2 != 0;
        });
        if (H.llIIlIIllIIIlII(var3)) {
            var3.interact(lIllIlllIIllI[lIllIlllIlIII[0]]);
            return lIllIlllIlIII[3];
        }
        return lIllIlllIlIII[0];
    }

        return String.valueOf(var4);
    }

    private static boolean llIIlIIllIIIIlI(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIlIllllII() {
        lIllIlllIIllI = new String[lIllIlllIlIII[7]];
        H.lIllIlllIIllI[H.lIllIlllIlIII[0]] = "Teleport Menu";
        H.lIllIlllIIllI[H.lIllIlllIlIII[3]] = "Jewellery Box";
        H.lIllIlllIIllI[H.lIllIlllIlIII[6]] = "Eat";
    }

    private static boolean llIIlIIllIIIlII(Object object) {
        return object != null;
    }

    @Inject
    protected HandlingHouseTask(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }

    private static boolean llIIlIIllIIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIIllIIIIII(int n2) {
        return n2 == 0;
    }

    private boolean ag() {
        H var5;
        if (H.llIIlIIllIIIIII(this.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        int[] var6 = var5.Z.getMapRegions();
        int var7 = var6.length;
        int var8 = lIllIlllIlIII[0];
        while (H.llIIlIIllIIIlIl(var8, var7)) {
            int var9 = var6[var8];
            if (!H.llIIlIIllIIIllI(var9, lIllIlllIlIII[4]) || H.llIIlIIllIIIlll(var9, lIllIlllIlIII[5])) {
                return lIllIlllIlIII[3];
            }
            ++var8;

            return ((0x80 ^ 0xAB ^ (0x31 ^ 0x2F)) & (107 + 128 - 219 + 228 ^ 33 + 5 - -134 + 21 ^ -1)) != 0;
        }
        return lIllIlllIlIII[0];
    }

    @Override
    public boolean ac() {
        return lIllIlllIlIII[0];
    }
}

