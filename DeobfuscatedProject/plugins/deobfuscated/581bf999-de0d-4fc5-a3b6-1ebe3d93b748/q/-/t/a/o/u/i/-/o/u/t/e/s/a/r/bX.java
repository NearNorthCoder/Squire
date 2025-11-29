/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bY;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.f;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class bX
extends ao {
    private static final /* synthetic */ int[] hn;
    private static final /* synthetic */ int hk;
    private static final /* synthetic */ int hl;
    private static final /* synthetic */ int hp;
    private static /* synthetic */ String[] llIIlllllll;
    private static final /* synthetic */ int hs;
    private static final /* synthetic */ int[] hm;
    private static /* synthetic */ int[] llIlIIIIIII;
    private static final /* synthetic */ int hr;
    private static final /* synthetic */ int ho;
    protected static final /* synthetic */ int hi;
    private final /* synthetic */ bY ht;
    protected static final /* synthetic */ int hj;
    private static final /* synthetic */ int hq;

    @Override
    public int bi() {
        return llIlIIIIIII[0];
    }

    @Override
    public boolean bj() {
        boolean bl2;
        int[] nArray = new int[llIlIIIIIII[1]];
        nArray[bX.llIlIIIIIII[2]] = llIlIIIIIII[3];
        nArray[bX.llIlIIIIIII[4]] = llIlIIIIIII[5];
        if (bX.lIlIIlIIIIIlII(NPCs.getNearest((int[])nArray))) {
            bl2 = llIlIIIIIII[4];
            0;
            if (((0x22 ^ 1) & ~(0x62 ^ 0x41)) > (0xD ^ 9)) {
                return ((0x85 ^ 0xBF) & ~(0xA6 ^ 0x9C)) != 0;
            }
        } else {
            bl2 = llIlIIIIIII[2];
        }
        return bl2;
    }

    private static boolean lIlIIlIIIIlIII(Object object) {
        return object == null;
    }

    public WorldPoint C(WorldPoint worldPoint2, WorldPoint worldPoint3) {
        return this.b(worldPoint2, worldPoint3, (WorldPoint worldPoint) -> llIlIIIIIII[4]);
    }

    private static boolean lIlIIlIIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static void lIlIIlIIIIIIlI() {
        llIIlllllll = new String[llIlIIIIIII[28]];
        bX.llIIlllllll[bX.llIlIIIIIII[2]] = bX."Teleport crystal";
        bX.llIIlllllll[bX.llIlIIIIIII[4]] = bX."Quick-Use";
        bX.llIIlllllll[bX.llIlIIIIIII[1]] = bX."Crondis";
        bX.llIIlllllll[bX.llIlIIIIIII[6]] = bX."Osmumten";
        bX.llIIlllllll[bX.llIlIIIIIII[7]] = bX."Teleport crystal";
        bX.llIIlllllll[bX.llIlIIIIIII[8]] = bX."Quick-Use";
        bX.llIIlllllll[bX.llIlIIIIIII[9]] = bX."Quick-leave";
        bX.llIIlllllll[bX.llIlIIIIIII[10]] = bX."Quick-leave";
        bX.llIIlllllll[bX.llIlIIIIIII[11]] = bX."Talk-to";
        bX.llIIlllllll[bX.llIlIIIIIII[17]] = bX."Blood Cloud";
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint a(WorldPoint worldPoint3, WorldPoint worldPoint4, Predicate<WorldPoint> predicate, Comparator<WorldPoint> comparator) {
        List<TileObject> list = this.cC();
        WorldArea worldArea = worldPoint3.toWorldArea().offset(llIlIIIIIII[1]);
        if (bX.lIlIIlIIIIlIIl(this.k(list, worldPoint4) ? 1 : 0)) {
            void llllllllllllllllIIlllIIllIlIIIIl;
            return llllllllllllllllIIlllIIllIlIIIIl;
        }
        NPC nPC = this.cB();
        WorldArea worldArea2 = nPC.getWorldArea();
        return worldArea.toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bX.lIlIIlIIIIlIlI(this.k(list, (WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = llIlIIIIIII[4];
                0;
                if (null != null) {
                    return ((0x4B ^ 0x6E ^ (0x8C ^ 0x9A)) & (100 + 24 - 106 + 121 ^ 101 + 76 - 52 + 59 ^ -1)) != 0;
                }
            } else {
                bl2 = llIlIIIIIII[2];
            }
            return bl2;
        }).filter(worldPoint2 -> {
            boolean bl2;
            if (bX.lIlIIlIIIIlIlI(worldPoint2.equals((Object)worldPoint3) ? 1 : 0)) {
                bl2 = llIlIIIIIII[4];
                0;
                if (null != null) {
                    return ((0x12 ^ 0x4B) & ~(0x3C ^ 0x65)) != 0;
                }
            } else {
                bl2 = llIlIIIIIII[2];
            }
            return bl2;
        }).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl2;
            if (bX.lIlIIlIIIIlIlI(worldArea2.isInMeleeDistance(worldPoint) ? 1 : 0)) {
                bl2 = llIlIIIIIII[4];
                0;
                if (null != null) {
                    return ((0xB6 ^ 0xC3 ^ (0xB5 ^ 0x89)) & (0x24 ^ 0x72 ^ (0xBC ^ 0xA3) ^ -1)) != 0;
                }
            } else {
                bl2 = llIlIIIIIII[2];
            }
            return bl2;
        }).filter(worldPoint -> {
            boolean bl2;
            if (bX.lIlIIlIIIIlIll(worldArea2.distanceTo2D(worldPoint), llIlIIIIIII[4])) {
                bl2 = llIlIIIIIII[4];
                0;
                if (1 != 1) {
                    return ((0xD9 ^ 0xB8) & ~(0xA ^ 0x6B)) != 0;
                }
            } else {
                bl2 = llIlIIIIIII[2];
            }
            return bl2;
        }).filter(worldPoint2 -> worldPoint3.pathTo(this.cu, worldPoint2).stream().allMatch(predicate)).min(comparator).orElse(worldPoint4);
    }

    private static boolean lIlIIlIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bX.lIlIIlIIIIIIll();
        bX.lIlIIlIIIIIIlI();
        hj = llIlIIIIIII[14];
        hk = llIlIIIIIII[16];
        hp = llIlIIIIIII[5];
        hq = llIlIIIIIII[13];
        hr = llIlIIIIIII[15];
        hs = llIlIIIIIII[18];
        hi = llIlIIIIIII[12];
        hl = llIlIIIIIII[0];
        ho = llIlIIIIIII[3];
        int[] nArray = new int[llIlIIIIIII[1]];
        nArray[bX.llIlIIIIIII[2]] = llIlIIIIIII[19];
        nArray[bX.llIlIIIIIII[4]] = llIlIIIIIII[20];
        hm = nArray;
        int[] nArray2 = new int[llIlIIIIIII[11]];
        nArray2[bX.llIlIIIIIII[2]] = llIlIIIIIII[21];
        nArray2[bX.llIlIIIIIII[4]] = llIlIIIIIII[22];
        nArray2[bX.llIlIIIIIII[1]] = llIlIIIIIII[23];
        nArray2[bX.llIlIIIIIII[6]] = llIlIIIIIII[24];
        nArray2[bX.llIlIIIIIII[7]] = llIlIIIIIII[25];
        nArray2[bX.llIlIIIIIII[8]] = llIlIIIIIII[26];
        nArray2[bX.llIlIIIIIII[9]] = llIlIIIIIII[21];
        nArray2[bX.llIlIIIIIII[10]] = llIlIIIIIII[27];
        hn = nArray2;
    }

    public List<NPC> cD() {
        int[] nArray = new int[llIlIIIIIII[4]];
        nArray[bX.llIlIIIIIII[2]] = llIlIIIIIII[12];
        return NPCs.getAll((int[])nArray);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.specGearZebak();
    }

    @Override
    public boolean bq() {
        boolean bl2;
        if (bX.lIlIIlIIIIIlll((Object)this.cF(), (Object)bY.ATTACK)) {
            bl2 = llIlIIIIIII[4];
            0;
            if (null != null) {
                return ((0xC6 ^ 0x9F) & ~(0x37 ^ 0x6E)) != 0;
            }
        } else {
            bl2 = llIlIIIIIII[2];
        }
        return bl2;
    }

    private static boolean lIlIIlIIIIllII(int n2, int n3) {
        return n2 != n3;
    }

    public WorldPoint b(WorldPoint worldPoint, WorldPoint worldPoint3, Predicate<WorldPoint> predicate) {
        return this.a(worldPoint, worldPoint3, predicate, Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(worldPoint3)));
    }

    public boolean P(WorldPoint worldPoint) {
        int n2;
        NPC nPC = this.cB();
        WorldArea worldArea = nPC.getWorldArea();
        if (bX.lIlIIlIIIIlIlI(this.p(worldPoint) ? 1 : 0) && bX.lIlIIlIIIIlIlI(worldArea.isInMeleeDistance(worldPoint) ? 1 : 0) && bX.lIlIIlIIIIlIll(worldArea.distanceTo2D(worldPoint), llIlIIIIIII[4])) {
            n2 = llIlIIIIIII[4];
            0;
            if (3 == 0) {
                return ((0x78 ^ 4 ^ (0x1D ^ 0x4C)) & (0x63 ^ 0x27 ^ (0xD7 ^ 0xBE) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIIIIIII[2];
        }
        return n2 != 0;
    }

    public NPC cA() {
        return NPCs.getNearest(nPC -> {
            boolean bl2;
            NPC llllllllllllllllIIlllIIlIlllllll;
            if ((!bX.lIlIIlIIIIllII(nPC.getId(), llIlIIIIIII[16]) || bX.lIlIIlIIIIlIIl(nPC.getName().equals(llIIlllllll[llIlIIIIIII[17]]) ? 1 : 0)) && bX.lIlIIlIIIIlIlI(llllllllllllllllIIlllIIlIlllllll.isDead() ? 1 : 0)) {
                bl2 = llIlIIIIIII[4];
                0;
                if (1 <= 0) {
                    return ((0x16 ^ 0x36) & ~(0x6A ^ 0x4A)) != 0;
                }
            } else {
                bl2 = llIlIIIIIII[2];
            }
            return bl2;
        });
    }

    private static void lIlIIlIIIIIIll() {
        llIlIIIIIII = new int[29];
        bX.llIlIIIIIII[0] = 0xFFFFFFDF & 0x3D74;
        bX.llIlIIIIIII[1] = 2;
        bX.llIlIIIIIII[2] = (243 + 80 - 170 + 100 ^ 147 + 161 - 153 + 10) & (28 + 168 - 90 + 135 ^ 112 + 62 - 41 + 36 ^ -1);
        bX.llIlIIIIIII[3] = 0xFFFFFDEB & 0x2F9F;
        bX.llIlIIIIIII[4] = 1;
        bX.llIlIIIIIII[5] = -(0xFFFFCD67 & 0x72DB) & (0xFFFFFDEF & 0x6FFB);
        bX.llIlIIIIIII[6] = 3;
        bX.llIlIIIIIII[7] = 0x5D ^ 0x41 ^ (0x6C ^ 0x74);
        bX.llIlIIIIIII[8] = 0x4D ^ 0x48;
        bX.llIlIIIIIII[9] = 0xBF ^ 0xB9;
        bX.llIlIIIIIII[10] = 152 + 50 - 102 + 56 ^ 94 + 110 - 116 + 67;
        bX.llIlIIIIIII[11] = 0x28 ^ 0x22 ^ 2;
        bX.llIlIIIIIII[12] = 0xFFFFAFFF & 0x7DDA;
        bX.llIlIIIIIII[13] = -(0xFFFFEB75 & 0x7CAF) & (0xFFFFFF7F & 0x6EB7);
        bX.llIlIIIIIII[14] = 0xFFFFFFDB & 0x2DFD;
        bX.llIlIIIIIII[15] = 0xFFFFA8BB & 0x5FD6;
        bX.llIlIIIIIII[16] = -(0xFFFFDC7B & 0x73A5) & (0xFFFFFFFF & 0x7DFF);
        bX.llIlIIIIIII[17] = 3 ^ 0xA;
        bX.llIlIIIIIII[18] = 0xFFFFA57D & 0x5BFB;
        bX.llIlIIIIIII[19] = 0xFFFFBDF3 & 0x6FDE;
        bX.llIlIIIIIII[20] = -(0xFFFFD87F & 0x678B) & (0xFFFFFFDF & 0x6DFE);
        bX.llIlIIIIIII[21] = -(0xFFFFC6FD & 0x3DFF) & (0xFFFFF6FF & 0xBFFE);
        bX.llIlIIIIIII[22] = -(0xFFFFFD5F & 0x47EB) & (0xFFFFF7CF & 0xFF7E);
        bX.llIlIIIIIII[23] = 0xFFFFBF85 & 0xF27F;
        bX.llIlIIIIIII[24] = -(0xFFFFEEDF & 0x59F3) & (0xFFFFFEFF & 0xFBDA);
        bX.llIlIIIIIII[25] = 0xFFFFFB27 & 0xB6DF;
        bX.llIlIIIIIII[26] = -(0xFFFFD7FD & 0x2DA7) & (0xFFFFFFB7 & 0xB7EF);
        bX.llIlIIIIIII[27] = 0xFFFFFEC7 & 0xB33E;
        bX.llIlIIIIIII[28] = 3 ^ 9;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bk() {
        void llllllllllllllllIIlllIIlllIIIlll;
        int[] nArray = hm;
        int n2 = nArray.length;
        int llllllllllllllllIIlllIIlllIIIllI = llIlIIIIIII[2];
        while (bX.lIlIIlIIIIIlIl(llllllllllllllllIIlllIIlllIIIllI, (int)llllllllllllllllIIlllIIlllIIIlll)) {
            bX llllllllllllllllIIlllIIlllIIlIIl;
            void llllllllllllllllIIlllIIlllIIlIII;
            void llllllllllllllllIIlllIIlllIIIlIl = llllllllllllllllIIlllIIlllIIlIII[llllllllllllllllIIlllIIlllIIIllI];
            if (bX.lIlIIlIIIIIllI(llllllllllllllllIIlllIIlllIIlIIl.aX(), (int)llllllllllllllllIIlllIIlllIIIlIl)) {
                return llIlIIIIIII[4];
            }
            ++llllllllllllllllIIlllIIlllIIIllI;
            0;
            if (((0xBD ^ 0x98 ^ (0x89 ^ 0x8D)) & (0x50 ^ 0x6C ^ (0x17 ^ 0xA) ^ -1)) <= 2) continue;
            return ((95 + 53 - 39 + 43 ^ 127 + 54 - 111 + 101) & (3 ^ (0xAE ^ 0x9E) ^ -1)) != 0;
        }
        return llIlIIIIIII[2];
    }

    public boolean k(List<TileObject> list, WorldPoint worldPoint) {
        return list.stream().anyMatch(tileObject -> tileObject.getWorldLocation().equals((Object)worldPoint));
    }

    public boolean p(WorldPoint worldPoint) {
        return this.cC().stream().anyMatch(tileObject -> tileObject.getWorldLocation().equals((Object)worldPoint));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (bX.lIlIIlIIIIlIIl(super.bn() ? 1 : 0)) {
            return llIlIIIIIII[4];
        }
        if (bX.lIlIIlIIIIlIIl(Dialog.isOpen() ? 1 : 0) && bX.lIlIIlIIIIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIlIIIIIII[4];
        }
        String[] stringArray = new String[llIlIIIIIII[1]];
        stringArray[bX.llIlIIIIIII[2]] = llIIlllllll[llIlIIIIIII[1]];
        stringArray[bX.llIlIIIIIII[4]] = llIIlllllll[llIlIIIIIII[6]];
        NPC llllllllllllllllIIlllIIllIllllII = NPCs.getNearest((String[])stringArray);
        if (bX.lIlIIlIIIIlIII(llllllllllllllllIIlllIIllIllllII)) {
            return llIlIIIIIII[2];
        }
        if (bX.lIlIIlIIIIlIlI(Reachable.isInteractable((Locatable)llllllllllllllllIIlllIIllIllllII) ? 1 : 0)) {
            String[] stringArray2 = new String[llIlIIIIIII[4]];
            stringArray2[bX.llIlIIIIIII[2]] = llIIlllllll[llIlIIIIIII[7]];
            TileObject llllllllllllllllIIlllIIllIlllIll = TileObjects.getNearest((String[])stringArray2);
            if (bX.lIlIIlIIIIlIII(llllllllllllllllIIlllIIllIlllIll)) {
                return llIlIIIIIII[2];
            }
            llllllllllllllllIIlllIIllIlllIll.interact(llIIlllllll[llIlIIIIIII[8]]);
            return llIlIIIIIII[4];
        }
        f.r();
        String[] stringArray3 = new String[llIlIIIIIII[4]];
        stringArray3[bX.llIlIIIIIII[2]] = llIIlllllll[llIlIIIIIII[9]];
        if (bX.lIlIIlIIIIlIIl(llllllllllllllllIIlllIIllIllllII.hasAction(stringArray3) ? 1 : 0)) {
            llllllllllllllllIIlllIIllIllllII.interact(llIIlllllll[llIlIIIIIII[10]]);
            return llIlIIIIIII[4];
        }
        var1_1.interact(llIIlllllll[llIlIIIIIII[11]]);
        return llIlIIIIIII[4];
    }

    private static boolean lIlIIlIIIIIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIIlIIIIlIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bm() {
        String[] stringArray = new String[llIlIIIIIII[4]];
        stringArray[bX.llIlIIIIIII[2]] = llIIlllllll[llIlIIIIIII[2]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (bX.lIlIIlIIIIlIII(tileObject)) {
            return llIlIIIIIII[2];
        }
        tileObject.interact(llIIlllllll[llIlIIIIIII[4]]);
        return llIlIIIIIII[4];
    }

    protected bX(Client client, z z2, TOAConfig tOAConfig, bY bY2) {
        super(client, z2, tOAConfig);
        this.ht = bY2;
    }

    public NPC cB() {
        return NPCs.getNearest((int[])hm);
    }

    public bY cF() {
        int[] nArray = new int[llIlIIIIIII[4]];
        nArray[bX.llIlIIIIIII[2]] = llIlIIIIIII[12];
        if (bX.lIlIIlIIIIIlII(NPCs.getNearest((int[])nArray))) {
            return bY.WAVE;
        }
        int[] nArray2 = new int[llIlIIIIIII[4]];
        nArray2[bX.llIlIIIIIII[2]] = llIlIIIIIII[14];
        if (bX.lIlIIlIIIIIlII(NPCs.getNearest((int[])nArray2))) {
            return bY.JUG;
        }
        return bY.ATTACK;
    }

    public List<TileObject> cC() {
        return TileObjects.getAll((int[])hn);
    }

    private static String lIlIIlIIIIIIII(String llllllllllllllllIIlllIIlIlIlIIlI, String llllllllllllllllIIlllIIlIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIlIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), llIlIIIIIII[11]), "DES");
            Cipher llllllllllllllllIIlllIIlIlIlIlII = Cipher.getInstance("DES");
            llllllllllllllllIIlllIIlIlIlIlII.init(llIlIIIIIII[1], llllllllllllllllIIlllIIlIlIlIlIl);
            return new String(llllllllllllllllIIlllIIlIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIIlIlIlIIll) {
            llllllllllllllllIIlllIIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.gearSwapZebak();
    }

    private static boolean lIlIIlIIIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    public abstract boolean bL();

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> cE() {
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        Iterator<Projectile> llllllllllllllllIIlllIIllIllIIII = this.cG().iterator();
        while (bX.lIlIIlIIIIlIIl(llllllllllllllllIIlllIIllIllIIII.hasNext() ? 1 : 0)) {
            void llllllllllllllllIIlllIIllIllIIIl;
            bX llllllllllllllllIIlllIIllIllIIlI;
            Projectile llllllllllllllllIIlllIIllIlIllll = llllllllllllllllIIlllIIllIllIIII.next();
            LocalPoint llllllllllllllllIIlllIIllIlIlllI = llllllllllllllllIIlllIIllIlIllll.getTarget();
            if (bX.lIlIIlIIIIlIII(llllllllllllllllIIlllIIllIlIlllI)) {
                0;
                if (-1 == -1) continue;
                return null;
            }
            WorldPoint llllllllllllllllIIlllIIllIlIllIl = WorldPoint.fromLocal((Client)llllllllllllllllIIlllIIllIllIIlI.cu, (LocalPoint)llllllllllllllllIIlllIIllIlIlllI);
            if (bX.lIlIIlIIIIIllI(llllllllllllllllIIlllIIllIlIllll.getId(), llIlIIIIIII[13])) {
                llllllllllllllllIIlllIIllIllIIIl.addAll(llllllllllllllllIIlllIIllIlIllIl.toWorldArea().offset(llIlIIIIIII[1]).toWorldPointList());
                0;
                0;
                if (3 < 0) {
                    return null;
                }
            } else {
                llllllllllllllllIIlllIIllIllIIIl.add(llllllllllllllllIIlllIIllIlIllIl);
                0;
            }
            0;
            if (2 < (13 + 34 - -66 + 83 ^ 168 + 58 - 86 + 52)) continue;
            return null;
        }
        return arrayList;
    }

    @Override
    public boolean bl() {
        if (bX.lIlIIlIIIIIlll((Object)this.cF(), (Object)this.ht) && bX.lIlIIlIIIIIlII((Object)this.ht)) {
            return llIlIIIIIII[2];
        }
        return this.bL();
    }

    private static String lIlIIlIIIIIIIl(String llllllllllllllllIIlllIIlIlIlllll, String llllllllllllllllIIlllIIlIlIllllI) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIlIllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIlIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIIlIllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIIlIllIIIIl.init(llIlIIIIIII[1], llllllllllllllllIIlllIIlIllIIIlI);
            return new String(llllllllllllllllIIlllIIlIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIIlIllIIIII) {
            llllllllllllllllIIlllIIlIllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIIlII(Object object) {
        return object != null;
    }

    protected bX(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.ht = null;
    }

    public List<Projectile> cG() {
        int[] nArray = new int[llIlIIIIIII[1]];
        nArray[bX.llIlIIIIIII[2]] = llIlIIIIIII[13];
        nArray[bX.llIlIIIIIII[4]] = llIlIIIIIII[15];
        return Projectiles.getAll((int[])nArray);
    }

    private static boolean lIlIIlIIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIIllllllll(String llllllllllllllllIIlllIIlIllIllll, String llllllllllllllllIIlllIIlIlllIIll) {
        llllllllllllllllIIlllIIlIllIllll = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIIlIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIIlIlllIIlI = new StringBuilder();
        char[] llllllllllllllllIIlllIIlIlllIIIl = llllllllllllllllIIlllIIlIlllIIll.toCharArray();
        int llllllllllllllllIIlllIIlIlllIIII = llIlIIIIIII[2];
        char[] llllllllllllllllIIlllIIlIllIlIlI = llllllllllllllllIIlllIIlIllIllll.toCharArray();
        int llllllllllllllllIIlllIIlIllIlIIl = llllllllllllllllIIlllIIlIllIlIlI.length;
        int llllllllllllllllIIlllIIlIllIlIII = llIlIIIIIII[2];
        while (bX.lIlIIlIIIIIlIl(llllllllllllllllIIlllIIlIllIlIII, llllllllllllllllIIlllIIlIllIlIIl)) {
            char llllllllllllllllIIlllIIlIlllIlIl = llllllllllllllllIIlllIIlIllIlIlI[llllllllllllllllIIlllIIlIllIlIII];
            llllllllllllllllIIlllIIlIlllIIlI.append((char)(llllllllllllllllIIlllIIlIlllIlIl ^ llllllllllllllllIIlllIIlIlllIIIl[llllllllllllllllIIlllIIlIlllIIII % llllllllllllllllIIlllIIlIlllIIIl.length]));
            0;
            ++llllllllllllllllIIlllIIlIlllIIII;
            ++llllllllllllllllIIlllIIlIllIlIII;
            0;
            if (((0x87 ^ 0xC5) & ~(0x3F ^ 0x7D)) != (0xA7 ^ 0xA3)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIIlIlllIIlI);
    }
}

