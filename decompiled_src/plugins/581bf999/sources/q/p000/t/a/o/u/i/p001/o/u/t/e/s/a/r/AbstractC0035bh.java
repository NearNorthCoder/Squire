package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bh.class */
public abstract class AbstractC0035bh extends AbstractC0015ao {
    private static final /* synthetic */ int eT;
    private static final /* synthetic */ List<Point> eS;
    protected static /* synthetic */ boolean eX;
    protected static final /* synthetic */ int eR;
    private final /* synthetic */ EnumC0036bi eY;
    private static /* synthetic */ int[] lIlllIlIllI;
    protected static final /* synthetic */ int eO;
    private static final /* synthetic */ int eU;
    private static final /* synthetic */ int eW;
    private static final /* synthetic */ int eV;
    protected static final /* synthetic */ int eP;
    private static /* synthetic */ String[] lIlllIlIlII;
    protected static final /* synthetic */ List<Point> eN;
    protected static final /* synthetic */ int[] eQ;

    private static boolean lIIllIIllIlIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    public boolean bR() {
        return this.cu.getLocalPlayer().hasSpotAnim(lIlllIlIllI[11]);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return lIlllIlIllI[0];
    }

    private static boolean lIIllIIllIIlll(int i) {
        return i != 0;
    }

    static {
        lIIllIIllIIlIl();
        lIIllIIllIIlII();
        eV = lIlllIlIllI[14];
        eT = lIlllIlIllI[12];
        eO = lIlllIlIllI[0];
        eU = lIlllIlIllI[13];
        eW = lIlllIlIllI[15];
        eR = lIlllIlIllI[10];
        eP = lIlllIlIllI[11];
        Point[] pointArr = new Point[lIlllIlIllI[16]];
        pointArr[lIlllIlIllI[2]] = new Point(lIlllIlIllI[17], lIlllIlIllI[18]);
        pointArr[lIlllIlIllI[3]] = new Point(lIlllIlIllI[17], lIlllIlIllI[19]);
        pointArr[lIlllIlIllI[1]] = new Point(lIlllIlIllI[20], lIlllIlIllI[19]);
        pointArr[lIlllIlIllI[4]] = new Point(lIlllIlIllI[21], lIlllIlIllI[19]);
        pointArr[lIlllIlIllI[5]] = new Point(lIlllIlIllI[17], lIlllIlIllI[22]);
        pointArr[lIlllIlIllI[6]] = new Point(lIlllIlIllI[20], lIlllIlIllI[22]);
        pointArr[lIlllIlIllI[7]] = new Point(lIlllIlIllI[21], lIlllIlIllI[22]);
        pointArr[lIlllIlIllI[8]] = new Point(lIlllIlIllI[17], lIlllIlIllI[21]);
        pointArr[lIlllIlIllI[9]] = new Point(lIlllIlIllI[20], lIlllIlIllI[21]);
        pointArr[lIlllIlIllI[23]] = new Point(lIlllIlIllI[21], lIlllIlIllI[21]);
        pointArr[lIlllIlIllI[24]] = new Point(lIlllIlIllI[17], lIlllIlIllI[20]);
        pointArr[lIlllIlIllI[25]] = new Point(lIlllIlIllI[20], lIlllIlIllI[20]);
        pointArr[lIlllIlIllI[26]] = new Point(lIlllIlIllI[21], lIlllIlIllI[20]);
        pointArr[lIlllIlIllI[27]] = new Point(lIlllIlIllI[28], lIlllIlIllI[29]);
        pointArr[lIlllIlIllI[30]] = new Point(lIlllIlIllI[31], lIlllIlIllI[29]);
        pointArr[lIlllIlIllI[32]] = new Point(lIlllIlIllI[31], lIlllIlIllI[17]);
        pointArr[lIlllIlIllI[33]] = new Point(lIlllIlIllI[31], lIlllIlIllI[20]);
        pointArr[lIlllIlIllI[34]] = new Point(lIlllIlIllI[35], lIlllIlIllI[29]);
        pointArr[lIlllIlIllI[36]] = new Point(lIlllIlIllI[35], lIlllIlIllI[17]);
        pointArr[lIlllIlIllI[37]] = new Point(lIlllIlIllI[35], lIlllIlIllI[20]);
        pointArr[lIlllIlIllI[38]] = new Point(lIlllIlIllI[39], lIlllIlIllI[29]);
        pointArr[lIlllIlIllI[40]] = new Point(lIlllIlIllI[39], lIlllIlIllI[17]);
        pointArr[lIlllIlIllI[41]] = new Point(lIlllIlIllI[39], lIlllIlIllI[20]);
        pointArr[lIlllIlIllI[42]] = new Point(lIlllIlIllI[43], lIlllIlIllI[29]);
        pointArr[lIlllIlIllI[44]] = new Point(lIlllIlIllI[43], lIlllIlIllI[17]);
        pointArr[lIlllIlIllI[43]] = new Point(lIlllIlIllI[43], lIlllIlIllI[20]);
        pointArr[lIlllIlIllI[39]] = new Point(lIlllIlIllI[42], lIlllIlIllI[45]);
        pointArr[lIlllIlIllI[35]] = new Point(lIlllIlIllI[42], lIlllIlIllI[28]);
        pointArr[lIlllIlIllI[31]] = new Point(lIlllIlIllI[44], lIlllIlIllI[28]);
        pointArr[lIlllIlIllI[28]] = new Point(lIlllIlIllI[43], lIlllIlIllI[28]);
        pointArr[lIlllIlIllI[45]] = new Point(lIlllIlIllI[42], lIlllIlIllI[31]);
        pointArr[lIlllIlIllI[46]] = new Point(lIlllIlIllI[44], lIlllIlIllI[31]);
        pointArr[lIlllIlIllI[47]] = new Point(lIlllIlIllI[43], lIlllIlIllI[31]);
        pointArr[lIlllIlIllI[48]] = new Point(lIlllIlIllI[42], lIlllIlIllI[35]);
        pointArr[lIlllIlIllI[18]] = new Point(lIlllIlIllI[44], lIlllIlIllI[35]);
        pointArr[lIlllIlIllI[19]] = new Point(lIlllIlIllI[43], lIlllIlIllI[35]);
        pointArr[lIlllIlIllI[22]] = new Point(lIlllIlIllI[42], lIlllIlIllI[39]);
        pointArr[lIlllIlIllI[21]] = new Point(lIlllIlIllI[44], lIlllIlIllI[39]);
        pointArr[lIlllIlIllI[20]] = new Point(lIlllIlIllI[43], lIlllIlIllI[39]);
        pointArr[lIlllIlIllI[17]] = new Point(lIlllIlIllI[48], lIlllIlIllI[44]);
        pointArr[lIlllIlIllI[29]] = new Point(lIlllIlIllI[18], lIlllIlIllI[44]);
        pointArr[lIlllIlIllI[49]] = new Point(lIlllIlIllI[18], lIlllIlIllI[43]);
        pointArr[lIlllIlIllI[50]] = new Point(lIlllIlIllI[18], lIlllIlIllI[39]);
        pointArr[lIlllIlIllI[51]] = new Point(lIlllIlIllI[19], lIlllIlIllI[44]);
        pointArr[lIlllIlIllI[52]] = new Point(lIlllIlIllI[19], lIlllIlIllI[43]);
        pointArr[lIlllIlIllI[53]] = new Point(lIlllIlIllI[19], lIlllIlIllI[39]);
        pointArr[lIlllIlIllI[54]] = new Point(lIlllIlIllI[22], lIlllIlIllI[44]);
        pointArr[lIlllIlIllI[55]] = new Point(lIlllIlIllI[22], lIlllIlIllI[43]);
        pointArr[lIlllIlIllI[56]] = new Point(lIlllIlIllI[22], lIlllIlIllI[39]);
        pointArr[lIlllIlIllI[57]] = new Point(lIlllIlIllI[21], lIlllIlIllI[44]);
        pointArr[lIlllIlIllI[58]] = new Point(lIlllIlIllI[21], lIlllIlIllI[43]);
        pointArr[lIlllIlIllI[59]] = new Point(lIlllIlIllI[21], lIlllIlIllI[39]);
        eN = List.of((Object[]) pointArr);
        int[] iArr = new int[lIlllIlIllI[4]];
        iArr[lIlllIlIllI[2]] = lIlllIlIllI[60];
        iArr[lIlllIlIllI[3]] = lIlllIlIllI[61];
        iArr[lIlllIlIllI[1]] = lIlllIlIllI[62];
        eQ = iArr;
        eS = List.of(new Point(lIlllIlIllI[18], lIlllIlIllI[18]), new Point(lIlllIlIllI[28], lIlllIlIllI[19]), new Point(lIlllIlIllI[31], lIlllIlIllI[45]), new Point(lIlllIlIllI[48], lIlllIlIllI[28]));
    }

    private static boolean lIIllIIllIlIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIllIIllIllII(int i, int i2) {
        return i < i2;
    }

    public List<TileObject> bM() {
        int[] iArr = new int[lIlllIlIllI[3]];
        iArr[lIlllIlIllI[2]] = lIlllIlIllI[10];
        return TileObjects.getAll(iArr);
    }

    private static boolean lIIllIIllIllIl(int i, int i2) {
        return i <= i2;
    }

    public static boolean bV() {
        return eX;
    }

    private static boolean lIIllIIllIlIlI(Object obj) {
        return obj == null;
    }

    public static void f(boolean z) {
        eX = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0035bh(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        this(client, c0077z, tOAConfig, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        return (lIIllIIllIlIII(this.eY, bN()) && lIIllIIllIIllI(this.eY)) ? lIlllIlIllI[2] : bL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public EnumC0036bi bN() {
        NPC bO = bO();
        if (!lIIllIIllIIllI(bO) || lIIllIIllIlIll(bO.getId(), eQ[lIlllIlIllI[3]])) {
            eX = lIlllIlIllI[2];
            return EnumC0036bi.SWARM;
        }
        return EnumC0036bi.ATTACK;
    }

    private static boolean lIIllIIlllIIII(int i, int i2) {
        return i != i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.kephriGearSwap();
    }

    private static boolean lIIllIIllIlIIl(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public Set<WorldPoint> bU() {
        HashSet hashSet = new HashSet();
        for (GraphicsObject graphicsObject : this.cu.getGraphicsObjects()) {
            if (!lIIllIIlllIIII(graphicsObject.getId(), lIlllIlIllI[12]) || !lIIllIIlllIIII(graphicsObject.getId(), lIlllIlIllI[13]) || !lIIllIIlllIIII(graphicsObject.getId(), lIlllIlIllI[14]) || lIIllIIllIlIll(graphicsObject.getId(), lIlllIlIllI[15])) {
                LocalPoint location = graphicsObject.getLocation();
                if (lIIllIIllIlIlI(location)) {
                    "".length();
                    if ((69 ^ 65) <= ((37 ^ 102) & ((227 ^ 160) ^ (-1)))) {
                        return null;
                    }
                } else {
                    hashSet.add(WorldPoint.fromLocal(this.cu, location));
                    "".length();
                }
            }
            "".length();
            if ("  ".length() >= (169 ^ 173)) {
                return null;
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<WorldPoint> bS() {
        return (List) eS.stream().map(this::a).collect(Collectors.toList());
    }

    protected abstract boolean bL();

    public Direction bP() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        WorldPoint worldLocation2 = bO().getWorldLocation();
        int worldX = worldLocation.getWorldX();
        worldLocation.getWorldY();
        int worldX2 = worldLocation2.getWorldX();
        worldLocation2.getWorldY();
        if (lIIllIIllIllII(worldX, worldX2)) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bm() {
        String[] strArr = new String[lIlllIlIllI[3]];
        strArr[lIlllIlIllI[2]] = lIlllIlIlII[lIlllIlIllI[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (!lIIllIIllIIllI(nearest) || lIIllIIllIlIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            return lIlllIlIllI[2];
        }
        nearest.interact(lIlllIlIlII[lIlllIlIllI[4]]);
        return lIlllIlIllI[3];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        return e(eQ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean bQ() {
        int i;
        WorldPoint destination = Movement.getDestination();
        Player local = Players.getLocal();
        if (lIIllIIllIIlll(Movement.isRunEnabled() ? 1 : 0)) {
            i = lIlllIlIllI[1];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIlllIlIllI[3];
        }
        int i2 = i;
        if (!lIIllIIllIIllI(destination) || lIIllIIllIllIl(destination.distanceTo2D(local.getWorldLocation()), i2)) {
            ?? r0 = lIlllIlIllI[3];
            "".length();
            return "  ".length() >= (52 ^ 48) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllIlIllI[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        if (lIIllIIllIIlll(super.bn() ? 1 : 0)) {
            return lIlllIlIllI[3];
        }
        if (lIIllIIllIIlll(Dialog.isOpen() ? 1 : 0) && lIIllIIllIIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlllIlIllI[3];
        }
        String[] strArr = new String[lIlllIlIllI[1]];
        strArr[lIlllIlIllI[2]] = lIlllIlIlII[lIlllIlIllI[5]];
        strArr[lIlllIlIllI[3]] = lIlllIlIlII[lIlllIlIllI[6]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIIllIIllIlIlI(nearest)) {
            return lIlllIlIllI[2];
        }
        String[] strArr2 = new String[lIlllIlIllI[3]];
        strArr2[lIlllIlIllI[2]] = lIlllIlIlII[lIlllIlIllI[7]];
        if (lIIllIIllIIlll(nearest.hasAction(strArr2) ? 1 : 0)) {
            nearest.interact(lIlllIlIlII[lIlllIlIllI[8]]);
            return lIlllIlIllI[3];
        }
        nearest.interact(lIlllIlIlII[lIlllIlIllI[9]]);
        return lIlllIlIllI[3];
    }

    private static String lIIllIIlIllIlI(String llllllllllllllllIlIIllIIlIIIIlII, String llllllllllllllllIlIIllIIlIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIlIllI[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIllIIlIIIIlIl) {
            llllllllllllllllIlIIllIIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    public NPC bO() {
        return NPCs.getNearest(eQ);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldPoint bT() {
        for (Point point : eN) {
            WorldPoint a = a(point);
            if (lIIllIIllIlIIl(TileObjects.getAll(tileObject -> {
                if (lIIllIIllIIlll(tileObject.getWorldLocation().equals(a) ? 1 : 0) && lIIllIIllIlIll(tileObject.getId(), lIlllIlIllI[10])) {
                    ?? r0 = lIlllIlIllI[3];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlllIlIllI[2];
            }).isEmpty() ? 1 : 0)) {
                WorldPoint a2 = a(point);
                if (lIIllIIllIIlll(Reachable.isWalkable(a2) ? 1 : 0)) {
                    return a2;
                }
            }
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        for (Point point2 : eN) {
            WorldPoint a3 = a(point2);
            if (lIIllIIllIIlll(TileObjects.getAll(tileObject2 -> {
                if (lIIllIIllIIlll(tileObject2.getWorldLocation().equals(a3) ? 1 : 0) && lIIllIIllIlIll(tileObject2.getId(), lIlllIlIllI[10])) {
                    ?? r0 = lIlllIlIllI[3];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlllIlIllI[2];
            }).isEmpty() ? 1 : 0) && lIIllIIllIIlll(Reachable.isWalkable(a3) ? 1 : 0)) {
                return a3;
            }
            "".length();
            if ("  ".length() <= (((9 ^ 59) ^ (150 ^ 177)) & (((((37 + 3) - (-43)) + 92) ^ (((174 + 83) - 256) + 185)) ^ (-" ".length())))) {
                return null;
            }
        }
        return Players.getLocal().getWorldLocation();
    }

    private static boolean lIIllIIllIIllI(Object obj) {
        return obj != null;
    }

    private static String lIIllIIlIlllII(String llllllllllllllllIlIIllIIlIlIlIIl, String llllllllllllllllIlIIllIIlIlIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), lIlllIlIllI[9]), "DES");
            Cipher llllllllllllllllIlIIllIIlIlIlIll = Cipher.getInstance("DES");
            llllllllllllllllIlIIllIIlIlIlIll.init(lIlllIlIllI[1], secretKeySpec);
            return new String(llllllllllllllllIlIIllIIlIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIllIIlIlIlIlI) {
            llllllllllllllllIlIIllIIlIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIllIIlIllIll(String llllllllllllllllIlIIllIIlIIllIIl, String llllllllllllllllIlIIllIIlIIllIII) {
        String llllllllllllllllIlIIllIIlIIllIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIllIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIllIIlIIlIlll = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIllIIlIIllIII.toCharArray();
        int llllllllllllllllIlIIllIIlIIlIlIl = lIlllIlIllI[2];
        char[] charArray2 = llllllllllllllllIlIIllIIlIIllIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlllIlIllI[2];
        while (lIIllIIllIllII(i, length)) {
            char llllllllllllllllIlIIllIIlIIllIlI = charArray2[i];
            llllllllllllllllIlIIllIIlIIlIlll.append((char) (llllllllllllllllIlIIllIIlIIllIlI ^ charArray[llllllllllllllllIlIIllIIlIIlIlIl % charArray.length]));
            "".length();
            llllllllllllllllIlIIllIIlIIlIlIl++;
            i++;
            "".length();
            if (((((146 + 92) - 160) + 80) ^ (((7 + 81) - 67) + 133)) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIllIIlIIlIlll);
    }

    private static void lIIllIIllIIlIl() {
        lIlllIlIllI = new int[63];
        lIlllIlIllI[0] = (-42) & 14205;
        lIlllIlIllI[1] = "  ".length();
        lIlllIlIllI[2] = (69 ^ 93) & ((189 ^ 165) ^ (-1));
        lIlllIlIllI[3] = " ".length();
        lIlllIlIllI[4] = "   ".length();
        lIlllIlIllI[5] = (101 ^ 5) ^ (59 ^ 95);
        lIlllIlIllI[6] = (((74 + 99) - 12) + 6) ^ (((77 + 119) - 181) + 147);
        lIlllIlIllI[7] = (44 ^ 24) ^ (247 ^ 197);
        lIlllIlIllI[8] = (((65 + 127) - 79) + 42) ^ (((48 + 32) - (-28)) + 48);
        lIlllIlIllI[9] = 96 ^ 104;
        lIlllIlIllI[10] = (-1078) & 46581;
        lIlllIlIllI[11] = (-((-16455) & 30679)) & (-9) & 16378;
        lIlllIlIllI[12] = (-((-437) & 31741)) & (-17) & 32767;
        lIlllIlIllI[13] = (-((-413) & 13278)) & (-2073) & 16383;
        lIlllIlIllI[14] = (-21569) & 23679;
        lIlllIlIllI[15] = (-((-7233) & 32735)) & (-1026) & 28639;
        lIlllIlIllI[16] = (195 ^ 174) ^ (18 ^ 75);
        lIlllIlIllI[17] = 21 ^ 50;
        lIlllIlIllI[18] = 158 ^ 188;
        lIlllIlIllI[19] = 158 ^ 189;
        lIlllIlIllI[20] = (60 ^ 15) ^ (66 ^ 87);
        lIlllIlIllI[21] = (208 ^ 198) ^ (187 ^ 136);
        lIlllIlIllI[22] = (40 ^ 19) ^ (138 ^ 149);
        lIlllIlIllI[23] = 166 ^ 175;
        lIlllIlIllI[24] = 29 ^ 23;
        lIlllIlIllI[25] = 100 ^ 111;
        lIlllIlIllI[26] = (178 ^ 153) ^ (43 ^ 12);
        lIlllIlIllI[27] = (70 ^ 10) ^ (220 ^ 157);
        lIlllIlIllI[28] = (((49 + 106) - 60) + 40) ^ (((56 + 92) - 68) + 74);
        lIlllIlIllI[29] = (97 ^ 13) ^ (96 ^ 36);
        lIlllIlIllI[30] = 80 ^ 94;
        lIlllIlIllI[31] = (((91 + 98) - 151) + 96) ^ (((71 + 111) - 30) + 2);
        lIlllIlIllI[32] = (118 ^ 82) ^ (34 ^ 9);
        lIlllIlIllI[33] = (102 ^ 116) ^ "  ".length();
        lIlllIlIllI[34] = 123 ^ 106;
        lIlllIlIllI[35] = 174 ^ 181;
        lIlllIlIllI[36] = 212 ^ 198;
        lIlllIlIllI[37] = 16 ^ 3;
        lIlllIlIllI[38] = 6 ^ 18;
        lIlllIlIllI[39] = (((29 + 0) - (-5)) + 157) ^ (((46 + 93) - 41) + 67);
        lIlllIlIllI[40] = (252 ^ 192) ^ (173 ^ 132);
        lIlllIlIllI[41] = (84 ^ 125) ^ (86 ^ 105);
        lIlllIlIllI[42] = 140 ^ 155;
        lIlllIlIllI[43] = (((84 + 150) - 172) + 97) ^ (((118 + 86) - 121) + 51);
        lIlllIlIllI[44] = 126 ^ 102;
        lIlllIlIllI[45] = (38 ^ 75) ^ (237 ^ 158);
        lIlllIlIllI[46] = 220 ^ 195;
        lIlllIlIllI[47] = (251 ^ 182) ^ (6 ^ 107);
        lIlllIlIllI[48] = (199 ^ 128) ^ (19 ^ 117);
        lIlllIlIllI[49] = (67 ^ 70) ^ (177 ^ 157);
        lIlllIlIllI[50] = (((51 + 1) - 3) + 80) ^ (((66 + 164) - 82) + 23);
        lIlllIlIllI[51] = (70 ^ 45) ^ (126 ^ 62);
        lIlllIlIllI[52] = 66 ^ 110;
        lIlllIlIllI[53] = (78 ^ 35) ^ (95 ^ 31);
        lIlllIlIllI[54] = (((153 + 31) - 87) + 71) ^ (((54 + 75) - 75) + 80);
        lIlllIlIllI[55] = (98 ^ 106) ^ (98 ^ 69);
        lIlllIlIllI[56] = 42 ^ 26;
        lIlllIlIllI[57] = 107 ^ 90;
        lIlllIlIllI[58] = 33 ^ 19;
        lIlllIlIllI[59] = (24 ^ 111) ^ (40 ^ 108);
        lIlllIlIllI[60] = (-545) & 12263;
        lIlllIlIllI[61] = (-21028) & 32747;
        lIlllIlIllI[62] = (-529) & 12249;
    }

    private static void lIIllIIllIIlII() {
        lIlllIlIlII = new String[lIlllIlIllI[23]];
        lIlllIlIlII[lIlllIlIllI[2]] = lIIllIIlIllIlI("BxN6GDK/QYX8/7h5CeFpIg==", "UuQKz");
        lIlllIlIlII[lIlllIlIllI[3]] = lIIllIIlIllIlI("rFPuJ+20AXBtyOOlSNlhVg==", "VxtJS");
        lIlllIlIlII[lIlllIlIllI[1]] = lIIllIIlIllIll("ERc/BjwqACdDLzcLIBctKQ==", "ErScL");
        lIlllIlIlII[lIlllIlIllI[4]] = lIIllIIlIllIll("ODAvBAZEEDUC", "iEFgm");
        lIlllIlIlII[lIlllIlIllI[5]] = lIIllIIlIlllII("cWzKoP3tu5Gae/3JvWszmA==", "DrOEB");
        lIlllIlIlII[lIlllIlIllI[6]] = lIIllIIlIllIll("HQs1EC4mHTY=", "RxXeC");
        lIlllIlIlII[lIlllIlIllI[7]] = lIIllIIlIllIlI("IvNSwW9m46uQkZ0KACFeIQ==", "ThwRf");
        lIlllIlIlII[lIlllIlIllI[8]] = lIIllIIlIlllII("xJ2+jrl01x40YRgWRYZReQ==", "wEUcI");
        lIlllIlIlII[lIlllIlIllI[9]] = lIIllIIlIllIlI("Tcua8Tvx3SE=", "BnAWC");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0035bh(Client client, C0077z c0077z, TOAConfig tOAConfig, EnumC0036bi enumC0036bi) {
        super(client, c0077z, tOAConfig);
        this.eY = enumC0036bi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        String[] strArr = new String[lIlllIlIllI[1]];
        strArr[lIlllIlIllI[2]] = lIlllIlIlII[lIlllIlIllI[2]];
        strArr[lIlllIlIllI[3]] = lIlllIlIlII[lIlllIlIllI[3]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIIllIIllIIllI(nearest) && lIIllIIllIIlll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            ?? r0 = lIlllIlIllI[3];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllIlIllI[2];
    }
}
