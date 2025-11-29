package gg.squire.quest;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.quest.overlay.QuesterInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.MenuActionProcessed;
import net.unethicalite.api.items.Equipment;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.B;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.C;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.D;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.n;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.o;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.p;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.q;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.r;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.s;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.t;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.v;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.w;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.x;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.y;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.z;
@PluginDescriptor(name = "Squire Quester", enabledByDefault = false)
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:gg/squire/quest/SquireQuester.class */
public class SquireQuester extends SquirePlugin {
    @Inject
    private /* synthetic */ ConfigManager d;
    @Inject
    private /* synthetic */ OverlayManager a;
    private /* synthetic */ String f;
    private static /* synthetic */ String[] lIIIllIIIIlIl;
    private static /* synthetic */ int[] lIIIllIIIIllI;
    @Inject
    private /* synthetic */ QuesterInfoBox b;
    @Inject
    private /* synthetic */ EventBus c;
    private /* synthetic */ boolean e;

    private static void lIlIIIIllIIIlll() {
        lIIIllIIIIllI = new int[17];
        lIIIllIIIIllI[0] = 92 ^ 76;
        lIIIllIIIIllI[1] = (93 ^ 11) & ((208 ^ 134) ^ (-1));
        lIIIllIIIIllI[2] = " ".length();
        lIIIllIIIIllI[3] = "  ".length();
        lIIIllIIIIllI[4] = "   ".length();
        lIIIllIIIIllI[5] = 99 ^ 103;
        lIIIllIIIIllI[6] = 78 ^ 75;
        lIIIllIIIIllI[7] = (((128 + 104) - 64) + 9) ^ (((22 + 182) - 159) + 138);
        lIIIllIIIIllI[8] = (202 ^ 171) ^ (165 ^ 195);
        lIIIllIIIIllI[9] = (((75 + 3) - 4) + 61) ^ (((136 + 61) - 106) + 52);
        lIIIllIIIIllI[10] = (41 ^ 109) ^ (141 ^ 192);
        lIIIllIIIIllI[11] = 6 ^ 12;
        lIIIllIIIIllI[12] = 163 ^ 168;
        lIIIllIIIIllI[13] = 160 ^ 172;
        lIIIllIIIIllI[14] = 61 ^ 48;
        lIIIllIIIIllI[15] = 93 ^ 83;
        lIIIllIIIIllI[16] = 137 ^ 134;
    }

    private static boolean lIlIIIIllIIlIII(int i) {
        return i == 0;
    }

    private static boolean lIlIIIIllIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIIIllIIIIll(String lllllllllllllllIIIIlIllIllIlIlll, String lllllllllllllllIIIIlIllIllIlIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIllIllIlIlIl = new StringBuilder();
        char[] lllllllllllllllIIIIlIllIllIlIlII = lllllllllllllllIIIIlIllIllIlIllI.toCharArray();
        int lllllllllllllllIIIIlIllIllIlIIll = lIIIllIIIIllI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIllIIIIllI[1];
        while (lIlIIIIllIIlIlI(i, length)) {
            char lllllllllllllllIIIIlIllIllIllIII = charArray[i];
            lllllllllllllllIIIIlIllIllIlIlIl.append((char) (lllllllllllllllIIIIlIllIllIllIII ^ lllllllllllllllIIIIlIllIllIlIlII[lllllllllllllllIIIIlIllIllIlIIll % lllllllllllllllIIIIlIllIllIlIlII.length]));
            "".length();
            lllllllllllllllIIIIlIllIllIlIIll++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlIllIllIlIlIl);
    }

    protected void onStop() {
        this.a.remove(this.b);
        "".length();
    }

    protected void onStart() {
        this.a.add(this.b);
        "".length();
        a((String) null);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if (lIlIIIIllIIlIII(configButtonClicked.getGroup().equals(lIIIllIIIIlIl[lIIIllIIIIllI[1]]) ? 1 : 0)) {
            return;
        }
        this.d.setConfiguration(configButtonClicked.getGroup(), configButtonClicked.getKey().replace(lIIIllIIIIlIl[lIIIllIIIIllI[2]], lIIIllIIIIlIl[lIIIllIIIIllI[3]]), (String) Equipment.getAll().stream().map(item -> {
            return item.getId() + ",";
        }).collect(Collectors.joining()));
    }

    private static void lIlIIIIllIIIllI() {
        lIIIllIIIIlIl = new String[lIIIllIIIIllI[5]];
        lIIIllIIIIlIl[lIIIllIIIIllI[1]] = lIlIIIIllIIIIll("MCQjLBcmJCMgFjcwJA==", "CUVEe");
        lIIIllIIIIlIl[lIIIllIIIIllI[2]] = lIlIIIIllIIIlII("SCHuuzuHe5Y=", "hUSEq");
        lIIIllIIIIlIl[lIIIllIIIIllI[3]] = lIlIIIIllIIIlIl("jsjexspTX4w=", "oZKkW");
        lIIIllIIIIlIl[lIIIllIIIIllI[4]] = lIlIIIIllIIIIll("MiIgPA91Iy08BTAjYTEOIj5hIQkwcCI9FCE1bw==", "UPAUa");
    }

    private static boolean lIlIIIIllIIlIIl(int i) {
        return i != 0;
    }

    public void a(boolean z) {
        this.e = z;
    }

    private static String lIlIIIIllIIIlII(String lllllllllllllllIIIIlIllIllIIIIlI, String lllllllllllllllIIIIlIllIllIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIIllIIIIllI[9]), "DES");
            Cipher lllllllllllllllIIIIlIllIllIIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIllIllIIIlII.init(lIIIllIIIIllI[3], secretKeySpec);
            return new String(lllllllllllllllIIIIlIllIllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIllIllIIIIll) {
            lllllllllllllllIIIIlIllIllIIIIll.printStackTrace();
            return null;
        }
    }

    public boolean a() {
        return this.e;
    }

    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        System.out.println(menuActionProcessed);
    }

    @Provides
    SquireQuesterConfig a(ConfigManager configManager) {
        return (SquireQuesterConfig) configManager.getConfig(SquireQuesterConfig.class);
    }

    private static String lIlIIIIllIIIlIl(String lllllllllllllllIIIIlIllIlllIIlll, String lllllllllllllllIIIIlIllIlllIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIllIlllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllIlllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIllIlllIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIllIlllIlIIl.init(lIIIllIIIIllI[3], lllllllllllllllIIIIlIllIlllIlIlI);
            return new String(lllllllllllllllIIIIlIllIlllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllIlllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIllIlllIlIII) {
            lllllllllllllllIIIIlIllIlllIlIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIIIIllIIlIIl(chatMessage.getMessage().contains(lIIIllIIIIlIl[lIIIllIIIIllI[4]]) ? 1 : 0)) {
            this.e = lIIIllIIIIllI[2];
        }
    }

    static {
        lIlIIIIllIIIlll();
        lIlIIIIllIIIllI();
    }

    public void a(String str) {
        this.f = str;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIIllIIIIllI[0]];
        clsArr[lIIIllIIIIllI[1]] = B.class;
        clsArr[lIIIllIIIIllI[2]] = p.class;
        clsArr[lIIIllIIIIllI[3]] = x.class;
        clsArr[lIIIllIIIIllI[4]] = z.class;
        clsArr[lIIIllIIIIllI[5]] = n.class;
        clsArr[lIIIllIIIIllI[6]] = A.class;
        clsArr[lIIIllIIIIllI[7]] = s.class;
        clsArr[lIIIllIIIIllI[8]] = w.class;
        clsArr[lIIIllIIIIllI[9]] = D.class;
        clsArr[lIIIllIIIIllI[10]] = v.class;
        clsArr[lIIIllIIIIllI[11]] = y.class;
        clsArr[lIIIllIIIIllI[12]] = r.class;
        clsArr[lIIIllIIIIllI[13]] = C.class;
        clsArr[lIIIllIIIIllI[14]] = o.class;
        clsArr[lIIIllIIIIllI[15]] = q.class;
        clsArr[lIIIllIIIIllI[16]] = t.class;
        return clsArr;
    }

    public String b() {
        return this.f;
    }
}
