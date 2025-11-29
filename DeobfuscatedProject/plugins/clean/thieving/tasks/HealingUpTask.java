/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.thieving.tasks.ThievingTaskBase;
import gg.squire.thieving.tasks.GameEnum22;

@TaskDesc(name="Healing up", priority=1000)
public class HealingUpTask
extends ThievingTaskBase {
    
    public static final  Predicate<String> av;

    private static boolean lIllIIlIIlllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIIIII(Object object) {
        return object == null;
    }

    private static boolean lIllIIlIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIIlIIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIlIIllllll(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public HealingUpTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIlIIlllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIlIlIIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        D.lIllIIlIIlllIIl();
        D.lIllIIlIIlllIII();
        av = string -> {
            int n2;
            if (D.lIllIIlIlIIIIIl(string) && (!D.lIllIIlIlIIIIlI(string.equals(lIIlllIIIlIII[lIIlllIIIlIIl[6]]) ? 1 : 0) || D.lIllIIlIIlllIlI(string.equals(lIIlllIIIlIII[lIIlllIIIlIIl[7]]) ? 1 : 0))) {
                n2 = lIIlllIIIlIIl[1];

                if (3 < -1) {
                    return false;
                }
            } else {
                n2 = lIIlllIIIlIIl[0];
            }
            return n2 != 0;
        };
    }

    private boolean K() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (D.lIllIIlIlIIIIIl(item.getActions()) && D.lIllIIlIIlllIlI(item.hasAction(av) ? 1 : 0) && D.lIllIIlIlIIIIlI(item.getName().equals(lIIlllIIIlIII[lIIlllIIIlIIl[1]]) ? 1 : 0)) {
                n2 = lIIlllIIIlIIl[1];

                if ((49 + 4 - -42 + 87 ^ 157 + 68 - 150 + 103) <= 2) {
                    return ((0xB3 ^ 0xC1 ^ (0x6A ^ 0x35)) & (0x4B ^ 0x32 ^ (0x5D ^ 9) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlllIIIlIIl[0];
            }
            return n2 != 0;
        });
        if (D.lIllIIlIlIIIIII(item2)) {
            return lIIlllIIIlIIl[0];
        }
        item2.interact(av);
        return lIIlllIIIlIIl[1];
    }

    private static boolean lIllIIlIIlllIll(int n2) {
        return n2 <= 0;
    }

    private static boolean lIllIIlIlIIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIIllllII(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean l() {
        D var2;
        if (D.lIllIIlIIlllIlI(Bank.isOpen() ? 1 : 0)) {
            return lIIlllIIIlIIl[0];
        }
        int var3 = Inventory.getCount(item -> {
            int n2;
            if (D.lIllIIlIIlllIlI(item.hasAction(av) ? 1 : 0) && D.lIllIIlIlIIIIlI(item.getName().equals(lIIlllIIIlIII[lIIlllIIIlIIl[5]]) ? 1 : 0)) {
                n2 = lIIlllIIIlIIl[1];

                if (3 <= 2) {
                    return ((21 + 4 - -163 + 53 ^ 141 + 112 - 139 + 55) & (0x59 ^ 0x4A ^ (0xFF ^ 0xB4) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlllIIIlIIl[0];
            }
            return n2 != 0;
        });
        if (D.lIllIIlIIlllIll(var3) && D.lIllIIlIIllllII((Object)var2.p.pickpocketFood(), (Object)e.NONE)) {
            return lIIlllIIIlIIl[0];
        }
        int[] nArray = new int[lIIlllIIIlIIl[1]];
        nArray[D.lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[2];
        int var4 = Inventory.contains((int[])nArray) ? 1 : 0;
        if (D.lIllIIlIIlllIlI(var4) && D.lIllIIlIIllllIl(Combat.getMissingHealth(), lIIlllIIIlIIl[3])) {
            int[] nArray2 = new int[lIIlllIIIlIIl[1]];
            nArray2[D.lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[2];
            Inventory.getFirst((int[])nArray2).interact(lIIlllIIIlIII[lIIlllIIIlIIl[0]]);
            return lIIlllIIIlIIl[1];
        }
        if (D.lIllIIlIIlllIlI(var2.p.redemptionHeal() ? 1 : 0) && D.lIllIIlIIlllllI(Prayers.getPoints())) {
            int var5;
            int n2;
            if (D.lIllIIlIIllllll(Combat.getCurrentHealth(), lIIlllIIIlIIl[4])) {
                n2 = lIIlllIIIlIIl[1];

                if (((153 + 75 - 179 + 119 ^ 130 + 112 - 176 + 69) & (0x50 ^ 0x57 ^ (0x25 ^ 0xD) ^ -1)) != 0) {
                    return (((0x3C ^ 0x10) & ~(0x5A ^ 0x76) ^ (0x55 ^ 0x48)) & (0x25 ^ 0x42 ^ (0xDC ^ 0xA6) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlllIIIlIIl[0];
            }
            if (D.lIllIIlIIlllIlI(var5 = n2)) {
                return var2.K();
            }
            return lIIlllIIIlIIl[0];
        }
        if (D.lIllIIlIIllllll(Combat.getCurrentHealth(), var2.p.eatHP())) {
            return var2.K();
        }
        return lIIlllIIIlIIl[0];
    }

    private static void lIllIIlIIlllIII() {
        lIIlllIIIlIII = new String[lIIlllIIIlIIl[3]];
        D.lIIlllIIIlIII[D.lIIlllIIIlIIl[0]] = "Eat";
        D.lIIlllIIIlIII[D.lIIlllIIIlIIl[1]] = "Blood pint";
        D.lIIlllIIIlIII[D.lIIlllIIIlIIl[5]] = "Blood pint";
        D.lIIlllIIIlIII[D.lIIlllIIIlIIl[6]] = "Eat";
        D.lIIlllIIIlIII[D.lIIlllIIIlIIl[7]] = "Drink";
    }

}

