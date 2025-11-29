package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Inventory;
@Singleton
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.t  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/t.class */
public class C0019t {
    private static final /* synthetic */ List<Integer> t;
    private static final /* synthetic */ List<Integer> s;
    private final /* synthetic */ SquireZulrahConfig w;
    private static /* synthetic */ int[] lIllIlIIIIIIl;
    private static /* synthetic */ String[] lIllIIllllllI;
    private static final /* synthetic */ List<Integer> u;
    private static final /* synthetic */ List<List<Integer>> v;

    private static void llIIIlllIIlIlll() {
        lIllIIllllllI = new String[lIllIlIIIIIIl[11]];
        lIllIIllllllI[lIllIlIIIIIIl[0]] = llIIIlllIIlIIll("HTwCDQ==", "SSlhK");
        lIllIIllllllI[lIllIlIIIIIIl[2]] = llIIIlllIIlIIll("FD0uOC8=", "CTKTK");
        lIllIIllllllI[lIllIlIIIIIIl[3]] = llIIIlllIIlIlII("QOO9Lrd/A3o=", "oyBDN");
        lIllIIllllllI[lIllIlIIIIIIl[4]] = llIIIlllIIlIllI("9aRZdsieqU8=", "nHbhf");
    }

    public List<Integer> f(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        "".length();
        for (List<Integer> list : v) {
            if (llIIIlllIIlllIl(list.contains(Integer.valueOf(i)) ? 1 : 0)) {
                arrayList.addAll(list);
                "".length();
            }
            "".length();
            if ((-" ".length()) == "   ".length()) {
                return null;
            }
        }
        return arrayList;
    }

    private static boolean llIIIlllIIllllI(Object obj) {
        return obj != null;
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (llIIIlllIIllllI(equipmentSetup)) {
            int[] ids = equipmentSetup.getIds();
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
            return ids;
        }
        return new int[lIllIlIIIIIIl[0]];
    }

    private static boolean llIIIlllIIlllII(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIlllIIllIll();
        llIIIlllIIlIlll();
        Integer[] numArr = new Integer[lIllIlIIIIIIl[6]];
        numArr[lIllIlIIIIIIl[0]] = Integer.valueOf(lIllIlIIIIIIl[7]);
        numArr[lIllIlIIIIIIl[2]] = Integer.valueOf(lIllIlIIIIIIl[8]);
        numArr[lIllIlIIIIIIl[3]] = Integer.valueOf(lIllIlIIIIIIl[9]);
        numArr[lIllIlIIIIIIl[4]] = Integer.valueOf(lIllIlIIIIIIl[10]);
        numArr[lIllIlIIIIIIl[11]] = Integer.valueOf(lIllIlIIIIIIl[12]);
        numArr[lIllIlIIIIIIl[13]] = Integer.valueOf(lIllIlIIIIIIl[14]);
        s = Arrays.asList(numArr);
        Integer[] numArr2 = new Integer[lIllIlIIIIIIl[6]];
        numArr2[lIllIlIIIIIIl[0]] = Integer.valueOf(lIllIlIIIIIIl[15]);
        numArr2[lIllIlIIIIIIl[2]] = Integer.valueOf(lIllIlIIIIIIl[16]);
        numArr2[lIllIlIIIIIIl[3]] = Integer.valueOf(lIllIlIIIIIIl[17]);
        numArr2[lIllIlIIIIIIl[4]] = Integer.valueOf(lIllIlIIIIIIl[18]);
        numArr2[lIllIlIIIIIIl[11]] = Integer.valueOf(lIllIlIIIIIIl[19]);
        numArr2[lIllIlIIIIIIl[13]] = Integer.valueOf(lIllIlIIIIIIl[20]);
        t = Arrays.asList(numArr2);
        Integer[] numArr3 = new Integer[lIllIlIIIIIIl[6]];
        numArr3[lIllIlIIIIIIl[0]] = Integer.valueOf(lIllIlIIIIIIl[21]);
        numArr3[lIllIlIIIIIIl[2]] = Integer.valueOf(lIllIlIIIIIIl[22]);
        numArr3[lIllIlIIIIIIl[3]] = Integer.valueOf(lIllIlIIIIIIl[23]);
        numArr3[lIllIlIIIIIIl[4]] = Integer.valueOf(lIllIlIIIIIIl[24]);
        numArr3[lIllIlIIIIIIl[11]] = Integer.valueOf(lIllIlIIIIIIl[25]);
        numArr3[lIllIlIIIIIIl[13]] = Integer.valueOf(lIllIlIIIIIIl[26]);
        u = Arrays.asList(numArr3);
        List[] listArr = new List[lIllIlIIIIIIl[4]];
        listArr[lIllIlIIIIIIl[0]] = s;
        listArr[lIllIlIIIIIIl[2]] = t;
        listArr[lIllIlIIIIIIl[3]] = u;
        v = Arrays.asList(listArr);
    }

    private static String llIIIlllIIlIlII(String llllllllllllllIllIIlIIIIIlIlIlll, String llllllllllllllIllIIlIIIIIlIlIllI) {
        try {
            SecretKeySpec llllllllllllllIllIIlIIIIIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIIIIIlIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIIIIIlIllIIl.init(lIllIlIIIIIIl[3], llllllllllllllIllIIlIIIIIlIllIlI);
            return new String(llllllllllllllIllIIlIIIIIlIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIIIIlIllIII) {
            llllllllllllllIllIIlIIIIIlIllIII.printStackTrace();
            return null;
        }
    }

    public int[] O() {
        return llIIIlllIIlllIl(this.w.mageGear().getSelected().equals(lIllIIllllllI[lIllIlIIIIIIl[0]]) ? 1 : 0) ? a(this.w.rangedGear()) : a(this.w.mageGear());
    }

    private static boolean llIIIlllIIlllll(int i) {
        return i == 0;
    }

    private static String llIIIlllIIlIllI(String llllllllllllllIllIIlIIIIIlIIlIlI, String llllllllllllllIllIIlIIIIIlIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlIIIIIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), lIllIlIIIIIIl[27]), "DES");
            Cipher llllllllllllllIllIIlIIIIIlIIllII = Cipher.getInstance("DES");
            llllllllllllllIllIIlIIIIIlIIllII.init(lIllIlIIIIIIl[3], llllllllllllllIllIIlIIIIIlIIllIl);
            return new String(llllllllllllllIllIIlIIIIIlIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIIIIlIIIllI) {
            llllllllllllllIllIIlIIIIIlIIIllI.printStackTrace();
            return null;
        }
    }

    public int[] P() {
        return a(this.w.rangedGear());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean a(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int llllllllllllllIllIIlIIIIlIIIllll = iArr.length;
        int llllllllllllllIllIIlIIIIlIIIlllI = lIllIlIIIIIIl[0];
        while (llIIIlllIIlllII(llllllllllllllIllIIlIIIIlIIIlllI, llllllllllllllIllIIlIIIIlIIIllll)) {
            int i = iArr[llllllllllllllIllIIlIIIIlIIIlllI];
            arrayList.addAll(Inventory.getAll(item -> {
                if (llIIIlllIlIIIII(item.getId(), lIllIlIIIIIIl[5]) && llIIIlllIIlllIl(f(i).contains(Integer.valueOf(item.getId())) ? 1 : 0)) {
                    ?? r0 = lIllIlIIIIIIl[2];
                    "".length();
                    return " ".length() > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIlIIIIIIl[0];
            }));
            "".length();
            llllllllllllllIllIIlIIIIlIIIlllI++;
            "".length();
            if ((166 ^ 162) <= " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (llIIIlllIIlllIl(arrayList.isEmpty() ? 1 : 0)) {
            return lIllIlIIIIIIl[0];
        }
        int i2 = lIllIlIIIIIIl[0];
        while (llIIIlllIIlllII(i2, Math.min(arrayList.size(), lIllIlIIIIIIl[1]))) {
            ((Item) arrayList.get(i2)).interact(str -> {
                if (!llIIIlllIIllllI(str) || (llIIIlllIIlllll(str.equals(lIllIIllllllI[lIllIlIIIIIIl[2]]) ? 1 : 0) && llIIIlllIIlllll(str.equals(lIllIIllllllI[lIllIlIIIIIIl[3]]) ? 1 : 0) && !llIIIlllIIlllIl(str.equals(lIllIIllllllI[lIllIlIIIIIIl[4]]) ? 1 : 0))) {
                    return lIllIlIIIIIIl[0];
                }
                ?? r0 = lIllIlIIIIIIl[2];
                "".length();
                return (((((1 + 175) - 48) + 76) ^ (((103 + 74) - 57) + 20)) & (((((18 + 156) - 149) + 169) ^ (((125 + 124) - 135) + 16)) ^ (-" ".length()))) >= "   ".length() ? ((99 ^ 57) ^ (3 ^ 96)) & (((158 ^ 147) ^ (166 ^ 146)) ^ (-" ".length())) : r0;
            });
            i2++;
            "".length();
            if ("  ".length() <= ((247 ^ 178) & ((209 ^ 148) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIllIlIIIIIIl[2];
    }

    private static void llIIIlllIIllIll() {
        lIllIlIIIIIIl = new int[28];
        lIllIlIIIIIIl[0] = ((23 ^ 17) ^ (54 ^ 97)) & (((((81 + 94) - 106) + 123) ^ (((22 + 39) - (-15)) + 69)) ^ (-" ".length()));
        lIllIlIIIIIIl[1] = 67 ^ 68;
        lIllIlIIIIIIl[2] = " ".length();
        lIllIlIIIIIIl[3] = "  ".length();
        lIllIlIIIIIIl[4] = "   ".length();
        lIllIlIIIIIIl[5] = (-5121) & 7670;
        lIllIlIIIIIIl[6] = (192 ^ 180) ^ (198 ^ 180);
        lIllIlIIIIIIl[7] = (-27649) & 32508;
        lIllIlIIIIIIl[8] = (-((-173) & 8621)) & (-5) & 13311;
        lIllIlIIIIIIl[9] = (-27906) & 32763;
        lIllIlIIIIIIl[10] = (-2311) & 7167;
        lIllIlIIIIIIl[11] = (((119 + 42) - 43) + 80) ^ (((189 + 29) - 24) + 0);
        lIllIlIIIIIIl[12] = (-25604) & 30459;
        lIllIlIIIIIIl[13] = 138 ^ 143;
        lIllIlIIIIIIl[14] = (-((-13089) & 16305)) & (-12) & 7935;
        lIllIlIIIIIIl[15] = (-152) & 5023;
        lIllIlIIIIIIl[16] = (-((-2817) & 20345)) & (-2177) & 24575;
        lIllIlIIIIIIl[17] = (-((-17870) & 28127)) & (-233) & 15359;
        lIllIlIIIIIIl[18] = (-((-5421) & 21999)) & (-1057) & 22503;
        lIllIlIIIIIIl[19] = (-((-4385) & 15866)) & (-16387) & 32735;
        lIllIlIIIIIIl[20] = (-17809) & 22520;
        lIllIlIIIIIIl[21] = (-24769) & 29646;
        lIllIlIIIIIIl[22] = (-17425) & 22301;
        lIllIlIIIIIIl[23] = (-((-9043) & 10102)) & (-16465) & 22399;
        lIllIlIIIIIIl[24] = (-2209) & 7083;
        lIllIlIIIIIIl[25] = (-((-69) & 25845)) & (-1) & 30650;
        lIllIlIIIIIIl[26] = (-((-4346) & 31231)) & (-145) & 31743;
        lIllIlIIIIIIl[27] = 24 ^ 16;
    }

    private static boolean llIIIlllIlIIIII(int i, int i2) {
        return i != i2;
    }

    private static String llIIIlllIIlIIll(String llllllllllllllIllIIlIIIIIllIllII, String llllllllllllllIllIIlIIIIIllIlIll) {
        String llllllllllllllIllIIlIIIIIllIllII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIIIIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIIIIIllIlIlI = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlIIIIIllIlIll.toCharArray();
        int llllllllllllllIllIIlIIIIIllIIIll = lIllIlIIIIIIl[0];
        char[] charArray2 = llllllllllllllIllIIlIIIIIllIllII2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIIIIIIl[0];
        while (llIIIlllIIlllII(i, length)) {
            llllllllllllllIllIIlIIIIIllIlIlI.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIlIIIIIllIIIll % charArray.length]));
            "".length();
            llllllllllllllIllIIlIIIIIllIIIll++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIIIIIllIlIlI);
    }

    @Inject
    public C0019t(SquireZulrahConfig squireZulrahConfig) {
        this.w = squireZulrahConfig;
    }

    private static boolean llIIIlllIIlllIl(int i) {
        return i != 0;
    }
}
