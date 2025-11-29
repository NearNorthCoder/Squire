/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

@TaskDesc(name="Withdrawing supplies", priority=5000, blocking=true)
public class cd
extends Z {
    private static /* synthetic */ String[] llIIlllIIII;
    private static /* synthetic */ int[] llIIlllIIIl;
    private final /* synthetic */ C hK;

    private static boolean lIlIIIllIlIIII(Object object) {
        return object == null;
    }

    private static /* synthetic */ boolean a(e e2, Item item) {
        return e2.p().contains(item.getId());
    }

    private static boolean lIlIIIllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIllIlIlIl(int n2) {
        return n2 > 0;
    }

    private static String lIlIIIllIIlIll(String llllllllllllllllIIlllIllIIIlIIIl, String llllllllllllllllIIlllIllIIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlllIllIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIllIIIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIllIIIlIlIl.init(llIIlllIIIl[2], llllllllllllllllIIlllIllIIIlIllI);
            return new String(llllllllllllllllIIlllIllIIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIllIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIllIIIlIlII) {
            llllllllllllllllIIlllIllIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIllIIlllI() {
        llIIlllIIII = new String[llIIlllIIIl[8]];
        cd.llIIlllIIII[cd.llIIlllIIIl[1]] = cd.lIlIIIllIIlIll("ygGOQCCR0FrWdnMQM3Qo4w==", "CgHSr");
        cd.llIIlllIIII[cd.llIIlllIIIl[0]] = cd.lIlIIIllIIlIll("NMAzysRfVbA=", "IvlOo");
        cd.llIIlllIIII[cd.llIIlllIIIl[2]] = cd.lIlIIIllIIllII("vrbyjSnl00qPNUM6/YXaZQ==", "MZhnp");
        cd.llIIlllIIII[cd.llIIlllIIIl[3]] = cd.lIlIIIllIIllIl("Nz4jCTkNLiA=", "dKSyU");
        cd.llIIlllIIII[cd.llIIlllIIIl[4]] = cd.lIlIIIllIIlIll("ZcLGc2O3Wwo=", "DOWhs");
        cd.llIIlllIIII[cd.llIIlllIIIl[5]] = cd.lIlIIIllIIllIl("JT82JAglPw==", "WZEPg");
        cd.llIIlllIIII[cd.llIIlllIIIl[6]] = cd.lIlIIIllIIlIll("9BGihIdY6o4=", "kICsd");
        cd.llIIlllIIII[cd.llIIlllIIIl[7]] = cd.lIlIIIllIIllIl("Jw0qPwsj", "TlDYn");
    }

    static {
        cd.lIlIIIllIIllll();
        cd.lIlIIIllIIlllI();
    }

    private static boolean lIlIIIllIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIllIlIlII(int n2) {
        return n2 <= 0;
    }

    private static String lIlIIIllIIllIl(String llllllllllllllllIIlllIlIllllIllI, String llllllllllllllllIIlllIlIllllIIII) {
        llllllllllllllllIIlllIlIllllIllI = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIlIllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIlIllllIlII = new StringBuilder();
        char[] llllllllllllllllIIlllIlIllllIIll = llllllllllllllllIIlllIlIllllIIII.toCharArray();
        int llllllllllllllllIIlllIlIllllIIlI = llIIlllIIIl[1];
        char[] llllllllllllllllIIlllIlIlllIllII = llllllllllllllllIIlllIlIllllIllI.toCharArray();
        int llllllllllllllllIIlllIlIlllIlIll = llllllllllllllllIIlllIlIlllIllII.length;
        int llllllllllllllllIIlllIlIlllIlIlI = llIIlllIIIl[1];
        while (cd.lIlIIIllIlIllI(llllllllllllllllIIlllIlIlllIlIlI, llllllllllllllllIIlllIlIlllIlIll)) {
            char llllllllllllllllIIlllIlIllllIlll = llllllllllllllllIIlllIlIlllIllII[llllllllllllllllIIlllIlIlllIlIlI];
            llllllllllllllllIIlllIlIllllIlII.append((char)(llllllllllllllllIIlllIlIllllIlll ^ llllllllllllllllIIlllIlIllllIIll[llllllllllllllllIIlllIlIllllIIlI % llllllllllllllllIIlllIlIllllIIll.length]));
            "".length();
            ++llllllllllllllllIIlllIlIllllIIlI;
            ++llllllllllllllllIIlllIlIlllIlIlI;
            "".length();
            if (-(0xD5 ^ 0x9C ^ (0x3A ^ 0x77)) < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIlIllllIlII);
    }

    private static void lIlIIIllIIllll() {
        llIIlllIIIl = new int[9];
        cd.llIIlllIIIl[0] = " ".length();
        cd.llIIlllIIIl[1] = (0x1A ^ 0) & ~(0x83 ^ 0x99);
        cd.llIIlllIIIl[2] = "  ".length();
        cd.llIIlllIIIl[3] = "   ".length();
        cd.llIIlllIIIl[4] = 0xCC ^ 0xC0 ^ (0x3A ^ 0x32);
        cd.llIIlllIIIl[5] = 0xE3 ^ 0xB6 ^ (0xC6 ^ 0x96);
        cd.llIIlllIIIl[6] = 0x43 ^ 0x32 ^ (0x50 ^ 0x27);
        cd.llIIlllIIIl[7] = 0x73 ^ 0x74;
        cd.llIIlllIIIl[8] = 0x84 ^ 0xB8 ^ (0x85 ^ 0xB1);
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(e e2) {
        void llllllllllllllllIIlllIllIIIlllll;
        cd llllllllllllllllIIlllIllIIlIIIII;
        String[] stringArray = new String[llIIlllIIIl[0]];
        stringArray[cd.llIIlllIIIl[1]] = llIIlllIIII[llIIlllIIIl[3]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (cd.lIlIIIllIlIIII(item)) {
            return llIIlllIIIl[1];
        }
        if (cd.lIlIIIllIlIlII(llllllllllllllllIIlllIllIIlIIIII.hK.av().getOrDefault(llllllllllllllllIIlllIllIIIlllll, llIIlllIIIl[1]))) {
            return llIIlllIIIl[1];
        }
        Item llllllllllllllllIIlllIllIIIlllIl = Inventory.getFirst(arg_0 -> cd.a((e)llllllllllllllllIIlllIllIIIlllll, arg_0));
        if (cd.lIlIIIllIlIIII(llllllllllllllllIIlllIllIIIlllIl)) {
            void llllllllllllllllIIlllIllIIIllllI;
            if (cd.lIlIIIllIlIIIl(Inventory.isFull() ? 1 : 0)) {
                return llIIlllIIIl[1];
            }
            if (cd.lIlIIIllIlIlIl(llllllllllllllllIIlllIllIIlIIIII.aX())) {
                return llIIlllIIIl[1];
            }
            if (cd.lIlIIIllIlIIIl(llllllllllllllllIIlllIllIIlIIIII.hK.au() ? 1 : 0)) {
                llllllllllllllllIIlllIllIIlIIIII.hK.a((e)llllllllllllllllIIlllIllIIIlllll);
                return llIIlllIIIl[0];
            }
            llllllllllllllllIIlllIllIIIllllI.interact(llIIlllIIII[llIIlllIIIl[4]]);
            return llIIlllIIIl[0];
        }
        return llIIlllIIIl[1];
    }

    private static boolean lIlIIIllIlIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIllIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llllllllllllllllIIlllIllIIlIIlIl;
        cd llllllllllllllllIIlllIllIIlIIllI;
        String[] stringArray = new String[llIIlllIIIl[0]];
        stringArray[cd.llIIlllIIIl[1]] = llIIlllIIII[llIIlllIIIl[1]];
        Item item2 = Inventory.getFirst((String[])stringArray);
        if (cd.lIlIIIllIlIIII(item2)) {
            return llIIlllIIIl[1];
        }
        if (cd.lIlIIIllIlIIIl(llllllllllllllllIIlllIllIIlIIllI.hK.av().isEmpty() ? 1 : 0)) {
            llllllllllllllllIIlllIllIIlIIlIl.interact(llIIlllIIII[llIIlllIIIl[0]]);
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(llllllllllllllllIIlllIllIIlIIllI.b(e.SMELLING_SALTS) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIlI(llllllllllllllllIIlllIllIIlIIllI.aq() ? 1 : 0)) {
            return llIIlllIIIl[1];
        }
        if (cd.lIlIIIllIlIIIl(Inventory.isFull() ? 1 : 0) && cd.lIlIIIllIlIIlI(Inventory.contains(item -> e.LIQUID_ADRENALINE.d(item.getId())) ? 1 : 0)) {
            llllllllllllllllIIlllIllIIlIIllI.b((Item item) -> {
                boolean bl2;
                if (!cd.lIlIIIllIlIIlI(item.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[5]]) ? 1 : 0) || !cd.lIlIIIllIlIIlI(item.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[6]]) ? 1 : 0) || cd.lIlIIIllIlIIIl(item.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[7]]) ? 1 : 0)) {
                    bl2 = llIIlllIIIl[0];
                    "".length();
                    if (((0xB ^ 0x63 ^ (0x7F ^ 0x46)) & ("  ".length() ^ (0x6B ^ 0x38) ^ -" ".length())) > 0) {
                        return ((0x2D ^ 1 ^ (0x43 ^ 0x48)) & (80 + 35 - 30 + 45 ^ 147 + 77 - 120 + 61 ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIIlllIIIl[1];
                }
                return bl2;
            });
        }
        if (cd.lIlIIIllIlIIIl(llllllllllllllllIIlllIllIIlIIllI.aq() ? 1 : 0) && cd.lIlIIIllIlIIll(Inventory.getFreeSlots(), llIIlllIIIl[0]) && cd.lIlIIIllIlIIIl(Prayers.anyActive() ? 1 : 0)) {
            llllllllllllllllIIlllIllIIlIIlIl.interact(llIIlllIIII[llIIlllIIIl[2]]);
        }
        if (cd.lIlIIIllIlIIIl(llllllllllllllllIIlllIllIIlIIllI.b(e.LIQUID_ADRENALINE) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(llllllllllllllllIIlllIllIIlIIllI.b(e.AMBROSIA) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(llllllllllllllllIIlllIllIIlIIllI.b(e.NECTAR) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(llllllllllllllllIIlllIllIIlIIllI.b(e.SILK_DRESSING) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(llllllllllllllllIIlllIllIIlIIllI.b(e.TEARS_OF_ELIDINIS) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        return llIIlllIIIl[1];
    }

    private static String lIlIIIllIIllII(String llllllllllllllllIIlllIllIIIIIlII, String llllllllllllllllIIlllIllIIIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlllIllIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIllIIIIIIll.getBytes(StandardCharsets.UTF_8)), llIIlllIIIl[8]), "DES");
            Cipher llllllllllllllllIIlllIllIIIIlIII = Cipher.getInstance("DES");
            llllllllllllllllIIlllIllIIIIlIII.init(llIIlllIIIl[2], llllllllllllllllIIlllIllIIIIlIIl);
            return new String(llllllllllllllllIIlllIllIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIllIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIllIIIIIlll) {
            llllllllllllllllIIlllIllIIIIIlll.printStackTrace();
            return null;
        }
    }

    @Inject
    protected cd(Client client, C c2) {
        super(client);
        this.hK = c2;
    }
}

