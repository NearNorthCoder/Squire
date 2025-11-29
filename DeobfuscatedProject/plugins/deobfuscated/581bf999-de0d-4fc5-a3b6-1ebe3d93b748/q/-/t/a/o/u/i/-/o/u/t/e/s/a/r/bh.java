/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.Direction
 *  net.runelite.api.coords.LocalPoint
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bi;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class bh
extends ao {
    private static final /* synthetic */ int eT;
    private static final /* synthetic */ List<Point> eS;
    protected static /* synthetic */ boolean eX;
    protected static final /* synthetic */ int eR;
    private final /* synthetic */ bi eY;
    private static /* synthetic */ int[] lIlllIlIllI;
    protected static final /* synthetic */ int eO;
    private static final /* synthetic */ int eU;
    private static final /* synthetic */ int eW;
    private static final /* synthetic */ int eV;
    protected static final /* synthetic */ int eP;
    private static /* synthetic */ String[] lIlllIlIlII;
    protected static final /* synthetic */ List<Point> eN;
    protected static final /* synthetic */ int[] eQ;

    private static boolean lIIllIIllIlIII(Object object, Object object2) {
        return object != object2;
    }

    public boolean bR() {
        Player player = this.cu.getLocalPlayer();
        return player.hasSpotAnim(lIlllIlIllI[11]);
    }

    @Override
    public int bi() {
        return lIlllIlIllI[0];
    }

    private static boolean lIIllIIllIIlll(int n2) {
        return n2 != 0;
    }

    static {
        bh.lIIllIIllIIlIl();
        bh.lIIllIIllIIlII();
        eV = lIlllIlIllI[14];
        eT = lIlllIlIllI[12];
        eO = lIlllIlIllI[0];
        eU = lIlllIlIllI[13];
        eW = lIlllIlIllI[15];
        eR = lIlllIlIllI[10];
        eP = lIlllIlIllI[11];
        Point[] pointArray = new Point[lIlllIlIllI[16]];
        pointArray[bh.lIlllIlIllI[2]] = new Point(lIlllIlIllI[17], lIlllIlIllI[18]);
        pointArray[bh.lIlllIlIllI[3]] = new Point(lIlllIlIllI[17], lIlllIlIllI[19]);
        pointArray[bh.lIlllIlIllI[1]] = new Point(lIlllIlIllI[20], lIlllIlIllI[19]);
        pointArray[bh.lIlllIlIllI[4]] = new Point(lIlllIlIllI[21], lIlllIlIllI[19]);
        pointArray[bh.lIlllIlIllI[5]] = new Point(lIlllIlIllI[17], lIlllIlIllI[22]);
        pointArray[bh.lIlllIlIllI[6]] = new Point(lIlllIlIllI[20], lIlllIlIllI[22]);
        pointArray[bh.lIlllIlIllI[7]] = new Point(lIlllIlIllI[21], lIlllIlIllI[22]);
        pointArray[bh.lIlllIlIllI[8]] = new Point(lIlllIlIllI[17], lIlllIlIllI[21]);
        pointArray[bh.lIlllIlIllI[9]] = new Point(lIlllIlIllI[20], lIlllIlIllI[21]);
        pointArray[bh.lIlllIlIllI[23]] = new Point(lIlllIlIllI[21], lIlllIlIllI[21]);
        pointArray[bh.lIlllIlIllI[24]] = new Point(lIlllIlIllI[17], lIlllIlIllI[20]);
        pointArray[bh.lIlllIlIllI[25]] = new Point(lIlllIlIllI[20], lIlllIlIllI[20]);
        pointArray[bh.lIlllIlIllI[26]] = new Point(lIlllIlIllI[21], lIlllIlIllI[20]);
        pointArray[bh.lIlllIlIllI[27]] = new Point(lIlllIlIllI[28], lIlllIlIllI[29]);
        pointArray[bh.lIlllIlIllI[30]] = new Point(lIlllIlIllI[31], lIlllIlIllI[29]);
        pointArray[bh.lIlllIlIllI[32]] = new Point(lIlllIlIllI[31], lIlllIlIllI[17]);
        pointArray[bh.lIlllIlIllI[33]] = new Point(lIlllIlIllI[31], lIlllIlIllI[20]);
        pointArray[bh.lIlllIlIllI[34]] = new Point(lIlllIlIllI[35], lIlllIlIllI[29]);
        pointArray[bh.lIlllIlIllI[36]] = new Point(lIlllIlIllI[35], lIlllIlIllI[17]);
        pointArray[bh.lIlllIlIllI[37]] = new Point(lIlllIlIllI[35], lIlllIlIllI[20]);
        pointArray[bh.lIlllIlIllI[38]] = new Point(lIlllIlIllI[39], lIlllIlIllI[29]);
        pointArray[bh.lIlllIlIllI[40]] = new Point(lIlllIlIllI[39], lIlllIlIllI[17]);
        pointArray[bh.lIlllIlIllI[41]] = new Point(lIlllIlIllI[39], lIlllIlIllI[20]);
        pointArray[bh.lIlllIlIllI[42]] = new Point(lIlllIlIllI[43], lIlllIlIllI[29]);
        pointArray[bh.lIlllIlIllI[44]] = new Point(lIlllIlIllI[43], lIlllIlIllI[17]);
        pointArray[bh.lIlllIlIllI[43]] = new Point(lIlllIlIllI[43], lIlllIlIllI[20]);
        pointArray[bh.lIlllIlIllI[39]] = new Point(lIlllIlIllI[42], lIlllIlIllI[45]);
        pointArray[bh.lIlllIlIllI[35]] = new Point(lIlllIlIllI[42], lIlllIlIllI[28]);
        pointArray[bh.lIlllIlIllI[31]] = new Point(lIlllIlIllI[44], lIlllIlIllI[28]);
        pointArray[bh.lIlllIlIllI[28]] = new Point(lIlllIlIllI[43], lIlllIlIllI[28]);
        pointArray[bh.lIlllIlIllI[45]] = new Point(lIlllIlIllI[42], lIlllIlIllI[31]);
        pointArray[bh.lIlllIlIllI[46]] = new Point(lIlllIlIllI[44], lIlllIlIllI[31]);
        pointArray[bh.lIlllIlIllI[47]] = new Point(lIlllIlIllI[43], lIlllIlIllI[31]);
        pointArray[bh.lIlllIlIllI[48]] = new Point(lIlllIlIllI[42], lIlllIlIllI[35]);
        pointArray[bh.lIlllIlIllI[18]] = new Point(lIlllIlIllI[44], lIlllIlIllI[35]);
        pointArray[bh.lIlllIlIllI[19]] = new Point(lIlllIlIllI[43], lIlllIlIllI[35]);
        pointArray[bh.lIlllIlIllI[22]] = new Point(lIlllIlIllI[42], lIlllIlIllI[39]);
        pointArray[bh.lIlllIlIllI[21]] = new Point(lIlllIlIllI[44], lIlllIlIllI[39]);
        pointArray[bh.lIlllIlIllI[20]] = new Point(lIlllIlIllI[43], lIlllIlIllI[39]);
        pointArray[bh.lIlllIlIllI[17]] = new Point(lIlllIlIllI[48], lIlllIlIllI[44]);
        pointArray[bh.lIlllIlIllI[29]] = new Point(lIlllIlIllI[18], lIlllIlIllI[44]);
        pointArray[bh.lIlllIlIllI[49]] = new Point(lIlllIlIllI[18], lIlllIlIllI[43]);
        pointArray[bh.lIlllIlIllI[50]] = new Point(lIlllIlIllI[18], lIlllIlIllI[39]);
        pointArray[bh.lIlllIlIllI[51]] = new Point(lIlllIlIllI[19], lIlllIlIllI[44]);
        pointArray[bh.lIlllIlIllI[52]] = new Point(lIlllIlIllI[19], lIlllIlIllI[43]);
        pointArray[bh.lIlllIlIllI[53]] = new Point(lIlllIlIllI[19], lIlllIlIllI[39]);
        pointArray[bh.lIlllIlIllI[54]] = new Point(lIlllIlIllI[22], lIlllIlIllI[44]);
        pointArray[bh.lIlllIlIllI[55]] = new Point(lIlllIlIllI[22], lIlllIlIllI[43]);
        pointArray[bh.lIlllIlIllI[56]] = new Point(lIlllIlIllI[22], lIlllIlIllI[39]);
        pointArray[bh.lIlllIlIllI[57]] = new Point(lIlllIlIllI[21], lIlllIlIllI[44]);
        pointArray[bh.lIlllIlIllI[58]] = new Point(lIlllIlIllI[21], lIlllIlIllI[43]);
        pointArray[bh.lIlllIlIllI[59]] = new Point(lIlllIlIllI[21], lIlllIlIllI[39]);
        eN = List.of(pointArray);
        int[] nArray = new int[lIlllIlIllI[4]];
        nArray[bh.lIlllIlIllI[2]] = lIlllIlIllI[60];
        nArray[bh.lIlllIlIllI[3]] = lIlllIlIllI[61];
        nArray[bh.lIlllIlIllI[1]] = lIlllIlIllI[62];
        eQ = nArray;
        eS = List.of(new Point(lIlllIlIllI[18], lIlllIlIllI[18]), new Point(lIlllIlIllI[28], lIlllIlIllI[19]), new Point(lIlllIlIllI[31], lIlllIlIllI[45]), new Point(lIlllIlIllI[48], lIlllIlIllI[28]));
    }

    private static boolean lIIllIIllIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIIllIllII(int n2, int n3) {
        return n2 < n3;
    }

    public List<TileObject> bM() {
        int[] nArray = new int[lIlllIlIllI[3]];
        nArray[bh.lIlllIlIllI[2]] = lIlllIlIllI[10];
        return TileObjects.getAll((int[])nArray);
    }

    private static boolean lIIllIIllIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    public static boolean bV() {
        return eX;
    }

    private static boolean lIIllIIllIlIlI(Object object) {
        return object == null;
    }

    public static void f(boolean bl2) {
        eX = bl2;
    }

    protected bh(Client client, z z2, TOAConfig tOAConfig) {
        this(client, z2, tOAConfig, null);
    }

    @Override
    public boolean bl() {
        if (bh.lIIllIIllIlIII((Object)this.eY, (Object)this.bN()) && bh.lIIllIIllIIllI((Object)this.eY)) {
            return lIlllIlIllI[2];
        }
        return this.bL();
    }

    public bi bN() {
        NPC nPC = this.bO();
        if (!bh.lIIllIIllIIllI(nPC) || bh.lIIllIIllIlIll(nPC.getId(), eQ[lIlllIlIllI[3]])) {
            eX = lIlllIlIllI[2];
            return bi.SWARM;
        }
        return bi.ATTACK;
    }

    private static boolean lIIllIIlllIIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.kephriGearSwap();
    }

    private static boolean lIIllIIllIlIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    protected Set<WorldPoint> bU() {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        Iterator llllllllllllllllIlIIllIIlIllllII = this.cu.getGraphicsObjects().iterator();
        while (bh.lIIllIIllIIlll(llllllllllllllllIlIIllIIlIllllII.hasNext() ? 1 : 0)) {
            GraphicsObject llllllllllllllllIlIIllIIlIlllIll = (GraphicsObject)llllllllllllllllIlIIllIIlIllllII.next();
            if (!bh.lIIllIIlllIIII(llllllllllllllllIlIIllIIlIlllIll.getId(), lIlllIlIllI[12]) || !bh.lIIllIIlllIIII(llllllllllllllllIlIIllIIlIlllIll.getId(), lIlllIlIllI[13]) || !bh.lIIllIIlllIIII(llllllllllllllllIlIIllIIlIlllIll.getId(), lIlllIlIllI[14]) || bh.lIIllIIllIlIll(llllllllllllllllIlIIllIIlIlllIll.getId(), lIlllIlIllI[15])) {
                void llllllllllllllllIlIIllIIlIllllIl;
                bh llllllllllllllllIlIIllIIlIlllllI;
                LocalPoint llllllllllllllllIlIIllIIlIlllIlI = llllllllllllllllIlIIllIIlIlllIll.getLocation();
                if (bh.lIIllIIllIlIlI(llllllllllllllllIlIIllIIlIlllIlI)) {
                    0;
                    if ((0x45 ^ 0x41) > ((0x25 ^ 0x66) & ~(0xE3 ^ 0xA0))) continue;
                    return null;
                }
                WorldPoint llllllllllllllllIlIIllIIlIlllIIl = WorldPoint.fromLocal((Client)llllllllllllllllIlIIllIIlIlllllI.cu, (LocalPoint)llllllllllllllllIlIIllIIlIlllIlI);
                llllllllllllllllIlIIllIIlIllllIl.add(llllllllllllllllIlIIllIIlIlllIIl);
                0;
            }
            0;
            if (2 < (0xA9 ^ 0xAD)) continue;
            return null;
        }
        return hashSet;
    }

    protected List<WorldPoint> bS() {
        return eS.stream().map(this::a).collect(Collectors.toList());
    }

    protected abstract boolean bL();

    public Direction bP() {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        WorldPoint worldPoint2 = this.bO().getWorldLocation();
        int n2 = worldPoint.getWorldX();
        int n3 = worldPoint.getWorldY();
        int n4 = worldPoint2.getWorldX();
        int n5 = worldPoint2.getWorldY();
        if (bh.lIIllIIllIllII(n2, n4)) {
            // empty if block
        }
        return null;
    }

    @Override
    public boolean bm() {
        String[] stringArray = new String[lIlllIlIllI[3]];
        stringArray[bh.lIlllIlIllI[2]] = lIlllIlIlII[lIlllIlIllI[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (!bh.lIIllIIllIIllI(tileObject) || bh.lIIllIIllIlIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
            return lIlllIlIllI[2];
        }
        tileObject.interact(lIlllIlIlII[lIlllIlIllI[4]]);
        return lIlllIlIllI[3];
    }

    @Override
    public boolean bk() {
        return this.e(eQ);
    }

    /*
     * WARNING - void declaration
     */
    public boolean bQ() {
        boolean bl2;
        void llllllllllllllllIlIIllIIllIlIIII;
        void llllllllllllllllIlIIllIIllIlIIIl;
        int llllllllllllllllIlIIllIIllIIllll;
        int n2;
        WorldPoint worldPoint = Movement.getDestination();
        Player player = Players.getLocal();
        if (bh.lIIllIIllIIlll(Movement.isRunEnabled() ? 1 : 0)) {
            n2 = lIlllIlIllI[1];
            0;
            if (null != null) {
                return ((0x59 ^ 0x47) & ~(0x74 ^ 0x6A)) != 0;
            }
        } else {
            n2 = llllllllllllllllIlIIllIIllIIllll = lIlllIlIllI[3];
        }
        if (!bh.lIIllIIllIIllI(llllllllllllllllIlIIllIIllIlIIIl) || bh.lIIllIIllIllIl(llllllllllllllllIlIIllIIllIlIIIl.distanceTo2D(llllllllllllllllIlIIllIIllIlIIII.getWorldLocation()), llllllllllllllllIlIIllIIllIIllll)) {
            bl2 = lIlllIlIllI[3];
            0;
            if (2 >= (0x34 ^ 0x30)) {
                return ((0xBD ^ 0xA3) & ~(0x8E ^ 0x90)) != 0;
            }
        } else {
            bl2 = lIlllIlIllI[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (bh.lIIllIIllIIlll(super.bn() ? 1 : 0)) {
            return lIlllIlIllI[3];
        }
        if (bh.lIIllIIllIIlll(Dialog.isOpen() ? 1 : 0) && bh.lIIllIIllIIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlllIlIllI[3];
        }
        String[] stringArray = new String[lIlllIlIllI[1]];
        stringArray[bh.lIlllIlIllI[2]] = lIlllIlIlII[lIlllIlIllI[5]];
        stringArray[bh.lIlllIlIllI[3]] = lIlllIlIlII[lIlllIlIllI[6]];
        NPC llllllllllllllllIlIIllIIlllIIlll = NPCs.getNearest((String[])stringArray);
        if (bh.lIIllIIllIlIlI(llllllllllllllllIlIIllIIlllIIlll)) {
            return lIlllIlIllI[2];
        }
        String[] stringArray2 = new String[lIlllIlIllI[3]];
        stringArray2[bh.lIlllIlIllI[2]] = lIlllIlIlII[lIlllIlIllI[7]];
        if (bh.lIIllIIllIIlll(llllllllllllllllIlIIllIIlllIIlll.hasAction(stringArray2) ? 1 : 0)) {
            llllllllllllllllIlIIllIIlllIIlll.interact(lIlllIlIlII[lIlllIlIllI[8]]);
            return lIlllIlIllI[3];
        }
        var1_1.interact(lIlllIlIlII[lIlllIlIllI[9]]);
        return lIlllIlIllI[3];
    }

    private static String lIIllIIlIllIlI(String llllllllllllllllIlIIllIIlIIIIIlI, String llllllllllllllllIlIIllIIlIIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIllIIlIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIllIIlIIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIllIIlIIIIllI.init(lIlllIlIllI[1], llllllllllllllllIlIIllIIlIIIIlll);
            return new String(llllllllllllllllIlIIllIIlIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIllIIlIIIIlIl) {
            llllllllllllllllIlIIllIIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    public NPC bO() {
        return NPCs.getNearest((int[])eQ);
    }

    protected WorldPoint bT() {
        WorldPoint llllllllllllllllIlIIllIIllIIIllI;
        bh llllllllllllllllIlIIllIIllIIlIIl;
        Point llllllllllllllllIlIIllIIllIIIlll;
        Iterator<Point> llllllllllllllllIlIIllIIllIIlIII = eN.iterator();
        while (bh.lIIllIIllIIlll(llllllllllllllllIlIIllIIllIIlIII.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllllIlIIllIIllIIIlIl;
            llllllllllllllllIlIIllIIllIIIlll = llllllllllllllllIlIIllIIllIIlIII.next();
            llllllllllllllllIlIIllIIllIIIllI = llllllllllllllllIlIIllIIllIIlIIl.a(llllllllllllllllIlIIllIIllIIIlll);
            if (bh.lIIllIIllIlIIl(TileObjects.getAll(tileObject -> {
                int n2;
                if (bh.lIIllIIllIIlll(tileObject.getWorldLocation().equals((Object)llllllllllllllllIlIIllIIllIIIllI) ? 1 : 0) && bh.lIIllIIllIlIll(tileObject.getId(), lIlllIlIllI[10])) {
                    n2 = lIlllIlIllI[3];
                    0;
                    if (((0x2A ^ 0x19) & ~(0xAF ^ 0x9C)) != 0) {
                        return ((0x7A ^ 0x48) & ~(0xBC ^ 0x8E)) != 0;
                    }
                } else {
                    n2 = lIlllIlIllI[2];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && bh.lIIllIIllIIlll(Reachable.isWalkable((WorldPoint)(llllllllllllllllIlIIllIIllIIIlIl = llllllllllllllllIlIIllIIllIIlIIl.a(llllllllllllllllIlIIllIIllIIIlll))) ? 1 : 0)) {
                return llllllllllllllllIlIIllIIllIIIlIl;
            }
            0;
            if (2 < 3) continue;
            return null;
        }
        llllllllllllllllIlIIllIIllIIlIII = eN.iterator();
        while (bh.lIIllIIllIIlll(llllllllllllllllIlIIllIIllIIlIII.hasNext() ? 1 : 0)) {
            llllllllllllllllIlIIllIIllIIIlll = llllllllllllllllIlIIllIIllIIlIII.next();
            llllllllllllllllIlIIllIIllIIIllI = llllllllllllllllIlIIllIIllIIlIIl.a(llllllllllllllllIlIIllIIllIIIlll);
            if (bh.lIIllIIllIIlll(TileObjects.getAll(tileObject -> {
                int n2;
                if (bh.lIIllIIllIIlll(tileObject.getWorldLocation().equals((Object)llllllllllllllllIlIIllIIllIIIllI) ? 1 : 0) && bh.lIIllIIllIlIll(tileObject.getId(), lIlllIlIllI[10])) {
                    n2 = lIlllIlIllI[3];
                    0;
                    if (null != null) {
                        return ((0xCB ^ 0x92) & ~(0x43 ^ 0x1A)) != 0;
                    }
                } else {
                    n2 = lIlllIlIllI[2];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && bh.lIIllIIllIIlll(Reachable.isWalkable((WorldPoint)llllllllllllllllIlIIllIIllIIIllI) ? 1 : 0)) {
                return llllllllllllllllIlIIllIIllIIIllI;
            }
            0;
            if (2 > ((9 ^ 0x3B ^ (0x96 ^ 0xB1)) & (37 + 3 - -43 + 92 ^ 174 + 83 - 256 + 185 ^ -1))) continue;
            return null;
        }
        return Players.getLocal().getWorldLocation();
    }

    private static boolean lIIllIIllIIllI(Object object) {
        return object != null;
    }

    private static String lIIllIIlIlllII(String llllllllllllllllIlIIllIIlIlIlIIl, String llllllllllllllllIlIIllIIlIlIlIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIllIIlIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), lIlllIlIllI[9]), "DES");
            Cipher llllllllllllllllIlIIllIIlIlIlIll = Cipher.getInstance("DES");
            llllllllllllllllIlIIllIIlIlIlIll.init(lIlllIlIllI[1], llllllllllllllllIlIIllIIlIlIllII);
            return new String(llllllllllllllllIlIIllIIlIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIllIIlIlIlIlI) {
            llllllllllllllllIlIIllIIlIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIllIIlIllIll(String llllllllllllllllIlIIllIIlIIlIlII, String llllllllllllllllIlIIllIIlIIllIII) {
        llllllllllllllllIlIIllIIlIIlIlII = new String(Base64.getDecoder().decode(llllllllllllllllIlIIllIIlIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIllIIlIIlIlll = new StringBuilder();
        char[] llllllllllllllllIlIIllIIlIIlIllI = llllllllllllllllIlIIllIIlIIllIII.toCharArray();
        int llllllllllllllllIlIIllIIlIIlIlIl = lIlllIlIllI[2];
        char[] llllllllllllllllIlIIllIIlIIIllll = llllllllllllllllIlIIllIIlIIlIlII.toCharArray();
        int llllllllllllllllIlIIllIIlIIIlllI = llllllllllllllllIlIIllIIlIIIllll.length;
        int llllllllllllllllIlIIllIIlIIIllIl = lIlllIlIllI[2];
        while (bh.lIIllIIllIllII(llllllllllllllllIlIIllIIlIIIllIl, llllllllllllllllIlIIllIIlIIIlllI)) {
            char llllllllllllllllIlIIllIIlIIllIlI = llllllllllllllllIlIIllIIlIIIllll[llllllllllllllllIlIIllIIlIIIllIl];
            llllllllllllllllIlIIllIIlIIlIlll.append((char)(llllllllllllllllIlIIllIIlIIllIlI ^ llllllllllllllllIlIIllIIlIIlIllI[llllllllllllllllIlIIllIIlIIlIlIl % llllllllllllllllIlIIllIIlIIlIllI.length]));
            0;
            ++llllllllllllllllIlIIllIIlIIlIlIl;
            ++llllllllllllllllIlIIllIIlIIIllIl;
            0;
            if ((146 + 92 - 160 + 80 ^ 7 + 81 - 67 + 133) > 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIllIIlIIlIlll);
    }

    private static void lIIllIIllIIlIl() {
        lIlllIlIllI = new int[63];
        bh.lIlllIlIllI[0] = 0xFFFFFFD6 & 0x377D;
        bh.lIlllIlIllI[1] = 2;
        bh.lIlllIlIllI[2] = (0x45 ^ 0x5D) & ~(0xBD ^ 0xA5);
        bh.lIlllIlIllI[3] = 1;
        bh.lIlllIlIllI[4] = 3;
        bh.lIlllIlIllI[5] = 0x65 ^ 5 ^ (0x3B ^ 0x5F);
        bh.lIlllIlIllI[6] = 74 + 99 - 12 + 6 ^ 77 + 119 - 181 + 147;
        bh.lIlllIlIllI[7] = 0x2C ^ 0x18 ^ (0xF7 ^ 0xC5);
        bh.lIlllIlIllI[8] = 65 + 127 - 79 + 42 ^ 48 + 32 - -28 + 48;
        bh.lIlllIlIllI[9] = 0x60 ^ 0x68;
        bh.lIlllIlIllI[10] = 0xFFFFFBCA & 0xB5F5;
        bh.lIlllIlIllI[11] = -(0xFFFFBFB9 & 0x77D7) & (0xFFFFFFF7 & 0x3FFA);
        bh.lIlllIlIllI[12] = -(0xFFFFFE4B & 0x7BFD) & (0xFFFFFFEF & Short.MAX_VALUE);
        bh.lIlllIlIllI[13] = -(0xFFFFFE63 & 0x33DE) & (0xFFFFF7E7 & 0x3FFF);
        bh.lIlllIlIllI[14] = 0xFFFFABBF & 0x5C7F;
        bh.lIlllIlIllI[15] = -(0xFFFFE3BF & 0x7FDF) & (0xFFFFFBFE & 0x6FDF);
        bh.lIlllIlIllI[16] = 0xC3 ^ 0xAE ^ (0x12 ^ 0x4B);
        bh.lIlllIlIllI[17] = 0x15 ^ 0x32;
        bh.lIlllIlIllI[18] = 0x9E ^ 0xBC;
        bh.lIlllIlIllI[19] = 0x9E ^ 0xBD;
        bh.lIlllIlIllI[20] = 0x3C ^ 0xF ^ (0x42 ^ 0x57);
        bh.lIlllIlIllI[21] = 0xD0 ^ 0xC6 ^ (0xBB ^ 0x88);
        bh.lIlllIlIllI[22] = 0x28 ^ 0x13 ^ (0x8A ^ 0x95);
        bh.lIlllIlIllI[23] = 0xA6 ^ 0xAF;
        bh.lIlllIlIllI[24] = 0x1D ^ 0x17;
        bh.lIlllIlIllI[25] = 0x64 ^ 0x6F;
        bh.lIlllIlIllI[26] = 0xB2 ^ 0x99 ^ (0x2B ^ 0xC);
        bh.lIlllIlIllI[27] = 0x46 ^ 0xA ^ (0xDC ^ 0x9D);
        bh.lIlllIlIllI[28] = 49 + 106 - 60 + 40 ^ 56 + 92 - 68 + 74;
        bh.lIlllIlIllI[29] = 0x61 ^ 0xD ^ (0x60 ^ 0x24);
        bh.lIlllIlIllI[30] = 0x50 ^ 0x5E;
        bh.lIlllIlIllI[31] = 91 + 98 - 151 + 96 ^ 71 + 111 - 30 + 2;
        bh.lIlllIlIllI[32] = 0x76 ^ 0x52 ^ (0x22 ^ 9);
        bh.lIlllIlIllI[33] = 0x66 ^ 0x74 ^ 2;
        bh.lIlllIlIllI[34] = 0x7B ^ 0x6A;
        bh.lIlllIlIllI[35] = 0xAE ^ 0xB5;
        bh.lIlllIlIllI[36] = 0xD4 ^ 0xC6;
        bh.lIlllIlIllI[37] = 0x10 ^ 3;
        bh.lIlllIlIllI[38] = 6 ^ 0x12;
        bh.lIlllIlIllI[39] = 29 + 0 - -5 + 157 ^ 46 + 93 - 41 + 67;
        bh.lIlllIlIllI[40] = 0xFC ^ 0xC0 ^ (0xAD ^ 0x84);
        bh.lIlllIlIllI[41] = 0x54 ^ 0x7D ^ (0x56 ^ 0x69);
        bh.lIlllIlIllI[42] = 0x8C ^ 0x9B;
        bh.lIlllIlIllI[43] = 84 + 150 - 172 + 97 ^ 118 + 86 - 121 + 51;
        bh.lIlllIlIllI[44] = 0x7E ^ 0x66;
        bh.lIlllIlIllI[45] = 0x26 ^ 0x4B ^ (0xED ^ 0x9E);
        bh.lIlllIlIllI[46] = 0xDC ^ 0xC3;
        bh.lIlllIlIllI[47] = 0xFB ^ 0xB6 ^ (6 ^ 0x6B);
        bh.lIlllIlIllI[48] = 0xC7 ^ 0x80 ^ (0x13 ^ 0x75);
        bh.lIlllIlIllI[49] = 0x43 ^ 0x46 ^ (0xB1 ^ 0x9D);
        bh.lIlllIlIllI[50] = 51 + 1 - 3 + 80 ^ 66 + 164 - 82 + 23;
        bh.lIlllIlIllI[51] = 0x46 ^ 0x2D ^ (0x7E ^ 0x3E);
        bh.lIlllIlIllI[52] = 0x42 ^ 0x6E;
        bh.lIlllIlIllI[53] = 0x4E ^ 0x23 ^ (0x5F ^ 0x1F);
        bh.lIlllIlIllI[54] = 153 + 31 - 87 + 71 ^ 54 + 75 - 75 + 80;
        bh.lIlllIlIllI[55] = 0x62 ^ 0x6A ^ (0x62 ^ 0x45);
        bh.lIlllIlIllI[56] = 0x2A ^ 0x1A;
        bh.lIlllIlIllI[57] = 0x6B ^ 0x5A;
        bh.lIlllIlIllI[58] = 0x21 ^ 0x13;
        bh.lIlllIlIllI[59] = 0x18 ^ 0x6F ^ (0x28 ^ 0x6C);
        bh.lIlllIlIllI[60] = 0xFFFFFDDF & 0x2FE7;
        bh.lIlllIlIllI[61] = 0xFFFFADDC & 0x7FEB;
        bh.lIlllIlIllI[62] = 0xFFFFFDEF & 0x2FD9;
    }

    private static void lIIllIIllIIlII() {
        lIlllIlIlII = new String[lIlllIlIllI[23]];
        bh.lIlllIlIlII[bh.lIlllIlIllI[2]] = bh."Scabaras";
        bh.lIlllIlIlII[bh.lIlllIlIllI[3]] = bh."Osmumten";
        bh.lIlllIlIlII[bh.lIlllIlIllI[1]] = bh."Teleport crystal";
        bh.lIlllIlIlII[bh.lIlllIlIllI[4]] = bh."Quick-Use";
        bh.lIlllIlIlII[bh.lIlllIlIllI[5]] = bh."Scabaras";
        bh.lIlllIlIlII[bh.lIlllIlIllI[6]] = bh."Osmumten";
        bh.lIlllIlIlII[bh.lIlllIlIllI[7]] = bh."Quick-leave";
        bh.lIlllIlIlII[bh.lIlllIlIllI[8]] = bh."Quick-leave";
        bh.lIlllIlIlII[bh.lIlllIlIllI[9]] = bh."Talk-to";
    }

    protected bh(Client client, z z2, TOAConfig tOAConfig, bi bi2) {
        super(client, z2, tOAConfig);
        this.eY = bi2;
    }

    @Override
    public boolean bj() {
        int n2;
        String[] stringArray = new String[lIlllIlIllI[1]];
        stringArray[bh.lIlllIlIllI[2]] = lIlllIlIlII[lIlllIlIllI[2]];
        stringArray[bh.lIlllIlIllI[3]] = lIlllIlIlII[lIlllIlIllI[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bh.lIIllIIllIIllI(nPC) && bh.lIIllIIllIIlll(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            n2 = lIlllIlIllI[3];
            0;
            if (null != null) {
                return ((0x72 ^ 0x6E) & ~(0x1A ^ 6)) != 0;
            }
        } else {
            n2 = lIlllIlIllI[2];
        }
        return n2 != 0;
    }
}

