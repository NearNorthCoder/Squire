/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Banking", priority=999, blocking=true)
public abstract class BankingTask
extends NightmareTaskBase {
    @Inject
    protected  g cZ;

    /*
     * WARNING - void declaration
     */
    protected boolean a(Predicate<Item> predicate, int n2) {
        void var1;
        if (F.lIIIlllIIIlllII(Bank.Inventory.getFirst(predicate))) {
            String[] stringArray = new String[lllIllllIlII[3]];
            stringArray[F.lllIllllIlII[0]] = lllIllllIIll[lllIllllIlII[3]];
            stringArray[F.lllIllllIlII[1]] = lllIllllIIll[lllIllllIlII[4]];
            Bank.Inventory.getFirst(predicate).interact(stringArray);
            return lllIllllIlII[1];
        }
        if (F.lIIIlllIIIllllI(Inventory.getFreeSlots(), (int)var1)) {
            Bank.depositInventory();
            return lllIllllIlII[1];
        }
        Bank.withdraw(predicate, (int)n2, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return lllIllllIlII[1];
    }

    private static boolean lIIIlllIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIIIlllII(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIIIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public abstract boolean bY();

    @Override
    public boolean run() {
        F var2;
        if (F.lIIIlllIIIllIlI(this.cV.enableBanking() ? 1 : 0)) {
            return lllIllllIlII[0];
        }
        if (F.lIIIlllIIIllIll(var2.cc() ? 1 : 0)) {
            var2.cW.b(var2.ce().needsToBank());
        }
        if (F.lIIIlllIIIllIlI(var2.cW.s() ? 1 : 0)) {
            return lllIllllIlII[0];
        }
        if (F.lIIIlllIIIllIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lllIllllIlII[1];
        }
        return this.bY();
    }

        return String.valueOf(var3);
    }

    private static boolean lIIIlllIIIllIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean cd() {
        int n2;
        void var4;
        String[] stringArray = new String[lllIllllIlII[1]];
        stringArray[F.lllIllllIlII[0]] = lllIllllIIll[lllIllllIlII[0]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lllIllllIlII[1]];
        stringArray2[F.lllIllllIlII[0]] = lllIllllIIll[lllIllllIlII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        if (F.lIIIlllIIIlllII(tileObject) && F.lIIIlllIIIllIll(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0) && !F.lIIIlllIIIlllIl(Players.getLocal().distanceTo((Locatable)tileObject), lllIllllIlII[2]) || F.lIIIlllIIIlllII(var4) && F.lIIIlllIIIllIll(Reachable.isInteractable((Locatable)var4) ? 1 : 0) && F.lIIIlllIIIllllI(Players.getLocal().distanceTo((Locatable)var4), lllIllllIlII[2])) {
            n2 = lllIllllIlII[1];

            if (1 < 0) {
                return false;
            }
        } else {
            n2 = lllIllllIlII[0];
        }
        return n2 != 0;
    }

    protected BankingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    protected boolean cc() {
        boolean bl;
        if (!F.lIIIlllIIIllIlI(this.cd() ? 1 : 0) || F.lIIIlllIIIllIll(this.cZ.m(this.cV.bankLocation().bJ()) ? 1 : 0)) {
            bl = lllIllllIlII[1];

            if ((71 + 34 - 1 + 57 ^ 129 + 150 - 237 + 123) < ((0x38 ^ 0x4A ^ (0xBB ^ 0xC0)) & (4 ^ 0x5F ^ (0x2B ^ 0x79) ^ -1))) {
                return ((134 + 98 - 179 + 86 ^ 41 + 109 - 117 + 155) & (0x85 ^ 0xC7 ^ (0xF5 ^ 0x80) ^ -1)) != 0;
            }
        } else {
            bl = lllIllllIlII[0];
        }
        return bl;
    }

    protected BankLoadout ce() {
        return (BankLoadout)this.cV.bankLoadout().selected(BankLoadout.class);
    }

    static {
        F.lIIIlllIIIllIIl();
        F.lIIIlllIIIllIII();
    }

    private static boolean lIIIlllIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIIlllIIIllIII() {
        lllIllllIIll = new String[lllIllllIlII[5]];
        F.lllIllllIIll[F.lllIllllIlII[0]] = "Bank booth";
        F.lllIllllIIll[F.lllIllllIlII[1]] = "Banker";
        F.lllIllllIIll[F.lllIllllIlII[3]] = "Drink";
        F.lllIllllIIll[F.lllIllllIlII[4]] = "Eat";
    }
}

