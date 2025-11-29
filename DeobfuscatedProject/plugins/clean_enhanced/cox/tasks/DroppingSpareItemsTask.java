/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.NHelper;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping spare items", priority=30000)
public class DroppingSpareItemsTask
extends Task {
    
    private final  SquireChambersPlugin cF;
     boolean cE;
     int cD;

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
            if ((0x72 ^ 0x76) >= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    protected boolean cv() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if ((item.getName( != 0).startsWith(var1[1]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[var2[13]];
                if ((item.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (1 >= 1) return n2 != 0;
                    return ((15 + 18 - -53 + 50 ^ 29 + 122 - 3 + 29) & (84 + 9 - 80 + 175 ^ 108 + 1 - 95 + 119 ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if item2 == null {
            return 0;
        }
        item2.interact(var1[0]);
        this.sleep(var2[13]);
        return 1;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Inject
    public DroppingSpareItemsTask(SquireChambersPlugin squireChambersPlugin) {
        this.cD = 0;
        this.cE = 0;
        this.cF = squireChambersPlugin;
    }

    public boolean run() {
        int var19;
        ad var20;
        if (!(u.be( != 0) ? 1 : 0) || (u.bf( == 0) ? 1 : 0)) {
            return 0;
        }
        Player var21 = Players.getLocal();
        if var21 == null {
            return 0;
        }
        n var22 = var20.cF.L();
        if (!(var20.cF.L( != null)) || (var20.cF.L( == 0).a((Locatable)var21) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            int[] nArray2 = new int[1];
            nArray2[0] = 2;
            Inventory.dropAll((int[])nArray2);
            0;
            return 1;
        }
        int[] nArray3 = new int[1];
        nArray3[0] = 3;
        if ((Inventory.contains((int[] != 0)nArray3) ? 1 : 0)) {
            if (((Object)var22.aM() != (Object)var22.aM()2)N.ICE_DEMON)) {
                int[] nArray4 = new int[1];
                nArray4[0] = 3;
                Inventory.dropAll((int[])nArray4);
                0;
                return 1;
            }
            var19 = 4 - var20.cF.K() + (5 - Skills.getLevel((SkiSkill.WOODCUTTING)) / 6;
            if (var19 <= 0) {
                int[] nArray5 = new int[1];
                nArray5[0] = 3;
                Inventory.dropAll((int[])nArray5);
                0;
                return 1;
            }
        }
        int[] nArray6 = new int[1];
        nArray6[0] = 7;
        if ((Inventory.contains((int[] != 0)nArray6) ? 1 : 0) && ((Object)var22.aM() != (Object)var22.aM()2)N.ICE_DEMON)) {
            int[] nArray7 = new int[1];
            nArray7[0] = 7;
            Inventory.dropAll((int[])nArray7);
            0;
            return 1;
        }
        int[] nArray8 = new int[1];
        nArray8[0] = 8;
        if ((Inventory.contains((int[] != 0)nArray8) ? 1 : 0)) {
            if (((Object)var22.aM() != (Object)var22.aM()2)N.ICE_DEMON) && ((Object)var22.aM() != (Object)var22.aM()2)N.MUTTADILES)) {
                int[] nArray9 = new int[1];
                nArray9[0] = 8;
                Inventory.dropAll((int[])nArray9);
                0;
                return 1;
            }
            if (((Object)var22.aM() == (Object)var22.aM()2)N.ICE_DEMON) && (var19 = 4 - var20.cF.K( <= 0) + (5 - Skills.getLevel((SkiSkill.WOODCUTTING)) / 6)) {
                int[] nArray10 = new int[1];
                nArray10[0] = 8;
                Inventory.dropAll((int[])nArray10);
                0;
                return 1;
            }
        }
        int[] nArray11 = new int[1];
        nArray11[0] = 9;
        if ((Inventory.contains((int[] != 0)nArray11) ? 1 : 0) && ((Object)var22.aM() != (Object)var22.aM()2)N.THIEVING)) {
            int[] nArray12 = new int[1];
            nArray12[0] = 9;
            Inventory.dropAll((int[])nArray12);
            0;
            return 1;
        }
        int[] nArray13 = new int[var2[10]];
        nArray13[0] = var2[11];
        nArray13[1] = var2[12];
        nArray13[ad.var2[13]] = var2[14];
        if ((Inventory.contains((int[] != 0)nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[var2[10]];
            nArray14[0] = var2[11];
            nArray14[1] = var2[12];
            nArray14[ad.var2[13]] = var2[14];
            Inventory.dropAll((int[])nArray14);
            0;
            return 1;
        }
        int[] nArray15 = new int[var2[13]];
        nArray15[0] = var2[15];
        nArray15[1] = var2[16];
        if ((Inventory.contains((int[] != 0)nArray15) ? 1 : 0) && ((Object)var22.aM() != (Object)var22.aM()2)N.END)) {
            int[] nArray16 = new int[var2[13]];
            nArray16[0] = var2[15];
            nArray16[1] = var2[16];
            Inventory.dropAll((int[])nArray16);
            0;
            return 1;
        }
        int[] nArray17 = new int[1];
        nArray17[0] = var2[17];
        if ((Inventory.contains((int[] != 0)nArray17) ? 1 : 0) && ((Object)var22.aM() != (Object)var22.aM()2)N.CRABS)) {
            int[] nArray18 = new int[1];
            nArray18[0] = var2[17];
            Inventory.dropAll((int[])nArray18);
            0;
            return 1;
        }
        return 0;
    }

}

