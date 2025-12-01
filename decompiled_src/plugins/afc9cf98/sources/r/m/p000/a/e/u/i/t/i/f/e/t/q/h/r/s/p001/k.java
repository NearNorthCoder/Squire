package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Buying Rewards", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.k  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/k.class */
public class k extends Task {
    private /* synthetic */ boolean M;
    private static final /* synthetic */ int F;
    private static final /* synthetic */ int G;
    private final /* synthetic */ Client L;
    private final /* synthetic */ SquireTitheConfig K;
    private static final /* synthetic */ int E;
    private static /* synthetic */ String[] lIIllllllllIl;
    private static final /* synthetic */ int H;
    private static final /* synthetic */ int J;
    private static final /* synthetic */ int I;
    private static /* synthetic */ int[] lIIlllllllllI;

    private static boolean lIllIllIIllIIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIllIIlIlIlI(String llllllllllllllIlllIIlIlIllIlIIll, String llllllllllllllIlllIIlIlIllIlIIlI) {
        String llllllllllllllIlllIIlIlIllIlIIll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIlIllIlIIIl = new StringBuilder();
        char[] llllllllllllllIlllIIlIlIllIlIIII = llllllllllllllIlllIIlIlIllIlIIlI.toCharArray();
        int llllllllllllllIlllIIlIlIllIIllll = lIIlllllllllI[0];
        char[] charArray = llllllllllllllIlllIIlIlIllIlIIll2.toCharArray();
        int length = charArray.length;
        int i = lIIlllllllllI[0];
        while (lIllIllIIllIIlI(i, length)) {
            llllllllllllllIlllIIlIlIllIlIIIl.append((char) (charArray[i] ^ llllllllllllllIlllIIlIlIllIlIIII[llllllllllllllIlllIIlIlIllIIllll % llllllllllllllIlllIIlIlIllIlIIII.length]));
            "".length();
            llllllllllllllIlllIIlIlIllIIllll++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIlIlIllIlIIIl);
    }

    private static boolean lIllIllIIllIIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    public boolean run() {
        if (lIllIllIIlIllll(this.L.isInInstancedRegion() ? 1 : 0)) {
            this.M = lIIlllllllllI[0];
            return lIIlllllllllI[0];
        }
        if (!lIllIllIIlIllll(this.M ? 1 : 0) && !lIllIllIIllIIII(this.K.buyItems(), a.NONE)) {
            String[] strArr = new String[lIIlllllllllI[1]];
            strArr[lIIlllllllllI[0]] = lIIllllllllIl[lIIlllllllllI[0]];
            strArr[lIIlllllllllI[2]] = lIIllllllllIl[lIIlllllllllI[2]];
            Item first = Inventory.getFirst(strArr);
            if (lIllIllIIllIIIl(first)) {
                first.interact(lIIllllllllIl[lIIlllllllllI[1]]);
                return lIIlllllllllI[2];
            }
            int llllllllllllllIlllIIlIlIlllllIIl = Vars.getBit(lIIlllllllllI[3]);
            if (lIllIllIIllIIlI(llllllllllllllIlllIIlIlIlllllIIl, lIIlllllllllI[4])) {
                this.M = lIIlllllllllI[2];
                return lIIlllllllllI[0];
            } else if (!lIllIllIIllIIll(Widgets.isVisible(this.L.getWidget(lIIlllllllllI[5])) ? 1 : 0)) {
                x();
                "".length();
                return lIIlllllllllI[2];
            } else {
                String[] strArr2 = new String[lIIlllllllllI[2]];
                strArr2[lIIlllllllllI[0]] = lIIllllllllIl[lIIlllllllllI[6]];
                NPC nearest = NPCs.getNearest(strArr2);
                if (lIllIllIIllIlII(nearest)) {
                    return lIIlllllllllI[0];
                }
                nearest.interact(lIIllllllllIl[lIIlllllllllI[7]]);
                return lIIlllllllllI[2];
            }
        }
        return lIIlllllllllI[0];
    }

    @Inject
    public k(SquireTitheConfig squireTitheConfig, Client client) {
        this.K = squireTitheConfig;
        this.L = client;
    }

    private static boolean lIllIllIIlIllll(int i) {
        return i != 0;
    }

    static {
        lIllIllIIlIlllI();
        lIllIllIIlIllIl();
        I = lIIlllllllllI[10];
        J = lIIlllllllllI[11];
        G = lIIlllllllllI[8];
        H = lIIlllllllllI[9];
        E = lIIlllllllllI[5];
        F = lIIlllllllllI[4];
    }

    private static String lIllIllIIlIlIll(String llllllllllllllIlllIIlIlIlllIIIll, String llllllllllllllIlllIIlIlIlllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIlllIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllllllllI[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllllllllI[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlIlllIIlII) {
            llllllllllllllIlllIIlIlIlllIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean x() {
        int i;
        if (lIllIllIIllIIII(this.K.buyItems(), a.HERB_BOX)) {
            i = lIIlllllllllI[8];
            "".length();
            if (((((54 + 20) - 69) + 133) ^ (((136 + 82) - 134) + 58)) == 0) {
                return ((36 ^ 14) ^ (29 ^ 34)) & (((((72 + 81) - 101) + 85) ^ (((43 + 18) - (-89)) + 6)) ^ (-" ".length()));
            }
        } else {
            i = lIIlllllllllI[9];
        }
        int i2 = i;
        Widget widget = this.L.getWidget(lIIlllllllllI[10]);
        if (lIllIllIIllIlII(widget)) {
            return lIIlllllllllI[0];
        }
        Widget widget2 = widget.getDynamicChildren()[i2];
        if (lIllIllIIllIlII(widget2)) {
            return lIIlllllllllI[0];
        }
        this.L.runScript(widget2.getOnOpListener());
        Widget widget3 = this.L.getWidget(lIIlllllllllI[11]);
        if (lIllIllIIllIIIl(widget3)) {
            widget3.interact(lIIllllllllIl[lIIlllllllllI[12]]);
            return lIIlllllllllI[2];
        }
        return lIIlllllllllI[0];
    }

    private static boolean lIllIllIIllIlII(Object obj) {
        return obj == null;
    }

    private static void lIllIllIIlIlllI() {
        lIIlllllllllI = new int[15];
        lIIlllllllllI[0] = ((((15 + 59) - 45) + 149) ^ (((51 + 145) - 144) + 111)) & (((61 ^ 41) ^ (16 ^ 21)) ^ (-" ".length()));
        lIIlllllllllI[1] = "  ".length();
        lIIlllllllllI[2] = " ".length();
        lIIlllllllllI[3] = (-((-23315) & 32723)) & (-3) & 14303;
        lIIlllllllllI[4] = 21 ^ 11;
        lIIlllllllllI[5] = (-((-4167) & 24063)) & (-1) & 15486399;
        lIIlllllllllI[6] = "   ".length();
        lIIlllllllllI[7] = (152 ^ 146) ^ (90 ^ 84);
        lIIlllllllllI[8] = (225 ^ 153) ^ (87 ^ 79);
        lIIlllllllllI[9] = 115 ^ 31;
        lIIlllllllllI[10] = (-7575) & 53681591;
        lIIlllllllllI[11] = (-((-4241) & 16338)) & (-163) & 53686271;
        lIIlllllllllI[12] = 39 ^ 34;
        lIIlllllllllI[13] = 122 ^ 124;
        lIIlllllllllI[14] = (208 ^ 160) ^ (123 ^ 3);
    }

    private static boolean lIllIllIIllIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIllIllIIlIllII(String llllllllllllllIlllIIlIlIlIlllllI, String llllllllllllllIlllIIlIlIlIllllIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllllllllI[1], llllllllllllllIlllIIlIlIllIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlIlIllllll) {
            llllllllllllllIlllIIlIlIlIllllll.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIIlIllIl() {
        lIIllllllllIl = new String[lIIlllllllllI[13]];
        lIIllllllllIl[lIIlllllllllI[0]] = lIllIllIIlIlIlI("HB8bK0E2FRE=", "TziIa");
        lIIllllllllIl[lIIlllllllllI[2]] = lIllIllIIlIlIlI("CzYpJk4oMi8p", "XSLBn");
        lIIllllllllIl[lIIlllllllllI[1]] = lIllIllIIlIlIlI("EBApHVgzHSs=", "RqGvu");
        lIIllllllllIl[lIIlllllllllI[6]] = lIllIllIIlIlIll("aVMGutlw3J7vxFT+lC+o7VVvLGOyZW7b", "OPfAR");
        lIIllllllllIl[lIIlllllllllI[7]] = lIllIllIIlIllII("d+VQIFvxFv4=", "obiTA");
        lIIllllllllIl[lIIlllllllllI[12]] = lIllIllIIlIllII("/XHBszU4yG4=", "TRIKN");
    }

    private static boolean lIllIllIIllIIll(int i) {
        return i == 0;
    }
}
