/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Rune
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.mta.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mta.tasks.LHelper;
import gg.squire.mta.tasks.MtaTaskBase;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Graveyard room", priority=4, blocking=true)
public class GraveyardRoomTask
extends MtaTaskBase<l> {
    private static final  int az;
    private static final  int ay;
    private static final  int aA;

    private static boolean lIIIlIlllllIlIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void N() {
        void var4_4;
        int var1;
        SpellBook.Standard standard = SpellBook.Standard.BONES_TO_PEACHES;
        int n2 = lllIlIlIIIlI[2];
        if (v.lIIIlIlllllIlll(standard.canCast() ? 1 : 0)) {
            standard = SpellBook.Standard.BONES_TO_BANANAS;
            var1 = lllIlIlIIIlI[3];
        }
        int[] nArray = new int[lllIlIlIIIlI[1]];
        nArray[v.lllIlIlIIIlI[0]] = var1;
        if (v.lIIIlIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var2;
            Magic.cast((Spell)var2);
            return;
        }
        int[] nArray2 = new int[lllIlIlIIIlI[1]];
        nArray2[v.lllIlIlIIIlI[0]] = var1;
        Item var3 = Inventory.getFirst((int[])nArray2);
        if (!v.lIIIlIllllllIIl(var1, lllIlIlIIIlI[3]) || v.lIIIlIlllllIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            var3.interact(lllIlIlIIIIl[lllIlIlIIIlI[5]]);
        }
        String[] stringArray = new String[lllIlIlIIIlI[1]];
        stringArray[v.lllIlIlIIIlI[0]] = lllIlIlIIIIl[lllIlIlIIIlI[6]];
        TileObject var4 = TileObjects.getNearest((String[])stringArray);
        if (v.lIIIlIlllllIllI(var4)) {
            return;
        }
        var4_4.interact(lllIlIlIIIIl[lllIlIlIIIlI[7]]);
    }

    static {
        v.lIIIlIlllllIlII();
        v.lIIIlIlllllIIll();
        az = lllIlIlIIIlI[2];
        ay = lllIlIlIIIlI[3];
        aA = lllIlIlIIIlI[4];
    }

    private static boolean lIIIlIllllllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIllllllIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean a(Item item) {
        int n2;
        if (v.lIIIlIlllllIlIl(item.getName().toLowerCase().contains(lllIlIlIIIIl[lllIlIlIIIlI[0]]) ? 1 : 0) && v.lIIIlIlllllIlIl(Stream.of(Rune.WATER.getRuneNames()).anyMatch(string -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
            n2 = lllIlIlIIIlI[1];

            if ((19 + 111 - 102 + 101 ^ 122 + 116 - 160 + 55) != (6 + 12 - -161 + 9 ^ 146 + 17 - 5 + 26)) {
                return ((0xC ^ 0x44 ^ (0xE1 ^ 0x8D)) & (0xC2 ^ 0xB9 ^ (0xC ^ 0x53) ^ -1)) != 0;
            }
        } else {
            n2 = lllIlIlIIIlI[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIlIlllllIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean M() {
        TileObject tileObject;
        block5: {
            v var5;
            block4: {
                String[] stringArray = new String[lllIlIlIIIlI[1]];
                stringArray[v.lllIlIlIIIlI[0]] = lllIlIlIIIIl[lllIlIlIIIlI[1]];
                tileObject = TileObjects.getNearest((String[])stringArray);
                if (v.lIIIlIlllllIllI(tileObject)) {
                    return lllIlIlIIIlI[0];
                }
                int[] nArray = new int[lllIlIlIIIlI[1]];
                nArray[v.lllIlIlIIIlI[0]] = lllIlIlIIIlI[2];
                if (!v.lIIIlIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray2 = new int[lllIlIlIIIlI[1]];
                nArray2[v.lllIlIlIIIlI[0]] = lllIlIlIIIlI[3];
                if (v.lIIIlIlllllIlll(Inventory.contains((int[])nArray2) ? 1 : 0) && !v.lIIIlIllllllIII(((LHelper) ar5.aB).B(), lllIlIlIIIlI[4])) break block5;
            }
            var5.N();
            return lllIlIlIIIlI[1];
        }
        this.b(tileObject);
        return lllIlIlIIIlI[1];
    }

    private static boolean lIIIlIllllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    private GraveyardRoomTask(l l2, SquireMTA squireMTA) {
        super(l2, squireMTA);
    }

    private static boolean lIIIlIlllllIllI(Object object) {
        return object == null;
    }

    private void b(TileObject tileObject) {
        if (v.lIIIlIlllllIlll(Inventory.isFull() ? 1 : 0)) {
            tileObject.interact(lllIlIlIIIlI[0]);

            if (-1 >= 2) {
                return;
            }
        } else if (v.lIIIlIlllllIlIl(Inventory.isFull() ? 1 : 0) && v.lIIIlIlllllIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIlIlIIIIl[lllIlIlIIIlI[8]])) ? 1 : 0)) {
            Magic.cast((Spell)SpellBook.Standard.BONES_TO_BANANAS);
        }
    }

        return String.valueOf(var6);
    }

    private static void lIIIlIlllllIIll() {
        lllIlIlIIIIl = new String[lllIlIlIIIlI[9]];
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[0]] = "staff";
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[1]] = "Bones";
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[5]] = "Eat";
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[6]] = "Food chute";
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[7]] = "Deposit";
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[8]] = "bones";
    }

    @Override
    public Spell L() {
        return SpellBook.Standard.BONES_TO_BANANAS;
    }
}

