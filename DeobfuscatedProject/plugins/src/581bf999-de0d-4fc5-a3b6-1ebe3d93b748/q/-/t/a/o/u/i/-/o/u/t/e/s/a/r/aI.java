/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.TileObject
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class aI
extends ao {
    protected static final /* synthetic */ Point dH;
    private static /* synthetic */ int[] lIlllIlIlIl;
    private static final /* synthetic */ int dO;
    private static /* synthetic */ String[] lIlllIlIIll;
    protected static final /* synthetic */ int dN;
    protected static final /* synthetic */ Point dI;
    protected static final /* synthetic */ Point dM;
    protected static final /* synthetic */ Point dG;
    protected static final /* synthetic */ Point dK;
    private static final /* synthetic */ int[] dP;
    protected static final /* synthetic */ Point dJ;
    protected static final /* synthetic */ Point dL;

    private static String lIIllIIlIllIII(String llllllllllllllllIlIIllIlIIIIIIII, String llllllllllllllllIlIIllIIllllllll) {
        try {
            SecretKeySpec llllllllllllllllIlIIllIlIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIIllllllll.getBytes(StandardCharsets.UTF_8)), lIlllIlIlIl[9]), "DES");
            Cipher llllllllllllllllIlIIllIlIIIIIlII = Cipher.getInstance("DES");
            llllllllllllllllIlIIllIlIIIIIlII.init(lIlllIlIlIl[1], llllllllllllllllIlIIllIlIIIIIlIl);
            return new String(llllllllllllllllIlIIllIlIIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIlIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIllIlIIIIIIll) {
            llllllllllllllllIlIIllIlIIIIIIll.printStackTrace();
            return null;
        }
    }

    static {
        aI.lIIllIIlIlllIl();
        aI.lIIllIIlIllIIl();
        dN = lIlllIlIlIl[12];
        dO = lIlllIlIlIl[0];
        dG = new Point(lIlllIlIlIl[13], lIlllIlIlIl[14]);
        dH = new Point(lIlllIlIlIl[15], lIlllIlIlIl[14]);
        dI = new Point(lIlllIlIlIl[16], lIlllIlIlIl[14]);
        dJ = new Point(lIlllIlIlIl[16], lIlllIlIlIl[17]);
        dK = new Point(lIlllIlIlIl[18], lIlllIlIlIl[14]);
        dL = new Point(lIlllIlIlIl[13], lIlllIlIlIl[19]);
        dM = new Point(lIlllIlIlIl[20], lIlllIlIlIl[21]);
        int[] nArray = new int[lIlllIlIlIl[5]];
        nArray[aI.lIlllIlIlIl[2]] = lIlllIlIlIl[22];
        nArray[aI.lIlllIlIlIl[3]] = lIlllIlIlIl[23];
        nArray[aI.lIlllIlIlIl[1]] = lIlllIlIlIl[12];
        nArray[aI.lIlllIlIlIl[4]] = lIlllIlIlIl[24];
        dP = nArray;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.babaSpecialStyle();
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaAttackStyle();
    }

    @Override
    public boolean bm() {
        String[] stringArray = new String[lIlllIlIlIl[3]];
        stringArray[aI.lIlllIlIlIl[2]] = lIlllIlIIll[lIlllIlIlIl[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (aI.lIIllIIllIIIII(tileObject)) {
            return lIlllIlIlIl[2];
        }
        this.r();
        tileObject.interact(lIlllIlIIll[lIlllIlIlIl[4]]);
        return lIlllIlIlIl[3];
    }

    private static boolean lIIllIIllIIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean bk() {
        return this.e(dP);
    }

    @Override
    public boolean bj() {
        int n2;
        String[] stringArray = new String[lIlllIlIlIl[1]];
        stringArray[aI.lIlllIlIlIl[2]] = lIlllIlIIll[lIlllIlIlIl[2]];
        stringArray[aI.lIlllIlIlIl[3]] = lIlllIlIIll[lIlllIlIlIl[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aI.lIIllIIlIllllI(nPC) && aI.lIIllIIlIlllll(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            n2 = lIlllIlIlIl[3];
            "".length();
            if ("  ".length() == 0) {
                return ((" ".length() ^ (0x95 ^ 0xB6)) & (31 + 67 - 52 + 82 ^ 100 + 20 - 73 + 115 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIlllIlIlIl[2];
        }
        return n2 != 0;
    }

    private static String lIIllIIlIlIlll(String llllllllllllllllIlIIllIlIIIlIIlI, String llllllllllllllllIlIIllIlIIIlIllI) {
        llllllllllllllllIlIIllIlIIIlIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIlIIllIlIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIllIlIIIlIlIl = new StringBuilder();
        char[] llllllllllllllllIlIIllIlIIIlIlII = llllllllllllllllIlIIllIlIIIlIllI.toCharArray();
        int llllllllllllllllIlIIllIlIIIlIIll = lIlllIlIlIl[2];
        char[] llllllllllllllllIlIIllIlIIIIllIl = llllllllllllllllIlIIllIlIIIlIIlI.toCharArray();
        int llllllllllllllllIlIIllIlIIIIllII = llllllllllllllllIlIIllIlIIIIllIl.length;
        int llllllllllllllllIlIIllIlIIIIlIll = lIlllIlIlIl[2];
        while (aI.lIIllIIllIIIll(llllllllllllllllIlIIllIlIIIIlIll, llllllllllllllllIlIIllIlIIIIllII)) {
            char llllllllllllllllIlIIllIlIIIllIII = llllllllllllllllIlIIllIlIIIIllIl[llllllllllllllllIlIIllIlIIIIlIll];
            llllllllllllllllIlIIllIlIIIlIlIl.append((char)(llllllllllllllllIlIIllIlIIIllIII ^ llllllllllllllllIlIIllIlIIIlIlII[llllllllllllllllIlIIllIlIIIlIIll % llllllllllllllllIlIIllIlIIIlIlII.length]));
            "".length();
            ++llllllllllllllllIlIIllIlIIIlIIll;
            ++llllllllllllllllIlIIllIlIIIIlIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIllIlIIIlIlIl);
    }

    protected NPC bB() {
        return NPCs.getNearest((int[])dP);
    }

    /*
     * WARNING - void declaration
     */
    public int bA() {
        void llllllllllllllllIlIIllIlIIlIIIlI;
        int n2;
        int n3 = Vars.getBit((int)lIlllIlIlIl[10]);
        double d2 = (double)n3 / (double)(n2 = Vars.getBit((int)lIlllIlIlIl[11])) * 100.0;
        if (aI.lIIllIIllIIIlI(aI.lIIllIIllIIIIl(d2, 66.0))) {
            return lIlllIlIlIl[3];
        }
        if (aI.lIIllIIllIIIlI(aI.lIIllIIllIIIIl((double)llllllllllllllllIlIIllIlIIlIIIlI, 33.0))) {
            return lIlllIlIlIl[1];
        }
        return lIlllIlIlIl[4];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (aI.lIIllIIlIlllll(super.bn() ? 1 : 0)) {
            return lIlllIlIlIl[3];
        }
        if (aI.lIIllIIlIlllll(Dialog.isOpen() ? 1 : 0) && aI.lIIllIIlIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlllIlIlIl[3];
        }
        String[] stringArray = new String[lIlllIlIlIl[1]];
        stringArray[aI.lIlllIlIlIl[2]] = lIlllIlIIll[lIlllIlIlIl[5]];
        stringArray[aI.lIlllIlIlIl[3]] = lIlllIlIIll[lIlllIlIlIl[6]];
        NPC llllllllllllllllIlIIllIlIIlIlIII = NPCs.getNearest((String[])stringArray);
        if (aI.lIIllIIllIIIII(llllllllllllllllIlIIllIlIIlIlIII)) {
            return lIlllIlIlIl[2];
        }
        String[] stringArray2 = new String[lIlllIlIlIl[3]];
        stringArray2[aI.lIlllIlIlIl[2]] = lIlllIlIIll[lIlllIlIlIl[7]];
        if (aI.lIIllIIlIlllll(llllllllllllllllIlIIllIlIIlIlIII.hasAction(stringArray2) ? 1 : 0)) {
            llllllllllllllllIlIIllIlIIlIlIII.interact(lIlllIlIIll[lIlllIlIlIl[8]]);
            return lIlllIlIlIl[3];
        }
        var1_1.interact(lIlllIlIIll[lIlllIlIlIl[9]]);
        return lIlllIlIlIl[3];
    }

    @Override
    public boolean bl() {
        return this.bC();
    }

    private static boolean lIIllIIllIIIII(Object object) {
        return object == null;
    }

    @Override
    public int bi() {
        return lIlllIlIlIl[0];
    }

    public abstract boolean bC();

    private static boolean lIIllIIlIllllI(Object object) {
        return object != null;
    }

    protected aI(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static int lIIllIIllIIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static void lIIllIIlIllIIl() {
        lIlllIlIIll = new String[lIlllIlIlIl[25]];
        aI.lIlllIlIIll[aI.lIlllIlIlIl[2]] = aI.lIIllIIlIlIlll("NycUHCUTOQ==", "vWyyN");
        aI.lIlllIlIIll[aI.lIlllIlIlIl[3]] = aI.lIIllIIlIlIlll("AgkIBi45Hws=", "MzesC");
        aI.lIlllIlIIll[aI.lIlllIlIlIl[1]] = aI.lIIllIIlIlIlll("PRIgLgYGBThrFRsOPz8XBQ==", "iwLKv");
        aI.lIlllIlIIll[aI.lIlllIlIlIl[4]] = aI.lIIllIIlIllIII("mREjXpXgg8+O9IGEUV/bWQ==", "JLVLp");
        aI.lIlllIlIIll[aI.lIlllIlIlIl[5]] = aI.lIIllIIlIlIlll("LSIYAQQJPA==", "lRudo");
        aI.lIlllIlIIll[aI.lIlllIlIlIl[6]] = aI.lIIllIIlIllIII("Eg6BfQogBuUz3/JyroBiOA==", "PUUIe");
        aI.lIlllIlIIll[aI.lIlllIlIlIl[7]] = aI.lIIllIIlIlIlll("Fxc+GjtrDjIYJiM=", "FbWyP");
        aI.lIlllIlIIll[aI.lIlllIlIlIl[8]] = aI.lIIllIIlIllIII("P4g120f2rqEQfI0w+d+gAg==", "haYJc");
        aI.lIlllIlIIll[aI.lIlllIlIlIl[9]] = aI.lIIllIIlIllIII("WHqOIl+7aww=", "kbJSI");
    }

    private static boolean lIIllIIllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIIlIlllll(int n2) {
        return n2 != 0;
    }

    private static void lIIllIIlIlllIl() {
        lIlllIlIlIl = new int[26];
        aI.lIlllIlIlIl[0] = 0xFFFFFB75 & 0x3FDE;
        aI.lIlllIlIlIl[1] = "  ".length();
        aI.lIlllIlIlIl[2] = (0x8A ^ 0x97 ^ (0x73 ^ 0x44)) & (0x99 ^ 0xBD ^ (0xA4 ^ 0xAA) ^ -" ".length());
        aI.lIlllIlIlIl[3] = " ".length();
        aI.lIlllIlIlIl[4] = "   ".length();
        aI.lIlllIlIlIl[5] = 0x61 ^ 0x65;
        aI.lIlllIlIlIl[6] = 0x3F ^ 0x3A;
        aI.lIlllIlIlIl[7] = 98 + 68 - 74 + 83 ^ 103 + 116 - 183 + 133;
        aI.lIlllIlIlIl[8] = 0x4C ^ 0x60 ^ (0x5B ^ 0x70);
        aI.lIlllIlIlIl[9] = 0xFF ^ 0xAD ^ (0x29 ^ 0x73);
        aI.lIlllIlIlIl[10] = 0xFFFF97DB & 0x7FF7;
        aI.lIlllIlIlIl[11] = -(0xFFFFF52F & 0x6AFC) & (0xFFFFFFFF & 0x77FF);
        aI.lIlllIlIlIl[12] = -(0xFFFFA5FF & 0x5B51) & (0xFFFFAFFE & 0x7F55);
        aI.lIlllIlIlIl[13] = 0x51 ^ 0x47;
        aI.lIlllIlIlIl[14] = 0x6E ^ 0x46 ^ (6 ^ 9);
        aI.lIlllIlIlIl[15] = 0x66 ^ 0x71;
        aI.lIlllIlIlIl[16] = 0xA2 ^ 0x88;
        aI.lIlllIlIlIl[17] = 0x85 ^ 0xA6;
        aI.lIlllIlIlIl[18] = 0x6E ^ 0x2B ^ (0x21 ^ 0x4D);
        aI.lIlllIlIlIl[19] = 104 + 48 - 113 + 112 ^ 70 + 121 - 146 + 132;
        aI.lIlllIlIlIl[20] = 0x48 ^ 0x69;
        aI.lIlllIlIlIl[21] = 0xB8 ^ 0x9D;
        aI.lIlllIlIlIl[22] = 0xFFFFBE4A & 0x6FB7;
        aI.lIlllIlIlIl[23] = -(0x97 ^ 0xB6) & (0xFFFFBFFF & 0x6F7F);
        aI.lIlllIlIlIl[24] = -(0xFFFF9AFD & 0x75F7) & (0xFFFFFFF7 & 0x3EFF);
        aI.lIlllIlIlIl[25] = 1 + 155 - 3 + 11 ^ 152 + 100 - 201 + 122;
    }
}

