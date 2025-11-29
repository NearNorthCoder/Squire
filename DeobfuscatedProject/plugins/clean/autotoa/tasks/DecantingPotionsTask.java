/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;

@TaskDesc(name="Decanting potions", priority=1000, blocking=true)
public class DecantingPotionsTask
extends AutotoaTaskBase {

    private int n(String string) {
        return Integer.parseInt(string.split(llIlIlIlIIl[llIlIlIlllI[2]])[llIlIlIlllI[0]].split(llIlIlIlIIl[llIlIlIlllI[3]])[llIlIlIlllI[1]]);
    }

    static {
        cc.lIlIIlllIlIIll();
        cc.lIlIIllIllllIl();
    }

        return String.valueOf(var1);
    }

    public boolean run() {
        String[] stringArray = new String[llIlIlIlllI[0]];
        stringArray[cc.llIlIlIlllI[1]] = llIlIlIlIIl[llIlIlIlllI[1]];
        Item item2 = Inventory.getFirst((String[])stringArray);
        if (cc.lIlIIlllIlIlII(item2)) {
            item2.interact(llIlIlIlIIl[llIlIlIlllI[0]]);
            return llIlIlIlllI[0];
        }
        Set var2 = Inventory.getAll(item -> item.getName().contains(llIlIlIlIIl[llIlIlIlllI[7]])).stream().filter(item -> {
            String[] stringArray = new String[llIlIlIlllI[0]];
            stringArray[cc.llIlIlIlllI[1]] = llIlIlIlIIl[llIlIlIlllI[6]];
            return item.hasAction(stringArray);
        }).map(item -> item.getName().split(llIlIlIlIIl[llIlIlIlllI[5]])[llIlIlIlllI[1]].trim()).collect(Collectors.toSet());
        Iterator var3 = var2.iterator();
        while (cc.lIlIIlllIlIlIl(var3.hasNext() ? 1 : 0)) {
            cc var4;
            String var5 = (String)var3.next();
            if (cc.lIlIIlllIlIlIl(var4.m(var5) ? 1 : 0)) {
                return llIlIlIlllI[0];
            }

            if (-3 < 0) continue;
            return ((109 + 84 - 67 + 2 ^ 108 + 122 - 133 + 64) & (0x1B ^ 0x27 ^ (0x6E ^ 0x73) ^ -1)) != 0;
        }
        return llIlIlIlllI[1];
    }

    private static boolean lIlIIlllIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlllIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlllIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlllIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIlIIlllIllIII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIlIIllIllllIl() {
        llIlIlIlIIl = new String[llIlIlIlllI[8]];
        cc.llIlIlIlIIl[cc.llIlIlIlllI[1]] = "Vial";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[0]] = "Drop";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[2]] = "\\(";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[3]] = "\\)";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[4]] = "4";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[5]] = "\\(";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[6]] = "Drink";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[7]] = "(";
    }

    @Inject
    protected DecantingPotionsTask(Client client) {
        super(client);
    }

    private static boolean lIlIIlllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean m(String string) {
        void var4_4;
        void var3_3;
        cc var6;
        void var7;
        List list = Inventory.getAll(item -> {
            int n2;
            if (cc.lIlIIlllIlIlll((Object)e.c(item.getId())) && cc.lIlIIlllIlIlIl(item.getName().contains(string) ? 1 : 0) && cc.lIlIIlllIllIIl(item.getName().contains(llIlIlIlIIl[llIlIlIlllI[4]]) ? 1 : 0)) {
                n2 = llIlIlIlllI[0];

                if (-1 >= 3) {
                    return false;
                }
            } else {
                n2 = llIlIlIlllI[1];
            }
            return n2 != 0;
        });
        if (cc.lIlIIlllIlIllI(list.size(), llIlIlIlllI[0])) {
            return llIlIlIlllI[1];
        }
        Item var8 = var7.stream().min(Comparator.comparingInt(item -> this.n(item.getName()))).orElse(null);
        Item var9 = var7.stream().filter(item2 -> {
            boolean bl2;
            if (cc.lIlIIlllIllIII(item2, var8)) {
                bl2 = llIlIlIlllI[0];

                if (1 == 0) {
                    return ((109 + 17 - 1 + 11 ^ 18 + 151 - 68 + 71) & (0x42 ^ 0x2B ^ (0x22 ^ 0x6F) ^ -1)) != 0;
                }
            } else {
                bl2 = llIlIlIlllI[1];
            }
            return bl2;
        }).max(Comparator.comparingInt(item -> this.n(item.getName()))).orElse(null);
        if (cc.lIlIIlllIlIlll(var9)) {
            return llIlIlIlllI[1];
        }
        var3_3.useOn((Item)var4_4);
        return llIlIlIlllI[0];
    }

    private static boolean lIlIIlllIlIlII(Object object) {
        return object != null;
    }
}

