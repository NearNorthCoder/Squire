/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
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
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Vespula", priority=10000, blocking=true)
public class VespulaTask
extends CoxManager {
    private  n al;
    private  n ak;
    private  int am;
    
    private  int dX;
    private final  int dY = 5417;

    private boolean dm() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).toLowerCase().contains(var2[var1[11]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[4] = var2[var1[12]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (-(0x67 ^ 0x57 ^ (0x47 ^ 0x73)) <= 0) return n2 != 0;
                    return ((0x17 ^ 0xA ^ (0x76 ^ 0x2D)) & (7 ^ 0x1A ^ (0x79 ^ 0x22) ^ -1)) != 0;
                }
            }
            n2 = 4;
            return n2 != 0;
        });
        if tileObject2 == null {
            System.out.println(var2[8]);
            return 4;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0) && (Dialog.getName( != 0).contains(var2[9]) ? 1 : 0)) {
            String[] stringArray = new String[2];
            stringArray[4] = var2[var1[10]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return 2;
        }
        Game.logout();
        return 2;
    }

    @Inject
    protected VespulaTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
        this.dX = 0;
        this.dY = 1;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (((Object)this.ak.bw == (Object)this.ak.bw2)N.VESPULA)) {
            bl2 = 2;
            0;
            if ((0x4D ^ 0x49) == ((0xBF ^ 0x98) & ~(0x1A ^ 0x3D))) {
                return (3 & ~3) != 0;
            }
        } else {
            bl2 = 4;
        }
        return bl2;
    }

    public void db() {
        if ((this.cj( != 0).isFullyEquipped() ? 1 : 0) && (Combat.getAttackStyle() != Combat.getAttackStyle()2) && (Equipment.contains(item -> {
            int n2;
            if (!(item.getName( == 0 != 0).toLowerCase().contains(var2[var1[17]]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var2[var1[18]]) ? 1 : 0)) {
                n2 = 2;
                0;
                if (2 < 1) {
                    return ((0x57 ^ 0x4F) & ~(0xAC ^ 0xB4)) != 0;
                }
            } else {
                n2 = 4;
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var3_3;
        aH var3;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[var1[22]]) ? 1 : 0) && (this.ak.a(LocatablenPC) ? 1 : 0)) {
                n2 = 2;
                0;
                if (1 == ((0xF ^ 0x53) & ~(0x1A ^ 0x46))) {
                    return ((0xB9 ^ 0x8F) & ~(0xF6 ^ 0xC0)) != 0;
                }
            } else {
                n2 = 4;
            }
            return n2 != 0;
        });
        NPC nPC3 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[var1[21]]) ? 1 : 0) && (this.ak.a(LocatablenPC) ? 1 : 0)) {
                n2 = 2;
                0;
                if null != null {
                    return ((0x3E ^ 0x15) & ~(0xBB ^ 0x90)) != 0;
                }
            } else {
                n2 = 4;
            }
            return n2 != 0;
        });
        if (nPC3 == null && nPC2 == null) {
            if ((this.cU( != 0) ? 1 : 0)) {
                return 2;
            }
            return var3.cS();
        }
        if ((var3.bS.distanceTo(var3.ak.bs) <= 2) && (var3.dm( != 0) ? 1 : 0)) {
            return 2;
        }
        var3.dl();
        0;
        var3.db();
        if ((var3.cq.getTickCount() - var3.dX <= 3) && (Prayers.getPoints( > 0))) {
            void var4;
            if var4 == null {
                return 4;
            }
            var4.interact(var2[4]);
            return 2;
        }
        WorldPoint var5 = H.VESPULA_ATTACK_POINT.c(var3.ak);
        if ((var3.bS.getWorldLocation( != 0).equals((Object)var5) ? 1 : 0)) {
            System.out.println(var2[2]);
            var3.dX = var3.cq.getTickCount();
            return 2;
        }
        Movement.setDestination((WorldPoint)var3_3);
        return 2;
    }

    @Override
    public List<Prayer> ci() {
        aH var6;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var2[var1[20]]));
        if nPC2 == null {
            return null;
        }
        if ((var6.bS.distanceTo(var6.ak.bs) <= 2)) {
            return null;
        }
        List list = Prayers.getOffensive();
        Prayer prayer = Prayer.REDEMPTION;
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 4;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 4;
        while (var15 < var14) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (3 > ((0xE4 ^ 0xBF) & ~(0xEE ^ 0xB5))) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aH var17;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)this.al.bt) ? 1 : 0)) {
                return 4;
            }
            Movement.setDestination((WorldPoint)var17.al.bs);
            return 2;
        }
        TileObject var18 = var17.cR();
        if var18 == null {
            Movement.setDestination((WorldPoint)var17.ak.bq.dx(5).dy(5));
            return 2;
        }
        if (!(var17.bS.isMoving( == 0) ? 1 : 0) || (var17.bS.isAnimating( != 0) ? 1 : 0)) {
            return 4;
        }
        var1_1.interact(var2[3]);
        return 2;
    }

    private boolean dl() {
        Item item2 = Inventory.getFirst(item -> item.getName().startsWith(var2[var1[16]]));
        if item2 == null {
            return 4;
        }
        int var19 = Static.getClient().getVarbitValue(1);
        if (var19 > 0) {
            return 4;
        }
        item2.interact(var2[6]);
        return 2;
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.VESPULA));
    }

    /*
     * WARNING - void declaration
     */
    private boolean cU() {
        void var1_1;
        aH var20;
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 4;
        }
        TileItem var21 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.getName( != 0).startsWith(var2[var1[15]]) ? 1 : 0) && (this.ak.a(LocatabletileItem) ? 1 : 0) && (Reachable.isInteractable(LocatabletileItem) ? 1 : 0)) {
                n2 = 2;
                0;
                if (3 <= 0) {
                    return ((0x6B ^ 0x4B ^ 3) & (0x77 ^ 0x68 ^ (0x88 ^ 0xB4) ^ -1)) != 0;
                }
            } else {
                n2 = 4;
            }
            return n2 != 0;
        });
        if ((Inventory.contains(item -> item.getName( == 0).startsWith(var2[var1[14]])) ? 1 : 0)) {
            var21 = TileItems.getNearest(tileItem -> {
                int n2;
                if ((tileItem.getName( != 0).startsWith(var2[var1[13]]) ? 1 : 0) && (this.ak.a(LocatabletileItem) ? 1 : 0) && (Reachable.isInteractable(LocatabletileItem) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if (((0x49 ^ 0x1D) & ~(0x3F ^ 0x6B)) <= -1) {
                        return ((0x5B ^ 0x55) & ~(0xCB ^ 0xC5)) != 0;
                    }
                } else {
                    n2 = 4;
                }
                return n2 != 0;
            });
        }
        if var21 == null {
            return 4;
        }
        var1_1.interact(var2[7]);
        return 2;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[5]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[4] = var2[var1[19]];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if (((0x16 ^ 0x26) & ~(0x5A ^ 0x6A)) >= 0) return n2 != 0;
                    return ((0x79 ^ 0x51) & ~(0x34 ^ 0x1C)) != 0;
                }
            }
            n2 = 4;
            return n2 != 0;
        });
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }
}

