/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Performing detailed step")
public class bk
extends Task {
    private static /* synthetic */ String[] llIIlIll;
    private static /* synthetic */ int[] llIIllII;
    private final /* synthetic */ SquireQuestHelper fN;

    private static boolean lIllIlIlII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIllII() {
        llIIlIll = new String[llIIllII[7]];
        bk.llIIlIll[bk.llIIllII[0]] = bk.lIllIIlIII("vHI8jN6EJHiPZDSFYR+8xzImQWILku4S", "UKxgd");
        bk.llIIlIll[bk.llIIllII[2]] = bk.lIllIIlIII("8iZuzyEbym1wcWYb26I42EgluCYmA2R9", "ahsbA");
        bk.llIIlIll[bk.llIIllII[3]] = bk.lIllIIlIIl("L+Ktpi25yQ0=", "ZYyFL");
        bk.llIIlIll[bk.llIIllII[4]] = bk.lIllIIlIlI("IzYbCQ==", "qSzmC");
        bk.llIIlIll[bk.llIIllII[5]] = bk.lIllIIlIIl("Ot/EmBFf608=", "jZVTo");
        bk.llIIlIll[bk.llIIllII[6]] = bk.lIllIIlIlI("Cww0KA==", "YiULY");
    }

    static {
        bk.lIllIlIIll();
        bk.lIllIIllII();
    }

    private static boolean lIllIllIII(Object object) {
        return object != null;
    }

    private static String lIllIIlIlI(String llIllIIllIllllI, String llIllIIllIllIII) {
        llIllIIllIllllI = new String(Base64.getDecoder().decode(llIllIIllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIIllIlllII = new StringBuilder();
        char[] llIllIIllIllIll = llIllIIllIllIII.toCharArray();
        int llIllIIllIllIlI = llIIllII[0];
        char[] llIllIIllIlIlII = llIllIIllIllllI.toCharArray();
        int llIllIIllIlIIll = llIllIIllIlIlII.length;
        int llIllIIllIlIIlI = llIIllII[0];
        while (bk.lIllIllIll(llIllIIllIlIIlI, llIllIIllIlIIll)) {
            char llIllIIllIlllll = llIllIIllIlIlII[llIllIIllIlIIlI];
            llIllIIllIlllII.append((char)(llIllIIllIlllll ^ llIllIIllIllIll[llIllIIllIllIlI % llIllIIllIllIll.length]));
            "".length();
            ++llIllIIllIllIlI;
            ++llIllIIllIlIIlI;
            "".length();
            if (" ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llIllIIllIlllII);
    }

    private static String lIllIIlIII(String llIllIIlllllIll, String llIllIIlllllIlI) {
        try {
            SecretKeySpec llIllIIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIlllllIlI.getBytes(StandardCharsets.UTF_8)), llIIllII[8]), "DES");
            Cipher llIllIIllllllIl = Cipher.getInstance("DES");
            llIllIIllllllIl.init(llIIllII[3], llIllIIlllllllI);
            return new String(llIllIIllllllIl.doFinal(Base64.getDecoder().decode(llIllIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIIllllllII) {
            llIllIIllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIl(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        bk llIllIlIIIIIllI;
        String string = this.fN.cz();
        if (bk.lIllIlIlII(string.equals(llIIlIll[llIIllII[0]]) ? 1 : 0)) {
            return llIIllII[0];
        }
        int llIllIlIIIIIlII = llIllIlIIIIIllI.fN.cJ();
        if (bk.lIllIlIllI(llIllIlIIIIIlII, llIIllII[1])) {
            int[] nArray = new int[llIIllII[2]];
            nArray[bk.llIIllII[0]] = llIllIlIIIIIlII;
            Item llIllIlIIIIIIll = Inventory.getFirst((int[])nArray);
            if (bk.lIllIllIII(llIllIlIIIIIIll)) {
                Log.info((String)llIIlIll[llIIllII[2]]);
                String[] stringArray = new String[llIIllII[3]];
                stringArray[bk.llIIllII[0]] = llIIlIll[llIIllII[3]];
                stringArray[bk.llIIllII[2]] = llIIlIll[llIIllII[4]];
                if (bk.lIllIllIIl(llIllIlIIIIIIll.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIIllII[3]];
                    stringArray2[bk.llIIllII[0]] = llIIlIll[llIIllII[5]];
                    stringArray2[bk.llIIllII[2]] = llIIlIll[llIIllII[6]];
                    llIllIlIIIIIIll.interact(stringArray2);
                    "".length();
                    if (-"   ".length() > 0) {
                        return ((0x70 ^ 0x4D ^ (0x6B ^ 5)) & (46 + 31 - 28 + 78 ^ (0x4E ^ 0x62) ^ -" ".length())) != 0;
                    }
                } else {
                    llIllIlIIIIIIll.interact(llIIllII[0]);
                }
                llIllIlIIIIIllI.sleep(llIIllII[5]);
                return llIIllII[2];
            }
        }
        return llIIllII[0];
    }

    private static void lIllIlIIll() {
        llIIllII = new int[9];
        bk.llIIllII[0] = (0x71 ^ 0x26 ^ (0xC5 ^ 0x9F)) & (0xAC ^ 0xC7 ^ (0x4C ^ 0x2A) ^ -" ".length());
        bk.llIIllII[1] = -" ".length();
        bk.llIIllII[2] = " ".length();
        bk.llIIllII[3] = "  ".length();
        bk.llIIllII[4] = "   ".length();
        bk.llIIllII[5] = 0x48 ^ 0x4C;
        bk.llIIllII[6] = 0xB3 ^ 0xB6;
        bk.llIIllII[7] = 0x8F ^ 0x89;
        bk.llIIllII[8] = 0xC ^ 0x6A ^ (0x3F ^ 0x51);
    }

    private static boolean lIllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIllI(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public bk(SquireQuestHelper squireQuestHelper) {
        this.fN = squireQuestHelper;
    }

    private static String lIllIIlIIl(String llIllIIlllIllII, String llIllIIlllIllIl) {
        try {
            SecretKeySpec llIllIIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIIllllIIII = Cipher.getInstance("Blowfish");
            llIllIIllllIIII.init(llIIllII[3], llIllIIllllIIIl);
            return new String(llIllIIllllIIII.doFinal(Base64.getDecoder().decode(llIllIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIIlllIllll) {
            llIllIIlllIllll.printStackTrace();
            return null;
        }
    }
}

