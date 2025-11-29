/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.thieving.tasks.ThievingTaskBase;
import gg.squire.thieving.tasks.GameEnum22;
import gg.squire.thieving.tasks.GameEnum32;

@TaskDesc(name="Updating state", priority=2147482310)
public class UpdatingStateTask
extends ThievingTaskBase {

    private static boolean lIllIIlIIlIllII(Object object, Object object2) {
        return object == object2;
    }

    private static void lIllIIlIIlIIlIl() {
        lIIlllIIIIlII = new String[lIIlllIIIIlIl[10]];
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[0]] = "Open";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[1]] = "Eat";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[2]] = "Drink";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[4]] = "Eat";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[5]] = "Drink";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[6]] = "Eat";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[7]] = "Drink";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[8]] = "gem bag";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[9]] = "Open";
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIIlIIlIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIlIIlIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIlIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIlIIlIlIIl(Object object) {
        return object != null;
    }

    static {
        B.lIllIIlIIlIIllI();
        B.lIllIIlIIlIIlIl();
    }

    @Inject
    public UpdatingStateTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIlIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIIlIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIlIIlIIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean l() {
        int var2;
        int n2;
        int var3;
        int n3;
        B var4;
        if (B.lIllIIlIIlIIlll(this.p.depositSeedVault() ? 1 : 0)) {
            return lIIlllIIIIlIl[0];
        }
        if (B.lIllIIlIIlIlIII(var4.p.pickpocketFoodAmount())) {
            return lIIlllIIIIlIl[0];
        }
        if (B.lIllIIlIIlIIlll(var4.o.j() ? 1 : 0)) {
            return lIIlllIIIIlIl[0];
        }
        Item var5 = Inventory.getFirst(item -> {
            int n2;
            if (B.lIllIIlIIlIIlll(item.getName().toLowerCase().contains(lIIlllIIIIlII[lIIlllIIIIlIl[8]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIIIlIl[1]];
                stringArray[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[9]];
                if (B.lIllIIlIIlIIlll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllIIIIlIl[1];

                    if (-1 != 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlllIIIIlIl[0];
            return n2 != 0;
        });
        if (B.lIllIIlIIlIIlll(var4.p.gemBag() ? 1 : 0) && B.lIllIIlIIlIlIIl(var5)) {
            var5.interact(lIIlllIIIIlII[lIIlllIIIIlIl[0]]);
        }
        if (B.lIllIIlIIlIIlll(Inventory.contains(item -> {
            int n2;
            block3: {
                block2: {
                    String[] stringArray = new String[lIIlllIIIIlIl[1]];
                    stringArray[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[6]];
                    if (!B.lIllIIlIIlIlIII(item.hasAction(stringArray) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[lIIlllIIIIlIl[1]];
                    stringArray2[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[7]];
                    if (!B.lIllIIlIIlIIlll(item.hasAction(stringArray2) ? 1 : 0)) break block3;
                }
                n2 = lIIlllIIIIlIl[1];

                if (null == null) return n2 != 0;
                return false;
            }
            n2 = lIIlllIIIIlIl[0];
            return n2 != 0;
        }) ? 1 : 0) && B.lIllIIlIIlIlIlI(Combat.getMissingHealth())) {
            n3 = lIIlllIIIIlIl[1];

            if (3 <= ((41 + 3 - -51 + 71 ^ 60 + 74 - 46 + 91) & (101 + 38 - 120 + 148 ^ 72 + 147 - 159 + 118 ^ -1))) {
                return ((0x27 ^ 0x73 ^ (0x36 ^ 0x26)) & (0x43 ^ 0x6D ^ (0xA9 ^ 0xC3) ^ -1)) != 0;
            }
        } else {
            n3 = var3 = lIIlllIIIIlIl[0];
        }
        if (!B.lIllIIlIIlIlIll((Object)var4.p.pickpocketTarget(), (Object)f.VYRE) || B.lIllIIlIIlIllII((Object)var4.p.pickpocketTarget(), (Object)f.ELF)) {
            n2 = lIIlllIIIIlIl[1];

            if (((173 + 22 - 24 + 20 ^ 30 + 66 - -29 + 38) & (0x27 ^ 0x55 ^ (0x53 ^ 0x3D) ^ -1)) == (22 + 105 - 102 + 109 ^ 90 + 84 - 61 + 17)) {
                return ((0x3F ^ 0x22 ^ (0x56 ^ 0x5A)) & (0x5D ^ 0x24 ^ (0x55 ^ 0x3D) ^ -1)) != 0;
            }
        } else {
            n2 = lIIlllIIIIlIl[0];
        }
        if (B.lIllIIlIIlIIlll(var2 = n2) && B.lIllIIlIIlIllIl(Inventory.getFreeSlots(), lIIlllIIIIlIl[2])) {
            if (B.lIllIIlIIlIIlll(var3)) {
                String[] stringArray = new String[lIIlllIIIIlIl[2]];
                stringArray[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[1]];
                stringArray[B.lIIlllIIIIlIl[1]] = lIIlllIIIIlII[lIIlllIIIIlIl[2]];
                Inventory.getFirst(item -> {
                    int n2;
                    block3: {
                        block2: {
                            String[] stringArray = new String[lIIlllIIIIlIl[1]];
                            stringArray[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[4]];
                            if (!B.lIllIIlIIlIlIII(item.hasAction(stringArray) ? 1 : 0)) break block2;
                            String[] stringArray2 = new String[lIIlllIIIIlIl[1]];
                            stringArray2[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[5]];
                            if (!B.lIllIIlIIlIIlll(item.hasAction(stringArray2) ? 1 : 0)) break block3;
                        }
                        n2 = lIIlllIIIIlIl[1];

                        if (null == null) return n2 != 0;
                        return ((0x69 ^ 0x61 ^ (0xFC ^ 0xA3)) & (119 + 175 - 69 + 11 ^ 102 + 161 - 143 + 67 ^ -1)) != 0;
                    }
                    n2 = lIIlllIIIIlIl[0];
                    return n2 != 0;
                }).interact(stringArray);
                return lIIlllIIIIlIl[1];
            }
            var4.o.b(lIIlllIIIIlIl[1]);
            return lIIlllIIIIlIl[1];
        }
        if (B.lIllIIlIIlIIlll(Inventory.isFull() ? 1 : 0)) {
            var4.o.b(lIIlllIIIIlIl[1]);
            return lIIlllIIIIlIl[1];
        }
        if (B.lIllIIlIIlIlIll((Object)var4.p.pickpocketFood(), (Object)e.NONE)) {
            int[] nArray = new int[lIIlllIIIIlIl[1]];
            nArray[B.lIIlllIIIIlIl[0]] = var4.p.pickpocketFood().x();
            if (B.lIllIIlIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && B.lIllIIlIIlIllIl(Combat.getCurrentHealth(), var4.p.eatHP())) {
                var4.o.b(lIIlllIIIIlIl[1]);
                return lIIlllIIIIlIl[1];
            }
        }
        if (B.lIllIIlIIlIIlll(var4.p.dodgyNecklace() ? 1 : 0)) {
            int[] nArray = new int[lIIlllIIIIlIl[1]];
            nArray[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlIl[3];
            if (B.lIllIIlIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                var4.o.b(lIIlllIIIIlIl[1]);
                return lIIlllIIIIlIl[1];
            }
        }
        return lIIlllIIIIlIl[0];
    }
}

