/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum8;
import gg.squire.wintertodt.tasks.BHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Burning at brazier", register=true)
public class BurningAtBrazierTask
extends Task {
    private static final  int H;
    
    private static final  int G;
    private final  b I;
    
    private final  SquireWintertodtConfig J;
    private  int K;

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!g.llIIIIlIllIIlIl(string.contains(lIlIllllIIlII[lIlIllllIIlIl[6]]) ? 1 : 0) || g.llIIIIlIllIIIll(string.contains(lIlIllllIIlII[lIlIllllIIlIl[5]]) ? 1 : 0)) {
            var1.K = lIlIllllIIlIl[0];
        }
    }

    @Inject
    public BurningAtBrazierTask(SquireWintertodtConfig squireWintertodtConfig, b b2) {
        this.K = lIlIllllIIlIl[0];
        this.J = squireWintertodtConfig;
        this.I = b2;
    }

    private static boolean llIIIIlIllIIlIl(int n2) {
        return n2 == 0;
    }

    private static void llIIIIlIllIIIII() {
        lIlIllllIIlII = new String[lIlIllllIIlIl[9]];
        g.lIlIllllIIlII[g.lIlIllllIIlIl[0]] = "Feed";
        g.lIlIllllIIlII[g.lIlIllllIIlIl[1]] = "Feed";
        g.lIlIllllIIlII[g.lIlIllllIIlIl[6]] = "seeps into your bones";
        g.lIlIllllIIlII[g.lIlIllllIIlIl[5]] = "Congratulations";
        g.lIlIllllIIlII[g.lIlIllllIIlIl[7]] = "brazier";
        g.lIlIllllIIlII[g.lIlIllllIIlIl[8]] = "Feed";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        g var2;
        if (!g.llIIIIlIllIIIll(this.I.i() ? 1 : 0) || !g.llIIIIlIllIIlIl(this.I.u() ? 1 : 0) || g.llIIIIlIllIIIll(this.I.j() ? 1 : 0)) {
            return lIlIllllIIlIl[0];
        }
        Player var3 = Players.getLocal();
        a var4 = var2.I.q();
        TileObject var5 = TileObjects.getNearest((WorldPoint)var4.b(), tileObject -> {
            int n2;
            if (g.llIIIIlIllIIllI(tileObject.getName()) && g.llIIIIlIllIIIll(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIlIllllIIlII[lIlIllllIIlIl[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllllIIlIl[1]];
                stringArray[g.lIlIllllIIlIl[0]] = lIlIllllIIlII[lIlIllllIIlIl[8]];
                if (g.llIIIIlIllIIIll(tileObject.hasAction(stringArray) ? 1 : 0) && g.llIIIIlIllIlIIl(var4.b().distanceTo((Locatable)tileObject), lIlIllllIIlIl[5])) {
                    n2 = lIlIllllIIlIl[1];

                    if ((0x57 ^ 0x53) >= (0x51 ^ 0x55)) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIllllIIlIl[0];
            return n2 != 0;
        });
        if (!g.llIIIIlIllIIllI(var5) || g.llIIIIlIllIIIll(var3.isMoving() ? 1 : 0)) {
            return lIlIllllIIlIl[0];
        }
        GameObject var6 = (GameObject)var5;
        if (g.llIIIIlIllIIlIl(var6.getWorldArea().isInMeleeDistance(var3.getWorldLocation()) ? 1 : 0)) {
            Movement.walk((WorldPoint)var4.b());
            return lIlIllllIIlIl[1];
        }
        if (g.llIIIIlIllIIlll(Players.getLocal().getAnimation(), lIlIllllIIlIl[2])) {
            int[] nArray = new int[lIlIllllIIlIl[1]];
            nArray[g.lIlIllllIIlIl[0]] = lIlIllllIIlIl[3];
            if (g.llIIIIlIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlIllllIIlIl[0];
            }
        }
        String[] stringArray = new String[lIlIllllIIlIl[1]];
        stringArray[g.lIlIllllIIlIl[0]] = lIlIllllIIlII[lIlIllllIIlIl[0]];
        if (!g.llIIIIlIllIIIll(var6.hasAction(stringArray) ? 1 : 0) || g.llIIIIlIllIIlll(Players.getLocal().getAnimation(), lIlIllllIIlIl[4])) {
            var2.K = lIlIllllIIlIl[5];
            return lIlIllllIIlIl[0];
        }
        if (g.llIIIIlIllIlIII(var2.K)) {
            var2.K -= lIlIllllIIlIl[1];
            return lIlIllllIIlIl[1];
        }
        var4_4.interact(lIlIllllIIlII[lIlIllllIIlIl[1]]);
        return lIlIllllIIlIl[1];
    }

    private static boolean llIIIIlIllIIllI(Object object) {
        return object != null;
    }

    private static boolean llIIIIlIllIlIII(int n2) {
        return n2 > 0;
    }

    static {
        g.llIIIIlIllIIIlI();
        g.llIIIIlIllIIIII();
        G = lIlIllllIIlIl[4];
        H = lIlIllllIIlIl[2];
    }

    private static boolean llIIIIlIllIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIlIllIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIlIllIIIll(int n2) {
        return n2 != 0;
    }
}

