package gg.squire.basics.wilderness.altar;

import com.openosrs.client.util.PvPUtil;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bX;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.GameState;
import net.runelite.api.ItemComposition;
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
@PluginDescriptor(name = "Squire Chaos Altar", description = "Auto bones on Chaos Altar. Logs out for pkers.", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/wilderness/altar/ChaosAltar.class */
public class ChaosAltar extends SquirePlugin {
    /* synthetic */ Map<KitType, ItemComposition> hh = new HashMap();
    private static /* synthetic */ int[] llIlIllII;
    /* synthetic */ boolean hi;

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIlIllII[0]];
        clsArr[llIlIllII[1]] = bX.class;
        return clsArr;
    }

    static {
        lIlllIlllII();
    }

    @Subscribe
    public void a(PlayerDespawned playerDespawned) {
        this.hh.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStart() {
        this.hi = llIlIllII[1];
        this.hh.clear();
        InteractionManager.setHelper((boolean) llIlIllII[0]);
    }

    private static void lIlllIlllII() {
        llIlIllII = new int[2];
        llIlIllII[0] = " ".length();
        llIlIllII[1] = ((40 ^ 36) ^ (151 ^ 141)) & (((20 ^ 111) ^ (0 ^ 109)) ^ (-" ".length()));
    }

    private static boolean lIlllIllllI(int i2) {
        return i2 != 0;
    }

    private static boolean lIlllIlllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void b(PlayerSpawned playerSpawned) {
        if (!lIlllIlllIl(playerSpawned.getPlayer(), Players.getLocal()) && lIlllIllllI(PvPUtil.isAttackable(Static.getClient(), playerSpawned.getPlayer()) ? 1 : 0)) {
            this.hi = llIlIllII[0];
            Game.logout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if (lIlllIlllIl(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            this.hi = llIlIllII[1];
        }
    }

    public boolean cY() {
        return this.hi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    protected void onStop() {
        this.hh.clear();
        InteractionManager.setHelper((boolean) llIlIllII[1]);
    }
}
