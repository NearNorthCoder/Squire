package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/z.class */
public class C0077z {
    private static final /* synthetic */ List<List<Integer>> aW;
    private static /* synthetic */ int[] llIllIIlIII;
    private static final /* synthetic */ List<Integer> aU;
    private static final /* synthetic */ List<Integer> aV;
    private final /* synthetic */ SquireAutoTOA aY;
    private static final /* synthetic */ List<Integer> aT;
    private final /* synthetic */ TOAConfig aX;
    private static /* synthetic */ String[] llIllIIIllI;

    private static boolean lIlIlIIlIlIlII(Object obj) {
        return obj == null;
    }

    public List<Integer> i(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        "".length();
        for (List<Integer> list : aW) {
            if (lIlIlIIlIIllll(list.contains(Integer.valueOf(i)) ? 1 : 0)) {
                arrayList.addAll(list);
                "".length();
            }
            "".length();
            if ((-((182 ^ 163) ^ (81 ^ 65))) >= 0) {
                return null;
            }
        }
        return arrayList;
    }

    private static String lIlIlIIlIIIIIl(String llllllllllllllllIIlIlllIlIIIIIII, String llllllllllllllllIIlIlllIIlllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllIIlllllll.getBytes(StandardCharsets.UTF_8)), llIllIIlIII[4]), "DES");
            Cipher llllllllllllllllIIlIlllIlIIIIIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIlllIlIIIIIlI.init(llIllIIlIII[8], secretKeySpec);
            return new String(llllllllllllllllIIlIlllIlIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlllIlIIIIIIl) {
            llllllllllllllllIIlIlllIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIlIlIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    public boolean c(int[] iArr) {
        int i;
        if (!lIlIlIIlIIlllI(iArr.length) && !lIlIlIIlIIllll(this.aY.g() ? 1 : 0)) {
            ArrayList arrayList = new ArrayList();
            if (lIlIlIIlIlIIII(Rand.nextInt(llIllIIlIII[0], llIllIIlIII[1]), llIllIIlIII[2])) {
                i = llIllIIlIII[3];
                "".length();
                if ((((62 ^ 22) ^ (96 ^ 16)) & (((84 ^ 45) ^ (228 ^ 197)) ^ (-" ".length()))) != 0) {
                    return ((((129 + 90) - 114) + 56) ^ (((90 + 109) - 32) + 17)) & (((((4 + 44) - (-115)) + 17) ^ (((165 + 104) - 262) + 166)) ^ (-" ".length()));
                }
            } else {
                i = llIllIIlIII[4];
            }
            int i2 = i;
            int length = iArr.length;
            int i3 = llIllIIlIII[0];
            do {
                if (lIlIlIIlIlIIIl(i3, length)) {
                    int i4 = iArr[i3];
                    int i5 = i2;
                    i2--;
                    if (lIlIlIIlIlIIlI(i5)) {
                        "".length();
                        if ((((182 ^ 189) ^ (78 ^ 121)) & (((28 ^ 8) ^ (188 ^ 148)) ^ (-" ".length()))) > 0) {
                            return ((((75 + 75) - 21) + 52) ^ (((82 + 117) - 104) + 42)) & (((83 ^ 85) ^ (11 ^ 49)) ^ (-" ".length()));
                        }
                    } else {
                        arrayList.addAll(Inventory.getAll(item -> {
                            return i(i4).contains(Integer.valueOf(item.getId()));
                        }));
                        "".length();
                        i3++;
                        "".length();
                    }
                }
                List list = (List) arrayList.stream().filter(item2 -> {
                    String[] strArr = new String[llIllIIlIII[9]];
                    strArr[llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[19]];
                    strArr[llIllIIlIII[2]] = llIllIIIllI[llIllIIlIII[20]];
                    strArr[llIllIIlIII[8]] = llIllIIIllI[llIllIIlIII[21]];
                    return item2.hasAction(strArr);
                }).collect(Collectors.toList());
                if (lIlIlIIlIIllll(list.stream().map(item3 -> {
                    return Static.getItemManager().getItemStats(item3.getId(), (boolean) llIllIIlIII[0]);
                }).anyMatch(itemStats -> {
                    if (lIlIlIIlIlIIll(itemStats) && lIlIlIIlIIllll(itemStats.getEquipment().isTwoHanded() ? 1 : 0)) {
                        ?? r0 = llIllIIlIII[2];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? true & ((true ^ true) ^ true) : r0;
                    }
                    return llIllIIlIII[0];
                }) ? 1 : 0) && lIlIlIIlIlIIll(Equipment.fromSlot(EquipmentInventorySlot.SHIELD)) && lIlIlIIlIIllll(Inventory.isFull() ? 1 : 0)) {
                    Item ai = ai();
                    if (lIlIlIIlIlIIll(ai)) {
                        ai.interact(llIllIIIllI[llIllIIlIII[0]]);
                        return llIllIIlIII[2];
                    }
                }
                Gear.swapTo(iArr);
                "".length();
                if (lIlIlIIlIIlllI(list.isEmpty() ? 1 : 0)) {
                    ?? r0 = llIllIIlIII[2];
                    "".length();
                    return "   ".length() <= 0 ? ((22 ^ 27) ^ (27 ^ 34)) & (((39 ^ 1) ^ (9 ^ 27)) ^ (-" ".length())) : r0;
                }
                return llIllIIlIII[0];
            } while ((-"  ".length()) < 0);
            return (true ^ true) & ((true ^ true) ^ true);
        }
        return llIllIIlIII[0];
    }

    private static void lIlIlIIlIIllIl() {
        llIllIIlIII = new int[41];
        llIllIIlIII[0] = ((((24 + 8) - (-36)) + 151) ^ (((109 + 26) - 46) + 61)) & (((((43 + 32) - (-50)) + 99) ^ (((125 + 79) - 49) + 18)) ^ (-" ".length()));
        llIllIIlIII[1] = (((23 + 6) - (-59)) + 41) ^ (((3 + 27) - (-96)) + 26);
        llIllIIlIII[2] = " ".length();
        llIllIIlIII[3] = (236 ^ 153) ^ (81 ^ 32);
        llIllIIlIII[4] = (121 ^ 29) ^ (89 ^ 53);
        llIllIIlIII[5] = (-17417) & 32602;
        llIllIIlIII[6] = (-524) & 16219;
        llIllIIlIII[7] = (-(((16 + 30) - 28) + 113)) & (-17409) & 32722;
        llIllIIlIII[8] = "  ".length();
        llIllIIlIII[9] = "   ".length();
        llIllIIlIII[10] = 102 ^ 99;
        llIllIIlIII[11] = (187 ^ 138) ^ (74 ^ 125);
        llIllIIlIII[12] = (117 ^ 80) ^ (113 ^ 83);
        llIllIIlIII[13] = (45 ^ 104) ^ (193 ^ 141);
        llIllIIlIII[14] = 92 ^ 86;
        llIllIIlIII[15] = (((155 + 17) - 135) + 151) ^ (((152 + 52) - 30) + 9);
        llIllIIlIII[16] = 118 ^ 122;
        llIllIIlIII[17] = (((35 + 9) - (-7)) + 118) ^ (((144 + 19) - 38) + 39);
        llIllIIlIII[18] = 34 ^ 44;
        llIllIIlIII[19] = (47 ^ 36) ^ (155 ^ 159);
        llIllIIlIII[20] = 188 ^ 172;
        llIllIIlIII[21] = (76 ^ 59) ^ (216 ^ 190);
        llIllIIlIII[22] = (-2306) & 7165;
        llIllIIlIII[23] = (-8197) & 13055;
        llIllIIlIII[24] = (-11521) & 16378;
        llIllIIlIII[25] = (-((-4857) & 13311)) & (-17409) & 30719;
        llIllIIlIII[26] = (-16645) & 21500;
        llIllIIlIII[27] = (-((-33) & 19899)) & (-8193) & 32766;
        llIllIIlIII[28] = (-((-4665) & 15103)) & (-1026) & 16335;
        llIllIIlIII[29] = (-16609) & 21479;
        llIllIIlIII[30] = (-11434) & 16303;
        llIllIIlIII[31] = (-3273) & 8141;
        llIllIIlIII[32] = (-((-10713) & 11740)) & (-8201) & 14095;
        llIllIIlIII[33] = (-3350) & 8061;
        llIllIIlIII[34] = (-24738) & 29615;
        llIllIIlIII[35] = (-((-16485) & 25717)) & (-2275) & 16383;
        llIllIIlIII[36] = (-((-12814) & 30367)) & (-10273) & 32701;
        llIllIIlIII[37] = (-((-14349) & 15373)) & (-26821) & 32719;
        llIllIIlIII[38] = (-17490) & 22363;
        llIllIIlIII[39] = (-((-21542) & 32183)) & (-17409) & 32763;
        llIllIIlIII[40] = 165 ^ 183;
    }

    private static boolean lIlIlIIlIIllll(int i) {
        return i != 0;
    }

    @Inject
    public C0077z(TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        this.aX = tOAConfig;
        this.aY = squireAutoTOA;
    }

    private static boolean lIlIlIIlIlIIII(int i, int i2) {
        return i == i2;
    }

    static {
        lIlIlIIlIIllIl();
        lIlIlIIlIIIIll();
        Integer[] numArr = new Integer[llIllIIlIII[11]];
        numArr[llIllIIlIII[0]] = Integer.valueOf(llIllIIlIII[22]);
        numArr[llIllIIlIII[2]] = Integer.valueOf(llIllIIlIII[23]);
        numArr[llIllIIlIII[8]] = Integer.valueOf(llIllIIlIII[24]);
        numArr[llIllIIlIII[9]] = Integer.valueOf(llIllIIlIII[25]);
        numArr[llIllIIlIII[3]] = Integer.valueOf(llIllIIlIII[26]);
        numArr[llIllIIlIII[10]] = Integer.valueOf(llIllIIlIII[27]);
        aT = Arrays.asList(numArr);
        Integer[] numArr2 = new Integer[llIllIIlIII[11]];
        numArr2[llIllIIlIII[0]] = Integer.valueOf(llIllIIlIII[28]);
        numArr2[llIllIIlIII[2]] = Integer.valueOf(llIllIIlIII[29]);
        numArr2[llIllIIlIII[8]] = Integer.valueOf(llIllIIlIII[30]);
        numArr2[llIllIIlIII[9]] = Integer.valueOf(llIllIIlIII[31]);
        numArr2[llIllIIlIII[3]] = Integer.valueOf(llIllIIlIII[32]);
        numArr2[llIllIIlIII[10]] = Integer.valueOf(llIllIIlIII[33]);
        aU = Arrays.asList(numArr2);
        Integer[] numArr3 = new Integer[llIllIIlIII[11]];
        numArr3[llIllIIlIII[0]] = Integer.valueOf(llIllIIlIII[34]);
        numArr3[llIllIIlIII[2]] = Integer.valueOf(llIllIIlIII[35]);
        numArr3[llIllIIlIII[8]] = Integer.valueOf(llIllIIlIII[36]);
        numArr3[llIllIIlIII[9]] = Integer.valueOf(llIllIIlIII[37]);
        numArr3[llIllIIlIII[3]] = Integer.valueOf(llIllIIlIII[38]);
        numArr3[llIllIIlIII[10]] = Integer.valueOf(llIllIIlIII[39]);
        aV = Arrays.asList(numArr3);
        List[] listArr = new List[llIllIIlIII[9]];
        listArr[llIllIIlIII[0]] = aT;
        listArr[llIllIIlIII[2]] = aU;
        listArr[llIllIIlIII[8]] = aV;
        aW = Arrays.asList(listArr);
    }

    private static String lIlIlIIlIIIIII(String llllllllllllllllIIlIlllIIlIllIll, String llllllllllllllllIIlIlllIIlIllIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllIIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIIlIII[8], llllllllllllllllIIlIlllIIlIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlllIIlIlllII) {
            llllllllllllllllIIlIlllIIlIlllII.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIIlIIIIlI(String llllllllllllllllIIlIlllIIlllIIII, String llllllllllllllllIIlIlllIIllIllll) {
        String llllllllllllllllIIlIlllIIlllIIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlllIIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlllIIllIlllI = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIlllIIllIllll.toCharArray();
        int llllllllllllllllIIlIlllIIllIllII = llIllIIlIII[0];
        char[] charArray2 = llllllllllllllllIIlIlllIIlllIIII2.toCharArray();
        int llllllllllllllllIIlIlllIIllIIlIl = charArray2.length;
        int i = llIllIIlIII[0];
        while (lIlIlIIlIlIIIl(i, llllllllllllllllIIlIlllIIllIIlIl)) {
            llllllllllllllllIIlIlllIIllIlllI.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlIlllIIllIllII % charArray.length]));
            "".length();
            llllllllllllllllIIlIlllIIllIllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIlllIIllIlllI);
    }

    private static boolean lIlIlIIlIlIIIl(int i, int i2) {
        return i < i2;
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (lIlIlIIlIlIIll(equipmentSetup)) {
            int[] ids = equipmentSetup.getIds();
            "".length();
            if (0 != 0) {
                return null;
            }
            return ids;
        }
        return new int[llIllIIlIII[0]];
    }

    private static boolean lIlIlIIlIIlllI(int i) {
        return i == 0;
    }

    private static boolean lIlIlIIlIlIIlI(int i) {
        return i <= 0;
    }

    private static void lIlIlIIlIIIIll() {
        llIllIIIllI = new String[llIllIIlIII[40]];
        llIllIIIllI[llIllIIlIII[0]] = lIlIlIIlIIIIII("4L1B4aGTZAk=", "ruxmo");
        llIllIIIllI[llIllIIlIII[2]] = lIlIlIIlIIIIIl("5tv7lZ5JnWQ=", "LqRAp");
        llIllIIIllI[llIllIIlIII[8]] = lIlIlIIlIIIIII("pSBrwVOXIcg=", "ASwMb");
        llIllIIIllI[llIllIIlIII[9]] = lIlIlIIlIIIIlI("HCEmAA==", "XSIpi");
        llIllIIIllI[llIllIIlIII[3]] = lIlIlIIlIIIIIl("+EInAefO5EY=", "AaTkO");
        llIllIIIllI[llIllIIlIII[10]] = lIlIlIIlIIIIII("eJUopWzUyE4=", "PwYKh");
        llIllIIIllI[llIllIIlIII[11]] = lIlIlIIlIIIIII("gPB3eJDf8Jc=", "ggSoI");
        llIllIIIllI[llIllIIlIII[12]] = lIlIlIIlIIIIII("z5tuQeMcA4o=", "wNmhQ");
        llIllIIIllI[llIllIIlIII[4]] = lIlIlIIlIIIIlI("HSo1Ahsc", "yCCku");
        llIllIIIllI[llIllIIlIII[13]] = lIlIlIIlIIIIII("kQjKqFsFDCA=", "ovIsm");
        llIllIIIllI[llIllIIlIII[14]] = lIlIlIIlIIIIIl("so6gsB0jzRQ=", "UTAnU");
        llIllIIIllI[llIllIIlIII[15]] = lIlIlIIlIIIIII("99vOFvC03Xs=", "dCscZ");
        llIllIIIllI[llIllIIlIII[16]] = lIlIlIIlIIIIIl("vI6aVPr/wDg=", "CsZgY");
        llIllIIIllI[llIllIIlIII[17]] = lIlIlIIlIIIIIl("Hc0Edbqp2Gc=", "eFodG");
        llIllIIIllI[llIllIIlIII[18]] = lIlIlIIlIIIIIl("py6VYHeZsoI=", "shBVv");
        llIllIIIllI[llIllIIlIII[19]] = lIlIlIIlIIIIlI("IwYEGRA=", "toaut");
        llIllIIIllI[llIllIIlIII[20]] = lIlIlIIlIIIIlI("DQkSBA==", "Zlsvt");
        llIllIIIllI[llIllIIlIII[21]] = lIlIlIIlIIIIII("xyx/YewFy/8=", "HQLhN");
    }

    private Item ai() {
        int i;
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[llIllIIlIII[2]];
            strArr[llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[18]];
            return item.hasAction(strArr);
        });
        if (lIlIlIIlIlIIll(first)) {
            return first;
        }
        if (lIlIlIIlIIllll(j(llIllIIlIII[5]) ? 1 : 0)) {
            return Inventory.getFirst(item2 -> {
                if (lIlIlIIlIIlllI(item2.getName().toLowerCase().contains(llIllIIIllI[llIllIIlIII[16]]) ? 1 : 0)) {
                    String[] strArr = new String[llIllIIlIII[2]];
                    strArr[llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[17]];
                    if (lIlIlIIlIIllll(item2.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = llIllIIlIII[2];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & (true ^ true) : r0;
                    }
                }
                return llIllIIlIII[0];
            });
        }
        if (!lIlIlIIlIIlllI(j(llIllIIlIII[6]) ? 1 : 0) || lIlIlIIlIIllll(j(llIllIIlIII[7]) ? 1 : 0)) {
            i = llIllIIlIII[2];
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        } else {
            i = llIllIIlIII[0];
        }
        int llllllllllllllllIIlIlllIlIlIlIIl = i;
        if (lIlIlIIlIIllll(llllllllllllllllIIlIlllIlIlIlIIl)) {
            Item first2 = Inventory.getFirst(item3 -> {
                return item3.getName().toLowerCase().contains(llIllIIIllI[llIllIIlIII[15]]);
            });
            if (lIlIlIIlIlIIll(first2)) {
                return first2;
            }
            Item first3 = Inventory.getFirst(item4 -> {
                if (!lIlIlIIlIIlllI(item4.getName().toLowerCase().contains(llIllIIIllI[llIllIIlIII[4]]) ? 1 : 0) || lIlIlIIlIIllll(item4.getName().toLowerCase().contains(llIllIIIllI[llIllIIlIII[13]]) ? 1 : 0)) {
                    String[] strArr = new String[llIllIIlIII[2]];
                    strArr[llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[14]];
                    if (lIlIlIIlIIllll(item4.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = llIllIIlIII[2];
                        "".length();
                        return (-" ".length()) > ((201 ^ 195) & ((21 ^ 31) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return llIllIIlIII[0];
            });
            if (lIlIlIIlIlIIll(first3)) {
                return first3;
            }
            Item first4 = Inventory.getFirst(item5 -> {
                if (lIlIlIIlIIlllI(EnumC0056e.TEARS_OF_ELIDINIS.d(item5.getId()) ? 1 : 0) && lIlIlIIlIIlllI(item5.getName().contains(llIllIIIllI[llIllIIlIII[10]]) ? 1 : 0) && lIlIlIIlIIlllI(item5.getName().contains(llIllIIIllI[llIllIIlIII[11]]) ? 1 : 0) && !lIlIlIIlIIllll(item5.getName().contains(llIllIIIllI[llIllIIlIII[12]]) ? 1 : 0)) {
                    return llIllIIlIII[0];
                }
                ?? r0 = llIllIIlIII[2];
                "".length();
                return (63 ^ 59) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            });
            if (lIlIlIIlIlIIll(first4)) {
                return first4;
            }
        }
        Item item6 = (Item) Inventory.getAll(item7 -> {
            String[] strArr = new String[llIllIIlIII[2]];
            strArr[llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[3]];
            return item7.hasAction(strArr);
        }).stream().filter((v0) -> {
            return v0.isTradable();
        }).filter(item8 -> {
            String[] strArr = new String[llIllIIlIII[2]];
            strArr[llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[9]];
            return item8.hasAction(strArr);
        }).min(Comparator.comparingInt(item9 -> {
            return Prices.getItemPrice(item9.getId());
        })).orElse(null);
        return lIlIlIIlIlIlII(item6) ? (Item) Inventory.getAll(item10 -> {
            String[] strArr = new String[llIllIIlIII[2]];
            strArr[llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[8]];
            return item10.hasAction(strArr);
        }).stream().filter(item11 -> {
            String[] strArr = new String[llIllIIlIII[2]];
            strArr[llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[2]];
            return item11.hasAction(strArr);
        }).min(Comparator.comparingInt(item12 -> {
            return Prices.getItemPrice(item12.getId());
        })).orElse(null) : item6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean j(int i) {
        int[] mapRegions = Static.getClient().getMapRegions();
        int length = mapRegions.length;
        int i2 = llIllIIlIII[0];
        while (lIlIlIIlIlIIIl(i2, length)) {
            if (lIlIlIIlIlIIII(mapRegions[i2], i)) {
                return llIllIIlIII[2];
            }
            i2++;
            "".length();
            if ((-(79 ^ 74)) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIllIIlIII[0];
    }
}
