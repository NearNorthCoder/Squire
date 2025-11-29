/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.loot.LooterConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Alching loot")
public class AlchingLootTask
extends Task {
    private static  String[] lIIlIllll;
    private static  int[] lIIllIIII;
    private final  LooterConfig ey;

    private static void var1() {
        lIIlIllll = new String[lIIllIIII[2]];
        aJ.lIIlIllll[aJ.lIIllIIII[0]] = ",";
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static void var3() {
        lIIllIIII = new int[5];
        aJ.lIIllIIII[0] = (0x89 ^ 0xBF) & ~(0x5A ^ 0x6C);
        aJ.lIIllIIII[1] = 0x3A ^ 0x3E;
        aJ.lIIllIIII[2] = 1;
        aJ.lIIllIIII[3] = 0xC9 ^ 0xC1;
        aJ.lIIllIIII[4] = 2;
    }

    @Inject
    public AlchingLootTask(LooterConfig looterConfig) {
        this.ey = looterConfig;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Item item = Inventory.getFirst((int[])this.ck());
        if (aJ.var5(item)) {
            return lIIllIIII[0];
        }
        SpellBook.Standard var6 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (aJ.var2(var6.canCast() ? 1 : 0)) {
            return lIIllIIII[0];
        }
        Magic.cast((Spevar2_2, (Item)item);
        this.sleep(lIIllIIII[1]);
        return lIIllIIII[2];
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private int[] ck() {
        void var2_2;
        aJ var8;
        if (aJ.var4(this.ey.alch().isEmpty() ? 1 : 0)) {
            return new int[lIIllIIII[0]];
        }
        String[] var9 = var8.ey.alch().split(lIIlIllll[lIIllIIII[0]]);
        int[] var10 = new int[var9.length];
        int var11 = lIIllIIII[0];
        while (aJ.var7(var11, var9.length)) {
            var10[var11] = Integer.parseInt(var9[var11].trim());
            ++var11;
            0;
            if (((0xF ^ 0x63 ^ (0x2D ^ 0x1E)) & (0xF ^ 0x55 ^ (0xB1 ^ 0xB4) ^ -1)) == 0) continue;
            return null;
        }
        return var2_2;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    static {
        aJ.var3();
        aJ.var1();
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }
}

