/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Flick Rapid Heal -> FlickrapidhealTask */
@TaskDesc(name="Flick Rapid Heal", priority=2, blocking=true)
public class FlickRapidHealTask
extends Task {
    private static /* synthetic */ String[] lIIIlIIlIIlIl;
    private final /* synthetic */ Client Q;
    private static /* synthetic */ int[] lIIIlIIlIIllI;
    private final /* synthetic */ SquireNightmareZone O;
    private final /* synthetic */ SquireNightmareZoneConfig P;
    private /* synthetic */ Random R;

    @Inject
    public g(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.R = new Random();
        this.O = squireNightmareZone;
        this.P = squireNightmareZoneConfig;
        this.Q = client;
    }

    private static boolean lIIllllIllllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIlllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllllIlllIlll(Object object) {
        return object == null;
    }

    private static void lIIllllIlllIIlI() {
        lIIIlIIlIIlIl = new String[lIIIlIIlIIllI[4]];
        g.lIIIlIIlIIlIl[g.lIIIlIIlIIllI[0]] = g."Flicking Rapid Heal";
    }

    public boolean run() {
        if (g.lIIllllIlllIlII(this.Q.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIIllI[0];
        }
        if (!g.lIIllllIlllIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIlIIlIIllI[1]) || g.lIIllllIlllIllI(Skills.getBoostedLevel((Skill)Skill.PRAYER))) {
            return lIIIlIIlIIllI[0];
        }
        Widget var4 = Widgets.get((WidgetInfo)Prayer.RAPID_HEAL.getWidgetInfo());
        if (g.lIIllllIlllIlll(var4)) {
            return lIIIlIIlIIllI[0];
        }
        if (g.lIIllllIllllIII(Prayers.isEnabled((Prayer)Prayer.RAPID_HEAL) ? 1 : 0)) {
            WidgetPackets.widgetFirstOption((Widget)var4);
            0;
            if (-3 > 0) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            WidgetPackets.widgetFirstOption((Widget)var4);
            WidgetPackets.widgetFirstOption((Widget)var4);
        }
        System.out.println(lIIIlIIlIIlIl[lIIIlIIlIIllI[0]]);
        int n2 = this.R.nextInt(lIIIlIIlIIllI[2]) + lIIIlIIlIIllI[3];
        this.sleep(n2);
        return lIIIlIIlIIllI[4];
    }

    private static String lIIllllIlllIIIl(String var3, String var2) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIIIlIIlIIllI[5], var1);
            return new String(var5.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIlllIllI(int n2) {
        return n2 <= 0;
    }

    static {
        g.lIIllllIlllIIll();
        g.lIIllllIlllIIlI();
    }

    private static boolean lIIllllIlllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIllllIlllIIll() {
        lIIIlIIlIIllI = new int[6];
        g.lIIIlIIlIIllI[0] = (0x1D ^ 0x1A) & ~(0xBF ^ 0xB8);
        g.lIIIlIIlIIllI[1] = 0x33 ^ 0x79 ^ (0x9C ^ 0xC0);
        g.lIIIlIIlIIllI[2] = 0x6B ^ 7 ^ (0x4A ^ 0x6A);
        g.lIIIlIIlIIllI[3] = 8 ^ 0x1C;
        g.lIIIlIIlIIllI[4] = 1;
        g.lIIIlIIlIIllI[5] = 2;
    }
}

