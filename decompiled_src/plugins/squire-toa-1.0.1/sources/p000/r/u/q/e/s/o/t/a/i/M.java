package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.MenuOptionClicked;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Swapping gear for babboons", register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.M  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/M.class */
public class M extends y {
    private static /* synthetic */ String[] lIIlllllIIIll;
    private static /* synthetic */ int[] lIIlllllIIlII;

    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public int[] a(String llllllllllllllIlllIlIIIIllIIIlIl) {
        SpellBook.Ancient ancient;
        int i = lIIlllllIIlII[0];
        switch (llllllllllllllIlllIlIIIIllIIIlIl.hashCode()) {
            case -857618786:
                if (lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[4]]) ? 1 : 0)) {
                    i = lIIlllllIIlII[4];
                    "".length();
                    if ((true ^ true) & ((true ^ true) ^ true)) {
                        return null;
                    }
                }
                break;
            case 556951929:
                if (lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[3]]) ? 1 : 0)) {
                    i = lIIlllllIIlII[3];
                    "".length();
                    if ((-" ".length()) > 0) {
                        return null;
                    }
                }
                break;
            case 618003550:
                if (lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[2]]) ? 1 : 0)) {
                    i = lIIlllllIIlII[2];
                    "".length();
                    if ((-"  ".length()) > 0) {
                        return null;
                    }
                }
                break;
            case 1829704903:
                if (lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[5]]) ? 1 : 0)) {
                    i = lIIlllllIIlII[5];
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                }
                break;
            case 1882859331:
                if (lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[6]]) ? 1 : 0)) {
                    i = lIIlllllIIlII[6];
                    break;
                }
                break;
            case 1911983736:
                if (lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[1]]) ? 1 : 0)) {
                    i = lIIlllllIIlII[1];
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                }
                break;
        }
        switch (i) {
            case 0:
                if (lIllIlIlIIIIIll(this.aL.autoBloodSpells() ? 1 : 0)) {
                    if (lIllIlIlIIIIIll(SpellBook.Ancient.BLOOD_BARRAGE.canCast() ? 1 : 0)) {
                        ancient = SpellBook.Ancient.BLOOD_BARRAGE;
                        "".length();
                        if ("   ".length() < 0) {
                            return null;
                        }
                    } else {
                        ancient = SpellBook.Ancient.BLOOD_BURST;
                    }
                    a((Spell) ancient);
                }
                return a(this.aL.mageGearBaboons());
            case 1:
            case 2:
                return a(this.aL.mageGearBaboons());
            case 3:
                return a(this.aL.meleeGearBaboons());
            case 4:
            case 5:
                return a(this.aL.rangeGearBaboons());
            default:
                return new int[lIIlllllIIlII[1]];
        }
    }

    private static String lIllIlIIllllllI(String llllllllllllllIlllIlIIIIlIIlIlIl, String llllllllllllllIlllIlIIIIlIIlIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIlIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIlIIlIlII.getBytes(StandardCharsets.UTF_8)), lIIlllllIIlII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllllIIlII[3], llllllllllllllIlllIlIIIIlIIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIIlIIlIIIl) {
            llllllllllllllIlllIlIIIIlIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlIIIIIll(int i) {
        return i != 0;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public void b(MenuOptionClicked menuOptionClicked) {
        a(menuOptionClicked.getMenuEntry());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public boolean C() {
        if (lIllIlIlIIIIlII(this.aL.rangeGearBaboons().isSelected() ? 1 : 0) && lIllIlIlIIIIlII(this.aL.meleeGearBaboons().isSelected() ? 1 : 0) && !lIllIlIlIIIIIll(this.aL.mageGearBaboons().isSelected() ? 1 : 0)) {
            return lIIlllllIIlII[1];
        }
        ?? r0 = lIIlllllIIlII[2];
        "".length();
        return (((165 ^ 193) ^ (110 ^ 7)) & (((((114 + 153) - 253) + 148) ^ (((20 + 15) - (-55)) + 85)) ^ (-" ".length()))) != 0 ? ((34 ^ 18) ^ (229 ^ 153)) & (((154 ^ 147) ^ (74 ^ 15)) ^ (-" ".length())) : r0;
    }

    private static boolean lIllIlIlIIIIlIl(int i, int i2) {
        return i < i2;
    }

    private static String lIllIlIlIIIIIII(String llllllllllllllIlllIlIIIIlIllIlll, String llllllllllllllIlllIlIIIIlIllIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIlIIIIlIllIlII = llllllllllllllIlllIlIIIIlIllIllI.toCharArray();
        int llllllllllllllIlllIlIIIIlIllIIll = lIIlllllIIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlllllIIlII[1];
        while (lIllIlIlIIIIlIl(i, length)) {
            char llllllllllllllIlllIlIIIIlIlllIII = charArray[i];
            sb.append((char) (llllllllllllllIlllIlIIIIlIlllIII ^ llllllllllllllIlllIlIIIIlIllIlII[llllllllllllllIlllIlIIIIlIllIIll % llllllllllllllIlllIlIIIIlIllIlII.length]));
            "".length();
            llllllllllllllIlllIlIIIIlIllIIll++;
            i++;
            "".length();
            if ("   ".length() > ((248 ^ 190) ^ (240 ^ 178))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIllIlIlIIIIIlI() {
        lIIlllllIIlII = new int[9];
        lIIlllllIIlII[0] = -" ".length();
        lIIlllllIIlII[1] = ((76 ^ 117) ^ (254 ^ 143)) & (((((199 + 65) - 101) + 42) ^ (((80 + 25) - (-23)) + 5)) ^ (-" ".length()));
        lIIlllllIIlII[2] = " ".length();
        lIIlllllIIlII[3] = "  ".length();
        lIIlllllIIlII[4] = "   ".length();
        lIIlllllIIlII[5] = 155 ^ 159;
        lIIlllllIIlII[6] = 112 ^ 117;
        lIIlllllIIlII[7] = 42 ^ 44;
        lIIlllllIIlII[8] = (198 ^ 175) ^ (238 ^ 143);
    }

    @Inject
    public M(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static String lIllIlIIlllllll(String llllllllllllllIlllIlIIIIlIlIIIlI, String llllllllllllllIlllIlIIIIlIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIIIIlIlIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIIIIlIlIIlII.init(lIIlllllIIlII[3], secretKeySpec);
            return new String(llllllllllllllIlllIlIIIIlIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIIlIlIIIll) {
            llllllllllllllIlllIlIIIIlIlIIIll.printStackTrace();
            return null;
        }
    }

    static {
        lIllIlIlIIIIIlI();
        lIllIlIlIIIIIIl();
    }

    private static void lIllIlIlIIIIIIl() {
        lIIlllllIIIll = new String[lIIlllllIIlII[7]];
        lIIlllllIIIll[lIIlllllIIlII[1]] = lIllIlIIllllllI("I8cbTR3xCxQ/3bZSUOgxfA==", "APxmN");
        lIIlllllIIIll[lIIlllllIIlII[2]] = lIllIlIIlllllll("IncbkgealcOBdOdbDlXA/Q==", "HgEst");
        lIIlllllIIIll[lIIlllllIIlII[3]] = lIllIlIIlllllll("rWI8OSNFABnU49uFMi7zRQ==", "Gyjno");
        lIIlllllIIIll[lIIlllllIIlII[4]] = lIllIlIlIIIIIII("FQYlDAI5RxMLHzgQIhE=", "WgGcm");
        lIIlllllIIIll[lIIlllllIIlII[5]] = lIllIlIIlllllll("x2BfveqlGNrnqwLp4qZpVg==", "DPTZe");
        lIIlllllIIIll[lIIlllllIIlII[6]] = lIllIlIIllllllI("JoqXJZTxJBAeQFQAoTszpA==", "VHJiT");
    }

    private static boolean lIllIlIlIIIIlII(int i) {
        return i == 0;
    }
}
