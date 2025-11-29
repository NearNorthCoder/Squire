/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.hydra.tasks;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Objects;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Alching items", priority=15, blocking=true)
public class AlchingItemsTask
extends Task {
    private final  a aV;
    public static final  ImmutableSet<String> aU;

    private static void var3() {
        var2 = new int[9];
        y.var2[0] = (0x1F ^ 0x73 ^ (0x11 ^ 0x45)) & (0x5B ^ 0x3D ^ (0x66 ^ 0x38) ^ -1);
        y.var2[1] = 30 + 110 - 104 + 102 ^ 128 + 80 - 207 + 142;
        y.var2[2] = 1;
        y.var2[3] = 2;
        y.var2[4] = 3;
        y.var2[5] = 0x88 ^ 0x8C;
        y.var2[6] = 0x26 ^ 0x20;
        y.var2[7] = 170 + 30 - 105 + 104 ^ 86 + 21 - -50 + 35;
        y.var2[8] = 0x9D ^ 0x95;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static void var5() {
        var1 = new String[var2[8]];
        y.var1[y.var2[0]] = "Open";
        y.var1[y.var2[2]] = " staff";
        y.var1[y.var2[3]] = "d'hide";
        y.var1[y.var2[4]] = "longsword";
        y.var1[y.var2[5]] = "med helm";
        y.var1[y.var2[1]] = "Rune ";
        y.var1[y.var2[6]] = "battleaxe";
        y.var1[y.var2[7]] = "Mystic";
    }

    static {
        y.var3();
        y.var5();
        Object[] objectArray = new String[var2[2]];
        objectArray[y.var2[0]] = var1[var2[7]];
        aU = ImmutableSet.of((Object)var1[var2[2]], (Object)var1[var2[3]], (Object)var1[var2[4]], (Object)var1[var2[5]], (Object)var1[var2[1]], (Object)var1[var2[6]], (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var2_2;
        SpellBook spellBook = SpellBook.getCurrent();
        if (y.var6(spellBook, SpellBook.STANDARD)) {
            return var2[0];
        }
        SpellBook.Standard var7 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (y.var4(var7.canCast() ? 1 : 0)) {
            return var2[0];
        }
        Item var8 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[var2[2]];
            stringArray[y.var2[0]] = var1[var2[0]];
            if (y.var4(item.hasAction(stringArray) ? 1 : 0)) {
                Stream stream = aU.stream();
                String string = item.getName();
                Objects.requireNonNull(string);
                0;
                if (y.var9(stream.anyMatch(string::contains) ? 1 : 0)) {
                    n2 = var2[2];
                    0;
                    if (((0xA6 ^ 0x9B ^ (0x56 ^ 0x36)) & (75 + 201 - 261 + 228 ^ 83 + 32 - 64 + 123 ^ -1)) == ((23 + 16 - -107 + 10 ^ 110 + 69 - 102 + 54) & (0xB5 ^ 0x82 ^ (0xF ^ 0x27) ^ -1))) return n2 != 0;
                    return ((111 + 19 - 10 + 7 ^ (0xA4 ^ 0x91)) & (0x68 ^ 0x7A ^ (0x59 ^ 1) ^ -1)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        });
        if (y.var10(var8)) {
            return var2[0];
        }
        Magic.cast((Spevar2_2, (Item)var3_3);
        this.sleep(var2[1]);
        return var2[2];
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var2[0];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var2[0];
        while (y.var26(var25, var24)) {
            char var27 = var23[var25];
            var20.append((char)(var27 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (-(0x33 ^ 0x37) < 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean var26(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    @Inject
    public AlchingItemsTask(a a2) {
        this.aV = a2;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var6(Object object, Object object2) {
        return object != object2;
    }
}

