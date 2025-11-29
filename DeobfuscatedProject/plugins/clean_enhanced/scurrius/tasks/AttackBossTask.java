/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import gg.squire.scurrius.tasks.ScurriusManager;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Attack Boss", priority=4000, blocking=true)
public class AttackBossTask
extends ScurriusManager {
    private  List<Widget> X;
    
    private static  int W;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean a() {
        m var4;
        int var5;
        int n2;
        Actor actor = Players.getLocal().getInteracting();
        if (m.var6(actor) && m.var7(actor.hasAction(var1[var2[0]]::equals) ? 1 : 0)) {
            n2 = var2[1];
            0;
            if null != null {
                return ((3 ^ 0x2D) & ~(0x74 ^ 0x5A)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        if (m.var7(var5 = n2)) {
            return var2[0];
        }
        if (m.var7(var4.f.isDead() ? 1 : 0)) {
            return var2[0];
        }
        this.f.interact(var1[var2[1]]);
        return var2[1];
    }

    private static void var8() {
        var2 = new int[5];
        m.var2[0] = (0x26 ^ 0x69) & ~(0x7A ^ 0x35);
        m.var2[1] = 1;
        m.var2[2] = -(0xFFFFD3DD & 0x7CF7) & (0xFFFFF6DF & 0x34159FF);
        m.var2[3] = 2;
        m.var2[4] = 0x50 ^ 0x58;
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    static {
        m.var8();
        m.var9();
        W = var2[2];
    }

    @Inject
    protected AttackBossTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
        this.X = new ArrayList<Widget>();
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new String[var2[3]];
        m.var1[m.var2[0]] = "Attack";
        m.var1[m.var2[1]] = "Attack";
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var2[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var2[0];
        while (m.var3(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (-(54 + 123 - 20 + 26 ^ 137 + 66 - 176 + 152) <= 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }
}

