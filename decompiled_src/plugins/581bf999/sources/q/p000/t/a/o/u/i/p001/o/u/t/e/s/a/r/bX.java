package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
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
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bX  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bX.class */
public abstract class bX extends AbstractC0015ao {
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

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return llIlIIIIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        int[] iArr = new int[llIlIIIIIII[1]];
        iArr[llIlIIIIIII[2]] = llIlIIIIIII[3];
        iArr[llIlIIIIIII[4]] = llIlIIIIIII[5];
        if (lIlIIlIIIIIlII(NPCs.getNearest(iArr))) {
            ?? r0 = llIlIIIIIII[4];
            "".length();
            return ((34 ^ 1) & ((98 ^ 65) ^ (-1))) > (13 ^ 9) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIIIIIII[2];
    }

    private static boolean lIlIIlIIIIlIII(Object obj) {
        return obj == null;
    }

    public WorldPoint C(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return b(worldPoint, worldPoint2, worldPoint3 -> {
            return llIlIIIIIII[4];
        });
    }

    private static boolean lIlIIlIIIIlIlI(int i) {
        return i == 0;
    }

    private static void lIlIIlIIIIIIlI() {
        llIIlllllll = new String[llIlIIIIIII[28]];
        llIIlllllll[llIlIIIIIII[2]] = lIlIIIllllllll("MC8PEjgLOBdXKxYzEAMpCA==", "dJcwH");
        llIIlllllll[llIlIIIIIII[4]] = lIlIIIllllllll("MAc/IgBMJyUk", "arVAk");
        llIIlllllll[llIlIIIIIII[1]] = lIlIIIllllllll("LSQHGRUHJQ==", "nVhwq");
        llIIlllllll[llIlIIIIIII[6]] = lIlIIIllllllll("FhIoBSEtBCs=", "YaEpL");
        llIIlllllll[llIlIIIIIII[7]] = lIlIIlIIIIIIII("5qn6xpLYIgbK20YFwSLDsmc7KmGMdnWX", "HnpIy");
        llIIlllllll[llIlIIIIIII[8]] = lIlIIlIIIIIIII("wvJXLzD72Tv/rJ9ug031tQ==", "FkyEA");
        llIIlllllll[llIlIIIIIII[9]] = lIlIIIllllllll("CSUlKzN1PCkpLj0=", "XPLHX");
        llIIlllllll[llIlIIIIIII[10]] = lIlIIIllllllll("GRAQKwZlCRwpGy0=", "HeyHm");
        llIIlllllll[llIlIIIIIII[11]] = lIlIIlIIIIIIIl("L8necxOGcoI=", "hvzTR");
        llIIlllllll[llIlIIIIIII[17]] = lIlIIlIIIIIIIl("YRB1S/iAtkL70oUPQim8Lw==", "ILuAl");
    }

    public WorldPoint a(WorldPoint worldPoint, WorldPoint worldPoint2, Predicate<WorldPoint> predicate, Comparator<WorldPoint> comparator) {
        List<TileObject> cC = cC();
        WorldArea offset = worldPoint.toWorldArea().offset(llIlIIIIIII[1]);
        if (lIlIIlIIIIlIIl(k(cC, worldPoint2) ? 1 : 0)) {
            return worldPoint2;
        }
        WorldArea worldArea = cB().getWorldArea();
        return (WorldPoint) offset.toWorldPointList().stream().filter(worldPoint3 -> {
            if (lIlIIlIIIIlIlI(k(cC, worldPoint3) ? 1 : 0)) {
                ?? r0 = llIlIIIIIII[4];
                "".length();
                return 0 != 0 ? ((75 ^ 110) ^ (140 ^ 154)) & (((((100 + 24) - 106) + 121) ^ (((101 + 76) - 52) + 59)) ^ (-" ".length())) : r0;
            }
            return llIlIIIIIII[2];
        }).filter(worldPoint4 -> {
            if (lIlIIlIIIIlIlI(worldPoint4.equals(worldPoint) ? 1 : 0)) {
                ?? r0 = llIlIIIIIII[4];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIIIIIII[2];
        }).filter(Reachable::isWalkable).filter(worldPoint5 -> {
            if (lIlIIlIIIIlIlI(worldArea.isInMeleeDistance(worldPoint5) ? 1 : 0)) {
                ?? r0 = llIlIIIIIII[4];
                "".length();
                return 0 != 0 ? ((182 ^ 195) ^ (181 ^ 137)) & (((36 ^ 114) ^ (188 ^ 163)) ^ (-" ".length())) : r0;
            }
            return llIlIIIIIII[2];
        }).filter(worldPoint6 -> {
            if (lIlIIlIIIIlIll(worldArea.distanceTo2D(worldPoint6), llIlIIIIIII[4])) {
                ?? r0 = llIlIIIIIII[4];
                "".length();
                return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIIIIIII[2];
        }).filter(worldPoint7 -> {
            return worldPoint.pathTo(this.cu, worldPoint7).stream().allMatch(predicate);
        }).min(comparator).orElse(worldPoint2);
    }

    private static boolean lIlIIlIIIIIlIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIlIIlIIIIIIll();
        lIlIIlIIIIIIlI();
        hj = llIlIIIIIII[14];
        hk = llIlIIIIIII[16];
        hp = llIlIIIIIII[5];
        hq = llIlIIIIIII[13];
        hr = llIlIIIIIII[15];
        hs = llIlIIIIIII[18];
        hi = llIlIIIIIII[12];
        hl = llIlIIIIIII[0];
        ho = llIlIIIIIII[3];
        int[] iArr = new int[llIlIIIIIII[1]];
        iArr[llIlIIIIIII[2]] = llIlIIIIIII[19];
        iArr[llIlIIIIIII[4]] = llIlIIIIIII[20];
        hm = iArr;
        int[] iArr2 = new int[llIlIIIIIII[11]];
        iArr2[llIlIIIIIII[2]] = llIlIIIIIII[21];
        iArr2[llIlIIIIIII[4]] = llIlIIIIIII[22];
        iArr2[llIlIIIIIII[1]] = llIlIIIIIII[23];
        iArr2[llIlIIIIIII[6]] = llIlIIIIIII[24];
        iArr2[llIlIIIIIII[7]] = llIlIIIIIII[25];
        iArr2[llIlIIIIIII[8]] = llIlIIIIIII[26];
        iArr2[llIlIIIIIII[9]] = llIlIIIIIII[21];
        iArr2[llIlIIIIIII[10]] = llIlIIIIIII[27];
        hn = iArr2;
    }

    public List<NPC> cD() {
        int[] iArr = new int[llIlIIIIIII[4]];
        iArr[llIlIIIIIII[2]] = llIlIIIIIII[12];
        return NPCs.getAll(iArr);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.specGearZebak();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bq() {
        if (lIlIIlIIIIIlll(cF(), bY.ATTACK)) {
            ?? r0 = llIlIIIIIII[4];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIIIIIII[2];
    }

    private static boolean lIlIIlIIIIllII(int i, int i2) {
        return i != i2;
    }

    public WorldPoint b(WorldPoint worldPoint, WorldPoint worldPoint2, Predicate<WorldPoint> predicate) {
        return a(worldPoint, worldPoint2, predicate, Comparator.comparingInt(worldPoint3 -> {
            return worldPoint3.distanceTo(worldPoint2);
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean P(WorldPoint worldPoint) {
        WorldArea worldArea = cB().getWorldArea();
        if (lIlIIlIIIIlIlI(p(worldPoint) ? 1 : 0) && lIlIIlIIIIlIlI(worldArea.isInMeleeDistance(worldPoint) ? 1 : 0) && lIlIIlIIIIlIll(worldArea.distanceTo2D(worldPoint), llIlIIIIIII[4])) {
            ?? r0 = llIlIIIIIII[4];
            "".length();
            return "   ".length() == 0 ? ((120 ^ 4) ^ (29 ^ 76)) & (((99 ^ 39) ^ (215 ^ 190)) ^ (-" ".length())) : r0;
        }
        return llIlIIIIIII[2];
    }

    public NPC cA() {
        return NPCs.getNearest(npc -> {
            if ((!lIlIIlIIIIllII(npc.getId(), llIlIIIIIII[16]) || lIlIIlIIIIlIIl(npc.getName().equals(llIIlllllll[llIlIIIIIII[17]]) ? 1 : 0)) && lIlIIlIIIIlIlI(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIlIIIIIII[4];
                "".length();
                return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIIIIIII[2];
        });
    }

    private static void lIlIIlIIIIIIll() {
        llIlIIIIIII = new int[29];
        llIlIIIIIII[0] = (-33) & 15732;
        llIlIIIIIII[1] = "  ".length();
        llIlIIIIIII[2] = ((((243 + 80) - 170) + 100) ^ (((147 + 161) - 153) + 10)) & (((((28 + 168) - 90) + 135) ^ (((112 + 62) - 41) + 36)) ^ (-" ".length()));
        llIlIIIIIII[3] = (-533) & 12191;
        llIlIIIIIII[4] = " ".length();
        llIlIIIIIII[5] = (-((-12953) & 29403)) & (-529) & 28667;
        llIlIIIIIII[6] = "   ".length();
        llIlIIIIIII[7] = (93 ^ 65) ^ (108 ^ 116);
        llIlIIIIIII[8] = 77 ^ 72;
        llIlIIIIIII[9] = 191 ^ 185;
        llIlIIIIIII[10] = (((152 + 50) - 102) + 56) ^ (((94 + 110) - 116) + 67);
        llIlIIIIIII[11] = (40 ^ 34) ^ "  ".length();
        llIlIIIIIII[12] = (-20481) & 32218;
        llIlIIIIIII[13] = (-((-5259) & 31919)) & (-129) & 28343;
        llIlIIIIIII[14] = (-37) & 11773;
        llIlIIIIIII[15] = (-22341) & 24534;
        llIlIIIIIII[16] = (-((-9093) & 29605)) & (-1) & 32255;
        llIlIIIIIII[17] = 3 ^ 10;
        llIlIIIIIII[18] = (-23171) & 23547;
        llIlIIIIIII[19] = (-16909) & 28638;
        llIlIIIIIII[20] = (-((-10113) & 26507)) & (-33) & 28158;
        llIlIIIIIII[21] = (-((-14595) & 15871)) & (-2305) & 49150;
        llIlIIIIIII[22] = (-((-673) & 18411)) & (-2097) & 65406;
        llIlIIIIIII[23] = (-16507) & 62079;
        llIlIIIIIII[24] = (-((-4385) & 23027)) & (-257) & 64474;
        llIlIIIIIII[25] = (-1241) & 46815;
        llIlIIIIIII[26] = (-((-10243) & 11687)) & (-73) & 47087;
        llIlIIIIIII[27] = (-313) & 45886;
        llIlIIIIIII[28] = 3 ^ 9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        int[] iArr = hm;
        int length = iArr.length;
        int i = llIlIIIIIII[2];
        while (lIlIIlIIIIIlIl(i, length)) {
            if (lIlIIlIIIIIllI(aX(), iArr[i])) {
                return llIlIIIIIII[4];
            }
            i++;
            "".length();
            if ((((189 ^ 152) ^ (137 ^ 141)) & (((80 ^ 108) ^ (23 ^ 10)) ^ (-" ".length()))) > "  ".length()) {
                return ((((95 + 53) - 39) + 43) ^ (((127 + 54) - 111) + 101)) & (("   ".length() ^ (174 ^ 158)) ^ (-" ".length()));
            }
        }
        return llIlIIIIIII[2];
    }

    public boolean k(List<TileObject> list, WorldPoint worldPoint) {
        return list.stream().anyMatch(tileObject -> {
            return tileObject.getWorldLocation().equals(worldPoint);
        });
    }

    public boolean p(WorldPoint worldPoint) {
        return cC().stream().anyMatch(tileObject -> {
            return tileObject.getWorldLocation().equals(worldPoint);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        if (lIlIIlIIIIlIIl(super.bn() ? 1 : 0)) {
            return llIlIIIIIII[4];
        }
        if (lIlIIlIIIIlIIl(Dialog.isOpen() ? 1 : 0) && lIlIIlIIIIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIlIIIIIII[4];
        }
        String[] strArr = new String[llIlIIIIIII[1]];
        strArr[llIlIIIIIII[2]] = llIIlllllll[llIlIIIIIII[1]];
        strArr[llIlIIIIIII[4]] = llIIlllllll[llIlIIIIIII[6]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlIIlIIIIlIII(nearest)) {
            return llIlIIIIIII[2];
        }
        if (lIlIIlIIIIlIlI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            String[] strArr2 = new String[llIlIIIIIII[4]];
            strArr2[llIlIIIIIII[2]] = llIIlllllll[llIlIIIIIII[7]];
            TileObject nearest2 = TileObjects.getNearest(strArr2);
            if (lIlIIlIIIIlIII(nearest2)) {
                return llIlIIIIIII[2];
            }
            nearest2.interact(llIIlllllll[llIlIIIIIII[8]]);
            return llIlIIIIIII[4];
        }
        C0057f.r();
        String[] strArr3 = new String[llIlIIIIIII[4]];
        strArr3[llIlIIIIIII[2]] = llIIlllllll[llIlIIIIIII[9]];
        if (lIlIIlIIIIlIIl(nearest.hasAction(strArr3) ? 1 : 0)) {
            nearest.interact(llIIlllllll[llIlIIIIIII[10]]);
            return llIlIIIIIII[4];
        }
        nearest.interact(llIIlllllll[llIlIIIIIII[11]]);
        return llIlIIIIIII[4];
    }

    private static boolean lIlIIlIIIIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIIlIIIIlIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bm() {
        String[] strArr = new String[llIlIIIIIII[4]];
        strArr[llIlIIIIIII[2]] = llIIlllllll[llIlIIIIIII[2]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIIlIIIIlIII(nearest)) {
            return llIlIIIIIII[2];
        }
        nearest.interact(llIIlllllll[llIlIIIIIII[4]]);
        return llIlIIIIIII[4];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bX(Client client, C0077z c0077z, TOAConfig tOAConfig, bY bYVar) {
        super(client, c0077z, tOAConfig);
        this.ht = bYVar;
    }

    public NPC cB() {
        return NPCs.getNearest(hm);
    }

    public bY cF() {
        int[] iArr = new int[llIlIIIIIII[4]];
        iArr[llIlIIIIIII[2]] = llIlIIIIIII[12];
        if (lIlIIlIIIIIlII(NPCs.getNearest(iArr))) {
            return bY.WAVE;
        }
        int[] iArr2 = new int[llIlIIIIIII[4]];
        iArr2[llIlIIIIIII[2]] = llIlIIIIIII[14];
        return lIlIIlIIIIIlII(NPCs.getNearest(iArr2)) ? bY.JUG : bY.ATTACK;
    }

    public List<TileObject> cC() {
        return TileObjects.getAll(hn);
    }

    private static String lIlIIlIIIIIIII(String llllllllllllllllIIlllIIlIlIlIIlI, String llllllllllllllllIIlllIIlIlIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), llIlIIIIIII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIIIIII[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIIlIlIlIIll) {
            llllllllllllllllIIlllIIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.gearSwapZebak();
    }

    private static boolean lIlIIlIIIIlIll(int i, int i2) {
        return i > i2;
    }

    public abstract boolean bL();

    public List<WorldPoint> cE() {
        ArrayList arrayList = new ArrayList();
        for (Projectile projectile : cG()) {
            LocalPoint target = projectile.getTarget();
            if (lIlIIlIIIIlIII(target)) {
                "".length();
                if ((-" ".length()) != (-" ".length())) {
                    return null;
                }
            } else {
                WorldPoint fromLocal = WorldPoint.fromLocal(this.cu, target);
                if (lIlIIlIIIIIllI(projectile.getId(), llIlIIIIIII[13])) {
                    arrayList.addAll(fromLocal.toWorldArea().offset(llIlIIIIIII[1]).toWorldPointList());
                    "".length();
                    "".length();
                    if ("   ".length() < 0) {
                        return null;
                    }
                } else {
                    arrayList.add(fromLocal);
                    "".length();
                }
                "".length();
                if ("  ".length() >= ((((13 + 34) - (-66)) + 83) ^ (((168 + 58) - 86) + 52))) {
                    return null;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        return (lIlIIlIIIIIlll(cF(), this.ht) && lIlIIlIIIIIlII(this.ht)) ? llIlIIIIIII[2] : bL();
    }

    private static String lIlIIlIIIIIIIl(String llllllllllllllllIIlllIIlIlIlllll, String llllllllllllllllIIlllIIlIlIllllI) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIlIllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIlIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIIlIllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIIlIllIIIIl.init(llIlIIIIIII[1], llllllllllllllllIIlllIIlIllIIIlI);
            return new String(llllllllllllllllIIlllIIlIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIIlIllIIIII) {
            llllllllllllllllIIlllIIlIllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIIlII(Object obj) {
        return obj != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bX(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
        this.ht = null;
    }

    public List<Projectile> cG() {
        int[] iArr = new int[llIlIIIIIII[1]];
        iArr[llIlIIIIIII[2]] = llIlIIIIIII[13];
        iArr[llIlIIIIIII[4]] = llIlIIIIIII[15];
        return Projectiles.getAll(iArr);
    }

    private static boolean lIlIIlIIIIIllI(int i, int i2) {
        return i == i2;
    }

    private static String lIlIIIllllllll(String llllllllllllllllIIlllIIlIlllIlII, String llllllllllllllllIIlllIIlIlllIIll) {
        String llllllllllllllllIIlllIIlIlllIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIIlIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlllIIlIlllIIll.toCharArray();
        int llllllllllllllllIIlllIIlIlllIIII = llIlIIIIIII[2];
        char[] charArray2 = llllllllllllllllIIlllIIlIlllIlII2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIIIII[2];
        while (lIlIIlIIIIIlIl(i, length)) {
            char llllllllllllllllIIlllIIlIlllIlIl = charArray2[i];
            sb.append((char) (llllllllllllllllIIlllIIlIlllIlIl ^ charArray[llllllllllllllllIIlllIIlIlllIIII % charArray.length]));
            "".length();
            llllllllllllllllIIlllIIlIlllIIII++;
            i++;
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) == (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
