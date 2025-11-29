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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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

/* TASK: Restoring in POH -> RestoringinpohTask */
@TaskDesc(name="Restoring in POH", priority=1100, blocking=true)
public class J
extends Task {
    private static /* synthetic */ int[] llllIllIllll;
    private static /* synthetic */ String[] llllIllIllIl;
    private final /* synthetic */ SquireNightmareConfig dh;
    private final /* synthetic */ SquireNightmarePlugin dg;
    private static final /* synthetic */ Logger df;

    public boolean run() {
        J var3;
        if (J.lIIlIIIlllIIIIl(this.dg.ae() ? 1 : 0)) {
            return llllIllIllll[0];
        }
        if (J.lIIlIIIlllIIIlI(var3.dh.restoreInPOH() ? 1 : 0)) {
            return llllIllIllll[0];
        }
        if (J.lIIlIIIlllIIIll(Game.getState(), GameState.LOGGED_IN)) {
            return llllIllIllll[0];
        }
        NPC var6 = SquireNightmarePlugin.d();
        if (J.lIIlIIIlllIIlII(var6)) {
            return llllIllIllll[0];
        }
        if (J.lIIlIIIlllIIIlI(House.isPoolDrinkUseful() ? 1 : 0)) {
            if (J.lIIlIIIlllIIIIl(var3.dg.l() ? 1 : 0)) {
                df.info(llllIllIllIl[llllIllIllll[0]]);
                var3.dg.m();
                0;
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

    private static String lIIlIIIllIlllIl(String var2, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llllIllIllll[2], var4);
            return new String(var1.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIlllIIIII() {
        llllIllIllll = new int[3];
        J.llllIllIllll[0] = (0xCB ^ 0xA8 ^ (0x38 ^ 0x56)) & (108 + 11 - 79 + 106 ^ 80 + 39 - 60 + 100 ^ -1);
        J.llllIllIllll[1] = 1;
        J.llllIllIllll[2] = 2;
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
        df = LoggerFactory.getLogger(J.class);
    }

    private static boolean lIIlIIIlllIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public J(SquireNightmarePlugin squireNightmarePlugin, SquireNightmareConfig squireNightmareConfig) {
        this.dg = squireNightmarePlugin;
        this.dh = squireNightmareConfig;
    }

    private static void lIIlIIIllIllllI() {
        llllIllIllIl = new String[llllIllIllll[1]];
        J.llllIllIllIl[J.llllIllIllll[0]] = J."[RestoreInPOH]: Leaving POH, pool not useful";
    }
}

