/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Disturb Nightmare", priority=250, blocking=false)
public class DisturbNightmareTask
extends Task {
    private final  h dG;
    
    private final  SquireNightmareConfig dF;
    
    private static final  Logger dE;

        return String.valueOf(var1);
    }

    static {
        ab.lIIIllllIlIIllI();
        ab.lIIIllllIlIIlIl();
        dE = LoggerFactory.getLogger(DisturbNightmareTask.class);
    }

    private static boolean lIIIllllIlIlIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public DisturbNightmareTask(SquireNightmareConfig squireNightmareConfig, h h2) {
        this.dF = squireNightmareConfig;
        this.dG = h2;
    }

    private static boolean lIIIllllIlIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllllIlIIlIl() {
        llllIIIlllIl = new String[llllIIIllllI[9]];
        ab.llllIIIlllIl[ab.llllIIIllllI[0]] = "Disturb";
        ab.llllIIIlllIl[ab.llllIIIllllI[1]] = "[DisturbNightmare]: No combat potions";
        ab.llllIIIlllIl[ab.llllIIIllllI[2]] = "[DisturbNightmare]: Combat potions: {}";
        ab.llllIIIlllIl[ab.llllIIIllllI[3]] = "[DisturbNightmare]: Not enough cleanse doses";
        ab.llllIIIlllIl[ab.llllIIIllllI[4]] = "[DisturbNightmare]:  Cleanse doses: {}";
        ab.llllIIIlllIl[ab.llllIIIllllI[5]] = "[DisturbNightmare]: Not enough food";
        ab.llllIIIlllIl[ab.llllIIIllllI[6]] = "[DisturbNightmare]: Food: {}";
        ab.llllIIIlllIl[ab.llllIIIllllI[7]] = "Disturb";
    }

    private static boolean lIIIllllIlIlIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ab var2;
        if (ab.lIIIllllIlIIlll(this.dF.assistantMode() ? 1 : 0)) {
            return llllIIIllllI[0];
        }
        if (ab.lIIIllllIlIlIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIIIllllI[0];
        }
        NPC var3 = SquireNightmarePlugin.d();
        if (ab.lIIIllllIlIlIIl(var3)) {
            return llllIIIllllI[0];
        }
        String[] stringArray = new String[llllIIIllllI[1]];
        stringArray[ab.llllIIIllllI[0]] = llllIIIlllIl[llllIIIllllI[0]];
        if (ab.lIIIllllIlIlIII(var3.hasAction(stringArray) ? 1 : 0)) {
            return llllIIIllllI[0];
        }
        int var4 = SquireNightmarePlugin.b();
        int var5 = SquireNightmarePlugin.a();
        int var6 = SquireNightmarePlugin.c();
        if (ab.lIIIllllIlIlIII(var6) && ab.lIIIllllIlIlIII(var2.dF.continueWithNoPots() ? 1 : 0)) {
            dE.info(llllIIIlllIl[llllIIIllllI[1]]);
            dE.info(llllIIIlllIl[llllIIIllllI[2]], (Object)var6);
            return var2.dG.aP();
        }
        if (ab.lIIIllllIlIlIlI(var5, var2.dF.teleportCleanse())) {
            dE.info(llllIIIlllIl[llllIIIllllI[3]]);
            dE.info(llllIIIlllIl[llllIIIllllI[4]], (Object)var5);
            return var2.dG.aP();
        }
        if (ab.lIIIllllIlIlIlI(var4, var2.dF.minimumFood())) {
            dE.info(llllIIIlllIl[llllIIIllllI[5]]);
            dE.info(llllIIIlllIl[llllIIIllllI[6]], (Object)var4);
            return var2.dG.aP();
        }
        var1_1.interact(llllIIIlllIl[llllIIIllllI[7]]);
        this.sleep(llllIIIllllI[8]);
        return llllIIIllllI[1];
    }

}

