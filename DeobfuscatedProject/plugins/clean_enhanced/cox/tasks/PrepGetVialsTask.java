/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prep Get Vials", priority=21001, blocking=true)
public class PrepGetVialsTask
extends CoxManager {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 2;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 2;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_4;
        bc var19;
        int n2 = this.ef();
        if ((n2 > this.ed())) {
            void var20;
            int n3 = 0;
            int[] nArray = new int[1];
            nArray[2] = 3;
            List list = Inventory.getAll((int[])nArray);
            int var21 = 2;
            while ((var21 < var20.size())) {
                void var22;
                if (((int <= 0)var22)) {
                    0;
                    if (2 != ((202 + 111 - 135 + 33 ^ 97 + 27 - 65 + 69) & (0x5F ^ 0x12 ^ (0xB9 ^ 0xA7) ^ -1))) break;
                    return ((0x12 ^ 0x64 ^ (0x69 ^ 0x5A)) & (126 + 172 - 240 + 135 ^ 24 + 81 - -18 + 9 ^ -1)) != 0;
                }
                if ((var21 >= var19.ed())) {
                    ((Item)var20.get(var21)).drop();
                    --var22;
                }
                ++var21;
                0;
                if (((0xDC ^ 0x93) & ~(0xCF ^ 0x80)) == 0) continue;
                return ((0x6B ^ 0x53) & ~(0xA1 ^ 0x99)) != 0;
            }
            return 1;
        }
        if ((var19.eh() >= var19.ed())) {
            return 2;
        }
        if ((var19.ef( > 0))) {
            TileObject var22 = TileObjects.getNearest(tileObject -> {
                int n2;
                if ((tileObject.getName( != 0).contains(var1[8]) ? 1 : 0)) {
                    String[] stringArray = new String[1];
                    stringArray[2] = var1[9];
                    if ((tileObject.hasActionstringArray)) {
                        n2 = 1;
                        0;
                        if (2 > 1) return n2 != 0;
                        return ((0xE ^ 0x1A) & ~(0x75 ^ 0x61)) != 0;
                    }
                }
                n2 = 2;
                return n2 != 0;
            });
            if var22 == null {
                System.out.println(var1[2]);
                return 2;
            }
            if (!(var19.bS.isAnimating( == 0) ? 1 : 0) || (var19.bS.isMoving( != 0) ? 1 : 0)) {
                System.out.println(var1[1]);
                return 1;
            }
            var22.interact(var1[4]);
            var19.sleep(4);
            return 1;
        }
        TileObject var22 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var1[0]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[2] = var1[7];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (-(0xB2 ^ 0xB6) < 0) return n2 != 0;
                    return ((0x25 ^ 0x7F) & ~(0xD6 ^ 0x8C)) != 0;
                }
            }
            n2 = 2;
            return n2 != 0;
        });
        if var22 == null {
            return 2;
        }
        if (!(var19.bS.isAnimating( == 0) ? 1 : 0) || (var19.bS.isMoving( != 0) ? 1 : 0)) {
            System.out.println(var1[5]);
            return 1;
        }
        var2_4.interact(var1[6]);
        return 1;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    @Inject
    protected PrepGetVialsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

}

