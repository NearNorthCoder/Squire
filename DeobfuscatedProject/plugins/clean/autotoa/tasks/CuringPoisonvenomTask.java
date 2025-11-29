/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Curing Poison/Venom")
public class CuringPoisonvenomTask
extends AutotoaTaskBase {

    private final  SquireAutoTOA cP;
    private final  C cQ;

    static {
        al.lIlIIIIIllIIll();
        al.lIlIIIIIllIIlI();
    }

    private static boolean lIlIIIIIllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIIllIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!al.lIlIIIIIllIlII(this.cP.e() ? 1 : 0) || al.lIlIIIIIllIlII(this.bc() ? 1 : 0)) {
            return llIIlIlIIlI[0];
        }
        if (al.lIlIIIIIllIlII(Combat.isPoisoned() ? 1 : 0) && al.lIlIIIIIllIlII(Combat.isVenomed() ? 1 : 0)) {
            return llIIlIlIIlI[0];
        }
        if (al.lIlIIIIIllIlIl(TileObjects.getAll(tileObject -> {
            int n2;
            if (!al.lIlIIIIIllIlII(tileObject.getName().toLowerCase().contains(llIIlIlIIIl[llIIlIlIIlI[4]]) ? 1 : 0) || al.lIlIIIIIllIlIl(tileObject.getName().toLowerCase().contains(llIIlIlIIIl[llIIlIlIIlI[5]]) ? 1 : 0)) {
                n2 = llIIlIlIIlI[1];

                if ((0xBA ^ 0xBE) <= 0) {
                    return false;
                }
            } else {
                n2 = llIIlIlIIlI[0];
            }
            return n2 != 0;
        }).stream().anyMatch(tileObject -> tileObject.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation())) ? 1 : 0)) {
            return llIIlIlIIlI[0];
        }
        Item var1 = Inventory.getFirst(item -> {
            boolean bl2;
            if (!al.lIlIIIIIllIlII(item.getName().contains(llIIlIlIIIl[llIIlIlIIlI[1]]) ? 1 : 0) || !al.lIlIIIIIllIlII(item.getName().contains(llIIlIlIIIl[llIIlIlIIlI[2]]) ? 1 : 0) || al.lIlIIIIIllIlIl(item.getName().contains(llIIlIlIIIl[llIIlIlIIlI[3]]) ? 1 : 0)) {
                bl2 = llIIlIlIIlI[1];

                if (-(59 + 141 - 99 + 60 ^ 1 + 33 - 28 + 158) >= 0) {
                    return ((0x41 ^ 0x14 ^ (0xBC ^ 0xC5)) & (75 + 38 - 59 + 85 ^ 62 + 72 - 9 + 42 ^ -1)) != 0;
                }
            } else {
                bl2 = llIIlIlIIlI[0];
            }
            return bl2;
        });
        if (al.lIlIIIIIllIllI(var1)) {
            return llIIlIlIIlI[0];
        }
        var1_1.interact(llIIlIlIIIl[llIIlIlIIlI[0]]);
        return llIIlIlIIlI[0];
    }

    private static boolean lIlIIIIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIIIIIllIIlI() {
        llIIlIlIIIl = new String[llIIlIlIIlI[6]];
        al.llIIlIlIIIl[al.llIIlIlIIlI[0]] = "Drink";
        al.llIIlIlIIIl[al.llIIlIlIIlI[1]] = "Anti";
        al.llIIlIlIIIl[al.llIIlIlIIlI[2]] = "dote";
        al.llIIlIlIIIl[al.llIIlIlIIlI[3]] = "venom";
        al.llIIlIlIIIl[al.llIIlIlIIlI[4]] = "venom";
        al.llIIlIlIIIl[al.llIIlIlIIlI[5]] = "poison";
    }

        return String.valueOf(var2);
    }

    private static boolean lIlIIIIIllIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected CuringPoisonvenomTask(Client client, SquireAutoTOA squireAutoTOA, C c2) {
        super(client);
        this.cP = squireAutoTOA;
        this.cQ = c2;
    }
}

