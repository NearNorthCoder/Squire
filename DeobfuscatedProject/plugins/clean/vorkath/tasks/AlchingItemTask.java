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
import gg.squire.vorkath.tasks.VorkathTaskBase;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Alching item", priority=300)
public class AlchingItemTask
extends VorkathTaskBase {
    private static final  int[] cq;

    private static boolean lIllllllllllllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected AlchingItemTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    static {
        K.lIlllllllllllII();
        int[] nArray = new int[lIlIlIlllllIl[2]];
        nArray[K.lIlIlIlllllIl[1]] = lIlIlIlllllIl[3];
        nArray[K.lIlIlIlllllIl[0]] = lIlIlIlllllIl[4];
        nArray[K.lIlIlIlllllIl[5]] = lIlIlIlllllIl[6];
        nArray[K.lIlIlIlllllIl[7]] = lIlIlIlllllIl[8];
        nArray[K.lIlIlIlllllIl[9]] = lIlIlIlllllIl[10];
        nArray[K.lIlIlIlllllIl[11]] = lIlIlIlllllIl[12];
        nArray[K.lIlIlIlllllIl[13]] = lIlIlIlllllIl[14];
        nArray[K.lIlIlIlllllIl[15]] = lIlIlIlllllIl[16];
        nArray[K.lIlIlIlllllIl[17]] = lIlIlIlllllIl[18];
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
        K var1;
        if (K.lIlllllllllllIl(this.cg.c(lIlIlIlllllIl[0]))) {
            return lIlIlIlllllIl[1];
        }
        if (K.lIllllllllllllI(var1.ce.alch() ? 1 : 0)) {
            return lIlIlIlllllIl[1];
        }
        SpellBook.Standard var2 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (K.lIllllllllllllI(var2.canCast() ? 1 : 0)) {
            return lIlIlIlllllIl[1];
        }
        Item var3 = var1.af();
        if (K.lIlllllllllllIl(var3)) {
            return lIlIlIlllllIl[1];
        }
        Magic.cast((Spell)var1_1, (Item)var2_2);
        return lIlIlIlllllIl[0];
    }

    private static boolean lIlllllllllllIl(Object object) {
        return object == null;
    }
}

