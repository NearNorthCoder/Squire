/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum6;
import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.GameEnum2;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.NHelper;
import gg.squire.cox.tasks.PHelper;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Crabs", priority=10000, blocking=true, register=true)
public class CrabsTask
extends CoxManager {
    private  n al;
    private  int am;
    private  n ak;
    private  int dB;
    
     List<p> en;

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bi var3;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)this.al.bt) ? 1 : 0)) {
                return 2;
            }
            Movement.setDestination((WorldPoint)var3.al.bs);
            return 1;
        }
        TileObject var4 = var3.cR();
        if var4 == null {
            return 2;
        }
        if (!(var3.bS.isMoving( == 0) ? 1 : 0) || (var3.bS.isAnimating( != 0) ? 1 : 0)) {
            return 2;
        }
        var1_1.interact(var1[2]);
        return 1;
    }

    private void en() {
        bi var5;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var1[var2[51]]) ? 1 : 0) && (this.D((NPC == 0)nPC) ? 1 : 0)) {
                n2 = 1;
                0;
                if (1 < 0) {
                    return ((113 + 83 - 7 + 58 ^ 93 + 64 - 80 + 89) & (0x44 ^ 0x49 ^ (0x2F ^ 0x73) ^ -1)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        });
        this.ep();
        if ((nPC2.getInteracting( != null))) {
            return;
        }
        if ((var5.cq.getTickCount() - var5.dB < 4)) {
            return;
        }
        nPC2.interact(var1[5]);
        this.dB = this.cq.getTickCount();
    }

    @Inject
    protected CrabsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
        this.en = new ArrayList<p>();
        this.dB = 0;
    }

    private boolean ev() {
        bi var6;
        int var7 = 2;
        while ((var7 < var6.en.size())) {
            p var8 = var6.en.get(var7);
            if var8 != null {
                if ((var8.aP( == null))) {
                    0;
                    if (((0x63 ^ 0x64) & ~(0x9E ^ 0x99)) < 0) {
                        return ((0x81 ^ 0x8C) & ~(0x59 ^ 0x54)) != 0;
                    }
                } else {
                    int var9 = var6.cq.getTickCount() - var8.aQ();
                    if (var9 > var2[18]) {
                        var6.en.clear();
                        return 1;
                    }
                }
            }
            ++var7;
            0;
            if (2 > 1) continue;
            return ((0x60 ^ 0x59) & ~(0x57 ^ 0x6E)) != 0;
        }
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean em() {
        void var3_3;
        int[] nArray = new int[1];
        nArray[2] = 3;
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            return 2;
        }
        Item var10 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[55]]));
        Item var11 = Equipment.getFirst(item -> item.getName().startsWith(var1[var2[54]]));
        if (!var10 == null || var11 != null) {
            return 2;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            bi var12;
            var12.co.x();
            0;
            return 1;
        }
        TileObject var13 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var1[var2[52]]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[2] = var1[var2[53]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (((0x4B ^ 0x5C ^ (0xF0 ^ 0x85)) & (0xF5 ^ 0x9A ^ (0xBC ^ 0xB1) ^ -1)) == 0) return n2 != 0;
                    return ((26 + 17 - -51 + 91 ^ 110 + 149 - 155 + 73) & (0xA8 ^ 0xB2 ^ (0x28 ^ 0x3A) ^ -1)) != 0;
                }
            }
            n2 = 2;
            return n2 != 0;
        });
        if var13 == null {
            return 2;
        }
        var3_3.interact(var1[1]);
        return 1;
    }

    private WorldPoint a(WorldPoint worldPoint, NPC nPC, List<WorldPoint> list) {
        List list2 = worldPoint.createWorldArea(1).toWorldPointList();
        WorldPoint worldPoint3 = list2.stream().filter(worldPoint2 -> {
            int n2;
            if ((Reachable.isWalkable(WorldPointworldPoint2) ? 1 : 0) && (worldPoint2.equals((Object == 0)worldPoint) ? 1 : 0) && (list.contains(worldPoint2 == 0) ? 1 : 0)) {
                n2 = 1;
                0;
                if (((0x40 ^ 0x18) & ~(0x55 ^ 0xD)) < -1) {
                    return ((0xA6 ^ 0x9F) & ~(0x52 ^ 0x6B)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        }).min(Comparator.comparingDouble(object -> worldPoint.distanceTo2DHypotenuse((WorldPoint)object)).thenComparingDouble(object -> -nPC.distanceTo((WorldPoint)object))).orElse(null);
        return worldPoint3;
    }

    private static  boolean a(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if ((nPC.getName( != 0).contains(var1[var2[47]]) ? 1 : 0) && (nPC.getWorldLocation( != 0).equals((Object)worldPoint) ? 1 : 0)) {
            n2 = 1;
            0;
            if null != null {
                return ((0xC2 ^ 0x8A) & ~(0x7B ^ 0x33)) != 0;
            }
        } else {
            n2 = 2;
        }
        return n2 != 0;
    }

    private int et() {
        EquipmentSetup equipmentSetup = s.bb();
        return equipmentSetup.get(EquipmentInventorySlot.WEAPON);
    }

    private int er() {
        EquipmentSetup equipmentSetup = s.bc();
        return equipmentSetup.get(EquipmentInventorySlot.CAPE);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private int eq() {
        EquipmentSetup equipmentSetup = s.bc();
        return equipmentSetup.get(EquipmentInventorySlot.WEAPON);
    }

    @Override
    public List<Prayer> ci() {
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var1[var2[58]]));
        if nPC2 == null {
            return null;
        }
        return List.of(Prayer.PROTECT_FROM_MELEE);
    }

    /*
     * WARNING - void declaration
     */
    private boolean D(NPC nPC) {
        bi var14;
        if nPC == null {
            System.out.println(var1[6]);
            return 2;
        }
        int var15 = 2;
        while ((var15 < var14.en.size())) {
            p var16 = var14.en.get(var15);
            if var16 != null {
                void var17;
                if ((var16.aP( == null))) {
                    0;
                    if (1 <= 0) {
                        return ((0x56 ^ 0x21 ^ (0x27 ^ 0x11)) & (163 + 149 - 285 + 226 ^ 1 + 185 - 121 + 123 ^ -1)) != 0;
                    }
                } else if (!(var16.aP( == 0).equals(var17) ? 1 : 0) || (var17.getWorldLocation( != 0).equals((Object)var16.aP().getWorldLocation()) ? 1 : 0)) {
                    return 1;
                }
            }
            ++var15;
            0;
            if null == null continue;
            return ((0xA ^ 0x6C ^ (0x9D ^ 0xAF)) & (94 + 47 - 87 + 190 ^ 38 + 132 - 126 + 116 ^ -1)) != 0;
        }
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        void var18;
        List var19;
        int var20;
        void var21;
        List<Object> list = new ArrayList<WorldPoint>();
        if ((worldPoint.getWorldX() == worldPoint2.getWorldX())) {
            int n2 = Math.abs(worldPoint2.getWorldY() - worldPoint.getWorldY());
            if ((worldPoint2.getWorldY() > worldPoint.getWorldY())) {
                list = new WorldArea(worldPoint, 1, n2).toWorldPointList();
                0;
                if (1 == 3) {
                    return null;
                }
            } else {
                var19 = new WorldArea((WorldPoint)var21, 1, var20).toWorldPointList();
            }
        }
        if ((var18.getWorldY() == var21.getWorldY())) {
            var20 = Math.abs(var21.getWorldX() - var18.getWorldX());
            if ((var21.getWorldX() > var18.getWorldX())) {
                var19 = new WorldArea((WorldPoint)var18, var20, 1).toWorldPointList();
                0;
                if null != null {
                    return null;
                }
            } else {
                list = new WorldArea((WorldPoint)var21, var20, 1).toWorldPointList();
            }
        }
        list.remove(worldPoint2);
        0;
        return list;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (((Object)this.ak.bw == (Object)this.ak.bw2)N.CRABS)) {
            bl2 = 1;
            0;
            if ((0x32 ^ 0x36) != (0x8E ^ 0x8A)) {
                return ((0xE4 ^ 0xBC) & ~(0x7C ^ 0x24)) != 0;
            }
        } else {
            bl2 = 2;
        }
        return bl2;
    }

    private int eo() {
        EquipmentSetup equipmentSetup = s.ba();
        return equipmentSetup.get(EquipmentInventorySlot.WEAPON);
    }

    /*
     * WARNING - void declaration
     */
    private void ew() {
        bi var22;
        void var23;
        void var24;
        void var25;
        WorldPoint worldPoint = H.CRABS_BASE_1.c(this.ak);
        WorldPoint worldPoint3 = H.CRABS_BASE_2.c(this.ak);
        WorldPoint worldPoint4 = H.CRABS_MOVABLE_1.c(this.ak);
        WorldPoint worldPoint5 = H.CRABS_MOVABLE_2.c(this.ak);
        WorldPoint worldPoint6 = H.CRABS_MOVABLE_3.c(this.ak);
        WorldPoint worldPoint7 = H.CRABS_MOVABLE_4.c(this.ak);
        if (((Object)this.ak.bx == (Object)this.ak.bx2)S.TEMPLATE_WEST)) {
            void var26;
            void var27;
            WorldPoint[] worldPointArray = new WorldPoint[6];
            worldPointArray[2] = worldPoint;
            worldPointArray[1] = worldPoint3;
            worldPointArray[5] = worldPoint4;
            if ((this.a(var1[var2[24]], worldPointArray == 0) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray2 = new WorldPoint[6];
            worldPointArray2[2] = var25;
            worldPointArray2[1] = var24;
            worldPointArray2[5] = var23;
            if ((var22.a(var1[var2[25]], worldPointArray2 == 0) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray3 = new WorldPoint[6];
            worldPointArray3[2] = var25;
            worldPointArray3[1] = var24;
            worldPointArray3[5] = var27;
            if ((var22.a(var1[var2[26]], worldPointArray3 == 0) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray4 = new WorldPoint[6];
            worldPointArray4[2] = var25;
            worldPointArray4[1] = var24;
            worldPointArray4[5] = var26;
            if ((var22.a(var1[var2[27]], worldPointArray4 == 0) ? 1 : 0)) {
                return;
            }
        }
        if (((Object)var22.ak.bx == (Object)var22.ak.bx2)S.TEMPLATE_EAST)) {
            void var28;
            WorldPoint var29 = H.CRABS_SINGLE.c(var22.ak);
            WorldPoint[] worldPointArray = new WorldPoint[1];
            worldPointArray[2] = var29;
            if ((var22.a(var1[var2[28]], worldPointArray == 0) ? 1 : 0)) {
                if ((var22.bS.isMoving( != 0) ? 1 : 0)) {
                    return;
                }
                WorldPoint[] worldPointArray5 = new WorldPoint[1];
                worldPointArray5[2] = var29;
                List<WorldPoint> var30 = var22.a(worldPointArray5);
                NPC var31 = NPCs.getNearest(nPC -> {
                    int n2;
                    if ((var30.contains(nPC.getWorldLocation( != 0)) ? 1 : 0) && (nPC.isMoving( == 0) ? 1 : 0) && (nPC.getWorldLocation( == 0).equals((Object)var29) ? 1 : 0)) {
                        n2 = 1;
                        0;
                        if ((0xA ^ 0xE) <= 0) {
                            return ((0x63 ^ 0x64) & ~(0x2D ^ 0x2A)) != 0;
                        }
                    } else {
                        n2 = 2;
                    }
                    return n2 != 0;
                });
                if var31 != null {
                    WorldPoint var32 = var29.createWorldArea(7).toWorldPointList().stream().filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(var29))).orElse(null);
                    Movement.setDestination((WorldPoint)var32);
                }
                return;
            }
            WorldPoint[] worldPointArray6 = new WorldPoint[6];
            worldPointArray6[2] = var25;
            worldPointArray6[1] = var24;
            worldPointArray6[5] = var28;
            if ((var22.a(var1[var2[29]], worldPointArray6 == 0) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray7 = new WorldPoint[6];
            worldPointArray7[2] = var25;
            worldPointArray7[1] = var24;
            worldPointArray7[5] = var23;
            if ((var22.a(var1[var2[30]], worldPointArray7 == 0) ? 1 : 0)) {
                return;
            }
            WorldPoint var30 = H.CRABS_DOUBLE_1.c(var22.ak);
            WorldPoint var31 = H.CRABS_DOUBLE_2.c(var22.ak);
            WorldPoint[] worldPointArray8 = new WorldPoint[5];
            worldPointArray8[2] = var30;
            worldPointArray8[1] = var31;
            if ((var22.a(var1[var2[31]], worldPointArray8 == 0) ? 1 : 0)) {
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(WorldPoint ... worldPointArray) {
        void var6_5;
        void var33;
        void var34;
        ArrayList arrayList = new ArrayList();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(var1[var2[46]]));
        if tileObject2 == null {
            System.out.println(var1[var2[45]]);
            return null;
        }
        WorldPoint var35 = var34.getWorldArea().getCenter();
        ArrayList<WorldPoint> var36 = new ArrayList<WorldPoint>();
        WorldPoint var37 = new WorldPoint(2, 2, 2);
        int var38 = 2;
        while ((var38 < ((void)var33).length)) {
            bi var39;
            WorldPoint worldPoint;
            System.out.println("bounce: " + String.valueOf(var37) + " | crab: " + String.valueOf(var33[var38]));
            if (var38 == 0) {
                worldPoint = var35;
                0;
                if (-2 >= 0) {
                    return null;
                }
            } else {
                worldPoint = var37;
            }
            List<WorldPoint> var40 = var39.c(worldPoint, (WorldPoint)var33[var38]);
            var36.addAll(var40);
            0;
            var37 = var40.stream().max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var35))).get();
            ++var38;
            0;
            
            return null;
        }
        return var6_5;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(String string, NPC nPC) {
        void var41;
        if nPC == null {
            System.out.println(var1[var2[33]]);
            return 2;
        }
        void var42 = var41;
        int var43 = 0;
        switch (var42.hashCode()) {
            case -1801391991: {
                if (!(var42.equals(var1[var2[34]] != 0) ? 1 : 0)) break;
                var43 = 2;
                0;
                if (1 != 2) break;
                return ((0x44 ^ 0x2C ^ (0x16 ^ 0x2C)) & (61 + 186 - 107 + 100 ^ 111 + 158 - 200 + 93 ^ -1)) != 0;
            }
            case 2115395: {
                if (!(var42.equals(var1[var2[35]] != 0) ? 1 : 0)) break;
                var43 = 1;
                0;
                if (2 == 2) break;
                return ((91 + 131 - 188 + 192 ^ 28 + 30 - -58 + 72) & (0x5B ^ 0x41 ^ (0x56 ^ 0x12) ^ -1)) != 0;
            }
            case 64266207: {
                if (!(var42.equals(var1[var2[36]] != 0) ? 1 : 0)) break;
                var43 = 5;
                0;
                if ((0x8E ^ 0xA7 ^ (0x89 ^ 0xA4)) > 1) break;
                return ((0x97 ^ 0xBD ^ (0x4D ^ 0x5D)) & (0x36 ^ 0x76 ^ (0xF3 ^ 0x89) ^ -1)) != 0;
            }
            case -1650372460: {
                if (!(var42.equals(var1[var2[37]] != 0) ? 1 : 0)) break;
                var43 = 6;
            }
        }
        switch (var43) {
            case 0: {
                boolean bl2;
                void var44;
                if ((var44.getName( == 0).contains(var1[var2[38]]) ? 1 : 0)) {
                    bl2 = 1;
                    0;
                    if (3 <= 0) {
                        return ((1 ^ (0x41 ^ 2)) & (7 + 80 - -64 + 82 ^ 129 + 150 - 191 + 83 ^ -1)) != 0;
                    }
                } else {
                    bl2 = 2;
                }
                return bl2;
            }
            case 1: {
                boolean bl3;
                void var44;
                if ((var44.getName( == 0).contains(var1[var2[39]]) ? 1 : 0)) {
                    bl3 = 1;
                    0;
                    if null != null {
                        return ((0x81 ^ 0xC5 ^ (0x98 ^ 0x83)) & (149 + 148 - 271 + 190 ^ 106 + 41 - 83 + 71 ^ -1)) != 0;
                    }
                } else {
                    bl3 = 2;
                }
                return bl3;
            }
            case 2: {
                return 2;
            }
            case 3: {
                boolean bl4;
                void var44;
                if ((var44.getName( == 0).contains(var1[var2[40]]) ? 1 : 0)) {
                    bl4 = 1;
                    0;
                    if (((0x7F ^ 0x4A) & ~(0xBE ^ 0x8B)) != 0) {
                        return ((0xB ^ 0x3D) & ~(0x7C ^ 0x4A)) != 0;
                    }
                } else {
                    bl4 = 2;
                }
                return bl4;
            }
        }
        System.out.println("couldnt find color: " + string);
        return 2;
    }

    private static String var45(String var46, String var47) {
        var46 = new String(Base64.getDecoder().decode(var46.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var48 = new StringBuilder();
        char[] var49 = var47.toCharArray();
        int var50 = 2;
        char[] var51 = var46.toCharArray();
        int var52 = var51.length;
        int var53 = 2;
        while (var53 < var52) {
            char var54 = var51[var53];
            var48.append((char)(var54 ^ var49[var50 % var49.length]));
            0;
            ++var50;
            ++var53;
            0;
            if ((0xB0 ^ 0x92 ^ (0x2C ^ 0xA)) != 0) continue;
            return null;
        }
        return String.valueOf(var48);
    }

        catch (Exception var60) {
            var60.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(GraphicChanged graphicChanged) {
        Actor actor = graphicChanged.getActor();
        if ((actor.getName( != 0).contains(var1[var2[21]]) ? 1 : 0) && (actor.getGraphic() == var2[22])) {
            this.F((NPC)actor);
            System.out.println(var1[var2[23]]);
        }
    }

    private void E(NPC nPC) {
        Item item2 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[49]]));
        if item2 != null {
            item2.interact(var1[7]);
        }
        nPC.interact(var1[4]);
    }

    private static int var61(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    private void n(String string) {
        int var62;
        String string2 = string;
        int n2 = 0;
        switch (string2.hashCode()) {
            case -1801391991: {
                void var63;
                if (!(var63.equals(var1[var2[41]] != 0) ? 1 : 0)) break;
                var62 = 2;
                0;
                if (1 >= -1) break;
                return;
            }
            case 2115395: {
                void var63;
                if (!(var63.equals(var1[var2[42]] != 0) ? 1 : 0)) break;
                var62 = 1;
                0;
                if (1 >= 0) break;
                return;
            }
            case 64266207: {
                void var63;
                if (!(var63.equals(var1[var2[43]] != 0) ? 1 : 0)) break;
                var62 = 5;
                0;
                if (-2 < 0) break;
                return;
            }
            case -1650372460: {
                void var63;
                if (!(var63.equals(var1[var2[44]] != 0) ? 1 : 0)) break;
                var62 = 6;
            }
        }
        switch (var62) {
            case 0: {
                bi var64;
                var64.es();
                return;
            }
            case 1: {
                bi var64;
                var64.eu();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                bi var64;
                var64.ep();
                return;
            }
        }
    }

        catch (Exception var70) {
            var70.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void ep() {
        void var2_2;
        void var71;
        int n2 = this.eo();
        int[] nArray = new int[1];
        nArray[2] = n2;
        if ((Equipment.contains((int[] != 0)nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[1];
        nArray2[2] = var71;
        Item var72 = Inventory.getFirst((int[])nArray2);
        if var72 == null {
            return;
        }
        String[] stringArray = new String[5];
        stringArray[2] = var1[8];
        stringArray[1] = var1[9];
        var2_2.interact(stringArray);
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[var2[56]]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[2] = var1[var2[57]];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (3 == 3) return n2 != 0;
                    return ((3 ^ (0x45 ^ 0x67)) & (38 + 33 - 42 + 132 ^ 24 + 127 - 116 + 93 ^ -1)) != 0;
                }
            }
            n2 = 2;
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private void a(WorldPoint worldPoint, boolean bl2, WorldPoint ... worldPointArray) {
        void var6_6;
        void var73;
        void var74;
        void var75;
        void var76;
        bi var77;
        System.out.println(Arrays.toString(worldPointArray));
        List<WorldPoint> list = this.a(worldPointArray);
        NPC nPC2 = NPCs.getNearest((WorldPoint)worldPoint, nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var1[var2[50]]) ? 1 : 0) && (nPC.getInteracting( != null)) && (nPC.getInteracting( != 0).equals(this.bS) ? 1 : 0) && (this.D((NPC == 0)nPC) ? 1 : 0)) {
                n2 = 1;
                0;
                if null != null {
                    return ((66 + 74 - 5 + 23 ^ 47 + 26 - -22 + 36) & (0x5B ^ 0x27 ^ (0xD9 ^ 0xB8) ^ -1)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        });
        if nPC2 == null {
            this.en();
            return;
        }
        WorldPoint var78 = var77.a((WorldPoint)var76, (NPC)var75, (List<WorldPoint>)var74);
        if ((intlllllllllllllllIllIlIIlIlllIIIlI) && (var75.getWorldLocation( != 0).equals((Object)var76) ? 1 : 0) && (bi.var61(var77.bS.getWorldLocation( == 0).distanceTo2DHypotenuse((WorldPoint)var76), 1.0f))) {
            var77.E((NPC)var75);
            return;
        }
        if ((var75.isMoving( != 0) ? 1 : 0) && (var75.distanceTo((Locatable)var77.bS) < 6)) {
            return;
        }
        Movement.setDestination((WorldPoint)var6_6);
    }

    @Override
    public boolean cg() {
        bi var79;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var1[var2[59]]));
        if nPC2 == null {
            return this.cS();
        }
        if ((var79.em( != 0) ? 1 : 0)) {
            return 1;
        }
        this.ev();
        0;
        this.ew();
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    private void es() {
        void var3_4;
        bi var80;
        int n2 = this.er();
        int[] nArray = new int[1];
        nArray[2] = n2;
        if ((Equipment.contains((int[] == 0)nArray) ? 1 : 0)) {
            int[] nArray2 = new int[1];
            nArray2[2] = n2;
            Item item = Inventory.getFirst((int[])nArray2);
            if item != null {
                String[] stringArray = new String[6];
                stringArray[2] = var1[var2[10]];
                stringArray[1] = var1[var2[11]];
                stringArray[5] = var1[var2[12]];
                item.interact(stringArray);
            }
        }
        int var81 = var80.eq();
        int[] nArray3 = new int[1];
        nArray3[2] = var81;
        if ((Equipment.contains((int[] != 0)nArray3) ? 1 : 0)) {
            return;
        }
        int[] nArray4 = new int[1];
        nArray4[2] = var81;
        Item var82 = Inventory.getFirst((int[])nArray4);
        if var82 == null {
            return;
        }
        int n3 = Static.getItemManager().getItemStats(var81, 2).getEquipment().isTwoHanded();
        if ((Inventory.isFull( != 0) ? 1 : 0) && n3) {
            var80.co.x();
            0;
            return;
        }
        String[] stringArray = new String[5];
        stringArray[2] = var1[var2[13]];
        stringArray[1] = var1[var2[14]];
        var3_4.interact(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private void eu() {
        void var2_2;
        void var83;
        int n2 = this.et();
        int[] nArray = new int[1];
        nArray[2] = n2;
        if ((Equipment.contains((int[] != 0)nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[1];
        nArray2[2] = var83;
        Item var84 = Inventory.getFirst((int[])nArray2);
        if var84 == null {
            return;
        }
        String[] stringArray = new String[6];
        stringArray[2] = var1[var2[15]];
        stringArray[1] = var1[var2[16]];
        stringArray[5] = var1[var2[17]];
        var2_2.interact(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(String string, WorldPoint ... worldPointArray) {
        void var4_4;
        void var85;
        bi var86;
        WorldPoint var87;
        void var88;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(string) ? 1 : 0) && (tileObject.getName( != 0).contains(var1[var2[18]]) ? 1 : 0)) {
                n2 = 1;
                0;
                if (-1 != -1) {
                    return ((113 + 59 - 163 + 205 ^ 142 + 145 - 192 + 53) & (142 + 112 - 244 + 210 ^ 4 + 14 - -44 + 96 ^ -1)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        });
        if tileObject2 == null {
            return 1;
        }
        WorldPoint var89 = new WorldPoint(2, 2, 2);
        if ((((void == 0)var88).length)) {
            return 2;
        }
        int var90 = 2;
        while ((var90 < ((void)var88).length)) {
            NPC nPC2;
            NPC var91;
            var89 = var88[var90];
            var87 = var89;
            List var92 = NPCs.getAll(nPC -> {
                int n2;
                if ((nPC.getName( != 0).contains(var1[var2[48]]) ? 1 : 0) && (nPC.getWorldLocation( != 0).equals((Object)var87) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if null != null {
                        return ((0xEF ^ 0xB5) & ~(0x41 ^ 0x1B)) != 0;
                    }
                } else {
                    n2 = 2;
                }
                return n2 != 0;
            });
            if ((var92.size() > 1)) {
                var91 = var87.createWorldArea(7).toWorldPointList().stream().filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(var87))).orElse(null);
                Movement.setDestination((WorldPoint)var91);
                return 2;
            }
            if ((var92.isEmpty( != 0) ? 1 : 0)) {
                nPC2 = null;
                0;
                if (-1 > 0) {
                    return ((0x47 ^ 0x4F) & ~(0x75 ^ 0x7D)) != 0;
                }
            } else {
                nPC2 = var91 = (NPC)var92.get(2);
            }
            if ((var90 == ((void)var88).length - 1)) {
                0;
                if (-2 <= 0) break;
                return ((19 + 108 - 106 + 150 ^ 71 + 121 - 113 + 88) & (157 + 128 - 93 + 8 ^ 18 + 92 - -20 + 66 ^ -1)) != 0;
            }
            if ((var86.D(var91 == 0) ? 1 : 0)) {
                var86.a(var89, 1, (WorldPoint[])Arrays.copyOfRange(var88, 2, var90 + 1));
                return 2;
            }
            ++var90;
            0;
            if (-1 < 2) continue;
            return ((0x49 ^ 0x51) & ~(0x3C ^ 0x24)) != 0;
        }
        if ((var86.a(StringlllllllllllllllIllIlIIlIlIIIllIl, (NPC)(var87 = NPCs.getNearest(arg_0 -> bi.a(var90 = var89, arg_0)))) ? 1 : 0)) {
            var86.n((String)var85);
            var87.interact(var1[var2[32]]);
            var86.sleep(1);
            return 2;
        }
        this.a((WorldPoint)var4_4, 2, worldPointArray);
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    private void F(NPC nPC) {
        void var2_2;
        void var93;
        bi var94;
        int var95 = 2;
        while ((var95 < var94.en.size())) {
            NPC var96 = var94.en.get(var95).aP();
            if (var96 != null && (var96 == lllllllllllllllIllIlIIlIlIllIlII2)) {
                0;
                if (3 >= 0) break;
                return;
            }
            ++var95;
            0;
            if (-(0x65 ^ 0x60) < 0) continue;
            return;
        }
        if ((var95 >= var94.en.size())) {
            var94.en.add(new PHelper((NPC)var93, var94.cq.getTickCount()));
            0;
            System.out.println(var1[var2[19]]);
            return;
        }
        this.en.get((int)var2_2).q(this.cq.getTickCount());
        System.out.println(var1[var2[20]]);
    }

}

