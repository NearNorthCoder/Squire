/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.a;

@TaskDesc(name="Turning In Juice")
public class c
extends Task {
    private static /* synthetic */ String[] lIIllIIlIlIII;
    private static /* synthetic */ int[] lIIllIIlIlIIl;
    private final /* synthetic */ SquireSorceressGardenConfig t;

    static {
        c.lIlIllllllIIIII();
        c.lIlIlllllIlllll();
    }

    private boolean t() {
        c llllllllllllllIllllIIIIllIIlIIll;
        String[] stringArray = new String[lIIllIIlIlIIl[1]];
        stringArray[c.lIIllIIlIlIIl[0]] = lIIllIIlIlIII[lIIllIIlIlIIl[0]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (c.lIlIllllllIIIll(nPC)) {
            Movement.walk((WorldPoint)new WorldPoint(lIIllIIlIlIIl[3], lIIllIIlIlIIl[4], lIIllIIlIlIIl[0]));
            return lIIllIIlIlIIl[1];
        }
        if (c.lIlIllllllIIlII(Movement.getRunEnergy(), lIIllIIlIlIIl[5]) && c.lIlIllllllIIIlI(Inventory.contains(llllllllllllllIllllIIIIllIIlIIll::c) ? 1 : 0)) {
            Inventory.getFirst(llllllllllllllIllllIIIIllIIlIIll::c).interact(lIIllIIlIlIII[lIIllIIlIlIIl[1]]);
        }
        int[] nArray = new int[lIIllIIlIlIIl[1]];
        nArray[c.lIIllIIlIlIIl[0]] = lIIllIIlIlIIl[2];
        Inventory.getFirst((int[])nArray).useOn((Actor)nPC);
        return lIIllIIlIlIIl[1];
    }

    private static boolean lIlIllllllIIlIl(int n) {
        return n == 0;
    }

    private boolean c(Item item) {
        return item.getName().toLowerCase().contains(lIIllIIlIlIII[lIIllIIlIlIIl[6]]);
    }

    private static void lIlIlllllIlllll() {
        lIIllIIlIlIII = new String[lIIllIIlIlIIl[7]];
        c.lIIllIIlIlIII[c.lIIllIIlIlIIl[0]] = c."Osman";
        c.lIIllIIlIlIII[c.lIIllIIlIlIIl[1]] = c."Drink";
        c.lIIllIIlIlIII[c.lIIllIIlIlIIl[6]] = c."stamina";
    }

    private static boolean lIlIllllllIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIllllllIIIll(Object object) {
        return object == null;
    }

    private boolean u() {
        c llllllllllllllIllllIIIIllIIlIIII;
        if (c.lIlIllllllIIlIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return lIIllIIlIlIIl[1];
        }
        if (c.lIlIllllllIIlII(Movement.getRunEnergy(), lIIllIIlIlIIl[5]) && c.lIlIllllllIIlIl(Inventory.contains(llllllllllllllIllllIIIIllIIlIIII::c) ? 1 : 0)) {
            Bank.withdraw(llllllllllllllIllllIIIIllIIlIIII::c, (int)lIIllIIlIlIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return lIIllIIlIlIIl[1];
        }
        Bank.withdrawAll((int)lIIllIIlIlIIl[2], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return lIIllIIlIlIIl[1];
    }

    public boolean run() {
        boolean bl;
        c llllllllllllllIllllIIIIllIIlIllI;
        if (c.lIlIllllllIIIIl((Object)this.t.botActivity(), (Object)a.EXCHANGE)) {
            return lIIllIIlIlIIl[0];
        }
        if (c.lIlIllllllIIIlI(llllllllllllllIllllIIIIllIIlIllI.s() ? 1 : 0)) {
            bl = llllllllllllllIllllIIIIllIIlIllI.t();
            0;
            if (((38 + 29 - -19 + 149 ^ 136 + 60 - 95 + 97) & (0xBD ^ 0xAF ^ (0xD ^ 0x32) ^ -1)) == 2) {
                return ((0xC4 ^ 0x83 ^ (0 ^ 0x50)) & (62 + 21 - 57 + 128 ^ 14 + 12 - -92 + 23 ^ -1)) != 0;
            }
        } else {
            bl = llllllllllllllIllllIIIIllIIlIllI.u();
        }
        return bl;
    }

    private static boolean lIlIllllllIIIlI(int n) {
        return n != 0;
    }

    @Inject
    public c(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.t = squireSorceressGardenConfig;
    }

    private static String lIlIlllllIllllI(String llllllllllllllIllllIIIIlIllllIll, String llllllllllllllIllllIIIIlIllllIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIlIllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIllllIlI.getBytes(StandardCharsets.UTF_8)), lIIllIIlIlIIl[8]), "DES");
            Cipher llllllllllllllIllllIIIIlIlllllIl = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIlIlllllIl.init(lIIllIIlIlIIl[6], llllllllllllllIllllIIIIlIllllllI);
            return new String(llllllllllllllIllllIIIIlIlllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIlIlllllII) {
            llllllllllllllIllllIIIIlIlllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllllIIlII(int n, int n2) {
        return n <= n2;
    }

    private static String lIlIlllllIllIIl(String llllllllllllllIllllIIIIllIIIIllI, String llllllllllllllIllllIIIIllIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIllIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIllIIIlIlI.init(lIIllIIlIlIIl[6], llllllllllllllIllllIIIIllIIIlIll);
            return new String(llllllllllllllIllllIIIIllIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIllIIIlIIl) {
            llllllllllllllIllllIIIIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private boolean s() {
        int[] nArray = new int[lIIllIIlIlIIl[1]];
        nArray[c.lIIllIIlIlIIl[0]] = lIIllIIlIlIIl[2];
        return Inventory.contains((int[])nArray);
    }

    private static void lIlIllllllIIIII() {
        lIIllIIlIlIIl = new int[9];
        c.lIIllIIlIlIIl[0] = (0x9D ^ 0xA7) & ~(0x9F ^ 0xA5);
        c.lIIllIIlIlIIl[1] = 1;
        c.lIIllIIlIlIIl[2] = -(0xFFFFF9DF & 0x17BF) & (0xFFFFBFFF & 0x7BFF);
        c.lIIllIIlIlIIl[3] = -1 & (0xFFFFFEDF & 0xDF7);
        c.lIIllIIlIlIIl[4] = -(0xFFFFDC57 & 0x63BA) & (0xFFFFECFF & 0x5F7F);
        c.lIIllIIlIlIIl[5] = 0xC8 ^ 0xA8 ^ (0xF9 ^ 0xB1);
        c.lIIllIIlIlIIl[6] = 2;
        c.lIIllIIlIlIIl[7] = 3;
        c.lIIllIIlIlIIl[8] = 0xAE ^ 0xA6;
    }
}

