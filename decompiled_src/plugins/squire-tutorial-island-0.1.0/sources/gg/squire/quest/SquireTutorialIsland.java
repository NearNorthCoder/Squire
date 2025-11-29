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
import s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.I;
import s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.J;
@PluginDescriptor(name = "Squire Tutorial Island", enabledByDefault = false)
/* loaded from: squire-tutorial-island-0.1.0.jar:gg/squire/quest/SquireTutorialIsland.class */
public class SquireTutorialIsland extends SquirePlugin {
    private static /* synthetic */ int[] lIlIIIlIlIlll;
    private /* synthetic */ boolean e;
    @Inject
    private /* synthetic */ ConfigManager d;
    private /* synthetic */ String f;
    @Inject
    private /* synthetic */ OverlayManager a;
    @Inject
    private /* synthetic */ EventBus c;
    private /* synthetic */ String g;
    private static /* synthetic */ String[] lIlIIIlIlIllI;
    @Inject
    private /* synthetic */ QuesterInfoBox b;

    public String c() {
        return this.g;
    }

    private static boolean lIlllIIIIIIlIlI(int i) {
        return i != 0;
    }

    public void b(String str) {
        this.g = str;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIIIlIlIlll[0]];
        clsArr[lIlIIIlIlIlll[1]] = J.class;
        clsArr[lIlIIIlIlIlll[2]] = I.class;
        return clsArr;
    }

    @Provides
    SquireQuesterConfig a(ConfigManager configManager) {
        return (SquireQuesterConfig) configManager.getConfig(SquireQuesterConfig.class);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if (lIlllIIIIIIlIIl(configButtonClicked.getGroup().equals(lIlIIIlIlIllI[lIlIIIlIlIlll[1]]) ? 1 : 0)) {
            return;
        }
        this.d.setConfiguration(configButtonClicked.getGroup(), configButtonClicked.getKey().replace(lIlIIIlIlIllI[lIlIIIlIlIlll[2]], lIlIIIlIlIllI[lIlIIIlIlIlll[0]]), (String) Equipment.getAll().stream().map(item -> {
            return item.getId() + ",";
        }).collect(Collectors.joining()));
    }

    protected void onStop() {
        this.a.remove(this.b);
        "".length();
    }

    private static void lIlllIIIIIIlIII() {
        lIlIIIlIlIlll = new int[6];
        lIlIIIlIlIlll[0] = "  ".length();
        lIlIIIlIlIlll[1] = ((((93 + 85) - 58) + 131) ^ (((39 + 125) - 27) + 55)) & (((((54 + 126) - 82) + 37) ^ (((8 + 78) - (-60)) + 42)) ^ (-" ".length()));
        lIlIIIlIlIlll[2] = " ".length();
        lIlIIIlIlIlll[3] = "   ".length();
        lIlIIIlIlIlll[4] = 134 ^ 130;
        lIlIIIlIlIlll[5] = 45 ^ 37;
    }

    protected void onStart() {
        this.g = null;
        this.a.add(this.b);
        "".length();
        a((String) null);
    }

    public boolean a() {
        return this.e;
    }

    private static String lIlllIIIIIIIlIl(String llllllllllllllIlllIIIlIlIIlllIIl, String llllllllllllllIlllIIIlIlIIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIlIIlllIII.getBytes(StandardCharsets.UTF_8)), lIlIIIlIlIlll[5]), "DES");
            Cipher llllllllllllllIlllIIIlIlIIlllIll = Cipher.getInstance("DES");
            llllllllllllllIlllIIIlIlIIlllIll.init(lIlIIIlIlIlll[0], secretKeySpec);
            return new String(llllllllllllllIlllIIIlIlIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIlIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIlIIlllIlI) {
            llllllllllllllIlllIIIlIlIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIIIlIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlllIIIIIIlIlI(chatMessage.getMessage().contains(lIlIIIlIlIllI[lIlIIIlIlIlll[3]]) ? 1 : 0)) {
            this.e = lIlIIIlIlIlll[2];
        }
    }

    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        System.out.println(menuActionProcessed);
    }

    private static String lIlllIIIIIIIllI(String llllllllllllllIlllIIIlIlIlIIIllI, String llllllllllllllIlllIIIlIlIlIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIlIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIlIlIIlIII.init(lIlIIIlIlIlll[0], secretKeySpec);
            return new String(llllllllllllllIlllIIIlIlIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIlIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIlIlIIIlll) {
            llllllllllllllIlllIIIlIlIlIIIlll.printStackTrace();
            return null;
        }
    }

    static {
        lIlllIIIIIIlIII();
        lIlllIIIIIIIlll();
    }

    public void a(boolean z) {
        this.e = z;
    }

    public String b() {
        return this.f;
    }

    private static void lIlllIIIIIIIlll() {
        lIlIIIlIlIllI = new String[lIlIIIlIlIlll[4]];
        lIlIIIlIlIllI[lIlIIIlIlIlll[1]] = lIlllIIIIIIIlIl("kS/lJjcqz+t4OWC93pPr2w==", "fJebE");
        lIlIIIlIlIllI[lIlIIIlIlIlll[2]] = lIlllIIIIIIIllI("8tlmHWuFToM=", "HkDPZ");
        lIlIIIlIlIllI[lIlIIIlIlIlll[0]] = lIlllIIIIIIIllI("hCFvp1Dqnms=", "rTKMK");
        lIlIIIlIlIllI[lIlIIIlIlIlll[3]] = lIlllIIIIIIIlIl("87/Ijsg1f1n8xT1IF24jlJjsWAGdHGC65UDcT30c7mk=", "maeEW");
    }

    public void a(String str) {
        this.f = str;
    }
}
