/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.s;

@TaskDesc(name="Cleaning inventory", priority=100, blocking=true)
public class u
extends s {
    private static /* synthetic */ int[] lIIllIlIlIlIl;
    private static /* synthetic */ String[] lIIllIlIlIlII;
    public static final /* synthetic */ List<String> af;

    private static boolean lIllIIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public u(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void lIllIIIIlIIIlll() {
        lIIllIlIlIlII = new String[lIIllIlIlIlIl[24]];
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[1]] = u.lIllIIIIlIIIlII("tk6bvN+J11Y=", "UPSmx");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[0]] = u.lIllIIIIlIIIlII("w9jhUQK4IfG6bLPofBs3VQ==", "BreNS");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[5]] = u.lIllIIIIlIIIlIl("EAgZAw==", "TzvsA");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[6]] = u.lIllIIIIlIIIlII("f0J13Oc2w5Q=", "isjEe");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[8]] = u.lIllIIIIlIIIllI("Xq4zVLGFrVTurnbLb70hIw==", "xOTHm");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[9]] = u.lIllIIIIlIIIlIl("HCQDChhsIw0UAGw1CwgH", "LAbxt");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[10]] = u.lIllIIIIlIIIllI("3oQnlHXlkrELHdMTvDSzmKnCqDGamqkr", "XcwnW");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[11]] = u.lIllIIIIlIIIlII("S1rpw3oznEzrD6EUrtNYtA==", "AMKiq");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[12]] = u.lIllIIIIlIIIlIl("CiUIMQkwNh1hAzYoDGEVMDQL", "YDxAa");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[13]] = u.lIllIIIIlIIIlII("vNb4TeQ5faxX1lLfhZON/w==", "fiGhs");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[14]] = u.lIllIIIIlIIIllI("0pJPjvWUPB+fA+goYej/2Q==", "ebnkK");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[15]] = u.lIllIIIIlIIIlII("If9FUnHnMYGqnI8vux6l3g==", "NVLeH");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[16]] = u.lIllIIIIlIIIllI("+98yZnhi8PKWjzC9ZHhM0R4RhOBT4Zc7", "BeEOA");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[17]] = u.lIllIIIIlIIIlII("gRgKmKQXWcx5KkTaXgQsvQ==", "zuAKn");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[18]] = u.lIllIIIIlIIIllI("G8raaAUrMJLBATg4FjYvTg==", "LVfCg");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[19]] = u.lIllIIIIlIIIlII("MwfbAGxs4hkhQ2nFcbxIp2aJhejpJ81B", "xcrUs");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[20]] = u.lIllIIIIlIIIlIl("OCE9CwYeKz8JBlo3NAID", "zDQgg");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[7]] = u.lIllIIIIlIIIlIl("AAkuGTcwSD4IJyc=", "ChMmB");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[21]] = u.lIllIIIIlIIIllI("KJGinJxBGHeEXndd50N6RQ==", "Oyief");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[22]] = u.lIllIIIIlIIIllI("RvFcH36NwgoJy5NBQo0G+A==", "bGTxo");
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[23]] = u.lIllIIIIlIIIlIl("HgEkATcvBThIMicGJAE3", "FdVhT");
    }

    private static String lIllIIIIlIIIlII(String llllllllllllllIllllIIIIIllIllIIl, String llllllllllllllIllllIIIIIllIllIII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIllIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIIllIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIIllIlllIl.init(lIIllIlIlIlIl[5], llllllllllllllIllllIIIIIllIllllI);
            return new String(llllllllllllllIllllIIIIIllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIIllIlllII) {
            llllllllllllllIllllIIIIIllIlllII.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlIIIlIl(String llllllllllllllIllllIIIIIllIIlIll, String llllllllllllllIllllIIIIIllIIlIlI) {
        llllllllllllllIllllIIIIIllIIlIll = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIIllIIlIIl = new StringBuilder();
        char[] llllllllllllllIllllIIIIIllIIlIII = llllllllllllllIllllIIIIIllIIlIlI.toCharArray();
        int llllllllllllllIllllIIIIIllIIIlll = lIIllIlIlIlIl[1];
        char[] llllllllllllllIllllIIIIIllIIIIIl = llllllllllllllIllllIIIIIllIIlIll.toCharArray();
        int llllllllllllllIllllIIIIIllIIIIII = llllllllllllllIllllIIIIIllIIIIIl.length;
        int llllllllllllllIllllIIIIIlIllllll = lIIllIlIlIlIl[1];
        while (u.lIllIIIIlIIllII(llllllllllllllIllllIIIIIlIllllll, llllllllllllllIllllIIIIIllIIIIII)) {
            char llllllllllllllIllllIIIIIllIIllII = llllllllllllllIllllIIIIIllIIIIIl[llllllllllllllIllllIIIIIlIllllll];
            llllllllllllllIllllIIIIIllIIlIIl.append((char)(llllllllllllllIllllIIIIIllIIllII ^ llllllllllllllIllllIIIIIllIIlIII[llllllllllllllIllllIIIIIllIIIlll % llllllllllllllIllllIIIIIllIIlIII.length]));
            "".length();
            ++llllllllllllllIllllIIIIIllIIIlll;
            ++llllllllllllllIllllIIIIIlIllllll;
            "".length();
            if (((0x1F ^ 0x3E ^ (0xE4 ^ 0x80)) & (193 + 167 - 228 + 122 ^ 86 + 71 - 140 + 170 ^ -" ".length())) < "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIIIllIIlIIl);
    }

    @Override
    public boolean l() {
        if (u.lIllIIIIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
            if (u.lIllIIIIlIIlIIl(Dialog.hasOption(string -> string.contains(lIIllIlIlIlII[lIIllIlIlIlIl[6]])) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIlIlIlIl[0]];
                stringArray[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlII[lIIllIlIlIlIl[1]];
                Dialog.chooseOption((String[])stringArray);
                "".length();
                return lIIllIlIlIlIl[0];
            }
            return lIIllIlIlIlIl[1];
        }
        if (!u.lIllIIIIlIIlIlI(Players.getLocal().getAnimation(), lIIllIlIlIlIl[2]) || u.lIllIIIIlIIlIll(Players.getLocal().getAnimation(), lIIllIlIlIlIl[3])) {
            return lIIllIlIlIlIl[1];
        }
        int[] nArray = new int[lIIllIlIlIlIl[0]];
        nArray[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlIl[4];
        if (u.lIllIIIIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIllIlIlIlIl[0]];
            nArray2[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlIl[4];
            Inventory.getFirst((int[])nArray2).interact(lIIllIlIlIlII[lIIllIlIlIlIl[0]]);
            return lIIllIlIlIlIl[0];
        }
        if (u.lIllIIIIlIIlIIl(Inventory.contains(item -> af.contains(item.getName())) ? 1 : 0)) {
            Inventory.getFirst(item -> af.contains(item.getName())).interact(lIIllIlIlIlII[lIIllIlIlIlIl[5]]);
            return lIIllIlIlIlIl[0];
        }
        return lIIllIlIlIlIl[1];
    }

    private static void lIllIIIIlIIlIII() {
        lIIllIlIlIlIl = new int[25];
        u.lIIllIlIlIlIl[0] = " ".length();
        u.lIIllIlIlIlIl[1] = (0x3B ^ 0x1A) & ~(0xA4 ^ 0x85);
        u.lIIllIlIlIlIl[2] = -(0xFFFFD9E7 & 0x7F3F) & (0xFFFFFFBF & 0x5B7F);
        u.lIIllIlIlIlIl[3] = 0xFFFFEE19 & 0x13FE;
        u.lIIllIlIlIlIl[4] = 0xFFFFF6DC & 0x3D73;
        u.lIIllIlIlIlIl[5] = "  ".length();
        u.lIIllIlIlIlIl[6] = "   ".length();
        u.lIIllIlIlIlIl[7] = 0x91 ^ 0x80;
        u.lIIllIlIlIlIl[8] = 0x21 ^ 0x25;
        u.lIIllIlIlIlIl[9] = 124 + 12 - 122 + 136 ^ 18 + 141 - 30 + 18;
        u.lIIllIlIlIlIl[10] = 0x60 ^ 0x77 ^ (0x6F ^ 0x7E);
        u.lIIllIlIlIlIl[11] = 0xA ^ 0xD;
        u.lIIllIlIlIlIl[12] = 112 + 111 - 208 + 134 ^ 39 + 143 - 99 + 74;
        u.lIIllIlIlIlIl[13] = 0x90 ^ 0x99;
        u.lIIllIlIlIlIl[14] = 0xA3 ^ 0xC2 ^ (0x66 ^ 0xD);
        u.lIIllIlIlIlIl[15] = 0 ^ 0xB;
        u.lIIllIlIlIlIl[16] = 0xC3 ^ 0xC5 ^ (0xB ^ 1);
        u.lIIllIlIlIlIl[17] = 0x58 ^ 0x55;
        u.lIIllIlIlIlIl[18] = 0xB9 ^ 0xB7;
        u.lIIllIlIlIlIl[19] = 0x22 ^ 0x54 ^ (0xBA ^ 0xC3);
        u.lIIllIlIlIlIl[20] = 0xDD ^ 0x89 ^ (0xE4 ^ 0xA0);
        u.lIIllIlIlIlIl[21] = 0x46 ^ 0x54;
        u.lIIllIlIlIlIl[22] = 0x12 ^ 3 ^ "  ".length();
        u.lIIllIlIlIlIl[23] = 0xB4 ^ 0xA0;
        u.lIIllIlIlIlIl[24] = 0xC3 ^ 0xAF ^ (0x6E ^ 0x17);
    }

    private static boolean lIllIIIIlIIlIIl(int n2) {
        return n2 != 0;
    }

    static {
        u.lIllIIIIlIIlIII();
        u.lIllIIIIlIIIlll();
        String[] stringArray = new String[lIIllIlIlIlIl[7]];
        stringArray[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlII[lIIllIlIlIlIl[8]];
        stringArray[u.lIIllIlIlIlIl[0]] = lIIllIlIlIlII[lIIllIlIlIlIl[9]];
        stringArray[u.lIIllIlIlIlIl[5]] = lIIllIlIlIlII[lIIllIlIlIlIl[10]];
        stringArray[u.lIIllIlIlIlIl[6]] = lIIllIlIlIlII[lIIllIlIlIlIl[11]];
        stringArray[u.lIIllIlIlIlIl[8]] = lIIllIlIlIlII[lIIllIlIlIlIl[12]];
        stringArray[u.lIIllIlIlIlIl[9]] = lIIllIlIlIlII[lIIllIlIlIlIl[13]];
        stringArray[u.lIIllIlIlIlIl[10]] = lIIllIlIlIlII[lIIllIlIlIlIl[14]];
        stringArray[u.lIIllIlIlIlIl[11]] = lIIllIlIlIlII[lIIllIlIlIlIl[15]];
        stringArray[u.lIIllIlIlIlIl[12]] = lIIllIlIlIlII[lIIllIlIlIlIl[16]];
        stringArray[u.lIIllIlIlIlIl[13]] = lIIllIlIlIlII[lIIllIlIlIlIl[17]];
        stringArray[u.lIIllIlIlIlIl[14]] = lIIllIlIlIlII[lIIllIlIlIlIl[18]];
        stringArray[u.lIIllIlIlIlIl[15]] = lIIllIlIlIlII[lIIllIlIlIlIl[19]];
        stringArray[u.lIIllIlIlIlIl[16]] = lIIllIlIlIlII[lIIllIlIlIlIl[20]];
        stringArray[u.lIIllIlIlIlIl[17]] = lIIllIlIlIlII[lIIllIlIlIlIl[7]];
        stringArray[u.lIIllIlIlIlIl[18]] = lIIllIlIlIlII[lIIllIlIlIlIl[21]];
        stringArray[u.lIIllIlIlIlIl[19]] = lIIllIlIlIlII[lIIllIlIlIlIl[22]];
        stringArray[u.lIIllIlIlIlIl[20]] = lIIllIlIlIlII[lIIllIlIlIlIl[23]];
        af = List.of(stringArray);
    }

    private static boolean lIllIIIIlIIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIllIIIIlIIIllI(String llllllllllllllIllllIIIIIlIllIllI, String llllllllllllllIllllIIIIIlIllIIll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIlIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIlIllIIll.getBytes(StandardCharsets.UTF_8)), lIIllIlIlIlIl[12]), "DES");
            Cipher llllllllllllllIllllIIIIIlIlllIII = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIIlIlllIII.init(lIIllIlIlIlIl[5], llllllllllllllIllllIIIIIlIlllIIl);
            return new String(llllllllllllllIllllIIIIIlIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIIlIllIlll) {
            llllllllllllllIllllIIIIIlIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlIIlIll(int n2, int n3) {
        return n2 == n3;
    }
}

