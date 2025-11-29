/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Model
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Model;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aq;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.n;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.o;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class ap
extends ao {
    protected static final /* synthetic */ int cY;
    protected static final /* synthetic */ int cZ;
    private static /* synthetic */ String[] lIllIllIlII;
    protected static final /* synthetic */ int da;
    private static final /* synthetic */ int db;
    private static final /* synthetic */ int dc;
    private static /* synthetic */ int[] lIllIlllIII;

    private static boolean lIIllIIIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIIIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    public o bv() {
        switch (aq.dd[this.bx().ordinal()]) {
            case 1: {
                return o.DEATH;
            }
            case 2: {
                return o.FIRE;
            }
            case 3: {
                return o.AIR;
            }
            case 4: {
                return o.LIGHTNING;
            }
        }
        return o.LIGHTNING;
    }

    @Override
    public boolean bj() {
        int n2;
        String[] stringArray = new String[lIllIlllIII[1]];
        stringArray[ap.lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[2]];
        stringArray[ap.lIllIlllIII[3]] = lIllIllIlII[lIllIlllIII[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (ap.lIIlIlllllllll(nPC) && ap.lIIllIIIIIIIII(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            n2 = lIllIlllIII[3];
            0;
            if (3 <= 1) {
                return ((0x31 ^ 0x72) & ~(0x1C ^ 0x5F)) != 0;
            }
        } else {
            n2 = lIllIlllIII[2];
        }
        return n2 != 0;
    }

    static {
        ap.lIIlIllllllllI();
        ap.lIIlIlllllIlIl();
        cY = lIllIlllIII[9];
        dc = lIllIlllIII[6];
        cZ = lIllIlllIII[5];
        db = lIllIlllIII[0];
        da = lIllIlllIII[7];
    }

    @Override
    public int bi() {
        return lIllIlllIII[0];
    }

    public boolean bw() {
        int[] nArray = new int[lIllIlllIII[3]];
        nArray[ap.lIllIlllIII[2]] = lIllIlllIII[9];
        return this.e(nArray);
    }

    private static boolean lIIllIIIIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIllllllllI() {
        lIllIlllIII = new int[20];
        ap.lIllIlllIII[0] = 0xFFFFFF57 & 0x39FC;
        ap.lIllIlllIII[1] = 2;
        ap.lIllIlllIII[2] = (0x2A ^ 0x30) & ~(0x4E ^ 0x54);
        ap.lIllIlllIII[3] = 1;
        ap.lIllIlllIII[4] = 0x9C ^ 0x98;
        ap.lIllIlllIII[5] = -(0xFFFF9599 & 0x7AF7) & (0xFFFFFFFF & 0x3E9E);
        ap.lIllIlllIII[6] = 0xFFFFFE0F & 0x2FFF;
        ap.lIllIlllIII[7] = 0xFFFFEF54 & 0x3EBB;
        ap.lIllIlllIII[8] = 3;
        ap.lIllIlllIII[9] = -(0xFFFFEB3D & 0x55CF) & (0xFFFFFF1F & 0x6FFF);
        ap.lIllIlllIII[10] = 0xA9 ^ 0xAC;
        ap.lIllIlllIII[11] = 0 ^ 6;
        ap.lIllIlllIII[12] = 26 + 72 - -35 + 19 ^ 15 + 41 - 22 + 125;
        ap.lIllIlllIII[13] = 0x36 ^ 0x13 ^ (0x63 ^ 0x4E);
        ap.lIllIlllIII[14] = 0 ^ 9;
        ap.lIllIlllIII[15] = 39 + 163 - 91 + 70 ^ 10 + 13 - -68 + 100;
        ap.lIllIlllIII[16] = 0xA5 ^ 0x9B ^ (0x2D ^ 0x18);
        ap.lIllIlllIII[17] = 181 + 145 - 273 + 131 ^ 45 + 22 - -38 + 75;
        ap.lIllIlllIII[18] = 38 + 3 - 13 + 118 ^ 42 + 98 - 17 + 36;
        ap.lIllIlllIII[19] = 0xAB ^ 0xA5;
    }

    public boolean g(NPC nPC) {
        int n2;
        Model model = nPC.getModel();
        if (ap.lIIlIlllllllll(model) && ap.lIIllIIIIIIlII(model.getOverrideAmount())) {
            n2 = lIllIlllIII[3];
            0;
            if ((0x43 ^ 0x47) == 0) {
                return ((0xC5 ^ 0x8F) & ~(0x50 ^ 0x1A)) != 0;
            }
        } else {
            n2 = lIllIlllIII[2];
        }
        return n2 != 0;
    }

    public void g(WorldPoint worldPoint) {
        Player player = Players.getLocal();
        if (ap.lIIllIIIIIIIIl(NPCs.getNearest(nPC -> {
            int n2;
            if (ap.lIIlIlllllllll(nPC.getName()) && ap.lIIllIIIIIIIII(nPC.getName().contains(lIllIllIlII[lIllIlllIII[18]]) ? 1 : 0) && ap.lIIllIIIIIIIll(nPC.getWorldLocation().distanceTo((Locatable)player), lIllIlllIII[4])) {
                n2 = lIllIlllIII[3];
                0;
                if (1 == 2) {
                    return ((155 + 39 - 70 + 67 ^ 139 + 39 - 62 + 66) & (0xE3 ^ 0x91 ^ (0x75 ^ 0xE) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIlllIII[2];
            }
            return n2 != 0;
        }))) {
            Movement.setDestination((WorldPoint)worldPoint);
            return;
        }
        WorldPoint worldPoint2 = player.getWorldLocation();
        WorldPoint worldPoint3 = this.c(worldPoint2, worldPoint);
        Movement.setDestination((WorldPoint)worldPoint3);
    }

    private static boolean lIIllIIIIIIlII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bm() {
        String[] stringArray = new String[lIllIlllIII[3]];
        stringArray[ap.lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (ap.lIIllIIIIIIIIl(tileObject)) {
            return lIllIlllIII[2];
        }
        this.r();
        tileObject.interact(lIllIllIlII[lIllIlllIII[8]]);
        return lIllIlllIII[3];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (ap.lIIllIIIIIIIII(super.bn() ? 1 : 0)) {
            return lIllIlllIII[3];
        }
        if (ap.lIIllIIIIIIIII(Dialog.isOpen() ? 1 : 0) && ap.lIIllIIIIIIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIllIlllIII[3];
        }
        String[] stringArray = new String[lIllIlllIII[1]];
        stringArray[ap.lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[4]];
        stringArray[ap.lIllIlllIII[3]] = lIllIllIlII[lIllIlllIII[10]];
        NPC llllllllllllllllIlIlIIIIIlIIllll = NPCs.getNearest((String[])stringArray);
        if (ap.lIIllIIIIIIIIl(llllllllllllllllIlIlIIIIIlIIllll)) {
            return lIllIlllIII[2];
        }
        String[] stringArray2 = new String[lIllIlllIII[3]];
        stringArray2[ap.lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[11]];
        if (ap.lIIllIIIIIIIII(llllllllllllllllIlIlIIIIIlIIllll.hasAction(stringArray2) ? 1 : 0)) {
            llllllllllllllllIlIlIIIIIlIIllll.interact(lIllIllIlII[lIllIlllIII[12]]);
            return lIllIlllIII[3];
        }
        var1_1.interact(lIllIllIlII[lIllIlllIII[13]]);
        return lIllIlllIII[3];
    }

    private static String lIIlIllllIllII(String llllllllllllllllIlIIllllllIllllI, String llllllllllllllllIlIIllllllIlllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllllllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllllllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlllllllIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlllllllIIIII.init(lIllIlllIII[1], llllllllllllllllIlIIlllllllIIIIl);
            return new String(llllllllllllllllIlIIlllllllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllllllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIllllllIlllll) {
            llllllllllllllllIlIIllllllIlllll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllllIlIl() {
        lIllIllIlII = new String[lIllIlllIII[19]];
        ap.lIllIllIlII[ap.lIllIlllIII[2]] = ap."Osmumten";
        ap.lIllIllIlII[ap.lIllIlllIII[3]] = ap."Het";
        ap.lIllIllIlII[ap.lIllIlllIII[1]] = ap."Teleport crystal";
        ap.lIllIllIlII[ap.lIllIlllIII[8]] = ap."Quick-Use";
        ap.lIllIllIlII[ap.lIllIlllIII[4]] = ap."Het";
        ap.lIllIllIlII[ap.lIllIlllIII[10]] = ap."Osmumten";
        ap.lIllIllIlII[ap.lIllIlllIII[11]] = ap."Quick-leave";
        ap.lIllIllIlII[ap.lIllIlllIII[12]] = ap."Quick-leave";
        ap.lIllIllIlII[ap.lIllIlllIII[13]] = ap."Talk-to";
        ap.lIllIllIlII[ap.lIllIlllIII[14]] = ap."Akkha's Shadow";
        ap.lIllIllIlII[ap.lIllIlllIII[15]] = ap."Akkha's Shadow";
        ap.lIllIllIlII[ap.lIllIlllIII[16]] = ap."Akkha's Shadow";
        ap.lIllIllIlII[ap.lIllIlllIII[17]] = ap."orb";
        ap.lIllIllIlII[ap.lIllIlllIII[18]] = ap."Orb";
    }

    protected ap(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    public List<NPC> by() {
        String[] stringArray = new String[lIllIlllIII[3]];
        stringArray[ap.lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[14]];
        return NPCs.getAll((String[])stringArray);
    }

    public NPC J() {
        int[] nArray = new int[lIllIlllIII[4]];
        nArray[ap.lIllIlllIII[2]] = lIllIlllIII[5];
        nArray[ap.lIllIlllIII[3]] = lIllIlllIII[6];
        nArray[ap.lIllIlllIII[1]] = lIllIlllIII[7];
        nArray[ap.lIllIlllIII[8]] = lIllIlllIII[9];
        return NPCs.getNearest((int[])nArray);
    }

    private static String lIIlIlllllIlII(String llllllllllllllllIlIIlllllllIlllI, String llllllllllllllllIlIIllllllllIIlI) {
        llllllllllllllllIlIIlllllllIlllI = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlllllllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIllllllllIIIl = new StringBuilder();
        char[] llllllllllllllllIlIIllllllllIIII = llllllllllllllllIlIIllllllllIIlI.toCharArray();
        int llllllllllllllllIlIIlllllllIllll = lIllIlllIII[2];
        char[] llllllllllllllllIlIIlllllllIlIIl = llllllllllllllllIlIIlllllllIlllI.toCharArray();
        int llllllllllllllllIlIIlllllllIlIII = llllllllllllllllIlIIlllllllIlIIl.length;
        int llllllllllllllllIlIIlllllllIIlll = lIllIlllIII[2];
        while (ap.lIIllIIIIIIIll(llllllllllllllllIlIIlllllllIIlll, llllllllllllllllIlIIlllllllIlIII)) {
            char llllllllllllllllIlIIllllllllIlII = llllllllllllllllIlIIlllllllIlIIl[llllllllllllllllIlIIlllllllIIlll];
            llllllllllllllllIlIIllllllllIIIl.append((char)(llllllllllllllllIlIIllllllllIlII ^ llllllllllllllllIlIIllllllllIIII[llllllllllllllllIlIIlllllllIllll % llllllllllllllllIlIIllllllllIIII.length]));
            0;
            ++llllllllllllllllIlIIlllllllIllll;
            ++llllllllllllllllIlIIlllllllIIlll;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIllllllllIIIl);
    }

    private static boolean lIIlIlllllllll(Object object) {
        return object != null;
    }

    @Override
    public boolean bk() {
        int[] nArray = new int[lIllIlllIII[4]];
        nArray[ap.lIllIlllIII[2]] = lIllIlllIII[5];
        nArray[ap.lIllIlllIII[3]] = lIllIlllIII[6];
        nArray[ap.lIllIlllIII[1]] = lIllIlllIII[7];
        nArray[ap.lIllIlllIII[8]] = lIllIlllIII[9];
        return this.e(nArray);
    }

    private static String lIIlIllllIlIlI(String llllllllllllllllIlIlIIIIIIIIIIIl, String llllllllllllllllIlIlIIIIIIIIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIllIlllIII[13]), "DES");
            Cipher llllllllllllllllIlIlIIIIIIIIIlIl = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIIIIIIIlIl.init(lIllIlllIII[1], llllllllllllllllIlIlIIIIIIIIIllI);
            return new String(llllllllllllllllIlIlIIIIIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIIIIIIIlII) {
            llllllllllllllllIlIlIIIIIIIIIlII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public n bx() {
        NPC llllllllllllllllIlIlIIIIIIlIlIll;
        WorldPoint llllllllllllllllIlIlIIIIIIlIllII;
        ap llllllllllllllllIlIlIIIIIIllIIlI;
        n llllllllllllllllIlIlIIIIIIlIllIl;
        NPC llllllllllllllllIlIlIIIIIIllIIII;
        int llllllllllllllllIlIlIIIIIIlIllll;
        int llllllllllllllllIlIlIIIIIIlIlllI;
        List<NPC> list = this.by();
        if (ap.lIIllIIIIIIIlI(list.size(), lIllIlllIII[4])) {
            void llllllllllllllllIlIlIIIIIIllIIIl;
            n[] nArray = n.values();
            int n2 = nArray.length;
            llllllllllllllllIlIlIIIIIIlIlllI = lIllIlllIII[2];
            while (ap.lIIllIIIIIIIll(llllllllllllllllIlIlIIIIIIlIlllI, llllllllllllllllIlIlIIIIIIlIllll)) {
                llllllllllllllllIlIlIIIIIIlIllIl = llllllllllllllllIlIlIIIIIIllIIII[llllllllllllllllIlIlIIIIIIlIlllI];
                llllllllllllllllIlIlIIIIIIlIllII = llllllllllllllllIlIlIIIIIIlIllIl.a(llllllllllllllllIlIlIIIIIIllIIlI.cu);
                llllllllllllllllIlIlIIIIIIlIlIll = NPCs.getNearest((WorldPoint)llllllllllllllllIlIlIIIIIIlIllII, nPC -> {
                    int n2;
                    if (ap.lIIllIIIIIIIII(nPC.getName().equals(lIllIllIlII[lIllIlllIII[16]]) ? 1 : 0) && ap.lIIllIIIIIIIll(nPC.getWorldLocation().distanceTo(llllllllllllllllIlIlIIIIIIlIllII), lIllIlllIII[11])) {
                        n2 = lIllIlllIII[3];
                        0;
                        if (3 == 0) {
                            return ((0x31 ^ 0xD) & ~(0x2F ^ 0x13)) != 0;
                        }
                    } else {
                        n2 = lIllIlllIII[2];
                    }
                    return n2 != 0;
                });
                if (ap.lIIlIlllllllll(llllllllllllllllIlIlIIIIIIlIlIll) && ap.lIIllIIIIIIIII(llllllllllllllllIlIlIIIIIIllIIlI.g(llllllllllllllllIlIlIIIIIIlIlIll) ? 1 : 0)) {
                    return llllllllllllllllIlIlIIIIIIlIllIl;
                }
                ++llllllllllllllllIlIlIIIIIIlIlllI;
                0;
                if ((0x33 ^ 0x37) != 3) continue;
                return null;
            }
            llllllllllllllllIlIlIIIIIIllIIII = llllllllllllllllIlIlIIIIIIllIIIl.stream().filter(llllllllllllllllIlIlIIIIIIllIIlI::g).findFirst().orElse(null);
            if (ap.lIIlIlllllllll(llllllllllllllllIlIlIIIIIIllIIII)) {
                return n.a(llllllllllllllllIlIlIIIIIIllIIlI.cu, llllllllllllllllIlIlIIIIIIllIIII.getWorldLocation());
            }
        }
        llllllllllllllllIlIlIIIIIIllIIII = n.values();
        llllllllllllllllIlIlIIIIIIlIllll = ((n[])llllllllllllllllIlIlIIIIIIllIIII).length;
        llllllllllllllllIlIlIIIIIIlIlllI = lIllIlllIII[2];
        while (ap.lIIllIIIIIIIll(llllllllllllllllIlIlIIIIIIlIlllI, llllllllllllllllIlIlIIIIIIlIllll)) {
            llllllllllllllllIlIlIIIIIIlIllIl = llllllllllllllllIlIlIIIIIIllIIII[llllllllllllllllIlIlIIIIIIlIlllI];
            llllllllllllllllIlIlIIIIIIlIllII = llllllllllllllllIlIlIIIIIIlIllIl.a(llllllllllllllllIlIlIIIIIIllIIlI.cu);
            llllllllllllllllIlIlIIIIIIlIlIll = NPCs.getNearest((WorldPoint)llllllllllllllllIlIlIIIIIIlIllII, nPC -> {
                int n2;
                if (ap.lIIllIIIIIIIII(nPC.getName().equals(lIllIllIlII[lIllIlllIII[15]]) ? 1 : 0) && ap.lIIllIIIIIIIll(nPC.getWorldLocation().distanceTo(llllllllllllllllIlIlIIIIIIlIllII), lIllIlllIII[11])) {
                    n2 = lIllIlllIII[3];
                    0;
                    if (1 == 2) {
                        return ((0x76 ^ 0x54) & ~(0xE2 ^ 0xC0)) != 0;
                    }
                } else {
                    n2 = lIllIlllIII[2];
                }
                return n2 != 0;
            });
            if (ap.lIIllIIIIIIIIl(llllllllllllllllIlIlIIIIIIlIlIll)) {
                return llllllllllllllllIlIlIIIIIIlIllIl;
            }
            ++llllllllllllllllIlIlIIIIIIlIlllI;
            0;
            if (-1 < (0xBF ^ 0xBB)) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        ap llllllllllllllllIlIlIIIIIlIIllII;
        void llllllllllllllllIlIlIIIIIlIIlIll;
        NPC nPC = this.J();
        if (ap.lIIllIIIIIIIIl(nPC)) {
            return this.cW.meleeGearAkkha();
        }
        if (ap.lIIllIIIIIIIlI(llllllllllllllllIlIlIIIIIlIIlIll.getId(), lIllIlllIII[5])) {
            return llllllllllllllllIlIlIIIIIlIIllII.cW.mageGearAkkha();
        }
        if (ap.lIIllIIIIIIIlI(llllllllllllllllIlIlIIIIIlIIlIll.getId(), lIllIlllIII[6])) {
            return llllllllllllllllIlIlIIIIIlIIllII.cW.meleeGearAkkha();
        }
        if (ap.lIIllIIIIIIIlI(llllllllllllllllIlIlIIIIIlIIlIll.getId(), lIllIlllIII[7])) {
            return llllllllllllllllIlIlIIIIIlIIllII.cW.rangeGearAkkha();
        }
        return this.cW.meleeGearAkkha();
    }

    private static boolean lIIllIIIIIIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean bu() {
        int n2;
        void llllllllllllllllIlIlIIIIIlIIIlll;
        ap llllllllllllllllIlIlIIIIIlIIlIII;
        NPC nPC = this.J();
        if (ap.lIIllIIIIIIIIl(nPC)) {
            return lIllIlllIII[2];
        }
        if (ap.lIIllIIIIIIIII(llllllllllllllllIlIlIIIIIlIIlIII.cW.butterfly() ? 1 : 0) && ap.lIIllIIIIIIIlI(llllllllllllllllIlIlIIIIIlIIIlll.getId(), lIllIlllIII[5]) && ap.lIIllIIIIIIIII(Movement.isRunEnabled() ? 1 : 0)) {
            n2 = lIllIlllIII[3];
            0;
            if (-1 >= (0x4C ^ 0x7F ^ (0xF1 ^ 0xC6))) {
                return ((0x7D ^ 0x21 ^ (0x1F ^ 0x63)) & (94 + 96 - 75 + 19 ^ 4 + 36 - -93 + 33 ^ -1)) != 0;
            }
        } else {
            n2 = lIllIlllIII[2];
        }
        return n2 != 0;
    }

    public WorldPoint c(WorldPoint worldPoint3, WorldPoint worldPoint4) {
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (ap.lIIlIlllllllll(nPC.getName()) && ap.lIIllIIIIIIIII(nPC.getName().toLowerCase().contains(lIllIllIlII[lIllIlllIII[17]]) ? 1 : 0)) {
                n2 = lIllIlllIII[3];
                0;
                if (1 != 1) {
                    return ((0xAA ^ 0x89) & ~(0x52 ^ 0x71)) != 0;
                }
            } else {
                n2 = lIllIlllIII[2];
            }
            return n2 != 0;
        });
        WorldArea worldArea = worldPoint3.toWorldArea().offset(lIllIlllIII[1]);
        Predicate<WorldPoint> predicate = worldPoint -> list.stream().noneMatch(nPC -> nPC.getWorldLocation().equals(worldPoint));
        Stream<WorldPoint> stream = worldArea.toWorldPointList().stream().filter(worldPoint2 -> {
            boolean bl2;
            if (ap.lIIllIIIIIIlII(worldPoint2.equals((Object)worldPoint3) ? 1 : 0)) {
                bl2 = lIllIlllIII[3];
                0;
                if (1 <= ((0x58 ^ 0x71) & ~(0xEB ^ 0xC2))) {
                    return ((0x6B ^ 0x67) & ~(0xA2 ^ 0xAE)) != 0;
                }
            } else {
                bl2 = lIllIlllIII[2];
            }
            return bl2;
        }).filter(predicate).filter(worldPoint2 -> {
            boolean bl2;
            List list = worldPoint3.pathTo(this.cu, worldPoint2);
            if (!ap.lIIlIlllllllll(list) || ap.lIIllIIIIIIIII(list.stream().allMatch(predicate) ? 1 : 0)) {
                bl2 = lIllIlllIII[3];
                0;
                if (3 < ((0x17 ^ 0x2E) & ~(0x25 ^ 0x1C))) {
                    return ((0xC7 ^ 0x9D) & ~(0x4B ^ 0x11)) != 0;
                }
            } else {
                bl2 = lIllIlllIII[2];
            }
            return bl2;
        }).filter(Reachable::isWalkable);
        WorldPoint worldPoint5 = worldPoint4;
        Objects.requireNonNull(worldPoint5);
        0;
        return stream.min(Comparator.comparingInt(arg_0 -> ((WorldPoint)worldPoint5).distanceTo(arg_0))).orElse(worldPoint4);
    }
}

