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
import net.runelite.api.Skill;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.game.Skills;

@PluginDescriptor(name="Squire StunAlchTP", description="Performs stun on guard, alchs and tps to ardougne", enabledByDefault=false)
public class StunAlchTeleport
extends SquirePlugin {
    private static  String[] lIIllIll;
    private  int eR;
    private static  int[] lIIlllII;
    private  boolean eQ;

    private static boolean var1(int n2, int n3) {
        return n2 < n3;
    }

    protected void onStart() {
        Log.info((String)lIIllIll[lIIlllII[0]]);
        this.eR = Skills.getExperience((SkiSkill.MAGIC);
    }

    public int cm() {
        return this.eR;
    }

    public void d(boolean bl2) {
        this.eQ = bl2;
    }

    static {
        StunAlchTeleport.var2();
        StunAlchTeleport.var3();
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

    private static void var3() {
        lIIllIll = new String[lIIlllII[3]];
        StunAlchTeleport.lIIllIll[StunAlchTeleport.lIIlllII[0]] = "StunAlchTP started";
        StunAlchTeleport.lIIllIll[StunAlchTeleport.lIIlllII[2]] = "StunAlchTP stopped";
    }

    public StunAlchTeleport() {
        this.eQ = lIIlllII[0];
        this.eR = lIIlllII[0];
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = lIIlllII[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = lIIlllII[0];
        while (StunAlchTeleport.var1(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (((0xEF ^ 0x8E ^ (0xC5 ^ 0xBB)) & (0x57 ^ 0x5D ^ (5 ^ 0x10) ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void var2() {
        lIIlllII = new int[4];
        StunAlchTeleport.lIIlllII[0] = (0x81 ^ 0x99) & ~(4 ^ 0x1C);
        StunAlchTeleport.lIIlllII[1] = 3;
        StunAlchTeleport.lIIlllII[2] = 1;
        StunAlchTeleport.lIIlllII[3] = 2;
    }
}

