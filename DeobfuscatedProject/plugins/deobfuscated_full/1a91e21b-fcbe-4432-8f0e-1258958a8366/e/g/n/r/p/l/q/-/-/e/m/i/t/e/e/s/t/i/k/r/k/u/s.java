/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.b;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.d;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=0x7FFFFFFF, blocking=true)
public class s
extends Task {
    private static /* synthetic */ String[] lIIllIlIlIlll;
    private final /* synthetic */ b ab;
    private final /* synthetic */ TempleTrekkingPlugin Z;
    private /* synthetic */ List<Integer> ac;
    private /* synthetic */ Player G;
    private final /* synthetic */ TempleTrekkingConfig aa;
    private static /* synthetic */ int[] lIIllIlIllIII;

    static {
        s.lIllIIIIlllIIII();
        s.lIllIIIIllIllll();
    }

    @Inject
    public s(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.ac = d.XP_TOME.w();
        this.aa = templeTrekkingConfig;
        this.ab = b2;
        this.Z = templeTrekkingPlugin;
    }

    private static boolean lIllIIIIlllIIlI(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIIllIlllI(String var9, String var11) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var7 = var11.toCharArray();
        int var3 = lIIllIlIllIII[0];
        char[] var4 = var9.toCharArray();
        int var6 = var4.length;
        int var1 = lIIllIlIllIII[0];
        while (s.lIllIIIIlllIIll(var1, var6)) {
            char var10 = var4[var1];
            var5.append((char)(var10 ^ var7[var3 % var7.length]));
            0;
            ++var3;
            ++var1;
            0;
            if (3 != -1) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static void lIllIIIIlllIIII() {
        lIIllIlIllIII = new int[3];
        s.lIIllIlIllIII[0] = (0x13 ^ 0x44 ^ (0xC1 ^ 0xC6)) & (0x64 ^ 0x58 ^ (0xD8 ^ 0xB4) ^ -1);
        s.lIIllIlIllIII[1] = 1;
        s.lIIllIlIllIII[2] = 0x88 ^ 0xC6 ^ (0x72 ^ 0x20);
    }

    public boolean run() {
        s var2;
        if (s.lIllIIIIlllIIIl(this.aa.claimBankTomes() ? 1 : 0)) {
            return lIIllIlIllIII[0];
        }
        List var8 = Inventory.getAll(item -> this.ac.contains(item.getId()));
        if (s.lIllIIIIlllIIlI(var8.isEmpty() ? 1 : 0)) {
            if (s.lIllIIIIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.open();
                0;
                return lIIllIlIllIII[1];
            }
            Bank.withdraw(item -> this.ac.contains(item.getId()), (int)lIIllIlIllIII[2], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return lIIllIlIllIII[1];
        }
        int var12 = lIIllIlIllIII[0];
        while (s.lIllIIIIlllIIll(var12, Math.min(var2.aa.perTick(), var8.size()))) {
            ((Item)var8.get(var12)).interact(lIIllIlIlIlll[lIIllIlIllIII[0]]);
            ++var12;
            0;
            if (-(0xDD ^ 0xA7 ^ 59 + 31 - 88 + 125) < 0) continue;
            return ((0x6A ^ 0x43 ^ (0xB ^ 0x71)) & (0x3F ^ 0x5F ^ (0x7B ^ 0x48) ^ -1)) != 0;
        }
        return lIIllIlIllIII[1];
    }

    private static boolean lIllIIIIlllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIIllIllll() {
        lIIllIlIlIlll = new String[lIIllIlIllIII[1]];
        s.lIIllIlIlIlll[s.lIIllIlIllIII[0]] = s."Read";
    }
}

