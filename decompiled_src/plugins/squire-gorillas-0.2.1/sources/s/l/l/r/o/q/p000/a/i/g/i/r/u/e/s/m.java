package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.Locations;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Restoring stats", priority = 101, blocking = true)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.m  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/m.class */
public class m extends j {
    private static /* synthetic */ String[] llIIlIIllIlI;
    private static /* synthetic */ int[] llIIlIIllIll;

    private static String lllllIIllllllI(String lllllllllllllllIlIlIIIIIIIllIIII, String lllllllllllllllIlIlIIIIIIIlIllll) {
        String lllllllllllllllIlIlIIIIIIIllIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIIIIIIIlIllll.toCharArray();
        int lllllllllllllllIlIlIIIIIIIlIllII = llIIlIIllIll[1];
        char[] charArray2 = lllllllllllllllIlIlIIIIIIIllIIII2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIllIll[1];
        while (lllllIlIIIIlll(i, length)) {
            char lllllllllllllllIlIlIIIIIIIllIIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIlIlIIIIIIIllIIIl ^ charArray[lllllllllllllllIlIlIIIIIIIlIllII % charArray.length]));
            "".length();
            lllllllllllllllIlIlIIIIIIIlIllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    private boolean M() {
        int i = llIIlIIllIll[1];
        Skill[] values = Skill.values();
        int length = values.length;
        int i2 = llIIlIIllIll[1];
        while (lllllIlIIIIlll(i2, length)) {
            Skill skill = values[i2];
            if (lllllIlIIIIlll(Skills.getBoostedLevel(skill), Skills.getLevel(skill))) {
                i = llIIlIIllIll[2];
            }
            i2++;
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return ((231 ^ 187) ^ (104 ^ 86)) & (((((75 + 7) - 27) + 112) ^ (((16 + 20) - (-54)) + 107)) ^ (-" ".length()));
            }
        }
        if (lllllIlIIIIIlI(i)) {
            return llIIlIIllIll[1];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().toLowerCase().contains(llIIlIIllIlI[llIIlIIllIll[6]]);
        });
        if (lllllIlIIIIlIl(first)) {
            return Combat.drinkBoostingPotion(llIIlIIllIll[4]);
        }
        first.interact(llIIlIIllIlI[llIIlIIllIll[5]]);
        return llIIlIIllIll[2];
    }

    private static void lllllIlIIIIIIl() {
        llIIlIIllIll = new int[12];
        llIIlIIllIll[0] = (-2370) & 12151;
        llIIlIIllIll[1] = ((93 ^ 90) ^ (18 ^ 30)) & (((112 ^ 38) ^ (28 ^ 65)) ^ (-" ".length()));
        llIIlIIllIll[2] = " ".length();
        llIIlIIllIll[3] = "  ".length();
        llIIlIIllIll[4] = 183 ^ 189;
        llIIlIIllIll[5] = "   ".length();
        llIIlIIllIll[6] = 60 ^ 56;
        llIIlIIllIll[7] = 59 ^ 62;
        llIIlIIllIll[8] = (((66 + 120) - 176) + 169) ^ (((136 + 95) - 178) + 128);
        llIIlIIllIll[9] = (1 ^ 67) ^ (15 ^ 74);
        llIIlIIllIll[10] = (165 ^ 154) ^ (115 ^ 68);
        llIIlIIllIll[11] = 145 ^ 152;
    }

    @Inject
    public m(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean run() {
        if (lllllIlIIIIIlI(Locations.isRegionLoaded(llIIlIIllIll[0]) ? 1 : 0)) {
            return llIIlIIllIll[1];
        }
        if (!lllllIlIIIIIll(L() ? 1 : 0) && !lllllIlIIIIIll(M() ? 1 : 0)) {
            return K();
        }
        return llIIlIIllIll[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean L() {
        if (lllllIlIIIIllI(Combat.getMissingHealth())) {
            return llIIlIIllIll[1];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[llIIlIIllIll[2]];
            strArr[llIIlIIllIll[1]] = llIIlIIllIlI[llIIlIIllIll[7]];
            if (!lllllIlIIIIIlI(item.hasAction(strArr) ? 1 : 0) || lllllIlIIIIIll(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[8]]) ? 1 : 0)) {
                ?? r0 = llIIlIIllIll[2];
                "".length();
                return (-(17 ^ 20)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIllIll[1];
        });
        if (lllllIlIIIIlIl(first)) {
            return llIIlIIllIll[1];
        }
        String[] strArr = new String[llIIlIIllIll[3]];
        strArr[llIIlIIllIll[1]] = llIIlIIllIlI[llIIlIIllIll[2]];
        strArr[llIIlIIllIll[2]] = llIIlIIllIlI[llIIlIIllIll[3]];
        first.interact(strArr);
        return llIIlIIllIll[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean K() {
        if (lllllIlIIIIlII(Skills.getBoostedLevel(Skill.PRAYER), Skills.getLevel(Skill.PRAYER))) {
            return llIIlIIllIll[1];
        }
        Item first = Inventory.getFirst(item -> {
            if (!lllllIlIIIIIlI(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[9]]) ? 1 : 0) || lllllIlIIIIIll(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[10]]) ? 1 : 0)) {
                ?? r0 = llIIlIIllIll[2];
                "".length();
                return "  ".length() > "  ".length() ? ((((44 + 2) - (-102)) + 27) ^ (((95 + 58) - 74) + 79)) & (((161 ^ 164) ^ (78 ^ 122)) ^ (-" ".length())) : r0;
            }
            return llIIlIIllIll[1];
        });
        if (lllllIlIIIIlIl(first)) {
            return llIIlIIllIll[1];
        }
        first.interact(llIIlIIllIlI[llIIlIIllIll[1]]);
        return llIIlIIllIll[2];
    }

    private static String lllllIIlllllIl(String lllllllllllllllIlIlIIIIIIlIIIIII, String lllllllllllllllIlIlIIIIIIIllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIIIllllll.getBytes(StandardCharsets.UTF_8)), llIIlIIllIll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIllIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIIlIIIIIl) {
            lllllllllllllllIlIlIIIIIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllllIlIIIIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lllllIlIIIIllI(int i) {
        return i <= 0;
    }

    private static boolean lllllIlIIIIIlI(int i) {
        return i == 0;
    }

    static {
        lllllIlIIIIIIl();
        lllllIlIIIIIII();
    }

    private static String lllllIIlllllll(String lllllllllllllllIlIlIIIIIIIIllIll, String lllllllllllllllIlIlIIIIIIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIIIIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIIIIIIlllIl.init(llIIlIIllIll[3], lllllllllllllllIlIlIIIIIIIIllllI);
            return new String(lllllllllllllllIlIlIIIIIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIIIIlllII) {
            lllllllllllllllIlIlIIIIIIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIIIlII(int i, int i2) {
        return i >= i2;
    }

    private static void lllllIlIIIIIII() {
        llIIlIIllIlI = new String[llIIlIIllIll[11]];
        llIIlIIllIlI[llIIlIIllIll[1]] = lllllIIlllllIl("0x1qQzmB1bU=", "afbnu");
        llIIlIIllIlI[llIIlIIllIll[2]] = lllllIIllllllI("FyQi", "REVEy");
        llIIlIIllIlI[llIIlIIllIll[3]] = lllllIIlllllll("sAc3zthbTzs=", "NJoOr");
        llIIlIIllIlI[llIIlIIllIll[5]] = lllllIIlllllll("rsn4ZL9/VnU=", "PCNFB");
        llIIlIIllIlI[llIIlIIllIll[6]] = lllllIIlllllIl("j42EXVcttZ4=", "zwJmy");
        llIIlIIllIlI[llIIlIIllIll[7]] = lllllIIlllllIl("LX+58hBQz08=", "kgqQZ");
        llIIlIIllIlI[llIIlIIllIll[8]] = lllllIIlllllIl("emnHrlIdc5wcc6lDgk4J/A==", "GYuvS");
        llIIlIIllIlI[llIIlIIllIll[9]] = lllllIIllllllI("IDs1DCcC", "pITuB");
        llIIlIIllIlI[llIIlIIllIll[10]] = lllllIIllllllI("MQI4LxhCBS05Hg0FLQ==", "bwHJj");
    }

    private static boolean lllllIlIIIIIll(int i) {
        return i != 0;
    }
}
