/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.NPC
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.magic;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.magic.MageArenaOneConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.client.managers.interaction.InteractionManager;

@SquireUtil
@PluginDescriptor(name="Squire Mage Arena One", description="Cast god spells for you", enabledByDefault=false)
public class MageArenaOne
extends SquirePlugin {
    @Inject
     MageArenaOneConfig eM;
    private static  String[] llIlllII;
    private static  int[] llIlllIl;
    @Inject
     ConfigManager bA;

    private static String var1(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = 1;
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = 1;
        while (var9 < var8) {
            char var10 = var7[var9];
            var4.append((char)(var10 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)1);
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)2);
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Provides
    MageArenaOneConfig o(ConfigManager configManager) {
        return (MageArenaOneConfig)configManager.getConfig(MageArenaOneConfig.class);
    }

    protected Class<?>[] tasks() {
        return new Class[1];
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        List list = NPCs.getAll(nPC -> {
            int n2;
            if ((nPC.getInteracting() == nPC.getInteracting()2))) {
                String[] stringArray = new String[2];
                stringArray[1] = llIlllII[1];
                if ((nPC.hasActionstringArray) && (nPC.getName( != 0).contains(llIlllII[2]) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if (((0x4D ^ 0x2C) & ~(0x10 ^ 0x71)) < 1) return n2 != 0;
                    return ((0x2E ^ 0) & ~(0xA3 ^ 0x8D)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if (list != null && (Players.getLocal().getAnimation() == 0)) {
            Magic.cast((Spethis.eM.spell(), (NPC)((NPC)list.get(1)));
        }
    }
}

