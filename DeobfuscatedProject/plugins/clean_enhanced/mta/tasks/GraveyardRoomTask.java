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
import java.util.stream.Stream;
import gg.squire.mta.tasks.MtaManager;
import gg.squire.mta.tasks.MtaManager;
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
extends MtaManager<l> {
    private static final  int az;
    private static final  int ay;
    private static final  int aA;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void N() {
        void var4_4;
        int var4;
        SpellBook.Standard standard = SpellBook.Standard.BONES_TO_PEACHES;
        int n2 = var1[2];
        if (v.var5(standard.canCast() ? 1 : 0)) {
            standard = SpellBook.Standard.BONES_TO_BANANAS;
            var4 = var1[3];
        }
        int[] nArray = new int[var1[1]];
        nArray[v.var1[0]] = var4;
        if (v.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var6;
            Magic.cast((Spevar6);
            return;
        }
        int[] nArray2 = new int[var1[1]];
        nArray2[v.var1[0]] = var4;
        Item var7 = Inventory.getFirst((int[])nArray2);
        if (!v.var8(var4, var1[3]) || v.var3(Players.getLocal().isMoving() ? 1 : 0)) {
            var7.interact(var2[var1[5]]);
        }
        String[] stringArray = new String[var1[1]];
        stringArray[v.var1[0]] = var2[var1[6]];
        TileObject var9 = TileObjects.getNearest((String[])stringArray);
        if (v.var10(var9)) {
            return;
        }
        var4_4.interact(var2[var1[7]]);
    }

    static {
        v.var11();
        v.var12();
        az = var1[2];
        ay = var1[3];
        aA = var1[4];
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var19(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var8(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean a(Item item) {
        int n2;
        if (v.var3(item.getName().toLowerCase().contains(var2[var1[0]]) ? 1 : 0) && v.var3(Stream.of(Rune.WATER.getRuneNames()).anyMatch(string -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if ((19 + 111 - 102 + 101 ^ 122 + 116 - 160 + 55) != (6 + 12 - -161 + 9 ^ 146 + 17 - 5 + 26)) {
                return ((0xC ^ 0x44 ^ (0xE1 ^ 0x8D)) & (0xC2 ^ 0xB9 ^ (0xC ^ 0x53) ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean M() {
        TileObject tileObject;
        block5: {
            v var20;
            block4: {
                String[] stringArray = new String[var1[1]];
                stringArray[v.var1[0]] = var2[var1[1]];
                tileObject = TileObjects.getNearest((String[])stringArray);
                if (v.var10(tileObject)) {
                    return var1[0];
                }
                int[] nArray = new int[var1[1]];
                nArray[v.var1[0]] = var1[2];
                if (!v.var5(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray2 = new int[var1[1]];
                nArray2[v.var1[0]] = var1[3];
                if (v.var5(Inventory.contains((int[])nArray2) ? 1 : 0) && !v.var19(((var20.aB).B(), var1[4])) break block5;
            }
            var20.N();
            return var1[1];
        }
        this.b(tileObject);
        return var1[1];
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    private GraveyardRoomTask(l l2, SquireMTA squireMTA) {
        super(l2, squireMTA);
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private void b(TileObject tileObject) {
        if (v.var5(Inventory.isFull() ? 1 : 0)) {
            tileObject.interact(var1[0]);
            0;
            if (-1 >= 2) {
                return;
            }
        } else if (v.var3(Inventory.isFull() ? 1 : 0) && v.var3(Inventory.contains(item -> item.getName().toLowerCase().contains(var2[var1[8]])) ? 1 : 0)) {
            Magic.cast((SpeSpellBook.Standard.BONES_TO_BANANAS);
        }
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var1[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var1[0];
        while (v.var21(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (2 != 1) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    private static void var12() {
        var2 = new String[var1[9]];
        v.var2[v.var1[0]] = "staff";
        v.var2[v.var1[1]] = "Bones";
        v.var2[v.var1[5]] = "Eat";
        v.var2[v.var1[6]] = "Food chute";
        v.var2[v.var1[7]] = "Deposit";
        v.var2[v.var1[8]] = "bones";
    }

    private static void var11() {
        var1 = new int[10];
        v.var1[0] = (0x71 ^ 0x6D) & ~(0x40 ^ 0x5C);
        v.var1[1] = 1;
        v.var1[2] = -(0xFFFFADFD & 0x5307) & (0xFFFFFFFF & 0x1BE7);
        v.var1[3] = -(0xFFFFFFDD & 0x6023) & (0xFFFFEFAF & 0x77FB);
        v.var1[4] = 6 ^ 0x22 ^ (0x12 ^ 0x24);
        v.var1[5] = 2;
        v.var1[6] = 3;
        v.var1[7] = 0x51 ^ 0x55;
        v.var1[8] = 3 + 42 - -94 + 30 ^ 54 + 145 - 75 + 48;
        v.var1[9] = 0x66 ^ 0x60;
    }

    @Override
    public Spell L() {
        return SpellBook.Standard.BONES_TO_BANANAS;
    }
}

