/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.WidgetLoaded
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.rangingguild;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bw;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bx;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.managers.interaction.InteractionManager;

@SquireUtil
@PluginDescriptor(name="Squire Ranging Guild", description="Ranging Guild Helper", enabledByDefault=false)
public class SquireRangingGuild
extends SquirePlugin {
    private /* synthetic */ boolean ff;
    private static /* synthetic */ int[] lIIlllI;
    private static /* synthetic */ String[] lIIllIl;

    private static boolean lIIllllll(int n2) {
        return n2 != 0;
    }

    static {
        SquireRangingGuild.lIIllllII();
        SquireRangingGuild.lIIlllIll();
    }

    public void e(boolean bl2) {
        this.ff = bl2;
    }

    private static boolean lIIlllllI(Object object) {
        return object != null;
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)lIIlllI[1]);
        this.e(lIIlllI[2]);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIlllI[0]];
        classArray[SquireRangingGuild.lIIlllI[1]] = bx.class;
        classArray[SquireRangingGuild.lIIlllI[2]] = bw.class;
        return classArray;
    }

    public boolean cq() {
        return this.ff;
    }

    @Subscribe
    private void a(ChatMessage chatMessage) {
        System.out.println(chatMessage.getMessage());
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        void lllIllllIIIlIll;
        if (SquireRangingGuild.lIIllllIl(inventoryChanged.getItemId(), lIIlllI[3])) {
            this.e(lIIlllI[2]);
        }
        if (SquireRangingGuild.lIIllllIl(lllIllllIIIlIll.getItemId(), lIIlllI[4])) {
            SquireRangingGuild lllIllllIIIllII;
            lllIllllIIIllII.e(lIIlllI[1]);
        }
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)lIIlllI[2]);
        this.e(lIIlllI[2]);
    }

    private static void lIIlllIll() {
        lIIllIl = new String[lIIlllI[2]];
        SquireRangingGuild.lIIllIl[SquireRangingGuild.lIIlllI[1]] = SquireRangingGuild."you're given 10 shots at the targets, for each hit you<br>will receive points. at the end you'll be awarded 1 ticket<br>for every 10 points.";
    }

    private static boolean lIIllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIllllII() {
        lIIlllI = new int[8];
        SquireRangingGuild.lIIlllI[0] = 2;
        SquireRangingGuild.lIIlllI[1] = (0x7D ^ 0x59) & ~(0x70 ^ 0x54) & ~((4 ^ 0x64) & ~(7 ^ 0x67)) & ~((0x51 ^ 0x30) & ~(0x2E ^ 0x4F));
        SquireRangingGuild.lIIlllI[2] = 1;
        SquireRangingGuild.lIIlllI[3] = 0xFFFF95BC & 0x6FFB;
        SquireRangingGuild.lIIlllI[4] = 0xFFFFC37F & 0x3FF2;
        SquireRangingGuild.lIIlllI[5] = 126 + 166 - 163 + 102;
        SquireRangingGuild.lIIlllI[6] = 0xB8 ^ 0xBE;
        SquireRangingGuild.lIIlllI[7] = 0x2E ^ 0x2A ^ (0x5A ^ 0x56);
    }

    private static String lIIlllIlI(String lllIllllIIIIIIl, String lllIllllIIIIIII) {
        try {
            SecretKeySpec lllIllllIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllllIIIIIII.getBytes(StandardCharsets.UTF_8)), lIIlllI[7]), "DES");
            Cipher lllIllllIIIIIll = Cipher.getInstance("DES");
            lllIllllIIIIIll.init(lIIlllI[0], lllIllllIIIIlII);
            return new String(lllIllllIIIIIll.doFinal(Base64.getDecoder().decode(lllIllllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllllIIIIIlI) {
            lllIllllIIIIIlI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(WidgetLoaded widgetLoaded) {
        if (SquireRangingGuild.lIIlllllI(Widgets.get((int)lIIlllI[5], (int)lIIlllI[6])) && SquireRangingGuild.lIIllllll(Widgets.get((int)lIIlllI[5], (int)lIIlllI[6]).getText().equalsIgnoreCase(lIIllIl[lIIlllI[1]]) ? 1 : 0)) {
            this.e(lIIlllI[1]);
        }
    }
}

