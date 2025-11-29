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
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/* TASK: Alching item -> AlchingTask */
@TaskDesc(name="Alching item", priority=300)
public class K
extends w {
    private static final /* synthetic */ int[] cq;
    private static /* synthetic */ int[] lIlIlIlllllIl;

    private static void lIlllllllllllII() {
        lIlIlIlllllIl = new int[19];
        K.lIlIlIlllllIl[0] = 1;
        K.lIlIlIlllllIl[1] = (91 + 29 - 63 + 181 ^ 161 + 17 - 132 + 132) & (0xB6 ^ 0xC5 ^ (0x7C ^ 0x53) ^ -1);
        K.lIlIlIlllllIl[2] = 0x25 ^ 0x6E ^ (0x3A ^ 0x78);
        K.lIlIlIlllllIl[3] = 0xFFFFE4F3 & 0x1FBD;
        K.lIlIlIlllllIl[4] = -(0xFFFFFBD1 & 0x462F) & (0xFFFFDBEB & 0x77FD);
        K.lIlIlIlllllIl[5] = 2;
        K.lIlIlIlllllIl[6] = 0xFFFFFD7F & 0x797;
        K.lIlIlIlllllIl[7] = 3;
        K.lIlIlIlllllIl[8] = -(0xFFFFFC8F & 0x6371) & (0xFFFFEFF7 & Short.MAX_VALUE);
        K.lIlIlIlllllIl[9] = 9 ^ 0x63 ^ (0x4D ^ 0x23);
        K.lIlIlIlllllIl[10] = 0xFFFF8FF3 & 0x756D;
        K.lIlIlIlllllIl[11] = 0x68 ^ 0x6D;
        K.lIlIlIlllllIl[12] = -(0xFFFFADCF & 0x7AF7) & (0xFFFFADFF & 0x7FDF);
        K.lIlIlIlllllIl[13] = 0xA3 ^ 0xA5;
        K.lIlIlIlllllIl[14] = 0xFFFFCDFF & 0x3727;
        K.lIlIlIlllllIl[15] = 0x37 ^ 0x30;
        K.lIlIlIlllllIl[16] = -(0xFFFFF3F7 & 0x7EAB) & (0xFFFFFFFF & 0x77FF);
        K.lIlIlIlllllIl[17] = 0xDD ^ 0x96 ^ (0x26 ^ 0x65);
        K.lIlIlIlllllIl[18] = 0xFFFFEDAB & 0x16F5;
    }

    private static boolean lIllllllllllllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected K(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
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
        K var2;
        if (K.lIlllllllllllIl(this.cg.c(lIlIlIlllllIl[0]))) {
            return lIlIlIlllllIl[1];
        }
        if (K.lIllllllllllllI(var2.ce.alch() ? 1 : 0)) {
            return lIlIlIlllllIl[1];
        }
        SpellBook.Standard var1 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (K.lIllllllllllllI(var1.canCast() ? 1 : 0)) {
            return lIlIlIlllllIl[1];
        }
        Item var3 = var2.af();
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

