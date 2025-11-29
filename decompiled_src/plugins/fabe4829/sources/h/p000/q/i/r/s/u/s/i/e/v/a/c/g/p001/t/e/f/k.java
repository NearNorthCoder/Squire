package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
@TaskDesc(name = "Prayer Switch Task", priority = 100)
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.k  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/k.class */
public class k extends Task {
    static final /* synthetic */ int af;
    private final /* synthetic */ n ae;
    private final /* synthetic */ SquireFightCavesConfig ad;
    private static /* synthetic */ int[] llIIlIIIIIlI;
    private final /* synthetic */ f ac;
    private static /* synthetic */ String[] llIIlIIIIIIl;

    private static String llllIlllllIIIl(String lllllllllllllllIlIlIIIIIIlIIlllI, String lllllllllllllllIlIlIIIIIIlIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIIIIlIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIIIIlIlIIII.init(llIIlIIIIIlI[17], lllllllllllllllIlIlIIIIIIlIlIIIl);
            return new String(lllllllllllllllIlIlIIIIIIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIIlIIllll) {
            lllllllllllllllIlIlIIIIIIlIIllll.printStackTrace();
            return null;
        }
    }

    private static void llllIlllllIIll() {
        llIIlIIIIIIl = new String[llIIlIIIIIlI[3]];
        llIIlIIIIIIl[llIIlIIIIIlI[0]] = llllIlllllIIII("PRMELBYbAgMnA1oCAyUBCQ==", "zvjId");
        llIIlIIIIIIl[llIIlIIIIIlI[9]] = llllIlllllIIIl("XgAHSE7c4QRCCL2SvYDsVw==", "SRTtD");
        llIIlIIIIIIl[llIIlIIIIIlI[17]] = llllIlllllIIII("Mi0lBEUUIicTBB8vNg==", "qLSae");
        llIIlIIIIIIl[llIIlIIIIIlI[5]] = llllIlllllIIlI("swf66qCq03U=", "wOrEm");
    }

    private static boolean llllIllllllllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llllIllllllIIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean a(Prayer prayer) {
        if (llllIlllllllIl(Vars.getBit(prayer.getVarbit()), llIIlIIIIIlI[9])) {
            ?? r0 = llIIlIIIIIlI[9];
            "".length();
            return "   ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlIIIIIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean run() {
        if (llllIlllllIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            Prayers.disableAll();
            return llIIlIIIIIlI[0];
        }
        if (llllIlllllIllI(n.al)) {
            sleep(llIIlIIIIIlI[1]);
            System.out.println(llIIlIIIIIIl[llIIlIIIIIlI[0]]);
            n.al = TileObjects.getNearest(tileObject -> {
                if (llllIlllllllII(tileObject.getName().equalsIgnoreCase(llIIlIIIIIIl[llIIlIIIIIlI[17]]) ? 1 : 0)) {
                    String[] strArr = new String[llIIlIIIIIlI[9]];
                    strArr[llIIlIIIIIlI[0]] = llIIlIIIIIIl[llIIlIIIIIlI[5]];
                    if (llllIlllllllII(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = llIIlIIIIIlI[9];
                        "".length();
                        return "  ".length() != "  ".length() ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                    }
                }
                return llIIlIIIIIlI[0];
            }).getWorldLocation();
            System.out.println("Start: " + String.valueOf(n.al));
            n.am = new WorldPoint(n.al.getX(), n.al.getY() - llIIlIIIIIlI[2], n.al.getPlane());
            n.an = new WorldPoint(n.al.getX() + llIIlIIIIIlI[3], n.al.getY() - llIIlIIIIIlI[4], n.al.getPlane());
            n.ao = new WorldPoint(n.al.getX() + llIIlIIIIIlI[5], n.al.getY() - llIIlIIIIIlI[6], n.al.getPlane());
            n.aq = new WorldPoint(n.al.getX(), n.al.getY() - llIIlIIIIIlI[7], n.al.getPlane());
            n.ap = new WorldPoint(n.al.getX() + llIIlIIIIIlI[5], n.al.getY() - llIIlIIIIIlI[8], n.al.getPlane());
            SquireFightCavesPlugin.j += llIIlIIIIIlI[9];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Prayers.getRangePrayers());
        "".length();
        NPCs.getNearest(c.p);
        NPCs.getNearest(c.q);
        NPCs.getNearest(c.r);
        NPC nearest = NPCs.getNearest(c.s);
        NPC nearest2 = NPCs.getNearest(c.t);
        NPC nearest3 = NPCs.getNearest(c.u);
        NPC nearest4 = NPCs.getNearest(c.v);
        if (llllIlllllIlll(f.p(), llIIlIIIIIlI[10])) {
            if (llllIllllllIII(f.D, llIIlIIIIIlI[11])) {
                arrayList.add(Prayer.PROTECT_FROM_MELEE);
                "".length();
            }
            if (llllIllllllIIl(f.p(), llIIlIIIIIlI[11]) && llllIllllllIlI(f.p(), llIIlIIIIIlI[12]) && llllIllllllIlI(f.p(), llIIlIIIIIlI[13]) && llllIllllllIlI(f.p(), llIIlIIIIIlI[14])) {
                if (!llllIlllllIlIl(f.a(Static.getClient(), b.BLOB, Players.getLocal()) ? 1 : 0) || !llllIlllllIlIl(f.a(Static.getClient(), b.SMALL_BLOB, Players.getLocal()) ? 1 : 0) || !llllIlllllIlIl(f.a(Static.getClient(), b.MELEER, Players.getLocal()) ? 1 : 0) || (llllIlllllIlll(f.r(), llIIlIIIIIlI[9]) && llllIllllllIll(nearest2) && llllIlllllllII(n.c(nearest2.getWorldArea().toWorldPointList()) ? 1 : 0))) {
                    arrayList.add(Prayer.PROTECT_FROM_MELEE);
                    "".length();
                }
                if (!llllIlllllIlIl(f.a(Static.getClient(), b.RANGER, Players.getLocal()) ? 1 : 0) || (llllIlllllIlll(f.u(), llIIlIIIIIlI[9]) && llllIllllllIll(nearest) && llllIlllllIllI(nearest3))) {
                    arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                    "".length();
                }
                if (!llllIlllllIlIl(f.a(Static.getClient(), b.MAGER, Players.getLocal()) ? 1 : 0) || (llllIlllllIlll(f.t(), llIIlIIIIIlI[9]) && llllIllllllIll(nearest3))) {
                    arrayList.add(Prayer.PROTECT_FROM_MAGIC);
                    "".length();
                }
            }
            if (llllIlllllllIl(f.p(), llIIlIIIIIlI[12])) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                "".length();
            }
            if (llllIlllllllIl(f.p(), llIIlIIIIIlI[13])) {
                arrayList.add(Prayer.PROTECT_FROM_MELEE);
                "".length();
            }
            if (llllIlllllllIl(f.p(), llIIlIIIIIlI[14])) {
                arrayList.add(Prayer.PROTECT_FROM_MAGIC);
                "".length();
            }
        }
        if (llllIllllllIll(nearest4)) {
            System.out.println(llIIlIIIIIIl[llIIlIIIIIlI[9]]);
            if (llllIlllllllIl(nearest4.getAnimation(), llIIlIIIIIlI[15])) {
                arrayList.add(Prayer.PROTECT_FROM_MAGIC);
                "".length();
                "".length();
                if ((22 ^ 18) < 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                "".length();
            }
        }
        a(arrayList);
        "".length();
        return llIIlIIIIIlI[0];
    }

    @Inject
    public k(f fVar, SquireFightCavesConfig squireFightCavesConfig, n nVar) {
        this.ac = fVar;
        this.ad = squireFightCavesConfig;
        this.ae = nVar;
    }

    private static void llllIlllllIlII() {
        llIIlIIIIIlI = new int[20];
        llIIlIIIIIlI[0] = ((((9 + 54) - (-71)) + 93) ^ (((34 + 43) - 42) + 153)) & (((((88 + 131) - 159) + 146) ^ (((80 + 131) - 118) + 52)) ^ (-" ".length()));
        llIIlIIIIIlI[1] = 9 ^ 12;
        llIIlIIIIIlI[2] = 107 ^ 114;
        llIIlIIIIIlI[3] = (49 ^ 87) ^ (42 ^ 72);
        llIIlIIIIIlI[4] = (15 ^ 120) ^ (205 ^ 167);
        llIIlIIIIIlI[5] = "   ".length();
        llIIlIIIIIlI[6] = 228 ^ 199;
        llIIlIIIIIlI[7] = 19 ^ 11;
        llIIlIIIIIlI[8] = 28 ^ 14;
        llIIlIIIIIlI[9] = " ".length();
        llIIlIIIIIlI[10] = 143 ^ 176;
        llIIlIIIIIlI[11] = (26 ^ 76) ^ (9 ^ 89);
        llIIlIIIIIlI[12] = (255 ^ 186) ^ (207 ^ 132);
        llIIlIIIIIlI[13] = 186 ^ 164;
        llIIlIIIIIlI[14] = (24 ^ 56) ^ (52 ^ 42);
        llIIlIIIIIlI[15] = (-((-8245) & 25790)) & (-12295) & 32495;
        llIIlIIIIIlI[16] = (((33 + 109) - 104) + 175) ^ (((55 + 28) - 23) + 117);
        llIIlIIIIIlI[17] = "  ".length();
        llIIlIIIIIlI[18] = (-((-18713) & 19803)) & (-305) & 28031;
        llIIlIIIIIlI[19] = 94 ^ 86;
    }

    private static boolean llllIlllllIllI(Object obj) {
        return obj == null;
    }

    private static Map<Prayer, List<Prayer>> y() {
        HashMap hashMap = new HashMap();
        hashMap.put(Prayer.AUGURY, List.of(Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY, Prayer.EAGLE_EYE, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        "".length();
        hashMap.put(Prayer.MYSTIC_MIGHT, List.of(Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY, Prayer.EAGLE_EYE, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        "".length();
        hashMap.put(Prayer.RIGOUR, List.of(Prayer.AUGURY, Prayer.PIETY, Prayer.CHIVALRY, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        "".length();
        hashMap.put(Prayer.EAGLE_EYE, List.of(Prayer.AUGURY, Prayer.PIETY, Prayer.CHIVALRY, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        "".length();
        hashMap.put(Prayer.PIETY, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        "".length();
        hashMap.put(Prayer.CHIVALRY, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        "".length();
        hashMap.put(Prayer.ULTIMATE_STRENGTH, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.PIETY, Prayer.CHIVALRY));
        "".length();
        hashMap.put(Prayer.STEEL_SKIN, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY));
        "".length();
        hashMap.put(Prayer.INCREDIBLE_REFLEXES, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.PIETY, Prayer.CHIVALRY));
        "".length();
        hashMap.put(Prayer.PROTECT_FROM_MELEE, List.of(Prayer.PROTECT_FROM_MAGIC, Prayer.PROTECT_FROM_MISSILES));
        "".length();
        hashMap.put(Prayer.PROTECT_FROM_MAGIC, List.of(Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MISSILES));
        "".length();
        hashMap.put(Prayer.PROTECT_FROM_MISSILES, List.of(Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MAGIC));
        "".length();
        return hashMap;
    }

    private static boolean llllIllllllIll(Object obj) {
        return obj != null;
    }

    private static boolean llllIllllllIII(int i, int i2) {
        return i <= i2;
    }

    private static String llllIlllllIIII(String lllllllllllllllIlIlIIIIIIlllIIII, String lllllllllllllllIlIlIIIIIIllIllll) {
        String lllllllllllllllIlIlIIIIIIlllIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIIIIIIllIllIl = lllllllllllllllIlIlIIIIIIllIllll.toCharArray();
        int lllllllllllllllIlIlIIIIIIllIllII = llIIlIIIIIlI[0];
        char[] charArray = lllllllllllllllIlIlIIIIIIlllIIII2.toCharArray();
        int length = charArray.length;
        int i = llIIlIIIIIlI[0];
        while (llllIlllllIlll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIlIIIIIIllIllIl[lllllllllllllllIlIlIIIIIIllIllII % lllllllllllllllIlIlIIIIIIllIllIl.length]));
            "".length();
            lllllllllllllllIlIlIIIIIIllIllII++;
            i++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllIlllllIlIl(int i) {
        return i == 0;
    }

    private static boolean llllIlllllIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public static boolean a(List<Prayer> list) {
        if (llllIlllllllIl(Rand.nextInt(llIIlIIIIIlI[0], llIIlIIIIIlI[16]), llIIlIIIIIlI[9])) {
            return llIIlIIIIIlI[0];
        }
        HashSet hashSet = new HashSet();
        Map<Prayer, List<Prayer>> y = y();
        Prayer[] values = Prayer.values();
        int length = values.length;
        int i = llIIlIIIIIlI[0];
        while (llllIlllllIlll(i, length)) {
            Prayer prayer = values[i];
            if (llllIlllllIlIl(list.contains(prayer) ? 1 : 0) && llllIlllllllII(a(prayer) ? 1 : 0)) {
                Prayers.toggle(prayer, (boolean) llIIlIIIIIlI[9]);
                hashSet.addAll(y.getOrDefault(prayer, Collections.emptyList()));
                "".length();
            }
            i++;
            "".length();
            if (" ".length() > (12 ^ 8)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        boolean a = a(list, llIIlIIIIIlI[0], hashSet);
        a(list, llIIlIIIIIlI[9], hashSet);
        "".length();
        return a;
    }

    private static boolean llllIlllllllIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    private static boolean a(List<Prayer> list, boolean z, Set<Prayer> set) {
        int i = llIIlIIIIIlI[0];
        for (Prayer prayer : list) {
            if (llllIllllllllI(prayer, Prayer.PROTECT_ITEM) && (!llllIlllllIlIl(z ? 1 : 0) || llllIlllllIlIl(set.contains(prayer) ? 1 : 0))) {
                if (!llllIlllllIlIl(a(prayer) ? 1 : 0) || !llllIlllllIlIl(z ? 1 : 0)) {
                    Prayers.toggle(prayer, (boolean) llIIlIIIIIlI[9]);
                } else if (llllIlllllIlIl(a(prayer) ? 1 : 0)) {
                    i = llIIlIIIIIlI[9];
                    "".length();
                    if (("   ".length() & ("   ".length() ^ (-" ".length()))) > 0) {
                        return ((84 ^ 83) ^ (188 ^ 171)) & (((((0 + 122) - 31) + 44) ^ (((110 + 41) - 54) + 54)) ^ (-" ".length()));
                    }
                }
                "".length();
                if ((((200 ^ 197) ^ (79 ^ 113)) & (((((123 + 155) - 198) + 99) ^ (((78 + 42) - 79) + 87)) ^ (-" ".length()))) >= "  ".length()) {
                    return ((((3 + 136) - (-26)) + 25) ^ (((118 + 46) - 49) + 37)) & (((20 ^ 79) ^ (25 ^ 100)) ^ (-" ".length()));
                }
            }
        }
        return i;
    }

    static {
        llllIlllllIlII();
        llllIlllllIIll();
        af = llIIlIIIIIlI[18];
    }

    private static boolean llllIlllllllII(int i) {
        return i != 0;
    }

    private static String llllIlllllIIlI(String lllllllllllllllIlIlIIIIIIlIllIll, String lllllllllllllllIlIlIIIIIIlIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), llIIlIIIIIlI[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIIIIlI[17], lllllllllllllllIlIlIIIIIIlIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIIlIlllII) {
            lllllllllllllllIlIlIIIIIIlIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllllllIlI(int i, int i2) {
        return i != i2;
    }
}
