/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Teleport out", priority=250, blocking=true)
public class TeleportOutTask
extends Task {
    private final  SquireAlchemicalHydraConfig bg;
    
    private final  SquireAlchemicalHydraPlugin bf;
    
    private final  a be;

    private static void var3() {
        var1 = new String[var2[13]];
        C.var1[C.var2[0]] = "Take";
        C.var1[C.var2[1]] = "Cannot find tp item";
        C.var1[C.var2[2]] = "Tele to POH";
        C.var1[C.var2[3]] = "Tele to POH";
        C.var1[C.var2[4]] = "Break";
        C.var1[C.var2[5]] = "Tele to POH";
        C.var1[C.var2[6]] = "Teleport";
        C.var1[C.var2[7]] = "Break";
        C.var1[C.var2[8]] = "Tele to POH";
        C.var1[C.var2[9]] = "Teleport";
        C.var1[C.var2[10]] = "Drink";
        C.var1[C.var2[11]] = "anti";
        C.var1[C.var2[12]] = "Eat";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        int var4;
        int n2;
        int var5;
        int n3;
        C var6;
        if (C.var7(this.be.g() ? 1 : 0)) {
            return var2[0];
        }
        if (C.var8(var6.be.k())) {
            return var2[0];
        }
        NPC var9 = var6.be.k().K();
        if (!C.var10(var9) || C.var11(var9.isDead() ? 1 : 0)) {
            return var2[0];
        }
        if (C.var7(Inventory.contains(item -> {
            String[] stringArray = new String[var2[1]];
            stringArray[C.var2[0]] = var1[var2[12]];
            return item.hasAction(stringArray);
        }) ? 1 : 0) && C.var12(Combat.getMissingHealth(), var6.bg.eatAt())) {
            n3 = var2[1];
            0;
            if (1 <= 0) {
                return ((0x9D ^ 0x8F ^ 1) & (14 + 100 - -56 + 13 ^ 111 + 32 - 13 + 34 ^ -1)) != 0;
            }
        } else {
            n3 = var5 = var2[0];
        }
        if (C.var7(Inventory.contains(item -> {
            int n2;
            String[] stringArray = new String[var2[1]];
            stringArray[C.var2[0]] = var1[var2[10]];
            if (C.var11(item.hasAction(stringArray) ? 1 : 0) && C.var11(item.getName().toLowerCase().contains(var1[var2[11]]) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if null != null {
                    return ((0x28 ^ 4 ^ (0x3C ^ 0x4B)) & (0x3C ^ 0x55 ^ (0x39 ^ 0xB) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }) ? 1 : 0) && C.var11(Combat.isPoisoned() ? 1 : 0)) {
            n2 = var2[1];
            0;
            if (((0xBD ^ 0xB6) & ~(0x2B ^ 0x20)) < -1) {
                return ((0x89 ^ 0x90) & ~(0x8E ^ 0x97)) != 0;
            }
        } else {
            n2 = var4 = var2[0];
        }
        if (C.var7(var5) && C.var7(var4) && C.var7(var6.bf.c() ? 1 : 0)) {
            return var2[0];
        }
        List var13 = TileItems.getAll();
        if (C.var7(var13.isEmpty() ? 1 : 0) && C.var7(Inventory.isFull() ? 1 : 0)) {
            ((TileItem)var13.iterator().next()).interact(var1[var2[0]]);
            return var2[1];
        }
        Item var14 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var2[3]];
            stringArray[C.var2[0]] = var1[var2[7]];
            stringArray[C.var2[1]] = var1[var2[8]];
            stringArray[C.var2[2]] = var1[var2[9]];
            return item.hasAction(stringArray);
        });
        if (C.var8(var14)) {
            Log.info((String)var1[var2[1]]);
            Magic.cast((SpeSpellBook.Standard.TELEPORT_TO_HOUSE);
            return var2[1];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[C.var2[0]] = var1[var2[2]];
        if (C.var11(var14.hasAction(stringArray) ? 1 : 0)) {
            var14.interact(var1[var2[3]]);
            return var2[1];
        }
        String[] stringArray2 = new String[var2[3]];
        stringArray2[C.var2[0]] = var1[var2[4]];
        stringArray2[C.var2[1]] = var1[var2[5]];
        stringArray2[C.var2[2]] = var1[var2[6]];
        var5_5.interact(stringArray2);
        return var2[1];
    }

    private static void var15() {
        var2 = new int[14];
        C.var2[0] = (0x3B ^ 0x3C) & ~(0x84 ^ 0x83);
        C.var2[1] = 1;
        C.var2[2] = 2;
        C.var2[3] = 3;
        C.var2[4] = 0x8B ^ 0x8F;
        C.var2[5] = 0x52 ^ 0x18 ^ (0x30 ^ 0x7F);
        C.var2[6] = 0xC7 ^ 0xC1;
        C.var2[7] = 37 + 128 - 92 + 70 ^ 55 + 135 - 179 + 125;
        C.var2[8] = 0x58 ^ 0x50;
        C.var2[9] = 0x7B ^ 0x72;
        C.var2[10] = 0x7B ^ 0x71;
        C.var2[11] = 0x76 ^ 0x44 ^ (0x9B ^ 0xA2);
        C.var2[12] = 0x18 ^ 1 ^ (0x3E ^ 0x2B);
        C.var2[13] = 0x16 ^ 0x1B;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    private static boolean var12(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    static {
        C.var15();
        C.var3();
    }

    @Inject
    public TeleportOutTask(a a2, SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.be = a2;
        this.bf = squireAlchemicalHydraPlugin;
        this.bg = squireAlchemicalHydraConfig;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static String var28(String var29, String var30) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var32 = var30.toCharArray();
        int var33 = var2[0];
        char[] var34 = var29.toCharArray();
        int var35 = var34.length;
        int var36 = var2[0];
        while (C.var37(var36, var35)) {
            char var38 = var34[var36];
            var31.append((char)(var38 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var36;
            0;
            if (-1 <= 1) continue;
            return null;
        }
        return String.valueOf(var31);
    }

    private static boolean var37(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var8(Object object) {
        return object == null;
    }
}

