package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.log.AutoRelogHopper;
import gg.squire.basics.log.RelogConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.Canvas;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.PluginChanged;
import net.runelite.client.game.WorldService;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.WorldResult;
import net.runelite.http.api.worlds.WorldType;
import net.unethicalite.api.account.GameAccount;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import org.jboss.aerogear.security.otp.Totp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Relogging", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aF  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aF.class */
public class aF extends Task {
    private static /* synthetic */ int[] llIIIIIII;
    private /* synthetic */ String eh;
    private /* synthetic */ String ei;
    private /* synthetic */ boolean en = llIIIIIII[0];
    private final /* synthetic */ RelogConfig ef;
    private static final /* synthetic */ Logger ec;
    private final /* synthetic */ WorldService eg;
    private final /* synthetic */ AutoRelogHopper ed;
    private final /* synthetic */ Client ee;
    private /* synthetic */ String ej;
    private /* synthetic */ World el;
    private /* synthetic */ long ek;
    private static /* synthetic */ String[] lIlllllll;
    private /* synthetic */ World em;

    private static boolean lIlIIlllllI(int i2) {
        return i2 < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    public boolean run() {
        if (lIlIIlllIIl(this.ef.logOutPlayer() ? 1 : 0)) {
            return llIIIIIII[0];
        }
        if (lIlIIlllIlI(this.el)) {
            this.em = Worlds.getRandom(world -> {
                if (lIlIIlllIIl(world.isNormal() ? 1 : 0) && lIlIIlllIII(world.isMembers() ? 1 : 0)) {
                    ?? r0 = llIIIIIII[1];
                    "".length();
                    return "  ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIIIII[0];
            });
            World currentWorld = Worlds.getCurrentWorld();
            if (lIlIIlllIIl(this.ef.hopSpecificWorlds() ? 1 : 0)) {
                String[] split = this.ef.worlds().split(lIlllllll[llIIIIIII[3]]);
                this.el = Worlds.getRandom(world2 -> {
                    if (lIlIlIIIIII(world2.getId(), currentWorld.getId()) && lIlIIlllIIl(Stream.of((Object[]) split).anyMatch(str -> {
                        if (lIlIIllllII(world2.getId(), Integer.parseInt(str.trim()))) {
                            ?? r0 = llIIIIIII[1];
                            "".length();
                            return " ".length() >= ((89 ^ 23) ^ (61 ^ 119)) ? ((((13 + 78) - 43) + 130) ^ (((86 + 81) - 65) + 40)) & (((33 ^ 98) ^ (((54 + 111) - 63) + 25)) ^ (-" ".length())) : r0;
                        }
                        return llIIIIIII[0];
                    }) ? 1 : 0)) {
                        ?? r0 = llIIIIIII[1];
                        "".length();
                        return " ".length() >= ((((68 + 94) - 99) + 79) ^ (((78 + 135) - 86) + 11)) ? ((((206 + 28) - 175) + 180) ^ (((82 + 132) - 195) + 180)) & (((12 ^ 75) ^ (124 ^ 19)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIIII[0];
                });
                "".length();
                if ("   ".length() <= ((92 ^ 69) & ((34 ^ 59) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                this.el = Worlds.getRandom(world3 -> {
                    if (lIlIIlllIIl(world3.isNormal() ? 1 : 0)) {
                        if (lIlIIllllII(world3.isMembers() ? 1 : 0, currentWorld.isMembers() ? 1 : 0) && lIlIlIIIIII(world3.getId(), currentWorld.getId())) {
                            ?? r0 = llIIIIIII[1];
                            "".length();
                            return (((43 ^ 118) ^ (67 ^ 76)) & (((((105 + 108) - 103) + 84) ^ (((78 + 111) - 147) + 102)) ^ (-" ".length()))) != 0 ? ((((87 + 76) - 137) + 205) ^ (((43 + 115) - 153) + 155)) & (((121 ^ 119) ^ (50 ^ 123)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llIIIIIII[0];
                });
            }
        }
        Widget widget = Widgets.get(llIIIIIII[4], widget2 -> {
            String[] strArr = new String[llIIIIIII[1]];
            strArr[llIIIIIII[0]] = lIlllllll[llIIIIIII[24]];
            return widget2.hasAction(strArr);
        });
        if (lIlIIlllIIl(Widgets.isVisible(widget) ? 1 : 0)) {
            widget.interact(lIlllllll[llIIIIIII[5]]);
        }
        if (lIlIIlllIll(this.ee.getGameState(), GameState.LOGGED_IN)) {
            this.ei = this.ee.getUsername();
            this.ej = this.ee.getPassword();
            "".length();
            if (" ".length() <= 0) {
                return (!true) & ((true ^ true) ^ true);
            }
        } else if (lIlIIlllIII(this.ei.isEmpty() ? 1 : 0) && lIlIIlllIII(this.ej.isEmpty() ? 1 : 0)) {
            bW();
        }
        return llIIIIIII[0];
    }

    private static int lIlIIllllIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean] */
    public void bZ() {
        String loginMessage = Static.getClient().getLoginMessage();
        if (lIlIIllIlll(loginMessage) && lIlIIlllIIl(d(loginMessage) ? 1 : 0)) {
            return;
        }
        if (!lIlIIllllll(this.ee.getGameState(), GameState.LOGIN_SCREEN_AUTHENTICATOR) || lIlIIllllII(this.ee.getLoginIndex(), llIIIIIII[5])) {
            if (lIlIIlllIIl(this.eh.isEmpty() ? 1 : 0)) {
                return;
            }
            this.ee.setOtp(new Totp(this.eh).now());
            Keyboard.sendEnter();
        } else if (lIlIIlllIll(this.ee.getGameState(), GameState.LOGIN_SCREEN)) {
            if (lIlIIlllIIl(this.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[15]]) ? 1 : 0)) {
                ec.info(lIlllllll[llIIIIIII[7]]);
                this.el = this.em;
                this.ee.changeWorld(w(llIIIIIII[16]));
                "".length();
                if ((((63 ^ 52) ^ (15 ^ 89)) & (((26 ^ 32) ^ (219 ^ 188)) ^ (-" ".length()))) > "  ".length()) {
                    return;
                }
            } else if (!lIlIIlllIII(this.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[17]]) ? 1 : 0) || lIlIIlllIIl(this.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[18]]) ? 1 : 0)) {
                ec.info(lIlllllll[llIIIIIII[19]]);
                this.el = this.em;
                this.ee.changeWorld(w(llIIIIIII[20]));
            }
            if (lIlIIlllIIl(this.ef.worldHopRelog() ? 1 : 0) && lIlIIllIlll(this.el)) {
                if (lIlIIllllII(this.el.getId(), this.ee.getWorld())) {
                    this.ee.changeWorld(ca());
                    this.el = null;
                    return;
                }
                this.ee.changeWorld(this.el);
                if (lIlIIllllII(this.ee.getWorld(), this.el.getId())) {
                    this.el = null;
                }
            }
            if (!lIlIIlllIIl(bV() ? 1 : 0)) {
                this.ee.setUsername(this.ei);
                this.ee.setPassword(this.ej);
                this.ee.setLoginIndex(llIIIIIII[2]);
                Keyboard.sendEnter();
                Keyboard.sendEnter();
            } else if (lIlIlIIIIII(this.ee.getLoginIndex(), llIIIIIII[12])) {
                this.ee.setLoginIndex(llIIIIIII[12]);
            } else {
                Canvas canvas = Static.getClient().getCanvas();
                int width = canvas.getWidth() / llIIIIIII[2];
                int height = canvas.getHeight() / llIIIIIII[2];
                if (!lIlIIlllIII(Static.getClient().isStretchedEnabled() ? 1 : 0) || lIlIIlllIIl(this.en ? 1 : 0)) {
                    this.ee.setGameState(GameState.LOGGING_IN);
                    return;
                }
                Mouse.click(width, height, (boolean) llIIIIIII[1]);
                "".length();
                if (0 != 0) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if (!lIlIIlllIll(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN) || ((!lIlIIlllIII(this.ei.isEmpty() ? 1 : 0) || lIlIIlllIIl(this.ej.isEmpty() ? 1 : 0)) && lIlIIlllIlI(System.getenv(lIlllllll[llIIIIIII[6]])) && !lIlIIlllIII(this.ee.getJagexDisplayName().isEmpty() ? 1 : 0))) {
            if (lIlIIlllIll(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
                this.en = llIIIIIII[1];
                return;
            }
            return;
        }
        this.ek = System.currentTimeMillis();
        bW();
        "".length();
        if ((true ^ true) ^ (true ^ true)) {
        }
    }

    private static String lIlIIllIlII(String lIlllIIIlIIIlll, String lIlllIIIlIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), llIIIIIII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIIlIIlIII) {
            lIlllIIIlIIlIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean d(String str) {
        if (lIlIIlllIIl(str.contains(lIlllllll[llIIIIIII[23]]) ? 1 : 0)) {
        }
        return llIIIIIII[0];
    }

    @Subscribe
    public void a(LoginStateChanged loginStateChanged) {
        System.out.println(loginStateChanged.getIndex());
    }

    private World w(int i2) {
        WorldResult worlds = this.eg.getWorlds();
        if (lIlIIlllIlI(worlds)) {
            ec.warn(lIlllllll[llIIIIIII[22]]);
            return null;
        }
        net.runelite.http.api.worlds.World findWorld = worlds.findWorld(i2);
        if (lIlIIlllIlI(findWorld) || !lIlIIlllIII(findWorld.getTypes().contains(WorldType.BETA_WORLD) ? 1 : 0) || lIlIIlllIIl(findWorld.getTypes().contains(WorldType.NOSAVE_MODE) ? 1 : 0)) {
            return null;
        }
        World createWorld = this.ee.createWorld();
        createWorld.setActivity(findWorld.getActivity());
        createWorld.setAddress(findWorld.getAddress());
        createWorld.setId(findWorld.getId());
        createWorld.setPlayerCount(findWorld.getPlayers());
        createWorld.setLocation(findWorld.getLocation());
        createWorld.setTypes(WorldUtil.toWorldTypes(findWorld.getTypes()));
        return createWorld;
    }

    private World ca() {
        WorldResult worlds = this.eg.getWorlds();
        if (lIlIIlllIlI(worlds)) {
            ec.warn(lIlllllll[llIIIIIII[21]]);
            return null;
        }
        List list = (List) worlds.getWorlds().stream().filter(world -> {
            return world.getTypes().contains(WorldType.MEMBERS);
        }).filter(world2 -> {
            if (lIlIIllllII(world2.getTypes().size(), llIIIIIII[1])) {
                ?? r0 = llIIIIIII[1];
                "".length();
                return (((154 ^ 163) ^ (84 ^ 54)) & (((((49 + 17) - (-121)) + 27) ^ (((11 + 118) - 117) + 129)) ^ (-" ".length()))) < 0 ? ((119 ^ 26) ^ (2 ^ 105)) & (((25 ^ 58) ^ (95 ^ 122)) ^ (-" ".length())) : r0;
            }
            return llIIIIIII[0];
        }).collect(Collectors.toList());
        net.runelite.http.api.worlds.World world3 = (net.runelite.http.api.worlds.World) list.get(Rand.nextInt(llIIIIIII[0], list.size()));
        World createWorld = this.ee.createWorld();
        createWorld.setActivity(world3.getActivity());
        createWorld.setAddress(world3.getAddress());
        createWorld.setId(world3.getId());
        createWorld.setPlayerCount(world3.getPlayers());
        createWorld.setLocation(world3.getLocation());
        createWorld.setTypes(WorldUtil.toWorldTypes(world3.getTypes()));
        return createWorld;
    }

    @Subscribe
    public void b(PluginChanged pluginChanged) {
        if (!lIlIIlllIII(pluginChanged.isLoaded() ? 1 : 0) && lIlIIlllIll(pluginChanged.getPlugin(), this.ed) && lIlIIlllIIl(bX() ? 1 : 0)) {
            if ((!lIlIIlllIII(this.ei.isEmpty() ? 1 : 0) || lIlIIlllIIl(this.ej.isEmpty() ? 1 : 0)) && !lIlIIlllIIl(bV() ? 1 : 0)) {
                return;
            }
            bW();
        }
    }

    private static String lIlIIllIIlI(String lIlllIIIllIllII, String lIlllIIIllIlIll) {
        try {
            SecretKeySpec lIlllIIIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIIII[2], lIlllIIIllIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIIllIllIl) {
            lIlllIIIllIllIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ClientTick clientTick) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private static boolean bV() {
        if (lIlIIllIlll(Static.getClient().getJagexDisplayName()) && lIlIIlllIII(Static.getClient().getJagexDisplayName().isEmpty() ? 1 : 0)) {
            ?? r0 = llIIIIIII[1];
            "".length();
            return (-" ".length()) >= 0 ? ((25 ^ 83) ^ (62 ^ 107)) & (((208 ^ 183) ^ (17 ^ 105)) ^ (-" ".length())) : r0;
        }
        return llIIIIIII[0];
    }

    private static boolean lIlIIlllIIl(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    private boolean bX() {
        if (lIlIIllllII(this.ee.getLoginIndex(), llIIIIIII[7])) {
            ec.info(lIlllllll[llIIIIIII[8]]);
            this.ed.forceStop();
            return llIIIIIII[0];
        } else if (!lIlIIlllIII(this.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[9]]) ? 1 : 0) || !lIlIIlllIII(this.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[10]]) ? 1 : 0) || lIlIIlllIIl(this.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[11]]) ? 1 : 0)) {
            ec.info(lIlllllll[llIIIIIII[12]]);
            this.ed.forceStop();
            return llIIIIIII[0];
        } else {
            if (!lIlIIlllIII(Game.isOnLoginScreen() ? 1 : 0) && !lIlIIlllIII(this.ed.aI() ? 1 : 0)) {
                return Static.getPluginManager().isPluginEnabled(this.ed);
            }
            return llIIIIIII[0];
        }
    }

    private void bY() {
        try {
            if (lIlIIlllIIl(this.ef.delayedRelog() ? 1 : 0)) {
                if (lIlIIlllllI(lIlIIllllIl(System.currentTimeMillis() - this.ek, TimeUnit.MINUTES.toMillis(this.ef.relogDelay())))) {
                    return;
                }
            }
            long j = 2000;
            if (lIlIIlllIIl(this.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[13]]) ? 1 : 0)) {
                ec.info(lIlllllll[llIIIIIII[14]]);
                j = 60000;
            }
            Thread.sleep(j);
            "".length();
            if (((((123 + 138) - 90) + 12) ^ (((143 + 103) - 76) + 9)) <= 0) {
                return;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        GameThread.invoke(() -> {
            bZ();
        });
    }

    private static boolean lIlIIlllIlI(Object obj) {
        return obj == null;
    }

    private void bW() {
        new Thread(() -> {
            if (lIlIIlllIIl(this.ef.logOutPlayer() ? 1 : 0)) {
                return;
            }
            do {
                bY();
            } while (!lIlIIlllIII(bX() ? 1 : 0));
        }).start();
    }

    private static boolean lIlIIllIlll(Object obj) {
        return obj != null;
    }

    static {
        lIlIIllIllI();
        lIlIIllIlIl();
        ec = LoggerFactory.getLogger(aF.class);
    }

    private static void lIlIIllIllI() {
        llIIIIIII = new int[26];
        llIIIIIII[0] = ((((69 + 22) - (-29)) + 24) ^ (((66 + 73) - 91) + 148)) & (((65 ^ 82) ^ (131 ^ 196)) ^ (-" ".length()));
        llIIIIIII[1] = " ".length();
        llIIIIIII[2] = "  ".length();
        llIIIIIII[3] = "   ".length();
        llIIIIIII[4] = (-30337) & 30714;
        llIIIIIII[5] = 183 ^ 179;
        llIIIIIII[6] = (167 ^ 198) ^ (242 ^ 150);
        llIIIIIII[7] = 50 ^ 60;
        llIIIIIII[8] = 77 ^ 75;
        llIIIIIII[9] = (196 ^ 142) ^ (208 ^ 157);
        llIIIIIII[10] = (((39 + 33) - 64) + 141) ^ (((29 + 127) - 4) + 5);
        llIIIIIII[11] = 41 ^ 32;
        llIIIIIII[12] = 164 ^ 174;
        llIIIIIII[13] = (((91 + 6) - 40) + 88) ^ (((76 + 12) - (-52)) + 14);
        llIIIIIII[14] = (((127 + 2) - 73) + 87) ^ (((20 + 68) - 58) + 101);
        llIIIIIII[15] = 6 ^ 11;
        llIIIIIII[16] = (-((-25) & 31897)) & (-586) & 32765;
        llIIIIIII[17] = (7 ^ 12) ^ (171 ^ 175);
        llIIIIIII[18] = (231 ^ 153) ^ (213 ^ 187);
        llIIIIIII[19] = (223 ^ 178) ^ (231 ^ 155);
        llIIIIIII[20] = (-((-509) & 19455)) & (-5249) & 24530;
        llIIIIIII[21] = 156 ^ 142;
        llIIIIIII[22] = (41 ^ 36) ^ (103 ^ 121);
        llIIIIIII[23] = (((106 + 37) - 19) + 48) ^ (((123 + 7) - 40) + 94);
        llIIIIIII[24] = (146 ^ 154) ^ (84 ^ 73);
        llIIIIIII[25] = (255 ^ 173) ^ (227 ^ 167);
    }

    private static boolean lIlIIllllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIIllllII(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Inject
    public aF(AutoRelogHopper autoRelogHopper, Client client, RelogConfig relogConfig, WorldService worldService) {
        this.eh = lIlllllll[llIIIIIII[0]];
        this.ei = lIlllllll[llIIIIIII[1]];
        this.ej = lIlllllll[llIIIIIII[2]];
        this.ed = autoRelogHopper;
        this.ee = client;
        this.ef = relogConfig;
        this.eg = worldService;
        GameAccount gameAccount = Game.getGameAccount();
        if (lIlIIllIlll(gameAccount)) {
            this.ei = gameAccount.getUsername();
            this.ej = gameAccount.getPassword();
            this.eh = gameAccount.getAuth();
        }
    }

    private static boolean lIlIlIIIIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIlllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIlllIII(int i2) {
        return i2 == 0;
    }

    private static void lIlIIllIlIl() {
        lIlllllll = new String[llIIIIIII[25]];
        lIlllllll[llIIIIIII[0]] = lIlIIllIIlI("O7MKc5bksfo=", "gHIfS");
        lIlllllll[llIIIIIII[1]] = lIlIIllIIlI("FOMfa2qBoeQ=", "nIWvr");
        lIlllllll[llIIIIIII[2]] = lIlIIllIIll("", "mTTMc");
        lIlllllll[llIIIIIII[3]] = lIlIIllIIll("VA==", "xHhsh");
        lIlllllll[llIIIIIII[5]] = lIlIIllIIlI("LOYD40LzwwE=", "FyFZI");
        lIlllllll[llIIIIIII[6]] = lIlIIllIIll("OAozMiMhAiA3My0cLTsv", "rRlvj");
        lIlllllll[llIIIIIII[8]] = lIlIIllIlII("8sSgzRfacEpGKu7Mm6ryq6V0/EBDdp0b4xjfS5XJut4=", "xQXiU");
        lIlllllll[llIIIIIII[9]] = lIlIIllIlII("WWCW0roJhnz1Pw5S2bx0aauZ72o4kpQc", "opQDm");
        lIlllllll[llIIIIIII[10]] = lIlIIllIlII("kinZ4wjX27Oh3adSthBE4qLwTWdFgdgcWdJKSdeAUbw=", "npmoX");
        lIlllllll[llIIIIIII[11]] = lIlIIllIlII("+0iz0p/oBPhHIa2kdKgl/h78HD+/EoVfPjCPqGavoC4=", "ysZCU");
        lIlllllll[llIIIIIII[12]] = lIlIIllIIll("HS4gJjMnNCh2MSs2IDFjKi8qdjchejomJy8uKnkhLzQ=", "NZOVC");
        lIlllllll[llIIIIIII[13]] = lIlIIllIIlI("IJc4HN8Z8ahnxf8BV0HPp7lCVI79RkOS4GhGkOkDf6U=", "OPIHT");
        lIlllllll[llIIIIIII[14]] = lIlIIllIlII("avuGZcFgvtx9YFz8GCVLvwb3682Q+dHUfWm3H1iil6U=", "VWYYT");
        lIlllllll[llIIIIIII[15]] = lIlIIllIIll("Iwclbi0fDTRuIloFNSMhHxojbiIZCz87LQ4=", "zhPNC");
        lIlllllll[llIIIIIII[7]] = lIlIIllIIll("Fx4XBhstBxFWHytJEEQbZB4ZBAcg", "Divvk");
        lIlllllll[llIIIIIII[17]] = lIlIIllIlII("Lh3ztsi7kQIiVhZvi8oHntbyCRV1RXHK", "RJXAL");
        lIlllllll[llIIIIIII[18]] = lIlIIllIlII("eXvL8SMFIdXaVvzowVjKAmCWagYHkqqs", "fFKle");
        lIlllllll[llIIIIIII[19]] = lIlIIllIIll("PQIPASQHGwlRIAFVHkMkTgIBAzgK", "nunqT");
        lIlllllll[llIIIIIII[21]] = lIlIIllIIlI("rT6JxEr+wka4vKmmrsEa21FYDhzaX5pLpFFT8ytfoLA=", "BgEdc");
        lIlllllll[llIIIIIII[22]] = lIlIIllIIlI("36j/6IIJA9+OX/l7vl/yX1GZgtRlXm0+yFp/VDP7E4Y=", "JDgzp");
        lIlllllll[llIIIIIII[23]] = lIlIIllIIlI("Ep/okqZVxDOqvJoWvahtvt8I8MPQmZ5aVg2Ku+LySAk=", "iGZQZ");
        lIlllllll[llIIIIIII[24]] = lIlIIllIlII("jMW/K4V9TVI=", "gcqJd");
    }

    private static String lIlIIllIIll(String lIlllIIIlIlIlll, String lIlllIIIlIllIll) {
        String lIlllIIIlIlIlll2 = new String(Base64.getDecoder().decode(lIlllIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlllIIIlIllIll.toCharArray();
        int lIlllIIIlIllIII = llIIIIIII[0];
        char[] charArray2 = lIlllIIIlIlIlll2.toCharArray();
        int length = charArray2.length;
        int lIlllIIIlIlIIII = llIIIIIII[0];
        while (lIlIlIIIIIl(lIlllIIIlIlIIII, length)) {
            sb.append((char) (charArray2[lIlllIIIlIlIIII] ^ charArray[lIlllIIIlIllIII % charArray.length]));
            "".length();
            lIlllIIIlIllIII++;
            lIlllIIIlIlIIII++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIIIIII(int i2, int i3) {
        return i2 != i3;
    }
}
