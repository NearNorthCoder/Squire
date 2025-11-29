/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.SepulchreTaskBase;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening Hallowed sacks", priority=0x7FFFFFFF, blocking=true)
public class OpeningHallowedSacksTask
extends SepulchreTaskBase {
    
    private  CompletableFuture<Boolean> ag;
    private  Player ai;

    private static boolean lIIIlIIIIlIIllI(Object object) {
        return object == null;
    }

    private static void lIIIlIIIIlIIlII() {
        lllIIIIIllIl = new String[lllIIIIIlllI[3]];
        U.lllIIIIIllIl[U.lllIIIIIlllI[0]] = "Open";
    }

    private static boolean lIIIlIIIIlIlIII(int n2) {
        return n2 != 0;
    }

    static {
        U.lIIIlIIIIlIIlIl();
        U.lIIIlIIIIlIIlII();
    }

    private static boolean lIIIlIIIIlIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected OpeningHallowedSacksTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        super(squireSepulchre, squireSepulchreConfig);
        this.ag = null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J() {
        void var1_1;
        U var1;
        this.ai = Players.getLocal();
        if (U.lIIIlIIIIlIIllI(this.ai)) {
            return lllIIIIIlllI[0];
        }
        if (U.lIIIlIIIIlIIlll(b.B.contains((Locatable)var1.ai) ? 1 : 0)) {
            return lllIIIIIlllI[0];
        }
        InventorySetup var2 = new InventorySetup();
        var2.add(lllIIIIIlllI[1], lllIIIIIlllI[2]);

        if (U.lIIIlIIIIlIlIII(var2.matchesInventory() ? 1 : 0)) {
            if (U.lIIIlIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                return lllIIIIIlllI[3];
            }
            String[] stringArray = new String[lllIIIIIlllI[3]];
            stringArray[U.lllIIIIIlllI[0]] = lllIIIIIllIl[lllIIIIIlllI[0]];
            Inventory.doActions(item -> {
                boolean bl;
                if (U.lIIIlIIIIlIlIIl(item.getId(), lllIIIIIlllI[1])) {
                    bl = lllIIIIIlllI[3];

                    if (3 == -1) {
                        return false;
                    }
                } else {
                    bl = lllIIIIIlllI[0];
                }
                return bl;
            }, (String[])stringArray);
            return lllIIIIIlllI[3];
        }
        if (U.lIIIlIIIIlIIlll(Bank.isOpen() ? 1 : 0)) {
            Bank.open();

            return lllIIIIIlllI[3];
        }
        var1_1.withdraw();

        return lllIIIIIlllI[3];
    }

    private static boolean lIIIlIIIIlIIlll(int n2) {
        return n2 == 0;
    }
}

