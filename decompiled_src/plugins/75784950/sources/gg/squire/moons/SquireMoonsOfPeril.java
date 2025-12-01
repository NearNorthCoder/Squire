package gg.squire.moons;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.moons.overlay.MoonsInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.a;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.b;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.c;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.d;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.e;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.f;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.g;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.h;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.i;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.j;
import q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.k;
@PluginDescriptor(name = "Squire Moons of Peril", enabledByDefault = false)
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:gg/squire/moons/SquireMoonsOfPeril.class */
public class SquireMoonsOfPeril extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ SquireMoonsOfPerilConfig c;
    public static /* synthetic */ long i;
    @Inject
    private /* synthetic */ a e;
    public static /* synthetic */ Set<WorldPoint> j;
    @Inject
    private /* synthetic */ OverlayManager a;
    private static /* synthetic */ int[] lIIIIIIIlllII;
    public static /* synthetic */ String g;
    public static /* synthetic */ int h;
    public static /* synthetic */ String f;
    @Inject
    private /* synthetic */ MoonsInfoBox d;
    private static /* synthetic */ String[] lIIIIIIIllIll;

    private static void lIIlIllIllllIlI() {
        lIIIIIIIllIll = new String[lIIIIIIIlllII[5]];
        lIIIIIIIllIll[lIIIIIIIlllII[1]] = lIIlIllIlllIlll("Yo8tbJ2bcbBi/ESdRJk+w+QN315LEx8v", "AyCEu");
        lIIIIIIIllIll[lIIIIIIIlllII[2]] = lIIlIllIllllIII("LlrPew5EFTY=", "OPzvI");
        lIIIIIIIllIll[lIIIIIIIlllII[3]] = lIIlIllIllllIII("n9fbIpwHljAycPw+YRGIXnq4V4W5M4Fm", "rJvvK");
        lIIIIIIIllIll[lIIIIIIIlllII[4]] = lIIlIllIllllIIl("eFt0eA==", "IuEIq");
    }

    private static String lIIlIllIlllIlll(String lllllllllllllllIIIlllllIIIIllllI, String lllllllllllllllIIIlllllIIIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlllllIIIlIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlllllIIIlIIIII.init(lIIIIIIIlllII[3], secretKeySpec);
            return new String(lllllllllllllllIIIlllllIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllllIIIIlllll) {
            lllllllllllllllIIIlllllIIIIlllll.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIIlIllIlllllII(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIIIIIlllII[11], lIIIIIIIlllII[12], lIIIIIIIlllII[1])) ? 1 : 0)) {
            return;
        }
        if (lIIlIllIllllllI(npcSpawned.getNpc())) {
            System.out.println("name: " + npcSpawned.getNpc().getName());
            System.out.println("ID: " + npcSpawned.getNpc().getId());
            System.out.println("NPC: " + String.valueOf(npcSpawned.getNpc()));
        }
        NPC npc = npcSpawned.getNpc();
        if (lIIlIllIllllllI(npc)) {
            j.add(npc.getWorldLocation());
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        boolean z;
        if (!lIIlIllIlllllII(configButtonClicked.getGroup().equals(lIIIIIIIllIll[lIIIIIIIlllII[1]]) ? 1 : 0) && lIIlIllIlllllIl(configButtonClicked.getKey().equals(lIIIIIIIllIll[lIIIIIIIlllII[2]]) ? 1 : 0)) {
            if (lIIlIllIlllllII(isPaused() ? 1 : 0)) {
                ?? r1 = lIIIIIIIlllII[2];
                "".length();
                z = r1;
                if (" ".length() == 0) {
                    return;
                }
            } else {
                z = lIIIIIIIlllII[1];
            }
            setPaused(z);
        }
    }

    protected void onStop() {
        this.a.remove(this.e);
        "".length();
        this.a.remove(this.d);
        "".length();
    }

    private static boolean lIIlIllIlllllll(int i2, int i3) {
        return i2 < i3;
    }

    protected void onStart() {
        this.a.add(this.e);
        "".length();
        this.a.add(this.d);
        "".length();
        i = System.currentTimeMillis();
        h = lIIIIIIIlllII[1];
    }

    private static String lIIlIllIllllIII(String lllllllllllllllIIIlllllIIIIlIIIl, String lllllllllllllllIIIlllllIIIIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllIIIIlIIII.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlllII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIlllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllllIIIIlIIlI) {
            lllllllllllllllIIIlllllIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIlIllIllllIIl(String lllllllllllllllIIIlllllIIIIIIIIl, String lllllllllllllllIIIlllllIIIIIIIII) {
        String lllllllllllllllIIIlllllIIIIIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIllllIlllllllll = new StringBuilder();
        char[] lllllllllllllllIIIllllIllllllllI = lllllllllllllllIIIlllllIIIIIIIII.toCharArray();
        int lllllllllllllllIIIllllIlllllllIl = lIIIIIIIlllII[1];
        char[] charArray = lllllllllllllllIIIlllllIIIIIIIIl2.toCharArray();
        int length = charArray.length;
        int i2 = lIIIIIIIlllII[1];
        while (lIIlIllIlllllll(i2, length)) {
            char lllllllllllllllIIIlllllIIIIIIIlI = charArray[i2];
            lllllllllllllllIIIllllIlllllllll.append((char) (lllllllllllllllIIIlllllIIIIIIIlI ^ lllllllllllllllIIIllllIllllllllI[lllllllllllllllIIIllllIlllllllIl % lllllllllllllllIIIllllIllllllllI.length]));
            "".length();
            lllllllllllllllIIIllllIlllllllIl++;
            i2++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIllllIlllllllll);
    }

    static {
        lIIlIllIllllIll();
        lIIlIllIllllIlI();
        f = lIIIIIIIllIll[lIIIIIIIlllII[4]];
        i = System.currentTimeMillis();
        j = new LinkedHashSet();
    }

    @Provides
    SquireMoonsOfPerilConfig a(ConfigManager configManager) {
        return (SquireMoonsOfPerilConfig) configManager.getConfig(SquireMoonsOfPerilConfig.class);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIIIIIIlllII[0]];
        clsArr[lIIIIIIIlllII[1]] = g.class;
        clsArr[lIIIIIIIlllII[2]] = c.class;
        clsArr[lIIIIIIIlllII[3]] = b.class;
        clsArr[lIIIIIIIlllII[4]] = d.class;
        clsArr[lIIIIIIIlllII[5]] = e.class;
        clsArr[lIIIIIIIlllII[6]] = i.class;
        clsArr[lIIIIIIIlllII[7]] = h.class;
        clsArr[lIIIIIIIlllII[8]] = k.class;
        clsArr[lIIIIIIIlllII[9]] = j.class;
        clsArr[lIIIIIIIlllII[10]] = f.class;
        return clsArr;
    }

    private static boolean lIIlIllIlllllII(int i2) {
        return i2 == 0;
    }

    private static boolean lIIlIllIlllllIl(int i2) {
        return i2 != 0;
    }

    private static void lIIlIllIllllIll() {
        lIIIIIIIlllII = new int[13];
        lIIIIIIIlllII[0] = 53 ^ 63;
        lIIIIIIIlllII[1] = ((((59 + 180) - 67) + 48) ^ (((58 + 123) - 168) + 128)) & (((64 ^ 28) ^ (30 ^ 19)) ^ (-" ".length()));
        lIIIIIIIlllII[2] = " ".length();
        lIIIIIIIlllII[3] = "  ".length();
        lIIIIIIIlllII[4] = "   ".length();
        lIIIIIIIlllII[5] = 117 ^ 113;
        lIIIIIIIlllII[6] = (((70 + 172) - 144) + 81) ^ (((11 + 174) - 138) + 135);
        lIIIIIIIlllII[7] = (109 ^ 68) ^ (140 ^ 163);
        lIIIIIIIlllII[8] = (144 ^ 166) ^ (159 ^ 174);
        lIIIIIIIlllII[9] = 127 ^ 119;
        lIIIIIIIlllII[10] = (164 ^ 145) ^ (171 ^ 151);
        lIIIIIIIlllII[11] = (-((-1047) & 31807)) & (-514) & 32761;
        lIIIIIIIlllII[12] = (-((-1065) & 18029)) & (-4116) & 30711;
    }

    private static boolean lIIlIllIllllllI(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlIllIlllllIl(chatMessage.getMessage().contains(lIIIIIIIllIll[lIIIIIIIlllII[3]]) ? 1 : 0)) {
            h += lIIIIIIIlllII[2];
        }
    }
}
