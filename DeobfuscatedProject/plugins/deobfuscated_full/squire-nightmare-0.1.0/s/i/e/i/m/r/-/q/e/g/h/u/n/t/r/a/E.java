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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.F;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

/* TASK: Using Bank loadout -> UsingbankloadoutTask */
@TaskDesc(name="Using Bank loadout", priority=999, blocking=true)
public class E
extends F {
    private static /* synthetic */ int[] llllIIIlIllI;
    private static /* synthetic */ String[] llllIIIlIlII;
    private static final /* synthetic */ Logger cY;

    private static void lIIIllllIIIllIl() {
        llllIIIlIllI = new int[4];
        E.llllIIIlIllI[0] = (0x36 ^ 0x12) & ~(0x50 ^ 0x74);
        E.llllIIIlIllI[1] = 1;
        E.llllIIIlIllI[2] = 47 + 80 - 62 + 84 ^ 51 + 139 - 158 + 112;
        E.llllIIIlIllI[3] = 2;
    }

    private static String lIIIllllIIIIllI(String var14, String var6) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(llllIIIlIllI[3], var12);
            return new String(var15.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String lIIIllllIIIIlIl(String var8, String var13) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var2 = var13.toCharArray();
        int var3 = llllIIIlIllI[0];
        char[] var5 = var8.toCharArray();
        int var10 = var5.length;
        int var11 = llllIIIlIllI[0];
        while (E.lIIIllllIIlIIII(var11, var10)) {
            char var16 = var5[var11];
            var1.append((char)(var16 ^ var2[var3 % var2.length]));
            0;
            ++var3;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var1);
    }

    @Inject
    public E(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void lIIIllllIIIIlll() {
        llllIIIlIlII = new String[llllIIIlIllI[3]];
        E.llllIIIlIlII[E.llllIIIlIllI[0]] = E."[BankLoadoutTask]: Failed to withdraw bank loadout after 5 retries.";
        E.llllIIIlIlII[E.llllIIIlIllI[1]] = E."stamina potion";
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
        cY = LoggerFactory.getLogger(E.class);
    }

    @Override
    public boolean bY() {
        E var7;
        if (E.lIIIllllIIIlllI(this.cW.ae() ? 1 : 0)) {
            return llllIIIlIllI[0];
        }
        if (E.lIIIllllIIIlllI(var7.cW.n() ? 1 : 0)) {
            return llllIIIlIllI[0];
        }
        if (E.lIIIllllIIIllll(Bank.isOpen() ? 1 : 0)) {
            return Bank.open();
        }
        Predicate<Item> var4 = item -> {
            int n2;
            if (E.lIIIllllIIIlllI(item.getName().toLowerCase().contains(llllIIIlIlII[llllIIIlIllI[1]]) ? 1 : 0) && E.lIIIllllIIIllll(item.isPlaceholder() ? 1 : 0)) {
                n2 = llllIIIlIllI[1];
                0;
                if ((0x54 ^ 0x50) == 0) {
                    return false;
                }
            } else {
                n2 = llllIIIlIllI[0];
            }
            return n2 != 0;
        };
        if (E.lIIIllllIIIlllI(var7.cb() ? 1 : 0) && E.lIIIllllIIIlllI(Bank.contains(var4) ? 1 : 0)) {
            return var7.a(var4, llllIIIlIllI[1]);
        }
        if (E.lIIIllllIIIllll(var7.ce().needsToBank() ? 1 : 0)) {
            Bank.close();
            return llllIIIlIllI[1];
        }
        if (E.lIIIllllIIIllll(BankLoadouts.withdrawWithRetries((BankLoadout)var7.ce(), (int)llllIIIlIllI[2]).booleanValue() ? 1 : 0)) {
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

