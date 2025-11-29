package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
@TaskDesc(name = "Entering TOA")
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ci  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ci.class */
public class ci extends ck {
    private static /* synthetic */ int[] llIIlllIllI;
    private static final /* synthetic */ int hR;
    private static /* synthetic */ String[] llIIlllIlIl;
    @Inject
    protected /* synthetic */ SquireAutoTOA aY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ck
    public boolean bl() {
        int[] iArr = new int[llIIlllIllI[0]];
        iArr[llIIlllIllI[1]] = llIIlllIllI[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (!lIlIIIlllIIlII(nearest) && !lIlIIIlllIIlIl(((BankLoadout) this.hY.loadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0)) {
            if (lIlIIIlllIIllI(Tabs.isOpen(Tab.INVENTORY) ? 1 : 0)) {
                Tabs.open(Tab.INVENTORY);
                return llIIlllIllI[0];
            } else if (lIlIIIlllIIlll(Magic.getCurrentSpellBook(), SpellBook.ANCIENT)) {
                Log.info(llIIlllIlIl[llIIlllIllI[1]]);
                this.aY.forceStop();
                return llIIlllIllI[1];
            } else if (lIlIIIlllIIlIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return llIIlllIllI[0];
            } else if (!lIlIIIlllIIlIl(Dialog.isViewingOptions() ? 1 : 0)) {
                nearest.interact(llIIlllIlIl[llIIlllIllI[3]]);
                return llIIlllIllI[0];
            } else {
                String[] strArr = new String[llIIlllIllI[0]];
                strArr[llIIlllIllI[1]] = llIIlllIlIl[llIIlllIllI[0]];
                Dialog.chooseOption(strArr);
                "".length();
                return llIIlllIllI[0];
            }
        }
        return llIIlllIllI[1];
    }

    private static void lIlIIIlllIIIll() {
        llIIlllIllI = new int[6];
        llIIlllIllI[0] = " ".length();
        llIIlllIllI[1] = ((7 ^ 71) ^ (166 ^ 174)) & (((((197 + 182) - 231) + 52) ^ (((99 + 124) - 172) + 77)) ^ (-" ".length()));
        llIIlllIllI[2] = (-((-10891) & 27627)) & (-2711) & 65535;
        llIIlllIllI[3] = "  ".length();
        llIIlllIllI[4] = "   ".length();
        llIIlllIllI[5] = 83 ^ 91;
    }

    private static boolean lIlIIIlllIlIII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIIlllIIIII(String llllllllllllllllIIlllIlIlIIIIIlI, String llllllllllllllllIIlllIlIlIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlIlIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIlIlIIIIlIl) {
            llllllllllllllllIIlllIlIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIIllI(int i) {
        return i == 0;
    }

    private static String lIlIIIllIlllll(String llllllllllllllllIIlllIlIIllIIlll, String llllllllllllllllIIlllIlIIllIIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIlIIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlllIlIIllIIlII = llllllllllllllllIIlllIlIIllIIllI.toCharArray();
        int llllllllllllllllIIlllIlIIllIIIll = llIIlllIllI[1];
        char[] charArray = str.toCharArray();
        int llllllllllllllllIIlllIlIIlIlllII = charArray.length;
        int i = llIIlllIllI[1];
        while (lIlIIIlllIlIII(i, llllllllllllllllIIlllIlIIlIlllII)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllIIlllIlIIllIIlII[llllllllllllllllIIlllIlIIllIIIll % llllllllllllllllIIlllIlIIllIIlII.length]));
            "".length();
            llllllllllllllllIIlllIlIIllIIIll++;
            i++;
            "".length();
            if ((-" ".length()) > (100 ^ 96)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIIIlllIIIlI() {
        llIIlllIlIl = new String[llIIlllIllI[4]];
        llIIlllIlIl[llIIlllIllI[1]] = lIlIIIllIlllll("ESBoDAsjIWgDACUsLQwaZjY4BwIqJycNBWplOxYBNjUhDAk=", "FEHbn");
        llIIlllIlIl[llIIlllIllI[0]] = lIlIIIlllIIIII("5/p41Yl44yo=", "ixuMe");
        llIIlllIlIl[llIIlllIllI[3]] = lIlIIIlllIIIIl("051gLndwWhU=", "wsuGX");
    }

    private static boolean lIlIIIlllIIlIl(int i) {
        return i != 0;
    }

    @Inject
    protected ci(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static boolean lIlIIIlllIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIlIIIlllIIIIl(String llllllllllllllllIIlllIlIIlllIlll, String llllllllllllllllIIlllIlIIlllIllI) {
        try {
            SecretKeySpec llllllllllllllllIIlllIlIIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlIIlllIllI.getBytes(StandardCharsets.UTF_8)), llIIlllIllI[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllIllI[3], llllllllllllllllIIlllIlIIllllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIlIIllllIII) {
            llllllllllllllllIIlllIlIIllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIIlII(Object obj) {
        return obj == null;
    }

    static {
        lIlIIIlllIIIll();
        lIlIIIlllIIIlI();
        hR = llIIlllIllI[2];
    }
}
