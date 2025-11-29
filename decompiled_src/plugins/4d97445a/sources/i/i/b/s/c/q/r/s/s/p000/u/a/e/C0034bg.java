package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.prayer.prayerflicker.PrayFlickerConfig;
import gg.squire.basics.prayer.prayerflicker.SquirePrayFlick;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Flicking")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bg  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bg.class */
public class C0034bg extends Task {
    private /* synthetic */ boolean fz;
    private static /* synthetic */ String[] llllIllII;
    private final /* synthetic */ PrayFlickerConfig fx;
    private static /* synthetic */ int[] llllIllIl;
    private final /* synthetic */ SquirePrayFlick fy;

    private static void llIlIIIllII() {
        llllIllIl = new int[4];
        llllIllIl[0] = ((233 ^ 193) ^ (117 ^ 72)) & (((165 ^ 148) ^ (146 ^ 182)) ^ (-" ".length()));
        llllIllIl[1] = " ".length();
        llllIllIl[2] = "  ".length();
        llllIllIl[3] = 106 ^ 98;
    }

    static {
        llIlIIIllII();
        llIlIIIlIll();
    }

    @Inject
    public C0034bg(PrayFlickerConfig prayFlickerConfig, SquirePrayFlick squirePrayFlick) {
        this.fx = prayFlickerConfig;
        this.fy = squirePrayFlick;
    }

    private static boolean llIlIIlIIII(Object obj) {
        return obj != null;
    }

    private static void llIlIIIlIll() {
        llllIllII = new String[llllIllIl[2]];
        llllIllII[llllIllIl[0]] = llIlIIIlIIl("+gGExC+dICw=", "exibB");
        llllIllII[llllIllIl[1]] = llIlIIIlIlI("cT+LTHjvTms=", "GgCWO");
    }

    private static String llIlIIIlIlI(String lIlIIllIlIlIIll, String lIlIIllIlIlIIlI) {
        try {
            SecretKeySpec lIlIIllIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllIlIlIIlI.getBytes(StandardCharsets.UTF_8)), llllIllIl[3]), "DES");
            Cipher lIlIIllIlIlIlIl = Cipher.getInstance("DES");
            lIlIIllIlIlIlIl.init(llllIllIl[2], lIlIIllIlIlIllI);
            return new String(lIlIIllIlIlIlIl.doFinal(Base64.getDecoder().decode(lIlIIllIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIllIlIlIlII) {
            lIlIIllIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static String llIlIIIlIIl(String lIlIIllIlIIIllI, String lIlIIllIlIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIllIlIIlIII = Cipher.getInstance("Blowfish");
            lIlIIllIlIIlIII.init(llllIllIl[2], secretKeySpec);
            return new String(lIlIIllIlIIlIII.doFinal(Base64.getDecoder().decode(lIlIIllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIllIlIIIlll) {
            lIlIIllIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIlIIIllIl(int i2) {
        return i2 <= 0;
    }

    private static boolean llIlIIIllll(int i2) {
        return i2 != 0;
    }

    private static boolean llIlIIIlllI(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (llIlIIIllll(r0.hasAction((v1) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
            return r1.equals(v1);
        }) ? 1 : 0) != false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        int i2;
        int i3;
        if (!llIlIIIllIl(Skills.getBoostedLevel(Skill.PRAYER)) && !llIlIIIlllI(this.fy.isEnabled() ? 1 : 0)) {
            List all = NPCs.getAll(npc -> {
                if (llIlIIlIIIl(npc.getInteracting(), Players.getLocal())) {
                    String[] strArr = new String[llllIllIl[1]];
                    strArr[llllIllIl[0]] = llllIllII[llllIllIl[1]];
                    if (llIlIIIllll(npc.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = llllIllIl[1];
                        "".length();
                        return "  ".length() == ((2 ^ 25) & ((50 ^ 41) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return llllIllIl[0];
            });
            Actor interacting = Players.getLocal().getInteracting();
            if (llIlIIIllll(this.fx.flickInCombat() ? 1 : 0) && llIlIIIllll(all.isEmpty() ? 1 : 0)) {
                if (llIlIIlIIII(interacting)) {
                    String str = llllIllII[llllIllIl[0]];
                }
                i2 = llllIllIl[0];
                i3 = i2;
                Widget widget = Widgets.get(WidgetInfo.MINIMAP_QUICK_PRAYER_ORB);
                if (!llIlIIIlllI(i3)) {
                    if (llIlIIIllll(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
                        WidgetPackets.widgetFirstOption(widget);
                    }
                    return llllIllIl[0];
                }
                if (llIlIIIllll(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
                    WidgetPackets.widgetFirstOption(widget);
                    WidgetPackets.widgetFirstOption(widget);
                    "".length();
                    if (" ".length() <= 0) {
                        return ((137 ^ 142) ^ (97 ^ 121)) & (((8 ^ 69) ^ (34 ^ 112)) ^ (-" ".length()));
                    }
                } else if (llIlIIIlllI(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
                    WidgetPackets.widgetFirstOption(widget);
                    sleep(llllIllIl[1]);
                }
                return llllIllIl[1];
            }
            i2 = llllIllIl[1];
            "".length();
            if ("   ".length() == " ".length()) {
                return ((0 ^ 52) ^ (111 ^ 10)) & (((233 ^ 189) ^ (3 ^ 6)) ^ (-" ".length()));
            }
            i3 = i2;
            Widget widget2 = Widgets.get(WidgetInfo.MINIMAP_QUICK_PRAYER_ORB);
            if (!llIlIIIlllI(i3)) {
            }
        }
        return llllIllIl[0];
    }
}
