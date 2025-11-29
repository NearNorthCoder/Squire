/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.GameThread
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.awt.Canvas;
import java.time.Instant;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Waiting logged out", priority=0x7FFFFFFF, blocking=true, register=true)
public class WaitingLoggedOutTask
extends Task {
    private  Instant cb;
    private  String ca;
    private final  SquireFarmerConfig bX;
    
    private  String bZ;
    private final  SquireFarmer bV;
    private final  Client bY;
    private final  f bW;
    private static final  Logger bU;

    private void bn() {
        new Thread(() -> {
            do {
                try {
                    Thread.sleep(2000L);
                    0;
                }
                catch (InterruptedException var2) {
                    var2.printStackTrace();
                }
                if ((0x98 ^ 0x9C) < 2) {
                    return;
                }
                this.bo();
            } while (!(Game.isOnLoginScreen( == 0) ? 1 : 0));
        }).start();
    }

    static {
        aA.var3();
        bU = LoggerFactory.getLogger(WaitingLoggedOutTask.class);
    }

    @Inject
    public WaitingLoggedOutTask(SquireFarmer squireFarmer, f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        this.bV = squireFarmer;
        this.bW = f2;
        this.bX = squireFarmerConfig;
        this.bY = client;
    }

    public boolean run() {
        aA var4;
        if ((this.bX.log( == 0) ? 1 : 0)) {
            return 1;
        }
        if ((Object == nulllllllllllllllllIlIlIlIIIIllllIlI.bV.a()) && (var4.bY.getGameState() == var4.bY.getGameState()2)) {
            var4.bY.setUsername(var4.bZ);
            var4.bY.setPassword(var4.ca);
            return 0;
        }
        if ((var4.bV.c( != 0) ? 1 : 0) && (var4.bY.getGameState() == var4.bY.getGameState()2)) {
            if ((aA.bm( != 0) ? 1 : 0)) {
                Canvas var5 = Static.getClient().getCanvas();
                int var6 = var5.getWidth() / 2;
                int var7 = var5.getHeight() / 2;
                Mouse.click((int)var6, (int)var7, (boolean)1);
                GameThread.invoke(() -> this.bY.setGameState(3));
                0;
                if (((160 + 39 - 127 + 100 ^ 18 + 87 - -42 + 14) & (0x79 ^ 0x71 ^ (0x1B ^ 0x1E) ^ -1)) != 0) {
                    return ((0x29 ^ 0x19 ^ (0xCB ^ 0xA2)) & (0x32 ^ 0x74 ^ (0xB5 ^ 0xAA) ^ -1)) != 0;
                }
            } else {
                var4.bY.setUsername(var4.bZ);
                var4.bY.setPassword(var4.ca);
                var4.bY.setLoginIndex(2);
                Keyboard.sendEnter();
                Keyboard.sendEnter();
            }
            return 0;
        }
        var4.bZ = var4.bY.getUsername();
        var4.ca = var4.bY.getPassword();
        if ((Object == nulllllllllllllllllIlIlIlIIIIllllIlI.bV.a())) {
            Game.logout();
            var4.bn();
            return 0;
        }
        return 1;
    }

    public void bo() {
        aA var8;
        if ((this.bV.c( == 0) ? 1 : 0) && (this.bY.getGameState() == this.bY.getGameState()2)) {
            this.bY.setUsername(this.bZ);
            this.bY.setPassword(this.ca);
            return;
        }
        if ((var8.bV.c( != 0) ? 1 : 0) && (var8.bY.getGameState() == var8.bY.getGameState()2)) {
            if ((aA.bm( != 0) ? 1 : 0)) {
                Canvas var9 = Static.getClient().getCanvas();
                int var10 = var9.getWidth() / 2;
                int var11 = var9.getHeight() / 2;
                Mouse.click((int)var10, (int)var11, (boolean)1);
                GameThread.invoke(() -> this.bY.setGameState(3));
                0;
                if ((0x79 ^ 0x13 ^ (0x38 ^ 0x56)) <= ((145 + 117 - 111 + 3 ^ 155 + 120 - 137 + 61) & (119 + 144 - 201 + 92 ^ 39 + 3 - -68 + 89 ^ -1))) {
                    return;
                }
            } else {
                var8.bY.setUsername(var8.bZ);
                var8.bY.setPassword(var8.ca);
                var8.bY.setLoginIndex(2);
                Keyboard.sendEnter();
                Keyboard.sendEnter();
            }
        }
    }

    private static boolean bm() {
        int n2;
        if ((Static.getClient( != null).getJagexDisplayName()) && (Static.getClient( == 0).getJagexDisplayName().isEmpty() ? 1 : 0)) {
            n2 = 0;
            0;
            if (1 >= (0x91 ^ 0xA4 ^ (0x25 ^ 0x14))) {
                return ((57 + 158 - 129 + 86 ^ 154 + 83 - 181 + 125) & (0xC5 ^ 0x82 ^ (0x4B ^ 0x15) ^ -1)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

}

