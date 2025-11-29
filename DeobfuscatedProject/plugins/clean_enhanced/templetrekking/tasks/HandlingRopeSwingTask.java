/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  kotlin.collections.ArrayDeque
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import gg.squire.templetrekking.tasks.TempletrekkingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.util.List;
import kotlin.collections.ArrayDeque;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Handling rope swing")
public class HandlingRopeSwingTask
extends TempletrekkingTaskBase {
    private final  List<TileObject> aj;

    @Inject
    protected HandlingRopeSwingTask(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[var2[0]];
        nArray[y.var2[1]] = var2[2];
        super(templeTrekkingPlugin, nArray);
        this.aj = new ArrayDeque();
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    private static boolean var4(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var11() {
        var2 = new int[18];
        y.var2[0] = 1;
        y.var2[1] = (0x9A ^ 0x9F) & ~(0x4A ^ 0x4F);
        y.var2[2] = 0x69 ^ 0x60;
        y.var2[3] = 2;
        y.var2[4] = 60 + 121 - 59 + 11 ^ 76 + 87 - 131 + 96;
        y.var2[5] = 3;
        y.var2[6] = 0xBE ^ 0x90 ^ (0x99 ^ 0xBF);
        y.var2[7] = 0x6F ^ 0x6B;
        y.var2[8] = 8 ^ 0xE;
        y.var2[9] = 112 + 43 - 75 + 83 ^ 119 + 148 - 221 + 118;
        y.var2[10] = 0x42 ^ 0x48;
        y.var2[11] = 0xAA ^ 0xA1;
        y.var2[12] = 8 ^ 0x7D ^ (0xD0 ^ 0xA9);
        y.var2[13] = 0x5E ^ 0x37 ^ (0xEF ^ 0x8B);
        y.var2[14] = 0x48 ^ 0x46;
        y.var2[15] = 0x83 ^ 0x8C;
        y.var2[16] = 0xE3 ^ 0x9D ^ (0xF1 ^ 0x9F);
        y.var2[17] = 28 + 101 - 80 + 137 ^ 58 + 170 - 177 + 120;
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static void var14() {
        var1 = new String[var2[17]];
        y.var1[y.var2[1]] = "Hey...that's great...you did a great job...I'll follow you.";
        y.var1[y.var2[0]] = "Well that's torn it... Looks like we can't get over this<br>bog. We'll have to go back to Burgh de Rott.";
        y.var1[y.var2[3]] = "That's amazing! I'll have to do the same.";
        y.var1[y.var2[5]] = "Continue-trek";
        y.var1[y.var2[7]] = "Continue-trek";
        y.var1[y.var2[4]] = "Swing-from";
        y.var1[y.var2[8]] = "Long vine";
        y.var1[y.var2[9]] = "Long vine";
        y.var1[y.var2[6]] = "Swamp tree branch";
        y.var1[y.var2[2]] = "Short vine";
        y.var1[y.var2[10]] = "Short vine";
        y.var1[y.var2[11]] = "Cut-vine";
        y.var1[y.var2[12]] = "Swamp tree";
        y.var1[y.var2[13]] = "Cut-vine";
        y.var1[y.var2[14]] = "Swamp tree branch";
        y.var1[y.var2[15]] = "Swing-from";
        y.var1[y.var2[16]] = "Continue-trek";
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var2[1];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var2[1];
        while (y.var24(var23, var22)) {
            char var25 = var21[var23];
            var18.append((char)(var25 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean var26(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean z() {
        y var27;
        String string;
        if (y.var28(Dialog.isOpen() ? 1 : 0) && y.var29((string = Dialog.getText()).length()) && (!y.var13(string.contains(var1[var2[1]]) ? 1 : 0) || !y.var13(string.contains(var1[var2[0]]) ? 1 : 0) || y.var28(string.contains(var1[var2[3]]) ? 1 : 0))) {
            return var2[1];
        }
        Player var30 = Players.getLocal();
        TileObject var31 = var27.A();
        if (y.var3(var31)) {
            return var2[1];
        }
        if (y.var4(var30.distanceTo((Locatable)var31), var2[4])) {
            var27.aj.clear();
            var31.interact(var1[var2[5]]);
            return var2[0];
        }
        var31 = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[var2[0]];
            stringArray[y.var2[1]] = var1[var2[16]];
            return tileObject.hasAction(stringArray);
        });
        if (y.var12(var31) && y.var4(var31.distanceTo((Locatable)var30), var2[6])) {
            var31.interact(var1[var2[7]]);
            return var2[0];
        }
        TileObject var32 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.var28(tileObject.getName().equals(var1[var2[14]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[0]];
                stringArray[y.var2[1]] = var1[var2[15]];
                if (y.var28(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[0];
                    0;
                    if null == null return n2 != 0;
                    return ((0xF8 ^ 0xB3 ^ (0x69 ^ 0x17)) & (0x73 ^ 0x5D ^ (0x51 ^ 0x4A) ^ -1)) != 0;
                }
            }
            n2 = var2[1];
            return n2 != 0;
        });
        if (y.var12(var32)) {
            var32.interact(var1[var2[4]]);
            return var2[0];
        }
        String[] stringArray = new String[var2[0]];
        stringArray[y.var2[1]] = var1[var2[8]];
        if (y.var28(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[var2[0]];
            stringArray2[y.var2[1]] = var1[var2[9]];
            Item var33 = Inventory.getFirst((String[])stringArray2);
            String[] stringArray3 = new String[var2[0]];
            stringArray3[y.var2[1]] = var1[var2[6]];
            TileObject var34 = TileObjects.getNearest((String[])stringArray3);
            if (y.var12(var33) && y.var12(var34)) {
                var33.useOn(var34);
                return var2[0];
            }
            return var2[1];
        }
        String[] stringArray4 = new String[var2[0]];
        stringArray4[y.var2[1]] = var1[var2[2]];
        if (y.var26(Inventory.getCount((String[])stringArray4), var2[5])) {
            String[] stringArray5 = new String[var2[0]];
            stringArray5[y.var2[1]] = var1[var2[10]];
            List var33 = Inventory.getAll((String[])stringArray5);
            Item var34 = (Item)var33.get(var2[1]);
            Item var35 = (Item)var33.get(var2[0]);
            if (y.var12(var34) && y.var12(var35)) {
                var34.useOn(var35);
                return var2[0];
            }
            return var2[1];
        }
        TileObject var33 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.var28(tileObject.getName().equals(var1[var2[12]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[0]];
                stringArray[y.var2[1]] = var1[var2[13]];
                if (y.var28(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[0];
                    0;
                    if (-(0x4E ^ 0x4A) < 0) return n2 != 0;
                    return ((0x7B ^ 0x59) & ~(0xE6 ^ 0xC4)) != 0;
                }
            }
            n2 = var2[1];
            return n2 != 0;
        });
        if (y.var12(var33)) {
            var33.interact(var1[var2[11]]);
            return var2[0];
        }
        return var2[1];
    }

    static {
        y.var11();
        y.var14();
    }

    private static boolean var28(int n2) {
        return n2 != 0;
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var29(int n2) {
        return n2 > 0;
    }

        catch (Exception var41) {
            var41.printStackTrace();
            return null;
        }
    }
}

