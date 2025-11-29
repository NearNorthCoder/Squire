/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.client.eventbus.EventBus
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package r.e.o.r.h.s.b.e.q.l.e.u.-.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.client.eventbus.EventBus;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.a;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.b;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.d;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.g;

@TaskDesc(name="Banking")
public class f
extends d {
    private /* synthetic */ c e;
    private final /* synthetic */ EventBus o;
    private /* synthetic */ b f;
    private /* synthetic */ e g;
    private static final /* synthetic */ Logger n;
    private static /* synthetic */ String[] lllIlIIIIIII;
    private static /* synthetic */ int[] lllIlIIIIIIl;

    private static boolean lIIIlIllIllIllI(int n) {
        return n != 0;
    }

    private static boolean lIIIlIllIllIlII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIIIlIllIllIIII(String lllllllllllllllIIllIIlIlIIIIIlII, String lllllllllllllllIIllIIlIlIIIIlIII) {
        lllllllllllllllIIllIIlIlIIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIlIIIIIlll = new StringBuilder();
        char[] lllllllllllllllIIllIIlIlIIIIIllI = lllllllllllllllIIllIIlIlIIIIlIII.toCharArray();
        int lllllllllllllllIIllIIlIlIIIIIlIl = lllIlIIIIIIl[0];
        char[] lllllllllllllllIIllIIlIIllllllll = lllllllllllllllIIllIIlIlIIIIIlII.toCharArray();
        int lllllllllllllllIIllIIlIIlllllllI = lllllllllllllllIIllIIlIIllllllll.length;
        int lllllllllllllllIIllIIlIIllllllIl = lllIlIIIIIIl[0];
        while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIlllIII(lllllllllllllllIIllIIlIIllllllIl, lllllllllllllllIIllIIlIIlllllllI)) {
            char lllllllllllllllIIllIIlIlIIIIlIlI = lllllllllllllllIIllIIlIIllllllll[lllllllllllllllIIllIIlIIllllllIl];
            lllllllllllllllIIllIIlIlIIIIIlll.append((char)(lllllllllllllllIIllIIlIlIIIIlIlI ^ lllllllllllllllIIllIIlIlIIIIIllI[lllllllllllllllIIllIIlIlIIIIIlIl % lllllllllllllllIIllIIlIlIIIIIllI.length]));
            "".length();
            ++lllllllllllllllIIllIIlIlIIIIIlIl;
            ++lllllllllllllllIIllIIlIIllllllIl;
            "".length();
            if (" ".length() != "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlIlIIIIIlll);
    }

    private static void lIIIlIllIllIIll() {
        lllIlIIIIIIl = new int[9];
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0] = (0x20 ^ 0x74 ^ (0x3B ^ 0x73)) & (0x42 ^ 0x7D ^ (0x1C ^ 0x3F) ^ -" ".length());
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[1] = " ".length();
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[2] = 170 + 206 - 265 + 116;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[3] = "  ".length();
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[4] = "   ".length();
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[5] = 7 + 19 - -46 + 78 ^ 89 + 74 - 124 + 113;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[6] = 0xBE ^ 0xBA;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[7] = 102 + 144 - 70 + 12 ^ 117 + 92 - 65 + 41;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[8] = 6 ^ 0;
    }

    static {
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIIll();
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIIlI();
        n = LoggerFactory.getLogger(f.class);
    }

    private static boolean lIIIlIllIlllIIl(int n, int n2) {
        return n == n2;
    }

    private boolean p() {
        f lllllllllllllllIIllIIlIlIIllIlIl;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
        }
        Iterator<Integer> lllllllllllllllIIllIIlIlIIllIlII = lllllllllllllllIIllIIlIlIIllIlIl.g.n().keySet().iterator();
        while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(lllllllllllllllIIllIIlIlIIllIlII.hasNext() ? 1 : 0)) {
            Integer lllllllllllllllIIllIIlIlIIllIIll = lllllllllllllllIIllIIlIlIIllIlII.next();
            int[] nArray = new int[lllIlIIIIIIl[1]];
            nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllllllllllllllIIllIIlIlIIllIIll;
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0) && r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.contains(item -> {
                int n2;
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIlllIIl(item.getId(), lllllllllllllllIIllIIlIlIIllIIll) && r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(item.isStackable() ? 1 : 0)) {
                    n2 = lllIlIIIIIIl[1];
                    "".length();
                    if (null != null) {
                        return ((0xC5 ^ 0xA3 ^ (0x3A ^ 0x16)) & (82 + 142 - 123 + 104 ^ 72 + 43 - 20 + 40 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lllIlIIIIIIl[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                Object[] objectArray = new Object[lllIlIIIIIIl[1]];
                objectArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(lllllllllllllllIIllIIlIlIIllIlIl.f);
                Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[0]], (Object[])objectArray);
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)lllllllllllllllIIllIIlIlIIllIlIl.e, (Object)c.ALL_STAGES_ALL_HERBS) || r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)lllllllllllllllIIllIIlIlIIllIlIl.f, (Object)b.values()[b.values().length - lllIlIIIIIIl[1]])) {
                    Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[1]]);
                    lllllllllllllllIIllIIlIlIIllIlIl.k().forceStop();
                }
                return lllIlIIIIIIl[0];
            }
            int[] nArray2 = new int[lllIlIIIIIIl[1]];
            nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllllllllllllllIIllIIlIlIIllIIll;
            Item lllllllllllllllIIllIIlIlIIllIIlI = Bank.getFirst((int[])nArray2);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(lllllllllllllllIIllIIlIlIIllIIlI.isStackable() ? 1 : 0)) {
                Bank.withdrawAll((int)lllllllllllllllIIllIIlIlIIllIIll, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                "".length();
                if (" ".length() < " ".length()) {
                    return ("   ".length() & ~"   ".length()) != 0;
                }
            } else {
                Bank.withdraw((int)lllllllllllllllIIllIIlIlIIllIIll, (int)lllllllllllllllIIllIIlIlIIllIlIl.g.n().get(lllllllllllllllIIllIIlIlIIllIIll), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
            "".length();
            if ((0x4E ^ 0x4B) != 0) continue;
            return ((0x9F ^ 0xAD) & ~(0x86 ^ 0xB4)) != 0;
        }
        return lllIlIIIIIIl[1];
    }

    private boolean u() {
        return this.a(this.e);
    }

    private boolean o() {
        switch (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.g.p[this.e.ordinal()]) {
            case 1: {
                f lllllllllllllllIIllIIlIlIIlllIlI;
                return lllllllllllllllIIllIIlIlIIlllIlI.r();
            }
            case 2: {
                f lllllllllllllllIIllIIlIlIIlllIlI;
                return lllllllllllllllIIllIIlIlIIlllIlI.q();
            }
            case 3: {
                f lllllllllllllllIIllIIlIlIIlllIlI;
                return lllllllllllllllIIllIIlIlIIlllIlI.p();
            }
        }
        return lllIlIIIIIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    private void t() {
        f lllllllllllllllIIllIIlIlIIlIIlIl;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)this.e, (Object)c.FINISH_POTS)) {
            Item item2 = Bank.getAll(item -> Arrays.stream(b.values()).anyMatch(b2 -> b2.a(item.getId()))).stream().min(Comparator.comparingInt(Item::getId)).orElse(null);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlll(item2)) {
                return;
            }
            b[] lllllllllllllllIIllIIlIlIIlIIIll = b.values();
            int lllllllllllllllIIllIIlIlIIlIIIlI = lllllllllllllllIIllIIlIlIIlIIIll.length;
            int lllllllllllllllIIllIIlIlIIlIIIIl = lllIlIIIIIIl[0];
            while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIlllIII(lllllllllllllllIIllIIlIlIIlIIIIl, lllllllllllllllIIllIIlIlIIlIIIlI)) {
                void lllllllllllllllIIllIIlIlIIlIIlII;
                b lllllllllllllllIIllIIlIlIIlIIIII = lllllllllllllllIIllIIlIlIIlIIIll[lllllllllllllllIIllIIlIlIIlIIIIl];
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(lllllllllllllllIIllIIlIlIIlIIIII.a(lllllllllllllllIIllIIlIlIIlIIlII.getId()) ? 1 : 0)) {
                    lllllllllllllllIIllIIlIlIIlIIlIl.f = lllllllllllllllIIllIIlIlIIlIIIII;
                    lllllllllllllllIIllIIlIlIIlIIlIl.e = lllllllllllllllIIllIIlIlIIlIIIII.b(lllllllllllllllIIllIIlIlIIlIIlII.getId());
                    lllllllllllllllIIllIIlIlIIlIIlIl.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(lllllllllllllllIIllIIlIlIIlIIlIl.f);
                    lllllllllllllllIIllIIlIlIIlIIlIl.o.post((Object)new a(lllllllllllllllIIllIIlIlIIlIIlIl.e, lllllllllllllllIIllIIlIlIIlIIlIl.f, lllllllllllllllIIllIIlIlIIlIIlIl.g));
                    "".length();
                    if ("  ".length() > -" ".length()) break;
                    return;
                }
                ++lllllllllllllllIIllIIlIlIIlIIIIl;
                "".length();
                if ((0x70 ^ 0x74) > ((0x39 ^ 0x6D) & ~(0x52 ^ 6))) continue;
                return;
            }
            "".length();
            if ((0x41 ^ 0x45) != (0x8C ^ 0x88)) {
                return;
            }
        } else {
            lllllllllllllllIIllIIlIlIIlIIlIl.s();
        }
    }

    private void s() {
        switch (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.g.p[this.e.ordinal()]) {
            case 1: {
                lllllllllllllllIIllIIlIlIIlIllII.e = c.MAKE_UNF_POTS;
                "".length();
                if (((70 + 101 - 131 + 141 ^ 102 + 106 - 72 + 7) & (0x37 ^ 0x4D ^ (0x5F ^ 0x1F) ^ -" ".length())) >= 0) break;
                return;
            }
            case 2: {
                lllllllllllllllIIllIIlIlIIlIllII.e = c.FINISH_POTS;
            }
        }
        this.o.post((Object)new a(this.e, this.f, this.g));
    }

    private boolean r() {
        int[] nArray = new int[lllIlIIIIIIl[1]];
        nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = this.f.e();
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            Object[] objectArray = new Object[lllIlIIIIIIl[1]];
            objectArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = this.f;
            Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[6]], (Object[])objectArray);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)this.e, (Object)c.CLEAN_HERBS)) {
                Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[7]]);
                this.k().forceStop();
            }
            return lllIlIIIIIIl[0];
        }
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
        }
        Bank.withdrawAll((int)this.j().herb().e(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return lllIlIIIIIIl[1];
    }

    private static boolean lIIIlIllIllIlIl(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(c c2) {
        switch (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.g.p[c2.ordinal()]) {
            case 1: {
                boolean bl;
                f lllllllllllllllIIllIIlIlIIIllIll;
                int[] nArray = new int[lllIlIIIIIIl[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllllllllllllllIIllIIlIlIIIllIll.j().herb().e();
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    bl = lllIlIIIIIIl[1];
                    "".length();
                    if (((6 ^ 0x15 ^ (0x49 ^ 0x54)) & (0x1B ^ 0x45 ^ (0x93 ^ 0xC3) ^ -" ".length())) >= 0) return bl;
                    return ((21 + 205 - 191 + 192 ^ 17 + 107 - 78 + 125) & (0xFB ^ 0x97 ^ (0x4A ^ 0x6E) ^ -" ".length())) != 0;
                }
                bl = lllIlIIIIIIl[0];
                return bl;
            }
            case 2: {
                int n;
                f lllllllllllllllIIllIIlIlIIIllIll;
                int[] nArray = new int[lllIlIIIIIIl[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllllllllllllllIIllIIlIlIIIllIll.f.f();
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(Inventory.getCount((int[])nArray))) {
                    int[] nArray2 = new int[lllIlIIIIIIl[1]];
                    nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllIlIIIIIIl[2];
                    if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.getCount((int[])nArray2))) {
                        n = lllIlIIIIIIl[0];
                        return n != 0;
                    }
                }
                n = lllIlIIIIIIl[1];
                "".length();
                if ("   ".length() == "   ".length()) return n != 0;
                return ((0xC ^ 0x6D ^ (0x63 ^ 0x4C)) & (0x6D ^ 0 ^ (0x90 ^ 0xB3) ^ -" ".length())) != 0;
            }
            case 3: {
                f lllllllllllllllIIllIIlIlIIIllIll;
                Iterator<Integer> lllllllllllllllIIllIIlIlIIIllIIl = lllllllllllllllIIllIIlIlIIIllIll.g.n().keySet().iterator();
                do {
                    if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(lllllllllllllllIIllIIlIlIIIllIIl.hasNext() ? 1 : 0)) return lllIlIIIIIIl[0];
                    Integer lllllllllllllllIIllIIlIlIIIllIII = lllllllllllllllIIllIIlIlIIIllIIl.next();
                    int[] nArray = new int[lllIlIIIIIIl[1]];
                    nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllllllllllllllIIllIIlIlIIIllIII;
                    if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        return lllIlIIIIIIl[1];
                    }
                    "".length();
                } while ("  ".length() > 0);
                return ((0x8B ^ 0xBA ^ (0x8A ^ 0xAB)) & (0x55 ^ 0x20 ^ (0x36 ^ 0x53) ^ -" ".length())) != 0;
            }
            case 4: 
            case 5: {
                void lllllllllllllllIIllIIlIlIIIllIlI;
                f lllllllllllllllIIllIIlIlIIIllIll;
                return lllllllllllllllIIllIIlIlIIIllIll.a((c)lllllllllllllllIIllIIlIlIIIllIlI);
            }
        }
        return lllIlIIIIIIl[0];
    }

    @Override
    public boolean h() {
        f lllllllllllllllIIllIIlIlIIllllIl;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(this.u() ? 1 : 0)) {
            return lllIlIIIIIIl[0];
        }
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            "".length();
            return lllIlIIIIIIl[1];
        }
        int lllllllllllllllIIllIIlIlIIllllII = lllllllllllllllIIllIIlIlIIllllIl.o() ? 1 : 0;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(lllllllllllllllIIllIIlIlIIllllII)) {
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)lllllllllllllllIIllIIlIlIIllllIl.j().method(), (Object)c.ALL_STAGES)) {
                lllllllllllllllIIllIIlIlIIllllIl.s();
                return lllIlIIIIIIl[1];
            }
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)lllllllllllllllIIllIIlIlIIllllIl.j().method(), (Object)c.ALL_STAGES_ALL_HERBS)) {
                lllllllllllllllIIllIIlIlIIllllIl.t();
                return lllIlIIIIIIl[1];
            }
        }
        return lllIlIIIIIIl[0];
    }

    private static boolean lIIIlIllIllIlll(Object object) {
        return object == null;
    }

    private static String lIIIlIllIllIIIl(String lllllllllllllllIIllIIlIIllllIlII, String lllllllllllllllIIllIIlIIllllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIIllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIIllllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIIllllIllI.init(lllIlIIIIIIl[3], lllllllllllllllIIllIIlIIllllIlll);
            return new String(lllllllllllllllIIllIIlIIllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIIllllIlIl) {
            lllllllllllllllIIllIIlIIllllIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Inject
    public f(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig, EventBus eventBus) {
        super(squireHerblore, herbloreConfig, c.values());
        void lllllllllllllllIIllIIlIlIlIIIIIl;
        this.o = eventBus;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)herbloreConfig.method(), (Object)c.ALL_STAGES_ALL_HERBS)) {
            this.f = b.GUAM_LEAF;
            this.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.ATTACK_POTION;
            this.e = c.CLEAN_HERBS;
            "".length();
            if ("  ".length() < 0) {
                throw null;
            }
        } else if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)lllllllllllllllIIllIIlIlIlIIIIIl.method(), (Object)c.ALL_STAGES)) {
            f lllllllllllllllIIllIIlIlIlIIIIll;
            lllllllllllllllIIllIIlIlIlIIIIll.f = lllllllllllllllIIllIIlIlIlIIIIIl.herb();
            lllllllllllllllIIllIIlIlIlIIIIll.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(lllllllllllllllIIllIIlIlIlIIIIll.f);
            lllllllllllllllIIllIIlIlIlIIIIll.e = c.CLEAN_HERBS;
            "".length();
            if (-" ".length() > "  ".length()) {
                throw null;
            }
        } else {
            lllllllllllllllIIllIIlIlIlIIIIll.f = lllllllllllllllIIllIIlIlIlIIIIIl.herb();
            lllllllllllllllIIllIIlIlIlIIIIll.g = lllllllllllllllIIllIIlIlIlIIIIIl.potion();
            lllllllllllllllIIllIIlIlIlIIIIll.e = lllllllllllllllIIllIIlIlIlIIIIIl.method();
        }
    }

    private boolean q() {
        block6: {
            f lllllllllllllllIIllIIlIlIIllIIII;
            block5: {
                int[] nArray = new int[lllIlIIIIIIl[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = this.f.f();
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block5;
                int[] nArray2 = new int[lllIlIIIIIIl[1]];
                nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllIlIIIIIIl[2];
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block6;
            }
            Object[] objectArray = new Object[lllIlIIIIIIl[1]];
            objectArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllllllllllllllIIllIIlIlIIllIIII.f;
            Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[3]], (Object[])objectArray);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)lllllllllllllllIIllIIlIlIIllIIII.e, (Object)c.MAKE_UNF_POTS)) {
                Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[4]]);
                lllllllllllllllIIllIIlIlIIllIIII.k().forceStop();
            }
            return lllIlIIIIIIl[0];
        }
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
        }
        Bank.withdraw((int)this.f.f(), (int)lllIlIIIIIIl[5], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        Bank.withdraw((int)lllIlIIIIIIl[2], (int)lllIlIIIIIIl[5], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return lllIlIIIIIIl[1];
    }

    private static void lIIIlIllIllIIlI() {
        lllIlIIIIIII = new String[lllIlIIIIIIl[8]];
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIIII("Cwx5BTg3BnkLOCgTNgYyKxcqSCMqQzQJPCBDIhV3LA15CjYrCA==", "EcYhW");
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[1]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIIII("FQwHGgUvFg9KBSoNDwMbalgACwMjWAlKGy8bDUoRJwFIUFw=", "Fxhju");
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[3]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIIII("KAtaPj4UAVo7NBQGCXM+FEQMOjAKF1onPkYJGzg0RhEUNXEdGVojPhIX", "fdzSQ");
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[4]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIIIl("GeYvNZia9AsXA1eufrKS6mSzTS8zACBsFixHyYtPajEGUDKQUiO4hA==", "Ujxnf");
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[6]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIIII("GSRkCiclLmQcNXc/K0crOy4lCQ==", "WKDgH");
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[7]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIIIl("bdIVPCzjUqbZ0q/ThFE+romxQthaTxrTiXXC8zbQCUaAQp6sHg754w==", "QzCMe");
    }

    private static boolean lIIIlIllIlllIII(int n, int n2) {
        return n < n2;
    }
}

