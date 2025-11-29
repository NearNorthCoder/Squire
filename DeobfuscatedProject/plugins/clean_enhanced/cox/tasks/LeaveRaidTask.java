/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.GameEnum7;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Leave Raid", priority=0x7FFFFF99, blocking=true)
public class LeaveRaidTask
extends CoxTaskBase {

    private final  SquireChambersPlugin dw;
    private final  SquireChambersConfig dx;

    @Inject
    public LeaveRaidTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dw = squireChambersPlugin;
        this.dx = squireChambersConfig;
    }

    @Override
    public boolean run() {
        if (((Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bh() != (Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bh()2)w.GET_OUT)) {
            return 0;
        }
        return this.cg();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        if ((this.dw.G( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0) && (Dialog.hasOption(StringlIlIlIIllllI[0]) ? 1 : 0)) {
            String[] stringArray = new String[1];
            stringArray[0] = var1[1];
            Dialog.chooseOption((String[])stringArray);
            0;
            return 1;
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[4]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[5];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if ((0xF4 ^ 0x91 ^ (0x57 ^ 0x36)) > 0) return n2 != 0;
                    return ((0x2F ^ 0x22 ^ (0xEF ^ 0xB2)) & (0x43 ^ 0x6F ^ (0x70 ^ 0xC) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var3 == null {
            System.out.println(var1[2]);
            return 0;
        }
        var1_1.interact(var1[3]);
        return 1;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = 0;
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = 0;
        while (var24 < var23) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (-1 != 3) continue;
            return null;
        }
        return String.valueOf(var19);
    }
}

