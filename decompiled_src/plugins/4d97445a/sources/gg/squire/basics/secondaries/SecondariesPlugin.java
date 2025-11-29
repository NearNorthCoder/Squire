package gg.squire.basics.secondaries;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bM;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bN;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bP;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bQ;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bR;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bS;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bT;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@SquireUtil
@PluginDescriptor(name = "Squire Secondaries", description = "QOL improvements for collecting secondaries", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/secondaries/SecondariesPlugin.class */
public class SecondariesPlugin extends SquirePlugin {
    private /* synthetic */ WorldPoint gI;
    @Inject
    private /* synthetic */ Client v;
    private static final /* synthetic */ String gG;
    @Inject
    private /* synthetic */ OverlayManager bq;
    @Inject
    private /* synthetic */ bQ gH;
    private static /* synthetic */ String[] lllllIIl;
    private /* synthetic */ boolean gJ;
    private static /* synthetic */ int[] lllllIlI;

    static {
        llIllIlIlI();
        llIllIlIIl();
        gG = lllllIIl[lllllIlI[3]];
    }

    protected void onStop() {
        this.bq.remove(this.gH);
        "".length();
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (llIllIlIll(this.v.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        this.gJ = Inventory.isFull();
    }

    private static void llIllIlIlI() {
        lllllIlI = new int[8];
        lllllIlI[0] = 170 ^ 172;
        lllllIlI[1] = ((11 ^ 45) ^ (57 ^ 81)) & (((16 ^ 20) ^ (11 ^ 65)) ^ (-" ".length()));
        lllllIlI[2] = " ".length();
        lllllIlI[3] = "  ".length();
        lllllIlI[4] = "   ".length();
        lllllIlI[5] = 60 ^ 56;
        lllllIlI[6] = 149 ^ 144;
        lllllIlI[7] = -"  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        int i2;
        String str;
        if (llIllIllII(menuEntryAdded.getType(), MenuAction.WALK.getId())) {
            return;
        }
        Tile selectedSceneTile = this.v.getSelectedSceneTile();
        if (llIllIllIl(selectedSceneTile)) {
            return;
        }
        if (llIllIllIl(this.gI)) {
            i2 = lllllIlI[2];
            "".length();
            if (0 != 0) {
                return;
            }
        } else {
            i2 = lllllIlI[1];
        }
        boolean z = i2;
        WorldPoint worldLocation = selectedSceneTile.getWorldLocation();
        if (llIllIlllI(z ? 1 : 0) && llIllIlllI(worldLocation.equals(this.gI) ? 1 : 0)) {
            return;
        }
        MenuEntry createMenuEntry = Static.getClient().createMenuEntry(lllllIlI[7]);
        if (llIllIllll(z ? 1 : 0)) {
            str = lllllIIl[lllllIlI[1]];
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        } else {
            str = lllllIIl[lllllIlI[2]];
        }
        createMenuEntry.setOption("<col=ffcf40>" + str + " as fungus center").setTarget(menuEntryAdded.getTarget()).setType(MenuAction.RUNELITE).onClick(menuEntry -> {
            WorldPoint worldPoint;
            if (llIllIllll(z ? 1 : 0)) {
                worldPoint = worldLocation;
                "".length();
                if ((-" ".length()) >= 0) {
                    return;
                }
            } else {
                worldPoint = null;
            }
            m(worldPoint);
        });
        "".length();
    }

    private static boolean llIllIlIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String llIllIIlll(String llIlIIIIIlllIll, String llIlIIIIIlllIlI) {
        String str = new String(Base64.getDecoder().decode(llIlIIIIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIIIIlllIIl = new StringBuilder();
        char[] charArray = llIlIIIIIlllIlI.toCharArray();
        int llIlIIIIIllIlll = lllllIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lllllIlI[1];
        while (llIlllIIII(i2, length)) {
            llIlIIIIIlllIIl.append((char) (charArray2[i2] ^ charArray[llIlIIIIIllIlll % charArray.length]));
            "".length();
            llIlIIIIIllIlll++;
            i2++;
            "".length();
            if (((101 ^ 59) ^ (217 ^ 131)) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llIlIIIIIlllIIl);
    }

    public WorldPoint cT() {
        return this.gI;
    }

    private static void llIllIlIIl() {
        lllllIIl = new String[lllllIlI[4]];
        lllllIIl[lllllIlI[1]] = llIllIIlll("HAo+Lg==", "QkLEG");
        lllllIIl[lllllIlI[2]] = llIllIlIII("aY/zZHgQ2d8=", "ngqvY");
        lllllIIl[lllllIlI[3]] = llIllIIlll("bDYjIFE2My8qWGBr", "PULLl");
    }

    private static boolean llIlllIIII(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIllIlllI(int i2) {
        return i2 == 0;
    }

    public boolean cU() {
        return this.gJ;
    }

    protected void onStart() {
        this.bq.add(this.gH);
        "".length();
    }

    private static boolean llIllIllll(int i2) {
        return i2 != 0;
    }

    private static boolean llIllIllII(int i2, int i3) {
        return i2 != i3;
    }

    @Provides
    SecondariesConfig w(ConfigManager configManager) {
        return (SecondariesConfig) configManager.getConfig(SecondariesConfig.class);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lllllIlI[0]];
        clsArr[lllllIlI[1]] = bP.class;
        clsArr[lllllIlI[2]] = bR.class;
        clsArr[lllllIlI[3]] = bS.class;
        clsArr[lllllIlI[4]] = bM.class;
        clsArr[lllllIlI[5]] = bN.class;
        clsArr[lllllIlI[6]] = bT.class;
        return clsArr;
    }

    public void m(WorldPoint worldPoint) {
        this.gI = worldPoint;
    }

    private static boolean llIllIllIl(Object obj) {
        return obj == null;
    }

    private static String llIllIlIII(String llIlIIIIIlIIllI, String llIlIIIIIlIIlIl) {
        try {
            SecretKeySpec llIlIIIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIIIlIlIII = Cipher.getInstance("Blowfish");
            llIlIIIIIlIlIII.init(lllllIlI[3], llIlIIIIIlIlIIl);
            return new String(llIlIIIIIlIlIII.doFinal(Base64.getDecoder().decode(llIlIIIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIIIIlIIlll) {
            llIlIIIIIlIIlll.printStackTrace();
            return null;
        }
    }
}
