/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;

@TaskDesc(name="Decanting potions", priority=1000, blocking=true)
public class DecantingPotionsTask
extends AutotoaManager {

    private int n(String string) {
        return Integer.parseInt(string.split(var2[var1[2]])[var1[0]].split(var2[var1[3]])[var1[1]]);
    }

    static {
        cc.var3();
        cc.var4();
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
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
        int var22 = var1[1];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[1];
        while (cc.var26(var25, var24)) {
            char var27 = var23[var25];
            var20.append((char)(var27 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (((0x68 ^ 0x21 ^ (0x52 ^ 0x1F)) & (0 ^ 0xE ^ (0x33 ^ 0x39) ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    public boolean run() {
        String[] stringArray = new String[var1[0]];
        stringArray[cc.var1[1]] = var2[var1[1]];
        Item item2 = Inventory.getFirst((String[])stringArray);
        if (cc.var28(item2)) {
            item2.interact(var2[var1[0]]);
            return var1[0];
        }
        Set var29 = Inventory.getAll(item -> item.getName().contains(var2[var1[7]])).stream().filter(item -> {
            String[] stringArray = new String[var1[0]];
            stringArray[cc.var1[1]] = var2[var1[6]];
            return item.hasAction(stringArray);
        }).map(item -> item.getName().split(var2[var1[5]])[var1[1]].trim()).collect(Collectors.toSet());
        Iterator var30 = var29.iterator();
        while (cc.var31(var30.hasNext() ? 1 : 0)) {
            cc var32;
            String var33 = (String)var30.next();
            if (cc.var31(var32.m(var33) ? 1 : 0)) {
                return var1[0];
            }
            0;
            if (-3 < 0) continue;
            return ((109 + 84 - 67 + 2 ^ 108 + 122 - 133 + 64) & (0x1B ^ 0x27 ^ (0x6E ^ 0x73) ^ -1)) != 0;
        }
        return var1[1];
    }

    private static boolean var34(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var35(int n2) {
        return n2 == 0;
    }

    private static boolean var31(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[9];
        cc.var1[0] = 1;
        cc.var1[1] = (0x64 ^ 0x31) & ~(0x5A ^ 0xF);
        cc.var1[2] = 2;
        cc.var1[3] = 3;
        cc.var1[4] = 0xEF ^ 0xA0 ^ (3 ^ 0x48);
        cc.var1[5] = 0xB2 ^ 0xB7;
        cc.var1[6] = 0xC0 ^ 0xC6;
        cc.var1[7] = 0x4C ^ 0x2C ^ (0xA7 ^ 0xC0);
        cc.var1[8] = 8 ^ 0;
    }

    private static boolean var36(Object object) {
        return object == null;
    }

    private static boolean var37(Object object, Object object2) {
        return object != object2;
    }

    private static void var4() {
        var2 = new String[var1[8]];
        cc.var2[cc.var1[1]] = "Vial";
        cc.var2[cc.var1[0]] = "Drop";
        cc.var2[cc.var1[2]] = "\\(";
        cc.var2[cc.var1[3]] = "\\)";
        cc.var2[cc.var1[4]] = "4";
        cc.var2[cc.var1[5]] = "\\(";
        cc.var2[cc.var1[6]] = "Drink";
        cc.var2[cc.var1[7]] = "(";
    }

    @Inject
    protected DecantingPotionsTask(Client client) {
        super(client);
    }

    private static boolean var26(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean m(String string) {
        void var4_4;
        void var3_3;
        cc var38;
        void var39;
        List list = Inventory.getAll(item -> {
            int n2;
            if (cc.var36((Object)e.c(item.getId())) && cc.var31(item.getName().contains(string) ? 1 : 0) && cc.var35(item.getName().contains(var2[var1[4]]) ? 1 : 0)) {
                n2 = var1[0];
                0;
                if (-1 >= 3) {
                    return ((0xF3 ^ 0xC7) & ~(0x7B ^ 0x4F)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        });
        if (cc.var34(list.size(), var1[0])) {
            return var1[1];
        }
        Item var40 = var39.stream().min(Comparator.comparingInt(item -> this.n(item.getName()))).orElse(null);
        Item var41 = var39.stream().filter(item2 -> {
            boolean bl2;
            if (cc.var37(item2, var40)) {
                bl2 = var1[0];
                0;
                
            } else {
                bl2 = var1[1];
            }
            return bl2;
        }).max(Comparator.comparingInt(item -> this.n(item.getName()))).orElse(null);
        if (cc.var36(var41)) {
            return var1[1];
        }
        var3_3.useOn((Item)var4_4);
        return var1[0];
    }

    private static boolean var28(Object object) {
        return object != null;
    }
}

