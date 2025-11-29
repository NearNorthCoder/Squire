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
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.cox.tasks;

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
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Ice Demon", priority=10000, blocking=true)
public class IceDemonTask
extends CoxManager {
    private final  int eo = 29742;
    private  n al;
    private  n ak;
    
    private final  int ep = 7603;
    private final  int eq = 1324;
    private  int am;

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (((Object)this.ak.bw == (Object)this.ak.bw2)N.ICE_DEMON)) {
            bl2 = 7;
            0;
            if (2 < ((226 + 138 - 174 + 41 ^ 115 + 20 - 86 + 121) & (0x5A ^ 0x4F ^ (0x3B ^ 0x63) ^ -1))) {
                return ((79 + 106 - 72 + 29 ^ 137 + 56 - 83 + 75) & (0xE1 ^ 0xBD ^ (0xEA ^ 0x81) ^ -1)) != 0;
            }
        } else {
            bl2 = 8;
        }
        return bl2;
    }

    @Inject
    protected IceDemonTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
        this.eo = 1;
        this.ep = 2;
        this.eq = 3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var2[var1[31]]));
        NPC nPC3 = NPCs.getNearest(nPC -> nPC.getName().contains(var2[var1[30]]));
        if (nPC2 == null && nPC3 != null) {
            void var3;
            arrayList.addAll(Prayers.getOffensive());
            0;
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            0;
            return var3;
        }
        return null;
    }

    private boolean ex() {
        if ((Inventory.contains(item -> {
            int n2;
            if ((item.getName( == 0 != 0).contains(var2[var1[25]]) ? 1 : 0) && (item.getName( == 0).contains(var2[var1[26]]) ? 1 : 0) && (item.getId() != var1[27])) {
                n2 = 7;
                0;
                if null != null {
                    return ((0x5E ^ 0x1F ^ (0x1C ^ 0x19)) & (0x33 ^ 0x47 ^ (0x77 ^ 0x47) ^ -1)) != 0;
                }
            } else {
                n2 = 8;
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if ((Inventory.isFull( != 0) ? 1 : 0)) {
                this.co.x();
                0;
                return 7;
            }
            TileObject var4 = TileObjects.getNearest(tileObject -> {
                int n2;
                if ((tileObject.getName( != 0).contains(var2[var1[24]]) ? 1 : 0)) {
                    String[] stringArray = new String[7];
                    stringArray[8] = var2[var1[14]];
                    if ((tileObject.hasActionstringArray)) {
                        n2 = 7;
                        0;
                        if null == null return n2 != 0;
                        return ((0xF9 ^ 0xBB) & ~(0x5E ^ 0x1C)) != 0;
                    }
                }
                n2 = 8;
                return n2 != 0;
            });
            if var4 == null {
                return 8;
            }
            var4.interact(var2[var1[20]]);
            return 7;
        }
        String[] stringArray = new String[7];
        stringArray[8] = var2[var1[21]];
        if ((Inventory.contains((String[] == 0)stringArray) ? 1 : 0)) {
            if ((Inventory.isFull( != 0) ? 1 : 0)) {
                bj var5;
                var5.co.x();
                0;
                return 7;
            }
            TileObject var4 = TileObjects.getNearest(tileObject -> {
                int n2;
                if ((tileObject.getName( != 0).contains(var2[var1[22]]) ? 1 : 0)) {
                    String[] stringArray = new String[7];
                    stringArray[8] = var2[var1[23]];
                    if ((tileObject.hasActionstringArray)) {
                        n2 = 7;
                        0;
                        if (1 <= 2) return n2 != 0;
                        return ((0xF2 ^ 0xAD) & ~(0xD0 ^ 0x8F)) != 0;
                    }
                }
                n2 = 8;
                return n2 != 0;
            });
            if var4 == null {
                return 8;
            }
            var4.interact(var2[var1[19]]);
            return 7;
        }
        return 8;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[var1[28]]) ? 1 : 0)) {
                String[] stringArray = new String[7];
                stringArray[8] = var2[var1[29]];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 7;
                    0;
                    if (((135 + 79 - 141 + 67 ^ 154 + 172 - 152 + 8) & (0x13 ^ 0x15 ^ (0x86 ^ 0xBA) ^ -1)) < 1) return n2 != 0;
                    return ((78 + 84 - 144 + 180 ^ 19 + 144 - 47 + 31) & (64 + 87 - 38 + 36 ^ 130 + 73 - 196 + 185 ^ -1)) != 0;
                }
            }
            n2 = 8;
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bj var18;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)this.al.bt) ? 1 : 0)) {
                return 8;
            }
            Movement.setDestination((WorldPoint)var18.al.bs);
            return 7;
        }
        TileObject var19 = var18.cR();
        if var19 == null {
            Movement.setDestination((WorldPoint)var18.ak.bq.dx(var1[14]).dy(var1[14]));
            return 7;
        }
        if (!(var18.bS.isMoving( == 0) ? 1 : 0) || (var18.bS.isAnimating( != 0) ? 1 : 0)) {
            return 8;
        }
        var1_1.interact(var2[6]);
        return 7;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = 8;
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = 8;
        while (var28 < var27) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var30;
        bj var31;
        void var32;
        void var33;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var2[var1[11]]));
        NPC nPC3 = NPCs.getNearest(nPC -> nPC.getName().contains(var2[var1[36]]));
        int n2 = 4 - this.co.K() + (5 - Skills.getLevel((SkiSkill.WOODCUTTING)) / 6;
        if ((n2 > 0) && (this.ex( != 0) ? 1 : 0)) {
            return 7;
        }
        if (var33 == null && var32 == null) {
            return var31.cS();
        }
        if (var32 != null && (var32.isDead( != 0) ? 1 : 0)) {
            System.out.println(var2[8]);
            var31.co.g(5);
        }
        if var33 == null {
            Projectile var34 = Projectiles.getNearest(projectile -> {
                int n2;
                if ((projectile.getId() == 3) && (this.bS.getWorldLocation( != 0).createWorldArea(7).toWorldPointList().contains(WorldPoint.fromLocal((Client)this.cq, (LocalPoint)projectile.getTarget())) ? 1 : 0)) {
                    n2 = 7;
                    0;
                    if null != null {
                        return ((0x34 ^ 0x60) & ~(0x1E ^ 0x4A)) != 0;
                    }
                } else {
                    n2 = 8;
                }
                return n2 != 0;
            });
            if var34 == null {
                if ((var31.bS.getInteracting( != null)) && (var31.bS.getInteracting( != 0).getName().contains(var2[7]) ? 1 : 0)) {
                    return 8;
                }
                var32.interact(var2[9]);
                return 7;
            }
            System.out.println(WorldPoint.fromLocal((Client)var31.cq, (LocalPoint)var34.getTarget()));
            System.out.println(var31.bS.getWorldLocation());
            Movement.setDestination((WorldPoint)var31.cX());
            return 7;
        }
        if (((int > 0)var30)) {
            TileObject lllllllllllllllIllIlllllIlIIlIll2;
            int[] nArray = new int[7];
            nArray[8] = var1[10];
            int var34 = Inventory.getCount((boolean)7, (int[])nArray);
            if (!(var34 < (int)var30) || (var34 >= var1[11])) {
                TileObject lllllllllllllllIllIlllllIlIIlIll2 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if ((tileObject.getName( != 0).contains(var2[var1[34]]) ? 1 : 0)) {
                        String[] stringArray = new String[7];
                        stringArray[8] = var2[var1[35]];
                        if ((tileObject.hasActionstringArray)) {
                            n2 = 7;
                            0;
                            if (-2 <= 0) return n2 != 0;
                            return ((0x1D ^ 0x58 ^ (0x4C ^ 0x1B)) & (0x54 ^ 5 ^ (0x27 ^ 0x64) ^ -1)) != 0;
                        }
                    }
                    n2 = 8;
                    return n2 != 0;
                });
                if lllllllllllllllIllIlllllIlIIlIll2 == null {
                    return 8;
                }
                if (!(var31.bS.isMoving( == 0) ? 1 : 0) || (var31.bS.isAnimating( != 0) ? 1 : 0)) {
                    return 8;
                }
                lllllllllllllllIllIlllllIlIIlIll2.interact(var2[var1[12]]);
                return 7;
            }
            if ((Inventory.isFull( != 0) ? 1 : 0)) {
                int[] nArray2 = new int[7];
                nArray2[8] = var1[10];
                if ((Inventory.contains((int[] == 0)nArray2) ? 1 : 0)) {
                    var31.co.x();
                    0;
                    return 7;
                }
            }
            if ((lllllllllllllllIllIlllllIlIIlIll2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if ((tileObject.getName( == null != 0).contains(var2[var1[32]]) ? 1 : 0)) {
                    String[] stringArray = new String[7];
                    stringArray[8] = var2[var1[33]];
                    if ((tileObject.hasActionstringArray)) {
                        n2 = 7;
                        0;
                        if (3 > 2) return n2 != 0;
                        return ((0xA6 ^ 0xAA ^ (0x4D ^ 9)) & (7 + 31 - 1 + 215 ^ 23 + 167 - 123 + 113 ^ -1)) != 0;
                    }
                }
                n2 = 8;
                return n2 != 0;
            }))) {
                return 8;
            }
            if (!(var31.bS.isMoving( == 0) ? 1 : 0) || (var31.bS.isAnimating( != 0) ? 1 : 0)) {
                return 8;
            }
            lllllllllllllllIllIlllllIlIIlIll2.interact(var2[var1[13]]);
        }
        return 7;
    }

    private WorldPoint cX() {
        System.out.println(var2[var1[15]]);
        String[] stringArray = new String[7];
        stringArray[8] = var2[var1[16]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        List list = new WorldArea(nPC.getWorldLocation().dx(var1[17]).dy(var1[17]), var1[15], var1[15]).toWorldPointList();
        List list2 = new WorldArea(nPC.getWorldLocation().dx(var1[18]).dy(var1[18]), var1[19], var1[19]).toWorldPointList();
        list2.removeIf(worldPoint -> list.contains(worldPoint));
        0;
        WorldPoint worldPoint2 = list2.stream().filter(worldPoint -> {
            int n2;
            if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (Projectiles.getNearest(projectile -> {
                int n2;
                if ((projectile.getId( != null) == 3) && (worldPoint.createWorldArea(7 == 0).contains(WorldPoint.fromLocal((Client)this.cq, (LocalPoint)projectile.getTarget())) ? 1 : 0)) {
                    n2 = 7;
                    0;
                    if (3 < 1) {
                        return ((0x29 ^ 0x6F) & ~(0x2D ^ 0x6B)) != 0;
                    }
                } else {
                    n2 = 8;
                }
                return n2 != 0;
            }))) {
                n2 = 7;
                0;
                
            } else {
                n2 = 8;
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.bS))).orElse(null);
        System.out.println("Safespot: " + String.valueOf(worldPoint2) + " | player: " + String.valueOf(this.bS.getWorldLocation()));
        return worldPoint2;
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.ICE_DEMON));
    }
}

