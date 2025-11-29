/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.items.Bank
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Bank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.BankingTask;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Using Bank loadout", priority=999, blocking=true)
public class UsingBankLoadoutTask
extends BankingTask {

    private static final  Logger cY;

        return String.valueOf(var1);
    }

    @Inject
    public UsingBankLoadoutTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void lIIIllllIIIIlll() {
        llllIIIlIlII = new String[llllIIIlIllI[3]];
        E.llllIIIlIlII[E.llllIIIlIllI[0]] = "[BankLoadoutTask]: Failed to withdraw bank loadout after 5 retries.";
        E.llllIIIlIlII[E.llllIIIlIllI[1]] = "stamina potion";
    }

    private static boolean lIIIllllIIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        E.lIIIllllIIIllIl();
        E.lIIIllllIIIIlll();
        cY = LoggerFactory.getLogger(UsingBankLoadoutTask.class);
    }

    @Override
    public boolean bY() {
        E var2;
        if (E.lIIIllllIIIlllI(this.cW.ae() ? 1 : 0)) {
            return llllIIIlIllI[0];
        }
        if (E.lIIIllllIIIlllI(var2.cW.n() ? 1 : 0)) {
            return llllIIIlIllI[0];
        }
        if (E.lIIIllllIIIllll(Bank.isOpen() ? 1 : 0)) {
            return Bank.open();
        }
        Predicate<Item> var3 = item -> {
            int n2;
            if (E.lIIIllllIIIlllI(item.getName().toLowerCase().contains(llllIIIlIlII[llllIIIlIllI[1]]) ? 1 : 0) && E.lIIIllllIIIllll(item.isPlaceholder() ? 1 : 0)) {
                n2 = llllIIIlIllI[1];

                if ((0x54 ^ 0x50) == 0) {
                    return false;
                }
            } else {
                n2 = llllIIIlIllI[0];
            }
            return n2 != 0;
        };
        if (E.lIIIllllIIIlllI(var2.cb() ? 1 : 0) && E.lIIIllllIIIlllI(Bank.contains(var3) ? 1 : 0)) {
            return var2.a(var3, llllIIIlIllI[1]);
        }
        if (E.lIIIllllIIIllll(var2.ce().needsToBank() ? 1 : 0)) {
            Bank.close();
            return llllIIIlIllI[1];
        }
        if (E.lIIIllllIIIllll(BankLoadouts.withdrawWithRetries((BankLoadout)var2.ce(), (int)llllIIIlIllI[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)llllIIIlIlII[llllIIIlIllI[0]]);
            return llllIIIlIllI[0];
        }
        this.sleep(llllIIIlIllI[3]);
        return llllIIIlIllI[1];
    }

    private static boolean lIIIllllIIIlllI(int n2) {
        return n2 != 0;
    }
}

