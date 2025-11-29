/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping gear", priority=5, blocking=true)
public class T
extends n {
    private static /* synthetic */ String[] llIIllIIllII;
    private static /* synthetic */ int[] llIIllIIllIl;

    @Override
    public boolean be() {
        Player player = Players.getLocal();
        if (!T.llllllIllIIIll(player) || T.llllllIllIIlII(player.isMoving() ? 1 : 0)) {
            return llIIllIIllIl[1];
        }
        f[] fArray = new f[llIIllIIllIl[5]];
        fArray[T.llIIllIIllIl[1]] = f.TIER_1_BODY;
        fArray[T.llIIllIIllIl[2]] = f.TIER_1_HELM;
        fArray[T.llIIllIIllIl[3]] = f.TIER_1_LEGS;
        fArray[T.llIIllIIllIl[4]] = f.TIER_1_STAFF;
        fArray[T.llIIllIIllIl[0]] = f.TIER_2_STAFF;
        List lllllllllllllllIlIIlIllIIIIIIllI = Stream.of(fArray).filter(f2 -> {
            boolean bl;
            if (T.llllllIllIIlII(Equipment.contains((int[])f2.ad()) ? 1 : 0)) {
                bl = llIIllIIllIl[2];
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return ((22 + 69 - 79 + 178 ^ 109 + 127 - 200 + 93) & (122 + 114 - 233 + 168 ^ 37 + 18 - 35 + 128 ^ -" ".length())) != 0;
                }
            } else {
                bl = llIIllIIllIl[1];
            }
            return bl;
        }).filter(f2 -> Inventory.contains((int[])f2.ad())).collect(Collectors.toList());
        if (T.llllllIllIIlIl(lllllllllllllllIlIIlIllIIIIIIllI.isEmpty() ? 1 : 0)) {
            return llIIllIIllIl[1];
        }
        Iterator lllllllllllllllIlIIlIllIIIIIIlIl = lllllllllllllllIlIIlIllIIIIIIllI.iterator();
        if (T.llllllIllIIlIl(lllllllllllllllIlIIlIllIIIIIIlIl.hasNext() ? 1 : 0)) {
            String string;
            f lllllllllllllllIlIIlIllIIIIIIlII = (f)((Object)lllllllllllllllIlIIlIllIIIIIIlIl.next());
            Item lllllllllllllllIlIIlIllIIIIIIIll = Inventory.getFirst((int[])lllllllllllllllIlIIlIllIIIIIIlII.ad());
            if (T.llllllIllIIllI(lllllllllllllllIlIIlIllIIIIIIIll)) {
                return llIIllIIllIl[1];
            }
            String[] stringArray = new String[llIIllIIllIl[2]];
            stringArray[T.llIIllIIllIl[1]] = llIIllIIllII[llIIllIIllIl[1]];
            if (T.llllllIllIIlIl(lllllllllllllllIlIIlIllIIIIIIIll.hasAction(stringArray) ? 1 : 0)) {
                string = llIIllIIllII[llIIllIIllIl[2]];
                "".length();
                if ((0x70 ^ 0x75) <= 0) {
                    return ((0x9B ^ 0xA3) & ~(0xF ^ 0x37)) != 0;
                }
            } else {
                string = llIIllIIllII[llIIllIIllIl[3]];
            }
            lllllllllllllllIlIIlIllIIIIIIIll.interact(string);
            return llIIllIIllIl[2];
        }
        return llIIllIIllIl[1];
    }

    private static String llllllIlIlllll(String lllllllllllllllIlIIlIlIllllllIIl, String lllllllllllllllIlIIlIlIlllllIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlllllIllI.getBytes(StandardCharsets.UTF_8)), llIIllIIllIl[6]), "DES");
            Cipher lllllllllllllllIlIIlIlIllllllIll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlIllllllIll.init(llIIllIIllIl[3], lllllllllllllllIlIIlIlIlllllllII);
            return new String(lllllllllllllllIlIIlIlIllllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlIllllllIlI) {
            lllllllllllllllIlIIlIlIllllllIlI.printStackTrace();
            return null;
        }
    }

    static {
        T.llllllIllIIIlI();
        T.llllllIllIIIIl();
    }

    private static String llllllIlIllllI(String lllllllllllllllIlIIlIlIlllIlIIlI, String lllllllllllllllIlIIlIlIlllIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIlllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIlllIlIllI.init(llIIllIIllIl[3], lllllllllllllllIlIIlIlIlllIlIlll);
            return new String(lllllllllllllllIlIIlIlIlllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlIlllIlIlIl) {
            lllllllllllllllIlIIlIlIlllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIllIIlII(int n2) {
        return n2 == 0;
    }

    private static void llllllIllIIIlI() {
        llIIllIIllIl = new int[7];
        T.llIIllIIllIl[0] = 0x7D ^ 0x22 ^ (0xEB ^ 0xB0);
        T.llIIllIIllIl[1] = (0x4D ^ 0x55) & ~(0x6B ^ 0x73);
        T.llIIllIIllIl[2] = " ".length();
        T.llIIllIIllIl[3] = "  ".length();
        T.llIIllIIllIl[4] = "   ".length();
        T.llIIllIIllIl[5] = 0x52 ^ 0x4D ^ (0x5A ^ 0x40);
        T.llIIllIIllIl[6] = 0x32 ^ 0x7F ^ (0x74 ^ 0x31);
    }

    private static String llllllIllIIIII(String lllllllllllllllIlIIlIlIllllIlIIl, String lllllllllllllllIlIIlIlIllllIIIll) {
        lllllllllllllllIlIIlIlIllllIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIllllIIlll = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIllllIIllI = lllllllllllllllIlIIlIlIllllIIIll.toCharArray();
        int lllllllllllllllIlIIlIlIllllIIlIl = llIIllIIllIl[1];
        char[] lllllllllllllllIlIIlIlIlllIlllll = lllllllllllllllIlIIlIlIllllIlIIl.toCharArray();
        int lllllllllllllllIlIIlIlIlllIllllI = lllllllllllllllIlIIlIlIlllIlllll.length;
        int lllllllllllllllIlIIlIlIlllIlllIl = llIIllIIllIl[1];
        while (T.llllllIllIIlll(lllllllllllllllIlIIlIlIlllIlllIl, lllllllllllllllIlIIlIlIlllIllllI)) {
            char lllllllllllllllIlIIlIlIllllIlIlI = lllllllllllllllIlIIlIlIlllIlllll[lllllllllllllllIlIIlIlIlllIlllIl];
            lllllllllllllllIlIIlIlIllllIIlll.append((char)(lllllllllllllllIlIIlIlIllllIlIlI ^ lllllllllllllllIlIIlIlIllllIIllI[lllllllllllllllIlIIlIlIllllIIlIl % lllllllllllllllIlIIlIlIllllIIllI.length]));
            "".length();
            ++lllllllllllllllIlIIlIlIllllIIlIl;
            ++lllllllllllllllIlIIlIlIlllIlllIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIlIllllIIlll);
    }

    private static boolean llllllIllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIllIIllI(Object object) {
        return object == null;
    }

    @Inject
    public T(c c2) {
        d[] dArray = new d[llIIllIIllIl[0]];
        dArray[T.llIIllIIllIl[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[T.llIIllIIllIl[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[T.llIIllIIllIl[3]] = d.FIRST_ROTATION_CREATE;
        dArray[T.llIIllIIllIl[4]] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
    }

    private static boolean llllllIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIllIIIll(Object object) {
        return object != null;
    }

    private static void llllllIllIIIIl() {
        llIIllIIllII = new String[llIIllIIllIl[4]];
        T.llIIllIIllII[T.llIIllIIllIl[1]] = T.llllllIlIllllI("dxr96IkLu6Q=", "IQnoL");
        T.llIIllIIllII[T.llIIllIIllIl[2]] = T.llllllIlIlllll("LeNMLluksu8=", "bjyGX");
        T.llIIllIIllII[T.llIIllIIllIl[3]] = T.llllllIllIIIII("IB8hICI=", "wvDLF");
    }
}

