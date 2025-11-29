/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Attacking Nightmare", priority=1)
public class AttackingNightmareTask
extends al {
    private static final  Logger dQ;
    
    protected final  e dR;

    protected boolean ct() {
        int n2;
        if (af.var2(this.cO) && af.var3(this.cx() ? 1 : 0) && af.var3(this.cw() ? 1 : 0) && af.var3(this.cP) && af.var3(this.cR) && af.var3(this.cQ) && af.var3(this.cM.T() ? 1 : 0) && af.var3(this.cM.at()) && af.var2(this.cu() ? 1 : 0) && af.var4(this.cS.getAnimation(), var1[3]) && af.var4(this.cS.getId(), var1[4])) {
            n2 = var1[2];
            0;
            if ((0xC ^ 8) < 3) {
                return ((0x6F ^ 0x4B) & ~(0x2C ^ 8)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean cr() {
        af var6;
        if (af.var2(this.cK.assistantMode() ? 1 : 0)) {
            return var1[0];
        }
        if (af.var3(var6.cs() ? 1 : 0)) {
            return var1[0];
        }
        if (af.var5(var6.cS.getId(), var1[1])) {
            if (af.var2(var6.cu() ? 1 : 0)) {
                return var6.x(var6.cS);
            }
            return var1[0];
        }
        if (af.var2(var6.ct() ? 1 : 0)) {
            return var6.x(var6.cS);
        }
        return var1[0];
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    protected boolean cs() {
        boolean bl;
        af var7;
        NPC nPC = SquireNightmarePlugin.d();
        if (af.var8(nPC)) {
            return var1[0];
        }
        if (af.var3(var7.cu() ? 1 : 0)) {
            return var1[0];
        }
        if (af.var2(var7.cw() ? 1 : 0)) {
            return var1[0];
        }
        if (af.var2(var7.cx() ? 1 : 0)) {
            return var1[0];
        }
        if (af.var9(var7.cM.at())) {
            return var1[0];
        }
        if (af.var3(var7.cM.aq() ? 1 : 0)) {
            bl = var1[2];
            0;
            if (1 == ((0x33 ^ 0x72) & ~(0x5D ^ 0x1C))) {
                return ((0x84 ^ 0x95) & ~(0xAF ^ 0xBE)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    @Override
    public EquipmentSetup cq() {
        return ((BankLoadout)this.cK.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
    }

    static {
        af.var10();
        dQ = LoggerFactory.getLogger(AttackingNightmareTask.class);
    }

    private static void var10() {
        var1 = new int[5];
        af.var1[0] = (0x81 ^ 0x8B) & ~(9 ^ 3);
        af.var1[1] = -(0xFFFFDFEF & 0x7435) & (0xFFFFFFF6 & 0x7FBF);
        af.var1[2] = 1;
        af.var1[3] = -(0xFFFFDFDF & 0x3A63) & (0xFFFFFFDF & 0x3BFE);
        af.var1[4] = 0xFFFFB5EF & 0x6EDE;
    }

    private static boolean var9(int n2) {
        return n2 > 0;
    }

    @Inject
    public AttackingNightmareTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
        this.dR = e2;
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var4(int n2, int n3) {
        return n2 != n3;
    }
}

