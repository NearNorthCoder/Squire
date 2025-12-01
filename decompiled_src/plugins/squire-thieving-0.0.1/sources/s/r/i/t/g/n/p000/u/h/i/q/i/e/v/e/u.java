package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Cleaning inventory", priority = 100, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.u  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/u.class */
public class u extends s {
    private static /* synthetic */ int[] lIIllIlIlIlIl;
    private static /* synthetic */ String[] lIIllIlIlIlII;
    public static final /* synthetic */ List<String> af;

    private static boolean lIllIIIIlIIllII(int i, int i2) {
        return i < i2;
    }

    @Inject
    public u(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void lIllIIIIlIIIlll() {
        lIIllIlIlIlII = new String[lIIllIlIlIlIl[24]];
        lIIllIlIlIlII[lIIllIlIlIlIl[1]] = lIllIIIIlIIIlII("tk6bvN+J11Y=", "UPSmx");
        lIIllIlIlIlII[lIIllIlIlIlIl[0]] = lIllIIIIlIIIlII("w9jhUQK4IfG6bLPofBs3VQ==", "BreNS");
        lIIllIlIlIlII[lIIllIlIlIlIl[5]] = lIllIIIIlIIIlIl("EAgZAw==", "TzvsA");
        lIIllIlIlIlII[lIIllIlIlIlIl[6]] = lIllIIIIlIIIlII("f0J13Oc2w5Q=", "isjEe");
        lIIllIlIlIlII[lIIllIlIlIlIl[8]] = lIllIIIIlIIIllI("Xq4zVLGFrVTurnbLb70hIw==", "xOTHm");
        lIIllIlIlIlII[lIIllIlIlIlIl[9]] = lIllIIIIlIIIlIl("HCQDChhsIw0UAGw1CwgH", "LAbxt");
        lIIllIlIlIlII[lIIllIlIlIlIl[10]] = lIllIIIIlIIIllI("3oQnlHXlkrELHdMTvDSzmKnCqDGamqkr", "XcwnW");
        lIIllIlIlIlII[lIIllIlIlIlIl[11]] = lIllIIIIlIIIlII("S1rpw3oznEzrD6EUrtNYtA==", "AMKiq");
        lIIllIlIlIlII[lIIllIlIlIlIl[12]] = lIllIIIIlIIIlIl("CiUIMQkwNh1hAzYoDGEVMDQL", "YDxAa");
        lIIllIlIlIlII[lIIllIlIlIlIl[13]] = lIllIIIIlIIIlII("vNb4TeQ5faxX1lLfhZON/w==", "fiGhs");
        lIIllIlIlIlII[lIIllIlIlIlIl[14]] = lIllIIIIlIIIllI("0pJPjvWUPB+fA+goYej/2Q==", "ebnkK");
        lIIllIlIlIlII[lIIllIlIlIlIl[15]] = lIllIIIIlIIIlII("If9FUnHnMYGqnI8vux6l3g==", "NVLeH");
        lIIllIlIlIlII[lIIllIlIlIlIl[16]] = lIllIIIIlIIIllI("+98yZnhi8PKWjzC9ZHhM0R4RhOBT4Zc7", "BeEOA");
        lIIllIlIlIlII[lIIllIlIlIlIl[17]] = lIllIIIIlIIIlII("gRgKmKQXWcx5KkTaXgQsvQ==", "zuAKn");
        lIIllIlIlIlII[lIIllIlIlIlIl[18]] = lIllIIIIlIIIllI("G8raaAUrMJLBATg4FjYvTg==", "LVfCg");
        lIIllIlIlIlII[lIIllIlIlIlIl[19]] = lIllIIIIlIIIlII("MwfbAGxs4hkhQ2nFcbxIp2aJhejpJ81B", "xcrUs");
        lIIllIlIlIlII[lIIllIlIlIlIl[20]] = lIllIIIIlIIIlIl("OCE9CwYeKz8JBlo3NAID", "zDQgg");
        lIIllIlIlIlII[lIIllIlIlIlIl[7]] = lIllIIIIlIIIlIl("AAkuGTcwSD4IJyc=", "ChMmB");
        lIIllIlIlIlII[lIIllIlIlIlIl[21]] = lIllIIIIlIIIllI("KJGinJxBGHeEXndd50N6RQ==", "Oyief");
        lIIllIlIlIlII[lIIllIlIlIlIl[22]] = lIllIIIIlIIIllI("RvFcH36NwgoJy5NBQo0G+A==", "bGTxo");
        lIIllIlIlIlII[lIIllIlIlIlIl[23]] = lIllIIIIlIIIlIl("HgEkATcvBThIMicGJAE3", "FdVhT");
    }

    private static String lIllIIIIlIIIlII(String llllllllllllllIllllIIIIIllIllIll, String llllllllllllllIllllIIIIIllIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIllIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIIllIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIIllIlllIl.init(lIIllIlIlIlIl[5], secretKeySpec);
            return new String(llllllllllllllIllllIIIIIllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIIllIlllII) {
            llllllllllllllIllllIIIIIllIlllII.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlIIIlIl(String llllllllllllllIllllIIIIIllIIlIll, String llllllllllllllIllllIIIIIllIIlIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIIllIIlIIl = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIIIIllIIlIlI.toCharArray();
        int llllllllllllllIllllIIIIIllIIIlll = lIIllIlIlIlIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIlIlIlIl[1];
        while (lIllIIIIlIIllII(i, length)) {
            char llllllllllllllIllllIIIIIllIIllII = charArray2[i];
            llllllllllllllIllllIIIIIllIIlIIl.append((char) (llllllllllllllIllllIIIIIllIIllII ^ charArray[llllllllllllllIllllIIIIIllIIIlll % charArray.length]));
            "".length();
            llllllllllllllIllllIIIIIllIIIlll++;
            i++;
            "".length();
            if ((((31 ^ 62) ^ (228 ^ 128)) & (((((193 + 167) - 228) + 122) ^ (((86 + 71) - 140) + 170)) ^ (-" ".length()))) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIIIIllIIlIIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.s
    public boolean l() {
        if (lIllIIIIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
            if (lIllIIIIlIIlIIl(Dialog.hasOption(str -> {
                return str.contains(lIIllIlIlIlII[lIIllIlIlIlIl[6]]);
            }) ? 1 : 0)) {
                String[] strArr = new String[lIIllIlIlIlIl[0]];
                strArr[lIIllIlIlIlIl[1]] = lIIllIlIlIlII[lIIllIlIlIlIl[1]];
                Dialog.chooseOption(strArr);
                "".length();
                return lIIllIlIlIlIl[0];
            }
            return lIIllIlIlIlIl[1];
        } else if (!lIllIIIIlIIlIlI(Players.getLocal().getAnimation(), lIIllIlIlIlIl[2]) || lIllIIIIlIIlIll(Players.getLocal().getAnimation(), lIIllIlIlIlIl[3])) {
            return lIIllIlIlIlIl[1];
        } else {
            int[] iArr = new int[lIIllIlIlIlIl[0]];
            iArr[lIIllIlIlIlIl[1]] = lIIllIlIlIlIl[4];
            if (lIllIIIIlIIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIllIlIlIlIl[0]];
                iArr2[lIIllIlIlIlIl[1]] = lIIllIlIlIlIl[4];
                Inventory.getFirst(iArr2).interact(lIIllIlIlIlII[lIIllIlIlIlIl[0]]);
                return lIIllIlIlIlIl[0];
            } else if (lIllIIIIlIIlIIl(Inventory.contains(item -> {
                return af.contains(item.getName());
            }) ? 1 : 0)) {
                Inventory.getFirst(item2 -> {
                    return af.contains(item2.getName());
                }).interact(lIIllIlIlIlII[lIIllIlIlIlIl[5]]);
                return lIIllIlIlIlIl[0];
            } else {
                return lIIllIlIlIlIl[1];
            }
        }
    }

    private static void lIllIIIIlIIlIII() {
        lIIllIlIlIlIl = new int[25];
        lIIllIlIlIlIl[0] = " ".length();
        lIIllIlIlIlIl[1] = (59 ^ 26) & ((164 ^ 133) ^ (-1));
        lIIllIlIlIlIl[2] = (-((-9753) & 32575)) & (-65) & 23423;
        lIIllIlIlIlIl[3] = (-4583) & 5118;
        lIIllIlIlIlIl[4] = (-2340) & 15731;
        lIIllIlIlIlIl[5] = "  ".length();
        lIIllIlIlIlIl[6] = "   ".length();
        lIIllIlIlIlIl[7] = 145 ^ 128;
        lIIllIlIlIlIl[8] = 33 ^ 37;
        lIIllIlIlIlIl[9] = (((124 + 12) - 122) + 136) ^ (((18 + 141) - 30) + 18);
        lIIllIlIlIlIl[10] = (96 ^ 119) ^ (111 ^ 126);
        lIIllIlIlIlIl[11] = 10 ^ 13;
        lIIllIlIlIlIl[12] = (((112 + 111) - 208) + 134) ^ (((39 + 143) - 99) + 74);
        lIIllIlIlIlIl[13] = 144 ^ 153;
        lIIllIlIlIlIl[14] = (163 ^ 194) ^ (102 ^ 13);
        lIIllIlIlIlIl[15] = 0 ^ 11;
        lIIllIlIlIlIl[16] = (195 ^ 197) ^ (11 ^ 1);
        lIIllIlIlIlIl[17] = 88 ^ 85;
        lIIllIlIlIlIl[18] = 185 ^ 183;
        lIIllIlIlIlIl[19] = (34 ^ 84) ^ (186 ^ 195);
        lIIllIlIlIlIl[20] = (221 ^ 137) ^ (228 ^ 160);
        lIIllIlIlIlIl[21] = 70 ^ 84;
        lIIllIlIlIlIl[22] = (18 ^ 3) ^ "  ".length();
        lIIllIlIlIlIl[23] = 180 ^ 160;
        lIIllIlIlIlIl[24] = (195 ^ 175) ^ (110 ^ 23);
    }

    private static boolean lIllIIIIlIIlIIl(int i) {
        return i != 0;
    }

    static {
        lIllIIIIlIIlIII();
        lIllIIIIlIIIlll();
        String[] strArr = new String[lIIllIlIlIlIl[7]];
        strArr[lIIllIlIlIlIl[1]] = lIIllIlIlIlII[lIIllIlIlIlIl[8]];
        strArr[lIIllIlIlIlIl[0]] = lIIllIlIlIlII[lIIllIlIlIlIl[9]];
        strArr[lIIllIlIlIlIl[5]] = lIIllIlIlIlII[lIIllIlIlIlIl[10]];
        strArr[lIIllIlIlIlIl[6]] = lIIllIlIlIlII[lIIllIlIlIlIl[11]];
        strArr[lIIllIlIlIlIl[8]] = lIIllIlIlIlII[lIIllIlIlIlIl[12]];
        strArr[lIIllIlIlIlIl[9]] = lIIllIlIlIlII[lIIllIlIlIlIl[13]];
        strArr[lIIllIlIlIlIl[10]] = lIIllIlIlIlII[lIIllIlIlIlIl[14]];
        strArr[lIIllIlIlIlIl[11]] = lIIllIlIlIlII[lIIllIlIlIlIl[15]];
        strArr[lIIllIlIlIlIl[12]] = lIIllIlIlIlII[lIIllIlIlIlIl[16]];
        strArr[lIIllIlIlIlIl[13]] = lIIllIlIlIlII[lIIllIlIlIlIl[17]];
        strArr[lIIllIlIlIlIl[14]] = lIIllIlIlIlII[lIIllIlIlIlIl[18]];
        strArr[lIIllIlIlIlIl[15]] = lIIllIlIlIlII[lIIllIlIlIlIl[19]];
        strArr[lIIllIlIlIlIl[16]] = lIIllIlIlIlII[lIIllIlIlIlIl[20]];
        strArr[lIIllIlIlIlIl[17]] = lIIllIlIlIlII[lIIllIlIlIlIl[7]];
        strArr[lIIllIlIlIlIl[18]] = lIIllIlIlIlII[lIIllIlIlIlIl[21]];
        strArr[lIIllIlIlIlIl[19]] = lIIllIlIlIlII[lIIllIlIlIlIl[22]];
        strArr[lIIllIlIlIlIl[20]] = lIIllIlIlIlII[lIIllIlIlIlIl[23]];
        af = List.of((Object[]) strArr);
    }

    private static boolean lIllIIIIlIIlIlI(int i, int i2) {
        return i != i2;
    }

    private static String lIllIIIIlIIIllI(String llllllllllllllIllllIIIIIlIllIlII, String llllllllllllllIllllIIIIIlIllIlIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIlIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), lIIllIlIlIlIl[12]), "DES");
            Cipher llllllllllllllIllllIIIIIlIlllIII = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIIlIlllIII.init(lIIllIlIlIlIl[5], llllllllllllllIllllIIIIIlIlllIIl);
            return new String(llllllllllllllIllllIIIIIlIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIIlIllIlll) {
            llllllllllllllIllllIIIIIlIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlIIlIll(int i, int i2) {
        return i == i2;
    }
}
