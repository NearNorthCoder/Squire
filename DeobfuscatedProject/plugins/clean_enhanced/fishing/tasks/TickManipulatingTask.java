/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import gg.squire.fishing.tasks.GameEnum;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Tick Manipulating", priority=50)
public class TickManipulatingTask
extends Task {
    private final  SquireFisherConfig V;
    
    private final  int[] Y;
    private final  SquireFisherPlugin U;
    private final  int[] X;
    
    private final  int[] W;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < lllllllllllllllIlIlllIlIllllIllI2) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    public TickManipulatingTask(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        int[] nArray = new int[0];
        nArray[1] = 2;
        nArray[3] = 4;
        nArray[5] = 6;
        nArray[7] = 8;
        this.W = nArray;
        int[] nArray2 = new int[0];
        nArray2[1] = 9;
        nArray2[3] = var2[10];
        nArray2[5] = var2[11];
        nArray2[7] = var2[12];
        this.X = nArray2;
        int[] nArray3 = new int[5];
        nArray3[1] = var2[13];
        nArray3[3] = var2[14];
        this.Y = nArray3;
        this.U = squireFisherPlugin;
        this.V = squireFisherConfig;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean r() {
        int n;
        if ((Inventory.contains((int[] != 0)this.Y) ? 1 : 0)) {
            int[] nArray = new int[3];
            nArray[1] = var2[17];
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                n = 3;
                0;
                if (3 <= 3) return n != 0;
                return ((0xEA ^ 0x89) & ~(0xF2 ^ 0x91)) != 0;
            }
        }
        n = 1;
        return n != 0;
    }

    public boolean run() {
        m var13;
        if (((Object)this.V.fish() != (Object)this.V.fish()2)f.FLY_FISHING) && ((Object)this.V.fish() != (Object)this.V.fish()2)f.BARBARIAN_FISHING)) {
            return 1;
        }
        if ((var13.V.tickFishing( == 0) ? 1 : 0)) {
            return 1;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((Inventory.contains((int[] == 0)var13.X) ? 1 : 0) && (Inventory.contains((int[] != 0)var13.W) ? 1 : 0)) {
            Inventory.getFirst((int[])var13.W).interact(var1[1]);
            return 3;
        }
        if ((var13.r( == 0) ? 1 : 0) && (var13.q( == 0) ? 1 : 0)) {
            if ((var13.r( == 0) ? 1 : 0)) {
                System.out.println(var1[3]);
            }
            if ((var13.q( == 0) ? 1 : 0)) {
                System.out.println(var1[5]);
            }
            return 1;
        }
        int var14 = Players.getLocal().getAnimation();
        NPC var15 = NPCs.getNearest(nPC -> nPC.hasAction(this.V.fish().n()));
        if var15 == null {
            return 1;
        }
        if ((var15.distanceTo((Locatable)Players.getLocal()) >= var15.distanceTo((Locatable)Players.getLocal())2)) {
            return 1;
        }
        if (!(var14 != lllllllllllllllIlIlllIllIIIlIllI2) || (var14 == lllllllllllllllIlIlllIllIIIlIllI2)) {
            if ((var13.V.cutEat( != 0) ? 1 : 0)) {
                Item var16 = Inventory.getFirst(item -> item.getName().contains(var1[var2[24]]));
                Item var17 = Inventory.getFirst(item -> {
                    int n;
                    if (!(item.getName( == 0).equals(var1[0]) ? 1 : 0) || (item.getName( != 0).equals(var1[var2[23]]) ? 1 : 0)) {
                        n = 3;
                        0;
                        if null != null {
                            return ((80 + 51 - -40 + 20 ^ 29 + 60 - 3 + 75) & (0x54 ^ 3 ^ (0xD4 ^ 0x9D) ^ -1)) != 0;
                        }
                    } else {
                        n = 1;
                    }
                    return n != 0;
                });
                if (var16 != null && var17 != null) {
                    int[] nArray = new int[3];
                    nArray[1] = var2[17];
                    Inventory.getFirst((int[])nArray).useOn(var16);
                    var17.interact(var1[7]);
                    return 3;
                }
                if var17 == null {
                    int[] nArray = new int[3];
                    nArray[1] = var2[17];
                    Inventory.getFirst((int[])nArray).useOn(var16);
                }
            }
            if ((var13.q( != 0) ? 1 : 0)) {
                int[] nArray = new int[3];
                nArray[1] = var2[18];
                Inventory.getFirst((int[])var13.X).useOn(Inventory.getFirst((int[])nArray));
                return 3;
            }
            if ((var13.r( != 0) ? 1 : 0)) {
                int[] nArray = new int[3];
                nArray[1] = var2[17];
                Inventory.getFirst((int[])var13.Y).useOn(Inventory.getFirst((int[])nArray));
                return 3;
            }
        }
        if (!(var14 != lllllllllllllllIlIlllIllIIIlIllI2) || (var14 == lllllllllllllllIlIlllIllIIIlIllI2)) {
            var15.interact(var13.V.fish().n());
            var13.sleep(5);
            return 3;
        }
        return 1;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean q() {
        int n;
        if ((Inventory.contains((int[] != 0)this.X) ? 1 : 0)) {
            int[] nArray = new int[3];
            nArray[1] = var2[18];
            if ((Inventory.getCount((boolean)3 >= Inventory.getCount((boolean)32)nArray), var2[21])) {
                int[] nArray2 = new int[3];
                nArray2[1] = var2[22];
                if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) {
                    n = 3;
                    0;
                    if ((0x6D ^ 0x44 ^ (0x13 ^ 0x3E)) != -1) return n != 0;
                    return ((0xA9 ^ 0xB9 ^ (0xD8 ^ 0x90)) & (57 + 162 - 129 + 140 ^ 74 + 122 - 118 + 112 ^ -1)) != 0;
                }
            }
        }
        n = 1;
        return n != 0;
    }

}

