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
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
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
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Guardians", priority=10000, blocking=true)
public class GuardiansTask
extends CoxManager {
    private  n al;
     int dA;
    private  int am;
     int dB;

    private  n ak;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var3_3;
        void var9;
        aA var10;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[var1[14]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[var1[15]];
                if ((nPC.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (((0xC3 ^ 0x81) & ~(0x83 ^ 0xC1)) == 0) return n2 != 0;
                    return ((0xDF ^ 0x94) & ~(0x2D ^ 0x66)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if nPC2 == null {
            return this.cS();
        }
        if ((Combat.getAttackStyle() != Combat.getAttackStyle()2) && (var10.cj( != 0).isFullyEquipped() ? 1 : 0)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.THIRD);
            return 2;
        }
        int var11 = var10.cq.getTickCount();
        WorldPoint var12 = var10.cQ();
        if ((var10.bS.distanceTo(var12) <= 2)) {
            var10.dA += 2;
            if (var10.dA == 3) {
                List var13 = var10.bS.getWorldLocation().createWorldArea(2).toWorldPointList();
                WorldPoint var14 = var13.stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).min(Comparator.comparingDouble(arg_0 -> aA.a((NPC)var9, arg_0)).thenComparingDouble(object -> ((WorldPoint)object).distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
                Movement.setDestination((WorldPoint)var14);
                return 2;
            }
            if ((var10.dA > 3) && (var11 - var10.dB > 4)) {
                var10.dB = var11;
                var9.interact(var2[1]);
                return 2;
            }
            return 2;
        }
        var10.dA = 1;
        if ((var9.getWorldArea( != 0).isInMeleeDistance(var10.bS.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var12);
            return 2;
        }
        if ((var10.bS.getWorldLocation( != 0).equals((Object)var12) ? 1 : 0)) {
            return 2;
        }
        Movement.setDestination((WorldPoint)var3_3);
        return 2;
    }

    private static  double a(NPC nPC, Object object) {
        return nPC.getWorldArea().distanceTo((WorldPoint)object);
    }

    @Inject
    protected GuardiansTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
        this.dA = 1;
        this.dB = 1;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (((Object)this.ak.bw == (Object)this.ak.bw2)N.GUARDIANS)) {
            bl2 = 2;
            0;
            if ((0xF4 ^ 0xBA ^ (0x39 ^ 0x73)) <= 0) {
                return ((0xFC ^ 0xC3 ^ (0x88 ^ 0xA3)) & (0x1C ^ 0x2C ^ (0xE5 ^ 0xC1) ^ -1)) != 0;
            }
        } else {
            bl2 = 1;
        }
        return bl2;
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.GUARDIANS));
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private WorldArea cP() {
        void var21;
        List list = NPCs.getAll(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[var1[12]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[var1[13]];
                if ((nPC.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (((0xC7 ^ 0xC1 ^ (0xBA ^ 0x9B)) & (0xDF ^ 0x86 ^ (0x5D ^ 0x23) ^ -1)) == 0) return n2 != 0;
                    return ((0xEA ^ 0x82 ^ (0xA1 ^ 0x83)) & (0xE1 ^ 0xB1 ^ (0x93 ^ 0x89) ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if ((list.size( == 0))) {
            return null;
        }
        if ((var21.size() == 3)) {
            WorldPoint var22 = ((NPC)var21.get(1)).getWorldLocation();
            WorldPoint var23 = ((NPC)var21.get(2)).getWorldLocation();
            System.out.println(var2[2]);
            if (!(var22.getWorldX() >= var23.getWorldX()) || (var22.getWorldY() < var23.getWorldY())) {
                return new WorldArea(var22.dx(5).dy(5), var23.dx(6).dy(6));
            }
            return new WorldArea(var23.dx(5).dy(5), var22.dx(6).dy(6));
        }
        return new WorldArea(((NPC)list.get(1)).getWorldLocation().dx(5).dy(5), 7, 7);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        aA var24;
        void var25;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[8]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[7];
                if ((nPC.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (-1 <= 2) return n2 != 0;
                    return ((37 + 82 - 67 + 104 ^ 160 + 75 - 194 + 140) & (109 + 89 - 63 + 0 ^ 165 + 128 - 164 + 45 ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if nPC2 == null {
            return null;
        }
        if ((var25.getWorldLocation().distanceTo((Locatable)var24.bS) > 8)) {
            return null;
        }
        return Prayers.getOffensive();
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aA var26;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)this.al.bt) ? 1 : 0)) {
                return 1;
            }
            Movement.setDestination((WorldPoint)var26.al.bs);
            return 2;
        }
        TileObject var27 = var26.cR();
        if var27 == null {
            Movement.setDestination((WorldPoint)var26.ak.bq.dx(9).dy(9));
            return 2;
        }
        if (!(var26.bS.isMoving( == 0) ? 1 : 0) || (var26.bS.isAnimating( != 0) ? 1 : 0)) {
            return 1;
        }
        var1_1.interact(var2[3]);
        return 2;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[6]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[4];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if null == null return n2 != 0;
                    return ((0x55 ^ 0x37) & ~(0xC1 ^ 0xA3)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
    }

    private WorldPoint cQ() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[var1[10]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[var1[11]];
                if ((nPC.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (-1 < 0) return n2 != 0;
                    return ((0x89 ^ 0xBD) & ~(0x34 ^ 0)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        WorldArea worldArea = this.cP();
        List list = worldArea.getMeleeTiles(this.cq);
        WorldPoint worldPoint2 = list.stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(nPC2.getWorldLocation()))).orElse(null);
        return worldPoint2;
    }

    private static String var28(String var29, String var30) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var32 = var30.toCharArray();
        int var33 = 1;
        char[] var34 = var29.toCharArray();
        int var35 = var34.length;
        int var36 = 1;
        while (var36 < var35) {
            char var37 = var34[var36];
            var31.append((char)(var37 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var36;
            0;
            if (((131 + 87 - 167 + 151 ^ 91 + 18 - 14 + 47) & (185 + 60 - 107 + 71 ^ 86 + 129 - 185 + 119 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var31);
    }

}

