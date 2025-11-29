/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
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
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking Antifire Potion", priority=110)
public class DrinkingAntifirePotionTask
extends VorkathTaskBase {

    private static boolean llIIIIIIlIlIIll(Object object) {
        return object != null;
    }

    private static boolean llIIIIIIlIlIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var2_2;
        E var1;
        if (!E.llIIIIIIlIlIIIl(Combat.isSuperAntifired() ? 1 : 0) || E.llIIIIIIlIlIIlI(Combat.isAntifired() ? 1 : 0)) {
            return lIlIllIIlIlll[0];
        }
        NPC var2 = var1.cg.A();
        if (E.llIIIIIIlIlIIll(var2)) {
            return lIlIllIIlIlll[0];
        }
        int[] nArray = new int[lIlIllIIlIlll[1]];
        nArray[E.lIlIllIIlIlll[0]] = lIlIllIIlIlll[2];
        if (E.llIIIIIIlIlIIll(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIlIlll[0];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            if (E.llIIIIIIlIlIIlI(item.getName().toLowerCase().contains(lIlIllIIlIllI[lIlIllIIlIlll[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIIlIlll[1]];
                stringArray[E.lIlIllIIlIlll[0]] = lIlIllIIlIllI[lIlIllIIlIlll[3]];
                if (E.llIIIIIIlIlIIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIllIIlIlll[1];

                    if (((139 + 148 - 172 + 35 ^ 39 + 140 - 148 + 112) & (0x38 ^ 0x45 ^ (0xD ^ 0x69) ^ -1)) == 0) return n2 != 0;
                    return ((62 + 14 - -11 + 57 ^ 109 + 140 - 64 + 8) & (0xEA ^ 0x83 ^ (0x8A ^ 0xB2) ^ -1)) != 0;
                }
            }
            n2 = lIlIllIIlIlll[0];
            return n2 != 0;
        });
        if (E.llIIIIIIlIlIlII(var3)) {
            return lIlIllIIlIlll[0];
        }
        var2_2.interact(lIlIllIIlIllI[lIlIllIIlIlll[0]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIlIlll[1];
    }

    private static void llIIIIIIlIIllll() {
        lIlIllIIlIllI = new String[lIlIllIIlIlll[4]];
        E.lIlIllIIlIllI[E.lIlIllIIlIlll[0]] = "Drink";
        E.lIlIllIIlIllI[E.lIlIllIIlIlll[1]] = "antifire";
        E.lIlIllIIlIllI[E.lIlIllIIlIlll[3]] = "Drink";
    }

    private static boolean llIIIIIIlIlIIlI(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var4);
    }

    private static boolean llIIIIIIlIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIIlIlIIIl(int n2) {
        return n2 == 0;
    }

    @Inject
    protected DrinkingAntifirePotionTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    static {
        E.llIIIIIIlIlIIII();
        E.llIIIIIIlIIllll();
    }
}

