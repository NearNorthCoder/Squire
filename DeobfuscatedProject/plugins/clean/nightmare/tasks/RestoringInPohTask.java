/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.NPC
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Restoring in POH", priority=1100, blocking=true)
public class RestoringInPohTask
extends Task {

    private final  SquireNightmareConfig dh;
    private final  SquireNightmarePlugin dg;
    private static final  Logger df;

    public boolean run() {
        J var1;
        if (J.lIIlIIIlllIIIIl(this.dg.ae() ? 1 : 0)) {
            return llllIllIllll[0];
        }
        if (J.lIIlIIIlllIIIlI(var1.dh.restoreInPOH() ? 1 : 0)) {
            return llllIllIllll[0];
        }
        if (J.lIIlIIIlllIIIll(Game.getState(), GameState.LOGGED_IN)) {
            return llllIllIllll[0];
        }
        NPC var2 = SquireNightmarePlugin.d();
        if (J.lIIlIIIlllIIlII(var2)) {
            return llllIllIllll[0];
        }
        if (J.lIIlIIIlllIIIlI(House.isPoolDrinkUseful() ? 1 : 0)) {
            if (J.lIIlIIIlllIIIIl(var1.dg.l() ? 1 : 0)) {
                df.info(llllIllIllIl[llllIllIllll[0]]);
                var1.dg.m();

                return llllIllIllll[1];
            }
            return llllIllIllll[0];
        }
        if (J.lIIlIIIlllIIIlI(Movement.shouldWalk() ? 1 : 0)) {
            return llllIllIllll[0];
        }
        if (J.lIIlIIIlllIIIIl(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return llllIllIllll[1];
        }
        return House.drinkFromPool();
    }

    private static boolean lIIlIIIlllIIlII(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIlllIIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIIlllIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        J.lIIlIIIlllIIIII();
        J.lIIlIIIllIllllI();
        df = LoggerFactory.getLogger(RestoringInPohTask.class);
    }

    private static boolean lIIlIIIlllIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public RestoringInPohTask(SquireNightmarePlugin squireNightmarePlugin, SquireNightmareConfig squireNightmareConfig) {
        this.dg = squireNightmarePlugin;
        this.dh = squireNightmareConfig;
    }

    private static void lIIlIIIllIllllI() {
        llllIllIllIl = new String[llllIllIllll[1]];
        J.llllIllIllIl[J.llllIllIllll[0]] = "[RestoreInPOH]: Leaving POH, pool not useful";
    }
}

