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
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Dropping unnecessary supplies", priority = 10)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aj  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aj.class */
public class C0010aj extends Z {
    private static /* synthetic */ int[] llIlIIlllII;
    private static /* synthetic */ String[] llIlIIllIll;
    private final /* synthetic */ C cM;

    private static boolean lIlIIllIIIIlll(int i) {
        return i == 0;
    }

    private static void lIlIIllIIIIIII() {
        llIlIIlllII = new int[9];
        llIlIIlllII[0] = (3 ^ 80) & ((198 ^ 149) ^ (-1));
        llIlIIlllII[1] = "  ".length();
        llIlIIlllII[2] = " ".length();
        llIlIIlllII[3] = "   ".length();
        llIlIIlllII[4] = 141 ^ 137;
        llIlIIlllII[5] = 45 ^ 40;
        llIlIIlllII[6] = (((192 + 119) - 163) + 51) ^ (((48 + 177) - 133) + 101);
        llIlIIlllII[7] = 92 ^ 91;
        llIlIIlllII[8] = 38 ^ 46;
    }

    private static boolean lIlIIllIIIIllI(int i) {
        return i > 0;
    }

    private static String lIlIIlIlllllII(String llllllllllllllllIIllIlIllIlIIlll, String llllllllllllllllIIllIlIllIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIlllII[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIlIllIlIlIII) {
            llllllllllllllllIIllIlIllIlIlIII.printStackTrace();
            return null;
        }
    }

    @Inject
    protected C0010aj(Client client, C c) {
        super(client);
        this.cM = c;
    }

    private static boolean lIlIIllIIIlIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIllIIIIIlI(int i) {
        return i <= 0;
    }

    private static String lIlIIlIllllllI(String llllllllllllllllIIllIlIllIIlIlll, String llllllllllllllllIIllIlIllIIlIllI) {
        String llllllllllllllllIIllIlIllIIlIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlIllIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIlIllIIlIlIl = new StringBuilder();
        char[] llllllllllllllllIIllIlIllIIlIlII = llllllllllllllllIIllIlIllIIlIllI.toCharArray();
        int llllllllllllllllIIllIlIllIIlIIll = llIlIIlllII[0];
        char[] charArray = llllllllllllllllIIllIlIllIIlIlll2.toCharArray();
        int length = charArray.length;
        int i = llIlIIlllII[0];
        while (lIlIIllIIIIlII(i, length)) {
            llllllllllllllllIIllIlIllIIlIlIl.append((char) (charArray[i] ^ llllllllllllllllIIllIlIllIIlIlII[llllllllllllllllIIllIlIllIIlIIll % llllllllllllllllIIllIlIllIIlIlII.length]));
            "".length();
            llllllllllllllllIIllIlIllIIlIIll++;
            i++;
            "".length();
            if (" ".length() >= (35 ^ 39)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIllIlIllIIlIlIl);
    }

    private static void lIlIIlIlllllll() {
        llIlIIllIll = new String[llIlIIlllII[8]];
        llIlIIllIll[llIlIIlllII[0]] = lIlIIlIlllllII("RaJwK2pmBgw=", "TPghG");
        llIlIIllIll[llIlIIlllII[2]] = lIlIIlIlllllIl("WbmsLE5gPY8=", "naaRo");
        llIlIIllIll[llIlIIlllII[1]] = lIlIIlIlllllIl("ww/CbPqk/ZA=", "soHkE");
        llIlIIllIll[llIlIIlllII[3]] = lIlIIlIlllllIl("3p6KuzH9/fI=", "IzCFI");
        llIlIIllIll[llIlIIlllII[4]] = lIlIIlIlllllII("uPe09Tq7mp4=", "CtsGO");
        llIlIIllIll[llIlIIlllII[5]] = lIlIIlIllllllI("MhYfOw==", "vdpKD");
        llIlIIllIll[llIlIIlllII[6]] = lIlIIlIlllllII("gfIV1Qtu4/w=", "TDBUE");
        llIlIIllIll[llIlIIlllII[7]] = lIlIIlIllllllI("CggGDg==", "kfrgi");
    }

    static {
        lIlIIllIIIIIII();
        lIlIIlIlllllll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    public boolean run() {
        String str;
        String str2;
        if (!lIlIIllIIIIIIl(aq() ? 1 : 0) || lIlIIllIIIIIlI(aX())) {
            return llIlIIlllII[0];
        }
        if (lIlIIllIIIIIll(Inventory.getFreeSlots(), llIlIIlllII[1])) {
            return llIlIIlllII[0];
        }
        if (lIlIIllIIIIIIl(Inventory.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIIllIll[llIlIIlllII[7]]);
        }) ? 1 : 0)) {
            Inventory.getFirst(item2 -> {
                return item2.getName().toLowerCase().contains(llIlIIllIll[llIlIIlllII[6]]);
            }).interact(llIlIIllIll[llIlIIlllII[0]]);
            return llIlIIlllII[2];
        }
        EnumC0000a[] values = EnumC0000a.values();
        int length = values.length;
        int i = llIlIIlllII[0];
        while (lIlIIllIIIIlII(i, length)) {
            EnumC0000a enumC0000a = values[i];
            Item first = Inventory.getFirst(item3 -> {
                return item3.getName().toLowerCase().contains(enumC0000a.l().toLowerCase());
            });
            if (lIlIIllIIIIlIl(first)) {
                first.interact(llIlIIllIll[llIlIIlllII[2]]);
                return llIlIIlllII[2];
            }
            i++;
            "".length();
            if (((166 ^ 189) & ((135 ^ 156) ^ (-1))) > ((66 ^ 24) & ((23 ^ 77) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        Item first2 = Inventory.getFirst(item4 -> {
            return EnumC0056e.TEARS_OF_ELIDINIS.d(item4.getId());
        });
        if (lIlIIllIIIIllI(this.cM.av().getOrDefault(EnumC0056e.AMBROSIA, Integer.valueOf(llIlIIlllII[0])).intValue()) && lIlIIllIIIIlIl(first2) && lIlIIllIIIIIIl(be() ? 1 : 0) && lIlIIllIIIIlll(Inventory.contains(item5 -> {
            return EnumC0056e.AMBROSIA.d(item5.getId());
        }) ? 1 : 0)) {
            if (lIlIIllIIIIlII(Prayers.getPoints(), Skills.getLevel(Skill.PRAYER))) {
                str2 = llIlIIllIll[llIlIIlllII[1]];
                "".length();
                if ((((121 ^ 101) ^ (13 ^ 113)) & (((64 ^ 54) ^ (52 ^ 34)) ^ (-" ".length()))) >= "   ".length()) {
                    return ((((229 + 65) - 118) + 64) ^ (((112 + 88) - 197) + 161)) & (((((215 + 181) - 381) + 213) ^ (((121 + 117) - 204) + 142)) ^ (-" ".length()));
                }
            } else {
                str2 = llIlIIllIll[llIlIIlllII[3]];
            }
            first2.interact(str2);
            sleep(llIlIIlllII[4]);
            return llIlIIlllII[2];
        }
        Item first3 = Inventory.getFirst(item6 -> {
            return EnumC0056e.NECTAR.d(item6.getId());
        });
        if (lIlIIllIIIIllI(this.cM.av().getOrDefault(EnumC0056e.AMBROSIA, Integer.valueOf(llIlIIlllII[0])).intValue()) && lIlIIllIIIIIIl(be() ? 1 : 0) && lIlIIllIIIIlll(Inventory.contains(item7 -> {
            return EnumC0056e.AMBROSIA.d(item7.getId());
        }) ? 1 : 0)) {
            if (lIlIIllIIIlIII(first3)) {
                return llIlIIlllII[0];
            }
            if (lIlIIllIIIIllI(Combat.getMissingHealth())) {
                str = llIlIIllIll[llIlIIlllII[4]];
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                str = llIlIIllIll[llIlIIlllII[5]];
            }
            first3.interact(str);
            sleep(llIlIIlllII[4]);
            return llIlIIlllII[2];
        }
        return llIlIIlllII[0];
    }

    private static boolean lIlIIllIIIIlIl(Object obj) {
        return obj != null;
    }

    private static String lIlIIlIlllllIl(String llllllllllllllllIIllIlIllIllIlII, String llllllllllllllllIIllIlIllIllIIll) {
        try {
            SecretKeySpec llllllllllllllllIIllIlIllIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIllIllIIll.getBytes(StandardCharsets.UTF_8)), llIlIIlllII[8]), "DES");
            Cipher llllllllllllllllIIllIlIllIllIllI = Cipher.getInstance("DES");
            llllllllllllllllIIllIlIllIllIllI.init(llIlIIlllII[1], llllllllllllllllIIllIlIllIllIlll);
            return new String(llllllllllllllllIIllIlIllIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIlIllIllIlIl) {
            llllllllllllllllIIllIlIllIllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIIIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIllIIIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIllIIIIIIl(int i) {
        return i != 0;
    }
}
