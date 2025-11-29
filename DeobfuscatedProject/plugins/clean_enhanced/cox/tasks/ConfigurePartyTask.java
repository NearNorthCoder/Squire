/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Configure Party", priority=0x7FFFFF99, blocking=true)
public class ConfigurePartyTask
extends CoxTask {
    private final  SquireChambersConfig du;
    
    private final  SquireChambersPlugin dt;

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

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        if ((c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bn( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Bank.isPinWindowOpen( != 0) ? 1 : 0)) {
            System.out.println(var1[0]);
            return 1;
        }
        if ((Dialog.canContinue( != 0) ? 1 : 0)) {
            Dialog.continueSpace();
            return 1;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0) && (Dialog.hasOption(StringlIIlllllllII[1]) ? 1 : 0)) {
            Game.logout();
            return 1;
        }
        TileObject var15 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[3]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[4];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if ((0xFB ^ 0x93 ^ (0xCA ^ 0xA6)) != 3) return n2 != 0;
                    return ((105 + 39 - 70 + 60 ^ 68 + 123 - 183 + 128) & (9 ^ 0x1F ^ (0x73 ^ 0x6B) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var15 == null {
            return 0;
        }
        if ((Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            return 0;
        }
        var1_1.interact(var1[2]);
        return 1;
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
            if null == null continue;
            return null;
        }
        return String.valueOf(var19);
    }

    @Inject
    public ConfigurePartyTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dt = squireChambersPlugin;
        this.du = squireChambersConfig;
    }
}

