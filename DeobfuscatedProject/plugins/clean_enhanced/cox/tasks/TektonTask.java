/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum6;
import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.NHelper;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Tekton", priority=10000, blocking=true, register=true)
public class TektonTask
extends CoxManager {
    private  n al;
    private  n ak;
    private final  int dI = 660;
     int dJ;
    public final  int dL = 7488;
    
    public final  int dK = 7473;
    public  int dM;
     int dA;
    
    private  int dN;
    private  int dO;
    private  int am;
     int dB;

    private boolean da() {
        int var3;
        int n2;
        if ((Combat.getSpecEnergy() < var2[14])) {
            return 2;
        }
        Item var4 = s.aY();
        if var4 == null {
            return 2;
        }
        int var5 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId();
        if ((var4.getId() == var5)) {
            n2 = 5;
            0;
            if (-(9 + 17 - -46 + 90 ^ 143 + 103 - 219 + 140) >= 0) {
                return ((114 + 170 - 88 + 24 ^ 63 + 186 - 198 + 137) & (0x34 ^ 0x7C ^ (0xBA ^ 0x92) ^ -1)) != 0;
            }
        } else {
            n2 = 2;
        }
        if (var3 = n2 == 0) {
            return 2;
        }
        Combat.toggleSpec();
        return 5;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[var2[23]]) ? 1 : 0)) {
                String[] stringArray = new String[5];
                stringArray[2] = var1[var2[24]];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 5;
                    0;
                    if (((7 ^ 0x50) & ~(0x4D ^ 0x1A)) <= 2) return n2 != 0;
                    return ((0xD4 ^ 0x96) & ~(0x7E ^ 0x3C)) != 0;
                }
            }
            n2 = 2;
            return n2 != 0;
        });
    }

    @Override
    public boolean cg() {
        WorldPoint lllllllllllllllIllIIlIllIlllllll2;
        aE var6;
        if ((this.co( != 0) ? 1 : 0)) {
            return 5;
        }
        WorldPoint var7 = H.TEKTON_START.c(var6.ak);
        TileObject var8 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var1[var2[28]]) ? 1 : 0)) {
                String[] stringArray = new String[5];
                stringArray[2] = var1[var2[29]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 5;
                    0;
                    if (((47 + 80 - 84 + 165 ^ 12 + 161 - -1 + 22) & (0xAB ^ 0x8B ^ (0xB7 ^ 0x83) ^ -1)) < 1) return n2 != 0;
                    return ((0xC ^ 0x29 ^ (0x59 ^ 0x6B)) & (0x88 ^ 0xBC ^ (0x4F ^ 0x6C) ^ -1)) != 0;
                }
            }
            n2 = 2;
            return n2 != 0;
        });
        if ((Reachable.isWalkable((WorldPoint == 0)var7) ? 1 : 0)) {
            if var8 == null {
                return var6.cS();
            }
            var8.interact(var1[2]);
            return 5;
        }
        NPC var9 = NPCs.getNearest(nPC -> nPC.getName().contains(var1[var2[27]]));
        if var9 == null {
            return var6.cS();
        }
        var6.db();
        if (!(var9.getAnimation() != 4) || (var9.getAnimation() == 6)) {
            var6.dM += 5;
            System.out.println(var6.dM);
            if (var6.dM <= 5) {
                var9.interact(var1[5]);
                return 5;
            }
            if ((var6.cp.flinchTekton( == 0) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var6.cY());
                return 5;
            }
            if ((var6.dM <= 7) && (var6.cp.flinchTekton( != 0) ? 1 : 0)) {
                WorldPoint var10 = var6.bS.getWorldArea().getMeleeTiles(var6.cq).stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).max(Comparator.comparingInt(worldPoint -> var9.getWorldArea().distanceTo(worldPoint))).orElse(null);
                Movement.setDestination((WorldPoint)var10);
                return 5;
            }
        }
        var6.dM = 2;
        if ((var9.isMoving( != 0) ? 1 : 0) && (var9.getWorldArea().distanceTo((Locatable)var6.bS) > 7)) {
            WorldPoint var10 = H.TEKTON_START.c(var6.ak);
            Projectile lllllllllllllllIllIIlIllIlllllll2 = Projectiles.getNearest(projectile -> {
                int n2;
                if ((projectile.getId() == 1) && (WorldPoint.fromLocal((Client)this.cq <= (LocalPoint)projectile.getTarget()).distanceTo(var10), 5)) {
                    n2 = 5;
                    0;
                    if null != null {
                        return ((0x17 ^ 0x1D ^ (0x12 ^ 0x50)) & (0xFD ^ 0x8E ^ (0xAC ^ 0x97) ^ -1)) != 0;
                    }
                } else {
                    n2 = 2;
                }
                return n2 != 0;
            });
            if lllllllllllllllIllIIlIllIlllllll2 != null {
                return 2;
            }
            Movement.setDestination((WorldPoint)var10);
            return 5;
        }
        if ((var9.getPoseAnimation() == 3)) {
            if var8 != null {
                Movement.setDestination((WorldPoint)var6.cZ());
                return 5;
            }
            WorldPoint var10 = var7.createWorldArea(8).toWorldPointList().stream().filter(worldPoint -> {
                int n2;
                if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (var9.getWorldArea().distanceTo(worldPoint) == var2[10])) {
                    n2 = 5;
                    0;
                    if (((0x5C ^ 0x7E ^ (0x7F ^ 0x1D)) & (0xD5 ^ 0xAF ^ (0x58 ^ 0x62) ^ -1)) != 0) {
                        return ((0x51 ^ 0x54 ^ (0x76 ^ 0x7D)) & (0x44 ^ 0x34 ^ (0xF1 ^ 0x8F) ^ -1)) != 0;
                    }
                } else {
                    n2 = 2;
                }
                return n2 != 0;
            }).min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var7))).orElse(null);
            if var10 == null {
                return 2;
            }
            Movement.setDestination((WorldPoint)var10);
            return 5;
        }
        var6.da();
        0;
        if ((var9.isMoving( != 0) ? 1 : 0)) {
            if ((var6.bS.getInteracting( != null)) && (var6.bS.getInteracting( != 0).equals(var9) ? 1 : 0)) {
                return 2;
            }
            var9.interact(var1[7]);
            return 5;
        }
        if ((var6.cp.flinchTekton( == 0) ? 1 : 0)) {
            WorldPoint var10 = var6.cX();
            if var10 == null {
                return 2;
            }
            lllllllllllllllIllIIlIllIlllllll2 = var6.cW();
            if ((lllllllllllllllIllIIlIllIlllllll2.contains(var6.bS.getWorldLocation( != 0)) ? 1 : 0)) {
                var6.dJ = 2;
                var6.dA += 5;
                if (var6.dA == 5) {
                    var9.interact(var1[9]);
                    return 5;
                }
                Movement.setDestination((WorldPoint)var10);
                return 5;
            }
            var6.dA = 2;
            WorldPoint var11 = var6.cY();
            if ((var6.bS.isMoving( != 0) ? 1 : 0)) {
                return 2;
            }
            if ((var6.bS.isMoving( != 0) ? 1 : 0)) {
                return 2;
            }
            Movement.setDestination((WorldPoint)var11);
        }
        int var10 = var9.getAnimation();
        if ((var9.getWorldArea( != 0).getMeleeTiles(var6.cq).contains(var6.bS.getWorldLocation()) ? 1 : 0)) {
            System.out.println(var1[var2[10]]);
            var6.dO = 2;
            lllllllllllllllIllIIlIllIlllllll2 = var6.bS.getWorldArea().getMeleeTiles(var6.cq).stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).max(Comparator.comparingInt(worldPoint -> var9.getWorldArea().distanceTo(worldPoint))).orElse(null);
            Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIllIlllllll2);
            System.out.println(var1[8]);
            return 5;
        }
        System.out.println("last: " + var6.dN + " | current: " + var10 + " | frame: " + var9.getAnimationFrame());
        if ((var9.getAnimation() != 0) && (var9.getAnimationFrame() >= var2[11]) && (var6.dO > 0)) {
            var6.dN = var9.getAnimation();
            var9.interact(var1[var2[12]]);
        }
        this.dO += 5;
        return 5;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, int n4) {
        int n5;
        void var12;
        void var13;
        void var14;
        if (n3 == 0) {
            boolean bl2;
            if (!(n2 <= var2[17] - n4) || (n2 < n4)) {
                bl2 = 5;
                0;
                if (3 < 0) {
                    return ((0x48 ^ 8) & ~(0x38 ^ 0x78)) != 0;
                }
            } else {
                bl2 = 2;
            }
            return bl2;
        }
        if (((int)var14 >= (int)(var13 - var12)) && ((int)var14 <= (int)(var13 + var12))) {
            n5 = 5;
            0;
            if (-1 > 3) {
                return ((0xF ^ 0x59) & ~(0xF8 ^ 0xAE)) != 0;
            }
        } else {
            n5 = 2;
        }
        return n5 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int z(int n2) {
        int var15 = 2;
        while (var15 < var2[10]) {
            void var16;
            aE var17;
            if ((var17.a(intlllllllllllllllIllIIlIllIlIllIIl, var15 * var2[15], var2[16]) ? 1 : 0)) {
                return var15 * var2[15];
            }
            ++var15;
            0;
            if (3 > 0) continue;
            return (0x94 ^ 0x98 ^ (0x1D ^ 1)) & (118 + 147 - 161 + 57 ^ 161 + 50 - 146 + 112 ^ -1);
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cZ() {
        WorldPoint worldPoint2 = H.TEKTON_START.c(this.ak);
        List list = this.bS.getWorldLocation().createWorldArea(7).toWorldPointList();
        int[] nArray = new int[5];
        nArray[2] = 1;
        List list2 = Projectiles.getAll((int[])nArray);
        ArrayList arrayList = new ArrayList();
        Iterator var18 = list2.iterator();
        while ((var18.hasNext( != 0) ? 1 : 0)) {
            void var19;
            aE var20;
            Projectile var21 = (Projectile)var18.next();
            WorldPoint var22 = WorldPoint.fromLocal((Client)var20.cq, (LocalPoint)var21.getTarget());
            var19.addAll(var22.createWorldArea(5).toWorldPointList());
            0;
            0;
            if (((119 + 6 - 64 + 73 ^ 5 + 97 - 34 + 74) & (0x2C ^ 0x25 ^ 1 ^ -1)) == 0) continue;
            return null;
        }
        WorldPoint worldPoint3 = list.stream().filter(worldPoint -> {
            int n2;
            if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (arrayList.contains(worldPoint == 0) ? 1 : 0)) {
                n2 = 5;
                0;
                if ((0x9F ^ 0x9B) < (6 ^ 2)) {
                    return ((0x7C ^ 0x6C) & ~(0x81 ^ 0x91)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(object -> ((WorldPoint)object).distanceTo((Locatable)this.bS)).thenComparingDouble(object -> ((WorldPoint)object).distanceTo2DHypotenuse(worldPoint2))).orElse(null);
        return worldPoint3;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    @Override
    public EquipmentSetup cj() {
        int[] nArray;
        if ((Combat.getSpecEnergy() >= var2[14]) && (nArray = s.aZ( != null))) {
            return s.b(s.aZ());
        }
        return s.b(s.e(N.TEKTON));
    }

    private static String var29(String var30, String var31) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var33 = var31.toCharArray();
        int var34 = 2;
        char[] var35 = var30.toCharArray();
        int var36 = var35.length;
        int var37 = 2;
        while (var37 < var36) {
            char var38 = var35[var37];
            var32.append((char)(var38 ^ var33[var34 % var33.length]));
            0;
            ++var34;
            ++var37;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var32);
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var1[var2[25]]));
        if nPC2 == null {
            return null;
        }
        List list = Prayers.getOffensive();
        Prayer prayer = Prayer.PROTECT_FROM_MELEE;
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

        catch (Exception var44) {
            var44.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cX() {
        aE var45;
        void var46;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var1[var2[21]]));
        if nPC2 == null {
            return null;
        }
        WorldPoint var47 = var46.getWorldLocation();
        System.out.println(var46.getOrientation());
        switch (var45.z(var46.getOrientation())) {
            case 0: {
                return var47.dx(var2[10]).dy(9);
            }
            case 512: {
                return var47.dx(9).dy(0);
            }
            case 1024: {
                return var47.dx(0).dy(2);
            }
            case 1536: {
                return var47.dx(2).dy(var2[10]);
            }
        }
        return null;
    }

    @Inject
    protected TektonTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
        this.dI = 1;
        this.dA = 2;
        this.dB = 2;
        this.dJ = 2;
        this.dK = 3;
        this.dL = 4;
        this.dM = 2;
        this.dN = 0;
        this.dO = 2;
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cY() {
        aE var48;
        void var49;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var1[var2[11]]));
        if nPC2 == null {
            return null;
        }
        WorldPoint var50 = var49.getWorldLocation();
        switch (var48.z(var49.getOrientation())) {
            case 1536: {
                return var50.dx(var2[10]).dy(9);
            }
            case 0: {
                return var50.dx(9).dy(0);
            }
            case 512: {
                return var50.dx(0).dy(2);
            }
            case 1024: {
                return var50.dx(2).dy(var2[10]);
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean y(int n2) {
        void var51;
        Item item2 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[26]]));
        if item2 == null {
            return 2;
        }
        if ((Movement.getRunEnergy() > (int)var51)) {
            return 2;
        }
        item2.interact(var1[var2[13]]);
        return 5;
    }

    private List<WorldPoint> cW() {
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var1[var2[22]]));
        if nPC2 == null {
            return null;
        }
        WorldPoint worldPoint = nPC2.getWorldLocation();
        return List.of(worldPoint.dx(var2[10]).dy(9), worldPoint.dx(9).dy(0), worldPoint.dx(0).dy(2), worldPoint.dx(2).dy(var2[10]));
    }

    public void db() {
        if ((this.cj( != 0).isFullyEquipped() ? 1 : 0) && (Combat.getAttackStyle() != Combat.getAttackStyle()2)) {
            int[] nArray = new int[7];
            nArray[2] = var2[19];
            nArray[5] = var2[20];
            if ((Equipment.contains((int[] != 0)nArray) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.THIRD);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aE var52;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)this.al.bs);
            return 5;
        }
        TileObject var53 = var52.cR();
        if var53 == null {
            return 2;
        }
        if (!(var52.bS.isMoving( == 0) ? 1 : 0) || (var52.bS.isAnimating( != 0) ? 1 : 0)) {
            return 2;
        }
        var1_1.interact(var1[var2[18]]);
        return 5;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (((Object)this.ak.bw == (Object)this.ak.bw2)N.TEKTON)) {
            bl2 = 5;
            0;
            if (((0xB8 ^ 0xC3 ^ (0x33 ^ 0x6F)) & (0x18 ^ 7 ^ (0xA5 ^ 0x9D) ^ -1)) >= 1) {
                return ((0xD8 ^ 0xA6 ^ (0x27 ^ 0x6B)) & (0xC7 ^ 0x96 ^ (0x51 ^ 0x32) ^ -1)) != 0;
            }
        } else {
            bl2 = 2;
        }
        return bl2;
    }
}

