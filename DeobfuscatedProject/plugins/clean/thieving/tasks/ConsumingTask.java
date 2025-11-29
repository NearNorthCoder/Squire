/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquirePlunderConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Consuming", priority=500, register=true)
public class ConsumingTask
extends Task {
    private final  SquirePlunderConfig v;
    
    private  Instant x;
    private final  Duration w;

    private static void lIIlIlIIllIlIII() {
        lllllllIIIIl = new String[lllllllIIIlI[7]];
        e.lllllllIIIIl[e.lllllllIIIlI[0]] = "Can't find selected food!";
        e.lllllllIIIIl[e.lllllllIIIlI[1]] = "Eat";
        e.lllllllIIIIl[e.lllllllIIIlI[3]] = "Can't find selected antipoison!";
        e.lllllllIIIIl[e.lllllllIIIlI[4]] = "Drink";
        e.lllllllIIIIl[e.lllllllIIIlI[2]] = "Drink";
        e.lllllllIIIIl[e.lllllllIIIlI[6]] = "Eat";
    }

    @Inject
    public ConsumingTask(SquirePlunderConfig squirePlunderConfig) {
        this.w = Duration.ofSeconds(12L);
        this.v = squirePlunderConfig;
    }

    private static boolean lIIlIlIIlllIIII(int n2) {
        return n2 != 0;
    }

    private static int lIIlIlIIllIlIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    static {
        e.lIIlIlIIllIlIIl();
        e.lIIlIlIIllIlIII();
    }

    private static boolean lIIlIlIIllIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIIllIlllI(int n2) {
        return n2 > 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIlIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIllIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIllIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIllIllIl(Object object) {
        return object == null;
    }

    public boolean run() {
        e var2;
        if (e.lIIlIlIIllIlIll(Combat.getCurrentHealth(), this.v.eatAt()) && e.lIIlIlIIllIllII(Combat.isPoisoned() ? 1 : 0)) {
            return lllllllIIIlI[0];
        }
        if (e.lIIlIlIIllIlIll(var2.v.eatAt(), Combat.getCurrentHealth())) {
            Item var3 = Inventory.getFirst(item -> {
                int n2;
                if (e.lIIlIlIIllIllll(item.getId(), this.v.foodID())) {
                    String[] stringArray = new String[lllllllIIIlI[1]];
                    stringArray[e.lllllllIIIlI[0]] = lllllllIIIIl[lllllllIIIlI[6]];
                    if (e.lIIlIlIIlllIIII(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllllllIIIlI[1];

                        if (2 >= 1) return n2 != 0;
                        return ((0x8B ^ 0x8F ^ (0x7E ^ 0x46)) & (0x1F ^ 0x73 ^ (0x4C ^ 0x1C) ^ -1)) != 0;
                    }
                }
                n2 = lllllllIIIlI[0];
                return n2 != 0;
            });
            if (e.lIIlIlIIllIllIl(var3)) {
                Log.info((String)lllllllIIIIl[lllllllIIIlI[0]]);
                return lllllllIIIlI[0];
            }
            var3.interact(lllllllIIIIl[lllllllIIIlI[1]]);
            var2.sleep(lllllllIIIlI[2]);
            return lllllllIIIlI[1];
        }
        if (e.lIIlIlIIllIllII(Combat.isPoisoned() ? 1 : 0)) {
            return lllllllIIIlI[0];
        }
        System.out.println("time until anti: " + Duration.between(var2.x, Instant.now()).toSeconds());
        if (e.lIIlIlIIllIlllI(e.lIIlIlIIllIlIlI(Duration.between(var2.x, Instant.now()).toSeconds(), var2.w.toSeconds()))) {
            Item var3 = Inventory.getFirst(item -> {
                int n2;
                if (e.lIIlIlIIlllIIII(item.getName().startsWith(this.v.antiPoison()) ? 1 : 0)) {
                    String[] stringArray = new String[lllllllIIIlI[1]];
                    stringArray[e.lllllllIIIlI[0]] = lllllllIIIIl[lllllllIIIlI[2]];
                    if (e.lIIlIlIIlllIIII(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllllllIIIlI[1];

                        if (-2 <= 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = lllllllIIIlI[0];
                return n2 != 0;
            });
            if (e.lIIlIlIIllIllIl(var3)) {
                Log.info((String)lllllllIIIIl[lllllllIIIlI[3]]);
                return lllllllIIIlI[0];
            }
            var3.interact(lllllllIIIIl[lllllllIIIlI[4]]);
            var2.sleep(lllllllIIIlI[3]);
            return lllllllIIIlI[1];
        }
        return lllllllIIIlI[0];
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (e.lIIlIlIIllIllll(varbitChanged.getVarpId(), lllllllIIIlI[5])) {
            this.x = Instant.now();
        }
    }
}

