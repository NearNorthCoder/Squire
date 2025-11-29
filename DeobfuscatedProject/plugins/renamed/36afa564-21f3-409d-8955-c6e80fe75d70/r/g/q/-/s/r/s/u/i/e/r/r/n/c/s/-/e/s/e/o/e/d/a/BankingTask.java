/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.AEnum;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking")
public class BankingTask
extends Task {
    private static /* synthetic */ int[] lIIllIIlIIllI;
    private static /* synthetic */ String[] lIIllIIlIIIIl;
    private final /* synthetic */ SquireSorceressGardenConfig s;

    static {
        b.lIlIlllllIlIIll();
        b.lIlIllllIllllll();
    }

    private static void lIlIlllllIlIIll() {
        lIIllIIlIIllI = new int[3];
        b.lIIllIIlIIllI[0] = (0x54 ^ 0x49) & ~(0xB0 ^ 0xAD);
        b.lIIllIIlIIllI[1] = 1;
        b.lIIllIIlIIllI[2] = 2;
    }

    private static boolean lIlIlllllIlIlIl(int n) {
        return n == 0;
    }

    private static boolean lIlIlllllIlIllI(int n) {
        return n != 0;
    }

    private static String lIlIllllIllllII(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var5 = var7.toCharArray();
        int var9 = lIIllIIlIIllI[0];
        char[] var4 = var6.toCharArray();
        int var3 = var4.length;
        int var8 = lIIllIIlIIllI[0];
        while (b.lIlIlllllIlIlll(var8, var3)) {
            char var11 = var4[var8];
            var2.append((char)(var11 ^ var5[var9 % var5.length]));
            0;
            ++var9;
            ++var8;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    public boolean run() {
        b var10;
        if (b.lIlIlllllIlIlII((Object)this.s.botActivity(), (Object)a.MINIGAME)) {
            return lIIllIIlIIllI[0];
        }
        if (b.lIlIlllllIlIlIl(var10.o() ? 1 : 0)) {
            return lIIllIIlIIllI[0];
        }
        if (b.lIlIlllllIlIllI(Bank.isOpen() ? 1 : 0)) {
            return var10.p();
        }
        return this.r();
    }

    @Inject
    public b(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.s = squireSorceressGardenConfig;
    }

    private boolean r() {
        if (b.lIlIlllllIlIllI(BankLocation.AL_KHARID_BANK.getArea().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            Bank.open();
            0;
            return lIIllIIlIIllI[1];
        }
        Movement.walkTo((WorldArea)BankLocation.AL_KHARID_BANK.getArea());
        0;
        return lIIllIIlIIllI[1];
    }

    private boolean q() {
        if (b.lIlIlllllIlIllI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIllIIlIIIIl[lIIllIIlIIllI[1]])) ? 1 : 0)) {
            Bank.close();
            return lIIllIIlIIllI[1];
        }
        Bank.withdraw(item -> item.getName().toLowerCase().contains(lIIllIIlIIIIl[lIIllIIlIIllI[0]]), (int)this.s.stamAmount(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return lIIllIIlIIllI[1];
    }

    private static boolean lIlIlllllIlIlII(Object object, Object object2) {
        return object != object2;
    }

    private boolean p() {
        b var1;
        if (b.lIlIlllllIlIllI(Inventory.isFull() ? 1 : 0)) {
            Bank.depositInventory();
            return lIIllIIlIIllI[1];
        }
        if (b.lIlIlllllIlIllI(var1.s.useStaminas() ? 1 : 0)) {
            return var1.q();
        }
        Bank.close();
        return lIIllIIlIIllI[1];
    }

    private static boolean lIlIlllllIlIlll(int n, int n2) {
        return n < n2;
    }

    private static void lIlIllllIllllll() {
        lIIllIIlIIIIl = new String[lIIllIIlIIllI[2]];
        b.lIIllIIlIIIIl[b.lIIllIIlIIllI[0]] = b."stamina";
        b.lIIllIIlIIIIl[b.lIIllIIlIIllI[1]] = b."stamina";
    }

    private boolean o() {
        boolean bl;
        if (!b.lIlIlllllIlIlIl(Inventory.isFull() ? 1 : 0) || b.lIlIlllllIlIllI(Bank.isOpen() ? 1 : 0)) {
            bl = lIIllIIlIIllI[1];
            0;
            if (((0x44 ^ 0x27) & ~(0x12 ^ 0x71)) >= 3) {
                return false;
            }
        } else {
            bl = lIIllIIlIIllI[0];
        }
        return bl;
    }
}

