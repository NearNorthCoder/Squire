/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.LoginStateChanged
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.plugins.Script
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 *  org.pf4j.Extension
 */
package gg.squire.account;

import gg.squire.account.GHelper;
import gg.squire.account.LHelper;
import gg.squire.account.UHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.account.AQHelper;
import gg.squire.account.ASHelper;
import gg.squire.account.EHelper;
import gg.squire.account.THelper;
import gg.squire.account.XHelper;
import gg.squire.account.ZHelper;
import com.google.inject.Provides;
import gg.squire.account.BuilderConfig;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.pf4j.Extension;

@PluginDescriptor(name="Squire GWD Builder", enabledByDefault=false)
@Extension
@SquireUtil
public class AccBuilderGWD
extends Script {
    
    @Inject
    public  BuilderConfig r;
    static  String p;
    public static  String j;
    public static  List<ab> a;
    public static  long g;
    static  int o;
    public static  int f;
    public static  String k;
    private static  ab[] q;
    public static  boolean d;
     boolean u;
    public static  String c;
    
    public static  String m;
    @Inject
    private  Client v;
     WorldArea s;
    @Inject
    private  BuilderInfoBox x;
    public static  HashMap<WorldPoint, Integer> i;
    public static  boolean n;
     String t;
    @Inject
    private  OverlayManager w;
    public static  String h;
    public static  boolean e;
    public static  long b;
    public static  String l;

    private static boolean lIllIIIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIIlIlI() {
        llIlIIIlI = new String[llIlIIIll[63]];
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[4]] = "https://discord.com/api/webhooks/1215411745661653022/jY8vOzwiPBV2UG1boyJ7dN3JNNdcjhfFuRqagyQwPqqtxffByAdIBW4YbjLNq5cqbRdi";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[5]] = "quest";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[9]] = "Disabling GE warning";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[10]] = "Navigating to GE";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[11]] = "Finished account";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[14]] = "gwd acc";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[15]] = "Switching to One Click GWD";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[16]] = "hootfighter";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[17]] = "enabled";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[18]] = "agility";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[19]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[23]] = "tell the king";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[24]] = "another clue scroll";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[25]] = "a new clue";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[26]] = "those pesky trolls";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[27]] = "managed to get my son";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[32]] = "Just recently.";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[33]] = "fruit and grain mostly";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[34]] = "That's some well-guarded secret alright";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[20]] = "I could tell by the cut of your jib";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[35]] = "You haven't got enough";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[36]] = "Not enough gold for buying";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[37]] = "Oh dear, you are dead!";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[38]] = "We DIED!! :(";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[39]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[40]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[30]] = "can't reach that";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[41]] = "Door";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[42]] = "Door";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[43]] = "Open";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[44]] = "Tree Door";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[45]] = "Tree Door";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[31]] = "Open";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[46]] = "think that facing North";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[49]] = "already some rum";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[51]] = "Drop";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[52]] = "Burning";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[53]] = "Burning";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[54]] = "troll";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[55]] = "Troll";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[56]] = "spider";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[57]] = "skeleton";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[58]] = "Wolf";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[59]] = "Damis";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[60]] = "hound";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[61]] = "Thrower";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[62]] = AccBuilderGWD.lIllIIIIlIIl("uoFOIp8hunM=", "PkdhC");
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderGWD.lIllIIIIllII(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderGWD.lIllIIIIllIl(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderGWD.lIllIIIIlllI(j) || AccBuilderGWD.lIllIIIIllll(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderGWD.lIllIIIlIIII(a.get(llIlIIIll[4]).ah() ? 1 : 0)) {
                    if (AccBuilderGWD.lIllIIIlIIII(a.get(llIlIIIll[4]).ag().contains(llIlIIIlI[llIlIIIll[5]]) ? 1 : 0)) {
                        f += llIlIIIll[5];
                    }
                    System.out.println("Achieved " + a.get(llIlIIIll[4]).ag() + " goal");
                    a.remove(llIlIIIll[4]);

                    return llIlIIIll[6];
                }
                if (!AccBuilderGWD.lIllIIIIllII(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderGWD.lIllIIIlIIII(-.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.z() ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(d ? 1 : 0) && AccBuilderGWD.lIllIIIlIIIl(-.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.j(llIlIIIll[7]), llIlIIIll[8]) && AccBuilderGWD.lIllIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                    c = llIlIIIlI[llIlIIIll[9]];
                    -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.A();
                    Time.sleepTicks((int)llIlIIIll[5]);

                    if (-(42 + 28 - -24 + 90 ^ 14 + 96 - 54 + 133) < 0) continue;
                    return (0x28 ^ 0x7E ^ (0x51 ^ 0x41)) & (231 + 248 - 417 + 188 ^ 77 + 6 - -2 + 103 ^ -1);
                }
                int lIIlllIIIIllll = llIlIIIll[4];
                try {
                    lIIlllIIIIllll = a.get(llIlIIIll[4]).af();

                }
                catch (Exception lIIlllIIIIlllI) {
                    lIIlllIIIIlllI.printStackTrace();
                }
                if (-(0x96 ^ 0x92) >= 0) {
                    return (0xC1 ^ 0x80) & ~(0x27 ^ 0x66);
                }
                return lIIlllIIIIllll;
            }
            if (AccBuilderGWD.lIllIIIlIIII(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderGWD.lIllIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(as.mR), llIlIIIll[10])) {
                    c = llIlIIIlI[llIlIIIll[10]];
                    Movement.walkTo((WorldPoint)as.mR);

                }
                if (AccBuilderGWD.lIllIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(as.mR), llIlIIIll[10])) {
                    c = llIlIIIlI[llIlIIIll[11]];
                }
            }
        }
        return llIlIIIll[12];
    }

    private static boolean lIllIIIIllII(Object object, Object object2) {
        return object == object2;
    }

    protected void shutDown() {
        this.w.remove((Overlay)this.x);

        d = llIlIIIll[5];
        q = new ab[llIlIIIll[4]];
        o = llIlIIIll[4];
        f = llIlIIIll[4];
        System.out.print(llIlIIIlI[llIlIIIll[19]]);
        super.stop();
    }

    private static boolean lIllIIIlIllI(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(lIIllIlIllIlll);
    }

    private static boolean lIllIIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    public AccBuilderGWD() {
        this.s = new WorldArea(llIlIIIll[0], llIlIIIll[1], llIlIIIll[2], llIlIIIll[3], llIlIIIll[4]);
        this.t = llIlIIIlI[llIlIIIll[4]];
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderGWD.lIllIIIlIlIl(n5, n6) && AccBuilderGWD.lIllIIIlIIll(n5, n7)) {
            n4 = llIlIIIll[5];

            }
        } else {
            n4 = llIlIIIll[4];
        }
        return n4 != 0;
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();

        d = llIlIIIll[4];
        System.out.print(llIlIIIlI[llIlIIIll[13]]);
        this.w.add((Overlay)this.x);

        a.clear();
        p = llIlIIIlI[llIlIIIll[14]];
        System.out.println(llIlIIIlI[llIlIIIll[15]]);
        a.clear();
        t[] tArray = new t[llIlIIIll[5]];
        tArray[AccBuilderGWD.llIlIIIll[4]] = new THelper();
        Collections.addAll(a, tArray);

        g = System.currentTimeMillis();
        Collections.shuffle(a);
        n = this.r.get70Agility();
    }

    private static boolean lIllIIIlIIII(int n2) {
        return n2 != 0;
    }

    static {
        AccBuilderGWD.lIllIIIIlIll();
        AccBuilderGWD.lIllIIIIlIlI();
        a = new ArrayList<ab>();
        b = System.currentTimeMillis();
        d = llIlIIIll[4];
        g = System.currentTimeMillis();
        h = llIlIIIlI[llIlIIIll[62]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        ab[] abArray = new ab[llIlIIIll[5]];
        abArray[AccBuilderGWD.llIlIIIll[4]] = new ASHelper();
        q = abArray;
    }

    private static boolean lIllIIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderGWD.lIllIIIlIllI(n2, llIlIIIll[25])) {
            return;
        }
        if (AccBuilderGWD.lIllIIIIllIl(o)) {
            AccBuilderGWD lIIllIlllIllII;
            -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.a(lIIllIlllIllII.t, "rsn: " + k + " account has been banned? - Acc builder " + p);
            o += llIlIIIll[5];
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        NPC lIIllIlllllllI;
        block15: {
            AccBuilderGWD lIIlllIIIIIIll;
            block16: {
                -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.y();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderGWD.lIllIIIlIlll(player2, player) && AccBuilderGWD.lIllIIIlIIII(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = llIlIIIll[5];

                        if (2 <= -1) {
                            return ((0xBE ^ 0xB7 ^ (0xE ^ 0x19)) & (99 + 25 - -23 + 70 ^ 6 + 73 - -38 + 82 ^ -1)) != 0;
                        }
                    } else {
                        n4 = llIlIIIll[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderGWD.lIllIIIIlllI(player3) || AccBuilderGWD.lIllIIIlIlII(Game.getWildyLevel()) && !AccBuilderGWD.lIllIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(aq.mB), llIlIIIll[20])) break block15;
                int[] nArray = new int[llIlIIIll[5]];
                nArray[AccBuilderGWD.llIlIIIll[4]] = llIlIIIll[21];
                if (!AccBuilderGWD.lIllIIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray2 = new int[llIlIIIll[5]];
                nArray2[AccBuilderGWD.llIlIIIll[4]] = llIlIIIll[22];
                if (!AccBuilderGWD.lIllIIIlIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block15;
            }
            if (AccBuilderGWD.lIllIIIIllIl(lIIlllIIIIIIll.s.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderGWD.lIllIIIlIIII(Dialog.isOpen() ? 1 : 0) && AccBuilderGWD.lIllIIIIlllI(Dialog.getText())) {
            if (AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[23]]) ? 1 : 0)) {
                G.fB = llIlIIIll[5];
            }
            if (!AccBuilderGWD.lIllIIIIllIl(Dialog.getText().contains(llIlIIIlI[llIlIIIll[24]]) ? 1 : 0) || AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[25]]) ? 1 : 0)) {
                // empty if block
            }
            if (AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[26]]) ? 1 : 0)) {
                -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.x.dG = llIlIIIll[5];
            }
            if (AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[27]]) ? 1 : 0)) {
                -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.x.dH = llIlIIIll[5];
            }
            if (AccBuilderGWD.lIllIIIlIIII((lIIllIlllllllI = new WorldArea(llIlIIIll[28], llIlIIIll[29], llIlIIIll[30], llIlIIIll[31], llIlIIIll[4])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[32]]) ? 1 : 0)) {
                z.dP = llIlIIIll[5];
            }
            if (AccBuilderGWD.lIllIIIlIIII(lIIllIlllllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[33]]) ? 1 : 0)) {
                z.dQ = llIlIIIll[5];
            }
            if (AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[34]]) ? 1 : 0)) {
                z.dR = llIlIIIll[5];
            }
            if (AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[20]]) ? 1 : 0)) {
                // empty if block
            }
        }
        if (AccBuilderGWD.lIllIIIIlllI(lIIllIlllllllI = NPCs.getNearest(nPC -> {
            int n2;
            NPC lIIllIlllIlIII;
            if (!(AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[54]]) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[55]]) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[56]]) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[57]]) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[58]]) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[59]]) ? 1 : 0) && !AccBuilderGWD.lIllIIIlIIII(nPC.getName().contains(llIlIIIlI[llIlIIIll[60]]) ? 1 : 0) || !AccBuilderGWD.lIllIIIIllIl(lIIllIlllIlIII.getName().contains(llIlIIIlI[llIlIIIll[61]]) ? 1 : 0) || AccBuilderGWD.lIllIIIIllIl(L.ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(L.gb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !AccBuilderGWD.lIllIIIlIIII(L.gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !AccBuilderGWD.lIllIIIlIIll(lIIllIlllIlIII.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIlIIIll[10]))) {
                n2 = llIlIIIll[5];

                if (1 <= 0) {
                    return ((0x7D ^ 0x47 ^ (0x4B ^ 0x68)) & (0x52 ^ 0x25 ^ (0x2F ^ 0x41) ^ -1)) != 0;
                }
            } else {
                n2 = llIlIIIll[4];
            }
            return n2 != 0;
        })) && AccBuilderGWD.lIllIIIIllIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
            Time.sleepTicks((int)llIlIIIll[5]);

        }
        if (AccBuilderGWD.lIllIIIIllll(lIIllIlllllllI) && (!AccBuilderGWD.lIllIIIIllIl(L.ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !AccBuilderGWD.lIllIIIIllIl(L.gb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || AccBuilderGWD.lIllIIIlIIII(L.gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && AccBuilderGWD.lIllIIIlIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
        }
        -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.I();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lIIllIllllIIII;
        if (AccBuilderGWD.lIllIIIlIIII(chatMessage.getMessage().contains(llIlIIIlI[llIlIIIll[35]]) ? 1 : 0)) {
            System.out.println(llIlIIIlI[llIlIIIll[36]]);
            d = llIlIIIll[5];
        }
        if (AccBuilderGWD.lIllIIIlIIII(lIIllIllllIIII.getMessage().contains(llIlIIIlI[llIlIIIll[37]]) ? 1 : 0)) {
            System.out.println(llIlIIIlI[llIlIIIll[38]]);
            if (AccBuilderGWD.lIllIIIIllIl(Game.getWildyLevel()) && AccBuilderGWD.lIllIIIIllIl(Inventory.contains(item -> item.getName().contains(llIlIIIlI[llIlIIIll[53]])) ? 1 : 0)) {
                d = llIlIIIll[5];
                System.out.println(llIlIIIlI[llIlIIIll[39]]);
            }
            if (!AccBuilderGWD.lIllIIIlIlII(Game.getWildyLevel()) || AccBuilderGWD.lIllIIIlIIII(Inventory.contains(item -> item.getName().contains(llIlIIIlI[llIlIIIll[52]])) ? 1 : 0)) {
                d = llIlIIIll[4];
                System.out.println(llIlIIIlI[llIlIIIll[40]]);
            }
        }
        if (AccBuilderGWD.lIllIIIlIIII(lIIllIllllIIII.getMessage().contains(llIlIIIlI[llIlIIIll[30]]) ? 1 : 0) && AccBuilderGWD.lIllIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(U.lm), llIlIIIll[18])) {
            String[] stringArray = new String[llIlIIIll[5]];
            stringArray[AccBuilderGWD.llIlIIIll[4]] = llIlIIIlI[llIlIIIll[41]];
            if (AccBuilderGWD.lIllIIIIlllI(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIlIIIll[5]];
                stringArray2[AccBuilderGWD.llIlIIIll[4]] = llIlIIIlI[llIlIIIll[42]];
                TileObjects.getNearest((String[])stringArray2).interact(llIlIIIlI[llIlIIIll[43]]);
                Time.sleepTicks((int)llIlIIIll[11]);

            }
            String[] stringArray3 = new String[llIlIIIll[5]];
            stringArray3[AccBuilderGWD.llIlIIIll[4]] = llIlIIIlI[llIlIIIll[44]];
            if (AccBuilderGWD.lIllIIIIlllI(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[llIlIIIll[5]];
                stringArray4[AccBuilderGWD.llIlIIIll[4]] = llIlIIIlI[llIlIIIll[45]];
                TileObjects.getNearest((String[])stringArray4).interact(llIlIIIlI[llIlIIIll[31]]);
                Time.sleepTicks((int)llIlIIIll[10]);

            }
        }
        if (AccBuilderGWD.lIllIIIlIIII(lIIllIllllIIII.getMessage().contains(llIlIIIlI[llIlIIIll[46]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIlIIIll[47], llIlIIIll[48], llIlIIIll[4]));

            Time.sleepTicks((int)llIlIIIll[5]);

        }
        if (AccBuilderGWD.lIllIIIlIIII(lIIllIllllIIII.getMessage().contains(llIlIIIlI[llIlIIIll[49]]) ? 1 : 0)) {
            int[] nArray = new int[llIlIIIll[5]];
            nArray[AccBuilderGWD.llIlIIIll[4]] = llIlIIIll[50];
            if (AccBuilderGWD.lIllIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIIIll[5]];
                nArray2[AccBuilderGWD.llIlIIIll[4]] = llIlIIIll[50];
                Inventory.getFirst((int[])nArray2).interact(llIlIIIlI[llIlIIIll[51]]);
            }
        }
    }

    private static boolean lIllIIIIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderGWD.lIllIIIlIIII(configChanged.getGroup().equalsIgnoreCase(llIlIIIlI[llIlIIIll[16]]) ? 1 : 0)) {
            void lIIlllIIIIlIlI;
            if (AccBuilderGWD.lIllIIIlIIII(configChanged.getKey().contains(llIlIIIlI[llIlIIIll[17]]) ? 1 : 0)) {
                this.u = this.r.turnScriptOnOff();
                if (AccBuilderGWD.lIllIIIlIIII(this.u ? 1 : 0)) {
                    d = llIlIIIll[4];

                    if (2 <= 0) {
                        return;
                    }
                } else {
                    d = llIlIIIll[5];
                }
            }
            if (AccBuilderGWD.lIllIIIlIIII(lIIlllIIIIlIlI.getKey().contains(llIlIIIlI[llIlIIIll[18]]) ? 1 : 0)) {
                AccBuilderGWD lIIlllIIIIlIll;
                n = lIIlllIIIIlIll.r.get70Agility();
            }
        }
    }

    private static boolean lIllIIIIlllI(Object object) {
        return object != null;
    }

    private static boolean lIllIIIlIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIlIlII(int n2) {
        return n2 <= 0;
    }

    private static boolean lIllIIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIllIIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }
}

