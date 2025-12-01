package gg.squire.basics.magic.stunalchtp;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aS;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aT;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aU;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Skill;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.game.Skills;
@PluginDescriptor(name = "Squire StunAlchTP", description = "Performs stun on guard, alchs and tps to ardougne", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/magic/stunalchtp/StunAlchTeleport.class */
public class StunAlchTeleport extends SquirePlugin {
    private static /* synthetic */ String[] lIIllIll;
    private static /* synthetic */ int[] lIIlllII;
    private /* synthetic */ boolean eQ = lIIlllII[0];
    private /* synthetic */ int eR = lIIlllII[0];

    private static boolean lIIlIIlIII(int i2, int i3) {
        return i2 < i3;
    }

    protected void onStart() {
        Log.info(lIIllIll[lIIlllII[0]]);
        this.eR = Skills.getExperience(Skill.MAGIC);
    }

    public int cm() {
        return this.eR;
    }

    public void d(boolean z) {
        this.eQ = z;
    }

    static {
        lIIlIIIlll();
        lIIlIIIllI();
    }

    public void z(int i2) {
        this.eR = i2;
    }

    protected void onStop() {
        Log.info(lIIllIll[lIIlllII[2]]);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIlllII[1]];
        clsArr[lIIlllII[0]] = aT.class;
        clsArr[lIIlllII[2]] = aS.class;
        clsArr[lIIlllII[3]] = aU.class;
        return clsArr;
    }

    public boolean cl() {
        return this.eQ;
    }

    @Provides
    SquireAlchTeleportConfig q(ConfigManager configManager) {
        return (SquireAlchTeleportConfig) configManager.getConfig(SquireAlchTeleportConfig.class);
    }

    private static void lIIlIIIllI() {
        lIIllIll = new String[lIIlllII[3]];
        lIIllIll[lIIlllII[0]] = lIIlIIIlIl("GR46KhQmCScQBWoZOyUnPg8r", "JjODU");
        lIIllIll[lIIlllII[2]] = lIIlIIIlIl("KwwlKiUUGzgQNFgLJCsUCB00", "xxPDd");
    }

    private static String lIIlIIIlIl(String lllIIIIlIIIllll, String lllIIIIlIIIlllI) {
        String lllIIIIlIIIllll2 = new String(Base64.getDecoder().decode(lllIIIIlIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllIIIIlIIIllII = lllIIIIlIIIlllI.toCharArray();
        int lllIIIIlIIIlIll = lIIlllII[0];
        char[] charArray = lllIIIIlIIIllll2.toCharArray();
        int length = charArray.length;
        int i2 = lIIlllII[0];
        while (lIIlIIlIII(i2, length)) {
            char lllIIIIlIIlIIII = charArray[i2];
            sb.append((char) (lllIIIIlIIlIIII ^ lllIIIIlIIIllII[lllIIIIlIIIlIll % lllIIIIlIIIllII.length]));
            "".length();
            lllIIIIlIIIlIll++;
            i2++;
            "".length();
            if ((((239 ^ 142) ^ (197 ^ 187)) & (((87 ^ 93) ^ (5 ^ 16)) ^ (-" ".length()))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIlIIIlll() {
        lIIlllII = new int[4];
        lIIlllII[0] = (129 ^ 153) & ((4 ^ 28) ^ (-1));
        lIIlllII[1] = "   ".length();
        lIIlllII[2] = " ".length();
        lIIlllII[3] = "  ".length();
    }
}
