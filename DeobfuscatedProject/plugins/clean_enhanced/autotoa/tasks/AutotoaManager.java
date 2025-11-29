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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum16;
import gg.squire.autotoa.tasks.AutotoaManager;

public abstract class AutotoaManager
extends AutotoaManager {
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

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    public boolean bR() {
        Player player = this.cu.getLocalPlayer();
        return player.hasSpotAnim(var1[11]);
    }

    @Override
    public int bi() {
        return var1[0];
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    static {
        bh.var5();
        bh.var6();
        eV = var1[14];
        eT = var1[12];
        eO = var1[0];
        eU = var1[13];
        eW = var1[15];
        eR = var1[10];
        eP = var1[11];
        Point[] pointArray = new Point[var1[16]];
        pointArray[bh.var1[2]] = new Point(var1[17], var1[18]);
        pointArray[bh.var1[3]] = new Point(var1[17], var1[19]);
        pointArray[bh.var1[1]] = new Point(var1[20], var1[19]);
        pointArray[bh.var1[4]] = new Point(var1[21], var1[19]);
        pointArray[bh.var1[5]] = new Point(var1[17], var1[22]);
        pointArray[bh.var1[6]] = new Point(var1[20], var1[22]);
        pointArray[bh.var1[7]] = new Point(var1[21], var1[22]);
        pointArray[bh.var1[8]] = new Point(var1[17], var1[21]);
        pointArray[bh.var1[9]] = new Point(var1[20], var1[21]);
        pointArray[bh.var1[23]] = new Point(var1[21], var1[21]);
        pointArray[bh.var1[24]] = new Point(var1[17], var1[20]);
        pointArray[bh.var1[25]] = new Point(var1[20], var1[20]);
        pointArray[bh.var1[26]] = new Point(var1[21], var1[20]);
        pointArray[bh.var1[27]] = new Point(var1[28], var1[29]);
        pointArray[bh.var1[30]] = new Point(var1[31], var1[29]);
        pointArray[bh.var1[32]] = new Point(var1[31], var1[17]);
        pointArray[bh.var1[33]] = new Point(var1[31], var1[20]);
        pointArray[bh.var1[34]] = new Point(var1[35], var1[29]);
        pointArray[bh.var1[36]] = new Point(var1[35], var1[17]);
        pointArray[bh.var1[37]] = new Point(var1[35], var1[20]);
        pointArray[bh.var1[38]] = new Point(var1[39], var1[29]);
        pointArray[bh.var1[40]] = new Point(var1[39], var1[17]);
        pointArray[bh.var1[41]] = new Point(var1[39], var1[20]);
        pointArray[bh.var1[42]] = new Point(var1[43], var1[29]);
        pointArray[bh.var1[44]] = new Point(var1[43], var1[17]);
        pointArray[bh.var1[43]] = new Point(var1[43], var1[20]);
        pointArray[bh.var1[39]] = new Point(var1[42], var1[45]);
        pointArray[bh.var1[35]] = new Point(var1[42], var1[28]);
        pointArray[bh.var1[31]] = new Point(var1[44], var1[28]);
        pointArray[bh.var1[28]] = new Point(var1[43], var1[28]);
        pointArray[bh.var1[45]] = new Point(var1[42], var1[31]);
        pointArray[bh.var1[46]] = new Point(var1[44], var1[31]);
        pointArray[bh.var1[47]] = new Point(var1[43], var1[31]);
        pointArray[bh.var1[48]] = new Point(var1[42], var1[35]);
        pointArray[bh.var1[18]] = new Point(var1[44], var1[35]);
        pointArray[bh.var1[19]] = new Point(var1[43], var1[35]);
        pointArray[bh.var1[22]] = new Point(var1[42], var1[39]);
        pointArray[bh.var1[21]] = new Point(var1[44], var1[39]);
        pointArray[bh.var1[20]] = new Point(var1[43], var1[39]);
        pointArray[bh.var1[17]] = new Point(var1[48], var1[44]);
        pointArray[bh.var1[29]] = new Point(var1[18], var1[44]);
        pointArray[bh.var1[49]] = new Point(var1[18], var1[43]);
        pointArray[bh.var1[50]] = new Point(var1[18], var1[39]);
        pointArray[bh.var1[51]] = new Point(var1[19], var1[44]);
        pointArray[bh.var1[52]] = new Point(var1[19], var1[43]);
        pointArray[bh.var1[53]] = new Point(var1[19], var1[39]);
        pointArray[bh.var1[54]] = new Point(var1[22], var1[44]);
        pointArray[bh.var1[55]] = new Point(var1[22], var1[43]);
        pointArray[bh.var1[56]] = new Point(var1[22], var1[39]);
        pointArray[bh.var1[57]] = new Point(var1[21], var1[44]);
        pointArray[bh.var1[58]] = new Point(var1[21], var1[43]);
        pointArray[bh.var1[59]] = new Point(var1[21], var1[39]);
        eN = List.of(pointArray);
        int[] nArray = new int[var1[4]];
        nArray[bh.var1[2]] = var1[60];
        nArray[bh.var1[3]] = var1[61];
        nArray[bh.var1[1]] = var1[62];
        eQ = nArray;
        eS = List.of(new Point(var1[18], var1[18]), new Point(var1[28], var1[19]), new Point(var1[31], var1[45]), new Point(var1[48], var1[28]));
    }

    private static boolean var7(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    public List<TileObject> bM() {
        int[] nArray = new int[var1[3]];
        nArray[bh.var1[2]] = var1[10];
        return TileObjects.getAll((int[])nArray);
    }

    private static boolean var9(int n2, int n3) {
        return n2 <= n3;
    }

    public static boolean bV() {
        return eX;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    public static void f(boolean bl2) {
        eX = bl2;
    }

    protected AutotoaManager(Client client, z z2, TOAConfig tOAConfig) {
        this(client, z2, tOAConfig, null);
    }

    @Override
    public boolean bl() {
        if (bh.var3((Object)this.eY, (Object)this.bN()) && bh.var11((Object)this.eY)) {
            return var1[2];
        }
        return this.bL();
    }

    public bi bN() {
        NPC nPC = this.bO();
        if (!bh.var11(nPC) || bh.var7(nPC.getId(), eQ[var1[3]])) {
            eX = var1[2];
            return bi.SWARM;
        }
        return bi.ATTACK;
    }

    private static boolean var12(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.kephriGearSwap();
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    protected Set<WorldPoint> bU() {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        Iterator var14 = this.cu.getGraphicsObjects().iterator();
        while (bh.var4(var14.hasNext() ? 1 : 0)) {
            GraphicsObject var15 = (GraphicsObject)var14.next();
            if (!bh.var12(var15.getId(), var1[12]) || !bh.var12(var15.getId(), var1[13]) || !bh.var12(var15.getId(), var1[14]) || bh.var7(var15.getId(), var1[15])) {
                void var16;
                bh var17;
                LocalPoint var18 = var15.getLocation();
                if (bh.var10(var18)) {
                    0;
                    if ((0x45 ^ 0x41) > ((0x25 ^ 0x66) & ~(0xE3 ^ 0xA0))) continue;
                    return null;
                }
                WorldPoint var19 = WorldPoint.fromLocal((Client)var17.cu, (LocalPoint)var18);
                var16.add(var19);
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
        if (bh.var8(n2, n4)) {
            // empty if block
        }
        return null;
    }

    @Override
    public boolean bm() {
        String[] stringArray = new String[var1[3]];
        stringArray[bh.var1[2]] = var2[var1[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (!bh.var11(tileObject) || bh.var13(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
            return var1[2];
        }
        tileObject.interact(var2[var1[4]]);
        return var1[3];
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
        void var20;
        void var21;
        int var22;
        int n2;
        WorldPoint worldPoint = Movement.getDestination();
        Player player = Players.getLocal();
        if (bh.var4(Movement.isRunEnabled() ? 1 : 0)) {
            n2 = var1[1];
            0;
            if null != null {
                return ((0x59 ^ 0x47) & ~(0x74 ^ 0x6A)) != 0;
            }
        } else {
            n2 = var22 = var1[3];
        }
        if (!bh.var11(var21) || bh.var9(var21.distanceTo2D(var20.getWorldLocation()), var22)) {
            bl2 = var1[3];
            0;
            if (2 >= (0x34 ^ 0x30)) {
                return ((0xBD ^ 0xA3) & ~(0x8E ^ 0x90)) != 0;
            }
        } else {
            bl2 = var1[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (bh.var4(super.bn() ? 1 : 0)) {
            return var1[3];
        }
        if (bh.var4(Dialog.isOpen() ? 1 : 0) && bh.var4(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return var1[3];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[bh.var1[2]] = var2[var1[5]];
        stringArray[bh.var1[3]] = var2[var1[6]];
        NPC var23 = NPCs.getNearest((String[])stringArray);
        if (bh.var10(var23)) {
            return var1[2];
        }
        String[] stringArray2 = new String[var1[3]];
        stringArray2[bh.var1[2]] = var2[var1[7]];
        if (bh.var4(var23.hasAction(stringArray2) ? 1 : 0)) {
            var23.interact(var2[var1[8]]);
            return var1[3];
        }
        var1_1.interact(var2[var1[9]]);
        return var1[3];
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    public NPC bO() {
        return NPCs.getNearest((int[])eQ);
    }

    protected WorldPoint bT() {
        WorldPoint var30;
        bh var31;
        Point var32;
        Iterator<Point> var33 = eN.iterator();
        while (bh.var4(var33.hasNext() ? 1 : 0)) {
            WorldPoint var34;
            var32 = var33.next();
            var30 = var31.a(var32);
            if (bh.var13(TileObjects.getAll(tileObject -> {
                int n2;
                if (bh.var4(tileObject.getWorldLocation().equals((Object)var30) ? 1 : 0) && bh.var7(tileObject.getId(), var1[10])) {
                    n2 = var1[3];
                    0;
                    if (((0x2A ^ 0x19) & ~(0xAF ^ 0x9C)) != 0) {
                        return ((0x7A ^ 0x48) & ~(0xBC ^ 0x8E)) != 0;
                    }
                } else {
                    n2 = var1[2];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && bh.var4(Reachable.isWalkable((WorldPoint)(var34 = var31.a(var32))) ? 1 : 0)) {
                return var34;
            }
            0;
            if (2 < 3) continue;
            return null;
        }
        var33 = eN.iterator();
        while (bh.var4(var33.hasNext() ? 1 : 0)) {
            var32 = var33.next();
            var30 = var31.a(var32);
            if (bh.var4(TileObjects.getAll(tileObject -> {
                int n2;
                if (bh.var4(tileObject.getWorldLocation().equals((Object)var30) ? 1 : 0) && bh.var7(tileObject.getId(), var1[10])) {
                    n2 = var1[3];
                    0;
                    if null != null {
                        return ((0xCB ^ 0x92) & ~(0x43 ^ 0x1A)) != 0;
                    }
                } else {
                    n2 = var1[2];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && bh.var4(Reachable.isWalkable((WorldPoint)var30) ? 1 : 0)) {
                return var30;
            }
            0;
            if (2 > ((9 ^ 0x3B ^ (0x96 ^ 0xB1)) & (37 + 3 - -43 + 92 ^ 174 + 83 - 256 + 185 ^ -1))) continue;
            return null;
        }
        return Players.getLocal().getWorldLocation();
    }

    private static boolean var11(Object object) {
        return object != null;
    }

        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

    private static String var41(String var42, String var43) {
        var42 = new String(Base64.getDecoder().decode(var42.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var44 = new StringBuilder();
        char[] var45 = var43.toCharArray();
        int var46 = var1[2];
        char[] var47 = var42.toCharArray();
        int var48 = var47.length;
        int var49 = var1[2];
        while (bh.var8(var49, var48)) {
            char var50 = var47[var49];
            var44.append((char)(var50 ^ var45[var46 % var45.length]));
            0;
            ++var46;
            ++var49;
            0;
            if ((146 + 92 - 160 + 80 ^ 7 + 81 - 67 + 133) > 3) continue;
            return null;
        }
        return String.valueOf(var44);
    }

    private static void var5() {
        var1 = new int[63];
        bh.var1[0] = 0xFFFFFFD6 & 0x377D;
        bh.var1[1] = 2;
        bh.var1[2] = (0x45 ^ 0x5D) & ~(0xBD ^ 0xA5);
        bh.var1[3] = 1;
        bh.var1[4] = 3;
        bh.var1[5] = 0x65 ^ 5 ^ (0x3B ^ 0x5F);
        bh.var1[6] = 74 + 99 - 12 + 6 ^ 77 + 119 - 181 + 147;
        bh.var1[7] = 0x2C ^ 0x18 ^ (0xF7 ^ 0xC5);
        bh.var1[8] = 65 + 127 - 79 + 42 ^ 48 + 32 - -28 + 48;
        bh.var1[9] = 0x60 ^ 0x68;
        bh.var1[10] = 0xFFFFFBCA & 0xB5F5;
        bh.var1[11] = -(0xFFFFBFB9 & 0x77D7) & (0xFFFFFFF7 & 0x3FFA);
        bh.var1[12] = -(0xFFFFFE4B & 0x7BFD) & (0xFFFFFFEF & Short.MAX_VALUE);
        bh.var1[13] = -(0xFFFFFE63 & 0x33DE) & (0xFFFFF7E7 & 0x3FFF);
        bh.var1[14] = 0xFFFFABBF & 0x5C7F;
        bh.var1[15] = -(0xFFFFE3BF & 0x7FDF) & (0xFFFFFBFE & 0x6FDF);
        bh.var1[16] = 0xC3 ^ 0xAE ^ (0x12 ^ 0x4B);
        bh.var1[17] = 0x15 ^ 0x32;
        bh.var1[18] = 0x9E ^ 0xBC;
        bh.var1[19] = 0x9E ^ 0xBD;
        bh.var1[20] = 0x3C ^ 0xF ^ (0x42 ^ 0x57);
        bh.var1[21] = 0xD0 ^ 0xC6 ^ (0xBB ^ 0x88);
        bh.var1[22] = 0x28 ^ 0x13 ^ (0x8A ^ 0x95);
        bh.var1[23] = 0xA6 ^ 0xAF;
        bh.var1[24] = 0x1D ^ 0x17;
        bh.var1[25] = 0x64 ^ 0x6F;
        bh.var1[26] = 0xB2 ^ 0x99 ^ (0x2B ^ 0xC);
        bh.var1[27] = 0x46 ^ 0xA ^ (0xDC ^ 0x9D);
        bh.var1[28] = 49 + 106 - 60 + 40 ^ 56 + 92 - 68 + 74;
        bh.var1[29] = 0x61 ^ 0xD ^ (0x60 ^ 0x24);
        bh.var1[30] = 0x50 ^ 0x5E;
        bh.var1[31] = 91 + 98 - 151 + 96 ^ 71 + 111 - 30 + 2;
        bh.var1[32] = 0x76 ^ 0x52 ^ (0x22 ^ 9);
        bh.var1[33] = 0x66 ^ 0x74 ^ 2;
        bh.var1[34] = 0x7B ^ 0x6A;
        bh.var1[35] = 0xAE ^ 0xB5;
        bh.var1[36] = 0xD4 ^ 0xC6;
        bh.var1[37] = 0x10 ^ 3;
        bh.var1[38] = 6 ^ 0x12;
        bh.var1[39] = 29 + 0 - -5 + 157 ^ 46 + 93 - 41 + 67;
        bh.var1[40] = 0xFC ^ 0xC0 ^ (0xAD ^ 0x84);
        bh.var1[41] = 0x54 ^ 0x7D ^ (0x56 ^ 0x69);
        bh.var1[42] = 0x8C ^ 0x9B;
        bh.var1[43] = 84 + 150 - 172 + 97 ^ 118 + 86 - 121 + 51;
        bh.var1[44] = 0x7E ^ 0x66;
        bh.var1[45] = 0x26 ^ 0x4B ^ (0xED ^ 0x9E);
        bh.var1[46] = 0xDC ^ 0xC3;
        bh.var1[47] = 0xFB ^ 0xB6 ^ (6 ^ 0x6B);
        bh.var1[48] = 0xC7 ^ 0x80 ^ (0x13 ^ 0x75);
        bh.var1[49] = 0x43 ^ 0x46 ^ (0xB1 ^ 0x9D);
        bh.var1[50] = 51 + 1 - 3 + 80 ^ 66 + 164 - 82 + 23;
        bh.var1[51] = 0x46 ^ 0x2D ^ (0x7E ^ 0x3E);
        bh.var1[52] = 0x42 ^ 0x6E;
        bh.var1[53] = 0x4E ^ 0x23 ^ (0x5F ^ 0x1F);
        bh.var1[54] = 153 + 31 - 87 + 71 ^ 54 + 75 - 75 + 80;
        bh.var1[55] = 0x62 ^ 0x6A ^ (0x62 ^ 0x45);
        bh.var1[56] = 0x2A ^ 0x1A;
        bh.var1[57] = 0x6B ^ 0x5A;
        bh.var1[58] = 0x21 ^ 0x13;
        bh.var1[59] = 0x18 ^ 0x6F ^ (0x28 ^ 0x6C);
        bh.var1[60] = 0xFFFFFDDF & 0x2FE7;
        bh.var1[61] = 0xFFFFADDC & 0x7FEB;
        bh.var1[62] = 0xFFFFFDEF & 0x2FD9;
    }

    private static void var6() {
        var2 = new String[var1[23]];
        bh.var2[bh.var1[2]] = "Scabaras";
        bh.var2[bh.var1[3]] = "Osmumten";
        bh.var2[bh.var1[1]] = "Teleport crystal";
        bh.var2[bh.var1[4]] = "Quick-Use";
        bh.var2[bh.var1[5]] = "Scabaras";
        bh.var2[bh.var1[6]] = "Osmumten";
        bh.var2[bh.var1[7]] = "Quick-leave";
        bh.var2[bh.var1[8]] = "Quick-leave";
        bh.var2[bh.var1[9]] = "Talk-to";
    }

    protected AutotoaManager(Client client, z z2, TOAConfig tOAConfig, bi bi2) {
        super(client, z2, tOAConfig);
        this.eY = bi2;
    }

    @Override
    public boolean bj() {
        int n2;
        String[] stringArray = new String[var1[1]];
        stringArray[bh.var1[2]] = var2[var1[2]];
        stringArray[bh.var1[3]] = var2[var1[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bh.var11(nPC) && bh.var4(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            n2 = var1[3];
            0;
            if null != null {
                return ((0x72 ^ 0x6E) & ~(0x1A ^ 6)) != 0;
            }
        } else {
            n2 = var1[2];
        }
        return n2 != 0;
    }
}

