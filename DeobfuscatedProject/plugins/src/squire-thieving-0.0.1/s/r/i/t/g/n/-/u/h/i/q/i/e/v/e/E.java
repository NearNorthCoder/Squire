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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.f;

@TaskDesc(name="Walking to bank", priority=5000)
public class E
extends a {
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

    private static String lIllIIIIlllIIIl(String llllllllllllllIlllIllllllIllIlIl, String llllllllllllllIlllIllllllIllIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIllllllIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllllIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllllllIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllllllIllIlll.init(lIIllIlIlllll[2], llllllllllllllIlllIllllllIlllIII);
            return new String(llllllllllllllIlllIllllllIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllllllIllIllI) {
            llllllllllllllIlllIllllllIllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlllIIll(String llllllllllllllIlllIllllllIlIIIII, String llllllllllllllIlllIllllllIIlllll) {
        llllllllllllllIlllIllllllIlIIIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllllIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllllllIlIIIll = new StringBuilder();
        char[] llllllllllllllIlllIllllllIlIIIlI = llllllllllllllIlllIllllllIIlllll.toCharArray();
        int llllllllllllllIlllIllllllIlIIIIl = lIIllIlIlllll[0];
        char[] llllllllllllllIlllIllllllIIllIll = llllllllllllllIlllIllllllIlIIIII.toCharArray();
        int llllllllllllllIlllIllllllIIllIlI = llllllllllllllIlllIllllllIIllIll.length;
        int llllllllllllllIlllIllllllIIllIIl = lIIllIlIlllll[0];
        while (E.lIllIIIIllllIlI(llllllllllllllIlllIllllllIIllIIl, llllllllllllllIlllIllllllIIllIlI)) {
            char llllllllllllllIlllIllllllIlIIllI = llllllllllllllIlllIllllllIIllIll[llllllllllllllIlllIllllllIIllIIl];
            llllllllllllllIlllIllllllIlIIIll.append((char)(llllllllllllllIlllIllllllIlIIllI ^ llllllllllllllIlllIllllllIlIIIlI[llllllllllllllIlllIllllllIlIIIIl % llllllllllllllIlllIllllllIlIIIlI.length]));
            "".length();
            ++llllllllllllllIlllIllllllIlIIIIl;
            ++llllllllllllllIlllIllllllIIllIIl;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllllllIlIIIll);
    }

    private static boolean lIllIIIIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean l() {
        E llllllllllllllIlllIlllllllIIlIlI;
        if (E.lIllIIIIlllIllI(this.o.j() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIlll(Bank.isOpen() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIlll(llllllllllllllIlllIlllllllIIlIlI.o() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIlIlllll[0];
        }
        if (E.lIllIIIIlllIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIllIlIllllI[lIIllIlIlllll[2]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIIllIlIllllI[lIIllIlIlllll[1]])).interact(lIIllIlIllllI[lIIllIlIlllll[0]]);
        }
        if (E.lIllIIIIllllIII(llllllllllllllIlllIlllllllIIlIlI.aw)) {
            if (E.lIllIIIIllllIIl((Object)llllllllllllllIlllIlllllllIIlIlI.p.pickpocketTarget(), (Object)f.VYRE)) {
                llllllllllllllIlllIlllllllIIlIlI.aw = BankLocation.HALLOWED_SEPULCHRE_BANK;
                "".length();
                if ("   ".length() <= ((0x70 ^ 0x75) & ~(0x6F ^ 0x6A))) {
                    return ((0x69 ^ 0x71) & ~(1 ^ 0x19)) != 0;
                }
            } else {
                llllllllllllllIlllIlllllllIIlIlI.aw = BankLocation.getNearest();
            }
        }
        if (E.lIllIIIIlllIllI(Bank.open() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llllllllllllllIlllIlllllllIIlIlI.aw.getArea().getCenter());
            "".length();
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
        E.lIIllIlIlllll[0] = (0x1E ^ 0x28 ^ (0x76 ^ 0x51)) & (0x12 ^ 0x16 ^ (0xA1 ^ 0xB4) ^ -" ".length());
        E.lIIllIlIlllll[1] = " ".length();
        E.lIIllIlIlllll[2] = "  ".length();
        E.lIIllIlIlllll[3] = "   ".length();
        E.lIIllIlIlllll[4] = 64 + 152 - 144 + 99 ^ 148 + 56 - 75 + 34;
    }

    private static String lIllIIIIlllIIlI(String llllllllllllllIlllIlllllllIIIIlI, String llllllllllllllIlllIllllllIllllll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllllIllllll.getBytes(StandardCharsets.UTF_8)), lIIllIlIlllll[4]), "DES");
            Cipher llllllllllllllIlllIlllllllIIIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIlllllllIIIlII.init(lIIllIlIlllll[2], llllllllllllllIlllIlllllllIIIlIl);
            return new String(llllllllllllllIlllIlllllllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllllllIIIIll) {
            llllllllllllllIlllIlllllllIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIIlllIlII() {
        lIIllIlIllllI = new String[lIIllIlIlllll[3]];
        E.lIIllIlIllllI[E.lIIllIlIlllll[0]] = E.lIllIIIIlllIIIl("1GIgqd0DLSGTKJgUI5LYqA==", "sNmtf");
        E.lIIllIlIllllI[E.lIIllIlIlllll[1]] = E.lIllIIIIlllIIlI("KnGd4eTrzUTyvzfGhd4F9g==", "nyGne");
        E.lIIllIlIllllI[E.lIIllIlIlllll[2]] = E.lIllIIIIlllIIll("JSQaL2k2JAYiIQ==", "FKsAI");
    }
}

