/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
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
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Smithing")
public class SmithingTask
extends SkillingTaskBase {

    private static boolean lIlIllIllIllII(Object object) {
        return object != null;
    }

    @Inject
    public SmithingTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.SMITHING);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var2_2;
        if (Q.lIlIllIllIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllIIlIIIIl[2]);
        }
        if (Q.lIlIllIllIlIlI(Movement.isRunEnabled() ? 1 : 0) && Q.lIlIllIllIlIll(Movement.getRunEnergy(), lllIIlIIIIl[3])) {
            Movement.toggleRun();
            return lllIIlIIIIl[2];
        }
        Widget var1 = Widgets.get((WidgetInfo)WidgetInfo.SMITHING_INVENTORY_ITEMS_CONTAINER);
        if (Q.lIlIllIllIllII(var1)) {
            Q var2;
            String[] stringArray = new String[lllIIlIIIIl[1]];
            stringArray[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[2]];
            if (Q.lIlIllIllIlIlI(Widgets.get((WidgetInfo)var2.j.smithingProduct().SmithingTask()).hasAction(stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIIlIIIIl[1]];
                stringArray2[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[1]];
                if (Q.lIlIllIllIlIlI(Widgets.get((WidgetInfo)var2.j.smithingProduct().SmithingTask()).hasAction(stringArray2) ? 1 : 0)) {
                    Log.info((String)lllIIlIIIII[lllIIlIIIIl[4]]);
                    return lllIIlIIIIl[2];
                }
            }
            String[] stringArray3 = new String[lllIIlIIIIl[4]];
            stringArray3[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[5]];
            stringArray3[Q.lllIIlIIIIl[1]] = lllIIlIIIII[lllIIlIIIIl[6]];
            Widgets.get((WidgetInfo)var2.j.smithingProduct().SmithingTask()).interact(stringArray3);
            var2.sleep(var2.i());
            return lllIIlIIIIl[1];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (Q.lIlIllIllIllII(tileObject.getActions())) {
                String[] stringArray = new String[lllIIlIIIIl[1]];
                stringArray[Q.lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[9]];
                if (Q.lIlIllIllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIlIIIIl[1];

                    if (3 > 0) return n2 != 0;
                    return ((0x5D ^ 0x54 ^ (0x31 ^ 0x21)) & (62 + 152 - 130 + 73 ^ 72 + 131 - 102 + 31 ^ -1)) != 0;
                }
            }
            n2 = lllIIlIIIIl[2];
            return n2 != 0;
        });
        if (Q.lIlIllIllIllIl(var3)) {
            Log.info((String)lllIIlIIIII[lllIIlIIIIl[7]]);
            return lllIIlIIIIl[2];
        }
        var2_2.interact(lllIIlIIIII[lllIIlIIIIl[8]]);
        this.sleep(lllIIlIIIIl[4]);
        return lllIIlIIIIl[1];
    }

    static {
        Q.lIlIllIllIlIII();
        Q.lIlIllIllIIlll();
    }

    private static boolean lIlIllIllIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllIllIlIlI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var4);
    }

    @Override
    public int i() {
        return lllIIlIIIIl[5];
    }

    private static boolean lIlIllIllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIllIIlll() {
        lllIIlIIIII = new String[lllIIlIIIIl[10]];
        Q.lllIIlIIIII[Q.lllIIlIIIIl[2]] = "Smith";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[1]] = "Smith set";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[4]] = "something is wrong";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[5]] = "Smith";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[6]] = "Smith set";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[7]] = "Cant find an anvil";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[8]] = "Smith";
        Q.lllIIlIIIII[Q.lllIIlIIIIl[9]] = "Smith";
    }

    private static boolean lIlIllIllIllIl(Object object) {
        return object == null;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIlIIIIl[0], lllIIlIIIIl[1], this.j.smithingBar().p(), this.j.smithingProduct().R());
    }
}

