/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Prep Deposit inventory", priority=21004, blocking=true)
public class PrepDepositInventoryTask
extends CoxTaskBase {

    private static boolean lllIIIIIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIIIIIlIlIIl(Object object) {
        return object == null;
    }

    private static boolean lllIIIIIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        aY.lllIIIIIlIIlIl();
        aY.lllIIIIIlIIlII();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_3;
        void var1;
        aY var2;
        block10: {
            block9: {
                List<Item> list = D.bC().a(item -> {
                    int n2;
                    if (!aY.lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[7]) || !aY.lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[8]) || aY.lllIIIIIlIllII(item.getId(), lIlIllIlIlIl[9])) {
                        n2 = lIlIllIlIlIl[1];

                        if ((0x9A ^ 0x9E) <= 2) {
                            return false;
                        }
                    } else {
                        n2 = lIlIllIlIlIl[0];
                    }
                    return n2 != 0;
                });
                if (aY.lllIIIIIlIIllI(this.cq(), this.el)) {
                    return lIlIllIlIlIl[0];
                }
                if (!aY.lllIIIIIlIIlll(D.bC().bH() ? 1 : 0)) break block9;
                int[] nArray = new int[lIlIllIlIlIl[1]];
                nArray[aY.lIlIllIlIlIl[0]] = var2.el().size();
                if (!aY.lllIIIIIlIlIII(Inventory.getCount((int[])nArray), lIlIllIlIlIl[2])) break block10;
            }
            if (aY.lllIIIIIlIIlll(var1.isEmpty() ? 1 : 0)) {
                return lIlIllIlIlIl[0];
            }
        }
        if (aY.lllIIIIIlIIlll(D.bJ() ? 1 : 0)) {
            if (aY.lllIIIIIlIIlll(var2.dZ() ? 1 : 0)) {
                D.bK();

                return lIlIllIlIlIl[1];
            }
            Item var3 = (Item)var1.get(lIlIllIlIlIl[0]);
            Widget var4 = Widgets.get((int)lIlIllIlIlIl[3], (int)lIlIllIlIlIl[4], (int)var3.getSlot());
            if (aY.lllIIIIIlIlIIl(var4)) {
                System.out.println(lIlIllIlIlII[lIlIllIlIlIl[0]]);
            }
            var4.interact(lIlIllIlIlII[lIlIllIlIlIl[1]]);
            return lIlIllIlIlIl[1];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aY.lllIIIIIlIIlll(tileObject.getName().toLowerCase().contains(lIlIllIlIlII[lIlIllIlIlIl[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIlIlIl[1]];
                stringArray[aY.lIlIllIlIlIl[0]] = lIlIllIlIlII[lIlIllIlIlIl[2]];
                if (aY.lllIIIIIlIIlll(tileObject.hasAction(stringArray) ? 1 : 0) && aY.lllIIIIIlIIlll(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIllIlIlIl[1];

                    if (null == null) return n2 != 0;
                    return ((0x66 ^ 6 ^ (0x86 ^ 0xB9)) & (23 + 140 - 0 + 88 ^ 154 + 56 - 91 + 45 ^ -1)) != 0;
                }
            }
            n2 = lIlIllIlIlIl[0];
            return n2 != 0;
        });
        if (aY.lllIIIIIlIlIIl(var3)) {
            System.out.println(lIlIllIlIlII[lIlIllIlIlIl[5]]);
            return lIlIllIlIlIl[0];
        }
        var2_3.interact(lIlIllIlIlII[lIlIllIlIlIl[6]]);
        return lIlIllIlIlIl[1];
    }

    private static boolean lllIIIIIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIIIIlIlIlI(int n2) {
        return n2 == 0;
    }

    private List<Item> ea() {
        return D.bC().a(item -> {
            int n2;
            if (!aY.lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[7]) || !aY.lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[8]) || aY.lllIIIIIlIllII(item.getId(), lIlIllIlIlIl[9])) {
                n2 = lIlIllIlIlIl[1];

                if (3 <= -1) {
                    return false;
                }
            } else {
                n2 = lIlIllIlIlIl[0];
            }
            return n2 != 0;
        });
    }

    @Inject
    protected PrepDepositInventoryTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void lllIIIIIlIIlII() {
        lIlIllIlIlII = new String[lIlIllIlIlIl[4]];
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[0]] = "CANT FIND SUPPLY WIDGET";
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[1]] = "Withdraw-All";
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[5]] = "CANT FIND STORAGE";
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[6]] = "Private";
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[10]] = "storage";
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[2]] = "Private";
    }

    private static boolean lllIIIIIlIIlll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean dZ() {
        int n2;
        block3: {
            block2: {
                if (!aY.lllIIIIIlIlIlI(this.ea().isEmpty() ? 1 : 0)) break block2;
                int[] nArray = new int[lIlIllIlIlIl[1]];
                nArray[aY.lIlIllIlIlIl[0]] = this.el().size();
                if (!aY.lllIIIIIlIlIII(Inventory.getCount((int[])nArray), lIlIllIlIlIl[2])) break block3;
            }
            n2 = lIlIllIlIlIl[1];

            if (1 >= -1) return n2 != 0;
            return false;
        }
        n2 = lIlIllIlIlIl[0];
        return n2 != 0;
    }

    private static boolean lllIIIIIlIllII(int n2, int n3) {
        return n2 == n3;
    }
}

