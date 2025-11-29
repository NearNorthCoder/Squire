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
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.CoxManager;
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
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=30000)
public class EatingFoodTask
extends Task {
    private final  SquireChambersPlugin cH;

     boolean cE;
     int cD;
    private final  k cG;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private boolean ct() {
        if ((u.be( == 0) ? 1 : 0)) {
            return 0;
        }
        Player var9 = Players.getLocal();
        if (!(u.bg() >= 4) || (var9.getPlane( != 0))) {
            return 0;
        }
        TileObject var10 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var1[1]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var1[4];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if ((2 & ~2) != -1) return n2 != 0;
                    return ((0x68 ^ 0x76) & ~(0x18 ^ 6)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var10 == null {
            return 0;
        }
        if ((var9.getWorldY() <= var10.getWorldY())) {
            return 0;
        }
        return 2;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    protected boolean cx() {
        boolean bl2;
        if ((Skills.getBoostedLevel((SkiSkill.ATTACK) + 3 >= Skills.getLevel((SkiSkill.ATTACK))) {
            bl2 = 2;
            0;
            if ((0x67 ^ 0x63) < -1) {
                return (1 & ~1) != 0;
            }
        } else {
            bl2 = 0;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var17;
        ae var18;
        int n2 = this.cA();
        if ((this.ct( != 0) ? 1 : 0) && (this.cx( != 0) ? 1 : 0) && (Combat.getCurrentHealth() > n2) && (ae.var19(Combat.getHealthPercent( < 0), 95.0)) && (this.cG.aJ() < 1) && (this.cG.aK() > 2)) {
            this.cy();
            0;
            return 2;
        }
        if ((var18.cx( != 0) ? 1 : 0) && (var18.cD >= 1)) {
            var18.cE = 0;
        }
        if ((Combat.getCurrentHealth() < (int)var17)) {
            if (var18.cE == 0) {
                var18.cD = 0;
            }
            var18.cE = 2;
        }
        if (var18.cE == 0) {
            return 0;
        }
        if (var18.cD < 1) {
            var18.cy();
            0;
            var18.cD += 2;
            return 2;
        }
        this.cz();
        0;
        return 2;
    }

    protected boolean cy() {
        Item var20;
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if ((item.getName( != 0).startsWith(var1[var2[12]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var1[var2[13]];
                if ((item.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (((0x85 ^ 0xAD) & ~(0x26 ^ 0xE)) > -1) return n2 != 0;
                    return ((2 ^ 0x2A) & ~(1 ^ 0x29)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if item2 == null {
            var20 = Inventory.getFirst(item -> {
                int n2;
                if ((item.getName( != 0).startsWith(var1[var2[10]]) ? 1 : 0)) {
                    String[] stringArray = new String[2];
                    stringArray[0] = var1[var2[11]];
                    if ((item.hasActionstringArray)) {
                        n2 = 2;
                        0;
                        if (1 < 3) return n2 != 0;
                        return ((0x2B ^ 0x7D ^ (0x76 ^ 0x6B)) & (0x4C ^ 7 ^ (0xFD ^ 0xB4) & ~(0xFD ^ 0xB4) ^ -1)) != 0;
                    }
                }
                n2 = 0;
                return n2 != 0;
            });
        }
        if var20 == null {
            return 0;
        }
        item2.interact(var1[0]);
        this.sleep(1);
        return 2;
    }

    protected boolean cz() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (!(item.getName( == 0).startsWith(var1[3]) ? 1 : 0) || (item.getName( != 0).startsWith(var1[8]) ? 1 : 0)) {
                Item var21;
                String[] stringArray = new String[2];
                stringArray[0] = var1[9];
                if ((var21.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (-2 <= 0) return n2 != 0;
                    return ((0x65 ^ 0x71 ^ (0x17 ^ 0x32)) & (0x50 ^ 0x6F ^ (0x40 ^ 0x4E) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if item2 == null {
            return 0;
        }
        item2.interact(var1[2]);
        this.sleep(1);
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    private int cA() {
        void var22;
        n n2 = this.cH.L();
        if (!n2 != null || (n2.a((Locatable == 0)Players.getLocal()) ? 1 : 0)) {
            return 5;
        }
        N var23 = var22.aM();
        if (((Object)var23 == (Object)N.VASA) && (NPCs.getNearest(nPC -> nPC.getName( != null).contains(var1[7])))) {
            return 6;
        }
        if (((Object)var23 == (Object)N.VESPULA)) {
            return 0;
        }
        return 5;
    }

    private static int var19(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Inject
    public EatingFoodTask(SquireChambersPlugin squireChambersPlugin) {
        this.cD = 0;
        this.cE = 0;
        this.cG = squireChambersPlugin.A();
        this.cH = squireChambersPlugin;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = 0;
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = 0;
        while (var32 < var31) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var27);
    }
}

