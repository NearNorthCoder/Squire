/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Collect Poison", priority=200, blocking=true)
public class CollectPoisonTask
extends Task {
    final  a bg;
    final  SquireDukeSucellus bf;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        D var9;
        if (!(this.bg.y() < 0) || !(this.bg.x() >= 0) || !(this.bg.w() >= 0) || (this.bg.v() < 0)) {
            return 1;
        }
        TileObject var10 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[3]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var1[4];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if ((0x6F ^ 0x3C ^ (0xF0 ^ 0xA7)) >= 0) return n2 != 0;
                    return (2 & (2 ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if var10 == null {
            return 1;
        }
        int var11 = var9.bg.y();
        TileObject var12 = TileObjects.getNearest(tileObject2 -> {
            boolean bl;
            void var13;
            void var14;
            int var15;
            String[] stringArray = new String[2];
            stringArray[1] = var1[2];
            if (!(tileObject2.hasActionstringArray) || (tileObject2.getName( == 0).equals(var1[0]) ? 1 : 0)) {
                return 1;
            }
            if (var15 == 0) {
                boolean bl2;
                if ((var14.getWorldX() > var13.getWorldX())) {
                    bl2 = 2;
                    0;
                    if (((0xD5 ^ 0xB5) & ~(0xDB ^ 0xBB)) < 0) {
                        return (1 & ~1) != 0;
                    }
                } else {
                    bl2 = 1;
                }
                return bl2;
            }
            if ((var14.getWorldX() < var13.getWorldX())) {
                bl = 2;
                0;
                if (2 <= 0) {
                    return ((0x28 ^ 0x7A) & ~(0x29 ^ 0x7B)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
        if var12 == null {
            return 1;
        }
        var3_3.interact(var1[1]);
        return 2;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = 1;
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = 1;
        while (var24 < var23) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var19);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    @Inject
    public CollectPoisonTask(SquireDukeSucellus squireDukeSucellus) {
        this.bf = squireDukeSucellus;
        this.bg = squireDukeSucellus.s();
    }

}

