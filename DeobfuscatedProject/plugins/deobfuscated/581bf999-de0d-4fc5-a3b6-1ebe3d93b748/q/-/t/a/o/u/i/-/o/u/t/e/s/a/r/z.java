/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import java.util.Iterator;
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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

@Singleton
public class z {
    private static final /* synthetic */ List<List<Integer>> aW;
    private static /* synthetic */ int[] llIllIIlIII;
    private static final /* synthetic */ List<Integer> aU;
    private static final /* synthetic */ List<Integer> aV;
    private final /* synthetic */ SquireAutoTOA aY;
    private static final /* synthetic */ List<Integer> aT;
    private final /* synthetic */ TOAConfig aX;
    private static /* synthetic */ String[] llIllIIIllI;

    private static boolean lIlIlIIlIlIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public List<Integer> i(int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(n2);
        0;
        Iterator<List<Integer>> llllllllllllllllIIlIlllIlIIllIll = aW.iterator();
        while (z.lIlIlIIlIIllll(llllllllllllllllIIlIlllIlIIllIll.hasNext() ? 1 : 0)) {
            void llllllllllllllllIIlIlllIlIIlllIl;
            List<Integer> llllllllllllllllIIlIlllIlIIllIlI = llllllllllllllllIIlIlllIlIIllIll.next();
            if (z.lIlIlIIlIIllll(llllllllllllllllIIlIlllIlIIllIlI.contains((int)llllllllllllllllIIlIlllIlIIlllIl) ? 1 : 0)) {
                void llllllllllllllllIIlIlllIlIIlllII;
                llllllllllllllllIIlIlllIlIIlllII.addAll(llllllllllllllllIIlIlllIlIIllIlI);
                0;
            }
            0;
            if (-(0xB6 ^ 0xA3 ^ (0x51 ^ 0x41)) < 0) continue;
            return null;
        }
        return arrayList;
    }

    private static String lIlIlIIlIIIIIl(String llllllllllllllllIIlIlllIIllllllI, String llllllllllllllllIIlIlllIIlllllll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllIlIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllIIlllllll.getBytes(StandardCharsets.UTF_8)), llIllIIlIII[4]), "DES");
            Cipher llllllllllllllllIIlIlllIlIIIIIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIlllIlIIIIIlI.init(llIllIIlIII[8], llllllllllllllllIIlIlllIlIIIIIll);
            return new String(llllllllllllllllIIlIlllIlIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlllIlIIIIIIl) {
            llllllllllllllllIIlIlllIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIlIlIIll(Object object) {
        return object != null;
    }

    private /* synthetic */ boolean a(int n2, Item item) {
        return this.i(n2).contains(item.getId());
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(int[] nArray) {
        boolean bl2;
        void llllllllllllllllIIlIlllIlIlllIlI;
        int n2;
        z llllllllllllllllIIlIlllIlIlllIll;
        if (z.lIlIlIIlIIlllI(nArray.length)) {
            return llIllIIlIII[0];
        }
        if (z.lIlIlIIlIIllll(llllllllllllllllIIlIlllIlIlllIll.aY.g() ? 1 : 0)) {
            return llIllIIlIII[0];
        }
        ArrayList llllllllllllllllIIlIlllIlIlllIIl = new ArrayList();
        if (z.lIlIlIIlIlIIII(Rand.nextInt((int)llIllIIlIII[0], (int)llIllIIlIII[1]), llIllIIlIII[2])) {
            n2 = llIllIIlIII[3];
            0;
            if (((0x3E ^ 0x16 ^ (0x60 ^ 0x10)) & (0x54 ^ 0x2D ^ (0xE4 ^ 0xC5) ^ -1)) != 0) {
                return ((129 + 90 - 114 + 56 ^ 90 + 109 - 32 + 17) & (4 + 44 - -115 + 17 ^ 165 + 104 - 262 + 166 ^ -1)) != 0;
            }
        } else {
            n2 = llIllIIlIII[4];
        }
        int llllllllllllllllIIlIlllIlIlllIII = n2;
        List llllllllllllllllIIlIlllIlIllIlll = llllllllllllllllIIlIlllIlIlllIlI;
        int llllllllllllllllIIlIlllIlIllIllI = ((void)llllllllllllllllIIlIlllIlIllIlll).length;
        int llllllllllllllllIIlIlllIlIllIlIl = llIllIIlIII[0];
        while (z.lIlIlIIlIlIIIl(llllllllllllllllIIlIlllIlIllIlIl, llllllllllllllllIIlIlllIlIllIllI)) {
            void llllllllllllllllIIlIlllIlIllIlII = llllllllllllllllIIlIlllIlIllIlll[llllllllllllllllIIlIlllIlIllIlIl];
            if (z.lIlIlIIlIlIIlI(llllllllllllllllIIlIlllIlIlllIII--)) {
                0;
                if (((0xB6 ^ 0xBD ^ (0x4E ^ 0x79)) & (0x1C ^ 8 ^ (0xBC ^ 0x94) ^ -1)) <= 0) break;
                return ((75 + 75 - 21 + 52 ^ 82 + 117 - 104 + 42) & (0x53 ^ 0x55 ^ (0xB ^ 0x31) ^ -1)) != 0;
            }
            llllllllllllllllIIlIlllIlIlllIIl.addAll(Inventory.getAll(arg_0 -> llllllllllllllllIIlIlllIlIlllIll.a((int)llllllllllllllllIIlIlllIlIllIlII, arg_0)));
            0;
            ++llllllllllllllllIIlIlllIlIllIlIl;
            0;
            if (-2 < 0) continue;
            return ((0x40 ^ 0x5C) & ~(0x3F ^ 0x23)) != 0;
        }
        if (z.lIlIlIIlIIllll(llllllllllllllllIIlIlllIlIllIllI = (int)((llllllllllllllllIIlIlllIlIllIlll = llllllllllllllllIIlIlllIlIlllIIl.stream().filter(item -> {
            String[] stringArray = new String[llIllIIlIII[9]];
            stringArray[z.llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[19]];
            stringArray[z.llIllIIlIII[2]] = llIllIIIllI[llIllIIlIII[20]];
            stringArray[z.llIllIIlIII[8]] = llIllIIIllI[llIllIIlIII[21]];
            return item.hasAction(stringArray);
        }).collect(Collectors.toList())).stream().map(item -> Static.getItemManager().getItemStats(item.getId(), llIllIIlIII[0])).anyMatch(itemStats -> {
            int n2;
            if (z.lIlIlIIlIlIIll(itemStats) && z.lIlIlIIlIIllll(itemStats.getEquipment().isTwoHanded() ? 1 : 0)) {
                n2 = llIllIIlIII[2];
                0;
                if (((0x9C ^ 0x87) & ~(0xD8 ^ 0xC3)) != 0) {
                    return ((0x27 ^ 0) & ~(0x72 ^ 0x55)) != 0;
                }
            } else {
                n2 = llIllIIlIII[0];
            }
            return n2 != 0;
        }) ? 1 : 0)) && z.lIlIlIIlIlIIll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && z.lIlIlIIlIIllll(Inventory.isFull() ? 1 : 0) && z.lIlIlIIlIlIIll(llllllllllllllllIIlIlllIlIllIlIl = llllllllllllllllIIlIlllIlIlllIll.ai())) {
            llllllllllllllllIIlIlllIlIllIlIl.interact(llIllIIIllI[llIllIIlIII[0]]);
            return llIllIIlIII[2];
        }
        Gear.swapTo((int[])llllllllllllllllIIlIlllIlIlllIlI);
        0;
        if (z.lIlIlIIlIIlllI(llllllllllllllllIIlIlllIlIllIlll.isEmpty() ? 1 : 0)) {
            bl2 = llIllIIlIII[2];
            0;
            if (3 <= 0) {
                return ((0x16 ^ 0x1B ^ (0x1B ^ 0x22)) & (0x27 ^ 1 ^ (9 ^ 0x1B) ^ -1)) != 0;
            }
        } else {
            bl2 = llIllIIlIII[0];
        }
        return bl2;
    }

    private static void lIlIlIIlIIllIl() {
        llIllIIlIII = new int[41];
        z.llIllIIlIII[0] = (24 + 8 - -36 + 151 ^ 109 + 26 - 46 + 61) & (43 + 32 - -50 + 99 ^ 125 + 79 - 49 + 18 ^ -1);
        z.llIllIIlIII[1] = 23 + 6 - -59 + 41 ^ 3 + 27 - -96 + 26;
        z.llIllIIlIII[2] = 1;
        z.llIllIIlIII[3] = 0xEC ^ 0x99 ^ (0x51 ^ 0x20);
        z.llIllIIlIII[4] = 0x79 ^ 0x1D ^ (0x59 ^ 0x35);
        z.llIllIIlIII[5] = 0xFFFFBBF7 & 0x7F5A;
        z.llIllIIlIII[6] = 0xFFFFFDF4 & 0x3F5B;
        z.llIllIIlIII[7] = -(16 + 30 - 28 + 113) & (0xFFFFBBFF & 0x7FD2);
        z.llIllIIlIII[8] = 2;
        z.llIllIIlIII[9] = 3;
        z.llIllIIlIII[10] = 0x66 ^ 0x63;
        z.llIllIIlIII[11] = 0xBB ^ 0x8A ^ (0x4A ^ 0x7D);
        z.llIllIIlIII[12] = 0x75 ^ 0x50 ^ (0x71 ^ 0x53);
        z.llIllIIlIII[13] = 0x2D ^ 0x68 ^ (0xC1 ^ 0x8D);
        z.llIllIIlIII[14] = 0x5C ^ 0x56;
        z.llIllIIlIII[15] = 155 + 17 - 135 + 151 ^ 152 + 52 - 30 + 9;
        z.llIllIIlIII[16] = 0x76 ^ 0x7A;
        z.llIllIIlIII[17] = 35 + 9 - -7 + 118 ^ 144 + 19 - 38 + 39;
        z.llIllIIlIII[18] = 0x22 ^ 0x2C;
        z.llIllIIlIII[19] = 0x2F ^ 0x24 ^ (0x9B ^ 0x9F);
        z.llIllIIlIII[20] = 0xBC ^ 0xAC;
        z.llIllIIlIII[21] = 0x4C ^ 0x3B ^ (0xD8 ^ 0xBE);
        z.llIllIIlIII[22] = 0xFFFFF6FE & 0x1BFD;
        z.llIllIIlIII[23] = 0xFFFFDFFB & 0x32FF;
        z.llIllIIlIII[24] = 0xFFFFD2FF & 0x3FFA;
        z.llIllIIlIII[25] = -(0xFFFFED07 & 0x33FF) & (0xFFFFBBFF & 0x77FF);
        z.llIllIIlIII[26] = 0xFFFFBEFB & 0x53FC;
        z.llIllIIlIII[27] = -(0xFFFFFFDF & 0x4DBB) & (0xFFFFDFFF & 0x7FFE);
        z.llIllIIlIII[28] = -(0xFFFFEDC7 & 0x3AFF) & (0xFFFFFBFE & 0x3FCF);
        z.llIllIIlIII[29] = 0xFFFFBF1F & 0x53E7;
        z.llIllIIlIII[30] = 0xFFFFD356 & 0x3FAF;
        z.llIllIIlIII[31] = 0xFFFFF337 & 0x1FCD;
        z.llIllIIlIII[32] = -(0xFFFFD627 & 0x2DDC) & (0xFFFFDFF7 & 0x370F);
        z.llIllIIlIII[33] = 0xFFFFF2EA & 0x1F7D;
        z.llIllIIlIII[34] = 0xFFFF9F5E & 0x73AF;
        z.llIllIIlIII[35] = -(0xFFFFBF9B & 0x6475) & (0xFFFFF71D & 0x3FFF);
        z.llIllIIlIII[36] = -(0xFFFFCDF2 & 0x769F) & (0xFFFFD7DF & 0x7FBD);
        z.llIllIIlIII[37] = -(0xFFFFC7F3 & 0x3C0D) & (0xFFFF973B & 0x7FCF);
        z.llIllIIlIII[38] = 0xFFFFBBAE & 0x575B;
        z.llIllIIlIII[39] = -(0xFFFFABDA & 0x7DB7) & (0xFFFFBBFF & 0x7FFB);
        z.llIllIIlIII[40] = 0xA5 ^ 0xB7;
    }

    private static boolean lIlIlIIlIIllll(int n2) {
        return n2 != 0;
    }

    @Inject
    public z(TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        this.aX = tOAConfig;
        this.aY = squireAutoTOA;
    }

    private static boolean lIlIlIIlIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        z.lIlIlIIlIIllIl();
        z.lIlIlIIlIIIIll();
        Integer[] integerArray = new Integer[llIllIIlIII[11]];
        integerArray[z.llIllIIlIII[0]] = llIllIIlIII[22];
        integerArray[z.llIllIIlIII[2]] = llIllIIlIII[23];
        integerArray[z.llIllIIlIII[8]] = llIllIIlIII[24];
        integerArray[z.llIllIIlIII[9]] = llIllIIlIII[25];
        integerArray[z.llIllIIlIII[3]] = llIllIIlIII[26];
        integerArray[z.llIllIIlIII[10]] = llIllIIlIII[27];
        aT = Arrays.asList(integerArray);
        Integer[] integerArray2 = new Integer[llIllIIlIII[11]];
        integerArray2[z.llIllIIlIII[0]] = llIllIIlIII[28];
        integerArray2[z.llIllIIlIII[2]] = llIllIIlIII[29];
        integerArray2[z.llIllIIlIII[8]] = llIllIIlIII[30];
        integerArray2[z.llIllIIlIII[9]] = llIllIIlIII[31];
        integerArray2[z.llIllIIlIII[3]] = llIllIIlIII[32];
        integerArray2[z.llIllIIlIII[10]] = llIllIIlIII[33];
        aU = Arrays.asList(integerArray2);
        Integer[] integerArray3 = new Integer[llIllIIlIII[11]];
        integerArray3[z.llIllIIlIII[0]] = llIllIIlIII[34];
        integerArray3[z.llIllIIlIII[2]] = llIllIIlIII[35];
        integerArray3[z.llIllIIlIII[8]] = llIllIIlIII[36];
        integerArray3[z.llIllIIlIII[9]] = llIllIIlIII[37];
        integerArray3[z.llIllIIlIII[3]] = llIllIIlIII[38];
        integerArray3[z.llIllIIlIII[10]] = llIllIIlIII[39];
        aV = Arrays.asList(integerArray3);
        List[] listArray = new List[llIllIIlIII[9]];
        listArray[z.llIllIIlIII[0]] = aT;
        listArray[z.llIllIIlIII[2]] = aU;
        listArray[z.llIllIIlIII[8]] = aV;
        aW = Arrays.asList(listArray);
    }

    private static String lIlIlIIlIIIIII(String llllllllllllllllIIlIlllIIlIllIll, String llllllllllllllllIIlIlllIIlIllIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllIIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlllIIlIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlllIIlIlllIl.init(llIllIIlIII[8], llllllllllllllllIIlIlllIIlIllllI);
            return new String(llllllllllllllllIIlIlllIIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlllIIlIlllII) {
            llllllllllllllllIIlIlllIIlIlllII.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIIlIIIIlI(String llllllllllllllllIIlIlllIIllIlIll, String llllllllllllllllIIlIlllIIllIllll) {
        llllllllllllllllIIlIlllIIllIlIll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlllIIllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlllIIllIlllI = new StringBuilder();
        char[] llllllllllllllllIIlIlllIIllIllIl = llllllllllllllllIIlIlllIIllIllll.toCharArray();
        int llllllllllllllllIIlIlllIIllIllII = llIllIIlIII[0];
        char[] llllllllllllllllIIlIlllIIllIIllI = llllllllllllllllIIlIlllIIllIlIll.toCharArray();
        int llllllllllllllllIIlIlllIIllIIlIl = llllllllllllllllIIlIlllIIllIIllI.length;
        int llllllllllllllllIIlIlllIIllIIlII = llIllIIlIII[0];
        while (z.lIlIlIIlIlIIIl(llllllllllllllllIIlIlllIIllIIlII, llllllllllllllllIIlIlllIIllIIlIl)) {
            char llllllllllllllllIIlIlllIIlllIIIl = llllllllllllllllIIlIlllIIllIIllI[llllllllllllllllIIlIlllIIllIIlII];
            llllllllllllllllIIlIlllIIllIlllI.append((char)(llllllllllllllllIIlIlllIIlllIIIl ^ llllllllllllllllIIlIlllIIllIllIl[llllllllllllllllIIlIlllIIllIllII % llllllllllllllllIIlIlllIIllIllIl.length]));
            0;
            ++llllllllllllllllIIlIlllIIllIllII;
            ++llllllllllllllllIIlIlllIIllIIlII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlllIIllIlllI);
    }

    private static boolean lIlIlIIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (z.lIlIlIIlIlIIll(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            0;
            if (null != null) {
                return null;
            }
        } else {
            nArray = new int[llIllIIlIII[0]];
        }
        return nArray;
    }

    private static boolean lIlIlIIlIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIlIlIIlI(int n2) {
        return n2 <= 0;
    }

    private static void lIlIlIIlIIIIll() {
        llIllIIIllI = new String[llIllIIlIII[40]];
        z.llIllIIIllI[z.llIllIIlIII[0]] = z."Drop";
        z.llIllIIIllI[z.llIllIIlIII[2]] = z."Drop";
        z.llIllIIIllI[z.llIllIIlIII[8]] = z."Drink";
        z.llIllIIIllI[z.llIllIIlIII[9]] = z."Drop";
        z.llIllIIIllI[z.llIllIIlIII[3]] = z."Drink";
        z.llIllIIIllI[z.llIllIIlIII[10]] = z."restore";
        z.llIllIIIllI[z.llIllIIlIII[11]] = z."Prayer";
        z.llIllIIIllI[z.llIllIIlIII[12]] = z."Sanfew";
        z.llIllIIIllI[z.llIllIIlIII[4]] = z."divine";
        z.llIllIIIllI[z.llIllIIlIII[13]] = z."super";
        z.llIllIIIllI[z.llIllIIlIII[14]] = z."Drink";
        z.llIllIIIllI[z.llIllIIlIII[15]] = z."anti";
        z.llIllIIIllI[z.llIllIIlIII[16]] = z."anti";
        z.llIllIIIllI[z.llIllIIlIII[17]] = z."Drink";
        z.llIllIIIllI[z.llIllIIlIII[18]] = z."Eat";
        z.llIllIIIllI[z.llIllIIlIII[19]] = z."Wield";
        z.llIllIIIllI[z.llIllIIlIII[20]] = z."Wear";
        z.llIllIIIllI[z.llIllIIlIII[21]] = z."Equip";
    }

    /*
     * WARNING - void declaration
     */
    private Item ai() {
        void var4_4;
        Item llllllllllllllllIIlIlllIlIlIlIII;
        int llllllllllllllllIIlIlllIlIlIlIIl;
        int n2;
        z llllllllllllllllIIlIlllIlIlIllII;
        Item item2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llIllIIlIII[2]];
            stringArray[z.llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[18]];
            return item.hasAction(stringArray);
        });
        if (z.lIlIlIIlIlIIll(item2)) {
            void llllllllllllllllIIlIlllIlIlIlIll;
            return llllllllllllllllIIlIlllIlIlIlIll;
        }
        int llllllllllllllllIIlIlllIlIlIlIlI = llllllllllllllllIIlIlllIlIlIllII.j(llIllIIlIII[5]) ? 1 : 0;
        if (z.lIlIlIIlIIllll(llllllllllllllllIIlIlllIlIlIlIlI)) {
            return Inventory.getFirst(item -> {
                int n2;
                if (z.lIlIlIIlIIlllI(item.getName().toLowerCase().contains(llIllIIIllI[llIllIIlIII[16]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIlIII[2]];
                    stringArray[z.llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[17]];
                    if (z.lIlIlIIlIIllll(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIllIIlIII[2];
                        0;
                        if (((0x1C ^ 0x52) & ~(0xD1 ^ 0x9F)) == 0) return n2 != 0;
                        return ((0x56 ^ 0x6C) & ~(0x3A ^ 0)) != 0;
                    }
                }
                n2 = llIllIIlIII[0];
                return n2 != 0;
            });
        }
        if (!z.lIlIlIIlIIlllI(llllllllllllllllIIlIlllIlIlIllII.j(llIllIIlIII[6]) ? 1 : 0) || z.lIlIlIIlIIllll(llllllllllllllllIIlIlllIlIlIllII.j(llIllIIlIII[7]) ? 1 : 0)) {
            n2 = llIllIIlIII[2];
            0;
            if (-2 > 0) {
                return null;
            }
        } else {
            n2 = llIllIIlIII[0];
        }
        if (z.lIlIlIIlIIllll(llllllllllllllllIIlIlllIlIlIlIIl = n2)) {
            llllllllllllllllIIlIlllIlIlIlIII = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIllIIIllI[llIllIIlIII[15]]));
            if (z.lIlIlIIlIlIIll(llllllllllllllllIIlIlllIlIlIlIII)) {
                return llllllllllllllllIIlIlllIlIlIlIII;
            }
            Item llllllllllllllllIIlIlllIlIlIIlll = Inventory.getFirst(item -> {
                int n2;
                if (!z.lIlIlIIlIIlllI(item.getName().toLowerCase().contains(llIllIIIllI[llIllIIlIII[4]]) ? 1 : 0) || z.lIlIlIIlIIllll(item.getName().toLowerCase().contains(llIllIIIllI[llIllIIlIII[13]]) ? 1 : 0)) {
                    Item llllllllllllllllIIlIlllIlIIIllII;
                    String[] stringArray = new String[llIllIIlIII[2]];
                    stringArray[z.llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[14]];
                    if (z.lIlIlIIlIIllll(llllllllllllllllIIlIlllIlIIIllII.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIllIIlIII[2];
                        0;
                        if (-1 <= ((0xC9 ^ 0xC3) & ~(0x15 ^ 0x1F))) return n2 != 0;
                        return ((0x3A ^ 0x7B) & ~(0x71 ^ 0x30)) != 0;
                    }
                }
                n2 = llIllIIlIII[0];
                return n2 != 0;
            });
            if (z.lIlIlIIlIlIIll(llllllllllllllllIIlIlllIlIlIIlll)) {
                return llllllllllllllllIIlIlllIlIlIIlll;
            }
            Item llllllllllllllllIIlIlllIlIlIIllI = Inventory.getFirst(item -> {
                int n2;
                if (!z.lIlIlIIlIIlllI(e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !z.lIlIlIIlIIlllI(item.getName().contains(llIllIIIllI[llIllIIlIII[10]]) ? 1 : 0) || !z.lIlIlIIlIIlllI(item.getName().contains(llIllIIIllI[llIllIIlIII[11]]) ? 1 : 0) || z.lIlIlIIlIIllll(item.getName().contains(llIllIIIllI[llIllIIlIII[12]]) ? 1 : 0)) {
                    n2 = llIllIIlIII[2];
                    0;
                    if ((0x3F ^ 0x3B) == 3) {
                        return ((0x28 ^ 0x22) & ~(0x87 ^ 0x8D)) != 0;
                    }
                } else {
                    n2 = llIllIIlIII[0];
                }
                return n2 != 0;
            });
            if (z.lIlIlIIlIlIIll(llllllllllllllllIIlIlllIlIlIIllI)) {
                return llllllllllllllllIIlIlllIlIlIIllI;
            }
        }
        if (z.lIlIlIIlIlIlII(llllllllllllllllIIlIlllIlIlIlIII = (Item)Inventory.getAll(item -> {
            String[] stringArray = new String[llIllIIlIII[2]];
            stringArray[z.llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[3]];
            return item.hasAction(stringArray);
        }).stream().filter(Item::isTradable).filter(item -> {
            String[] stringArray = new String[llIllIIlIII[2]];
            stringArray[z.llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[9]];
            return item.hasAction(stringArray);
        }).min(Comparator.comparingInt(item -> Prices.getItemPrice((int)item.getId()))).orElse(null))) {
            return Inventory.getAll(item -> {
                String[] stringArray = new String[llIllIIlIII[2]];
                stringArray[z.llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[8]];
                return item.hasAction(stringArray);
            }).stream().filter(item -> {
                String[] stringArray = new String[llIllIIlIII[2]];
                stringArray[z.llIllIIlIII[0]] = llIllIIIllI[llIllIIlIII[2]];
                return item.hasAction(stringArray);
            }).min(Comparator.comparingInt(item -> Prices.getItemPrice((int)item.getId()))).orElse(null);
        }
        return var4_4;
    }

    /*
     * WARNING - void declaration
     */
    public boolean j(int n2) {
        void llllllllllllllllIIlIlllIlIIlIIlI;
        int[] nArray = Static.getClient().getMapRegions();
        int n3 = nArray.length;
        int llllllllllllllllIIlIlllIlIIlIIIl = llIllIIlIII[0];
        while (z.lIlIlIIlIlIIIl(llllllllllllllllIIlIlllIlIIlIIIl, (int)llllllllllllllllIIlIlllIlIIlIIlI)) {
            void llllllllllllllllIIlIlllIlIIlIlII;
            void llllllllllllllllIIlIlllIlIIlIIll;
            void llllllllllllllllIIlIlllIlIIlIIII = llllllllllllllllIIlIlllIlIIlIIll[llllllllllllllllIIlIlllIlIIlIIIl];
            if (z.lIlIlIIlIlIIII((int)llllllllllllllllIIlIlllIlIIlIIII, (int)llllllllllllllllIIlIlllIlIIlIlII)) {
                return llIllIIlIII[2];
            }
            ++llllllllllllllllIIlIlllIlIIlIIIl;
            0;
            if (-(0x4F ^ 0x4A) < 0) continue;
            return ((0x57 ^ 7) & ~(0xD9 ^ 0x89)) != 0;
        }
        return llIllIIlIII[0];
    }
}

