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
package gg.squire.herblore.tasks;

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
import gg.squire.herblore.tasks.AHelper;
import gg.squire.herblore.tasks.GameEnum;
import gg.squire.herblore.tasks.GameEnum3;
import gg.squire.herblore.tasks.HerbloreTaskBase;
import gg.squire.herblore.tasks.GameEnum5;
import gg.squire.herblore.tasks.GHelper;

@TaskDesc(name="Banking")
public class BankingTask
extends HerbloreTaskBase {
    private  c e;
    private final  EventBus o;
    private  b f;
    private  e g;
    private static final  Logger n;

    private static boolean lIIIlIllIllIllI(int n) {
        return n != 0;
    }

    private static boolean lIIIlIllIllIlII(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var1);
    }

    static {
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIIll();
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIIlI();
        n = LoggerFactory.getLogger(BankingTask.class);
    }

    private static boolean lIIIlIllIlllIIl(int n, int n2) {
        return n == n2;
    }

    private boolean p() {
        f var2;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
        }
        Iterator<Integer> var3 = var2.g.n().keySet().iterator();
        while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(var3.hasNext() ? 1 : 0)) {
            Integer var4 = var3.next();
            int[] nArray = new int[lllIlIIIIIIl[1]];
            nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var4;
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0) && r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.contains(item -> {
                int n2;
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIlllIIl(item.getId(), var4) && r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(item.isStackable() ? 1 : 0)) {
                    n2 = lllIlIIIIIIl[1];

                    }
                } else {
                    n2 = lllIlIIIIIIl[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                Object[] objectArray = new Object[lllIlIIIIIIl[1]];
                objectArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(var2.f);
                Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[0]], (Object[])objectArray);
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var2.e, (Object)c.ALL_STAGES_ALL_HERBS) || r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var2.f, (Object)b.values()[b.values().length - lllIlIIIIIIl[1]])) {
                    Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[1]]);
                    var2.k().forceStop();
                }
                return lllIlIIIIIIl[0];
            }
            int[] nArray2 = new int[lllIlIIIIIIl[1]];
            nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var4;
            Item var5 = Bank.getFirst((int[])nArray2);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(var5.isStackable() ? 1 : 0)) {
                Bank.withdrawAll((int)var4, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);

                if (1 < 1) {
                    return (3 & ~3) != 0;
                }
            } else {
                Bank.withdraw((int)var4, (int)var2.g.n().get(var4), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }

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
                f var6;
                return var6.r();
            }
            case 2: {
                f var6;
                return var6.q();
            }
            case 3: {
                f var6;
                return var6.p();
            }
        }
        return lllIlIIIIIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    private void t() {
        f var7;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)this.e, (Object)c.FINISH_POTS)) {
            Item item2 = Bank.getAll(item -> Arrays.stream(b.values()).anyMatch(b2 -> b2.a(item.getId()))).stream().min(Comparator.comparingInt(Item::getId)).orElse(null);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlll(item2)) {
                return;
            }
            b[] var8 = b.values();
            int var9 = var8.length;
            int var10 = lllIlIIIIIIl[0];
            while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIlllIII(var10, var9)) {
                void var11;
                b var12 = var8[var10];
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(var12.a(var11.getId()) ? 1 : 0)) {
                    var7.f = var12;
                    var7.e = var12.b(var11.getId());
                    var7.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(var7.f);
                    var7.o.post((Object)new AHelper(var7.e, var7.f, var7.g));

                    if (2 > -1) break;
                    return;
                }
                ++var10;

                if ((0x70 ^ 0x74) > ((0x39 ^ 0x6D) & ~(0x52 ^ 6))) continue;
                return;
            }

            if ((0x41 ^ 0x45) != (0x8C ^ 0x88)) {
                return;
            }
        } else {
            var7.s();
        }
    }

    private void s() {
        switch (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.g.p[this.e.ordinal()]) {
            case 1: {
                var13.e = c.MAKE_UNF_POTS;

                if (((70 + 101 - 131 + 141 ^ 102 + 106 - 72 + 7) & (0x37 ^ 0x4D ^ (0x5F ^ 0x1F) ^ -1)) >= 0) break;
                return;
            }
            case 2: {
                var13.e = c.FINISH_POTS;
            }
        }
        this.o.post((Object)new AHelper(this.e, this.f, this.g));
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
                f var14;
                int[] nArray = new int[lllIlIIIIIIl[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var14.j().herb().e();
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    bl = lllIlIIIIIIl[1];

                    if (((6 ^ 0x15 ^ (0x49 ^ 0x54)) & (0x1B ^ 0x45 ^ (0x93 ^ 0xC3) ^ -1)) >= 0) return bl;
                    return ((21 + 205 - 191 + 192 ^ 17 + 107 - 78 + 125) & (0xFB ^ 0x97 ^ (0x4A ^ 0x6E) ^ -1)) != 0;
                }
                bl = lllIlIIIIIIl[0];
                return bl;
            }
            case 2: {
                int n;
                f var14;
                int[] nArray = new int[lllIlIIIIIIl[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var14.f.BankingTask();
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(Inventory.getCount((int[])nArray))) {
                    int[] nArray2 = new int[lllIlIIIIIIl[1]];
                    nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllIlIIIIIIl[2];
                    if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.getCount((int[])nArray2))) {
                        n = lllIlIIIIIIl[0];
                        return n != 0;
                    }
                }
                n = lllIlIIIIIIl[1];

                if (3 == 3) return n != 0;
                return ((0xC ^ 0x6D ^ (0x63 ^ 0x4C)) & (0x6D ^ 0 ^ (0x90 ^ 0xB3) ^ -1)) != 0;
            }
            case 3: {
                f var14;
                Iterator<Integer> var15 = var14.g.n().keySet().iterator();
                do {
                    if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(var15.hasNext() ? 1 : 0)) return lllIlIIIIIIl[0];
                    Integer var16 = var15.next();
                    int[] nArray = new int[lllIlIIIIIIl[1]];
                    nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var16;
                    if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        return lllIlIIIIIIl[1];
                    }

                } while (2 > 0);
                return ((0x8B ^ 0xBA ^ (0x8A ^ 0xAB)) & (0x55 ^ 0x20 ^ (0x36 ^ 0x53) ^ -1)) != 0;
            }
            case 4: 
            case 5: {
                void var17;
                f var14;
                return var14.a((GameEnum3) ar17);
            }
        }
        return lllIlIIIIIIl[0];
    }

    @Override
    public boolean h() {
        f var18;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(this.u() ? 1 : 0)) {
            return lllIlIIIIIIl[0];
        }
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();

            return lllIlIIIIIIl[1];
        }
        int var19 = var18.o() ? 1 : 0;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(var19)) {
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var18.j().method(), (Object)c.ALL_STAGES)) {
                var18.s();
                return lllIlIIIIIIl[1];
            }
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var18.j().method(), (Object)c.ALL_STAGES_ALL_HERBS)) {
                var18.t();
                return lllIlIIIIIIl[1];
            }
        }
        return lllIlIIIIIIl[0];
    }

    private static boolean lIIIlIllIllIlll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Inject
    public BankingTask(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig, EventBus eventBus) {
        super(squireHerblore, herbloreConfig, c.values());
        void var20;
        this.o = eventBus;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)herbloreConfig.method(), (Object)c.ALL_STAGES_ALL_HERBS)) {
            this.f = b.GUAM_LEAF;
            this.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.ATTACK_POTION;
            this.e = c.CLEAN_HERBS;

            if (2 < 0) {
                throw null;
            }
        } else if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var20.method(), (Object)c.ALL_STAGES)) {
            f var21;
            var21.f = var20.herb();
            var21.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(var21.f);
            var21.e = c.CLEAN_HERBS;

            if (-1 > 2) {
                throw null;
            }
        } else {
            var21.f = var20.herb();
            var21.g = var20.potion();
            var21.e = var20.method();
        }
    }

    private boolean q() {
        block6: {
            f var22;
            block5: {
                int[] nArray = new int[lllIlIIIIIIl[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = this.f.BankingTask();
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block5;
                int[] nArray2 = new int[lllIlIIIIIIl[1]];
                nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = lllIlIIIIIIl[2];
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block6;
            }
            Object[] objectArray = new Object[lllIlIIIIIIl[1]];
            objectArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = var22.f;
            Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[3]], (Object[])objectArray);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlII((Object)var22.e, (Object)c.MAKE_UNF_POTS)) {
                Log.info((String)lllIlIIIIIII[lllIlIIIIIIl[4]]);
                var22.k().forceStop();
            }
            return lllIlIIIIIIl[0];
        }
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lIIIlIllIllIlIl(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
        }
        Bank.withdraw((int)this.f.BankingTask(), (int)lllIlIIIIIIl[5], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        Bank.withdraw((int)lllIlIIIIIIl[2], (int)lllIlIIIIIIl[5], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return lllIlIIIIIIl[1];
    }

    private static void lIIIlIllIllIIlI() {
        lllIlIIIIIII = new String[lllIlIIIIIIl[8]];
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[0]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."No more components to make {} in bank";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[1]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."Stopping plugin, have a nice day :)";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[3]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."No more herbs or vials to make unf {} pots";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[4]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."Stopping plugin, have a nice day :)";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[6]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."No more {} to clean";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIII[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.lllIlIIIIIIl[7]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."Stopping plugin, have a nice day :)";
    }

    private static boolean lIIIlIllIlllIII(int n, int n2) {
        return n < n2;
    }
}

