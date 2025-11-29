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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    @Inject
     ConfigManager bA;

        return String.valueOf(llIlIlIIllIIlll);
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)llIlllIl[1]);
    }

    private static boolean llIIIlIIII(int n2) {
        return n2 != 0;
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)llIlllIl[2]);
    }

    private static void llIIIIlIll() {
        llIlllII = new String[llIlllIl[3]];
        MageArenaOne.llIlllII[MageArenaOne.llIlllIl[1]] = "Attack";
        MageArenaOne.llIlllII[MageArenaOne.llIlllIl[2]] = "mage";
    }

    private static boolean llIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIllIl(Object object) {
        return object != null;
    }

    private static boolean llIIIIllll(Object object, Object object2) {
        return object == object2;
    }

    static {
        MageArenaOne.llIIIIllII();
        MageArenaOne.llIIIIlIll();
    }

    private static boolean llIIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    @Provides
    MageArenaOneConfig o(ConfigManager configManager) {
        return (MageArenaOneConfig)configManager.getConfig(MageArenaOneConfig.class);
    }

    protected Class<?>[] tasks() {
        return new Class[llIlllIl[1]];
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (MageArenaOne.llIIIIllll(nPC.getInteracting(), Players.getLocal())) {
                String[] stringArray = new String[llIlllIl[2]];
                stringArray[MageArenaOne.llIlllIl[1]] = llIlllII[llIlllIl[1]];
                if (MageArenaOne.llIIIlIIII(nPC.hasAction(stringArray) ? 1 : 0) && MageArenaOne.llIIIlIIII(nPC.getName().contains(llIlllII[llIlllIl[2]]) ? 1 : 0)) {
                    n2 = llIlllIl[2];

                    if (((0x4D ^ 0x2C) & ~(0x10 ^ 0x71)) < 1) return n2 != 0;
                    return false;
                }
            }
            n2 = llIlllIl[1];
            return n2 != 0;
        });
        if (MageArenaOne.llIIIIllIl(list) && MageArenaOne.llIIIIlllI(Players.getLocal().getAnimation(), llIlllIl[0])) {
            Magic.cast((Spell)this.eM.spell(), (NPC)((NPC)list.get(llIlllIl[1])));
        }
    }
}

