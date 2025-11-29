/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
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
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Making Jewelry")
public class MakingJewelryTask
extends SkillingTaskBase {

    private static boolean lIlIlllIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public Map<Integer, Integer> g() {
        if (C.lIlIlllIIIllll(this.j.jewelryProduct().H(), lllIIlIllll[0])) {
            return Map.of(this.j.jewelryProduct().z(), lllIIlIllll[1], this.j.jewelryProduct().I(), lllIIlIllll[1]);
        }
        return Map.of(this.j.jewelryProduct().z(), lllIIlIllll[1], this.j.jewelryProduct().H(), lllIIlIllll[1], this.j.jewelryProduct().I(), lllIIlIllll[1]);
    }

    @Inject
    public MakingJewelryTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.JEWELRY);
    }

    @Override
    public int i() {
        return lllIIlIllll[5];
    }

    static {
        C.lIlIlllIIIlllI();
        C.lIlIlllIIIllIl();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1;
        void var2;
        Widget widget = Widgets.get((int)lllIIlIllll[2], (int)lllIIlIllll[1]);
        Widget widget2 = Widgets.get((int)lllIIlIllll[3], (int)lllIIlIllll[4]);
        if (C.lIlIlllIIlIIII(widget)) {
            System.out.println("Group: " + this.j.jewelryProduct().J());
            System.out.println("ID: " + this.j.jewelryProduct().K());
            System.out.println("Option: " + this.j.jewelryProduct().L());
            Widgets.get((int)this.j.jewelryProduct().J(), (int)this.j.jewelryProduct().K()).interact(this.j.jewelryProduct().L());
        }
        if (C.lIlIlllIIlIIII(var2)) {
            C var3;
            System.out.println("Group: " + var3.j.jewelryProduct().J());
            System.out.println("ID: " + var3.j.jewelryProduct().K());
            System.out.println("Option: " + var3.j.jewelryProduct().L());
            Widgets.get((int)var3.j.jewelryProduct().J(), (int)var3.j.jewelryProduct().K()).interact(lllIIlIllll[4]);
        }
        if (C.lIlIlllIIlIIIl(var1) && C.lIlIlllIIlIIIl(var2)) {
            TileObject var4 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (C.lIlIlllIIlIIII(tileObject.getActions())) {
                    String[] stringArray = new String[lllIIlIllll[1]];
                    stringArray[C.lllIIlIllll[4]] = lllIIlIlllI[lllIIlIllll[1]];
                    if (C.lIlIlllIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllIIlIllll[1];

                        if (null == null) return n2 != 0;
                        return false;
                    }
                }
                n2 = lllIIlIllll[4];
                return n2 != 0;
            });
            if (C.lIlIlllIIlIIIl(var4)) {
                return lllIIlIllll[4];
            }
            var4.interact(lllIIlIlllI[lllIIlIllll[4]]);
        }
        return lllIIlIllll[1];
    }

    private static boolean lIlIlllIIlIIII(Object object) {
        return object != null;
    }

    private static void lIlIlllIIIllIl() {
        lllIIlIlllI = new String[lllIIlIllll[6]];
        C.lllIIlIlllI[C.lllIIlIllll[4]] = "Smelt";
        C.lllIIlIlllI[C.lllIIlIllll[1]] = "Smelt";
    }

    private static boolean lIlIlllIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var5);
    }

    private static boolean lIlIlllIIlIIIl(Object object) {
        return object == null;
    }
}

