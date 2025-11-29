package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Withdrawing supplies", priority = 5000, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cd  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/cd.class */
public class cd extends Z {
    private static /* synthetic */ String[] llIIlllIIII;
    private static /* synthetic */ int[] llIIlllIIIl;
    private final /* synthetic */ C hK;

    private static boolean lIlIIIllIlIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIllIlIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIllIlIlIl(int i) {
        return i > 0;
    }

    private static String lIlIIIllIIlIll(String llllllllllllllllIIlllIllIIIlIIll, String llllllllllllllllIIlllIllIIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlllIllIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllIIIl[2], llllllllllllllllIIlllIllIIIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIllIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIllIIIlIlII) {
            llllllllllllllllIIlllIllIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIllIIlllI() {
        llIIlllIIII = new String[llIIlllIIIl[8]];
        llIIlllIIII[llIIlllIIIl[1]] = lIlIIIllIIlIll("ygGOQCCR0FrWdnMQM3Qo4w==", "CgHSr");
        llIIlllIIII[llIIlllIIIl[0]] = lIlIIIllIIlIll("NMAzysRfVbA=", "IvlOo");
        llIIlllIIII[llIIlllIIIl[2]] = lIlIIIllIIllII("vrbyjSnl00qPNUM6/YXaZQ==", "MZhnp");
        llIIlllIIII[llIIlllIIIl[3]] = lIlIIIllIIllIl("Nz4jCTkNLiA=", "dKSyU");
        llIIlllIIII[llIIlllIIIl[4]] = lIlIIIllIIlIll("ZcLGc2O3Wwo=", "DOWhs");
        llIIlllIIII[llIIlllIIIl[5]] = lIlIIIllIIllIl("JT82JAglPw==", "WZEPg");
        llIIlllIIII[llIIlllIIIl[6]] = lIlIIIllIIlIll("9BGihIdY6o4=", "kICsd");
        llIIlllIIII[llIIlllIIIl[7]] = lIlIIIllIIllIl("Jw0qPwsj", "TlDYn");
    }

    static {
        lIlIIIllIIllll();
        lIlIIIllIIlllI();
    }

    private static boolean lIlIIIllIlIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIllIlIlII(int i) {
        return i <= 0;
    }

    private static String lIlIIIllIIllIl(String llllllllllllllllIIlllIlIllllIIIl, String llllllllllllllllIIlllIlIllllIlIl) {
        String llllllllllllllllIIlllIlIllllIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIlIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlllIlIllllIIll = llllllllllllllllIIlllIlIllllIlIl.toCharArray();
        int llllllllllllllllIIlllIlIllllIIlI = llIIlllIIIl[1];
        char[] charArray = llllllllllllllllIIlllIlIllllIIIl2.toCharArray();
        int length = charArray.length;
        int i = llIIlllIIIl[1];
        while (lIlIIIllIlIllI(i, length)) {
            char llllllllllllllllIIlllIlIllllIlll = charArray[i];
            sb.append((char) (llllllllllllllllIIlllIlIllllIlll ^ llllllllllllllllIIlllIlIllllIIll[llllllllllllllllIIlllIlIllllIIlI % llllllllllllllllIIlllIlIllllIIll.length]));
            "".length();
            llllllllllllllllIIlllIlIllllIIlI++;
            i++;
            "".length();
            if ((-((213 ^ 156) ^ (58 ^ 119))) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIIIllIIllll() {
        llIIlllIIIl = new int[9];
        llIIlllIIIl[0] = " ".length();
        llIIlllIIIl[1] = (26 ^ 0) & ((131 ^ 153) ^ (-1));
        llIIlllIIIl[2] = "  ".length();
        llIIlllIIIl[3] = "   ".length();
        llIIlllIIIl[4] = (204 ^ 192) ^ (58 ^ 50);
        llIIlllIIIl[5] = (227 ^ 182) ^ (198 ^ 150);
        llIIlllIIIl[6] = (67 ^ 50) ^ (80 ^ 39);
        llIIlllIIIl[7] = 115 ^ 116;
        llIIlllIIIl[8] = (132 ^ 184) ^ (133 ^ 177);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    private boolean b(EnumC0056e enumC0056e) {
        String[] strArr = new String[llIIlllIIIl[0]];
        strArr[llIIlllIIIl[1]] = llIIlllIIII[llIIlllIIIl[3]];
        Item first = Inventory.getFirst(strArr);
        if (!lIlIIIllIlIIII(first) && !lIlIIIllIlIlII(this.hK.av().getOrDefault(enumC0056e, Integer.valueOf(llIIlllIIIl[1])).intValue()) && lIlIIIllIlIIII(Inventory.getFirst(item -> {
            return enumC0056e.p().contains(Integer.valueOf(item.getId()));
        })) && !lIlIIIllIlIIIl(Inventory.isFull() ? 1 : 0) && !lIlIIIllIlIlIl(aX())) {
            if (lIlIIIllIlIIIl(this.hK.au() ? 1 : 0)) {
                this.hK.a(enumC0056e);
                return llIIlllIIIl[0];
            }
            first.interact(llIIlllIIII[llIIlllIIIl[4]]);
            return llIIlllIIIl[0];
        }
        return llIIlllIIIl[1];
    }

    private static boolean lIlIIIllIlIIlI(int i) {
        return i == 0;
    }

    private static boolean lIlIIIllIlIIll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[llIIlllIIIl[0]];
        strArr[llIIlllIIIl[1]] = llIIlllIIII[llIIlllIIIl[1]];
        Item first = Inventory.getFirst(strArr);
        if (lIlIIIllIlIIII(first)) {
            return llIIlllIIIl[1];
        }
        if (lIlIIIllIlIIIl(this.hK.av().isEmpty() ? 1 : 0)) {
            first.interact(llIIlllIIII[llIIlllIIIl[0]]);
            return llIIlllIIIl[0];
        } else if (lIlIIIllIlIIIl(b(EnumC0056e.SMELLING_SALTS) ? 1 : 0)) {
            return llIIlllIIIl[0];
        } else {
            if (lIlIIIllIlIIlI(aq() ? 1 : 0)) {
                return llIIlllIIIl[1];
            }
            if (lIlIIIllIlIIIl(Inventory.isFull() ? 1 : 0) && lIlIIIllIlIIlI(Inventory.contains(item -> {
                return EnumC0056e.LIQUID_ADRENALINE.d(item.getId());
            }) ? 1 : 0)) {
                b(item2 -> {
                    if (lIlIIIllIlIIlI(item2.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[5]]) ? 1 : 0) && lIlIIIllIlIIlI(item2.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[6]]) ? 1 : 0) && !lIlIIIllIlIIIl(item2.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[7]]) ? 1 : 0)) {
                        return llIIlllIIIl[1];
                    }
                    ?? r0 = llIIlllIIIl[0];
                    "".length();
                    return (((11 ^ 99) ^ (127 ^ 70)) & (("  ".length() ^ (107 ^ 56)) ^ (-" ".length()))) > 0 ? ((45 ^ 1) ^ (67 ^ 72)) & (((((80 + 35) - 30) + 45) ^ (((147 + 77) - 120) + 61)) ^ (-" ".length())) : r0;
                });
            }
            if (lIlIIIllIlIIIl(aq() ? 1 : 0) && lIlIIIllIlIIll(Inventory.getFreeSlots(), llIIlllIIIl[0]) && lIlIIIllIlIIIl(Prayers.anyActive() ? 1 : 0)) {
                first.interact(llIIlllIIII[llIIlllIIIl[2]]);
            }
            if (!lIlIIIllIlIIIl(b(EnumC0056e.LIQUID_ADRENALINE) ? 1 : 0) && !lIlIIIllIlIIIl(b(EnumC0056e.AMBROSIA) ? 1 : 0) && !lIlIIIllIlIIIl(b(EnumC0056e.NECTAR) ? 1 : 0) && !lIlIIIllIlIIIl(b(EnumC0056e.SILK_DRESSING) ? 1 : 0) && !lIlIIIllIlIIIl(b(EnumC0056e.TEARS_OF_ELIDINIS) ? 1 : 0)) {
                return llIIlllIIIl[1];
            }
            return llIIlllIIIl[0];
        }
    }

    private static String lIlIIIllIIllII(String llllllllllllllllIIlllIllIIIIIllI, String llllllllllllllllIIlllIllIIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), llIIlllIIIl[8]), "DES");
            Cipher llllllllllllllllIIlllIllIIIIlIII = Cipher.getInstance("DES");
            llllllllllllllllIIlllIllIIIIlIII.init(llIIlllIIIl[2], secretKeySpec);
            return new String(llllllllllllllllIIlllIllIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIllIIIIIIlI) {
            llllllllllllllllIIlllIllIIIIIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected cd(Client client, C c) {
        super(client);
        this.hK = c;
    }
}
