/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Necromancy
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Summon Thrall", priority=150, register=true)
public class SummonThrallTask
extends NightmareManager {
    
     boolean dC;
     boolean dD;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    protected SummonThrallTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
        this.dC = var1[0];
        this.dD = var1[0];
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static void var6() {
        var1 = new int[9];
        aa.var1[0] = 1;
        aa.var1[1] = (0x66 ^ 0x5D) & ~(0x60 ^ 0x5B);
        aa.var1[2] = 36 + 30 - -11 + 81 ^ 124 + 0 - 55 + 98;
        aa.var1[3] = 2;
        aa.var1[4] = 0x7D ^ 0x19;
        aa.var1[5] = 0x9C ^ 0x9A;
        aa.var1[6] = -(0xFFFFADBF & 0x5743) & (0xFFFFBDFF & 0x777F);
        aa.var1[7] = -(45 + 73 - 88 + 100) & (0xFFFFBFEF & 0x6FFB);
        aa.var1[8] = 0x24 ^ 0x2C;
    }

    static {
        aa.var6();
        aa.var7();
    }

    private static boolean var8(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        void var10;
        if (aa.var3(varbitChanged.getVarbitId(), var1[6]) && aa.var4(varbitChanged.getValue(), var1[0])) {
            this.dC = var1[0];
        }
        if (aa.var3(var10.getVarbitId(), var1[7]) && aa.var4(var10.getValue(), var1[0])) {
            var11.dD = var1[0];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        aa var12;
        void var13;
        NPC nPC = SquireNightmarePlugin.d();
        if (aa.var9(nPC)) {
            return var1[1];
        }
        String[] stringArray = new String[var1[0]];
        stringArray[aa.var1[1]] = var2[var1[1]];
        if (aa.var5(var13.hasAction(stringArray) ? 1 : 0)) {
            var12.dC = var1[0];
            var12.dD = var1[0];
        }
        String[] stringArray2 = new String[var1[0]];
        stringArray2[aa.var1[1]] = var2[var1[0]];
        if (aa.var14(var13.hasAction(stringArray2) ? 1 : 0)) {
            return var1[1];
        }
        SpellBook.Necromancy var15 = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (aa.var5(var12.cp() ? 1 : 0) && aa.var5(var12.dC)) {
            Magic.cast((Spevar15, (int)var1[1], (int)var1[2]);
            var12.dC = var1[1];
            var12.sleep(var1[3]);
            return var1[0];
        }
        if (aa.var14(var12.cQ) && aa.var14(var12.cR)) {
            return var1[1];
        }
        if (aa.var3(Combat.getSpecEnergy(), var1[4])) {
            return var1[1];
        }
        SpellBook.Necromancy var16 = SpellBook.Necromancy.DEATH_CHARGE;
        if (aa.var5(var16.canCast() ? 1 : 0) && aa.var5(var12.dD)) {
            Magic.cast((Spevar16, (int)var1[1], (int)var1[2]);
            var12.dD = var1[1];
            return var1[0];
        }
        return var1[1];
    }

    private boolean cp() {
        int n2;
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (aa.var5(necromancy.canCast() ? 1 : 0) && aa.var8(Skills.getBoostedLevel((SkiSkill.PRAYER), var1[5])) {
            n2 = var1[0];
            0;
            if (1 >= (0x3B ^ 0x3F)) {
                return ((0x29 ^ 0x14) & ~(0x38 ^ 5)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        return n2 != 0;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    private static void var7() {
        var2 = new String[var1[3]];
        aa.var2[aa.var1[1]] = "Disturb";
        aa.var2[aa.var1[0]] = "Attack";
    }
}

