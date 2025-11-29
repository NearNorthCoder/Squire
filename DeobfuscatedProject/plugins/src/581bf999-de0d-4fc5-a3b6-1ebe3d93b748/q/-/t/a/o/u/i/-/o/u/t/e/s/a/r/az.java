/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class az
extends ao {
    private static /* synthetic */ String[] llIlIIlIIll;
    private static /* synthetic */ int[] llIlIIllIlI;
    private static final /* synthetic */ int dx;
    private static final /* synthetic */ int dv;
    private static final /* synthetic */ int du;
    protected static final /* synthetic */ int dt;
    protected static final /* synthetic */ int ds;
    private static final /* synthetic */ int[] dw;

    protected az(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void lIlIIlIlIllIIl() {
        llIlIIlIIll = new String[llIlIIllIlI[17]];
        az.llIlIIlIIll[az.llIlIIllIlI[2]] = az.lIlIIlIlIlIllI("tr7Fq3R1Coc=", "dqYzU");
        az.llIlIIlIIll[az.llIlIIllIlI[1]] = az.lIlIIlIlIlIllI("lUKFRcWcJNQ5Vj+gu5VDtA==", "GrAFZ");
        az.llIlIIlIIll[az.llIlIIllIlI[6]] = az.lIlIIlIlIlIlll("PDsvFWoYMycbJhA/", "hZDpG");
        az.llIlIIlIIll[az.llIlIIllIlI[7]] = az.lIlIIlIlIlIlll("Nj8bKhsbLkY1ARExCj0N", "rZkEh");
        az.llIlIIlIIll[az.llIlIIllIlI[8]] = az.lIlIIlIlIlIllI("1zWFTRG2ZUM=", "nAmMN");
        az.llIlIIlIIll[az.llIlIIllIlI[9]] = az.lIlIIlIlIllIII("EKB3huaQ+iE=", "kNRkQ");
        az.llIlIIlIIll[az.llIlIIllIlI[10]] = az.lIlIIlIlIllIII("bSjUiT+K8M8=", "VZnJr");
        az.llIlIIlIIll[az.llIlIIllIlI[11]] = az.lIlIIlIlIllIII("NLvNR1Ft3c7WtmMUgRMI2Q==", "fANUK");
        az.llIlIIlIIll[az.llIlIIllIlI[12]] = az.lIlIIlIlIllIII("M+olUfUDLl8=", "JSWBc");
        az.llIlIIlIIll[az.llIlIIllIlI[13]] = az.lIlIIlIlIllIII("jC0CMJ1nPWw=", "NWaCv");
    }

    private static void lIlIIlIlllIlIl() {
        llIlIIllIlI = new int[18];
        az.llIlIIllIlI[0] = 0xFFFFBFD2 & 0x797F;
        az.llIlIIllIlI[1] = " ".length();
        az.llIlIIllIlI[2] = (0x3F ^ 0x6F ^ (0xCE ^ 0xC1)) & (0x23 ^ 0x76 ^ (0x3E ^ 0x34) ^ -" ".length());
        az.llIlIIllIlI[3] = -(0xFFFFDEED & 0x6F57) & (0xFFFFFFF5 & 0xFFFF);
        az.llIlIIllIlI[4] = -(0xFFFF8B76 & 0x76DB) & (0xFFFFFBFF & 0xB7FF);
        az.llIlIIllIlI[5] = -(0xFFFFC7DA & 0x78B7) & (0xFFFFFBFB & 0x7CFD);
        az.llIlIIllIlI[6] = "  ".length();
        az.llIlIIllIlI[7] = "   ".length();
        az.llIlIIllIlI[8] = 0x40 ^ 0x46 ^ "  ".length();
        az.llIlIIllIlI[9] = 0x31 ^ 0x67 ^ (0xD9 ^ 0x8A);
        az.llIlIIllIlI[10] = 0x74 ^ 0x72;
        az.llIlIIllIlI[11] = 2 + 42 - 37 + 144 ^ 64 + 6 - -61 + 13;
        az.llIlIIllIlI[12] = 8 ^ 0;
        az.llIlIIllIlI[13] = 0xBF ^ 0xB6;
        az.llIlIIllIlI[14] = -(0x33 ^ 0x77) & (0xFFFFF1DF & 0xBFFF);
        az.llIlIIllIlI[15] = -(0xFFFFBF4D & 0x50B3) & (0xFFFFBFBB & 0x7DFE);
        az.llIlIIllIlI[16] = -(0xFFFFD46F & 0x6BD1) & (0xFFFFFFFF & 0x6DFB);
        az.llIlIIllIlI[17] = 0x7A ^ 0x70;
    }

    private static boolean lIlIIlIllllIII(int n2) {
        return n2 != 0;
    }

    @Override
    public int bi() {
        return llIlIIllIlI[0];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bm() {
        void var2_3;
        int n2 = Vars.getBit((int)llIlIIllIlI[5]);
        if (!az.lIlIIlIllllIII(n2) || az.lIlIIlIllllIII(Inventory.isFull() ? 1 : 0)) {
            String[] stringArray = new String[llIlIIllIlI[1]];
            stringArray[az.llIlIIllIlI[2]] = llIlIIlIIll[llIlIIllIlI[2]];
            TileObject llllllllllllllllIIllIllIIIIlIllI = TileObjects.getNearest((String[])stringArray);
            if (az.lIlIIlIlllIllI(llllllllllllllllIIllIllIIIIlIllI)) {
                llllllllllllllllIIllIllIIIIlIllI.interact(llIlIIlIIll[llIlIIllIlI[1]]);
                return llIlIIllIlI[1];
            }
            return llIlIIllIlI[2];
        }
        TileObject llllllllllllllllIIllIllIIIIlIllI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (az.lIlIIlIllllIlI(tileObject.getId(), llIlIIllIlI[14]) && az.lIlIIlIllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llIlIIllIlI[1];
                "".length();
                if (-" ".length() > 0) {
                    return ((0xCD ^ 0x88) & ~(0xC ^ 0x49)) != 0;
                }
            } else {
                n2 = llIlIIllIlI[2];
            }
            return n2 != 0;
        });
        if (az.lIlIIlIllllIIl(llllllllllllllllIIllIllIIIIlIllI)) {
            return llIlIIllIlI[2];
        }
        var2_3.interact(llIlIIlIIll[llIlIIllIlI[6]]);
        return llIlIIllIlI[1];
    }

    private static String lIlIIlIlIlIllI(String llllllllllllllllIIllIllIIIIIIIlI, String llllllllllllllllIIllIlIlllllllll) {
        try {
            SecretKeySpec llllllllllllllllIIllIllIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIllIIIIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIllIIIIIIlII.init(llIlIIllIlI[6], llllllllllllllllIIllIllIIIIIIlIl);
            return new String(llllllllllllllllIIllIllIIIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIllIIIIIIIll) {
            llllllllllllllllIIllIllIIIIIIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean lIlIIlIllllIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIlllIlll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        Item llllllllllllllllIIllIllIIIIlIIII;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (az.lIlIIlIllllIlI(tileObject.getId(), llIlIIllIlI[14]) && az.lIlIIlIllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llIlIIllIlI[1];
                "".length();
                if (null != null) {
                    return ((0xFD ^ 0xA1) & ~(0x2C ^ 0x70)) != 0;
                }
            } else {
                n2 = llIlIIllIlI[2];
            }
            return n2 != 0;
        });
        if (az.lIlIIlIllllIIl(tileObject2)) {
            return llIlIIllIlI[2];
        }
        int llllllllllllllllIIllIllIIIIlIIIl = Vars.getBit((int)llIlIIllIlI[5]);
        if (az.lIlIIlIlllIlll(llllllllllllllllIIllIllIIIIlIIIl)) {
            void llllllllllllllllIIllIllIIIIlIIlI;
            llllllllllllllllIIllIllIIIIlIIlI.interact(llIlIIlIIll[llIlIIllIlI[7]]);
            return llIlIIllIlI[1];
        }
        if (az.lIlIIlIllllIII(Inventory.isFull() ? 1 : 0)) {
            llllllllllllllllIIllIllIIIIlIIII = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIlIIllIlI[1]];
                stringArray[az.llIlIIllIlI[2]] = llIlIIlIIll[llIlIIllIlI[13]];
                return item.hasAction(stringArray);
            });
            if (az.lIlIIlIlllIllI(llllllllllllllllIIllIllIIIIlIIII)) {
                llllllllllllllllIIllIllIIIIlIIII.interact(llIlIIlIIll[llIlIIllIlI[8]]);
                return llIlIIllIlI[1];
            }
            "".length();
            if (" ".length() == 0) {
                return ((0xE3 ^ 0x90 ^ (0x6A ^ 0x5E)) & (0x7C ^ 0x68 ^ (0x2C ^ 0x7F) ^ -" ".length())) != 0;
            }
        } else {
            llllllllllllllllIIllIllIIIIlIIII = TileItems.getAll(Reachable::isInteractable).stream().filter(tileItem -> {
                boolean bl2;
                if (az.lIlIIlIlllIlll(tileItem.getName().equals(llIlIIlIIll[llIlIIllIlI[12]]) ? 1 : 0)) {
                    bl2 = llIlIIllIlI[1];
                    "".length();
                    if (((150 + 165 - 280 + 138 ^ 89 + 34 - 74 + 110) & (0xD6 ^ 0xC7 ^ (0x3B ^ 0x18) ^ -" ".length())) >= " ".length()) {
                        return ((93 + 108 - 187 + 144 ^ 57 + 146 - 85 + 57) & (0xE5 ^ 0x9C ^ (0x1A ^ 0x52) ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIlIIllIlI[2];
                }
                return bl2;
            }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()))).orElse(null);
            if (az.lIlIIlIlllIllI(llllllllllllllllIIllIllIIIIlIIII)) {
                llllllllllllllllIIllIllIIIIlIIII.interact(llIlIIlIIll[llIlIIllIlI[9]]);
                return llIlIIllIlI[1];
            }
        }
        String[] stringArray = new String[llIlIIllIlI[1]];
        stringArray[az.llIlIIllIlI[2]] = llIlIIlIIll[llIlIIllIlI[10]];
        llllllllllllllllIIllIllIIIIlIIII = TileObjects.getNearest((String[])stringArray);
        if (az.lIlIIlIlllIllI(llllllllllllllllIIllIllIIIIlIIII)) {
            llllllllllllllllIIllIllIIIIlIIII.interact(llIlIIlIIll[llIlIIllIlI[11]]);
            return llIlIIllIlI[1];
        }
        return llIlIIllIlI[1];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bk() {
        int n2;
        void llllllllllllllllIIllIllIIIIllIlI;
        NPC nPC = NPCs.getNearest((int[])dw);
        int[] nArray = new int[llIlIIllIlI[1]];
        nArray[az.llIlIIllIlI[2]] = llIlIIllIlI[4];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (az.lIlIIlIlllIllI(nPC) && az.lIlIIlIlllIlll(nPC.isDead() ? 1 : 0) && !az.lIlIIlIlllIlll(Reachable.isInteractable((Locatable)nPC) ? 1 : 0) || az.lIlIIlIlllIllI(llllllllllllllllIIllIllIIIIllIlI) && az.lIlIIlIllllIII(Reachable.isInteractable((Locatable)llllllllllllllllIIllIllIIIIllIlI) ? 1 : 0)) {
            n2 = llIlIIllIlI[1];
            "".length();
            if (" ".length() >= "   ".length()) {
                return ((0x79 ^ 0x4D) & ~(0x93 ^ 0xA7)) != 0;
            }
        } else {
            n2 = llIlIIllIlI[2];
        }
        return n2 != 0;
    }

    static {
        az.lIlIIlIlllIlIl();
        az.lIlIIlIlIllIIl();
        ds = llIlIIllIlI[5];
        du = llIlIIllIlI[0];
        dt = llIlIIllIlI[14];
        dx = llIlIIllIlI[3];
        dv = llIlIIllIlI[4];
        int[] nArray = new int[llIlIIllIlI[6]];
        nArray[az.llIlIIllIlI[2]] = llIlIIllIlI[15];
        nArray[az.llIlIIllIlI[1]] = llIlIIllIlI[16];
        dw = nArray;
    }

    private static String lIlIIlIlIllIII(String llllllllllllllllIIllIlIlllllIIll, String llllllllllllllllIIllIlIlllllIlII) {
        try {
            SecretKeySpec llllllllllllllllIIllIlIllllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIlllllIlII.getBytes(StandardCharsets.UTF_8)), llIlIIllIlI[12]), "DES");
            Cipher llllllllllllllllIIllIlIlllllIlll = Cipher.getInstance("DES");
            llllllllllllllllIIllIlIlllllIlll.init(llIlIIllIlI[6], llllllllllllllllIIllIlIllllllIII);
            return new String(llllllllllllllllIIllIlIlllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlIlllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIlIlllllIllI) {
            llllllllllllllllIIllIlIlllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        int[] nArray = new int[llIlIIllIlI[1]];
        nArray[az.llIlIIllIlI[2]] = llIlIIllIlI[3];
        if (az.lIlIIlIlllIllI(TileObjects.getNearest((int[])nArray))) {
            bl2 = llIlIIllIlI[1];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((86 + 120 - 163 + 133 ^ 32 + 130 - 114 + 101) & (0x64 ^ 0x27 ^ (0x75 ^ 0x13) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIlIIllIlI[2];
        }
        return bl2;
    }

    private static boolean lIlIIlIllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIlllIllI(Object object) {
        return object != null;
    }

    private static String lIlIIlIlIlIlll(String llllllllllllllllIIllIlIllllIIIII, String llllllllllllllllIIllIlIlllIlllll) {
        llllllllllllllllIIllIlIllllIIIII = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlIllllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIlIllllIIIll = new StringBuilder();
        char[] llllllllllllllllIIllIlIllllIIIlI = llllllllllllllllIIllIlIlllIlllll.toCharArray();
        int llllllllllllllllIIllIlIllllIIIIl = llIlIIllIlI[2];
        char[] llllllllllllllllIIllIlIlllIllIll = llllllllllllllllIIllIlIllllIIIII.toCharArray();
        int llllllllllllllllIIllIlIlllIllIlI = llllllllllllllllIIllIlIlllIllIll.length;
        int llllllllllllllllIIllIlIlllIllIIl = llIlIIllIlI[2];
        while (az.lIlIIlIllllIll(llllllllllllllllIIllIlIlllIllIIl, llllllllllllllllIIllIlIlllIllIlI)) {
            char llllllllllllllllIIllIlIllllIIllI = llllllllllllllllIIllIlIlllIllIll[llllllllllllllllIIllIlIlllIllIIl];
            llllllllllllllllIIllIlIllllIIIll.append((char)(llllllllllllllllIIllIlIllllIIllI ^ llllllllllllllllIIllIlIllllIIIlI[llllllllllllllllIIllIlIllllIIIIl % llllllllllllllllIIllIlIllllIIIlI.length]));
            "".length();
            ++llllllllllllllllIIllIlIllllIIIIl;
            ++llllllllllllllllIIllIlIlllIllIIl;
            "".length();
            if (" ".length() > ((0x56 ^ 0x5A) & ~(0x28 ^ 0x24))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIlIllllIIIll);
    }
}

