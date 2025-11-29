/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.NPC;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Looting", priority=500, blocking=true)
public class LootingTask
extends Task {
    private final  j eE;
    
    private final  h eG;
    private static final  Logger eD;
    private final  SquireNightmareConfig eF;
    
    private final  SquireNightmarePlugin eH;

    private static void lIIlIIIlIIlIllI() {
        llllIlIlllIl = new String[llllIlIllllI[1]];
        az.llllIlIlllIl[az.llllIlIllllI[0]] = "Disturb";
    }

    private static boolean lIIlIIIlIIllIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public LootingTask(SquireNightmarePlugin squireNightmarePlugin, j j2, SquireNightmareConfig squireNightmareConfig, h h2) {
        this.eH = squireNightmarePlugin;
        this.eE = j2;
        this.eF = squireNightmareConfig;
        this.eG = h2;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIIlIIllIIl(int n2) {
        return n2 != 0;
    }

    static {
        az.lIIlIIIlIIlIlll();
        az.lIIlIIIlIIlIllI();
        eD = LoggerFactory.getLogger(LootingTask.class);
    }

    private static boolean lIIlIIIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIlIIllIlI(Object object) {
        return object == null;
    }

    public boolean run() {
        az var2;
        if (az.lIIlIIIlIIllIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIlIllllI[0];
        }
        if (az.lIIlIIIlIIllIIl(var2.eF.assistantMode() ? 1 : 0)) {
            return llllIlIllllI[0];
        }
        NPC var3 = SquireNightmarePlugin.d();
        if (az.lIIlIIIlIIllIlI(var3)) {
            return llllIlIllllI[0];
        }
        String[] stringArray = new String[llllIlIllllI[1]];
        stringArray[az.llllIlIllllI[0]] = llllIlIlllIl[llllIlIllllI[0]];
        if (az.lIIlIIIlIIllIII(var3.hasAction(stringArray) ? 1 : 0)) {
            return llllIlIllllI[0];
        }
        boolean bl = this.eG.aG();
        this.sleep(llllIlIllllI[1]);
        return bl;
    }
}

