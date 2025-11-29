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
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
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
public class aA
extends Task {
    private /* synthetic */ Instant cb;
    private /* synthetic */ String ca;
    private final /* synthetic */ SquireFarmerConfig bX;
    private static /* synthetic */ int[] llIIIlIIlllI;
    private /* synthetic */ String bZ;
    private final /* synthetic */ SquireFarmer bV;
    private final /* synthetic */ Client bY;
    private final /* synthetic */ f bW;
    private static final /* synthetic */ Logger bU;

    private void bn() {
        new Thread(() -> {
            do {
                try {
                    Thread.sleep(2000L);
                    "".length();
                }
                catch (InterruptedException lllllllllllllllIlIlIlIIIIllIlIll) {
                    lllllllllllllllIlIlIlIIIIllIlIll.printStackTrace();
                }
                if ((0x98 ^ 0x9C) < "  ".length()) {
                    return;
                }
                this.bo();
            } while (!aA.llllIlIIIllIII(Game.isOnLoginScreen() ? 1 : 0));
        }).start();
    }

    static {
        aA.llllIlIIIlIllI();
        bU = LoggerFactory.getLogger(aA.class);
    }

    private static boolean llllIlIIIllIIl(Object object) {
        return object == null;
    }

    @Inject
    public aA(SquireFarmer squireFarmer, f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
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
        aA lllllllllllllllIlIlIlIIIIllllIlI;
        if (aA.llllIlIIIllIII(this.bX.log() ? 1 : 0)) {
            return llIIIlIIlllI[1];
        }
        if (aA.llllIlIIIllIIl((Object)lllllllllllllllIlIlIlIIIIllllIlI.bV.a()) && aA.llllIlIIIllIlI(lllllllllllllllIlIlIlIIIIllllIlI.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            lllllllllllllllIlIlIlIIIIllllIlI.bY.setUsername(lllllllllllllllIlIlIlIIIIllllIlI.bZ);
            lllllllllllllllIlIlIlIIIIllllIlI.bY.setPassword(lllllllllllllllIlIlIlIIIIllllIlI.ca);
            return llIIIlIIlllI[0];
        }
        if (aA.llllIlIIIllIll(lllllllllllllllIlIlIlIIIIllllIlI.bV.c() ? 1 : 0) && aA.llllIlIIIllIlI(lllllllllllllllIlIlIlIIIIllllIlI.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            if (aA.llllIlIIIllIll(aA.bm() ? 1 : 0)) {
                Canvas lllllllllllllllIlIlIlIIIIllllIIl = Static.getClient().getCanvas();
                int lllllllllllllllIlIlIlIIIIllllIII = lllllllllllllllIlIlIlIIIIllllIIl.getWidth() / llIIIlIIlllI[2];
                int lllllllllllllllIlIlIlIIIIlllIlll = lllllllllllllllIlIlIlIIIIllllIIl.getHeight() / llIIIlIIlllI[2];
                Mouse.click((int)lllllllllllllllIlIlIlIIIIllllIII, (int)lllllllllllllllIlIlIlIIIIlllIlll, (boolean)llIIIlIIlllI[1]);
                GameThread.invoke(() -> this.bY.setGameState(llIIIlIIlllI[3]));
                "".length();
                if (((160 + 39 - 127 + 100 ^ 18 + 87 - -42 + 14) & (0x79 ^ 0x71 ^ (0x1B ^ 0x1E) ^ -" ".length())) != 0) {
                    return ((0x29 ^ 0x19 ^ (0xCB ^ 0xA2)) & (0x32 ^ 0x74 ^ (0xB5 ^ 0xAA) ^ -" ".length())) != 0;
                }
            } else {
                lllllllllllllllIlIlIlIIIIllllIlI.bY.setUsername(lllllllllllllllIlIlIlIIIIllllIlI.bZ);
                lllllllllllllllIlIlIlIIIIllllIlI.bY.setPassword(lllllllllllllllIlIlIlIIIIllllIlI.ca);
                lllllllllllllllIlIlIlIIIIllllIlI.bY.setLoginIndex(llIIIlIIlllI[2]);
                Keyboard.sendEnter();
                Keyboard.sendEnter();
            }
            return llIIIlIIlllI[0];
        }
        lllllllllllllllIlIlIlIIIIllllIlI.bZ = lllllllllllllllIlIlIlIIIIllllIlI.bY.getUsername();
        lllllllllllllllIlIlIlIIIIllllIlI.ca = lllllllllllllllIlIlIlIIIIllllIlI.bY.getPassword();
        if (aA.llllIlIIIllIIl((Object)lllllllllllllllIlIlIlIIIIllllIlI.bV.a())) {
            Game.logout();
            lllllllllllllllIlIlIlIIIIllllIlI.bn();
            return llIIIlIIlllI[0];
        }
        return llIIIlIIlllI[1];
    }

    private static void llllIlIIIlIllI() {
        llIIIlIIlllI = new int[4];
        aA.llIIIlIIlllI[0] = " ".length();
        aA.llIIIlIIlllI[1] = (0xE1 ^ 0xC2 ^ (0xD8 ^ 0xB5)) & (0xE ^ 0x26 ^ (0x16 ^ 0x70) ^ -" ".length());
        aA.llIIIlIIlllI[2] = "  ".length();
        aA.llIIIlIIlllI[3] = 0xF0 ^ 0xC3 ^ (0x72 ^ 0x55);
    }

    public void bo() {
        aA lllllllllllllllIlIlIlIIIIlllIIlI;
        if (aA.llllIlIIIllIII(this.bV.c() ? 1 : 0) && aA.llllIlIIIllIlI(this.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            this.bY.setUsername(this.bZ);
            this.bY.setPassword(this.ca);
            return;
        }
        if (aA.llllIlIIIllIll(lllllllllllllllIlIlIlIIIIlllIIlI.bV.c() ? 1 : 0) && aA.llllIlIIIllIlI(lllllllllllllllIlIlIlIIIIlllIIlI.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            if (aA.llllIlIIIllIll(aA.bm() ? 1 : 0)) {
                Canvas lllllllllllllllIlIlIlIIIIlllIIIl = Static.getClient().getCanvas();
                int lllllllllllllllIlIlIlIIIIlllIIII = lllllllllllllllIlIlIlIIIIlllIIIl.getWidth() / llIIIlIIlllI[2];
                int lllllllllllllllIlIlIlIIIIllIllll = lllllllllllllllIlIlIlIIIIlllIIIl.getHeight() / llIIIlIIlllI[2];
                Mouse.click((int)lllllllllllllllIlIlIlIIIIlllIIII, (int)lllllllllllllllIlIlIlIIIIllIllll, (boolean)llIIIlIIlllI[1]);
                GameThread.invoke(() -> this.bY.setGameState(llIIIlIIlllI[3]));
                "".length();
                if ((0x79 ^ 0x13 ^ (0x38 ^ 0x56)) <= ((145 + 117 - 111 + 3 ^ 155 + 120 - 137 + 61) & (119 + 144 - 201 + 92 ^ 39 + 3 - -68 + 89 ^ -" ".length()))) {
                    return;
                }
            } else {
                lllllllllllllllIlIlIlIIIIlllIIlI.bY.setUsername(lllllllllllllllIlIlIlIIIIlllIIlI.bZ);
                lllllllllllllllIlIlIlIIIIlllIIlI.bY.setPassword(lllllllllllllllIlIlIlIIIIlllIIlI.ca);
                lllllllllllllllIlIlIlIIIIlllIIlI.bY.setLoginIndex(llIIIlIIlllI[2]);
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
            "".length();
            if (" ".length() >= (0x91 ^ 0xA4 ^ (0x25 ^ 0x14))) {
                return ((57 + 158 - 129 + 86 ^ 154 + 83 - 181 + 125) & (0xC5 ^ 0x82 ^ (0x4B ^ 0x15) ^ -" ".length())) != 0;
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

