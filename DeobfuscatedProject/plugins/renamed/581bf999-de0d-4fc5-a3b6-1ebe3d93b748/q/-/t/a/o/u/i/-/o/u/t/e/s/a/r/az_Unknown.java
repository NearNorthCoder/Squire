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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

public abstract class az_Unknown
extends ao_Unknown {
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
        az.llIlIIlIIll[az.llIlIIllIlI[2]] = az."Barrier";
        az.llIlIIlIIll[az.llIlIIllIlI[1]] = az."Quick-Pass";
        az.llIlIIlIIll[az.llIlIIllIlI[6]] = az."Take-pickaxe";
        az.llIlIIlIIll[az.llIlIIllIlI[7]] = az."Deposit-pickaxe";
        az.llIlIIlIIll[az.llIlIIllIlI[8]] = az."Eat";
        az.llIlIIlIIll[az.llIlIIllIlI[9]] = az."Take";
        az.llIlIIlIIll[az.llIlIIllIlI[10]] = az."Entry";
        az.llIlIIlIIll[az.llIlIIllIlI[11]] = az."Quick-Enter";
        az.llIlIIlIIll[az.llIlIIllIlI[12]] = az."Vial";
        az.llIlIIlIIll[az.llIlIIllIlI[13]] = az."Eat";
    }

    private static void lIlIIlIlllIlIl() {
        llIlIIllIlI = new int[18];
        az.llIlIIllIlI[0] = 0xFFFFBFD2 & 0x797F;
        az.llIlIIllIlI[1] = 1;
        az.llIlIIllIlI[2] = (0x3F ^ 0x6F ^ (0xCE ^ 0xC1)) & (0x23 ^ 0x76 ^ (0x3E ^ 0x34) ^ -1);
        az.llIlIIllIlI[3] = -(0xFFFFDEED & 0x6F57) & (0xFFFFFFF5 & 0xFFFF);
        az.llIlIIllIlI[4] = -(0xFFFF8B76 & 0x76DB) & (0xFFFFFBFF & 0xB7FF);
        az.llIlIIllIlI[5] = -(0xFFFFC7DA & 0x78B7) & (0xFFFFFBFB & 0x7CFD);
        az.llIlIIllIlI[6] = 2;
        az.llIlIIllIlI[7] = 3;
        az.llIlIIllIlI[8] = 0x40 ^ 0x46 ^ 2;
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
            TileObject var4 = TileObjects.getNearest((String[])stringArray);
            if (az.lIlIIlIlllIllI(var4)) {
                var4.interact(llIlIIlIIll[llIlIIllIlI[1]]);
                return llIlIIllIlI[1];
            }
            return llIlIIllIlI[2];
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (az.lIlIIlIllllIlI(tileObject.getId(), llIlIIllIlI[14]) && az.lIlIIlIllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llIlIIllIlI[1];
                0;
                if (-1 > 0) {
                    return false;
                }
            } else {
                n2 = llIlIIllIlI[2];
            }
            return n2 != 0;
        });
        if (az.lIlIIlIllllIIl(var4)) {
            return llIlIIllIlI[2];
        }
        var2_3.interact(llIlIIlIIll[llIlIIllIlI[6]]);
        return llIlIIllIlI[1];
    }

    private static String lIlIIlIlIlIllI(String var13, String var22) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(llIlIIllIlI[6], var19);
            return new String(var17.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
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
        Item var23;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (az.lIlIIlIllllIlI(tileObject.getId(), llIlIIllIlI[14]) && az.lIlIIlIllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llIlIIllIlI[1];
                0;
                
                }
            } else {
                n2 = llIlIIllIlI[2];
            }
            return n2 != 0;
        });
        if (az.lIlIIlIllllIIl(tileObject2)) {
            return llIlIIllIlI[2];
        }
        int var6 = Vars.getBit((int)llIlIIllIlI[5]);
        if (az.lIlIIlIlllIlll(var6)) {
            void var15;
            var15.interact(llIlIIlIIll[llIlIIllIlI[7]]);
            return llIlIIllIlI[1];
        }
        if (az.lIlIIlIllllIII(Inventory.isFull() ? 1 : 0)) {
            var23 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIlIIllIlI[1]];
                stringArray[az.llIlIIllIlI[2]] = llIlIIlIIll[llIlIIllIlI[13]];
                return item.hasAction(stringArray);
            });
            if (az.lIlIIlIlllIllI(var23)) {
                var23.interact(llIlIIlIIll[llIlIIllIlI[8]]);
                return llIlIIllIlI[1];
            }
            0;
            if (1 == 0) {
                return ((0xE3 ^ 0x90 ^ (0x6A ^ 0x5E)) & (0x7C ^ 0x68 ^ (0x2C ^ 0x7F) ^ -1)) != 0;
            }
        } else {
            var23 = TileItems.getAll(Reachable::isInteractable).stream().filter(tileItem -> {
                boolean bl2;
                if (az.lIlIIlIlllIlll(tileItem.getName().equals(llIlIIlIIll[llIlIIllIlI[12]]) ? 1 : 0)) {
                    bl2 = llIlIIllIlI[1];
                    0;
                    if (((150 + 165 - 280 + 138 ^ 89 + 34 - 74 + 110) & (0xD6 ^ 0xC7 ^ (0x3B ^ 0x18) ^ -1)) >= 1) {
                        return ((93 + 108 - 187 + 144 ^ 57 + 146 - 85 + 57) & (0xE5 ^ 0x9C ^ (0x1A ^ 0x52) ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIIllIlI[2];
                }
                return bl2;
            }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()))).orElse(null);
            if (az.lIlIIlIlllIllI(var23)) {
                var23.interact(llIlIIlIIll[llIlIIllIlI[9]]);
                return llIlIIllIlI[1];
            }
        }
        String[] stringArray = new String[llIlIIllIlI[1]];
        stringArray[az.llIlIIllIlI[2]] = llIlIIlIIll[llIlIIllIlI[10]];
        var23 = TileObjects.getNearest((String[])stringArray);
        if (az.lIlIIlIlllIllI(var23)) {
            var23.interact(llIlIIlIIll[llIlIIllIlI[11]]);
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
        void var8;
        NPC nPC = NPCs.getNearest((int[])dw);
        int[] nArray = new int[llIlIIllIlI[1]];
        nArray[az.llIlIIllIlI[2]] = llIlIIllIlI[4];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (az.lIlIIlIlllIllI(nPC) && az.lIlIIlIlllIlll(nPC.isDead() ? 1 : 0) && !az.lIlIIlIlllIlll(Reachable.isInteractable((Locatable)nPC) ? 1 : 0) || az.lIlIIlIlllIllI(var8) && az.lIlIIlIllllIII(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
            n2 = llIlIIllIlI[1];
            0;
            if (1 >= 3) {
                return false;
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

    private static String lIlIIlIlIllIII(String var16, String var7) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), llIlIIllIlI[12]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(llIlIIllIlI[6], var10);
            return new String(var18.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
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
            0;
            if (3 != 3) {
                return ((86 + 120 - 163 + 133 ^ 32 + 130 - 114 + 101) & (0x64 ^ 0x27 ^ (0x75 ^ 0x13) ^ -1)) != 0;
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

    private static String lIlIIlIlIlIlll(String var21, String var12) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var24 = var12.toCharArray();
        int var14 = llIlIIllIlI[2];
        char[] var11 = var21.toCharArray();
        int var20 = var11.length;
        int var9 = llIlIIllIlI[2];
        while (az.lIlIIlIllllIll(var9, var20)) {
            char var5 = var11[var9];
            var3.append((char)(var5 ^ var24[var14 % var24.length]));
            0;
            ++var14;
            ++var9;
            0;
            if (1 > ((0x56 ^ 0x5A) & ~(0x28 ^ 0x24))) continue;
            return null;
        }
        return String.valueOf(var3);
    }
}

