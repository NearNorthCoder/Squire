package gg.squire.minigames;

import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.C0014o;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.C0015p;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.D;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.E;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.G;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.I;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.K;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.L;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.M;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.N;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.O;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.P;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.Q;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.R;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.S;
import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.U;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.minigames.overlays.InstructionOverlay;
import gg.squire.minigames.overlays.StatisticsOverlay;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.OverlayMenuClicked;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;
@PluginDescriptor(name = "Squire Blast Furnace", description = "Automatically does blast furnace", enabledByDefault = false)
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:gg/squire/minigames/SquireBlastFurnace.class */
public class SquireBlastFurnace extends SquirePlugin {
    private static /* synthetic */ int[] lIIllIIlIIlI;
    @Inject
    private /* synthetic */ E k;
    @Inject
    private /* synthetic */ P p;
    @Inject
    private /* synthetic */ Client g;
    @Inject
    private /* synthetic */ D t;
    @Inject
    private /* synthetic */ O r;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    private static final /* synthetic */ Pattern f;
    @Inject
    private /* synthetic */ N q;
    public static final /* synthetic */ int c;
    @Inject
    private /* synthetic */ StatisticsOverlay m;
    @Inject
    private /* synthetic */ OverlayManager h;
    @Inject
    private /* synthetic */ L s;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f0a;
    @Inject
    private /* synthetic */ InstructionOverlay l;
    public static final /* synthetic */ WorldPoint d;
    private static final /* synthetic */ Pattern e;
    public static final /* synthetic */ int b;
    @Inject
    private /* synthetic */ G u;
    private static /* synthetic */ String[] lIIllIIlIIIl;
    @Inject
    private /* synthetic */ K o;
    @Inject
    private /* synthetic */ C0014o j;
    @Inject
    private /* synthetic */ M n;

    static {
        llIIlllIIllIIl();
        llIIlllIIllIII();
        c = lIIllIIlIIlI[7];
        b = lIIllIIlIIlI[8];
        f0a = lIIllIIlIIlI[9];
        d = new WorldPoint(lIIllIIlIIlI[10], lIIllIIlIIlI[11], lIIllIIlIIlI[0]);
        e = Pattern.compile(I.by);
        f = Pattern.compile(I.bz);
    }

    private static String llIIlllIIlIlll(String lllllllllllllllIlllIllllIlIlIIIl, String lllllllllllllllIlllIllllIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIllllIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIllllIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIllllIlIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIllllIlIlIIll.init(lIIllIIlIIlI[3], lllllllllllllllIlllIllllIlIlIlII);
            return new String(lllllllllllllllIlllIllllIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIllllIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIllllIlIIllIl) {
            lllllllllllllllIlllIllllIlIIllIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(OverlayMenuClicked overlayMenuClicked) {
        if (llIIlllIIlllll(overlayMenuClicked.getOverlay(), this.l) && llIIlllIIlllIl(overlayMenuClicked.getEntry().getOption().equals(lIIllIIlIIIl[lIIllIIlIIlI[3]]) ? 1 : 0)) {
            this.t.T();
        }
        if (llIIlllIIlllll(overlayMenuClicked.getOverlay(), this.m) && llIIlllIIlllIl(overlayMenuClicked.getEntry().getOption().equals(lIIllIIlIIIl[lIIllIIlIIlI[4]]) ? 1 : 0)) {
            this.u.T();
        }
    }

    private static boolean llIIlllIIllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String llIIlllIIlIllI(String lllllllllllllllIlllIllllIIlIllII, String lllllllllllllllIlllIllllIIlIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIllllIIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIllllIIlIlIll.getBytes(StandardCharsets.UTF_8)), lIIllIIlIIlI[12]), "DES");
            Cipher lllllllllllllllIlllIllllIIlIlllI = Cipher.getInstance("DES");
            lllllllllllllllIlllIllllIIlIlllI.init(lIIllIIlIIlI[3], lllllllllllllllIlllIllllIIlIllll);
            return new String(lllllllllllllllIlllIllllIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIllllIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIllllIIlIllIl) {
            lllllllllllllllIlllIllllIIlIllIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        if (llIIlllIIlllIl(menuOptionClicked.getMenuOption().equals(I.bA) ? 1 : 0)) {
            this.j.k().u();
        }
        if (llIIlllIIlllIl(menuOptionClicked.getMenuOption().equals(I.bB) ? 1 : 0)) {
            this.j.k().t();
        }
        if (llIIlllIIlllIl(menuOptionClicked.getMenuOption().equals(I.bC) ? 1 : 0)) {
            this.u.Z();
        }
        this.t.S();
        "".length();
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (llIIlllIIllIll(this.g.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        a().i();
    }

    private static boolean llIIlllIIlllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        switch (gameObject.getId()) {
            case 9092:
            case 9100:
                this.k.a(gameObject);
                return;
            case 26707:
                this.k.a(gameObject);
                "".length();
                if ((-(143 ^ 139)) >= 0) {
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        if (llIIlllIIlllII(itemContainerChanged.getContainerId(), InventoryID.INVENTORY.getId())) {
            this.t.V();
            this.j.i();
        }
        this.t.S();
        "".length();
    }

    public C0014o a() {
        return this.j;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if (llIIlllIIllIlI(configChanged.getGroup().equals(lIIllIIlIIIl[lIIllIIlIIlI[0]]) ? 1 : 0)) {
            return;
        }
        this.t.T();
        a().j();
        this.t.V();
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        switch (gameObjectDespawned.getGameObject().getId()) {
            case 9092:
            case 9100:
                this.t.T();
                this.u.T();
                return;
            default:
                return;
        }
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        this.u.af();
        this.j.i();
        this.t.S();
        "".length();
    }

    private static boolean llIIlllIIlllIl(int i) {
        return i != 0;
    }

    private static void llIIlllIIllIIl() {
        lIIllIIlIIlI = new int[13];
        lIIllIIlIIlI[0] = (18 ^ 21) & ((69 ^ 66) ^ (-1));
        lIIllIIlIIlI[1] = 27 ^ 31;
        lIIllIIlIIlI[2] = " ".length();
        lIIllIIlIIlI[3] = "  ".length();
        lIIllIIlIIlI[4] = "   ".length();
        lIIllIIlIIlI[5] = 32 ^ 59;
        lIIllIIlIIlI[6] = (-((-269) & 20237)) & (-27) & 20447;
        lIIllIIlIIlI[7] = (-((-25197) & 26605)) & (-4129) & 32243;
        lIIllIIlIIlI[8] = (-19492) & 28583;
        lIIllIIlIIlI[9] = (-((-513) & 24179)) & (-1) & 32766;
        lIIllIIlIIlI[10] = (-22633) & 24572;
        lIIllIIlIIlI[11] = (-((-642) & 28303)) & (-129) & 32751;
        lIIllIIlIIlI[12] = (99 ^ 2) ^ (175 ^ 198);
    }

    protected void onStop() {
        this.u.T();
        this.t.T();
        a().j();
        this.h.remove(this.m);
        "".length();
    }

    private static String llIIlllIIlIlIl(String lllllllllllllllIlllIllllIlIIIIIl, String lllllllllllllllIlllIllllIlIIIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIllllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIllllIIllllll = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIllllIlIIIIII.toCharArray();
        int lllllllllllllllIlllIllllIIllllIl = lIIllIIlIIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIlIIlI[0];
        while (llIIlllIlIIIII(i, length)) {
            char lllllllllllllllIlllIllllIlIIIIlI = charArray2[i];
            lllllllllllllllIlllIllllIIllllll.append((char) (lllllllllllllllIlllIllllIlIIIIlI ^ charArray[lllllllllllllllIlllIllllIIllllIl % charArray.length]));
            "".length();
            lllllllllllllllIlllIllllIIllllIl++;
            i++;
            "".length();
            if ((-((((128 + 153) - 213) + 95) ^ (((107 + 0) - 43) + 102))) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIllllIIllllll);
    }

    protected void onStart() {
        this.h.add(this.m);
        "".length();
    }

    private static void llIIlllIIllIII() {
        lIIllIIlIIIl = new String[lIIllIIlIIlI[1]];
        lIIllIIlIIIl[lIIllIIlIIlI[0]] = llIIlllIIlIlIl("JRYyARozBSE=", "VgGhh");
        lIIllIIlIIIl[lIIllIIlIIlI[2]] = llIIlllIIlIlIl("NAMOdQkaGhB1HwcKQjIfEBxCOh4BAEIhGBBPAToeAwobOgJVDQc5BFs=", "uobUp");
        lIIllIIlIIIl[lIIllIIlIIlI[3]] = llIIlllIIlIllI("FViSeIJZzz0=", "Xouyo");
        lIIllIIlIIIl[lIIllIIlIIlI[4]] = llIIlllIIlIlll("wNfoZa3hY44=", "lpeex");
    }

    private static boolean llIIlllIIllIlI(int i) {
        return i == 0;
    }

    private static boolean llIIlllIlIIIII(int i, int i2) {
        return i < i2;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllIIlIIlI[1]];
        clsArr[lIIllIIlIIlI[0]] = Q.class;
        clsArr[lIIllIIlIIlI[2]] = S.class;
        clsArr[lIIllIIlIIlI[3]] = R.class;
        clsArr[lIIllIIlIIlI[4]] = U.class;
        return clsArr;
    }

    public D b() {
        return this.t;
    }

    private static boolean llIIlllIIllllI(int i, int i2) {
        return i > i2;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (llIIlllIIllIll(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            this.t.T();
            this.u.T();
        }
    }

    @Provides
    SquireBlastFurnaceConfig a(ConfigManager configManager) {
        return (SquireBlastFurnaceConfig) configManager.getConfig(SquireBlastFurnaceConfig.class);
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        int i;
        if (llIIlllIIllIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && llIIlllIIllIll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (llIIlllIIlllII(this.j.k().w(), lIIllIIlIIlI[5])) {
            i = lIIllIIlIIlI[3];
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return;
            }
        } else {
            i = lIIllIIlIIlI[4];
        }
        int lllllllllllllllIlllIllllIllIIIll = i;
        Matcher matcher = f.matcher(message);
        Matcher matcher2 = e.matcher(message);
        if (llIIlllIIlllIl(matcher.matches() ? 1 : 0)) {
            this.j.k().t();
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        } else if (llIIlllIIlllIl(matcher2.matches() ? 1 : 0)) {
            this.j.k().u();
        }
        if (llIIlllIIlllIl(message.equals(lIIllIIlIIIl[lIIllIIlIIlI[2]]) ? 1 : 0)) {
            int[] iArr = new int[lIIllIIlIIlI[2]];
            iArr[lIIllIIlIIlI[0]] = lIIllIIlIIlI[6];
            if (llIIlllIIlllIl(Inventory.contains(iArr) ? 1 : 0)) {
                this.j.k().c(new int[lIIllIIlIIlI[0]]);
                "".length();
                if ((-" ".length()) != (-" ".length())) {
                    return;
                }
            } else {
                C0015p k = this.j.k();
                int[] iArr2 = new int[lIIllIIlIIlI[2]];
                iArr2[lIIllIIlIIlI[0]] = lIIllIIlIIlI[2];
                k.c(iArr2);
            }
        }
        if (llIIlllIIlllII(lllllllllllllllIlllIllllIllIIIll, this.j.k().x())) {
            C0015p k2 = this.j.k();
            int[] iArr3 = new int[lIIllIIlIIlI[2]];
            iArr3[lIIllIIlIIlI[0]] = lIIllIIlIIlI[0];
            k2.c(iArr3);
            if (llIIlllIIllllI(this.j.k().v(), lIIllIIlIIlI[2])) {
                this.j.k().b(lIIllIIlIIlI[0]);
            }
        }
        this.t.S();
        "".length();
    }

    private static boolean llIIlllIIlllII(int i, int i2) {
        return i == i2;
    }
}
