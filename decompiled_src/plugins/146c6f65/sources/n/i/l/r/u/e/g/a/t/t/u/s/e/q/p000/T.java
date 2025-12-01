package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Equipping gear", priority = 5, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.T  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/T.class */
public class T extends AbstractC0013n {
    private static /* synthetic */ String[] llIIllIIllII;
    private static /* synthetic */ int[] llIIllIIllIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        String str;
        Player local = Players.getLocal();
        if (!llllllIllIIIll(local) || llllllIllIIlII(local.isMoving() ? 1 : 0)) {
            return llIIllIIllIl[1];
        }
        EnumC0005f[] enumC0005fArr = new EnumC0005f[llIIllIIllIl[5]];
        enumC0005fArr[llIIllIIllIl[1]] = EnumC0005f.TIER_1_BODY;
        enumC0005fArr[llIIllIIllIl[2]] = EnumC0005f.TIER_1_HELM;
        enumC0005fArr[llIIllIIllIl[3]] = EnumC0005f.TIER_1_LEGS;
        enumC0005fArr[llIIllIIllIl[4]] = EnumC0005f.TIER_1_STAFF;
        enumC0005fArr[llIIllIIllIl[0]] = EnumC0005f.TIER_2_STAFF;
        List list = (List) Stream.of((Object[]) enumC0005fArr).filter(enumC0005f -> {
            if (llllllIllIIlII(Equipment.contains(enumC0005f.ad()) ? 1 : 0)) {
                ?? r0 = llIIllIIllIl[2];
                "".length();
                return "   ".length() <= (-" ".length()) ? ((((22 + 69) - 79) + 178) ^ (((109 + 127) - 200) + 93)) & (((((122 + 114) - 233) + 168) ^ (((37 + 18) - 35) + 128)) ^ (-" ".length())) : r0;
            }
            return llIIllIIllIl[1];
        }).filter(enumC0005f2 -> {
            return Inventory.contains(enumC0005f2.ad());
        }).collect(Collectors.toList());
        if (llllllIllIIlIl(list.isEmpty() ? 1 : 0)) {
            return llIIllIIllIl[1];
        }
        Iterator it = list.iterator();
        if (llllllIllIIlIl(it.hasNext() ? 1 : 0)) {
            Item first = Inventory.getFirst(((EnumC0005f) it.next()).ad());
            if (llllllIllIIllI(first)) {
                return llIIllIIllIl[1];
            }
            String[] strArr = new String[llIIllIIllIl[2]];
            strArr[llIIllIIllIl[1]] = llIIllIIllII[llIIllIIllIl[1]];
            if (llllllIllIIlIl(first.hasAction(strArr) ? 1 : 0)) {
                str = llIIllIIllII[llIIllIIllIl[2]];
                "".length();
                if ((112 ^ 117) <= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                str = llIIllIIllII[llIIllIIllIl[3]];
            }
            first.interact(str);
            return llIIllIIllIl[2];
        }
        return llIIllIIllIl[1];
    }

    private static String llllllIlIlllll(String lllllllllllllllIlIIlIlIllllllIIl, String lllllllllllllllIlIIlIlIllllllIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIllllllIII.getBytes(StandardCharsets.UTF_8)), llIIllIIllIl[6]), "DES");
            Cipher lllllllllllllllIlIIlIlIllllllIll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlIllllllIll.init(llIIllIIllIl[3], lllllllllllllllIlIIlIlIlllllllII);
            return new String(lllllllllllllllIlIIlIlIllllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIllllllIlI) {
            lllllllllllllllIlIIlIlIllllllIlI.printStackTrace();
            return null;
        }
    }

    static {
        llllllIllIIIlI();
        llllllIllIIIIl();
    }

    private static String llllllIlIllllI(String lllllllllllllllIlIIlIlIlllIlIlII, String lllllllllllllllIlIIlIlIlllIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIlllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIlllIlIllI.init(llIIllIIllIl[3], lllllllllllllllIlIIlIlIlllIlIlll);
            return new String(lllllllllllllllIlIIlIlIlllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIlllIlIlIl) {
            lllllllllllllllIlIIlIlIlllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIllIIlII(int i) {
        return i == 0;
    }

    private static void llllllIllIIIlI() {
        llIIllIIllIl = new int[7];
        llIIllIIllIl[0] = (125 ^ 34) ^ (235 ^ 176);
        llIIllIIllIl[1] = (77 ^ 85) & ((107 ^ 115) ^ (-1));
        llIIllIIllIl[2] = " ".length();
        llIIllIIllIl[3] = "  ".length();
        llIIllIIllIl[4] = "   ".length();
        llIIllIIllIl[5] = (82 ^ 77) ^ (90 ^ 64);
        llIIllIIllIl[6] = (50 ^ 127) ^ (116 ^ 49);
    }

    private static String llllllIllIIIII(String lllllllllllllllIlIIlIlIllllIlIIl, String lllllllllllllllIlIIlIlIllllIlIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIlIllllIlIII.toCharArray();
        int lllllllllllllllIlIIlIlIllllIIIII = llIIllIIllIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIllIIllIl[1];
        while (llllllIllIIlll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIlIlIllllIIIII % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIlIllllIIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllllIllIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllIllIIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIllIIllIl[0]];
        enumC0003dArr[llIIllIIllIl[1]] = EnumC0003d.FIRST_ROTATION_EXPLORE;
        enumC0003dArr[llIIllIIllIl[2]] = EnumC0003d.DEMI_BOSS_EXPLORE;
        enumC0003dArr[llIIllIIllIl[3]] = EnumC0003d.FIRST_ROTATION_CREATE;
        enumC0003dArr[llIIllIIllIl[4]] = EnumC0003d.PREPARE_BOSS_FIGHT;
    }

    private static boolean llllllIllIIlIl(int i) {
        return i != 0;
    }

    private static boolean llllllIllIIIll(Object obj) {
        return obj != null;
    }

    private static void llllllIllIIIIl() {
        llIIllIIllII = new String[llIIllIIllIl[4]];
        llIIllIIllII[llIIllIIllIl[1]] = llllllIlIllllI("dxr96IkLu6Q=", "IQnoL");
        llIIllIIllII[llIIllIIllIl[2]] = llllllIlIlllll("LeNMLluksu8=", "bjyGX");
        llIIllIIllII[llIIllIIllIl[3]] = llllllIllIIIII("IB8hICI=", "wvDLF");
    }
}
