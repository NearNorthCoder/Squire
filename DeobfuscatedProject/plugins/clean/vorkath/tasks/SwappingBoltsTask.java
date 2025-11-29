/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
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
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Swapping bolts", priority=50)
public class SwappingBoltsTask
extends VorkathTaskBase {
    
    private static final  int cl;

    private static boolean llIIIIIIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIIIlIIlIl(int n2) {
        return n2 > 0;
    }

    private static void llIIIIIIIlIIIIl() {
        lIlIllIIIlIII = new String[lIlIllIIIlIIl[7]];
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[1]] = "Wield";
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[0]] = "Wield";
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[2]] = "(e)";
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[3]] = "diamond";
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[4]] = "(e)";
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[5]] = "ruby";
    }

    private static boolean llIIIIIIIlIIlII(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    static {
        C.llIIIIIIIlIIIlI();
        C.llIIIIIIIlIIIIl();
        cl = lIlIllIIIlIIl[6];
    }

    private static boolean llIIIIIIIlIIllI(int n2) {
        return n2 != 0;
    }

    private static int llIIIIIIIlIIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var7_6;
        int n2;
        void var2;
        NPC nPC = this.cg.c(lIlIllIIIlIIl[0]);
        if (C.llIIIIIIIlIIlII(nPC)) {
            return lIlIllIIIlIIl[1];
        }
        int var3 = var2.getHealthScale();
        int var4 = var2.getHealthRatio();
        double var5 = (double)var4 / (double)var3 * 100.0;
        if (C.llIIIIIIIlIIlIl(C.llIIIIIIIlIIIll(var5, 35.0))) {
            n2 = lIlIllIIIlIIl[0];

            if (2 <= 0) {
                return false;
            }
        } else {
            n2 = lIlIllIIIlIIl[1];
        }
        int var6 = n2;
        Item var7 = null;
        if (C.llIIIIIIIlIIllI(var6)) {
            var7 = Inventory.getFirst(item -> {
                int n2;
                if (C.llIIIIIIIlIIllI(item.getName().contains(lIlIllIIIlIII[lIlIllIIIlIIl[4]]) ? 1 : 0) && C.llIIIIIIIlIIllI(item.getName().toLowerCase().contains(lIlIllIIIlIII[lIlIllIIIlIIl[5]]) ? 1 : 0)) {
                    n2 = lIlIllIIIlIIl[0];

                    if (1 < 0) {
                        return ((34 + 39 - 44 + 157 ^ 89 + 167 - 236 + 149) & (0x77 ^ 0x59 ^ (0x71 ^ 0x4C) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIllIIIlIIl[1];
                }
                return n2 != 0;
            });

            if (2 >= (33 + 140 - 166 + 140 ^ 145 + 4 - 16 + 18)) {
                return false;
            }
        } else {
            var7 = Inventory.getFirst(item -> {
                int n2;
                if (C.llIIIIIIIlIIllI(item.getName().contains(lIlIllIIIlIII[lIlIllIIIlIIl[2]]) ? 1 : 0) && C.llIIIIIIIlIIllI(item.getName().toLowerCase().contains(lIlIllIIIlIII[lIlIllIIIlIIl[3]]) ? 1 : 0)) {
                    n2 = lIlIllIIIlIIl[0];

                } else {
                    n2 = lIlIllIIIlIIl[1];
                }
                return n2 != 0;
            });
        }
        if (C.llIIIIIIIlIIlII(var7)) {
            return lIlIllIIIlIIl[1];
        }
        String[] stringArray = new String[lIlIllIIIlIIl[0]];
        stringArray[C.lIlIllIIIlIIl[1]] = lIlIllIIIlIII[lIlIllIIIlIIl[1]];
        if (C.llIIIIIIIlIIlll(var7.hasAction(stringArray) ? 1 : 0)) {
            return lIlIllIIIlIIl[1];
        }
        var7_6.interact(lIlIllIIIlIII[lIlIllIIIlIIl[0]]);
        return lIlIllIIIlIIl[0];
    }

    @Inject
    protected SwappingBoltsTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean llIIIIIIIlIlIII(int n2, int n3) {
        return n2 < n3;
    }
}

