package gg.squire.driftnet;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.driftnet.overlay.DriftNetInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.a;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.c;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.d;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.e;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.f;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.g;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.h;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.i;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.j;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.k;
@PluginDescriptor(name = "Squire Drift Net Fisher", enabledByDefault = false)
/* loaded from: squire-drift-net-fishing-0.0.1.jar:gg/squire/driftnet/SquireDriftNet.class */
public class SquireDriftNet extends SquirePlugin {
    private /* synthetic */ InventorySetup i;
    private /* synthetic */ String b = lIlIIIIIllll[lIlIIIIlIIII[0]];
    @Inject
    private /* synthetic */ a d;
    private /* synthetic */ boolean c;
    private static /* synthetic */ int[] lIlIIIIlIIII;
    @Inject
    private /* synthetic */ EventBus f;
    private /* synthetic */ boolean a;
    @Inject
    private /* synthetic */ OverlayManager e;
    private static /* synthetic */ String[] lIlIIIIIllll;
    @Inject
    private /* synthetic */ DriftNetInfoBox h;
    @Inject
    private /* synthetic */ SquireDriftNetConfig g;

    private static String llIlIIlllIlIlI(String lllllllllllllllIlllIIllllIlIlIlI, String lllllllllllllllIlllIIllllIlIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllllIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIlIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIllllIlIlIll) {
            lllllllllllllllIlllIIllllIlIlIll.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        a(new InventorySetup());
        b();
    }

    static {
        llIlIIlllIllIl();
        llIlIIlllIlIll();
    }

    public void a(String str) {
        this.b = str;
    }

    protected void onStop() {
        this.f.unregister(this.d);
        this.e.remove(this.h);
        "".length();
    }

    private static boolean llIlIIllllIIII(Object obj) {
        return obj != null;
    }

    public void a(boolean z) {
        this.a = z;
    }

    private static boolean llIlIIlllIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStart() {
        this.a = lIlIIIIlIIII[2];
        this.d.h();
        this.f.register(this.d);
        this.e.add(this.h);
        "".length();
        this.b = lIlIIIIIllll[lIlIIIIlIIII[2]];
        a(new InventorySetup());
        if (llIlIIlllIlllI(this.b.isEmpty() ? 1 : 0)) {
            this.b = a();
        }
        b();
    }

    private static boolean llIlIIlllIllll(int i) {
        return i == 0;
    }

    public void a(InventorySetup inventorySetup) {
        this.i = inventorySetup;
    }

    private static void llIlIIlllIlIll() {
        lIlIIIIIllll = new String[lIlIIIIlIIII[1]];
        lIlIIIIIllll[lIlIIIIlIIII[0]] = llIlIIlllIIIlI("DrH9jPhCkGs=", "YjmTE");
        lIlIIIIIllll[lIlIIIIlIIII[2]] = llIlIIlllIlIIl("", "FDYpY");
        lIlIIIIIllll[lIlIIIIlIIII[3]] = llIlIIlllIlIIl("OjoYYzoROgljKxd1GSsvQyYFLCsPdQIlagU8HitqFzpNMCkCJwhjIxc=", "cUmCJ");
        lIlIIIIIllll[lIlIIIIlIIII[4]] = llIlIIlllIlIIl("MDEyWjQNKj9aPgs2PFozEHkuFSdEKiMIMwo+MhYrRDg5Hg==", "dYWzR");
        lIlIIIIIllll[lIlIIIIlIIII[5]] = llIlIIlllIlIIl("", "RuNvp");
        lIlIIIIIllll[lIlIIIIlIIII[6]] = llIlIIlllIlIIl("MyEfCCcpJw==", "GSvlB");
        lIlIIIIIllll[lIlIIIIlIIII[7]] = llIlIIlllIlIlI("AdmrxkGT3cc=", "mtJjU");
        lIlIIIIIllll[lIlIIIIlIIII[8]] = llIlIIlllIlIlI("/nuJNZliTAI=", "yPqdX");
        lIlIIIIIllll[lIlIIIIlIIII[9]] = llIlIIlllIlIIl("ATkTKCAGNg==", "iXaXO");
    }

    public void b(boolean z) {
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (!llIlIIlllIllll(message.contains(lIlIIIIIllll[lIlIIIIlIIII[3]]) ? 1 : 0) || llIlIIlllIlllI(message.contains(lIlIIIIIllll[lIlIIIIlIIII[4]]) ? 1 : 0)) {
            this.c = lIlIIIIlIIII[2];
        }
    }

    public InventorySetup g() {
        return this.i;
    }

    private static boolean llIlIIllllIIIl(int i, int i2) {
        return i >= i2;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIIIIlIIII[1]];
        clsArr[lIlIIIIlIIII[0]] = f.class;
        clsArr[lIlIIIIlIIII[2]] = g.class;
        clsArr[lIlIIIIlIIII[3]] = j.class;
        clsArr[lIlIIIIlIIII[4]] = c.class;
        clsArr[lIlIIIIlIIII[5]] = e.class;
        clsArr[lIlIIIIlIIII[6]] = k.class;
        clsArr[lIlIIIIlIIII[7]] = h.class;
        clsArr[lIlIIIIlIIII[8]] = i.class;
        clsArr[lIlIIIIlIIII[9]] = d.class;
        return clsArr;
    }

    private static void llIlIIlllIllIl() {
        lIlIIIIlIIII = new int[13];
        lIlIIIIlIIII[0] = (233 ^ 197) & ((130 ^ 174) ^ (-1));
        lIlIIIIlIIII[1] = (63 ^ 66) ^ (93 ^ 41);
        lIlIIIIlIIII[2] = " ".length();
        lIlIIIIlIIII[3] = "  ".length();
        lIlIIIIlIIII[4] = "   ".length();
        lIlIIIIlIIII[5] = 56 ^ 60;
        lIlIIIIlIIII[6] = 4 ^ 1;
        lIlIIIIlIIII[7] = 141 ^ 139;
        lIlIIIIlIIII[8] = 60 ^ 59;
        lIlIIIIlIIII[9] = (((122 + 97) - 147) + 102) ^ (((67 + 81) - 72) + 90);
        lIlIIIIlIIII[10] = (-2185) & 23739;
        lIlIIIIlIIII[11] = (-2723) & 15347;
        lIlIIIIlIIII[12] = (-((-15441) & 31993)) & (-513) & 29691;
    }

    public boolean c() {
        return this.a;
    }

    @Provides
    SquireDriftNetConfig a(ConfigManager configManager) {
        return (SquireDriftNetConfig) configManager.getConfig(SquireDriftNetConfig.class);
    }

    public void b() {
        if (llIlIIlllIllll(this.b.isEmpty() ? 1 : 0)) {
            if (llIlIIlllIlllI(this.g.stamina())) {
                g().add(item -> {
                    if (llIlIIllllIIIl(item.getId(), lIlIIIIlIIII[11]) && llIlIIllllIIlI(item.getId(), lIlIIIIlIIII[12])) {
                        ?? r0 = lIlIIIIlIIII[2];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIIIlIIII[0];
                }, this.g.stamina());
                "".length();
            }
            g().add(this.b, lIlIIIIlIIII[2]);
            "".length();
            g().add(lIlIIIIlIIII[10]);
            "".length();
        }
    }

    private static String llIlIIlllIlIIl(String lllllllllllllllIlllIIllllIIllIlI, String lllllllllllllllIlllIIllllIIllIIl) {
        String lllllllllllllllIlllIIllllIIllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlllIIllllIIlIlll = lllllllllllllllIlllIIllllIIllIIl.toCharArray();
        int lllllllllllllllIlllIIllllIIlIllI = lIlIIIIlIIII[0];
        char[] charArray = lllllllllllllllIlllIIllllIIllIlI2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIlIIII[0];
        while (llIlIIllllIlII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlllIIllllIIlIlll[lllllllllllllllIlllIIllllIIlIllI % lllllllllllllllIlllIIllllIIlIlll.length]));
            "".length();
            lllllllllllllllIlllIIllllIIlIllI++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public SquireDriftNetConfig f() {
        return this.g;
    }

    private static boolean llIlIIllllIIlI(int i, int i2) {
        return i <= i2;
    }

    public String a() {
        Item first = Equipment.getFirst(item -> {
            if (!llIlIIlllIllll(item.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[8]]) ? 1 : 0) || llIlIIlllIlllI(item.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[9]]) ? 1 : 0)) {
                ?? r0 = lIlIIIIlIIII[2];
                "".length();
                return (((1 ^ 28) ^ (88 ^ 81)) & (((((103 + 28) - 25) + 75) ^ (((86 + 115) - 184) + 144)) ^ (-" ".length()))) != 0 ? ((9 ^ 3) ^ (17 ^ 2)) & (((17 ^ 27) ^ (61 ^ 46)) ^ (-" ".length())) : r0;
            }
            return lIlIIIIlIIII[0];
        });
        if (llIlIIllllIIII(first)) {
            return first.getName();
        }
        Item first2 = Inventory.getFirst(item2 -> {
            if (!llIlIIlllIllll(item2.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[6]]) ? 1 : 0) || llIlIIlllIlllI(item2.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[7]]) ? 1 : 0)) {
                ?? r0 = lIlIIIIlIIII[2];
                "".length();
                return "   ".length() <= 0 ? ((90 ^ 120) ^ (232 ^ 159)) & (((((125 + 52) - 117) + 90) ^ (((35 + 104) - 113) + 169)) ^ (-" ".length())) : r0;
            }
            return lIlIIIIlIIII[0];
        });
        return llIlIIllllIIII(first2) ? first2.getName() : lIlIIIIIllll[lIlIIIIlIIII[5]];
    }

    private static String llIlIIlllIIIlI(String lllllllllllllllIlllIIllllIIIIlIl, String lllllllllllllllIlllIIllllIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllllIIIIlII.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIlIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIllllIIIIllI) {
            lllllllllllllllIlllIIllllIIIIllI.printStackTrace();
            return null;
        }
    }

    public boolean e() {
        return this.c;
    }

    private static boolean llIlIIllllIlII(int i, int i2) {
        return i < i2;
    }

    public String d() {
        return this.b;
    }
}
