/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

/* TASK: Looting chest room -> LootingchestroomTask */
@TaskDesc(name="Looting chest room", priority=1000, blocking=true)
public class aY
extends ao {
    private static final /* synthetic */ int ey;
    private /* synthetic */ boolean eA;
    private static /* synthetic */ int[] llIlIllIIlI;
    private static final /* synthetic */ int ez;
    private static final /* synthetic */ int ew;
    private static /* synthetic */ String[] llIlIllIIIl;
    private static final /* synthetic */ int ex;

    @Override
    public boolean bj() {
        int n2;
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[17])) {
                String[] stringArray = new String[llIlIllIIlI[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[19]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIllIIlI[1];
                    0;
                    if (-1 == -1) return n2 != 0;
                    return (2 & ~2) != 0;
                }
            }
            n2 = llIlIllIIlI[2];
            return n2 != 0;
        })) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(this.eA ? 1 : 0)) {
            n2 = llIlIllIIlI[1];
            0;
            if (2 < 1) {
                return ((14 + 59 - -69 + 29 ^ 58 + 63 - 6 + 58) & (0 ^ 0x3E ^ (0x55 ^ 0x6D) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIllIIlI[2];
        }
        return n2 != 0;
    }

    @Override
    public void r() {
        this.eA = llIlIllIIlI[2];
    }

    @Inject
    protected aY(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        Widget widget = Widgets.get((int)llIlIllIIlI[4], (int)llIlIllIIlI[5]);
        ItemContainer itemContainer = this.cu.getItemContainer(InventoryID.TOA_REWARD_CHEST);
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(Widgets.isVisible((Widget)widget) ? 1 : 0) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllII(itemContainer)) {
            void var7;
            int var25;
            void var14;
            int n2 = llIlIllIIlI[1];
            Item[] itemArray = itemContainer.getItems();
            int n3 = itemArray.length;
            int var8 = llIlIllIIlI[2];
            while (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllIl(var8, (int)var14)) {
                void var23;
                void var18 = var23[var8];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlllI(var18.getId(), llIlIllIIlI[1])) {
                    0;
                    if (3 <= 1) {
                        return false;
                    }
                } else {
                    var25 = llIlIllIIlI[2];
                }
                ++var8;
                0;
                if (2 < 3) continue;
                return false;
            }
            llllllllllllllllIIllIIIlllllIIIl.eA = var25;
            var7.interact(llIlIllIIIl[llIlIllIIlI[2]]);
            return llIlIllIIlI[1];
        }
        TileObject var25 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[17])) {
                String[] stringArray = new String[llIlIllIIlI[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[18]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIllIIlI[1];
                    0;
                    if (((132 + 143 - 178 + 54 ^ 14 + 177 - 135 + 137) & (0x52 ^ 0x3A ^ (0x36 ^ 8) ^ -1)) == 0) return n2 != 0;
                    return ((0xAC ^ 0xB6 ^ (0xCB ^ 0x98)) & (0x7D ^ 0x48 ^ (0x2C ^ 0x50) ^ -1)) != 0;
                }
            }
            n2 = llIlIllIIlI[2];
            return n2 != 0;
        });
        TileObject var23 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(List.of(Integer.valueOf(llIlIllIIlI[13]), Integer.valueOf(llIlIllIIlI[14]), Integer.valueOf(llIlIllIIlI[15])).contains(tileObject.getId()) ? 1 : 0)) {
                String[] stringArray = new String[llIlIllIIlI[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[16]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIllIIlI[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x64 ^ 0x46 ^ (0x89 ^ 0xB1)) & (0x3C ^ 0x2E ^ (2 ^ 0xA) ^ -1)) != 0;
                }
            }
            n2 = llIlIllIIlI[2];
            return n2 != 0;
        });
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(var25) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(var23)) {
            TileObject var14 = TileObjects.getNearest(tileObject -> {
                boolean bl2;
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[12])) {
                    bl2 = llIlIllIIlI[1];
                    0;
                    if (1 == ((0x3E ^ 0x2C ^ (0x80 ^ 0x86)) & (29 + 106 - 72 + 106 ^ 80 + 166 - 146 + 89 ^ -1))) {
                        return ((0x5D ^ 0x55 ^ (0x80 ^ 0xAD)) & (183 + 112 - 272 + 202 ^ 86 + 14 - 92 + 188 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIllIIlI[2];
                }
                return bl2;
            });
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(var14) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(var14 = TileObjects.getNearest(tileObject -> tileObject.getName().toLowerCase().contains(llIlIllIIIl[llIlIllIIlI[11]])))) {
                return llIlIllIIlI[2];
            }
            String[] stringArray = new String[llIlIllIIlI[6]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[1]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[1]] = llIlIllIIIl[llIlIllIIlI[6]];
            var14.interact(stringArray);
            return llIlIllIIlI[1];
        }
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllII(var25)) {
            var25.interact(llIlIllIIIl[llIlIllIIlI[7]]);
            0;
            if (((0x1C ^ 6 ^ (0x6B ^ 0x3A)) & (0xB ^ 0x15 ^ (0x2F ^ 0x7A) ^ -1)) > 0) {
                return ((79 + 94 - 29 + 52 ^ 108 + 35 - 104 + 153) & (0x53 ^ 0x1F ^ (0x11 ^ 0x59) ^ -1)) != 0;
            }
        } else {
            var23.interact(llIlIllIIIl[llIlIllIIlI[5]]);
        }
        return llIlIllIIlI[1];
    }

    private static String lIlIIllllIIlIl(String var24, String var16) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), llIlIllIIlI[11]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(llIlIllIIlI[6], var11);
            return new String(var3.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllllIllII(Object object) {
        return object != null;
    }

    @Override
    public boolean bk() {
        boolean bl2;
        int[] nArray = new int[llIlIllIIlI[1]];
        nArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIlI[3];
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllII(TileObjects.getNearest((int[])nArray))) {
            bl2 = llIlIllIIlI[1];
            0;
            if (-1 == 3) {
                return ((0x94 ^ 0x8F ^ (0xAA ^ 0x82)) & (0x18 ^ 0x79 ^ (0x73 ^ 0x21) ^ -1)) != 0;
            }
        } else {
            bl2 = llIlIllIIlI[2];
        }
        return bl2;
    }

    private static String lIlIIllllIIlll(String var10, String var19) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIlIllIIlI[6], var22);
            return new String(var9.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[llIlIllIIlI[1]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[8]];
            Dialog.chooseOption((String[])stringArray);
            0;
            this.sleep(llIlIllIIlI[8]);
            return llIlIllIIlI[1];
        }
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIlIllIIlI[1];
        }
        String[] stringArray = new String[llIlIllIIlI[1]];
        stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[9]];
        NPC var4 = NPCs.getNearest((String[])stringArray);
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(var4)) {
            return llIlIllIIlI[2];
        }
        var1_1.interact(llIlIllIIIl[llIlIllIIlI[10]]);
        return llIlIllIIlI[1];
    }

    static {
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIIl();
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIII();
        ez = llIlIllIIlI[12];
        ey = llIlIllIIlI[5];
        ex = llIlIllIIlI[4];
        ew = llIlIllIIlI[3];
    }

    private static String lIlIIllllIIllI(String var13, String var2) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var1 = var2.toCharArray();
        int var6 = llIlIllIIlI[2];
        char[] var15 = var13.toCharArray();
        int var20 = var15.length;
        int var12 = llIlIllIIlI[2];
        while (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllIl(var12, var20)) {
            char var21 = var15[var12];
            var5.append((char)(var21 ^ var1[var6 % var1.length]));
            0;
            ++var6;
            ++var12;
            0;
            if (((0x3D ^ 0x1D) & ~(0xB2 ^ 0x92)) == 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static void lIlIIllllIlIII() {
        llIlIllIIIl = new String[llIlIllIIlI[20]];
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Bank-all";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[1]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Open";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[6]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Search";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[7]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Open";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[5]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Search";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[8]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Yes";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[9]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Osmumten";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[10]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Leave";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[11]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."sarcophagus";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[16]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Search";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[18]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Open";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[19]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY."Open";
    }

    private static boolean lIlIIllllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllllIlIll(int n2) {
        return n2 != 0;
    }

    private static void lIlIIllllIlIIl() {
        llIlIllIIlI = new int[21];
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[0] = -(0xFFFFFE2C & 0x47FB) & (0xFFFFFF7F & 0x7FF7);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[1] = 1;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2] = (187 + 117 - 171 + 70 ^ 119 + 35 - 145 + 127) & (116 + 36 - 49 + 31 ^ 190 + 146 - 144 + 5 ^ -1);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[3] = 0xFFFFBFEF & 0xEF9E;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[4] = 0xFFFF9793 & 0x6B6F;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[5] = 0xAD ^ 0xA9;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[6] = 2;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[7] = 3;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[8] = 1 ^ 0x15 ^ (0x82 ^ 0x93);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[9] = 0x4B ^ 0x4D;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[10] = 0xEF ^ 0x94 ^ (0xC6 ^ 0xBA);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[11] = 0x85 ^ 0x8D;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[12] = 0xFFFFB4EF & 0xFF9C;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[13] = -1 & (0xFFFFBFFF & 0xEEF3);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[14] = -1 & (0xFFFFFEF7 & 0xAFFC);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[15] = -(0xFFFFDD5D & 0x62A3) & (0xFFFFFFFD & 0xEEF7);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[16] = 127 + 75 - 131 + 114 ^ 131 + 114 - 181 + 112;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[17] = 0xFFFFFF2F & 0x75FA;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[18] = 58 + 106 - 26 + 63 ^ 105 + 62 - 44 + 72;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[19] = 33 + 69 - -13 + 27 ^ 44 + 102 - 87 + 74;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[20] = 56 + 19 - 29 + 157 ^ 30 + 16 - -4 + 149;
    }

    private static boolean lIlIIllllIlIlI(Object object) {
        return object == null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean lIlIIllllIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int bi() {
        return llIlIllIIlI[0];
    }

    private static boolean lIlIIllllIlllI(int n2, int n3) {
        return n2 <= n3;
    }
}

