package gg.squire.minigames;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.minigames.overlay.FightCavesInfoBox;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.b;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.c;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.e;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.f;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.h;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.i;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.j;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.k;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.n;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.o;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.p;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.q;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.r;
import h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f.s;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@PluginDescriptor(name = "Squire Fight Caves", description = "Automates the entire Fight Caves minigame", enabledByDefault = false)
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:gg/squire/minigames/SquireFightCavesPlugin.class */
public class SquireFightCavesPlugin extends SquirePlugin {
    public static /* synthetic */ boolean g;
    public static /* synthetic */ int i;
    @Inject
    private /* synthetic */ FightCavesInfoBox c;
    @Inject
    private /* synthetic */ OverlayManager b;

    /* renamed from: h  reason: collision with root package name */
    public static /* synthetic */ String f0h;
    private static /* synthetic */ String[] llIIIlllIlIl;
    @Inject
    private /* synthetic */ f e;
    public static /* synthetic */ int j;
    public static /* synthetic */ boolean f;
    private static /* synthetic */ int[] llIIIlllIllI;
    @Inject
    private /* synthetic */ SquireFightCavesConfig d;
    private static final /* synthetic */ Logger a;
    public static /* synthetic */ long k;
    private final /* synthetic */ int l = llIIIlllIllI[0];
    private final /* synthetic */ int m = llIIIlllIllI[1];
    private final /* synthetic */ int n = llIIIlllIllI[2];
    private final /* synthetic */ int o = llIIIlllIllI[3];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llllIlllIIIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && llllIlllIIIllI(chatMessage.getMessage().contains(llIIIlllIlIl[llIIIlllIllI[4]]) ? 1 : 0)) {
            f fVar = this.e;
            "".length();
            f.a((boolean) llIIIlllIllI[6]);
            f fVar2 = this.e;
            "".length();
            f.b((boolean) llIIIlllIllI[6]);
            f.i(llIIIlllIllI[4]);
            f.f(llIIIlllIllI[4]);
            f.g(llIIIlllIllI[4]);
            f.d(llIIIlllIllI[4]);
            int parseInt = Integer.parseInt(Text.removeTags(chatMessage.getMessage()).split(llIIIlllIlIl[llIIIlllIllI[6]])[llIIIlllIllI[6]].replaceAll(llIIIlllIlIl[llIIIlllIllI[7]], llIIIlllIlIl[llIIIlllIllI[8]]));
            if (llllIlllIIIlll(parseInt)) {
                e.g().filter(eVar -> {
                    if (llllIlllIIIlIl(eVar.i(), parseInt)) {
                        ?? r0 = llIIIlllIllI[6];
                        "".length();
                        return (-" ".length()) >= 0 ? ((((18 + 95) - 59) + 91) ^ (((74 + 23) - (-23)) + 46)) & (((((19 + 69) - (-88)) + 0) ^ (((6 + 0) - (-117)) + 12)) ^ (-" ".length())) : r0;
                    }
                    return llIIIlllIllI[4];
                }).forEach(this::a);
                e.g().filter(eVar2 -> {
                    if (llllIlllIIIlIl(eVar2.i(), parseInt)) {
                        ?? r0 = llIIIlllIllI[6];
                        "".length();
                        return (-" ".length()) != (-" ".length()) ? ((147 ^ 185) ^ (166 ^ 139)) & (((95 ^ 120) ^ (8 ^ 40)) ^ (-" ".length())) : r0;
                    }
                    return llIIIlllIllI[4];
                }).forEach(this::b);
                Logger logger = a;
                f fVar3 = this.e;
                "".length();
                logger.info("setting current wave to: " + f.p());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        if (!llllIlllIIIlII(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_REMOVED) && llllIlllIIIlII(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED) && llllIlllIIIlIl(inventoryChanged.getItemId(), llIIIlllIllI[14])) {
            i += llIIIlllIllI[6];
            g = llIIIlllIllI[6];
        }
    }

    private void b(e eVar) {
        f fVar = this.e;
        "".length();
        f.b(eVar.i());
    }

    private static String llllIlllIIIIII(String lllllllllllllllIlIlIIIlIIIlIlIll, String lllllllllllllllIlIlIIIlIIIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIlIIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), llIIIlllIllI[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlllIllI[7], lllllllllllllllIlIlIIIlIIIlIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIlIIIlIllII) {
            lllllllllllllllIlIlIIIlIIIlIllII.printStackTrace();
            return null;
        }
    }

    @Provides
    SquireFightCavesConfig a(ConfigManager configManager) {
        return (SquireFightCavesConfig) configManager.getConfig(SquireFightCavesConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        f fVar = this.e;
        "".length();
        if (llllIlllIIlIII(f.n() ? 1 : 0)) {
            if (llllIlllIIIllI(animationChanged.getActor().equals(n.b(b.BLOB)) ? 1 : 0) && llllIlllIIIlIl(animationChanged.getActor().getAnimation(), llIIIlllIllI[1])) {
                f fVar2 = this.e;
                "".length();
                f.b((boolean) llIIIlllIllI[4]);
                f fVar3 = this.e;
                "".length();
                f.i(Static.getClient().getTickCount());
                Logger logger = a;
                f fVar4 = this.e;
                "".length();
                logger.info("Setting blob attack: " + f.w());
            }
            if (llllIlllIIIllI(animationChanged.getActor().equals(n.b(b.RANGER)) ? 1 : 0) && llllIlllIIIlIl(animationChanged.getActor().getAnimation(), llIIIlllIllI[0])) {
                f fVar5 = this.e;
                "".length();
                f.b((boolean) llIIIlllIllI[4]);
                f fVar6 = this.e;
                "".length();
                f.g(Static.getClient().getTickCount());
                Logger logger2 = a;
                f fVar7 = this.e;
                "".length();
                logger2.info(f.u());
            }
            if (llllIlllIIIllI(animationChanged.getActor().equals(n.b(b.MAGER)) ? 1 : 0) && llllIlllIIIlIl(animationChanged.getActor().getAnimation(), llIIIlllIllI[2])) {
                f fVar8 = this.e;
                "".length();
                f.b((boolean) llIIIlllIllI[4]);
                f fVar9 = this.e;
                "".length();
                f.f(Static.getClient().getTickCount());
            }
            if (llllIlllIIIllI(animationChanged.getActor().equals(n.b(b.MELEER)) ? 1 : 0) && llllIlllIIIlIl(animationChanged.getActor().getAnimation(), llIIIlllIllI[3])) {
                f fVar10 = this.e;
                "".length();
                f.b((boolean) llIIIlllIllI[4]);
                f fVar11 = this.e;
                "".length();
                f.d(Static.getClient().getTickCount());
                a.info("client tick count = " + Static.getClient().getTickCount());
            }
        }
        if (llllIlllIIlIIl(NPCs.getNearest(c.v)) && llllIlllIIIllI(animationChanged.getActor().equals(n.b(b.JAD)) ? 1 : 0)) {
            if (llllIlllIIIlIl(animationChanged.getActor().getAnimation(), llIIIlllIllI[15])) {
                f fVar12 = this.e;
                "".length();
                f.c(Static.getClient().getTickCount());
            }
            if (llllIlllIIIlIl(animationChanged.getActor().getAnimation(), llIIIlllIllI[16])) {
                f fVar13 = this.e;
                "".length();
                f.c(Static.getClient().getTickCount());
            }
        }
    }

    private static void llllIlllIIIIlI() {
        llIIIlllIlIl = new String[llIIIlllIllI[10]];
        llIIIlllIlIl[llIIIlllIllI[4]] = llllIlllIIIIII("nBDooZ/T4HWwNT97VCffWXuCuv9KSfrN", "UtFXt");
        llIIIlllIlIl[llIIIlllIllI[6]] = llllIlllIIIIII("jafSHxToOP0=", "JKCNv");
        llIIIlllIlIl[llIIIlllIllI[7]] = llllIlllIIIIIl("aAyt71AusMs=", "tJwjq");
        llIIIlllIlIl[llIIIlllIllI[8]] = llllIlllIIIIIl("yevMBovc7QA=", "VaNGI");
        llIIIlllIlIl[llIIIlllIllI[9]] = llllIlllIIIIII("52PsK5kCWww=", "vJusT");
    }

    protected void onStop() {
        this.b.remove(this.c);
        "".length();
    }

    private static boolean llllIlllIIIlIl(int i2, int i3) {
        return i2 == i3;
    }

    private static void llllIlllIIIIll() {
        llIIIlllIllI = new int[17];
        llIIIlllIllI[0] = (-((-3905) & 28615)) & (-1313) & 28655;
        llIIIlllIllI[1] = (-((-4609) & 14001)) & (-16651) & 28667;
        llIIIlllIllI[2] = (-((-18963) & 23315)) & (-25609) & 32607;
        llIIIlllIllI[3] = (-5425) & 8061;
        llIIIlllIllI[4] = (0 ^ 50) & ((140 ^ 190) ^ (-1));
        llIIIlllIllI[5] = (((111 + 93) - 96) + 19) ^ (107 ^ 29);
        llIIIlllIllI[6] = " ".length();
        llIIIlllIllI[7] = "  ".length();
        llIIIlllIllI[8] = "   ".length();
        llIIIlllIllI[9] = 127 ^ 123;
        llIIIlllIllI[10] = (190 ^ 151) ^ (66 ^ 110);
        llIIIlllIllI[11] = (((97 + 106) - 154) + 143) ^ (((133 + 109) - 52) + 8);
        llIIIlllIllI[12] = 64 ^ 71;
        llIIIlllIllI[13] = 160 ^ 168;
        llIIIlllIllI[14] = (-((-16274) & 32727)) & (-8193) & 31215;
        llIIIlllIllI[15] = (-((-10365) & 32125)) & (-8322) & 32733;
        llIIIlllIllI[16] = (-((-797) & 8991)) & (-406) & 11255;
    }

    private void a(e eVar) {
        f fVar = this.e;
        "".length();
        f.a(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    protected void onStart() {
        this.b.add(this.c);
        "".length();
        f.a(e.WAVE3);
        k = System.currentTimeMillis();
        i = llIIIlllIllI[4];
        j = llIIIlllIllI[4];
        f = llIIIlllIllI[4];
        g = llIIIlllIllI[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    static {
        llllIlllIIIIll();
        llllIlllIIIIlI();
        a = LoggerFactory.getLogger(SquireFightCavesPlugin.class);
        f = llIIIlllIllI[4];
        f0h = llIIIlllIlIl[llIIIlllIllI[9]];
        k = System.currentTimeMillis();
    }

    private static boolean llllIlllIIIlll(int i2) {
        return i2 > 0;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIIIlllIllI[5]];
        clsArr[llIIIlllIllI[4]] = q.class;
        clsArr[llIIIlllIllI[6]] = s.class;
        clsArr[llIIIlllIllI[7]] = p.class;
        clsArr[llIIIlllIllI[8]] = r.class;
        clsArr[llIIIlllIllI[9]] = o.class;
        clsArr[llIIIlllIllI[10]] = j.class;
        clsArr[llIIIlllIllI[11]] = h.class;
        clsArr[llIIIlllIllI[12]] = i.class;
        clsArr[llIIIlllIllI[13]] = k.class;
        return clsArr;
    }

    private static boolean llllIlllIIIllI(int i2) {
        return i2 != 0;
    }

    private static boolean llllIlllIIlIII(int i2) {
        return i2 == 0;
    }

    public SquireFightCavesConfig a() {
        return this.d;
    }

    private static boolean llllIlllIIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIlllIIlIIl(Object obj) {
        return obj != null;
    }

    private static String llllIlllIIIIIl(String lllllllllllllllIlIlIIIlIIIlllIII, String lllllllllllllllIlIlIIIlIIIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIlIIIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIlIIIlllIlI.init(llIIIlllIllI[7], secretKeySpec);
            return new String(lllllllllllllllIlIlIIIlIIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIlIIIlllIIl) {
            lllllllllllllllIlIlIIIlIIIlllIIl.printStackTrace();
            return null;
        }
    }
}
