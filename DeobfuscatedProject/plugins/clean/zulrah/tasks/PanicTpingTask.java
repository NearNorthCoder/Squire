/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum59;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Panic tping", priority=0x7FFFFFFF, blocking=true)
public class PanicTpingTask
extends ZulrahTaskBase {

    private static boolean llIIlIIlIIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIlIIlIIlIIlI() {
        lIllIllIlIIll = new String[lIllIllIlIlll[3]];
        aa.lIllIllIlIIll[aa.lIllIllIlIlll[0]] = "Equip";
        aa.lIllIllIlIIll[aa.lIllIllIlIlll[2]] = "Wear";
        aa.lIllIllIlIIll[aa.lIllIllIlIlll[1]] = "Eat";
    }

    private static boolean llIIlIIlIIlIlll(int n2) {
        return n2 > 0;
    }

    @Inject
    protected PanicTpingTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    private static boolean llIIlIIlIIllIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        aa var1;
        if (aa.llIIlIIlIIlIllI(this.aB.isInInstancedRegion() ? 1 : 0)) {
            return lIllIllIlIlll[0];
        }
        int var2 = Inventory.getCount(item -> item.hasAction(lIllIllIlIIll[lIllIllIlIlll[1]]::equals));
        if (aa.llIIlIIlIIlIlll(var2)) {
            return lIllIllIlIlll[0];
        }
        if (aa.llIIlIIlIIllIII(Combat.getCurrentHealth(), var1.aA.eatAtHP())) {
            return lIllIllIlIlll[0];
        }
        h[] var3 = h.values();
        int var4 = var3.length;
        int var5 = lIllIllIlIlll[0];
        while (aa.llIIlIIlIIllIIl(var5, var4)) {
            h var6 = var3[var5];
            if (aa.llIIlIIlIIlIllI(Inventory.contains((int[])var6.u()) ? 1 : 0) && aa.llIIlIIlIIlIllI(Equipment.contains((int[])var6.u()) ? 1 : 0)) {

                }
            } else if (aa.llIIlIIlIIllIlI(var6.t() ? 1 : 0)) {
                if (aa.llIIlIIlIIllIlI(Inventory.contains((int[])var6.u()) ? 1 : 0)) {
                    String[] stringArray = new String[lIllIllIlIlll[1]];
                    stringArray[aa.lIllIllIlIlll[0]] = lIllIllIlIIll[lIllIllIlIlll[0]];
                    stringArray[aa.lIllIllIlIlll[2]] = lIllIllIlIIll[lIllIllIlIlll[2]];
                    Inventory.getFirst((int[])var6.u()).interact(stringArray);
                }
                if (aa.llIIlIIlIIllIlI(Equipment.contains((int[])var6.u()) ? 1 : 0)) {
                    Equipment.getFirst((int[])var6.u()).interact(var6.s());

                    if (1 >= 0) break;
                    return false;
                }
            } else if (aa.llIIlIIlIIllIlI(Inventory.contains((int[])var6.u()) ? 1 : 0)) {
                Inventory.getFirst((int[])var6.u()).interact(var6.s());

                if (null == null) break;
                return ((25 + 139 - 133 + 160 ^ 74 + 146 - 174 + 124) & (0xEE ^ 0x80 ^ (0x2A ^ 0x51) ^ -1)) != 0;
            }
            ++var5;

            if ((0xB ^ 0xF) >= ((0x19 ^ 0x3A) & ~(0x18 ^ 0x3B))) continue;
            return false;
        }
        this.E.a(lIllIllIlIlll[2]);
        return lIllIllIlIlll[2];
    }

    private static boolean llIIlIIlIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aa.llIIlIIlIIlIlIl();
        aa.llIIlIIlIIlIIlI();
    }

        return String.valueOf(var7);
    }
}

