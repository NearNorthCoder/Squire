/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.CHelper;

@TaskDesc(name="Fighting")
public class FightingTask
extends Task {
    private final  SquireShamansPlugin an;
    private final  c ao;
    private final  SquireShamanConfig ap;

    private static final  Logger am;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1;
        void var2;
        t var3;
        NPC nPC = this.ao.o();
        Player player = Players.getLocal();
        if (!t.lIlIlllIIIIIIII(nPC) || !t.lIlIlllIIIIIIIl(this.ap.room().x().contains((Locatable)player) ? 1 : 0) || t.lIlIlllIIIIIIIl(player.isMoving() ? 1 : 0)) {
            return lIIlIllllIIll[0];
        }
        Item var4 = Inventory.getFirst(item -> {
            boolean bl;
            if (!t.lIlIlllIIIIIlIl(item.getId(), this.ap.weapon()) || t.lIlIlllIIIIIIll(item.getId(), this.an.d())) {
                bl = lIIlIllllIIll[2];

                if (((0x5F ^ 0x7B) & ~(0xA8 ^ 0x8C)) != 0) {
                    return false;
                }
            } else {
                bl = lIIlIllllIIll[0];
            }
            return bl;
        });
        if (t.lIlIlllIIIIIIII(var4)) {
            String[] stringArray = new String[lIIlIllllIIll[1]];
            stringArray[t.lIIlIllllIIll[0]] = lIIlIllllIIlI[lIIlIllllIIll[0]];
            stringArray[t.lIIlIllllIIll[2]] = lIIlIllllIIlI[lIIlIllllIIll[2]];
            stringArray[t.lIIlIllllIIll[3]] = lIIlIllllIIlI[lIIlIllllIIll[3]];
            var4.interact(stringArray);
            return lIIlIllllIIll[2];
        }
        if (t.lIlIlllIIIIIIII(var2.getInteracting())) {
            return lIIlIllllIIll[0];
        }
        WorldPoint var5 = var2.getWorldLocation();
        if (t.lIlIlllIIIIIIlI(var3.ao.a(var5) ? 1 : 0)) {
            return lIIlIllllIIll[0];
        }
        if (t.lIlIlllIIIIIIll(var1.getAnimation(), lIIlIllllIIll[4])) {
            return lIIlIllllIIll[0];
        }
        if (t.lIlIlllIIIIIlII(var3.ao.a(var5, (NPC)var1).distanceTo(var5), lIIlIllllIIll[2])) {
            var1.interact(lIIlIllllIIlI[lIIlIllllIIll[1]]);
            return lIIlIllllIIll[2];
        }
        return lIIlIllllIIll[0];
    }

    @Inject
    public FightingTask(SquireShamansPlugin squireShamansPlugin, c c2, SquireShamanConfig squireShamanConfig) {
        this.an = squireShamansPlugin;
        this.ao = c2;
        this.ap = squireShamanConfig;
    }

    static {
        t.lIlIllIllllllll();
        t.lIlIllIlllllllI();
        am = LoggerFactory.getLogger(FightingTask.class);
    }

    private static boolean lIlIlllIIIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlllIIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlllIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIlllllllI() {
        lIIlIllllIIlI = new String[lIIlIllllIIll[5]];
        t.lIIlIllllIIlI[t.lIIlIllllIIll[0]] = "Wield";
        t.lIIlIllllIIlI[t.lIIlIllllIIll[2]] = "Wear";
        t.lIIlIllllIIlI[t.lIIlIllllIIll[3]] = "Equip";
        t.lIIlIllllIIlI[t.lIIlIllllIIll[1]] = "Attack";
    }

        return String.valueOf(var6);
    }

    private static boolean lIlIlllIIIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIlllIIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlllIIIIIIIl(int n2) {
        return n2 != 0;
    }
}

