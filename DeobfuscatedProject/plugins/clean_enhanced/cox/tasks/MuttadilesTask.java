/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
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
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Muttadiles", priority=10000, blocking=true)
public class MuttadilesTask
extends CoxManager {
    
    private final  int dE = 7563;
    private final  int dD = 7562;
    private  n ak;
    private  n al;
    
    private final  int dC = 7561;
    private  int am;
     int dB;

    /*
     * WARNING - void declaration
     */
    private boolean cU() {
        void var1_1;
        aB var3;
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        TileItem var4 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.getName( != 0).startsWith(var1[var2[20]]) ? 1 : 0) && (this.ak.a(LocatabletileItem) ? 1 : 0) && (Reachable.isInteractable(LocatabletileItem) ? 1 : 0)) {
                n2 = 5;
                0;
                if null != null {
                    return ((0x93 ^ 0x8C ^ (0xB ^ 0x5F)) & (132 + 110 - 110 + 83 ^ 38 + 121 - 21 + 18 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if ((Inventory.contains(item -> item.getName( == 0).startsWith(var1[var2[19]])) ? 1 : 0)) {
            var4 = TileItems.getNearest(tileItem -> {
                int n2;
                if ((tileItem.getName( != 0).startsWith(var1[var2[18]]) ? 1 : 0) && (this.ak.a(LocatabletileItem) ? 1 : 0) && (Reachable.isInteractable(LocatabletileItem) ? 1 : 0)) {
                    n2 = 5;
                    0;
                    if ((0x17 ^ 0x12) <= 0) {
                        return ((0x1F ^ 0x38) & ~(0x45 ^ 0x62)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            });
        }
        if var4 == null {
            return 0;
        }
        var1_1.interact(var1[var2[17]]);
        return 5;
    }

    @Inject
    protected MuttadilesTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dB = 0;
        this.dC = 1;
        this.dD = 2;
        this.dE = 3;
        this.am = 4;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((0xA6 ^ 0x80 ^ (0x42 ^ 0x61)) != 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private boolean cT() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var1[var2[23]]) ? 1 : 0)) {
                String[] stringArray = new String[5];
                stringArray[0] = var1[var2[24]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 5;
                    0;
                    if (((0x6E ^ 0x64) & ~(0x9F ^ 0x95)) == 0) return n2 != 0;
                    return ((0x67 ^ 0x36) & ~(0x6F ^ 0x3E)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if tileObject2 == null {
            System.out.println(var1[var2[14]]);
            return 0;
        }
        tileObject2.interact(var1[var2[15]]);
        return 5;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[var2[25]]) ? 1 : 0)) {
                String[] stringArray = new String[5];
                stringArray[0] = var1[var2[26]];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 5;
                    0;
                    if (3 > 1) return n2 != 0;
                    return ((0xD9 ^ 0x98 ^ (0x3F ^ 0x50)) & (0x57 ^ 0x7A ^ 3 ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aB var15;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)this.al.bt) ? 1 : 0)) {
                return 0;
            }
            Movement.setDestination((WorldPoint)var15.al.bs);
            return 5;
        }
        TileObject var16 = var15.cR();
        if var16 == null {
            return 0;
        }
        if (!(var15.bS.isMoving( == 0) ? 1 : 0) || (var15.bS.isAnimating( != 0) ? 1 : 0)) {
            return 0;
        }
        var1_1.interact(var1[var2[16]]);
        return 5;
    }

    private WorldArea i(NPC nPC) {
        if nPC == null {
            return null;
        }
        int n2 = var2[10];
        return new WorldArea(nPC.getWorldLocation().dx(-n2).dy(-n2), 6 * n2 + nPC.getWorldArea().getWidth(), 6 * n2 + nPC.getWorldArea().getWidth());
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var5_5;
        List var29;
        WorldPoint var30;
        aB var31;
        if ((this.cU( != 0) ? 1 : 0)) {
            return 5;
        }
        Player var32 = Players.getLocal();
        int var33 = Static.getClient().getTickCount();
        if ((var32.distanceTo(var31.ak.bs) <= 5) && (var31.cT( != 0) ? 1 : 0)) {
            return 5;
        }
        NPC var34 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[5];
            stringArray[0] = var1[var2[32]];
            if ((nPC.hasActionstringArray) && (nPC.getName( != 0).contains(var1[var2[33]]) ? 1 : 0)) {
                n2 = 5;
                0;
                if (2 == 3) {
                    return ((0xF4 ^ 0x90 ^ (0xFA ^ 0xB9)) & (0x27 ^ 1 ^ 1 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        int[] nArray = new int[5];
        nArray[0] = 2;
        NPC var35 = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[5];
        nArray2[0] = 3;
        NPC var36 = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[5];
        nArray3[0] = 1;
        NPC var37 = NPCs.getNearest((int[])nArray3);
        if (var35 == null && var36 == null && var37 == null) {
            return var31.cS();
        }
        if ((Inventory.contains(item -> {
            int n2;
            if ((item.getName( == 0 != 0).contains(var1[var2[29]]) ? 1 : 0) && (item.getName( == 0).contains(var1[var2[30]]) ? 1 : 0) && (item.getId() != var2[31])) {
                n2 = 5;
                0;
                if (3 == ((104 + 140 - 197 + 103 ^ 132 + 162 - 206 + 103) & (0xF6 ^ 0xC5 ^ (0x38 ^ 0x22) ^ -1))) {
                    return ((0x61 ^ 0x65 ^ (0x63 ^ 0x35)) & (38 + 14 - -66 + 112 ^ 54 + 167 - 107 + 66 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if ((Inventory.isFull( != 0) ? 1 : 0)) {
                var31.co.x();
                0;
                return 5;
            }
            TileObject var38 = TileObjects.getNearest(tileObject -> {
                int n2;
                if ((tileObject.getName( != 0).contains(var1[var2[27]]) ? 1 : 0)) {
                    String[] stringArray = new String[5];
                    stringArray[0] = var1[var2[28]];
                    if ((tileObject.hasActionstringArray)) {
                        n2 = 5;
                        0;
                        if (((0xCE ^ 0x8D) & ~(0x16 ^ 0x55)) <= 1) return n2 != 0;
                        return ((0xAD ^ 0x8B) & ~(0xC ^ 0x2A)) != 0;
                    }
                }
                n2 = 0;
                return n2 != 0;
            });
            if var38 == null {
                return 0;
            }
            var38.interact(var1[0]);
            return 5;
        }
        if var34 != null {
            if ((!(var32.getInteracting( != null)) || (var32.getInteracting( == 0).getName().equals(var1[5]) ? 1 : 0)) && (var33 - var31.co.H() > 6)) {
                var34.interact(var1[6]);
                return 5;
            }
            if ((var33 - var31.co.H() > 6)) {
                return 0;
            }
            if var35 == null {
                return 0;
            }
            if ((var32.getInteracting( != null)) && (var32.getInteracting( != 0).getName().equals(var1[7]) ? 1 : 0)) {
                return 0;
            }
            if ((var35.getHealthRatio() != 4) && (var35.getHealthRatio() < 8)) {
                return 0;
            }
            if ((var35.getWorldArea( != 0).isInMeleeDistance(var32.getWorldLocation()) ? 1 : 0)) {
                var35.interact(var1[9]);
                return 5;
            }
            return 0;
        }
        if var35 != null {
            if ((var32.getInteracting( != null)) && (var32.getInteracting( != 0).getName().equals(var1[var2[10]]) ? 1 : 0)) {
                return 0;
            }
            var35.interact(var1[var2[11]]);
            return 5;
        }
        if var36 == null {
            return 0;
        }
        int var38 = var36.getWorldArea().distanceTo(var32.getWorldLocation());
        if ((var38 <= 7) && (var30 = WorldPoint != null(var29 = var31.i(var36).toWorldPointList()).stream().filter(worldPoint -> {
            int n2;
            if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (var36.getWorldArea().distanceTo(worldPoint) < var2[11])) {
                n2 = 5;
                0;
                if (-1 >= 0) {
                    return ((0x85 ^ 0xC3) & ~(0x79 ^ 0x3F)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> var36.getWorldArea().distanceTo((WorldPoint)object)).thenComparingDouble(object -> -1.0f * ((WorldPoint)object).distanceToHypotenuse(var32.getWorldLocation()))).orElse(null))) {
            System.out.println("Player: " + String.valueOf(var32.getWorldLocation()) + String.valueOf(var36.getWorldLocation()));
            Movement.setDestination((WorldPoint)var30);
            return 5;
        }
        if ((var32.getInteracting( != null)) && (var32.getInteracting( != 0).getName().equals(var1[var2[12]]) ? 1 : 0)) {
            return 0;
        }
        var5_5.interact(var1[var2[13]]);
        return 5;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (((Object)this.ak.bw == (Object)this.ak.bw2)N.MUTTADILES)) {
            bl2 = 5;
            0;
            if (-3 > 0) {
                return ((96 + 159 - 125 + 57 ^ 69 + 90 - 21 + 9) & (0x21 ^ 0x27 ^ (0x77 ^ 0x59) ^ -1)) != 0;
            }
        } else {
            bl2 = 0;
        }
        return bl2;
    }

    @Override
    public EquipmentSetup cj() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[5];
            stringArray[0] = var1[var2[21]];
            if ((nPC.hasActionstringArray) && (nPC.getName( != 0).contains(var1[var2[22]]) ? 1 : 0)) {
                n2 = 5;
                0;
                if ((30 + 112 - 61 + 48 ^ 30 + 27 - 11 + 86) <= 0) {
                    return ((0x96 ^ 0xAC ^ 3) & (30 + 9 - -14 + 82 ^ 93 + 129 - 121 + 89 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        return s.b(s.e(N.MUTTADILES));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var6_6;
        void var39;
        void var40;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Player player = Players.getLocal();
        int[] nArray = new int[5];
        nArray[0] = 2;
        NPC nPC = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[5];
        nArray2[0] = 3;
        NPC nPC2 = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[5];
        nArray3[0] = 1;
        NPC nPC3 = NPCs.getNearest((int[])nArray3);
        if (nPC2 == null && nPC3 == null && nPC == null) {
            return null;
        }
        Prayer var41 = Prayer.PROTECT_FROM_MISSILES;
        if (var40 != null && (var40.getWorldArea( != 0).isInMeleeDistance(var39.getWorldLocation()) ? 1 : 0)) {
            var41 = Prayer.PROTECT_FROM_MELEE;
        }
        arrayList.add((Prayer)var6_6);
        0;
        arrayList.addAll(Prayers.getOffensive());
        0;
        return arrayList;
    }
}

