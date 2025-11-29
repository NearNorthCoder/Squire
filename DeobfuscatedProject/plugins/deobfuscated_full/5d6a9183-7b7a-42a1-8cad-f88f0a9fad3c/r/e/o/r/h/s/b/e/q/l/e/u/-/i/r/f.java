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

/* TASK: Banking -> BankingTask */
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

    private static String lIIIlIllIllIIII(String var17, String var32) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var11 = var32.toCharArray();
        int var26 = lllIlIIIIIIl[0];
        char[] var8 = var17.toCharArray();
        int var19 = var8.length;
        int var35 = lllIlIIIIIIl[0];
        while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIlllIII(var35, var19)) {
            char var6 = var8[var35];
            var1.append((char)(var6 ^ var11[var26 % var11.length]));
            0;
            ++var26;
            ++var35;
            0;
            if (1 != 3) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static void lIIIlIllIllIIll() {
        lllIlIIIIIIl = new int[9];
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0] = (0x20 ^ 0x74 ^ (0x3B ^ 0x73)) & (0x42 ^ 0x7D ^ (0x1C ^ 0x3F) ^ -1);
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[1] = 1;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[2] = 170 + 206 - 265 + 116;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[3] = 2;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[4] = 3;
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
        f var27;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
        }
        Iterator<Integer> var20 = var27.g.n().keySet().iterator();
        while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(var20.hasNext() ? 1 : 0)) {
            Integer var21 = var20.next();
            int[] nArray = new int[lllIlIIIIIIl[1]];
            nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var21;
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0) && r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.contains(item -> {
                int n2;
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIlllIIl(item.getId(), var21) && r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(item.isStackable() ? 1 : 0)) {
                    n2 = lllIlIIIIIIl[1];
                    0;
                    
                    }
                } else {
                    n2 = lllIlIIIIIIl[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                Object[] objectArray = new Object[lllIlIIIIIIl[1]];
                objectArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(var27.f);
                Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[0]], (Object[])objectArray);
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var27.e, (Object)c.ALL_STAGES_ALL_HERBS) || r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var27.f, (Object)b.values()[b.values().length - lllIlIIIIIIl[1]])) {
                    Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[1]]);
                    var27.k().forceStop();
                }
                return lllIlIIIIIIl[0];
            }
            int[] nArray2 = new int[lllIlIIIIIIl[1]];
            nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var21;
            Item var2 = Bank.getFirst((int[])nArray2);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(var2.isStackable() ? 1 : 0)) {
                Bank.withdrawAll((int)var21, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                0;
                if (1 < 1) {
                    return (3 & ~3) != 0;
                }
            } else {
                Bank.withdraw((int)var21, (int)var27.g.n().get(var21), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
            0;
            if ((0x4E ^ 0x4B) != 0) continue;
            return false;
        }
        return lllIlIIIIIIl[1];
    }

    private boolean u() {
        return this.a(this.e);
    }

    private boolean o() {
        switch (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.g.p[this.e.ordinal()]) {
            case 1: {
                f var24;
                return var24.r();
            }
            case 2: {
                f var24;
                return var24.q();
            }
            case 3: {
                f var24;
                return var24.p();
            }
        }
        return lllIlIIIIIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    private void t() {
        f var30;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)this.e, (Object)c.FINISH_POTS)) {
            Item item2 = Bank.getAll(item -> Arrays.stream(b.values()).anyMatch(b2 -> b2.a(item.getId()))).stream().min(Comparator.comparingInt(Item::getId)).orElse(null);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlll(item2)) {
                return;
            }
            b[] var3 = b.values();
            int var23 = var3.length;
            int var34 = lllIlIIIIIIl[0];
            while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIlllIII(var34, var23)) {
                void var13;
                b var18 = var3[var34];
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(var18.a(var13.getId()) ? 1 : 0)) {
                    var30.f = var18;
                    var30.e = var18.b(var13.getId());
                    var30.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(var30.f);
                    var30.o.post((Object)new a(var30.e, var30.f, var30.g));
                    0;
                    if (2 > -1) break;
                    return;
                }
                ++var34;
                0;
                if ((0x70 ^ 0x74) > ((0x39 ^ 0x6D) & ~(0x52 ^ 6))) continue;
                return;
            }
            0;
            if ((0x41 ^ 0x45) != (0x8C ^ 0x88)) {
                return;
            }
        } else {
            var30.s();
        }
    }

    private void s() {
        switch (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.g.p[this.e.ordinal()]) {
            case 1: {
                var12.e = c.MAKE_UNF_POTS;
                0;
                if (((70 + 101 - 131 + 141 ^ 102 + 106 - 72 + 7) & (0x37 ^ 0x4D ^ (0x5F ^ 0x1F) ^ -1)) >= 0) break;
                return;
            }
            case 2: {
                var12.e = c.FINISH_POTS;
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
                f var29;
                int[] nArray = new int[lllIlIIIIIIl[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var29.j().herb().e();
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    bl = lllIlIIIIIIl[1];
                    0;
                    if (((6 ^ 0x15 ^ (0x49 ^ 0x54)) & (0x1B ^ 0x45 ^ (0x93 ^ 0xC3) ^ -1)) >= 0) return bl;
                    return ((21 + 205 - 191 + 192 ^ 17 + 107 - 78 + 125) & (0xFB ^ 0x97 ^ (0x4A ^ 0x6E) ^ -1)) != 0;
                }
                bl = lllIlIIIIIIl[0];
                return bl;
            }
            case 2: {
                int n;
                f var29;
                int[] nArray = new int[lllIlIIIIIIl[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var29.f.f();
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(Inventory.getCount((int[])nArray))) {
                    int[] nArray2 = new int[lllIlIIIIIIl[1]];
                    nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllIlIIIIIIl[2];
                    if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.getCount((int[])nArray2))) {
                        n = lllIlIIIIIIl[0];
                        return n != 0;
                    }
                }
                n = lllIlIIIIIIl[1];
                0;
                if (3 == 3) return n != 0;
                return ((0xC ^ 0x6D ^ (0x63 ^ 0x4C)) & (0x6D ^ 0 ^ (0x90 ^ 0xB3) ^ -1)) != 0;
            }
            case 3: {
                f var29;
                Iterator<Integer> var22 = var29.g.n().keySet().iterator();
                do {
                    if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(var22.hasNext() ? 1 : 0)) return lllIlIIIIIIl[0];
                    Integer var33 = var22.next();
                    int[] nArray = new int[lllIlIIIIIIl[1]];
                    nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var33;
                    if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        return lllIlIIIIIIl[1];
                    }
                    0;
                } while (2 > 0);
                return ((0x8B ^ 0xBA ^ (0x8A ^ 0xAB)) & (0x55 ^ 0x20 ^ (0x36 ^ 0x53) ^ -1)) != 0;
            }
            case 4: 
            case 5: {
                void var9;
                f var29;
                return var29.a((c)var9);
            }
        }
        return lllIlIIIIIIl[0];
    }

    @Override
    public boolean h() {
        f var28;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(this.u() ? 1 : 0)) {
            return lllIlIIIIIIl[0];
        }
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return lllIlIIIIIIl[1];
        }
        int var5 = var28.o() ? 1 : 0;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(var5)) {
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var28.j().method(), (Object)c.ALL_STAGES)) {
                var28.s();
                return lllIlIIIIIIl[1];
            }
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var28.j().method(), (Object)c.ALL_STAGES_ALL_HERBS)) {
                var28.t();
                return lllIlIIIIIIl[1];
            }
        }
        return lllIlIIIIIIl[0];
    }

    private static boolean lIIIlIllIllIlll(Object object) {
        return object == null;
    }

    private static String lIIIlIllIllIIIl(String var7, String var31) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var31.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lllIlIIIIIIl[3], var25);
            return new String(var4.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Inject
    public f(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig, EventBus eventBus) {
        super(squireHerblore, herbloreConfig, c.values());
        void var14;
        this.o = eventBus;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)herbloreConfig.method(), (Object)c.ALL_STAGES_ALL_HERBS)) {
            this.f = b.GUAM_LEAF;
            this.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.ATTACK_POTION;
            this.e = c.CLEAN_HERBS;
            0;
            if (2 < 0) {
                throw null;
            }
        } else if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var14.method(), (Object)c.ALL_STAGES)) {
            f var15;
            var15.f = var14.herb();
            var15.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(var15.f);
            var15.e = c.CLEAN_HERBS;
            0;
            if (-1 > 2) {
                throw null;
            }
        } else {
            var15.f = var14.herb();
            var15.g = var14.potion();
            var15.e = var14.method();
        }
    }

    private boolean q() {
        block6: {
            f var16;
            block5: {
                int[] nArray = new int[lllIlIIIIIIl[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = this.f.f();
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block5;
                int[] nArray2 = new int[lllIlIIIIIIl[1]];
                nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllIlIIIIIIl[2];
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block6;
            }
            Object[] objectArray = new Object[lllIlIIIIIIl[1]];
            objectArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var16.f;
            Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[3]], (Object[])objectArray);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var16.e, (Object)c.MAKE_UNF_POTS)) {
                Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[4]]);
                var16.k().forceStop();
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
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f."No more components to make {} in bank";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[1]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f."Stopping plugin, have a nice day :)";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[3]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f."No more herbs or vials to make unf {} pots";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[4]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f."Stopping plugin, have a nice day :)";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[6]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f."No more {} to clean";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[7]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f."Stopping plugin, have a nice day :)";
    }

    private static boolean lIIIlIllIlllIII(int n, int n2) {
        return n < n2;
    }
}

