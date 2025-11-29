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
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.log.AutoRelogHopper;
import gg.squire.basics.log.RelogConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.Component;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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

@TaskDesc(name="Relogging", register=true)
public class ReloggingTask
extends Task {
    private static  int[] llIIIIIII;
    private  String eh;
    private  String ei;
    private  boolean en;
    private final  RelogConfig ef;
    private static final  Logger ec;
    private final  WorldService eg;
    private final  AutoRelogHopper ed;
    private final  Client ee;
    private  String ej;
    private  World el;
    private  long ek;
    private static  String[] lIlllllll;
    private  World em;

    private static boolean var1(int n2) {
        return n2 < 0;
    }

    public boolean run() {
        World var2;
        aF var3;
        if (aF.var4(this.ef.logOutPlayer() ? 1 : 0)) {
            return llIIIIIII[0];
        }
        if (aF.var5(var3.el)) {
            var3.em = Worlds.getRandom(world -> {
                int n2;
                if (aF.var4(world.isNormal() ? 1 : 0) && aF.var6(world.isMembers() ? 1 : 0)) {
                    n2 = llIIIIIII[1];
                    0;
                    if (2 < 2) {
                        return ((0x47 ^ 0x63) & ~(0x51 ^ 0x75)) != 0;
                    }
                } else {
                    n2 = llIIIIIII[0];
                }
                return n2 != 0;
            });
            var2 = Worlds.getCurrentWorld();
            if (aF.var4(var3.ef.hopSpecificWorlds() ? 1 : 0)) {
                String[] var7 = var3.ef.worlds().split(lIlllllll[llIIIIIII[3]]);
                var3.el = Worlds.getRandom(world2 -> {
                    int n2;
                    if (aF.var8(world2.getId(), var2.getId()) && aF.var4(Stream.of(var7).anyMatch(string -> {
                        boolean bl2;
                        if (aF.var9(world2.getId(), Integer.parseInt(string.trim()))) {
                            bl2 = llIIIIIII[1];
                            0;
                            if (1 >= (0x59 ^ 0x17 ^ (0x3D ^ 0x77))) {
                                return ((13 + 78 - 43 + 130 ^ 86 + 81 - 65 + 40) & (0x21 ^ 0x62 ^ 54 + 111 - 63 + 25 ^ -1)) != 0;
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
                    return ((0x45 ^ 0xC) & ~(0xDA ^ 0x93)) != 0;
                }
            } else {
                var3.el = Worlds.getRandom(world2 -> {
                    int n2;
                    if (aF.var4(world2.isNormal() ? 1 : 0) && aF.var9(world2.isMembers() ? 1 : 0, var2.isMembers() ? 1 : 0) && aF.var8(world2.getId(), var2.getId())) {
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
        if (aF.var4(Widgets.isVisible((Widget)(var2 = Widgets.get((int)llIIIIIII[4], widget -> {
            String[] stringArray = new String[llIIIIIII[1]];
            stringArray[aF.llIIIIIII[0]] = lIlllllll[llIIIIIII[24]];
            return widget.hasAction(stringArray);
        }))) ? 1 : 0)) {
            var2.interact(lIlllllll[llIIIIIII[5]]);
        }
        if (aF.var10(var3.ee.getGameState(), GameState.LOGGED_IN)) {
            var3.ei = var3.ee.getUsername();
            var3.ej = var3.ee.getPassword();
            0;
            if (1 <= 0) {
                return ((0x3A ^ 1) & ~(0x6F ^ 0x54)) != 0;
            }
        } else if (aF.var6(var3.ei.isEmpty() ? 1 : 0) && aF.var6(var3.ej.isEmpty() ? 1 : 0)) {
            var3.bW();
        }
        return llIIIIIII[0];
    }

    private static int var11(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public void bZ() {
        aF var12;
        String string = Static.getClient().getLoginMessage();
        if (aF.var13(string) && aF.var4(this.d(string) ? 1 : 0)) {
            return;
        }
        if (!aF.var14(var12.ee.getGameState(), GameState.LOGIN_SCREEN_AUTHENTICATOR) || aF.var9(var12.ee.getLoginIndex(), llIIIIIII[5])) {
            if (aF.var4(var12.eh.isEmpty() ? 1 : 0)) {
                return;
            }
            Totp var15 = new Totp(var12.eh);
            var12.ee.setOtp(var15.now());
            Keyboard.sendEnter();
            return;
        }
        if (aF.var10(var12.ee.getGameState(), GameState.LOGIN_SCREEN)) {
            Object var15;
            if (aF.var4(var12.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[15]]) ? 1 : 0)) {
                ec.info(lIlllllll[llIIIIIII[7]]);
                var12.el = var12.em;
                var15 = var12.w(llIIIIIII[16]);
                var12.ee.changeWorld((World)var15);
                0;
                if (((0x3F ^ 0x34 ^ (0xF ^ 0x59)) & (0x1A ^ 0x20 ^ (0xDB ^ 0xBC) ^ -1)) > 2) {
                    return;
                }
            } else if (!aF.var6(var12.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[17]]) ? 1 : 0) || aF.var4(var12.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[18]]) ? 1 : 0)) {
                ec.info(lIlllllll[llIIIIIII[19]]);
                var12.el = var12.em;
                var15 = var12.w(llIIIIIII[20]);
                var12.ee.changeWorld((World)var15);
            }
            if (aF.var4(var12.ef.worldHopRelog() ? 1 : 0) && aF.var13(var12.el)) {
                if (aF.var9(var12.el.getId(), var12.ee.getWorld())) {
                    var15 = var12.ca();
                    var12.ee.changeWorld((World)var15);
                    var12.el = null;
                    return;
                }
                var12.ee.changeWorld(var12.el);
                if (aF.var9(var12.ee.getWorld(), var12.el.getId())) {
                    var12.el = null;
                }
            }
            if (aF.var4(aF.bV() ? 1 : 0)) {
                if (aF.var8(var12.ee.getLoginIndex(), llIIIIIII[12])) {
                    var12.ee.setLoginIndex(llIIIIIII[12]);
                    return;
                }
                var15 = Static.getClient().getCanvas();
                int var16 = ((Component)var15).getWidth() / llIIIIIII[2];
                int var17 = ((Component)var15).getHeight() / llIIIIIII[2];
                if (!aF.var6(Static.getClient().isStretchedEnabled() ? 1 : 0) || aF.var4(var12.en)) {
                    var12.ee.setGameState(GameState.LOGGING_IN);
                    return;
                }
                Mouse.click((int)var16, (int)var17, (boolean)llIIIIIII[1]);
                0;
                if null != null {
                    return;
                }
            } else {
                var12.ee.setUsername(var12.ei);
                var12.ee.setPassword(var12.ej);
                var12.ee.setLoginIndex(llIIIIIII[2]);
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
        void var18;
        aF var19;
        if (aF.var10(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN) && (aF.var6(this.ei.isEmpty() ? 1 : 0) && !aF.var4(this.ej.isEmpty() ? 1 : 0) || !aF.var5(System.getenv(lIlllllll[llIIIIIII[6]])) || aF.var6(var19.ee.getJagexDisplayName().isEmpty() ? 1 : 0))) {
            var19.ek = System.currentTimeMillis();
            var19.bW();
            0;
            if ((0xC5 ^ 0x9C ^ (0x1B ^ 0x47)) == 0) {
                return;
            }
        } else if (aF.var10(var18.getGameState(), GameState.LOGGED_IN)) {
            var19.en = llIIIIIII[1];
        }
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private boolean d(String string) {
        if (aF.var4(string.contains(lIlllllll[llIIIIIII[23]]) ? 1 : 0)) {
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
        void var26;
        void var27;
        WorldResult worldResult = this.eg.getWorlds();
        if (aF.var5(worldResult)) {
            ec.warn(lIlllllll[llIIIIIII[22]]);
            return null;
        }
        net.runelite.http.api.worlds.World var28 = var27.findWorld((int)var26);
        if (aF.var5(var28)) {
            return null;
        }
        if (!aF.var6(var28.getTypes().contains(WorldType.BETA_WORLD) ? 1 : 0) || aF.var4(var28.getTypes().contains(WorldType.NOSAVE_MODE) ? 1 : 0)) {
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
        if (aF.var5(worldResult)) {
            ec.warn(lIlllllll[llIIIIIII[21]]);
            return null;
        }
        List list = worldResult.getWorlds().stream().filter(world -> world.getTypes().contains(WorldType.MEMBERS)).filter(world -> {
            boolean bl2;
            if (aF.var9(world.getTypes().size(), llIIIIIII[1])) {
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
        aF var29;
        void var30;
        if (aF.var6(pluginChanged.isLoaded() ? 1 : 0)) {
            return;
        }
        if (aF.var10(var30.getPlugin(), (Object)var29.ed) && aF.var4(var29.bX() ? 1 : 0) && (aF.var6(var29.ei.isEmpty() ? 1 : 0) && !aF.var4(var29.ej.isEmpty() ? 1 : 0) || aF.var4(aF.bV() ? 1 : 0))) {
            var29.bW();
        }
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ClientTick clientTick) {
    }

    private static boolean bV() {
        int n2;
        if (aF.var13(Static.getClient().getJagexDisplayName()) && aF.var6(Static.getClient().getJagexDisplayName().isEmpty() ? 1 : 0)) {
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

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private boolean bX() {
        aF var37;
        if (aF.var9(this.ee.getLoginIndex(), llIIIIIII[7])) {
            ec.info(lIlllllll[llIIIIIII[8]]);
            this.ed.forceStop();
            return llIIIIIII[0];
        }
        if (!aF.var6(var37.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[9]]) ? 1 : 0) || !aF.var6(var37.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[10]]) ? 1 : 0) || aF.var4(var37.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[11]]) ? 1 : 0)) {
            ec.info(lIlllllll[llIIIIIII[12]]);
            var37.ed.forceStop();
            return llIIIIIII[0];
        }
        if (aF.var6(Game.isOnLoginScreen() ? 1 : 0)) {
            return llIIIIIII[0];
        }
        if (aF.var6(var37.ed.aI() ? 1 : 0)) {
            return llIIIIIII[0];
        }
        return Static.getPluginManager().isPluginEnabled((Plugin)this.ed);
    }

    private void bY() {
        try {
            long var38;
            aF var39;
            if (aF.var4(var39.ef.delayedRelog() ? 1 : 0)) {
                var38 = TimeUnit.MINUTES.toMillis(var39.ef.relogDelay());
                if (aF.var1(aF.var11(System.currentTimeMillis() - var39.ek, var38))) {
                    return;
                }
            }
            var38 = 2000L;
            if (aF.var4(var39.ee.getLoginMessage().contains(lIlllllll[llIIIIIII[13]]) ? 1 : 0)) {
                ec.info(lIlllllll[llIIIIIII[14]]);
                var38 = 60000L;
            }
            Thread.sleep(var38);
            0;
        }
        catch (InterruptedException var38) {
            var38.printStackTrace();
        }
        if ((123 + 138 - 90 + 12 ^ 143 + 103 - 76 + 9) <= 0) {
            return;
        }
        GameThread.invoke(() -> this.bZ());
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private void bW() {
        new Thread(() -> {
            if (aF.var4(this.ef.logOutPlayer() ? 1 : 0)) {
                return;
            }
            do {
                this.bY();
            } while (!aF.var6(this.bX() ? 1 : 0));
        }).start();
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    static {
        aF.var40();
        aF.var41();
        ec = LoggerFactory.getLogger(ReloggingTask.class);
    }

    private static void var40() {
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

    private static boolean var14(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var9(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public ReloggingTask(AutoRelogHopper autoRelogHopper, Client client, RelogConfig relogConfig, WorldService worldService) {
        this.eh = lIlllllll[llIIIIIII[0]];
        this.ei = lIlllllll[llIIIIIII[1]];
        this.ej = lIlllllll[llIIIIIII[2]];
        this.en = llIIIIIII[0];
        this.ed = autoRelogHopper;
        this.ee = client;
        this.ef = relogConfig;
        this.eg = worldService;
        GameAccount gameAccount = Game.getGameAccount();
        if (aF.var13(gameAccount)) {
            this.ei = gameAccount.getUsername();
            this.ej = gameAccount.getPassword();
            this.eh = gameAccount.getAuth();
        }
    }

    private static boolean var42(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var10(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static void var41() {
        lIlllllll = new String[llIIIIIII[25]];
        aF.lIlllllll[aF.llIIIIIII[0]] = aF.var31("O7MKc5bksfo=", "gHIfS");
        aF.lIlllllll[aF.llIIIIIII[1]] = aF.var31("FOMfa2qBoeQ=", "nIWvr");
        aF.lIlllllll[aF.llIIIIIII[2]] = aF.var43("", "mTTMc");
        aF.lIlllllll[aF.llIIIIIII[3]] = ",";
        aF.lIlllllll[aF.llIIIIIII[5]] = "Play";
        aF.lIlllllll[aF.llIIIIIII[6]] = "JX_DISPLAY_NAME";
        aF.lIlllllll[aF.llIIIIIII[8]] = "Stopping relog due to ban";
        aF.lIlllllll[aF.llIIIIIII[9]] = "has been updated";
        aF.lIlllllll[aF.llIIIIIII[10]] = "Your account has been disabled";
        aF.lIlllllll[aF.llIIIIIII[11]] = "Account locked as we suspect";
        aF.lIlllllll[aF.llIIIIIII[12]] = "Stopping relog due to update/ban";
        aF.lIlllllll[aF.llIIIIIII[13]] = "Too many login attempts.";
        aF.lIlllllll[aF.llIIIIIII[14]] = "Waiting a minute to relog";
        aF.lIlllllll[aF.llIIIIIII[15]] = "You need a members account";
        aF.lIlllllll[aF.llIIIIIII[7]] = "Swapping to f2p world";
        aF.lIlllllll[aF.llIIIIIII[17]] = "members-only area";
        aF.lIlllllll[aF.llIIIIIII[18]] = "non-members area";
        aF.lIlllllll[aF.llIIIIIII[19]] = "Swapping to p2p world";
        aF.lIlllllll[aF.llIIIIIII[21]] = "Failed to lookup worlds.";
        aF.lIlllllll[aF.llIIIIIII[22]] = "Failed to lookup worlds.";
        aF.lIlllllll[aF.llIIIIIII[23]] = "You need a members account";
        aF.lIlllllll[aF.llIIIIIII[24]] = "Play";
    }

    private static String var43(String var44, String var45) {
        var44 = new String(Base64.getDecoder().decode(var44.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var46 = new StringBuilder();
        char[] var47 = var45.toCharArray();
        int var48 = llIIIIIII[0];
        char[] var49 = var44.toCharArray();
        int var50 = var49.length;
        int var51 = llIIIIIII[0];
        while (aF.var42(var51, var50)) {
            char var52 = var49[var51];
            var46.append((char)(var52 ^ var47[var48 % var47.length]));
            0;
            ++var48;
            ++var51;
            0;
            
            return null;
        }
        return String.valueOf(var46);
    }

    private static boolean var8(int n2, int n3) {
        return n2 != n3;
    }
}

