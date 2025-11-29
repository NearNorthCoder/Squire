package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

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
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Walking to bank", priority = 5000)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.E  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/E.class */
public class E extends AbstractC0000a {
    private static /* synthetic */ int[] lIIllIlIlllll;
    private static /* synthetic */ String[] lIIllIlIllllI;
    private /* synthetic */ BankLocation aw;

    private static boolean lIllIIIIllllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lIllIIIIlllIlIl();
        lIllIIIIlllIlII();
    }

    private static String lIllIIIIlllIIIl(String llllllllllllllIlllIllllllIllIlIl, String llllllllllllllIlllIllllllIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllllIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIlIlllll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllllIllIllI) {
            llllllllllllllIlllIllllllIllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlllIIll(String llllllllllllllIlllIllllllIlIIlIl, String llllllllllllllIlllIllllllIlIIlII) {
        String llllllllllllllIlllIllllllIlIIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllllllIlIIlII.toCharArray();
        int llllllllllllllIlllIllllllIlIIIIl = lIIllIlIlllll[0];
        char[] charArray2 = llllllllllllllIlllIllllllIlIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIlIlllll[0];
        while (lIllIIIIllllIlI(i, length)) {
            char llllllllllllllIlllIllllllIlIIllI = charArray2[i];
            sb.append((char) (llllllllllllllIlllIllllllIlIIllI ^ charArray[llllllllllllllIlllIllllllIlIIIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIllllllIlIIIIl++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIIllllIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.AbstractC0000a
    public boolean l() {
        if (!lIllIIIIlllIllI(this.o.j() ? 1 : 0) && !lIllIIIIlllIlll(Bank.isOpen() ? 1 : 0) && !lIllIIIIlllIlll(o() ? 1 : 0) && !lIllIIIIlllIllI(Movement.shouldWalk() ? 1 : 0)) {
            if (lIllIIIIlllIlll(Inventory.contains(item -> {
                return item.getName().toLowerCase().contains(lIIllIlIllllI[lIIllIlIlllll[2]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item2 -> {
                    return item2.getName().toLowerCase().contains(lIIllIlIllllI[lIIllIlIlllll[1]]);
                }).interact(lIIllIlIllllI[lIIllIlIlllll[0]]);
            }
            if (lIllIIIIllllIII(this.aw)) {
                if (lIllIIIIllllIIl(this.p.pickpocketTarget(), EnumC0005f.VYRE)) {
                    this.aw = BankLocation.HALLOWED_SEPULCHRE_BANK;
                    "".length();
                    if ("   ".length() <= ((112 ^ 117) & ((111 ^ 106) ^ (-1)))) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    this.aw = BankLocation.getNearest();
                }
            }
            if (lIllIIIIlllIllI(Bank.open() ? 1 : 0)) {
                Movement.walkTo(this.aw.getArea().getCenter());
                "".length();
                return lIIllIlIlllll[1];
            }
            return lIIllIlIlllll[0];
        }
        return lIIllIlIlllll[0];
    }

    private static boolean lIllIIIIllllIII(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIIlllIllI(int i) {
        return i == 0;
    }

    @Inject
    public E(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void lIllIIIIlllIlIl() {
        lIIllIlIlllll = new int[5];
        lIIllIlIlllll[0] = ((30 ^ 40) ^ (118 ^ 81)) & (((18 ^ 22) ^ (161 ^ 180)) ^ (-" ".length()));
        lIIllIlIlllll[1] = " ".length();
        lIIllIlIlllll[2] = "  ".length();
        lIIllIlIlllll[3] = "   ".length();
        lIIllIlIlllll[4] = (((64 + 152) - 144) + 99) ^ (((148 + 56) - 75) + 34);
    }

    private static String lIllIIIIlllIIlI(String llllllllllllllIlllIlllllllIIIIII, String llllllllllllllIlllIlllllllIIIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllllIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIllIlIlllll[4]), "DES");
            Cipher llllllllllllllIlllIlllllllIIIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIlllllllIIIlII.init(lIIllIlIlllll[2], llllllllllllllIlllIlllllllIIIlIl);
            return new String(llllllllllllllIlllIlllllllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllllllIIIIll) {
            llllllllllllllIlllIlllllllIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlllIlll(int i) {
        return i != 0;
    }

    private static void lIllIIIIlllIlII() {
        lIIllIlIllllI = new String[lIIllIlIlllll[3]];
        lIIllIlIllllI[lIIllIlIlllll[0]] = lIllIIIIlllIIIl("1GIgqd0DLSGTKJgUI5LYqA==", "sNmtf");
        lIIllIlIllllI[lIIllIlIlllll[1]] = lIllIIIIlllIIlI("KnGd4eTrzUTyvzfGhd4F9g==", "nyGne");
        lIIllIlIllllI[lIIllIlIlllll[2]] = lIllIIIIlllIIll("JSQaL2k2JAYiIQ==", "FKsAI");
    }
}
