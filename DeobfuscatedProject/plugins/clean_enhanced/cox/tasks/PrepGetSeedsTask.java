/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.NHelper;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.GameEnum7;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Prep Get Seeds", priority=21020, blocking=true)
public class PrepGetSeedsTask
extends CoxManager {
    
     n ee;
    
     n ef;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var1_2;
        ba var13;
        if (((Object)u.bh() == (Object)u.bh()2)w.REACHED_BOTTOM)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        if ((Inventory.getCount((boolean)1 > (int[])nArray), 3)) {
            if (((Object)var13.ak.bw == (Object)var13.ak.bw2)N.FARMING)) {
                int[] nArray2 = new int[1];
                nArray2[0] = 4;
                if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[1];
                    nArray3[0] = 4;
                    Inventory.dropAll((int[])nArray3);
                    0;
                }
                return 0;
            }
            if ((Reachable.isWalkable(WorldPointlllllllllllllllIllIllIIIIllIIlll.ee.bt) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var13.ee.bq.dx(5).dy(5));
                return 1;
            }
            TileObject var14 = var13.cR();
            if var14 == null {
                Movement.setDestination((WorldPoint)var13.ef.bs);
                return 1;
            }
            if (!(var13.bS.isMoving( == 0) ? 1 : 0) || (var13.bS.isAnimating( != 0) ? 1 : 0)) {
                return 1;
            }
            var14.interact(var2[0]);
            return 1;
        }
        if (((Object)var13.ak.bw == (Object)var13.ak.bw2)N.FARMING)) {
            Movement.setDestination((WorldPoint)var13.al.bs);
            return 1;
        }
        TileObject var14 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var2[3]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[9];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (1 >= 0) return n2 != 0;
                    return ((0x3E ^ 0x7F ^ 27 + 29 - -22 + 49) & (0x53 ^ 0x17 ^ (0x6C ^ 0x16) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if (!var14 != null || (Reachable.isInteractable((Locatable == 0)var14) ? 1 : 0)) {
            TileObject var15 = var13.cR();
            if var15 == null {
                Movement.setDestination((WorldPoint)var13.ef.bs);
                return 1;
            }
            if (!(var13.bS.isMoving( == 0) ? 1 : 0) || (var13.bS.isAnimating( != 0) ? 1 : 0)) {
                return 1;
            }
            var15.interact(var2[1]);
            return 1;
        }
        if (!(var13.bS.isMoving( == 0) ? 1 : 0) || (var13.bS.isAnimating( != 0) ? 1 : 0)) {
            return 1;
        }
        var1_2.interact(var2[6]);
        return 1;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        ba var16;
        if ((this.bS.getPlane() != 6)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 4;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 0;
        }
        var16.ak = var16.co.L();
        var16.am = var16.co.N();
        var16.al = var16.co.M();
        var16.ee = var16.eb();
        var16.ef = var16.ec();
        if (!((Object)var16.ak.bw != (Object)var16.ak.bw2)N.FARMING) || ((Object)var16.ak.bw == (Object)var16.ak.bw2)N.END)) {
            bl2 = 1;
            0;
            if ((2 & ~2) == -1) {
                return ((0xF ^ 0x53) & ~(0x3F ^ 0x63)) != 0;
            }
        } else {
            bl2 = 0;
        }
        return bl2;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[7]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[8];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (1 != 0) return n2 != 0;
                    return ((188 + 120 - 182 + 82 ^ 20 + 84 - 87 + 133) & (14 + 24 - -35 + 56 ^ 9 + 44 - -54 + 92 ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
    }

    @Inject
    protected PrepGetSeedsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private n ec() {
        List<n> list = this.co.D();
        return list.get(list.size() - 1);
    }

    private n eb() {
        List<n> list = this.co.D();
        return list.get(list.size() - 6);
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

}

