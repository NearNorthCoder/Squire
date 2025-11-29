/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Venom", priority=110, register=true)
public class VenomTask
extends VorkathTaskBase {

    private static final  Duration co;
    private  Instant cp;

    @Inject
    protected VenomTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (J.llIIIIIIlllIIlI(varbitChanged.getVarpId(), lIlIllIIlllIl[3])) {
            this.cp = Instant.now();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var2_2;
        J var1;
        int var2;
        int n2;
        if (!J.llIIIIIIllIllIl(Combat.isVenomed() ? 1 : 0) || J.llIIIIIIllIlllI(Combat.isPoisoned() ? 1 : 0)) {
            n2 = lIlIllIIlllIl[0];

            }
        } else {
            n2 = lIlIllIIlllIl[1];
        }
        if (!J.llIIIIIIllIlllI(var2 = n2) || J.llIIIIIIllIllll(var1.cp)) {
            return lIlIllIIlllIl[1];
        }
        if (J.llIIIIIIlllIIII(J.llIIIIIIllIllII(Duration.between(var1.cp, Instant.now()).toSeconds(), co.toSeconds()))) {
            return lIlIllIIlllIl[1];
        }
        int[] nArray = new int[lIlIllIIlllIl[0]];
        nArray[J.lIlIllIIlllIl[1]] = lIlIllIIlllIl[2];
        if (J.llIIIIIIlllIIIl(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIlllIl[1];
        }
        Item var3 = Inventory.getFirst(item -> {
            boolean bl;
            if (!J.llIIIIIIllIllIl(item.getName().toLowerCase().contains(lIlIllIIlllII[lIlIllIIlllIl[0]]) ? 1 : 0) || !J.llIIIIIIllIllIl(item.getName().contains(lIlIllIIlllII[lIlIllIIlllIl[4]]) ? 1 : 0) || J.llIIIIIIllIlllI(item.getName().toLowerCase().contains(lIlIllIIlllII[lIlIllIIlllIl[5]]) ? 1 : 0)) {
                Item var4;
                String[] stringArray = new String[lIlIllIIlllIl[0]];
                stringArray[J.lIlIllIIlllIl[1]] = lIlIllIIlllII[lIlIllIIlllIl[6]];
                if (J.llIIIIIIllIlllI(var4.hasAction(stringArray) ? 1 : 0)) {
                    bl = lIlIllIIlllIl[0];

                    if (-1 < 3) return bl;
                    return false;
                }
            }
            bl = lIlIllIIlllIl[1];
            return bl;
        });
        if (J.llIIIIIIllIllll(var3)) {
            return lIlIllIIlllIl[1];
        }
        var2_2.interact(lIlIllIIlllII[lIlIllIIlllIl[1]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIlllIl[0];
    }

    private static boolean llIIIIIIllIllll(Object object) {
        return object == null;
    }

    private static boolean llIIIIIIlllIIlI(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var5);
    }

    private static boolean llIIIIIIlllIIIl(Object object) {
        return object != null;
    }

    static {
        J.llIIIIIIllIlIll();
        J.llIIIIIIllIlIlI();
        co = Duration.ofSeconds(5L);
    }

    private static boolean llIIIIIIllIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIIlllIIII(int n2) {
        return n2 < 0;
    }

    private static void llIIIIIIllIlIlI() {
        lIlIllIIlllII = new String[lIlIllIIlllIl[7]];
        J.lIlIllIIlllII[J.lIlIllIIlllIl[1]] = "Drink";
        J.lIlIllIIlllII[J.lIlIllIIlllIl[0]] = "poison";
        J.lIlIllIIlllII[J.lIlIllIIlllIl[4]] = "dote";
        J.lIlIllIIlllII[J.lIlIllIIlllIl[5]] = "venom";
        J.lIlIllIIlllII[J.lIlIllIIlllIl[6]] = "Drink";
    }

    private static boolean llIIIIIIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIIllIlllI(int n2) {
        return n2 != 0;
    }

    private static int llIIIIIIllIllII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

