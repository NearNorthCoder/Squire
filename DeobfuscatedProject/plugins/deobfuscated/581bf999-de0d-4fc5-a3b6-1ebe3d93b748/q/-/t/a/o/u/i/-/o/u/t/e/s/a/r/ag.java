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

@TaskDesc(name="Drinking prayer", priority=85)
public class ag
extends Z {
    private final /* synthetic */ C cK;
    private static /* synthetic */ String[] lIllllllllI;
    private static /* synthetic */ int[] llIIIIIIIII;

    private static boolean lIIlllIIIIIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected ag(Client client, C c2) {
        super(client);
        this.cK = c2;
    }

    private static boolean lIIlllIIIIlIII(int n2) {
        return n2 == 0;
    }

    static {
        ag.lIIlllIIIIIIll();
        ag.lIIlllIIIIIIlI();
    }

    private static String lIIlllIIIIIIIl(String llllllllllllllllIlIIlIIIlIIlllII, String llllllllllllllllIlIIlIIIlIIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIIIlIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIIIlIIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIIIlIIllllI.init(llIIIIIIIII[3], llllllllllllllllIlIIlIIIlIIlllll);
            return new String(llllllllllllllllIlIIlIIIlIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIIIlIIlllIl) {
            llllllllllllllllIlIIlIIIlIIlllIl.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        ag llllllllllllllllIlIIlIIIlIlIlIII;
        int llllllllllllllllIlIIlIIIlIlIIlll;
        int n2;
        if (ag.lIIlllIIIIIlII(this.aq() ? 1 : 0)) {
            n2 = llIIIIIIIII[0];
            0;
            if (-1 >= 0) {
                return ((171 + 118 - 154 + 38 ^ 9 + 48 - 48 + 123) & (49 + 20 - 67 + 184 ^ 113 + 114 - 196 + 116 ^ -1)) != 0;
            }
        } else {
            n2 = llllllllllllllllIlIIlIIIlIlIIlll = llIIIIIIIII[1];
        }
        if (ag.lIIlllIIIIIlIl(Prayers.getPoints(), llllllllllllllllIlIIlIIIlIlIIlll)) {
            return llIIIIIIIII[1];
        }
        Item llllllllllllllllIlIIlIIIlIlIIllI = Inventory.getFirst(item -> {
            int n2;
            if (!ag.lIIlllIIIIlIII(e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !ag.lIIlllIIIIlIII(item.getName().contains(lIllllllllI[llIIIIIIIII[2]]) ? 1 : 0) || !ag.lIIlllIIIIlIII(item.getName().contains(lIllllllllI[llIIIIIIIII[3]]) ? 1 : 0) || ag.lIIlllIIIIIlII(item.getName().contains(lIllllllllI[llIIIIIIIII[4]]) ? 1 : 0)) {
                n2 = llIIIIIIIII[2];
                0;
                if (null != null) {
                    return ((18 + 124 - 5 + 1 ^ 146 + 13 - 115 + 146) & (0x3E ^ 0x48 ^ (0x6D ^ 0x2F) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIIIIIII[1];
            }
            return n2 != 0;
        });
        if (ag.lIIlllIIIIIlll(llllllllllllllllIlIIlIIIlIlIIllI) && ag.lIIlllIIIIIlII(llllllllllllllllIlIIlIIIlIlIlIII.cK.am() ? 1 : 0)) {
            llllllllllllllllIlIIlIIIlIlIIllI.interact(lIllllllllI[llIIIIIIIII[1]]);
            llllllllllllllllIlIIlIIIlIlIlIII.cK.ao();
            return llIIIIIIIII[2];
        }
        return llIIIIIIIII[1];
    }

    private static String lIIlllIIIIIIII(String llllllllllllllllIlIIlIIIlIIIllIl, String llllllllllllllllIlIIlIIIlIIIlllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIIIlIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), llIIIIIIIII[6]), "DES");
            Cipher llllllllllllllllIlIIlIIIlIIlIIIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIIIlIIlIIIl.init(llIIIIIIIII[3], llllllllllllllllIlIIlIIIlIIlIIlI);
            return new String(llllllllllllllllIlIIlIIIlIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIIIlIIlIIII) {
            llllllllllllllllIlIIlIIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlllIIIIIIlI() {
        lIllllllllI = new String[llIIIIIIIII[5]];
        ag.lIllllllllI[ag.llIIIIIIIII[1]] = ag."Drink";
        ag.lIllllllllI[ag.llIIIIIIIII[2]] = ag."restore";
        ag.lIllllllllI[ag.llIIIIIIIII[3]] = ag."Prayer";
        ag.lIllllllllI[ag.llIIIIIIIII[4]] = ag."Sanfew";
    }

    private static boolean lIIlllIIIIIlll(Object object) {
        return object != null;
    }

    private static void lIIlllIIIIIIll() {
        llIIIIIIIII = new int[7];
        ag.llIIIIIIIII[0] = 0x75 ^ 0x50 ^ (0x90 ^ 0x86);
        ag.llIIIIIIIII[1] = 2 & (2 ^ -1);
        ag.llIIIIIIIII[2] = 1;
        ag.llIIIIIIIII[3] = 2;
        ag.llIIIIIIIII[4] = 3;
        ag.llIIIIIIIII[5] = 0x3F ^ 0x3B;
        ag.llIIIIIIIII[6] = 79 + 33 - 12 + 31 ^ 37 + 54 - 78 + 126;
    }
}

