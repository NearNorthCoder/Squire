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

@TaskDesc(name="Using Bank loadout", priority=999, blocking=true)
public class E
extends F {
    private static /* synthetic */ int[] llllIIIlIllI;
    private static /* synthetic */ String[] llllIIIlIlII;
    private static final /* synthetic */ Logger cY;

    private static void lIIIllllIIIllIl() {
        llllIIIlIllI = new int[4];
        E.llllIIIlIllI[0] = (0x36 ^ 0x12) & ~(0x50 ^ 0x74);
        E.llllIIIlIllI[1] = " ".length();
        E.llllIIIlIllI[2] = 47 + 80 - 62 + 84 ^ 51 + 139 - 158 + 112;
        E.llllIIIlIllI[3] = "  ".length();
    }

    private static String lIIIllllIIIIllI(String lllllllllllllllIIlIlllllllIllIll, String lllllllllllllllIIlIlllllllIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllllllIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllllllIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllllllIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllllllIlllIl.init(llllIIIlIllI[3], lllllllllllllllIIlIlllllllIllllI);
            return new String(lllllllllllllllIIlIlllllllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllllllIlllII) {
            lllllllllllllllIIlIlllllllIlllII.printStackTrace();
            return null;
        }
    }

    private static String lIIIllllIIIIlIl(String lllllllllllllllIIlIlllllllIIlIll, String lllllllllllllllIIlIlllllllIIlIlI) {
        lllllllllllllllIIlIlllllllIIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllllllIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllllllIIlIIl = new StringBuilder();
        char[] lllllllllllllllIIlIlllllllIIlIII = lllllllllllllllIIlIlllllllIIlIlI.toCharArray();
        int lllllllllllllllIIlIlllllllIIIlll = llllIIIlIllI[0];
        char[] lllllllllllllllIIlIlllllllIIIIIl = lllllllllllllllIIlIlllllllIIlIll.toCharArray();
        int lllllllllllllllIIlIlllllllIIIIII = lllllllllllllllIIlIlllllllIIIIIl.length;
        int lllllllllllllllIIlIllllllIllllll = llllIIIlIllI[0];
        while (E.lIIIllllIIlIIII(lllllllllllllllIIlIllllllIllllll, lllllllllllllllIIlIlllllllIIIIII)) {
            char lllllllllllllllIIlIlllllllIIllII = lllllllllllllllIIlIlllllllIIIIIl[lllllllllllllllIIlIllllllIllllll];
            lllllllllllllllIIlIlllllllIIlIIl.append((char)(lllllllllllllllIIlIlllllllIIllII ^ lllllllllllllllIIlIlllllllIIlIII[lllllllllllllllIIlIlllllllIIIlll % lllllllllllllllIIlIlllllllIIlIII.length]));
            "".length();
            ++lllllllllllllllIIlIlllllllIIIlll;
            ++lllllllllllllllIIlIllllllIllllll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlllllllIIlIIl);
    }

    @Inject
    public E(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void lIIIllllIIIIlll() {
        llllIIIlIlII = new String[llllIIIlIllI[3]];
        E.llllIIIlIlII[E.llllIIIlIllI[0]] = E.lIIIllllIIIIlIl("FDIPOAMDHw8yBzoEOjcbJC1Udi4uGQIzDG8EAXYfJgQGMhouB040CSEbTjoHLhQBIxxvEQgiDT1QW3YaKgQcPw08Xg==", "OpnVh");
        E.llllIIIlIlII[E.llllIIIlIllI[1]] = E.lIIIllllIIIIllI("XTBPlehAYc6WyCCIRKqwFQ==", "wCHgo");
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
        E lllllllllllllllIIlIllllllllIIllI;
        if (E.lIIIllllIIIlllI(this.cW.ae() ? 1 : 0)) {
            return llllIIIlIllI[0];
        }
        if (E.lIIIllllIIIlllI(lllllllllllllllIIlIllllllllIIllI.cW.n() ? 1 : 0)) {
            return llllIIIlIllI[0];
        }
        if (E.lIIIllllIIIllll(Bank.isOpen() ? 1 : 0)) {
            return Bank.open();
        }
        Predicate<Item> lllllllllllllllIIlIllllllllIIlIl = item -> {
            int n2;
            if (E.lIIIllllIIIlllI(item.getName().toLowerCase().contains(llllIIIlIlII[llllIIIlIllI[1]]) ? 1 : 0) && E.lIIIllllIIIllll(item.isPlaceholder() ? 1 : 0)) {
                n2 = llllIIIlIllI[1];
                "".length();
                if ((0x54 ^ 0x50) == 0) {
                    return ((0x52 ^ 0x56) & ~(0x9E ^ 0x9A)) != 0;
                }
            } else {
                n2 = llllIIIlIllI[0];
            }
            return n2 != 0;
        };
        if (E.lIIIllllIIIlllI(lllllllllllllllIIlIllllllllIIllI.cb() ? 1 : 0) && E.lIIIllllIIIlllI(Bank.contains(lllllllllllllllIIlIllllllllIIlIl) ? 1 : 0)) {
            return lllllllllllllllIIlIllllllllIIllI.a(lllllllllllllllIIlIllllllllIIlIl, llllIIIlIllI[1]);
        }
        if (E.lIIIllllIIIllll(lllllllllllllllIIlIllllllllIIllI.ce().needsToBank() ? 1 : 0)) {
            Bank.close();
            return llllIIIlIllI[1];
        }
        if (E.lIIIllllIIIllll(BankLoadouts.withdrawWithRetries((BankLoadout)lllllllllllllllIIlIllllllllIIllI.ce(), (int)llllIIIlIllI[2]).booleanValue() ? 1 : 0)) {
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

