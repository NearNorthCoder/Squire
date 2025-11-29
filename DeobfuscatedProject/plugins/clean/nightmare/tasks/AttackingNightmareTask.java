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
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Attacking Nightmare", priority=1)
public class AttackingNightmareTask
extends NightmareTaskBase {
    private static final  Logger dQ;
    
    protected final  e dR;

    protected boolean ct() {
        int n2;
        if (af.lIIIlllIIlIIIII(this.cO ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cx() ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cw() ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cP ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cR ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cQ ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cM.T() ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cM.at()) && af.lIIIlllIIlIIIII(this.cu() ? 1 : 0) && af.lIIIlllIIlIIlIl(this.cS.getAnimation(), lllIllllIllI[3]) && af.lIIIlllIIlIIlIl(this.cS.getId(), lllIllllIllI[4])) {
            n2 = lllIllllIllI[2];

            if ((0xC ^ 8) < 3) {
                return false;
            }
        } else {
            n2 = lllIllllIllI[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIlllIIlIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean cr() {
        af var1;
        if (af.lIIIlllIIlIIIII(this.cK.assistantMode() ? 1 : 0)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIIl(var1.cs() ? 1 : 0)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIlI(var1.cS.getId(), lllIllllIllI[1])) {
            if (af.lIIIlllIIlIIIII(var1.cu() ? 1 : 0)) {
                return var1.x(var1.cS);
            }
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIII(var1.ct() ? 1 : 0)) {
            return var1.x(var1.cS);
        }
        return lllIllllIllI[0];
    }

    private static boolean lIIIlllIIlIIIIl(int n2) {
        return n2 == 0;
    }

    protected boolean cs() {
        boolean bl;
        af var2;
        NPC nPC = SquireNightmarePlugin.d();
        if (af.lIIIlllIIlIIIll(nPC)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIIl(var2.cu() ? 1 : 0)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIII(var2.cw() ? 1 : 0)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIII(var2.cx() ? 1 : 0)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIlII(var2.cM.at())) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIIl(var2.cM.aq() ? 1 : 0)) {
            bl = lllIllllIllI[2];

            if (1 == ((0x33 ^ 0x72) & ~(0x5D ^ 0x1C))) {
                return false;
            }
        } else {
            bl = lllIllllIllI[0];
        }
        return bl;
    }

    @Override
    public EquipmentSetup cq() {
        return ((BankLoadout)this.cK.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
    }

    static {
        af.lIIIlllIIIlllll();
        dQ = LoggerFactory.getLogger(AttackingNightmareTask.class);
    }

    private static boolean lIIIlllIIlIIlII(int n2) {
        return n2 > 0;
    }

    @Inject
    public AttackingNightmareTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
        this.dR = e2;
    }

    private static boolean lIIIlllIIlIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIIlIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIIlIIlIl(int n2, int n3) {
        return n2 != n3;
    }
}

