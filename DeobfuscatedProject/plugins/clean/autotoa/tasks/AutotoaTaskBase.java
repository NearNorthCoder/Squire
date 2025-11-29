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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum118;
import gg.squire.autotoa.tasks.AutotoaManager;

public abstract class AutotoaTaskBase
extends AutotoaTaskBase {
    private static final  int eT;
    private static final  List<Point> eS;
    protected static  boolean eX;
    protected static final  int eR;
    private final  bi eY;
    
    protected static final  int eO;
    private static final  int eU;
    private static final  int eW;
    private static final  int eV;
    protected static final  int eP;
    
    protected static final  List<Point> eN;
    protected static final  int[] eQ;

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

    protected AutotoaTaskBase(Client client, z z2, TOAConfig tOAConfig) {
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
        Iterator var1 = this.cu.getGraphicsObjects().iterator();
        while (bh.lIIllIIllIIlll(var1.hasNext() ? 1 : 0)) {
            GraphicsObject var2 = (GraphicsObject)var1.next();
            if (!bh.lIIllIIlllIIII(var2.getId(), lIlllIlIllI[12]) || !bh.lIIllIIlllIIII(var2.getId(), lIlllIlIllI[13]) || !bh.lIIllIIlllIIII(var2.getId(), lIlllIlIllI[14]) || bh.lIIllIIllIlIll(var2.getId(), lIlllIlIllI[15])) {
                void var3;
                bh var4;
                LocalPoint var5 = var2.getLocation();
                if (bh.lIIllIIllIlIlI(var5)) {

                    if ((0x45 ^ 0x41) > ((0x25 ^ 0x66) & ~(0xE3 ^ 0xA0))) continue;
                    return null;
                }
                WorldPoint var6 = WorldPoint.fromLocal((Client)var4.cu, (LocalPoint)var5);
                var3.add(var6);

            }

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
        void var7;
        void var8;
        int var9;
        int n2;
        WorldPoint worldPoint = Movement.getDestination();
        Player player = Players.getLocal();
        if (bh.lIIllIIllIIlll(Movement.isRunEnabled() ? 1 : 0)) {
            n2 = lIlllIlIllI[1];

            }
        } else {
            n2 = var9 = lIlllIlIllI[3];
        }
        if (!bh.lIIllIIllIIllI(var8) || bh.lIIllIIllIllIl(var8.distanceTo2D(var7.getWorldLocation()), var9)) {
            bl2 = lIlllIlIllI[3];

            if (2 >= (0x34 ^ 0x30)) {
                return false;
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
        NPC var10 = NPCs.getNearest((String[])stringArray);
        if (bh.lIIllIIllIlIlI(var10)) {
            return lIlllIlIllI[2];
        }
        String[] stringArray2 = new String[lIlllIlIllI[3]];
        stringArray2[bh.lIlllIlIllI[2]] = lIlllIlIlII[lIlllIlIllI[7]];
        if (bh.lIIllIIllIIlll(var10.hasAction(stringArray2) ? 1 : 0)) {
            var10.interact(lIlllIlIlII[lIlllIlIllI[8]]);
            return lIlllIlIllI[3];
        }
        var1_1.interact(lIlllIlIlII[lIlllIlIllI[9]]);
        return lIlllIlIllI[3];
    }

    public NPC bO() {
        return NPCs.getNearest((int[])eQ);
    }

    protected WorldPoint bT() {
        WorldPoint var11;
        bh var12;
        Point var13;
        Iterator<Point> var14 = eN.iterator();
        while (bh.lIIllIIllIIlll(var14.hasNext() ? 1 : 0)) {
            WorldPoint var15;
            var13 = var14.next();
            var11 = var12.a(var13);
            if (bh.lIIllIIllIlIIl(TileObjects.getAll(tileObject -> {
                int n2;
                if (bh.lIIllIIllIIlll(tileObject.getWorldLocation().equals((Object)var11) ? 1 : 0) && bh.lIIllIIllIlIll(tileObject.getId(), lIlllIlIllI[10])) {
                    n2 = lIlllIlIllI[3];

                    if (((0x2A ^ 0x19) & ~(0xAF ^ 0x9C)) != 0) {
                        return false;
                    }
                } else {
                    n2 = lIlllIlIllI[2];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && bh.lIIllIIllIIlll(Reachable.isWalkable((WorldPoint)(var15 = var12.a(var13))) ? 1 : 0)) {
                return var15;
            }

            if (2 < 3) continue;
            return null;
        }
        var14 = eN.iterator();
        while (bh.lIIllIIllIIlll(var14.hasNext() ? 1 : 0)) {
            var13 = var14.next();
            var11 = var12.a(var13);
            if (bh.lIIllIIllIIlll(TileObjects.getAll(tileObject -> {
                int n2;
                if (bh.lIIllIIllIIlll(tileObject.getWorldLocation().equals((Object)var11) ? 1 : 0) && bh.lIIllIIllIlIll(tileObject.getId(), lIlllIlIllI[10])) {
                    n2 = lIlllIlIllI[3];

                    }
                } else {
                    n2 = lIlllIlIllI[2];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && bh.lIIllIIllIIlll(Reachable.isWalkable((WorldPoint)var11) ? 1 : 0)) {
                return var11;
            }

            if (2 > ((9 ^ 0x3B ^ (0x96 ^ 0xB1)) & (37 + 3 - -43 + 92 ^ 174 + 83 - 256 + 185 ^ -1))) continue;
            return null;
        }
        return Players.getLocal().getWorldLocation();
    }

    private static boolean lIIllIIllIIllI(Object object) {
        return object != null;
    }

        return String.valueOf(var16);
    }

    private static void lIIllIIllIIlII() {
        lIlllIlIlII = new String[lIlllIlIllI[23]];
        bh.lIlllIlIlII[bh.lIlllIlIllI[2]] = "Scabaras";
        bh.lIlllIlIlII[bh.lIlllIlIllI[3]] = "Osmumten";
        bh.lIlllIlIlII[bh.lIlllIlIllI[1]] = "Teleport crystal";
        bh.lIlllIlIlII[bh.lIlllIlIllI[4]] = "Quick-Use";
        bh.lIlllIlIlII[bh.lIlllIlIllI[5]] = "Scabaras";
        bh.lIlllIlIlII[bh.lIlllIlIllI[6]] = "Osmumten";
        bh.lIlllIlIlII[bh.lIlllIlIllI[7]] = "Quick-leave";
        bh.lIlllIlIlII[bh.lIlllIlIllI[8]] = "Quick-leave";
        bh.lIlllIlIlII[bh.lIlllIlIllI[9]] = "Talk-to";
    }

    protected AutotoaTaskBase(Client client, z z2, TOAConfig tOAConfig, bi bi2) {
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

            }
        } else {
            n2 = lIlllIlIllI[2];
        }
        return n2 != 0;
    }
}

