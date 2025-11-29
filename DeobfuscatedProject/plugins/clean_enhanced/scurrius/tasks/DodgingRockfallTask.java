/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import gg.squire.scurrius.tasks.ScurriusManager;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Dodging Rockfall", priority=5000, blocking=true)
public class DodgingRockfallTask
extends ScurriusManager {
    
    private  boolean Y;

    @Inject
    protected DodgingRockfallTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
        this.Y = var1[0];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a() {
        void var1_1;
        n var2;
        if (n.var3(this.a(this.e.getWorldLocation()) ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var4 = var2.a(var1[1]);
        if (n.var5(var4)) {
            var2.a(var1[0]);
            0;
        }
        if (n.var5(var4)) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var1_1);
        return var1[1];
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    static {
        n.var6();
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var6() {
        var1 = new int[2];
        n.var1[0] = (0xEC ^ 0xAA) & ~(3 ^ 0x45);
        n.var1[1] = 1;
    }
}

