package gg.squire.leagues.banknote;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.e.u.e.s.r.a.l.q.p000.p0010.s.p0022.p0032.u.e.p004.g.p0055.b;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
@PluginDescriptor(name = "[Leagues] Note items", enabledByDefault = false)
@SquireUtil
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/banknote/NoteItems.class */
public class NoteItems extends SquirePlugin {
    private static /* synthetic */ int[] llIlI;

    @Provides
    NoteItemsConfig a(ConfigManager configManager) {
        return (NoteItemsConfig) configManager.getConfig(NoteItemsConfig.class);
    }

    protected void onStop() {
    }

    private static void lIIllII() {
        llIlI = new int[2];
        llIlI[0] = " ".length();
        llIlI[1] = ((174 ^ 151) ^ (12 ^ 114)) & (((((80 + 39) - 114) + 125) ^ (((195 + 131) - 199) + 70)) ^ (-" ".length()));
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIlI[0]];
        clsArr[llIlI[1]] = b.class;
        return clsArr;
    }

    static {
        lIIllII();
    }

    public void onGameTick(GameTick gameTick) {
    }
}
