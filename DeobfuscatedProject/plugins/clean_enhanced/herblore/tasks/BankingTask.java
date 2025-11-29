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
import java.util.Comparator;
import java.util.Iterator;
import net.runelite.api.Item;
import net.runelite.client.eventbus.EventBus;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.herblore.tasks.AHelper;
import gg.squire.herblore.tasks.GameEnum;
import gg.squire.herblore.tasks.GameEnum2;
import gg.squire.herblore.tasks.HerbloreTaskBase;
import gg.squire.herblore.tasks.GameEnum3;
import gg.squire.herblore.tasks.GHelper;

@TaskDesc(name="Banking")
public class BankingTask
extends HerbloreTaskBase {
    private  c e;
    private final  EventBus o;
    private  b f;
    private  e g;
    private static final  Logger n;

    private static boolean var3(int n) {
        return n != 0;
    }

    private static boolean var4(Object object, Object object2) {
        return object == object2;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (1 != 3) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void var16() {
        var2 = new int[9];
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0] = (0x20 ^ 0x74 ^ (0x3B ^ 0x73)) & (0x42 ^ 0x7D ^ (0x1C ^ 0x3F) ^ -1);
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[1] = 1;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[2] = 170 + 206 - 265 + 116;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[3] = 2;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[4] = 3;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[5] = 7 + 19 - -46 + 78 ^ 89 + 74 - 124 + 113;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[6] = 0xBE ^ 0xBA;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[7] = 102 + 144 - 70 + 12 ^ 117 + 92 - 65 + 41;
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[8] = 6 ^ 0;
    }

    private static boolean var18(int n, int n2) {
        return n == n2;
    }

    private boolean p() {
        f var19;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
        }
        Iterator<Integer> var21 = var19.g.n().keySet().iterator();
        while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var3(var21.hasNext() ? 1 : 0)) {
            Integer var22 = var21.next();
            int[] nArray = new int[var2[1]];
            nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = var22;
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Bank.contains((int[])nArray) ? 1 : 0) && r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Inventory.contains(item -> {
                int n2;
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var18(item.getId(), var22) && r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var3(item.isStackable() ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if null != null {
                        return ((0xC5 ^ 0xA3 ^ (0x3A ^ 0x16)) & (82 + 142 - 123 + 104 ^ 72 + 43 - 20 + 40 ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                Object[] objectArray = new Object[var2[1]];
                objectArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(var19.f);
                Log.info((String)var1[var2[0]], (Object[])objectArray);
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var4((Object)var19.e, (Object)c.ALL_STAGES_ALL_HERBS) || r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var4((Object)var19.f, (Object)b.values()[b.values().length - var2[1]])) {
                    Log.info((String)var1[var2[1]]);
                    var19.k().forceStop();
                }
                return var2[0];
            }
            int[] nArray2 = new int[var2[1]];
            nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = var22;
            Item var23 = Bank.getFirst((int[])nArray2);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var3(var23.isStackable() ? 1 : 0)) {
                Bank.withdrawAll((int)var22, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                0;
                if (1 < 1) {
                    return (3 & ~3) != 0;
                }
            } else {
                Bank.withdraw((int)var22, (int)var19.g.n().get(var22), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
            0;
            if ((0x4E ^ 0x4B) != 0) continue;
            return ((0x9F ^ 0xAD) & ~(0x86 ^ 0xB4)) != 0;
        }
        return var2[1];
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
        return var2[0];
    }

    /*
     * WARNING - void declaration
     */
    private void t() {
        f var25;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var4((Object)this.e, (Object)c.FINISH_POTS)) {
            Item item2 = Bank.getAll(item -> Arrays.stream(b.values()).anyMatch(b2 -> b2.a(item.getId()))).stream().min(Comparator.comparingInt(Item::getId)).orElse(null);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var26(item2)) {
                return;
            }
            b[] var27 = b.values();
            int var28 = var27.length;
            int var29 = var2[0];
            while (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var14(var29, var28)) {
                void var30;
                b var31 = var27[var29];
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var3(var31.a(var30.getId()) ? 1 : 0)) {
                    var25.f = var31;
                    var25.e = var31.b(var30.getId());
                    var25.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(var25.f);
                    var25.o.post((Object)new AHelper(var25.e, var25.f, var25.g));
                    0;
                    if (2 > -1) break;
                    return;
                }
                ++var29;
                0;
                if ((0x70 ^ 0x74) > ((0x39 ^ 0x6D) & ~(0x52 ^ 6))) continue;
                return;
            }
            0;
            if ((0x41 ^ 0x45) != (0x8C ^ 0x88)) {
                return;
            }
        } else {
            var25.s();
        }
    }

    private void s() {
        switch (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.g.p[this.e.ordinal()]) {
            case 1: {
                var32.e = c.MAKE_UNF_POTS;
                0;
                if (((70 + 101 - 131 + 141 ^ 102 + 106 - 72 + 7) & (0x37 ^ 0x4D ^ (0x5F ^ 0x1F) ^ -1)) >= 0) break;
                return;
            }
            case 2: {
                var32.e = c.FINISH_POTS;
            }
        }
        this.o.post((Object)new AHelper(this.e, this.f, this.g));
    }

    private boolean r() {
        int[] nArray = new int[var2[1]];
        nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = this.f.e();
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Bank.contains((int[])nArray) ? 1 : 0)) {
            Object[] objectArray = new Object[var2[1]];
            objectArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = this.f;
            Log.info((String)var1[var2[6]], (Object[])objectArray);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var4((Object)this.e, (Object)c.CLEAN_HERBS)) {
                Log.info((String)var1[var2[7]]);
                this.k().forceStop();
            }
            return var2[0];
        }
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
        }
        Bank.withdrawAll((int)this.j().herb().e(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return var2[1];
    }

    private static boolean var20(int n) {
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
                f var33;
                int[] nArray = new int[var2[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = var33.j().herb().e();
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    bl = var2[1];
                    0;
                    if (((6 ^ 0x15 ^ (0x49 ^ 0x54)) & (0x1B ^ 0x45 ^ (0x93 ^ 0xC3) ^ -1)) >= 0) return bl;
                    return ((21 + 205 - 191 + 192 ^ 17 + 107 - 78 + 125) & (0xFB ^ 0x97 ^ (0x4A ^ 0x6E) ^ -1)) != 0;
                }
                bl = var2[0];
                return bl;
            }
            case 2: {
                int n;
                f var33;
                int[] nArray = new int[var2[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = var33.f.BankingTask();
                if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var3(Inventory.getCount((int[])nArray))) {
                    int[] nArray2 = new int[var2[1]];
                    nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = var2[2];
                    if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Inventory.getCount((int[])nArray2))) {
                        n = var2[0];
                        return n != 0;
                    }
                }
                n = var2[1];
                0;
                if (3 == 3) return n != 0;
                return ((0xC ^ 0x6D ^ (0x63 ^ 0x4C)) & (0x6D ^ 0 ^ (0x90 ^ 0xB3) ^ -1)) != 0;
            }
            case 3: {
                f var33;
                Iterator<Integer> var34 = var33.g.n().keySet().iterator();
                do {
                    if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var3(var34.hasNext() ? 1 : 0)) return var2[0];
                    Integer var35 = var34.next();
                    int[] nArray = new int[var2[1]];
                    nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = var35;
                    if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        return var2[1];
                    }
                    0;
                } while (2 > 0);
                return ((0x8B ^ 0xBA ^ (0x8A ^ 0xAB)) & (0x55 ^ 0x20 ^ (0x36 ^ 0x53) ^ -1)) != 0;
            }
            case 4: 
            case 5: {
                void var36;
                f var33;
                return var33.a((c)var36);
            }
        }
        return var2[0];
    }

    @Override
    public boolean h() {
        f var37;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(this.u() ? 1 : 0)) {
            return var2[0];
        }
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return var2[1];
        }
        int var38 = var37.o() ? 1 : 0;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(var38)) {
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var4((Object)var37.j().method(), (Object)c.ALL_STAGES)) {
                var37.s();
                return var2[1];
            }
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var4((Object)var37.j().method(), (Object)c.ALL_STAGES_ALL_HERBS)) {
                var37.t();
                return var2[1];
            }
        }
        return var2[0];
    }

    private static boolean var26(Object object) {
        return object == null;
    }

        catch (Exception var44) {
            var44.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Inject
    public BankingTask(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig, EventBus eventBus) {
        super(squireHerblore, herbloreConfig, c.values());
        void var45;
        this.o = eventBus;
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var4((Object)herbloreConfig.method(), (Object)c.ALL_STAGES_ALL_HERBS)) {
            this.f = b.GUAM_LEAF;
            this.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.ATTACK_POTION;
            this.e = c.CLEAN_HERBS;
            0;
            if (2 < 0) {
                throw null;
            }
        } else if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var4((Object)var45.method(), (Object)c.ALL_STAGES)) {
            f var46;
            var46.f = var45.herb();
            var46.g = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e.a(var46.f);
            var46.e = c.CLEAN_HERBS;
            0;
            if (-1 > 2) {
                throw null;
            }
        } else {
            var46.f = var45.herb();
            var46.g = var45.potion();
            var46.e = var45.method();
        }
    }

    private boolean q() {
        block6: {
            f var47;
            block5: {
                int[] nArray = new int[var2[1]];
                nArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = this.f.BankingTask();
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var3(Bank.contains((int[])nArray) ? 1 : 0)) break block5;
                int[] nArray2 = new int[var2[1]];
                nArray2[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = var2[2];
                if (!r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Bank.contains((int[])nArray2) ? 1 : 0)) break block6;
            }
            Object[] objectArray = new Object[var2[1]];
            objectArray[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = var47.f;
            Log.info((String)var1[var2[3]], (Object[])objectArray);
            if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var4((Object)var47.e, (Object)c.MAKE_UNF_POTS)) {
                Log.info((String)var1[var2[4]]);
                var47.k().forceStop();
            }
            return var2[0];
        }
        if (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var20(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
        }
        Bank.withdraw((int)this.f.BankingTask(), (int)var2[5], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        Bank.withdraw((int)var2[2], (int)var2[5], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return var2[1];
    }

    private static void var17() {
        var1 = new String[var2[8]];
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var1[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[0]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."No more components to make {} in bank";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var1[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[1]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."Stopping plugin, have a nice day :)";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var1[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[3]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."No more herbs or vials to make unf {} pots";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var1[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[4]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."Stopping plugin, have a nice day :)";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var1[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[6]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."No more {} to clean";
        r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var1[r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f.var2[7]] = r.e.o.r.h.s.b.e.q.l.e.u.-.i.r."Stopping plugin, have a nice day :)";
    }

    private static boolean var14(int n, int n2) {
        return n < n2;
    }
}

