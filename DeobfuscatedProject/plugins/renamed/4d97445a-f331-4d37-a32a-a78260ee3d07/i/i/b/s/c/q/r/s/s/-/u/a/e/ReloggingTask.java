/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.World
 *  net.runelite.api.events.ClientTick
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.PluginChanged
 *  net.runelite.client.game.WorldService
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.util.WorldUtil
 *  net.runelite.http.api.worlds.World
 *  net.runelite.http.api.worlds.WorldResult
 *  net.runelite.http.api.worlds.WorldType
 *  net.unethicalite.api.account.GameAccount
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.events.LoginStateChanged
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.GameThread
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 *  org.jboss.aerogear.security.otp.Totp
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.log.AutoRelogHopper;
import gg.squire.basics.log.RelogConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.Component;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumSet;
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
import net.runelite.client.plugins.Plugin;
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

/* TASK: Relogging -> ReloggingTask */
@TaskDesc(name="Relogging", register=true)
public class ReloggingTask
extends Task {
    private static /* synthetic */ int[] llIIIIIII;
    private /* synthetic */ String eh;
    private /* synthetic */ String ei;
    private /* synthetic */ boolean en;
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

    private static boolean lIlIIlllllI(int n2) {
        return n2 < 0;
    }

    public boolean run() {
        World lIlllIIlIllIlll;
        aF lIlllIIlIlllIII;
        if (aF.lIlIIlllIIl(this.ef.logOutPlayer() ? 1 : 0)) {
            return llIIIIIII[0];
        }
        if (aF.lIlIIlllIlI(lIlllIIlIlllIII.el)) {
            lIlllIIlIlllIII.em = Worlds.getRandom(world -> {
                int n2;
                if (aF.lIlIIlllIIl(world.isNormal() ? 1 : 0) && aF.lIlIIlllIII(world.isMembers() ? 1 : 0)) {
                    n2 = llIIIIIII[1];
                    0;
                    if (2 < 2) {
                        return false;
                    }
                } else {
                    n2 = llIIIIIII[0];
                }
                return n2 != 0;
            });
            lIlllIIlIllIlll = Worlds.getCurrentWorld();
            if (aF.lIlIIlllIIl(lIlllIIlIlllIII.ef.hopSpecificWorlds() ? 1 : 0)) {
                String[] lIlllIIlIllIllI = lIlllIIlIlllIII.ef.worlds().split(lIlllllll[llIIIIIII[3]]);
                lIlllIIlIlllIII.el = Worlds.getRandom(world2 -> {
                    int n2;
                    if (aF.lIlIlIIIIII(world2.getId(), lIlllIIlIllIlll.getId()) && aF.lIlIIlllIIl(Stream.of(lIlllIIlIllIllI).anyMatch(string -> {
                        boolean bl2;
                        if (aF.lIlIIllllII(world2.getId(), Integer.parseInt(string.trim()))) {
                            bl2 = llIIIIIII[1];
                            0;
                            if (1 >= (0x59 ^ 0x17 ^ (0x3D ^ 0x77))) {
                                return false;
                            }
                        } else {
                            bl2 = llIIIIIII[0];
                        }
                        return bl2;
                    }) ? 1 : 0)) {
                        n2 = llIIIIIII[1];
                        0;
                        if (1 >= (68 + 94 - 99 + 79 ^ 78 + 135 - 86 + 11)) {
                            return ((206 + 28 - 175 + 180 ^ 82 + 132 - 195 + 180) & (0xC ^ 0x4B ^ (0x7C ^ 0x13) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIIIIII[0];
                    }
                    return n2 != 0;
                });
                0;
                if (3 <= ((0x5C ^ 0x45) & ~(0x22 ^ 0x3B))) {
                    return false;
                }
            } else {
                lIlllIIlIlllIII.el = Worlds.getRandom(world2 -> {
                    int n2;
                    if (aF.lIlIIlllIIl(world2.isNormal() ? 1 : 0) && aF.lIlIIllllII(world2.isMembers() ? 1 : 0, lIlllIIlIllIlll.isMembers() ? 1 : 0) && aF.lIlIlIIIIII(world2.getId(), lIlllIIlIllIlll.getId())) {
                        n2 = llIIIIIII[1];
                        0;
                        if (((0x2B ^ 0x76 ^ (0x43 ^ 0x4C)) & (105 + 108 - 103 + 84 ^ 78 + 111 - 147 + 102 ^ -1)) != 0) {
                            return ((87 + 76 - 137 + 205 ^ 43 + 115 - 153 + 155) & (0x79 ^ 0x77 ^ (0x32 ^ 0x7B) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIIIIII[0];
                    }
                    return n2 != 0;
                });
            }
        }
        if (aF.lIlIIlllIIl(Widgets.isVisible((Widget)(lIlllIIlIllIlll = Widgets.get((int)llIIIIIII[4], widget -> {
            String[] stringArray = new String[llIIIIIII[1]];
            stringArray[aF.llIIIIIII[0]] = lIlllllll[llIIIIIII[24]];
            return widget.hasAction(stringArray);
        }))) ? 1 : 0)) {
            lIlllIIlIllIlll.interact(lIlllllll[llIIIIIII[5]]);
        }
        if (aF.lIlIIlllIll(lIlllIIlIlllIII.ee.getGameState(), GameState.LOGGED_IN)) {
            lIlllIIlIlllIII.ei = lIlllIIlIlllIII.ee.getUsername();
            lIlllIIlIlllIII.ej = lIlllIIlIlllIII.ee.getPassword();
            0;
            if (1 <= 0) {
                return false;
            }
        } else if (aF.lIlIIlllIII(lIlllIIlIlllIII.ei.isEmpty() ? 1 : 0) && aF.lIlIIlllIII(lIlllIIlIlllIII.ej.isEmpty() ? 1 : 0)) {
            lIlllIIlIlllIII.bW();
        }
        return llIIIIIII[0];
    }

    private static int lIlIIllllIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public void bZ() {
        aF lIlllIIlIlIIIlI;
        String string = Static.getClient().getLoginMessage();
        if (aF.lIlIIllIlll(string) && aF.lIlIIlllIIl(this.d(string) ? 1 : 0)) {
            return;
        }
        if (!aF.lIlIIllllll(lIlllIIlIlIIIlI.ee.getGameState(), GameState.LOGIN_SCREEN_AUTHENTICATOR) || aF.lIlIIllllII(lIlllIIlIlIIIlI.ee.getLoginIndex(), llIIIIIII[5])) {
            if (aF.lIlIIlllIIl(lIlllIIlIlIIIlI.eh.isEmpty() ? 1 : 0)) {
                return;
            }
            Totp lIlllIIlIlIIIII = new Totp(lIlllIIlIlIIIlI.eh);
            lIlllIIlIlIIIlI.ee.setOtp(lIlllIIlIlIIIII.now());
            Keyboard.sendEnter();
            return;
        }
        if (aF.lIlIIlllIll(lIlllIIlIlIIIlI.ee.getGameState(), GameState.LOGIN_SCREEN)) {
            Object lIlllIIlIlIIIII;
            if (aF.lIlIIlllIIl(lIlllIIlIlIIIlI.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[15]]) ? 1 : 0)) {
                ec.info(lIlllllll[llIIIIIII[7]]);
                lIlllIIlIlIIIlI.el = lIlllIIlIlIIIlI.em;
                lIlllIIlIlIIIII = lIlllIIlIlIIIlI.w(llIIIIIII[16]);
                lIlllIIlIlIIIlI.ee.changeWorld((World)lIlllIIlIlIIIII);
                0;
                if (((0x3F ^ 0x34 ^ (0xF ^ 0x59)) & (0x1A ^ 0x20 ^ (0xDB ^ 0xBC) ^ -1)) > 2) {
                    return;
                }
            } else if (!aF.lIlIIlllIII(lIlllIIlIlIIIlI.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[17]]) ? 1 : 0) || aF.lIlIIlllIIl(lIlllIIlIlIIIlI.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[18]]) ? 1 : 0)) {
                ec.info(lIlllllll[llIIIIIII[19]]);
                lIlllIIlIlIIIlI.el = lIlllIIlIlIIIlI.em;
                lIlllIIlIlIIIII = lIlllIIlIlIIIlI.w(llIIIIIII[20]);
                lIlllIIlIlIIIlI.ee.changeWorld((World)lIlllIIlIlIIIII);
            }
            if (aF.lIlIIlllIIl(lIlllIIlIlIIIlI.ef.worldHopRelog() ? 1 : 0) && aF.lIlIIllIlll(lIlllIIlIlIIIlI.el)) {
                if (aF.lIlIIllllII(lIlllIIlIlIIIlI.el.getId(), lIlllIIlIlIIIlI.ee.getWorld())) {
                    lIlllIIlIlIIIII = lIlllIIlIlIIIlI.ca();
                    lIlllIIlIlIIIlI.ee.changeWorld((World)lIlllIIlIlIIIII);
                    lIlllIIlIlIIIlI.el = null;
                    return;
                }
                lIlllIIlIlIIIlI.ee.changeWorld(lIlllIIlIlIIIlI.el);
                if (aF.lIlIIllllII(lIlllIIlIlIIIlI.ee.getWorld(), lIlllIIlIlIIIlI.el.getId())) {
                    lIlllIIlIlIIIlI.el = null;
                }
            }
            if (aF.lIlIIlllIIl(aF.bV() ? 1 : 0)) {
                if (aF.lIlIlIIIIII(lIlllIIlIlIIIlI.ee.getLoginIndex(), llIIIIIII[12])) {
                    lIlllIIlIlIIIlI.ee.setLoginIndex(llIIIIIII[12]);
                    return;
                }
                lIlllIIlIlIIIII = Static.getClient().getCanvas();
                int lIlllIIlIIlllll = ((Component)lIlllIIlIlIIIII).getWidth() / llIIIIIII[2];
                int lIlllIIlIIllllI = ((Component)lIlllIIlIlIIIII).getHeight() / llIIIIIII[2];
                if (!aF.lIlIIlllIII(Static.getClient().isStretchedEnabled() ? 1 : 0) || aF.lIlIIlllIIl(lIlllIIlIlIIIlI.en ? 1 : 0)) {
                    lIlllIIlIlIIIlI.ee.setGameState(GameState.LOGGING_IN);
                    return;
                }
                Mouse.click((int)lIlllIIlIIlllll, (int)lIlllIIlIIllllI, (boolean)llIIIIIII[1]);
                0;
                
                }
            } else {
                lIlllIIlIlIIIlI.ee.setUsername(lIlllIIlIlIIIlI.ei);
                lIlllIIlIlIIIlI.ee.setPassword(lIlllIIlIlIIIlI.ej);
                lIlllIIlIlIIIlI.ee.setLoginIndex(llIIIIIII[2]);
                Keyboard.sendEnter();
                Keyboard.sendEnter();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        void lIlllIIlIllIIlI;
        aF lIlllIIlIllIIll;
        if (aF.lIlIIlllIll(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN) && (aF.lIlIIlllIII(this.ei.isEmpty() ? 1 : 0) && !aF.lIlIIlllIIl(this.ej.isEmpty() ? 1 : 0) || !aF.lIlIIlllIlI(System.getenv(lIlllllll[llIIIIIII[6]])) || aF.lIlIIlllIII(lIlllIIlIllIIll.ee.getJagexDisplayName().isEmpty() ? 1 : 0))) {
            lIlllIIlIllIIll.ek = System.currentTimeMillis();
            lIlllIIlIllIIll.bW();
            0;
            if ((0xC5 ^ 0x9C ^ (0x1B ^ 0x47)) == 0) {
                return;
            }
        } else if (aF.lIlIIlllIll(lIlllIIlIllIIlI.getGameState(), GameState.LOGGED_IN)) {
            lIlllIIlIllIIll.en = llIIIIIII[1];
        }
    }

    private static String lIlIIllIlII(String lIlllIIIlIIIlll, String lIlllIIIlIIIllI) {
        try {
            SecretKeySpec lIlllIIIlIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), llIIIIIII[10]), "DES");
            Cipher lIlllIIIlIIlIIl = Cipher.getInstance("DES");
            lIlllIIIlIIlIIl.init(llIIIIIII[2], lIlllIIIlIIlIlI);
            return new String(lIlllIIIlIIlIIl.doFinal(Base64.getDecoder().decode(lIlllIIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIIlIIlIII) {
            lIlllIIIlIIlIII.printStackTrace();
            return null;
        }
    }

    private boolean d(String string) {
        if (aF.lIlIIlllIIl(string.contains(lIlllllll[llIIIIIII[23]]) ? 1 : 0)) {
            // empty if block
        }
        return llIIIIIII[0];
    }

    @Subscribe
    public void a(LoginStateChanged loginStateChanged) {
        System.out.println(loginStateChanged.getIndex());
    }

    /*
     * WARNING - void declaration
     */
    private World w(int n2) {
        void var3_3;
        void lIlllIIlIIIllIl;
        void lIlllIIlIIIllII;
        WorldResult worldResult = this.eg.getWorlds();
        if (aF.lIlIIlllIlI(worldResult)) {
            ec.warn(lIlllllll[llIIIIIII[22]]);
            return null;
        }
        net.runelite.http.api.worlds.World lIlllIIlIIIlIll = lIlllIIlIIIllII.findWorld((int)lIlllIIlIIIllIl);
        if (aF.lIlIIlllIlI(lIlllIIlIIIlIll)) {
            return null;
        }
        if (!aF.lIlIIlllIII(lIlllIIlIIIlIll.getTypes().contains(WorldType.BETA_WORLD) ? 1 : 0) || aF.lIlIIlllIIl(lIlllIIlIIIlIll.getTypes().contains(WorldType.NOSAVE_MODE) ? 1 : 0)) {
            return null;
        }
        World world = this.ee.createWorld();
        world.setActivity(var3_3.getActivity());
        world.setAddress(var3_3.getAddress());
        world.setId(var3_3.getId());
        world.setPlayerCount(var3_3.getPlayers());
        world.setLocation(var3_3.getLocation());
        world.setTypes(WorldUtil.toWorldTypes((EnumSet)var3_3.getTypes()));
        return world;
    }

    private World ca() {
        WorldResult worldResult = this.eg.getWorlds();
        if (aF.lIlIIlllIlI(worldResult)) {
            ec.warn(lIlllllll[llIIIIIII[21]]);
            return null;
        }
        List list = worldResult.getWorlds().stream().filter(world -> world.getTypes().contains(WorldType.MEMBERS)).filter(world -> {
            boolean bl2;
            if (aF.lIlIIllllII(world.getTypes().size(), llIIIIIII[1])) {
                bl2 = llIIIIIII[1];
                0;
                if (((0x9A ^ 0xA3 ^ (0x54 ^ 0x36)) & (49 + 17 - -121 + 27 ^ 11 + 118 - 117 + 129 ^ -1)) < 0) {
                    return ((0x77 ^ 0x1A ^ (2 ^ 0x69)) & (0x19 ^ 0x3A ^ (0x5F ^ 0x7A) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIIIIII[0];
            }
            return bl2;
        }).collect(Collectors.toList());
        net.runelite.http.api.worlds.World world2 = (net.runelite.http.api.worlds.World)list.get(Rand.nextInt((int)llIIIIIII[0], (int)list.size()));
        World world3 = this.ee.createWorld();
        world3.setActivity(world2.getActivity());
        world3.setAddress(world2.getAddress());
        world3.setId(world2.getId());
        world3.setPlayerCount(world2.getPlayers());
        world3.setLocation(world2.getLocation());
        world3.setTypes(WorldUtil.toWorldTypes((EnumSet)world2.getTypes()));
        return world3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(PluginChanged pluginChanged) {
        aF lIlllIIlIlIllll;
        void lIlllIIlIlIlllI;
        if (aF.lIlIIlllIII(pluginChanged.isLoaded() ? 1 : 0)) {
            return;
        }
        if (aF.lIlIIlllIll(lIlllIIlIlIlllI.getPlugin(), (Object)lIlllIIlIlIllll.ed) && aF.lIlIIlllIIl(lIlllIIlIlIllll.bX() ? 1 : 0) && (aF.lIlIIlllIII(lIlllIIlIlIllll.ei.isEmpty() ? 1 : 0) && !aF.lIlIIlllIIl(lIlllIIlIlIllll.ej.isEmpty() ? 1 : 0) || aF.lIlIIlllIIl(aF.bV() ? 1 : 0))) {
            lIlllIIlIlIllll.bW();
        }
    }

    private static String lIlIIllIIlI(String lIlllIIIllIlIlI, String lIlllIIIllIlIll) {
        try {
            SecretKeySpec lIlllIIIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIIIllIlllI = Cipher.getInstance("Blowfish");
            lIlllIIIllIlllI.init(llIIIIIII[2], lIlllIIIllIllll);
            return new String(lIlllIIIllIlllI.doFinal(Base64.getDecoder().decode(lIlllIIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIIllIllIl) {
            lIlllIIIllIllIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ClientTick clientTick) {
    }

    private static boolean bV() {
        int n2;
        if (aF.lIlIIllIlll(Static.getClient().getJagexDisplayName()) && aF.lIlIIlllIII(Static.getClient().getJagexDisplayName().isEmpty() ? 1 : 0)) {
            n2 = llIIIIIII[1];
            0;
            if (-1 >= 0) {
                return ((0x19 ^ 0x53 ^ (0x3E ^ 0x6B)) & (0xD0 ^ 0xB7 ^ (0x11 ^ 0x69) ^ -1)) != 0;
            }
        } else {
            n2 = llIIIIIII[0];
        }
        return n2 != 0;
    }

    private static boolean lIlIIlllIIl(int n2) {
        return n2 != 0;
    }

    private boolean bX() {
        aF lIlllIIlIlIllII;
        if (aF.lIlIIllllII(this.ee.getLoginIndex(), llIIIIIII[7])) {
            ec.info(lIlllllll[llIIIIIII[8]]);
            this.ed.forceStop();
            return llIIIIIII[0];
        }
        if (!aF.lIlIIlllIII(lIlllIIlIlIllII.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[9]]) ? 1 : 0) || !aF.lIlIIlllIII(lIlllIIlIlIllII.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[10]]) ? 1 : 0) || aF.lIlIIlllIIl(lIlllIIlIlIllII.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[11]]) ? 1 : 0)) {
            ec.info(lIlllllll[llIIIIIII[12]]);
            lIlllIIlIlIllII.ed.forceStop();
            return llIIIIIII[0];
        }
        if (aF.lIlIIlllIII(Game.isOnLoginScreen() ? 1 : 0)) {
            return llIIIIIII[0];
        }
        if (aF.lIlIIlllIII(lIlllIIlIlIllII.ed.aI() ? 1 : 0)) {
            return llIIIIIII[0];
        }
        return Static.getPluginManager().isPluginEnabled((Plugin)this.ed);
    }

    private void bY() {
        try {
            long lIlllIIlIlIlIII;
            aF lIlllIIlIlIlIIl;
            if (aF.lIlIIlllIIl(lIlllIIlIlIlIIl.ef.delayedRelog() ? 1 : 0)) {
                lIlllIIlIlIlIII = TimeUnit.MINUTES.toMillis(lIlllIIlIlIlIIl.ef.relogDelay());
                if (aF.lIlIIlllllI(aF.lIlIIllllIl(System.currentTimeMillis() - lIlllIIlIlIlIIl.ek, lIlllIIlIlIlIII))) {
                    return;
                }
            }
            lIlllIIlIlIlIII = 2000L;
            if (aF.lIlIIlllIIl(lIlllIIlIlIlIIl.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[13]]) ? 1 : 0)) {
                ec.info(lIlllllll[llIIIIIII[14]]);
                lIlllIIlIlIlIII = 60000L;
            }
            Thread.sleep(lIlllIIlIlIlIII);
            0;
        }
        catch (InterruptedException lIlllIIlIlIlIII) {
            lIlllIIlIlIlIII.printStackTrace();
        }
        if ((123 + 138 - 90 + 12 ^ 143 + 103 - 76 + 9) <= 0) {
            return;
        }
        GameThread.invoke(() -> this.bZ());
    }

    private static boolean lIlIIlllIlI(Object object) {
        return object == null;
    }

    private void bW() {
        new Thread(() -> {
            if (aF.lIlIIlllIIl(this.ef.logOutPlayer() ? 1 : 0)) {
                return;
            }
            do {
                this.bY();
            } while (!aF.lIlIIlllIII(this.bX() ? 1 : 0));
        }).start();
    }

    private static boolean lIlIIllIlll(Object object) {
        return object != null;
    }

    static {
        aF.lIlIIllIllI();
        aF.lIlIIllIlIl();
        ec = LoggerFactory.getLogger(ReloggingTask.class);
    }

    private static void lIlIIllIllI() {
        llIIIIIII = new int[26];
        aF.llIIIIIII[0] = (69 + 22 - -29 + 24 ^ 66 + 73 - 91 + 148) & (0x41 ^ 0x52 ^ (0x83 ^ 0xC4) ^ -1);
        aF.llIIIIIII[1] = 1;
        aF.llIIIIIII[2] = 2;
        aF.llIIIIIII[3] = 3;
        aF.llIIIIIII[4] = 0xFFFF897F & 0x77FA;
        aF.llIIIIIII[5] = 0xB7 ^ 0xB3;
        aF.llIIIIIII[6] = 0xA7 ^ 0xC6 ^ (0xF2 ^ 0x96);
        aF.llIIIIIII[7] = 0x32 ^ 0x3C;
        aF.llIIIIIII[8] = 0x4D ^ 0x4B;
        aF.llIIIIIII[9] = 0xC4 ^ 0x8E ^ (0xD0 ^ 0x9D);
        aF.llIIIIIII[10] = 39 + 33 - 64 + 141 ^ 29 + 127 - 4 + 5;
        aF.llIIIIIII[11] = 0x29 ^ 0x20;
        aF.llIIIIIII[12] = 0xA4 ^ 0xAE;
        aF.llIIIIIII[13] = 91 + 6 - 40 + 88 ^ 76 + 12 - -52 + 14;
        aF.llIIIIIII[14] = 127 + 2 - 73 + 87 ^ 20 + 68 - 58 + 101;
        aF.llIIIIIII[15] = 6 ^ 0xB;
        aF.llIIIIIII[16] = -(0xFFFFFFE7 & 0x7C99) & (0xFFFFFDB6 & 0x7FFD);
        aF.llIIIIIII[17] = 7 ^ 0xC ^ (0xAB ^ 0xAF);
        aF.llIIIIIII[18] = 0xE7 ^ 0x99 ^ (0xD5 ^ 0xBB);
        aF.llIIIIIII[19] = 0xDF ^ 0xB2 ^ (0xE7 ^ 0x9B);
        aF.llIIIIIII[20] = -(0xFFFFFE03 & 0x4BFF) & (0xFFFFEB7F & 0x5FD2);
        aF.llIIIIIII[21] = 0x9C ^ 0x8E;
        aF.llIIIIIII[22] = 0x29 ^ 0x24 ^ (0x67 ^ 0x79);
        aF.llIIIIIII[23] = 106 + 37 - 19 + 48 ^ 123 + 7 - 40 + 94;
        aF.llIIIIIII[24] = 0x92 ^ 0x9A ^ (0x54 ^ 0x49);
        aF.llIIIIIII[25] = 0xFF ^ 0xAD ^ (0xE3 ^ 0xA7);
    }

    private static boolean lIlIIllllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIIllllII(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public aF(AutoRelogHopper autoRelogHopper, Client client, RelogConfig relogConfig, WorldService worldService) {
        this.eh = lIlllllll[llIIIIIII[0]];
        this.ei = lIlllllll[llIIIIIII[1]];
        this.ej = lIlllllll[llIIIIIII[2]];
        this.en = llIIIIIII[0];
        this.ed = autoRelogHopper;
        this.ee = client;
        this.ef = relogConfig;
        this.eg = worldService;
        GameAccount gameAccount = Game.getGameAccount();
        if (aF.lIlIIllIlll(gameAccount)) {
            this.ei = gameAccount.getUsername();
            this.ej = gameAccount.getPassword();
            this.eh = gameAccount.getAuth();
        }
    }

    private static boolean lIlIlIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIlllIII(int n2) {
        return n2 == 0;
    }

    private static void lIlIIllIlIl() {
        lIlllllll = new String[llIIIIIII[25]];
        aF.lIlllllll[aF.llIIIIIII[0]] = aF."";
        aF.lIlllllll[aF.llIIIIIII[1]] = aF."";
        aF.lIlllllll[aF.llIIIIIII[2]] = aF."";
        aF.lIlllllll[aF.llIIIIIII[3]] = aF.",";
        aF.lIlllllll[aF.llIIIIIII[5]] = aF."Play";
        aF.lIlllllll[aF.llIIIIIII[6]] = aF."JX_DISPLAY_NAME";
        aF.lIlllllll[aF.llIIIIIII[8]] = aF."Stopping relog due to ban";
        aF.lIlllllll[aF.llIIIIIII[9]] = aF."has been updated";
        aF.lIlllllll[aF.llIIIIIII[10]] = aF."Your account has been disabled";
        aF.lIlllllll[aF.llIIIIIII[11]] = aF."Account locked as we suspect";
        aF.lIlllllll[aF.llIIIIIII[12]] = aF."Stopping relog due to update/ban";
        aF.lIlllllll[aF.llIIIIIII[13]] = aF."Too many login attempts.";
        aF.lIlllllll[aF.llIIIIIII[14]] = aF."Waiting a minute to relog";
        aF.lIlllllll[aF.llIIIIIII[15]] = aF."You need a members account";
        aF.lIlllllll[aF.llIIIIIII[7]] = aF."Swapping to f2p world";
        aF.lIlllllll[aF.llIIIIIII[17]] = aF."members-only area";
        aF.lIlllllll[aF.llIIIIIII[18]] = aF."non-members area";
        aF.lIlllllll[aF.llIIIIIII[19]] = aF."Swapping to p2p world";
        aF.lIlllllll[aF.llIIIIIII[21]] = aF."Failed to lookup worlds.";
        aF.lIlllllll[aF.llIIIIIII[22]] = aF."Failed to lookup worlds.";
        aF.lIlllllll[aF.llIIIIIII[23]] = aF."You need a members account";
        aF.lIlllllll[aF.llIIIIIII[24]] = aF."Play";
    }

    private static String lIlIIllIIll(String lIlllIIIlIlllII, String lIlllIIIlIlIllI) {
        lIlllIIIlIlllII = new String(Base64.getDecoder().decode(lIlllIIIlIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIIIlIllIlI = new StringBuilder();
        char[] lIlllIIIlIllIIl = lIlllIIIlIlIllI.toCharArray();
        int lIlllIIIlIllIII = llIIIIIII[0];
        char[] lIlllIIIlIlIIlI = lIlllIIIlIlllII.toCharArray();
        int lIlllIIIlIlIIIl = lIlllIIIlIlIIlI.length;
        int lIlllIIIlIlIIII = llIIIIIII[0];
        while (aF.lIlIlIIIIIl(lIlllIIIlIlIIII, lIlllIIIlIlIIIl)) {
            char lIlllIIIlIlllIl = lIlllIIIlIlIIlI[lIlllIIIlIlIIII];
            lIlllIIIlIllIlI.append((char)(lIlllIIIlIlllIl ^ lIlllIIIlIllIIl[lIlllIIIlIllIII % lIlllIIIlIllIIl.length]));
            0;
            ++lIlllIIIlIllIII;
            ++lIlllIIIlIlIIII;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(lIlllIIIlIllIlI);
    }

    private static boolean lIlIlIIIIII(int n2, int n3) {
        return n2 != n3;
    }
}

