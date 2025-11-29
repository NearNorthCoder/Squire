/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.skilling.tasks.SkillingTaskBase;
import gg.squire.skilling.tasks.GameEnum9;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Smelting", register=true)
public class SmeltingTask
extends SkillingTaskBase {

    private static boolean lIllIIIIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIllIII(Object object) {
        return object != null;
    }

    static {
        P.lIllIIIIIlIIll();
        P.lIllIIIIIlIIlI();
    }

    private static boolean lIllIIIIIlIlII(int n2) {
        return n2 != 0;
    }

    @Override
    public int i() {
        return lllIlIlllII[3];
    }

    private static boolean lIllIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIlIlll(Object object) {
        return object == null;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.smeltingProduct().q(), this.j.smeltingProduct().r(), this.j.smeltingProduct().t(), this.j.smeltingProduct().u());
    }

    private static void lIllIIIIIlIIlI() {
        lllIlIllIll = new String[lllIlIlllII[4]];
        P.lllIlIllIll[P.lllIlIlllII[0]] = "Smelt";
        P.lllIlIllIll[P.lllIlIlllII[1]] = "Smelt";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1_2;
        if (P.lIllIIIIIlIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllIlIlllII[0]);
            return lllIlIlllII[1];
        }
        if (P.lIllIIIIIlIlII(Production.isOpen() ? 1 : 0)) {
            P var1;
            int var2 = var1.j.smeltingProduct().w();
            Production.chooseOption((int)var2);
            var1.sleep(var1.i());
            return lllIlIlllII[1];
        }
        if (P.lIllIIIIIlIlIl(Movement.isRunEnabled() ? 1 : 0) && P.lIllIIIIIlIllI(Movement.getRunEnergy(), lllIlIlllII[2])) {
            Movement.toggleRun();
            return lllIlIlllII[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (P.lIllIIIIIllIII(tileObject.getActions())) {
                String[] stringArray = new String[lllIlIlllII[1]];
                stringArray[P.lllIlIlllII[0]] = lllIlIllIll[lllIlIlllII[1]];
                if (P.lIllIIIIIlIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIlIlllII[1];

                    if (((0xBE ^ 0xA0 ^ (0xAB ^ 0xA4)) & (0xE7 ^ 0xA0 ^ (0x97 ^ 0xC1) ^ -1)) <= ((106 + 73 - 5 + 32 ^ 106 + 90 - 178 + 128) & (0x51 ^ 0x4A ^ (0x25 ^ 0x62) ^ -1))) return n2 != 0;
                    return ((0xB9 ^ 0x9E ^ (0xFB ^ 0x89)) & (0x71 ^ 0x45 ^ (0x48 ^ 0x29) ^ -1)) != 0;
                }
            }
            n2 = lllIlIlllII[0];
            return n2 != 0;
        });
        if (P.lIllIIIIIlIlll(var2)) {
            return lllIlIlllII[0];
        }
        var1_2.interact(lllIlIllIll[lllIlIlllII[0]]);
        return lllIlIlllII[1];
    }

    @Inject
    public SmeltingTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.SMELTING);
    }

        return String.valueOf(var3);
    }

    private static boolean lIllIIIIIlIllI(int n2, int n3) {
        return n2 >= n3;
    }
}

