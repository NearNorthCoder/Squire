/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.CoxManager;
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
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Vasa", priority=10000, blocking=true)
public class VasaTask
extends CoxManager {
    private  int dB;
    private  NPC dQ;
    private  WorldPoint dR;
    private  n ak;
    private  int am;
    private  n al;
    
    private  NPC dP;

    private boolean cT() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).toLowerCase().contains(var2[var1[17]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[var1[18]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return ((0x49 ^ 0x77) & ~(7 ^ 0x39)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if tileObject2 == null {
            System.out.println(var2[var1[13]]);
            return 1;
        }
        tileObject2.interact(var2[var1[14]]);
        return 2;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var2[var1[23]]));
        if nPC2 == null {
            return null;
        }
        List list = Prayers.getOffensive();
        Prayer prayer = Prayer.PROTECT_FROM_MISSILES;
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    private NPC de() {
        return NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[3]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[5];
                if ((nPC.hasActionstringArray) && (this.ak.a(LocatablenPC) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if (1 < (9 ^ 0xD)) return n2 != 0;
                    return ((0x91 ^ 0xAD) & ~(4 ^ 0x38)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
    }

    private void dg() {
        WorldPoint worldPoint = this.ak.bq;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static  int c(NPC nPC, Object object) {
        return nPC.getWorldArea().distanceTo((WorldPoint)object);
    }

    /*
     * WARNING - void declaration
     */
    private boolean dj() {
        aF var9;
        void var10;
        NPC nPC = this.df();
        if nPC == null {
            return 1;
        }
        if ((var10.getAnimation() != 0)) {
            System.out.print(var2[var1[10]]);
            return 1;
        }
        if ((var10.getWorldArea().distanceTo((Locatable)var9.bS) < 6)) {
            WorldPoint var11 = var9.bS.getWorldLocation().createWorldArea(4).toWorldPointList().stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).max(Comparator.comparingInt(arg_0 -> aF.c((NPC)var10, arg_0)).thenComparingDouble(object -> -this.bS.distanceTo((WorldPoint)object))).orElse(null);
            if var11 == null {
                return 1;
            }
            Movement.setDestination((WorldPoint)var11);
            return 2;
        }
        return 1;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[var1[21]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[var1[22]];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if (((0x2A ^ 0x7F ^ (0x2C ^ 0x39)) & (127 + 189 - 102 + 33 ^ 19 + 58 - 27 + 133 ^ -1)) < (0x5D ^ 0x15 ^ (0x5A ^ 0x16))) return n2 != 0;
                    return ((0xBD ^ 0xB2 ^ (0x38 ^ 0xC)) & (211 + 198 - 275 + 116 ^ 127 + 123 - 117 + 60 ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private boolean j(boolean bl2) {
        WorldPoint var12;
        aF var13;
        void var14;
        this.dP = this.df();
        if (this.dP == null) {
            return 1;
        }
        if ((intlllllllllllllllIlllIIllIIlIIIIll) && (var13.di( != 0) ? 1 : 0)) {
            System.out.println(var2[4]);
            Movement.setDestination((WorldPoint)var13.dd());
            return 2;
        }
        if ((var13.cq.getTickCount() - var13.dB > 2)) {
            var13.dP.interact(var2[6]);
            var13.dB = var13.cq.getTickCount();
            var13.dR = var13.bS.getWorldLocation();
            System.out.println(var2[7]);
            return 2;
        }
        ArrayList var15 = new ArrayList();
        var15.addAll(var13.dR.createWorldArea(2).toWorldPointList());
        0;
        int[] nArray = new int[2];
        nArray[1] = 8;
        List var16 = Projectiles.getAll((int[])nArray);
        WorldPoint var17 = var16.iterator();
        while ((var17.hasNext( != 0) ? 1 : 0)) {
            Projectile var18 = (Projectile)var17.next();
            if var18 == null {
                0;
                if null == null continue;
                return ((0xC0 ^ 0x83) & ~(0x69 ^ 0x2A)) != 0;
            }
            var12 = WorldPoint.fromLocal((Client)var13.cq, (LocalPoint)var18.getTarget());
            var15.addAll(var12.createWorldArea(2).toWorldPointList());
            0;
            0;
            if (2 <= 2) continue;
            return ((0x2B ^ 0x35) & ~(0x34 ^ 0x2A)) != 0;
        }
        if ((var15.contains(var13.bS.getWorldLocation( != 0)) ? 1 : 0)) {
            if ((intlllllllllllllllIlllIIllIIlIIIIll)) {
                int n2;
                var17 = var13.dd();
                if ((var13.cp.vasaToggle( != 0) ? 1 : 0)) {
                    n2 = 9;
                    0;
                    if (-1 > 0) {
                        return ((0x9F ^ 0xAF ^ (0xF7 ^ 0x8F)) & (0x52 ^ 0x33 ^ (0x27 ^ 0xE) ^ -1)) != 0;
                    }
                } else {
                    n2 = 7;
                }
                int var18 = n2;
                var12 = var13.bS.getWorldLocation().createWorldArea(4).toWorldPointList().stream().filter(worldPoint -> {
                    int n2;
                    if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (var15.contains(worldPoint == 0) ? 1 : 0)) {
                        n2 = 2;
                        0;
                        if (((123 + 94 - 117 + 43 ^ 36 + 96 - 6 + 44) & (5 + 22 - -21 + 98 ^ 10 + 165 - 112 + 120 ^ -1)) < -1) {
                            return ((0xAE ^ 0xC5 ^ (0x7F ^ 0x37)) & (0xE1 ^ 0x98 ^ (0x79 ^ 0x23) ^ -1)) != 0;
                        }
                    } else {
                        n2 = 1;
                    }
                    return n2 != 0;
                }).min(Comparator.comparingInt(object -> Math.abs(var18 - this.dP.getWorldArea().distanceTo((WorldPoint)object))).thenComparingInt(object -> ((WorldPoint)object).distanceToPath(this.cq, var17))).orElse(null);
                Movement.setDestination((WorldPoint)var12);
                return 2;
            }
            var17 = var13.bS.getWorldLocation().createWorldArea(4).toWorldPointList().stream().filter(worldPoint -> {
                int n2;
                if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (var15.contains(worldPoint == 0) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if (1 <= (2 & (2 ^ -1))) {
                        return ((0xDC ^ 0x87 ^ (0x76 ^ 0x6A)) & (1 ^ 0x22 ^ (0x64 ^ 0) ^ -1)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> Math.abs(7 - this.dP.getWorldArea().distanceTo(worldPoint)))).orElse(null);
            Movement.setDestination((WorldPoint)var17);
            return 2;
        }
        this.dP.interact(var2[9]);
        return 2;
    }

    private NPC df() {
        return NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[var1[19]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[var1[20]];
                if ((nPC.hasActionstringArray) && (this.ak.a(LocatablenPC) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if ((0x7E ^ 0x7A) == (0x8D ^ 0x89)) return n2 != 0;
                    return ((0x23 ^ 0x15) & ~(0xBD ^ 0x8B)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aF var19;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)this.al.bt) ? 1 : 0)) {
                return 1;
            }
            Movement.setDestination((WorldPoint)var19.al.bs);
            return 2;
        }
        TileObject var20 = var19.cR();
        if var20 == null {
            Movement.setDestination((WorldPoint)var19.ak.bq.dx(5).dy(5));
            return 2;
        }
        if (!(var19.bS.isMoving( == 0) ? 1 : 0) || (var19.bS.isAnimating( != 0) ? 1 : 0)) {
            return 1;
        }
        var1_1.interact(var2[2]);
        return 2;
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = 1;
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = 1;
        while (var29 < var28) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if ((91 + 10 - 13 + 65 ^ 148 + 142 - 244 + 111) >= (0xED ^ 0x8F ^ (0x19 ^ 0x7F))) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    /*
     * WARNING - void declaration
     */
    private boolean cU() {
        void var1_1;
        aF var31;
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 1;
        }
        TileItem var32 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.getName( != 0).startsWith(var2[var1[16]]) ? 1 : 0) && (this.ak.a(LocatabletileItem) ? 1 : 0) && (Reachable.isInteractable(LocatabletileItem) ? 1 : 0)) {
                n2 = 2;
                0;
                if (-(0x49 ^ 0x4D) > 0) {
                    return ((0x79 ^ 0x2C) & ~(0xCB ^ 0x9E)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var32 == null {
            return 1;
        }
        var1_1.interact(var2[var1[15]]);
        return 2;
    }

    private boolean di() {
        aF var33;
        NPC nPC = this.de();
        if nPC == null {
            return 1;
        }
        WorldPoint var34 = var33.dd();
        List var35 = var33.bS.getWorldLocation().pathTo(var33.cq, var34);
        Iterator var36 = var35.iterator();
        while ((var36.hasNext( != 0) ? 1 : 0)) {
            WorldPoint var37 = (WorldPoint)var36.next();
            if ((var33.dP.getWorldArea( != 0).contains(var37) ? 1 : 0)) {
                return 2;
            }
            0;
            if (((0x69 ^ 0x76) & ~(0x5C ^ 0x43)) == 0) continue;
            return ((0x8E ^ 0xB0) & ~(0x4B ^ 0x75) & ~((0xEB ^ 0x89) & ~(0x3A ^ 0x58))) != 0;
        }
        return 1;
    }

    @Inject
    protected VasaTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
        this.dB = 0;
        this.dR = new WorldPoint(1, 1, 1);
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint dd() {
        void var2_2;
        void var38;
        NPC nPC = this.de();
        if nPC == null {
            return null;
        }
        List var39 = var38.getWorldArea().getMeleeTiles(Static.getClient()).stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).collect(Collectors.toList());
        if ((var39.isEmpty( != 0) ? 1 : 0)) {
            return null;
        }
        WorldPoint var40 = (WorldPoint)var39.get(1);
        List var41 = var39.stream().filter(worldPoint2 -> {
            boolean bl2;
            if (!(worldPoint2.getWorldX() != var40.getWorldX()) || (worldPoint2.getWorldY() == var40.getWorldY())) {
                bl2 = 2;
                0;
                if (3 != 3) {
                    return ((0x61 ^ 0x5D) & ~(0xAF ^ 0x93)) != 0;
                }
            } else {
                bl2 = 1;
            }
            return bl2;
        }).collect(Collectors.toList());
        var39.removeAll(var41);
        0;
        if ((var39.size() > var41.size())) {
            return (WorldPoint)var41.get(1);
        }
        return (WorldPoint)var2_2.get(1);
    }

    /*
     * WARNING - void declaration
     */
    private boolean dc() {
        aF var42;
        void var43;
        NPC nPC = this.de();
        NPC nPC2 = this.df();
        if (!nPC != null || nPC2 == null) {
            return 1;
        }
        if ((var43.isDead( != 0) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var42.ak.bq.dx(3).dy(3));
            return 2;
        }
        var42.db();
        if ((var42.bS.getInteracting( != null)) && (var42.bS.getInteracting( != 0).equals(var43) ? 1 : 0)) {
            return 1;
        }
        WorldPoint var44 = var42.dd();
        if ((var42.bS.distanceTo(var44) > 4)) {
            Movement.setDestination((WorldPoint)var44);
            return 2;
        }
        nPC.interact(var2[1]);
        return 2;
    }

        catch (Exception var50) {
            var50.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean cg() {
        aF var51;
        if ((this.bS.distanceTo(this.ak.bs) <= 2) && (this.cT( != 0) ? 1 : 0)) {
            return 2;
        }
        int var52 = aG.dk();
        System.out.println("state: " + aG.dk());
        NPC var53 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[var1[24]]) ? 1 : 0) && (this.ak.a(LocatablenPC) ? 1 : 0)) {
                n2 = 2;
                0;
                if null != null {
                    return ((0xE3 ^ 0xAE) & ~(0x7D ^ 0x30)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var53 != null {
            Movement.setDestination((WorldPoint)var53.getWorldArea().getRandom());
            return 2;
        }
        switch (var52) {
            case 0: {
                if ((var51.cU( != 0) ? 1 : 0)) {
                    return 2;
                }
                return var51.cS();
            }
            case 3: {
                return var51.dc();
            }
            case 2: {
                return var51.j(2);
            }
            case 4: {
                return var51.j(1);
            }
            case 1: {
                return var51.dj();
            }
        }
        return 2;
    }

    public void db() {
        if ((this.cj( != 0).isFullyEquipped() ? 1 : 0) && (Combat.getAttackStyle() != Combat.getAttackStyle()2)) {
            int[] nArray = new int[4];
            nArray[1] = var1[11];
            nArray[2] = var1[12];
            if ((Equipment.contains((int[] != 0)nArray) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
            }
        }
    }

    private void dh() {
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.VASA));
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (((Object)this.ak.bw == (Object)this.ak.bw2)N.VASA)) {
            bl2 = 2;
            0;
            if (1 < 0) {
                return ((0x9F ^ 0xBC ^ (0x38 ^ 0x25)) & (0x77 ^ 0x30 ^ (0x5F ^ 0x26) ^ -1)) != 0;
            }
        } else {
            bl2 = 1;
        }
        return bl2;
    }

}

