/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
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
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Tightrope", priority=10000, blocking=true)
public class TightropeTask
extends CoxManager {
    
    private  n ak;
    private final  int eu = 7603;
    
    private  n al;
    private final  int et = 29742;
    private  int am;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    protected TightropeTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
        this.et = 1;
        this.eu = 2;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[var1[25]]) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[4] = var2[var1[26]];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 3;
                    0;
                    if (((0x64 ^ 0x60) & ~(0xF ^ 0xB)) <= 1) return n2 != 0;
                    return ((0 ^ 8) & ~(0x70 ^ 0x78)) != 0;
                }
            }
            n2 = 4;
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bl var9;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)this.al.bt) ? 1 : 0)) {
                return 4;
            }
            Movement.setDestination((WorldPoint)var9.al.bs);
            return 3;
        }
        TileObject var10 = var9.cR();
        if var10 == null {
            return 4;
        }
        if (!(var9.bS.isMoving( == 0) ? 1 : 0) || (var9.bS.isAnimating( != 0) ? 1 : 0)) {
            return 4;
        }
        var1_1.interact(var2[var1[24]]);
        return 3;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = 4;
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = 4;
        while (var25 < var24) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (1 >= ((0x4B ^ 0x6E) & ~(0xA6 ^ 0x83))) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var5_5;
        void var27;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        String[] stringArray = new String[3];
        stringArray[4] = var2[var1[19]];
        NPC nPC2 = NPCs.getNearest((String[])stringArray);
        String[] stringArray2 = new String[3];
        stringArray2[4] = var2[var1[20]];
        NPC nPC3 = NPCs.getNearest((String[])stringArray2);
        if (nPC2 == null && nPC3 == null) {
            return null;
        }
        NPC var28 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[var1[27]]) ? 1 : 0) && (nPC.getInteracting( != null)) && (nPC.getInteracting( != 0).equals(Players.getLocal()) ? 1 : 0)) {
                n2 = 3;
                0;
                if ((0x74 ^ 0x79 ^ (0x49 ^ 0x40)) < -1) {
                    return ((0x89 ^ 0xA2 ^ (0xFA ^ 0x9D)) & (0xFE ^ 0xBE ^ (0x57 ^ 0x5B) ^ -1)) != 0;
                }
            } else {
                n2 = 4;
            }
            return n2 != 0;
        });
        Prayer var29 = Prayer.PROTECT_FROM_MISSILES;
        if (!var27 == null || var28 != null && (var28.getName( == 0).contains(var2[var1[21]]) ? 1 : 0)) {
            var29 = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add((Prayer)var5_5);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var6_6;
        bl var30;
        TileObject var31;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var2[var1[33]]) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[4] = var2[var1[34]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 3;
                    0;
                    if (-(0x29 ^ 0x2D) < 0) return n2 != 0;
                    return ((0x15 ^ 0x43) & ~(0xA ^ 0x5C)) != 0;
                }
            }
            n2 = 4;
            return n2 != 0;
        });
        if tileObject2 == null {
            return this.cS();
        }
        String[] stringArray = new String[3];
        stringArray[4] = var2[4];
        if ((Inventory.contains((String[] != 0)stringArray) ? 1 : 0)) {
            void var32;
            if ((Reachable.isInteractable(LocatablelllllllllllllllIllIlIIlllllIlIII) ? 1 : 0)) {
                var32.interact(var2[3]);
                return 3;
            }
            var31 = TileObjects.getNearest(tileObject -> {
                int n2;
                if ((tileObject.getName( != 0).contains(var2[var1[31]]) ? 1 : 0)) {
                    String[] stringArray = new String[3];
                    stringArray[4] = var2[var1[32]];
                    if ((tileObject.hasActionstringArray)) {
                        n2 = 3;
                        0;
                        if null == null return n2 != 0;
                        return ((0x9D ^ 0xA0 ^ (0x81 ^ 0x86)) & (11 + 100 - 43 + 81 ^ 2 + 164 - 45 + 54 ^ -1)) != 0;
                    }
                }
                n2 = 4;
                return n2 != 0;
            });
            if var31 != null {
                var31.interact(var2[5]);
                return 4;
            }
        }
        if ((var30.bS.getInteracting( != null)) && (var30.bS.getInteracting( != 0).getName().contains(var2[6]) ? 1 : 0) && (var30.bS.getInteracting( == 0).isDead() ? 1 : 0)) {
            return 4;
        }
        var31 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[var1[30]]) ? 1 : 0) && (this.ak.a(LocatablenPC) ? 1 : 0) && (nPC.getInteracting( != null))) {
                n2 = 3;
                0;
                if null != null {
                    return ((0x87 ^ 0x8D) & ~(0x40 ^ 0x4A)) != 0;
                }
            } else {
                n2 = 4;
            }
            return n2 != 0;
        });
        if var31 != null {
            var31.interact(var2[7]);
            return 3;
        }
        String[] stringArray2 = new String[3];
        stringArray2[4] = var2[8];
        NPC var33 = NPCs.getNearest((String[])stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[4] = var2[9];
        NPC var34 = NPCs.getNearest((String[])stringArray3);
        if var34 != null {
            System.out.println(var2[var1[10]]);
            var34.interact(var2[var1[11]]);
            return 3;
        }
        if var33 != null {
            System.out.println(var2[var1[12]]);
            var33.interact(var2[var1[13]]);
            return 3;
        }
        String[] stringArray4 = new String[3];
        stringArray4[4] = var2[var1[14]];
        TileObject var35 = TileObjects.getNearest((String[])stringArray4);
        if (var35 != null && (Reachable.isWalkable(WorldPointlllllllllllllllIllIlIIlllllIIlII.getWorldLocation()) ? 1 : 0)) {
            if ((Inventory.isFull( != 0) ? 1 : 0)) {
                var30.co.x();
                0;
                return 3;
            }
            var35.interact(var2[var1[15]]);
            System.out.println(var2[var1[16]]);
            return 3;
        }
        TileObject var36 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var2[var1[28]]) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[4] = var2[var1[29]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 3;
                    0;
                    if (1 < 2) return n2 != 0;
                    return ((0xD7 ^ 0x9D) & ~(6 ^ 0x4C)) != 0;
                }
            }
            n2 = 4;
            return n2 != 0;
        });
        if var36 == null {
            System.out.println(var2[var1[17]]);
            return 4;
        }
        var6_6.interact(var2[var1[18]]);
        return 3;
    }

    @Override
    public EquipmentSetup cj() {
        if ((this.cp.tightropeBody( != 0) ? 1 : 0)) {
            String[] stringArray = new String[3];
            stringArray[4] = var2[var1[22]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            String[] stringArray2 = new String[3];
            stringArray2[4] = var2[var1[23]];
            NPC nPC2 = NPCs.getNearest((String[])stringArray2);
            if (nPC != null && nPC2 == null) {
                int n2 = s.bb().get(EquipmentInventorySlot.BODY);
                return s.b(s.e(N.TIGHTROPE)).derive(EquipmentInventorySlot.BODY, n2);
            }
        }
        return s.b(s.e(N.TIGHTROPE));
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (((Object)this.ak.bw == (Object)this.ak.bw2)N.TIGHTROPE)) {
            bl2 = 3;
            0;
            if null != null {
                return ((74 + 17 - 82 + 171 ^ 18 + 129 - 29 + 15) & (30 + 99 - -13 + 24 ^ 31 + 9 - -22 + 89 ^ -1)) != 0;
            }
        } else {
            bl2 = 4;
        }
        return bl2;
    }
}

