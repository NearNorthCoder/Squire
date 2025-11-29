/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
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
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.a;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

@TaskDesc(name="Dropping unnecessary supplies", priority=10)
public class aj
extends Z {
    private static /* synthetic */ int[] llIlIIlllII;
    private static /* synthetic */ String[] llIlIIllIll;
    private final /* synthetic */ C cM;

    private static boolean lIlIIllIIIIlll(int n2) {
        return n2 == 0;
    }

    private static void lIlIIllIIIIIII() {
        llIlIIlllII = new int[9];
        aj.llIlIIlllII[0] = (3 ^ 0x50) & ~(0xC6 ^ 0x95);
        aj.llIlIIlllII[1] = "  ".length();
        aj.llIlIIlllII[2] = " ".length();
        aj.llIlIIlllII[3] = "   ".length();
        aj.llIlIIlllII[4] = 0x8D ^ 0x89;
        aj.llIlIIlllII[5] = 0x2D ^ 0x28;
        aj.llIlIIlllII[6] = 192 + 119 - 163 + 51 ^ 48 + 177 - 133 + 101;
        aj.llIlIIlllII[7] = 0x5C ^ 0x5B;
        aj.llIlIIlllII[8] = 0x26 ^ 0x2E;
    }

    private static boolean lIlIIllIIIIllI(int n2) {
        return n2 > 0;
    }

    private static String lIlIIlIlllllII(String llllllllllllllllIIllIlIllIlIIlll, String llllllllllllllllIIllIlIllIlIIlII) {
        try {
            SecretKeySpec llllllllllllllllIIllIlIllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIlIllIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIlIllIlIlIIl.init(llIlIIlllII[1], llllllllllllllllIIllIlIllIlIlIlI);
            return new String(llllllllllllllllIIllIlIllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIlIllIlIlIII) {
            llllllllllllllllIIllIlIllIlIlIII.printStackTrace();
            return null;
        }
    }

    @Inject
    protected aj(Client client, C c2) {
        super(client);
        this.cM = c2;
    }

    private static boolean lIlIIllIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lIlIIllIIIIIlI(int n2) {
        return n2 <= 0;
    }

    private static String lIlIIlIllllllI(String llllllllllllllllIIllIlIllIIlIIlI, String llllllllllllllllIIllIlIllIIlIIIl) {
        llllllllllllllllIIllIlIllIIlIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIlIllIIlIlIl = new StringBuilder();
        char[] llllllllllllllllIIllIlIllIIlIlII = llllllllllllllllIIllIlIllIIlIIIl.toCharArray();
        int llllllllllllllllIIllIlIllIIlIIll = llIlIIlllII[0];
        char[] llllllllllllllllIIllIlIllIIIllIl = llllllllllllllllIIllIlIllIIlIIlI.toCharArray();
        int llllllllllllllllIIllIlIllIIIllII = llllllllllllllllIIllIlIllIIIllIl.length;
        int llllllllllllllllIIllIlIllIIIlIll = llIlIIlllII[0];
        while (aj.lIlIIllIIIIlII(llllllllllllllllIIllIlIllIIIlIll, llllllllllllllllIIllIlIllIIIllII)) {
            char llllllllllllllllIIllIlIllIIllIII = llllllllllllllllIIllIlIllIIIllIl[llllllllllllllllIIllIlIllIIIlIll];
            llllllllllllllllIIllIlIllIIlIlIl.append((char)(llllllllllllllllIIllIlIllIIllIII ^ llllllllllllllllIIllIlIllIIlIlII[llllllllllllllllIIllIlIllIIlIIll % llllllllllllllllIIllIlIllIIlIlII.length]));
            "".length();
            ++llllllllllllllllIIllIlIllIIlIIll;
            ++llllllllllllllllIIllIlIllIIIlIll;
            "".length();
            if (" ".length() < (0x23 ^ 0x27)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIlIllIIlIlIl);
    }

    private static void lIlIIlIlllllll() {
        llIlIIllIll = new String[llIlIIlllII[8]];
        aj.llIlIIllIll[aj.llIlIIlllII[0]] = aj.lIlIIlIlllllII("RaJwK2pmBgw=", "TPghG");
        aj.llIlIIllIll[aj.llIlIIlllII[2]] = aj.lIlIIlIlllllIl("WbmsLE5gPY8=", "naaRo");
        aj.llIlIIllIll[aj.llIlIIlllII[1]] = aj.lIlIIlIlllllIl("ww/CbPqk/ZA=", "soHkE");
        aj.llIlIIllIll[aj.llIlIIlllII[3]] = aj.lIlIIlIlllllIl("3p6KuzH9/fI=", "IzCFI");
        aj.llIlIIllIll[aj.llIlIIlllII[4]] = aj.lIlIIlIlllllII("uPe09Tq7mp4=", "CtsGO");
        aj.llIlIIllIll[aj.llIlIIlllII[5]] = aj.lIlIIlIllllllI("MhYfOw==", "vdpKD");
        aj.llIlIIllIll[aj.llIlIIlllII[6]] = aj.lIlIIlIlllllII("gfIV1Qtu4/w=", "TDBUE");
        aj.llIlIIllIll[aj.llIlIIlllII[7]] = aj.lIlIIlIllllllI("CggGDg==", "kfrgi");
    }

    static {
        aj.lIlIIllIIIIIII();
        aj.lIlIIlIlllllll();
    }

    public boolean run() {
        aj llllllllllllllllIIllIlIlllIIIIIl;
        if (!aj.lIlIIllIIIIIIl(this.aq() ? 1 : 0) || aj.lIlIIllIIIIIlI(this.aX())) {
            return llIlIIlllII[0];
        }
        if (aj.lIlIIllIIIIIll(Inventory.getFreeSlots(), llIlIIlllII[1])) {
            return llIlIIlllII[0];
        }
        if (aj.lIlIIllIIIIIIl(Inventory.contains(item -> item.getName().toLowerCase().contains(llIlIIllIll[llIlIIlllII[7]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlIIllIll[llIlIIlllII[6]])).interact(llIlIIllIll[llIlIIlllII[0]]);
            return llIlIIlllII[2];
        }
        Item llllllllllllllllIIllIlIlllIIIIII = a.values();
        int llllllllllllllllIIllIlIllIllllll22 = ((a[])llllllllllllllllIIllIlIlllIIIIII).length;
        int llllllllllllllllIIllIlIllIlllllI = llIlIIlllII[0];
        while (aj.lIlIIllIIIIlII(llllllllllllllllIIllIlIllIlllllI, llllllllllllllllIIllIlIllIllllll22)) {
            a llllllllllllllllIIllIlIllIllllIl = llllllllllllllllIIllIlIlllIIIIII[llllllllllllllllIIllIlIllIlllllI];
            Item llllllllllllllllIIllIlIllIllllII = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllllllllllllllIIllIlIllIllllIl.l().toLowerCase()));
            if (aj.lIlIIllIIIIlIl(llllllllllllllllIIllIlIllIllllII)) {
                llllllllllllllllIIllIlIllIllllII.interact(llIlIIllIll[llIlIIlllII[2]]);
                return llIlIIlllII[2];
            }
            ++llllllllllllllllIIllIlIllIlllllI;
            "".length();
            if (((0xA6 ^ 0xBD) & ~(0x87 ^ 0x9C)) <= ((0x42 ^ 0x18) & ~(0x17 ^ 0x4D))) continue;
            return ((0x8B ^ 0xB7) & ~(0x9F ^ 0xA3)) != 0;
        }
        llllllllllllllllIIllIlIlllIIIIII = Inventory.getFirst(item -> e.TEARS_OF_ELIDINIS.d(item.getId()));
        if (aj.lIlIIllIIIIllI(llllllllllllllllIIllIlIlllIIIIIl.cM.av().getOrDefault((Object)e.AMBROSIA, llIlIIlllII[0])) && aj.lIlIIllIIIIlIl(llllllllllllllllIIllIlIlllIIIIII) && aj.lIlIIllIIIIIIl(llllllllllllllllIIllIlIlllIIIIIl.be() ? 1 : 0) && aj.lIlIIllIIIIlll(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
            String string;
            if (aj.lIlIIllIIIIlII(Prayers.getPoints(), Skills.getLevel((Skill)Skill.PRAYER))) {
                string = llIlIIllIll[llIlIIlllII[1]];
                "".length();
                if (((0x79 ^ 0x65 ^ (0xD ^ 0x71)) & (0x40 ^ 0x36 ^ (0x34 ^ 0x22) ^ -" ".length())) >= "   ".length()) {
                    return ((229 + 65 - 118 + 64 ^ 112 + 88 - 197 + 161) & (215 + 181 - 381 + 213 ^ 121 + 117 - 204 + 142 ^ -" ".length())) != 0;
                }
            } else {
                string = llIlIIllIll[llIlIIlllII[3]];
            }
            llllllllllllllllIIllIlIlllIIIIII.interact(string);
            llllllllllllllllIIllIlIlllIIIIIl.sleep(llIlIIlllII[4]);
            return llIlIIlllII[2];
        }
        Item llllllllllllllllIIllIlIllIllllll22 = Inventory.getFirst(item -> e.NECTAR.d(item.getId()));
        if (aj.lIlIIllIIIIllI(llllllllllllllllIIllIlIlllIIIIIl.cM.av().getOrDefault((Object)e.AMBROSIA, llIlIIlllII[0])) && aj.lIlIIllIIIIIIl(llllllllllllllllIIllIlIlllIIIIIl.be() ? 1 : 0) && aj.lIlIIllIIIIlll(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
            String string;
            if (aj.lIlIIllIIIlIII(llllllllllllllllIIllIlIllIllllll22)) {
                return llIlIIlllII[0];
            }
            if (aj.lIlIIllIIIIllI(Combat.getMissingHealth())) {
                string = llIlIIllIll[llIlIIlllII[4]];
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return ((0x65 ^ 0x3E) & ~(0x45 ^ 0x1E)) != 0;
                }
            } else {
                string = llIlIIllIll[llIlIIlllII[5]];
            }
            llllllllllllllllIIllIlIllIllllll22.interact(string);
            llllllllllllllllIIllIlIlllIIIIIl.sleep(llIlIIlllII[4]);
            return llIlIIlllII[2];
        }
        return llIlIIlllII[0];
    }

    private static boolean lIlIIllIIIIlIl(Object object) {
        return object != null;
    }

    private static String lIlIIlIlllllIl(String llllllllllllllllIIllIlIllIllIlII, String llllllllllllllllIIllIlIllIllIIll) {
        try {
            SecretKeySpec llllllllllllllllIIllIlIllIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIllIllIIll.getBytes(StandardCharsets.UTF_8)), llIlIIlllII[8]), "DES");
            Cipher llllllllllllllllIIllIlIllIllIllI = Cipher.getInstance("DES");
            llllllllllllllllIIllIlIllIllIllI.init(llIlIIlllII[1], llllllllllllllllIIllIlIllIllIlll);
            return new String(llllllllllllllllIIllIlIllIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIlIllIllIlIl) {
            llllllllllllllllIIllIlIllIllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIllIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIIIIIIl(int n2) {
        return n2 != 0;
    }
}

