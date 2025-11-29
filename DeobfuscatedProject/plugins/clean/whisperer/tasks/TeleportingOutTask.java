/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.whisperer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.whisperer.tasks.WhispererManager;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Teleporting out", priority=0x7FFFFFFF, blocking=true)
public class TeleportingOutTask
extends WhispererTaskBase {
    @Inject
    private  a f;
    private static final  int ab;

    static {
        t.llIIIIIlIlIIlIl();
        t.llIIIIIlIIlllll();
        ab = lIlIllIlIlIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    private boolean c(boolean bl) {
        Item var1;
        void var2;
        int[] nArray = new int[lIlIllIlIlIIl[2]];
        nArray[t.lIlIllIlIlIIl[1]] = lIlIllIlIlIIl[5];
        Item item2 = Inventory.getFirst((int[])nArray);
        if (t.llIIIIIlIlIlIIl(item2)) {
            item2.interact(lIlIllIlIIllI[lIlIllIlIlIIl[2]]);
            return lIlIllIlIlIIl[2];
        }
        int[] nArray2 = new int[lIlIllIlIlIIl[6]];
        nArray2[t.lIlIllIlIlIIl[1]] = lIlIllIlIlIIl[7];
        nArray2[t.lIlIllIlIlIIl[2]] = lIlIllIlIlIIl[8];
        Item var3 = Inventory.getFirst((int[])nArray2);
        if (t.llIIIIIlIlIlIIl(var3)) {
            var3.interact(lIlIllIlIIllI[lIlIllIlIlIIl[6]]);
            return lIlIllIlIlIIl[2];
        }
        if (t.llIIIIIlIlIIllI((int)var2) && t.llIIIIIlIlIlIIl(var1 = Inventory.getFirst(item -> item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[3]])))) {
            if (t.llIIIIIlIlIlIII(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlIllIlIlIIl[9]);

                return lIlIllIlIlIIl[2];
            }
            var1.interact(lIlIllIlIIllI[lIlIllIlIlIIl[9]]);
            return lIlIllIlIlIIl[2];
        }
        var1 = Inventory.getFirst(item -> {
            boolean bl;
            Item var4;
            if ((!t.llIIIIIlIlIIllI(item.hasAction(lIlIllIlIIllI[lIlIllIlIlIIl[14]]::equals) ? 1 : 0) || t.llIIIIIlIlIlIII(item.hasAction(lIlIllIlIIllI[lIlIllIlIlIIl[15]]::equals) ? 1 : 0)) && t.llIIIIIlIlIllII(var4.getId(), lIlIllIlIlIIl[16])) {
                bl = lIlIllIlIlIIl[2];

                if (1 >= 2) {
                    return false;
                }
            } else {
                bl = lIlIllIlIlIIl[1];
            }
            return bl;
        });
        if (t.llIIIIIlIlIlIIl(var1)) {
            String[] stringArray = new String[lIlIllIlIlIIl[6]];
            stringArray[t.lIlIllIlIlIIl[1]] = lIlIllIlIIllI[lIlIllIlIlIIl[10]];
            stringArray[t.lIlIllIlIlIIl[2]] = lIlIllIlIIllI[lIlIllIlIlIIl[11]];
            var1.interact(stringArray);
            return lIlIllIlIlIIl[2];
        }
        Iterator var5 = SpellBook.getCurrent().getCastableSpells().iterator();
        while (t.llIIIIIlIlIlIII(var5.hasNext() ? 1 : 0)) {
            Spell var6 = (Spell)var5.next();
            String var7 = var6.toString().toLowerCase();
            if (t.llIIIIIlIlIlIII(var7.contains(lIlIllIlIIllI[lIlIllIlIlIIl[12]]) ? 1 : 0) && t.llIIIIIlIlIIllI(var7.contains(lIlIllIlIIllI[lIlIllIlIlIIl[13]]) ? 1 : 0)) {
                Magic.cast((Spell)var6);
                return lIlIllIlIlIIl[2];
            }

            if ((0x54 ^ 0x29 ^ (0x53 ^ 0x2B)) > 0) continue;
            return ((47 + 184 - 70 + 64 ^ 15 + 126 - 11 + 52) & (0x18 ^ 0x7E ^ (0xB9 ^ 0x88) ^ -1)) != 0;
        }
        return lIlIllIlIlIIl[1];
    }

    private static void llIIIIIlIIlllll() {
        lIlIllIlIIllI = new String[lIlIllIlIlIIl[29]];
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[1]] = "Take";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[2]] = "Break";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[6]] = "Tele to POH";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[9]] = "Rub";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[10]] = "Teleport";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[11]] = "Break";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[12]] = "teleport";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[13]] = "home";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[14]] = "Teleport";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[15]] = "Break";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[3]] = "dueling";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[17]] = "Prayer";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[18]] = "restore";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[19]] = "Eat";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[20]] = "\\(";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[21]] = ")";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[22]] = t.llIIIIIlIIllIlI("Qyt/dsG0rTA=", "aFLzi");
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[23]] = "Saradomin brew";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[24]] = "\\(";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[25]] = ")";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[26]] = t.llIIIIIlIIllIll("7IyZqI7lH6o=", "wrcqx");
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[27]] = "Prayer";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[28]] = "restore";
    }

    private static boolean llIIIIIlIlIlIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean run() {
        t var8;
        if (t.llIIIIIlIlIIllI(this.p.b(lIlIllIlIlIIl[0]) ? 1 : 0)) {
            return lIlIllIlIlIIl[1];
        }
        int var9 = lIlIllIlIlIIl[1];
        if (t.llIIIIIlIlIIlll(var8.W.j())) {
            var9 = var8.TeleportingOutTask() ? 1 : 0;

            if ((0xAE ^ 0xAA) < 1) {
                return false;
            }
        } else {
            var9 = var8.u() ? 1 : 0;
        }
        if (t.llIIIIIlIlIlIII(var9)) {
            boolean bl;
            TileItem var10;
            if (t.llIIIIIlIlIIllI(Inventory.isFull() ? 1 : 0) && t.llIIIIIlIlIIlll(var8.W.j()) && t.llIIIIIlIlIlIIl(var10 = (TileItem)TileItems.getAll().stream().max(Comparator.comparingInt(tileItem -> tileItem.getQuantity() * Prices.getItemPrice((int)tileItem.getId()))).orElse(null))) {
                var10.interact(lIlIllIlIIllI[lIlIllIlIlIIl[1]]);
                return lIlIllIlIlIIl[2];
            }
            if (t.llIIIIIlIlIlIIl(var8.W.j())) {
                bl = lIlIllIlIlIIl[2];

                }
            } else {
                bl = lIlIllIlIlIIl[1];
            }
            if (t.llIIIIIlIlIlIII(var8.c(bl) ? 1 : 0)) {
                var8.f.a(lIlIllIlIlIIl[2]);
            }
            return lIlIllIlIlIIl[2];
        }
        return lIlIllIlIlIIl[1];
    }

        return String.valueOf(var11);
    }

    private static boolean llIIIIIlIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIlIlIIlll(Object object) {
        return object == null;
    }

    private boolean TeleportingOutTask() {
        t var12;
        int n2 = lIlIllIlIlIIl[1];
        int n3 = Inventory.getAll(item -> {
            int n2;
            if (!t.llIIIIIlIlIIllI(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[27]]) ? 1 : 0) || t.llIIIIIlIlIlIII(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[28]]) ? 1 : 0)) {
                n2 = lIlIllIlIlIIl[2];

                }
            } else {
                n2 = lIlIllIlIlIIl[1];
            }
            return n2 != 0;
        }).stream().mapToInt(item -> Integer.parseInt(item.getName().split(lIlIllIlIIllI[lIlIllIlIlIIl[24]])[lIlIllIlIlIIl[2]].replace(lIlIllIlIIllI[lIlIllIlIlIIl[25]], lIlIllIlIIllI[lIlIllIlIlIIl[26]]))).sum();
        if (t.llIIIIIlIlIlIlI(n3, this.i.prayDoses())) {
            int var13 = lIlIllIlIlIIl[2];
        }
        int var14 = Inventory.getAll(item -> item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[23]])).stream().mapToInt(item -> Integer.parseInt(item.getName().split(lIlIllIlIIllI[lIlIllIlIlIIl[20]])[lIlIllIlIlIIl[2]].replace(lIlIllIlIIllI[lIlIllIlIlIIl[21]], lIlIllIlIIllI[lIlIllIlIlIIl[22]]))).sum();
        if (t.llIIIIIlIlIlIlI(var14 += Inventory.getCount(item -> {
            String[] stringArray = new String[lIlIllIlIlIIl[2]];
            stringArray[t.lIlIllIlIlIIl[1]] = lIlIllIlIIllI[lIlIllIlIlIIl[19]];
            return item.hasAction(stringArray);
        }), var12.i.food())) {
            n2 = lIlIllIlIlIIl[2];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIlIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private boolean u() {
        if (t.llIIIIIlIlIlIll(Prayers.getPoints(), lIlIllIlIlIIl[3]) && t.llIIIIIlIlIIllI(Inventory.contains(item -> {
            int n2;
            if (!t.llIIIIIlIlIIllI(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[17]]) ? 1 : 0) || t.llIIIIIlIlIlIII(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[18]]) ? 1 : 0)) {
                n2 = lIlIllIlIlIIl[2];

                if ((0x56 ^ 0x52) == 0) {
                    return false;
                }
            } else {
                n2 = lIlIllIlIlIIl[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return lIlIllIlIlIIl[2];
        }
        if (t.llIIIIIlIlIlIll(Combat.getCurrentHealth(), lIlIllIlIlIIl[4])) {
            return lIlIllIlIlIIl[2];
        }
        return lIlIllIlIlIIl[1];
    }

    @Override
    public boolean p() {
        return lIlIllIlIlIIl[1];
    }

    private static boolean llIIIIIlIlIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIlIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIlIlIllII(int n2, int n3) {
        return n2 != n3;
    }
}

