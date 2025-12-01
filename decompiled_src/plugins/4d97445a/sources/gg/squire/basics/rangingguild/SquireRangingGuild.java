package gg.squire.basics.rangingguild;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0050bw;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0051bx;
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
@PluginDescriptor(name = "Squire Ranging Guild", description = "Ranging Guild Helper", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/rangingguild/SquireRangingGuild.class */
public class SquireRangingGuild extends SquirePlugin {
    private /* synthetic */ boolean ff;
    private static /* synthetic */ int[] lIIlllI;
    private static /* synthetic */ String[] lIIllIl;

    private static boolean lIIllllll(int i2) {
        return i2 != 0;
    }

    static {
        lIIllllII();
        lIIlllIll();
    }

    public void e(boolean z) {
        this.ff = z;
    }

    private static boolean lIIlllllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    protected void onStop() {
        InteractionManager.setHelper((boolean) lIIlllI[1]);
        e(lIIlllI[2]);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIlllI[0]];
        clsArr[lIIlllI[1]] = C0051bx.class;
        clsArr[lIIlllI[2]] = C0050bw.class;
        return clsArr;
    }

    public boolean cq() {
        return this.ff;
    }

    @Subscribe
    private void a(ChatMessage chatMessage) {
        System.out.println(chatMessage.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        if (lIIllllIl(inventoryChanged.getItemId(), lIIlllI[3])) {
            e(lIIlllI[2]);
        }
        if (lIIllllIl(inventoryChanged.getItemId(), lIIlllI[4])) {
            e(lIIlllI[1]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    protected void onStart() {
        InteractionManager.setHelper((boolean) lIIlllI[2]);
        e(lIIlllI[2]);
    }

    private static void lIIlllIll() {
        lIIllIl = new String[lIIlllI[2]];
        lIIllIl[lIIlllI[1]] = lIIlllIlI("c2CUBHdgOG5L77VMJlW5lEqzhVankMdCmebmZXxplYDN4RGkv1ynr2IDtr/8RcMRYKMCm1HPztV4no1tQpCjaFA6rQrmp7+/bmbeAI1iI5FwqBD2Xr34VN7cyjbyKvK2HyNZmP9vLA6cMhOrsji3mgHLoK1hlzQBa/resVSeMm98PjIm4oZAgXo7OQrZAbzf", "cmMMz");
    }

    private static boolean lIIllllIl(int i2, int i3) {
        return i2 == i3;
    }

    private static void lIIllllII() {
        lIIlllI = new int[8];
        lIIlllI[0] = "  ".length();
        lIIlllI[1] = (125 ^ 89) & ((112 ^ 84) ^ (-1)) & (((4 ^ 100) & ((7 ^ 103) ^ (-1))) ^ (-1)) & (((81 ^ 48) & ((46 ^ 79) ^ (-1))) ^ (-1));
        lIIlllI[2] = " ".length();
        lIIlllI[3] = (-27204) & 28667;
        lIIlllI[4] = (-15489) & 16370;
        lIIlllI[5] = ((126 + 166) - 163) + 102;
        lIIlllI[6] = 184 ^ 190;
        lIIlllI[7] = (46 ^ 42) ^ (90 ^ 86);
    }

    private static String lIIlllIlI(String lllIllllIIIIIIl, String lllIllllIIIIIII) {
        try {
            SecretKeySpec lllIllllIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllllIIIIIII.getBytes(StandardCharsets.UTF_8)), lIIlllI[7]), "DES");
            Cipher lllIllllIIIIIll = Cipher.getInstance("DES");
            lllIllllIIIIIll.init(lIIlllI[0], lllIllllIIIIlII);
            return new String(lllIllllIIIIIll.doFinal(Base64.getDecoder().decode(lllIllllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllllIIIIIlI) {
            lllIllllIIIIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Subscribe
    private void a(WidgetLoaded widgetLoaded) {
        if (lIIlllllI(Widgets.get(lIIlllI[5], lIIlllI[6])) && lIIllllll(Widgets.get(lIIlllI[5], lIIlllI[6]).getText().equalsIgnoreCase(lIIllIl[lIIlllI[1]]) ? 1 : 0)) {
            e(lIIlllI[1]);
        }
    }
}
