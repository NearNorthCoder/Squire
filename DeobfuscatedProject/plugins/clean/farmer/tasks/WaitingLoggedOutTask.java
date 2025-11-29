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

                }
                catch (InterruptedException var1) {
                    var1.printStackTrace();
                }
                if ((0x98 ^ 0x9C) < 2) {
                    return;
                }
                this.bo();
            } while (!aA.llllIlIIIllIII(Game.isOnLoginScreen() ? 1 : 0));
        }).start();
    }

    static {
        aA.llllIlIIIlIllI();
        bU = LoggerFactory.getLogger(WaitingLoggedOutTask.class);
    }

    private static boolean llllIlIIIllIIl(Object object) {
        return object == null;
    }

    @Inject
    public WaitingLoggedOutTask(SquireFarmer squireFarmer, f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        this.bV = squireFarmer;
        this.bW = f2;
        this.bX = squireFarmerConfig;
        this.bY = client;
    }

    private static boolean llllIlIIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean llllIlIIIllIll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        aA var2;
        if (aA.llllIlIIIllIII(this.bX.log() ? 1 : 0)) {
            return llIIIlIIlllI[1];
        }
        if (aA.llllIlIIIllIIl((Object)var2.bV.a()) && aA.llllIlIIIllIlI(var2.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            var2.bY.setUsername(var2.bZ);
            var2.bY.setPassword(var2.ca);
            return llIIIlIIlllI[0];
        }
        if (aA.llllIlIIIllIll(var2.bV.c() ? 1 : 0) && aA.llllIlIIIllIlI(var2.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            if (aA.llllIlIIIllIll(aA.bm() ? 1 : 0)) {
                Canvas var3 = Static.getClient().getCanvas();
                int var4 = var3.getWidth() / llIIIlIIlllI[2];
                int var5 = var3.getHeight() / llIIIlIIlllI[2];
                Mouse.click((int)var4, (int)var5, (boolean)llIIIlIIlllI[1]);
                GameThread.invoke(() -> this.bY.setGameState(llIIIlIIlllI[3]));

                if (((160 + 39 - 127 + 100 ^ 18 + 87 - -42 + 14) & (0x79 ^ 0x71 ^ (0x1B ^ 0x1E) ^ -1)) != 0) {
                    return ((0x29 ^ 0x19 ^ (0xCB ^ 0xA2)) & (0x32 ^ 0x74 ^ (0xB5 ^ 0xAA) ^ -1)) != 0;
                }
            } else {
                var2.bY.setUsername(var2.bZ);
                var2.bY.setPassword(var2.ca);
                var2.bY.setLoginIndex(llIIIlIIlllI[2]);
                Keyboard.sendEnter();
                Keyboard.sendEnter();
            }
            return llIIIlIIlllI[0];
        }
        var2.bZ = var2.bY.getUsername();
        var2.ca = var2.bY.getPassword();
        if (aA.llllIlIIIllIIl((Object)var2.bV.a())) {
            Game.logout();
            var2.bn();
            return llIIIlIIlllI[0];
        }
        return llIIIlIIlllI[1];
    }

    public void bo() {
        aA var6;
        if (aA.llllIlIIIllIII(this.bV.c() ? 1 : 0) && aA.llllIlIIIllIlI(this.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            this.bY.setUsername(this.bZ);
            this.bY.setPassword(this.ca);
            return;
        }
        if (aA.llllIlIIIllIll(var6.bV.c() ? 1 : 0) && aA.llllIlIIIllIlI(var6.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            if (aA.llllIlIIIllIll(aA.bm() ? 1 : 0)) {
                Canvas var7 = Static.getClient().getCanvas();
                int var8 = var7.getWidth() / llIIIlIIlllI[2];
                int var9 = var7.getHeight() / llIIIlIIlllI[2];
                Mouse.click((int)var8, (int)var9, (boolean)llIIIlIIlllI[1]);
                GameThread.invoke(() -> this.bY.setGameState(llIIIlIIlllI[3]));

                if ((0x79 ^ 0x13 ^ (0x38 ^ 0x56)) <= ((145 + 117 - 111 + 3 ^ 155 + 120 - 137 + 61) & (119 + 144 - 201 + 92 ^ 39 + 3 - -68 + 89 ^ -1))) {
                    return;
                }
            } else {
                var6.bY.setUsername(var6.bZ);
                var6.bY.setPassword(var6.ca);
                var6.bY.setLoginIndex(llIIIlIIlllI[2]);
                Keyboard.sendEnter();
                Keyboard.sendEnter();
            }
        }
    }

    private static boolean llllIlIIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean bm() {
        int n2;
        if (aA.llllIlIIIlIlll(Static.getClient().getJagexDisplayName()) && aA.llllIlIIIllIII(Static.getClient().getJagexDisplayName().isEmpty() ? 1 : 0)) {
            n2 = llIIIlIIlllI[0];

            if (1 >= (0x91 ^ 0xA4 ^ (0x25 ^ 0x14))) {
                return ((57 + 158 - 129 + 86 ^ 154 + 83 - 181 + 125) & (0xC5 ^ 0x82 ^ (0x4B ^ 0x15) ^ -1)) != 0;
            }
        } else {
            n2 = llIIIlIIlllI[1];
        }
        return n2 != 0;
    }

    private static boolean llllIlIIIlIlll(Object object) {
        return object != null;
    }
}

