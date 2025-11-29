/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a_Unknown;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.FEnum;

/* TASK: Walking to bank -> WalkToBankTask */
@TaskDesc(name="Walking to bank", priority=5000)
public class WalkingToBankTask
extends a_Unknown {
    private static /* synthetic */ int[] lIIllIlIlllll;
    private static /* synthetic */ String[] lIIllIlIllllI;
    private /* synthetic */ BankLocation aw;

    private static boolean lIllIIIIllllIIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        E.lIllIIIIlllIlIl();
        E.lIllIIIIlllIlII();
    }

    private static String lIllIIIIlllIIIl(String var20, String var14) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIIllIlIlllll[2], var1);
            return new String(var5.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlllIIll(String var4, String var6) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var16 = lIIllIlIlllll[0];
        char[] var15 = var4.toCharArray();
        int var9 = var15.length;
        int var12 = lIIllIlIlllll[0];
        while (E.lIllIIIIllllIlI(var12, var9)) {
            char var10 = var15[var12];
            var7.append((char)(var10 ^ var8[var16 % var8.length]));
            0;
            ++var16;
            ++var12;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean lIllIIIIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean l() {
        E var11;
        if (E.lIllIIIIlllIllI(this.o.j() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIlll(Bank.isOpen() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIlll(var11.o() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIllIlIllllI[lIIllIlIlllll[2]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIIllIlIllllI[lIIllIlIlllll[1]])).interact(lIIllIlIllllI[lIIllIlIlllll[0]]);
        }
        if (E.lIllIIIIllllIII(var11.aw)) {
            if (E.lIllIIIIllllIIl((Object)var11.p.pickpocketTarget(), (Object)f.VYRE)) {
                var11.aw = BankLocation.HALLOWED_SEPULCHRE_BANK;
                0;
                if (3 <= ((0x70 ^ 0x75) & ~(0x6F ^ 0x6A))) {
                    return false;
                }
            } else {
                var11.aw = BankLocation.getNearest();
            }
        }
        if (E.lIllIIIIlllIllI(Bank.open() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var11.aw.getArea().getCenter());
            0;
            return lIIllIlIlllll[1];
        }
        return lIIllIlIlllll[0];
    }

    private static boolean lIllIIIIllllIII(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIlllIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public E(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void lIllIIIIlllIlIl() {
        lIIllIlIlllll = new int[5];
        E.lIIllIlIlllll[0] = (0x1E ^ 0x28 ^ (0x76 ^ 0x51)) & (0x12 ^ 0x16 ^ (0xA1 ^ 0xB4) ^ -1);
        E.lIIllIlIlllll[1] = 1;
        E.lIIllIlIlllll[2] = 2;
        E.lIIllIlIlllll[3] = 3;
        E.lIIllIlIlllll[4] = 64 + 152 - 144 + 99 ^ 148 + 56 - 75 + 34;
    }

    private static String lIllIIIIlllIIlI(String var18, String var2) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIllIlIlllll[4]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIllIlIlllll[2], var17);
            return new String(var3.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIIlllIlII() {
        lIIllIlIllllI = new String[lIIllIlIlllll[3]];
        E.lIIllIlIllllI[E.lIIllIlIlllll[0]] = E."Open-all";
        E.lIIllIlIllllI[E.lIIllIlIlllll[1]] = E."coin pouch";
        E.lIIllIlIllllI[E.lIIllIlIlllll[2]] = E."coin pouch";
    }
}

