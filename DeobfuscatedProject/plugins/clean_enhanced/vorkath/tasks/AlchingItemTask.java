/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Alching item", priority=300)
public class AlchingItemTask
extends VorkathManager {
    private static final  int[] cq;

    private static void var2() {
        var1 = new int[19];
        K.var1[0] = 1;
        K.var1[1] = (91 + 29 - 63 + 181 ^ 161 + 17 - 132 + 132) & (0xB6 ^ 0xC5 ^ (0x7C ^ 0x53) ^ -1);
        K.var1[2] = 0x25 ^ 0x6E ^ (0x3A ^ 0x78);
        K.var1[3] = 0xFFFFE4F3 & 0x1FBD;
        K.var1[4] = -(0xFFFFFBD1 & 0x462F) & (0xFFFFDBEB & 0x77FD);
        K.var1[5] = 2;
        K.var1[6] = 0xFFFFFD7F & 0x797;
        K.var1[7] = 3;
        K.var1[8] = -(0xFFFFFC8F & 0x6371) & (0xFFFFEFF7 & Short.MAX_VALUE);
        K.var1[9] = 9 ^ 0x63 ^ (0x4D ^ 0x23);
        K.var1[10] = 0xFFFF8FF3 & 0x756D;
        K.var1[11] = 0x68 ^ 0x6D;
        K.var1[12] = -(0xFFFFADCF & 0x7AF7) & (0xFFFFADFF & 0x7FDF);
        K.var1[13] = 0xA3 ^ 0xA5;
        K.var1[14] = 0xFFFFCDFF & 0x3727;
        K.var1[15] = 0x37 ^ 0x30;
        K.var1[16] = -(0xFFFFF3F7 & 0x7EAB) & (0xFFFFFFFF & 0x77FF);
        K.var1[17] = 0xDD ^ 0x96 ^ (0x26 ^ 0x65);
        K.var1[18] = 0xFFFFEDAB & 0x16F5;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    @Inject
    protected AlchingItemTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    static {
        K.var2();
        int[] nArray = new int[var1[2]];
        nArray[K.var1[1]] = var1[3];
        nArray[K.var1[0]] = var1[4];
        nArray[K.var1[5]] = var1[6];
        nArray[K.var1[7]] = var1[8];
        nArray[K.var1[9]] = var1[10];
        nArray[K.var1[11]] = var1[12];
        nArray[K.var1[13]] = var1[14];
        nArray[K.var1[15]] = var1[16];
        nArray[K.var1[17]] = var1[18];
        cq = nArray;
    }

    private Item af() {
        return Inventory.getFirst((int[])cq);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var2_2;
        void var1_1;
        K var4;
        if (K.var5(this.cg.c(var1[0]))) {
            return var1[1];
        }
        if (K.var3(var4.ce.alch() ? 1 : 0)) {
            return var1[1];
        }
        SpellBook.Standard var6 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (K.var3(var6.canCast() ? 1 : 0)) {
            return var1[1];
        }
        Item var7 = var4.af();
        if (K.var5(var7)) {
            return var1[1];
        }
        Magic.cast((Spevar1_1, (Item)var2_2);
        return var1[0];
    }

    private static boolean var5(Object object) {
        return object == null;
    }
}

