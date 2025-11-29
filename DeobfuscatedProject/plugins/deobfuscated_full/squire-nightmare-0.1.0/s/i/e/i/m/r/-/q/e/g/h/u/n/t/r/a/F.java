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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.D;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.g;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=999, blocking=true)
public abstract class F
extends D {
    @Inject
    protected /* synthetic */ g cZ;
    private static /* synthetic */ int[] lllIllllIlII;
    private static /* synthetic */ String[] lllIllllIIll;

    /*
     * WARNING - void declaration
     */
    protected boolean a(Predicate<Item> predicate, int n2) {
        void var6;
        if (F.lIIIlllIIIlllII(Bank.Inventory.getFirst(predicate))) {
            String[] stringArray = new String[lllIllllIlII[3]];
            stringArray[F.lllIllllIlII[0]] = lllIllllIIll[lllIllllIlII[3]];
            stringArray[F.lllIllllIlII[1]] = lllIllllIIll[lllIllllIlII[4]];
            Bank.Inventory.getFirst(predicate).interact(stringArray);
            return lllIllllIlII[1];
        }
        if (F.lIIIlllIIIllllI(Inventory.getFreeSlots(), (int)var6)) {
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
        F var8;
        if (F.lIIIlllIIIllIlI(this.cV.enableBanking() ? 1 : 0)) {
            return lllIllllIlII[0];
        }
        if (F.lIIIlllIIIllIll(var8.cc() ? 1 : 0)) {
            var8.cW.b(var8.ce().needsToBank());
        }
        if (F.lIIIlllIIIllIlI(var8.cW.s() ? 1 : 0)) {
            return lllIllllIlII[0];
        }
        if (F.lIIIlllIIIllIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lllIllllIlII[1];
        }
        return this.bY();
    }

    private static String lIIIlllIIIlIlll(String var16, String var7) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var3 = var7.toCharArray();
        int var4 = lllIllllIlII[0];
        char[] var12 = var16.toCharArray();
        int var1 = var12.length;
        int var14 = lllIllllIlII[0];
        while (F.lIIIlllIIIllllI(var14, var1)) {
            char var15 = var12[var14];
            var13.append((char)(var15 ^ var3[var4 % var3.length]));
            0;
            ++var4;
            ++var14;
            0;
            if (1 != 2) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static String lIIIlllIIIlIllI(String var17, String var10) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lllIllllIlII[6]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllIllllIlII[3], var9);
            return new String(var2.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIllIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean cd() {
        int n2;
        void var11;
        String[] stringArray = new String[lllIllllIlII[1]];
        stringArray[F.lllIllllIlII[0]] = lllIllllIIll[lllIllllIlII[0]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lllIllllIlII[1]];
        stringArray2[F.lllIllllIlII[0]] = lllIllllIIll[lllIllllIlII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        if (F.lIIIlllIIIlllII(tileObject) && F.lIIIlllIIIllIll(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0) && !F.lIIIlllIIIlllIl(Players.getLocal().distanceTo((Locatable)tileObject), lllIllllIlII[2]) || F.lIIIlllIIIlllII(var11) && F.lIIIlllIIIllIll(Reachable.isInteractable((Locatable)var11) ? 1 : 0) && F.lIIIlllIIIllllI(Players.getLocal().distanceTo((Locatable)var11), lllIllllIlII[2])) {
            n2 = lllIllllIlII[1];
            0;
            if (1 < 0) {
                return false;
            }
        } else {
            n2 = lllIllllIlII[0];
        }
        return n2 != 0;
    }

    protected F(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void lIIIlllIIIllIIl() {
        lllIllllIlII = new int[7];
        F.lllIllllIlII[0] = (0x43 ^ 0x63) & ~(0x5D ^ 0x7D);
        F.lllIllllIlII[1] = 1;
        F.lllIllllIlII[2] = 0xD4 ^ 0xB6 ^ (0x30 ^ 0x5E);
        F.lllIllllIlII[3] = 2;
        F.lllIllllIlII[4] = 3;
        F.lllIllllIlII[5] = 0x38 ^ 0x5E ^ (0x42 ^ 0x20);
        F.lllIllllIlII[6] = 7 ^ 0xF;
    }

    protected boolean cc() {
        boolean bl;
        if (!F.lIIIlllIIIllIlI(this.cd() ? 1 : 0) || F.lIIIlllIIIllIll(this.cZ.m(this.cV.bankLocation().bJ()) ? 1 : 0)) {
            bl = lllIllllIlII[1];
            0;
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
        F.lllIllllIIll[F.lllIllllIlII[0]] = F."Bank booth";
        F.lllIllllIIll[F.lllIllllIlII[1]] = F."Banker";
        F.lllIllllIIll[F.lllIllllIlII[3]] = F."Drink";
        F.lllIllllIIll[F.lllIllllIlII[4]] = F."Eat";
    }
}

