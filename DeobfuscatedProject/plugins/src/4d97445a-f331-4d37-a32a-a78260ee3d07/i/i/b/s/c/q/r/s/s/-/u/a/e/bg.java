/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Skill
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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

@TaskDesc(name="Flicking")
public class bg
extends Task {
    private /* synthetic */ boolean fz;
    private static /* synthetic */ String[] llllIllII;
    private final /* synthetic */ PrayFlickerConfig fx;
    private static /* synthetic */ int[] llllIllIl;
    private final /* synthetic */ SquirePrayFlick fy;

    private static void llIlIIIllII() {
        llllIllIl = new int[4];
        bg.llllIllIl[0] = (0xE9 ^ 0xC1 ^ (0x75 ^ 0x48)) & (0xA5 ^ 0x94 ^ (0x92 ^ 0xB6) ^ -" ".length());
        bg.llllIllIl[1] = " ".length();
        bg.llllIllIl[2] = "  ".length();
        bg.llllIllIl[3] = 0x6A ^ 0x62;
    }

    static {
        bg.llIlIIIllII();
        bg.llIlIIIlIll();
    }

    @Inject
    public bg(PrayFlickerConfig prayFlickerConfig, SquirePrayFlick squirePrayFlick) {
        this.fx = prayFlickerConfig;
        this.fy = squirePrayFlick;
    }

    private static boolean llIlIIlIIII(Object object) {
        return object != null;
    }

    private static void llIlIIIlIll() {
        llllIllII = new String[llllIllIl[2]];
        bg.llllIllII[bg.llllIllIl[0]] = bg.llIlIIIlIIl("+gGExC+dICw=", "exibB");
        bg.llllIllII[bg.llllIllIl[1]] = bg.llIlIIIlIlI("cT+LTHjvTms=", "GgCWO");
    }

    private static String llIlIIIlIlI(String lIlIIllIlIlIIll, String lIlIIllIlIlIIlI) {
        try {
            SecretKeySpec lIlIIllIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllIlIlIIlI.getBytes(StandardCharsets.UTF_8)), llllIllIl[3]), "DES");
            Cipher lIlIIllIlIlIlIl = Cipher.getInstance("DES");
            lIlIIllIlIlIlIl.init(llllIllIl[2], lIlIIllIlIlIllI);
            return new String(lIlIIllIlIlIlIl.doFinal(Base64.getDecoder().decode(lIlIIllIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIllIlIlIlII) {
            lIlIIllIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static String llIlIIIlIIl(String lIlIIllIlIIIllI, String lIlIIllIlIIIlIl) {
        try {
            SecretKeySpec lIlIIllIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIllIlIIlIII = Cipher.getInstance("Blowfish");
            lIlIIllIlIIlIII.init(llllIllIl[2], lIlIIllIlIIlIIl);
            return new String(lIlIIllIlIIlIII.doFinal(Base64.getDecoder().decode(lIlIIllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIllIlIIIlll) {
            lIlIIllIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIIIllIl(int n2) {
        return n2 <= 0;
    }

    private static boolean llIlIIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIIlllI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        int n2;
        bg lIlIIllIllIIIIl;
        if (bg.llIlIIIllIl(Skills.getBoostedLevel((Skill)Skill.PRAYER))) {
            return llllIllIl[0];
        }
        if (bg.llIlIIIlllI(lIlIIllIllIIIIl.fy.isEnabled() ? 1 : 0)) {
            return llllIllIl[0];
        }
        List lIlIIllIllIIIII = NPCs.getAll(nPC -> {
            int n2;
            if (bg.llIlIIlIIIl(nPC.getInteracting(), Players.getLocal())) {
                String[] stringArray = new String[llllIllIl[1]];
                stringArray[bg.llllIllIl[0]] = llllIllII[llllIllIl[1]];
                if (bg.llIlIIIllll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llllIllIl[1];
                    "".length();
                    if ("  ".length() != ((2 ^ 0x19) & ~(0x32 ^ 0x29))) return n2 != 0;
                    return ((0xCE ^ 0x8D) & ~(0x3B ^ 0x78)) != 0;
                }
            }
            n2 = llllIllIl[0];
            return n2 != 0;
        });
        Actor lIlIIllIlIlllll = Players.getLocal().getInteracting();
        if (!bg.llIlIIIllll(lIlIIllIllIIIIl.fx.flickInCombat() ? 1 : 0) || !bg.llIlIIIllll(lIlIIllIllIIIII.isEmpty() ? 1 : 0) || bg.llIlIIlIIII(lIlIIllIlIlllll) && bg.llIlIIIllll(lIlIIllIlIlllll.hasAction(llllIllII[llllIllIl[0]]::equals) ? 1 : 0)) {
            n2 = llllIllIl[1];
            "".length();
            if ("   ".length() == " ".length()) {
                return ((0 ^ 0x34 ^ (0x6F ^ 0xA)) & (0xE9 ^ 0xBD ^ (3 ^ 6) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llllIllIl[0];
        }
        int lIlIIllIlIllllI = n2;
        Widget lIlIIllIlIlllIl = Widgets.get((WidgetInfo)WidgetInfo.MINIMAP_QUICK_PRAYER_ORB);
        if (bg.llIlIIIlllI(lIlIIllIlIllllI)) {
            if (bg.llIlIIIllll(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
                WidgetPackets.widgetFirstOption((Widget)lIlIIllIlIlllIl);
            }
            return llllIllIl[0];
        }
        if (bg.llIlIIIllll(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            WidgetPackets.widgetFirstOption((Widget)lIlIIllIlIlllIl);
            WidgetPackets.widgetFirstOption((Widget)lIlIIllIlIlllIl);
            "".length();
            if (" ".length() <= 0) {
                return ((0x89 ^ 0x8E ^ (0x61 ^ 0x79)) & (8 ^ 0x45 ^ (0x22 ^ 0x70) ^ -" ".length())) != 0;
            }
        } else if (bg.llIlIIIlllI(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            WidgetPackets.widgetFirstOption((Widget)lIlIIllIlIlllIl);
            lIlIIllIllIIIIl.sleep(llllIllIl[1]);
        }
        return llllIllIl[1];
    }
}

