/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.Squire
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Logging out and stopping", priority=0x7FFFFFFF, blocking=true)
public class LoggingOutAndStoppingTask
extends ck {
    
    private  boolean ia;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    @Inject
    protected LoggingOutAndStoppingTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    @Override
    public boolean bl() {
        if (cm.var3(this.ia)) {
            return var1[0];
        }
        Squire.stop();
        this.aY.forceStop();
        return var1[1];
    }

    private static void var4() {
        var1 = new int[3];
        cm.var1[0] = (0xD7 ^ 0xB4 ^ 3) & (76 + 13 - -59 + 61 ^ 46 + 15 - 0 + 116 ^ -1);
        cm.var1[1] = 1;
        cm.var1[2] = 2;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    static {
        cm.var4();
        cm.var12();
    }

    private static void var12() {
        var2 = new String[var1[1]];
        cm.var2[cm.var1[0]] = "has no charges";
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (cm.var11(chatMessage.getMessage().contains(var2[var1[0]]) ? 1 : 0)) {
            this.ia = var1[1];
        }
    }
}

