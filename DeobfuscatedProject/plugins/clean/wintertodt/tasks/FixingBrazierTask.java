/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum8;
import gg.squire.wintertodt.tasks.BHelper;
import com.google.inject.Inject;
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
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Fixing brazier", priority=2, blocking=true)
public class FixingBrazierTask
extends Task {
    private final  SquireWintertodtConfig T;
    
    private final  b S;

    private static boolean llIIIIlllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!m.llIIIIlllIlIlIl(string.contains(lIllIIIIIIIII[lIllIIIIIIIIl[3]]) ? 1 : 0) || m.llIIIIlllIlIlII(string.contains(lIllIIIIIIIII[lIllIIIIIIIIl[2]]) ? 1 : 0)) {
            m var1;
            var1.sleep(lIllIIIIIIIIl[0]);
        }
    }

    private static boolean llIIIIlllIllIII(Object object) {
        return object != null;
    }

    private static boolean llIIIIlllIllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIlllIlIlll(Object object) {
        return object == null;
    }

    static {
        m.llIIIIlllIlIIll();
        m.llIIIIlllIlIIlI();
    }

        return String.valueOf(var2);
    }

    private static boolean llIIIIlllIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlllIlIlIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public FixingBrazierTask(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.S = b2;
        this.T = squireWintertodtConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        m var3;
        if (!m.llIIIIlllIlIlII(this.S.i() ? 1 : 0) || !m.llIIIIlllIlIlIl(this.S.u() ? 1 : 0) || m.llIIIIlllIlIlII(this.S.j() ? 1 : 0)) {
            return lIllIIIIIIIIl[0];
        }
        a var4 = var3.S.q();
        Player var5 = Players.getLocal();
        if (m.llIIIIlllIlIllI(var4.b().distanceTo((Locatable)var5), lIllIIIIIIIIl[1])) {
            return lIllIIIIIIIIl[0];
        }
        TileObject var6 = TileObjects.getNearest((WorldPoint)var4.b(), tileObject -> {
            int n2;
            if (m.llIIIIlllIllIII(tileObject.getName()) && m.llIIIIlllIlIlII(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIllIIIIIIIII[lIllIIIIIIIIl[1]]) ? 1 : 0) && m.llIIIIlllIllIlI(var4.b().distanceTo((Locatable)tileObject), lIllIIIIIIIIl[1])) {
                String[] stringArray = new String[lIllIIIIIIIIl[3]];
                stringArray[m.lIllIIIIIIIIl[0]] = lIllIIIIIIIII[lIllIIIIIIIIl[4]];
                if (m.llIIIIlllIlIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIIIIIIIl[3];

                    if (2 != 3) return n2 != 0;
                    return ((0xF5 ^ 0xB2 ^ (0xC7 ^ 0x9E)) & (2 ^ 0x27 ^ (0x3B ^ 0) ^ -1)) != 0;
                }
            }
            n2 = lIllIIIIIIIIl[0];
            return n2 != 0;
        });
        if (m.llIIIIlllIlIlll(var6)) {
            return lIllIIIIIIIIl[0];
        }
        var3_3.interact(lIllIIIIIIIII[lIllIIIIIIIIl[0]]);
        this.sleep(lIllIIIIIIIIl[2]);
        return lIllIIIIIIIIl[3];
    }

    private static boolean llIIIIlllIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIIlllIlIIlI() {
        lIllIIIIIIIII = new String[lIllIIIIIIIIl[5]];
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[0]] = "Fix";
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[3]] = "seeps into your bones";
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[2]] = "Congratulations";
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[1]] = "brazier";
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[4]] = "Fix";
    }

}

