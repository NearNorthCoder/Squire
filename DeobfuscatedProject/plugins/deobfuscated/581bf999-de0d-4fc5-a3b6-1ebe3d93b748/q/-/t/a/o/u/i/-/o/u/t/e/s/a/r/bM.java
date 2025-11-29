/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class bM
extends ao {
    private static final /* synthetic */ int gP;
    private static final /* synthetic */ int gN;
    private static /* synthetic */ String[] llIIlIlIIll;
    private static final /* synthetic */ int gQ;
    private static /* synthetic */ int[] llIIlIlIlll;
    private static final /* synthetic */ int gO;

    public Set<WorldPoint> cs() {
        return this.o(llIIlIlIlll[12]);
    }

    private static boolean lIlIIIIlIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void llllllllllllllllIIlllllIlIllIIlI;
        TileObject tileObject;
        block7: {
            block6: {
                String[] stringArray = new String[llIIlIlIlll[1]];
                stringArray[bM.llIIlIlIlll[2]] = llIIlIlIIll[llIIlIlIlll[2]];
                tileObject = TileObjects.getNearest((String[])stringArray);
                if (!bM.lIlIIIIlIlIlIl(tileObject)) break block6;
                String[] stringArray2 = new String[llIIlIlIlll[1]];
                stringArray2[bM.llIIlIlIlll[2]] = llIIlIlIIll[llIIlIlIlll[1]];
                if (!bM.lIlIIIIlIlIllI(tileObject.hasAction(stringArray2) ? 1 : 0)) break block7;
            }
            return llIIlIlIlll[2];
        }
        String[] stringArray = new String[llIIlIlIlll[1]];
        stringArray[bM.llIIlIlIlll[2]] = llIIlIlIIll[llIIlIlIlll[8]];
        if (bM.lIlIIIIlIlIlll(llllllllllllllllIIlllllIlIllIIlI.hasAction(stringArray) ? 1 : 0)) {
            return llIIlIlIlll[2];
        }
        if (bM.lIlIIIIlIlIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIIlIlIlll[1];
        }
        if (bM.lIlIIIIlIlIlll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray3 = new String[llIIlIlIlll[1]];
            stringArray3[bM.llIIlIlIlll[2]] = llIIlIlIIll[llIIlIlIlll[9]];
            Dialog.chooseOption((String[])stringArray3);
            0;
            return llIIlIlIlll[1];
        }
        tileObject.interact(llIIlIlIIll[llIIlIlIlll[10]]);
        return llIIlIlIlll[2];
    }

    static {
        bM.lIlIIIIlIlIIII();
        bM.lIlIIIIlIIllll();
        gP = llIIlIlIlll[11];
        gN = llIIlIlIlll[13];
        gO = llIIlIlIlll[0];
        gQ = llIIlIlIlll[3];
    }

    private static boolean lIlIIIIlIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIlIlIIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIIlIlIllI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bj() {
        int n2;
        int[] nArray = new int[llIIlIlIlll[1]];
        nArray[bM.llIIlIlIlll[2]] = llIIlIlIlll[3];
        if (bM.lIlIIIIlIlIIIl(TileObjects.getNearest((int[])nArray)) && bM.lIlIIIIlIlIIlI(this.aX())) {
            n2 = llIIlIlIlll[1];
            0;
            if (((0x84 ^ 0x89) & ~(0x62 ^ 0x6F)) != 0) {
                return ((0x68 ^ 0x59) & ~(0x78 ^ 0x49)) != 0;
            }
        } else {
            n2 = llIIlIlIlll[2];
        }
        return n2 != 0;
    }

    public boolean cq() {
        int n2;
        NPC nPC = this.co();
        if (bM.lIlIIIIlIlIlIl(nPC) && bM.lIlIIIIlIlIlII(nPC.getAnimation(), llIIlIlIlll[11])) {
            n2 = llIIlIlIlll[1];
            0;
            if (-1 != -1) {
                return ((0x1F ^ 0x54) & ~(0x25 ^ 0x6E)) != 0;
            }
        } else {
            n2 = llIIlIlIlll[2];
        }
        return n2 != 0;
    }

    public NPC co() {
        int[] nArray = new int[llIIlIlIlll[10]];
        nArray[bM.llIIlIlIlll[2]] = llIIlIlIlll[4];
        nArray[bM.llIIlIlIlll[1]] = llIIlIlIlll[5];
        nArray[bM.llIIlIlIlll[8]] = llIIlIlIlll[6];
        nArray[bM.llIIlIlIlll[9]] = llIIlIlIlll[7];
        return NPCs.getNearest((int[])nArray);
    }

    private static void lIlIIIIlIIllll() {
        llIIlIlIIll = new String[llIIlIlIlll[14]];
        bM.llIIlIlIIll[bM.llIIlIlIlll[2]] = bM."Teleport crystal";
        bM.llIIlIlIIll[bM.llIIlIlIlll[1]] = bM."Use";
        bM.llIIlIlIIll[bM.llIIlIlIlll[8]] = bM."Quick-use";
        bM.llIIlIlIIll[bM.llIIlIlIlll[9]] = bM."Yes";
        bM.llIIlIlIIll[bM.llIIlIlIlll[10]] = bM."Use";
    }

    private static boolean lIlIIIIlIlIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIlIlIIlI(int n2) {
        return n2 <= 0;
    }

    public Set<WorldPoint> o(int n2) {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        this.cu.getGraphicsObjects().forEach(graphicsObject -> {
            if (bM.lIlIIIIlIlIlII(graphicsObject.getId(), llIIlIlIlll[13]) && bM.lIlIIIIlIllIII(graphicsObject.getFrame(), n2)) {
                hashSet.add(WorldPoint.fromLocal((Client)this.cu, (LocalPoint)graphicsObject.getLocation()));
                0;
            }
        });
        return hashSet;
    }

    private static boolean lIlIIIIlIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIIlIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIIIIIlllIII(String llllllllllllllllIIlllllIlIIIIIlI, String llllllllllllllllIIlllllIlIIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlllllIlIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllllIlIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllllIlIIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllllIlIIIIllI.init(llIIlIlIlll[8], llllllllllllllllIIlllllIlIIIIlll);
            return new String(llllllllllllllllIIlllllIlIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllllIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllllIlIIIIlIl) {
            llllllllllllllllIIlllllIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.finalWardenGear();
    }

    @Override
    public boolean bk() {
        int n2;
        int n3 = this.aX();
        if (!bM.lIlIIIIlIlIIll(n3, llIIlIlIlll[4]) || !bM.lIlIIIIlIlIIll(n3, llIIlIlIlll[5]) || !bM.lIlIIIIlIlIIll(n3, llIIlIlIlll[6]) || bM.lIlIIIIlIlIlII(n3, llIIlIlIlll[7])) {
            n2 = llIIlIlIlll[1];
            0;
            if (-2 > 0) {
                return ((0x61 ^ 0x4E) & ~(0x35 ^ 0x1A)) != 0;
            }
        } else {
            n2 = llIIlIlIlll[2];
        }
        return n2 != 0;
    }

    public boolean cr() {
        boolean bl2;
        if (!bM.lIlIIIIlIlIIll(this.aX(), llIIlIlIlll[6]) || bM.lIlIIIIlIlIlII(this.aX(), llIIlIlIlll[7])) {
            bl2 = llIIlIlIlll[1];
            0;
            if (((0x9A ^ 0xA5) & ~(0x85 ^ 0xBA)) >= 2) {
                return ((0x33 ^ 0x74) & ~(6 ^ 0x41)) != 0;
            }
        } else {
            bl2 = llIIlIlIlll[2];
        }
        return bl2;
    }

    private static String lIlIIIIlIIlllI(String llllllllllllllllIIlllllIlIIlIlII, String llllllllllllllllIIlllllIlIIlIIll) {
        llllllllllllllllIIlllllIlIIlIlII = new String(Base64.getDecoder().decode(llllllllllllllllIIlllllIlIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllllIlIIlIlll = new StringBuilder();
        char[] llllllllllllllllIIlllllIlIIlIllI = llllllllllllllllIIlllllIlIIlIIll.toCharArray();
        int llllllllllllllllIIlllllIlIIlIlIl = llIIlIlIlll[2];
        char[] llllllllllllllllIIlllllIlIIIllll = llllllllllllllllIIlllllIlIIlIlII.toCharArray();
        int llllllllllllllllIIlllllIlIIIlllI = llllllllllllllllIIlllllIlIIIllll.length;
        int llllllllllllllllIIlllllIlIIIllIl = llIIlIlIlll[2];
        while (bM.lIlIIIIlIllIIl(llllllllllllllllIIlllllIlIIIllIl, llllllllllllllllIIlllllIlIIIlllI)) {
            char llllllllllllllllIIlllllIlIIllIlI = llllllllllllllllIIlllllIlIIIllll[llllllllllllllllIIlllllIlIIIllIl];
            llllllllllllllllIIlllllIlIIlIlll.append((char)(llllllllllllllllIIlllllIlIIllIlI ^ llllllllllllllllIIlllllIlIIlIllI[llllllllllllllllIIlllllIlIIlIlIl % llllllllllllllllIIlllllIlIIlIllI.length]));
            0;
            ++llllllllllllllllIIlllllIlIIlIlIl;
            ++llllllllllllllllIIlllllIlIIIllIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllllIlIIlIlll);
    }

    private static boolean lIlIIIIlIllIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected bM(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.finalWardenSpec();
    }

    @Override
    public int bi() {
        return llIIlIlIlll[0];
    }

    private static void lIlIIIIlIlIIII() {
        llIIlIlIlll = new int[15];
        bM.llIIlIlIlll[0] = 0xFFFFBDDB & 0x7F74;
        bM.llIIlIlIlll[1] = 1;
        bM.llIIlIlIlll[2] = (0xC9 ^ 0xA6 ^ (0x3E ^ 0xD)) & (20 + 8 - -54 + 131 ^ 26 + 124 - 47 + 34 ^ -1);
        bM.llIIlIlIlll[3] = 0xFFFFAFBF & 0xFFCE;
        bM.llIIlIlIlll[4] = 0xFFFFADFB & 0x7FF5;
        bM.llIIlIlIlll[5] = 0xFFFFEFFF & 0x3DF2;
        bM.llIIlIlIlll[6] = -(0xFFFF8323 & 0x7EDD) & (0xFFFFFFFF & 0x2FF3);
        bM.llIIlIlIlll[7] = 0xFFFFEDFE & 0x3FF5;
        bM.llIIlIlIlll[8] = 2;
        bM.llIIlIlIlll[9] = 3;
        bM.llIIlIlIlll[10] = 0x10 ^ 0x34 ^ (0x8E ^ 0xAE);
        bM.llIIlIlIlll[11] = -(0xFFFFCFFB & 0x720F) & (0xFFFFEFDF & 0x77FF);
        bM.llIIlIlIlll[12] = 135 + 136 - 236 + 122 ^ 7 + 0 - -119 + 29;
        bM.llIIlIlIlll[13] = -(0xA6 ^ 0x87) & (0xFFFF9DFF & 0x6AEB);
        bM.llIIlIlIlll[14] = 0x19 ^ 0x40 ^ (0xCC ^ 0x90);
    }
}

