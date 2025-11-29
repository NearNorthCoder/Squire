/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.PlayerSpawned
 *  net.runelite.client.Notifier
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.log.RelogConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.HashSet;
import java.util.Set;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.client.Notifier;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Notifying for player", register=true)
public class NotifyingForPlayerTask
extends Task {
    private final  RelogConfig eb;
    private static  int[] lllIlIIIl;
    private static  String[] lllIlIIII;
    private final  Notifier ea;
    private final  Set<String> dZ;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(PlayerSpawned playerSpawned) {
        void var2_2;
        void var1;
        aE var2;
        if ((playerSpawned.getPlayer() == playerSpawned.getPlayer()2))) {
            return;
        }
        if ((var2.eb.notifyPlayer( == 0) ? 1 : 0)) {
            return;
        }
        String var3 = var1.getPlayer().getName();
        if ((var2.dZ.containslIlIlIlIlIIlIll)) {
            return;
        }
        this.dZ.add((String)var2_2);
        0;
        this.ea.notify(lllIlIIII[0]);
    }

    public boolean run() {
        return 0;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = 0;
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = 0;
        while (var12 < var11) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var7);
    }

    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if ((gameStateChanged.getGameState() != gameStateChanged.getGameState()2)) {
            this.dZ.clear();
        }
    }

    @Inject
    public NotifyingForPlayerTask(Notifier notifier, RelogConfig relogConfig) {
        this.dZ = new HashSet<String>();
        this.ea = notifier;
        this.eb = relogConfig;
    }

}

