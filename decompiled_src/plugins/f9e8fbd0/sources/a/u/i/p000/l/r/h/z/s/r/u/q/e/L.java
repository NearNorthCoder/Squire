package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Collecting items", priority = 2147483646, blocking = true, register = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.L  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/L.class */
public class L extends P {
    private static /* synthetic */ int[] lIllIllIIllII;
    private static final /* synthetic */ int ag;
    private static final /* synthetic */ int af;
    private static /* synthetic */ String[] lIllIllIIlIlI;

    static {
        llIIlIIIlllIIII();
        llIIlIIIllIllII();
        af = lIllIllIIllII[6];
        ag = lIllIllIIllII[4];
    }

    @Inject
    public L(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, EnumC0002c.COLLECTING_ZULRAH);
    }

    private static String llIIlIIIllIlIII(String llllllllllllllIllIIIlIllIIllllll, String llllllllllllllIllIIIlIllIIllllIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIllIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIllIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIIllII[5], llllllllllllllIllIIIlIllIlIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIllIlIIIIIl) {
            llllllllllllllIllIIIlIllIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIIllIlIIl(String llllllllllllllIllIIIlIllIllllIII, String llllllllllllllIllIIIlIllIlllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIllIlllIlll.getBytes(StandardCharsets.UTF_8)), lIllIllIIllII[12]), "DES");
            Cipher llllllllllllllIllIIIlIllIllllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIllIllllIlI.init(lIllIllIIllII[5], secretKeySpec);
            return new String(llllllllllllllIllIIIlIllIllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIllIllllIIl) {
            llllllllllllllIllIIIlIllIllllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIlllIIlI(int i) {
        return i != 0;
    }

    private static boolean llIIlIIIlllIIll(Object obj) {
        return obj != null;
    }

    private static boolean llIIlIIIlllIIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.P
    public boolean ac() {
        int[] iArr = new int[lIllIllIIllII[0]];
        iArr[lIllIllIIllII[1]] = lIllIllIIllII[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (llIIlIIIlllIIIl(nearest)) {
            return lIllIllIIllII[1];
        }
        int[] iArr2 = new int[lIllIllIIllII[0]];
        iArr2[lIllIllIIllII[1]] = lIllIllIIllII[3];
        if (llIIlIIIlllIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                return item.getName().endsWith(lIllIllIIlIlI[lIllIllIIllII[10]]);
            });
            if (llIIlIIIlllIIll(first)) {
                int[] iArr3 = new int[lIllIllIIllII[0]];
                iArr3[lIllIllIIllII[1]] = lIllIllIIllII[3];
                first.useOn(Inventory.getFirst(iArr3));
                return lIllIllIIllII[0];
            }
        }
        if (llIIlIIIlllIIlI(Dialog.isOpen() ? 1 : 0) && llIIlIIIlllIIlI(Dialog.getText().contains(lIllIllIIlIlI[lIllIllIIllII[1]]) ? 1 : 0)) {
            this.al.a(EnumC0002c.DONE);
        }
        Widget widget = this.aj.getWidget(lIllIllIIllII[4]);
        if (llIIlIIIlllIIlI(Widgets.isVisible(widget) ? 1 : 0) && llIIlIIIlllIIlI(widget.getText().split(lIllIllIIlIlI[lIllIllIIllII[0]])[lIllIllIIllII[1]].contains(lIllIllIIlIlI[lIllIllIIllII[5]]) ? 1 : 0)) {
            this.al.a(EnumC0002c.DONE);
            return lIllIllIIllII[1];
        }
        Widget widget2 = this.aj.getWidget(lIllIllIIllII[6]);
        if (!llIIlIIIlllIIlI(Widgets.isVisible(widget2) ? 1 : 0)) {
            nearest.interact(lIllIllIIlIlI[lIllIllIIllII[9]]);
            return lIllIllIIllII[0];
        }
        String[] strArr = new String[lIllIllIIllII[5]];
        strArr[lIllIllIIllII[1]] = lIllIllIIlIlI[lIllIllIIllII[7]];
        strArr[lIllIllIIllII[0]] = lIllIllIIlIlI[lIllIllIIllII[8]];
        widget2.interact(strArr);
        return lIllIllIIllII[0];
    }

    private static String llIIlIIIllIlIll(String llllllllllllllIllIIIlIllIllIIlll, String llllllllllllllIllIIIlIllIllIIlIl) {
        String llllllllllllllIllIIIlIllIllIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIllIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIllIllIIIll = new StringBuilder();
        char[] llllllllllllllIllIIIlIllIllIIIIl = llllllllllllllIllIIIlIllIllIIlIl.toCharArray();
        int llllllllllllllIllIIIlIllIlIlllll = lIllIllIIllII[1];
        char[] charArray = llllllllllllllIllIIIlIllIllIIlll2.toCharArray();
        int length = charArray.length;
        int i = lIllIllIIllII[1];
        while (llIIlIIIlllIlIl(i, length)) {
            char llllllllllllllIllIIIlIllIllIlIII = charArray[i];
            llllllllllllllIllIIIlIllIllIIIll.append((char) (llllllllllllllIllIIIlIllIllIlIII ^ llllllllllllllIllIIIlIllIllIIIIl[llllllllllllllIllIIIlIllIlIlllll % llllllllllllllIllIIIlIllIllIIIIl.length]));
            "".length();
            llllllllllllllIllIIIlIllIlIlllll++;
            i++;
            "".length();
            if ((105 ^ 109) < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIlIllIllIIIll);
    }

    private static boolean llIIlIIIlllIlIl(int i, int i2) {
        return i < i2;
    }

    private static void llIIlIIIllIllII() {
        lIllIllIIlIlI = new String[lIllIllIIllII[11]];
        lIllIllIIlIlI[lIllIllIIllII[1]] = llIIlIIIllIlIII("lmdmFDFbxT3WWfhCyD7Ln2yb/f1dvcPr", "RUHOy");
        lIllIllIIlIlI[lIllIllIIllII[0]] = llIIlIIIllIlIIl("jHVCiGFlgjE=", "NjhDs");
        lIllIllIIlIlI[lIllIllIIllII[5]] = llIIlIIIllIlIIl("YE/yNPRkDHA=", "RWDpm");
        lIllIllIIlIlI[lIllIllIIllII[7]] = llIIlIIIllIlIII("c+1+FSZfxqE=", "UMQRz");
        lIllIllIIlIlI[lIllIllIIllII[8]] = llIIlIIIllIlIII("ftzKAW5cU24gauw2wusLYA==", "ENjOj");
        lIllIllIIlIlI[lIllIllIIllII[9]] = llIIlIIIllIlIIl("trB+Wn+c/gA=", "KGBJH");
        lIllIllIIlIlI[lIllIllIIllII[10]] = llIIlIIIllIlIll("ATY6DQ==", "sCThX");
    }

    private static void llIIlIIIlllIIII() {
        lIllIllIIllII = new int[13];
        lIllIllIIllII[0] = " ".length();
        lIllIllIIllII[1] = ((170 ^ 131) ^ (11 ^ 15)) & (((((103 + 110) - 79) + 40) ^ (((95 + 2) - (-1)) + 33)) ^ (-" ".length()));
        lIllIllIIllII[2] = (-16389) & 18421;
        lIllIllIIllII[3] = (-3081) & 15871;
        lIllIllIIllII[4] = (-6466) & 39459147;
        lIllIllIIllII[5] = "  ".length();
        lIllIllIIllII[6] = (-4521) & 39457198;
        lIllIllIIllII[7] = "   ".length();
        lIllIllIIllII[8] = (242 ^ 154) ^ (99 ^ 15);
        lIllIllIIllII[9] = 73 ^ 76;
        lIllIllIIllII[10] = 153 ^ 159;
        lIllIllIIllII[11] = 41 ^ 46;
        lIllIllIIllII[12] = 141 ^ 133;
    }
}
