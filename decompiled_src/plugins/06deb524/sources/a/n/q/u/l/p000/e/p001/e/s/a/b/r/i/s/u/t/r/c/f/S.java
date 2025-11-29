package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Equipping Gauntlets")
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.S  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/S.class */
public class S extends T<v> {
    private static /* synthetic */ int[] lIIllIIllllI;
    private static /* synthetic */ String[] lIIllIIlllIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.T
    public boolean a(v vVar, C0014o c0014o) {
        Item first;
        if (llIIlllIlllIll(Bank.isOpen() ? 1 : 0)) {
            first = Bank.Inventory.getFirst(vVar.I());
            "".length();
            if ((-"   ".length()) >= 0) {
                return " ".length() & (" ".length() ^ (-" ".length()));
            }
        } else {
            first = Inventory.getFirst(vVar.I());
        }
        Item item = first;
        if (llIIlllIllllII(item)) {
            return lIIllIIllllI[0];
        }
        String[] strArr = new String[lIIllIIllllI[1]];
        strArr[lIIllIIllllI[0]] = lIIllIIlllIl[lIIllIIllllI[0]];
        strArr[lIIllIIllllI[2]] = lIIllIIlllIl[lIIllIIllllI[2]];
        strArr[lIIllIIllllI[3]] = lIIllIIlllIl[lIIllIIllllI[3]];
        item.interact(strArr);
        return lIIllIIllllI[0];
    }

    private static String llIIlllIllIllI(String lllllllllllllllIlllIlllIIlIllIll, String lllllllllllllllIlllIlllIIlIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlllIIlIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlllIIlIlllIl.init(lIIllIIllllI[3], lllllllllllllllIlllIlllIIlIllllI);
            return new String(lllllllllllllllIlllIlllIIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlllIIlIlllII) {
            lllllllllllllllIlllIlllIIlIlllII.printStackTrace();
            return null;
        }
    }

    static {
        llIIlllIlllIlI();
        llIIlllIllIlll();
    }

    private static boolean llIIlllIlllIll(int i) {
        return i != 0;
    }

    private static void llIIlllIllIlll() {
        lIIllIIlllIl = new String[lIIllIIllllI[1]];
        lIIllIIlllIl[lIIllIIllllI[0]] = llIIlllIllIlIl("MwkzEA==", "dlRbJ");
        lIIllIIlllIl[lIIllIIllllI[2]] = llIIlllIllIllI("rOk8MC+T6tY=", "PsUzv");
        lIIllIIlllIl[lIIllIIllllI[3]] = llIIlllIllIlIl("OjorHjA=", "mSNrT");
    }

    @Inject
    public S(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, v.class, str -> {
            if (llIIlllIllllIl(str.equals(I.bf) ? 1 : 0) && llIIlllIllllIl(str.equals(I.bd) ? 1 : 0) && llIIlllIllllIl(str.equals(I.bi) ? 1 : 0) && !llIIlllIlllIll(str.equals(I.bj) ? 1 : 0)) {
                return lIIllIIllllI[0];
            }
            ?? r0 = lIIllIIllllI[2];
            "".length();
            return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
    }

    private static String llIIlllIllIlIl(String lllllllllllllllIlllIlllIIlIIlIll, String lllllllllllllllIlllIlllIIlIIlIlI) {
        String lllllllllllllllIlllIlllIIlIIlIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIlllIIlIIlIlI.toCharArray();
        int lllllllllllllllIlllIlllIIlIIIlll = lIIllIIllllI[0];
        char[] charArray2 = lllllllllllllllIlllIlllIIlIIlIll2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIllllI[0];
        while (llIIlllIlllllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlllIlllIIlIIIlll % charArray.length]));
            "".length();
            lllllllllllllllIlllIlllIIlIIIlll++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIlllIllllIl(int i) {
        return i == 0;
    }

    private static boolean llIIlllIllllII(Object obj) {
        return obj == null;
    }

    private static boolean llIIlllIlllllI(int i, int i2) {
        return i < i2;
    }

    private static void llIIlllIlllIlI() {
        lIIllIIllllI = new int[4];
        lIIllIIllllI[0] = ((((20 + 31) - (-11)) + 69) ^ (((81 + 149) - 104) + 26)) & (((78 ^ 117) ^ (117 ^ 85)) ^ (-" ".length()));
        lIIllIIllllI[1] = "   ".length();
        lIIllIIllllI[2] = " ".length();
        lIIllIIllllI[3] = "  ".length();
    }
}
