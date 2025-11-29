/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.sepulchre.tasks;

import com.google.inject.Inject;
import gg.squire.sepulchre.tasks.JHelper;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Enter Sepulchre", priority=25, blocking=true)
public class EnterSepulchreTask
extends Task {
    private  TileObject ap;
    
    private  J aq;
    private final  SquireSepulchre am;
    private final  SquireSepulchreConfig an;
    
    private  Player ai;
    private final  d ao;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Inject
    public EnterSepulchreTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.an = squireSepulchreConfig;
        this.am = squireSepulchre;
        this.ao = d2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileObject var5;
        P var6;
        void var7;
        Player player = Players.getLocal();
        if (P.var8(player)) {
            return var2[0];
        }
        if (P.var3(b.B.contains((Locatable)var7) ? 1 : 0)) {
            return var2[0];
        }
        if (P.var3(var6.am.j().matchesInventory() ? 1 : 0)) {
            return var2[0];
        }
        if (P.var4(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)var2[0]);
        }
        if (P.var8(var5 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[var2[1]];
            stringArray[P.var2[0]] = var1[var2[1]];
            if (P.var4(tileObject.hasAction(stringArray) ? 1 : 0) && P.var4(tileObject.getName().startsWith(var1[var2[2]]) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (-1 >= 3) {
                    return ((0x2B ^ 0x20) & ~(0x9C ^ 0x97)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }))) {
            return var2[0];
        }
        var2_2.interact(var1[var2[0]]);
        return var2[1];
    }

    static {
        P.var9();
        P.var10();
    }

    private static void var10() {
        var1 = new String[var2[3]];
        P.var1[P.var2[0]] = "Climb-down";
        P.var1[P.var2[1]] = "Climb-down";
        P.var1[P.var2[2]] = "Stairs";
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[0];
        while (P.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (((0x52 ^ 0x18 ^ (0x1F ^ 0x72)) & (0x6D ^ 0x5A ^ (0x96 ^ 0x86) ^ -1)) != 1) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    private static void var9() {
        var2 = new int[4];
        P.var2[0] = (0x77 ^ 0x66) & ~(0xA8 ^ 0xB9);
        P.var2[1] = 1;
        P.var2[2] = 2;
        P.var2[3] = 3;
    }

    private static boolean var8(Object object) {
        return object == null;
    }
}

