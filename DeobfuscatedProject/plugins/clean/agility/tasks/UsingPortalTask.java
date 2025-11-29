/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.agility.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import gg.squire.agility.tasks.GameEnum;

@TaskDesc(name="Using Portal", priority=100, blocking=true)
public class UsingPortalTask
extends Task {

    private final  AgilityConfig v;

    private static boolean lIIlIlIlIIlIII(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public UsingPortalTask(AgilityConfig agilityConfig) {
        this.v = agilityConfig;
    }

    private static boolean lIIlIlIlIIllII(int n) {
        return n == 0;
    }

    private static boolean lIIlIlIlIIlIll(Object object) {
        return object == null;
    }

    static {
        g.lIIlIlIlIIIlll();
        g.lIIlIlIlIIIIll();
    }

    private static boolean lIIlIlIlIIlIlI(int n) {
        return n != 0;
    }

    private static void lIIlIlIlIIIIll() {
        lIllIIIIllI = new String[lIllIIIlIII[3]];
        g.lIllIIIIllI[g.lIllIIIlIII[0]] = "Travel";
        g.lIllIIIIllI[g.lIllIIIlIII[1]] = "Portal";
        g.lIllIIIIllI[g.lIllIIIlIII[2]] = "Travel";
    }

    private static boolean lIIlIlIlIIlIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (g.lIIlIlIlIIlIII((Object)this.v.course(), (Object)b.PRIFDDINAS)) {
            return lIllIIIlIII[0];
        }
        Player var1 = Players.getLocal();
        if (!g.lIIlIlIlIIlIIl(var1) || g.lIIlIlIlIIlIlI(var1.isAnimating() ? 1 : 0)) {
            return lIllIIIlIII[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n;
            if (g.lIIlIlIlIIlIlI(tileObject.getName().equals(lIllIIIIllI[lIllIIIlIII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIlIII[1]];
                stringArray[g.lIllIIIlIII[0]] = lIllIIIIllI[lIllIIIlIII[2]];
                if (g.lIIlIlIlIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIllIIIlIII[1];

                    if ((0xF3 ^ 0x86 ^ (0xF7 ^ 0x86)) >= ((73 + 7 - 47 + 94 ^ (0x11 ^ 0x21)) & (0x1F ^ 0x10 ^ (0xC6 ^ 0x86) ^ -1))) return n != 0;
                    return ((0x36 ^ 0x23 ^ (0x67 ^ 0x62)) & (0xF1 ^ 0xB4 ^ (0x31 ^ 0x64) ^ -1)) != 0;
                }
            }
            n = lIllIIIlIII[0];
            return n != 0;
        });
        if (g.lIIlIlIlIIlIll(var2)) {
            return lIllIIIlIII[0];
        }
        if (g.lIIlIlIlIIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIIIlIII[1];
        }
        var2_2.interact(lIllIIIIllI[lIllIIIlIII[0]]);
        return lIllIIIlIII[1];
    }
}

