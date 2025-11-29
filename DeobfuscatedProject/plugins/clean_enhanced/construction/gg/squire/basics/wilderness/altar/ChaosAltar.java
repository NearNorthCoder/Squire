/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.PvPUtil
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.Player
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.PlayerDespawned
 *  net.runelite.api.events.PlayerSpawned
 *  net.runelite.api.kit.KitType
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.wilderness.altar;

import com.openosrs.client.util.PvPUtil;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.wilderness.altar.AltaringTask;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.ItemComposition;
import net.runelite.api.Player;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.kit.KitType;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;

@PluginDescriptor(name="Squire Chaos Altar", description="Auto bones on Chaos Altar. Logs out for pkers.", enabledByDefault=false)
@SquireUtil
public class ChaosAltar
extends SquirePlugin {
     Map<KitType, ItemComposition> hh;
    private static  int[] llIlIllII;
     boolean hi;

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIlIllII[0]];
        classArray[ChaosAltar.llIlIllII[1]] = AltaringTask.class;
        return classArray;
    }

    static {
        ChaosAltar.var1();
    }

    @Subscribe
    public void a(PlayerDespawned playerDespawned) {
        this.hh.clear();
    }

    protected void onStart() {
        this.hi = llIlIllII[1];
        this.hh.clear();
        InteractionManager.setHelper((boolean)llIlIllII[0]);
    }

    private static void var1() {
        llIlIllII = new int[2];
        ChaosAltar.llIlIllII[0] = 1;
        ChaosAltar.llIlIllII[1] = (0x28 ^ 0x24 ^ (0x97 ^ 0x8D)) & (0x14 ^ 0x6F ^ (0 ^ 0x6D) ^ -1);
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(PlayerSpawned playerSpawned) {
        void var4;
        if (ChaosAltar.var3(playerSpawned.getPlayer(), Players.getLocal())) {
            return;
        }
        if (ChaosAltar.var2(PvPUtil.isAttackable((Client)Static.getClient(), (Player)var4.getPlayer()) ? 1 : 0)) {
            var5.hi = llIlIllII[0];
            Game.logout();
        }
    }

    public ChaosAltar() {
        this.hh = new HashMap<KitType, ItemComposition>();
    }

    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if (ChaosAltar.var3(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            this.hi = llIlIllII[1];
        }
    }

    public boolean cY() {
        return this.hi;
    }

    protected void onStop() {
        this.hh.clear();
        InteractionManager.setHelper((boolean)llIlIllII[1]);
    }
}

