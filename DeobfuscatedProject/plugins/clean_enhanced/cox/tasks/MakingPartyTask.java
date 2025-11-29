/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Making party", priority=2147483547, blocking=true)
public class MakingPartyTask
extends CoxTask {
    
    private final  SquireChambersPlugin dy;
    private final  SquireChambersConfig dz;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            
            return null;
        }
        return String.valueOf(var18);
    }

    @Inject
    public MakingPartyTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dy = squireChambersPlugin;
        this.dz = squireChambersConfig;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        ay var25;
        if ((c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bn( != 0) ? 1 : 0)) {
            return 0;
        }
        Widget var26 = Widgets.get((int)1, widget -> {
            String[] stringArray = new String[2];
            stringArray[0] = var1[7];
            return widget.hasAction(stringArray);
        });
        if var26 != null {
            var26.interact(var1[0]);
            return 0;
        }
        TileObjects.getNearest((WorldPoint)var25.cy, tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[5]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var1[6];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (((0xBD ^ 0xB9) & ~(0x4F ^ 0x4B)) < 2) return n2 != 0;
                    return ((0xAC ^ 0x81) & ~(0x73 ^ 0x5E)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        0;
        TileObject var27 = TileObjects.getNearest((WorldPoint)var25.cy, tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[3]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var1[4];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (3 != 0) return n2 != 0;
                    return ((0x2D ^ 0xA) & ~(2 ^ 0x25)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var27 == null {
            return 0;
        }
        var2_2.interact(var1[2]);
        return 2;
    }
}

