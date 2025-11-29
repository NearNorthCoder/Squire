/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.util.Log
 *  net.runelite.api.Skill
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.basics.magic.stunalchtp;

import com.google.inject.Provides;
import gg.squire.basics.magic.stunalchtp.SquireAlchTeleportConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import gg.squire.basics.magic.stunalchtp.AlchingTask;
import gg.squire.basics.magic.stunalchtp.StunningTask;
import gg.squire.basics.magic.stunalchtp.TeleportingTask;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Skill;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.game.Skills;

@PluginDescriptor(name="Squire StunAlchTP", description="Performs stun on guard, alchs and tps to ardougne", enabledByDefault=false)
public class StunAlchTeleport
extends SquirePlugin {
    
    private  int eR;
    
    private  boolean eQ;

    private static boolean lIIlIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    protected void onStart() {
        Log.info((String)lIIllIll[lIIlllII[0]]);
        this.eR = Skills.getExperience((Skill)Skill.MAGIC);
    }

    public int cm() {
        return this.eR;
    }

    public void d(boolean bl2) {
        this.eQ = bl2;
    }

    static {
        StunAlchTeleport.lIIlIIIlll();
        StunAlchTeleport.lIIlIIIllI();
    }

    public void z(int n2) {
        this.eR = n2;
    }

    protected void onStop() {
        Log.info((String)lIIllIll[lIIlllII[2]]);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIlllII[1]];
        classArray[StunAlchTeleport.lIIlllII[0]] = StunningTask.class;
        classArray[StunAlchTeleport.lIIlllII[2]] = AlchingTask.class;
        classArray[StunAlchTeleport.lIIlllII[3]] = TeleportingTask.class;
        return classArray;
    }

    public boolean cl() {
        return this.eQ;
    }

    @Provides
    SquireAlchTeleportConfig q(ConfigManager configManager) {
        return (SquireAlchTeleportConfig)configManager.getConfig(SquireAlchTeleportConfig.class);
    }

    private static void lIIlIIIllI() {
        lIIllIll = new String[lIIlllII[3]];
        StunAlchTeleport.lIIllIll[StunAlchTeleport.lIIlllII[0]] = "StunAlchTP started";
        StunAlchTeleport.lIIllIll[StunAlchTeleport.lIIlllII[2]] = "StunAlchTP stopped";
    }

    public StunAlchTeleport() {
        this.eQ = lIIlllII[0];
        this.eR = lIIlllII[0];
    }

        return String.valueOf(lllIIIIlIIIllIl);
    }

}

