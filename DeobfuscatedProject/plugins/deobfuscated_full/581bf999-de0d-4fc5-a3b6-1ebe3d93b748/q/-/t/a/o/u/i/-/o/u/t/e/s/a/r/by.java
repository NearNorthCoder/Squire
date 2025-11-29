/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class by
extends ao {
    private static /* synthetic */ int[] lIllIllIIII;
    private static final /* synthetic */ int fJ;
    private static final /* synthetic */ int fK;
    private static final /* synthetic */ int fL;
    private static final /* synthetic */ int fI;
    private static /* synthetic */ String[] lIllIlIlIII;
    protected static final /* synthetic */ List<Integer> fH;

    private static boolean lIIlIlllIlllll(int n2) {
        return n2 != 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.obeliskGear();
    }

    private static String lIIlIlllIIIIll(String var11, String var7) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIllIllIIII[5], var12);
            return new String(var5.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIIIllI() {
        lIllIlIlIII = new String[lIllIllIIII[18]];
        by.lIllIlIlIII[by.lIllIllIIII[3]] = by."Core";
        by.lIllIlIlIII[by.lIllIllIIII[2]] = by."Osmumten";
        by.lIllIlIlIII[by.lIllIllIIII[5]] = by."Osmumten";
        by.lIllIlIlIII[by.lIllIllIIII[6]] = by."Teleport crystal";
        by.lIllIlIlIII[by.lIllIllIIII[7]] = by."Yes";
        by.lIllIlIlIII[by.lIllIllIIII[8]] = by."Use";
        by.lIllIlIlIII[by.lIllIllIIII[9]] = by."Begin";
        by.lIllIlIlIII[by.lIllIllIIII[10]] = by."Begin";
        by.lIllIlIlIII[by.lIllIllIIII[11]] = by."Talk-to";
        by.lIllIlIlIII[by.lIllIllIIII[12]] = by."Warden";
        by.lIllIlIlIII[by.lIllIllIIII[13]] = by."Attack";
    }

    private static void lIIlIlllIllllI() {
        lIllIllIIII = new int[19];
        by.lIllIllIIII[0] = 0xFFFFBBF0 & 0x7F5F;
        by.lIllIllIIII[1] = -(0xFFFFDFDE & 0x66AF) & (0xFFFFFFDF & 0x7FFD);
        by.lIllIllIIII[2] = 1;
        by.lIllIllIIII[3] = (0x7B ^ 0x27) & ~(4 ^ 0x58);
        by.lIllIllIIII[4] = -(0xFFFFD17D & 0x6EB3) & (0xFFFFFFFE & 0xEFBF);
        by.lIllIllIIII[5] = 2;
        by.lIllIllIIII[6] = 3;
        by.lIllIllIIII[7] = 0x46 ^ 0x42;
        by.lIllIllIIII[8] = 0x71 ^ 0x55 ^ (0x18 ^ 0x39);
        by.lIllIllIIII[9] = 0x12 ^ 0x5F ^ (0xF3 ^ 0xB8);
        by.lIllIllIIII[10] = 0x88 ^ 0xB7 ^ (0x37 ^ 0xF);
        by.lIllIllIIII[11] = 0x85 ^ 0x8D;
        by.lIllIllIIII[12] = 0xD3 ^ 0xB4 ^ (0xEB ^ 0x85);
        by.lIllIllIIII[13] = 0x4F ^ 0x7A ^ (0x7E ^ 0x41);
        by.lIllIllIIII[14] = -(0xFFFFDCB9 & 0x7B67) & (0xFFFFFFEE & 0x7DF7);
        by.lIllIllIIII[15] = 0xFFFFBFBB & 0x6DEE;
        by.lIllIllIIII[16] = -(0xFFFFAE6B & 0x5D9E) & (0xFFFFFFBF & 0xBEFF);
        by.lIllIllIIII[17] = 0xFFFFBAF7 & 0xF7BF;
        by.lIllIllIIII[18] = 0x6D ^ 0x66;
    }

    @Inject
    protected by(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIlIllllIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIllllIIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bk() {
        boolean bl2;
        String[] stringArray = new String[lIllIllIIII[2]];
        stringArray[by.lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[2]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (by.lIIlIllllIIIIl(nPC)) {
            bl2 = lIllIllIIII[2];
            0;
            if (-(0xD6 ^ 0x97 ^ (0x7E ^ 0x3B)) >= 0) {
                return ((0x15 ^ 0x31 ^ (0xA5 ^ 0x95)) & (8 ^ 0x56 ^ (0xE9 ^ 0xA3) ^ -1)) != 0;
            }
        } else {
            bl2 = lIllIllIIII[3];
        }
        return bl2;
    }

    @Override
    protected boolean aS() {
        int n2;
        String[] stringArray = new String[lIllIllIIII[2]];
        stringArray[by.lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[3]];
        if (by.lIIlIllllIIIIl(NPCs.getNearest((String[])stringArray)) && by.lIIlIllllIIIIl(NPCs.getNearest(nPC -> {
            int n2;
            if (by.lIIlIlllIlllll(nPC.getName().contains(lIllIlIlIII[lIllIllIIII[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIIII[2]];
                stringArray[by.lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[13]];
                if (!by.lIIlIllllIIIlI(nPC.hasAction(stringArray) ? 1 : 0) || by.lIIlIllllIIIll(nPC.getAnimation(), lIllIllIIII[14])) {
                    n2 = lIllIllIIII[2];
                    0;
                    if (1 == 1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIllIIII[3];
            return n2 != 0;
        }))) {
            n2 = lIllIllIIII[2];
            0;
            if (-3 > 0) {
                return ((2 ^ (0x6D ^ 0x31)) & (0xBE ^ 0xAE ^ (0x39 ^ 0x77) ^ -1)) != 0;
            }
        } else {
            n2 = lIllIllIIII[3];
        }
        return n2 != 0;
    }

    private static boolean lIIlIllllIIIII(Object object) {
        return object != null;
    }

    static {
        by.lIIlIlllIllllI();
        by.lIIlIlllIIIllI();
        fI = lIllIllIIII[0];
        fL = lIllIllIIII[1];
        fJ = lIllIllIIII[15];
        fK = lIllIllIIII[4];
        fH = List.of(Integer.valueOf(lIllIllIIII[16]), Integer.valueOf(lIllIllIIII[17]));
    }

    private static boolean lIIlIllllIIIll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        if (by.lIIlIlllIlllll(this.cw.j(lIllIllIIII[1]) ? 1 : 0)) {
            return lIllIllIIII[2];
        }
        int[] nArray = new int[lIllIllIIII[2]];
        nArray[by.lIllIllIIII[3]] = lIllIllIIII[4];
        if (by.lIIlIllllIIIII(TileObjects.getNearest((int[])nArray))) {
            bl2 = lIllIllIIII[2];
            0;
            if (-1 > -1) {
                return ((119 + 218 - 285 + 175 ^ 7 + 78 - 50 + 144) & (0xA5 ^ 0xAE ^ (0xC9 ^ 0x92) ^ -1)) != 0;
            }
        } else {
            bl2 = lIllIllIIII[3];
        }
        return bl2;
    }

    private static String lIIlIlllIIIlII(String var16, String var2) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIllIllIIII[11]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(lIllIllIIII[5], var8);
            return new String(var20.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Override
    public int bi() {
        return lIllIllIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bm() {
        void var17;
        String[] stringArray = new String[lIllIllIIII[2]];
        stringArray[by.lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[5]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (by.lIIlIllllIIIlI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            void var10;
            String[] stringArray2 = new String[lIllIllIIII[2]];
            stringArray2[by.lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[6]];
            TileObject tileObject = TileObjects.getNearest((String[])stringArray2);
            if (by.lIIlIllllIIIIl(tileObject)) {
                return lIllIllIIII[3];
            }
            if (by.lIIlIlllIlllll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIllIllIIII[2];
            }
            if (by.lIIlIlllIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
                String[] stringArray3 = new String[lIllIllIIII[2]];
                stringArray3[by.lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[7]];
                Dialog.chooseOption((String[])stringArray3);
                0;
                return lIllIllIIII[2];
            }
            var10.interact(lIllIlIlIII[lIllIllIIII[8]]);
            return lIllIllIIII[2];
        }
        if (by.lIIlIlllIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIllIllIIII[2];
        }
        String[] stringArray4 = new String[lIllIllIIII[2]];
        stringArray4[by.lIllIllIIII[3]] = lIllIlIlIII[lIllIllIIII[9]];
        if (by.lIIlIlllIlllll(var17.hasAction(stringArray4) ? 1 : 0)) {
            var17.interact(lIllIlIlIII[lIllIllIIII[10]]);
            return lIllIllIIII[2];
        }
        nPC.interact(lIllIlIlIII[lIllIllIIII[11]]);
        return lIllIllIIII[2];
    }

    private static boolean lIIlIllllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIlllIIIlIl(String var1, String var21) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var15 = var21.toCharArray();
        int var14 = lIllIllIIII[3];
        char[] var9 = var1.toCharArray();
        int var18 = var9.length;
        int var19 = lIllIllIIII[3];
        while (by.lIIlIllllIIlII(var19, var18)) {
            char var4 = var9[var19];
            var3.append((char)(var4 ^ var15[var14 % var15.length]));
            0;
            ++var14;
            ++var19;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }
}

